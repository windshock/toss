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
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.biometric.RxBiometric;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.tosscert.ui.R;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.GraniteBrownfieldModule_closeView;
import o.IndicatorView;
import o.M_;
import o.PageRenderReadyListener;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access13800;
import o.access14300;
import o.accessMapSafely;
import o.addAllCommandLine;
import o.addPolicy;
import o.asDouble;
import o.asMaplambda6;
import o.attachAppLovinSdk;
import o.createPaints;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.disableImageViewPreallocationAndroid;
import o.enableFabricRenderer;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateInviteUrl;
import o.generateLink;
import o.getDebugErrorMSG;
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
import o.setAuthenticatorokhttp;
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
import viva.republica.toss.password.PasswordNeo6DFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordNeo6DFragment extends PasswordFragment {
    private static long AudioAttributesImplBaseParcelizer;
    public static final IAuthTabCallback Companion;
    private static final String IAuthTabCallbackDefault;
    private static int MediaMetadataCompat;
    private static char[] RatingCompat;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onWarmupCompleted;
    private getPackageType AudioAttributesImplApi26Parcelizer;
    public ScrollView IAuthTabCallback;
    private getPackageType ICustomTabsCallback_Parcel;
    private getPackageType ICustomTabsServiceDefault;
    private boolean IEngagementSignalsCallback;
    private boolean IEngagementSignalsCallbackDefault;
    private ValueAnimator IPostMessageService;
    private float IPostMessageServiceStubProxy;
    private ValueAnimator IPostMessageService_Parcel;
    private runOnUiThreadDelayed ITrustedWebActivityCallback;
    private PasswordFragment.onExtraCallback ITrustedWebActivityCallbackDefault;
    private String ITrustedWebActivityCallbackStub;
    private ValueAnimator ITrustedWebActivityCallbackStubProxy;
    private runOnUiThreadDelayed areNotificationsEnabled;
    private ValueAnimator cancelNotification;
    private ValueAnimator getActiveNotifications;
    private runOnUiThreadDelayed isEngagementSignalsApiAvailable;
    private runOnUiThreadDelayed newAuthTabSession;
    public TextView onExtraCallbackWithResult;
    private boolean onGreatestScrollPercentageIncreased;
    public ViewGroup onNavigationEvent;
    private ValueAnimator onRelationshipValidationResult;
    private boolean onSessionEnded;
    public View onTransact;
    private getPackageType onUnminimized;
    private float onVerticalScrollEvent;
    private ValueAnimator prefetch;
    private boolean prefetchWithMultipleUrls;
    private ValueAnimator receiveFile;
    private ValueAnimator requestPostMessageChannel;
    private ValueAnimator requestPostMessageChannelWithExtras;
    private ValueAnimator setEngagementSignalsCallback;
    private ValueAnimator warmup;
    private static final byte[] $$d = {79, -25, -14, 102};
    private static final int $$e = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RatingCompatStyle = 1;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private final PageRenderReadyListener ICustomTabsCallbackDefault = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onNavigationEvent);
    private String postMessage = "";
    private final List<View> IPostMessageServiceStub = new ArrayList();
    private final List<TextView> IEngagementSignalsCallbackStubProxy = new ArrayList();
    private final List<String> IEngagementSignalsCallback_Parcel = new ArrayList();
    private final List<AuthPinDotView> ICustomTabsServiceStub = new ArrayList();
    private final List<View> writeTypedList = new ArrayList();
    private final char[] newSession = new char[6];
    private final Lazy ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda49
        public final Object invoke() {
            return PasswordNeo6DFragment.setEngagementSignalsCallback();
        }
    });
    private final Lazy getSmallIconId = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda60
        public final Object invoke() {
            return PasswordNeo6DFragment.IAuthTabCallback_Parcel();
        }
    });
    private final Lazy ITrustedWebActivityServiceDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda61
        public final Object invoke() {
            return PasswordNeo6DFragment.newSession();
        }
    });
    private final Lazy getSmallIconBitmap = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda62
        public final Object invoke() {
            return PasswordNeo6DFragment.requestPostMessageChannel();
        }
    });
    private final Lazy notifyNotificationWithChannel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda63
        public final Object invoke() {
            return (deprecated_dns) PasswordNeo6DFragment.IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -797259974, 797260025, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
    });
    private final Lazy IPostMessageServiceDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda64
        public final Object invoke() {
            return PasswordNeo6DFragment.warmup();
        }
    });
    private float IconCompatParcelizer = 1.0f;
    private float ICustomTabsService = 0.3f;
    private float mayLaunchUrl = 0.8f;
    private float extraCommand = 0.15f;
    private final Lazy IEngagementSignalsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda65
        public final Object invoke() {
            return PasswordNeo6DFragment.receiveFile();
        }
    });
    private final Lazy updateVisuals = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda66
        public final Object invoke() {
            return Integer.valueOf(((Integer) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -106298680, 106298705, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).intValue());
        }
    });
    private final Lazy ICustomTabsServiceStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda67
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo6DFragment.getInterfaceDescriptor(this.f$0));
        }
    });
    private final Lazy access200 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda68
        public final Object invoke() {
            return Boolean.valueOf(PasswordNeo6DFragment.IAuthTabCallback_Parcel(this.f$0));
        }
    });
    private final Lazy RemoteActionCompatParcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda50
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo6DFragment.IAuthTabCallbackStubProxy(this.f$0));
        }
    });
    private final Lazy ITrustedWebActivityService_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda51
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo6DFragment.IAuthTabCallback(this.f$0));
        }
    });
    private int AudioAttributesImplApi21Parcelizer = -1;
    private final Lazy ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda52
        public final Object invoke() {
            return Float.valueOf(PasswordNeo6DFragment.onNavigationEvent(this.f$0));
        }
    });
    private final float newSessionWithExtras = 0.11f;
    private boolean AudioAttributesCompatParcelizer = true;
    private final ObservableProperty validateRelationship = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));
    private final Lazy ITrustedWebActivityServiceStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda53
        public final Object invoke() {
            return PasswordNeo6DFragment.access000(this.f$0);
        }
    });
    private final Lazy ITrustedWebActivityServiceStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda54
        public final Object invoke() {
            return PasswordNeo6DFragment.IAuthTabCallbackStub(this.f$0);
        }
    });
    private final Lazy read = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda55
        public final Object invoke() {
            return PasswordNeo6DFragment.asInterface(this.f$0);
        }
    });
    private final Lazy write = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda56
        public final Object invoke() {
            return PasswordNeo6DFragment.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy ITrustedWebActivityService = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda57
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo6DFragment.onTransact(this.f$0));
        }
    });
    private final Lazy ITrustedWebActivityCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda58
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo6DFragment.access000());
        }
    });
    private final Lazy ICustomTabsService_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda59
        public final Object invoke() {
            return Boolean.valueOf(((Boolean) PasswordNeo6DFragment.IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1247444513, -1247444486, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).booleanValue());
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = viva.republica.toss.password.PasswordNeo6DFragment.$$d
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = 97 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            goto L2d
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2b:
            r4 = r0[r8]
        L2d:
            int r4 = -r4
            int r7 = r7 + r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.$$f(short, int, int):java.lang.String");
    }

    static {
        MediaMetadataCompat = 0;
        validateRelationship();
        Object[] objArr = new Object[1];
        b(22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), Drawable.resolveOpacity(0, 0), objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(KeyEvent.normalizeMetaState(0) + 7, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(75 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 28 - Color.argb(0, 0, 0, 0), objArr3);
        addAllCommandLine<Object> propertyReference1Impl = new PropertyReference1Impl<>(PasswordNeo6DFragment.class, strIntern, ((String) objArr3[0]).intern(), 0);
        Object[] objArr4 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 14, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf("", "", 0, 0) + 102, objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(Color.rgb(0, 0, 0) + 16777268, (char) KeyEvent.getDeadChar(0, 0), 114 - TextUtils.lastIndexOf("", '0', 0), objArr5);
        onExtraCallback = new addAllCommandLine[]{propertyReference1Impl, new MutablePropertyReference1Impl<>(PasswordNeo6DFragment.class, strIntern2, ((String) objArr5[0]).intern(), 0)};
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = 8;
        int i = RatingCompatStyle + 51;
        MediaMetadataCompat = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    public static /* synthetic */ int IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            extraCommand(passwordNeo6DFragment);
            throw null;
        }
        int iExtraCommand = extraCommand(passwordNeo6DFragment);
        int i3 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return iExtraCommand;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[0];
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getdebugerrormsg, passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        GradientButtonView gradientButtonView;
        int i7;
        int i8 = ~i3;
        int i9 = ~(i8 | i4);
        int i10 = ~i2;
        int i11 = ~i4;
        int i12 = i9 | (~(i10 | i11 | i3));
        int i13 = (~(i4 | i10 | i3)) | (~(i11 | i8));
        int i14 = ~(i8 | i10);
        int i15 = i2 + i3 + i + (563899752 * i5) + (667302295 * i6);
        int i16 = i15 * i15;
        int i17 = (i2 * (-901935710)) + 144807674 + (i3 * (-901935710)) + (i12 * 171) + (i13 * 171) + (i14 * 171) + ((-901935539) * i) + (42244168 * i5) + ((-913566613) * i6) + (i16 * (-1006501888));
        int i18 = ((i2 * 1426164010) - 416808960) + (1426164010 * i3) + (i12 * 480671447) + (i13 * 480671447) + (480671447 * i14) + (1906835456 * i) + ((-1270874112) * i5) + (1914175488 * i6) + ((-1995833344) * i16) + (i17 * i17 * (-1006239744));
        int i19 = 69;
        switch (i18) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
                final Function0 function0 = (Function0) objArr[1];
                int i20 = 2 % 2;
                int i21 = MediaDescriptionCompat + 21;
                MediaBrowserCompatMediaItem = i21 % 128;
                int i22 = i21 % 2;
                final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = passwordNeo6DFragment.IEngagementSignalsCallbackStub();
                if (getdebugerrormsgIEngagementSignalsCallbackStub != null) {
                    return Boolean.valueOf(getdebugerrormsgIEngagementSignalsCallbackStub.warmup.post(new Runnable() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda13
                        @Override // java.lang.Runnable
                        public final void run() {
                            PasswordNeo6DFragment.onNavigationEvent(getdebugerrormsgIEngagementSignalsCallbackStub, function0);
                        }
                    }));
                }
                int i23 = MediaBrowserCompatMediaItem + 27;
                MediaDescriptionCompat = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                PasswordNeo6DFragment passwordNeo6DFragment2 = (PasswordNeo6DFragment) objArr[0];
                getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[1];
                Bitmap bitmap = (Bitmap) objArr[2];
                int i25 = 2 % 2;
                int i26 = MediaBrowserCompatMediaItem + 97;
                MediaDescriptionCompat = i26 % 128;
                int i27 = i26 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(passwordNeo6DFragment2, getdebugerrormsg, bitmap);
                int i28 = MediaBrowserCompatMediaItem + 89;
                MediaDescriptionCompat = i28 % 128;
                int i29 = i28 % 2;
                return unitOnWarmupCompleted;
            case 11:
                return asBinder(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                PasswordNeo6DFragment passwordNeo6DFragment3 = (PasswordNeo6DFragment) objArr[0];
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
                int i30 = 2 % 2;
                int i31 = MediaBrowserCompatMediaItem + 49;
                MediaDescriptionCompat = i31 % 128;
                int i32 = i31 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment3.onVerticalScrollEvent());
                attachapplovinsdk.IAuthTabCallback(300);
                Unit unit = Unit.INSTANCE;
                int i33 = MediaBrowserCompatMediaItem + 41;
                MediaDescriptionCompat = i33 % 128;
                int i34 = i33 % 2;
                return unit;
            case 18:
                return writeTypedObject(objArr);
            case 19:
                return extraCallbackWithResult(objArr);
            case 20:
                return readTypedObject(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return ICustomTabsCallback(objArr);
            case 23:
                PasswordNeo6DFragment passwordNeo6DFragment4 = (PasswordNeo6DFragment) objArr[0];
                String str = (String) objArr[1];
                int i35 = 2 % 2;
                int i36 = MediaDescriptionCompat + 71;
                MediaBrowserCompatMediaItem = i36 % 128;
                int i37 = i36 % 2;
                int iIAuthTabCallback = passwordNeo6DFragment4.IAuthTabCallback(passwordNeo6DFragment4.newSession);
                int i38 = iIAuthTabCallback - 1;
                AuthPinDotView authPinDotView = passwordNeo6DFragment4.ICustomTabsServiceStub.get(i38);
                View view = passwordNeo6DFragment4.writeTypedList.get(i38);
                authPinDotView.IAuthTabCallbackDefault();
                view.setContentDescription(passwordNeo6DFragment4.getString(R.string.app_password___64098e62fc, new Object[]{String.valueOf(iIAuthTabCallback)}));
                passwordNeo6DFragment4.onExtraCallbackWithResult().announceForAccessibility(passwordNeo6DFragment4.getString(R.string.app_password___49003299c7, new Object[]{str, String.valueOf(passwordNeo6DFragment4.IAuthTabCallback(passwordNeo6DFragment4.newSession))}));
                int i39 = MediaBrowserCompatMediaItem + 7;
                MediaDescriptionCompat = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 24:
                return onMessageChannelReady(objArr);
            case 25:
                return onActivityLayout(objArr);
            case 26:
                final PasswordNeo6DFragment passwordNeo6DFragment5 = (PasswordNeo6DFragment) objArr[0];
                int i41 = 2 % 2;
                int i42 = MediaDescriptionCompat + 103;
                MediaBrowserCompatMediaItem = i42 % 128;
                int i43 = i42 % 2;
                final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub2 = passwordNeo6DFragment5.IEngagementSignalsCallbackStub();
                if (getdebugerrormsgIEngagementSignalsCallbackStub2 == null) {
                    int i44 = MediaBrowserCompatMediaItem + 9;
                    MediaDescriptionCompat = i44 % 128;
                    int i45 = i44 % 2;
                    return null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.4f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda87
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PasswordNeo6DFragment.onExtraCallback(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub2, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.setDuration(passwordNeo6DFragment5.ITrustedWebActivityCallback().IAuthTabCallback());
                valueAnimatorOfFloat.setInterpolator(passwordNeo6DFragment5.ITrustedWebActivityCallback());
                valueAnimatorOfFloat.start();
                final Interpolator interpolatorOnVerticalScrollEvent = passwordNeo6DFragment5.onVerticalScrollEvent();
                final Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(0.89f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f = 0.21052632f;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda88
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PasswordNeo6DFragment.IAuthTabCallback(this.f$0, f, interpolatorOnVerticalScrollEvent, getdebugerrormsgIEngagementSignalsCallbackStub2, interpolator, valueAnimator);
                    }
                });
                valueAnimatorOfFloat2.setDuration(3800L);
                valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat2.start();
                return valueAnimatorOfFloat2;
            case 27:
                return onPostMessage(objArr);
            case 28:
                getDebugErrorMSG getdebugerrormsg2 = (getDebugErrorMSG) objArr[0];
                int i46 = 2 % 2;
                int i47 = MediaBrowserCompatMediaItem + 17;
                MediaDescriptionCompat = i47 % 128;
                if (i47 % 2 == 0) {
                    gradientButtonView = getdebugerrormsg2.setEngagementSignalsCallback;
                    Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
                    i7 = 116;
                } else {
                    gradientButtonView = getdebugerrormsg2.setEngagementSignalsCallback;
                    Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
                    i7 = 8;
                }
                gradientButtonView.setVisibility(i7);
                return Unit.INSTANCE;
            case 29:
                return onMinimized(objArr);
            case 30:
                return onActivityResized(objArr);
            case 31:
                return onUnminimized(objArr);
            case 32:
                PasswordNeo6DFragment passwordNeo6DFragment6 = (PasswordNeo6DFragment) objArr[0];
                int i48 = 2 % 2;
                int i49 = MediaBrowserCompatMediaItem + 69;
                MediaDescriptionCompat = i49 % 128;
                int i50 = i49 % 2;
                deprecated_dns deprecated_dnsVar = (deprecated_dns) passwordNeo6DFragment6.getSmallIconId.getValue();
                int i51 = MediaBrowserCompatMediaItem + 33;
                MediaDescriptionCompat = i51 % 128;
                int i52 = i51 % 2;
                return deprecated_dnsVar;
            case 33:
                return onRelationshipValidationResult(objArr);
            case 34:
                return ICustomTabsCallbackDefault(objArr);
            case 35:
                return ICustomTabsCallbackStub(objArr);
            case 36:
                return ICustomTabsCallbackStubProxy(objArr);
            case 37:
                return ICustomTabsService(objArr);
            case 38:
                return ICustomTabsCallback_Parcel(objArr);
            case 39:
                return mayLaunchUrl(objArr);
            case 40:
                return isEngagementSignalsApiAvailable(objArr);
            case 41:
                return extraCommand(objArr);
            case 42:
                return postMessage(objArr);
            case 43:
                PasswordNeo6DFragment passwordNeo6DFragment7 = (PasswordNeo6DFragment) objArr[0];
                int i53 = 2 % 2;
                int i54 = MediaDescriptionCompat + 101;
                MediaBrowserCompatMediaItem = i54 % 128;
                int i55 = i54 % 2;
                Unit unitOnUnminimized = onUnminimized(passwordNeo6DFragment7);
                int i56 = MediaDescriptionCompat + 55;
                MediaBrowserCompatMediaItem = i56 % 128;
                int i57 = i56 % 2;
                return unitOnUnminimized;
            case 44:
                return newSessionWithExtras(objArr);
            case 45:
                return newAuthTabSession(objArr);
            case 46:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i58 = 2 % 2;
                int i59 = MediaDescriptionCompat + 83;
                MediaBrowserCompatMediaItem = i59 % 128;
                if (i59 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                    i19 = 100;
                }
                attachapplovinsdk2.onExtraCallback(i19);
                Unit unit2 = Unit.INSTANCE;
                int i60 = MediaBrowserCompatMediaItem + 67;
                MediaDescriptionCompat = i60 % 128;
                int i61 = i60 % 2;
                return unit2;
            case 47:
                return prefetch(objArr);
            case 48:
                return newSession(objArr);
            case 49:
                return prefetchWithMultipleUrls(objArr);
            case 50:
                return requestPostMessageChannel(objArr);
            case 51:
                return receiveFile(objArr);
            case 52:
                return requestPostMessageChannelWithExtras(objArr);
            case 53:
                return setEngagementSignalsCallback(objArr);
            case 54:
                return validateRelationship(objArr);
            case 55:
                return updateVisuals(objArr);
            case 56:
                return warmup(objArr);
            case 57:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i62 = 2 % 2;
                int i63 = MediaDescriptionCompat + 47;
                MediaBrowserCompatMediaItem = i63 % 128;
                int i64 = i63 % 2;
                onExtraCallback(function1, obj);
                int i65 = MediaBrowserCompatMediaItem + 49;
                MediaDescriptionCompat = i65 % 128;
                int i66 = i65 % 2;
                return null;
            case 58:
                getDebugErrorMSG getdebugerrormsg3 = (getDebugErrorMSG) objArr[0];
                int i67 = 2 % 2;
                int i68 = MediaDescriptionCompat + 71;
                MediaBrowserCompatMediaItem = i68 % 128;
                int i69 = i68 % 2;
                getdebugerrormsg3.onMessageChannelReady.setAlpha(0.0f);
                Unit unit3 = Unit.INSTANCE;
                int i70 = MediaDescriptionCompat + 29;
                MediaBrowserCompatMediaItem = i70 % 128;
                int i71 = i70 % 2;
                return unit3;
            case 59:
                return ICustomTabsServiceDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        int i4 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2040175674, -2040175660, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getdebugerrormsg, function0);
        int i4 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(passwordNeo6DFragment, function0);
        int i4 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnVerticalScrollEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg);
        int i3 = MediaDescriptionCompat + 87;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, getdebugerrormsg, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1756348226, -1756348172, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = MediaDescriptionCompat + 49;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordNeo6DFragment, isjsontypeignore);
        int i4 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getdebugerrormsg, valueAnimator);
        int i4 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, float f, Interpolator interpolator, getDebugErrorMSG getdebugerrormsg, Interpolator interpolator2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(passwordNeo6DFragment, f, interpolator, getdebugerrormsg, interpolator2, valueAnimator);
        int i4 = MediaDescriptionCompat + 101;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(passwordNeo6DFragment, getdebugerrormsg, view, i, i2, i3, i4);
        int i8 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Pair IAuthTabCallbackDefault(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return pairIsEngagementSignalsApiAvailable;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedList;
    }

    public static /* synthetic */ Pair IAuthTabCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair pair = (Pair) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 745667309, -745667262, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return pair;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 65;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnSessionEnded;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallbackStubProxy(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1544398220, -1544398182, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).intValue();
        int i4 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onMinimized(passwordNeo6DFragment);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaDescriptionCompat + 63;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            prefetch(passwordNeo6DFragment, attachapplovinsdk);
            throw null;
        }
        Unit unitPrefetch = prefetch(passwordNeo6DFragment, attachapplovinsdk);
        int i3 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return unitPrefetch;
    }

    public static /* synthetic */ deprecated_dns IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarPlaybackStateCompat = PlaybackStateCompat();
        int i4 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarPlaybackStateCompat;
    }

    public static /* synthetic */ boolean IAuthTabCallback_Parcel(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnPostMessage = onPostMessage(passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return zOnPostMessage;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 91;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[1];
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(fFloatValue, getdebugerrormsg, fFloatValue2, valueAnimator);
        if (i3 != 0) {
            return null;
        }
        int i4 = 51 / 0;
        return null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(passwordNeo6DFragment, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 9;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return unitIsEngagementSignalsApiAvailable;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) throws Throwable {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordNeo6DFragment, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        int i4 = MediaBrowserCompatMediaItem + 121;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i4 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitAudioAttributesImplApi26Parcelizer;
    }

    public static /* synthetic */ int access000() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iMediaMetadataCompat = MediaMetadataCompat();
        int i4 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return iMediaMetadataCompat;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        setHasUserConsent sethasuserconsent = (setHasUserConsent) objArr[1];
        setHasUserConsent sethasuserconsent2 = (setHasUserConsent) objArr[2];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(passwordNeo6DFragment, sethasuserconsent, sethasuserconsent2, valueAnimator);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Pair access000(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            mayLaunchUrl(passwordNeo6DFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair pairMayLaunchUrl = mayLaunchUrl(passwordNeo6DFragment);
        int i3 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
        }
        return pairMayLaunchUrl;
    }

    public static /* synthetic */ Unit access000(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 351683634, -351683619, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit access100(PasswordNeo6DFragment passwordNeo6DFragment) {
        Unit unit;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {passwordNeo6DFragment};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (i3 == 0) {
            unit = (Unit) IAuthTabCallback(objArr, iOnNavigationEvent2, 679713340, -679713322, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent4);
            int i4 = 62 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(objArr, iOnNavigationEvent2, 679713340, -679713322, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent4);
        }
        int i5 = MediaDescriptionCompat + 15;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 5;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit asBinder(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 89;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit asInterface(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return onGreatestScrollPercentageIncreased(passwordNeo6DFragment, attachapplovinsdk);
        }
        onGreatestScrollPercentageIncreased(passwordNeo6DFragment, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setHasUserConsent asInterface(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackDefault(passwordNeo6DFragment);
        }
        ICustomTabsCallbackDefault(passwordNeo6DFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1871936460, 1871936462, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 109;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return unitIEngagementSignalsCallbackDefault;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitRequestPostMessageChannel;
    }

    public static /* synthetic */ int getInterfaceDescriptor(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iOnMessageChannelReady = onMessageChannelReady(passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return iOnMessageChannelReady;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1266036543, 1266036549, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdebugerrormsg, fFloatValue);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[5];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(passwordNeo6DFragment, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, valueAnimator);
        int i4 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        float f;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 17;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (iIntValue != 0) {
            switch (iIntValue) {
                case 2:
                    f = 0.33333334f;
                    break;
                case 3:
                    f = 0.041666668f;
                    break;
                case 4:
                    int i4 = i2 + 43;
                    MediaBrowserCompatMediaItem = i4 % 128;
                    int i5 = i4 % 2;
                    f = 0.20833334f;
                    break;
                case 5:
                    f = 0.375f;
                    break;
                case 6:
                    int i6 = i2 + 101;
                    MediaBrowserCompatMediaItem = i6 % 128;
                    int i7 = i6 % 2;
                    f = 0.083333336f;
                    break;
                case 7:
                    f = 0.25f;
                    break;
                case 8:
                    f = 0.4166667f;
                    break;
                case 9:
                    f = 0.2916667f;
                    break;
                case 10:
                    f = 0.45833334f;
                    break;
                default:
                    f = 0.16666667f;
                    break;
            }
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }

    public static /* synthetic */ deprecated_dns newSession() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarRatingCompatApi19Impl = RatingCompatApi19Impl();
        int i4 = MediaDescriptionCompat + 93;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_dnsVarRatingCompatApi19Impl;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(onActivityResized(passwordNeo6DFragment));
        }
        onActivityResized(passwordNeo6DFragment);
        throw null;
    }

    public static /* synthetic */ Unit onActivityLayout(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1467909831, -1467909781, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1467909831, -1467909781, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = 20 / 0;
        return unit;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStub;
    }

    public static /* synthetic */ Unit onActivityResized(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ String onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(passwordNeo6DFragment, str);
        int i4 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(getdebugerrormsg, f);
        int i4 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(getdebugerrormsg, passwordNeo6DFragment, f, f2, f3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdebugerrormsg, passwordNeo6DFragment, f, f2, f3);
        int i3 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 21;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(passwordNeo6DFragment, setDetectableSize);
        int i4 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess200 = access200(passwordNeo6DFragment, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess200;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(passwordNeo6DFragment, getdebugerrormsg, f);
        int i4 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(float f, getDebugErrorMSG getdebugerrormsg, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(new Object[]{Float.valueOf(f), getdebugerrormsg, Float.valueOf(f2), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1571221113, 1571221118, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            throw null;
        }
        IAuthTabCallback(new Object[]{Float.valueOf(f), getdebugerrormsg, Float.valueOf(f2), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1571221113, 1571221118, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = MediaBrowserCompatMediaItem + 73;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallback(BaseActivity baseActivity, PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 69;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(new Object[]{baseActivity, passwordNeo6DFragment, view}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2072389693, -2072389659, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 55;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg, valueAnimator);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1777374567, -1777374539, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdebugerrormsg, passwordNeo6DFragment);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getdebugerrormsg, passwordNeo6DFragment, f, f2, f3);
        int i4 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(passwordNeo6DFragment);
        int i4 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 69;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordNeo6DFragment, setDetectableSize);
        int i4 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1066944046, 1066944063, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(passwordNeo6DFragment, f, f2, getdebugerrormsg, valueAnimator);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(passwordNeo6DFragment, view);
        int i4 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    public static /* synthetic */ Unit onMessageChannelReady(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(passwordNeo6DFragment, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return engagementSignalsCallback;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(passwordNeo6DFragment, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onMinimized(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 29;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ float onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult(passwordNeo6DFragment);
        }
        extraCallbackWithResult(passwordNeo6DFragment);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg, fFloatValue);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg, fFloatValue);
        int i3 = MediaBrowserCompatMediaItem + 65;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(attachapplovinsdk);
        }
        onTransact(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getdebugerrormsg, f);
        int i4 = MediaBrowserCompatMediaItem + 9;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 61;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg, passwordNeo6DFragment, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1355755065, -1355755032, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(passwordNeo6DFragment, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(passwordNeo6DFragment, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, List list) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordNeo6DFragment, getdebugerrormsg, list);
        int i4 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordNeo6DFragment, getdebugerrormsg, z);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(getDebugErrorMSG getdebugerrormsg, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(getdebugerrormsg, function0);
        int i4 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(passwordNeo6DFragment, dialogInterface, i);
        int i5 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1041565811, 1041565831, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).booleanValue();
        int i4 = MediaDescriptionCompat + 33;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ Unit onPostMessage(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unitNewSessionWithExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(passwordNeo6DFragment, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return unitMayLaunchUrl;
        }
        throw null;
    }

    public static /* synthetic */ int onTransact(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(passwordNeo6DFragment);
        int i4 = MediaDescriptionCompat + 49;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return iICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit onTransact(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 834458602, -834458566, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1733602443, 1733602455, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onUnminimized(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 3;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return newSession(passwordNeo6DFragment, attachapplovinsdk);
        }
        newSession(passwordNeo6DFragment, attachapplovinsdk);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        deprecated_dns deprecated_dnsVar = (deprecated_dns) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[2];
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[4];
        float fFloatValue3 = ((Number) objArr[5]).floatValue();
        float fFloatValue4 = ((Number) objArr[6]).floatValue();
        float fFloatValue5 = ((Number) objArr[7]).floatValue();
        float fFloatValue6 = ((Number) objArr[8]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[9];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 69;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(new Object[]{deprecated_dnsVar, Float.valueOf(fFloatValue), passwordNeo6DFragment, Float.valueOf(fFloatValue2), getdebugerrormsg, Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4), Float.valueOf(fFloatValue5), Float.valueOf(fFloatValue6), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1759806156, -1759806155, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 39;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1236447485, 1236447531, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        int i3 = 92 / 0;
        return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1236447485, 1236447531, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDebugErrorMSG getdebugerrormsg) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {getdebugerrormsg};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1723768281, 1723768339, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, int i, float f) throws Throwable {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(getdebugerrormsg, passwordNeo6DFragment, i, f);
        }
        onExtraCallback(getdebugerrormsg, passwordNeo6DFragment, i, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg, passwordNeo6DFragment, motionEvent}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -891105772, 891105783, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 55;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordNeo6DFragment, i, view);
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(passwordNeo6DFragment, attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(passwordNeo6DFragment, getdebugerrormsg, f);
            throw null;
        }
        Unit unitAsInterface = asInterface(passwordNeo6DFragment, getdebugerrormsg, f);
        int i3 = MediaDescriptionCompat + 19;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onWarmupCompleted(float f, float f2, PasswordNeo6DFragment passwordNeo6DFragment, float f3, getDebugErrorMSG getdebugerrormsg, float f4, float f5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f, f2, passwordNeo6DFragment, f3, getdebugerrormsg, f4, f5, valueAnimator);
        int i4 = MediaBrowserCompatMediaItem + 39;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(getdebugerrormsg, passwordNeo6DFragment, view);
        int i4 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(passwordNeo6DFragment, view);
        int i4 = MediaBrowserCompatMediaItem + 89;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            validateRelationship(passwordNeo6DFragment, attachapplovinsdk);
            obj.hashCode();
            throw null;
        }
        Unit unitValidateRelationship = validateRelationship(passwordNeo6DFragment, attachapplovinsdk);
        int i3 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            return unitValidateRelationship;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object prefetchWithMultipleUrls(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(attachapplovinsdk);
        int i4 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMediaSessionCompatToken = MediaSessionCompatToken();
        int i4 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unitMediaSessionCompatToken;
    }

    public static /* synthetic */ Unit readTypedObject(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            postMessage(passwordNeo6DFragment, attachapplovinsdk);
            throw null;
        }
        Unit unitPostMessage = postMessage(passwordNeo6DFragment, attachapplovinsdk);
        int i3 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return unitPostMessage;
    }

    private static /* synthetic */ Object receiveFile(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarRatingCompatStyle = RatingCompatStyle();
        int i4 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_dnsVarRatingCompatStyle;
        }
        throw null;
    }

    public static /* synthetic */ isNullSentinel receiveFile() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return (isNullSentinel) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 647514788, -647514733, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        int i3 = 10 / 0;
        return (isNullSentinel) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 647514788, -647514733, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ deprecated_dns requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return (deprecated_dns) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -736253383, 736253424, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object requestPostMessageChannelWithExtras(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCommand(passwordNeo6DFragment, attachapplovinsdk);
        }
        extraCommand(passwordNeo6DFragment, attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Interpolator setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 63;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return IEngagementSignalsCallback();
        }
        IEngagementSignalsCallback();
        throw null;
    }

    private static /* synthetic */ Object setEngagementSignalsCallback(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Interpolator interpolator = (Interpolator) objArr[2];
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        float fFloatValue3 = ((Number) objArr[4]).floatValue();
        float fFloatValue4 = ((Number) objArr[5]).floatValue();
        View[] viewArr = (View[]) objArr[6];
        float fFloatValue5 = ((Number) objArr[7]).floatValue();
        String str = (String) objArr[8];
        float fFloatValue6 = ((Number) objArr[9]).floatValue();
        float fFloatValue7 = ((Number) objArr[10]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[11];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(new Object[]{passwordNeo6DFragment, Float.valueOf(fFloatValue), interpolator, Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4), viewArr, Float.valueOf(fFloatValue5), str, Float.valueOf(fFloatValue6), Float.valueOf(fFloatValue7), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1123416243, 1123416264, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 5;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    public static /* synthetic */ Interpolator warmup() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return (Interpolator) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1753236308, 1753236330, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        int i3 = 86 / 0;
        return (Interpolator) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1753236308, 1753236330, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit writeTypedObject(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1652360547, 1652360591, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onExtraCallbackWithResult = {27148, 27341, 27339, 27337, 27343, 27184, 27186, 27193, 27195, 27191, 27185, 27159, 27155, 27338, 27156, 27256, 27153, 27184, 27185, 27337, 27338, 27186, 27159, 27256, 27162, 27192, 27190, 27187, 27341, 27184, 27163, 27256, 27157, 27184, 27339, 27339, 27342, 27189, 27159, 27256, 27152, 27341, 27343, 27343, 27161, 27162, 27186};
        private static int onNavigationEvent = 1;
        final /* synthetic */ getDebugErrorMSG $this_run;
        int label;
        final /* synthetic */ PasswordNeo6DFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$this_run = getdebugerrormsg;
            this.this$0 = passwordNeo6DFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$this_run, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 69 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.password.PasswordNeo6DFragment$onWarmupCompleted$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ getDebugErrorMSG $this_run;
            int label;
            final /* synthetic */ PasswordNeo6DFragment this$0;
            private static final byte[] $$a = {115, -125, 45, -41};
            private static final int $$b = 118;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onNavigationEvent = 0;
            private static int onExtraCallback = 1;
            private static long onWarmupCompleted = 7798559133331975163L;
            private static int onExtraCallbackWithResult = -1776194565;
            private static char IAuthTabCallback = 42237;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(int r6, byte r7, byte r8) {
                /*
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    byte[] r1 = viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted.AnonymousClass1.$$a
                    int r7 = 110 - r7
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L17
                    r7 = r6
                    r4 = r8
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r8) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L28:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L2c:
                    int r6 = r6 + r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted.AnonymousClass1.$$c(int, byte, byte):java.lang.String");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$this_run = getdebugerrormsg;
                this.this$0 = passwordNeo6DFragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_run, this.this$0, access13800Var);
                int i2 = onExtraCallback + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            /* renamed from: viva.republica.toss.password.PasswordNeo6DFragment$onWarmupCompleted$1$IAuthTabCallback */
            public static final class IAuthTabCallback implements View.OnLayoutChangeListener {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallback = 1;
                private static int[] onExtraCallbackWithResult = {-1018278053, -696411908, 1428926293, 868795126, -95924538, -1658796820, 46244922, 1581951600, -1900370007, -642624784, -1454977816, 991805064, 1169217780, -2108648130, -1546560970, -170866299, 1721674597, 1917415818};
                private static int onNavigationEvent;
                final /* synthetic */ PasswordNeo6DFragment onExtraCallback;
                final /* synthetic */ getDebugErrorMSG onWarmupCompleted;

                public IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment) {
                    this.onWarmupCompleted = getdebugerrormsg;
                    this.onExtraCallback = passwordNeo6DFragment;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
                    Object obj;
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 15;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    view.removeOnLayoutChangeListener(this);
                    if (this.onWarmupCompleted.onMessageChannelReady.getWidth() != 0) {
                        int i12 = onNavigationEvent + 41;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        if (this.onWarmupCompleted.onMessageChannelReady.getHeight() != 0) {
                            getDebugErrorMSG getdebugerrormsg = this.onWarmupCompleted;
                            View view2 = getdebugerrormsg.onExtraCallbackWithResult;
                            ConstraintLayout constraintLayout = getdebugerrormsg.onMessageChannelReady;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                            BitmapDrawable bitmapDrawable = null;
                            Bitmap bitmapIAuthTabCallback = C_.IAuthTabCallback(constraintLayout, (Bitmap.Config) null, 1, (Object) null);
                            if (bitmapIAuthTabCallback != null) {
                                Resources resources = this.onWarmupCompleted.onExtraCallbackWithResult.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "");
                                bitmapDrawable = new BitmapDrawable(resources, bitmapIAuthTabCallback);
                            }
                            view2.setBackground(bitmapDrawable);
                            View view3 = this.onWarmupCompleted.onExtraCallbackWithResult;
                            if (PasswordNeo6DFragment.extraCallback(this.onExtraCallback)) {
                                Object[] objArr = new Object[1];
                                a(new int[]{-153327081, 456598197, 10048470, 1096150732, -532588799, -1868560778}, View.resolveSizeAndState(0, 0, 0) + 9, objArr);
                                obj = objArr[0];
                            } else {
                                Object[] objArr2 = new Object[1];
                                a(new int[]{-741963694, 327028893, 1262513462, -2124048881, -1102238019, 1841460856}, Color.blue(0) + 9, objArr2);
                                obj = objArr2[0];
                            }
                            int color = Color.parseColor(((String) obj).intern());
                            int i14 = onNavigationEvent + 97;
                            IAuthTabCallback = i14 % 128;
                            if (i14 % 2 == 0) {
                                view3.setBackgroundTintList(ColorStateList.valueOf(color));
                                PasswordNeo6DFragment.onNavigationEvent(this.onExtraCallback, false);
                            } else {
                                view3.setBackgroundTintList(ColorStateList.valueOf(color));
                                PasswordNeo6DFragment.onNavigationEvent(this.onExtraCallback, true);
                            }
                        }
                    }
                    int i15 = onNavigationEvent + 95;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 16 / 0;
                    }
                }

                private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i2 = 2;
                    int i3 = 2 % 2;
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = onExtraCallbackWithResult;
                    int i4 = -1469660336;
                    int i5 = 16;
                    if (iArr3 != null) {
                        int i6 = $10 + 35;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        }
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> i5), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 72, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                                }
                                iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                                i7++;
                                i4 = -1469660336;
                                i5 = 16;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = onExtraCallbackWithResult;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i8 = 0;
                        while (i8 < length3) {
                            int i9 = $11 + 65;
                            $10 = i9 % 128;
                            int i10 = i9 % i2;
                            Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 73 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i8++;
                            i2 = 2;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                        int i11 = $11 + 15;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                        cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                        cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                        cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                        int i13 = 0;
                        for (int i14 = 16; i13 < i14; i14 = 16) {
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                            Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - Process.getGidForName("")), Drawable.resolveOpacity(0, 0) + 39, TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                            i13++;
                        }
                        int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                        int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                        int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4032), 78 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                int i4 = 0;
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i5 = $11 + 5;
                    $10 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 43;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1451;
                            byte b = (byte) i4;
                            byte b2 = b;
                            String str$$c = $$c(b, b2, b2);
                            Class[] clsArr = new Class[1];
                            clsArr[i4] = Object.class;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, threadPriority, minimumFlingVelocity, 228868077, false, str$$c, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) i4;
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), 44 - (Process.myPid() >> 22), 1494 - Color.argb(i4, i4, i4, i4), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0)), 50 - Color.argb(0, 0, 0, 0), 22939 - TextUtils.indexOf("", "", 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.MeasureSpec.getSize(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 30, (-16764639) - Color.rgb(0, 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        i2 = 2;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArr6);
                int i7 = $11 + 27;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0138 A[PHI: r2 r12
              0x0138: PHI (r2v28 android.view.View) = (r2v27 android.view.View), (r2v31 android.view.View) binds: [B:30:0x0136, B:27:0x0128] A[DONT_GENERATE, DONT_INLINE]
              0x0138: PHI (r12v7 android.graphics.Bitmap) = (r12v6 android.graphics.Bitmap), (r12v11 android.graphics.Bitmap) binds: [B:30:0x0136, B:27:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0186  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 704
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            char[] cArr;
            int i2 = 2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = onExtraCallbackWithResult;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 107;
                    $11 = i9 % 128;
                    if (i9 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf("", c)), 35 - TextUtils.getOffsetBefore("", 0), MotionEvent.axisFromString("") + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i8 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 35 - Color.green(0), TextUtils.getOffsetBefore("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i8++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    c = '0';
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr2, i4, cArr4, 0, i5);
            if (bArr != null) {
                char[] cArr5 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c2 = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 65, (ViewConfiguration.getPressedStateDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 29 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    c2 = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 70, 12486 - TextUtils.indexOf("", "", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr5;
            }
            if (i7 > 0) {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i12 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i12, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i12);
                int i13 = $11 + 61;
                $10 = i13 % 128;
                i = 2;
                int i14 = i13 % 2;
            } else {
                i = 2;
            }
            if (z) {
                int i15 = $11 + 1;
                $10 = i15 % 128;
                if (i15 % i != 0) {
                    cArr = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                int i16 = $10 + 19;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_run, this.this$0, null);
                this.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 19, 7}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -170013910407574428L;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ getDebugErrorMSG $this_run;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(getDebugErrorMSG getdebugerrormsg, Function0<Unit> function0, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$this_run = getdebugerrormsg;
            this.$onComplete = function0;
        }

        public static /* synthetic */ Unit IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, findResAndMsg findresandmsg, Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(getdebugerrormsg, findresandmsg, function0);
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onExtraCallback(Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(function0);
            int i4 = onWarmupCompleted + 29;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$this_run, this.$onComplete, access13800Var);
            asinterface.L$0 = obj;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 73;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                obj = null;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    break;
                }
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) "", '0', 0)), 84 - ExpandableListView.getPackedPositionGroup(0L), 21233 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 14185), 18 - TextUtils.lastIndexOf("", '0', 0, 0), 8808 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 103;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                objArr[0] = str;
            } else {
                obj.hashCode();
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{30200, 47206, 50942, 30107, 32430, 53103, 10306, 6394, 43128, 60698, 2785, 15702, 52895, 35516, 27787, 24485, 60781, 43075, 16683, 33169, 856, 21996, 41931, 41584, 8631, 29596, 33899, 50390, 17439, 4391, 58880, 59680, 31479, 16069, 14507, 2833, 39128, 56441, 7495, 11746, 48944, 64078, 32749, 19993, 56778, 42913, 20891, 28834, 61553, 17728, 45611}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            final getDebugErrorMSG getdebugerrormsg = this.$this_run;
            AuthPinBackgroundView authPinBackgroundView = getdebugerrormsg.postMessage;
            final Function0<Unit> function0 = this.$onComplete;
            authPinBackgroundView.onNavigationEvent(findresandmsg, function0, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$loadBackgroundBitmaps$1$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return PasswordNeo6DFragment.asInterface.IAuthTabCallback(getdebugerrormsg, findresandmsg, function0);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onNavigationEvent(Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{57356, 26732, 10811, 57436, 6517, 8037, 50328, 32574, 15835, 15627, 58937, 23241, 23298, 23201, 32836, 14395, 30856, 30818, 44537, 58892, 38635, 34281, 20238, 50595, 46168}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{14509, 9251, 16375, 14571, 24089, 21290, 53582, 14413, 58728, 29007, 62375, 7605, 33666, 5803, 38283, 32526, 41004, 13327, 47207, 41315, 20044, 51624, 23244, 33478, 27903, 61380, 32114, 58415, 2313, 36139, 7941, 51592, 14265, 41606, 49574, 11249, 54750, 16491, 58397, 3355, 61997, 26232, 34530, 28322, 36994, 15333, 43139}, KeyEvent.getDeadChar(0, 0), objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onNavigationEvent(getDebugErrorMSG getdebugerrormsg, findResAndMsg findresandmsg, final Function0 function0) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{57356, 26732, 10811, 57436, 6517, 8037, 50328, 32574, 15835, 15627, 58937, 23241, 23298, 23201, 32836, 14395, 30856, 30818, 44537, 58892, 38635, 34281, 20238, 50595, 46168}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{55331, 59415, 50321, 55397, 30606, 40734, 10792, 4570, 1510, 48507, 2241, 13346, 25356, 55967, 28397, 22169, 16546, 63547, 17153, 35060, 44738, 1436, 41386, 43857, 35953, 9200, 34324, 52664, 59783, 16671, 58467, 57375, 55095, 28338, 15040, 614, 13648, 35935, 8059, 9356, 4771, 43609, 32136, 18212, 28688, 63435}, (-1) - ImageFormat.getBitsPerPixel(0), objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            getdebugerrormsg.postMessage.onNavigationEvent(findresandmsg, function0, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$loadBackgroundBitmaps$1$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return PasswordNeo6DFragment.asInterface.onExtraCallback(function0);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = -7493447714906647050L;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = PasswordNeo6DFragment.this.new onTransact(access13800Var);
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            int i5 = onNavigationEvent + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                ontransactCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0140  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onTransact.a(char[], int, java.lang.Object[]):void");
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            GradientButtonView gradientButtonView;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 9;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{20642, 28429, 12279, 61354, 44629, 28372, 11936, 60762, 44430, 28070, 11366, 60637, 44200, 27493, 11218, 60357, 43569, 27358, 10894, 59760, 43306, 27010, 10362, 59498, 43230, 26445, 10045, 59272, 42562, 26163, 9954, 58645, 42305, 26107, 9298, 58386, 42237, 25824, 8972, 58357, 41915, 25115, 8918, 58042, 41236, 25030, 8626}, KeyEvent.normalizeMetaState(0) + 16301, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            getDebugErrorMSG getdebugerrormsgICustomTabsCallback = PasswordNeo6DFragment.ICustomTabsCallback(PasswordNeo6DFragment.this);
            if (getdebugerrormsgICustomTabsCallback != null && (gradientButtonView = getdebugerrormsgICustomTabsCallback.setEngagementSignalsCallback) != null) {
                int i7 = IAuthTabCallback + 77;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                gradientButtonView.IAuthTabCallbackStub();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class access000 implements Animator.AnimatorListener {
        final /* synthetic */ getDebugErrorMSG IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public access000(getDebugErrorMSG getdebugerrormsg) {
            this.IAuthTabCallback = getdebugerrormsg;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Iterator it = PasswordNeo6DFragment.writeTypedObject(PasswordNeo6DFragment.this).iterator();
            while (it.hasNext()) {
                ((AuthPinDotView) it.next()).asBinder();
            }
            this.IAuthTabCallback.setEngagementSignalsCallback.setState(GradientButtonView.onExtraCallback.ERROR);
        }
    }

    public static final class getInterfaceDescriptor implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public getInterfaceDescriptor() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PasswordNeo6DFragment passwordNeo6DFragment = PasswordNeo6DFragment.this;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo6DFragment);
            PasswordNeo6DFragment.onExtraCallback(passwordNeo6DFragment, textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, PasswordNeo6DFragment.this.new IAuthTabCallbackStubProxy(null), 3, (Object) null) : null);
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getDebugErrorMSG $this_run;
        int label;
        final /* synthetic */ PasswordNeo6DFragment this$0;
        private static final byte[] $$a = {10, 80, 9, 70};
        private static final int $$b = 3;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onWarmupCompleted = {60855, 14020, 23386, 32747, 32816, 42133, 51485, 60899, 13947, 23391, 32731, 32892, 42221, 51460, 60831, 13932, 23268, 32567, 32835, 42193, 51567, 60899, 13831, 23251, 32619, 33716, 42176, 51529, 60903, 13938, 23183, 32604, 33748, 42034, 51391, 60883, 13912, 23201, 32625, 33676, 41998, 51362, 60715, 13915, 23249, 32615, 33791, 49487, 6697, 30651, 21261, 44267, 34925, 58866, 49486, 6822};
        private static long onNavigationEvent = -5252354076445690203L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, int r8, short r9) {
            /*
                byte[] r0 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallbackDefault.$$a
                int r9 = r9 * 3
                int r9 = r9 + 97
                int r8 = r8 * 4
                int r8 = 4 - r8
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r5 = r2
                goto L29
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r8]
                r6 = r3
                r3 = r9
                r9 = r6
            L29:
                int r9 = -r9
                int r9 = r9 + r3
                int r8 = r8 + 1
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallbackDefault.$$c(int, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$this_run = getdebugerrormsg;
            this.this$0 = passwordNeo6DFragment;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$this_run, this.this$0, access13800Var);
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x020b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r27, int r28, char r29, java.lang.Object[] r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallbackDefault.a(int, int, char, java.lang.Object[]):void");
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.$this_run.setEngagementSignalsCallback.setState(GradientButtonView.onExtraCallback.NORMAL);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 16 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((-1) - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 47, (char) View.combineMeasuredStates(0, 0), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            if (!(!this.this$0.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))) {
                int i7 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                AuthPinDotRotationView authPinDotRotationView = this.$this_run.prefetch;
                Object[] objArr2 = new Object[1];
                a(46 - TextUtils.lastIndexOf("", '0', 0, 0), 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (View.MeasureSpec.getMode(0) + 11448), objArr2);
                authPinDotRotationView.IAuthTabCallback(Color.parseColor(((String) objArr2[0]).intern()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r27, char r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.b(int, char, int, java.lang.Object[]):void");
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 24212;
        private static int asBinder = 1;
        private static char onExtraCallback = 61732;
        private static char onExtraCallbackWithResult = 27032;
        private static char onNavigationEvent = 25113;
        private static int onWarmupCompleted;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = PasswordNeo6DFragment.this.new asBinder(access13800Var);
            int i2 = asBinder + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            asBinder = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 51;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 90 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 111;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $11 + 91;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int offsetAfter = 10 - TextUtils.getOffsetAfter("", i3);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, offsetAfter, fadingEdgeLength, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12482 - AndroidCharacter.getMirror('0'), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 15, 19901 - View.resolveSizeAndState(0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[PHI: r1
          0x005d: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
          0x0025: PHI (r5v1 int) = (r5v0 int), (r5v5 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.asBinder.asBinder
                int r1 = r1 + 29
                int r2 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.asBinder.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1d
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r5 = r11.label
                r6 = 68
                int r6 = r6 / r2
                if (r5 == 0) goto L5d
                goto L25
            L1d:
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r5 = r11.label
                if (r5 == 0) goto L5d
            L25:
                if (r5 != r4) goto L3a
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.asBinder.onWarmupCompleted
                int r1 = r1 + 21
                int r2 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.asBinder.asBinder = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L36
                kotlin.ResultKt.onNavigationEvent(r12)
                goto L6c
            L36:
                kotlin.ResultKt.onNavigationEvent(r12)
                throw r3
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                r0 = 48
                char[] r1 = new char[r0]
                r1 = {x009e: FILL_ARRAY_DATA , data: [-7741, -6744, 28886, 12749, -16766, -8351, 9692, 28410, -13911, -30623, 26081, 2010, -29721, 25458, -11058, 21637, 25734, 24413, 27875, 26733, 22984, -23050, -21428, 24829, 16800, -31041, -1264, 30406, -7539, -23500, -11058, 21637, 13427, -30593, 12427, 29511, 15320, 30330, 10487, -61, -15195, -5008, -13165, 31328, 16164, -29815, -26371, -27114} // fill-array
                long r5 = android.os.Process.getElapsedCpuTime()
                r7 = 0
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                int r0 = r0 - r3
                java.lang.Object[] r3 = new java.lang.Object[r4]
                a(r1, r0, r3)
                r0 = r3[r2]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r12.<init>(r0)
                throw r12
            L5d:
                kotlin.ResultKt.onNavigationEvent(r12)
                r11.label = r4
                r5 = 300000(0x493e0, double:1.482197E-318)
                java.lang.Object r12 = o.formatMsgs.onWarmupCompleted(r5, r11)
                if (r12 != r1) goto L6c
                return r1
            L6c:
                viva.republica.toss.password.PasswordNeo6DFragment r12 = viva.republica.toss.password.PasswordNeo6DFragment.this
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r10 = new java.lang.Object[]{r12, r3, r0, r3}
                int r5 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
                int r8 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
                int r7 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
                int r9 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
                r4 = 1882857528(0x703a2038, float:2.3041265E29)
                r6 = -1882857521(0xffffffff8fc5dfcf, float:-1.9511908E-29)
                viva.republica.toss.password.PasswordFragment.onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
                viva.republica.toss.password.PasswordNeo6DFragment r12 = viva.republica.toss.password.PasswordNeo6DFragment.this
                int r0 = viva.republica.toss.R.string.password_timeout
                java.lang.String r0 = r12.getString(r0)
                o.onRenderReady.onExtraCallbackWithResult(r12, r0)
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.asBinder.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ getDebugErrorMSG ICustomTabsCallback(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            passwordNeo6DFragment.IEngagementSignalsCallbackStub();
            throw null;
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = passwordNeo6DFragment.IEngagementSignalsCallbackStub();
        int i3 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return getdebugerrormsgIEngagementSignalsCallbackStub;
    }

    public static final /* synthetic */ boolean extraCallback(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemoteActionCompatParcelizer = passwordNeo6DFragment.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return zRemoteActionCompatParcelizer;
    }

    public static final /* synthetic */ void onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 117;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        passwordNeo6DFragment.AudioAttributesImplApi26Parcelizer = getpackagetype;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 65;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, boolean z) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 83;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        passwordNeo6DFragment.IEngagementSignalsCallbackDefault = z;
        int i5 = i2 + 27;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ List writeTypedObject(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        List<AuthPinDotView> list = passwordNeo6DFragment.ICustomTabsServiceStub;
        int i5 = i3 + 27;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, getDebugErrorMSG> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static boolean IAuthTabCallback = false;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int asInterface = 0;
        private static char[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallbackWithResult onNavigationEvent;
        private static int onTransact = 1;
        private static boolean onWarmupCompleted;

        static {
            onNavigationEvent();
            onNavigationEvent = new onExtraCallbackWithResult();
            int i = IAuthTabCallbackDefault + 97;
            onTransact = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        onExtraCallbackWithResult() throws Throwable {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-113, -105, -125, -126, -124, -125, -126, -99, -124, -100, -119, -116, -101, -124, -120, -119, -115, -106, -106, -121, -102, -107, -125, -116, -103, -105, -121, -120, -104, -118, -105, -125, -126, -124, -125, -126, -127, -121, -107, -121, -124, -118, -106, -106, -119, -107, -118, -121, -108, -126, -109, -127, -110, -111, -116, -120, -118, -121, -117, -126, -117, -122, -112, -113, -115, -116, -126, -114, -118, -115, -116, -126, -117, -118, -124, -126, -119, -120, -124, -125, -121, -122, -123, -124, -125, -126, -127}, 127 - Color.alpha(0), objArr2);
            super(1, getDebugErrorMSG.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public final getDebugErrorMSG IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 61;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return getDebugErrorMSG.onNavigationEvent(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 72 / 0;
            return getDebugErrorMSG.onNavigationEvent(view);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            getDebugErrorMSG getdebugerrormsgIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = asBinder + 55;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return getdebugerrormsgIAuthTabCallback;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), 77 - View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') + 27, (Process.myTid() >> 22) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, 12214 - View.resolveSizeAndState(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 41;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    i4 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i7 = $10 + 43;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 2;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i9 = $11 + 111;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $11 + 27;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr6);
        }

        static void onNavigationEvent() {
            onExtraCallback = new char[]{32521, 32514, 32517, 32527, 32707, 32743, 32522, 32569, 32516, 32708, 32573, 32526, 32572, 32541, 32752, 32706, 32571, 32574, 32519, 32520, 32575, 32568, 32524, 32749, 32518, 32539, 32741, 32765, 32745};
            onExtraCallbackWithResult = -1184333909;
            onWarmupCompleted = true;
            IAuthTabCallback = true;
        }
    }

    private final getDebugErrorMSG IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) this.ICustomTabsCallbackDefault.onNavigationEvent(this, onExtraCallback[0]);
        int i4 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return getdebugerrormsg;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public ScrollView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        ScrollView scrollView = this.IAuthTabCallback;
        if (scrollView != null) {
            int i2 = MediaBrowserCompatMediaItem + 115;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            return scrollView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public void onNavigationEvent(@NotNull ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(scrollView, "");
            this.IAuthTabCallback = scrollView;
        } else {
            Intrinsics.checkNotNullParameter(scrollView, "");
            this.IAuthTabCallback = scrollView;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull TextView textView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textView, "");
            this.onExtraCallbackWithResult = textView;
            throw null;
        }
        Intrinsics.checkNotNullParameter(textView, "");
        this.onExtraCallbackWithResult = textView;
        int i3 = MediaBrowserCompatMediaItem + 95;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView onTransact() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 5;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.onExtraCallbackWithResult;
        if (textView != null) {
            int i5 = i2 + 77;
            MediaBrowserCompatMediaItem = i5 % 128;
            int i6 = i5 % 2;
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = MediaDescriptionCompat + 21;
        MediaBrowserCompatMediaItem = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public ViewGroup onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ViewGroup viewGroup = this.onNavigationEvent;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public void onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % 128;
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
        View view = this.onTransact;
        if (view != null) {
            int i2 = MediaDescriptionCompat + 17;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public void onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onTransact = view;
        int i4 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int[] onExtraCallbackWithResult = {206833027, -613478459, 51366072, -13546096, -1810158706, 615909755, 1306245096, 1742870929, -624230606, 907744782, 1911962906, -1973490082, 1029481401, 1131218964, 378381824, 1710439121, -535154053, 2137501009};
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $myManual;
        int label;
        final /* synthetic */ PasswordNeo6DFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(boolean z, PasswordNeo6DFragment passwordNeo6DFragment, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$myManual = z;
            this.this$0 = passwordNeo6DFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$myManual, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback_Parcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 65;
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
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallbackWithResult;
            int i4 = -1469660336;
            char c = '0';
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
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 71, TextUtils.lastIndexOf("", c, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6++;
                        int i7 = $11 + 39;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        i4 = -1469660336;
                        c = '0';
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
            int i9 = 16;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i10]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> i9), 72 - KeyEvent.getDeadChar(i5, i5), 8848 - KeyEvent.keyCodeFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 72, TextUtils.lastIndexOf("", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i10++;
                    }
                    i9 = 16;
                    i5 = 0;
                }
                i2 = i5;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i12 = $11 + 91;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i14 = 0;
                for (int i15 = 16; i14 < i15; i15 = 16) {
                    int i16 = $11 + 1;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 22252), 39 - Gravity.getAbsoluteGravity(0, 0), 10301 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14++;
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 78 - View.resolveSize(0, 0), 7398 - Color.blue(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r1
          0x005b: PHI (r1v20 java.lang.Object) = (r1v4 java.lang.Object), (r1v21 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.IAuthTabCallback
                int r1 = r1 + 25
                int r2 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r6.label
                r5 = 54
                int r5 = r5 / r2
                if (r4 == 0) goto L5b
                goto L24
            L1c:
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r6.label
                if (r4 == 0) goto L5b
            L24:
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.IAuthTabCallback
                int r1 = r1 + 9
                int r5 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.onNavigationEvent = r5
                int r1 = r1 % r0
                if (r1 != 0) goto L32
                if (r4 != r3) goto L38
                goto L34
            L32:
                if (r4 != r3) goto L38
            L34:
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L79
            L38:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r0 = 24
                int[] r0 = new int[r0]
                r0 = {x00aa: FILL_ARRAY_DATA , data: [-137163828, 371809773, -1642573891, -1958263880, 1651715468, -1202828091, -828610929, -1323346696, -2113197845, 1090236102, -67062955, 1958680697, 1529055134, 1444807624, -2003170635, -936996884, 1676025977, 377604679, -551420809, 1427206178, -1103547875, -87031584, -1874220428, 1710996386} // fill-array
                float r1 = android.media.AudioTrack.getMaxVolume()
                r4 = 0
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                int r1 = 48 - r1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                a(r0, r1, r3)
                r0 = r3[r2]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r7.<init>(r0)
                throw r7
            L5b:
                kotlin.ResultKt.onNavigationEvent(r7)
                boolean r7 = r6.$myManual
                if (r7 == 0) goto L65
                r4 = 0
                goto L67
            L65:
                r4 = 200(0xc8, double:9.9E-322)
            L67:
                r6.label = r3
                java.lang.Object r7 = o.formatMsgs.onWarmupCompleted(r4, r6)
                if (r7 != r1) goto L79
                int r7 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.IAuthTabCallback
                int r7 = r7 + 3
                int r2 = r7 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.onNavigationEvent = r2
                int r7 = r7 % r0
                return r1
            L79:
                viva.republica.toss.password.PasswordNeo6DFragment r7 = r6.this$0
                java.util.List r7 = viva.republica.toss.password.PasswordNeo6DFragment.writeTypedObject(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.onNavigationEvent
                int r1 = r1 + 109
                int r2 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.IAuthTabCallback = r2
                int r1 = r1 % r0
            L8e:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto La7
                int r1 = viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.IAuthTabCallback
                int r1 = r1 + 33
                int r2 = r1 % 128
                viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.onNavigationEvent = r2
                int r1 = r1 % r0
                java.lang.Object r1 = r7.next()
                im.toss.uikit.widget.AuthPinDotView r1 = (im.toss.uikit.widget.AuthPinDotView) r1
                r1.onExtraCallback()
                goto L8e
            La7:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.IAuthTabCallback_Parcel.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final Interpolator IEngagementSignalsCallback() {
        Interpolator interpolatorAsBinder;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
            int i3 = 75 / 0;
        } else {
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        }
        int i4 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return interpolatorAsBinder;
    }

    private final Interpolator onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.ICustomTabsCallbackStubProxy.getValue();
        int i4 = MediaDescriptionCompat + 69;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deprecated_dns PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 115;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarAsBinder = deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
        int i4 = MediaBrowserCompatMediaItem + 85;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarAsBinder;
    }

    private final deprecated_dns ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.ITrustedWebActivityServiceDefault.getValue();
        if (i3 == 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deprecated_dns RatingCompatApi19Impl() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback();
            throw null;
        }
        deprecated_dns deprecated_dnsVarIAuthTabCallback = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback();
        int i3 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return deprecated_dnsVarIAuthTabCallback;
    }

    private final deprecated_dns ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.getSmallIconBitmap.getValue();
        int i4 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return deprecated_dnsVar;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarIAuthTabCallbackStub = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub();
        int i4 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarIAuthTabCallbackStub;
    }

    private final deprecated_dns IPostMessageService_Parcel() {
        deprecated_dns deprecated_dnsVar;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            deprecated_dnsVar = (deprecated_dns) this.notifyNotificationWithChannel.getValue();
            int i3 = 50 / 0;
        } else {
            deprecated_dnsVar = (deprecated_dns) this.notifyNotificationWithChannel.getValue();
        }
        int i4 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    private static final deprecated_dns RatingCompatStyle() {
        int i = 2 % 2;
        deprecated_dns deprecated_dnsVar = new deprecated_dns(250.0d, 40.0d);
        int i2 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            objOnNavigationEvent = Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(2.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        } else {
            objOnNavigationEvent = Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        }
        return (Interpolator) objOnNavigationEvent;
    }

    private final Interpolator IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.IPostMessageServiceDefault.getValue();
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        throw null;
    }

    private final isNullSentinel IEngagementSignalsCallback_Parcel() {
        isNullSentinel isnullsentinel;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            isnullsentinel = (isNullSentinel) this.IEngagementSignalsCallbackStub.getValue();
            int i3 = 50 / 0;
        } else {
            isnullsentinel = (isNullSentinel) this.IEngagementSignalsCallbackStub.getValue();
        }
        int i4 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return isnullsentinel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object updateVisuals(Object[] objArr) {
        int i = 2 % 2;
        isNullSentinel isnullsentinel = new isNullSentinel();
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return isnullsentinel;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $onEnd;
        int label;
        final /* synthetic */ PasswordNeo6DFragment this$0;
        private static char[] onExtraCallback = {32579, 32589, 32634, 32526, 32626, 32639, 32519, 32636, 32577, 32627, 32625, 32633, 32588, 32576, 32581, 32632, 32624, 32635, 32631, 32582};
        private static int IAuthTabCallback = -1184333842;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onWarmupCompleted = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function0<Unit> function0, PasswordNeo6DFragment passwordNeo6DFragment, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$onEnd = function0;
            this.this$0 = passwordNeo6DFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$onEnd, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 69;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 13 / 0;
            return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            long j = 0;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $11 + 33;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), 77 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 20952 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        j = 0;
                        f = 0.0f;
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
            try {
                Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 75 - View.MeasureSpec.getSize(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (onWarmupCompleted) {
                    int i6 = $11 + 125;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 63 - View.resolveSize(0, 0), ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i8 = $10 + 61;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, TextUtils.getOffsetAfter("", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Intent intent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallbackDefault + 45;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Function0<Unit> function0 = this.$onEnd;
            if (function0 != null) {
                function0.invoke();
            } else {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    FragmentActivity activity2 = this.this$0.getActivity();
                    if (activity2 != null) {
                        int i7 = onNavigationEvent + 111;
                        IAuthTabCallbackDefault = i7 % 128;
                        if (i7 % 2 == 0) {
                            intent = activity2.getIntent();
                            int i8 = 51 / 0;
                        } else {
                            intent = activity2.getIntent();
                        }
                    } else {
                        intent = null;
                    }
                    activity.setResult(0, intent);
                }
                FragmentActivity activity3 = this.this$0.getActivity();
                if (activity3 != null) {
                    int i9 = IAuthTabCallbackDefault + 51;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        activity3.finish();
                        throw null;
                    }
                    activity3.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final int IEngagementSignalsCallbackStubProxy() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.updateVisuals.getValue()).intValue();
            int i3 = 90 / 0;
        } else {
            iIntValue = ((Number) this.updateVisuals.getValue()).intValue();
        }
        int i4 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int onActivityResized(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = passwordNeo6DFragment.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return varyMatches.onNavigationEvent(Integer.valueOf(i3 != 0 ? 10370 : 214), displayMetrics);
    }

    private final int IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 115;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ICustomTabsServiceStubProxy.getValue()).intValue();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return iIntValue;
    }

    private static final int onMessageChannelReady(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = passwordNeo6DFragment.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
        int i4 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    private final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access200.getValue();
        if (i3 == 0) {
            return ((Boolean) value).booleanValue();
        }
        ((Boolean) value).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onPostMessage(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = passwordNeo6DFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private final int ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.RemoteActionCompatParcelizer.getValue()).intValue();
        int i4 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) throws Throwable {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        if (!(!passwordNeo6DFragment.RemoteActionCompatParcelizer())) {
            Object[] objArr2 = new Object[1];
            b(7 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (2534 - (ViewConfiguration.getScrollBarSize() >> 8)), 594 - TextUtils.indexOf("", ""), objArr2);
            int color = Color.parseColor(((String) objArr2[0]).intern());
            int i4 = MediaDescriptionCompat + 65;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            return Integer.valueOf(color);
        }
        Object[] objArr3 = new Object[1];
        b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (char) Color.green(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 601, objArr3);
        int color2 = Color.parseColor(((String) objArr3[0]).intern());
        int i6 = MediaDescriptionCompat + 19;
        MediaBrowserCompatMediaItem = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(color2);
    }

    private final int ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ITrustedWebActivityService_Parcel.getValue()).intValue();
        int i4 = MediaBrowserCompatMediaItem + 7;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int extraCommand(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
            Object[] objArr = new Object[1];
            b(7 - Color.alpha(0), (char) (58309 - TextUtils.indexOf("", "")), 619 - View.resolveSizeAndState(0, 0, 0), objArr);
            obj = objArr[0];
        } else {
            int i4 = MediaDescriptionCompat + 21;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                b(110 >>> TextUtils.indexOf("", "", 1, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() / 48), 14841 << (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                b(TextUtils.indexOf("", "", 0, 0) + 9, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 609, objArr3);
                obj = objArr3[0];
            }
        }
        return Color.parseColor(((String) obj).intern());
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) passwordNeo6DFragment.ICustomTabsCallbackStub.getValue()).floatValue();
        int i4 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static final float extraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatMediaItem + 79;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return 1.0f;
        }
        int i6 = MediaDescriptionCompat + 49;
        MediaBrowserCompatMediaItem = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return 0.06f;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static char[] onExtraCallbackWithResult = {27258, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175, 27178, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168};
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = PasswordNeo6DFragment.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
            }
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int i6 = $11 + 77;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getOffsetAfter("", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i8 = $11 + 81;
                    $10 = i8 % 128;
                    if (i8 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 29 - KeyEvent.getDeadChar(0, 0), 17657 - KeyEvent.getDeadChar(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = $10 + 65;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.blue(0)), Color.red(0) + 65, 16718 - TextUtils.indexOf("", "", 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49467), ImageFormat.getBitsPerPixel(0) + 71, Color.red(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i13, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i13);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i14 = $11 + 109;
                $10 = i14 % 128;
                int i15 = 2;
                int i16 = i14 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i17 = $11 + 53;
                    $10 = i17 % 128;
                    int i18 = i17 % i15;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    i15 = 2;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                int i19 = $10 + 71;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 0, 11}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 65;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 4;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            PasswordNeo6DFragment.onWarmupCompleted(PasswordNeo6DFragment.this, false, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private final GraniteBrownfieldModule_closeView IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i2 % 128;
        return (GraniteBrownfieldModule_closeView) this.validateRelationship.getValue(this, i2 % 2 != 0 ? onExtraCallback[0] : onExtraCallback[1]);
    }

    private final void onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % 128;
        this.validateRelationship.setValue(this, i2 % 2 == 0 ? onExtraCallback[0] : onExtraCallback[1], graniteBrownfieldModule_closeView);
    }

    private final Pair<Integer, Integer> areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Pair<Integer, Integer> pair = (Pair) this.ITrustedWebActivityServiceStub.getValue();
        int i3 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    private static final Pair mayLaunchUrl(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            if (passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
                int i3 = MediaBrowserCompatMediaItem + 113;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                b(View.resolveSizeAndState(0, 0, 0) + 7, (char) (26158 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 625, objArr);
                return getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr[0]).intern())), Integer.valueOf(Color.rgb(147, 190, 255)));
            }
            Object[] objArr2 = new Object[1];
            b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 633 - View.resolveSizeAndState(0, 0, 0), objArr2);
            return getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr2[0]).intern())), Integer.valueOf(Color.rgb(27, 100, 218)));
        }
        passwordNeo6DFragment.RemoteActionCompatParcelizer();
        throw null;
    }

    private final Pair<Integer, Integer> cancelNotification() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Pair<Integer, Integer> pair = (Pair) this.ITrustedWebActivityServiceStubProxy.getValue();
        int i3 = MediaBrowserCompatMediaItem + 27;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return pair;
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) throws Throwable {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            if (passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
                Object[] objArr2 = new Object[1];
                b((ViewConfiguration.getScrollBarSize() >> 8) + 9, (char) (View.resolveSizeAndState(0, 0, 0) + 29153), View.MeasureSpec.getSize(0) + 562, objArr2);
                int color = Color.parseColor(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                b(7 - View.combineMeasuredStates(0, 0), (char) KeyEvent.getDeadChar(0, 0), MotionEvent.axisFromString("") + 572, objArr3);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(color), Integer.valueOf(Color.parseColor(((String) objArr3[0]).intern())));
                int i3 = MediaBrowserCompatMediaItem + 39;
                MediaDescriptionCompat = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 95 / 0;
                }
                return pairIAuthTabCallback;
            }
            Object[] objArr4 = new Object[1];
            b(9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (20735 - TextUtils.getOffsetBefore("", 0)), (-16776638) - Color.rgb(0, 0, 0), objArr4);
            int color2 = Color.parseColor(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            b(7 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32920), 587 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
            return getWrite.IAuthTabCallback(Integer.valueOf(color2), Integer.valueOf(Color.parseColor(((String) objArr5[0]).intern())));
        }
        passwordNeo6DFragment.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final setHasUserConsent ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsent = (setHasUserConsent) this.read.getValue();
        int i4 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return sethasuserconsent;
        }
        throw null;
    }

    private static final setHasUserConsent ICustomTabsCallbackDefault(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(((Number) passwordNeo6DFragment.cancelNotification().getFirst()).intValue(), ((Number) passwordNeo6DFragment.cancelNotification().getSecond()).intValue());
        int i2 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return sethasuserconsent;
    }

    private final Pair<Integer, Integer> ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Pair<Integer, Integer> pair = (Pair) this.write.getValue();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return pair;
    }

    private static final Pair isEngagementSignalsApiAvailable(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
                return getWrite.IAuthTabCallback(Integer.valueOf(Color.argb(204, 40, 3, 3)), Integer.valueOf(Color.argb(204, 165, 25, 38)));
            }
            Object[] objArr = new Object[1];
            b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26159), Gravity.getAbsoluteGravity(0, 0) + 626, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr[0]).intern())), Integer.valueOf(Color.rgb(254, 175, 180)));
            int i3 = MediaDescriptionCompat + 17;
            MediaBrowserCompatMediaItem = i3 % 128;
            if (i3 % 2 == 0) {
                return pairIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
        passwordNeo6DFragment.RemoteActionCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    private final int IPostMessageService() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ITrustedWebActivityService.getValue()).intValue();
        int i4 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int ICustomTabsCallbackStubProxy(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        FragmentActivity activity = passwordNeo6DFragment.getActivity();
        WindowManager windowManager = activity != null ? activity.getWindowManager() : null;
        if (windowManager == null) {
            M_ m_ = M_.onExtraCallback;
            return m_.IAuthTabCallbackDefault() + m_.onExtraCallbackWithResult() + m_.access000();
        }
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().height();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        int i5 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private final int IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ITrustedWebActivityCallback_Parcel.getValue()).intValue();
        int i4 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return iIntValue;
    }

    private static final int MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i4 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return iAsInterface;
    }

    public final boolean ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.ICustomTabsService_Parcel.getValue()).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.ICustomTabsService_Parcel.getValue()).booleanValue();
        int i3 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr2 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 490 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr2[0]).intern(), false);
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnExtraCallback);
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = MediaDescriptionCompat + 13;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    private static final Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new asDouble(isNumber.BIOMETRIC, isjsontypeignore.onNavigationEvent(), null, null, false, false, false, false, false, null, 1020, null));
        FragmentActivity activity = passwordNeo6DFragment.getActivity();
        Object obj = null;
        if (activity != null) {
            int i2 = MediaDescriptionCompat + 11;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 == 0) {
                activity.finish();
            } else {
                activity.finish();
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06ba  */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v65, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v69, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v71, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.Integer] */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onCreate(android.os.Bundle):void");
    }

    private static final void onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        passwordNeo6DFragment.onGreatestScrollPercentageIncreased = true;
        dialogInterface.dismiss();
        int i5 = MediaBrowserCompatMediaItem + 115;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (accessmapsafely.IAuthTabCallback(contextRequireContext)) {
            int i4 = MediaDescriptionCompat + 23;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 != 0) {
                enableFabricRenderer.onExtraCallback.onExtraCallback();
                throw null;
            }
            Throwable thOnExtraCallback = enableFabricRenderer.onExtraCallback.onExtraCallback();
            if (thOnExtraCallback != null && RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback)) {
                TdsDialogV1.onExtraCallbackWithResult onextracallbackwithresult = TdsDialogV1.Companion;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onextracallbackwithresult.onExtraCallback(context).onNavigationEvent(false);
                String string = getString(R.string.app_password___b2387d7b1d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object[] objArr = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(string), Integer.valueOf(R.drawable.image_popup_fingerprint_add)};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr, iOnExtraCallback);
                String string2 = getString(R.string.app_password___df8739daab);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2);
                String string3 = getString(im.toss.uikit.R.string.uikit_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string3, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda69
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        PasswordNeo6DFragment.onNavigationEvent(this.f$0, dialogInterface, i5);
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
            }
        }
        getSmallIconId();
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            i = R.layout.fragment_password_neo_6d;
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            i = R.layout.fragment_password_neo_6d;
            z = false;
        }
        View viewInflate = layoutInflater.inflate(i, viewGroup, z);
        int i4 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    private static final void onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        PasswordFragment.onWarmupCompleted(passwordNeo6DFragment, (Function0) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.password.PasswordNeo6DFragment r6, o.getDebugErrorMSG r7, android.graphics.Bitmap r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L15
            int r3 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r3 = r3 + 15
            int r4 = r3 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L13
            goto L15
        L13:
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            r6.prefetchWithMultipleUrls = r3
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.onRenderReady.onWarmupCompleted(r6)
            if (r3 == 0) goto L27
            im.toss.uikit.widget.gl.AuthPinBackgroundView r4 = r7.postMessage
            boolean r5 = r6.onRelationshipValidationResult()
            r4.setAppImage(r8, r5, r3)
        L27:
            boolean r6 = r6.prefetchWithMultipleUrls
            r6 = r6 ^ r1
            if (r6 == 0) goto L62
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.onNavigationEvent
            java.lang.String r8 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            o.M_ r1 = o.M_.onExtraCallback
            int r1 = r1.IAuthTabCallbackStub()
            int r3 = r6.getPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r5 = r6.getPaddingBottom()
            r6.setPadding(r3, r1, r4, r5)
            im.toss.tds.view.component.atom.image.TdsImageView r6 = r7.onTransact
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r1 = 8
            r6.setVisibility(r1)
            im.toss.uikit.widget.Toolbar r6 = r7.ICustomTabsServiceStub
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r6.setVisibility(r2)
            android.view.View r6 = r7.requestPostMessageChannelWithExtras
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r6.setVisibility(r1)
        L62:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            int r7 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r7 = r7 + 73
            int r8 = r7 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r8
            int r7 = r7 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted(viva.republica.toss.password.PasswordNeo6DFragment, o.getDebugErrorMSG, android.graphics.Bitmap):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        String strIEngagementSignalsCallbackDefault;
        String loginYN;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i2 % 128;
        String strUpdateVisuals = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback = passwordNeo6DFragment.ITrustedWebActivityCallbackDefault;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallback onextracallback2 = passwordNeo6DFragment.ITrustedWebActivityCallbackDefault;
        if (onextracallback2 != null) {
            strIEngagementSignalsCallbackDefault = onextracallback2.IEngagementSignalsCallbackDefault();
            int i3 = MediaDescriptionCompat + 115;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = MediaBrowserCompatMediaItem + 113;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            strIEngagementSignalsCallbackDefault = null;
        }
        Object[] objArr = new Object[1];
        b(8 - Gravity.getAbsoluteGravity(0, 0), (char) (2282 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 337, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), strIEngagementSignalsCallbackDefault);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        b(21 - (ViewConfiguration.getTapTimeout() >> 16), (char) (25466 - (Process.myPid() >> 22)), View.MeasureSpec.getMode(0) + 345, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), CatalystInstanceImplPendingJSCall.onNavigationEvent(CatalystInstanceImplPendingJSCall.onWarmupCompleted(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault)));
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        b(12 - TextUtils.getTrimmedLength(""), (char) (View.MeasureSpec.getSize(0) + 27814), Drawable.resolveOpacity(0, 0) + 366, objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        Object[] objArr4 = new Object[1];
        b(TextUtils.indexOf("", "", 0) + 12, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.blue(0) + 378, objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordNeo6DFragment.getString(R.string.password_reset));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        b(ExpandableListView.getPackedPositionGroup(0L) + 5, (char) (Color.rgb(0, 0, 0) + 16777216), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 389, objArr5);
        mapOnExtraCallback5.put(((String) objArr5[0]).intern(), passwordNeo6DFragment.postMessage);
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr6 = new Object[1];
        b((Process.myTid() >> 22) + 11, (char) (9714 - Gravity.getAbsoluteGravity(0, 0)), 395 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        mapOnExtraCallback6.put(((String) objArr6[0]).intern(), passwordNeo6DFragment.onTransact().getText().toString());
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            loginYN = indicatorViewAccess100.getLoginYN();
        } else {
            int i7 = MediaDescriptionCompat + 91;
            MediaBrowserCompatMediaItem = i7 % 128;
            int i8 = i7 % 2;
            loginYN = null;
        }
        Object[] objArr7 = new Object[1];
        b(8 - (ViewConfiguration.getTouchSlop() >> 8), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 406 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
        mapOnExtraCallback7.put(((String) objArr7[0]).intern(), loginYN);
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        String logValue = indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null;
        Object[] objArr8 = new Object[1];
        b((ViewConfiguration.getFadingEdgeLength() >> 16) + 11, (char) Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 414, objArr8);
        mapOnExtraCallback8.put(((String) objArr8[0]).intern(), logValue);
        Map mapOnExtraCallback9 = setDetectableSize.onExtraCallback();
        Object[] objArr9 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 757), 425 - KeyEvent.keyCodeFromString(""), objArr9);
        String strIntern = ((String) objArr9[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, View.MeasureSpec.makeMeasureSpec(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, ((Process.getThreadPriority(0) + 20) >> 6) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback9.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1));
            Map mapOnExtraCallback10 = setDetectableSize.onExtraCallback();
            Object[] objArr10 = new Object[1];
            b(10 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getTapTimeout() >> 16), 436 - TextUtils.getCapsMode("", 0, 0), objArr10);
            mapOnExtraCallback10.put(((String) objArr10[0]).intern(), passwordNeo6DFragment.onGreatestScrollPercentageIncreased());
            Map mapOnExtraCallback11 = setDetectableSize.onExtraCallback();
            Object[] objArr11 = new Object[1];
            b(16 - ImageFormat.getBitsPerPixel(0), (char) Color.argb(0, 0, 0, 0), 447 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            mapOnExtraCallback11.put(((String) objArr11[0]).intern(), passwordNeo6DFragment.onSessionEnded());
            Map mapOnExtraCallback12 = setDetectableSize.onExtraCallback();
            Object[] objArr12 = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 9, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getTapTimeout() >> 16) + 464, objArr12);
            mapOnExtraCallback12.put(((String) objArr12[0]).intern(), Long.valueOf(passwordNeo6DFragment.readTypedObject()));
            Map mapOnExtraCallback13 = setDetectableSize.onExtraCallback();
            Object[] objArr13 = new Object[1];
            b(Color.red(0) + 7, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 473 - TextUtils.getOffsetBefore("", 0), objArr13);
            String strIntern2 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            b(Gravity.getAbsoluteGravity(0, 0) + 1, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30550), 167 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr14);
            mapOnExtraCallback13.put(strIntern2, ((String) objArr14[0]).intern());
            Map mapOnExtraCallback14 = setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback3 = passwordNeo6DFragment.ITrustedWebActivityCallbackDefault;
            if (onextracallback3 != null) {
                int i9 = MediaBrowserCompatMediaItem + 121;
                MediaDescriptionCompat = i9 % 128;
                if (i9 % 2 == 0) {
                    onextracallback3.updateVisuals();
                    throw null;
                }
                strUpdateVisuals = onextracallback3.updateVisuals();
            }
            Object[] objArr15 = new Object[1];
            b((KeyEvent.getMaxKeyCode() >> 16) + 10, (char) (ViewConfiguration.getEdgeSlop() >> 16), 480 - Color.red(0), objArr15);
            mapOnExtraCallback14.put(((String) objArr15[0]).intern(), strUpdateVisuals);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit onActivityLayout(final PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1520731L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda100
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        PasswordFragment.IAuthTabCallback iAuthTabCallbackExtraCallbackWithResult = passwordNeo6DFragment.extraCallbackWithResult();
        if (iAuthTabCallbackExtraCallbackWithResult != null) {
            int i2 = MediaBrowserCompatMediaItem + 1;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 != 0) {
                iAuthTabCallbackExtraCallbackWithResult.IAuthTabCallback();
            } else {
                iAuthTabCallbackExtraCallbackWithResult.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[2];
        getdebugerrormsg.asBinder.getLocationOnScreen(iArr);
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = getdebugerrormsg.onWarmupCompleted;
        int i4 = passwordNeo6DFragment.AudioAttributesImplApi21Parcelizer;
        passwordNeo6DFragment.AudioAttributesImplApi21Parcelizer = i4 + 1;
        float f = iArr[0];
        TdsImageView tdsImageView = getdebugerrormsg.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        float fOnExtraCallback = generateInviteUrl.onExtraCallback(tdsImageView);
        float f2 = iArr[1];
        TdsImageView tdsImageView2 = getdebugerrormsg.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i4), f + fOnExtraCallback, f2 + generateInviteUrl.IAuthTabCallback(tdsImageView2));
        passwordNeo6DFragment.AudioAttributesCompatParcelizer();
        int i5 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r6) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = r6[r0]
            o.getDebugErrorMSG r1 = (o.getDebugErrorMSG) r1
            r2 = 1
            r2 = r6[r2]
            viva.republica.toss.password.PasswordNeo6DFragment r2 = (viva.republica.toss.password.PasswordNeo6DFragment) r2
            r3 = 2
            r6 = r6[r3]
            android.view.MotionEvent r6 = (android.view.MotionEvent) r6
            int r6 = r3 % r3
            int r6 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r6 = r6 + 57
            int r4 = r6 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r4
            int r6 = r6 % r3
            java.lang.String r4 = ""
            if (r6 == 0) goto L2d
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.IEngagementSignalsCallbackStub
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            int r6 = r6.getVisibility()
            r5 = 35
            int r5 = r5 / r0
            if (r6 != 0) goto L4a
            goto L38
        L2d:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.IEngagementSignalsCallbackStub
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L4a
        L38:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.IEngagementSignalsCallbackStub
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View r0 = r1.access200
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            im.toss.tds.view.component.atom.text.Typography6 r1 = r1.IEngagementSignalsCallback
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r2.onNavigationEvent(r6, r0, r1)
        L4a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            int r0 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r0 = r0 + 31
            int r1 = r0 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r1
            int r0 = r0 % r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.asBinder(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object ICustomTabsServiceDefault(java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.ICustomTabsServiceDefault(java.lang.Object[]):java.lang.Object");
    }

    private static final void onMinimized(PasswordNeo6DFragment passwordNeo6DFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        passwordNeo6DFragment.MediaBrowserCompatMediaItem();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(o.getDebugErrorMSG r3, final viva.republica.toss.password.PasswordNeo6DFragment r4) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            android.widget.ScrollView r1 = r3.IAuthTabCallbackDefault
            int r1 = r1.getHeight()
            r2 = 29
            int r2 = r2 / 0
            if (r1 <= 0) goto L3a
            goto L23
        L1b:
            android.widget.ScrollView r1 = r3.IAuthTabCallbackDefault
            int r1 = r1.getHeight()
            if (r1 <= 0) goto L3a
        L23:
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L36
            boolean r1 = r4.prefetchWithMultipleUrls
            if (r1 == 0) goto L3a
            r4.MediaBrowserCompatMediaItem()
            goto L44
        L36:
            boolean r3 = r4.prefetchWithMultipleUrls
            r3 = 0
            throw r3
        L3a:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.updateVisuals
            viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda102 r1 = new viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda102
            r1.<init>()
            r3.post(r1)
        L44:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r4 = r4 + 91
            int r1 = r4 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r1
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted(o.getDebugErrorMSG, viva.republica.toss.password.PasswordNeo6DFragment):kotlin.Unit");
    }

    private static final Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            passwordNeo6DFragment.onNavigationEvent(passwordNeo6DFragment.IEngagementSignalsCallback_Parcel.get(i));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        passwordNeo6DFragment.onNavigationEvent(passwordNeo6DFragment.IEngagementSignalsCallback_Parcel.get(i));
        Unit unit2 = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 75;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, List list) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 121;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        if (list != null) {
            int i5 = i2 + 19;
            MediaBrowserCompatMediaItem = i5 % 128;
            if (i5 % 2 == 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i6 = MediaDescriptionCompat + 67;
                    MediaBrowserCompatMediaItem = i6 % 128;
                    int i7 = i6 % 2;
                    TextView textView = passwordNeo6DFragment.IEngagementSignalsCallbackStubProxy.get(((Number) it.next()).intValue());
                    textView.getLocationOnScreen(new int[2]);
                    KeyBlurImageSurfaceView keyBlurImageSurfaceView = getdebugerrormsg.onWarmupCompleted;
                    int i8 = passwordNeo6DFragment.AudioAttributesImplApi21Parcelizer;
                    passwordNeo6DFragment.AudioAttributesImplApi21Parcelizer = i8 + 1;
                    keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i8), r3[0] + generateInviteUrl.onExtraCallback(textView), r3[1] + generateInviteUrl.IAuthTabCallback(textView));
                }
            } else {
                list.iterator();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = MediaBrowserCompatMediaItem + 61;
        MediaDescriptionCompat = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 2 / 0;
        }
        return unit;
    }

    private final getPackageType ResultReceiver1() {
        int i = 2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        Collections.shuffle(this.IEngagementSignalsCallback_Parcel);
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.writeTypedList) {
            int i4 = MediaDescriptionCompat + 15;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 1;
            if (i3 < 0) {
                int i7 = MediaDescriptionCompat + 63;
                MediaBrowserCompatMediaItem = i7 % 128;
                int i8 = i7 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            ((View) obj).setContentDescription(getString(R.string.app_password___e445d6d193, new Object[]{String.valueOf(i6)}));
            i3 = i6;
        }
        Iterator<T> it = this.IEngagementSignalsCallbackStubProxy.iterator();
        while (it.hasNext()) {
            int i9 = MediaBrowserCompatMediaItem + 49;
            MediaDescriptionCompat = i9 % 128;
            int i10 = i9 % 2;
            ((TextView) it.next()).setText(this.IEngagementSignalsCallback_Parcel.get(i2));
            i2++;
        }
        IEngagementSignalsCallback_Parcel().onExtraCallback(this.IEngagementSignalsCallback_Parcel);
        IEngagementSignalsCallback_Parcel().IAuthTabCallback(this.IEngagementSignalsCallbackStubProxy, new Function2() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda11
            public final Object invoke(Object obj2, Object obj3) {
                return PasswordNeo6DFragment.onWarmupCompleted(this.f$0, ((Integer) obj2).intValue(), (View) obj3);
            }
        }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj2) {
                return PasswordNeo6DFragment.onNavigationEvent(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, (List) obj2);
            }
        });
        getPackageType getpackagetypeICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy();
        int i11 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i11 % 128;
        int i12 = i11 % 2;
        return getpackagetypeICustomTabsServiceStubProxy;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 o.getDebugErrorMSG) = (r1v4 o.getDebugErrorMSG), (r1v7 o.getDebugErrorMSG) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit getSmallIconBitmap() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L1a
            o.getDebugErrorMSG r1 = r7.IEngagementSignalsCallbackStub()
            r4 = 74
            int r4 = r4 / r3
            if (r1 == 0) goto L70
            goto L20
        L1a:
            o.getDebugErrorMSG r1 = r7.IEngagementSignalsCallbackStub()
            if (r1 == 0) goto L70
        L20:
            androidx.fragment.app.FragmentActivity r4 = r7.getActivity()
            boolean r5 = r4 instanceof im.toss.base.BaseActivity
            if (r5 == 0) goto L34
            int r5 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r5 = r5 + 51
            int r6 = r5 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r6
            int r5 = r5 % r0
            im.toss.base.BaseActivity r4 = (im.toss.base.BaseActivity) r4
            goto L35
        L34:
            r4 = r2
        L35:
            if (r4 == 0) goto L70
            im.toss.uikit.widget.Toolbar r2 = r1.ICustomTabsServiceStub
            r4.setSupportActionBar(r2)
            o.IPostMessageServiceStubProxy r2 = r4.getSupportActionBar()
            if (r2 == 0) goto L4f
            int r5 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r5 = r5 + 23
            int r6 = r5 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r6
            int r5 = r5 % r0
            r0 = 1
            r2.onNavigationEvent(r0)
        L4f:
            o.IPostMessageServiceStubProxy r0 = r4.getSupportActionBar()
            if (r0 == 0) goto L58
            r0.IAuthTabCallbackStub(r3)
        L58:
            o.IPostMessageServiceStubProxy r0 = r4.getSupportActionBar()
            if (r0 == 0) goto L63
            java.lang.String r2 = ""
            r0.onExtraCallbackWithResult(r2)
        L63:
            im.toss.uikit.widget.Toolbar r0 = r1.ICustomTabsServiceStub
            viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda103 r1 = new viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda103
            r1.<init>()
            r0.setNavigationOnClickListener(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.getSmallIconBitmap():kotlin.Unit");
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) throws Throwable {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[1];
        int i = 2 % 2;
        if (!(baseActivity instanceof PasswordSettingActivity)) {
            boolean z = baseActivity instanceof PasswordActivity;
            if (z) {
                int i2 = MediaDescriptionCompat + 31;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
                if (passwordNeo6DFragment.onActivityLayout() == UTF8Decoder.LOCK_SCREEN) {
                    ((PasswordActivity) baseActivity).ICustomTabsServiceDefault();
                    return null;
                }
            }
            if (z) {
                int i4 = MediaBrowserCompatMediaItem + 95;
                MediaDescriptionCompat = i4 % 128;
                if (i4 % 2 == 0) {
                    PasswordFragment.onWarmupCompleted(passwordNeo6DFragment, (Function0) null, 1, (Object) null);
                    return null;
                }
                PasswordFragment.onWarmupCompleted(passwordNeo6DFragment, (Function0) null, 1, (Object) null);
                return null;
            }
            baseActivity.bg_();
            return null;
        }
        int i5 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        ((PasswordSettingActivity) baseActivity).onGreatestScrollPercentageIncreased();
        return null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onExtraCallback(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Typography6 typography6;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        onExtraCallback(charSequence.toString());
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub != null && (typography6 = getdebugerrormsgIEngagementSignalsCallbackStub.warmup) != null) {
            int i2 = MediaDescriptionCompat + 7;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 != 0) {
                typography6.setText(charSequence2);
                throw null;
            }
            typography6.setText(charSequence2);
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub2 = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub2 != null) {
            int i3 = MediaDescriptionCompat + 93;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            Typography6 typography62 = getdebugerrormsgIEngagementSignalsCallbackStub2.ICustomTabsServiceDefault;
            if (typography62 != null) {
                int i5 = MediaDescriptionCompat + 53;
                MediaBrowserCompatMediaItem = i5 % 128;
                int i6 = i5 % 2;
                typography62.setText(charSequence2);
                if (i6 != 0) {
                    int i7 = 60 / 0;
                }
            }
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Unit unit;
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            passwordNeo6DFragment.RatingCompat1();
            unit = Unit.INSTANCE;
            int i3 = 63 / 0;
        } else {
            passwordNeo6DFragment.RatingCompat1();
            unit = Unit.INSTANCE;
        }
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(final getDebugErrorMSG getdebugerrormsg, final PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        getdebugerrormsg.IAuthTabCallbackDefault.fullScroll(130);
        passwordNeo6DFragment.onVerticalScrollEvent = getdebugerrormsg.IAuthTabCallbackDefault.getHeight() - getdebugerrormsg.updateVisuals.getHeight();
        getdebugerrormsg.IAuthTabCallbackDefault.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda86
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                PasswordNeo6DFragment.IAuthTabCallback(this.f$0, getdebugerrormsg, view, i2, i3, i4, i5);
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 39;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i6 % 128;
        if (i6 % 2 == 0) {
            float f = -i2;
            passwordNeo6DFragment.onVerticalScrollEvent = f;
            getdebugerrormsg.onRelationshipValidationResult.setTranslationY(f);
            int i7 = 14 / 0;
        } else {
            float f2 = -i2;
            passwordNeo6DFragment.onVerticalScrollEvent = f2;
            getdebugerrormsg.onRelationshipValidationResult.setTranslationY(f2);
        }
        int i8 = MediaDescriptionCompat + 111;
        MediaBrowserCompatMediaItem = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit ResultReceiverMyResultReceiver() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            o.getDebugErrorMSG r1 = r6.IEngagementSignalsCallbackStub()
            if (r1 == 0) goto La7
            int r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r2 = r2 + 101
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L21
            boolean r2 = r6.prefetchWithMultipleUrls
            r5 = 40
            int r5 = r5 / 0
            if (r2 == 0) goto L66
            goto L25
        L21:
            boolean r2 = r6.prefetchWithMultipleUrls
            if (r2 == 0) goto L66
        L25:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.onRelationshipValidationResult
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.validateRelationship
            float r3 = r3.getY()
            android.view.View r5 = r1.onUnminimized
            float r5 = r5.getY()
            float r3 = r3 + r5
            android.widget.ScrollView r1 = r1.IAuthTabCallbackDefault
            float r1 = r1.getY()
            float r3 = r3 + r1
            int r1 = r6.IEngagementSignalsCallbackStubProxy()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r3 = r3 - r1
            int r1 = r6.IPostMessageServiceDefault()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r3 = r3 + r1
            int r1 = (int) r3
            int r3 = r2.getPaddingLeft()
            int r4 = r2.getPaddingRight()
            int r5 = r2.getPaddingBottom()
            r2.setPadding(r3, r1, r4, r5)
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            goto La4
        L66:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.onRelationshipValidationResult
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.validateRelationship
            float r2 = r2.getY()
            android.view.View r3 = r1.onUnminimized
            float r3 = r3.getY()
            float r2 = r2 + r3
            android.widget.ScrollView r1 = r1.IAuthTabCallbackDefault
            float r1 = r1.getY()
            float r2 = r2 + r1
            int r1 = r6.IEngagementSignalsCallbackStubProxy()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r2 = r2 - r1
            int r1 = r6.IPostMessageServiceDefault()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r2 = r2 + r1
            int r1 = (int) r2
            o.M_ r2 = o.M_.onExtraCallback
            int r2 = r2.IAuthTabCallbackStub()
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            int r5 = r0.getPaddingBottom()
            int r1 = r1 - r2
            r0.setPadding(r3, r1, r4, r5)
        La4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.ResultReceiverMyResultReceiver():kotlin.Unit");
    }

    private final void onExtraCallback(String str) {
        AnimateText animateText;
        AnimateText animateText2;
        AnimateText animateText3;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(this.postMessage, str)) {
            return;
        }
        int i4 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            this.postMessage = str;
            IEngagementSignalsCallbackStub();
            throw null;
        }
        this.postMessage = str;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub != null && (animateText3 = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy) != null) {
            animateText3.ICustomTabsCallbackStub();
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub2 = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub2 != null && (animateText2 = getdebugerrormsgIEngagementSignalsCallbackStub2.ICustomTabsServiceStubProxy) != null) {
            AnimateText.onWarmupCompleted(animateText2, str, new setAuthenticatorokhttp.onNavigationEvent.onExtraCallback(((Number) areNotificationsEnabled().getFirst()).intValue(), ((Number) areNotificationsEnabled().getSecond()).intValue()), 0, true, (String) null, AnimateText.onNavigationEvent.TOP_CENTER, (Function0) null, (Function0) null, (Function0) null, 468, (Object) null);
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub3 = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub3 != null) {
            int i5 = MediaBrowserCompatMediaItem + 33;
            MediaDescriptionCompat = i5 % 128;
            if (i5 % 2 == 0) {
                AnimateText animateText4 = getdebugerrormsgIEngagementSignalsCallbackStub3.writeTypedList;
                throw null;
            }
            AnimateText animateText5 = getdebugerrormsgIEngagementSignalsCallbackStub3.writeTypedList;
            if (animateText5 != null) {
                animateText5.ICustomTabsCallbackStub();
            }
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub4 = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub4 == null || (animateText = getdebugerrormsgIEngagementSignalsCallbackStub4.writeTypedList) == null) {
            return;
        }
        AnimateText.onWarmupCompleted(animateText, str, new setAuthenticatorokhttp.onNavigationEvent.onExtraCallback(((Number) ITrustedWebActivityServiceDefault().getFirst()).intValue(), ((Number) ITrustedWebActivityServiceDefault().getSecond()).intValue()), 0, true, (String) null, AnimateText.onNavigationEvent.TOP_CENTER, (Function0) null, (Function0) null, (Function0) null, 468, (Object) null);
    }

    private static final String onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullExpressionValue(passwordNeo6DFragment.getString(R.string.help_text), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String string = passwordNeo6DFragment.getString(R.string.help_text);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(Typography6 typography6) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(2 - Color.red(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 551, objArr);
        typography6.setText(((String) objArr[0]).intern());
        Object[] objArr2 = {typography6, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onExtraCallback(this.f$0, (String) obj);
            }
        }, null, false, 6, null};
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        transparentBackground.onWarmupCompleted(iOnWarmupCompleted, objArr2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, iOnWarmupCompleted2);
        typography6.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PasswordNeo6DFragment.onWarmupCompleted(this.f$0, view);
            }
        });
        int i2 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallback(final PasswordNeo6DFragment passwordNeo6DFragment, View view) throws Throwable {
        String loginYN;
        String loginYN2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!passwordNeo6DFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            if (indicatorViewAccess100 != null) {
                loginYN2 = indicatorViewAccess100.getLoginYN();
                int i4 = MediaBrowserCompatMediaItem + 85;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
            } else {
                loginYN2 = null;
            }
            String strValueOf = String.valueOf(loginYN2);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            String strValueOf2 = String.valueOf(indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null);
            String str = passwordNeo6DFragment.postMessage;
            String string = passwordNeo6DFragment.onTransact().getText().toString();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onExtraCallbackWithResult(1721522975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1721522972, new Object[]{asmaplambda6, strValueOf, strValueOf2, str, string, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), passwordNeo6DFragment.onGreatestScrollPercentageIncreased(), passwordNeo6DFragment.onSessionEnded(), Long.valueOf(passwordNeo6DFragment.readTypedObject()), null, 256, null});
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            int i6 = MediaDescriptionCompat + 41;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i8 = MediaBrowserCompatMediaItem + 61;
                MediaDescriptionCompat = i8 % 128;
                int i9 = i8 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
            } else {
                loginYN = null;
            }
            String strValueOf3 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            asmaplambda62.onExtraCallback(strValueOf3, String.valueOf(indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null), passwordNeo6DFragment.postMessage, passwordNeo6DFragment.onTransact().getText().toString(), passwordNeo6DFragment.onGreatestScrollPercentageIncreased(), passwordNeo6DFragment.onSessionEnded());
        }
        Context contextRequireContext = passwordNeo6DFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda101
            public final Object invoke(Object obj2) {
                return PasswordNeo6DFragment.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2);
            }
        });
    }

    private static final Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        String loginYN;
        String logValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        String logValue2 = null;
        if (!passwordNeo6DFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                logValue = indicatorViewAccess1002.getLogValue();
                int i2 = MediaBrowserCompatMediaItem + 49;
                MediaDescriptionCompat = i2 % 128;
                int i3 = i2 % 2;
            } else {
                logValue = null;
            }
            String strValueOf2 = String.valueOf(logValue);
            String strValueOf3 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf4 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string = passwordNeo6DFragment.getString(im.toss.uikit.R.string.uikit_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, MotionEvent.axisFromString("") + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.red(0) + 30, 24887 - (ViewConfiguration.getTouchSlop() >> 8), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, strValueOf2, strValueOf3, strValueOf4, string, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), passwordNeo6DFragment.onGreatestScrollPercentageIncreased(), passwordNeo6DFragment.onSessionEnded(), passwordNeo6DFragment.readTypedObject(), null, 512, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i4 = MediaDescriptionCompat + 105;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
            } else {
                loginYN = null;
            }
            String strValueOf5 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            if (indicatorViewAccess1004 != null) {
                logValue2 = indicatorViewAccess1004.getLogValue();
                int i6 = MediaBrowserCompatMediaItem + 49;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
            }
            String strValueOf6 = String.valueOf(logValue2);
            String strValueOf7 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf8 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string2 = passwordNeo6DFragment.getString(im.toss.uikit.R.string.uikit_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            asmaplambda62.IAuthTabCallback(strValueOf5, strValueOf6, strValueOf7, strValueOf8, string2, passwordNeo6DFragment.onGreatestScrollPercentageIncreased(), passwordNeo6DFragment.onSessionEnded());
        }
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final PasswordNeo6DFragment passwordNeo6DFragment, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(passwordNeo6DFragment.IAuthTabCallbackStubProxy());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(passwordNeo6DFragment.getString(R.string.password_use_biometric_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda47
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -700004254, 700004291, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onGreatestScrollPercentageIncreased() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        if (!(!PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null))) {
            Object[] objArr = new Object[1];
            b(-TextUtils.indexOf((CharSequence) "", '0', 0), (char) (30550 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 167, objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        b(-Process.getGidForName(""), (char) TextUtils.getOffsetBefore("", 0), 167 - ExpandableListView.getPackedPositionType(0L), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i4 = MediaDescriptionCompat + 55;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        return ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r1.access200.isChecked() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r2 = new java.lang.Object[1];
        b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1, (char) (30549 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 168, r2);
        r1 = ((java.lang.String) r2[0]).intern();
        r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem + 39;
        viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        r2 = new java.lang.Object[1];
        b(1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.text.AndroidCharacter.getMirror('0') - '0'), 167 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r2);
        r1 = ((java.lang.String) r2[0]).intern();
        r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem + 13;
        viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
    
        r3 = 0 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = new java.lang.Object[1];
        b(1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 168 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String onSessionEnded() throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r1 = r1 + 111
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1a
            o.getDebugErrorMSG r1 = r9.IEngagementSignalsCallbackStub()
            r4 = 73
            int r4 = r4 / r3
            if (r1 != 0) goto L48
            goto L20
        L1a:
            o.getDebugErrorMSG r1 = r9.IEngagementSignalsCallbackStub()
            if (r1 != 0) goto L48
        L20:
            r0 = 0
            float r1 = android.util.TypedValue.complexToFraction(r3, r0, r0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r1 = 1 - r1
            float r4 = android.util.TypedValue.complexToFraction(r3, r0, r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            char r0 = (char) r0
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r4 = 168 - r4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r1, r0, r4, r2)
            r0 = r2[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            return r0
        L48:
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View r1 = r1.access200
            boolean r1 = r1.isChecked()
            r4 = 48
            if (r1 == 0) goto L7f
            int r1 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r1 = r1 + r2
            java.lang.String r5 = ""
            int r4 = android.text.TextUtils.indexOf(r5, r4, r3, r3)
            int r4 = 30549 - r4
            char r4 = (char) r4
            int r5 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r5 = r5 >> 16
            int r5 = r5 + 168
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r1, r4, r5, r2)
            r1 = r2[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r2 = r2 + 39
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r3
            int r2 = r2 % r0
            return r1
        L7f:
            int r1 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r1 = r1 >> 16
            int r1 = 1 - r1
            char r4 = android.text.AndroidCharacter.getMirror(r4)
            int r4 = r4 + (-48)
            char r4 = (char) r4
            double r5 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r3)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r5 = 167 - r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r1, r4, r5, r2)
            r1 = r2[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r2 = r2 + 13
            int r4 = r2 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r4
            int r2 = r2 % r0
            if (r2 != 0) goto Lb1
            int r3 = r3 / r3
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onSessionEnded():java.lang.String");
    }

    private final void onNavigationEvent(View view, TdsCheckBoxV2View tdsCheckBoxV2View, TextView textView) throws Throwable {
        String loginYN;
        Context context;
        int i;
        int i2;
        String loginYN2;
        int i3 = 2 % 2;
        if (isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            if (indicatorViewAccess100 != null) {
                int i4 = MediaDescriptionCompat + 45;
                MediaBrowserCompatMediaItem = i4 % 128;
                if (i4 % 2 != 0) {
                    indicatorViewAccess100.getLoginYN();
                    throw null;
                }
                loginYN2 = indicatorViewAccess100.getLoginYN();
            } else {
                loginYN2 = null;
            }
            String strValueOf = String.valueOf(loginYN2);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            asMaplambda6.onExtraCallbackWithResult(254313752, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -254313751, new Object[]{asmaplambda6, strValueOf, String.valueOf(indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null), this.postMessage, onTransact().getText().toString(), access100(), onGreatestScrollPercentageIncreased(), onSessionEnded()});
            int i5 = MediaDescriptionCompat + 65;
            MediaBrowserCompatMediaItem = i5 % 128;
            int i6 = i5 % 2;
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i7 = MediaDescriptionCompat + 21;
                MediaBrowserCompatMediaItem = i7 % 128;
                int i8 = i7 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
            } else {
                int i9 = MediaDescriptionCompat + 109;
                MediaBrowserCompatMediaItem = i9 % 128;
                int i10 = i9 % 2;
                loginYN = null;
            }
            String strValueOf2 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            String strValueOf3 = String.valueOf(indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null);
            String str = this.postMessage;
            String string = onTransact().getText().toString();
            String strAccess100 = access100();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - ExpandableListView.getPackedPositionType(0L), 24887 - (ViewConfiguration.getEdgeSlop() >> 16), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (ViewConfiguration.getFadingEdgeLength() >> 16), 24887 - Color.argb(0, 0, 0, 0), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.IAuthTabCallback(asmaplambda62, strValueOf2, strValueOf3, str, string, strAccess100, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), onGreatestScrollPercentageIncreased(), onSessionEnded(), readTypedObject(), (Map) null, 512, (Object) null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
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
        tdsCheckBoxV2View.announceForAccessibility(context.getString(i));
        CharSequence text = textView.getText();
        if (tdsCheckBoxV2View.isChecked()) {
            int i11 = MediaDescriptionCompat + 101;
            MediaBrowserCompatMediaItem = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = R.string.app_password_check_done;
                throw null;
            }
            i2 = R.string.app_password_check_done;
        } else {
            i2 = R.string.app_password_check_not_done;
        }
        String string2 = getString(i2);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        Object[] objArr = new Object[1];
        b(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 337 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(string2);
        view.setContentDescription(sb.toString());
    }

    private final Unit getSmallIconId() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        Object obj = null;
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            int i4 = MediaDescriptionCompat + 71;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        View view = getdebugerrormsgIEngagementSignalsCallbackStub.requestPostMessageChannel;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        Space space = getdebugerrormsgIEngagementSignalsCallbackStub.prefetchWithMultipleUrls;
        Intrinsics.checkNotNullExpressionValue(space, "");
        space.setVisibility(0);
        ConstraintLayout constraintLayout = getdebugerrormsgIEngagementSignalsCallbackStub.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        disableImageViewPreallocationAndroid.IAuthTabCallback(constraintLayout, 0, false, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void asInterface() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r1 = r10.onActivityResized()
            r2 = 1
            if (r1 == 0) goto L24
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r1 = r1 + 93
            int r3 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r3
            int r1 = r1 % r0
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r1 = r10.onActivityResized()
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r3 = viva.republica.toss.password.PasswordFragment.onNavigationEvent.AUTH
            if (r1 != r3) goto L27
        L24:
            r10.onWarmupCompleted(r2)
        L27:
            java.util.List<android.view.View> r1 = r10.writeTypedList
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L31:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6f
            int r5 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r5 = r5 + 105
            int r6 = r5 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r6
            int r5 = r5 % r0
            java.lang.Object r5 = r1.next()
            int r6 = r4 + 1
            if (r4 >= 0) goto L4b
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L4b:
            android.view.View r5 = (android.view.View) r5
            o.AFj1rSDK r4 = o.AFj1rSDK.onExtraCallback
            int r7 = viva.republica.toss.R.string.app_password___e445d6d193
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r3] = r9
            java.lang.String r4 = r4.onExtraCallback(r7, r8)
            r5.setContentDescription(r4)
            int r4 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r4 = r4 + 25
            int r5 = r4 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L6d
            int r4 = r0 % 5
        L6d:
            r4 = r6
            goto L31
        L6f:
            char[] r0 = r10.newSession
            r10.onNavigationEvent(r0)
            android.view.ViewGroup r0 = r10.onExtraCallbackWithResult()
            o.AFj1rSDK r1 = o.AFj1rSDK.onExtraCallback
            int r2 = viva.republica.toss.R.string.app_password___6bb9cb3c1f
            java.lang.String r1 = r1.onExtraCallbackWithResult(r2)
            r0.announceForAccessibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.asInterface():void");
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        onNavigationEvent(this.newSession);
        IEngagementSignalsCallbackDefault().destroy();
        IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1153356570, -1153356546, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2
      0x001f: PHI (r2v5 o.runOnUiThreadDelayed) = (r2v4 o.runOnUiThreadDelayed), (r2v19 o.runOnUiThreadDelayed) binds: [B:8:0x001d, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onMessageChannelReady(java.lang.Object[] r6) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onMessageChannelReady(java.lang.Object[]):java.lang.Object");
    }

    public long getScreenId() {
        Long lIAuthTabCallback;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isEngagementSignalsApiAvailable())) {
            return 1223321L;
        }
        if (onActivityResized() == PasswordFragment.onNavigationEvent.INPUT) {
            return 1222813L;
        }
        if (onActivityResized() == PasswordFragment.onNavigationEvent.CONFIRM) {
            return 1223321L;
        }
        if (onActivityResized() == PasswordFragment.onNavigationEvent.AUTH) {
            return 1498525L;
        }
        PasswordFragment.onExtraCallback onextracallback = this.ITrustedWebActivityCallbackDefault;
        if (onextracallback != null && (lIAuthTabCallback = onextracallback.IAuthTabCallback()) != null) {
            return lIAuthTabCallback.longValue();
        }
        int i4 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.getScreenParams():java.util.Map");
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 111;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final void IAuthTabCallback(char[] cArr, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = IAuthTabCallback(cArr);
        char cSingle = StringsKt.single(str);
        if (i3 != 0) {
            cArr[iIAuthTabCallback] = cSingle;
        } else {
            cArr[iIAuthTabCallback] = cSingle;
            throw null;
        }
    }

    private static /* synthetic */ Object warmup(Object[] objArr) {
        char[] cArr = (char[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 89;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        cArr[iIntValue] = 9679;
        int i5 = i2 + 95;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private final void onNavigationEvent(char[] cArr) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % 128;
        Arrays.fill(cArr, i2 % 2 != 0 ? (char) 23951 : (char) 9679);
    }

    private static final Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.indexOf("", "", 0, 0) + 436, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), passwordNeo6DFragment.onGreatestScrollPercentageIncreased());
        Object[] objArr2 = new Object[1];
        b(17 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.red(0) + 447, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), passwordNeo6DFragment.onSessionEnded());
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[PHI: r4 r10 r11 r12
      0x0068: PHI (r4v9 o.asMaplambda6) = (r4v8 o.asMaplambda6), (r4v15 o.asMaplambda6) binds: [B:17:0x0066, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r10v3 java.util.Set<o.isNumber>) = (r10v2 java.util.Set<o.isNumber>), (r10v13 java.util.Set<o.isNumber>) binds: [B:17:0x0066, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r11v1 o.createPaints) = (r11v0 o.createPaints), (r11v5 o.createPaints) binds: [B:17:0x0066, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r12v1 o.IndicatorView) = (r12v0 o.IndicatorView), (r12v6 o.IndicatorView) binds: [B:17:0x0066, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[PHI: r4 r10 r11
      0x0073: PHI (r4v14 o.asMaplambda6) = (r4v8 o.asMaplambda6), (r4v9 o.asMaplambda6), (r4v15 o.asMaplambda6) binds: [B:17:0x0066, B:19:0x006c, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r10v11 java.util.Set<o.isNumber>) = (r10v2 java.util.Set<o.isNumber>), (r10v3 java.util.Set<o.isNumber>), (r10v13 java.util.Set<o.isNumber>) binds: [B:17:0x0066, B:19:0x006c, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r11v4 o.createPaints) = (r11v0 o.createPaints), (r11v1 o.createPaints), (r11v5 o.createPaints) binds: [B:17:0x0066, B:19:0x006c, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit onNavigationEvent(java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onNavigationEvent(java.lang.String):kotlin.Unit");
    }

    private final Unit MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallbackStub();
            throw null;
        }
        if (IEngagementSignalsCallbackStub() == null) {
            return null;
        }
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(this);
        this.onUnminimized = textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null) : null;
        Unit unit = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaItem + 29;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
        return unit;
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0 ? IAuthTabCallback(this.newSession) == 6 : IAuthTabCallback(this.newSession) == 72) {
            int i3 = MediaBrowserCompatMediaItem + 13;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        if (IAuthTabCallback(this.newSession) != 0) {
            int iIAuthTabCallback = IAuthTabCallback(this.newSession);
            int i5 = iIAuthTabCallback - 1;
            View view = this.writeTypedList.get(i5);
            this.ICustomTabsServiceStub.get(i5).IAuthTabCallbackStub();
            view.setContentDescription(getString(R.string.app_password___e445d6d193, new Object[]{String.valueOf(iIAuthTabCallback)}));
            IAuthTabCallback(new Object[]{this, this.newSession, Integer.valueOf(i5)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1656987448, -1656987392, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        if (IAuthTabCallback(this.newSession) == 0) {
            RatingCompat1();
            getActiveNotifications();
        }
        onExtraCallbackWithResult().announceForAccessibility(getString(R.string.app_password___1b56688847, new Object[]{String.valueOf(IAuthTabCallback(this.newSession))}));
    }

    private final Unit RatingCompat1() {
        int i = 2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        int i2 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimator = this.ITrustedWebActivityCallbackStubProxy;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final float f = this.IconCompatParcelizer;
            if (f != 1.0f) {
                int i4 = MediaDescriptionCompat + 11;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                final float translationY = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy.getTranslationY();
                ValueAnimator valueAnimator2 = this.setEngagementSignalsCallback;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    int i6 = MediaDescriptionCompat + 27;
                    MediaBrowserCompatMediaItem = i6 % 128;
                    int i7 = i6 % 2;
                }
                ValueAnimator valueAnimator3 = this.ITrustedWebActivityCallbackStubProxy;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(IPostMessageService_Parcel());
                valueAnimatorOfFloat.setDuration(IPostMessageService_Parcel().IAuthTabCallback());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) throws Throwable {
                        PasswordNeo6DFragment.onExtraCallbackWithResult(this.f$0, f, translationY, getdebugerrormsgIEngagementSignalsCallbackStub, valueAnimator4);
                    }
                });
                valueAnimatorOfFloat.start();
                this.ITrustedWebActivityCallbackStubProxy = valueAnimatorOfFloat;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + ((1.0f - f) * fFloatValue);
        passwordNeo6DFragment.IconCompatParcelizer = f3;
        float f4 = f2 - (fFloatValue * f2);
        getdebugerrormsg.writeTypedList.setAlpha(passwordNeo6DFragment.IPostMessageServiceStubProxy * f3);
        getdebugerrormsg.ICustomTabsServiceStubProxy.setAlpha((1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy) * passwordNeo6DFragment.IconCompatParcelizer);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 30 - TextUtils.indexOf("", "", 0), 24887 - (ViewConfiguration.getLongPressTimeout() >> 16), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24886 - TextUtils.indexOf((CharSequence) "", '0'), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            if (((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() < 4 || passwordNeo6DFragment.ICustomTabsServiceStub()) {
                getdebugerrormsg.warmup.setAlpha(passwordNeo6DFragment.IconCompatParcelizer);
                int i4 = MediaDescriptionCompat + 51;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
            }
            getdebugerrormsg.ICustomTabsServiceStubProxy.setTranslationY(f4);
            getdebugerrormsg.writeTypedList.setTranslationY(f4);
            getdebugerrormsg.warmup.setTranslationY(f4);
            getdebugerrormsg.onRelationshipValidationResult.setTranslationY(f4 + passwordNeo6DFragment.onVerticalScrollEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onTransact(java.lang.Object[] r11) {
        /*
            r0 = 0
            r11 = r11[r0]
            viva.republica.toss.password.PasswordNeo6DFragment r11 = (viva.republica.toss.password.PasswordNeo6DFragment) r11
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r2 = r2 + 47
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L1f
            o.getDebugErrorMSG r2 = r11.IEngagementSignalsCallbackStub()
            r4 = 71
            int r4 = r4 / r0
            if (r2 == 0) goto Lb7
            r6 = r2
            goto L26
        L1f:
            o.getDebugErrorMSG r0 = r11.IEngagementSignalsCallbackStub()
            if (r0 == 0) goto Lb7
            r6 = r0
        L26:
            int r0 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r0 = r0 + 79
            int r2 = r0 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2
            int r0 = r0 % r1
            if (r0 == 0) goto Lb4
            android.animation.ValueAnimator r0 = r11.setEngagementSignalsCallback
            if (r0 == 0) goto L3d
            boolean r0 = r0.isRunning()
            r2 = 1
            if (r0 != r2) goto L3d
            goto Lb1
        L3d:
            float r5 = r11.IconCompatParcelizer
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb1
            im.toss.tds.view.component.anim.text.AnimateText r0 = r6.writeTypedList
            float r7 = r0.getAlpha()
            im.toss.tds.view.component.atom.text.Typography6 r0 = r6.warmup
            float r8 = r0.getAlpha()
            im.toss.tds.view.component.anim.text.AnimateText r0 = r6.ICustomTabsServiceStubProxy
            float r2 = r0.getTranslationY()
            android.content.res.Resources r0 = r11.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = o.varyMatches.onNavigationEvent(r3, r0)
            float r0 = (float) r0
            float r3 = -r0
            android.animation.ValueAnimator r0 = r11.ITrustedWebActivityCallbackStubProxy
            if (r0 == 0) goto L7f
            int r4 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r4 = r4 + 59
            int r9 = r4 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r9
            int r4 = r4 % r1
            r0.cancel()
        L7f:
            android.animation.ValueAnimator r0 = r11.setEngagementSignalsCallback
            if (r0 == 0) goto L86
            r0.cancel()
        L86:
            float[] r0 = new float[r1]
            r0 = {x00b8: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            o.deprecated_dns r1 = r11.IPostMessageService_Parcel()
            r0.setInterpolator(r1)
            o.deprecated_dns r1 = r11.IPostMessageService_Parcel()
            int r1 = r1.IAuthTabCallback()
            long r9 = (long) r1
            r0.setDuration(r9)
            viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda39 r9 = new viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda39
            r1 = r9
            r4 = r11
            r1.<init>()
            r0.addUpdateListener(r9)
            r0.start()
            r11.setEngagementSignalsCallback = r0
        Lb1:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lb4:
            android.animation.ValueAnimator r11 = r11.setEngagementSignalsCallback
            throw r3
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onTransact(java.lang.Object[]):java.lang.Object");
    }

    private static final void onNavigationEvent(float f, float f2, PasswordNeo6DFragment passwordNeo6DFragment, float f3, getDebugErrorMSG getdebugerrormsg, float f4, float f5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f6 = f + ((f2 - f) * fFloatValue);
        float f7 = f3 - (fFloatValue * f3);
        passwordNeo6DFragment.IconCompatParcelizer = f7;
        getdebugerrormsg.ICustomTabsServiceStubProxy.setAlpha(f3 * f7);
        getdebugerrormsg.writeTypedList.setAlpha(f4 * passwordNeo6DFragment.IconCompatParcelizer);
        getdebugerrormsg.warmup.setAlpha(f5 * passwordNeo6DFragment.IconCompatParcelizer);
        getdebugerrormsg.ICustomTabsServiceStubProxy.setTranslationY(f6);
        getdebugerrormsg.writeTypedList.setTranslationY(f6);
        getdebugerrormsg.warmup.setTranslationY(f6);
        getdebugerrormsg.onRelationshipValidationResult.setTranslationY(f6 + passwordNeo6DFragment.onVerticalScrollEvent);
        int i4 = MediaDescriptionCompat + 117;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    private final Unit getActiveNotifications() {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        if (getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getAlpha() != 0.0f && ((valueAnimator = this.requestPostMessageChannel) == null || !valueAnimator.isRunning())) {
            final float scaleX = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getScaleX();
            final float alpha = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getAlpha();
            ValueAnimator valueAnimator2 = this.cancelNotification;
            if (valueAnimator2 != null) {
                int i4 = MediaDescriptionCompat + 93;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.requestPostMessageChannel;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(onVerticalScrollEvent());
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda91
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    PasswordNeo6DFragment.onExtraCallback(scaleX, getdebugerrormsgIEngagementSignalsCallbackStub, alpha, valueAnimator4);
                }
            });
            valueAnimatorOfFloat.start();
            this.requestPostMessageChannel = valueAnimatorOfFloat;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[1];
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue3 = ((Float) animatedValue).floatValue();
        float f = fFloatValue + ((0.8f - fFloatValue) * fFloatValue3);
        getdebugerrormsg.asBinder.setAlpha(fFloatValue2 - (fFloatValue3 * fFloatValue2));
        getdebugerrormsg.asBinder.setScaleX(f);
        getdebugerrormsg.asBinder.setScaleY(f);
        int i4 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final Unit MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallbackStub();
            obj.hashCode();
            throw null;
        }
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        if (getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getAlpha() != 1.0f) {
            int i3 = MediaDescriptionCompat + 103;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            ValueAnimator valueAnimator = this.cancelNotification;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                final float scaleX = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getScaleX();
                final float alpha = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.getAlpha();
                TdsImageView tdsImageView = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(0);
                ValueAnimator valueAnimator2 = this.requestPostMessageChannel;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.cancelNotification;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    int i5 = MediaDescriptionCompat + 95;
                    MediaBrowserCompatMediaItem = i5 % 128;
                    int i6 = i5 % 2;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(onVerticalScrollEvent());
                valueAnimatorOfFloat.setDuration(400L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda40
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        float f = scaleX;
                        PasswordNeo6DFragment.IAuthTabCallback(new Object[]{Float.valueOf(f), getdebugerrormsgIEngagementSignalsCallbackStub, Float.valueOf(alpha), valueAnimator4}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1214951974, 1214952009, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                });
                valueAnimatorOfFloat.start();
                this.cancelNotification = valueAnimatorOfFloat;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(float f, getDebugErrorMSG getdebugerrormsg, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + ((1.0f - f) * fFloatValue);
        getdebugerrormsg.asBinder.setAlpha(f2 + (fFloatValue * (1.0f - f2)));
        getdebugerrormsg.asBinder.setScaleX(f3);
        getdebugerrormsg.asBinder.setScaleY(f3);
        int i4 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onNavigationEvent(@NotNull Function0<Unit> function0) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        super.onNavigationEvent(function0);
        onExtraCallbackWithResult(function0);
        int i4 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNavigationEvent(@org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull java.lang.CharSequence r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onNavigationEvent(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    private static final Unit onUnminimized(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        passwordNeo6DFragment.RatingCompat1();
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 103;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static /* synthetic */ Boolean onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            function0 = new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda85
                public final Object invoke() {
                    return PasswordNeo6DFragment.prefetchWithMultipleUrls();
                }
            };
        }
        Boolean bool = (Boolean) IAuthTabCallback(new Object[]{passwordNeo6DFragment, function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -2141371965, 2141371972, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    private static final void onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[2];
        getdebugerrormsg.ICustomTabsServiceDefault.getLocationOnScreen(iArr);
        Typography6 typography6 = getdebugerrormsg.warmup;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(typography6, iArr[1]);
        function0.invoke();
        int i4 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final Unit AudioAttributesImplApi21Parcelizer() {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        ConstraintLayout constraintLayout = getdebugerrormsgIEngagementSignalsCallbackStub.IEngagementSignalsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        boolean z2 = true;
        if (constraintLayout.getVisibility() == 0 && getdebugerrormsgIEngagementSignalsCallbackStub.access200.isChecked()) {
            int i4 = MediaBrowserCompatMediaItem + 7;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (mayLaunchUrl()) {
            this.onSessionEnded = z;
        } else {
            if (!this.onGreatestScrollPercentageIncreased && !z) {
                z2 = false;
            }
            this.onGreatestScrollPercentageIncreased = z2;
        }
        onExtraCallback(new GraniteBrownfieldModule_closeView(this.newSession));
        PasswordFragment.onWarmupCompleted onwarmupcompletedExtraCallback = extraCallback();
        if (onwarmupcompletedExtraCallback == null) {
            return null;
        }
        onwarmupcompletedExtraCallback.onWarmupCompleted(IEngagementSignalsCallbackDefault(), this.onGreatestScrollPercentageIncreased, onGreatestScrollPercentageIncreased(), onSessionEnded(), this.onSessionEnded);
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        if (IAuthTabCallback(this.newSession) > 0) {
            int i3 = MediaBrowserCompatMediaItem;
            int i4 = i3 + 73;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            if (i < 4) {
                int i6 = i3 + 39;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        if (IAuthTabCallback(this.newSession) == 0) {
            int i8 = MediaDescriptionCompat + 105;
            MediaBrowserCompatMediaItem = i8 % 128;
            int i9 = i8 % 2;
            RatingCompat1();
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Object[] objArr = new Object[1];
        b(15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (64092 - View.getDefaultSize(0, 0)), 729 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        bundle.putString(((String) objArr[0]).intern(), this.ITrustedWebActivityCallbackStub);
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        int i4 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void write() {
        int i = 2 % 2;
        final setHasUserConsent sethasuserconsent = new setHasUserConsent(ITrustedWebActivityCallback_Parcel(), ITrustedWebActivityCallbackStubProxy());
        final setHasUserConsent sethasuserconsent2 = new setHasUserConsent(ITrustedWebActivityCallbackStubProxy(), ITrustedWebActivityCallback_Parcel());
        ValueAnimator valueAnimator = this.IPostMessageService;
        if (valueAnimator != null) {
            int i2 = MediaBrowserCompatMediaItem + 65;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 == 0) {
                valueAnimator.cancel();
                throw null;
            }
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(4800L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda84
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, sethasuserconsent, sethasuserconsent2, valueAnimator2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2146194340, -2146194327, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        });
        valueAnimatorOfFloat.start();
        this.IPostMessageService = valueAnimatorOfFloat;
        int i3 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    private static final void onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, setHasUserConsent sethasuserconsent, setHasUserConsent sethasuserconsent2, ValueAnimator valueAnimator) {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i2 = 0;
        for (Object obj : passwordNeo6DFragment.IEngagementSignalsCallbackStubProxy) {
            int i3 = MediaDescriptionCompat + 33;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) obj;
            float fMax = valueAnimator.getCurrentPlayTime() == 0 ? Math.max(fFloatValue - ((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment, Integer.valueOf(i2)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -792757684, 792757732, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue(), 0.0f) : fFloatValue - ((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment, Integer.valueOf(i2)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -792757684, 792757732, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue();
            if (fMax < 0.0f) {
                int i5 = MediaBrowserCompatMediaItem + 113;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                fMax += 1.0f;
            }
            if (fMax <= 0.5f) {
                textView.setTextColor(sethasuserconsent.IAuthTabCallback(fMax * 2.0f).intValue());
            } else {
                textView.setTextColor(sethasuserconsent2.IAuthTabCallback((fMax - 0.5f) * 2.0f).intValue());
            }
            i2++;
        }
        float fMax2 = valueAnimator.getCurrentPlayTime() == 0 ? Math.max(fFloatValue - ((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment, 10}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -792757684, 792757732, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue(), 0.0f) : fFloatValue - ((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment, 10}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -792757684, 792757732, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue();
        if (fMax2 < 0.0f) {
            fMax2 += 1.0f;
        }
        if (fMax2 <= 0.5f) {
            getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = passwordNeo6DFragment.IEngagementSignalsCallbackStub();
            if (getdebugerrormsgIEngagementSignalsCallbackStub == null || (tdsImageView = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder) == null) {
                return;
            }
            tdsImageView.setImageTintList(ColorStateList.valueOf(sethasuserconsent.IAuthTabCallback(fMax2 * 2.0f).intValue()));
            return;
        }
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub2 = passwordNeo6DFragment.IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub2 != null) {
            int i7 = MediaDescriptionCompat + 25;
            MediaBrowserCompatMediaItem = i7 % 128;
            int i8 = i7 % 2;
            TdsImageView tdsImageView2 = getdebugerrormsgIEngagementSignalsCallbackStub2.asBinder;
            if (i8 != 0) {
                throw null;
            }
            if (tdsImageView2 != null) {
                tdsImageView2.setImageTintList(ColorStateList.valueOf(sethasuserconsent2.IAuthTabCallback((fMax2 - 0.5f) * 2.0f).intValue()));
            }
        }
    }

    private final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ValueAnimator valueAnimator = this.getActiveNotifications;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setDuration(2000L);
            final float f = 0.1f;
            final float f2 = 1.0f;
            final float f3 = 0.25f;
            final float f4 = 0.75f;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda48
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), valueAnimator2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1543087043, 1543087088, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                }
            });
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.start();
            this.getActiveNotifications = valueAnimatorOfFloat;
            int i3 = MediaDescriptionCompat + 69;
            MediaBrowserCompatMediaItem = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    private static final void IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float fFloatValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        int i2 = 0;
        for (Object obj : passwordNeo6DFragment.ICustomTabsServiceStub) {
            int i3 = MediaBrowserCompatMediaItem + 63;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AuthPinDotView authPinDotView = (AuthPinDotView) obj;
            if (valueAnimator.getCurrentPlayTime() == 0) {
                int i5 = MediaBrowserCompatMediaItem + 103;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "");
                fFloatValue = Math.max(((Float) animatedValue).floatValue() - (i2 * f), 0.0f);
                int i7 = MediaDescriptionCompat + 85;
                MediaBrowserCompatMediaItem = i7 % 128;
                int i8 = i7 % 2;
            } else {
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "");
                fFloatValue = ((Float) animatedValue2).floatValue() - (i2 * f);
            }
            if (fFloatValue < 0.0f) {
                int i9 = MediaBrowserCompatMediaItem + 49;
                MediaDescriptionCompat = i9 % 128;
                int i10 = i9 % 2;
                fFloatValue += 1.0f;
            }
            authPinDotView.setSmallOpacity(fFloatValue < 0.5f ? f2 - (passwordNeo6DFragment.onVerticalScrollEvent().getInterpolation(fFloatValue * 2.0f) * f3) : (passwordNeo6DFragment.onVerticalScrollEvent().getInterpolation((fFloatValue - 0.5f) * 2.0f) * f3) + f4);
            i2++;
        }
        int i11 = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i11 % 128;
        int i12 = i11 % 2;
    }

    private final Unit AudioAttributesImplBaseParcelizer() throws Throwable {
        ValueAnimator valueAnimatorIAuthTabCallback;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub;
        int i = 2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub2 = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub2 == null) {
            return null;
        }
        if (!this.IEngagementSignalsCallback) {
            int i2 = MediaDescriptionCompat + 15;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            ScrollView scrollView = getdebugerrormsgIEngagementSignalsCallbackStub2.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            processDeepLink.onWarmupCompleted(scrollView, getVersionCode.STRONG);
            ParcelableVolumeInfo();
            onExtraCallback(getdebugerrormsgIEngagementSignalsCallbackStub2);
            AnimateText animateText = getdebugerrormsgIEngagementSignalsCallbackStub2.ICustomTabsServiceStubProxy;
            Intrinsics.checkNotNullExpressionValue(animateText, "");
            Typography6 typography6 = getdebugerrormsgIEngagementSignalsCallbackStub2.warmup;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            Object[] objArr = new Object[1];
            b(5 - View.resolveSize(0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), View.MeasureSpec.getSize(0) + 390, objArr);
            this.receiveFile = IAuthTabCallback(100L, ((String) objArr[0]).intern(), animateText, typography6);
            ConstraintLayout constraintLayout = getdebugerrormsgIEngagementSignalsCallbackStub2.onRelationshipValidationResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Object[] objArr2 = new Object[1];
            b(((Process.getThreadPriority(0) + 20) >> 6) + 13, (char) (27847 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), View.MeasureSpec.getMode(0) + 524, objArr2);
            this.requestPostMessageChannelWithExtras = IAuthTabCallback(140L, ((String) objArr2[0]).intern(), constraintLayout);
            ConstraintLayout constraintLayout2 = getdebugerrormsgIEngagementSignalsCallbackStub2.IEngagementSignalsCallbackStub;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            if (constraintLayout2.getVisibility() == 0) {
                ConstraintLayout constraintLayout3 = getdebugerrormsgIEngagementSignalsCallbackStub2.IEngagementSignalsCallbackStub;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                Object[] objArr3 = new Object[1];
                b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) KeyEvent.normalizeMetaState(0), 536 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                valueAnimatorIAuthTabCallback = IAuthTabCallback(180L, ((String) objArr3[0]).intern(), constraintLayout3);
            } else {
                valueAnimatorIAuthTabCallback = null;
            }
            this.warmup = valueAnimatorIAuthTabCallback;
            if (!ICustomTabsCallbackStubProxy() && (getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub()) != null) {
                int i4 = MediaDescriptionCompat + 125;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                GradientButtonView gradientButtonView = getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback;
                if (gradientButtonView != null) {
                    gradientButtonView.IAuthTabCallbackStub();
                }
            }
            runOnUiThreadDelayed runonuithreaddelayed = this.areNotificationsEnabled;
            if (runonuithreaddelayed != null) {
                int i6 = MediaBrowserCompatMediaItem + 5;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                runonuithreaddelayed.onNavigationEvent();
            }
            this.areNotificationsEnabled = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(onNavigationEvent(getdebugerrormsgIEngagementSignalsCallbackStub2), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda114
                public final Object invoke() {
                    return PasswordNeo6DFragment.IAuthTabCallback(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub2);
                }
            }, 1, (Object) null), false, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg) {
        ConstraintLayout constraintLayout;
        boolean z;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            passwordNeo6DFragment.ICustomTabsServiceStubProxy();
            passwordNeo6DFragment.write();
            passwordNeo6DFragment.IconCompatParcelizer();
            passwordNeo6DFragment.RatingCompat();
            constraintLayout = getdebugerrormsg.onNavigationEvent;
            z = false;
        } else {
            passwordNeo6DFragment.ICustomTabsServiceStubProxy();
            passwordNeo6DFragment.write();
            passwordNeo6DFragment.IconCompatParcelizer();
            passwordNeo6DFragment.RatingCompat();
            constraintLayout = getdebugerrormsg.onNavigationEvent;
            z = true;
        }
        constraintLayout.setClipChildren(z);
        getdebugerrormsg.IAuthTabCallbackDefault.setClipChildren(z);
        getdebugerrormsg.updateVisuals.setClipChildren(z);
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final getDebugErrorMSG getdebugerrormsg) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(IPostMessageService_Parcel());
        valueAnimatorOfFloat.setDuration(IPostMessageService_Parcel().IAuthTabCallback());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo6DFragment.IAuthTabCallback(getdebugerrormsg, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.prefetch = valueAnimatorOfFloat;
        int i2 = MediaDescriptionCompat + 47;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 85;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        getdebugerrormsg.onTransact.setAlpha(fFloatValue);
        getdebugerrormsg.onTransact.setScaleX(fFloatValue);
        getdebugerrormsg.onTransact.setScaleY(fFloatValue);
        getdebugerrormsg.IAuthTabCallbackStub.setAlpha(fFloatValue);
        getdebugerrormsg.IAuthTabCallbackStub.setScaleX(fFloatValue);
        getdebugerrormsg.IAuthTabCallbackStub.setScaleY(fFloatValue);
        getdebugerrormsg.ICustomTabsServiceStub.setAlpha(fFloatValue);
        int i4 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStubProxy();
            obj.hashCode();
            throw null;
        }
        if (!ICustomTabsCallbackStubProxy()) {
            int i3 = MediaBrowserCompatMediaItem + 37;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
        } else {
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(this);
            this.ICustomTabsServiceDefault = textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null) : null;
            int i5 = MediaDescriptionCompat + 101;
            MediaBrowserCompatMediaItem = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    private final getPackageType ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
            if (getdebugerrormsgIEngagementSignalsCallbackStub != null) {
                int i3 = MediaBrowserCompatMediaItem + 17;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(this);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
                    return maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(getdebugerrormsgIEngagementSignalsCallbackStub, this, null), 3, (Object) null);
                }
            }
            return null;
        }
        IEngagementSignalsCallbackStub();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 o.getDebugErrorMSG) = (r1v4 o.getDebugErrorMSG), (r1v9 o.getDebugErrorMSG) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.getPackageType onWarmupCompleted(kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            o.getDebugErrorMSG r1 = r9.IEngagementSignalsCallbackStub()
            r3 = 84
            int r3 = r3 / 0
            if (r1 == 0) goto L43
            goto L20
        L1a:
            o.getDebugErrorMSG r1 = r9.IEngagementSignalsCallbackStub()
            if (r1 == 0) goto L43
        L20:
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.onRenderReady.onWarmupCompleted(r9)
            if (r3 == 0) goto L43
            r4 = 0
            r5 = 0
            viva.republica.toss.password.PasswordNeo6DFragment$asInterface r6 = new viva.republica.toss.password.PasswordNeo6DFragment$asInterface
            r6.<init>(r1, r10, r2)
            r7 = 3
            r8 = 0
            o.getPackageType r10 = o.maybeUpdateAnimatable.onNavigationEvent(r3, r4, r5, r6, r7, r8)
            int r1 = viva.republica.toss.password.PasswordNeo6DFragment.MediaDescriptionCompat
            int r1 = r1 + 71
            int r3 = r1 % 128
            viva.republica.toss.password.PasswordNeo6DFragment.MediaBrowserCompatMediaItem = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L3f
            return r10
        L3f:
            r2.hashCode()
            throw r2
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onWarmupCompleted(kotlin.jvm.functions.Function0):o.getPackageType");
    }

    private final runOnUiThreadDelayed onNavigationEvent(getDebugErrorMSG getdebugerrormsg) {
        int i = 2 % 2;
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(40);
        deprecated_dns deprecated_dnsVarIPostMessageService_Parcel = IPostMessageService_Parcel();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        View view = this.IPostMessageServiceStub.get(0);
        Float fValueOf = Float.valueOf(0.0f);
        AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageService() / 2.0f), fValueOf, (Function1) null, 4, (Object) null);
        Float fValueOf2 = Float.valueOf(1.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = isMuted.onExtraCallback(interfaceDescriptor, fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.access000(this.f$0, (attachAppLovinSdk) obj);
            }
        });
        Float fValueOf3 = Float.valueOf(1.5f);
        AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(appLovinSdkSettingsOnExtraCallback, fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda29
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.ICustomTabsCallbackStubProxy(this.f$0, (attachAppLovinSdk) obj);
            }
        });
        Float fValueOf4 = Float.valueOf(90.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(appLovinSdkSettingsOnTransact, fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.extraCallbackWithResult(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view2 = (View) CollectionsKt.first(this.IEngagementSignalsCallbackStubProxy);
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf5 = Float.valueOf(40.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
        Float fValueOf6 = Float.valueOf(10.0f);
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onWarmupCompleted(appLovinSdkSettingsOnNavigationEvent, fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.IAuthTabCallbackDefault((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TextView textView = this.IEngagementSignalsCallbackStubProxy.get(2);
        AppLovinSdkSettings appLovinSdkSettings2 = new AppLovinSdkSettings();
        Float fValueOf7 = Float.valueOf(-40.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent2 = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings2, fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
        Float fValueOf8 = Float.valueOf(-10.0f);
        isFireOS isfireosOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{textView, isMuted.onWarmupCompleted(appLovinSdkSettingsOnNavigationEvent2, fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.IAuthTabCallback((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted2 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStub.get(1), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageService() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda34
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, (attachAppLovinSdk) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -210376099, 210376141, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda35
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onActivityLayout(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda36
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, (attachAppLovinSdk) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1605362115, -1605362085, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IEngagementSignalsCallbackStubProxy.get(3), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda37
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{(attachAppLovinSdk) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -980310846, 980310895, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IEngagementSignalsCallbackStubProxy.get(5), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda38
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onWarmupCompleted((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted3 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStub.get(2), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageService() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.IAuthTabCallbackStubProxy(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onPostMessage(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.writeTypedObject(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IEngagementSignalsCallbackStubProxy.get(6), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onNavigationEvent((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IEngagementSignalsCallbackStubProxy.get(8), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onExtraCallbackWithResult((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted4 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStub.get(3), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageService() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onUnminimized(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.readTypedObject(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.access100(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        GradientButtonView gradientButtonView = getdebugerrormsg.setEngagementSignalsCallback;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt.listOf(new isFireOS[]{isfireosOnWarmupCompleted, isfireosOnWarmupCompleted2, isfireosOnWarmupCompleted3, isfireosOnWarmupCompleted4, (Rally) RallysKt.onWarmupCompleted(new Object[]{gradientButtonView, isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageService() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda27
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.asBinder(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.getInterfaceDescriptor(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onMessageChannelReady(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarIPostMessageService_Parcel, (Integer) null, (Boolean) null, 180, 1000L, true, 441, (Object) null);
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i;
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 9;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 28646;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit isEngagementSignalsApiAvailable(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit requestPostMessageChannel(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 83;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(100);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit validateRelationship(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
        attachapplovinsdk.IAuthTabCallback(600);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object requestPostMessageChannel(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsServiceStub(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaItem + 121;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(100);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 29;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    private static final Unit prefetch(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 26521;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return unit2;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 46;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 38;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    private static final Unit newSession(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 73;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
        attachapplovinsdk.IAuthTabCallback(600);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit postMessage(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return unit2;
    }

    private static final Unit requestPostMessageChannelWithExtras(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
            unit = Unit.INSTANCE;
            int i3 = 53 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
            unit = Unit.INSTANCE;
        }
        int i4 = MediaDescriptionCompat + 79;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit receiveFile(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 112;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.IPostMessageServiceStub());
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.ITrustedWebActivityCallbackDefault());
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit setEngagementSignalsCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    private final ValueAnimator IAuthTabCallback(long j, final String str, final View... viewArr) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = IPostMessageService_Parcel().IAuthTabCallback();
        final Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        float f = jIAuthTabCallback;
        final float fIAuthTabCallback = f / IPostMessageService_Parcel().IAuthTabCallback();
        final float f2 = f / 600.0f;
        final float fIAuthTabCallback2 = f / ((deprecated_dns) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallback();
        final float fIAuthTabCallback3 = f / ITrustedWebActivityCallbackDefault().IAuthTabCallback();
        final float fIPostMessageService = IPostMessageService() / 2.0f;
        int length = viewArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = MediaDescriptionCompat + 109;
            MediaBrowserCompatMediaItem = i5 % 128;
            if (i5 % 2 != 0) {
                View view = viewArr[i4];
                view.setAlpha(2.0f);
                view.setTranslationY(fIPostMessageService);
                i4 += 105;
            } else {
                View view2 = viewArr[i4];
                view2.setAlpha(0.0f);
                view2.setTranslationY(fIPostMessageService);
                i4++;
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float f3 = 90.0f;
        final float f4 = 1.5f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo6DFragment passwordNeo6DFragment = this.f$0;
                float f5 = fIAuthTabCallback;
                Interpolator interpolator2 = interpolator;
                float f6 = f2;
                float f7 = fIAuthTabCallback2;
                float f8 = fIAuthTabCallback3;
                View[] viewArr2 = viewArr;
                float f9 = fIPostMessageService;
                PasswordNeo6DFragment.IAuthTabCallback(new Object[]{passwordNeo6DFragment, Float.valueOf(f5), interpolator2, Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), viewArr2, Float.valueOf(f9), str, Float.valueOf(f3), Float.valueOf(f4), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -2039976688, 2039976741, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        });
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(jIAuthTabCallback);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        int i;
        int i2 = 0;
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
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
        ValueAnimator valueAnimator = (ValueAnimator) objArr[11];
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue8 = ((Float) animatedValue).floatValue();
        float interpolation = passwordNeo6DFragment.IPostMessageService_Parcel().getInterpolation(Math.min(1.0f, fFloatValue * fFloatValue8));
        float interpolation2 = interpolator.getInterpolation(Math.min(1.0f, fFloatValue2 * fFloatValue8));
        float interpolation3 = ((deprecated_dns) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).getInterpolation(Math.min(1.0f, fFloatValue3 * fFloatValue8));
        float interpolation4 = passwordNeo6DFragment.ITrustedWebActivityCallbackDefault().getInterpolation(Math.min(1.0f, fFloatValue8 * fFloatValue4));
        int length = viewArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = MediaBrowserCompatMediaItem + 125;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % i3;
            View view = viewArr[i5];
            if (view.getVisibility() != 0) {
                view.setVisibility(i2);
                int i8 = MediaDescriptionCompat + 119;
                MediaBrowserCompatMediaItem = i8 % 128;
                int i9 = i8 % i3;
            }
            float f = 0.0f;
            int i10 = length;
            View[] viewArr2 = viewArr;
            b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27846), ExpandableListView.getPackedPositionType(0L) + 524, new Object[1]);
            i2 = 0;
            if (!(!Intrinsics.areEqual(str, ((String) r9[0]).intern()))) {
                float f2 = passwordNeo6DFragment.onVerticalScrollEvent;
                int i11 = MediaBrowserCompatMediaItem + 35;
                MediaDescriptionCompat = i11 % 128;
                i = 2;
                int i12 = i11 % 2;
                f = f2;
            } else {
                i = 2;
            }
            view.setTranslationY((fFloatValue5 - (fFloatValue5 * interpolation)) + f);
            view.setAlpha(interpolation2);
            view.setRotationX(fFloatValue6 - (fFloatValue6 * interpolation3));
            float f3 = fFloatValue7 - (0.5f * interpolation4);
            view.setScaleX(f3);
            view.setScaleY(f3);
            i5++;
            i3 = i;
            length = i10;
            viewArr = viewArr2;
        }
        return null;
    }

    private static final void onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            int i3 = 2 / 0;
            if (!onRenderReady.IAuthTabCallback(passwordNeo6DFragment)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            if (!onRenderReady.IAuthTabCallback(passwordNeo6DFragment)) {
                return;
            }
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        getdebugerrormsg.postMessage.onWarmupCompleted(AuthPinBackgroundView.onNavigationEvent.SPREAD, ((Float) animatedValue).floatValue());
        int i4 = MediaDescriptionCompat + 49;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, float f, Interpolator interpolator, getDebugErrorMSG getdebugerrormsg, Interpolator interpolator2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (onRenderReady.IAuthTabCallback(passwordNeo6DFragment)) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            if (fFloatValue > f) {
                Object[] objArr = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.SPREAD, Float.valueOf(1.0f - interpolator2.getInterpolation((fFloatValue - f) / (1.0f - f)))};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                return;
            }
            int i4 = MediaBrowserCompatMediaItem + 81;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.SPREAD, Float.valueOf(interpolator.getInterpolation(fFloatValue / f))};
            AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
    }

    private final Unit ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            int i4 = MediaBrowserCompatMediaItem + 51;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        final deprecated_dns deprecated_dnsVar = new deprecated_dns(200.0d, 40.0d);
        long jMax = Math.max(deprecated_dnsVar.IAuthTabCallback(), 600);
        float f = jMax;
        final float fIAuthTabCallback = f / deprecated_dnsVar.IAuthTabCallback();
        final float f2 = f / 600.0f;
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        final float fOnNavigationEvent = varyMatches.onNavigationEvent(10, r1) / IPostMessageServiceStubProxy();
        float fIPostMessageService = (IPostMessageService() * 0.14999998f) / 2.0f;
        float fIPostMessageServiceStubProxy = (IPostMessageServiceStubProxy() * 0.14999998f) / 2.0f;
        ValueAnimator valueAnimator = this.onRelationshipValidationResult;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator.setFrameDelay(16L);
        final float f3 = 0.85f;
        final float f4 = 0.4f;
        final float f5 = fIPostMessageService - fIPostMessageServiceStubProxy;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda99
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                deprecated_dns deprecated_dnsVar2 = deprecated_dnsVar;
                float f6 = fIAuthTabCallback;
                PasswordNeo6DFragment passwordNeo6DFragment = this;
                float f7 = f2;
                PasswordNeo6DFragment.IAuthTabCallback(new Object[]{deprecated_dnsVar2, Float.valueOf(f6), passwordNeo6DFragment, Float.valueOf(f7), getdebugerrormsgIEngagementSignalsCallbackStub, Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(fOnNavigationEvent), valueAnimator2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -216228926, 216228926, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        });
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        this.onRelationshipValidationResult = valueAnimatorOfFloat;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        deprecated_dns deprecated_dnsVar = (deprecated_dns) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[2];
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[4];
        float fFloatValue3 = ((Number) objArr[5]).floatValue();
        float fFloatValue4 = ((Number) objArr[6]).floatValue();
        float fFloatValue5 = ((Number) objArr[7]).floatValue();
        float fFloatValue6 = ((Number) objArr[8]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[9];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue7 = ((Float) animatedValue).floatValue();
        float interpolation = deprecated_dnsVar.getInterpolation(Math.min(1.0f, fFloatValue * fFloatValue7));
        float interpolation2 = passwordNeo6DFragment.onVerticalScrollEvent().getInterpolation(Math.min(1.0f, fFloatValue2 * fFloatValue7));
        Object[] objArr2 = {getdebugerrormsg.postMessage, Float.valueOf(interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        getdebugerrormsg.postMessage.IAuthTabCallback(passwordNeo6DFragment.newSessionWithExtras * interpolation2);
        AuthPinBackgroundView authPinBackgroundView = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.FRAME;
        Object[] objArr3 = {authPinBackgroundView, onnavigationevent, Float.valueOf(((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1507537050, -1507537041, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue() * interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr4 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        float f = ((1.0f - fFloatValue3) * (1.0f - interpolation)) + fFloatValue3;
        AuthPinBackgroundView authPinBackgroundView2 = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.APP;
        Object[] objArr5 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((1.0f - fFloatValue4) * (1.0f - interpolation2)) + fFloatValue4)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr5, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        getdebugerrormsg.postMessage.onWarmupCompleted(onnavigationevent2, f);
        getdebugerrormsg.postMessage.onExtraCallbackWithResult(onnavigationevent, fFloatValue5);
        float f2 = f + fFloatValue6;
        getdebugerrormsg.postMessage.onWarmupCompleted(onnavigationevent, f2);
        getdebugerrormsg.postMessage.onWarmupCompleted(onnavigationevent, f2);
        if (getdebugerrormsg.postMessage.onNavigationEvent() != null) {
            getdebugerrormsg.postMessage.onWarmupCompleted(interpolation2);
            int i4 = MediaDescriptionCompat + 85;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return null;
        }
        getdebugerrormsg.postMessage.onWarmupCompleted(fFloatValue7);
        int i6 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final Unit PlaybackStateCompatCustomAction() throws Throwable {
        int i = 2 % 2;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        Object obj = null;
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        if (this.IPostMessageServiceStubProxy != 1.0f) {
            int i2 = MediaDescriptionCompat + 87;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            ValueAnimator valueAnimator = this.IPostMessageService_Parcel;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                if (RemoteActionCompatParcelizer()) {
                    AuthPinDotRotationView authPinDotRotationView = getdebugerrormsgIEngagementSignalsCallbackStub.prefetch;
                    Object[] objArr = new Object[1];
                    b(View.MeasureSpec.getMode(0) + 9, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 642 - TextUtils.indexOf("", ""), objArr);
                    authPinDotRotationView.IAuthTabCallback(Color.parseColor(((String) objArr[0]).intern()));
                    getPackageType getpackagetype = this.ICustomTabsCallback_Parcel;
                    if (getpackagetype != null) {
                        int i3 = MediaBrowserCompatMediaItem + 101;
                        MediaDescriptionCompat = i3 % 128;
                        int i4 = i3 % 2;
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                        int i5 = MediaBrowserCompatMediaItem + 71;
                        MediaDescriptionCompat = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                getPackageType getpackagetype2 = this.AudioAttributesImplApi26Parcelizer;
                if (getpackagetype2 != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
                }
                float f = this.IPostMessageServiceStubProxy;
                runOnUiThreadDelayed runonuithreaddelayed = this.isEngagementSignalsApiAvailable;
                if (runonuithreaddelayed != null) {
                    int i7 = MediaBrowserCompatMediaItem + 17;
                    MediaDescriptionCompat = i7 % 128;
                    if (i7 % 2 == 0) {
                        runonuithreaddelayed.onNavigationEvent();
                        obj.hashCode();
                        throw null;
                    }
                    runonuithreaddelayed.onNavigationEvent();
                }
                ValueAnimator valueAnimator2 = this.IPostMessageService_Parcel;
                if (valueAnimator2 != null) {
                    int i8 = MediaDescriptionCompat + 25;
                    MediaBrowserCompatMediaItem = i8 % 128;
                    int i9 = i8 % 2;
                    valueAnimator2.cancel();
                    int i10 = MediaDescriptionCompat + 71;
                    MediaBrowserCompatMediaItem = i10 % 128;
                    int i11 = i10 % 2;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(onVerticalScrollEvent());
                valueAnimatorOfFloat.setDuration(400L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda41
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, valueAnimator3}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -339751552, 339751581, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                });
                Intrinsics.checkNotNull(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addListener(new getInterfaceDescriptor());
                valueAnimatorOfFloat.addListener(new access000(getdebugerrormsgIEngagementSignalsCallbackStub));
                valueAnimatorOfFloat.start();
                this.IPostMessageService_Parcel = valueAnimatorOfFloat;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            passwordNeo6DFragment.IPostMessageServiceStubProxy = ((Float) animatedValue).floatValue();
            passwordNeo6DFragment.ResultReceiverMyRunnable();
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            passwordNeo6DFragment.IPostMessageServiceStubProxy = ((Float) animatedValue2).floatValue();
            passwordNeo6DFragment.ResultReceiverMyRunnable();
        }
        int i4 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final Unit ResultReceiverMyRunnable() {
        int i = 2 % 2;
        getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        getdebugerrormsgIEngagementSignalsCallbackStub.warmup.setTextColor(ITrustedWebActivityService().IAuthTabCallback(this.IPostMessageServiceStubProxy).intValue());
        getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy.setAlpha((1.0f - this.IPostMessageServiceStubProxy) * this.IconCompatParcelizer);
        getdebugerrormsgIEngagementSignalsCallbackStub.writeTypedList.setAlpha(this.IPostMessageServiceStubProxy * this.IconCompatParcelizer);
        if (RemoteActionCompatParcelizer()) {
            int i2 = MediaDescriptionCompat + 25;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {getdebugerrormsgIEngagementSignalsCallbackStub.postMessage, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(Math.max(this.IPostMessageServiceStubProxy, this.extraCommand * 2.0f))};
            AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            float f = this.IPostMessageServiceStubProxy;
            float f2 = this.mayLaunchUrl;
            if (f < f2) {
                Object[] objArr2 = {getdebugerrormsgIEngagementSignalsCallbackStub.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(1.0f)};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                int i4 = MediaBrowserCompatMediaItem + 39;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr3 = {getdebugerrormsgIEngagementSignalsCallbackStub.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - f) * (1.0f / (1.0f - f2)))};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        } else {
            getdebugerrormsgIEngagementSignalsCallbackStub.postMessage.onExtraCallback(AuthPinBackgroundView.onNavigationEvent.BACKGROUND, 1.0f - this.IPostMessageServiceStubProxy);
        }
        if (this.IEngagementSignalsCallbackDefault) {
            getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.setAlpha(1.0f - this.IPostMessageServiceStubProxy);
            getdebugerrormsgIEngagementSignalsCallbackStub.onExtraCallbackWithResult.setAlpha(this.IPostMessageServiceStubProxy);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = MediaDescriptionCompat + 51;
            int i4 = i3 % 128;
            MediaBrowserCompatMediaItem = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 99;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, Boolean.valueOf(z)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -81211990, 81212029, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        final PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = passwordNeo6DFragment.IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        int i4 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0 ? passwordNeo6DFragment.IPostMessageServiceStubProxy != 0.0f : passwordNeo6DFragment.IPostMessageServiceStubProxy != 0.0f) {
            runOnUiThreadDelayed runonuithreaddelayed = passwordNeo6DFragment.isEngagementSignalsApiAvailable;
            if (runonuithreaddelayed == null || !runonuithreaddelayed.postMessage()) {
                getPackageType getpackagetype = passwordNeo6DFragment.AudioAttributesImplApi26Parcelizer;
                if (getpackagetype != null) {
                    int i5 = MediaDescriptionCompat + 63;
                    MediaBrowserCompatMediaItem = i5 % 128;
                    if (i5 % 2 != 0) {
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
                    } else {
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    }
                }
                if (!(!passwordNeo6DFragment.RemoteActionCompatParcelizer())) {
                    TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo6DFragment);
                    passwordNeo6DFragment.ICustomTabsCallback_Parcel = textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(getdebugerrormsgIEngagementSignalsCallbackStub, passwordNeo6DFragment, null), 3, (Object) null) : null;
                }
                float f = passwordNeo6DFragment.IPostMessageServiceStubProxy;
                ValueAnimator valueAnimator = passwordNeo6DFragment.IPostMessageService_Parcel;
                if (valueAnimator != null) {
                    int i6 = MediaDescriptionCompat + 45;
                    MediaBrowserCompatMediaItem = i6 % 128;
                    if (i6 % 2 != 0) {
                        valueAnimator.cancel();
                        throw null;
                    }
                    valueAnimator.cancel();
                }
                runOnUiThreadDelayed runonuithreaddelayed2 = passwordNeo6DFragment.isEngagementSignalsApiAvailable;
                if (runonuithreaddelayed2 != null) {
                    runonuithreaddelayed2.onNavigationEvent();
                }
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                Interpolator interpolatorOnVerticalScrollEvent = passwordNeo6DFragment.onVerticalScrollEvent();
                AnimateText animateText = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy;
                Intrinsics.checkNotNullExpressionValue(animateText, "");
                Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{animateText, isMuted.onNavigationEvent(new AppLovinSdkSettings(), f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onNavigationEvent(getdebugerrormsgIEngagementSignalsCallbackStub, passwordNeo6DFragment, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onMinimized(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                AnimateText animateText2 = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy;
                Intrinsics.checkNotNullExpressionValue(animateText2, "");
                Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{animateText2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onWarmupCompleted(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.asInterface(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                AnimateText animateText3 = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStubProxy;
                Intrinsics.checkNotNullExpressionValue(animateText3, "");
                passwordNeo6DFragment.isEngagementSignalsApiAvailable = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{animateText3, isMuted.onNavigationEvent(new AppLovinSdkSettings(), f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onExtraCallback(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj) {
                        return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, (attachAppLovinSdk) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -998862059, 998862078, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, interpolatorOnVerticalScrollEvent, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda10
                    public final Object invoke() {
                        return PasswordNeo6DFragment.onNavigationEvent(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, zBooleanValue);
                    }
                }, 1, (Object) null), false, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[0];
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.warmup.setTextColor(passwordNeo6DFragment.ITrustedWebActivityService().IAuthTabCallback(fFloatValue).intValue());
        getdebugerrormsg.ICustomTabsServiceStubProxy.setAlpha((1.0f - fFloatValue) * passwordNeo6DFragment.IconCompatParcelizer);
        getdebugerrormsg.writeTypedList.setAlpha(fFloatValue * passwordNeo6DFragment.IconCompatParcelizer);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 109;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return unit;
    }

    private static final Unit IEngagementSignalsCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(600);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 79;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        passwordNeo6DFragment.IPostMessageServiceStubProxy = f;
        if (passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
            int i2 = MediaDescriptionCompat + 39;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(Math.max(1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy, passwordNeo6DFragment.extraCommand))};
            AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            float f2 = passwordNeo6DFragment.IPostMessageServiceStubProxy;
            float f3 = passwordNeo6DFragment.ICustomTabsService;
            if (f2 > f3) {
                int i4 = MediaBrowserCompatMediaItem + 101;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr2 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(1.0f)};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            } else {
                Object[] objArr3 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(f2 * (1.0f / f3))};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        } else {
            getdebugerrormsg.postMessage.onExtraCallback(AuthPinBackgroundView.onNavigationEvent.BACKGROUND, 1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy);
        }
        if (passwordNeo6DFragment.IEngagementSignalsCallbackDefault) {
            int i6 = MediaDescriptionCompat + 95;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 != 0) {
                getdebugerrormsg.onMessageChannelReady.setAlpha(passwordNeo6DFragment.IPostMessageServiceStubProxy + 0.0f);
            } else {
                getdebugerrormsg.onMessageChannelReady.setAlpha(1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy);
            }
            getdebugerrormsg.onExtraCallbackWithResult.setAlpha(passwordNeo6DFragment.IPostMessageServiceStubProxy);
            int i7 = MediaBrowserCompatMediaItem + 57;
            MediaDescriptionCompat = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onGreatestScrollPercentageIncreased(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(1200);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        if (passwordNeo6DFragment.IEngagementSignalsCallbackDefault) {
            int i2 = MediaBrowserCompatMediaItem + 109;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            getdebugerrormsg.onMessageChannelReady.setAlpha(1.0f - f);
            getdebugerrormsg.onExtraCallbackWithResult.setAlpha(f);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallbackDefault(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            attachapplovinsdk.IAuthTabCallback(29612);
            i = 19920;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            attachapplovinsdk.IAuthTabCallback(1200);
            i = 200;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 119;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, boolean z) {
        int i = 2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo6DFragment);
        Object obj = null;
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(z, passwordNeo6DFragment, null), 3, (Object) null);
        }
        if (!passwordNeo6DFragment.RemoteActionCompatParcelizer()) {
            int i2 = MediaDescriptionCompat + 79;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 != 0) {
                getdebugerrormsg.setEngagementSignalsCallback.setState(GradientButtonView.onExtraCallback.NORMAL);
                obj.hashCode();
                throw null;
            }
            getdebugerrormsg.setEngagementSignalsCallback.setState(GradientButtonView.onExtraCallback.NORMAL);
            int i3 = MediaDescriptionCompat + 49;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private final Unit onExtraCallbackWithResult(final Function0<Unit> function0) {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        if (!this.IEngagementSignalsCallback) {
            int i2 = MediaBrowserCompatMediaItem + 107;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            this.IEngagementSignalsCallback = true;
            View view = getdebugerrormsgIEngagementSignalsCallbackStub.onSessionEnded;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            ConstraintLayout constraintLayout = getdebugerrormsgIEngagementSignalsCallbackStub.IEngagementSignalsCallbackStub;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            GradientButtonView gradientButtonView = getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback;
            Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
            gradientButtonView.setVisibility(8);
            ConstraintLayout constraintLayout2 = getdebugerrormsgIEngagementSignalsCallbackStub.validateRelationship;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            Toolbar toolbar = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStub;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            toolbar.setVisibility(8);
            if (readTypedObject() == 82) {
                getdebugerrormsgIEngagementSignalsCallbackStub.onWarmupCompleted.onWarmupCompleted();
                IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1153356570, -1153356546, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                runOnUiThreadDelayed runonuithreaddelayed = this.newAuthTabSession;
                if (runonuithreaddelayed != null) {
                    runonuithreaddelayed.onNavigationEvent();
                    int i4 = MediaDescriptionCompat + 125;
                    MediaBrowserCompatMediaItem = i4 % 128;
                    int i5 = i4 % 2;
                }
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                ConstraintLayout constraintLayout3 = getdebugerrormsgIEngagementSignalsCallbackStub.onRelationshipValidationResult;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(1.0f), fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda71
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onActivityResized(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                TdsImageView tdsImageView = getdebugerrormsgIEngagementSignalsCallbackStub.onTransact;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                this.newAuthTabSession = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda75
                    public final Object invoke(Object obj) {
                        return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{getdebugerrormsgIEngagementSignalsCallbackStub, Float.valueOf(((Float) obj).floatValue())}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1998625301, -1998625261, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda76
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onExtraCallback(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda77
                    public final Object invoke() {
                        return PasswordNeo6DFragment.IAuthTabCallback(getdebugerrormsgIEngagementSignalsCallbackStub, function0);
                    }
                }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda78
                    public final Object invoke() {
                        return PasswordNeo6DFragment.onExtraCallbackWithResult(this.f$0);
                    }
                }, 1, (Object) null), false, 1, (Object) null);
            } else {
                float fIPostMessageService = (IPostMessageService() * 0.14999998f) / 2.0f;
                float fIPostMessageServiceStubProxy = (IPostMessageServiceStubProxy() * 0.14999998f) / 2.0f;
                getdebugerrormsgIEngagementSignalsCallbackStub.onWarmupCompleted.onWarmupCompleted();
                IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1153356570, -1153356546, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                runOnUiThreadDelayed runonuithreaddelayed2 = this.newAuthTabSession;
                if (runonuithreaddelayed2 != null) {
                    runonuithreaddelayed2.onNavigationEvent();
                }
                pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
                deprecated_dns deprecated_dnsVar = (deprecated_dns) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                AuthPinDotRotationView authPinDotRotationView = getdebugerrormsgIEngagementSignalsCallbackStub.prefetch;
                Intrinsics.checkNotNullExpressionValue(authPinDotRotationView, "");
                final float f = 0.4f;
                final float f2 = fIPostMessageService - fIPostMessageServiceStubProxy;
                Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{authPinDotRotationView, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda79
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onExtraCallback(getdebugerrormsgIEngagementSignalsCallbackStub, this, f, f2, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda80
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.IAuthTabCallbackStub(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                ConstraintLayout constraintLayout4 = getdebugerrormsgIEngagementSignalsCallbackStub.onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout4, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.7f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda81
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.IAuthTabCallback(this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda82
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.IAuthTabCallback(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                TdsImageView tdsImageView2 = getdebugerrormsgIEngagementSignalsCallbackStub.onTransact;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda83
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.onExtraCallback(getdebugerrormsgIEngagementSignalsCallbackStub, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda72
                    public final Object invoke(Object obj) {
                        return PasswordNeo6DFragment.extraCallback(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                GradientButtonView gradientButtonView2 = getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback;
                Intrinsics.checkNotNullExpressionValue(gradientButtonView2, "");
                Rally rally5 = (Rally) RallysKt.onWarmupCompleted(new Object[]{gradientButtonView2, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(onVerticalScrollEvent()), 200}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                ConstraintLayout constraintLayout5 = getdebugerrormsgIEngagementSignalsCallbackStub.onRelationshipValidationResult;
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
                this.newAuthTabSession = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt.listOf(new Rally[]{rally2, rally3, rally4, rally5, (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout5, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(onVerticalScrollEvent()), 400}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVar, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda73
                    public final Object invoke() {
                        return PasswordNeo6DFragment.onWarmupCompleted(getdebugerrormsgIEngagementSignalsCallbackStub);
                    }
                }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda74
                    public final Object invoke() {
                        return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1352183713, -1352183682, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                }, 1, (Object) null), false, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallback(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 10797;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.IAuthTabCallbackDefault.setAlpha(f);
        getdebugerrormsg.asBinder.setAlpha(f);
        getdebugerrormsg.onTransact.setAlpha(f);
        getdebugerrormsg.IAuthTabCallbackStub.setAlpha(f);
        getdebugerrormsg.IEngagementSignalsCallbackStub.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access200(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getDebugErrorMSG getdebugerrormsg, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            ConstraintLayout constraintLayout = getdebugerrormsg.onMessageChannelReady;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(109);
            AuthPinBackgroundView authPinBackgroundView = getdebugerrormsg.postMessage;
            Intrinsics.checkNotNullExpressionValue(authPinBackgroundView, "");
            authPinBackgroundView.setVisibility(101);
        } else {
            ConstraintLayout constraintLayout2 = getdebugerrormsg.onMessageChannelReady;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            AuthPinBackgroundView authPinBackgroundView2 = getdebugerrormsg.postMessage;
            Intrinsics.checkNotNullExpressionValue(authPinBackgroundView2, "");
            authPinBackgroundView2.setVisibility(8);
        }
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i3 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback_Parcel(PasswordNeo6DFragment passwordNeo6DFragment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = passwordNeo6DFragment.getActivity();
        if (activity != null) {
            int i4 = MediaBrowserCompatMediaItem + 9;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 == 0) {
                activity.finish();
                int i5 = 39 / 0;
            } else {
                activity.finish();
            }
            int i6 = MediaDescriptionCompat + 73;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.postMessage.IAuthTabCallback(passwordNeo6DFragment.newSessionWithExtras * f3);
        AuthPinBackgroundView authPinBackgroundView = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.APP;
        authPinBackgroundView.onWarmupCompleted(onnavigationevent, 1.0f - (0.15f * f3));
        Object[] objArr = {getdebugerrormsg.postMessage, onnavigationevent, Float.valueOf(1.0f - (f * f3))};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr2 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(passwordNeo6DFragment.IPostMessageServiceStubProxy * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr3 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy) * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        AuthPinBackgroundView authPinBackgroundView2 = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.FRAME;
        Object[] objArr4 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1507537050, -1507537041, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue() * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        getdebugerrormsg.postMessage.onExtraCallbackWithResult(onnavigationevent2, f2 * f3);
        Object[] objArr5 = {getdebugerrormsg.postMessage, Float.valueOf(f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr5, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr6 = {getdebugerrormsg.prefetch, Float.valueOf(f3)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr6);
        getdebugerrormsg.postMessage.onWarmupCompleted(f3);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onSessionEnded(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object validateRelationship(Object[] objArr) {
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        getDebugErrorMSG getdebugerrormsg = (getDebugErrorMSG) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = passwordNeo6DFragment.IEngagementSignalsCallbackStubProxy.iterator();
        while (!(!it.hasNext())) {
            int i4 = MediaDescriptionCompat + 103;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 != 0) {
                TextView textView = (TextView) it.next();
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextView textView2 = (TextView) it.next();
            textView2.setScaleX(fFloatValue);
            textView2.setScaleY(fFloatValue);
        }
        getdebugerrormsg.setEngagementSignalsCallback.setAlpha(fFloatValue);
        getdebugerrormsg.setEngagementSignalsCallback.setScaleX(fFloatValue);
        getdebugerrormsg.setEngagementSignalsCallback.setScaleY(fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i5 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onVerticalScrollEvent(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.IAuthTabCallbackDefault.setAlpha(f);
        getdebugerrormsg.asBinder.setAlpha(f);
        getdebugerrormsg.onTransact.setAlpha(f);
        getdebugerrormsg.IAuthTabCallbackStub.setAlpha(f);
        getdebugerrormsg.warmup.setAlpha(f);
        getdebugerrormsg.IEngagementSignalsCallbackStub.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 51;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 65;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 50;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 101;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void IAuthTabCallback(@Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null || this.IEngagementSignalsCallback) {
            return;
        }
        this.IEngagementSignalsCallback = true;
        View view = getdebugerrormsgIEngagementSignalsCallbackStub.onSessionEnded;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        ConstraintLayout constraintLayout = getdebugerrormsgIEngagementSignalsCallbackStub.IEngagementSignalsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        GradientButtonView gradientButtonView = getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        gradientButtonView.setVisibility(8);
        Toolbar toolbar = getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStub;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        toolbar.setVisibility(8);
        float fIPostMessageService = (IPostMessageService() * 0.14999998f) / 2.0f;
        float fIPostMessageServiceStubProxy = (IPostMessageServiceStubProxy() * 0.14999998f) / 2.0f;
        getdebugerrormsgIEngagementSignalsCallbackStub.onWarmupCompleted.onWarmupCompleted();
        getdebugerrormsgIEngagementSignalsCallbackStub.validateRelationship.setAlpha(0.0f);
        IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1153356570, -1153356546, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        runOnUiThreadDelayed runonuithreaddelayed = this.newAuthTabSession;
        if (runonuithreaddelayed != null) {
            int i2 = MediaDescriptionCompat + 91;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        AuthPinDotRotationView authPinDotRotationView = getdebugerrormsgIEngagementSignalsCallbackStub.prefetch;
        Intrinsics.checkNotNullExpressionValue(authPinDotRotationView, "");
        final float f = 0.4f;
        final float f2 = fIPostMessageService - fIPostMessageServiceStubProxy;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{authPinDotRotationView, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda92
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onExtraCallbackWithResult(getdebugerrormsgIEngagementSignalsCallbackStub, this, f, f2, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda93
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, (attachAppLovinSdk) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1911428495, -1911428443, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout2 = getdebugerrormsgIEngagementSignalsCallbackStub.onRelationshipValidationResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda94
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onNavigationEvent(getdebugerrormsgIEngagementSignalsCallbackStub, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda95
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onTransact(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout3 = getdebugerrormsgIEngagementSignalsCallbackStub.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        this.newAuthTabSession = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.7f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda96
            public final Object invoke(Object obj) {
                return (Unit) PasswordNeo6DFragment.IAuthTabCallback(new Object[]{this.f$0, getdebugerrormsgIEngagementSignalsCallbackStub, Float.valueOf(((Float) obj).floatValue())}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 11446497, -11446494, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            }
        }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda97
            public final Object invoke(Object obj) {
                return PasswordNeo6DFragment.onRelationshipValidationResult(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda98
            public final Object invoke() {
                return PasswordNeo6DFragment.IAuthTabCallback(this.f$0, function0);
            }
        }, 1, (Object) null), false, 1, (Object) null);
        int i4 = MediaDescriptionCompat + 77;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.postMessage.IAuthTabCallback(passwordNeo6DFragment.newSessionWithExtras * f3);
        AuthPinBackgroundView authPinBackgroundView = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.APP;
        authPinBackgroundView.onWarmupCompleted(onnavigationevent, 1.0f - (0.15f * f3));
        Object[] objArr = {getdebugerrormsg.postMessage, onnavigationevent, Float.valueOf(1.0f - (f * f3))};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr2 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(passwordNeo6DFragment.IPostMessageServiceStubProxy * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr3 = {getdebugerrormsg.postMessage, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - passwordNeo6DFragment.IPostMessageServiceStubProxy) * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        AuthPinBackgroundView authPinBackgroundView2 = getdebugerrormsg.postMessage;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.FRAME;
        Object[] objArr4 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((Float) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1507537050, -1507537041, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue() * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        getdebugerrormsg.postMessage.onExtraCallbackWithResult(onnavigationevent2, f2 * f3);
        Object[] objArr5 = {getdebugerrormsg.postMessage, Float.valueOf(f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr5, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr6 = {getdebugerrormsg.prefetch, Float.valueOf(f3)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr6);
        getdebugerrormsg.postMessage.onWarmupCompleted(f3);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit extraCommand(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 83;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 7298;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 300;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 83;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getdebugerrormsg.warmup.setAlpha(f);
        getdebugerrormsg.onNavigationEvent.setAlpha(f);
        getdebugerrormsg.onRelationshipValidationResult.setAlpha(f);
        getdebugerrormsg.onTransact.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        int i;
        PasswordNeo6DFragment passwordNeo6DFragment = (PasswordNeo6DFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 443;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        int i = 2 % 2;
        Iterator<T> it = passwordNeo6DFragment.IEngagementSignalsCallbackStubProxy.iterator();
        while (!(!it.hasNext())) {
            int i2 = MediaBrowserCompatMediaItem + 57;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 == 0) {
                TextView textView = (TextView) it.next();
                textView.setScaleX(f);
                textView.setScaleY(f);
                int i3 = 73 / 0;
            } else {
                TextView textView2 = (TextView) it.next();
                textView2.setScaleX(f);
                textView2.setScaleY(f);
            }
        }
        getdebugerrormsg.setEngagementSignalsCallback.setAlpha(f);
        getdebugerrormsg.setEngagementSignalsCallback.setScaleX(f);
        getdebugerrormsg.setEngagementSignalsCallback.setScaleY(f);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit mayLaunchUrl(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 87;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 4715;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 300;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 107;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, Function0 function0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 5;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onRenderReady.onWarmupCompleted(passwordNeo6DFragment);
            obj.hashCode();
            throw null;
        }
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo6DFragment);
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(function0, passwordNeo6DFragment, null), 3, (Object) null);
            int i3 = MediaDescriptionCompat + 1;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsServiceDefault(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 115;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 14816;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
            i = 300;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNavigationEvent(@org.jetbrains.annotations.Nullable viva.republica.toss.password.PasswordFragment.onNavigationEvent r36, @org.jetbrains.annotations.Nullable o.UTF8Decoder r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onNavigationEvent(viva.republica.toss.password.PasswordFragment$onNavigationEvent, o.UTF8Decoder):void");
    }

    public static final class IAuthTabCallbackStub implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        final /* synthetic */ getDebugErrorMSG onWarmupCompleted;

        IAuthTabCallbackStub(getDebugErrorMSG getdebugerrormsg) {
            this.onWarmupCompleted = getdebugerrormsg;
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
            this.onWarmupCompleted.IAuthTabCallbackDefault.setTranslationX(f);
            this.onWarmupCompleted.onMessageChannelReady.setTranslationX(f);
            this.onWarmupCompleted.onRelationshipValidationResult.setTranslationX(f);
            this.onWarmupCompleted.postMessage.requestRender();
        }
    }

    private static final Unit ICustomTabsServiceStubProxy(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit writeTypedList(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo6DFragment.onVerticalScrollEvent());
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable viva.republica.toss.password.PasswordFragment.onNavigationEvent r40, @org.jetbrains.annotations.Nullable o.UTF8Decoder r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo6DFragment.onExtraCallbackWithResult(viva.republica.toss.password.PasswordFragment$onNavigationEvent, o.UTF8Decoder):void");
    }

    private final String IAuthTabCallback(PasswordFragment.onNavigationEvent onnavigationevent, UTF8Decoder uTF8Decoder) {
        int i;
        Integer numValueOf;
        int i2 = 2 % 2;
        if (uTF8Decoder != null) {
            String string = getString(PasswordFragment.Companion.onExtraCallbackWithResult(uTF8Decoder));
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = MediaDescriptionCompat + 61;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        if (onnavigationevent == null) {
            int i5 = MediaBrowserCompatMediaItem + 69;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        } else {
            i = onNavigationEvent.onExtraCallback[onnavigationevent.ordinal()];
            int i7 = MediaDescriptionCompat + 51;
            MediaBrowserCompatMediaItem = i7 % 128;
            int i8 = i7 % 2;
        }
        if (i != 1) {
            numValueOf = i != 2 ? null : Integer.valueOf(viva.republica.toss.R.string.app_password_guide_neo_confirm_new_password);
        } else {
            numValueOf = Integer.valueOf(viva.republica.toss.R.string.app_password_guide_neo_input_new_password);
            int i9 = MediaDescriptionCompat + 25;
            MediaBrowserCompatMediaItem = i9 % 128;
            int i10 = i9 % 2;
        }
        String string2 = numValueOf != null ? getString(numValueOf.intValue()) : null;
        return string2 == null ? "" : string2;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    @Override // viva.republica.toss.password.Hilt_PasswordFragment
    public void onAttach(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = context instanceof PasswordFragment.onExtraCallback;
        Object parentFragment = context;
        if (!z) {
            int i2 = MediaDescriptionCompat + 107;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            Fragment parentFragment2 = getParentFragment();
            if (parentFragment2 != null) {
                int i4 = MediaDescriptionCompat + 99;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                if (!(parentFragment2 instanceof PasswordFragment.onExtraCallback)) {
                    Object[] objArr = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0') + 57, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 673 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
            } else {
                int i6 = MediaDescriptionCompat + 45;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
            }
            parentFragment = getParentFragment();
        }
        this.ITrustedWebActivityCallbackDefault = (PasswordFragment.onExtraCallback) parentFragment;
    }

    private final Boolean MediaBrowserCompatMediaItem() throws Throwable {
        int i = 2 % 2;
        final getDebugErrorMSG getdebugerrormsgIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        if (getdebugerrormsgIEngagementSignalsCallbackStub == null) {
            return null;
        }
        GradientButtonView gradientButtonView = getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        if (gradientButtonView.getVisibility() == 0) {
            int i2 = MediaBrowserCompatMediaItem + 51;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.setY(getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback.getY() - getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getHeight());
        } else {
            getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.setY(((getdebugerrormsgIEngagementSignalsCallbackStub.getRoot().getBottom() - getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getHeight()) - getdebugerrormsgIEngagementSignalsCallbackStub.onNavigationEvent.getPaddingBottom()) - getdebugerrormsgIEngagementSignalsCallbackStub.receiveFile.getHeight());
        }
        TdsImageView tdsImageView = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        ViewGroup.LayoutParams layoutParams = tdsImageView.getLayoutParams();
        if (layoutParams == null) {
            Object[] objArr = new Object[1];
            b(72 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 264, objArr);
            throw new NullPointerException(((String) objArr[0]).intern());
        }
        layoutParams.width = getdebugerrormsgIEngagementSignalsCallbackStub.asInterface.getWidth();
        layoutParams.height = getdebugerrormsgIEngagementSignalsCallbackStub.asInterface.getHeight();
        tdsImageView.setLayoutParams(layoutParams);
        TdsImageView tdsImageView2 = getdebugerrormsgIEngagementSignalsCallbackStub.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsImageView2, (int) (getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getX() + getdebugerrormsgIEngagementSignalsCallbackStub.asInterface.getX() + getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getPaddingLeft()), ((int) (getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getY() + getdebugerrormsgIEngagementSignalsCallbackStub.newAuthTabSession.getY())) + (!this.prefetchWithMultipleUrls ? -M_.onExtraCallback.IAuthTabCallbackStub() : 0), 0, 0);
        getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.setPivotX(getdebugerrormsgIEngagementSignalsCallbackStub.asInterface.getWidth() / 2.0f);
        getdebugerrormsgIEngagementSignalsCallbackStub.asBinder.setPivotY(getdebugerrormsgIEngagementSignalsCallbackStub.asInterface.getHeight() / 2.0f);
        getdebugerrormsgIEngagementSignalsCallbackStub.onExtraCallbackWithResult.setY(getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getY());
        getdebugerrormsgIEngagementSignalsCallbackStub.IAuthTabCallbackDefault.setY(getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getY() - getdebugerrormsgIEngagementSignalsCallbackStub.IAuthTabCallbackDefault.getHeight());
        if (!this.prefetchWithMultipleUrls) {
            float height = (getdebugerrormsgIEngagementSignalsCallbackStub.ICustomTabsServiceStub.getHeight() + getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getY()) / 2.0f;
            float y = getdebugerrormsgIEngagementSignalsCallbackStub.IAuthTabCallbackDefault.getY();
            float y2 = getdebugerrormsgIEngagementSignalsCallbackStub.validateRelationship.getY();
            ScrollView scrollView = getdebugerrormsgIEngagementSignalsCallbackStub.IAuthTabCallbackDefault;
            scrollView.setY(scrollView.getY() + (((height - y) - (getdebugerrormsgIEngagementSignalsCallbackStub.validateRelationship.getHeight() / 2.0f)) - y2));
        }
        getdebugerrormsgIEngagementSignalsCallbackStub.postMessage.setSpreadHeight(getdebugerrormsgIEngagementSignalsCallbackStub.onMessageChannelReady.getHeight() + M_.onExtraCallback.onWarmupCompleted());
        getdebugerrormsgIEngagementSignalsCallbackStub.readTypedObject.getLocationOnScreen(new int[2]);
        getdebugerrormsgIEngagementSignalsCallbackStub.prefetch.onNavigationEvent(r4[1]);
        ResultReceiverMyResultReceiver();
        Iterator<T> it = this.writeTypedList.iterator();
        int i4 = 0;
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AuthPinDotView authPinDotView = this.ICustomTabsServiceStub.get(i4);
            authPinDotView.setX((((View) next).getX() - (IEngagementSignalsCallbackStubProxy() / 2.0f)) + (IPostMessageServiceDefault() / 2.0f));
            processDeepLink.onWarmupCompleted(authPinDotView, getVersionCode.STRONG);
            i4++;
        }
        if (RemoteActionCompatParcelizer()) {
            int i5 = MediaDescriptionCompat + 119;
            MediaBrowserCompatMediaItem = i5 % 128;
            int i6 = i5 % 2;
            AuthPinDotRotationView authPinDotRotationView = getdebugerrormsgIEngagementSignalsCallbackStub.prefetch;
            Object[] objArr2 = new Object[1];
            b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 553, objArr2);
            authPinDotRotationView.IAuthTabCallback(Color.parseColor(((String) objArr2[0]).intern()));
        }
        onNavigationEvent(this, (Function0) null, 1, (Object) null);
        AudioAttributesImplBaseParcelizer();
        int i7 = 0;
        for (Object obj : this.ICustomTabsServiceStub) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((AuthPinDotView) obj).onExtraCallback((i7 * 100) + 100);
            i7++;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 30 - Gravity.getAbsoluteGravity(0, 0), 24887 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - Drawable.resolveOpacity(0, 0), 24888 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            if (((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue() >= 2) {
                getdebugerrormsgIEngagementSignalsCallbackStub.setEngagementSignalsCallback.IAuthTabCallbackStub();
            }
            if (ICustomTabsCallback_Parcel()) {
                int i8 = MediaDescriptionCompat + 83;
                MediaBrowserCompatMediaItem = i8 % 128;
                int i9 = i8 % 2;
                getdebugerrormsgIEngagementSignalsCallbackStub.warmup.setAlpha(0.0f);
                String string = getString(viva.republica.toss.R.string.password_last_change_error_message);
                Intrinsics.checkNotNullExpressionValue(string, "");
                onExtraCallback(string);
            }
            return Boolean.valueOf(getdebugerrormsgIEngagementSignalsCallbackStub.IAuthTabCallbackDefault.post(new Runnable() { // from class: viva.republica.toss.password.PasswordNeo6DFragment$$ExternalSyntheticLambda106
                @Override // java.lang.Runnable
                public final void run() {
                    PasswordNeo6DFragment.IAuthTabCallback(new Object[]{getdebugerrormsgIEngagementSignalsCallbackStub, this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 998071158, -998071154, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
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

    private final int IAuthTabCallback(char[] cArr) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 37;
        MediaDescriptionCompat = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            length = cArr.length;
            i = 0;
            i4 = 1;
        } else {
            length = cArr.length;
            i = 0;
        }
        while (i4 < length) {
            if (cArr[i4] == 9679) {
                return i;
            }
            i4++;
            i++;
        }
        int i5 = MediaDescriptionCompat + 63;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
        return 6;
    }

    private static final Unit onExtraCallback(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, int i, float f) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        GradientButtonView gradientButtonView = getdebugerrormsg.setEngagementSignalsCallback;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        ViewGroup.LayoutParams layoutParams = gradientButtonView.getLayoutParams();
        if (layoutParams == null) {
            Object[] objArr = new Object[1];
            b(71 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 264, objArr);
            throw new NullPointerException(((String) objArr[0]).intern());
        }
        int i4 = MediaBrowserCompatMediaItem + 95;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullExpressionValue(passwordNeo6DFragment.getResources().getDisplayMetrics(), "");
        layoutParams.height = (int) ((i * (1.0f - f)) + (varyMatches.onNavigationEvent(20, r6) * f));
        gradientButtonView.setLayoutParams(layoutParams);
        passwordNeo6DFragment.ResultReceiverMyResultReceiver();
        TdsImageView tdsImageView = getdebugerrormsg.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int x = (int) (getdebugerrormsg.onMessageChannelReady.getX() + getdebugerrormsg.asInterface.getX() + getdebugerrormsg.onMessageChannelReady.getPaddingLeft());
        int y = (int) (getdebugerrormsg.onMessageChannelReady.getY() + getdebugerrormsg.newAuthTabSession.getY());
        if (!passwordNeo6DFragment.prefetchWithMultipleUrls) {
            int i6 = MediaDescriptionCompat + 123;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
            i2 = -M_.onExtraCallback.IAuthTabCallbackStub();
            int i8 = MediaBrowserCompatMediaItem + 71;
            MediaDescriptionCompat = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = 0;
        }
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsImageView, x, y + i2, 0, 0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -980310846, 980310895, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1605362115, -1605362085, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1845031393, 1845031436, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        return (Unit) IAuthTabCallback(new Object[]{function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1352183713, -1352183682, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, commonModule_setLeftEdgeTouchEnabled, dialogInterface}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -700004254, 700004291, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -998862059, 998862078, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getDebugErrorMSG getdebugerrormsg, float f) {
        return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1998625301, -1998625261, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ deprecated_dns requestPostMessageChannelWithExtras() {
        return (deprecated_dns) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -797259974, 797260025, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, Bitmap bitmap) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, getdebugerrormsg, bitmap}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -248846112, 248846122, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -210376099, 210376141, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1911428495, -1911428443, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, getdebugerrormsg, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 11446497, -11446494, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final void writeTypedList() {
        IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1153356570, -1153356546, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit ICustomTabsService(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 834458602, -834458566, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final float access200() {
        return ((Float) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1507537050, -1507537041, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue();
    }

    private final float onExtraCallbackWithResult(int i) {
        return ((Float) IAuthTabCallback(new Object[]{this, Integer.valueOf(i)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -792757684, 792757732, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).floatValue();
    }

    private final deprecated_dns ITrustedWebActivityCallbackStub() {
        return (deprecated_dns) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 318230044, -318230012, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final void IAuthTabCallback(float f, getDebugErrorMSG getdebugerrormsg, float f2, ValueAnimator valueAnimator) {
        IAuthTabCallback(new Object[]{Float.valueOf(f), getdebugerrormsg, Float.valueOf(f2), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1571221113, 1571221118, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final Unit notifyNotificationWithChannel() {
        return (Unit) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1378898196, -1378898188, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final void onNavigationEvent(BaseActivity baseActivity, PasswordNeo6DFragment passwordNeo6DFragment, View view) {
        IAuthTabCallback(new Object[]{baseActivity, passwordNeo6DFragment, view}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2072389693, -2072389659, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final getPackageType ITrustedWebActivityServiceStub() {
        return (getPackageType) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1791116134, 1791116193, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit onExtraCallback(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, MotionEvent motionEvent) {
        return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg, passwordNeo6DFragment, motionEvent}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -891105772, 891105783, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final boolean ITrustedWebActivityServiceStubProxy() {
        return ((Boolean) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1041565811, 1041565831, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).booleanValue();
    }

    private static final isNullSentinel read() {
        return (isNullSentinel) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 647514788, -647514733, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit ICustomTabsCallback_Parcel(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 351683634, -351683619, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit newAuthTabSession(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1652360547, 1652360591, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit prefetchWithMultipleUrls(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1266036543, 1266036549, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2040175674, -2040175660, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit warmup(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1467909831, -1467909781, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit access100(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1236447485, 1236447531, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Interpolator ITrustedWebActivityService_Parcel() {
        return (Interpolator) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1753236308, 1753236330, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit updateVisuals(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1066944046, 1066944063, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(getDebugErrorMSG getdebugerrormsg) {
        return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1777374567, -1777374539, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final void onExtraCallbackWithResult(String str) {
        IAuthTabCallback(new Object[]{this, str}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1918169119, -1918169096, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final void onExtraCallback(char[] cArr, int i) {
        IAuthTabCallback(new Object[]{this, cArr, Integer.valueOf(i)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1656987448, -1656987392, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit onRelationshipValidationResult(PasswordNeo6DFragment passwordNeo6DFragment) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 679713340, -679713322, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final ValueAnimator RatingCompatStarStyle() {
        return (ValueAnimator) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1532306151, 1532306177, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final deprecated_dns MediaSessionCompatQueueItem() {
        return (deprecated_dns) IAuthTabCallback(new Object[0], LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -736253383, 736253424, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final void onWarmupCompleted(deprecated_dns deprecated_dnsVar, float f, PasswordNeo6DFragment passwordNeo6DFragment, float f2, getDebugErrorMSG getdebugerrormsg, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        IAuthTabCallback(new Object[]{deprecated_dnsVar, Float.valueOf(f), passwordNeo6DFragment, Float.valueOf(f2), getdebugerrormsg, Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1759806156, -1759806155, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final void onWarmupCompleted(PasswordNeo6DFragment passwordNeo6DFragment, float f, Interpolator interpolator, float f2, float f3, float f4, View[] viewArr, float f5, String str, float f6, float f7, ValueAnimator valueAnimator) {
        IAuthTabCallback(new Object[]{passwordNeo6DFragment, Float.valueOf(f), interpolator, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), viewArr, Float.valueOf(f5), str, Float.valueOf(f6), Float.valueOf(f7), valueAnimator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1123416243, 1123416264, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Pair ICustomTabsCallbackStub(PasswordNeo6DFragment passwordNeo6DFragment) {
        return (Pair) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 745667309, -745667262, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit ICustomTabsService_Parcel(PasswordNeo6DFragment passwordNeo6DFragment, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, attachapplovinsdk}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1871936460, 1871936462, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit asBinder(getDebugErrorMSG getdebugerrormsg) {
        return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1723768281, 1723768339, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit asBinder(Function0 function0) {
        return (Unit) IAuthTabCallback(new Object[]{function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1733602443, 1733602455, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit asBinder(PasswordNeo6DFragment passwordNeo6DFragment, getDebugErrorMSG getdebugerrormsg, float f) {
        return (Unit) IAuthTabCallback(new Object[]{passwordNeo6DFragment, getdebugerrormsg, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1756348226, -1756348172, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private final Boolean asInterface(Function0<Unit> function0) {
        return (Boolean) IAuthTabCallback(new Object[]{this, function0}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -2141371965, 2141371972, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final int ICustomTabsService(PasswordNeo6DFragment passwordNeo6DFragment) {
        return ((Integer) IAuthTabCallback(new Object[]{passwordNeo6DFragment}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1544398220, -1544398182, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).intValue();
    }

    private final Unit onExtraCallbackWithResult(boolean z) {
        return (Unit) IAuthTabCallback(new Object[]{this, Boolean.valueOf(z)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -81211990, 81212029, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(getDebugErrorMSG getdebugerrormsg, PasswordNeo6DFragment passwordNeo6DFragment, float f) {
        return (Unit) IAuthTabCallback(new Object[]{getdebugerrormsg, passwordNeo6DFragment, Float.valueOf(f)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1355755065, -1355755032, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
    }

    static void validateRelationship() {
        char[] cArr = new char[774];
        ByteBuffer.wrap("í\u0084\u0010×\u0017c\u0015\u0081\u0018+\u001fQ\u001dê\u0000\u001e\u0006\u008a\u0005Ã\bo\u000eÔ\r(0h6ú5\u000b;\u0093>;=U#ü&\bí¶\u0010ß\u0017~\u0015\u0096\u00185\u001fP\u001dÿí³\u0010Ó\u0017d\u0015°\u00185\u001fP\u001dü\u0000\u0013\u0006ª\u0005Á\b(\u000eË\r\u00000X6á5\u001c;\u0095>y=B#÷&\f$«+Ú.v,\u008dS%VAT\u00ad[\u0018Y¡\\ÛCyA»D\u0012J±IÆL}r\u009cq1tTzày\u000f\u007f®bÅa#g¨j:iKoÓ\u0092{\u0090\u0095\u0097<\u009aH\u0098Î\u009f\u0019\u009d©\u0080×\u0087q\u0085\u008f\u00880\u008fH\u008dÀ°\r¶¥µb¸R¾Ò½\u001b£²¦Ú¥q«\u0094®#\u00ad\u001dí½\u0010Ø\u0017`\u0015\u0087\u0018(\u001fn\u001dù\u0000\t\u0006·\u0005Ñ\bo\u000e\u0090\r(í³\u0010Ó\u0017d\u0015»\u00182\u001fN\u001dí\u0000\u000e\u0006\u0094\u0005Ç\bs\u000e\u0091\r;0A6ú5\u000e;Ü>\u007f=|#û&\u0011$ñ+Ì.u,\u0097S5V\u000fT÷[\u0005Y¥\\ÁC~A»D\u0003J¤IÛLpr\u008dqwtizáy\u0005\u007fµbÐaig½j<iXoÝ\u0092x\u0090\u0097\u0097ií\u009a\u009aÛí¼\u0010Â\u0017d\u0015\u0082\u0018/\u001f\u0004\u001d·\u0000U\u0006·\u0005Ò\ba\u000e\u0096\r%0M6¦5\u001e;\u009b>%=C#¼&\u0015$³+\u0097.s,\u009cSiVPTë[\u0002Yá\\ÌCkAæD\u001dJýIÑLpr\u0091q+t_z©y\u0004\u007f§b\u008ca|g\u0080j/V\u0007«y¬ß®9£\u0094¤¿¦\f»î½\f¾i³Úµ-¶\u009e\u008bö\u008d\u001d\u008e¥\u0080 \u0085\u009e\u0086ø\u0098\u0007\u009d®\u009f\b\u0090,\u0095È\u0097'èÒíëïPà¹âZç\u007føØúHÿ¥ñ\u001fò$÷ÄÉ)Ê\u008cÏòÁZÂðÄ\u0019Ù~Ú\u0099Ü%Ñ\u009dÒöíº\u0010Ã\u0017|\u0015\u009e\u0018|\u001f]\u001dù\u0000\u0014\u0006ª\u0005É\bt\u000eÂ\r.0K6¨5\t;\u0095>%=D#²&\b$±+\u0098.t,\u008bS(V\rTì[\u0019Y¢\\ÄC*AàD\u000fJ I×L<r\u009fq6t^zöy\t\u007f©bÆa\"g\u0098j!iOoÃ\u00928\u0090¦\u0097;\u009aY\u0098é\u009f?\u009d¨\u0080Ë\u0087s\u0085\u0090\u0088l\u008f`\u008dï°\u0011¶¥µ!¸B¾À½\u0013£®¦ß¥u«\u0089íôåN\u00185\u001f\u0094\u001dG\u0010Ã\u0017¡\u0015\u001b\bô\u008eÏsºt\u000bvá{J|%~\u0080cleÛf\u0083k\u0017mýnBS<U\u009dVtXÑ]@^#@\u009bEr\u0081\u0004|q{ßy&t\u009bsöqJl\u0083j\u0016iydÖb!í¶\u0010Ã\u0017d\u0015\u0086\u00183\u001fP\u001dÇ\u0000\u000e\u0006\u00ad\u0005Ò\bl\u000e\u0087í \u0010ß\u0017d\u0015\u009e\u00189ÈB5!2\u00910c=Ü:¥8\u001a%ü#_ ;-\u009cí¸\u0010Ù\u0017w\u0015\u009b\u00182\u001fa\u001dá\u0000\u0014í½\u0010Ø\u0017v\u0015\u009e\u00183\u001fI\u001dÇ\u0000\u000e\u0006½\u0005Ö\beï@\u00127\u0015\u0091\u0017b\u001aÄ\u001d»\u001f\u0019\u0002Ð\u0004R\u0007=\n\u0081í¶\u0010ß\u0017\u007f\u0015\u00ad\u0018=\u001fK\u001dì\u0000\u0012\u0006\u009b\u0005ß\bní¶\u0010ß\u0017\u007f\u0015\u00ad\u0018=\u001fK\u001dì\u0000\u0012\u0006\u009b\u0005Å\bh\u000e\u0087\r/0E6×5\u0013;\u009aí²\u0010Ã\u0017~\u0015\u009c\u00189\u001fR\u001dÇ\u0000\u0013\u0006 íâ\u0010Æ\u0017y\u0015\u009c\u0018\u0003\u001fG\u001döí±\u0010Î\u0017d\u0015\u0080\u0018=\u001fa\u001dñ\u0000\u0014\u0006¢\u0005Éí¤\u0010Ä\u0017u\u0015\u0094\u0018\u0003\u001fU\u001dý\u0000\u0003\u0006\u009b\u0005Ï\bs\u000e½\r 0A6ï5\u0003;\u009a>\t=@#ó&\u000f$\u00ad+Ï.u,\u0096S\"V\u007fTà[\u0000Y¡\\ËCaAñD\u0012\u0081c|\u0010{¤yFtìs\u0096q-lÙjJi\u000fd·bPaÿí¡\u0010Å\u0017u\u0015´\u00185\u001fP\u001dÿ\u0000\u001f\u0006¶\u0005Ö\br\u000e\u008b\r\"0Zíôð\u0093í÷\u0010\u0082\u0017%\u0015À\u0018\u001f\u001f\n\u001d \u0000O\u0006\u0086\u009c\u0016a5f\u0097duiÙn¹l\u001dqýwCí÷\u0010ð\u0017&\u0015Ä\u0018i\u001f\t\u001d¨½\b@~GÚE=H\u0090OðM_P¶V\tmo\u0090j\u0097º\u0095X\u0098ô\u009f\u0095\u009d0ä\u0011\u0019i\u001eÅ\u001cv\u0011ß\u0016¾\u0014\u0018í÷\u0010Ô\u0017#\u0015Â\u0018l\u001f\r\u001dª\u0000L\u0006¢í÷\u0010Ó\u0017#\u0015\u0094\u00188\u001fX\u001dü\u0000\u001c\u0006¡\u000e2óBô·ö\u0001û\u00adü\u009fþ<\u008bÙvþqXsº~\u0014yv{Ðí÷\u0010\u008f\u0017$\u0015Â\u0018l\u001f\u000f\u001d«\u0000H\u0006¦í÷\u0010\u0080\u0017'\u0015À\u0018o\u001f\u000e\u001dù\u0000K\u0006ñÛ\u008b&þ!N#º.\u0005)L+Å660\u009a3ø>Z8 ;\u0013\u0006g\u0000ú\u0003(\r«\b\u001c\u000b|\u0015Ñ\u00108\u0012\u0090í\u0099\u0010Ã\u0017c\u0015\u0086\u0018|\u001fW\u001dõ\u0000\n\u0006¨\u0005Ã\bm\u000e\u0087\r\"0Z6¨5\t;\u0095>:=\\#ð&\u001d$½+Ó.:,\u0082S4VOTï[LY¾\\ÉCxAñD\u0018J¤I\u0092L]r\u009dq,tSzòy\u000f\u007f´bÛa,g\u0081j:i\noò\u0092d\u0090\u0091\u00975\u009aQ\u0098û\u009f\u0016\u009d®\u0017øê\u0098í)ïØâSå\u0001ç¶úCüýÿ\u0094ò\u0012ôß÷}Ê\u0017vm\u008b\u0012\u008c¸\u008e\\\u0083á\u0084\u009d\u0086'\u009bÉ\u009du\u009e\n\u0093½\u0095P\u0096éíø\u009cþaÕfidØi8n[læqPw½tÙyz\u007f\u0098|)AVGöD\u0005J\u009a".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 774);
        RatingCompat = cArr;
        AudioAttributesImplBaseParcelizer = -6254403564675264330L;
    }
}
