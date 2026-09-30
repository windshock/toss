package im.toss.uikit.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.M_;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.VectorConvertersKtExternalSyntheticLambda7;
import o.access13800;
import o.access14100;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_immutable;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateLink;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.hasVaryAll;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.maxAgeSeconds;
import o.noStore;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class PillarSwipeRefreshLayout extends SwipeRefreshLayout {
    private static int AudioAttributesCompatParcelizer;
    private static byte[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    public static final onNavigationEvent Companion;
    private static int IconCompatParcelizer;
    private static int MediaMetadataCompat;
    public static final int getInterfaceDescriptor;
    private static short[] write;
    private int IAuthTabCallback_Parcel;
    private final List<View> ICustomTabsCallback;
    private final Lazy ICustomTabsCallbackDefault;
    private float ICustomTabsCallbackStub;
    private float ICustomTabsCallbackStubProxy;
    private boolean ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private final int[] ICustomTabsServiceDefault;
    private float ICustomTabsServiceStub;
    private final int[] ICustomTabsServiceStubProxy;
    private View ICustomTabsService_Parcel;
    private final ViewTreeObserver.OnPreDrawListener IEngagementSignalsCallback;
    private int IEngagementSignalsCallbackDefault;
    private final String IEngagementSignalsCallbackStub;
    private TdsImageView IEngagementSignalsCallbackStubProxy;
    private float IEngagementSignalsCallback_Parcel;
    private float IPostMessageService;
    private float IPostMessageServiceDefault;
    private View IPostMessageServiceStub;
    private boolean IPostMessageServiceStubProxy;
    private boolean IPostMessageService_Parcel;
    private int ITrustedWebActivityCallback;
    private Rally ITrustedWebActivityCallbackDefault;
    private int ITrustedWebActivityCallbackStub;
    private Rally ITrustedWebActivityCallbackStubProxy;
    private SwipeRefreshLayout.IAuthTabCallback ITrustedWebActivityCallback_Parcel;
    private View ITrustedWebActivityService;
    private float ITrustedWebActivityServiceDefault;
    private boolean ITrustedWebActivityServiceStub;
    private int ITrustedWebActivityServiceStubProxy;
    private final int ITrustedWebActivityService_Parcel;
    private boolean RemoteActionCompatParcelizer;
    private ViewTreeObserver.OnGlobalLayoutListener access100;
    private float access200;
    private int areNotificationsEnabled;
    private View cancelNotification;
    private final List<Float> extraCallback;
    private View extraCallbackWithResult;
    private boolean extraCommand;
    private float getActiveNotifications;
    private int getSmallIconBitmap;
    private int getSmallIconId;
    private boolean isEngagementSignalsApiAvailable;
    private boolean mayLaunchUrl;
    private boolean newAuthTabSession;
    private boolean newSession;
    private boolean newSessionWithExtras;
    private int notifyNotificationWithChannel;
    private float onActivityLayout;
    private float onActivityResized;
    private final int[] onGreatestScrollPercentageIncreased;
    private runOnUiThreadDelayed onMessageChannelReady;
    private LottieAnimationView onMinimized;
    private ValueAnimator onPostMessage;
    private float onRelationshipValidationResult;
    private float onSessionEnded;
    private float onUnminimized;
    private boolean onVerticalScrollEvent;
    private boolean postMessage;
    private boolean prefetch;
    private final Lazy prefetchWithMultipleUrls;
    private AtomicBoolean read;
    private float readTypedObject;
    private final Lazy receiveFile;
    private int requestPostMessageChannel;
    private LottieAnimationView requestPostMessageChannelWithExtras;
    private final Handler setEngagementSignalsCallback;
    private AtomicBoolean updateVisuals;
    private boolean validateRelationship;
    private final Lazy warmup;
    private boolean writeTypedList;
    private final List<View> writeTypedObject;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = (i * 2) + 4;
        byte[] bArr = $$a;
        int i4 = b * 2;
        int i5 = 115 - (s * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            int i8 = 0;
            int i9 = (-i3) + i6;
            int i10 = i7 + 1;
            i2 = i8;
            i5 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i11 = i5;
            i7 = i3;
            i3 = bArr[i3];
            i8 = i2 + 1;
            i6 = i11;
            int i92 = (-i3) + i6;
            int i102 = i7 + 1;
            i2 = i8;
            i5 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static {
        MediaMetadataCompat = 1;
        IAuthTabCallbackDefault();
        Companion = new onNavigationEvent(null);
        getInterfaceDescriptor = 8;
        int i = MediaBrowserCompatMediaItem + 35;
        MediaMetadataCompat = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PillarSwipeRefreshLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 43;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(pillarSwipeRefreshLayout, view, iIntValue, iIntValue2, iIntValue3, iIntValue4);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 13;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(view);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(view);
        int i3 = RatingCompat + 35;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsImageView tdsImageView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(tdsImageView);
        int i4 = RatingCompat + 81;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 45;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
        int i4 = AudioAttributesImplBaseParcelizer + 57;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(pillarSwipeRefreshLayout, valueAnimator);
        int i4 = AudioAttributesImplBaseParcelizer + 11;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 47;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(onMessageChannelReady(pillarSwipeRefreshLayout));
        }
        onMessageChannelReady(pillarSwipeRefreshLayout);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 61;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(pillarSwipeRefreshLayout);
        int i4 = AudioAttributesImplBaseParcelizer + Imgproc.COLOR_YUV2RGB_YVYU;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(pillarSwipeRefreshLayout);
        int i4 = AudioAttributesImplBaseParcelizer + 115;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCallbackWithResult = extraCallbackWithResult(pillarSwipeRefreshLayout);
        int i4 = RatingCompat + 13;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iExtraCallbackWithResult);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + Imgproc.COLOR_YUV2RGB_YVYU;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(view);
        int i4 = RatingCompat + 35;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit asBinder(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 3;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -45063461, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 45063473, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = RatingCompat + 101;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            onActivityResized(pillarSwipeRefreshLayout);
            throw null;
        }
        Unit unitOnActivityResized = onActivityResized(pillarSwipeRefreshLayout);
        int i3 = RatingCompat + 125;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 107;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(view);
            throw null;
        }
        Unit unitAsBinder = asBinder(view);
        int i3 = AudioAttributesImplBaseParcelizer + 33;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(pillarSwipeRefreshLayout, f);
        int i4 = AudioAttributesImplBaseParcelizer + 81;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 87;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
        int i3 = RatingCompat + 109;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 79;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(pillarSwipeRefreshLayout, f, f2, valueAnimator);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + Imgproc.COLOR_YUV2RGBA_YVYU;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 15;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStubProxy(pillarSwipeRefreshLayout);
            throw null;
        }
        boolean zICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(pillarSwipeRefreshLayout);
        int i3 = RatingCompat + 47;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return zICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 23;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnUnminimized = onUnminimized(pillarSwipeRefreshLayout);
        int i4 = AudioAttributesImplBaseParcelizer + 97;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsImageView tdsImageView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(new Object[]{tdsImageView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1803121534, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1803121517, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = AudioAttributesImplBaseParcelizer + 111;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ int onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 45;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return onMinimized(pillarSwipeRefreshLayout);
        }
        onMinimized(pillarSwipeRefreshLayout);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(zBooleanValue, pillarSwipeRefreshLayout);
        }
        IAuthTabCallback(zBooleanValue, pillarSwipeRefreshLayout);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int paddingTop;
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i2));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i2));
        int i13 = i4 + i2 + i5 + (1112421973 * i) + ((-1897213938) * i3);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i4) - 781189120) + ((-1395624931) * i2) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i5) + ((-1446510592) * i) + (892338176 * i3) + ((-1657864192) * i14);
        int i16 = (i4 * 2010092721) + 1217064380 + (i2 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i5 * 2010091741) + (i * (-1378896031)) + (i3 * 856652822) + (i14 * 563281920);
        switch (i15 + (i16 * i16 * (-1077346304))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
                int i17 = 2 % 2;
                int i18 = AudioAttributesImplBaseParcelizer + Imgproc.COLOR_YUV2RGBA_YVYU;
                int i19 = i18 % 128;
                RatingCompat = i19;
                int i20 = i18 % 2;
                boolean z = pillarSwipeRefreshLayout.postMessage;
                int i21 = i19 + 25;
                AudioAttributesImplBaseParcelizer = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.valueOf(z);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                View view = (View) objArr[0];
                int i23 = 2 % 2;
                int i24 = AudioAttributesImplBaseParcelizer + 69;
                RatingCompat = i24 % 128;
                view.setVisibility(i24 % 2 == 0 ? 8 : 55);
                return Unit.INSTANCE;
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout2 = (PillarSwipeRefreshLayout) objArr[0];
                int i25 = 2 % 2;
                int i26 = AudioAttributesImplBaseParcelizer + 93;
                RatingCompat = i26 % 128;
                int i27 = i26 % 2;
                onNavigationEvent(pillarSwipeRefreshLayout2, 0, 1, (Object) null);
                pillarSwipeRefreshLayout2.onMinimized();
                Unit unit = Unit.INSTANCE;
                int i28 = AudioAttributesImplBaseParcelizer + 85;
                RatingCompat = i28 % 128;
                int i29 = i28 % 2;
                return unit;
            case 13:
                return access100(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return getInterfaceDescriptor(objArr);
            case 18:
                return writeTypedObject(objArr);
            case 19:
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout3 = (PillarSwipeRefreshLayout) objArr[0];
                int i30 = 2 % 2;
                if (pillarSwipeRefreshLayout3.IPostMessageService_Parcel) {
                    return null;
                }
                if (pillarSwipeRefreshLayout3.ITrustedWebActivityCallbackStub == 0) {
                    View view2 = pillarSwipeRefreshLayout3.cancelNotification;
                    if (view2 != null) {
                        int i31 = AudioAttributesImplBaseParcelizer + 55;
                        RatingCompat = i31 % 128;
                        int i32 = i31 % 2;
                        paddingTop = view2.getPaddingTop();
                    } else {
                        paddingTop = 0;
                    }
                    pillarSwipeRefreshLayout3.ITrustedWebActivityCallbackStub = paddingTop;
                    int i33 = AudioAttributesImplBaseParcelizer + 89;
                    RatingCompat = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    View view3 = pillarSwipeRefreshLayout3.cancelNotification;
                    if (view3 != null) {
                        if (view3 != null) {
                            int i35 = AudioAttributesImplBaseParcelizer + 49;
                            RatingCompat = i35 % 128;
                            int i36 = i35 % 2;
                            if (view3.getPaddingTop() != pillarSwipeRefreshLayout3.ITrustedWebActivityCallbackStub) {
                            }
                        }
                    }
                }
                if (pillarSwipeRefreshLayout3.ITrustedWebActivityCallback != 0) {
                    return null;
                }
                View view4 = pillarSwipeRefreshLayout3.ITrustedWebActivityService;
                pillarSwipeRefreshLayout3.ITrustedWebActivityCallback = view4 != null ? view4.getPaddingTop() : 0;
                return null;
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return readTypedObject(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(new Object[]{view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2049989796, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2049989786, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = RatingCompat + 107;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pillarSwipeRefreshLayout, f, f2, f3);
        int i4 = RatingCompat + 31;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 11;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pillarSwipeRefreshLayout, fFloatValue, fFloatValue2);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ int onWarmupCompleted(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIntValue = ((Integer) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 765326103, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -765326087, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue();
        int i4 = RatingCompat + 25;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsImageView tdsImageView, PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + Imgproc.COLOR_YUV2RGBA_YVYU;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tdsImageView, pillarSwipeRefreshLayout);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsImageView, pillarSwipeRefreshLayout);
        int i3 = AudioAttributesImplBaseParcelizer + 99;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 123;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(view, i);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 87;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        TdsImageView tdsImageView = (TdsImageView) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 79;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsImageView);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = RatingCompat + Imgproc.COLOR_YUV2RGB_YVYU;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static final class IAuthTabCallback implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallback() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            PillarSwipeRefreshLayout pillarSwipeRefreshLayout = PillarSwipeRefreshLayout.this;
            View viewAccess000 = PillarSwipeRefreshLayout.access000(pillarSwipeRefreshLayout);
            Intrinsics.checkNotNull(viewAccess000);
            Object[] objArr = {PillarSwipeRefreshLayout.this};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            PillarSwipeRefreshLayout.onExtraCallback(pillarSwipeRefreshLayout, viewAccess000, ((Boolean) PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1970256248, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1970256244, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue());
            PillarSwipeRefreshLayout pillarSwipeRefreshLayout2 = PillarSwipeRefreshLayout.this;
            PillarSwipeRefreshLayout.onWarmupCompleted(pillarSwipeRefreshLayout2, PillarSwipeRefreshLayout.getInterfaceDescriptor(pillarSwipeRefreshLayout2) + PillarSwipeRefreshLayout.writeTypedObject(PillarSwipeRefreshLayout.this));
            int i12 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public IAuthTabCallbackStub() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingTop;
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            PillarSwipeRefreshLayout pillarSwipeRefreshLayout = PillarSwipeRefreshLayout.this;
            View viewICustomTabsCallback = PillarSwipeRefreshLayout.ICustomTabsCallback(pillarSwipeRefreshLayout);
            if (viewICustomTabsCallback != null) {
                int i12 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                paddingTop = viewICustomTabsCallback.getPaddingTop();
                int i14 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
            } else {
                paddingTop = 0;
            }
            Object[] objArr = {pillarSwipeRefreshLayout, Integer.valueOf(paddingTop)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 648608975, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -648608964, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        }
    }

    public static final class onTransact implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;

        public onTransact(View view, boolean z) {
            this.onExtraCallback = view;
            this.onExtraCallbackWithResult = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 41;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                view.removeOnLayoutChangeListener(this);
                PillarSwipeRefreshLayout.onExtraCallback(PillarSwipeRefreshLayout.this, this.onExtraCallback, this.onExtraCallbackWithResult);
                int i11 = IAuthTabCallback + 45;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            view.removeOnLayoutChangeListener(this);
            PillarSwipeRefreshLayout.onExtraCallback(PillarSwipeRefreshLayout.this, this.onExtraCallback, this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PillarSwipeRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        String strIntern;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.ITrustedWebActivityServiceDefault = -1.0f;
        this.ICustomTabsCallbackStub = -9999.0f;
        this.requestPostMessageChannel = 1000;
        this.ICustomTabsCallback = new ArrayList();
        this.extraCallback = new ArrayList();
        int paddingTop = 0;
        this.read = new AtomicBoolean(false);
        this.ICustomTabsServiceDefault = new int[2];
        this.receiveFile = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Integer numValueOf = Integer.valueOf(((Integer) PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1207762082, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1207762075, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue());
                int i4 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return numValueOf;
                }
                throw null;
            }
        });
        this.IAuthTabCallback_Parcel = -1;
        this.warmup = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Integer numValueOf = Integer.valueOf(PillarSwipeRefreshLayout.onWarmupCompleted(this.f$0));
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 26 / 0;
                }
                return numValueOf;
            }
        });
        this.prefetchWithMultipleUrls = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer numValueOf = Integer.valueOf(PillarSwipeRefreshLayout.onNavigationEvent(this.f$0));
                int i4 = onExtraCallback + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf;
            }
        });
        this.updateVisuals = new AtomicBoolean(false);
        this.IPostMessageServiceStubProxy = true;
        this.writeTypedObject = new ArrayList();
        this.onGreatestScrollPercentageIncreased = new int[2];
        this.ICustomTabsServiceStubProxy = new int[2];
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Object[] objArr = new Object[1];
            a((short) TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-475062130) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), View.combineMeasuredStates(0, 0) + 933986210, (-111) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-475062054) - KeyEvent.getDeadChar(0, 0), 933986209 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), (-112) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        this.IEngagementSignalsCallbackStub = strIntern;
        this.ICustomTabsCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr3 = {this.f$0};
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Integer numValueOf = Integer.valueOf(((Integer) PillarSwipeRefreshLayout.onNavigationEvent(objArr3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2102059822, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2102059808, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue());
                int i4 = onExtraCallback + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf;
            }
        });
        this.IPostMessageServiceDefault = (this.getSmallIconId + (access100() / 2.0f)) - ((readTypedObject() - IAuthTabCallback_Parcel()) / 2.0f);
        this.IEngagementSignalsCallback_Parcel = (this.getSmallIconId + (access100() / 2.0f)) - ((ICustomTabsCallback() - IAuthTabCallback_Parcel()) / 2.0f);
        this.IEngagementSignalsCallback = new ViewTreeObserver.OnPreDrawListener() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnExtraCallback = PillarSwipeRefreshLayout.onExtraCallback(this.f$0);
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return zOnExtraCallback;
            }
        };
        if (attributeSet != null) {
            int i = RatingCompat + 119;
            AudioAttributesImplBaseParcelizer = i % 128;
            int i2 = i % 2;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PillarSwipeRefreshLayout, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = false;
            boolean z2 = true;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.PillarSwipeRefreshLayout_useTdsRefreshType) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == R.styleable.PillarSwipeRefreshLayout_showTdsRipple) {
                    z2 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == R.styleable.PillarSwipeRefreshLayout_loadingIndicatorBuffer) {
                    this.requestPostMessageChannel = typedArrayObtainStyledAttributes.getInteger(index, 1000);
                    int i4 = 2 % 2;
                }
            }
            this.IPostMessageServiceStubProxy = z2;
            this.ITrustedWebActivityServiceStub = z;
        }
        this.ITrustedWebActivityService_Parcel = ViewConfiguration.get(context).getScaledTouchSlop();
        this.ITrustedWebActivityServiceDefault = access100();
        if (isLaidOut()) {
            int i5 = RatingCompat + 65;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
                if (isLayoutRequested()) {
                    addOnLayoutChangeListener(new IAuthTabCallbackStub());
                    int i7 = AudioAttributesImplBaseParcelizer + 85;
                    RatingCompat = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 2;
                    }
                } else {
                    View viewICustomTabsCallback = ICustomTabsCallback(this);
                    if (viewICustomTabsCallback != null) {
                        int i9 = AudioAttributesImplBaseParcelizer + 87;
                        RatingCompat = i9 % 128;
                        if (i9 % 2 != 0) {
                            viewICustomTabsCallback.getPaddingTop();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        paddingTop = viewICustomTabsCallback.getPaddingTop();
                    }
                    onNavigationEvent(new Object[]{this, Integer.valueOf(paddingTop)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 648608975, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -648608964, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                }
            } else if (isLayoutRequested()) {
            }
        }
        Field declaredField = SwipeRefreshLayout.class.getDeclaredField("mCircleView");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(this);
        Intrinsics.checkNotNull(obj2, "");
        final View view = (View) obj2;
        this.extraCallbackWithResult = view;
        final int iIAuthTabCallback = varyMatches.IAuthTabCallback(this, Float.valueOf(ViewConfiguration.get(view.getContext()).getScaledTouchSlop()));
        this.access100 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 79;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                PillarSwipeRefreshLayout.onWarmupCompleted(view, iIAuthTabCallback);
                int i13 = onExtraCallback + 9;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.access100);
        this.setEngagementSignalsCallback = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PillarSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = AudioAttributesImplBaseParcelizer + 59;
            int i3 = i2 % 128;
            RatingCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            } else {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ float IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(f);
        if (i3 == 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((Float) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout, fValueOf}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
            throw null;
        }
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        float fFloatValue = ((Float) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout, fValueOf}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2)).floatValue();
        int i4 = RatingCompat + 83;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 15;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        pillarSwipeRefreshLayout.areNotificationsEnabled = iIntValue;
        int i5 = i2 + 53;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return null;
    }

    public static final /* synthetic */ LottieAnimationView IAuthTabCallbackStubProxy(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 97;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        LottieAnimationView lottieAnimationView = pillarSwipeRefreshLayout.requestPostMessageChannelWithExtras;
        int i5 = i2 + 27;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return lottieAnimationView;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallback_Parcel(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 83;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = pillarSwipeRefreshLayout.onMessageChannelReady;
        if (i3 == 0) {
            return runonuithreaddelayed;
        }
        throw null;
    }

    public static final /* synthetic */ View ICustomTabsCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        View view = pillarSwipeRefreshLayout.ITrustedWebActivityService;
        if (i4 == 0) {
            int i5 = 89 / 0;
        }
        int i6 = i3 + 55;
        RatingCompat = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    public static final /* synthetic */ View access000(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 43;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        View view = pillarSwipeRefreshLayout.ICustomTabsService_Parcel;
        if (i3 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float access100(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + Imgproc.COLOR_YUV2RGBA_YVYU;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        float f = pillarSwipeRefreshLayout.ICustomTabsServiceStub;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return f;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 13;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        pillarSwipeRefreshLayout.RemoteActionCompatParcelizer = zBooleanValue;
        int i5 = i2 + 53;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ int getInterfaceDescriptor(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        Object obj = null;
        int i5 = pillarSwipeRefreshLayout.IEngagementSignalsCallbackDefault;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i3 + 13;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        pillarSwipeRefreshLayout.onExtraCallbackWithResult(view, z);
        int i4 = RatingCompat + 125;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 43;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        pillarSwipeRefreshLayout.ICustomTabsServiceStub = f;
        int i5 = i2 + 11;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat;
        int i4 = i3 + 69;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        pillarSwipeRefreshLayout.IEngagementSignalsCallbackDefault = i;
        int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ AtomicBoolean readTypedObject(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 37;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        AtomicBoolean atomicBoolean = pillarSwipeRefreshLayout.read;
        int i5 = i2 + 91;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return atomicBoolean;
    }

    public static final /* synthetic */ int writeTypedObject(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = pillarSwipeRefreshLayout.getSmallIconBitmap;
        if (i3 == 0) {
            int i5 = 2 / 0;
        }
        return i4;
    }

    public static final class asBinder implements Animator.AnimatorListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
        }

        public asBinder() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                LottieAnimationView lottieAnimationViewIAuthTabCallbackStubProxy = PillarSwipeRefreshLayout.IAuthTabCallbackStubProxy(PillarSwipeRefreshLayout.this);
                if (lottieAnimationViewIAuthTabCallbackStubProxy != null) {
                    int i3 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i3 % 128;
                    lottieAnimationViewIAuthTabCallbackStubProxy.setVisibility(i3 % 2 != 0 ? 124 : 8);
                    return;
                }
                return;
            }
            PillarSwipeRefreshLayout.IAuthTabCallbackStubProxy(PillarSwipeRefreshLayout.this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public asInterface() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LottieAnimationView lottieAnimationViewIAuthTabCallbackStubProxy = PillarSwipeRefreshLayout.IAuthTabCallbackStubProxy(PillarSwipeRefreshLayout.this);
            if (lottieAnimationViewIAuthTabCallbackStubProxy != null) {
                lottieAnimationViewIAuthTabCallbackStubProxy.setVisibility(8);
                int i4 = IAuthTabCallback + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = IAuthTabCallback + 99;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements Animator.AnimatorListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public onExtraCallback() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            LottieAnimationView lottieAnimationViewIAuthTabCallbackStubProxy = PillarSwipeRefreshLayout.IAuthTabCallbackStubProxy(PillarSwipeRefreshLayout.this);
            if (lottieAnimationViewIAuthTabCallbackStubProxy != null) {
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                lottieAnimationViewIAuthTabCallbackStubProxy.setVisibility(0);
            }
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 13;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        this.ITrustedWebActivityService = view;
        if (view != null) {
            int i5 = i2 + 57;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
            view.getPaddingTop();
            if (i6 != 0) {
                int i7 = 84 / 0;
            }
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        int i = 0;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i2 = 2 % 2;
        if (pillarSwipeRefreshLayout.onSessionEnded == 0.0f) {
            pillarSwipeRefreshLayout.extraCallback.clear();
            Iterator<T> it = pillarSwipeRefreshLayout.ICustomTabsCallback.iterator();
            while (it.hasNext()) {
                int i3 = AudioAttributesImplBaseParcelizer + 93;
                RatingCompat = i3 % 128;
                if (i3 % 2 != 0) {
                    pillarSwipeRefreshLayout.extraCallback.add(Float.valueOf(((View) it.next()).getTranslationY()));
                    throw null;
                }
                pillarSwipeRefreshLayout.extraCallback.add(Float.valueOf(((View) it.next()).getTranslationY()));
            }
        }
        pillarSwipeRefreshLayout.onSessionEnded = fFloatValue;
        View view = pillarSwipeRefreshLayout.cancelNotification;
        if (view != null) {
            view.setTranslationY(fFloatValue);
        }
        for (Object obj : pillarSwipeRefreshLayout.ICustomTabsCallback) {
            if (i < 0) {
                int i4 = AudioAttributesImplBaseParcelizer + 23;
                RatingCompat = i4 % 128;
                if (i4 % 2 != 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((View) obj).setTranslationY(pillarSwipeRefreshLayout.extraCallback.get(i).floatValue() + fFloatValue);
            i++;
        }
        return null;
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 19;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.getSmallIconId = i;
        float f = i;
        this.IPostMessageServiceDefault = ((access100() / 2.0f) + f) - ((readTypedObject() - IAuthTabCallback_Parcel()) / 2.0f);
        this.IEngagementSignalsCallback_Parcel = (f + (access100() / 2.0f)) - ((ICustomTabsCallback() - IAuthTabCallback_Parcel()) / 2.0f);
        int i5 = RatingCompat + 75;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int access100() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.receiveFile.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.receiveFile.getValue()).intValue();
        int i3 = RatingCompat + 97;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int onMessageChannelReady(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 83;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(pillarSwipeRefreshLayout, 80);
        int i4 = RatingCompat + 27;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    private final float ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        return i2 % 2 == 0 ? M_.onExtraCallback.asInterface() - 2.5f : M_.onExtraCallback.asInterface() * 2.5f;
    }

    private final int readTypedObject() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 59;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        return i3 != 0 ? iAsInterface + 1 : iAsInterface << 1;
    }

    private final int IAuthTabCallback_Parcel() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 53;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            iIntValue = ((Number) this.warmup.getValue()).intValue();
            int i3 = 46 / 0;
        } else {
            iIntValue = ((Number) this.warmup.getValue()).intValue();
        }
        int i4 = AudioAttributesImplBaseParcelizer + 119;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        SwipeRefreshLayout swipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(swipeRefreshLayout, 60);
        int i4 = AudioAttributesImplBaseParcelizer + 109;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iOnExtraCallbackWithResult);
        }
        int i5 = 54 / 0;
        return Integer.valueOf(iOnExtraCallbackWithResult);
    }

    private final int access000() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 35;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.prefetchWithMultipleUrls.getValue()).intValue();
        int i4 = AudioAttributesImplBaseParcelizer + 39;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int onMinimized(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 59;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(pillarSwipeRefreshLayout, 40);
        int i4 = AudioAttributesImplBaseParcelizer + 59;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final void setShowRipple(boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 107;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.IPostMessageServiceStubProxy = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 101;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 83;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        boolean z = pillarSwipeRefreshLayout.ITrustedWebActivityServiceStub;
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        int i6 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public final void setUseTdsPullToRefresh(boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat + 81;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        this.ITrustedWebActivityServiceStub = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 33;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ICustomTabsCallbackDefault.getValue()).intValue();
        int i4 = RatingCompat + 45;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int extraCallbackWithResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(pillarSwipeRefreshLayout, Integer.valueOf(i2 % 2 == 0 ? Imgproc.COLOR_YUV2BGR_YVYU : 64));
        int i3 = RatingCompat + 97;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean ICustomTabsCallbackStubProxy(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        if (pillarSwipeRefreshLayout.getGlobalVisibleRect(new Rect())) {
            int i2 = RatingCompat + 75;
            int i3 = i2 % 128;
            AudioAttributesImplBaseParcelizer = i3;
            if (i2 % 2 == 0) {
                int i4 = 24 / 0;
                if (!pillarSwipeRefreshLayout.newSessionWithExtras) {
                    pillarSwipeRefreshLayout.newSessionWithExtras = true;
                    int i5 = i3 + 89;
                    RatingCompat = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 5;
                    }
                }
            } else if (!pillarSwipeRefreshLayout.newSessionWithExtras) {
            }
        } else if (!(!pillarSwipeRefreshLayout.newSessionWithExtras)) {
            int i7 = RatingCompat + 85;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            pillarSwipeRefreshLayout.newSessionWithExtras = false;
            pillarSwipeRefreshLayout.asInterface();
        }
        return true;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0)), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i7 = $11 + Imgproc.COLOR_YUV2RGB_YVYU;
                int i8 = i7 % 128;
                $10 = i8;
                int i9 = i7 % 2;
                byte[] bArr = AudioAttributesImplApi21Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = i8 + 91;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 5 / 4;
                    }
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 119;
                        $10 = i13 % 128;
                        int i14 = i13 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 12843), 55 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i12++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i15 = $10 + 105;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    byte[] bArr3 = AudioAttributesImplApi21Parcelizer;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IconCompatParcelizer)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 43425), TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 42, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (AudioAttributesCompatParcelizer ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (write[i + ((int) (IconCompatParcelizer ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (AudioAttributesCompatParcelizer ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i17 = $11;
                int i18 = i17 + 95;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((i + iIntValue) - 2) + ((int) (IconCompatParcelizer ^ (-4629411779493505016L)));
                if (z2) {
                    int i21 = i17 + 53;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i20 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(AudioAttributesImplApi26Parcelizer), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 85, 9567 - Color.alpha(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = AudioAttributesImplApi21Parcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        bArr5[i23] = (byte) (bArr4[i23] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i24 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                    $11 = i24 % 128;
                    int i25 = i24 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i26 = $11 + 35;
                        $10 = i26 % 128;
                        int i27 = i26 % 2;
                        byte[] bArr6 = AudioAttributesImplApi21Parcelizer;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = write;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

    private static final void onExtraCallback(View view, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 75;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        view.setAlpha(Math.max(0.0f, 1.0f - (Math.abs(Math.min(view.getTop(), 0)) / i)));
        int i5 = RatingCompat + 33;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnRefreshListener(@Nullable SwipeRefreshLayout.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 45;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        this.ITrustedWebActivityCallback_Parcel = iAuthTabCallback;
        super.setOnRefreshListener(iAuthTabCallback);
        int i4 = RatingCompat + 93;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setRefreshing(boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (!this.ITrustedWebActivityServiceStub) {
            int i2 = AudioAttributesImplBaseParcelizer + 109;
            RatingCompat = i2 % 128;
            if (i2 % 2 == 0) {
                super.setRefreshing(z);
                return;
            } else {
                super.setRefreshing(z);
                obj.hashCode();
                throw null;
            }
        }
        if (!(!z)) {
            int i3 = RatingCompat + 109;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback(this, true, null, 2, null);
            this.prefetch = true;
            return;
        }
        this.setEngagementSignalsCallback.removeCallbacksAndMessages(null);
        onExtraCallback(this, false, null, 2, null);
        this.prefetch = false;
    }

    public final void setCompoundViews(@NotNull List<? extends View> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<View> list2 = this.ICustomTabsCallback;
        list2.clear();
        list2.addAll(list);
        Iterator<T> it = this.ICustomTabsCallback.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i2 = AudioAttributesImplBaseParcelizer + 13;
                RatingCompat = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = RatingCompat + 99;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                this.extraCallback.add(Float.valueOf(((View) it.next()).getTranslationY()));
                throw null;
            }
            this.extraCallback.add(Float.valueOf(((View) it.next()).getTranslationY()));
        }
    }

    public void onNestedPreScroll(@NotNull View view, int i, int i2, @NotNull int[] iArr, int i3) {
        int i4 = 2 % 2;
        int i5 = AudioAttributesImplBaseParcelizer + 85;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i3 == 0) {
            int i7 = RatingCompat + 35;
            int i8 = i7 % 128;
            AudioAttributesImplBaseParcelizer = i8;
            int i9 = i7 % 2;
            if (!this.ITrustedWebActivityServiceStub) {
                int i10 = i8 + 73;
                RatingCompat = i10 % 128;
                int i11 = i10 % 2;
                onNestedPreScroll(view, i, i2, iArr);
                return;
            }
            int[] iArr2 = this.onGreatestScrollPercentageIncreased;
            if (!(!dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null))) {
                iArr[0] = iArr[0] + iArr2[0];
                iArr[1] = iArr[1] + iArr2[1];
            }
            if (this.updateVisuals.get() || !(!this.prefetch)) {
                return;
            }
            int i12 = RatingCompat + 105;
            int i13 = i12 % 128;
            AudioAttributesImplBaseParcelizer = i13;
            if (i12 % 2 == 0) {
                int i14 = 66 / 0;
                if (this.RemoteActionCompatParcelizer) {
                    return;
                }
            } else if (this.RemoteActionCompatParcelizer) {
                return;
            }
            int i15 = i13 + 65;
            int i16 = i15 % 128;
            RatingCompat = i16;
            if (i15 % 2 != 0) {
                int i17 = 87 / 0;
                if (i2 <= 0) {
                    return;
                }
            } else if (i2 <= 0) {
                return;
            }
            int i18 = this.ITrustedWebActivityServiceStubProxy;
            if (i18 > 0) {
                int i19 = i16 + 85;
                int i20 = i19 % 128;
                AudioAttributesImplBaseParcelizer = i20;
                if (i19 % 2 == 0) {
                    throw null;
                }
                if (i2 > i18) {
                    iArr[1] = i18;
                    this.ITrustedWebActivityServiceStubProxy = 0;
                } else {
                    this.ITrustedWebActivityServiceStubProxy = i18 - i2;
                    iArr[1] = i2;
                    int i21 = i20 + 105;
                    RatingCompat = i21 % 128;
                    int i22 = i21 % 2;
                }
                onExtraCallback(this.ITrustedWebActivityServiceStubProxy);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[PHI: r0
      0x005a: PHI (r0v10 int) = (r0v9 int), (r0v16 int) binds: [B:13:0x0058, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[PHI: r0
      0x0061: PHI (r0v12 int) = (r0v9 int), (r0v16 int) binds: [B:13:0x0058, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNestedScroll(@NotNull View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (!this.ITrustedWebActivityServiceStub) {
            super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        if (i5 == 0) {
            int i9 = AudioAttributesImplBaseParcelizer + 67;
            RatingCompat = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = iArr[1];
                onNavigationEvent(i, i2, i3, i4, this.ICustomTabsServiceStubProxy, i5, iArr);
                i6 = i4 % (iArr[1] + i10);
                i7 = i6 == 0 ? i4 + this.ICustomTabsServiceStubProxy[1] : i6;
            } else {
                int i11 = iArr[1];
                onNavigationEvent(i, i2, i3, i4, this.ICustomTabsServiceStubProxy, i5, iArr);
                i6 = i4 - (iArr[1] - i11);
                if (i6 == 0) {
                }
            }
            if (this.updateVisuals.get() || this.prefetch) {
                return;
            }
            int i12 = RatingCompat + 47;
            AudioAttributesImplBaseParcelizer = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 29 / 0;
                if (this.RemoteActionCompatParcelizer) {
                    return;
                }
            } else if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.isEngagementSignalsApiAvailable || i7 >= 0 || onExtraCallback()) {
                return;
            }
            int iAbs = this.ITrustedWebActivityServiceStubProxy + Math.abs(i7);
            this.ITrustedWebActivityServiceStubProxy = iAbs;
            onExtraCallback(iAbs);
            iArr[1] = iArr[1] + i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[PHI: r4
      0x0051: PHI (r4v9 com.airbnb.lottie.LottieAnimationView) = (r4v8 com.airbnb.lottie.LottieAnimationView), (r4v18 com.airbnb.lottie.LottieAnimationView) binds: [B:8:0x004f, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LottieAnimationView lottieAnimationView;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            float fMin = Math.min(pillarSwipeRefreshLayout.onSessionEnded / fFloatValue, pillarSwipeRefreshLayout.access100());
            pillarSwipeRefreshLayout.onActivityLayout = fMin;
            pillarSwipeRefreshLayout.IPostMessageService = fMin % pillarSwipeRefreshLayout.access100();
            lottieAnimationView = pillarSwipeRefreshLayout.onMinimized;
            if (lottieAnimationView != null) {
                float fAccess100 = pillarSwipeRefreshLayout.access100() - pillarSwipeRefreshLayout.IAuthTabCallback_Parcel();
                lottieAnimationView.setTranslationY(pillarSwipeRefreshLayout.onExtraCallback(pillarSwipeRefreshLayout.onActivityLayout));
                lottieAnimationView.setAlpha(Math.max(Math.min(pillarSwipeRefreshLayout.onActivityResized, (pillarSwipeRefreshLayout.IPostMessageService + fAccess100) / fAccess100), 0.0f));
            }
        } else {
            float fMin2 = Math.min(pillarSwipeRefreshLayout.onSessionEnded + fFloatValue, pillarSwipeRefreshLayout.access100());
            pillarSwipeRefreshLayout.onActivityLayout = fMin2;
            pillarSwipeRefreshLayout.IPostMessageService = fMin2 - pillarSwipeRefreshLayout.access100();
            lottieAnimationView = pillarSwipeRefreshLayout.onMinimized;
            if (lottieAnimationView != null) {
            }
        }
        TdsImageView tdsImageView = pillarSwipeRefreshLayout.IEngagementSignalsCallbackStubProxy;
        if (tdsImageView != null) {
            tdsImageView.setTranslationY(pillarSwipeRefreshLayout.IPostMessageServiceDefault + pillarSwipeRefreshLayout.IPostMessageService);
        }
        View view = pillarSwipeRefreshLayout.IPostMessageServiceStub;
        if (view != null) {
            int i3 = RatingCompat + 93;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                view.setTranslationY(pillarSwipeRefreshLayout.IEngagementSignalsCallback_Parcel - pillarSwipeRefreshLayout.IPostMessageService);
            } else {
                view.setTranslationY(pillarSwipeRefreshLayout.IEngagementSignalsCallback_Parcel + pillarSwipeRefreshLayout.IPostMessageService);
            }
        }
        return Float.valueOf(pillarSwipeRefreshLayout.IPostMessageService);
    }

    public boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        if (i2 == 0) {
            int i4 = AudioAttributesImplBaseParcelizer + 41;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            return onStartNestedScroll(view, view2, i);
        }
        int i6 = RatingCompat + 1;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 101;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        super.onNestedScrollAccepted(view, view2, i);
        this.ITrustedWebActivityServiceStubProxy = 0;
        this.writeTypedList = true;
        int i5 = RatingCompat + 41;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onStopNestedScroll(@NotNull View view, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i == 0) {
            if (!this.ITrustedWebActivityServiceStub) {
                onStopNestedScroll(view);
                return;
            }
            this.writeTypedList = false;
            int i3 = this.ITrustedWebActivityServiceStubProxy;
            if (i3 > 0) {
                int i4 = RatingCompat + 63;
                int i5 = i4 % 128;
                AudioAttributesImplBaseParcelizer = i5;
                int i6 = i4 % 2;
                if (this.isEngagementSignalsApiAvailable || this.RemoteActionCompatParcelizer) {
                    return;
                }
                int i7 = i5 + 125;
                RatingCompat = i7 % 128;
                if (i7 % 2 == 0 ? !this.mayLaunchUrl : !this.mayLaunchUrl) {
                    onExtraCallback(onWarmupCompleted((float) i3) > this.ITrustedWebActivityServiceDefault);
                    int i8 = AudioAttributesImplBaseParcelizer + 125;
                    RatingCompat = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    onExtraCallback(onWarmupCompleted((float) i3) > this.ITrustedWebActivityServiceDefault);
                    extraCallback();
                }
                this.ITrustedWebActivityServiceStubProxy = 0;
                onStopNestedScroll(view);
            }
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 123;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        this.access200 = -1.0f;
        this.ICustomTabsCallbackStubProxy = 0.0f;
        this.ITrustedWebActivityServiceStubProxy = 0;
        this.mayLaunchUrl = false;
        int i5 = i3 + 65;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(int i) {
        float fOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 113;
        int i4 = i3 % 128;
        RatingCompat = i4;
        if (i3 % 2 == 0 ? this.access200 != 0.0f : this.access200 != 1.0f) {
            this.access200 = 0.0f;
        }
        float f = i;
        float f2 = this.access200;
        int i5 = this.ITrustedWebActivityService_Parcel;
        float f3 = i5;
        if (f - f2 > f3 && !this.mayLaunchUrl) {
            this.onRelationshipValidationResult = f2 + f3;
            this.mayLaunchUrl = true;
        }
        if (i < i5) {
            this.mayLaunchUrl = false;
        }
        if (this.mayLaunchUrl) {
            int i6 = i4 + 79;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                fOnWarmupCompleted = onWarmupCompleted(f);
                if (fOnWarmupCompleted <= 0.0f) {
                    return;
                }
            } else {
                fOnWarmupCompleted = onWarmupCompleted(f);
                if (fOnWarmupCompleted <= 0.0f) {
                    return;
                }
            }
            onNavigationEvent(new Object[]{this, Float.valueOf(fOnWarmupCompleted)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            requestDisallowInterceptTouchEvent(true);
            asInterface(fOnWarmupCompleted);
            invalidate();
        }
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 83;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.ITrustedWebActivityServiceStub)) {
            boolean z = this.prefetch;
            int i5 = i2 + 67;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
        return super.IAuthTabCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 97;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        this.newSession = false;
        if (this.RemoteActionCompatParcelizer) {
            return false;
        }
        if (motionEvent == null) {
            return true;
        }
        onNavigationEvent(motionEvent);
        if (this.ICustomTabsCallback_Parcel) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                onPostMessage();
            }
            return false;
        }
        Object obj = null;
        if (this.prefetch) {
            int i4 = AudioAttributesImplBaseParcelizer + 75;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            if (this.ITrustedWebActivityServiceStub) {
                if (!this.validateRelationship || this.updateVisuals.get()) {
                    int i6 = RatingCompat + 15;
                    AudioAttributesImplBaseParcelizer = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                int i7 = AudioAttributesImplBaseParcelizer + 27;
                RatingCompat = i7 % 128;
                if (i7 % 2 != 0) {
                    this.read.set(false);
                    return false;
                }
                this.read.set(true);
                return false;
            }
        }
        if (onExtraCallback() || !this.ITrustedWebActivityServiceStub || this.writeTypedList || (!isEnabled())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.IAuthTabCallback_Parcel);
                    if (iFindPointerIndex < 0) {
                        int i8 = AudioAttributesImplBaseParcelizer + 69;
                        RatingCompat = i8 % 128;
                        int i9 = i8 % 2;
                        return false;
                    }
                    getInterfaceDescriptor(motionEvent.getY(iFindPointerIndex));
                } else if (actionMasked != 3) {
                    int i10 = RatingCompat + 61;
                    AudioAttributesImplBaseParcelizer = i10 % 128;
                    int i11 = i10 % 2;
                    if (actionMasked == 6) {
                        onExtraCallback(motionEvent);
                    }
                }
            }
            extraCallback();
            return false;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (actionIndex < 0) {
            int i12 = RatingCompat + 105;
            AudioAttributesImplBaseParcelizer = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        TdsImageView tdsImageView = this.IEngagementSignalsCallbackStubProxy;
        if (tdsImageView != null) {
            tdsImageView.setY(this.IPostMessageServiceDefault);
        }
        View view = this.IPostMessageServiceStub;
        if (view != null) {
            view.setY(this.IEngagementSignalsCallback_Parcel);
            int i14 = AudioAttributesImplBaseParcelizer + 113;
            RatingCompat = i14 % 128;
            int i15 = i14 % 2;
        }
        this.IAuthTabCallback_Parcel = motionEvent.getPointerId(actionIndex);
        this.ICustomTabsCallbackStubProxy = motionEvent.getY();
        this.newSession = false;
        boolean z = this.isEngagementSignalsApiAvailable;
        int i16 = AudioAttributesImplBaseParcelizer + 83;
        RatingCompat = i16 % 128;
        if (i16 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        this.getActiveNotifications = this.readTypedObject;
        int i5 = i3 + 55;
        RatingCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (onExtraCallback() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (onExtraCallback() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        this.newSession = false;
        if (motionEvent != null) {
            onNavigationEvent(motionEvent);
            if (this.ICustomTabsCallback_Parcel) {
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    onPostMessage();
                }
                return false;
            }
        }
        if (this.prefetch && this.ITrustedWebActivityServiceStub) {
            if (!this.validateRelationship) {
                int i4 = RatingCompat + 123;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (motionEvent != null) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        if (!this.updateVisuals.get() && this.ICustomTabsCallbackStub == -9999.0f) {
                            this.ICustomTabsCallbackStub = motionEvent.getY();
                            this.onActivityLayout = this.onSessionEnded;
                        }
                        this.extraCommand = true;
                    } else if (action == 1) {
                        onActivityLayout();
                        this.ICustomTabsCallbackStub = -9999.0f;
                        this.onActivityLayout = 0.0f;
                        this.extraCommand = false;
                    } else if (action != 2) {
                        int i5 = RatingCompat + 25;
                        AudioAttributesImplBaseParcelizer = i5 % 128;
                        int i6 = i5 % 2;
                        if (action == 3) {
                        }
                    } else if (!this.updateVisuals.get()) {
                        if (this.ICustomTabsCallbackStub == -9999.0f) {
                            this.ICustomTabsCallbackStub = motionEvent.getY();
                            this.onActivityLayout = this.onSessionEnded;
                        }
                        this.readTypedObject = ((Float) onNavigationEvent(new Object[]{this, Float.valueOf((motionEvent.getY() - this.ICustomTabsCallbackStub) + this.getActiveNotifications)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
                    }
                    if (!this.updateVisuals.get() || motionEvent.getAction() != 2) {
                        IAuthTabCallback(motionEvent);
                    }
                    return true;
                }
            }
            this.read.set(true);
            return false;
        }
        if (this.ITrustedWebActivityServiceStub) {
            int i7 = RatingCompat + 33;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 30 / 0;
            }
        }
        if (this.ITrustedWebActivityServiceStub) {
            int i9 = AudioAttributesImplBaseParcelizer + Imgproc.COLOR_YUV2RGB_YVYU;
            RatingCompat = i9 % 128;
            if (i9 % 2 != 0) {
                onExtraCallback();
                throw null;
            }
            if (!onExtraCallback()) {
                int i10 = RatingCompat + 61;
                AudioAttributesImplBaseParcelizer = i10 % 128;
                int i11 = i10 % 2;
                if (this.updateVisuals.get() || motionEvent == null) {
                    return true;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                int i12 = RatingCompat + 113;
                                AudioAttributesImplBaseParcelizer = i12 % 128;
                                int i13 = i12 % 2;
                                if (actionMasked == 6) {
                                    onExtraCallback(motionEvent);
                                }
                            }
                        } else {
                            if (motionEvent.findPointerIndex(this.IAuthTabCallback_Parcel) < 0) {
                                int i14 = RatingCompat + 21;
                                AudioAttributesImplBaseParcelizer = i14 % 128;
                                int i15 = i14 % 2;
                                return true;
                            }
                            if (this.isEngagementSignalsApiAvailable) {
                                int i16 = AudioAttributesImplBaseParcelizer + 47;
                                RatingCompat = i16 % 128;
                                int i17 = i16 % 2;
                                float fOnWarmupCompleted = onWarmupCompleted(motionEvent.getY());
                                if (fOnWarmupCompleted > 0.0f) {
                                    onNavigationEvent(new Object[]{this, Float.valueOf(fOnWarmupCompleted)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                                    requestDisallowInterceptTouchEvent(true);
                                    asInterface(fOnWarmupCompleted);
                                    invalidate();
                                }
                            }
                        }
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.IAuthTabCallback_Parcel);
                    extraCallback();
                    if (iFindPointerIndex < 0) {
                        onExtraCallback(false);
                        return true;
                    }
                    float fOnWarmupCompleted2 = onWarmupCompleted(motionEvent.getY());
                    if (this.isEngagementSignalsApiAvailable) {
                        int i18 = RatingCompat + 43;
                        AudioAttributesImplBaseParcelizer = i18 % 128;
                        int i19 = i18 % 2;
                        if (fOnWarmupCompleted2 > this.ITrustedWebActivityServiceDefault) {
                            z = true;
                        }
                    }
                    onExtraCallback(z);
                    return true;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.IAuthTabCallback_Parcel = motionEvent.getPointerId(actionIndex);
                this.ICustomTabsCallbackStubProxy = motionEvent.getY();
                this.onRelationshipValidationResult = motionEvent.getY();
                this.newSession = false;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 77;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        int childCount = getChildCount();
        while (i4 < childCount) {
            getChildAt(i4).dispatchTouchEvent(motionEvent);
            i4++;
            int i5 = RatingCompat + 111;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = AudioAttributesImplBaseParcelizer + 101;
        RatingCompat = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float onWarmupCompleted(float f) {
        double d;
        double measuredHeight;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 119;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            d = f + this.onRelationshipValidationResult;
            measuredHeight = 0.97d % ((0.15d * d) / getMeasuredHeight());
        } else {
            d = f - this.onRelationshipValidationResult;
            measuredHeight = 0.97d - ((0.15d * d) / getMeasuredHeight());
        }
        return (float) Math.pow(d, measuredHeight);
    }

    private final void onExtraCallback(final boolean z) {
        int i = 2 % 2;
        if (!this.newSession && !this.prefetch) {
            int i2 = RatingCompat + 37;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            if (z) {
                int i4 = RatingCompat + 65;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
                LottieAnimationView lottieAnimationView = this.onMinimized;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAlpha(1.0f);
                    lottieAnimationView.setVisibility(0);
                }
                onNavigationEvent(new Object[]{this, true, Boolean.TRUE}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -307929154, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 307929167, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                SwipeRefreshLayout.IAuthTabCallback iAuthTabCallback = this.ITrustedWebActivityCallback_Parcel;
                if (iAuthTabCallback != null) {
                    iAuthTabCallback.onRefresh();
                }
            }
            float f = this.onSessionEnded;
            float fAccess100 = z ? access100() : 0.0f;
            this.isEngagementSignalsApiAvailable = false;
            this.ITrustedWebActivityCallbackStubProxy = isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), 700), Float.valueOf(f), Float.valueOf(fAccess100), new Function1() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        PillarSwipeRefreshLayout.onExtraCallback(this.f$0, ((Float) obj).floatValue());
                        throw null;
                    }
                    Unit unitOnExtraCallback = PillarSwipeRefreshLayout.onExtraCallback(this.f$0, ((Float) obj).floatValue());
                    int i8 = onNavigationEvent + 27;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 80 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallbackDefault = PillarSwipeRefreshLayout.IAuthTabCallbackDefault(this.f$0);
                    int i9 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return unitIAuthTabCallbackDefault;
                }
            }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 7;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitAsInterface = PillarSwipeRefreshLayout.asInterface(this.f$0);
                    int i9 = onNavigationEvent + 21;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 / 0;
                    }
                    return unitAsInterface;
                }
            }, 1, (Object) null), null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    boolean z2 = z;
                    if (i8 != 0) {
                        Object[] objArr = {Boolean.valueOf(z2), this};
                        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                        return (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2071989125, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2071989126, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                    }
                    Object[] objArr2 = {Boolean.valueOf(z2), this};
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int i9 = 89 / 0;
                    return (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2071989125, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2071989126, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
                }
            }, 1, null}, 2128644226), false, 1, (Object) null);
        }
        int i6 = RatingCompat + 47;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(f)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            pillarSwipeRefreshLayout.asInterface(f);
            pillarSwipeRefreshLayout.invalidate();
            int i3 = 7 / 0;
            return Unit.INSTANCE;
        }
        Object[] objArr2 = {pillarSwipeRefreshLayout, Float.valueOf(f)};
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        pillarSwipeRefreshLayout.asInterface(f);
        pillarSwipeRefreshLayout.invalidate();
        return Unit.INSTANCE;
    }

    private static final Unit onPostMessage(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 43;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        pillarSwipeRefreshLayout.updateVisuals.set(true);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat + 17;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityResized(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            atomicBoolean = pillarSwipeRefreshLayout.updateVisuals;
            z = true;
        } else {
            atomicBoolean = pillarSwipeRefreshLayout.updateVisuals;
            z = false;
        }
        atomicBoolean.set(z);
        pillarSwipeRefreshLayout.onRelationshipValidationResult();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(boolean z, PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = RatingCompat + 17;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        if (!z || !pillarSwipeRefreshLayout.prefetch) {
            pillarSwipeRefreshLayout.onRelationshipValidationResult();
        } else {
            int i5 = i3 + 87;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                pillarSwipeRefreshLayout.IAuthTabCallback(pillarSwipeRefreshLayout.access100());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            pillarSwipeRefreshLayout.IAuthTabCallback(pillarSwipeRefreshLayout.access100());
        }
        pillarSwipeRefreshLayout.updateVisuals.set(false);
        pillarSwipeRefreshLayout.invalidate();
        return Unit.INSTANCE;
    }

    static /* synthetic */ void onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, boolean z, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 57;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRefreshState");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        Object[] objArr = {pillarSwipeRefreshLayout, Boolean.valueOf(z), bool};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -307929154, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 307929167, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i5 = RatingCompat + 71;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        LottieAnimationView lottieAnimationView = pillarSwipeRefreshLayout.requestPostMessageChannelWithExtras;
        if (lottieAnimationView != null) {
            int i4 = RatingCompat + 123;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                lottieAnimationView.setAlpha(fFloatValue);
                int i5 = 31 / 0;
            } else {
                lottieAnimationView.setAlpha(fFloatValue);
            }
        }
        LottieAnimationView lottieAnimationView2 = pillarSwipeRefreshLayout.requestPostMessageChannelWithExtras;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setTranslationY(((1.0f - fFloatValue) * (-pillarSwipeRefreshLayout.IAuthTabCallbackStubProxy())) + pillarSwipeRefreshLayout.IEngagementSignalsCallbackDefault);
        }
        int i6 = AudioAttributesImplBaseParcelizer + 89;
        RatingCompat = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.uikit.widget.PillarSwipeRefreshLayout, java.lang.Object] */
    private static /* synthetic */ Object access100(Object[] objArr) {
        final float alpha;
        boolean z = false;
        final ?? r1 = (PillarSwipeRefreshLayout) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Boolean bool = (Boolean) objArr[2];
        int i = 2 % 2;
        if (zBooleanValue != ((PillarSwipeRefreshLayout) r1).prefetch) {
            if (zBooleanValue) {
                int i2 = RatingCompat + 81;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                if (((PillarSwipeRefreshLayout) r1).onVerticalScrollEvent || (bool != null && bool.booleanValue())) {
                    z = true;
                }
                ((PillarSwipeRefreshLayout) r1).onVerticalScrollEvent = z;
                if (z) {
                    onNavigationEvent(new Object[]{r1}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1312820109, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1312820090, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    isOneShot.onExtraCallbackWithResult((View) r1, noStore.Companion.asInterface());
                    ((PillarSwipeRefreshLayout) r1).IPostMessageService = 0.0f;
                    ((PillarSwipeRefreshLayout) r1).prefetch = true;
                    ((PillarSwipeRefreshLayout) r1).read.set(true);
                    return null;
                }
                ValueAnimator valueAnimator = ((PillarSwipeRefreshLayout) r1).onPostMessage;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                LottieAnimationView lottieAnimationView = ((PillarSwipeRefreshLayout) r1).requestPostMessageChannelWithExtras;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 29;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        PillarSwipeRefreshLayout.IAuthTabCallback(this.f$0, valueAnimator2);
                        if (i6 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                valueAnimatorOfFloat.setStartDelay(((PillarSwipeRefreshLayout) r1).requestPostMessageChannel);
                Intrinsics.checkNotNull(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addListener(new onExtraCallback());
                valueAnimatorOfFloat.start();
                ((PillarSwipeRefreshLayout) r1).onPostMessage = valueAnimatorOfFloat;
                return null;
            }
            if (((PillarSwipeRefreshLayout) r1).onVerticalScrollEvent || ((PillarSwipeRefreshLayout) r1).onSessionEnded > 0.0f) {
                r1.onActivityResized();
                ((PillarSwipeRefreshLayout) r1).onVerticalScrollEvent = false;
            }
            LottieAnimationView lottieAnimationView2 = ((PillarSwipeRefreshLayout) r1).requestPostMessageChannelWithExtras;
            if (lottieAnimationView2 != null) {
                int i4 = RatingCompat + 29;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    lottieAnimationView2.getAlpha();
                    throw null;
                }
                alpha = lottieAnimationView2.getAlpha();
            } else {
                alpha = 1.0f;
            }
            LottieAnimationView lottieAnimationView3 = ((PillarSwipeRefreshLayout) r1).requestPostMessageChannelWithExtras;
            final float translationY = lottieAnimationView3 != null ? lottieAnimationView3.getTranslationY() : 0.0f;
            ValueAnimator valueAnimator2 = ((PillarSwipeRefreshLayout) r1).onPostMessage;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                int i5 = RatingCompat + 115;
                AudioAttributesImplBaseParcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 23;
                    onNavigationEvent = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 != 0) {
                        PillarSwipeRefreshLayout.onExtraCallback(this.f$0, alpha, translationY, valueAnimator3);
                        throw null;
                    }
                    PillarSwipeRefreshLayout.onExtraCallback(this.f$0, alpha, translationY, valueAnimator3);
                    int i9 = onNavigationEvent + 43;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfFloat2);
            valueAnimatorOfFloat2.addListener(new asBinder());
            valueAnimatorOfFloat2.addListener(new asInterface());
            valueAnimatorOfFloat2.start();
            ((PillarSwipeRefreshLayout) r1).onPostMessage = valueAnimatorOfFloat2;
        }
        return null;
    }

    private static final void onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 85;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        LottieAnimationView lottieAnimationView = pillarSwipeRefreshLayout.requestPostMessageChannelWithExtras;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAlpha(f * fFloatValue);
        }
        LottieAnimationView lottieAnimationView2 = pillarSwipeRefreshLayout.requestPostMessageChannelWithExtras;
        if (lottieAnimationView2 != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 15;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            lottieAnimationView2.setTranslationY((f2 * fFloatValue) - (pillarSwipeRefreshLayout.IAuthTabCallbackStubProxy() * (1.0f - fFloatValue)));
            int i6 = RatingCompat + 37;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final void asInterface(float f) {
        float f2;
        float f3;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            f2 = f - this.ITrustedWebActivityServiceDefault;
            f3 = 0.0f;
        } else {
            f2 = f / this.ITrustedWebActivityServiceDefault;
            f3 = 1.0f;
        }
        float fMin = Math.min(f3, Math.abs(f2));
        asBinder(fMin);
        onTransact(fMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        boolean z;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 81;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            super/*android.view.View*/.onAttachedToWindow();
            z = true;
        } else {
            super/*android.view.View*/.onAttachedToWindow();
            z = false;
        }
        this.RemoteActionCompatParcelizer = z;
        getViewTreeObserver().addOnPreDrawListener(this.IEngagementSignalsCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.onPostMessage;
        if (valueAnimator != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 93;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            valueAnimator.cancel();
            int i4 = RatingCompat + 29;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        asInterface();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.IEngagementSignalsCallback);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.access100;
        Object obj = null;
        if (onGlobalLayoutListener != null) {
            int i6 = AudioAttributesImplBaseParcelizer + 69;
            RatingCompat = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            View view = this.extraCallbackWithResult;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        this.access100 = null;
        this.extraCallbackWithResult = null;
    }

    static /* synthetic */ void onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = RatingCompat + 49;
        int i5 = i4 % 128;
        AudioAttributesImplBaseParcelizer = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchTargetViewComposition");
        }
        int i6 = i5 + 69;
        RatingCompat = i6 % 128;
        if (i6 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = 0;
        }
        pillarSwipeRefreshLayout.IAuthTabCallback(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[PHI: r2
      0x0023: PHI (r2v2 android.view.View) = (r2v1 android.view.View), (r2v6 android.view.View) binds: [B:12:0x0021, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(int i) {
        View view;
        int i2 = 2 % 2;
        if (i <= 0 || this.IPostMessageService_Parcel) {
            onMessageChannelReady();
            return;
        }
        int i3 = RatingCompat;
        int i4 = i3 + 1;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            this.IPostMessageService_Parcel = false;
            view = this.cancelNotification;
            if (view != null) {
                int i5 = i3 + 45;
                AudioAttributesImplBaseParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    view.setTranslationY(0.0f);
                } else {
                    view.setTranslationY(0.0f);
                }
            }
        } else {
            this.IPostMessageService_Parcel = true;
            view = this.cancelNotification;
            if (view != null) {
            }
        }
        int i6 = this.ITrustedWebActivityCallbackStub + this.ITrustedWebActivityCallback + i;
        View view2 = this.cancelNotification;
        RecyclerView recyclerView = this.ITrustedWebActivityService;
        if (view2 != null) {
            int i7 = AudioAttributesImplBaseParcelizer;
            int i8 = i7 + 25;
            RatingCompat = i8 % 128;
            int i9 = i8 % 2;
            if (recyclerView == null) {
                view2.setPadding(view2.getPaddingLeft(), i6, view2.getPaddingRight(), view2.getPaddingBottom());
                int i10 = AudioAttributesImplBaseParcelizer + 27;
                RatingCompat = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 4;
                    return;
                }
                return;
            }
            int i12 = i7 + 101;
            RatingCompat = i12 % 128;
            int i13 = i12 % 2;
            view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
            if (recyclerView instanceof RecyclerView) {
                RecyclerView recyclerView2 = recyclerView;
                recyclerView2.stopScroll();
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.scrollToPosition(0);
                }
            } else if (recyclerView instanceof ScrollView) {
                int i14 = RatingCompat + 19;
                AudioAttributesImplBaseParcelizer = i14 % 128;
                int i15 = i14 % 2;
                ScrollView scrollView = (ScrollView) recyclerView;
                scrollView.scrollTo(0, 0);
                scrollView.smoothScrollBy(0, 0);
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i6, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        }
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        if (this.IPostMessageService_Parcel) {
            this.IPostMessageService_Parcel = false;
            View view = this.cancelNotification;
            if (view != null) {
                int i2 = AudioAttributesImplBaseParcelizer + 77;
                RatingCompat = i2 % 128;
                if (i2 % 2 != 0) {
                    view.setTranslationY(0.0f);
                } else {
                    view.setTranslationY(0.0f);
                }
                int i3 = RatingCompat + 97;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
            }
            View view2 = this.cancelNotification;
            if (view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), this.ITrustedWebActivityCallbackStub, view2.getPaddingRight(), view2.getPaddingBottom());
            }
            View view3 = this.ITrustedWebActivityService;
            if (view3 != null) {
                view3.setPadding(view3.getPaddingLeft(), this.ITrustedWebActivityCallback, view3.getPaddingRight(), view3.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 67;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        LottieAnimationView lottieAnimationView = this.onMinimized;
        if (lottieAnimationView != null) {
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                lottieAnimationView.setVisibility(0);
                if (!lottieAnimationView.isAnimating()) {
                    int i6 = RatingCompat + 105;
                    AudioAttributesImplBaseParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    lottieAnimationView.playAnimation();
                }
            } else {
                lottieAnimationView.setVisibility(0);
                if (!lottieAnimationView.isAnimating()) {
                }
            }
        }
        int i8 = RatingCompat + 15;
        AudioAttributesImplBaseParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private final void asBinder(float f) {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
        if (fCoerceIn > 0.0f) {
            LottieAnimationView lottieAnimationView = this.onMinimized;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
                if (!lottieAnimationView.isAnimating()) {
                    lottieAnimationView.playAnimation();
                }
                access000(this.onSessionEnded);
                float fFloatValue = deprecated_immutable.onWarmupCompleted(Float.valueOf(fCoerceIn), new Number[]{0, 1}, new Number[]{fValueOf, fValueOf2}).floatValue();
                this.onActivityResized = fFloatValue;
                lottieAnimationView.setAlpha(fFloatValue);
                lottieAnimationView.setScaleX(deprecated_immutable.onWarmupCompleted(Float.valueOf(fCoerceIn), new Number[]{0, 1}, new Number[]{fValueOf, fValueOf2}).floatValue());
                lottieAnimationView.setScaleY(deprecated_immutable.onWarmupCompleted(Float.valueOf(fCoerceIn), new Number[]{0, 1}, new Number[]{fValueOf, fValueOf2}).floatValue());
                int i2 = RatingCompat + 53;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            return;
        }
        int i4 = RatingCompat + 31;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        onRelationshipValidationResult();
    }

    private final void access000(float f) {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        LottieAnimationView lottieAnimationView = this.onMinimized;
        if (lottieAnimationView != null) {
            lottieAnimationView.setTranslationY(onExtraCallback(f));
        }
        int i3 = RatingCompat + 13;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final float onExtraCallback(float f) {
        float fMin;
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            fMin = (this.IEngagementSignalsCallbackDefault * (Math.min(RangesKt___RangesKt.coerceAtLeast(f, 0.0f), this.ITrustedWebActivityServiceDefault) + 1.0f)) % (IAuthTabCallback_Parcel() % 1.0f);
        } else {
            fMin = (this.IEngagementSignalsCallbackDefault + (Math.min(RangesKt___RangesKt.coerceAtLeast(f, 0.0f), this.ITrustedWebActivityServiceDefault) / 2.0f)) - (IAuthTabCallback_Parcel() / 2.0f);
        }
        int i3 = RatingCompat + 77;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return fMin;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r9 > 2.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onTransact(float f) {
        Float fValueOf;
        Float fValueOf2;
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(0.0f);
            Float fValueOf3 = Float.valueOf(1.0f);
            if (f <= 1.0f) {
                fValueOf2 = fValueOf3;
                IAuthTabCallback(deprecated_immutable.onWarmupCompleted(Float.valueOf(f), new Number[]{fValueOf, fValueOf2}, new Number[]{fValueOf2, Float.valueOf(0.92f)}).floatValue(), deprecated_immutable.onWarmupCompleted(Float.valueOf(f), new Number[]{fValueOf, fValueOf2}, new Number[]{fValueOf2, Float.valueOf(0.4f)}).floatValue());
                return;
            }
            int i3 = RatingCompat + 119;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        fValueOf = Float.valueOf(2.0f);
        fValueOf2 = Float.valueOf(1.0f);
    }

    private final void onExtraCallbackWithResult() {
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        Rally rally = this.ITrustedWebActivityCallbackDefault;
        if (rally != null && rally.postMessage()) {
            int i2 = AudioAttributesImplBaseParcelizer;
            int i3 = i2 + 97;
            RatingCompat = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Rally rally2 = this.ITrustedWebActivityCallbackDefault;
            if (rally2 != null) {
                int i4 = i2 + 5;
                RatingCompat = i4 % 128;
                int i5 = i4 % 2;
                rally2.ICustomTabsServiceStub();
                int i6 = RatingCompat + 15;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Rally rally3 = this.ITrustedWebActivityCallbackStubProxy;
        if (rally3 != null && rally3.postMessage()) {
            int i8 = RatingCompat + 13;
            int i9 = i8 % 128;
            AudioAttributesImplBaseParcelizer = i9;
            int i10 = i8 % 2;
            Rally rally4 = this.ITrustedWebActivityCallbackStubProxy;
            if (rally4 != null) {
                int i11 = i9 + 91;
                RatingCompat = i11 % 128;
                int i12 = i11 % 2;
                rally4.ICustomTabsServiceStub();
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onMessageChannelReady;
        if (runonuithreaddelayed2 != null && runonuithreaddelayed2.postMessage() && (runonuithreaddelayed = this.onMessageChannelReady) != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        onRelationshipValidationResult();
        TdsImageView tdsImageView = this.IEngagementSignalsCallbackStubProxy;
        if (tdsImageView != null) {
            int i13 = RatingCompat + 13;
            AudioAttributesImplBaseParcelizer = i13 % 128;
            int i14 = i13 % 2;
            tdsImageView.setVisibility(8);
        }
        View view = this.IPostMessageServiceStub;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        Rally rally = this.ITrustedWebActivityCallbackDefault;
        Object obj = null;
        if (rally != null) {
            int i2 = RatingCompat + 119;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0 ? rally.postMessage() : !rally.postMessage()) {
                int i3 = AudioAttributesImplBaseParcelizer;
                int i4 = i3 + 83;
                RatingCompat = i4 % 128;
                int i5 = i4 % 2;
                Rally rally2 = this.ITrustedWebActivityCallbackDefault;
                if (rally2 != null) {
                    int i6 = i3 + 97;
                    RatingCompat = i6 % 128;
                    if (i6 % 2 != 0) {
                        rally2.updateVisuals();
                        obj.hashCode();
                        throw null;
                    }
                    rally2.updateVisuals();
                }
            }
        }
        Rally rally3 = this.ITrustedWebActivityCallbackStubProxy;
        if (rally3 != null && rally3.postMessage()) {
            int i7 = AudioAttributesImplBaseParcelizer + 79;
            RatingCompat = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            Rally rally4 = this.ITrustedWebActivityCallbackStubProxy;
            if (rally4 != null) {
                rally4.updateVisuals();
                int i8 = RatingCompat + 35;
                AudioAttributesImplBaseParcelizer = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onMessageChannelReady;
        if (runonuithreaddelayed != null) {
            int i10 = AudioAttributesImplBaseParcelizer + 125;
            RatingCompat = i10 % 128;
            int i11 = i10 % 2;
            if (runonuithreaddelayed.postMessage()) {
                int i12 = AudioAttributesImplBaseParcelizer + 111;
                RatingCompat = i12 % 128;
                if (i12 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                runOnUiThreadDelayed runonuithreaddelayed2 = this.onMessageChannelReady;
                if (runonuithreaddelayed2 != null) {
                    runonuithreaddelayed2.IAuthTabCallback();
                }
            }
        }
    }

    private final void getInterfaceDescriptor(float f) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 67;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        if (f != 0.0f && this.ICustomTabsCallbackStubProxy == 0.0f) {
            this.ICustomTabsCallbackStubProxy = f;
            int i5 = i2 + 15;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
        }
        float f2 = this.ICustomTabsCallbackStubProxy;
        float f3 = f - f2;
        float f4 = this.ITrustedWebActivityService_Parcel;
        if (f3 > f4 && !this.isEngagementSignalsApiAvailable) {
            this.onRelationshipValidationResult = f2 + f4;
            this.isEngagementSignalsApiAvailable = true;
        }
        int i7 = RatingCompat + 39;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1 > r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r1 > r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r9.ICustomTabsCallback_Parcel = true;
        r9.ICustomTabsService = true;
        r9.isEngagementSignalsApiAvailable = false;
        r9.mayLaunchUrl = false;
        r6 = r6 + 81;
        im.toss.uikit.widget.PillarSwipeRefreshLayout.RatingCompat = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if ((r6 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            motionEvent.getActionMasked();
            obj.hashCode();
            throw null;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.onUnminimized = motionEvent.getX();
            this.ICustomTabsCallbackStubProxy = motionEvent.getY();
            this.ICustomTabsCallback_Parcel = false;
            this.ICustomTabsService = false;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.ICustomTabsService) {
                    return;
                }
                float fAbs = Math.abs(motionEvent.getX() - this.onUnminimized);
                float fAbs2 = Math.abs(motionEvent.getY() - this.ICustomTabsCallbackStubProxy);
                float f = this.ITrustedWebActivityService_Parcel;
                if (fAbs > f) {
                    int i3 = AudioAttributesImplBaseParcelizer;
                    int i4 = i3 + 77;
                    RatingCompat = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 58 / 0;
                    }
                }
                if (fAbs2 <= f || fAbs2 <= fAbs) {
                    return;
                }
                int i6 = AudioAttributesImplBaseParcelizer + 103;
                RatingCompat = i6 % 128;
                if (i6 % 2 != 0) {
                    this.ICustomTabsService = false;
                    return;
                } else {
                    this.ICustomTabsService = true;
                    return;
                }
            }
            if (actionMasked != 3) {
                return;
            }
        }
        onPostMessage();
        int i7 = RatingCompat + 111;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 43;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallback_Parcel = false;
        this.ICustomTabsService = false;
        int i5 = i2 + 109;
        RatingCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(MotionEvent motionEvent) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 71;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.IAuthTabCallback_Parcel) {
            if (actionIndex == 0) {
                int i5 = AudioAttributesImplBaseParcelizer + 123;
                RatingCompat = i5 % 128;
                int i6 = i5 % 2;
                i = 1;
            } else {
                i = 0;
            }
            this.IAuthTabCallback_Parcel = motionEvent.getPointerId(i);
        }
        int i7 = AudioAttributesImplBaseParcelizer + 79;
        RatingCompat = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() throws Throwable {
        View decorView;
        Window window;
        int i = 2 % 2;
        super/*android.view.View*/.onFinishInflate();
        if (this.newAuthTabSession) {
            return;
        }
        this.newAuthTabSession = true;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        Object obj = null;
        if (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) {
            decorView = null;
        } else {
            int i2 = AudioAttributesImplBaseParcelizer + 75;
            RatingCompat = i2 % 128;
            if (i2 % 2 != 0) {
                decorView = window.getDecorView();
                int i3 = 84 / 0;
            } else {
                decorView = window.getDecorView();
            }
            int i4 = RatingCompat + 43;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        boolean zBooleanValue = ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
        Class cls = Integer.TYPE;
        if (!zBooleanValue) {
            View view = new View(getContext());
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            layoutParams.width = (int) ICustomTabsCallback();
            layoutParams.height = (int) ICustomTabsCallback();
            view.setLayoutParams(layoutParams);
            view.setVisibility(8);
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            view.setBackground(new maxAgeSeconds(new int[]{new getUrlokhttp(new onWarmupCompleted(configuration)).isEngagementSignalsApiAvailable(), 0}, new float[]{0.0f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null));
            view.setX((readTypedObject() / 4.0f) - (ICustomTabsCallback() / 2.0f));
            this.IPostMessageServiceStub = view;
            if (viewGroup != null) {
                int i6 = RatingCompat + 89;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                if (i6 % 2 == 0) {
                    viewGroup.addView(view);
                    obj.hashCode();
                    throw null;
                }
                viewGroup.addView(view);
            }
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams2);
        layoutParams2.width = readTypedObject();
        layoutParams2.height = readTypedObject();
        tdsImageView.setLayoutParams(layoutParams2);
        tdsImageView.setVisibility(8);
        Object[] objArr = new Object[1];
        a((short) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) - 475061978, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 933986209, (-110) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        tdsImageView.setX((-readTypedObject()) / 4.0f);
        this.IEngagementSignalsCallbackStubProxy = tdsImageView;
        if (viewGroup != null) {
            viewGroup.addView(tdsImageView);
            int i7 = RatingCompat + 19;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        lottieAnimationView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        layoutParams3.width = IAuthTabCallback_Parcel();
        layoutParams3.height = IAuthTabCallback_Parcel();
        lottieAnimationView.setLayoutParams(layoutParams3);
        lottieAnimationView.setAnimationFromUrl(this.IEngagementSignalsCallbackStub);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, lottieAnimationView);
        this.onMinimized = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(getContext());
        lottieAnimationView2.setVisibility(8);
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) - 475061924, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 933986210, (-111) - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr2);
        lottieAnimationView2.setAnimationFromUrl(((String) objArr2[0]).intern());
        lottieAnimationView2.setRepeatMode(1);
        lottieAnimationView2.setRepeatCount(-1);
        lottieAnimationView2.playAnimation();
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView2);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, lottieAnimationView2);
        this.requestPostMessageChannelWithExtras = lottieAnimationView2;
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 97;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 20871;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1000;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 123;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 63;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            i = 112;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            i = 50;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        TdsImageView tdsImageView = (TdsImageView) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        tdsImageView.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 87;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = PillarSwipeRefreshLayout.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback_Parcel;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            int i3 = onWarmupCompleted + 41;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallback_Parcel) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 107;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback_Parcel = PillarSwipeRefreshLayout.IAuthTabCallback_Parcel(PillarSwipeRefreshLayout.this);
            if (runonuithreaddelayedIAuthTabCallback_Parcel != null) {
                int i4 = onNavigationEvent + 3;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0 ? runonuithreaddelayedIAuthTabCallback_Parcel.postMessage() : runonuithreaddelayedIAuthTabCallback_Parcel.postMessage()) {
                    int i5 = onWarmupCompleted + 47;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    isOneShot.onExtraCallbackWithResult(PillarSwipeRefreshLayout.this, noStore.Companion.asInterface());
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsImageView tdsImageView, PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        tdsImageView.setVisibility(0);
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(pillarSwipeRefreshLayout);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 67;
            RatingCompat = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                obj.hashCode();
                throw null;
            }
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, pillarSwipeRefreshLayout.new IAuthTabCallback_Parcel(null), 3, null);
                int i3 = AudioAttributesImplBaseParcelizer + 87;
                RatingCompat = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 5;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(TdsImageView tdsImageView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        tdsImageView.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat + 33;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(TdsImageView tdsImageView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        tdsImageView.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat + 85;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(View view) {
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        view.setVisibility(i2 % 2 == 0 ? 1 : 0);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 7;
        RatingCompat = i2 % 128;
        view.setVisibility(i2 % 2 != 0 ? 54 : 8);
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(View view) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 115;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(f * f3)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        pillarSwipeRefreshLayout.access000(f2 * f3);
        pillarSwipeRefreshLayout.invalidate();
        Unit unit = Unit.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 83;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 47;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(f * f2)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        } else {
            Object[] objArr2 = {pillarSwipeRefreshLayout, Float.valueOf(f * f2)};
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        }
        pillarSwipeRefreshLayout.invalidate();
        Unit unit = Unit.INSTANCE;
        int i3 = RatingCompat + 77;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x02ec  */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r40v11 */
    /* JADX WARN: Type inference failed for: r40v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityResized() {
        float f;
        ?? r40;
        float f2;
        int i;
        ArrayList arrayList;
        Float f3;
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (this.newSession) {
            int i5 = RatingCompat + 65;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            runOnUiThreadDelayed runonuithreaddelayed = this.onMessageChannelReady;
            if (runonuithreaddelayed != null && runonuithreaddelayed.postMessage()) {
                return;
            }
        }
        this.updateVisuals.set(true);
        this.RemoteActionCompatParcelizer = true;
        onExtraCallbackWithResult();
        ArrayList arrayList2 = new ArrayList();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i7 = AudioAttributesImplBaseParcelizer + 21;
            RatingCompat = i7 % 128;
            int i8 = i7 % 2;
            f = 0.06f;
        } else {
            f = 0.8f;
        }
        final float f4 = this.onSessionEnded;
        float f5 = this.IPostMessageService;
        if (this.IPostMessageServiceStubProxy) {
            int i9 = RatingCompat + 113;
            AudioAttributesImplBaseParcelizer = i9 % 128;
            int i10 = i9 % 2;
            final TdsImageView tdsImageView = this.IEngagementSignalsCallbackStubProxy;
            if (tdsImageView != null) {
                arrayList2.add(Rally.onTransact(Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), Float.valueOf(0.5f), Float.valueOf(2.5f), new Function1() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 111;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitIAuthTabCallback = PillarSwipeRefreshLayout.IAuthTabCallback((attachAppLovinSdk) obj2);
                        int i14 = onExtraCallback + 31;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                }), fValueOf, Float.valueOf(f), new Function1() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda19
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 53;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnExtraCallback = PillarSwipeRefreshLayout.onExtraCallback((attachAppLovinSdk) obj2);
                        int i14 = onWarmupCompleted + 65;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda20
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 11;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnExtraCallbackWithResult = PillarSwipeRefreshLayout.onExtraCallbackWithResult(tdsImageView);
                        int i14 = onWarmupCompleted + 5;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda21
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 111;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        TdsImageView tdsImageView2 = tdsImageView;
                        if (i13 == 0) {
                            return PillarSwipeRefreshLayout.onWarmupCompleted(tdsImageView2, this);
                        }
                        PillarSwipeRefreshLayout.onWarmupCompleted(tdsImageView2, this);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null));
                z = false;
                obj = null;
                i3 = 300;
                f2 = f5;
                Object[] objArr = {Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 700), Float.valueOf(f), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 300, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda22
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 71;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            Object[] objArr2 = {tdsImageView};
                            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                            unit = (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1778541825, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1778541803, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                            int i13 = 95 / 0;
                        } else {
                            Object[] objArr3 = {tdsImageView};
                            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                            unit = (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1778541825, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1778541803, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
                        }
                        int i14 = onWarmupCompleted + 97;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        return unit;
                    }
                }, 1, (Object) null), null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda23
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 31;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            PillarSwipeRefreshLayout.IAuthTabCallback(tdsImageView);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = PillarSwipeRefreshLayout.IAuthTabCallback(tdsImageView);
                        int i13 = onExtraCallback + 47;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        return unitIAuthTabCallback;
                    }
                }, 1, null};
                arrayList2.add((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226));
            } else {
                z = false;
                obj = null;
                f2 = f5;
                i3 = 300;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                int i11 = RatingCompat + 119;
                AudioAttributesImplBaseParcelizer = i11 % 128;
                int i12 = i11 % 2;
                final View view = this.IPostMessageServiceStub;
                if (view != null) {
                    Address address = Address.onNavigationEvent;
                    i = i3;
                    arrayList2.add(Rally.onTransact(Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asInterface(), i), fValueOf, Float.valueOf(0.6f), (Function1) null, 4, (Object) null), Integer.valueOf(z ? 1 : 0), null, Integer.valueOf(z ? 1 : 0), null, null, null, Integer.valueOf(z ? 1 : 0), 0L, Boolean.valueOf(z), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), obj, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda24
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 11;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            View view2 = view;
                            if (i15 == 0) {
                                return PillarSwipeRefreshLayout.onNavigationEvent(view2);
                            }
                            PillarSwipeRefreshLayout.onNavigationEvent(view2);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, 1, obj), obj, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda25
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 63;
                            onNavigationEvent = i14 % 128;
                            if (i14 % 2 == 0) {
                                PillarSwipeRefreshLayout.IAuthTabCallback(view);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unitIAuthTabCallback = PillarSwipeRefreshLayout.IAuthTabCallback(view);
                            int i15 = IAuthTabCallback + 13;
                            onNavigationEvent = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 15 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    }, 1, obj));
                    Object[] objArr2 = {Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asInterface(), 700), Float.valueOf(0.6f), fValueOf, (Function1) null, 4, (Object) null), Integer.valueOf(z ? 1 : 0), null, Integer.valueOf(z ? 1 : 0), null, null, null, Integer.valueOf(i), 0L, Boolean.valueOf(z), 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), obj, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda26
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = onWarmupCompleted + 71;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr3 = {view};
                            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                            Unit unit = (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2132440158, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2132440152, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                            int i16 = onExtraCallbackWithResult + 71;
                            onWarmupCompleted = i16 % 128;
                            int i17 = i16 % 2;
                            return unit;
                        }
                    }, 1, obj), obj, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda27
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 31;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitOnExtraCallback = PillarSwipeRefreshLayout.onExtraCallback(view);
                            int i16 = IAuthTabCallback + 29;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            return unitOnExtraCallback;
                        }
                    }, 1, obj};
                    arrayList2.add((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr2, 2128644226));
                    r40 = z;
                } else {
                    i = i3;
                    r40 = z;
                }
            }
        } else {
            r40 = 0;
            f2 = f5;
            i = 300;
            this.IPostMessageServiceStub = null;
            this.IEngagementSignalsCallbackStubProxy = null;
        }
        LottieAnimationView lottieAnimationView = this.onMinimized;
        if (lottieAnimationView != null) {
            Intrinsics.checkNotNull(lottieAnimationView);
            final float f6 = f4 + f2;
            arrayList2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.onNavigationEvent(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.3f), (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda14
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnNavigationEvent = PillarSwipeRefreshLayout.onNavigationEvent(this.f$0, f4, f6, ((Float) obj2).floatValue());
                    int i16 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 58 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf((int) r40), null, Integer.valueOf((int) r40), null, null, null, Integer.valueOf((int) r40), 0L, Boolean.valueOf((boolean) r40), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            arrayList = arrayList2;
            f3 = fValueOf2;
            i2 = 1;
        } else {
            arrayList = arrayList2;
            f3 = fValueOf2;
            i2 = 1;
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), i), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr3 = {this.f$0, Float.valueOf(f4), Float.valueOf(((Float) obj2).floatValue())};
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    Unit unit = (Unit) PillarSwipeRefreshLayout.onNavigationEvent(objArr3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541231678, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541231670, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                    int i16 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    return unit;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf((int) r40), null, Integer.valueOf((int) r40), null, null, null, Integer.valueOf((int) r40), 0L, Boolean.valueOf((boolean) r40), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        }
        Iterator<T> it = this.writeTypedObject.iterator();
        while (it.hasNext()) {
            int i13 = AudioAttributesImplBaseParcelizer + 41;
            RatingCompat = i13 % 128;
            if (i13 % 2 != 0) {
                boolean z2 = ((View) it.next()) instanceof ViewGroup;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            View view2 = (View) it.next();
            if (((view2 instanceof ViewGroup ? 1 : 0) ^ i2) != 0) {
                Float f7 = f3;
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onNavigationEvent(isMuted.asBinder(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 300), (Float) null, f7, (Function1) null, 5, (Object) null), (Float) null, f7, (Function1) null, 5, (Object) null), Integer.valueOf((int) r40), null, Integer.valueOf((int) r40), null, null, null, 200, 0L, Boolean.valueOf((boolean) r40), 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            } else {
                Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) view2).IAuthTabCallback();
                int i14 = RatingCompat + 5;
                AudioAttributesImplBaseParcelizer = i14 % 128;
                int i15 = 2;
                int i16 = i14 % 2;
                while (itIAuthTabCallback.hasNext()) {
                    int i17 = AudioAttributesImplBaseParcelizer + 35;
                    RatingCompat = i17 % 128;
                    int i18 = i17 % i15;
                    Float f8 = f3;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) itIAuthTabCallback.next(), isMuted.onNavigationEvent(isMuted.asBinder(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 300), (Float) null, f8, (Function1) null, 5, (Object) null), (Float) null, f8, (Function1) null, 5, (Object) null), Integer.valueOf((int) r40), null, Integer.valueOf((int) r40), null, null, null, 200, 0L, Boolean.valueOf((boolean) r40), 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    i15 = 2;
                }
                int i19 = AudioAttributesImplBaseParcelizer + 77;
                RatingCompat = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(isMuted.asBinder(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 300), (Float) null, f3, (Function1) null, 5, (Object) null), (Float) null, f3, (Function1) null, 5, (Object) null);
        Object[] objArr3 = new Object[13];
        boolean z3 = r40;
        objArr3[z3 ? 1 : 0] = this;
        objArr3[i2] = appLovinSdkSettingsOnNavigationEvent;
        objArr3[2] = Integer.valueOf(z3 ? 1 : 0);
        objArr3[3] = null;
        objArr3[4] = Integer.valueOf(z3 ? 1 : 0);
        objArr3[5] = null;
        objArr3[6] = null;
        objArr3[7] = null;
        objArr3[8] = 200;
        objArr3[9] = 0L;
        objArr3[10] = Boolean.valueOf(z3);
        objArr3[11] = 1788;
        objArr3[12] = null;
        arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr3, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onMessageChannelReady;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
        }
        this.onMessageChannelReady = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.onExtraCallback(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = 2 % 2;
                int i22 = onNavigationEvent + 25;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                Unit unitAsBinder = PillarSwipeRefreshLayout.asBinder(this.f$0);
                int i24 = onNavigationEvent + 105;
                IAuthTabCallback = i24 % 128;
                int i25 = i24 % 2;
                return unitAsBinder;
            }
        }, i2, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = 2 % 2;
                int i22 = onWarmupCompleted + 95;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                Unit unitIAuthTabCallbackStub = PillarSwipeRefreshLayout.IAuthTabCallbackStub(this.f$0);
                int i24 = onExtraCallback + 65;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                return unitIAuthTabCallbackStub;
            }
        }, i2, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = 2 % 2;
                int i22 = onExtraCallback + 61;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout = this.f$0;
                if (i23 != 0) {
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    return (Unit) PillarSwipeRefreshLayout.onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1112302679, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1112302676, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                }
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }, i2, (Object) null), z3, i2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallbackDefault(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 111;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        pillarSwipeRefreshLayout.onRelationshipValidationResult();
        pillarSwipeRefreshLayout.requestDisallowInterceptTouchEvent(false);
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        pillarSwipeRefreshLayout.extraCallback();
        Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(0.0f)};
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2142767486, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2142767477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3);
        Object[] objArr2 = {pillarSwipeRefreshLayout, Float.valueOf(0.0f)};
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((Float) onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4)).floatValue();
        pillarSwipeRefreshLayout.onUnminimized();
        pillarSwipeRefreshLayout.invalidate();
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat + 93;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onUnminimized(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 31;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        pillarSwipeRefreshLayout.onRelationshipValidationResult();
        pillarSwipeRefreshLayout.requestDisallowInterceptTouchEvent(false);
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        pillarSwipeRefreshLayout.extraCallback();
        Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(0.0f)};
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2142767486, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2142767477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3);
        Object[] objArr2 = {pillarSwipeRefreshLayout, Float.valueOf(0.0f)};
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((Float) onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4)).floatValue();
        pillarSwipeRefreshLayout.invalidate();
        pillarSwipeRefreshLayout.onUnminimized();
        Unit unit = Unit.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 41;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (onExtraCallback() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r3 = im.toss.uikit.widget.PillarSwipeRefreshLayout.RatingCompat + 59;
        im.toss.uikit.widget.PillarSwipeRefreshLayout.AudioAttributesImplBaseParcelizer = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (onExtraCallback() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(@NotNull View view, float f, float f2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!this.ITrustedWebActivityServiceStub) {
            return super.onNestedFling(view, f, f2, z);
        }
        int i2 = AudioAttributesImplBaseParcelizer + 81;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            access000 access000Var = (access000) create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return access000Var.invokeSuspend(Unit.INSTANCE);
            }
            access000Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = PillarSwipeRefreshLayout.this.new access000(access13800Var);
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg2, access13800Var2);
                int i3 = 26 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg2, access13800Var2);
            }
            int i4 = onWarmupCompleted + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnExtraCallback) {
                    int i6 = onWarmupCompleted + 21;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnExtraCallback;
                }
            }
            Object[] objArr = {PillarSwipeRefreshLayout.this, false};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1801317393, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1801317413, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onUnminimized() {
        findResAndMsg findresandmsg;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                findResAndMsg findresandmsgOnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                int i3 = AudioAttributesImplBaseParcelizer + 79;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
                findresandmsg = findresandmsgOnNavigationEvent;
            } else {
                findresandmsg = null;
            }
            if (findresandmsg != null) {
                onLoadStarted.onExtraCallback(findresandmsg, null, null, new access000(null), 3, null);
                return;
            } else {
                this.RemoteActionCompatParcelizer = false;
                return;
            }
        }
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackDefault(float f) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 13;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this, Float.valueOf(f)};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            invalidate();
            int i3 = 31 / 0;
        } else {
            Object[] objArr2 = {this, Float.valueOf(f)};
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
            invalidate();
        }
        int i4 = RatingCompat + 97;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault extends RecyclerView.OnScrollListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackDefault() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            PillarSwipeRefreshLayout.onWarmupCompleted(PillarSwipeRefreshLayout.this, recyclerView.computeVerticalScrollOffset());
            if (PillarSwipeRefreshLayout.readTypedObject(PillarSwipeRefreshLayout.this).get()) {
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout = PillarSwipeRefreshLayout.this;
                PillarSwipeRefreshLayout.IAuthTabCallback(pillarSwipeRefreshLayout, -PillarSwipeRefreshLayout.access100(pillarSwipeRefreshLayout));
                int i6 = onNavigationEvent + 69;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static final void onWarmupCompleted(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = RatingCompat + 25;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
        pillarSwipeRefreshLayout.ICustomTabsServiceStub = i2;
        Object obj = null;
        if (!(!pillarSwipeRefreshLayout.read.get())) {
            int i8 = RatingCompat + Imgproc.COLOR_YUV2RGB_YVYU;
            AudioAttributesImplBaseParcelizer = i8 % 128;
            if (i8 % 2 == 0) {
                ((Float) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout, Float.valueOf(-pillarSwipeRefreshLayout.ICustomTabsServiceStub)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
                obj.hashCode();
                throw null;
            }
            ((Float) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout, Float.valueOf(-pillarSwipeRefreshLayout.ICustomTabsServiceStub)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
        }
        int i9 = RatingCompat + 125;
        AudioAttributesImplBaseParcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public final void setTargetView(@NotNull View view, @NotNull View view2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 85;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        this.cancelNotification = view;
        onExtraCallbackWithResult(view2);
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1312820109, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1312820090, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        View view3 = this.cancelNotification;
        Object obj = null;
        ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
        if (viewGroup != null) {
            int i4 = RatingCompat + 3;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.setClipToPadding(false);
        }
        View view4 = this.ITrustedWebActivityService;
        ViewGroup viewGroup2 = !((view4 instanceof ViewGroup) ^ true) ? (ViewGroup) view4 : null;
        if (viewGroup2 != null) {
            int i6 = RatingCompat + 41;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                viewGroup2.setClipToPadding(false);
            } else {
                viewGroup2.setClipToPadding(false);
            }
        }
        if (view2 instanceof RecyclerView) {
            ((RecyclerView) view2).addOnScrollListener(new IAuthTabCallbackDefault());
            this.validateRelationship = true;
        } else {
            if (!(view2 instanceof ScrollView)) {
                this.validateRelationship = false;
                return;
            }
            view2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: im.toss.uikit.widget.PillarSwipeRefreshLayout$$ExternalSyntheticLambda12
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view5, int i7, int i8, int i9, int i10) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallbackWithResult + 31;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        Object[] objArr = {this.f$0, view5, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)};
                        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                        PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 449408757, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -449408755, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
                        return;
                    }
                    Object[] objArr2 = {this.f$0, view5, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)};
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    PillarSwipeRefreshLayout.onNavigationEvent(objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 449408757, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -449408755, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
                    throw null;
                }
            });
            this.validateRelationship = true;
            int i7 = AudioAttributesImplBaseParcelizer + 99;
            RatingCompat = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void setTopOffsetView$default(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RatingCompat;
        int i4 = i3 + 99;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTopOffsetView");
        }
        int i6 = i3 + 57;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
        if ((i & 2) != 0) {
            z = false;
        }
        pillarSwipeRefreshLayout.setTopOffsetView(view, z);
    }

    public final void setTopOffsetView(@NotNull View view, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 81;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            i = 0;
        }
        setTopOffsetView(view, z, i);
    }

    private final void onExtraCallbackWithResult(View view, boolean z) {
        int measuredHeight;
        int i = 2 % 2;
        view.getLocationOnScreen(this.ICustomTabsServiceDefault);
        int i2 = this.ICustomTabsServiceDefault[1];
        int measuredHeight2 = view.getMeasuredHeight();
        onNavigationEvent(i2 + measuredHeight2 + this.getSmallIconBitmap + this.notifyNotificationWithChannel);
        if (z) {
            int i3 = AudioAttributesImplBaseParcelizer + 109;
            RatingCompat = i3 % 128;
            if (i3 % 2 != 0) {
                view.getMeasuredHeight();
                throw null;
            }
            measuredHeight = view.getMeasuredHeight();
            int i4 = AudioAttributesImplBaseParcelizer + 41;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
        } else {
            measuredHeight = 0;
        }
        this.IEngagementSignalsCallbackDefault = measuredHeight + this.notifyNotificationWithChannel;
    }

    public final void setCoordinateViews(@NotNull View... viewArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 27;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewArr, "");
            List<View> list = this.writeTypedObject;
            list.clear();
            CollectionsKt__MutableCollectionsKt.addAll(list, viewArr);
            throw null;
        }
        Intrinsics.checkNotNullParameter(viewArr, "");
        List<View> list2 = this.writeTypedObject;
        list2.clear();
        CollectionsKt__MutableCollectionsKt.addAll(list2, viewArr);
        int i3 = AudioAttributesImplBaseParcelizer + 125;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        pillarSwipeRefreshLayout.updateVisuals.set(false);
        pillarSwipeRefreshLayout.prefetch = false;
        pillarSwipeRefreshLayout.isEngagementSignalsApiAvailable = false;
        pillarSwipeRefreshLayout.onVerticalScrollEvent = false;
        pillarSwipeRefreshLayout.onRelationshipValidationResult = 0.0f;
        pillarSwipeRefreshLayout.ICustomTabsCallbackStubProxy = 0.0f;
        int i4 = AudioAttributesImplBaseParcelizer + 75;
        RatingCompat = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + Imgproc.COLOR_YUV2RGB_YVYU;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            pillarSwipeRefreshLayout.IPostMessageService = 2.0f;
            pillarSwipeRefreshLayout.extraCommand = false;
            pillarSwipeRefreshLayout.readTypedObject = 1.0f;
            pillarSwipeRefreshLayout.getActiveNotifications = 1.0f;
            pillarSwipeRefreshLayout.ICustomTabsCallbackStub = -9999.0f;
        } else {
            pillarSwipeRefreshLayout.IPostMessageService = 0.0f;
            pillarSwipeRefreshLayout.extraCommand = false;
            pillarSwipeRefreshLayout.readTypedObject = 0.0f;
            pillarSwipeRefreshLayout.getActiveNotifications = 0.0f;
            pillarSwipeRefreshLayout.ICustomTabsCallbackStub = -9999.0f;
        }
        pillarSwipeRefreshLayout.read.set(false);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgressViewOffset(boolean z, int i, int i2) {
        int interfaceDescriptor;
        int i3 = 2 % 2;
        if (!this.ITrustedWebActivityServiceStub) {
            int i4 = RatingCompat + 41;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                super.setProgressViewOffset(z, i, i2);
                return;
            }
            super.setProgressViewOffset(z, i, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.getSmallIconBitmap = i + onWarmupCompleted();
        View view = this.ICustomTabsService_Parcel;
        if (view == null) {
            getLocationOnScreen(this.ICustomTabsServiceDefault);
            int i5 = this.ICustomTabsServiceDefault[1];
            int i6 = this.getSmallIconBitmap;
            View view2 = this.ITrustedWebActivityService;
            onNavigationEvent(i5 + i6 + (view2 != null ? view2.getPaddingTop() : 0));
            this.IEngagementSignalsCallbackDefault = this.getSmallIconBitmap;
            int i7 = RatingCompat + 31;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (view != null) {
            if (view.isLaidOut()) {
                int i9 = RatingCompat + 19;
                AudioAttributesImplBaseParcelizer = i9 % 128;
                int i10 = i9 % 2;
                if (!view.isLayoutRequested()) {
                    int i11 = AudioAttributesImplBaseParcelizer + 113;
                    RatingCompat = i11 % 128;
                    if (i11 % 2 != 0) {
                        View viewAccess000 = access000(this);
                        Intrinsics.checkNotNull(viewAccess000);
                        onExtraCallback(this, viewAccess000, ((Boolean) onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1970256248, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1970256244, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
                        interfaceDescriptor = getInterfaceDescriptor(this);
                    } else {
                        View viewAccess0002 = access000(this);
                        Intrinsics.checkNotNull(viewAccess0002);
                        onExtraCallback(this, viewAccess0002, ((Boolean) onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1970256248, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1970256244, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
                        interfaceDescriptor = getInterfaceDescriptor(this);
                    }
                    onWarmupCompleted(this, interfaceDescriptor + writeTypedObject(this));
                    return;
                }
            }
            view.addOnLayoutChangeListener(new IAuthTabCallback());
        }
    }

    private final void IAuthTabCallback(float f, float f2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 57;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        for (View view : this.writeTypedObject) {
            int i4 = RatingCompat + 11;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (!(view instanceof ViewGroup)) {
                view.setScaleX(f);
                view.setScaleY(f);
                view.setAlpha(f2);
            } else {
                Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) view).IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    View view2 = (View) itIAuthTabCallback.next();
                    view2.setScaleX(f);
                    view2.setScaleY(f);
                    view2.setAlpha(f2);
                }
            }
        }
        int i6 = AudioAttributesImplBaseParcelizer + 5;
        RatingCompat = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        if (!this.ITrustedWebActivityServiceStub) {
            return super.onExtraCallback();
        }
        int i2 = RatingCompat + 15;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        View view = this.ITrustedWebActivityService;
        if (view == null) {
            return super.onExtraCallback();
        }
        if (view instanceof ListView) {
            return VectorConvertersKtExternalSyntheticLambda7.onExtraCallback((ListView) view, -1);
        }
        boolean zCanScrollVertically = view.canScrollVertically(-1);
        int i4 = AudioAttributesImplBaseParcelizer + 81;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return zCanScrollVertically;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean z = false;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 69;
        int i3 = i2 % 128;
        RatingCompat = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i4 = 72 / 0;
            if (pillarSwipeRefreshLayout.ITrustedWebActivityServiceStub) {
                int i5 = i3 + 43;
                int i6 = i5 % 128;
                AudioAttributesImplBaseParcelizer = i6;
                if (i5 % 2 == 0) {
                    boolean z2 = pillarSwipeRefreshLayout.isEngagementSignalsApiAvailable;
                    obj.hashCode();
                    throw null;
                }
                if (pillarSwipeRefreshLayout.isEngagementSignalsApiAvailable && !pillarSwipeRefreshLayout.prefetch) {
                    float f = pillarSwipeRefreshLayout.onSessionEnded;
                    if (f > 0.0f) {
                        if (f > pillarSwipeRefreshLayout.ITrustedWebActivityServiceDefault) {
                            int i7 = i6 + 1;
                            RatingCompat = i7 % 128;
                            if (i7 % 2 == 0) {
                                z = true;
                            }
                        } else {
                            int i8 = i6 + 27;
                            RatingCompat = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 3 / 4;
                            }
                        }
                        pillarSwipeRefreshLayout.extraCallback();
                        pillarSwipeRefreshLayout.onExtraCallback(z);
                    }
                }
            }
        } else if (pillarSwipeRefreshLayout.ITrustedWebActivityServiceStub) {
        }
        int i10 = RatingCompat + 107;
        AudioAttributesImplBaseParcelizer = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        LottieAnimationView lottieAnimationView = this.onMinimized;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(8);
        }
        int i3 = AudioAttributesImplBaseParcelizer + 57;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094 A[PHI: r2 r5 r6
      0x0094: PHI (r2v54 int) = (r2v53 int), (r2v60 int) binds: [B:16:0x0092, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r5v24 int) = (r5v23 int), (r5v27 int) binds: [B:16:0x0092, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r6v8 android.view.View) = (r6v7 android.view.View), (r6v12 android.view.View) binds: [B:16:0x0092, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[PHI: r2 r5
      0x0099: PHI (r2v58 int) = (r2v53 int), (r2v60 int) binds: [B:16:0x0092, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r5v26 int) = (r5v23 int), (r5v27 int) binds: [B:16:0x0092, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[PHI: r2
      0x0100: PHI (r2v21 im.toss.tds.view.component.atom.image.TdsImageView) = (r2v20 im.toss.tds.view.component.atom.image.TdsImageView), (r2v48 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:29:0x00fe, B:26:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onSizeChanged(int i, int i2, int i3, int i4) throws Throwable {
        int measuredHeight;
        TdsImageView tdsImageView;
        View view;
        int i5;
        int i6;
        View view2;
        int paddingTop;
        int i7 = 2 % 2;
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        LottieAnimationView lottieAnimationView = this.onMinimized;
        if (lottieAnimationView != null) {
            int i8 = AudioAttributesImplBaseParcelizer + 69;
            RatingCompat = i8 % 128;
            int i9 = i8 % 2;
            M_ m_ = M_.onExtraCallback;
            lottieAnimationView.layout((m_.asInterface() / 2) - (IAuthTabCallback_Parcel() / 2), 0, (m_.asInterface() / 2) + (IAuthTabCallback_Parcel() / 2), IAuthTabCallback_Parcel());
        }
        LottieAnimationView lottieAnimationView2 = this.requestPostMessageChannelWithExtras;
        if (lottieAnimationView2 != null) {
            int i10 = RatingCompat + 55;
            AudioAttributesImplBaseParcelizer = i10 % 128;
            int i11 = i10 % 2;
            M_ m_2 = M_.onExtraCallback;
            lottieAnimationView2.layout((m_2.asInterface() / 2) - (access000() / 2), IAuthTabCallbackStubProxy(), (m_2.asInterface() / 2) + (access000() / 2), IAuthTabCallbackStubProxy() + access000());
        }
        getLocationOnScreen(this.ICustomTabsServiceDefault);
        View view3 = this.ICustomTabsService_Parcel;
        if (view3 == null) {
            int i12 = RatingCompat + 49;
            AudioAttributesImplBaseParcelizer = i12 % 128;
            if (i12 % 2 == 0) {
                i5 = this.ICustomTabsServiceDefault[1];
                i6 = this.getSmallIconBitmap;
                view2 = this.ITrustedWebActivityService;
                paddingTop = view2 != null ? view2.getPaddingTop() : 0;
            } else {
                i5 = this.ICustomTabsServiceDefault[1];
                i6 = this.getSmallIconBitmap;
                view2 = this.ITrustedWebActivityService;
                if (view2 != null) {
                }
            }
            measuredHeight = i5 + i6 + paddingTop;
        } else {
            int i13 = this.ICustomTabsServiceDefault[1];
            Intrinsics.checkNotNull(view3);
            measuredHeight = this.notifyNotificationWithChannel + i13 + view3.getMeasuredHeight() + this.getSmallIconBitmap;
        }
        onNavigationEvent(measuredHeight);
        this.IPostMessageServiceDefault = (this.getSmallIconId + (access100() / 2.0f)) - ((readTypedObject() - IAuthTabCallback_Parcel()) / 2.0f);
        this.IEngagementSignalsCallback_Parcel = (this.getSmallIconId + (access100() / 2.0f)) - ((ICustomTabsCallback() - IAuthTabCallback_Parcel()) / 2.0f);
        if (this.IPostMessageServiceStubProxy) {
            int i14 = AudioAttributesImplBaseParcelizer + 49;
            RatingCompat = i14 % 128;
            if (i14 % 2 != 0) {
                tdsImageView = this.IEngagementSignalsCallbackStubProxy;
                int i15 = 93 / 0;
                if (tdsImageView != null) {
                    tdsImageView.setY(this.IPostMessageServiceDefault);
                }
            } else {
                tdsImageView = this.IEngagementSignalsCallbackStubProxy;
                if (tdsImageView != null) {
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() && (view = this.IPostMessageServiceStub) != null) {
                view.setY(this.IEngagementSignalsCallback_Parcel);
            }
            View view4 = this.IPostMessageServiceStub;
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = (int) ICustomTabsCallback();
                layoutParams.height = (int) ICustomTabsCallback();
                view4.setLayoutParams(layoutParams);
                Context context2 = view4.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                view4.setBackground(new maxAgeSeconds(new int[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration)).isEngagementSignalsApiAvailable(), 0}, new float[]{0.0f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null));
                view4.setX((readTypedObject() / 4.0f) - (ICustomTabsCallback() / 2.0f));
                int i16 = RatingCompat + 3;
                AudioAttributesImplBaseParcelizer = i16 % 128;
                int i17 = i16 % 2;
            }
            TdsImageView tdsImageView2 = this.IEngagementSignalsCallbackStubProxy;
            if (tdsImageView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = tdsImageView2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = readTypedObject();
                layoutParams2.height = readTypedObject();
                tdsImageView2.setLayoutParams(layoutParams2);
                Object[] objArr = new Object[1];
                a((short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) Color.green(0), (-475061978) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 933986210 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') - 110, objArr);
                TdsImageView.setImage$default(tdsImageView2, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                tdsImageView2.setX((-readTypedObject()) / 4.0f);
            }
        }
    }

    public final void setTopOffsetView(@NotNull View view, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 63;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsService_Parcel = view;
        this.postMessage = z;
        this.notifyNotificationWithChannel = i;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new onTransact(view, z));
            return;
        }
        onExtraCallback(this, view, z);
        int i5 = AudioAttributesImplBaseParcelizer + 103;
        RatingCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void asInterface() {
        int i = 2 % 2;
        setRefreshing(false);
        this.newSession = true;
        this.setEngagementSignalsCallback.removeCallbacksAndMessages(null);
        getInterfaceDescriptor();
        IAuthTabCallback(1.0f, 1.0f);
        onRelationshipValidationResult();
        TdsImageView tdsImageView = this.IEngagementSignalsCallbackStubProxy;
        if (tdsImageView != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 83;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            tdsImageView.setVisibility(8);
        }
        View view = this.IPostMessageServiceStub;
        if (view != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 87;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            view.setVisibility(8);
        }
        requestDisallowInterceptTouchEvent(false);
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2142767486, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2142767477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        onMessageChannelReady();
        IAuthTabCallbackDefault(0.0f);
        this.RemoteActionCompatParcelizer = false;
        LottieAnimationView lottieAnimationView = this.requestPostMessageChannelWithExtras;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
            int i6 = RatingCompat + 89;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        Object[] objArr = {Boolean.valueOf(z), pillarSwipeRefreshLayout};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2071989125, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2071989126, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1112302679, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1112302676, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ void onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {pillarSwipeRefreshLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 449408757, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -449408755, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(TdsImageView tdsImageView) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{tdsImageView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1778541825, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1778541803, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ int IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Integer) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1207762082, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1207762075, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue();
    }

    public static /* synthetic */ int onTransact(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Integer) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2102059822, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2102059808, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue();
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2132440158, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2132440152, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, float f, float f2) {
        Object[] objArr = {pillarSwipeRefreshLayout, Float.valueOf(f), Float.valueOf(f2)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541231678, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541231670, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ boolean extraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1970256248, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1970256244, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, int i) {
        Object[] objArr = {pillarSwipeRefreshLayout, Integer.valueOf(i)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 648608975, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -648608964, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, boolean z) {
        Object[] objArr = {pillarSwipeRefreshLayout, Boolean.valueOf(z)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1801317393, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1801317413, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final float IAuthTabCallback(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Float) onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 253453030, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -253453025, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
    }

    private final void asBinder() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1312820109, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1312820090, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void writeTypedObject() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -541141327, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void extraCallbackWithResult() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2142767486, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2142767477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final int onActivityLayout(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Integer) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 765326103, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -765326087, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).intValue();
    }

    private final void IAuthTabCallbackStub(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 965443142, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -965443124, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void onExtraCallback(boolean z, Boolean bool) {
        Object[] objArr = {this, Boolean.valueOf(z), bool};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -307929154, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 307929167, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onWarmupCompleted(TdsImageView tdsImageView) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{tdsImageView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1803121534, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1803121517, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit asInterface(View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2049989796, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2049989786, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onRelationshipValidationResult(PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -45063461, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 45063473, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final void onTransact() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1424107480, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1424107495, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final boolean IAuthTabCallbackStub() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 56358529, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -56358508, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    static void IAuthTabCallbackDefault() {
        IconCompatParcelizer = -1206450311;
        AudioAttributesCompatParcelizer = -1538795418;
        AudioAttributesImplApi26Parcelizer = 1813207246;
        AudioAttributesImplApi21Parcelizer = new byte[]{-43, -9, -12, 1, 52, -53, -15, 25, -11, 63, -74, 9, -9, 10, 72, -54, 2, -12, -5, 24, 61, -75, 9, 8, 11, 55, -50, -15, 13, 13, 11, -6, 11, 55, -73, 13, -14, 4, 62, -79, 9, 2, -6, 11, 77, -76, 6, -12, -3, 8, 13, 11, 53, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, -42, -9, -12, 1, 52, -78, 4, 9, -10, -11, 55, -74, 9, -9, 10, 72, -54, 2, -12, -5, 24, 61, -75, 9, 8, 11, 55, -50, -15, 13, 13, 11, -6, 11, 55, -73, 13, -14, 4, 62, -79, 9, 2, -6, 11, 77, -76, 6, -12, -3, 8, 13, 11, 53, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, -64, -15, -10, 74, -63, -10, 14, -4, 12, 52, -64, -15, -12, 8, 15, -1, 75, -55, -9, 10, 8, -10, 4, 62, -78, -9, 9, -10, 1, 8, 11, 50, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, -63, -9, -12, 1, 52, -78, 13, -9, -11, 78, -50, -15, 13, 13, 11, -6, 11, 53, -55, -9, 10, 8, -10, 4, 62, -78, 6, -12, -3, 8, 13, 11, 53, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4};
    }
}
