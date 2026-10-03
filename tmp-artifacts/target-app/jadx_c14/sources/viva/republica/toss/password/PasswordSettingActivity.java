package viva.republica.toss.password;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
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
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.ACAuthRequest;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CERT_VerifyVID;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1;
import o.DynamicFromArrayCompanion;
import o.EncryptedContentInfoParser;
import o.ExternalOfferInformationDialogListener;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.GetBillingConfigParamsBuilder;
import o.GraniteBrownfieldModule_closeView;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.IconRoundCornerProgressBarSavedState;
import o.IndicatorView;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access13800;
import o.access14300;
import o.accesssetMapp;
import o.addAllCommandLine;
import o.asArray;
import o.asDouble;
import o.asMaplambda6;
import o.clearWrite;
import o.createPaints;
import o.dangerouslyReset;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.disableImageViewPreallocationAndroid;
import o.downloadZip;
import o.enableFabricRenderer;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBillingPeriod;
import o.getNavigationBar;
import o.getPackageType;
import o.getWrite;
import o.isJSONTypeIgnore;
import o.isJacksonCreator;
import o.isNumber;
import o.isOneShot;
import o.isShowTransAnimate;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.noStore;
import o.onAdViewAdDisplayFailed;
import o.onPageExit;
import o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I;
import o.setRandomHost;
import o.setTestMode;
import o.shortValue;
import o.startRearDisplaySession;
import o.supportWideGamut;
import o.wasLastName;
import o.writeRaw;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.password.PasswordFragment;
import viva.republica.toss.password.PasswordSettingActivity;
import viva.republica.toss.password.PasswordSettingActivity$;
import viva.republica.toss.password.reset.PasswordResetIntroActivity;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordSettingActivity extends Hilt_PasswordSettingActivity implements PasswordFragment.onExtraCallback {
    public static final onNavigationEvent Companion;
    public static final String IAuthTabCallbackDefault;
    public static final String IAuthTabCallbackStub;
    private static final String IAuthTabCallbackStubProxy;
    public static final String IAuthTabCallback_Parcel;
    private static final String ICustomTabsCallback;
    private static char[] ICustomTabsServiceDefault;
    private static final String access000;
    public static final String access100;
    private static int access200;
    static final /* synthetic */ addAllCommandLine<Object>[] asBinder;
    public static final String asInterface;
    private static final String extraCallback;
    private static final String extraCallbackWithResult;
    public static final String getInterfaceDescriptor;
    private static final String onActivityResized;
    private static final String onMinimized;
    private static final String onPostMessage;
    public static final int onTransact;
    private static final String readTypedObject;
    private static long validateRelationship;
    private static final String writeTypedObject;
    private isJSONTypeIgnore ICustomTabsCallbackStub;
    private int ICustomTabsService;

    @Inject
    public zzad environments;

    @Inject
    public ACAuthRequest euOnboardingBiometricCheckDialog;
    private int extraCommand;

    @Inject
    public ExternalOfferInformationDialogListener globalResetPasswordIntent;
    private PasswordFragment mayLaunchUrl;
    private getPackageType newAuthTabSession;
    private PasswordFragment newSession;
    private String newSessionWithExtras;
    private PasswordFragment onRelationshipValidationResult;

    @Inject
    public r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I passwordRepository;
    private String postMessage;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public DefaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1 tossBankJointCertBridge;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {2, 105, -126, -86};
    private static final int $$b = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IEngagementSignalsCallback = 0;
    private static int warmup = 0;
    private static int ICustomTabsServiceStub = 1;
    private final Lazy updateVisuals = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(PasswordVerifyViewModel.class), new IAuthTabCallback_Parcel(this), new access000(this), new writeTypedObject(null, this));
    private final Lazy onActivityLayout = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new getInterfaceDescriptor(this));
    private final ObservableProperty prefetch = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));
    private long receiveFile = -1;
    private GetBillingConfigParamsBuilder prefetchWithMultipleUrls = GetBillingConfigParamsBuilder.Companion.onNavigationEvent();
    private final Lazy setEngagementSignalsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return Boolean.valueOf(PasswordSettingActivity.IAuthTabCallbackStub(this.f$0));
        }
    });
    private final Lazy requestPostMessageChannel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            return (String) PasswordSettingActivity.onNavigationEvent(-550936674, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[0], onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 550936676, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
    });
    private final Lazy isEngagementSignalsApiAvailable = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda7
        public final Object invoke() {
            return Boolean.valueOf(PasswordSettingActivity.onNavigationEvent(this.f$0));
        }
    });
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda8
        public final Object invoke() {
            return PasswordSettingActivity.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda9
        public final Object invoke() {
            return Long.valueOf(((Long) PasswordSettingActivity.onNavigationEvent(643653703, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this.f$0}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -643653697, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue());
        }
    });
    private final Lazy ICustomTabsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda10
        public final Object invoke() {
            return PasswordSettingActivity.onExtraCallback(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> ICustomTabsCallback_Parcel = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda11
        public final Object invoke(Object obj) {
            return PasswordSettingActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final Lazy requestPostMessageChannelWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            return Boolean.valueOf(PasswordSettingActivity.onExtraCallbackWithResult(this.f$0));
        }
    });
    private final Lazy ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda13
        public final Object invoke() {
            return (IndicatorView) PasswordSettingActivity.onNavigationEvent(-161624848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this.f$0}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 161624853, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
    });

    static final /* synthetic */ class access100 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        access100(Function1 function1) {
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

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[shortValue.onNavigationEvent.values().length];
            try {
                iArr[shortValue.onNavigationEvent.BANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[shortValue.onNavigationEvent.SECURITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[PasswordFragment.onNavigationEvent.values().length];
            try {
                iArr2[PasswordFragment.onNavigationEvent.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PasswordFragment.onNavigationEvent.CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr2;
        }
    }

    private static String $$c(int i, byte b, short s) {
        int i2 = i * 3;
        int i3 = 97 - (s * 2);
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (-i4) + i3;
            i4 = i4;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i3 = (-bArr[i7]) + i3;
            i4 = i7;
        }
    }

    static {
        access200 = 1;
        onVerticalScrollEvent();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getPressedStateDuration() >> 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, (char) (44146 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr);
        onPostMessage = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        onMinimized = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((-16777170) - Color.rgb(0, 0, 0), Process.getGidForName("") + 30, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44175), objArr3);
        onActivityResized = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, (ViewConfiguration.getTapTimeout() >> 16) + 16, (char) KeyEvent.keyCodeFromString(""), objArr4);
        extraCallbackWithResult = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 92, ((byte) KeyEvent.getModifierMetaStateMask()) + 24, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17572), objArr5);
        access100 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(114 - View.MeasureSpec.getSize(0), 28 - TextUtils.indexOf("", "", 0, 0), (char) View.resolveSizeAndState(0, 0, 0), objArr6);
        ICustomTabsCallback = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(MotionEvent.axisFromString("") + 143, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 20169), objArr7);
        extraCallback = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(161 - TextUtils.indexOf("", "", 0), 29 - ((Process.getThreadPriority(0) + 20) >> 6), (char) TextUtils.indexOf("", "", 0), objArr8);
        getInterfaceDescriptor = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 190, Color.rgb(0, 0, 0) + 16777234, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr9);
        IAuthTabCallback_Parcel = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 209, 27 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
        readTypedObject = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(Color.green(0) + 235, Color.green(0) + 24, (char) (View.combineMeasuredStates(0, 0) + 3814), objArr11);
        writeTypedObject = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 259, View.MeasureSpec.getSize(0) + 35, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
        IAuthTabCallbackStub = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a(294 - (KeyEvent.getMaxKeyCode() >> 16), 25 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getCapsMode("", 0, 0), objArr13);
        IAuthTabCallbackDefault = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(320 - View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 15, (char) (47918 - ImageFormat.getBitsPerPixel(0)), objArr14);
        asInterface = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a(335 - View.MeasureSpec.getMode(0), 25 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.indexOf("", "", 0) + 23487), objArr15);
        access000 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(360 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, (char) TextUtils.getTrimmedLength(""), objArr16);
        IAuthTabCallbackStubProxy = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a(366 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.MeasureSpec.getMode(0) + 64120), objArr17);
        String strIntern = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 377, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (char) (57407 - TextUtils.indexOf((CharSequence) "", '0')), objArr18);
        asBinder = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(PasswordSettingActivity.class, strIntern, ((String) objArr18[0]).intern(), 0)};
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = IEngagementSignalsCallback + 5;
        access200 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = warmup + 123;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(-378887848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 378887861, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(-378887848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 378887861, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i3 = 15 / 0;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        long jOnMessageChannelReady = onMessageChannelReady(passwordSettingActivity);
        int i4 = ICustomTabsServiceStub + 119;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(jOnMessageChannelReady);
    }

    public static /* synthetic */ UTF8Decoder IAuthTabCallbackDefault(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 97;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8DecoderWriteTypedObject = writeTypedObject(passwordSettingActivity);
        int i4 = warmup + 75;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return uTF8DecoderWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 43;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnRelationshipValidationResult = onRelationshipValidationResult(passwordSettingActivity);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return zOnRelationshipValidationResult;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[0];
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(uTF8Decoder, passwordSettingActivity, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(uTF8Decoder, passwordSettingActivity, setDetectableSize);
        int i3 = ICustomTabsServiceStub + 73;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void asBinder(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(passwordSettingActivity);
        int i4 = ICustomTabsServiceStub + 61;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 25;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(passwordSettingActivity, str);
        }
        onExtraCallbackWithResult(passwordSettingActivity, str);
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) throws Throwable {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[1];
        asDouble asdouble = (asDouble) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 59;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordSettingActivity, uTF8Decoder, asdouble);
        int i4 = warmup + 3;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 29;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            return (IndicatorView) onNavigationEvent(-959341715, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 959341735, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ shortValue.onNavigationEvent onExtraCallback(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 13;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onMinimized(passwordSettingActivity);
        }
        onMinimized(passwordSettingActivity);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(PasswordSettingActivity passwordSettingActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 125;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(passwordSettingActivity, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 113;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsServiceStub + 17;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = warmup + 37;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(th);
        }
        IAuthTabCallbackDefault(th);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 69;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordSettingActivity, dialogInterface);
        int i4 = warmup + 29;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(-1857218987, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, commonModule_setLeftEdgeTouchEnabled}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1857218987, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i3 = ICustomTabsServiceStub + 115;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 119;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(210245847, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, iEngagementSignalsCallbackDefault}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -210245844, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i3 = ICustomTabsServiceStub + 87;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordSettingActivity, setDetectableSize);
        int i4 = ICustomTabsServiceStub + 51;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, UTF8Decoder uTF8Decoder, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 39;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(passwordSettingActivity, uTF8Decoder, unit);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 49;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(1721091640, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1721091632, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
        int i4 = warmup + 55;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~(i7 | i4);
        int i10 = i8 | i9;
        int i11 = ~i;
        int i12 = (~((~i4) | i7 | i)) | (~(i7 | i11 | i4));
        int i13 = i9 | (~(i11 | i5));
        int i14 = i5 + i + i2 + ((-1696018712) * i3) + (2108813197 * i6);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i5) - 2121662464) + (1221732374 * i) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i2) + (39845888 * i3) + (227278848 * i6) + ((-1705377792) * i15);
        int i17 = ((i5 * 362004572) - 1408384217) + (i * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i2 * 362004373) + (i3 * (-1290304248)) + (i6 * 155295761) + (i15 * (-60686336));
        switch (i16 + (i17 * i17 * (-1680474112))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                int i18 = 2 % 2;
                int i19 = warmup + 63;
                ICustomTabsServiceStub = i19 % 128;
                int i20 = i19 % 2;
                String str = read();
                int i21 = ICustomTabsServiceStub + 119;
                warmup = i21 % 128;
                int i22 = i21 % 2;
                return str;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return writeTypedObject(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return onActivityLayout(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(UTF8Decoder uTF8Decoder, PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 21;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(uTF8Decoder, passwordSettingActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = warmup + 65;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = warmup + 117;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordSettingActivity, dialogInterface);
        int i4 = ICustomTabsServiceStub + 101;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = warmup + 83;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordSettingActivity, bool);
        int i4 = warmup + 77;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 121;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(passwordSettingActivity, pair);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordSettingActivity, pair);
        int i3 = ICustomTabsServiceStub + 91;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(passwordSettingActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(passwordSettingActivity, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityLayout = onActivityLayout(passwordSettingActivity);
        int i4 = warmup + 45;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnActivityLayout;
    }

    public static /* synthetic */ Unit onTransact(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(passwordSettingActivity);
        int i4 = warmup + 3;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        Unit unit = (Unit) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 101;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(passwordSettingActivity, unit);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordSettingActivity, unit);
        int i3 = ICustomTabsServiceStub + 55;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = warmup + 65;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(passwordSettingActivity, view);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    public static /* synthetic */ void validateRelationship() {
        int i = 2 % 2;
        int i2 = warmup + 103;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = warmup + 5;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = i3 + 109;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 117;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static final class getInterfaceDescriptor implements Function0<CERT_VerifyVID> {
        final /* synthetic */ Activity IAuthTabCallback;

        public getInterfaceDescriptor(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_VerifyVID invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_VerifyVID.onExtraCallback(layoutInflater);
        }
    }

    public static final class IAuthTabCallbackDefault extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ PasswordSettingActivity IAuthTabCallback;
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ String onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, PasswordSettingActivity passwordSettingActivity, String str, String str2) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = passwordSettingActivity;
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            minFresh.onNavigationEvent(this.IAuthTabCallback, noStore.Companion.onWarmupCompleted());
            PasswordSettingActivity.IAuthTabCallback(this.IAuthTabCallback, th, this.onNavigationEvent, this.onExtraCallback);
            this.IAuthTabCallback.bo_();
        }
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {27170, 27308, 27300, 27305, 27283, 27306, 27296, 27311, 27281, 27311, 27285, 27309, 27326, 27299, 27310, 27310, 27305, 27308, 27310, 27308, 27300, 27302, 27284, 27244, 27143, 27141, 27136, 27138, 27143, 27160, 27154, 27137, 27145, 27136, 27165, 27141, 27146, 27167, 27165, 27141, 27139, 27163, 27166, 27143, 27165, 27160, 27136, 27236, 27166, 27166, 27162, 27138, 27141, 27158, 27165, 27136, 27162, 27141, 27166, 27159, 27167, 27143, 27141, 27164, 27165, 27138, 27167, 27166, 27143, 27165, 27160, 27136, 27155, 27385, 27391, 27380, 27379, 27388, 27390, 27387, 27377, 27384, 27361, 27383, 27378, 27386, 27390, 27384, 27247, 27147, 27144, 27146, 27145, 27163, 27161, 27142, 27140, 27165, 27163, 27165, 27166, 27141, 27167, 27159, 27160, 27162, 27140, 27147, 27136, 27160, 27165, 27143, 27166, 27158, 27141, 27164, 27150, 27328, 27356, 27332, 27334, 27358, 27359, 27334, 27330, 27329, 27359, 27352, 27352, 27357, 27359, 27337, 27340, 27333, 27357, 27358, 27336, 27331, 27354, 27339, 27337, 27358, 27356, 27358, 27331, 27194, 27285, 27288, 27284, 27289, 27292, 27295, 27280, 27283, 27265, 27267, 27289, 27281, 27282, 27292};
        private static long onExtraCallbackWithResult = -3404278436522615173L;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 113;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.indexOf("", "")), 84 - Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getTapTimeout() >> 16)), 19 - Gravity.getAbsoluteGravity(0, 0), 8808 - TextUtils.getCapsMode("", 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 123;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = $10 + 59;
                    $11 = i11 % 128;
                    int i12 = i11 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.MeasureSpec.makeMeasureSpec(0, 0)), 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14239 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i10++;
                        i2 = 2;
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
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                int i13 = $11 + 41;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr4 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10934), 65 - TextUtils.indexOf("", "", 0, 0), 16719 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 29 - View.resolveSizeAndState(0, 0, 0), 17658 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 70, 12486 - View.combineMeasuredStates(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                int i17 = $10 + 121;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i19 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i19, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i19);
            }
            if (!(!z)) {
                char[] cArr6 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i20 = $11 + 73;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                int i21 = $10 + 39;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i23 = $11 + 25;
                    $10 = i23 % 128;
                    int i24 = i23 % 2;
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent onNavigationEvent(onNavigationEvent onnavigationevent, Context context, UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, UTF8Decoder uTF8Decoder2, int i, Object obj) {
            boolean z3;
            boolean z4;
            UTF8Decoder uTF8Decoder3;
            int i2 = 2 % 2;
            if ((i & 8) != 0) {
                int i3 = IAuthTabCallback + 45;
                onNavigationEvent = i3 % 128;
                z3 = i3 % 2 == 0;
            } else {
                z3 = z;
            }
            if ((i & 16) != 0) {
                int i4 = IAuthTabCallback + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i & 32) != 0) {
                int i6 = onNavigationEvent + 113;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 28 / 0;
                }
                uTF8Decoder3 = null;
            } else {
                uTF8Decoder3 = uTF8Decoder2;
            }
            return onnavigationevent.onWarmupCompleted(context, uTF8Decoder, j, z3, z4, uTF8Decoder3);
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull UTF8Decoder uTF8Decoder, long j, boolean z, boolean z2, @Nullable UTF8Decoder uTF8Decoder2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            b(new char[]{18295, 51508, 17956, 18226, 15718, 44059, 35998, 3409, 53994, 12856, 9918, 64358, 27804, 22600, 45269, 24884, 34481, 61051, 51961, 52427, 4190, 30083, 25663}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), uTF8Decoder.ordinal());
            Object[] objArr2 = new Object[1];
            a(new int[]{145, 15, 137, 10}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1}, objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), j);
            Object[] objArr3 = new Object[1];
            b(new char[]{25168, 55518, 18787, 25109, 41971, 48625, 33753, 37828, 63437, 9170, 10720, 26081, 18871, 18871, 49047, 65441, 41865, 65418, 50611, 21071, 13683, 25724, 27497, 9337, 36684, 35420, 61706, 48657, 57647, 12302, 1831, 4154, 31499, 42742, 43730, 60114, 52469, 52420, 12520}, -Process.getGidForName(""), objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), z);
            Object[] objArr4 = new Object[1];
            a(new int[]{72, 16, 102, 14}, true, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr4);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr4[0]).intern(), z2);
            Object[] objArr5 = new Object[1];
            a(new int[]{88, 28, 0, 19}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0}, objArr5);
            Intent intentPutExtra5 = intentPutExtra4.putExtra(((String) objArr5[0]).intern(), (Serializable) uTF8Decoder2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra5, "");
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra5;
            }
            throw null;
        }

        public static /* synthetic */ Intent onExtraCallback(onNavigationEvent onnavigationevent, Context context, isJSONTypeIgnore isjsontypeignore, boolean z, boolean z2, UTF8Decoder uTF8Decoder, int i, Object obj) {
            boolean z3;
            UTF8Decoder uTF8Decoder2;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 89;
            IAuthTabCallback = i4 % 128;
            boolean z4 = (i4 % 2 == 0 ? (i & 4) == 0 : (i & 2) == 0) ? z : false;
            if ((i & 8) != 0) {
                int i5 = i3 + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                z3 = false;
            } else {
                z3 = z2;
            }
            if ((i & 16) != 0) {
                int i7 = i3 + 31;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 47 / 0;
                }
                uTF8Decoder2 = null;
            } else {
                uTF8Decoder2 = uTF8Decoder;
            }
            return onnavigationevent.onExtraCallback(context, isjsontypeignore, z4, z3, uTF8Decoder2);
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull isJSONTypeIgnore isjsontypeignore, boolean z, boolean z2, @Nullable UTF8Decoder uTF8Decoder) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(isjsontypeignore, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{47, 25, 0, 0}, true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), (Parcelable) isjsontypeignore);
            Object[] objArr2 = new Object[1];
            b(new char[]{25168, 55518, 18787, 25109, 41971, 48625, 33753, 37828, 63437, 9170, 10720, 26081, 18871, 18871, 49047, 65441, 41865, 65418, 50611, 21071, 13683, 25724, 27497, 9337, 36684, 35420, 61706, 48657, 57647, 12302, 1831, 4154, 31499, 42742, 43730, 60114, 52469, 52420, 12520}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), z);
            Object[] objArr3 = new Object[1];
            a(new int[]{72, 16, 102, 14}, true, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), z2);
            Object[] objArr4 = new Object[1];
            a(new int[]{88, 28, 0, 19}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0}, objArr4);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr4[0]).intern(), (Serializable) uTF8Decoder);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra4, "");
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra4;
        }

        public static /* synthetic */ Intent IAuthTabCallback(onNavigationEvent onnavigationevent, Context context, isJSONTypeIgnore isjsontypeignore, boolean z, boolean z2, UTF8Decoder uTF8Decoder, IndicatorView indicatorView, int i, Object obj) {
            boolean z3;
            IndicatorView indicatorView2;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 95;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            if (i3 % 2 != 0 ? (i & 4) == 0 : (i & 2) == 0) {
                z3 = z;
            } else {
                int i5 = i4 + 101;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 4;
                }
                z3 = false;
            }
            boolean z4 = (i & 8) != 0 ? false : z2;
            Object obj2 = null;
            UTF8Decoder uTF8Decoder2 = (i & 16) != 0 ? null : uTF8Decoder;
            if ((i & 32) != 0) {
                int i7 = i4 + 103;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                indicatorView2 = null;
            } else {
                indicatorView2 = indicatorView;
            }
            return onnavigationevent.onWarmupCompleted(context, isjsontypeignore, z3, z4, uTF8Decoder2, indicatorView2);
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull isJSONTypeIgnore isjsontypeignore, boolean z, boolean z2, @Nullable UTF8Decoder uTF8Decoder, @Nullable IndicatorView indicatorView) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(isjsontypeignore, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{47, 25, 0, 0}, true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), (Parcelable) isjsontypeignore);
            Object[] objArr2 = new Object[1];
            b(new char[]{25168, 55518, 18787, 25109, 41971, 48625, 33753, 37828, 63437, 9170, 10720, 26081, 18871, 18871, 49047, 65441, 41865, 65418, 50611, 21071, 13683, 25724, 27497, 9337, 36684, 35420, 61706, 48657, 57647, 12302, 1831, 4154, 31499, 42742, 43730, 60114, 52469, 52420, 12520}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), z);
            Object[] objArr3 = new Object[1];
            a(new int[]{72, 16, 102, 14}, true, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), z2);
            Object[] objArr4 = new Object[1];
            a(new int[]{88, 28, 0, 19}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0}, objArr4);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr4[0]).intern(), (Serializable) uTF8Decoder);
            Object[] objArr5 = new Object[1];
            a(new int[]{116, 29, 61, 16}, false, new byte[]{1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, objArr5);
            Intent intentPutExtra5 = intentPutExtra4.putExtra(((String) objArr5[0]).intern(), (Serializable) indicatorView);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra5, "");
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra5;
            }
            throw null;
        }

        public final Intent onExtraCallback(@NotNull Context context, long j, @NotNull String str, @NotNull String str2, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{0, 23, 148, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(new int[]{23, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1}, objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), str);
            Object[] objArr3 = new Object[1];
            b(new char[]{39779, 3130, 30116, 39718, 64424, 26901, 48926, 52127, 3838, 63286, 5410, 15782, 45212, 40266, 33618, 43002, 23204, 11106, 63843, 2562, 52288, 45204, 22453, 31795, 30320, 24244, 52699, 58957, 6147, 58602, 15350}, TextUtils.getOffsetBefore("", 0) + 1, objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), str2);
            Object[] objArr4 = new Object[1];
            b(new char[]{25168, 55518, 18787, 25109, 41971, 48625, 33753, 37828, 63437, 9170, 10720, 26081, 18871, 18871, 49047, 65441, 41865, 65418, 50611, 21071, 13683, 25724, 27497, 9337, 36684, 35420, 61706, 48657, 57647, 12302, 1831, 4154, 31499, 42742, 43730, 60114, 52469, 52420, 12520}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr4[0]).intern(), z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra4, "");
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra4;
            }
            throw null;
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull GetBillingConfigParamsBuilder getBillingConfigParamsBuilder, @NotNull String str, @NotNull String str2, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getBillingConfigParamsBuilder, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            b(new char[]{35472, 27036, 63118, 35541, 46794, 3251, 15412, 34557, 7949, 37520, 38417, 28869, 41313, 63733, 'a', 60050, 19264, 20168, 31322, 18294, 56754, 54578, 54422, 12614, 26499, 15116, 20209, 43816, 2539, 33098, 47319, 1289, 37831}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), (Parcelable) getBillingConfigParamsBuilder);
            Object[] objArr2 = new Object[1];
            a(new int[]{23, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1}, objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), str);
            Object[] objArr3 = new Object[1];
            b(new char[]{39779, 3130, 30116, 39718, 64424, 26901, 48926, 52127, 3838, 63286, 5410, 15782, 45212, 40266, 33618, 43002, 23204, 11106, 63843, 2562, 52288, 45204, 22453, 31795, 30320, 24244, 52699, 58957, 6147, 58602, 15350}, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), str2);
            Object[] objArr4 = new Object[1];
            b(new char[]{25168, 55518, 18787, 25109, 41971, 48625, 33753, 37828, 63437, 9170, 10720, 26081, 18871, 18871, 49047, 65441, 41865, 65418, 50611, 21071, 13683, 25724, 27497, 9337, 36684, 35420, 61706, 48657, 57647, 12302, 1831, 4154, 31499, 42742, 43730, 60114, 52469, 52420, 12520}, TextUtils.indexOf("", "", 0) + 1, objArr4);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr4[0]).intern(), z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra4, "");
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra4;
            }
            throw null;
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PasswordSettingActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{0, 23, 148, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(new int[]{145, 15, 137, 10}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1}, objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), 26L);
            Object[] objArr3 = new Object[1];
            b(new char[]{600, 3545, 44836, 541, 50561, 26870, 26014, 62902, 38853, 63189, 53181, 901, 10676, 40105, 22977, 39385, 50078, 10886, 9209, 13352, 21865, 45421, 36137, 16899, 61275, 24392, 5978}, 1 - View.getDefaultSize(0, 0), objArr3);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr3[0]).intern(), true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra3, "");
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra3;
        }
    }

    public static final class access000 implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public access000(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -8566999136025710461L;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = PasswordSettingActivity.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $11 + 79;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 24, TextUtils.indexOf("", "") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 59 - (KeyEvent.getMaxKeyCode() >> 16), Color.rgb(0, 0, 0) + 16783599, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 11;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 59 - View.MeasureSpec.getMode(0), 6383 - TextUtils.getOffsetAfter("", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = $10 + 17;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 121;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 31;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{30167, 16858, 7622, 59893, 42408, 29067, 19841, 6653, 54763, 41281, 32071, 18786, 1397, 53530, 44291, 31090, 13668, 297, 56543, 43215, 25847, 12541, 3227, 55501, 38139, 24746, 15452, 2135, 50303, 36972, 27667, 14402, 62580, 49196, 39971, 27597, 10176, 62399, 53229, 39826, 22430, 9148, 65463, 52037, 34633, 21369, 12131}, 13328 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            ConstraintLayout constraintLayout = PasswordSettingActivity.asInterface(PasswordSettingActivity.this).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted implements PasswordFragment.onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static long onExtraCallback = 6054344185855421762L;
        private static int onNavigationEvent;
        final /* synthetic */ PasswordFragment IAuthTabCallback;
        final /* synthetic */ PasswordSettingActivity onWarmupCompleted;

        public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(function1, obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(passwordFragment, passwordSettingActivity, th);
            int i4 = IAuthTabCallbackDefault + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(passwordSettingActivity, graniteBrownfieldModule_closeView);
            int i4 = IAuthTabCallbackDefault + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 1;
            while (true) {
                $11 = i3 % 128;
                int i4 = i3 % 2;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i5 = $11 + 73;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        i3 = $10 + 93;
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
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16777275 + Color.rgb(0, 0, 0), 6383 - TextUtils.getTrimmedLength(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new String(cArr2);
        }

        onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, PasswordFragment passwordFragment) {
            this.onWarmupCompleted = passwordSettingActivity;
            this.IAuthTabCallback = passwordFragment;
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            wasLastName waslastnameOnExtraCallback = DynamicFromArrayCompanion.onExtraCallback(DynamicFromArrayCompanion.onExtraCallbackWithResult, PasswordSettingActivity.getInterfaceDescriptor(PasswordSettingActivity.this), graniteBrownfieldModule_closeView, this.onWarmupCompleted, null, Long.valueOf(((Long) PasswordSettingActivity.onNavigationEvent(1090041940, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{PasswordSettingActivity.this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1090041928, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue()), 8, null);
            final PasswordSettingActivity passwordSettingActivity = PasswordSettingActivity.this;
            deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$3$1$$ExternalSyntheticLambda0
                public final void run() throws Throwable {
                    PasswordSettingActivity.onWarmupCompleted.onExtraCallbackWithResult(passwordSettingActivity, graniteBrownfieldModule_closeView);
                }
            };
            final PasswordFragment passwordFragment = this.IAuthTabCallback;
            final PasswordSettingActivity passwordSettingActivity2 = PasswordSettingActivity.this;
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$3$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return PasswordSettingActivity.onWarmupCompleted.onExtraCallbackWithResult(passwordFragment, passwordSettingActivity2, (Throwable) obj);
                }
            };
            waslastnameOnExtraCallback.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$3$1$$ExternalSyntheticLambda2
                public final void accept(Object obj) {
                    PasswordSettingActivity.onWarmupCompleted.IAuthTabCallback(function1, obj);
                }
            });
            int i2 = onNavigationEvent + 89;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onNavigationEvent(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity, Throwable th) throws Throwable {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
                String string = passwordFragment.getString(R.string.app_password___6fc791729d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intrinsics.checkNotNull(th);
                passwordFragment.onNavigationEvent(string, accesssetMapp.onWarmupCompleted(th, passwordSettingActivity));
                unit = Unit.INSTANCE;
                int i3 = 43 / 0;
            } else {
                isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
                String string2 = passwordFragment.getString(R.string.app_password___6fc791729d);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Intrinsics.checkNotNull(th);
                passwordFragment.onNavigationEvent(string2, accesssetMapp.onWarmupCompleted(th, passwordSettingActivity));
                unit = Unit.INSTANCE;
            }
            int i4 = onNavigationEvent + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final void onExtraCallback(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) throws Throwable {
            int i = 2 % 2;
            PasswordSettingActivity.onExtraCallback(passwordSettingActivity, new GraniteBrownfieldModule_closeView(graniteBrownfieldModule_closeView));
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = passwordSettingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = supportFragmentManager.onExtraCallbackWithResult();
            Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(R.anim.slide_in_left, R.anim.slide_out_left, R.anim.slide_in_right, R.anim.slide_out_right);
            Object[] objArr = new Object[1];
            a(new char[]{43030, 35767, 61249, 49940, 9896, 6758, 32278}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9133, objArr);
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(((String) objArr[0]).intern());
            int i2 = R.id.password_setting_container;
            Fragment fragmentAccess000 = PasswordSettingActivity.access000(passwordSettingActivity);
            if (fragmentAccess000 == null) {
                int i3 = onNavigationEvent + 7;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentAccess000 = null;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{43030, 35767, 61249, 49940, 9896, 6758, 32278}, 9133 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(i2, fragmentAccess000, ((String) objArr2[0]).intern());
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback();
            int i5 = onNavigationEvent + 107;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallback_Parcel(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class writeTypedObject implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public writeTypedObject(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onWarmupCompleted.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(PasswordSettingActivity passwordSettingActivity, Throwable th, String str, String str2) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onNavigationEvent(1553083588, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, th, str, str2}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1553083574, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i3 = 90 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onNavigationEvent(1553083588, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, th, str, str2}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1553083574, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int i4 = ICustomTabsServiceStub + 103;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, String str, String str2) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        passwordSettingActivity.onExtraCallbackWithResult(graniteBrownfieldModule_closeView, str, str2);
        int i4 = ICustomTabsServiceStub + 89;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 61;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = passwordSettingActivity.receiveFile;
        int i5 = i3 + 51;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public static final /* synthetic */ asArray IAuthTabCallbackStubProxy(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 69;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            return (asArray) onNavigationEvent(-1081097150, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1081097154, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ isJSONTypeIgnore IAuthTabCallback_Parcel(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 113;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        isJSONTypeIgnore isjsontypeignore = passwordSettingActivity.ICustomTabsCallbackStub;
        int i5 = i2 + 109;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return isjsontypeignore;
    }

    public static final /* synthetic */ boolean ICustomTabsCallback(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreNotificationsEnabled = passwordSettingActivity.areNotificationsEnabled();
        int i4 = warmup + 73;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreNotificationsEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PasswordFragment access000(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 47;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        PasswordFragment passwordFragment = passwordSettingActivity.onRelationshipValidationResult;
        int i5 = i2 + 13;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return passwordFragment;
    }

    public static final /* synthetic */ GraniteBrownfieldModule_closeView access100(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 9;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) onNavigationEvent(-1796928967, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1796928978, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = ICustomTabsServiceStub + 41;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return graniteBrownfieldModule_closeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CERT_VerifyVID asInterface(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 119;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        CERT_VerifyVID cERT_VerifyVIDIPostMessageServiceDefault = passwordSettingActivity.IPostMessageServiceDefault();
        int i4 = ICustomTabsServiceStub + 33;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return cERT_VerifyVIDIPostMessageServiceDefault;
    }

    public static final /* synthetic */ GetBillingConfigParamsBuilder extraCallbackWithResult(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 111;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        GetBillingConfigParamsBuilder getBillingConfigParamsBuilder = passwordSettingActivity.prefetchWithMultipleUrls;
        int i5 = i3 + 71;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return getBillingConfigParamsBuilder;
    }

    public static final /* synthetic */ asArray getInterfaceDescriptor(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 87;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return passwordSettingActivity.ITrustedWebActivityCallbackStubProxy();
        }
        passwordSettingActivity.ITrustedWebActivityCallbackStubProxy();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 9;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        passwordSettingActivity.onWarmupCompleted(graniteBrownfieldModule_closeView);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 3;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        passwordSettingActivity.onExtraCallback(graniteBrownfieldModule_closeView, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = warmup + 107;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ PasswordVerifyViewModel readTypedObject(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 85;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        PasswordVerifyViewModel passwordVerifyViewModelNotifyNotificationWithChannel = passwordSettingActivity.notifyNotificationWithChannel();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return passwordVerifyViewModelNotifyNotificationWithChannel;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup + 115;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zIEngagementSignalsCallbackStub = super.IEngagementSignalsCallbackStub();
        int i4 = ICustomTabsServiceStub + 75;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return zIEngagementSignalsCallbackStub;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 37;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zIEngagementSignalsCallbackStubProxy = super.IEngagementSignalsCallbackStubProxy();
        int i4 = ICustomTabsServiceStub + 121;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return zIEngagementSignalsCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 123;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return super.setEngagementSignalsCallback();
        }
        super.setEngagementSignalsCallback();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ String updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 37;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return super.updateVisuals();
        }
        super.updateVisuals();
        throw null;
    }

    private final PasswordVerifyViewModel notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = warmup + 85;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) this.updateVisuals.getValue();
        int i4 = warmup + 23;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return passwordVerifyViewModel;
    }

    private final CERT_VerifyVID IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = warmup + 93;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        CERT_VerifyVID cERT_VerifyVID = (CERT_VerifyVID) this.onActivityLayout.getValue();
        int i4 = warmup + 109;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return cERT_VerifyVID;
        }
        throw null;
    }

    public final SessionTrackerb IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = warmup + 115;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 45;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return sessionTrackerb;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ExternalOfferInformationDialogListener externalOfferInformationDialogListener = passwordSettingActivity.globalResetPasswordIntent;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        if (externalOfferInformationDialogListener != null) {
            return externalOfferInformationDialogListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsServiceStub + 45;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onExtraCallbackWithResult implements PasswordFragment.IAuthTabCallback {
        final /* synthetic */ PasswordFragment onExtraCallback;
        final /* synthetic */ PasswordSettingActivity onNavigationEvent;
        private static final byte[] $$a = {48, -42, 66, -37};
        private static final int $$b = 112;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int asInterface = 1;
        private static char[] IAuthTabCallback = {60855, 26542, 63891, 29574, 50671, 24531, 60836, 26528, 63885, 29592, 50679, 24530, 53720, 11043, 48419, 14107, 35171, 832, 38221, 61105, 60834, 26536, 63899, 29596};
        private static long onExtraCallbackWithResult = 4938230860268201921L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, byte r8, short r9) {
            /*
                int r9 = r9 * 4
                int r9 = 3 - r9
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r0 = viva.republica.toss.password.PasswordSettingActivity.onExtraCallbackWithResult.$$a
                int r8 = r8 * 2
                int r8 = 97 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2d
            L17:
                r3 = r2
            L18:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L27:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onExtraCallbackWithResult.$$c(byte, byte, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x033a  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x033b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 836
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onExtraCallbackWithResult.a(int, int, char, java.lang.Object[]):void");
        }

        onExtraCallbackWithResult(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity) {
            this.onExtraCallback = passwordFragment;
            this.onNavigationEvent = passwordSettingActivity;
        }

        @Override // viva.republica.toss.password.PasswordFragment.IAuthTabCallback
        public void IAuthTabCallback() throws Throwable {
            Intent intentIAuthTabCallback;
            int i = 2 % 2;
            Object[] objArr = new Object[1];
            a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - TextUtils.lastIndexOf("", '0', 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0) + 20, 3 - TextUtils.lastIndexOf("", '0'), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr3);
            Object[] objArr4 = {iAuthTabCallback.onNavigationEvent(((String) objArr3[0]).intern(), this.onExtraCallback.getScreenName()).onWarmupCompleted()};
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, objArr4, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            if (((zzad) PasswordSettingActivity.onNavigationEvent(-1777060186, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this.onNavigationEvent}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1777060196, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).AudioAttributesImplApi21Parcelizer()) {
                int i2 = onWarmupCompleted + 109;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                intentIAuthTabCallback = PasswordResetIntroActivity.IAuthTabCallback.onNavigationEvent(PasswordResetIntroActivity.Companion, this.onNavigationEvent, false, 2, null);
                int i4 = asInterface + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                intentIAuthTabCallback = ExternalOfferInformationDialogListener.IAuthTabCallback((ExternalOfferInformationDialogListener) PasswordSettingActivity.onNavigationEvent(-1149318756, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this.onNavigationEvent}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1149318771, onAdViewAdDisplayFailed.onExtraCallbackWithResult()), this.onNavigationEvent, false, 2, (Object) null);
            }
            this.onExtraCallback.startActivity(intentIAuthTabCallback);
            this.onNavigationEvent.finish();
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(ICustomTabsServiceDefault[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 59649), ExpandableListView.getPackedPositionChild(0L) + 18, ExpandableListView.getPackedPositionChild(0L) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(validateRelationship), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, View.resolveSizeAndState(0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.getDefaultSize(0, 0)), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16778710, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 5;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 44 - View.MeasureSpec.getSize(0), 1494 - View.MeasureSpec.makeMeasureSpec(0, 0), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 81;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 29;
        viva.republica.toss.password.PasswordSettingActivity.warmup = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getBillingPeriod ICustomTabsServiceStubProxy() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r1 = r1 + 47
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.getBillingPeriod r1 = r4.regionManager
            r3 = 17
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            o.getBillingPeriod r1 = r4.regionManager
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 29
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r3
            int r2 = r2 % r0
            return r1
        L23:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStubProxy():o.getBillingPeriod");
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 41;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        Object obj = null;
        r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I r8lambda64ntrhb_s1hyov1a8m7aetzo0i = passwordSettingActivity.passwordRepository;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        if (r8lambda64ntrhb_s1hyov1a8m7aetzo0i == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 121;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return r8lambda64ntrhb_s1hyov1a8m7aetzo0i;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 1;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        ACAuthRequest aCAuthRequest = passwordSettingActivity.euOnboardingBiometricCheckDialog;
        if (i3 != 0) {
            throw null;
        }
        if (aCAuthRequest != null) {
            return aCAuthRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = warmup + 95;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r4 % 2) == 0) goto L12;
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
        r4 = viva.republica.toss.password.PasswordSettingActivity.warmup + 53;
        viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r4 % 128;
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onTransact(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            viva.republica.toss.password.PasswordSettingActivity r4 = (viva.republica.toss.password.PasswordSettingActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r2 = r2 + 31
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r3
            int r2 = r2 % r1
            o.zzad r4 = r4.environments
            if (r2 != 0) goto L1b
            r2 = 92
            int r2 = r2 / r0
            if (r4 == 0) goto L1e
            goto L1d
        L1b:
            if (r4 == 0) goto L1e
        L1d:
            return r4
        L1e:
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r4 = r4 + 53
            int r0 = r4 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r0
            int r4 = r4 % r1
            r0 = 0
            if (r4 == 0) goto L30
            return r0
        L30:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onTransact(java.lang.Object[]):java.lang.Object");
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static char onExtraCallback = 5654;
        private static char onExtraCallbackWithResult = 40655;
        private static char onNavigationEvent = 36684;
        private static char onWarmupCompleted = 19505;
        final /* synthetic */ String $bioAuthCheckYn;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, String str, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$bioAuthCheckYn = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = PasswordSettingActivity.this.new IAuthTabCallbackStub(this.$password, this.$bioAuthCheckYn, access13800Var);
            int i2 = IAuthTabCallback + 41;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            return objInvokeSuspend;
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
                    int i6 = $11 + 103;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 1);
                            int i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int size = 12434 - View.MeasureSpec.getSize(i3);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, i10, size, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10, 12435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
                        int i11 = $11 + 29;
                        $10 = i11 % 128;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16014), Color.green(0) + 14, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
        
            if (r0 != r14) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x017f, code lost:
        
            if (r0.IAuthTabCallback(r1, r2, r4, r5, r6, r8, (64 & 64) != 0 ? false : false, r25) == r14) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x01cf, code lost:
        
            if (r0.onExtraCallbackWithResult(r2, r3, r4, r5, r6, r8, r7, r25) == r14) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x01d1, code lost:
        
            r0 = viva.republica.toss.password.PasswordSettingActivity.IAuthTabCallbackStub.IAuthTabCallback + 55;
            viva.republica.toss.password.PasswordSettingActivity.IAuthTabCallbackStub.IAuthTabCallbackDefault = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x01da, code lost:
        
            return r14;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0182  */
        /* JADX WARN: Type inference failed for: r2v7, types: [android.content.Context, viva.republica.toss.password.PasswordSettingActivity] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.IAuthTabCallbackStub.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 63;
        ICustomTabsServiceStub = i2 % 128;
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) (i2 % 2 == 0 ? passwordSettingActivity.prefetch.getValue(passwordSettingActivity, asBinder[1]) : passwordSettingActivity.prefetch.getValue(passwordSettingActivity, asBinder[0]));
        int i3 = warmup + 3;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            return graniteBrownfieldModule_closeView;
        }
        throw null;
    }

    private final void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        ObservableProperty observableProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            observableProperty = this.prefetch;
            addallcommandline = asBinder[1];
        } else {
            observableProperty = this.prefetch;
            addallcommandline = asBinder[0];
        }
        observableProperty.setValue(this, addallcommandline, graniteBrownfieldModule_closeView);
        int i3 = warmup + 107;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.setEngagementSignalsCallback.getValue()).booleanValue();
        int i4 = ICustomTabsServiceStub + 29;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onRelationshipValidationResult(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordSettingActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            a(77 - View.combineMeasuredStates(1, 1), ViewConfiguration.getKeyRepeatTimeout() * 21, (char) (160 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))), objArr);
            str = (String) objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(91 - View.combineMeasuredStates(0, 0), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17571), objArr2);
            str = (String) objArr2[0];
        }
        boolean booleanExtra = intent.getBooleanExtra(str.intern(), false);
        int i4 = warmup + 39;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return booleanExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String cancelNotification() {
        int i = 2 % 2;
        int i2 = warmup + 95;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.requestPostMessageChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = warmup + 83;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String read() {
        String string;
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            string = UUID.randomUUID().toString();
            int i3 = 18 / 0;
        } else {
            string = UUID.randomUUID().toString();
        }
        int i4 = warmup + 29;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 99;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setTestMode.onExtraCallback.onTransact();
            obj.hashCode();
            throw null;
        }
        asArray asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
        int i3 = ICustomTabsServiceStub + 47;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return asarrayOnTransact;
        }
        throw null;
    }

    private final asArray ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 37;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        setTestMode settestmode = setTestMode.onExtraCallback;
        if (i3 == 0) {
            return settestmode.getInterfaceDescriptor();
        }
        settestmode.getInterfaceDescriptor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.isEngagementSignalsApiAvailable.getValue()).booleanValue();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onActivityLayout(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        boolean booleanExtra;
        int i = 2 % 2;
        int i2 = warmup + 89;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordSettingActivity.getIntent();
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (i3 == 0) {
            Object[] objArr = new Object[1];
            a(11864 >> (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), 51 - (ViewConfiguration.getScrollBarSize() % 33), (char) (ViewConfiguration.getPressedStateDuration() + 20), objArr);
            booleanExtra = intent.getBooleanExtra(((String) objArr[0]).intern(), true);
        } else {
            Object[] objArr2 = new Object[1];
            a(260 - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), 35 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            booleanExtra = intent.getBooleanExtra(((String) objArr2[0]).intern(), false);
        }
        int i4 = ICustomTabsServiceStub + 33;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final UTF8Decoder onSessionEnded() {
        int i = 2 % 2;
        int i2 = warmup + 23;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8Decoder = (UTF8Decoder) this.onMessageChannelReady.getValue();
        int i4 = ICustomTabsServiceStub + 95;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return uTF8Decoder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final UTF8Decoder writeTypedObject(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 61;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries entries = UTF8Decoder.getEntries();
        Intent intent = passwordSettingActivity.getIntent();
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 142, 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20169), objArr);
        UTF8Decoder uTF8Decoder = (UTF8Decoder) CollectionsKt.getOrNull(entries, intent.getIntExtra(((String) objArr[0]).intern(), -1));
        int i4 = warmup + 27;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return uTF8Decoder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final long ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 81;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.onUnminimized.getValue()).longValue();
        int i4 = warmup + 37;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long onMessageChannelReady(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 123;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordSettingActivity.getIntent();
        Object[] objArr = new Object[1];
        a(320 - Color.blue(0), KeyEvent.getDeadChar(0, 0) + 15, (char) (ExpandableListView.getPackedPositionChild(0L) + 47920), objArr);
        long longExtra = intent.getLongExtra(((String) objArr[0]).intern(), 0L);
        int i4 = ICustomTabsServiceStub + 37;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return longExtra;
    }

    private final shortValue.onNavigationEvent IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsCallbackDefault.getValue();
        if (i3 == 0) {
            return (shortValue.onNavigationEvent) value;
        }
        int i4 = 16 / 0;
        return (shortValue.onNavigationEvent) value;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 33;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = warmup + 89;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 == 0) {
                passwordSettingActivity.getSmallIconBitmap();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            passwordSettingActivity.getSmallIconBitmap();
        } else {
            passwordSettingActivity.finish();
            int i5 = ICustomTabsServiceStub + 99;
            warmup = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 3;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        if (RemoteActionCompatParcelizer()) {
            Intent intentOnExtraCallbackWithResult = IEngagementSignalsCallback().onExtraCallbackWithResult(this);
            intentOnExtraCallbackWithResult.addFlags(67108864);
            intentOnExtraCallbackWithResult.addFlags(32768);
            intentOnExtraCallbackWithResult.addFlags(268435456);
            getNavigationBar.IAuthTabCallback(intentOnExtraCallbackWithResult, this);
        }
        super.finish();
        if (ITrustedWebActivityService()) {
            overridePendingTransition(0, 0);
            int i2 = ICustomTabsServiceStub + 25;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 2;
            }
        }
        int i4 = warmup + 27;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        if (setTestMode.onExtraCallback.onActivityResized()) {
            int i2 = ICustomTabsServiceStub + 11;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            j = 1222813;
        } else {
            int i4 = warmup + 31;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            j = 1009613;
        }
        return Long.valueOf(j);
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String IEngagementSignalsCallbackDefault() {
        String strCancelNotification;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            strCancelNotification = cancelNotification();
            int i3 = 89 / 0;
        } else {
            strCancelNotification = cancelNotification();
        }
        int i4 = ICustomTabsServiceStub + 101;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return strCancelNotification;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 37;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.requestPostMessageChannelWithExtras.getValue()).booleanValue();
        int i4 = warmup + 11;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        BaseActivity baseActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 43;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            isJacksonCreator.Companion.IAuthTabCallback(baseActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = isJacksonCreator.Companion.IAuthTabCallback(baseActivity);
        int i3 = ICustomTabsServiceStub + 81;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (((viva.republica.toss.password.PasswordFragment.onNavigationEvent) viva.republica.toss.password.PasswordFragment.onNavigationEvent(-853005714, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new java.lang.Object[]{r2})) == viva.republica.toss.password.PasswordFragment.onNavigationEvent.AUTH) goto L17;
     */
    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> ICustomTabsServiceStub() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub():java.util.Map");
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IndicatorView indicatorView = (IndicatorView) passwordSettingActivity.ICustomTabsCallbackStubProxy.getValue();
        int i4 = warmup + 33;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return indicatorView;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        BaseActivity baseActivity = (PasswordSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = baseActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 161, (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, (char) Color.alpha(0), objArr2);
        IndicatorView serializableExtra = intent.getSerializableExtra(((String) objArr2[0]).intern());
        if (!(serializableExtra instanceof IndicatorView)) {
            return null;
        }
        int i4 = ICustomTabsServiceStub;
        int i5 = i4 + 123;
        warmup = i5 % 128;
        IndicatorView indicatorView = serializableExtra;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        int i7 = i4 + 45;
        warmup = i7 % 128;
        int i8 = i7 % 2;
        return indicatorView;
    }

    private final IndicatorView ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = warmup + 79;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IndicatorView indicatorViewAccess100 = (IndicatorView) onNavigationEvent(192804570, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -192804553, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        if (indicatorViewAccess100 == null) {
            indicatorViewAccess100 = createPaints.IAuthTabCallback.access100();
            int i4 = warmup + 69;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = warmup + 37;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return indicatorViewAccess100;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements PasswordFragment.onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        private static char[] onNavigationEvent = {27233, 27166, 27143, 27165, 27160, 27136, 27147, 27140, 27162, 27160, 27159, 27167, 27141, 27166, 27165, 27163, 27165, 27140, 27142, 27161, 27163, 27145, 27146, 27144, 27147, 27167, 27164, 27141, 27353, 27495, 27473, 27503, 27257, 27195, 27188, 27187, 27185, 27187, 27194, 27196, 27343, 27339, 27190, 27197, 27342, 27188, 27197, 27187, 27342, 27190};
        final /* synthetic */ PasswordFragment IAuthTabCallback;
        final /* synthetic */ PasswordSettingActivity onExtraCallbackWithResult;
        final /* synthetic */ PasswordSettingActivity onWarmupCompleted;

        /* renamed from: viva.republica.toss.password.PasswordSettingActivity$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final /* synthetic */ class C0031IAuthTabCallback {
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[PasswordFragment.onNavigationEvent.values().length];
                try {
                    iArr[PasswordFragment.onNavigationEvent.AUTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PasswordFragment.onNavigationEvent.INPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PasswordFragment.onNavigationEvent.CONFIRM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onWarmupCompleted = iArr;
            }
        }

        public static /* synthetic */ void IAuthTabCallback(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, PasswordFragment passwordFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(passwordSettingActivity, graniteBrownfieldModule_closeView, passwordFragment);
            int i4 = onExtraCallback + 13;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ Unit onWarmupCompleted(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(passwordFragment, passwordSettingActivity, th);
            int i4 = onExtraCallback + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(function1, obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onNavigationEvent;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35282), 35 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10935), 65 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, 17657 - Color.green(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49467), (Process.myTid() >> 22) + 70, 12486 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
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
                int i14 = $10 + 3;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 4 % 4;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
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

        IAuthTabCallback(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity, PasswordSettingActivity passwordSettingActivity2) {
            this.IAuthTabCallback = passwordFragment;
            this.onWarmupCompleted = passwordSettingActivity;
            this.onExtraCallbackWithResult = passwordSettingActivity2;
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            PasswordFragment.onNavigationEvent onnavigationevent = (PasswordFragment.onNavigationEvent) PasswordFragment.onNavigationEvent(-853005714, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this.IAuthTabCallback});
            int i2 = onnavigationevent == null ? -1 : C0031IAuthTabCallback.onWarmupCompleted[onnavigationevent.ordinal()];
            if (i2 == 1) {
                _get_isNull_lambda0 _get_isnull_lambda0 = _get_isNull_lambda0.onExtraCallbackWithResult;
                _get_isnull_lambda0.onExtraCallbackWithResult(str);
                _get_isnull_lambda0.IAuthTabCallback(str2);
                PasswordVerifyViewModel.onNavigationEvent(PasswordSettingActivity.readTypedObject(this.onWarmupCompleted), (Context) this.onWarmupCompleted, graniteBrownfieldModule_closeView, z, false, 8, (Object) null);
                return;
            }
            if (i2 == 2) {
                wasLastName waslastnameOnExtraCallback = DynamicFromArrayCompanion.onExtraCallback(DynamicFromArrayCompanion.onExtraCallbackWithResult, PasswordSettingActivity.getInterfaceDescriptor(this.onWarmupCompleted), graniteBrownfieldModule_closeView, this.onExtraCallbackWithResult, null, Long.valueOf(((Long) PasswordSettingActivity.onNavigationEvent(1090041940, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this.onWarmupCompleted}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1090041928, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue()), 8, null);
                final PasswordSettingActivity passwordSettingActivity = this.onWarmupCompleted;
                final PasswordFragment passwordFragment = this.IAuthTabCallback;
                deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$1$3$$ExternalSyntheticLambda0
                    public final void run() throws Throwable {
                        PasswordSettingActivity.IAuthTabCallback.IAuthTabCallback(passwordSettingActivity, graniteBrownfieldModule_closeView, passwordFragment);
                    }
                };
                final PasswordFragment passwordFragment2 = this.IAuthTabCallback;
                final PasswordSettingActivity passwordSettingActivity2 = this.onWarmupCompleted;
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$1$3$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return PasswordSettingActivity.IAuthTabCallback.onWarmupCompleted(passwordFragment2, passwordSettingActivity2, (Throwable) obj);
                    }
                };
                Intrinsics.checkNotNull(waslastnameOnExtraCallback.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.password.PasswordSettingActivity$initLayout$1$3$$ExternalSyntheticLambda2
                    public final void accept(Object obj) {
                        PasswordSettingActivity.IAuthTabCallback.onWarmupCompleted(function1, obj);
                    }
                }));
                int i3 = IAuthTabCallbackDefault + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            if (i2 != 3) {
                int i5 = IAuthTabCallbackDefault + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Arrays.equals(PasswordSettingActivity.access100(this.onWarmupCompleted).onWarmupCompleted(), graniteBrownfieldModule_closeView.onWarmupCompleted())) {
                isOneShot.onExtraCallbackWithResult(this.IAuthTabCallback, noStore.Companion.onWarmupCompleted());
                PasswordFragment passwordFragment3 = this.IAuthTabCallback;
                String string = passwordFragment3.getString(R.string.app_password___2b0dfbe59d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = this.IAuthTabCallback.getString(R.string.app_password___144508c89b);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                passwordFragment3.onNavigationEvent(string, string2);
                return;
            }
            if (!PasswordSettingActivity.ICustomTabsCallback(this.onWarmupCompleted)) {
                PasswordSettingActivity.IAuthTabCallback(this.onWarmupCompleted, graniteBrownfieldModule_closeView, str, str2);
                return;
            }
            Intent intent = new Intent();
            byte[] bArrOnWarmupCompleted = PasswordSettingActivity.access100(this.onWarmupCompleted).onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(new int[]{32, 18, 42, 0}, true, new byte[]{0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1}, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), bArrOnWarmupCompleted);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            this.onWarmupCompleted.setResult(-1, intentPutExtra);
            this.onWarmupCompleted.finish();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final void onNavigationEvent(PasswordSettingActivity passwordSettingActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, PasswordFragment passwordFragment) throws Throwable {
            int i = 2 % 2;
            PasswordSettingActivity.onExtraCallback(passwordSettingActivity, new GraniteBrownfieldModule_closeView(graniteBrownfieldModule_closeView));
            Intent intent = passwordSettingActivity.getIntent();
            Object[] objArr = new Object[1];
            a(new int[]{0, 28, 0, 6}, true, new byte[]{1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1}, objArr);
            UTF8Decoder serializableExtra = intent.getSerializableExtra(((String) objArr[0]).intern());
            Object obj = null;
            UTF8Decoder uTF8Decoder = serializableExtra instanceof UTF8Decoder ? serializableExtra : null;
            if (uTF8Decoder == null) {
                int i2 = onExtraCallback + 75;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    UTF8Decoder uTF8Decoder2 = UTF8Decoder.SETTING_RECHECK;
                    obj.hashCode();
                    throw null;
                }
                uTF8Decoder = UTF8Decoder.SETTING_RECHECK;
                int i3 = IAuthTabCallbackDefault + 5;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            Bundle extras = passwordSettingActivity.getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
                int i5 = onExtraCallback + 93;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 4;
                }
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{28, 4, 181, 3}, false, new byte[]{0, 1, 1, 1}, objArr2);
            extras.putSerializable(((String) objArr2[0]).intern(), uTF8Decoder);
            passwordFragment.setArguments(extras);
            passwordFragment.onNavigationEvent(PasswordFragment.onNavigationEvent.CONFIRM, uTF8Decoder);
        }

        private static final void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            int i4 = IAuthTabCallbackDefault + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallback(PasswordFragment passwordFragment, PasswordSettingActivity passwordSettingActivity, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
                String string = passwordFragment.getString(R.string.app_password___6fc791729d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intrinsics.checkNotNull(th);
                passwordFragment.onNavigationEvent(string, accesssetMapp.onWarmupCompleted(th, passwordSettingActivity));
                int i3 = 21 / 0;
                return Unit.INSTANCE;
            }
            isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
            String string2 = passwordFragment.getString(R.string.app_password___6fc791729d);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Intrinsics.checkNotNull(th);
            passwordFragment.onNavigationEvent(string2, accesssetMapp.onWarmupCompleted(th, passwordSettingActivity));
            return Unit.INSTANCE;
        }
    }

    public static final class asInterface implements PasswordFragment.onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27232, 27179, 27171, 27172, 27182, 27177, 27171, 27182, 27179, 27196, 27168, 27153, 27183, 27172, 27170, 27172, 27177, 27180};
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ PasswordFragment onExtraCallback;

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int length;
            char[] cArr2;
            int i = 2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr3 = IAuthTabCallback;
            if (cArr3 != null) {
                int i7 = $10 + 55;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 43;
                    $11 = i9 % 128;
                    if (i9 % i == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35283), 35 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 35283), 35 - View.MeasureSpec.makeMeasureSpec(0, 0), 14239 - TextUtils.getCapsMode("", 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i8++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i = 2;
                }
                cArr3 = cArr2;
            }
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr3, i3, cArr4, 0, i4);
            if (bArr != null) {
                int i10 = $11 + 101;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 1;
                } else {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 65 - View.MeasureSpec.makeMeasureSpec(0, 0), 16717 - ExpandableListView.getPackedPositionChild(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 29 - KeyEvent.getDeadChar(0, 0), 17657 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 70 - (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                int i13 = $10 + 125;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr4, 0, cArr5, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr4, i15, i6);
                System.arraycopy(cArr5, i6, cArr4, 0, i15);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        asInterface(PasswordFragment passwordFragment) {
            this.onExtraCallback = passwordFragment;
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            PasswordFragment passwordFragment = null;
            if (Arrays.equals(PasswordSettingActivity.access100(PasswordSettingActivity.this).onWarmupCompleted(), graniteBrownfieldModule_closeView.onWarmupCompleted())) {
                if (!PasswordSettingActivity.ICustomTabsCallback(PasswordSettingActivity.this)) {
                    PasswordSettingActivity.IAuthTabCallback(PasswordSettingActivity.this, graniteBrownfieldModule_closeView, str, str2);
                    int i2 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                Intent intent = new Intent();
                Object[] objArr = new Object[1];
                a(new int[]{0, 18, 23, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0}, objArr);
                Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), PasswordSettingActivity.access100(PasswordSettingActivity.this).onWarmupCompleted());
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
                PasswordSettingActivity.this.setResult(-1, intentPutExtra);
                PasswordSettingActivity.this.finish();
                return;
            }
            isOneShot.onExtraCallbackWithResult(this.onExtraCallback, noStore.Companion.onWarmupCompleted());
            PasswordFragment passwordFragmentAccess000 = PasswordSettingActivity.access000(PasswordSettingActivity.this);
            if (passwordFragmentAccess000 == null) {
                int i3 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                passwordFragment = passwordFragmentAccess000;
            }
            String string = this.onExtraCallback.getString(R.string.app_password___144508c89b);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = this.onExtraCallback.getString(R.string.app_password___2b0dfbe59d);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            passwordFragment.onNavigationEvent(string, string2);
        }
    }

    public static final class asBinder implements DynamicFromArrayCompanion.onExtraCallbackWithResult {
        asBinder() {
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onExtraCallbackWithResult() {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            return (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onNavigationEvent() {
            return StringsKt.takeLast(PlayerErrorCode.extraCallback(), 6);
        }
    }

    private static final void onActivityResized(PasswordSettingActivity passwordSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (passwordSettingActivity.ITrustedWebActivityServiceStub()) {
            passwordSettingActivity.ITrustedWebActivityServiceStubProxy();
            return;
        }
        passwordSettingActivity.getSmallIconBitmap();
        int i4 = warmup + 3;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 59;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 35;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 45;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e6  */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, im.toss.uikit.base.UIKitBaseActivity, java.lang.Object, viva.republica.toss.password.PasswordSettingActivity] */
    /* JADX WARN: Type inference failed for: r7v100, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v104, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v105, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v106, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v107, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v108, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v109, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v110, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v111, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v112, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v118, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v88, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v92, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v96, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.password.Hilt_PasswordSettingActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.password.PasswordSettingActivity r3, java.lang.Boolean r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            boolean r4 = r4.booleanValue()
            r1 = 38
            int r1 = r1 / r2
            r4 = r4 ^ 1
            if (r4 == 0) goto L21
            goto L27
        L1b:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L27
        L21:
            r4 = 3
            r1 = 0
            im.toss.base.BaseActivity.IAuthTabCallback(r3, r1, r2, r4, r1)
            goto L2a
        L27:
            r3.bo_()
        L2a:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r4 = r4 + 51
            int r1 = r4 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r1
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onWarmupCompleted(viva.republica.toss.password.PasswordSettingActivity, java.lang.Boolean):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(PasswordSettingActivity passwordSettingActivity, UTF8Decoder uTF8Decoder, asDouble asdouble) throws Throwable {
        UTF8Decoder uTF8Decoder2;
        int i = 2 % 2;
        Fragment fragment = null;
        if (passwordSettingActivity.newSession == null) {
            int i2 = warmup + 39;
            ICustomTabsServiceStub = i2 % 128;
            if (i2 % 2 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        if (!asdouble.onExtraCallbackWithResult()) {
            int i3 = ICustomTabsServiceStub + 25;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            if (!asdouble.onNavigationEvent() && !StringsKt.isBlank(asdouble.IAuthTabCallback())) {
                Object[] objArr = new Object[1];
                a(Color.blue(0) + 475, KeyEvent.normalizeMetaState(0) + 7, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29679), objArr);
                passwordSettingActivity.onNavigationEvent(((String) objArr[0]).intern());
                Intrinsics.checkNotNull(asdouble);
                passwordSettingActivity.ICustomTabsCallbackStub = supportWideGamut.onNavigationEvent(asdouble, uTF8Decoder);
                Fragment fragment2 = passwordSettingActivity.newSession;
                if (fragment2 == null) {
                    int i5 = warmup + 111;
                    ICustomTabsServiceStub = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i6 = 45 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                } else {
                    fragment = fragment2;
                }
                if (passwordSettingActivity.areNotificationsEnabled()) {
                    int i7 = ICustomTabsServiceStub + 61;
                    warmup = i7 % 128;
                    int i8 = i7 % 2;
                    uTF8Decoder2 = UTF8Decoder.SETTING_CERT;
                } else {
                    uTF8Decoder2 = UTF8Decoder.SETTING;
                }
                Bundle extras = passwordSettingActivity.getIntent().getExtras();
                if (extras == null) {
                    extras = new Bundle();
                    int i9 = warmup + 111;
                    ICustomTabsServiceStub = i9 % 128;
                    int i10 = i9 % 2;
                }
                Object[] objArr2 = new Object[1];
                a(458 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 4 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
                extras.putSerializable(((String) objArr2[0]).intern(), uTF8Decoder2);
                fragment.setArguments(extras);
                fragment.onNavigationEvent(PasswordFragment.onNavigationEvent.INPUT, uTF8Decoder2);
                return Unit.INSTANCE;
            }
        }
        PasswordFragment passwordFragment = passwordSettingActivity.newSession;
        if (passwordFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        PasswordFragment.onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment, null, 1, null});
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, Pair pair) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        CharSequence charSequence = (CharSequence) pair.onExtraCallbackWithResult();
        CharSequence charSequence2 = (CharSequence) pair.IAuthTabCallback();
        PasswordFragment passwordFragment = passwordSettingActivity.newSession;
        if (passwordFragment == null) {
            int i2 = ICustomTabsServiceStub + 73;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                unit = Unit.INSTANCE;
                int i3 = 93 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i4 = ICustomTabsServiceStub + 45;
            warmup = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return unit;
        }
        PasswordFragment passwordFragment2 = null;
        if (passwordFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = warmup + 19;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            passwordFragment = null;
        }
        if (((PasswordFragment.onNavigationEvent) PasswordFragment.onNavigationEvent(-853005714, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment})) == PasswordFragment.onNavigationEvent.AUTH) {
            Object[] objArr = new Object[1];
            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 482, View.getDefaultSize(0, 0) + 4, (char) (782 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            passwordSettingActivity.onNavigationEvent(((String) objArr[0]).intern());
        }
        PasswordFragment passwordFragment3 = passwordSettingActivity.newSession;
        if (passwordFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            passwordFragment2 = passwordFragment3;
        }
        passwordFragment2.onNavigationEvent(charSequence, charSequence2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        String str = (String) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 29;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = warmup + 39;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, final String str) {
        Unit unit;
        int i = 2 % 2;
        PasswordFragment passwordFragment = passwordSettingActivity.newSession;
        if (passwordFragment == null) {
            int i2 = ICustomTabsServiceStub + 69;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                unit = Unit.INSTANCE;
                int i3 = 44 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i4 = ICustomTabsServiceStub + 59;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        if (passwordFragment == null) {
            int i5 = ICustomTabsServiceStub + 57;
            warmup = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        passwordFragment.extraCommand();
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(passwordSettingActivity, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return PasswordSettingActivity.IAuthTabCallback(str, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(486 - ExpandableListView.getPackedPositionType(0L), 6 - (Process.myPid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(491 - TextUtils.lastIndexOf("", '0'), 14 - View.MeasureSpec.getSize(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(506 - KeyEvent.keyCodeFromString(""), Color.argb(0, 0, 0, 0) + 4, (char) (1951 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr3);
        Object[] objArr4 = {iAuthTabCallback.onNavigationEvent(((String) objArr3[0]).intern(), passwordSettingActivity.getScreenName()).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr4, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        passwordSettingActivity.startActivity(PasswordResetIntroActivity.Companion.onExtraCallback(passwordSettingActivity, passwordSettingActivity.RemoteActionCompatParcelizer()));
        passwordSettingActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i2 = warmup + 93;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ITrustedWebActivityService_Parcel() throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            o.UTF8Decoder r1 = r11.onSessionEnded()
            r3 = 73
            int r3 = r3 / r2
            if (r1 != 0) goto L2a
            goto L1f
        L19:
            o.UTF8Decoder r1 = r11.onSessionEnded()
            if (r1 != 0) goto L2a
        L1f:
            o.UTF8Decoder r1 = o.UTF8Decoder.SETTING
            int r3 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r3 = r3 + 125
            int r4 = r3 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r4
            int r3 = r3 % r0
        L2a:
            viva.republica.toss.password.PasswordVerifyViewModel r3 = r11.notifyNotificationWithChannel()
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r1}
            int r7 = o.nSetPosition.onExtraCallbackWithResult()
            int r9 = o.nSetPosition.onExtraCallbackWithResult()
            int r10 = o.nSetPosition.onExtraCallbackWithResult()
            int r6 = o.nSetPosition.onExtraCallbackWithResult()
            r5 = 1471529934(0x57b5c3ce, float:3.9970516E14)
            r4 = -1471529929(0xffffffffa84a3c37, float:-1.12263096E-14)
            viva.republica.toss.password.PasswordVerifyViewModel.onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            viva.republica.toss.password.PasswordVerifyViewModel r3 = r11.notifyNotificationWithChannel()
            long r4 = r11.ITrustedWebActivityCallbackStub()
            r3.onExtraCallbackWithResult(r4)
            viva.republica.toss.password.PasswordVerifyViewModel r3 = r11.notifyNotificationWithChannel()
            r3.onExtraCallbackWithResult(r2)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            androidx.lifecycle.MutableLiveData r2 = r2.IAuthTabCallback()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda25 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda25
            r4.<init>(r11)
            r3.<init>(r4)
            r2.observe(r11, r3)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            androidx.lifecycle.MutableLiveData r2 = r2.onExtraCallback()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda26 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda26
            r4.<init>(r11, r1)
            r3.<init>(r4)
            r2.observe(r11, r3)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            androidx.lifecycle.MutableLiveData r2 = r2.onNavigationEvent()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda27 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda27
            r4.<init>(r11)
            r3.<init>(r4)
            r2.observe(r11, r3)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            androidx.lifecycle.MutableLiveData r2 = r2.onExtraCallbackWithResult()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda28 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda28
            r4.<init>(r11)
            r3.<init>(r4)
            r2.observe(r11, r3)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            o.Rmipmap r2 = r2.onWarmupCompleted()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda29 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda29
            r4.<init>(r11)
            r3.<init>(r4)
            r2.observe(r11, r3)
            viva.republica.toss.password.PasswordVerifyViewModel r2 = r11.notifyNotificationWithChannel()
            o.Rmipmap r2 = r2.onTransact()
            viva.republica.toss.password.PasswordSettingActivity$access100 r3 = new viva.republica.toss.password.PasswordSettingActivity$access100
            viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda30 r4 = new viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda30
            r4.<init>(r11, r1)
            r3.<init>(r4)
            r2.observe(r11, r3)
            int r1 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r1 = r1 + 53
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.ITrustedWebActivityService_Parcel():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(UTF8Decoder uTF8Decoder, PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(View.resolveSize(0, 0) + 514, (-16777210) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a(AndroidCharacter.getMirror('0') + 410, 4 - View.getDefaultSize(0, 0), (char) View.combineMeasuredStates(0, 0), objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), uTF8Decoder.getEventValue());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder);
        Object[] objArr3 = new Object[1];
        a(Color.green(0) + 462, 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), passwordSettingActivity.getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(uTF8Decoder);
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 520, Color.green(0) + 11, (char) (49779 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordSettingActivity.getString(iIAuthTabCallback));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 531, 11 - (Process.myTid() >> 22), (char) (52656 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr5);
        String strIntern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 482, 4 - Color.alpha(0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 782), objArr6);
        mapOnExtraCallback5.put(strIntern, ((String) objArr6[0]).intern());
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        a(542 - TextUtils.indexOf("", "", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (char) TextUtils.indexOf("", "", 0, 0), objArr7);
        Object obj = mapOnExtraCallback6.get(((String) objArr7[0]).intern());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 31 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24887 - KeyEvent.getDeadChar(0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 30 - (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24888, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            getWrite.IAuthTabCallback(obj, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue() + 1));
            setDetectableSize.onExtraCallback(passwordSettingActivity.ICustomTabsServiceStub());
            Unit unit = Unit.INSTANCE;
            int i4 = warmup + 51;
            ICustomTabsServiceStub = i4 % 128;
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

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(UTF8Decoder uTF8Decoder, PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(514 - ExpandableListView.getPackedPositionGroup(0L), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 458, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), uTF8Decoder.getEventValue());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(uTF8Decoder);
        Object[] objArr3 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 462, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), passwordSettingActivity.getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(uTF8Decoder);
        Object[] objArr4 = new Object[1];
        a(520 - Color.red(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, (char) (49780 - (KeyEvent.getMaxKeyCode() >> 16)), objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordSettingActivity.getString(iIAuthTabCallback));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 531, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, (char) (52656 - TextUtils.getTrimmedLength("")), objArr5);
        String strIntern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(481 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 783), objArr6);
        mapOnExtraCallback5.put(strIntern, ((String) objArr6[0]).intern());
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        a(553 - View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 12, (char) (ExpandableListView.getPackedPositionChild(0L) + 48063), objArr7);
        Object obj = mapOnExtraCallback6.get(((String) objArr7[0]).intern());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 31, 24886 - TextUtils.indexOf((CharSequence) "", '0', 0), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            getWrite.IAuthTabCallback(obj, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue()));
            setDetectableSize.onExtraCallback(passwordSettingActivity.ICustomTabsServiceStub());
            Unit unit = Unit.INSTANCE;
            int i4 = warmup + 3;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, UTF8Decoder uTF8Decoder, Unit unit) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub + 91;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            passwordSettingActivity.IEngagementSignalsCallback_Parcel();
            throw null;
        }
        shortValue.onNavigationEvent onnavigationeventIEngagementSignalsCallback_Parcel = passwordSettingActivity.IEngagementSignalsCallback_Parcel();
        if (onnavigationeventIEngagementSignalsCallback_Parcel == null) {
            int i4 = ICustomTabsServiceStub + 91;
            warmup = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
            i = -1;
        } else {
            i = onExtraCallback.onWarmupCompleted[onnavigationeventIEngagementSignalsCallback_Parcel.ordinal()];
        }
        if (i != -1) {
            int i6 = warmup + 11;
            ICustomTabsServiceStub = i6 % 128;
            if (i6 % 2 != 0 ? i == 1 : i == 0) {
                Object[] objArr = new Object[1];
                a(510 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr);
                ConvertByteArrayToFloatArray.onExtraCallback(1383322L, false, ((String) objArr[0]).intern(), (Map) null, new PasswordSettingActivity$.ExternalSyntheticLambda22(uTF8Decoder, passwordSettingActivity), 10, (Object) null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                asMaplambda6.onExtraCallback.onNavigationEvent().onNavigationEvent(new PasswordSettingActivity$.ExternalSyntheticLambda23(uTF8Decoder, passwordSettingActivity));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getActiveNotifications() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L23
            r4.overridePendingTransition(r2, r2)
            r4.setRequestedOrientation(r2)
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarColor(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 59
            if (r1 < r3) goto L3e
            goto L37
        L23:
            r4.overridePendingTransition(r2, r2)
            r1 = 1
            r4.setRequestedOrientation(r1)
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarColor(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L3e
        L37:
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarContrastEnforced(r2)
        L3e:
            android.view.Window r1 = r4.getWindow()
            r1.setStatusBarColor(r2)
            int r1 = viva.republica.toss.R.id.app_bar_layout
            android.view.View r1 = r4.findViewById(r1)
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r3 = 8
            r1.setVisibility(r3)
            android.view.Window r1 = r4.getWindow()
            o.RepeatableSpec.onExtraCallbackWithResult(r1, r2)
            int r1 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L68
            return
        L68:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.getActiveNotifications():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ITrustedWebActivityServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 17;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (ITrustedWebActivityCallbackStubProxy() == asArray.PW_6_DIGIT) {
            int i4 = ICustomTabsServiceStub + 35;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                if (((asArray) onNavigationEvent(-1081097150, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1081097154, onAdViewAdDisplayFailed.onExtraCallbackWithResult())) != ITrustedWebActivityCallbackStubProxy()) {
                    Intent intent = getIntent();
                    Object[] objArr = new Object[1];
                    a(75 - (ViewConfiguration.getScrollBarSize() >> 8), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr);
                    if (!intent.getBooleanExtra(((String) objArr[0]).intern(), false)) {
                        return true;
                    }
                }
            } else {
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                ITrustedWebActivityCallbackStubProxy();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    private final void getSmallIconBitmap() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 83;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            setContentView(IPostMessageServiceDefault().getRoot());
            if (!ITrustedWebActivityService()) {
                ConstraintLayout root = IPostMessageServiceDefault().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                disableImageViewPreallocationAndroid.onNavigationEvent(root, IPostMessageServiceDefault().onNavigationEvent, (View) null, (View) null, false, 14, (Object) null);
                int i3 = ICustomTabsServiceStub + 83;
                warmup = i3 % 128;
                int i4 = i3 % 2;
            }
            enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult();
            ITrustedWebActivityServiceDefault();
            getSmallIconId();
            return;
        }
        setContentView(IPostMessageServiceDefault().getRoot());
        ITrustedWebActivityService();
        throw null;
    }

    private final void ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = ICustomTabsServiceStub + 95;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onExtraCallbackWithResult("");
            supportActionBar.onNavigationEvent(true);
            int i4 = ICustomTabsServiceStub + 95;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        IPostMessageServiceDefault().onExtraCallback.setNavigationOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordSettingActivity.onWarmupCompleted(this.f$0, view);
            }
        });
        int i6 = warmup + 65;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onExtraCallback(PasswordSettingActivity passwordSettingActivity, View view) {
        int i = 2 % 2;
        if (!passwordSettingActivity.bg_()) {
            int i2 = warmup + 41;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            passwordSettingActivity.onBackPressed();
            int i4 = ICustomTabsServiceStub + 35;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ICustomTabsServiceStub + 13;
        warmup = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onNavigationEvent(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 125;
        ICustomTabsServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ITrustedWebActivityService();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (ITrustedWebActivityService()) {
            this.newAuthTabSession = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 3, (Object) null);
            return;
        }
        super.onNavigationEvent(str, z);
        int i3 = ICustomTabsServiceStub + 51;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void bo_() {
        int i = 2 % 2;
        int i2 = warmup + 107;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (!ITrustedWebActivityService()) {
            super.bo_();
            return;
        }
        int i4 = warmup + 67;
        int i5 = i4 % 128;
        ICustomTabsServiceStub = i5;
        int i6 = i4 % 2;
        getPackageType getpackagetype = this.newAuthTabSession;
        if (getpackagetype != null) {
            int i7 = i5 + 93;
            warmup = i7 % 128;
            int i8 = i7 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.newAuthTabSession = null;
        ConstraintLayout constraintLayout = IPostMessageServiceDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        super.bo_();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        Intent intent = new Intent((Context) this, (Class<?>) PasswordSettingIntroActivity.class);
        Object[] objArr = new Object[1];
        a(161 - Color.blue(0), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr);
        Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), (Serializable) ITrustedWebActivityCallback_Parcel());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        this.ICustomTabsCallback_Parcel.onNavigationEvent(intentPutExtra);
        int i2 = ICustomTabsServiceStub + 11;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onGreatestScrollPercentageIncreased() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 13;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        bg_();
        int i4 = warmup + 25;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r9
      0x0023: PHI (r9v2 viva.republica.toss.password.PasswordFragment) = (r9v1 viva.republica.toss.password.PasswordFragment), (r9v5 viva.republica.toss.password.PasswordFragment) binds: [B:8:0x0021, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.password.PasswordSettingActivity r8, android.content.DialogInterface r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordSettingActivity.warmup
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            viva.republica.toss.password.PasswordFragment r9 = r8.newSession
            r1 = 17
            int r1 = r1 / 0
            if (r9 == 0) goto L56
            goto L23
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            viva.republica.toss.password.PasswordFragment r9 = r8.newSession
            if (r9 == 0) goto L56
        L23:
            int r8 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r8 = r8 + 83
            int r1 = r8 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r1
            int r8 = r8 % r0
            r8 = 0
            if (r9 != 0) goto L33
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r9 = r8
        L33:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r8, r0, r8}
            int r2 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r5 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r4 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r6 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            r1 = 1882857528(0x703a2038, float:2.3041265E29)
            r3 = -1882857521(0xffffffff8fc5dfcf, float:-1.9511908E-29)
            viva.republica.toss.password.PasswordFragment.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7)
            goto L59
        L56:
            r8.finish()
        L59:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onWarmupCompleted(viva.republica.toss.password.PasswordSettingActivity, android.content.DialogInterface):kotlin.Unit");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final PasswordSettingActivity passwordSettingActivity = (PasswordSettingActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(passwordSettingActivity.IPostMessageServiceStubProxy());
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (String) onNavigationEvent(2074371503, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2074371485, onAdViewAdDisplayFailed.onExtraCallbackWithResult()), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return PasswordSettingActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, passwordSettingActivity.ITrustedWebActivityCallbackDefault(), (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr3, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceStub + 107;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(PasswordSettingActivity passwordSettingActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = warmup + 81;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        PasswordFragment passwordFragment = passwordSettingActivity.newSession;
        if (passwordFragment != null) {
            if (passwordFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment = null;
            }
            PasswordFragment.onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment, null, 1, null});
        } else {
            passwordSettingActivity.finish();
            int i4 = ICustomTabsServiceStub + 73;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final PasswordSettingActivity passwordSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(passwordSettingActivity.IPostMessageServiceStubProxy());
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (String) onNavigationEvent(2074371503, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2074371485, onAdViewAdDisplayFailed.onExtraCallbackWithResult()), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return PasswordSettingActivity.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, passwordSettingActivity.ITrustedWebActivityCallbackDefault(), (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 25;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() throws Throwable {
        int i;
        UTF8Decoder uTF8Decoder;
        int i2 = 2 % 2;
        if (getSupportFragmentManager().extraCallbackWithResult() > 0) {
            return super.bg_();
        }
        PasswordFragment passwordFragment = this.newSession;
        if (passwordFragment == null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda21
                public final Object invoke(Object obj) {
                    return PasswordSettingActivity.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
            return true;
        }
        PasswordFragment passwordFragment2 = null;
        if (passwordFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        PasswordFragment.onNavigationEvent onnavigationevent = (PasswordFragment.onNavigationEvent) PasswordFragment.onNavigationEvent(-853005714, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment});
        if (onnavigationevent == null) {
            int i3 = ICustomTabsServiceStub + 41;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onExtraCallback.onExtraCallback[onnavigationevent.ordinal()];
        }
        if (i == 1) {
            Object[] objArr = new Object[1];
            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 686, TextUtils.getCapsMode("", 0, 0) + 6, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35078), objArr);
            onNavigationEvent(((String) objArr[0]).intern());
            PasswordFragment passwordFragment3 = this.newSession;
            if (passwordFragment3 == null) {
                int i5 = ICustomTabsServiceStub + 1;
                warmup = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment3 = null;
            }
            PasswordFragment.onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment3, null, 1, null});
        } else if (i != 2) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda20
                public final Object invoke(Object obj) {
                    return PasswordSettingActivity.onExtraCallbackWithResult(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        } else {
            if (areNotificationsEnabled()) {
                int i7 = warmup + 31;
                ICustomTabsServiceStub = i7 % 128;
                int i8 = i7 % 2;
                uTF8Decoder = UTF8Decoder.SETTING_CERT;
            } else {
                uTF8Decoder = UTF8Decoder.SETTING;
            }
            PasswordFragment passwordFragment4 = this.newSession;
            if (passwordFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment2 = passwordFragment4;
            }
            passwordFragment2.onExtraCallbackWithResult(PasswordFragment.onNavigationEvent.INPUT, uTF8Decoder);
            int i9 = warmup + 25;
            ICustomTabsServiceStub = i9 % 128;
            int i10 = i9 % 2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r4 = r4.getString(im.toss.uikit.R.string.uikit_yes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r0 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub + 49;
        viva.republica.toss.password.PasswordSettingActivity.warmup = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if ((!r4.ICustomTabsServiceStubProxy().onExtraCallback()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r4.ICustomTabsServiceStubProxy().onExtraCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r4 = r4.getString(viva.republica.toss.R.string.global_password_ask_stop_leave);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, viva.republica.toss.password.PasswordSettingActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object readTypedObject(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            viva.republica.toss.password.PasswordSettingActivity r4 = (viva.republica.toss.password.PasswordSettingActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r2 = r2 + 17
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L23
            o.getBillingPeriod r2 = r4.ICustomTabsServiceStubProxy()
            boolean r2 = r2.onExtraCallback()
            r3 = 75
            int r3 = r3 / r0
            r0 = 1
            r2 = r2 ^ r0
            if (r2 == r0) goto L37
            goto L2d
        L23:
            o.getBillingPeriod r0 = r4.ICustomTabsServiceStubProxy()
            boolean r0 = r0.onExtraCallback()
            if (r0 == 0) goto L37
        L2d:
            int r0 = viva.republica.toss.R.string.global_password_ask_stop_leave
            java.lang.String r4 = r4.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return r4
        L37:
            int r0 = im.toss.uikit.R.string.uikit_yes
            java.lang.String r4 = r4.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r0 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub
            int r0 = r0 + 49
            int r2 = r0 % 128
            viva.republica.toss.password.PasswordSettingActivity.warmup = r2
            int r0 = r0 % r1
            if (r0 != 0) goto L4c
            return r4
        L4c:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.readTypedObject(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceStubProxy().onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!ICustomTabsServiceStubProxy().onExtraCallback()) {
            String string = getString(im.toss.uikit.R.string.uikit_no);
            Intrinsics.checkNotNull(string);
            return string;
        }
        int i3 = ICustomTabsServiceStub + 119;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            String string2 = getString(R.string.global_password_ask_stop_stay);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = getString(R.string.global_password_ask_stop_stay);
        Intrinsics.checkNotNull(string3);
        int i4 = 76 / 0;
        return string3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        Object obj = null;
        if (ICustomTabsServiceStubProxy().onExtraCallback()) {
            int i2 = ICustomTabsServiceStub + 67;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNull(getString(R.string.global_password_ask_stop_message));
                throw null;
            }
            String string = getString(R.string.global_password_ask_stop_message);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (!areNotificationsEnabled()) {
            String string2 = getString(R.string.password_reset_ask_for_quit_message);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = getString(R.string.password_reset_ask_for_quit_message_toss_cert);
        Intrinsics.checkNotNull(string3);
        int i3 = ICustomTabsServiceStub + 125;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return string3;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onSessionEnded();
            obj.hashCode();
            throw null;
        }
        UTF8Decoder uTF8DecoderOnSessionEnded = onSessionEnded();
        if (uTF8DecoderOnSessionEnded == null) {
            int i3 = warmup + 91;
            ICustomTabsServiceStub = i3 % 128;
            if (i3 % 2 == 0) {
                UTF8Decoder uTF8Decoder = UTF8Decoder.SETTING;
                throw null;
            }
            uTF8DecoderOnSessionEnded = UTF8Decoder.SETTING;
        }
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 596, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8, (char) View.resolveSizeAndState(0, 0, 0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), cancelNotification());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 513, (ViewConfiguration.getScrollBarSize() >> 8) + 6, (char) KeyEvent.keyCodeFromString(""), objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        a((-16776758) - Color.rgb(0, 0, 0), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), uTF8DecoderOnSessionEnded.getEventValue());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(uTF8DecoderOnSessionEnded);
        Object[] objArr4 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 462, View.resolveSizeAndState(0, 0, 0) + 5, (char) (Process.myPid() >> 22), objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(uTF8DecoderOnSessionEnded);
        Object[] objArr5 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 520, 11 - View.getDefaultSize(0, 0), (char) (49781 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr5);
        mapOnExtraCallback5.put(((String) objArr5[0]).intern(), getString(iIAuthTabCallback));
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr6 = new Object[1];
        a(532 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, (char) (52656 - Color.red(0)), objArr6);
        mapOnExtraCallback6.put(((String) objArr6[0]).intern(), str);
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        a(604 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 17, (char) (3632 - KeyEvent.normalizeMetaState(0)), objArr7);
        mapOnExtraCallback7.put(((String) objArr7[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback(ICustomTabsServiceStub());
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        Object[] objArr8 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 542, 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), objArr8);
        String strIntern = ((String) objArr8[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 24887 - View.getDefaultSize(0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 30, KeyEvent.getDeadChar(0, 0) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback8.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue()));
            Unit unit = Unit.INSTANCE;
            new TrackLog(1498529L, setDetectableSize.IAuthTabCallback(), (String) null, (String) null, 12, (DefaultConstructorMarker) null).onWarmupCompleted(true);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void onExtraCallbackWithResult(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, String str, String str2) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new IAuthTabCallbackDefault(CoroutineExceptionHandler.extraCallbackWithResult, this, str, str2), (setRandomHost) null, new IAuthTabCallbackStub(graniteBrownfieldModule_closeView, str2, null), 2, (Object) null);
        int i2 = ICustomTabsServiceStub + 27;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        String str = passwordSettingActivity.postMessage;
        String str2 = null;
        if (str == null) {
            int i2 = ICustomTabsServiceStub + 31;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        Object[] objArr = new Object[1];
        a(564 - MotionEvent.axisFromString(""), 14 - KeyEvent.normalizeMetaState(0), (char) (48450 - Color.alpha(0)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        String str3 = passwordSettingActivity.newSessionWithExtras;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = warmup + 49;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str2 = str3;
        }
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 579, ExpandableListView.getPackedPositionType(0L) + 17, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallbackStubProxy(PasswordSettingActivity passwordSettingActivity) {
        int i = 2 % 2;
        int i2 = warmup + 39;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        passwordSettingActivity.finish();
        TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
        String string = passwordSettingActivity.getString(R.string.password_reset_complete);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), R.drawable.icn_success_color, 0, 2, (Object) null), 300, (Integer) null, 0, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 33;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1009605L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PasswordSettingActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        PasswordFragment passwordFragment = null;
        if (this.newSession != null) {
            Intent intent = new Intent();
            byte[] bArrOnWarmupCompleted = graniteBrownfieldModule_closeView.onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getSize(0) + 190, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), bArrOnWarmupCompleted);
            Object[] objArr2 = new Object[1];
            a(Gravity.getAbsoluteGravity(0, 0) + 294, Color.argb(0, 0, 0, 0) + 26, (char) TextUtils.indexOf("", ""), objArr2);
            setResult(-1, intentPutExtra.putExtra(((String) objArr2[0]).intern(), z));
            PasswordFragment passwordFragment2 = this.newSession;
            if (passwordFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment = passwordFragment2;
            }
            passwordFragment.onNavigationEvent(new Function0() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return PasswordSettingActivity.onTransact(this.f$0);
                }
            });
            return;
        }
        PasswordFragment passwordFragment3 = this.onRelationshipValidationResult;
        if (passwordFragment3 == null) {
            int i2 = warmup + 123;
            ICustomTabsServiceStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = warmup + 9;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            passwordFragment = passwordFragment3;
        }
        passwordFragment.ICustomTabsService();
        onWarmupCompleted(graniteBrownfieldModule_closeView, z);
    }

    public static final class onTransact implements dangerouslyReset {
        onTransact() {
        }

        public void onExtraCallback(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            BaseActivity baseActivity = PasswordSettingActivity.this;
            baseActivity.startActivity(PasswordResetIntroActivity.IAuthTabCallback.onNavigationEvent(PasswordResetIntroActivity.Companion, baseActivity, false, 2, null));
            dialogInterface.dismiss();
        }

        public void onNavigationEvent(DialogInterface dialogInterface) {
            PasswordSettingActivity.this.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, ((java.lang.String) r15[0]).intern()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c9, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cb, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.graphics.Color.red(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 30, (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 24886, -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ef, code lost:
    
        r3 = ((java.lang.reflect.Field) r3).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        r1 = new java.lang.Object[]{r1, new viva.republica.toss.password.PasswordSettingActivity.onTransact(r1), r5, r7};
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2117078206);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0105, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0107, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 30 - android.text.TextUtils.indexOf("", "", 0), 24887 - android.view.KeyEvent.keyCodeFromString(""), -1332802094, false, "onExtraCallbackWithResult", new java.lang.Class[]{android.content.Context.class, o.dangerouslyReset.class, java.lang.String.class, java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013f, code lost:
    
        ((java.lang.reflect.Method) r5).invoke(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0144, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0146, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014a, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:
    
        r1.onExtraCallbackWithResult(r3.getMessage());
        r0 = viva.republica.toss.password.PasswordSettingActivity.ICustomTabsServiceStub + 41;
        viva.republica.toss.password.PasswordSettingActivity.warmup = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015e, code lost:
    
        if ((r0 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0160, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0091, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8, ((java.lang.String) r6[0]).intern()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object access000(java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.access000(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        int i = 2 % 2;
        Intent intent = new Intent();
        byte[] bArrOnWarmupCompleted = graniteBrownfieldModule_closeView.onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(190 - Color.argb(0, 0, 0, 0), 17 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr);
        Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), bArrOnWarmupCompleted);
        Object[] objArr2 = new Object[1];
        a(294 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr2);
        setResult(-1, intentPutExtra.putExtra(((String) objArr2[0]).intern(), z));
        TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
        String string = getString(R.string.app_password___acb06f6a56);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), 500, (Integer) null, 0, 6, (Object) null);
        finish();
        int i2 = warmup + 59;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void IAuthTabCallback(PasswordSettingActivity passwordSettingActivity, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = warmup + 93;
            ICustomTabsServiceStub = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str = null;
        }
        passwordSettingActivity.onExtraCallbackWithResult(str);
        int i4 = ICustomTabsServiceStub + 89;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    private static final Unit onWarmupCompleted(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = warmup + 21;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int i3 = 46 / 0;
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(PasswordSettingActivity passwordSettingActivity, String str) throws Throwable {
        UTF8Decoder uTF8Decoder;
        int i = 2 % 2;
        if (passwordSettingActivity.getSupportFragmentManager().extraCallbackWithResult() > 0) {
            int i2 = warmup + 35;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            passwordSettingActivity.getSupportFragmentManager().extraCommand();
        }
        PasswordFragment passwordFragment = passwordSettingActivity.newSession;
        Object obj = null;
        if (passwordFragment != null) {
            int i4 = ICustomTabsServiceStub + 101;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            if (passwordFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment = null;
            }
            PasswordFragment.onNavigationEvent onnavigationevent = PasswordFragment.onNavigationEvent.INPUT;
            passwordFragment.onWarmupCompleted(onnavigationevent);
            if (!(!passwordSettingActivity.areNotificationsEnabled())) {
                int i6 = warmup + 77;
                ICustomTabsServiceStub = i6 % 128;
                if (i6 % 2 == 0) {
                    UTF8Decoder uTF8Decoder2 = UTF8Decoder.SETTING_CERT;
                    obj.hashCode();
                    throw null;
                }
                uTF8Decoder = UTF8Decoder.SETTING_CERT;
            } else {
                uTF8Decoder = UTF8Decoder.SETTING;
            }
            PasswordFragment passwordFragment2 = passwordSettingActivity.newSession;
            if (passwordFragment2 == null) {
                int i7 = ICustomTabsServiceStub + 53;
                warmup = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = ICustomTabsServiceStub + 105;
                warmup = i9 % 128;
                int i10 = i9 % 2;
                passwordFragment2 = null;
            }
            passwordFragment2.onNavigationEvent(onnavigationevent, uTF8Decoder);
        }
        PasswordFragment passwordFragment3 = passwordSettingActivity.mayLaunchUrl;
        if (passwordFragment3 != null) {
            int i11 = warmup + 39;
            ICustomTabsServiceStub = i11 % 128;
            int i12 = i11 % 2;
            if (passwordFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment3 = null;
            }
            PasswordFragment.onExtraCallback(passwordFragment3, str, null, 2, null);
            int i13 = warmup + 3;
            ICustomTabsServiceStub = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 / 5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 63;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (isFinishing()) {
                return;
            }
            if (str == null) {
                int i3 = warmup + 77;
                ICustomTabsServiceStub = i3 % 128;
                if (i3 % 2 != 0) {
                    str = getString(R.string.retry_input_password_when_error_message);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    Intrinsics.checkNotNullExpressionValue(getString(R.string.retry_input_password_when_error_message), "");
                    throw null;
                }
            }
            writeRaw writerawOnWarmupCompleted = CommonModule_setScreenAwakeMode.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return PasswordSettingActivity.onExtraCallbackWithResult(str, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.password.PasswordSettingActivity$$ExternalSyntheticLambda3
                public final void run() throws Throwable {
                    PasswordSettingActivity.onExtraCallback(this.f$0, str);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
            return;
        }
        isFinishing();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = warmup + 43;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        if (i4 == this.ICustomTabsService) {
            int i6 = warmup + 107;
            ICustomTabsServiceStub = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
                if (i5 == this.extraCommand) {
                    return;
                }
            } else if (i5 == this.extraCommand) {
                return;
            }
        }
        setResult(0);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMultiWindowModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 99;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        super.onMultiWindowModeChanged(z);
        if (!(!z)) {
            int i4 = warmup + 9;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 == 0) {
                setResult(1);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void onPictureInPictureModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 9;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(z);
            if (z) {
                int i3 = warmup + 89;
                ICustomTabsServiceStub = i3 % 128;
                int i4 = i3 % 2;
                setResult(0);
                finish();
                return;
            }
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getSmallIconId() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.getSmallIconId():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0650  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.app.Activity, viva.republica.toss.password.PasswordSettingActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.shortValue.onNavigationEvent onMinimized(viva.republica.toss.password.PasswordSettingActivity r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordSettingActivity.onMinimized(viva.republica.toss.password.PasswordSettingActivity):o.shortValue$onNavigationEvent");
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordSettingActivity passwordSettingActivity, Unit unit) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-716484001, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, unit}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 716484002, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ long onWarmupCompleted(PasswordSettingActivity passwordSettingActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Long) onNavigationEvent(643653703, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -643653697, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, UTF8Decoder uTF8Decoder, asDouble asdouble) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-1240675430, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, uTF8Decoder, asdouble}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1240675451, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ String onNavigationEvent() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (String) onNavigationEvent(-550936674, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[0], onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 550936676, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ IndicatorView IAuthTabCallback(PasswordSettingActivity passwordSettingActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (IndicatorView) onNavigationEvent(-161624848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 161624853, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UTF8Decoder uTF8Decoder, PasswordSettingActivity passwordSettingActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(988362555, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{uTF8Decoder, passwordSettingActivity, setDetectableSize}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -988362548, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, String str) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-712572839, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, str}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 712572858, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ long extraCallback(PasswordSettingActivity passwordSettingActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Long) onNavigationEvent(1090041940, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1090041928, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue();
    }

    private static final IndicatorView onPostMessage(PasswordSettingActivity passwordSettingActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (IndicatorView) onNavigationEvent(-959341715, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 959341735, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final asArray IPostMessageService() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (asArray) onNavigationEvent(-1081097150, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1081097154, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final IndicatorView IPostMessageServiceStub() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (IndicatorView) onNavigationEvent(192804570, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -192804553, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final String IPostMessageService_Parcel() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (String) onNavigationEvent(2074371503, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2074371485, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final GraniteBrownfieldModule_closeView ITrustedWebActivityCallback() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (GraniteBrownfieldModule_closeView) onNavigationEvent(-1796928967, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1796928978, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-378887848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 378887861, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(PasswordSettingActivity passwordSettingActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(210245847, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, iEngagementSignalsCallbackDefault}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -210245844, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-1857218987, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity, commonModule_setLeftEdgeTouchEnabled}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1857218987, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void onWarmupCompleted(Throwable th, String str, String str2) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onNavigationEvent(1553083588, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this, th, str, str2}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1553083574, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final boolean ICustomTabsCallbackStub(PasswordSettingActivity passwordSettingActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(1721091640, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{passwordSettingActivity}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1721091632, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    public final zzad ICustomTabsServiceDefault() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (zzad) onNavigationEvent(-1777060186, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1777060196, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final ACAuthRequest access200() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (ACAuthRequest) onNavigationEvent(977853397, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -977853381, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final ExternalOfferInformationDialogListener ICustomTabsService_Parcel() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (ExternalOfferInformationDialogListener) onNavigationEvent(-1149318756, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1149318771, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I writeTypedList() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I) onNavigationEvent(-1220683453, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1220683462, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    @Override // viva.republica.toss.password.Hilt_PasswordSettingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 9;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ICustomTabsServiceStub + 47;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.Hilt_PasswordSettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 17;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = warmup + 121;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.password.Hilt_PasswordSettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsServiceStub + 93;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.Hilt_PasswordSettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 25;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 105;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void onVerticalScrollEvent() {
        char[] cArr = new char[692];
        ByteBuffer.wrap("Aö=Û¹í5\u0081±¡-E©|%\u0006¡\u0015\u001d?\u0098Ê\u0014æ\u0090\u009f\f¤\u0088I\u0004C\u0080\u0005|\u000eø7wÄóÿo\u009eë·í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u0005*\u0089U\rf±a4\u008a¸¹<Û ë$\u0019¨#,GÐATcÛ\u008e_»ÃÑGøA\u0001=\u0000¹(5B±u-\u0097©¹%Î¡í\u001dþ\u0098\u0015\u00145\u0090P\fw\u0088\u009a\u0004¥\u0080Ö|Ñøúw\tó+o[ëig\u0093ã·_±ÛÓWþÒ\u0007í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u0005/\u0089[\r}±x4\u0093¸©<Ê ì$\u000e¨?©5Õ4Q\u001cÝvYAÅ£A\u008bÍñIÄõÓp+ü\u0001xräH`§ì\u0084hñ\u0094ÿ\u0010Û\u009f3\u001b\u000f\u0087n\u0003\\í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u0005.\u0089U\rk±k4\u0084¸¥<Ç ó$\u0003¨ ,UÐ[T\u007fÛ\u0097_«ÃÊGøË\u000fO ó1w\\ûe£XßY[q×\u001bS,ÏÎKåÇ\u0098C®ÿ²zRöfr\u001fî5jÊæíb\u0084\u009e\u0091\u001a í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u0005,\u0089Q\rg±{4\u009b¸¯<Ö ü$\u0003¨<,[ÐOTsÛ\u0089_ªÃÈGéË\u0004O+ó<wUûp~\u0081í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u00052\u0089U\rc±w4\u009c¸¡<× ë$\u000b¨?,FÐLí\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u00050\u0089_\rs±w4\u009c¸¯<× ë$\u0019¨#,GÐATcÛ\u008e_»ÃÕGùË\u0004O<ó'wHãw\u009fv\u001b^\u00974\u0013\u0003\u008fá\u000bÖ\u0087¹\u0003\u0095¿\u0091:i¶C20®\n*ó¦Ð\"«Þ±Z\u0087ÕcQVÍ6I\u0015Åòí\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u00055\u0089C\rk±n4\u009e¸¯<É ç$\u000e¨5,GÐMTxÛ\u009f_´ÃÙGïË\u0003O#ó'w^ûd~\u009bâ«fßêøn\u0011\u0012\u0005\u0096)í\u0091\u0091\u0090\u0015¸\u0099Ò\u001då\u0081\u0007\u00055\u0089C\rk±j4\u0085¸¯<É ý$\b¨\",]ÐKTsÛ\u0083_¬ÃÝGÿË\u001bO1ó,V¾*¿®\u0097\"ý¦Ê:(¾\u00152j¶U\nI\u008f¦\u0003\u0083\u0087ô\u001bÞ\u009f7¶.Ê/N\u0007ÂmFZÚ¸^\u0080ÒúVÙêÅo6ã\u0011goûX\u007f¢ó\u009awÿ\u008bÿ\u000fÌ\u0080-\u0004\u001e\u0098t\u001cV\u0090£\u0014\u009fí\u0080\u0091\u008b\u0015Þ\u0099±\u001d\u0094\u0081k\u0017ÂkÕïãc¨ç½{Sÿws\u001f÷#K\"ÎÐ\róqíõØy\u008eý\u0081aoåli1í\u0007Q\u001bÔûXÏÜ¶@\u009cÄ4H\u0019Ì\u00180!´\u0001;¯¿Ð#·§\u008f+c¯\u001b\u0013]\u0097%\u001b\u000b\u009eí\u0002Ì\u0086ó\n\u0085\u008e`òav@ú3~KýËaÙå³i\u0081í\u009aQiÕsY0Ý\n@õÄÞH³Ìó¬\u0018Ð\u0019T1Ø[\\lÀ\u008eD¶ÈÖLððñu\u0004ù'}Tíøíô\u0091¡\u0015\u009f\u0099 \u001dÊ\u00817\u0005\b\u00890\rG±]4¼¸\u0090<ë Ê$(¨\u0015,pí \u0091±\u0015\u009c\u0099åí \u0091¡\u0015\u0098\u0099ì\u001dÁíº\u0091\u00ad\u0015\u0083Z²&©¢\u0093.úªß\u009eHâRf`ê\fn.òÄvàî¼\u0092§\u0016\u008b\u009aâí·\u0091§\u0015\u0081\u0099í\u001dË\u00816í¤\u0091©\u0015\u009f\u0099ó\u001dÓ\u00817\u0005\u000e\u0089t\rk±Z4©¸\u0093<á Ìê=\u0096>\u0012\u0016\u009ehí¶\u0091©\u0015\u0082\u0099ëí¹\u0091\u00ad\u0015\u0098\u0099è\u001dË\u0081</ÄSÙ×ë[\u0097ß¢CEÇxK\u0010Ï)s3öÖ \u0016\\\u001dØ/TEÐxL\u009cÈ\u0093DÔÀý|èù\u0019íµ\u0091¼\u0015\u0098\u0099å\u001dÉ\u0081(\u0005\b\u0089O\rW±F4¸V\u0004*\u0003®?\"a¦{:\u0092¾¶2Ë¶ç\næ\u008f\u0006\u0003-Põ,ï¨Ü$¶ \u008f<|¸G4\r°\u001b\f\u000f\u0089ú\u0005Ê\u0081©\u001d\u009eí¤\u0091§\u0015\u009f\u0099ó\u001dÁ\u0081+\u0005\u000f\u0089y\r[±F4\u0093¸\u008d<á Ì$4¨\u001f,pí¤\u0091¡\u0015\u0082\u0099ß\u001dÑ\u0081-\u0005\u0015\u0089tã\u0086\u009f\u0091\u001b³\u0097ï\u0013õ\u008f\u001d\u000b8\u0087H\u0003[¿{:\u0094¶µ2×®ã*3¦9\"Jí¢\u0091©\u0015\u009e\u0099é\u001dÅ\u00816\u0005\b\u0089O\r@±Q4¼¸\u0085íâ\u0091¸\u0015\u0085\u0099î\u001dû\u0081!\u0005\u0012\nïvðòÜ~¾ú\u009dfPâRn)í²\u0091½\u0015\u0082\u0099î\u001dÁ\u00814\u0005#\u0089y\rP\n\u0098v\u009eò\u0096~Öúéf\u0012â.n\\ê\u007fVjÓ¶_«ÛÄGòÃ&O%ËX7Cí½\u0091¦\u0015\u008a\u0099ì\u001dË\u0081/\u0005#\u0089d\rM±X4©d±\u0018¯\u009c\u0084\u0010å\u0094Ç\b2".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 692);
        ICustomTabsServiceDefault = cArr;
        validateRelationship = -387363651686592056L;
    }
}
