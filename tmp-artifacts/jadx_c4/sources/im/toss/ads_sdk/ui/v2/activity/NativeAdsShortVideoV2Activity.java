package im.toss.ads_sdk.ui.v2.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.common.collect.UnmodifiableIterator;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$setupPlayerView$1$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.ads_sdk.ui.view.ShortFormPlayerView;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Address;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda4;
import o.CarouselKtExternalSyntheticLambda8;
import o.CommonModule_setSecureScreen;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.LinkGenerator;
import o.M_;
import o.Rmenu;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.addOnAdapterChangeListener;
import o.calculatePageOffsets;
import o.deleteProfile;
import o.endRearDisplayPresentationSession;
import o.getAdService;
import o.getFillAlpha;
import o.getItemPosition;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.noStore;
import o.readIntokhttp;
import o.setRandomHost;
import o.setTagsokhttp;
import o.setTrimPathOffset;
import o.varyMatches;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsShortVideoV2Activity extends Hilt_NativeAdsShortVideoV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static long onActivityLayout = 0;
    private static int onActivityResized = 0;
    private static int onMessageChannelReady = 1;
    private static int onRelationshipValidationResult = 0;
    private static int onUnminimized = 1;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private int access000;
    private String asBinder;

    @Inject
    public zzad environments;
    private ValueAnimator onMinimized;
    private getPackageType onPostMessage;
    private ExoPlayer readTypedObject;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new ICustomTabsCallback(this));
    private boolean extraCallback = true;
    private final List<ValueAnimator> getInterfaceDescriptor = new ArrayList();
    private long access100 = System.currentTimeMillis();
    private final long writeTypedObject = 500;
    private final IAuthTabCallback extraCallbackWithResult = new IAuthTabCallback();
    private final onNavigationEvent IAuthTabCallbackStub = new onNavigationEvent();

    static {
        IAuthTabCallbackStubProxy();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = onUnminimized + 19;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ WindowInsetsCompat IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        WindowInsetsCompat windowInsetsCompat2 = (WindowInsetsCompat) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1217915667, new Object[]{nativeAdsShortVideoV2Activity, view, windowInsetsCompat}, C40Encoder.onExtraCallback(), iOnExtraCallback, 1217915667, iOnExtraCallback2);
        int i4 = onActivityResized + 65;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return windowInsetsCompat2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
        int i4 = onActivityResized + 125;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsDto, nativeAdsShortVideoV2Activity, z);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = onMessageChannelReady + 117;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(nativeAdsShortVideoV2Activity, shortFormVideo);
        }
        asInterface(nativeAdsShortVideoV2Activity, shortFormVideo);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -672199397, new Object[]{view, valueAnimator}, C40Encoder.onExtraCallback(), iOnExtraCallback, 672199406, iOnExtraCallback2);
        int i4 = onActivityResized + 85;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
        int i4 = onActivityResized + 51;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[3];
        View view = (View) objArr[4];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asInterface(nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, view);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(nativeAdsShortVideoV2Activity, view);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onMessageChannelReady + 105;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 27;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsShortVideoV2Activity, shortFormVideo);
        int i4 = onMessageChannelReady + 39;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1330953088, new Object[]{nativeAdsShortVideoV2Activity, nativeAdsEventLogType}, C40Encoder.onExtraCallback(), iOnExtraCallback3, 1330953100, iOnExtraCallback4);
        int i3 = onMessageChannelReady + 21;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(View view, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(view, f, valueAnimator);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, view);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~(i5 | i2);
        int i10 = i7 | (~i5);
        int i11 = i9 | (~(i10 | i4));
        int i12 = (~i4) | i10;
        int i13 = i5 + i2 + i6 + (1134938392 * i) + ((-1730424158) * i3);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i5) + 1061748736 + ((-382549644) * i2) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i6) + (1924136960 * i) + (748945408 * i3) + (912850944 * i14);
        int i16 = (i5 * 1914917686) + 639827133 + (i2 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (1914918157 * i6) + ((-1451741640) * i) + ((-1338016710) * i3) + (i14 * (-1605042176));
        int iDoubleValue = 0;
        switch (i15 + (i16 * i16 * (-230752256))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
                int i17 = 2 % 2;
                int i18 = onActivityResized + 47;
                onMessageChannelReady = i18 % 128;
                int i19 = i18 % 2;
                boolean zICustomTabsCallbackStubProxy = nativeAdsShortVideoV2Activity.ICustomTabsCallbackStubProxy();
                int i20 = onActivityResized + 49;
                onMessageChannelReady = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.valueOf(zICustomTabsCallbackStubProxy);
            case 8:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                final NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity2 = (NativeAdsShortVideoV2Activity) objArr[0];
                String str = (String) objArr[1];
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
                final NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[3];
                int i22 = 2 % 2;
                NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsShortVideoV2Activity2.IAuthTabCallbackDefault();
                Object[] objArr2 = new Object[1];
                a(new char[]{51091, 62525, 14000, 51107, 44347}, Process.myPid() >> 22, objArr2);
                getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, str, adAsset, new NativeAdsEventLogType.onExtraCallback(((String) objArr2[0]).intern()), null, null, new Function1() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i23 = 2 % 2;
                        int i24 = onExtraCallback + 43;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitIAuthTabCallbackStub = NativeAdsShortVideoV2Activity.IAuthTabCallbackStub(this.f$0, (NativeAdsEventLogType) obj);
                        if (i25 == 0) {
                            int i26 = 7 / 0;
                        }
                        return unitIAuthTabCallbackStub;
                    }
                }, new Function0() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda20
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i23 = 2 % 2;
                        int i24 = onWarmupCompleted + 89;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity3 = this.f$0;
                        if (i25 == 0) {
                            return NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(nativeAdsShortVideoV2Activity3, shortFormVideo);
                        }
                        NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(nativeAdsShortVideoV2Activity3, shortFormVideo);
                        throw null;
                    }
                }, 24, null);
                Unit unit = Unit.INSTANCE;
                int i23 = onActivityResized + 37;
                onMessageChannelReady = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access100(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                final NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity3 = (NativeAdsShortVideoV2Activity) objArr[0];
                final NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
                final NativeAdsDto.AdAsset adAsset2 = (NativeAdsDto.AdAsset) objArr[2];
                int i25 = 2 % 2;
                NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
                if (extraInfoOnTransact != null) {
                    int i26 = onActivityResized + 93;
                    onMessageChannelReady = i26 % 128;
                    int i27 = i26 % 2;
                    Double dIAuthTabCallbackDefault = extraInfoOnTransact.IAuthTabCallbackDefault();
                    if (dIAuthTabCallbackDefault != null) {
                        int i28 = onActivityResized + 7;
                        onMessageChannelReady = i28 % 128;
                        int i29 = i28 % 2;
                        iDoubleValue = (int) dIAuthTabCallbackDefault.doubleValue();
                    }
                }
                nativeAdsShortVideoV2Activity3.access000 = iDoubleValue;
                AdsCircularCountdownLayout adsCircularCountdownLayout = nativeAdsShortVideoV2Activity3.readTypedObject().IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(adsCircularCountdownLayout, "");
                nativeAdsShortVideoV2Activity3.onWarmupCompleted(adsCircularCountdownLayout);
                nativeAdsShortVideoV2Activity3.readTypedObject().IAuthTabCallbackStub.onWarmupCompleted(nativeAdsShortVideoV2Activity3.access000, nativeAdsShortVideoV2Activity3.getInterfaceDescriptor(), nativeAdsShortVideoV2Activity3.onWarmupCompleted(), new Function1() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda23
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i30 = 2 % 2;
                        int i31 = onExtraCallback + 99;
                        onWarmupCompleted = i31 % 128;
                        int i32 = i31 % 2;
                        Unit unitIAuthTabCallback = NativeAdsShortVideoV2Activity.IAuthTabCallback(nativeAdsDto, nativeAdsShortVideoV2Activity3, ((Boolean) obj).booleanValue());
                        int i33 = onWarmupCompleted + 121;
                        onExtraCallback = i33 % 128;
                        if (i33 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, new Function0() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda24
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() throws NoWhenBranchMatchedException {
                        int i30 = 2 % 2;
                        int i31 = onNavigationEvent + 73;
                        IAuthTabCallback = i31 % 128;
                        int i32 = i31 % 2;
                        Unit unitOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(this.f$0, nativeAdsDto, adAsset2);
                        int i33 = onNavigationEvent + 107;
                        IAuthTabCallback = i33 % 128;
                        if (i33 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                return null;
            case 17:
                return access000(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1969800502, new Object[]{nativeAdsShortVideoV2Activity, shortFormVideo}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1969800497, iOnExtraCallback2);
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1969800502, new Object[]{nativeAdsShortVideoV2Activity, shortFormVideo}, C40Encoder.onExtraCallback(), iOnExtraCallback3, -1969800497, iOnExtraCallback4);
        int i3 = 33 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
        }
        IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 121;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onTransact(nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, view);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
        int i4 = onMessageChannelReady + 31;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity, shortFormVideo);
        int i4 = onMessageChannelReady + 69;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsShortVideoV2Activity, nativeAdsDto, adAsset);
        int i4 = onMessageChannelReady + 107;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {nativeAdsShortVideoV2Activity, nativeAdsEventLogType};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 128644675, objArr, C40Encoder.onExtraCallback(), iOnExtraCallback, -128644661, C40Encoder.onExtraCallback());
        int i4 = onMessageChannelReady + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, MotionEvent motionEvent) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 125;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1265028856, new Object[]{nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, motionEvent}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1265028845, iOnExtraCallback2);
            int i3 = 97 / 0;
        } else {
            int iOnExtraCallback3 = C40Encoder.onExtraCallback();
            int iOnExtraCallback4 = C40Encoder.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1265028856, new Object[]{nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, motionEvent}, C40Encoder.onExtraCallback(), iOnExtraCallback3, -1265028845, iOnExtraCallback4);
        }
        int i4 = onActivityResized + 103;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 27;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(nativeAdsShortVideoV2Activity, view);
        int i4 = onMessageChannelReady + 59;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.AdAsset adAsset, NativeAdsDto nativeAdsDto, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1724889197, new Object[]{nativeAdsShortVideoV2Activity, adAsset, nativeAdsDto, motionEvent}, C40Encoder.onExtraCallback(), iOnExtraCallback, 1724889205, iOnExtraCallback2);
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -803120451, new Object[]{nativeAdsShortVideoV2Activity, shortFormVideo}, C40Encoder.onExtraCallback(), iOnExtraCallback3, 803120468, iOnExtraCallback4);
        int i3 = onActivityResized + 81;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(view, valueAnimator);
        int i4 = onActivityResized + 99;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 51;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(nativeAdsShortVideoV2Activity);
        int i4 = onActivityResized + 111;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, view);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = onMessageChannelReady + 41;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public IAuthTabCallbackStub() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onNavigationEvent + 7;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).onExtraCallback().getWidth() != 0) {
                int i12 = onNavigationEvent + 85;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    if (NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).writeTypedObject.getHeight() != 0) {
                        NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).access000.setupVideoSlotRect(new Rect(0, NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).onTransact.getBottom() + varyMatches.IAuthTabCallback(24, NativeAdsShortVideoV2Activity.this), NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).onExtraCallback().getWidth(), NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).writeTypedObject.getTop() - varyMatches.IAuthTabCallback(24, NativeAdsShortVideoV2Activity.this)));
                        return;
                    }
                } else {
                    NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).writeTypedObject.getHeight();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).writeTypedObject.post(NativeAdsShortVideoV2Activity.this.new onTransact());
            int i13 = onNavigationEvent + 107;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onActivityLayout ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 15;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onActivityLayout)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (Process.myPid() >> 22)), TextUtils.getTrimmedLength("") + 84, TextUtils.lastIndexOf("", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16791401), Drawable.resolveOpacity(0, 0) + 19, 8807 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    public static final /* synthetic */ getItemPosition IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getItemPosition typedObject = nativeAdsShortVideoV2Activity.readTypedObject();
        int i4 = onMessageChannelReady + 21;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 121;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoV2Activity.onPostMessage();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onMessageChannelReady + 53;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
    }

    public static final /* synthetic */ long IAuthTabCallbackStub(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 95;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return nativeAdsShortVideoV2Activity.writeTypedObject;
        }
        long j = nativeAdsShortVideoV2Activity.writeTypedObject;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 13;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsShortVideoV2Activity.readTypedObject;
        if (i3 != 0) {
            return exoPlayer;
        }
        throw null;
    }

    public static final /* synthetic */ void asBinder(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoV2Activity.onMinimized();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getPackageType asInterface(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = nativeAdsShortVideoV2Activity.onPostMessage;
        if (i3 != 0) {
            return getpackagetype;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        nativeAdsShortVideoV2Activity.extraCallback = z;
        int i5 = i3 + 11;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoV2Activity.access100();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
    }

    public static final /* synthetic */ String onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 121;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = nativeAdsShortVideoV2Activity.asBinder;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 93;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsShortVideoV2Activity.ICustomTabsCallback = z;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 11;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
    }

    public static final /* synthetic */ void onTransact(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoV2Activity.onActivityResized();
        int i4 = onActivityResized + 111;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 1;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsShortVideoV2Activity.IAuthTabCallbackStubProxy = z;
        int i5 = i2 + 51;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) == 0) goto L12;
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
    
        r2 = r2 + 115;
        im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onMessageChannelReady = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzad IAuthTabCallback_Parcel() {
        zzad zzadVar;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 67;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            zzadVar = this.environments;
            int i4 = 62 / 0;
        } else {
            zzadVar = this.environments;
        }
    }

    private final getItemPosition readTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getItemPosition getitemposition = (getItemPosition) this.asInterface.getValue();
        if (i3 != 0) {
            return getitemposition;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    int i3 = 64 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                }
                int i4 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class access000 implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent();
                int i4 = onExtraCallback + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class access100 implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    int i3 = 2 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                }
                int i4 = onExtraCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class extraCallback implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.Reward onExtraCallbackWithResult;

        public extraCallback(NativeAdsDto.Reward reward) {
            this.onExtraCallbackWithResult = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            int i5 = onExtraCallback + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i3 = 76 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
                int i4 = onWarmupCompleted + 89;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class getInterfaceDescriptor implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent();
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<setTrimPathOffset, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsShortVideoV2Activity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = onWarmupCompleted + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                    int i3 = 31 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                }
                int i4 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onMinimized implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onMinimized(View view) {
            this.onExtraCallbackWithResult = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.setTranslationX(0.0f);
        }
    }

    public static final class readTypedObject implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public readTypedObject(View view) {
            this.onWarmupCompleted = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view;
            float f;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                view = this.onWarmupCompleted;
                f = 1.0f;
            } else {
                view = this.onWarmupCompleted;
                f = 0.0f;
            }
            view.setTranslationX(f);
            int i3 = onNavigationEvent + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 39 / 0;
            }
        }
    }

    public static final class IAuthTabCallback implements calculatePageOffsets.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallback() {
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void IAuthTabCallback(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(charSequence);
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onEvent(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onEvent(nativeAdsEventLogType);
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onNavigationEvent(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onNavigationEvent(charSequence);
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                NativeAdsShortVideoV2Activity.this.onExtraCallback("VIMP");
                int i3 = 71 / 0;
            } else {
                NativeAdsShortVideoV2Activity.this.onExtraCallback("VIMP");
            }
            int i4 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsShortVideoV2Activity.this.onExtraCallback("IMP_1PX");
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsShortVideoV2Activity.this.onExtraCallback("IMP_100P");
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 44 / 0;
            }
        }
    }

    public static final class onNavigationEvent implements Player.Listener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onNavigationEvent() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[PHI: r13
          0x0063: PHI (r13v2 im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity) = 
          (r13v1 im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity)
          (r13v12 im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity)
         binds: [B:8:0x0061, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTracksChanged(Tracks tracks) throws Throwable {
            NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity;
            ExoPlayer exoPlayer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            Player player = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(tracks, "");
                nativeAdsShortVideoV2Activity = NativeAdsShortVideoV2Activity.this;
                exoPlayer = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
                int i3 = 2 / 0;
                if (exoPlayer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = onExtraCallbackWithResult + 1;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    exoPlayer = null;
                }
            } else {
                Intrinsics.checkNotNullParameter(tracks, "");
                nativeAdsShortVideoV2Activity = NativeAdsShortVideoV2Activity.this;
                exoPlayer = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
                if (exoPlayer == null) {
                }
            }
            if (nativeAdsShortVideoV2Activity.onExtraCallbackWithResult(exoPlayer)) {
                return;
            }
            NativeAdsShortVideoV2Activity.onExtraCallback(NativeAdsShortVideoV2Activity.this, true);
            NativeAdsShortVideoV2Activity.onWarmupCompleted(NativeAdsShortVideoV2Activity.this, true);
            Player player2 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{NativeAdsShortVideoV2Activity.this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (player2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                player = player2;
            }
            player.setVolume(0.0f);
            NativeAdsShortVideoV2Activity.onTransact(NativeAdsShortVideoV2Activity.this);
        }

        public void onPlaybackStateChanged(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                if (i != 3) {
                    return;
                }
            } else if (i != 3) {
                return;
            }
            NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(NativeAdsShortVideoV2Activity.this);
            NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = NativeAdsShortVideoV2Activity.this;
            ExoPlayer exoPlayer = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            Player player = null;
            if (exoPlayer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                exoPlayer = null;
            }
            if (nativeAdsShortVideoV2Activity.onExtraCallbackWithResult(exoPlayer)) {
                return;
            }
            NativeAdsShortVideoV2Activity.onExtraCallback(NativeAdsShortVideoV2Activity.this, true);
            NativeAdsShortVideoV2Activity.onWarmupCompleted(NativeAdsShortVideoV2Activity.this, true);
            Player player2 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{NativeAdsShortVideoV2Activity.this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (player2 == null) {
                int i6 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                player = player2;
            }
            player.setVolume(0.0f);
            NativeAdsShortVideoV2Activity.onTransact(NativeAdsShortVideoV2Activity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getItemPosition typedObject = readTypedObject();
        typedObject.writeTypedObject.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(27.0f)));
        typedObject.extraCallback.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(20.25f)));
        typedObject.access100.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(22.95f)));
        int i4 = onActivityResized + 3;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedObject() {
        float f;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(CommonModule_setSecureScreen.onWarmupCompleted, this, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
        exoPlayerIAuthTabCallback.setPlayWhenReady(true);
        if (this.extraCallback) {
            int i4 = onMessageChannelReady;
            int i5 = i4 + 83;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 7;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        exoPlayerIAuthTabCallback.setVolume(f);
        exoPlayerIAuthTabCallback.setVideoScalingMode(2);
        this.readTypedObject = exoPlayerIAuthTabCallback;
        exoPlayerIAuthTabCallback.addListener(this.IAuthTabCallbackStub);
    }

    public static final class ICustomTabsCallback implements Function0<getItemPosition> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Activity onWarmupCompleted;

        public ICustomTabsCallback(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent();
            int i3 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return searchBarKtExternalSyntheticLambda5OnNavigationEvent;
        }

        public final getItemPosition onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                getItemPosition getitempositionIAuthTabCallback = getItemPosition.IAuthTabCallback(layoutInflater);
                int i3 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 49 / 0;
                }
                return getitempositionIAuthTabCallback;
            }
            LayoutInflater layoutInflater2 = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            getItemPosition.IAuthTabCallback(layoutInflater2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onMinimized() {
        int i = 2 % 2;
        access100();
        this.onPostMessage = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(this, (access13800) null), 3, (Object) null);
        int i2 = onActivityResized + 37;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
    }

    private final void access100() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 19;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = this.onPostMessage;
        Object obj = null;
        if (getpackagetype != null) {
            int i5 = i2 + 89;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.onPostMessage = null;
        int i7 = onActivityResized + 91;
        onMessageChannelReady = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean ICustomTabsCallbackStubProxy() {
        String strOnExtraCallbackWithResult;
        Object obj;
        int i = 2 % 2;
        String str = this.asBinder;
        if (str == null || (strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str)) == null) {
            return false;
        }
        this.asBinder = strOnExtraCallbackWithResult;
        access100();
        try {
            Result.Companion companion = Result.Companion;
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            ExoPlayer exoPlayer = this.readTypedObject;
            Player player = null;
            if (exoPlayer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exoPlayer = null;
            }
            CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayer, this, strOnExtraCallbackWithResult, false, null, 8, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            Player player2 = this.readTypedObject;
            if (player2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                player2 = null;
            }
            player2.prepare();
            Player player3 = this.readTypedObject;
            if (player3 == null) {
                int i2 = onActivityResized + 1;
                onMessageChannelReady = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                player3 = null;
            }
            player3.setPlayWhenReady(true);
            Player player4 = this.readTypedObject;
            if (player4 == null) {
                int i3 = onMessageChannelReady + 123;
                onActivityResized = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = 99 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                player = player4;
            }
            player.play();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            onExtraCallback("mp4 fallback failed: " + th2.getMessage());
        }
        return true;
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        access100();
        Player player = null;
        this.asBinder = null;
        try {
            Result.Companion companion = Result.Companion;
            Player player2 = this.readTypedObject;
            if (player2 == null) {
                int i2 = onActivityResized + 71;
                onMessageChannelReady = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                player2 = null;
            }
            player2.setPlayWhenReady(false);
            Player player3 = this.readTypedObject;
            if (player3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = onMessageChannelReady + 7;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                player3 = null;
            }
            player3.pause();
            Player player4 = this.readTypedObject;
            if (player4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                player = player4;
            }
            player.stop();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        readTypedObject().access000.onExtraCallback();
        onExtraCallback("show thumbnail fallback");
        int i6 = onActivityResized + 77;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r11
      0x0033: PHI (r11v6 im.toss.ads_sdk.model.NativeAdsDto$Reward) = (r11v5 im.toss.ads_sdk.model.NativeAdsDto$Reward), (r11v7 im.toss.ads_sdk.model.NativeAdsDto$Reward) binds: [B:14:0x0031, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, boolean z) {
        NativeAdsDto.Reward rewardOnExtraCallback;
        int i = 2 % 2;
        if (z) {
            int i2 = onActivityResized + 117;
            onMessageChannelReady = i2 % 128;
            String strIAuthTabCallbackStub = null;
            if (i2 % 2 == 0) {
                nativeAdsDto.onTransact();
                throw null;
            }
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null) {
                int i3 = onMessageChannelReady + 117;
                onActivityResized = i3 % 128;
                if (i3 % 2 != 0) {
                    rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback();
                    int i4 = 38 / 0;
                    if (rewardOnExtraCallback != null) {
                        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoV2Activity.onNavigationEvent();
                        if (calculatepageoffsetsOnNavigationEvent != null) {
                            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
                        }
                        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity);
                        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoV2Activity);
                            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                            } else {
                                int i5 = onMessageChannelReady + 21;
                                onActivityResized = i5 % 128;
                                int i6 = i5 % 2;
                            }
                            if (strIAuthTabCallbackStub == null) {
                                int i7 = onMessageChannelReady + 79;
                                onActivityResized = i7 % 128;
                                int i8 = i7 % 2;
                                strIAuthTabCallbackStub = "";
                            }
                            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new extraCallback(rewardOnExtraCallback));
                        }
                    }
                } else {
                    rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback();
                    if (rewardOnExtraCallback != null) {
                    }
                }
            }
        }
        nativeAdsShortVideoV2Activity.onTransact();
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onExtraCallbackWithResult = {64982, 64961, 64981, 65065};
        private static char onExtraCallback = 51243;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 26 - View.MeasureSpec.getSize(0), 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), 23139 - (ViewConfiguration.getPressedStateDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                    int i5 = $11 + 33;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getSize(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 73, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), KeyEvent.keyCodeFromString("") + 30, 19488 - TextUtils.indexOf("", "", 0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i6 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i6];
                            } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i7];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                            } else {
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = $11 + 15;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[i11] = (char) (cArr4[i11] ^ 13722);
            }
            String str = new String(cArr4);
            int i14 = $10 + 89;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            objArr[0] = str;
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsShortVideoV2Activity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a(new char[]{0, 1, 0, 2, 13831, 13831, 1, 0}, (byte) (Color.green(0) + 31), (ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onActivityResized + 101;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoV2Activity.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
                int i3 = onActivityResized + 117;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
            }
            nativeAdsShortVideoV2Activity.finish();
            return Unit.INSTANCE;
        }
        nativeAdsShortVideoV2Activity.onNavigationEvent();
        throw null;
    }

    public static final class asBinder extends OnBackPressedCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ NativeAdsDto.AdAsset onNavigationEvent;
        final /* synthetic */ NativeAdsDto onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
            super(true);
            this.onWarmupCompleted = nativeAdsDto;
            this.onNavigationEvent = adAsset;
        }

        public void handleOnBackPressed() throws NoWhenBranchMatchedException {
            String strIAuthTabCallbackStub;
            NativeAdsDto.AdAsset adAsset;
            Function0 function0;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 111;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                if (NativeAdsShortVideoV2Activity.this.onWarmupCompleted()) {
                    calculatePageOffsets calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoV2Activity.this.onNavigationEvent();
                    if (calculatepageoffsetsOnNavigationEvent != null) {
                        int i4 = onExtraCallback + 17;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            strIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
                            adAsset = this.onNavigationEvent;
                            function0 = null;
                            i = 3;
                        } else {
                            strIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
                            adAsset = this.onNavigationEvent;
                            function0 = null;
                            i = 4;
                        }
                        calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, strIAuthTabCallbackStub, adAsset, function0, i, (Object) null);
                    }
                    NativeAdsShortVideoV2Activity.this.finish();
                    int i5 = onExtraCallback + 65;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            NativeAdsShortVideoV2Activity.this.onWarmupCompleted();
            throw null;
        }
    }

    private final void IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new asBinder(nativeAdsDto, adAsset));
        int i2 = onMessageChannelReady + 35;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        ViewCompat.onWarmupCompleted(readTypedObject().onExtraCallback(), new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda5(this));
        int i2 = onMessageChannelReady + 103;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iAccess000;
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        View view = (View) objArr[1];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[2];
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
        int iOnExtraCallbackWithResult = cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback;
        if (iOnExtraCallbackWithResult <= 0) {
            iOnExtraCallbackWithResult = M_.onExtraCallback.onExtraCallbackWithResult();
        }
        if (cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted > 0) {
            int i4 = onActivityResized;
            int i5 = i4 + 81;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 15;
            onMessageChannelReady = i7 % 128;
            int i8 = i7 % 2;
            iAccess000 = 0;
        } else {
            iAccess000 = M_.onExtraCallback.access000();
        }
        ConstraintLayout constraintLayout = nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, iAccess000, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, 0);
        nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallbackStubProxy.getLayoutParams().height = iOnExtraCallbackWithResult;
        return windowInsetsCompat;
    }

    public static final class extraCallbackWithResult implements ShortFormPlayerView.IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ NativeAdsDto.AdAsset onNavigationEvent;
        final /* synthetic */ NativeAdsDto onWarmupCompleted;

        public static /* synthetic */ Unit onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
            int i4 = onExtraCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
            if (i3 != 0) {
                int i4 = 65 / 0;
            }
            int i5 = onExtraCallback + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = asBinder(nativeAdsShortVideoV2Activity, nativeAdsEventLogType);
            int i4 = onExtraCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitAsBinder;
        }

        extraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
            this.onWarmupCompleted = nativeAdsDto;
            this.onNavigationEvent = adAsset;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
                if (((Boolean) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 726229542, new Object[]{NativeAdsShortVideoV2Activity.this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -726229535, C40Encoder.onExtraCallback())).booleanValue()) {
                    return;
                }
            } else {
                if (((Boolean) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 726229542, new Object[]{NativeAdsShortVideoV2Activity.this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -726229535, C40Encoder.onExtraCallback())).booleanValue()) {
                    return;
                }
            }
            String strOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(NativeAdsShortVideoV2Activity.this);
            if (strOnNavigationEvent != null) {
                int i4 = onExtraCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0 ? StringsKt.contains(strOnNavigationEvent, ".m3u8", true) : StringsKt.contains(strOnNavigationEvent, ".m3u8", true)) {
                    Object[] objArr = {CommonModule_setSecureScreen.onWarmupCompleted, NativeAdsShortVideoV2Activity.this};
                    CommonModule_setSecureScreen.onExtraCallbackWithResult(-216885552, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 216885552, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                    NativeAdsShortVideoV2Activity.asBinder(NativeAdsShortVideoV2Activity.this);
                    int i5 = onExtraCallback + 123;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
            }
            NativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(NativeAdsShortVideoV2Activity.this);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
                if (!z) {
                    getPackageType getpackagetypeAsInterface = NativeAdsShortVideoV2Activity.asInterface(NativeAdsShortVideoV2Activity.this);
                    if (getpackagetypeAsInterface != null) {
                        int i4 = onExtraCallback + 27;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeAsInterface, (CancellationException) null, 1, (Object) null);
                        } else {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeAsInterface, (CancellationException) null, 1, (Object) null);
                        }
                    }
                }
            } else if (!z) {
            }
            NativeAdsShortVideoV2Activity.onNavigationEvent(NativeAdsShortVideoV2Activity.this, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
        
            im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(r8.IAuthTabCallback);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
        
            if (((java.lang.Boolean) im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), 726229542, new java.lang.Object[]{r8.IAuthTabCallback}, com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), -726229535, com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback())).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
        
            if (((java.lang.Boolean) im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), 726229542, new java.lang.Object[]{r8.IAuthTabCallback}, com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback(), -726229535, com.google.zxing.datamatrix.encoder.C40Encoder.onExtraCallback())).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
        
            r9 = im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.extraCallbackWithResult.onExtraCallback + 103;
            im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.extraCallbackWithResult.onExtraCallbackWithResult = r9 % 128;
            r9 = r9 % 2;
         */
        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNavigationEvent(PlaybackException playbackException) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(playbackException, "");
                int i3 = 17 / 0;
            } else {
                Intrinsics.checkNotNullParameter(playbackException, "");
            }
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void onExtraCallbackWithResult(NativeAdsEventLogType nativeAdsEventLogType) {
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoV2Activity.this.onNavigationEvent();
                int i3 = 61 / 0;
                if (calculatepageoffsetsOnNavigationEvent == null) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoV2Activity.this.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent == null) {
                    return;
                }
            }
            calculatepageoffsetsOnNavigationEvent.onNavigationEvent(this.onWarmupCompleted.IAuthTabCallbackStub(), this.onNavigationEvent, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoV2Activity$setupPlayerView$1$.ExternalSyntheticLambda2(NativeAdsShortVideoV2Activity.this));
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                nativeAdsShortVideoV2Activity.onExtraCallback(nativeAdsEventLogType.toString());
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(nativeAdsEventLogType.toString());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void IAuthTabCallback(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                int i3 = 57 / 0;
                if (NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).access000.onExtraCallbackWithResult()) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                if (NativeAdsShortVideoV2Activity.IAuthTabCallback(NativeAdsShortVideoV2Activity.this).access000.onExtraCallbackWithResult()) {
                    return;
                }
            }
            if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.IAuthTabCallbackStubProxy)) {
                int i4 = onExtraCallback + 3;
                int i5 = i4 % 128;
                onExtraCallbackWithResult = i5;
                int i6 = i4 % 2;
                if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.ICustomTabsCallback)) {
                    int i7 = i5 + 75;
                    int i8 = i7 % 128;
                    onExtraCallback = i8;
                    int i9 = i7 % 2;
                    if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) && !(nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback)) {
                        int i10 = i8 + 73;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            NativeAdsShortVideoV2Activity.this.onNavigationEvent();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoV2Activity.this.onNavigationEvent();
                        if (calculatepageoffsetsOnNavigationEvent != null) {
                            calculatepageoffsetsOnNavigationEvent.onNavigationEvent(this.onWarmupCompleted.IAuthTabCallbackStub(), this.onNavigationEvent, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoV2Activity$setupPlayerView$1$.ExternalSyntheticLambda1(NativeAdsShortVideoV2Activity.this));
                            int i11 = onExtraCallback + 57;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            return;
                        }
                        return;
                    }
                }
            }
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent2 = NativeAdsShortVideoV2Activity.this.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent2 != null) {
                calculatepageoffsetsOnNavigationEvent2.onWarmupCompleted(this.onWarmupCompleted.IAuthTabCallbackStub(), this.onNavigationEvent, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoV2Activity$setupPlayerView$1$.ExternalSyntheticLambda0(NativeAdsShortVideoV2Activity.this));
            }
        }

        private static final Unit onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(nativeAdsEventLogType.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit asBinder(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(nativeAdsEventLogType.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private final void onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        readTypedObject().access000.setVideoListener(new extraCallbackWithResult(nativeAdsDto, adAsset));
        int i2 = onActivityResized + 33;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(float f, NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, long j, long j2, int i, Object obj) {
        long j3;
        long j4;
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 33;
        int i4 = i3 % 128;
        onActivityResized = i4;
        if (i3 % 2 == 0 ? (i & 8) == 0 : (i & 110) == 0) {
            j3 = j;
        } else {
            int i5 = i4 + 121;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            j3 = 0;
        }
        if ((i & 16) != 0) {
            int i7 = i4 + 111;
            onMessageChannelReady = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 76 / 0;
            }
            j4 = 800;
        } else {
            j4 = j2;
        }
        onWarmupCompleted(f, nativeAdsShortVideoV2Activity, view, j3, j4);
    }

    private static final void onNavigationEvent(View view, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        view.setAlpha(animatedFraction);
        view.setTranslationY(f * (1.0f - animatedFraction));
        int i4 = onMessageChannelReady + 55;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(float f, NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, long j, long j2) {
        int i = 2 % 2;
        view.setAlpha(0.0f);
        view.setTranslationY(f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onExtraCallbackWithResult());
        valueAnimatorOfFloat.addUpdateListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda8(view, f));
        nativeAdsShortVideoV2Activity.getInterfaceDescriptor.add(valueAnimatorOfFloat);
        int i2 = onMessageChannelReady + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    static /* synthetic */ void onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            int i3 = onMessageChannelReady + 1;
            int i4 = i3 % 128;
            onActivityResized = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            onMessageChannelReady = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 3;
            }
            j2 = 600;
        }
        onWarmupCompleted(nativeAdsShortVideoV2Activity, view, j3, j2);
        int i8 = onMessageChannelReady + 125;
        onActivityResized = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        view.setAlpha(((Float) animatedValue).floatValue());
        int i4 = onActivityResized + 19;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, long j, long j2) {
        int i = 2 % 2;
        view.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda7(view));
        nativeAdsShortVideoV2Activity.getInterfaceDescriptor.add(valueAnimatorOfFloat);
        int i2 = onActivityResized + 115;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMessageChannelReady() {
        long j;
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        access000();
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(80, this);
        Typography5 typography5 = readTypedObject().writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Object obj = null;
        onExtraCallbackWithResult(fIAuthTabCallback, this, (View) typography5, 0L, 0L, 16, (Object) null);
        Typography5 typography52 = readTypedObject().extraCallback;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        onExtraCallbackWithResult(fIAuthTabCallback, this, (View) typography52, 0L, 0L, 16, (Object) null);
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = readTypedObject().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
        onExtraCallbackWithResult(fIAuthTabCallback, this, (View) tdsSquircleLayoutV1, 0L, 0L, 16, (Object) null);
        TdsRoundLayout tdsRoundLayout = readTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        onExtraCallbackWithResult(fIAuthTabCallback, this, (View) tdsRoundLayout, 80L, 0L, 16, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = readTypedObject().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        onNavigationEvent(this, tdsRoundLayout2, 0L, 0L, 8, null);
        ConstraintLayout constraintLayout = readTypedObject().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (this.access000 == 0) {
            int i4 = onActivityResized + 79;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            j = 200;
        } else {
            j = 0;
        }
        onNavigationEvent(this, constraintLayout, j, 0L, 8, null);
        Iterator<T> it = this.getInterfaceDescriptor.iterator();
        int i5 = onMessageChannelReady + 107;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 5;
        }
        while (it.hasNext()) {
            int i7 = onActivityResized + 23;
            onMessageChannelReady = i7 % 128;
            if (i7 % 2 == 0) {
                ((ValueAnimator) it.next()).start();
                obj.hashCode();
                throw null;
            }
            ((ValueAnimator) it.next()).start();
        }
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Iterator<T> it = this.getInterfaceDescriptor.iterator();
            int i3 = onMessageChannelReady + 91;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).cancel();
            }
            this.getInterfaceDescriptor.clear();
            return;
        }
        this.getInterfaceDescriptor.iterator();
        throw null;
    }

    private static final void IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("2500"), null, null, new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda21(nativeAdsShortVideoV2Activity), new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda22(nativeAdsShortVideoV2Activity, shortFormVideo), 24, null);
        int i2 = onActivityResized + 91;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        int i3 = 77 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 im.toss.ads_sdk.NativeAdsManager) = (r1v4 im.toss.ads_sdk.NativeAdsManager), (r1v9 im.toss.ads_sdk.NativeAdsManager) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity);
            int i3 = 49 / 0;
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoV2Activity);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    int i4 = onActivityResized + 85;
                    onMessageChannelReady = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    strIAuthTabCallbackStub = null;
                }
                if (strIAuthTabCallbackStub == null) {
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new getInterfaceDescriptor());
                int i6 = onMessageChannelReady + 47;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            }
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoV2Activity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallbackStub(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("1001"), null, null, new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda3(nativeAdsShortVideoV2Activity), new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda4(nativeAdsShortVideoV2Activity, shortFormVideo), 24, null);
        int i2 = onActivityResized + 95;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity] */
    private static /* synthetic */ Object access000(Object[] objArr) {
        ?? r0 = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 45;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r0);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r0);
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                if (strIAuthTabCallbackStub == null) {
                    int i3 = onActivityResized + 109;
                    onMessageChannelReady = i3 % 128;
                    int i4 = i3 % 2;
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new access100());
            }
            getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r0, shortFormVideo.onWarmupCompleted());
            return Unit.INSTANCE;
        }
        NativeAdsBaseActivity.IAuthTabCallbackDefault(r0);
        strIAuthTabCallbackStub.hashCode();
        throw null;
    }

    private static final void onTransact(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("1002"), null, null, new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda1(nativeAdsShortVideoV2Activity), new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda2(nativeAdsShortVideoV2Activity, shortFormVideo), 24, null);
        int i2 = onActivityResized + 35;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Unit unit;
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            unit = Unit.INSTANCE;
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            unit = Unit.INSTANCE;
        }
        int i4 = onMessageChannelReady + 53;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoV2Activity);
            String strIAuthTabCallbackStub = null;
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i2 = onActivityResized + 53;
                onMessageChannelReady = i2 % 128;
                if (i2 % 2 == 0) {
                    nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    throw null;
                }
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
                int i3 = onMessageChannelReady + 113;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallbackStubProxy());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoV2Activity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            unit = Unit.INSTANCE;
            int i3 = 69 / 0;
        } else {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            unit = Unit.INSTANCE;
        }
        int i4 = onMessageChannelReady + 79;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r3
      0x0028: PHI (r3v5 im.toss.ads_sdk.NativeAdsManager) = (r3v4 im.toss.ads_sdk.NativeAdsManager), (r3v7 im.toss.ads_sdk.NativeAdsManager) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        ?? r1 = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 17;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r1);
            int i3 = 18 / 0;
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r1);
                String strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                if (strIAuthTabCallbackStub == null) {
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new access000());
                int i4 = onActivityResized + 111;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r1);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            }
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r1, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final void asInterface(final NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, final NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoV2Activity.IAuthTabCallbackDefault(), str, adAsset, null, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(this.f$0, (NativeAdsEventLogType) obj);
                    int i4 = 9 / 0;
                } else {
                    unitOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(this.f$0, (NativeAdsEventLogType) obj);
                }
                int i5 = onExtraCallback + 31;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, new Function0() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 93;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = NativeAdsShortVideoV2Activity.onExtraCallback(this.f$0, shortFormVideo);
                int i5 = onWarmupCompleted + 83;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 28, null);
        int i2 = onMessageChannelReady + 87;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 7;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoV2Activity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 97;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r2
      0x0025: PHI (r2v4 im.toss.ads_sdk.model.NativeAdsDto) = (r2v3 im.toss.ads_sdk.model.NativeAdsDto), (r2v9 im.toss.ads_sdk.model.NativeAdsDto) binds: [B:10:0x0023, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        NativeAdsDto nativeAdsDtoIAuthTabCallbackStub;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoV2Activity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i2 = onMessageChannelReady + 3;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoV2Activity);
                int i3 = 36 / 0;
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                } else {
                    int i4 = onMessageChannelReady + 57;
                    onActivityResized = i4 % 128;
                    int i5 = i4 % 2;
                    strIAuthTabCallbackStub = null;
                }
            } else {
                nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoV2Activity);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                }
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallback_Parcel());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoV2Activity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    static final class onTransact implements Runnable {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        onTransact() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.IAuthTabCallback(r7.onNavigationEvent).access000.setupVideoSlotRect(new android.graphics.Rect(0, im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.IAuthTabCallback(r7.onNavigationEvent).onTransact.getBottom() + o.varyMatches.IAuthTabCallback(r1, r7.onNavigationEvent), im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.IAuthTabCallback(r7.onNavigationEvent).onExtraCallback().getWidth(), im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.IAuthTabCallback(r7.onNavigationEvent).writeTypedObject.getTop() - o.varyMatches.IAuthTabCallback(r1, r7.onNavigationEvent)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r7.onNavigationEvent.isFinishing() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if (r7.onNavigationEvent.isFinishing() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        
            r1 = im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onTransact.onExtraCallback + 45;
            im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onTransact.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2 == 0 ? 39 : 24;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 109;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.IAuthTabCallback_Parcel) {
            readTypedObject().getInterfaceDescriptor.setText(((Object) readTypedObject().getInterfaceDescriptor.getText()) + "\n " + str + " :: " + (System.currentTimeMillis() - this.access100));
            int i4 = onMessageChannelReady + 115;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final NativeAdsDto.AdAsset adAsset, final NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 57;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
            if (this.IAuthTabCallback_Parcel) {
                readTypedObject().readTypedObject.setOnLongClickListener(new View.OnLongClickListener() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Object[] objArr = {this.f$0, view};
                        int iOnExtraCallback = C40Encoder.onExtraCallback();
                        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
                        if (i6 == 0) {
                            return ((Boolean) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 103726687, objArr, C40Encoder.onExtraCallback(), iOnExtraCallback, -103726683, iOnExtraCallback2)).booleanValue();
                        }
                        ((Boolean) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 103726687, objArr, C40Encoder.onExtraCallback(), iOnExtraCallback, -103726683, iOnExtraCallback2)).booleanValue();
                        throw null;
                    }
                });
            }
        } else if (this.IAuthTabCallback_Parcel) {
        }
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = readTypedObject().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.98f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda12
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnWarmupCompleted = NativeAdsShortVideoV2Activity.onWarmupCompleted(this.f$0, adAsset, nativeAdsDto, (MotionEvent) obj);
                int i7 = onWarmupCompleted + 55;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 4030, null);
        int i4 = onActivityResized + 29;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityResized + 79;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoV2Activity.onExtraCallback(nativeAdsEventLogType.toString());
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 113;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        float f;
        NativeAdsEventLogType nativeAdsEventLogType;
        final NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = (NativeAdsShortVideoV2Activity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 99;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        nativeAdsShortVideoV2Activity.extraCallback = !nativeAdsShortVideoV2Activity.extraCallback;
        Player player = nativeAdsShortVideoV2Activity.readTypedObject;
        if (player == null) {
            int i5 = i3 + 9;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            player = null;
        }
        if (nativeAdsShortVideoV2Activity.extraCallback) {
            int i7 = onActivityResized + 55;
            onMessageChannelReady = i7 % 128;
            int i8 = i7 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        player.setVolume(f);
        nativeAdsShortVideoV2Activity.onActivityResized();
        if (!nativeAdsShortVideoV2Activity.readTypedObject().access000.onExtraCallbackWithResult()) {
            int i9 = onMessageChannelReady;
            int i10 = i9 + 5;
            onActivityResized = i10 % 128;
            int i11 = i10 % 2;
            if (nativeAdsShortVideoV2Activity.extraCallback) {
                int i12 = i9 + 119;
                onActivityResized = i12 % 128;
                int i13 = i12 % 2;
                nativeAdsEventLogType = NativeAdsEventLogType.writeTypedObject.onExtraCallback;
            } else {
                nativeAdsEventLogType = NativeAdsEventLogType.onPostMessage.IAuthTabCallback;
                int i14 = onMessageChannelReady + 71;
                onActivityResized = i14 % 128;
                int i15 = i14 % 2;
            }
            Iterator<T> it = adAsset.onWarmupCompleted().iterator();
            while (!(!it.hasNext())) {
                if (Intrinsics.areEqual(((String) it.next()).toString(), nativeAdsEventLogType.toString())) {
                    calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoV2Activity.onNavigationEvent();
                    if (calculatepageoffsetsOnNavigationEvent != null) {
                        calculatepageoffsetsOnNavigationEvent.onNavigationEvent(nativeAdsDto.IAuthTabCallbackStub(), adAsset, nativeAdsEventLogType, new Function1() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda6
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i16 = 2 % 2;
                                int i17 = onExtraCallback + 43;
                                onWarmupCompleted = i17 % 128;
                                int i18 = i17 % 2;
                                Object[] objArr2 = {this.f$0, (NativeAdsEventLogType) obj};
                                int iOnExtraCallback = C40Encoder.onExtraCallback();
                                int iOnExtraCallback2 = C40Encoder.onExtraCallback();
                                if (i18 != 0) {
                                    return (Unit) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1840939968, objArr2, C40Encoder.onExtraCallback(), iOnExtraCallback, -1840939967, iOnExtraCallback2);
                                }
                                int i19 = 4 / 0;
                                return (Unit) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1840939968, objArr2, C40Encoder.onExtraCallback(), iOnExtraCallback, -1840939967, iOnExtraCallback2);
                            }
                        });
                        int i16 = onActivityResized + 51;
                        onMessageChannelReady = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = nativeAdsShortVideoV2Activity.readTypedObject().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1119102774, new Object[]{nativeAdsShortVideoV2Activity, tdsRoundLayout}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1119102776, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 846352994);
        minFresh.onNavigationEvent(nativeAdsShortVideoV2Activity, noStore.Companion.access100());
        int i4 = onMessageChannelReady + 13;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityResized() throws Throwable {
        String strIntern;
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
            if (this.extraCallback) {
                Object[] objArr = new Object[1];
                a(new char[]{2127, 15250, 30339, 2087, 4510, 8711, 27008, 5784, 41436, 61424, 34940, 16383, 23548, 17886, 56914, 50628, 62854, 5097, 9277, 27620, 44960, 59929, 35456, 12382, 22854, 16423, 53500, 50745, 62316, 7749, 9949, 27715, 44352, 62586, 36093, 12919, 18272, 17118, 54539, 55519, 61638, 6313, 15164, 28350, 43682, 63193, 33116, 13509, 17537, 19694, 55102, 56063, 65193, 6924, 15838, 25373, 43072, 61732, 33724, 2430, 17023, 20292, 59860}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr);
                strIntern = ((String) objArr[0]).intern();
                int i4 = onActivityResized + 101;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{23330, 35694, 46799, 23370, 41314, 57931, 8436, 24556, 62129, 24332, 18480, 30347, 2193, 62754, 7710, 36016, 42731, 41749, 58481, 8848, 64717, 23269, 19148, 31018, 2603, 61659, 4272, 36685, 40961, 44729, 59025, 9527, 65069, 17542, 19633, 31491, 5133, 61986, 5447, 37291, 41899, 43093, 64368, 10186, 63951, 17957, 16656, 32177, 6124, 64530, 6002, 37771, 44492, 43963, 64978, 10859, 64300, 16857, 17329, 16468, 4364, 65457}, Color.argb(0, 0, 0, 0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
        } else if (this.extraCallback) {
        }
        TdsImageView tdsImageView = readTypedObject().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
        if (this.IAuthTabCallbackStubProxy) {
            readTypedObject().onTransact.setOnTouchListener(null);
            readTypedObject().onTransact.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -177684455, new Object[]{this.f$0, view}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 177684470, C40Encoder.onExtraCallback());
                        int i8 = 36 / 0;
                    } else {
                        NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -177684455, new Object[]{this.f$0, view}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 177684470, C40Encoder.onExtraCallback());
                    }
                    int i9 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            return;
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        if (nativeAdsDtoAsInterface != null) {
            int i6 = onActivityResized + 95;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult != null) {
                int i8 = onActivityResized + 35;
                onMessageChannelReady = i8 % 128;
                if (i8 % 2 == 0) {
                    adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                    int i9 = 32 / 0;
                    if (adAsset == null) {
                        return;
                    }
                } else {
                    adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                    if (adAsset == null) {
                        return;
                    }
                }
                onExtraCallbackWithResult(adAsset, nativeAdsDtoAsInterface);
                int i10 = onActivityResized + 123;
                onMessageChannelReady = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 3;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r1 = (NativeAdsShortVideoV2Activity) objArr[0];
        final View view = (View) objArr[1];
        int i = 2 % 2;
        r1.extraCallback();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(varyMatches.IAuthTabCallback(2, (Context) r1), 0);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new Rmenu.onNavigationEvent(1.0d, 0.2d));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 35;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {view, valueAnimator};
                if (i4 != 0) {
                    NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -772236756, objArr2, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 772236762, C40Encoder.onExtraCallback());
                } else {
                    NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -772236756, objArr2, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 772236762, C40Encoder.onExtraCallback());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new onMinimized(view));
        valueAnimatorOfInt.addListener(new readTypedObject(view));
        valueAnimatorOfInt.start();
        ((NativeAdsShortVideoV2Activity) r1).onMinimized = valueAnimatorOfInt;
        int i2 = onActivityResized + 97;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 65;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
        view.setTranslationX(((Integer) r4).intValue());
        int i4 = onMessageChannelReady + 121;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 113;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ValueAnimator valueAnimator = this.onMinimized;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = onActivityResized + 7;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 1;
        onActivityResized = i2 % 128;
        Player player = null;
        if (i2 % 2 != 0) {
            readTypedObject().access000.onWarmupCompleted(adAsset, shortFormVideo, "3001");
            throw null;
        }
        ShortFormPlayerView shortFormPlayerView = readTypedObject().access000;
        shortFormPlayerView.onWarmupCompleted(adAsset, shortFormVideo, "3001");
        ExoPlayer exoPlayer = this.readTypedObject;
        if (exoPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = onActivityResized + 95;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            exoPlayer = null;
        }
        shortFormPlayerView.IAuthTabCallback(exoPlayer);
        this.asBinder = shortFormVideo.access000();
        CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
        ExoPlayer exoPlayer2 = this.readTypedObject;
        if (exoPlayer2 == null) {
            int i5 = onMessageChannelReady + 77;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 20 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            exoPlayer2 = null;
        }
        String str = this.asBinder;
        if (str == null) {
            str = "";
        }
        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayer2, this, str, false, null, 8, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        Player player2 = this.readTypedObject;
        if (player2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            player2 = null;
        }
        player2.prepare();
        Player player3 = this.readTypedObject;
        if (player3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            player3 = null;
        }
        player3.setPlayWhenReady(true);
        Player player4 = this.readTypedObject;
        if (player4 == null) {
            int i7 = onMessageChannelReady + 83;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i9 = onMessageChannelReady + 95;
            onActivityResized = i9 % 128;
            int i10 = i9 % 2;
        } else {
            player = player4;
        }
        player.play();
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        if (this.ICustomTabsCallback) {
            int i2 = onActivityResized + 95;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {readTypedObject().access000};
                ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
            } else {
                Object[] objArr2 = {readTypedObject().access000};
                ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        readTypedObject().IAuthTabCallbackStub.onNavigationEvent();
        int i3 = onActivityResized + 55;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity
    public void onStop() {
        int i = 2 % 2;
        int i2 = onActivityResized + 87;
        onMessageChannelReady = i2 % 128;
        Player player = null;
        if (i2 % 2 != 0) {
            super.onStop();
            access100();
            Player player2 = this.readTypedObject;
            if (player2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                player2 = null;
            }
            player2.setPlayWhenReady(false);
            try {
                Player player3 = this.readTypedObject;
                if (player3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    player = player3;
                }
                player.pause();
                int i3 = onActivityResized + 15;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable unused) {
            }
            readTypedObject().access000.onNavigationEvent();
            readTypedObject().IAuthTabCallbackStub.onWarmupCompleted();
            access000();
            extraCallback();
            int i5 = onActivityResized + 33;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super.onStop();
        access100();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull ExoPlayer exoPlayer) {
        Tracks.Group group;
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 91;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(exoPlayer, "");
            Tracks currentTracks = exoPlayer.getCurrentTracks();
            Intrinsics.checkNotNullExpressionValue(currentTracks, "");
            Intrinsics.checkNotNullExpressionValue(currentTracks.getGroups().iterator(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(exoPlayer, "");
        Tracks currentTracks2 = exoPlayer.getCurrentTracks();
        Intrinsics.checkNotNullExpressionValue(currentTracks2, "");
        UnmodifiableIterator it = currentTracks2.getGroups().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            int i4 = onMessageChannelReady + 23;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                group = (Tracks.Group) it.next();
                if (group.getType() == 0) {
                    int i5 = onMessageChannelReady + 63;
                    onActivityResized = i5 % 128;
                    int i6 = i5 % 2;
                    i = group.length;
                    int i7 = onMessageChannelReady + 69;
                    onActivityResized = i7 % 128;
                    int i8 = i7 % 2;
                    for (int i9 = 0; i9 < i; i9++) {
                        if (group.isTrackSelected(i9)) {
                            int i10 = onActivityResized + 121;
                            onMessageChannelReady = i10 % 128;
                            int i11 = i10 % 2;
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                group = (Tracks.Group) it.next();
                if (group.getType() == 1) {
                    int i52 = onMessageChannelReady + 63;
                    onActivityResized = i52 % 128;
                    int i62 = i52 % 2;
                    i = group.length;
                    int i72 = onMessageChannelReady + 69;
                    onActivityResized = i72 % 128;
                    int i82 = i72 % 2;
                    while (i9 < i) {
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 27;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject().IAuthTabCallback_Parcel.setImportantForAccessibility(2);
        readTypedObject().IAuthTabCallbackStubProxy.setImportantForAccessibility(2);
        readTypedObject().extraCallbackWithResult.setImportantForAccessibility(2);
        readTypedObject().ICustomTabsCallback.setImportantForAccessibility(2);
        readTypedObject().onWarmupCompleted.setImportantForAccessibility(2);
        readTypedObject().asBinder.setImportantForAccessibility(2);
        readTypedObject().onExtraCallbackWithResult.setImportantForAccessibility(2);
        readTypedObject().onNavigationEvent.setContentDescription(null);
        readTypedObject().onNavigationEvent.setImportantForAccessibility(2);
        readTypedObject().asInterface.setContentDescription(null);
        readTypedObject().asInterface.setImportantForAccessibility(2);
        int i4 = onActivityResized + 43;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        readTypedObject().access000.post(new Runnable() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda25
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsShortVideoV2Activity.onWarmupCompleted(this.f$0);
                int i5 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onMessageChannelReady + 59;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void IAuthTabCallbackStubProxy(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 51;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {nativeAdsShortVideoV2Activity.readTypedObject().access000};
        ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
        int i4 = onMessageChannelReady + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onDestroy() {
        Object obj;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityResized = i2 % 128;
        Player player = null;
        if (i2 % 2 != 0) {
            access100();
            player.hashCode();
            throw null;
        }
        access100();
        Player player2 = this.readTypedObject;
        if (player2 != null) {
            try {
                Result.Companion companion = Result.Companion;
                if (player2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    player2 = null;
                }
                player2.removeListener(this.IAuthTabCallbackStub);
                Player player3 = this.readTypedObject;
                if (player3 == null) {
                    int i3 = onActivityResized + 29;
                    onMessageChannelReady = i3 % 128;
                    if (i3 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        player.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    player = player3;
                }
                player.release();
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null && this.IAuthTabCallback_Parcel) {
                th2.getMessage();
            }
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i4 = onActivityResized + 103;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsManagerIAuthTabCallbackDefault.onWarmupCompleted(this.extraCallbackWithResult);
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        boolean z;
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 99;
        onActivityResized = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            super.onCreate(bundle);
            readTypedObject().IAuthTabCallbackStub.setV2Style(false);
            if (!IAuthTabCallback_Parcel().RemoteActionCompatParcelizer()) {
                z = IAuthTabCallback_Parcel().MediaMetadataCompat();
            }
        } else {
            IAuthTabCallbackStub();
            super.onCreate(bundle);
            readTypedObject().IAuthTabCallbackStub.setV2Style(true);
            if (!IAuthTabCallback_Parcel().RemoteActionCompatParcelizer()) {
            }
        }
        this.IAuthTabCallback_Parcel = z;
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(this);
        Object[] objArr = new Object[1];
        a(new char[]{23330, 35694, 46799, 23370, 41314, 57931, 8436, 24556, 62129, 24332, 18480, 30347, 2193, 62754, 7710, 36016, 42731, 41749, 58481, 8848, 64717, 23269, 19148, 31018, 2603, 61659, 4272, 36685, 40961, 44729, 59025, 9527, 65069, 17542, 19633, 31491, 5133, 61986, 5447, 37291, 41899, 43093, 64368, 10186, 63951, 17957, 16656, 32177, 6124, 64530, 6002, 37771, 44492, 43963, 64978, 10859, 64300, 16857, 17329, 16468, 4364, 65457}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr[0]).intern(), (Context) null, 2, (Object) null);
        this.access100 = System.currentTimeMillis();
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(this.extraCallbackWithResult);
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        NativeAdsDto.AdAsset adAsset = (nativeAdsDtoAsInterface == null || (listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult()) == null) ? null : (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
        if (adAsset != null) {
            int i3 = onMessageChannelReady + 29;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
        } else {
            creativeOnExtraCallbackWithResult = null;
        }
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ShortFormVideo ? (NativeAdsDto.Creative.ShortFormVideo) creativeOnExtraCallbackWithResult : null;
        if (shortFormVideo == null) {
            int i5 = onMessageChannelReady + 75;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            setResult(0);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onExtraCallbackWithResult());
            }
            super.finish();
            int i7 = onMessageChannelReady + 47;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        onActivityLayout();
        writeTypedObject();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1558076832, new Object[]{this, nativeAdsDtoAsInterface, adAsset}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1558076816, C40Encoder.onExtraCallback());
        IAuthTabCallback(nativeAdsDtoAsInterface, adAsset);
        onExtraCallbackWithResult(adAsset, nativeAdsDtoAsInterface);
        setContentView(readTypedObject().onExtraCallback());
        extraCallbackWithResult();
        onExtraCallback(nativeAdsDtoAsInterface, adAsset);
        NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDtoAsInterface.onTransact();
        if (extraInfoOnTransact != null) {
            int i9 = onMessageChannelReady + 63;
            onActivityResized = i9 % 128;
            if (i9 % 2 == 0 ? extraInfoOnTransact.asBinder() : !extraInfoOnTransact.asBinder()) {
                z2 = true;
            }
        }
        IAuthTabCallback(z2, nativeAdsDtoAsInterface.IAuthTabCallbackStub(), adAsset, shortFormVideo);
        onWarmupCompleted(adAsset, shortFormVideo);
        onMessageChannelReady();
        ICustomTabsCallback();
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault3 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault3 != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub2 != null) {
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
                int i10 = onMessageChannelReady + 47;
                onActivityResized = i10 % 128;
                int i11 = i10 % 2;
            }
            nativeAdsManagerIAuthTabCallbackDefault3.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onWarmupCompleted());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0156, code lost:
    
        if (r1.isLayoutRequested() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x015d, code lost:
    
        if (r1.isLayoutRequested() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x016c, code lost:
    
        if (IAuthTabCallback(r27).onExtraCallback().getWidth() == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x016e, code lost:
    
        r1 = im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onMessageChannelReady + 47;
        im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onActivityResized = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0177, code lost:
    
        if ((r1 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0183, code lost:
    
        if (IAuthTabCallback(r27).writeTypedObject.getHeight() == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0185, code lost:
    
        IAuthTabCallback(r27).access000.setupVideoSlotRect(new android.graphics.Rect(0, IAuthTabCallback(r27).onTransact.getBottom() + o.varyMatches.IAuthTabCallback(24, r27), IAuthTabCallback(r27).onExtraCallback().getWidth(), IAuthTabCallback(r27).writeTypedObject.getTop() - o.varyMatches.IAuthTabCallback(24, r27)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01be, code lost:
    
        IAuthTabCallback(r27).writeTypedObject.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01c9, code lost:
    
        IAuthTabCallback(r27).writeTypedObject.post(new im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity.onTransact(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d7, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(boolean z, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = readTypedObject().onExtraCallbackWithResult;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsSquircleLayoutV1.setBackgroundColor(new getUrlokhttp(new asInterface(configuration)).onSessionEnded());
        TdsSquircleLayoutV1 tdsSquircleLayoutV12 = readTypedObject().onExtraCallbackWithResult;
        Configuration configuration2 = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsSquircleLayoutV12.setStrokeColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).onSessionEnded());
        readTypedObject().onExtraCallbackWithResult.setStrokeWidth(setTagsokhttp.onExtraCallback(this, 1));
        TdsImageView tdsImageView = readTypedObject().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, shortFormVideo.IAuthTabCallbackDefault(), (Function1) null, (Function1) null, 6, (Object) null);
        readTypedObject().onNavigationEvent.setOnClickListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda14(this, str, adAsset, shortFormVideo));
        readTypedObject().writeTypedObject.setText(shortFormVideo.asInterface());
        readTypedObject().writeTypedObject.setOnClickListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda15(this, str, adAsset, shortFormVideo));
        if (z) {
            readTypedObject().extraCallback.setText(shortFormVideo.IAuthTabCallbackStub() + " ・ AD");
        } else {
            readTypedObject().extraCallback.setText(shortFormVideo.IAuthTabCallbackStub());
            int i2 = onActivityResized + 59;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
        }
        readTypedObject().extraCallback.setOnClickListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda16(this, str, adAsset, shortFormVideo));
        readTypedObject().access100.setText(shortFormVideo.onTransact());
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = readTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, null, new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda17(this, str, adAsset, shortFormVideo), 4094, null);
        readTypedObject().asBinder.setOnClickListener(new NativeAdsShortVideoV2Activity$.ExternalSyntheticLambda18(this, str, adAsset, shortFormVideo));
        Typography5 typography5 = readTypedObject().writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        if (typography5.isLaidOut()) {
            int i4 = onActivityResized + 41;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }
        typography5.addOnLayoutChangeListener(new IAuthTabCallbackStub());
    }

    private static final boolean onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 25;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            ScrollView scrollView = nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            ScrollView scrollView2 = nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "");
            if (scrollView2.getVisibility() == 0) {
                i = 8;
            } else {
                int i4 = onActivityResized + 117;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            }
            scrollView.setVisibility(i);
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallback, "");
        ScrollView scrollView3 = nativeAdsShortVideoV2Activity.readTypedObject().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(scrollView3, "");
        scrollView3.getVisibility();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1840939968, new Object[]{nativeAdsShortVideoV2Activity, nativeAdsEventLogType}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1840939967, iOnExtraCallback2);
    }

    public static /* synthetic */ void onExtraCallback(View view, ValueAnimator valueAnimator) throws Throwable {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -772236756, new Object[]{view, valueAnimator}, C40Encoder.onExtraCallback(), iOnExtraCallback, 772236762, iOnExtraCallback2);
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view) throws Throwable {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -177684455, new Object[]{nativeAdsShortVideoV2Activity, view}, C40Encoder.onExtraCallback(), iOnExtraCallback, 177684470, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 222371131, new Object[]{nativeAdsShortVideoV2Activity, nativeAdsEventLogType}, C40Encoder.onExtraCallback(), iOnExtraCallback, -222371128, iOnExtraCallback2);
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -128877873, new Object[]{nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, view}, C40Encoder.onExtraCallback(), iOnExtraCallback, 128877883, iOnExtraCallback2);
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 103726687, new Object[]{nativeAdsShortVideoV2Activity, view}, C40Encoder.onExtraCallback(), iOnExtraCallback, -103726683, iOnExtraCallback2)).booleanValue();
    }

    public static final /* synthetic */ ExoPlayer onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (ExoPlayer) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), iOnExtraCallback, 79730255, iOnExtraCallback2);
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 726229542, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), iOnExtraCallback, -726229535, iOnExtraCallback2)).booleanValue();
    }

    private static final WindowInsetsCompat onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, View view, WindowInsetsCompat windowInsetsCompat) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (WindowInsetsCompat) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1217915667, new Object[]{nativeAdsShortVideoV2Activity, view, windowInsetsCompat}, C40Encoder.onExtraCallback(), iOnExtraCallback, 1217915667, iOnExtraCallback2);
    }

    private static final Unit asBinder(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -803120451, new Object[]{nativeAdsShortVideoV2Activity, shortFormVideo}, C40Encoder.onExtraCallback(), iOnExtraCallback, 803120468, iOnExtraCallback2);
    }

    private static final Unit asBinder(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1330953088, new Object[]{nativeAdsShortVideoV2Activity, nativeAdsEventLogType}, C40Encoder.onExtraCallback(), iOnExtraCallback, 1330953100, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, MotionEvent motionEvent) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1265028856, new Object[]{nativeAdsShortVideoV2Activity, str, adAsset, shortFormVideo, motionEvent}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1265028845, iOnExtraCallback2);
    }

    private static final Unit onTransact(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1969800502, new Object[]{nativeAdsShortVideoV2Activity, shortFormVideo}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1969800497, iOnExtraCallback2);
    }

    private static final Unit access100(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 128644675, new Object[]{nativeAdsShortVideoV2Activity, nativeAdsEventLogType}, C40Encoder.onExtraCallback(), iOnExtraCallback, -128644661, iOnExtraCallback2);
    }

    private final void onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) throws Throwable {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 1558076832, new Object[]{this, nativeAdsDto, adAsset}, C40Encoder.onExtraCallback(), iOnExtraCallback, -1558076816, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.AdAsset adAsset, NativeAdsDto nativeAdsDto, MotionEvent motionEvent) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1724889197, new Object[]{nativeAdsShortVideoV2Activity, adAsset, nativeAdsDto, motionEvent}, C40Encoder.onExtraCallback(), iOnExtraCallback, 1724889205, iOnExtraCallback2);
    }

    private final void IAuthTabCallback(View view) throws Throwable {
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -1119102774, new Object[]{this, view}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1119102776, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 846352994);
    }

    private static final void IAuthTabCallback(View view, ValueAnimator valueAnimator) throws Throwable {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -672199397, new Object[]{view, valueAnimator}, C40Encoder.onExtraCallback(), iOnExtraCallback, 672199406, iOnExtraCallback2);
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityResized + 109;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onMessageChannelReady + 109;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onActivityResized + 103;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onActivityResized + 117;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallbackStubProxy() {
        onActivityLayout = -6748894739420786316L;
    }
}
