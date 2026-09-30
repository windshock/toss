package im.toss.ads_sdk.ui.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$setupPlayerView$1$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.ads_sdk.ui.view.ShortFormPlayerView;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda4;
import o.CarouselKtExternalSyntheticLambda8;
import o.CommonModule_setSecureScreen;
import o.LinkGenerator;
import o.M_;
import o.Rmenu;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.addOnAdapterChangeListener;
import o.applyLabel;
import o.calculatePageOffsets;
import o.deleteProfile;
import o.endRearDisplayPresentationSession;
import o.getFillAlpha;
import o.getPackageType;
import o.getStrokeWidth;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.noStore;
import o.setRandomHost;
import o.setTagsokhttp;
import o.setTranslateX;
import o.setTrimPathOffset;
import o.varyMatches;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsShortVideoActivity extends Hilt_NativeAdsShortVideoActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    public static final int asInterface;
    private static int onActivityLayout = 0;
    private static long onActivityResized = 0;
    private static int onPostMessage = 1;
    private boolean IAuthTabCallbackStubProxy;
    private boolean access100;
    private String asBinder;

    @Inject
    public zzad environments;
    private ExoPlayer extraCallback;
    private boolean extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private ValueAnimator onMessageChannelReady;
    private getPackageType onMinimized;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new extraCallback(this));
    private boolean writeTypedObject = true;
    private final List<ValueAnimator> IAuthTabCallback_Parcel = new ArrayList();
    private long access000 = System.currentTimeMillis();
    private final long readTypedObject = 500;
    private final onNavigationEvent ICustomTabsCallback = new onNavigationEvent();
    private final onWarmupCompleted IAuthTabCallbackStub = new onWarmupCompleted();

    static {
        access100();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 15;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        int i4 = onActivityLayout + 5;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsShortVideoActivity, shortFormVideo);
        int i4 = onActivityLayout + 61;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onPostMessage + 91;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -174430332, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, motionEvent}, 174430343);
        }
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onTransact(nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[3];
        View view = (View) objArr[4];
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = onActivityLayout + 95;
        onPostMessage = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(nativeAdsShortVideoActivity, shortFormVideo);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = onActivityLayout + 61;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 101;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = onPostMessage + 125;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(nativeAdsShortVideoActivity, view);
        int i4 = onActivityLayout + 33;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1059879924, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, nativeAdsEventLogType}, -1059879921);
        }
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent4, 1059879924, iOnNavigationEvent6, new Object[]{nativeAdsShortVideoActivity, nativeAdsEventLogType}, -1059879921);
        int i3 = 96 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1023647961, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, shortFormVideo}, 1023647962);
        int i4 = onActivityLayout + 23;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        int i4 = onActivityLayout + 109;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 9;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(nativeAdsShortVideoActivity, view, windowInsetsCompat);
        }
        onWarmupCompleted(nativeAdsShortVideoActivity, view, windowInsetsCompat);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsShortVideoActivity nativeAdsShortVideoActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsDto, nativeAdsShortVideoActivity, z);
        int i4 = onPostMessage + 31;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.AdAsset adAsset, NativeAdsDto nativeAdsDto, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(nativeAdsShortVideoActivity, adAsset, nativeAdsDto, motionEvent);
        }
        onExtraCallback(nativeAdsShortVideoActivity, adAsset, nativeAdsDto, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(nativeAdsShortVideoActivity, shortFormVideo);
        int i4 = onActivityLayout + 103;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        int i4 = onActivityLayout + 125;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ void onNavigationEvent(View view, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(view, f, valueAnimator);
        int i4 = onPostMessage + 27;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onPostMessage + 75;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(view, valueAnimator);
        int i4 = onPostMessage + 49;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        access100(nativeAdsShortVideoActivity);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onActivityLayout + 69;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 610495279, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view}, -610495269);
            return;
        }
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent4, 610495279, iOnNavigationEvent6, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view}, -610495269);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            zBooleanValue = ((Boolean) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1059252509, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, view}, 1059252522)).booleanValue();
            int i3 = 35 / 0;
        } else {
            int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            zBooleanValue = ((Boolean) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent4, -1059252509, iOnNavigationEvent6, new Object[]{nativeAdsShortVideoActivity, view}, 1059252522)).booleanValue();
        }
        int i4 = onPostMessage + 81;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~((~i3) | i6 | i4);
        int i11 = i9 | i10;
        int i12 = (~(i3 | i8 | i6)) | i10;
        int i13 = i6 | i4;
        int i14 = i6 + i4 + i2 + ((-1865910757) * i5) + ((-1665280692) * i);
        int i15 = i14 * i14;
        int i16 = (i6 * (-52584228)) + 761582770 + (i4 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + ((-52583813) * i2) + ((-195242759) * i5) + (1657508740 * i) + (i15 * (-834797568));
        switch (((i6 * (-906343980)) - 215482368) + ((-906343980) * i4) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i2) + ((-1540882432) * i5) + ((-912261120) * i) + (1566179328 * i15) + (i16 * i16 * 1251344384)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
                int i17 = 2 % 2;
                int i18 = onPostMessage + 43;
                onActivityLayout = i18 % 128;
                int i19 = i18 % 2;
                onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 483064426, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{nativeAdsShortVideoActivity}, -483064411);
                int i20 = onPostMessage + 15;
                onActivityLayout = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                final NativeAdsShortVideoActivity nativeAdsShortVideoActivity2 = (NativeAdsShortVideoActivity) objArr[0];
                String str = (String) objArr[1];
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
                final NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[3];
                int i22 = 2 % 2;
                NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsShortVideoActivity2.IAuthTabCallbackDefault();
                Object[] objArr2 = new Object[1];
                a(new char[]{49305}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9421, objArr2);
                getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, str, adAsset, new NativeAdsEventLogType.onExtraCallback(((String) objArr2[0]).intern()), null, null, new Function1() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i23 = 2 % 2;
                        int i24 = onNavigationEvent + 35;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnExtraCallbackWithResult = NativeAdsShortVideoActivity.onExtraCallbackWithResult(this.f$0, (NativeAdsEventLogType) obj);
                        int i26 = onNavigationEvent + 87;
                        onExtraCallbackWithResult = i26 % 128;
                        if (i26 % 2 == 0) {
                            int i27 = 80 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                }, new Function0() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i23 = 2 % 2;
                        int i24 = IAuthTabCallback + 59;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        NativeAdsShortVideoActivity nativeAdsShortVideoActivity3 = this.f$0;
                        if (i25 == 0) {
                            return NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity3, shortFormVideo);
                        }
                        int i26 = 18 / 0;
                        return NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity3, shortFormVideo);
                    }
                }, 24, null);
                Unit unit = Unit.INSTANCE;
                int i23 = onActivityLayout + 53;
                onPostMessage = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return onTransact(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return access000(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return access100(objArr);
            default:
                final float fFloatValue = ((Number) objArr[0]).floatValue();
                NativeAdsShortVideoActivity nativeAdsShortVideoActivity3 = (NativeAdsShortVideoActivity) objArr[1];
                final View view = (View) objArr[2];
                long jLongValue = ((Number) objArr[3]).longValue();
                long jLongValue2 = ((Number) objArr[4]).longValue();
                int i25 = 2 % 2;
                view.setAlpha(0.0f);
                view.setTranslationY(fFloatValue);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setStartDelay(jLongValue);
                valueAnimatorOfFloat.setDuration(jLongValue2);
                valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onExtraCallbackWithResult());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda16
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i26 = 2 % 2;
                        int i27 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i27 % 128;
                        if (i27 % 2 == 0) {
                            NativeAdsShortVideoActivity.onNavigationEvent(view, fFloatValue, valueAnimator);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        NativeAdsShortVideoActivity.onNavigationEvent(view, fFloatValue, valueAnimator);
                        int i28 = onWarmupCompleted + 3;
                        onExtraCallbackWithResult = i28 % 128;
                        int i29 = i28 % 2;
                    }
                });
                nativeAdsShortVideoActivity3.IAuthTabCallback_Parcel.add(valueAnimatorOfFloat);
                int i26 = onPostMessage + 111;
                onActivityLayout = i26 % 128;
                int i27 = i26 % 2;
                return null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsShortVideoActivity, shortFormVideo);
        int i4 = onPostMessage + 13;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent4, 1842782316, iOnNavigationEvent6, new Object[]{nativeAdsShortVideoActivity, nativeAdsDto, adAsset}, -1842782311);
        int i3 = onPostMessage + 85;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        }
        IAuthTabCallback_Parcel(nativeAdsShortVideoActivity, nativeAdsEventLogType);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 41;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view, valueAnimator);
        int i4 = onPostMessage + 51;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onPostMessage + 81;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class asBinder implements View.OnLayoutChangeListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public asBinder() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 11;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).onExtraCallbackWithResult().getWidth() != 0) {
                int i12 = onWarmupCompleted + 45;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    if (NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).ICustomTabsCallback.getHeight() != 0) {
                        NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).IAuthTabCallbackStubProxy.setupVideoSlotRect(new Rect(0, NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).IAuthTabCallbackStub.getBottom() + varyMatches.IAuthTabCallback(24, NativeAdsShortVideoActivity.this), NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).onExtraCallbackWithResult().getWidth(), NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).ICustomTabsCallback.getTop() - varyMatches.IAuthTabCallback(24, NativeAdsShortVideoActivity.this)));
                        return;
                    }
                } else {
                    NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).ICustomTabsCallback.getHeight();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).ICustomTabsCallback.post(NativeAdsShortVideoActivity.this.new IAuthTabCallbackDefault());
            int i13 = onNavigationEvent + 123;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onPostMessage + 3;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoActivity.access000();
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = onPostMessage + 95;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 109;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsShortVideoActivity.writeTypedObject = z;
        int i5 = i2 + 29;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ long IAuthTabCallbackDefault(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 65;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        long j = nativeAdsShortVideoActivity.readTypedObject;
        int i5 = i3 + 53;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 9;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoActivity.onMinimized();
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = nativeAdsShortVideoActivity.onMinimized;
        if (i3 == 0) {
            return getpackagetype;
        }
        throw null;
    }

    public static final /* synthetic */ void asInterface(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onPostMessage + 33;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoActivity.onPostMessage();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onPostMessage + 55;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ ExoPlayer onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsShortVideoActivity.extraCallback;
        int i5 = i3 + 77;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return exoPlayer;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 3;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = nativeAdsShortVideoActivity.asBinder;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 87;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsShortVideoActivity.IAuthTabCallbackStubProxy = z;
        int i5 = i2 + 103;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallbackStubProxy = nativeAdsShortVideoActivity.ICustomTabsCallbackStubProxy();
        int i4 = onPostMessage + 115;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zICustomTabsCallbackStubProxy);
        }
        throw null;
    }

    public static final /* synthetic */ setTranslateX onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 43;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsShortVideoActivity.readTypedObject();
        }
        nativeAdsShortVideoActivity.readTypedObject();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 51;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsShortVideoActivity.extraCallbackWithResult = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 47;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 2 % 2;
        zzad zzadVar = ((NativeAdsShortVideoActivity) objArr[0]).environments;
        Object obj = null;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = onActivityLayout + 79;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onActivityLayout + 41;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return zzadVar;
        }
        obj.hashCode();
        throw null;
    }

    private final setTranslateX readTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        setTranslateX settranslatex = (setTranslateX) this.IAuthTabCallbackDefault.getValue();
        int i4 = onActivityLayout + 95;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return settranslatex;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 'H' - AndroidCharacter.getMirror('0'), View.getDefaultSize(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (onActivityResized * 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarSize() >> 8) + 59, TextUtils.getOffsetAfter("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 24 - ExpandableListView.getPackedPositionGroup(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onActivityResized ^ 5407414049857832247L);
                    try {
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 59 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class IAuthTabCallback implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                    int i3 = 96 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 25 / 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            try {
                if (i2 % 2 == 0) {
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

    public static final class IAuthTabCallbackStubProxy implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ NativeAdsDto.Reward onWarmupCompleted;

        public IAuthTabCallbackStubProxy(NativeAdsDto.Reward reward) {
            this.onWarmupCompleted = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onWarmupCompleted);
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onWarmupCompleted);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                settrimpathoffset.onNavigationEvent();
                int i3 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 9 / 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class access100 implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            int i4 = 94 / 0;
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent();
                int i4 = onWarmupCompleted + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 34 / 0;
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
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onExtraCallback implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 64 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsShortVideoActivity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onTransact implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class readTypedObject implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ View IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public readTypedObject(View view) {
            this.IAuthTabCallback = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.setTranslationX(0.0f);
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class writeTypedObject implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 35 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public writeTypedObject(View view) {
            this.onWarmupCompleted = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.setTranslationX(0.0f);
        }
    }

    public static final class onNavigationEvent implements calculatePageOffsets.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onNavigationEvent() {
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void IAuthTabCallback(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(charSequence);
            if (i3 != 0) {
                int i4 = 96 / 0;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onEvent(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onEvent(nativeAdsEventLogType);
            if (i3 != 0) {
                int i4 = 33 / 0;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onNavigationEvent(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onNavigationEvent(charSequence);
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsShortVideoActivity.this.onExtraCallback("VIMP");
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsShortVideoActivity.this.onExtraCallback("IMP_1PX");
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                NativeAdsShortVideoActivity.this.onExtraCallback("IMP_100P");
            } else {
                NativeAdsShortVideoActivity.this.onExtraCallback("IMP_100P");
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted implements Player.Listener {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        onWarmupCompleted() {
        }

        public void onTracksChanged(Tracks tracks) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            Player player = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(tracks, "");
                NativeAdsShortVideoActivity.onExtraCallback(NativeAdsShortVideoActivity.this);
                throw null;
            }
            Intrinsics.checkNotNullParameter(tracks, "");
            NativeAdsShortVideoActivity nativeAdsShortVideoActivity = NativeAdsShortVideoActivity.this;
            ExoPlayer exoPlayerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
            if (exoPlayerOnExtraCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exoPlayerOnExtraCallback = null;
            }
            Object[] objArr = {nativeAdsShortVideoActivity, exoPlayerOnExtraCallback};
            if (((Boolean) NativeAdsShortVideoActivity.onWarmupCompleted(855841779 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), applyLabel.onNavigationEvent.onWarmupCompleted(), -2107491888, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022646).substring(0, 4).codePointAt(2) + 2003387013, objArr, 2107491905)).booleanValue()) {
                return;
            }
            int i3 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            NativeAdsShortVideoActivity.IAuthTabCallback(NativeAdsShortVideoActivity.this, true);
            NativeAdsShortVideoActivity.onNavigationEvent(NativeAdsShortVideoActivity.this, true);
            Player playerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(NativeAdsShortVideoActivity.this);
            if (playerOnExtraCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = onWarmupCompleted + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                player = playerOnExtraCallback;
            }
            player.setVolume(0.0f);
            NativeAdsShortVideoActivity.IAuthTabCallbackStub(NativeAdsShortVideoActivity.this);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b6 A[PHI: r13
          0x00b6: PHI (r13v29 com.google.android.exoplayer2.ExoPlayer) = (r13v23 com.google.android.exoplayer2.ExoPlayer), (r13v33 com.google.android.exoplayer2.ExoPlayer) binds: [B:16:0x00c8, B:12:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPlaybackStateChanged(int i) throws Throwable {
            ExoPlayer exoPlayerOnExtraCallback;
            int i2 = 2 % 2;
            if (i == 3) {
                int i3 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsShortVideoActivity.IAuthTabCallback(NativeAdsShortVideoActivity.this);
                NativeAdsShortVideoActivity nativeAdsShortVideoActivity = NativeAdsShortVideoActivity.this;
                ExoPlayer exoPlayerOnExtraCallback2 = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
                ExoPlayer exoPlayer = null;
                if (exoPlayerOnExtraCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    exoPlayerOnExtraCallback2 = null;
                }
                Object[] objArr = {nativeAdsShortVideoActivity, exoPlayerOnExtraCallback2};
                if (((Boolean) NativeAdsShortVideoActivity.onWarmupCompleted(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 855841779, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), applyLabel.onNavigationEvent.onWarmupCompleted(), -2107491888, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022646).substring(0, 4).codePointAt(2) + 2003387013, objArr, 2107491905)).booleanValue()) {
                    return;
                }
                int i5 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    NativeAdsShortVideoActivity.IAuthTabCallback(NativeAdsShortVideoActivity.this, false);
                    NativeAdsShortVideoActivity.onNavigationEvent(NativeAdsShortVideoActivity.this, true);
                    exoPlayerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(NativeAdsShortVideoActivity.this);
                    if (exoPlayerOnExtraCallback == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i6 = onExtraCallbackWithResult + 111;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        exoPlayer = exoPlayerOnExtraCallback;
                    }
                } else {
                    NativeAdsShortVideoActivity.IAuthTabCallback(NativeAdsShortVideoActivity.this, true);
                    NativeAdsShortVideoActivity.onNavigationEvent(NativeAdsShortVideoActivity.this, true);
                    exoPlayerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(NativeAdsShortVideoActivity.this);
                    if (exoPlayerOnExtraCallback == null) {
                    }
                }
                exoPlayer.setVolume(0.0f);
                NativeAdsShortVideoActivity.IAuthTabCallbackStub(NativeAdsShortVideoActivity.this);
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static final byte[] $$a = {70, -47, -65, 52};
        private static final int $$b = 188;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int IAuthTabCallback = 478309044;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, int i2) {
            int i3;
            int i4 = 4 - (i2 * 2);
            int i5 = (s * 3) + 105;
            int i6 = i * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6 + 1];
            if (bArr == null) {
                int i7 = i6;
                i3 = 0;
                i4++;
                i5 += -i7;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                    return new String(bArr2, 0);
                }
                i3++;
                i7 = bArr[i4];
                i4++;
                i5 += -i7;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                j = 0;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35125), 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0)), Color.argb(0, 0, 0, 0) + 55, 2167 - Gravity.getAbsoluteGravity(0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i7 = $11 + 91;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                int i9 = $10 + 115;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (!(!z)) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 12842), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, (Process.myPid() >> 22) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsShortVideoActivity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 8, View.resolveSizeAndState(0, 0, 0) + 1, new char[]{7, 7, 65530, 7, 7, 65530, 65531, 65530}, true, 264 - Color.argb(0, 0, 0, 0), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        setTranslateX typedObject = readTypedObject();
        typedObject.ICustomTabsCallback.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(27.0f)));
        typedObject.extraCallback.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(20.25f)));
        typedObject.getInterfaceDescriptor.onWarmupCompleted(setTagsokhttp.onExtraCallback(this, Float.valueOf(22.95f)));
        int i4 = onActivityLayout + 103;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedObject() {
        float f;
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(CommonModule_setSecureScreen.onWarmupCompleted, this, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
        exoPlayerIAuthTabCallback.setPlayWhenReady(true);
        if (this.writeTypedObject) {
            int i4 = onPostMessage + 77;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        exoPlayerIAuthTabCallback.setVolume(f);
        exoPlayerIAuthTabCallback.setVideoScalingMode(2);
        this.extraCallback = exoPlayerIAuthTabCallback;
        exoPlayerIAuthTabCallback.addListener(this.IAuthTabCallbackStub);
    }

    public static final class extraCallback implements Function0<setTranslateX> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity onExtraCallback;

        public extraCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final setTranslateX onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            setTranslateX settranslatexIAuthTabCallback = setTranslateX.IAuthTabCallback(layoutInflater);
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return settranslatexIAuthTabCallback;
        }
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        access000();
        this.onMinimized = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(this, (access13800) null), 3, (Object) null);
        int i2 = onPostMessage + 67;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 o.getPackageType) = (r1v4 o.getPackageType), (r1v9 o.getPackageType) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void access000() {
        getPackageType getpackagetype;
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            getpackagetype = this.onMinimized;
            int i3 = 15 / 0;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        } else {
            getpackagetype = this.onMinimized;
            if (getpackagetype != null) {
            }
        }
        this.onMinimized = null;
        int i4 = onPostMessage + 69;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean ICustomTabsCallbackStubProxy() {
        Object obj;
        int i = 2 % 2;
        String str = this.asBinder;
        if (str != null) {
            int i2 = onPostMessage + 61;
            onActivityLayout = i2 % 128;
            Player player = null;
            if (i2 % 2 != 0) {
                endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
                throw null;
            }
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
            if (strOnExtraCallbackWithResult != null) {
                this.asBinder = strOnExtraCallbackWithResult;
                access000();
                try {
                    Result.Companion companion = Result.Companion;
                    CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                    ExoPlayer exoPlayer = this.extraCallback;
                    if (exoPlayer == null) {
                        int i3 = onPostMessage + 35;
                        onActivityLayout = i3 % 128;
                        int i4 = i3 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        exoPlayer = null;
                    }
                    CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayer, this, strOnExtraCallbackWithResult, false, null, 8, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                    Player player2 = this.extraCallback;
                    if (player2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        player2 = null;
                    }
                    player2.prepare();
                    Player player3 = this.extraCallback;
                    if (player3 == null) {
                        int i5 = onPostMessage + 25;
                        onActivityLayout = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        player3 = null;
                    }
                    player3.setPlayWhenReady(true);
                    Player player4 = this.extraCallback;
                    if (player4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        player = player4;
                    }
                    player.play();
                    obj = Result.constructor-impl(Unit.INSTANCE);
                    int i7 = onPostMessage + 25;
                    onActivityLayout = i7 % 128;
                    int i8 = i7 % 2;
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
        }
        int i9 = onActivityLayout + 1;
        onPostMessage = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        int i = 2 % 2;
        nativeAdsShortVideoActivity.access000();
        nativeAdsShortVideoActivity.asBinder = null;
        try {
            Result.Companion companion = Result.Companion;
            Player player = nativeAdsShortVideoActivity.extraCallback;
            if (player == null) {
                int i2 = onActivityLayout + 41;
                onPostMessage = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = onPostMessage + 27;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                player = null;
            }
            player.setPlayWhenReady(false);
            Player player2 = nativeAdsShortVideoActivity.extraCallback;
            if (player2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                player2 = null;
            }
            player2.pause();
            Player player3 = nativeAdsShortVideoActivity.extraCallback;
            if (player3 == null) {
                int i5 = onActivityLayout + 59;
                onPostMessage = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i6 = 69 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                player3 = null;
            }
            player3.stop();
            Result.constructor-impl(Unit.INSTANCE);
            int i7 = onPostMessage + 113;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStubProxy.onExtraCallback();
        nativeAdsShortVideoActivity.onExtraCallback("show thumbnail fallback");
        return null;
    }

    private final void IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        Double dIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
        this.getInterfaceDescriptor = (extraInfoOnTransact == null || (dIAuthTabCallbackDefault = extraInfoOnTransact.IAuthTabCallbackDefault()) == null) ? 0 : (int) dIAuthTabCallbackDefault.doubleValue();
        AdsCircularCountdownLayout adsCircularCountdownLayout = readTypedObject().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(adsCircularCountdownLayout, "");
        onWarmupCompleted(adsCircularCountdownLayout);
        readTypedObject().IAuthTabCallbackDefault.onWarmupCompleted(this.getInterfaceDescriptor, getInterfaceDescriptor(), onWarmupCompleted(), new NativeAdsShortVideoActivity$.ExternalSyntheticLambda19(nativeAdsDto, this), new NativeAdsShortVideoActivity$.ExternalSyntheticLambda20(this, nativeAdsDto, adAsset));
        int i4 = onPostMessage + 107;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsShortVideoActivity nativeAdsShortVideoActivity, boolean z) {
        NativeAdsDto.Reward rewardOnExtraCallback;
        String strIAuthTabCallbackStub;
        String strIAuthTabCallbackStub2;
        NativeAdsDto.AdAsset adAsset;
        NativeAdsEventLogType.IAuthTabCallback iAuthTabCallback;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 81;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        if (!(!z)) {
            int i6 = i3 + 69;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null && (rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback()) != null) {
                calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoActivity.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent != null) {
                    int i8 = onPostMessage + 57;
                    onActivityLayout = i8 % 128;
                    if (i8 % 2 != 0) {
                        strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
                        adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
                        iAuthTabCallback = NativeAdsEventLogType.IAuthTabCallback.onExtraCallback;
                        function1 = null;
                        i = 10;
                    } else {
                        strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
                        adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
                        iAuthTabCallback = NativeAdsEventLogType.IAuthTabCallback.onExtraCallback;
                        function1 = null;
                        i = 8;
                    }
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, strIAuthTabCallbackStub2, adAsset, iAuthTabCallback, function1, i, (Object) null);
                }
                NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoActivity);
                if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                    int i9 = onActivityLayout + 9;
                    onPostMessage = i9 % 128;
                    int i10 = i9 % 2;
                    NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
                    if (nativeAdsDtoIAuthTabCallbackStub != null) {
                        int i11 = onActivityLayout + 61;
                        onPostMessage = i11 % 128;
                        int i12 = i11 % 2;
                        strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    } else {
                        strIAuthTabCallbackStub = null;
                    }
                    if (strIAuthTabCallbackStub == null) {
                        strIAuthTabCallbackStub = "";
                    }
                    nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallbackStubProxy(rewardOnExtraCallback));
                }
            }
        }
        nativeAdsShortVideoActivity.onTransact();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        int i = 2 % 2;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoActivity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
            int i2 = onPostMessage + 109;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 4;
            }
        }
        nativeAdsShortVideoActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 59;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    public static final class asInterface extends OnBackPressedCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto.AdAsset onExtraCallback;
        final /* synthetic */ NativeAdsDto onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
            super(true);
            this.onExtraCallbackWithResult = nativeAdsDto;
            this.onExtraCallback = adAsset;
        }

        public void handleOnBackPressed() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            if (NativeAdsShortVideoActivity.this.onWarmupCompleted()) {
                calculatePageOffsets calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoActivity.this.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent != null) {
                    int i2 = onWarmupCompleted + 53;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, this.onExtraCallbackWithResult.IAuthTabCallbackStub(), this.onExtraCallback, (Function0) null, 4, (Object) null);
                }
                NativeAdsShortVideoActivity.this.finish();
            }
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        int i = 2 % 2;
        nativeAdsShortVideoActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult(nativeAdsShortVideoActivity, nativeAdsShortVideoActivity.new asInterface((NativeAdsDto) objArr[1], (NativeAdsDto.AdAsset) objArr[2]));
        int i2 = onActivityLayout + 47;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void extraCallback() {
        int i = 2 % 2;
        ViewCompat.onWarmupCompleted(readTypedObject().onExtraCallbackWithResult(), new NativeAdsShortVideoActivity$.ExternalSyntheticLambda0(this));
        int i2 = onPostMessage + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final WindowInsetsCompat onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int iAccess000;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
        int iOnExtraCallbackWithResult = cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback;
        if (iOnExtraCallbackWithResult <= 0) {
            int i2 = onPostMessage + 109;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                iOnExtraCallbackWithResult = M_.onExtraCallback.onExtraCallbackWithResult();
                int i3 = 15 / 0;
            } else {
                iOnExtraCallbackWithResult = M_.onExtraCallback.onExtraCallbackWithResult();
            }
        }
        if (cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted > 0) {
            int i4 = onActivityLayout + 37;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            iAccess000 = 0;
        } else {
            iAccess000 = M_.onExtraCallback.access000();
            int i6 = onPostMessage + 87;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
        }
        ConstraintLayout constraintLayout = nativeAdsShortVideoActivity.readTypedObject().asBinder;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, iAccess000, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, 0);
        nativeAdsShortVideoActivity.readTypedObject().access100.getLayoutParams().height = iOnExtraCallbackWithResult;
        return windowInsetsCompat;
    }

    public static final class access000 implements ShortFormPlayerView.IAuthTabCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.AdAsset onExtraCallback;
        final /* synthetic */ NativeAdsDto onNavigationEvent;

        public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                asBinder(nativeAdsShortVideoActivity, nativeAdsEventLogType);
                throw null;
            }
            Unit unitAsBinder = asBinder(nativeAdsShortVideoActivity, nativeAdsEventLogType);
            int i3 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unitAsBinder;
        }

        public static /* synthetic */ Unit onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsShortVideoActivity, nativeAdsEventLogType);
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(nativeAdsShortVideoActivity, nativeAdsEventLogType);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            int i5 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        access000(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
            this.onNavigationEvent = nativeAdsDto;
            this.onExtraCallback = adAsset;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void onExtraCallbackWithResult() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {NativeAdsShortVideoActivity.this};
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            if (((Boolean) NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, 1041037927, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1041037915)).booleanValue()) {
                return;
            }
            String strOnExtraCallbackWithResult = NativeAdsShortVideoActivity.onExtraCallbackWithResult(NativeAdsShortVideoActivity.this);
            if (strOnExtraCallbackWithResult == null || !StringsKt.contains(strOnExtraCallbackWithResult, ".m3u8", true)) {
                Object[] objArr2 = {NativeAdsShortVideoActivity.this};
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1918622534, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, 1918622540);
                return;
            }
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = {CommonModule_setSecureScreen.onWarmupCompleted, NativeAdsShortVideoActivity.this};
            CommonModule_setSecureScreen.onExtraCallbackWithResult(-216885552, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 216885552, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr3, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            NativeAdsShortVideoActivity.asInterface(NativeAdsShortVideoActivity.this);
            int i6 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            if (!z) {
                Object[] objArr = {NativeAdsShortVideoActivity.this};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                getPackageType getpackagetype = (getPackageType) NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -168898588, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 168898596);
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    int i2 = onWarmupCompleted + 99;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this, z);
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void onNavigationEvent(PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(playbackException, "");
                Object[] objArr = {NativeAdsShortVideoActivity.this};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int i3 = 8 / 0;
                if (((Boolean) NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, 1041037927, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1041037915)).booleanValue()) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(playbackException, "");
                Object[] objArr2 = {NativeAdsShortVideoActivity.this};
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                if (((Boolean) NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1041037927, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -1041037915)).booleanValue()) {
                    return;
                }
            }
            Object[] objArr3 = {NativeAdsShortVideoActivity.this};
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, -1918622534, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr3, 1918622540);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void onExtraCallbackWithResult(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                NativeAdsShortVideoActivity.this.onNavigationEvent();
                throw null;
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoActivity.this.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatepageoffsetsOnNavigationEvent.onNavigationEvent(this.onNavigationEvent.IAuthTabCallbackStub(), this.onExtraCallback, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoActivity$setupPlayerView$1$.ExternalSyntheticLambda0(NativeAdsShortVideoActivity.this));
            }
            int i3 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        private static final Unit IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(nativeAdsEventLogType.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Override // im.toss.ads_sdk.ui.view.ShortFormPlayerView.IAuthTabCallback
        public void IAuthTabCallback(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            if (NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).IAuthTabCallbackStubProxy.onExtraCallbackWithResult()) {
                return;
            }
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.IAuthTabCallbackStubProxy)) {
                int i5 = i2 + 15;
                int i6 = i5 % 128;
                onWarmupCompleted = i6;
                int i7 = i5 % 2;
                if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.ICustomTabsCallback) && (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult))) {
                    int i8 = i6 + 91;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        boolean z = nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback)) {
                        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = NativeAdsShortVideoActivity.this.onNavigationEvent();
                        if (calculatepageoffsetsOnNavigationEvent != null) {
                            calculatepageoffsetsOnNavigationEvent.onNavigationEvent(this.onNavigationEvent.IAuthTabCallbackStub(), this.onExtraCallback, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoActivity$setupPlayerView$1$.ExternalSyntheticLambda2(NativeAdsShortVideoActivity.this));
                            return;
                        }
                        return;
                    }
                }
            }
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent2 = NativeAdsShortVideoActivity.this.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent2 != null) {
                calculatepageoffsetsOnNavigationEvent2.onWarmupCompleted(this.onNavigationEvent.IAuthTabCallbackStub(), this.onExtraCallback, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsShortVideoActivity$setupPlayerView$1$.ExternalSyntheticLambda1(NativeAdsShortVideoActivity.this));
            }
        }

        private static final Unit onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(nativeAdsEventLogType.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit asBinder(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                nativeAdsShortVideoActivity.onExtraCallback(nativeAdsEventLogType.toString());
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(nativeAdsEventLogType.toString());
            int i3 = 50 / 0;
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        readTypedObject().IAuthTabCallbackStubProxy.setVideoListener(new access000(nativeAdsDto, adAsset));
        int i2 = onActivityLayout + 59;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void onWarmupCompleted(float f, NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, long j, long j2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            int i3 = onActivityLayout + 19;
            onPostMessage = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 13 / 0;
            }
            j2 = 800;
        }
        Object[] objArr = {Float.valueOf(f), nativeAdsShortVideoActivity, view, Long.valueOf(j), Long.valueOf(j2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -307213743, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 307213743);
        int i5 = onActivityLayout + 107;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(View view, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onPostMessage + 113;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        view.setAlpha(animatedFraction);
        view.setTranslationY(f * (1.0f - animatedFraction));
        int i4 = onPostMessage + 59;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 109;
        int i4 = i3 % 128;
        onActivityLayout = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 61;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            j = 0;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = 600;
        }
        onWarmupCompleted(nativeAdsShortVideoActivity, view, j3, j2);
    }

    private static final void IAuthTabCallback(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            view.setAlpha(((Float) animatedValue).floatValue());
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            view.setAlpha(((Float) animatedValue2).floatValue());
        }
        int i4 = onPostMessage + 37;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, long j, long j2) {
        int i = 2 % 2;
        view.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new NativeAdsShortVideoActivity$.ExternalSyntheticLambda25(view));
        nativeAdsShortVideoActivity.IAuthTabCallback_Parcel.add(valueAnimatorOfFloat);
        int i2 = onPostMessage + 73;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityResized() throws Throwable {
        long j;
        int i = 2 % 2;
        IAuthTabCallbackStubProxy();
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(80, this);
        Typography5 typography5 = readTypedObject().ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        onWarmupCompleted(fIAuthTabCallback, this, (View) typography5, 0L, 0L, 16, (Object) null);
        Typography5 typography52 = readTypedObject().extraCallback;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        onWarmupCompleted(fIAuthTabCallback, this, (View) typography52, 0L, 0L, 16, (Object) null);
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = readTypedObject().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
        onWarmupCompleted(fIAuthTabCallback, this, (View) tdsSquircleLayoutV1, 0L, 0L, 16, (Object) null);
        Typography5 typography53 = readTypedObject().access000;
        Intrinsics.checkNotNullExpressionValue(typography53, "");
        onWarmupCompleted(fIAuthTabCallback, this, (View) typography53, 0L, 0L, 16, (Object) null);
        TdsRoundLayout tdsRoundLayout = readTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        onWarmupCompleted(fIAuthTabCallback, this, (View) tdsRoundLayout, 80L, 0L, 16, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = readTypedObject().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        onExtraCallbackWithResult(this, tdsRoundLayout2, 0L, 0L, 8, null);
        ConstraintLayout constraintLayout = readTypedObject().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (this.getInterfaceDescriptor == 0) {
            int i2 = onActivityLayout + 69;
            int i3 = i2 % 128;
            onPostMessage = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            j = 200;
        } else {
            j = 0;
        }
        onExtraCallbackWithResult(this, constraintLayout, j, 0L, 8, null);
        Iterator<T> it = this.IAuthTabCallback_Parcel.iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).start();
            int i7 = onPostMessage + 69;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.IAuthTabCallback_Parcel.iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
            int i4 = onActivityLayout + 71;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        this.IAuthTabCallback_Parcel.clear();
    }

    private static final void onExtraCallback(final NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, final NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoActivity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("202"), null, null, new Function1() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda21
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsShortVideoActivity nativeAdsShortVideoActivity2 = this.f$0;
                NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) obj;
                if (i4 == 0) {
                    return NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity2, nativeAdsEventLogType);
                }
                Unit unitOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity2, nativeAdsEventLogType);
                int i5 = 64 / 0;
                return unitOnExtraCallback;
            }
        }, new Function0() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda22
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsShortVideoActivity.onExtraCallbackWithResult(this.f$0, shortFormVideo);
                int i5 = onExtraCallbackWithResult + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 24, null);
        int i2 = onPostMessage + 17;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asInterface(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onPostMessage + 7;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r3
      0x0028: PHI (r3v5 im.toss.ads_sdk.NativeAdsManager) = (r3v4 im.toss.ads_sdk.NativeAdsManager), (r3v6 im.toss.ads_sdk.NativeAdsManager) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        String strIAuthTabCallbackStub;
        ?? r1 = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r1);
            int i3 = 93 / 0;
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r1);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    int i4 = onActivityLayout + 63;
                    onPostMessage = i4 % 128;
                    int i5 = i4 % 2;
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                } else {
                    strIAuthTabCallbackStub = null;
                }
                if (strIAuthTabCallbackStub == null) {
                    int i6 = onActivityLayout + 15;
                    onPostMessage = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onTransact());
            }
        } else {
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r1);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            }
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r1, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        final NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        final NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[3];
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoActivity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("101"), null, null, new Function1() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = {this.f$0, (NativeAdsEventLogType) obj};
                    int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr3 = {this.f$0, (NativeAdsEventLogType) obj};
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                Unit unit = (Unit) NativeAdsShortVideoActivity.onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1726899103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr3, 1726899105);
                int i4 = onExtraCallbackWithResult + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        }, new Function0() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda13
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(this.f$0, shortFormVideo);
                int i5 = onWarmupCompleted + 35;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 24, null);
        int i2 = onPostMessage + 49;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return null;
    }

    private static final Unit asBinder(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 117;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i2 = onPostMessage + 77;
                onActivityLayout = i2 % 128;
                if (i2 % 2 != 0) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    int i3 = 18 / 0;
                } else {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                }
            } else {
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallbackStub());
            int i4 = onPostMessage + 81;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoActivity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallbackStub(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoActivity.IAuthTabCallbackDefault(), str, adAsset, new NativeAdsEventLogType.onExtraCallback("102"), null, null, new NativeAdsShortVideoActivity$.ExternalSyntheticLambda23(nativeAdsShortVideoActivity), new NativeAdsShortVideoActivity$.ExternalSyntheticLambda24(nativeAdsShortVideoActivity, shortFormVideo), 24, null);
        int i2 = onPostMessage + 65;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 69;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i;
        int i2 = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i3 = onActivityLayout + 87;
            onPostMessage = i3 % 128;
            String strIAuthTabCallbackStub = null;
            if (i3 % 2 == 0) {
                NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
                strIAuthTabCallbackStub.hashCode();
                throw null;
            }
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                i = onActivityLayout + 33;
            } else {
                i = onActivityLayout + 11;
            }
            onPostMessage = i % 128;
            int i4 = i % 2;
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new getInterfaceDescriptor());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoActivity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        int i3 = 33 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i2 = onActivityLayout + 17;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                int i4 = onActivityLayout + 1;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub == null) {
                int i6 = onActivityLayout + 43;
                onPostMessage = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 0;
                }
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new access100());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoActivity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final void onTransact(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int i = 2 % 2;
        getFillAlpha.onWarmupCompleted(nativeAdsShortVideoActivity.IAuthTabCallbackDefault(), str, adAsset, null, null, null, new NativeAdsShortVideoActivity$.ExternalSyntheticLambda17(nativeAdsShortVideoActivity), new NativeAdsShortVideoActivity$.ExternalSyntheticLambda18(nativeAdsShortVideoActivity, shortFormVideo), 28, null);
        int i2 = onPostMessage + 85;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    private static final Unit IAuthTabCallback_Parcel(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onPostMessage + 23;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(String.valueOf(nativeAdsEventLogType));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onPostMessage + 121;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsShortVideoActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i4 = onActivityLayout + 75;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsShortVideoActivity);
            String strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
            if (strIAuthTabCallbackStub == null) {
                int i6 = onPostMessage + 115;
                onActivityLayout = i6 % 128;
                int i7 = i6 % 2;
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallback_Parcel());
            int i8 = onActivityLayout + 107;
            onPostMessage = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 2;
            }
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsShortVideoActivity, shortFormVideo.onWarmupCompleted());
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackDefault implements Runnable {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackDefault() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                i = 93;
                if (NativeAdsShortVideoActivity.this.isFinishing()) {
                    return;
                }
            } else {
                i = 24;
                if (NativeAdsShortVideoActivity.this.isFinishing()) {
                    return;
                }
            }
            NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).IAuthTabCallbackStubProxy.setupVideoSlotRect(new Rect(0, NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).IAuthTabCallbackStub.getBottom() + varyMatches.IAuthTabCallback(i, NativeAdsShortVideoActivity.this), NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).onExtraCallbackWithResult().getWidth(), NativeAdsShortVideoActivity.onWarmupCompleted(NativeAdsShortVideoActivity.this).ICustomTabsCallback.getTop() - varyMatches.IAuthTabCallback(i, NativeAdsShortVideoActivity.this)));
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.access100) {
            int i4 = onActivityLayout + 65;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        readTypedObject().writeTypedObject.setText(((Object) readTypedObject().writeTypedObject.getText()) + "\n " + str + " :: " + (System.currentTimeMillis() - this.access000));
    }

    private final void IAuthTabCallback(final NativeAdsDto.AdAsset adAsset, final NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        int i2 = onPostMessage + 93;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (this.access100) {
            readTypedObject().onPostMessage.setOnLongClickListener(new View.OnLongClickListener() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda5
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 55;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    boolean zOnNavigationEvent = NativeAdsShortVideoActivity.onNavigationEvent(this.f$0, view);
                    int i7 = onNavigationEvent + 41;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 32 / 0;
                    }
                    return zOnNavigationEvent;
                }
            });
        }
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = readTypedObject().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.98f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.f$0;
                if (i6 != 0) {
                    return NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, adAsset, nativeAdsDto, (MotionEvent) obj);
                }
                NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, adAsset, nativeAdsDto, (MotionEvent) obj);
                throw null;
            }
        }, 4030, null);
        int i4 = onPostMessage + 43;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit getInterfaceDescriptor(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 101;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsShortVideoActivity.onExtraCallback(nativeAdsEventLogType.toString());
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 93;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.AdAsset adAsset, NativeAdsDto nativeAdsDto, MotionEvent motionEvent) throws Throwable {
        float f;
        NativeAdsEventLogType nativeAdsEventLogType;
        int i = 2 % 2;
        nativeAdsShortVideoActivity.writeTypedObject = !nativeAdsShortVideoActivity.writeTypedObject;
        Player player = nativeAdsShortVideoActivity.extraCallback;
        Object obj = null;
        if (player == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            player = null;
        }
        if (nativeAdsShortVideoActivity.writeTypedObject) {
            int i2 = onPostMessage + 63;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        player.setVolume(f);
        nativeAdsShortVideoActivity.onMinimized();
        if (!nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStubProxy.onExtraCallbackWithResult()) {
            if (nativeAdsShortVideoActivity.writeTypedObject) {
                int i4 = onPostMessage + 67;
                onActivityLayout = i4 % 128;
                if (i4 % 2 != 0) {
                    NativeAdsEventLogType.writeTypedObject writetypedobject = NativeAdsEventLogType.writeTypedObject.onExtraCallback;
                    obj.hashCode();
                    throw null;
                }
                nativeAdsEventLogType = NativeAdsEventLogType.writeTypedObject.onExtraCallback;
            } else {
                nativeAdsEventLogType = NativeAdsEventLogType.onPostMessage.IAuthTabCallback;
            }
            Iterator<T> it = adAsset.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((String) it.next()).toString(), nativeAdsEventLogType.toString())) {
                    int i5 = onPostMessage + 1;
                    onActivityLayout = i5 % 128;
                    if (i5 % 2 != 0) {
                        nativeAdsShortVideoActivity.onNavigationEvent();
                        throw null;
                    }
                    calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsShortVideoActivity.onNavigationEvent();
                    if (calculatepageoffsetsOnNavigationEvent != null) {
                        calculatepageoffsetsOnNavigationEvent.onNavigationEvent(nativeAdsDto.IAuthTabCallbackStub(), adAsset, nativeAdsEventLogType, new Function1() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i6 = 2 % 2;
                                int i7 = IAuthTabCallback + 101;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                                NativeAdsShortVideoActivity nativeAdsShortVideoActivity2 = this.f$0;
                                NativeAdsEventLogType nativeAdsEventLogType2 = (NativeAdsEventLogType) obj2;
                                if (i8 != 0) {
                                    return NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity2, nativeAdsEventLogType2);
                                }
                                NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity2, nativeAdsEventLogType2);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        nativeAdsShortVideoActivity.onExtraCallbackWithResult((View) tdsRoundLayout);
        minFresh.onNavigationEvent(nativeAdsShortVideoActivity, noStore.Companion.access100());
        int i4 = onActivityLayout + 15;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onMinimized() throws Throwable {
        String strIntern;
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        if (this.writeTypedObject) {
            Object[] objArr = new Object[1];
            a(new char[]{49345, 13380, 10735, 7442, 4798, 1646, 31504, 28841, 25618, 22972, 19762, 16974, 47084, 43791, 41177, 37930, 35158, 65267, 61976, 59356, 56116, 53321, 50592, 14719, 11922, 8759, 5965, 3321, ':', 30092, 26921, 24137, 21414, 18212, 48259, 45165, 42308, 39639, 36464, 33672, 63340, 60507, 57820, 54639, 51851, 15912, 13306, 10449, 7295, 4486, 1382, 31423, 28626, 25450, 22656, 19544, 16801, 46806, 43620}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 62618, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{49345, 49904, 50311, 50782, 51310, 51826, 52616, 53181, 53682, 54088, 54538, 55090, 56028, 56451, 57073, 57470, 57878, 58407, 59376, 59856, 60228, 60789, 61272, 62155, 62706, 63139, 63573, 64101, 64618, 65472, 33153, 33725, 34086, 34640, 35115, 36001, 36500, 36939, 37480, 37916, 38796, 39407, 39844, 40275, 40827, 41252, 42130, 42629, 43191, 43545, 44046, 44593, 45539, 45975, 46585, 46962, 47391, 48331}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 556, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i2 = onPostMessage + 55;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
        }
        String str = strIntern;
        TdsImageView tdsImageView = readTypedObject().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
        Object obj = null;
        if (this.IAuthTabCallbackStubProxy) {
            readTypedObject().IAuthTabCallbackStub.setOnTouchListener(null);
            readTypedObject().IAuthTabCallbackStub.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda14
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    NativeAdsShortVideoActivity.onExtraCallback(this.f$0, view);
                    if (i6 != 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            return;
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        if (nativeAdsDtoAsInterface != null) {
            int i4 = onPostMessage + 5;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult == null || (adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult)) == null) {
                    return;
                }
                int i5 = onActivityLayout + 11;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                IAuthTabCallback(adAsset, nativeAdsDtoAsInterface);
                return;
            }
            nativeAdsDtoAsInterface.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final View view) {
        int i = 2 % 2;
        ICustomTabsCallback();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(varyMatches.IAuthTabCallback(2, this), 0);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new Rmenu.onNavigationEvent(1.0d, 0.2d));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsShortVideoActivity.onNavigationEvent(view, valueAnimator);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new writeTypedObject(view));
        valueAnimatorOfInt.addListener(new readTypedObject(view));
        valueAnimatorOfInt.start();
        this.onMessageChannelReady = valueAnimatorOfInt;
        int i2 = onPostMessage + 61;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
        view.setTranslationX(((Integer) r4).intValue());
        int i4 = onPostMessage + 109;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 13;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimator = this.onMessageChannelReady;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i4 = onPostMessage + 17;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        String str;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[2];
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStubProxy.onWarmupCompleted(adAsset, shortFormVideo, "301");
            ExoPlayer exoPlayer = nativeAdsShortVideoActivity.extraCallback;
            throw null;
        }
        ShortFormPlayerView shortFormPlayerView = nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStubProxy;
        shortFormPlayerView.onWarmupCompleted(adAsset, shortFormVideo, "301");
        ExoPlayer exoPlayer2 = nativeAdsShortVideoActivity.extraCallback;
        if (exoPlayer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = onPostMessage + 11;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            exoPlayer2 = null;
        }
        shortFormPlayerView.IAuthTabCallback(exoPlayer2);
        nativeAdsShortVideoActivity.asBinder = shortFormVideo.access000();
        CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
        ExoPlayer exoPlayer3 = nativeAdsShortVideoActivity.extraCallback;
        if (exoPlayer3 == null) {
            int i5 = onPostMessage + 103;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            exoPlayer3 = null;
        }
        String str2 = nativeAdsShortVideoActivity.asBinder;
        if (str2 == null) {
            int i7 = onPostMessage + 25;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        } else {
            str = str2;
        }
        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayer3, nativeAdsShortVideoActivity, str, false, null, 8, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        Player player = nativeAdsShortVideoActivity.extraCallback;
        if (player == null) {
            int i8 = onActivityLayout + 65;
            onPostMessage = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            player = null;
        }
        player.prepare();
        Player player2 = nativeAdsShortVideoActivity.extraCallback;
        if (player2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            player2 = null;
        }
        player2.setPlayWhenReady(true);
        Player player3 = nativeAdsShortVideoActivity.extraCallback;
        if (player3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            player3 = null;
        }
        player3.play();
        return null;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStart();
            if (this.extraCallbackWithResult) {
                Object[] objArr = {readTypedObject().IAuthTabCallbackStubProxy};
                ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
                int i3 = onActivityLayout + 11;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
            }
            readTypedObject().IAuthTabCallbackDefault.onNavigationEvent();
            return;
        }
        super.onStart();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity
    public void onStop() {
        int i = 2 % 2;
        int i2 = onPostMessage + 11;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        access000();
        Player player = this.extraCallback;
        Player player2 = null;
        if (player == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onPostMessage + 43;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
            player = null;
        }
        player.setPlayWhenReady(false);
        try {
            Player player3 = this.extraCallback;
            if (player3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                player2 = player3;
            }
            player2.pause();
        } catch (Throwable unused) {
        }
        readTypedObject().IAuthTabCallbackStubProxy.onNavigationEvent();
        readTypedObject().IAuthTabCallbackDefault.onWarmupCompleted();
        IAuthTabCallbackStubProxy();
        ICustomTabsCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        Tracks.Group group;
        int i;
        int i2;
        ExoPlayer exoPlayer = (ExoPlayer) objArr[1];
        int i3 = 2 % 2;
        int i4 = onActivityLayout + 73;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
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
        while (it.hasNext()) {
            int i5 = onActivityLayout + 15;
            onPostMessage = i5 % 128;
            if (i5 % 2 == 0) {
                group = (Tracks.Group) it.next();
                if (group.getType() == 1) {
                    i = group.length;
                    i2 = 0;
                    while (i2 < i) {
                        if (group.isTrackSelected(i2)) {
                            int i6 = onPostMessage + 45;
                            onActivityLayout = i6 % 128;
                            int i7 = i6 % 2;
                            return true;
                        }
                        i2++;
                        int i8 = onActivityLayout + 29;
                        onPostMessage = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    continue;
                }
            } else {
                group = (Tracks.Group) it.next();
                if (group.getType() == 1) {
                    i = group.length;
                    i2 = 0;
                    while (i2 < i) {
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject().IAuthTabCallback_Parcel.setImportantForAccessibility(2);
        readTypedObject().access100.setImportantForAccessibility(2);
        readTypedObject().extraCallbackWithResult.setImportantForAccessibility(2);
        readTypedObject().readTypedObject.setImportantForAccessibility(2);
        readTypedObject().onExtraCallbackWithResult.setImportantForAccessibility(2);
        readTypedObject().asInterface.setImportantForAccessibility(2);
        readTypedObject().onNavigationEvent.setImportantForAccessibility(2);
        Object obj = null;
        readTypedObject().IAuthTabCallback.setContentDescription(null);
        readTypedObject().IAuthTabCallback.setImportantForAccessibility(2);
        readTypedObject().onTransact.setContentDescription(null);
        readTypedObject().onTransact.setImportantForAccessibility(2);
        int i4 = onActivityLayout + 107;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        readTypedObject().IAuthTabCallbackStubProxy.post(new Runnable() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsShortVideoActivity.onNavigationEvent(this.f$0);
                int i5 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = onPostMessage + 29;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access100(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {nativeAdsShortVideoActivity.readTypedObject().IAuthTabCallbackStubProxy};
        ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
        int i4 = onActivityLayout + 23;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onDestroy() {
        Object obj;
        int i = 2 % 2;
        access000();
        Player player = this.extraCallback;
        if (player != null) {
            Object obj2 = null;
            try {
                Result.Companion companion = Result.Companion;
                if (player == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    player = null;
                }
                player.removeListener(this.IAuthTabCallbackStub);
                Player player2 = this.extraCallback;
                if (player2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    player2 = null;
                }
                player2.release();
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i2 = onPostMessage + 43;
                onActivityLayout = i2 % 128;
                if (i2 % 2 == 0) {
                    if (this.access100) {
                        th2.getMessage();
                    }
                } else {
                    obj2.hashCode();
                    throw null;
                }
            }
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            nativeAdsManagerIAuthTabCallbackDefault.onWarmupCompleted(this.ICustomTabsCallback);
            int i3 = onPostMessage + 47;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        boolean z;
        String str;
        String strIAuthTabCallbackStub;
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        IAuthTabCallbackStub();
        super.onCreate(bundle);
        boolean z2 = true;
        if (!(!((zzad) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1271021803, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -1271021787)).RemoteActionCompatParcelizer())) {
            z = true;
        } else {
            int i2 = onPostMessage + 37;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            if (!((zzad) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1271021803, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -1271021787)).MediaMetadataCompat()) {
                int i4 = onActivityLayout + 101;
                int i5 = i4 % 128;
                onPostMessage = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 73;
                onActivityLayout = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 5;
                }
                z = false;
            }
        }
        this.access100 = z;
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(this);
        Object[] objArr = new Object[1];
        a(new char[]{49345, 49904, 50311, 50782, 51310, 51826, 52616, 53181, 53682, 54088, 54538, 55090, 56028, 56451, 57073, 57470, 57878, 58407, 59376, 59856, 60228, 60789, 61272, 62155, 62706, 63139, 63573, 64101, 64618, 65472, 33153, 33725, 34086, 34640, 35115, 36001, 36500, 36939, 37480, 37916, 38796, 39407, 39844, 40275, 40827, 41252, 42130, 42629, 43191, 43545, 44046, 44593, 45539, 45975, 46585, 46962, 47391, 48331}, 558 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr[0]).intern(), (Context) null, 2, (Object) null);
        this.access000 = System.currentTimeMillis();
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i9 = onPostMessage + 111;
            onActivityLayout = i9 % 128;
            if (i9 % 2 != 0) {
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(this.ICustomTabsCallback);
                throw null;
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(this.ICustomTabsCallback);
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        NativeAdsDto.AdAsset adAsset = (nativeAdsDtoAsInterface == null || (listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult()) == null) ? null : (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset != null ? adAsset.onExtraCallbackWithResult() : null;
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ShortFormVideo ? (NativeAdsDto.Creative.ShortFormVideo) creativeOnExtraCallbackWithResult : null;
        str = "";
        if (shortFormVideo == null) {
            setResult(0);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
                int i10 = onActivityLayout + 107;
                onPostMessage = i10 % 128;
                int i11 = i10 % 2;
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                if (strIAuthTabCallbackStub != null) {
                    int i12 = onActivityLayout + 39;
                    onPostMessage = i12 % 128;
                    int i13 = i12 % 2;
                    str = strIAuthTabCallbackStub;
                }
                nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(str, new onExtraCallback());
            }
            super.finish();
            return;
        }
        onActivityLayout();
        writeTypedObject();
        IAuthTabCallback(nativeAdsDtoAsInterface, adAsset);
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1686826137, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, nativeAdsDtoAsInterface, adAsset}, -1686826128);
        IAuthTabCallback(adAsset, nativeAdsDtoAsInterface);
        setContentView(readTypedObject().onExtraCallbackWithResult());
        extraCallback();
        onExtraCallback(nativeAdsDtoAsInterface, adAsset);
        NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDtoAsInterface.onTransact();
        if (extraInfoOnTransact == null || !extraInfoOnTransact.asBinder()) {
            z2 = false;
        } else {
            int i14 = onPostMessage + 19;
            onActivityLayout = i14 % 128;
            if (i14 % 2 != 0) {
            }
        }
        onExtraCallback(z2, nativeAdsDtoAsInterface.IAuthTabCallbackStub(), adAsset, shortFormVideo);
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -478970203, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, adAsset, shortFormVideo}, 478970217);
        onActivityResized();
        extraCallbackWithResult();
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault3 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault3 != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
            strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub2 != null ? nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub() : null;
            nativeAdsManagerIAuthTabCallbackDefault3.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new IAuthTabCallback());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(boolean z, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int i = 2 % 2;
        int color = Color.parseColor("#ffffff");
        int color2 = Color.parseColor("#1cd9d9ff");
        readTypedObject().onNavigationEvent.setBackgroundColor(color);
        readTypedObject().onNavigationEvent.setStrokeColor(color2);
        readTypedObject().onNavigationEvent.setStrokeWidth(setTagsokhttp.onExtraCallback(this, 1));
        TdsImageView tdsImageView = readTypedObject().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, shortFormVideo.IAuthTabCallbackDefault(), (Function1) null, (Function1) null, 6, (Object) null);
        readTypedObject().IAuthTabCallback.setOnClickListener(new NativeAdsShortVideoActivity$.ExternalSyntheticLambda7(this, str, adAsset, shortFormVideo));
        readTypedObject().ICustomTabsCallback.setText(shortFormVideo.asInterface());
        readTypedObject().ICustomTabsCallback.setOnClickListener(new NativeAdsShortVideoActivity$.ExternalSyntheticLambda8(this, str, adAsset, shortFormVideo));
        if (z) {
            readTypedObject().extraCallback.setText(shortFormVideo.IAuthTabCallbackStub() + " ・ AD");
        } else {
            readTypedObject().extraCallback.setText(shortFormVideo.IAuthTabCallbackStub());
        }
        readTypedObject().extraCallback.setOnClickListener(new NativeAdsShortVideoActivity$.ExternalSyntheticLambda9(this, str, adAsset, shortFormVideo));
        readTypedObject().getInterfaceDescriptor.setText(shortFormVideo.onTransact());
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = readTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, null, new NativeAdsShortVideoActivity$.ExternalSyntheticLambda10(this, str, adAsset, shortFormVideo), 4094, null);
        readTypedObject().asInterface.setOnClickListener(new NativeAdsShortVideoActivity$.ExternalSyntheticLambda11(this, str, adAsset, shortFormVideo));
        String strAsBinder = shortFormVideo.asBinder();
        if (strAsBinder != null) {
            Typography5 typography5 = readTypedObject().extraCallback;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            typography5.setPadding(typography5.getPaddingLeft(), typography5.getPaddingTop(), typography5.getPaddingRight(), 0);
            Typography5 typography52 = readTypedObject().access000;
            Intrinsics.checkNotNullExpressionValue(typography52, "");
            typography52.setVisibility(0);
            readTypedObject().access000.setText(strAsBinder);
            if (strAsBinder.length() <= 60) {
                readTypedObject().access000.setTextSize(1, 8.0f);
            } else {
                int i2 = onActivityLayout + 91;
                onPostMessage = i2 % 128;
                int i3 = i2 % 2;
                readTypedObject().access000.setTextSize(1, 6.0f);
            }
        } else {
            Typography5 typography53 = readTypedObject().extraCallback;
            Intrinsics.checkNotNullExpressionValue(typography53, "");
            typography53.setPadding(typography53.getPaddingLeft(), typography53.getPaddingTop(), typography53.getPaddingRight(), varyMatches.IAuthTabCallback(6, this));
            Typography5 typography54 = readTypedObject().access000;
            Intrinsics.checkNotNullExpressionValue(typography54, "");
            typography54.setVisibility(8);
        }
        Typography5 typography55 = readTypedObject().ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(typography55, "");
        if (typography55.isLaidOut() && !typography55.isLayoutRequested()) {
            int i4 = onActivityLayout + 49;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
                if (onWarmupCompleted(this).onExtraCallbackWithResult().getWidth() != 0) {
                    if (onWarmupCompleted(this).ICustomTabsCallback.getHeight() != 0) {
                        onWarmupCompleted(this).IAuthTabCallbackStubProxy.setupVideoSlotRect(new Rect(0, onWarmupCompleted(this).IAuthTabCallbackStub.getBottom() + varyMatches.IAuthTabCallback(24, this), onWarmupCompleted(this).onExtraCallbackWithResult().getWidth(), onWarmupCompleted(this).ICustomTabsCallback.getTop() - varyMatches.IAuthTabCallback(24, this)));
                        return;
                    }
                }
            } else if (onWarmupCompleted(this).onExtraCallbackWithResult().getWidth() != 0) {
            }
            onWarmupCompleted(this).ICustomTabsCallback.post(new IAuthTabCallbackDefault());
            return;
        }
        typography55.addOnLayoutChangeListener(new asBinder());
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = (NativeAdsShortVideoActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = onPostMessage + 33;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        ScrollView scrollView = nativeAdsShortVideoActivity.readTypedObject().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        ScrollView scrollView2 = nativeAdsShortVideoActivity.readTypedObject().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(scrollView2, "");
        if (scrollView2.getVisibility() == 0) {
            i = 8;
        } else {
            int i5 = onPostMessage + 105;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        scrollView.setVisibility(i);
        return false;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1726899103, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, nativeAdsEventLogType}, 1726899105);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1202544340, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, nativeAdsEventLogType}, -1202544336);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1897899379, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view}, 1897899386);
    }

    public static final /* synthetic */ getPackageType asBinder(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getPackageType) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -168898588, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity}, 168898596);
    }

    public static final /* synthetic */ void onTransact(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1918622534, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity}, 1918622540);
    }

    public static final /* synthetic */ boolean access000(NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1041037927, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity}, -1041037915)).booleanValue();
    }

    private final void onExtraCallback(NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -478970203, iOnNavigationEvent3, new Object[]{this, adAsset, shortFormVideo}, 478970217);
    }

    private static final void IAuthTabCallback(float f, NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view, long j, long j2) throws Throwable {
        Object[] objArr = {Float.valueOf(f), nativeAdsShortVideoActivity, view, Long.valueOf(j), Long.valueOf(j2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -307213743, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 307213743);
    }

    private final void onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1686826137, iOnNavigationEvent3, new Object[]{this, nativeAdsDto, adAsset}, -1686826128);
    }

    private static final Unit asInterface(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1023647961, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, shortFormVideo}, 1023647962);
    }

    private static final void asInterface(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, View view) throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 610495279, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, view}, -610495269);
    }

    private static final Unit onTransact(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1059879924, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, nativeAdsEventLogType}, -1059879921);
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo, MotionEvent motionEvent) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -174430332, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, str, adAsset, shortFormVideo, motionEvent}, 174430343);
    }

    private static final Unit onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1842782316, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, nativeAdsDto, adAsset}, -1842782311);
    }

    private static final boolean onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, View view) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1059252509, iOnNavigationEvent3, new Object[]{nativeAdsShortVideoActivity, view}, 1059252522)).booleanValue();
    }

    private final void onMessageChannelReady() throws Throwable {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 483064426, iOnNavigationEvent3, new Object[]{this}, -483064411);
    }

    public final zzad IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (zzad) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1271021803, iOnNavigationEvent3, new Object[]{this}, -1271021787);
    }

    public final boolean onExtraCallback(@NotNull ExoPlayer exoPlayer) {
        Object[] objArr = {this, exoPlayer};
        int iOnWarmupCompleted = applyLabel.onNavigationEvent.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(855841779 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnWarmupCompleted, -2107491888, 2003387013 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022646).substring(0, 4).codePointAt(2), objArr, 2107491905)).booleanValue();
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onPostMessage + 11;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onPostMessage + 117;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onPostMessage + 1;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void access100() {
        onActivityResized = 2300679486584800670L;
    }
}
