package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setSecureScreen;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.deleteProfile;
import o.endRearDisplayPresentationSession;
import o.endRearDisplaySession;
import o.findRes;
import o.findResAndMsg;
import o.forceDomainCheck;
import o.formatMsgs;
import o.getPackageType;
import o.getRearDisplayMetrics;
import o.getRootAlpha;
import o.getStrokeWidth;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.removeRearDisplayPresentationStatusListener;
import o.setRandomHost;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFeedVideoV2View extends ConstraintLayout implements endRearDisplaySession {
    private static short[] mayLaunchUrl;
    private final getRootAlpha IAuthTabCallback;
    private Boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    private final NativeAdsFeedVideoV2View$lifecycleObserver$1 IAuthTabCallback_Parcel;
    private String ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private Function1<? super NativeAdsEventLogType, Unit> access000;
    private final View.OnLayoutChangeListener access100;
    private boolean asBinder;
    private boolean asInterface;
    private ExoPlayer extraCallback;
    private NativeAdsDto.Creative.FeedVideo extraCallbackWithResult;
    private final ViewTreeObserver.OnScrollChangedListener getInterfaceDescriptor;
    private List<? extends NativeAdsEventLogType> onActivityLayout;
    private final List<Float> onActivityResized;
    private final Set<Long> onExtraCallback;
    private String onExtraCallbackWithResult;
    private getPackageType onMessageChannelReady;
    private final List<Long> onMinimized;
    private boolean onNavigationEvent;
    private String onPostMessage;
    private boolean onTransact;
    private final Set<Float> onWarmupCompleted;
    private String readTypedObject;
    private final onExtraCallback writeTypedObject;
    private static final byte[] $$a = {2, 77, 55, -86};
    private static final int $$b = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int ICustomTabsCallback_Parcel = 1;
    private static int onUnminimized = -436138001;
    private static int onRelationshipValidationResult = -1538795490;
    private static int ICustomTabsCallbackStub = 1805133253;
    private static byte[] ICustomTabsCallbackStubProxy = {35, 56, 124, -13, 43, 53, 59, 43, 116, 37, 63, -8, 59, 57, 60, 122, -15, 58, 33, 124, -13, 32, 35, 48, 38, 112, -7, 57, 54, 36, 100, -31, 126, 63, -14, 35, 56, 123, -26, 63, 57, 54, 36, 100, -4, 62, 101, -27, 58, 62, 37, 112, -11, 36, 47, 77, 23, 59, 126, 58, 47, -15, 61, 38, 58, 54, -28, -7, 61, -76, -20, -10, -4, -20, 53, -26, -16, -71, -4, -6, -3, 59, -70, -6, 61, -76, -31, -28, -15, -25, 49, -70, -6, -9, -27, 37, -94, 63, -16, -77, -28, -7, 60, -89, -16, -6, -9, -27, 37, -67, -1, 38, -90, -5, -1, -26, 49, -74, -27, -32, 14, -24, -4, 63, -5, -32, -78, -2, -25, -5, -9, 8, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = 115 - (s2 * 3);
        byte[] bArr = $$a;
        int i4 = 3 - (s * 2);
        int i5 = i * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            int i9 = 0;
            int i10 = (-i4) + i7;
            i2 = i9;
            int i11 = i8;
            i3 = i10;
            i4 = i11;
            int i12 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i3;
            i8 = i12;
            i4 = bArr[i12];
            i9 = i2 + 1;
            i7 = i13;
            int i102 = (-i4) + i7;
            i2 = i9;
            int i112 = i8;
            i3 = i102;
            i4 = i112;
            int i122 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedVideoV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedVideoV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(onwarmupcompleted, feedVideo, motionEvent);
        int i4 = isEngagementSignalsApiAvailable + 77;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View, motionEvent}, forceDomainCheck.IAuthTabCallback(), 289975412, forceDomainCheck.IAuthTabCallback(), -289975406, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(nativeAdsFeedVideoV2View);
        int i4 = isEngagementSignalsApiAvailable + 65;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            return (Unit) onWarmupCompleted(new Object[]{onwarmupcompleted, feedVideo, motionEvent}, forceDomainCheck.IAuthTabCallback(), -1153897468, forceDomainCheck.IAuthTabCallback(), 1153897473, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(new Object[]{onwarmupcompleted, feedVideo, motionEvent}, forceDomainCheck.IAuthTabCallback(), -1153897468, forceDomainCheck.IAuthTabCallback(), 1153897473, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
        int i3 = 62 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(onwarmupcompleted, feedVideo, motionEvent);
        }
        onTransact(onwarmupcompleted, feedVideo, motionEvent);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9 = 2 % 2;
        int i10 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsCallback_Parcel = i10 % 128;
        int i11 = i10 % 2;
        onExtraCallback(nativeAdsFeedVideoV2View, view, i, i2, i3, i4, i5, i6, i7, i8);
        if (i11 == 0) {
            int i12 = 77 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(onwarmupcompleted, feedVideo, motionEvent);
        int i4 = isEngagementSignalsApiAvailable + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = i7 | i2;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i2))) | (~(i4 | i2));
        int i11 = i4 + i2 + i3 + ((-540997959) * i5) + (162607451 * i);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i4) + 1723858944 + (1667710703 * i2) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i3) + ((-672137216) * i5) + (483393536 * i) + (377683968 * i12);
        int i14 = (i4 * 228155117) + 240245784 + (i2 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i3 * 228155391) + (i5 * (-329950905)) + (i * (-2026639707)) + (i12 * 159186944);
        switch (i13 + (i14 * i14 * (-1451425792))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
                NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[1];
                int i15 = 2 % 2;
                int i16 = ICustomTabsCallback_Parcel + 89;
                isEngagementSignalsApiAvailable = i16 % 128;
                int i17 = i16 % 2;
                String strOnWarmupCompleted = feedVideo.onWarmupCompleted();
                Object[] objArr2 = new Object[1];
                a((short) (TextUtils.indexOf("", "", 0) + 8), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1111939047, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 807404131, (ViewConfiguration.getWindowTouchSlop() >> 8) - 21, objArr2);
                onwarmupcompleted.onWarmupCompleted(feedVideo, strOnWarmupCompleted, ((String) objArr2[0]).intern());
                Unit unit = Unit.INSTANCE;
                int i18 = isEngagementSignalsApiAvailable + 19;
                ICustomTabsCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(onwarmupcompleted, feedVideo, motionEvent);
        }
        IAuthTabCallbackDefault(onwarmupcompleted, feedVideo, motionEvent);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRootAlpha getrootalpha, onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getrootalpha, onwarmupcompleted, feedVideo, motionEvent);
        }
        onNavigationEvent(getrootalpha, onwarmupcompleted, feedVideo, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$lifecycleObserver$1] */
    public NativeAdsFeedVideoV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getRootAlpha getrootalphaOnNavigationEvent = getRootAlpha.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(getrootalphaOnNavigationEvent, "");
        this.IAuthTabCallback = getrootalphaOnNavigationEvent;
        this.asBinder = true;
        this.onActivityLayout = CollectionsKt.emptyList();
        this.onMinimized = new ArrayList();
        this.onActivityResized = new ArrayList();
        this.onWarmupCompleted = new LinkedHashSet();
        this.onExtraCallback = new LinkedHashSet();
        this.getInterfaceDescriptor = new NativeAdsFeedVideoV2View$.ExternalSyntheticLambda7(this);
        this.access100 = new NativeAdsFeedVideoV2View$.ExternalSyntheticLambda8(this);
        this.writeTypedObject = new onExtraCallback();
        this.IAuthTabCallback_Parcel = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$lifecycleObserver$1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onNavigationEvent + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 67;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    int i5 = 19 / 0;
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                NativeAdsFeedVideoV2View.onExtraCallback(this.IAuthTabCallback, true);
                this.IAuthTabCallback.onWarmupCompleted();
                int i5 = onNavigationEvent + 97;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 59 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 25;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsFeedVideoV2View.onExtraCallback(this.IAuthTabCallback, true);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsFeedVideoV2View.onExtraCallback(this.IAuthTabCallback, false);
                }
                NativeAdsFeedVideoV2View.getInterfaceDescriptor(this.IAuthTabCallback);
                int i4 = onWarmupCompleted + 73;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 66 / 0;
                }
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsFeedVideoV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallback_Parcel + 121;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallback_Parcel + 41;
            int i6 = i5 % 128;
            isEngagementSignalsApiAvailable = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 49;
            ICustomTabsCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.onWarmupCompleted(str, z);
        int i4 = isEngagementSignalsApiAvailable + 123;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getRootAlpha getrootalpha = nativeAdsFeedVideoV2View.IAuthTabCallback;
        if (i3 != 0) {
            return getrootalpha;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.IAuthTabCallbackStub();
        int i4 = ICustomTabsCallback_Parcel + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access000(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 59;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.getInterfaceDescriptor();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 91;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access100(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.access100();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
    }

    public static final /* synthetic */ ExoPlayer asBinder(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 41;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsFeedVideoV2View.extraCallback;
        int i5 = i3 + 95;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return exoPlayer;
    }

    public static final /* synthetic */ String asInterface(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = nativeAdsFeedVideoV2View.readTypedObject;
        if (i4 == 0) {
            int i5 = 94 / 0;
        }
        int i6 = i3 + 101;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
        int i3 = ICustomTabsCallback_Parcel + 17;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = nativeAdsFeedVideoV2View.onTransact();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return Boolean.valueOf(zOnTransact);
    }

    public static final /* synthetic */ String onExtraCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String str = nativeAdsFeedVideoV2View.onExtraCallbackWithResult;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 29;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsFeedVideoV2View.onTransact = z;
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = i2 + 47;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Function1 onExtraCallbackWithResult(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 87;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsFeedVideoV2View.access000;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 23;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return function1;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.ICustomTabsCallbackDefault = z;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    public static final /* synthetic */ boolean onTransact(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean z = nativeAdsFeedVideoV2View.ICustomTabsCallbackDefault;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.IAuthTabCallbackDefault();
        int i4 = ICustomTabsCallback_Parcel + 125;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 35;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsFeedVideoV2View.onExtraCallbackWithResult = str;
        int i5 = i2 + 59;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback_Parcel(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        boolean z;
        int i = 2 % 2;
        if (nativeAdsFeedVideoV2View.onNavigationEvent) {
            int i2 = ICustomTabsCallback_Parcel;
            int i3 = i2 + 101;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            if (!nativeAdsFeedVideoV2View.onTransact) {
                int i5 = i2 + 101;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 != 0) {
                    nativeAdsFeedVideoV2View.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (nativeAdsFeedVideoV2View.asBinder()) {
                    int i6 = ICustomTabsCallback_Parcel + 13;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (Intrinsics.areEqual(nativeAdsFeedVideoV2View.IAuthTabCallbackDefault, Boolean.valueOf(z))) {
            return;
        }
        int i8 = isEngagementSignalsApiAvailable + 59;
        ICustomTabsCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        nativeAdsFeedVideoV2View.IAuthTabCallbackDefault = Boolean.valueOf(z);
        if (!z) {
            int i10 = ICustomTabsCallback_Parcel + 117;
            isEngagementSignalsApiAvailable = i10 % 128;
            int i11 = i10 % 2;
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(nativeAdsFeedVideoV2View);
        }
    }

    private static final void onExtraCallback(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9 = 2 % 2;
        int i10 = isEngagementSignalsApiAvailable + 113;
        ICustomTabsCallback_Parcel = i10 % 128;
        int i11 = i10 % 2;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        int i12 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final class onExtraCallback implements Player.Listener {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        onExtraCallback() {
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0 ? i == 4 : i == 2) {
                NativeAdsFeedVideoV2View.onWarmupCompleted(NativeAdsFeedVideoV2View.this);
                if (!NativeAdsFeedVideoV2View.onTransact(NativeAdsFeedVideoV2View.this)) {
                    NativeAdsFeedVideoV2View.onNavigationEvent(NativeAdsFeedVideoV2View.this, true);
                    Function1 function1OnExtraCallbackWithResult = NativeAdsFeedVideoV2View.onExtraCallbackWithResult(NativeAdsFeedVideoV2View.this);
                    if (function1OnExtraCallbackWithResult != null) {
                        function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                    }
                }
                Object[] objArr = {NativeAdsFeedVideoV2View.this};
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                if (!(!((Boolean) NativeAdsFeedVideoV2View.onWarmupCompleted(objArr, forceDomainCheck.IAuthTabCallback(), 1816874633, forceDomainCheck.IAuthTabCallback(), -1816874632, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback)).booleanValue())) {
                    ExoPlayer exoPlayerAsBinder = NativeAdsFeedVideoV2View.asBinder(NativeAdsFeedVideoV2View.this);
                    if (exoPlayerAsBinder != null) {
                        exoPlayerAsBinder.seekTo(0L);
                    }
                    ExoPlayer exoPlayerAsBinder2 = NativeAdsFeedVideoV2View.asBinder(NativeAdsFeedVideoV2View.this);
                    if (exoPlayerAsBinder2 != null) {
                        exoPlayerAsBinder2.setPlayWhenReady(true);
                        int i4 = IAuthTabCallback + 59;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    ExoPlayer exoPlayerAsBinder3 = NativeAdsFeedVideoV2View.asBinder(NativeAdsFeedVideoV2View.this);
                    if (exoPlayerAsBinder3 != null) {
                        exoPlayerAsBinder3.play();
                    }
                }
            }
            int i6 = IAuthTabCallback + 117;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onIsPlayingChanged(boolean z) {
            int i = 2 % 2;
            if (z) {
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TdsImageView tdsImageView = ((getRootAlpha) NativeAdsFeedVideoV2View.onWarmupCompleted(new Object[]{NativeAdsFeedVideoV2View.this}, forceDomainCheck.IAuthTabCallback(), 411372990, forceDomainCheck.IAuthTabCallback(), -411372982, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback())).IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(8);
                Function1 function1OnExtraCallbackWithResult = NativeAdsFeedVideoV2View.onExtraCallbackWithResult(NativeAdsFeedVideoV2View.this);
                if (function1OnExtraCallbackWithResult != null) {
                    int i4 = onWarmupCompleted + 37;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                    } else {
                        function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                        int i5 = 85 / 0;
                    }
                }
                NativeAdsFeedVideoV2View.IAuthTabCallbackStubProxy(NativeAdsFeedVideoV2View.this);
                return;
            }
            TdsImageView tdsImageView2 = ((getRootAlpha) NativeAdsFeedVideoV2View.onWarmupCompleted(new Object[]{NativeAdsFeedVideoV2View.this}, forceDomainCheck.IAuthTabCallback(), 411372990, forceDomainCheck.IAuthTabCallback(), -411372982, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback())).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(NativeAdsFeedVideoV2View.this) ? 8 : 0);
            NativeAdsFeedVideoV2View.access000(NativeAdsFeedVideoV2View.this);
        }
    }

    private static final Unit asBinder(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onwarmupcompleted.onWarmupCompleted(feedVideo, feedVideo.onWarmupCompleted(), "1004");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 115;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onwarmupcompleted.onWarmupCompleted(feedVideo, feedVideo.onWarmupCompleted(), "2500");
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 21;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        byte b2;
        long j2;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onRelationshipValidationResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "")), ExpandableListView.getPackedPositionChild(0L) + 43, 22439 - Color.alpha(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            char c = '0';
            if (i7 != 0) {
                int i8 = $10 + 97;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                byte[] bArr2 = ICustomTabsCallbackStubProxy;
                float f = 0.0f;
                if (bArr2 != null) {
                    int i11 = i9 + 73;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $11 + 109;
                        $10 = i14 % 128;
                        int i15 = i14 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c2 = (char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 12843);
                            int threadPriority = 55 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int iLastIndexOf = 2166 - TextUtils.lastIndexOf("", c, 0);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, threadPriority, iLastIndexOf, -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr3[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i13++;
                        i5 = 2;
                        c = '0';
                        f = 0.0f;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i16 = $10 + 73;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        byte[] bArr4 = ICustomTabsCallbackStubProxy;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onUnminimized)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, Color.green(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b2 = (byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L));
                            j2 = onRelationshipValidationResult & (-4629411779493505016L);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr5 = ICustomTabsCallbackStubProxy;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onUnminimized)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43425), Process.getGidForName("") + 43, 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (bArr5[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L));
                        j2 = onRelationshipValidationResult ^ (-4629411779493505016L);
                    }
                    iIntValue = (byte) (b2 + ((int) j2));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (mayLaunchUrl[i + ((int) (onUnminimized ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onRelationshipValidationResult ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onUnminimized ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(ICustomTabsCallbackStub), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 86, (Process.myTid() >> 22) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr6 = ICustomTabsCallbackStubProxy;
                if (bArr6 != null) {
                    int i17 = $11 + 99;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        bArr[i4] = (byte) (bArr6[i4] ^ (-4629411779493505016L));
                        i4++;
                    }
                    bArr6 = bArr;
                }
                boolean z = bArr6 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z)) {
                        byte[] bArr7 = ICustomTabsCallbackStubProxy;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = mayLaunchUrl;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    private static final Unit onNavigationEvent(getRootAlpha getrootalpha, onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        String str;
        int i = 2 % 2;
        if (motionEvent != null) {
            int i2 = ICustomTabsCallback_Parcel + 61;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Typography6 typography6 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            if (getstrokewidth.onExtraCallback((View) typography6, x, y)) {
                str = "1001";
            } else {
                Intrinsics.checkNotNullExpressionValue(getrootalpha.access100, "");
                if (!(!getstrokewidth.onExtraCallback((View) r6, x, y))) {
                    int i4 = ICustomTabsCallback_Parcel + 47;
                    isEngagementSignalsApiAvailable = i4 % 128;
                    int i5 = i4 % 2;
                    str = "1002";
                } else {
                    str = null;
                }
            }
            onwarmupcompleted.onWarmupCompleted(feedVideo, feedVideo.onWarmupCompleted(), str);
        } else {
            onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, feedVideo, feedVideo.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onwarmupcompleted.onWarmupCompleted(feedVideo, feedVideo.onWarmupCompleted(), "3002");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, feedVideo, feedVideo.onWarmupCompleted(), null, 3, null);
        } else {
            onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, feedVideo, feedVideo.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsFeedVideoV2View.asBinder = true ^ nativeAdsFeedVideoV2View.asBinder;
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 920534250, forceDomainCheck.IAuthTabCallback(), -920534248, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
            nativeAdsFeedVideoV2View.IAuthTabCallback_Parcel();
            if (nativeAdsFeedVideoV2View.asBinder) {
                Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsFeedVideoV2View.access000;
                if (function1 != null) {
                    int i3 = isEngagementSignalsApiAvailable + 17;
                    ICustomTabsCallback_Parcel = i3 % 128;
                    if (i3 % 2 == 0) {
                        function1.invoke(NativeAdsEventLogType.writeTypedObject.onExtraCallback);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    function1.invoke(NativeAdsEventLogType.writeTypedObject.onExtraCallback);
                }
            } else {
                Function1<? super NativeAdsEventLogType, Unit> function12 = nativeAdsFeedVideoV2View.access000;
                if (function12 != null) {
                    function12.invoke(NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
                }
            }
        } else {
            nativeAdsFeedVideoV2View.asBinder = true ^ nativeAdsFeedVideoV2View.asBinder;
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 920534250, forceDomainCheck.IAuthTabCallback(), -920534248, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
            nativeAdsFeedVideoV2View.IAuthTabCallback_Parcel();
            if (nativeAdsFeedVideoV2View.asBinder) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(@NotNull String str, @NotNull final NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull deleteProfile deleteprofile, boolean z, @NotNull List<? extends NativeAdsEventLogType> list, @NotNull Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull final onWarmupCompleted onwarmupcompleted) throws Throwable {
        boolean z2;
        int color;
        boolean z3;
        Configuration configuration;
        String interfaceDescriptor;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(feedVideo, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        final getRootAlpha getrootalpha = this.IAuthTabCallback;
        int i4 = 1;
        if (!(!Intrinsics.areEqual(this.ICustomTabsCallback, str))) {
            NativeAdsDto.Creative.FeedVideo feedVideo2 = this.extraCallbackWithResult;
            if (feedVideo2 != null) {
                int i5 = isEngagementSignalsApiAvailable + 123;
                ICustomTabsCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    feedVideo2.getInterfaceDescriptor();
                    throw null;
                }
                interfaceDescriptor = feedVideo2.getInterfaceDescriptor();
            } else {
                interfaceDescriptor = null;
            }
            z2 = Intrinsics.areEqual(interfaceDescriptor, feedVideo.getInterfaceDescriptor());
        }
        if (!z2) {
            TdsImageView tdsImageView = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            this.onNavigationEvent = false;
            this.IAuthTabCallbackDefault = null;
            this.asBinder = true;
            this.onTransact = false;
            this.asInterface = false;
            this.ICustomTabsCallbackDefault = false;
            this.IAuthTabCallbackStub = false;
            this.onActivityLayout = list;
            this.onMinimized.clear();
            this.onActivityResized.clear();
            this.onWarmupCompleted.clear();
            this.onExtraCallback.clear();
            for (NativeAdsEventLogType nativeAdsEventLogType : list) {
                int i6 = ICustomTabsCallback_Parcel + i4;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
                if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                    this.onActivityResized.add(Float.valueOf(((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() / 100.0f));
                } else if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                    this.onMinimized.add(Long.valueOf(((NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType).onExtraCallbackWithResult()));
                } else {
                    Unit unit = Unit.INSTANCE;
                }
                i4 = 1;
            }
        }
        this.access000 = function1;
        this.ICustomTabsCallback = str;
        this.extraCallbackWithResult = feedVideo;
        View view = getrootalpha.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        if (zOnExtraCallbackWithResult) {
            int i8 = isEngagementSignalsApiAvailable + 57;
            ICustomTabsCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            color = Color.parseColor("#1cd9d9ff");
        } else {
            color = Color.parseColor("#0d022047");
        }
        int color2 = zOnExtraCallbackWithResult ? Color.parseColor("#1cd9d9ff") : Color.parseColor("#0d022047");
        int color3 = zOnExtraCallbackWithResult ? Color.parseColor("#1cd9d9ff") : Color.parseColor("#0d022047");
        this.IAuthTabCallback.asInterface.setBackgroundColor(color);
        this.IAuthTabCallback.asInterface.setStrokeColor(color2);
        String str2 = "#ff333d4b";
        this.IAuthTabCallback.writeTypedObject.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff333d4b"));
        this.IAuthTabCallback.extraCallbackWithResult.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff8b95a1"));
        Typography6 typography6 = this.IAuthTabCallback.IAuthTabCallbackStubProxy;
        if (zOnExtraCallbackWithResult) {
            int i10 = ICustomTabsCallback_Parcel + 21;
            isEngagementSignalsApiAvailable = i10 % 128;
            int i11 = i10 % 2;
            str2 = "#ccf2f2ff";
        }
        typography6.setTextColor(Color.parseColor(str2));
        Typography6 typography62 = this.IAuthTabCallback.access100;
        int color4 = Color.parseColor(zOnExtraCallbackWithResult ? "#b3f2f2ff" : "#ff4e5968");
        int i12 = isEngagementSignalsApiAvailable + 109;
        ICustomTabsCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
        typography62.setTextColor(color4);
        this.IAuthTabCallback.readTypedObject.setTextColor(Color.parseColor("#ff8b95a1"));
        this.IAuthTabCallback.IAuthTabCallbackDefault.setBackgroundColor(-16777216);
        this.IAuthTabCallback.IAuthTabCallbackDefault.setStrokeColor(color3);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(getrootalpha.writeTypedObject, "1004");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(getrootalpha.asInterface, "2500");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(getrootalpha.IAuthTabCallbackStubProxy, "1001");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(getrootalpha.access100, "1002");
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(getrootalpha.ICustomTabsCallback, "3002");
        ConstraintLayout constraintLayout = getrootalpha.IAuthTabCallbackStub;
        boolean z4 = z2;
        Object[] objArr = new Object[1];
        a((short) (8 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1111939047) - Color.red(0), TextUtils.getCapsMode("", 0, 0) + 807404131, (-22) - MotionEvent.axisFromString(""), objArr);
        Function0<Unit> function0OnWarmupCompleted = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(constraintLayout, ((String) objArr[0]).intern())}));
        boolean zIsBlank = StringsKt.isBlank((String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()));
        TdsRoundLayout tdsRoundLayout = getrootalpha.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        tdsRoundLayout.setVisibility(!zIsBlank ? 0 : 8);
        if (!zIsBlank) {
            TdsImageView tdsImageView2 = getrootalpha.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            TdsImageView.setImage$default(tdsImageView2, (String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()), (Function1) null, (Function1) null, 6, (Object) null);
        }
        getrootalpha.onNavigationEvent.setContentDescription(null);
        getrootalpha.onNavigationEvent.setImportantForAccessibility(2);
        getrootalpha.onNavigationEvent.setFocusable(false);
        getrootalpha.writeTypedObject.setText(feedVideo.asBinder());
        getrootalpha.writeTypedObject.setImportantForAccessibility(1);
        Typography6 typography63 = getrootalpha.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(typography63, "");
        View root = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography63, false, null, 0, root, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i14 = 2 % 2;
                int i15 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    Object[] objArr2 = {onwarmupcompleted, feedVideo, (MotionEvent) obj};
                    int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr3 = {onwarmupcompleted, feedVideo, (MotionEvent) obj};
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                Unit unit2 = (Unit) NativeAdsFeedVideoV2View.onWarmupCompleted(objArr3, forceDomainCheck.IAuthTabCallback(), 139927239, forceDomainCheck.IAuthTabCallback(), -139927232, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
                int i16 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 52 / 0;
                }
                return unit2;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout2 = getrootalpha.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        View root2 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout2, false, null, 0, root2, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i14 = 2 % 2;
                int i15 = onNavigationEvent + 65;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnWarmupCompleted = NativeAdsFeedVideoV2View.onWarmupCompleted(onwarmupcompleted, feedVideo, (MotionEvent) obj);
                int i17 = onNavigationEvent + 43;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1973, null);
        if (z) {
            Typography7 typography7 = getrootalpha.extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            typography7.setVisibility(0);
            getrootalpha.extraCallbackWithResult.setContentDescription(null);
            getrootalpha.extraCallbackWithResult.setFocusable(false);
        } else {
            getrootalpha.writeTypedObject.setMinHeight(setTagsokhttp.onExtraCallbackWithResult(this, 36));
            Typography7 typography72 = getrootalpha.extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(8);
        }
        if (StringsKt.isBlank(feedVideo.asInterface())) {
            Typography6 typography64 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography64, "");
            typography64.setVisibility(8);
            Typography6 typography65 = getrootalpha.access100;
            Intrinsics.checkNotNullExpressionValue(typography65, "");
            typography65.setVisibility(8);
            ConstraintLayout constraintLayout2 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            View view2 = getrootalpha.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
        } else {
            int i14 = isEngagementSignalsApiAvailable + 117;
            ICustomTabsCallback_Parcel = i14 % 128;
            int i15 = i14 % 2;
            getrootalpha.IAuthTabCallbackStubProxy.setText(feedVideo.asInterface());
            View view3 = getrootalpha.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(8);
            ConstraintLayout constraintLayout3 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            Typography6 typography66 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography66, "");
            typography66.setVisibility(0);
            if (StringsKt.isBlank(feedVideo.IAuthTabCallbackStub())) {
                Typography6 typography67 = getrootalpha.access100;
                Intrinsics.checkNotNullExpressionValue(typography67, "");
                typography67.setVisibility(8);
            } else {
                getrootalpha.access100.setText(feedVideo.IAuthTabCallbackStub());
                Typography6 typography68 = getrootalpha.access100;
                Intrinsics.checkNotNullExpressionValue(typography68, "");
                typography68.setVisibility(0);
            }
            getrootalpha.onTransact.setContentDescription(StringsKt.isBlank(feedVideo.IAuthTabCallbackStub()) ? feedVideo.asInterface() : feedVideo.asInterface() + ", " + feedVideo.IAuthTabCallbackStub());
            getrootalpha.onTransact.setImportantForAccessibility(1);
            getrootalpha.onTransact.setFocusable(true);
            ConstraintLayout constraintLayout4 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            View root3 = this.IAuthTabCallback.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout4, false, null, 0, root3, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i16 = 2 % 2;
                    int i17 = onWarmupCompleted + 53;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnWarmupCompleted = NativeAdsFeedVideoV2View.onWarmupCompleted(getrootalpha, onwarmupcompleted, feedVideo, (MotionEvent) obj);
                    int i19 = onWarmupCompleted + 23;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 1973, null);
        }
        if (z4) {
            z3 = false;
        } else {
            int i16 = isEngagementSignalsApiAvailable + 89;
            ICustomTabsCallback_Parcel = i16 % 128;
            int i17 = i16 % 2;
            TdsImageView tdsImageView3 = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "ivThumbnail");
            TdsImageView.setImage$default(tdsImageView3, feedVideo.access000(), (Function1) null, (Function1) null, 6, (Object) null);
            TdsImageView tdsImageView4 = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "ivThumbnail");
            z3 = false;
            tdsImageView4.setVisibility(0);
            IAuthTabCallback_Parcel();
        }
        getrootalpha.IAuthTabCallback.setContentDescription(null);
        getrootalpha.IAuthTabCallback.setImportantForAccessibility(2);
        getrootalpha.IAuthTabCallback.setFocusable(z3);
        FrameLayout frameLayout = getrootalpha.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        View root4 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, frameLayout, false, null, 0, root4, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i18 = 2 % 2;
                int i19 = onNavigationEvent + 61;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                NativeAdsFeedVideoV2View.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
                if (i20 != 0) {
                    return NativeAdsFeedVideoV2View.IAuthTabCallback(onwarmupcompleted2, feedVideo, (MotionEvent) obj);
                }
                Unit unitIAuthTabCallback = NativeAdsFeedVideoV2View.IAuthTabCallback(onwarmupcompleted2, feedVideo, (MotionEvent) obj);
                int i21 = 72 / 0;
                return unitIAuthTabCallback;
            }
        }, 1973, null);
        View root5 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root5, false, null, 0, null, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i18 = 2 % 2;
                int i19 = onExtraCallback + 117;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsFeedVideoV2View.onExtraCallbackWithResult(onwarmupcompleted, feedVideo, (MotionEvent) obj);
                int i21 = onExtraCallback + 59;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1981, null);
        ConstraintLayout constraintLayout5 = getrootalpha.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        View root6 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout5, false, null, 0, root6, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 != 0) {
                    NativeAdsFeedVideoV2View.onExtraCallback(onwarmupcompleted, feedVideo, (MotionEvent) obj);
                    throw null;
                }
                Unit unitOnExtraCallback = NativeAdsFeedVideoV2View.onExtraCallback(onwarmupcompleted, feedVideo, (MotionEvent) obj);
                int i20 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                return unitOnExtraCallback;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout3 = getrootalpha.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        View root7 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root7, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout3, false, null, 0, root7, null, 0.0f, 0.99f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback + 41;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallback = NativeAdsFeedVideoV2View.IAuthTabCallback(this.f$0, (MotionEvent) obj);
                int i21 = IAuthTabCallback + 37;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                return unitIAuthTabCallback;
            }
        }, 4021, null);
        if (!StringsKt.isBlank(feedVideo.IAuthTabCallbackStubProxy())) {
            getrootalpha.extraCallback.setText(feedVideo.IAuthTabCallbackStubProxy());
            int i18 = ICustomTabsCallback_Parcel + 11;
            isEngagementSignalsApiAvailable = i18 % 128;
            int i19 = i18 % 2;
        } else {
            getrootalpha.extraCallback.setText(getContext().getString(R.string.ads_sdk_text_more));
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iIAuthTabCallback = getstrokewidth.IAuthTabCallback(context2, feedVideo.access100(), -1);
        getrootalpha.extraCallback.setTextColor(iIAuthTabCallback);
        getrootalpha.onExtraCallback.setImageTintList(ColorStateList.valueOf(iIAuthTabCallback));
        ConstraintLayout constraintLayout6 = getrootalpha.IAuthTabCallbackStub;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        constraintLayout6.setBackgroundColor(getstrokewidth.IAuthTabCallback(context3, feedVideo.onTransact(), Color.parseColor("#262459")));
        SubTypography13 subTypography13 = getrootalpha.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(subTypography13, "");
        subTypography13.setVisibility(8);
        onWarmupCompleted(feedVideo.getInterfaceDescriptor(), z4);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        if (zIsBlank) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getrootalpha.IAuthTabCallback_Parcel.getId(), 6, 0, 6);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.IAuthTabCallback_Parcel.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.writeTypedObject.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.extraCallbackWithResult.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getrootalpha.asInterface.getId(), 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getrootalpha.asInterface.getId(), 4);
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getrootalpha.IAuthTabCallback_Parcel.getId(), 6, getrootalpha.asInterface.getId(), 7);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.IAuthTabCallback_Parcel.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.writeTypedObject.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.extraCallbackWithResult.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
        }
        if (!zIsBlank) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Resources resources = context4.getResources();
            if (((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.1f) {
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getrootalpha.asInterface.getId(), 3, 0, 3);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getrootalpha.asInterface.getId(), 4);
            } else {
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getrootalpha.asInterface.getId(), 3, getrootalpha.writeTypedObject.getId(), 3);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getrootalpha.asInterface.getId(), 4, getrootalpha.extraCallbackWithResult.getId(), 4);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(getrootalpha.asInterface.getId(), 0.5f);
            }
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        if (!z4) {
            int i20 = isEngagementSignalsApiAvailable + 53;
            ICustomTabsCallback_Parcel = i20 % 128;
            int i21 = i20 % 2;
            requestLayout();
        }
        Unit unit2 = Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements Player.Listener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsFeedVideoV2View onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;

        onExtraCallbackWithResult(String str, NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = nativeAdsFeedVideoV2View;
        }

        public void onPlayerError(PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(playbackException, "");
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            if (strOnExtraCallbackWithResult != null) {
                int i4 = onNavigationEvent + 111;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.areEqual(NativeAdsFeedVideoV2View.onExtraCallback(this.onExtraCallback), strOnExtraCallbackWithResult);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(NativeAdsFeedVideoV2View.onExtraCallback(this.onExtraCallback), strOnExtraCallbackWithResult)) {
                    NativeAdsFeedVideoV2View.onWarmupCompleted(this.onExtraCallback, strOnExtraCallbackWithResult);
                    NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = this.onExtraCallback;
                    String strAsInterface = NativeAdsFeedVideoV2View.asInterface(nativeAdsFeedVideoV2View);
                    if (strAsInterface != null) {
                        int i5 = onNavigationEvent + 37;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        strOnExtraCallbackWithResult = strAsInterface;
                    }
                    NativeAdsFeedVideoV2View.IAuthTabCallback(nativeAdsFeedVideoV2View, strOnExtraCallbackWithResult, false);
                    return;
                }
            }
            NativeAdsFeedVideoV2View.IAuthTabCallbackStub(this.onExtraCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(String str, boolean z) throws Throwable {
        String str2 = str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!Intrinsics.areEqual(this.readTypedObject, str2)) {
            this.readTypedObject = str2;
            this.onExtraCallbackWithResult = null;
        }
        String str3 = this.onExtraCallbackWithResult;
        if (str3 != null) {
            str2 = str3;
        }
        if (!Intrinsics.areEqual(this.onPostMessage, str2) || this.extraCallback == null) {
            this.onPostMessage = str2;
            onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 2050635543, forceDomainCheck.IAuthTabCallback(), -2050635543, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
            if (!StringsKt.isBlank(str2)) {
                CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayerIAuthTabCallback, context2, str2, false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                exoPlayerIAuthTabCallback.setPlayWhenReady(false);
                exoPlayerIAuthTabCallback.addListener(this.writeTypedObject);
                exoPlayerIAuthTabCallback.addListener(new onExtraCallbackWithResult(str2, this));
                this.extraCallback = exoPlayerIAuthTabCallback;
                this.IAuthTabCallback.access000.setPlayer(exoPlayerIAuthTabCallback);
                this.IAuthTabCallback.access000.setUseController(false);
                this.IAuthTabCallback.access000.setKeepContentOnPlayerReset(true);
                if (!z) {
                    TdsImageView tdsImageView = this.IAuthTabCallback.IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    tdsImageView.setVisibility(0);
                }
                onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 920534250, forceDomainCheck.IAuthTabCallback(), -920534248, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
                IAuthTabCallback_Parcel();
                getInterfaceDescriptor();
                return;
            }
            int i4 = ICustomTabsCallback_Parcel + 61;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                TdsImageView tdsImageView2 = this.IAuthTabCallback.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(1);
            } else {
                TdsImageView tdsImageView3 = this.IAuthTabCallback.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                tdsImageView3.setVisibility(0);
            }
            int i5 = ICustomTabsCallback_Parcel + 117;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final void IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        this.onPostMessage = "";
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this);
        TdsImageView tdsImageView = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 2050635543, forceDomainCheck.IAuthTabCallback(), -2050635543, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = ICustomTabsCallback_Parcel + 35;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 11;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = z;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = ICustomTabsCallback_Parcel + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoV2View.asInterface = zBooleanValue;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z = false;
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 75;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (nativeAdsFeedVideoV2View.onNavigationEvent) {
            int i5 = i2 + 33;
            ICustomTabsCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                nativeAdsFeedVideoV2View.asBinder();
                obj.hashCode();
                throw null;
            }
            if (nativeAdsFeedVideoV2View.asBinder()) {
                z = true;
            } else {
                int i6 = ICustomTabsCallback_Parcel + 17;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        nativeAdsFeedVideoV2View.IAuthTabCallbackDefault = Boolean.valueOf(z);
        if (z) {
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(nativeAdsFeedVideoV2View);
            return null;
        }
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(nativeAdsFeedVideoV2View);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean asBinder() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isAttachedToWindow())) {
            int i4 = isEngagementSignalsApiAvailable + 93;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (isShown()) {
                FrameLayout frameLayout = this.IAuthTabCallback.ICustomTabsCallback;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                int width = frameLayout.getWidth() * frameLayout.getHeight();
                if (width <= 0) {
                    return false;
                }
                Rect rect = new Rect();
                if (!frameLayout.getGlobalVisibleRect(rect)) {
                    int i6 = ICustomTabsCallback_Parcel + 95;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (((rect.width() * rect.height()) << 1) >= width) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.endRearDisplaySession
    public void onExtraCallback() throws Throwable {
        ExoPlayer exoPlayer;
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            int i2 = ICustomTabsCallback_Parcel + 47;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onPostMessage;
            if (str == null || StringsKt.isBlank(str)) {
                return;
            }
            if (this.extraCallback == null) {
                String str2 = this.onPostMessage;
                Intrinsics.checkNotNull(str2);
                onWarmupCompleted(str2, true);
            }
            ExoPlayer exoPlayer2 = this.extraCallback;
            if (exoPlayer2 != null && exoPlayer2.getPlaybackState() == 1 && (exoPlayer = this.extraCallback) != null) {
                int i3 = isEngagementSignalsApiAvailable + 15;
                ICustomTabsCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                exoPlayer.prepare();
            }
            ExoPlayer exoPlayer3 = this.extraCallback;
            if (exoPlayer3 != null) {
                int i5 = ICustomTabsCallback_Parcel + 91;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
                exoPlayer3.setPlayWhenReady(true);
            }
            ExoPlayer exoPlayer4 = this.extraCallback;
            if (exoPlayer4 != null) {
                int i7 = isEngagementSignalsApiAvailable + 51;
                ICustomTabsCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                exoPlayer4.play();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v3 com.google.android.exoplayer2.ExoPlayer) = (r2v2 com.google.android.exoplayer2.ExoPlayer), (r2v4 com.google.android.exoplayer2.ExoPlayer) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.endRearDisplaySession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted() {
        ExoPlayer exoPlayer;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 1;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            exoPlayer = this.extraCallback;
            int i4 = 46 / 0;
            if (exoPlayer != null) {
                int i5 = i2 + 121;
                ICustomTabsCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                exoPlayer.pause();
            }
        } else {
            exoPlayer = this.extraCallback;
            if (exoPlayer != null) {
            }
        }
        ExoPlayer exoPlayer2 = this.extraCallback;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(false);
        }
    }

    @Override // o.endRearDisplaySession
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.extraCallback;
        if (exoPlayer != null) {
            int i2 = ICustomTabsCallback_Parcel + 37;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                exoPlayer.stop();
                int i3 = 59 / 0;
            } else {
                exoPlayer.stop();
            }
        }
        ExoPlayer exoPlayer2 = this.extraCallback;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(false);
            int i4 = ICustomTabsCallback_Parcel + 119;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // o.endRearDisplaySession
    public void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 2050635543, forceDomainCheck.IAuthTabCallback(), -2050635543, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 91;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        nativeAdsFeedVideoV2View.getInterfaceDescriptor();
        ExoPlayer exoPlayer = nativeAdsFeedVideoV2View.extraCallback;
        if (exoPlayer != null) {
            int i2 = isEngagementSignalsApiAvailable + 99;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                exoPlayer.removeListener(nativeAdsFeedVideoV2View.writeTypedObject);
                int i3 = 75 / 0;
            } else {
                exoPlayer.removeListener(nativeAdsFeedVideoV2View.writeTypedObject);
            }
            int i4 = ICustomTabsCallback_Parcel + 43;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        ExoPlayer exoPlayer2 = nativeAdsFeedVideoV2View.extraCallback;
        if (exoPlayer2 != null) {
            int i6 = isEngagementSignalsApiAvailable + 15;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                exoPlayer2.release();
                throw null;
            }
            exoPlayer2.release();
        }
        nativeAdsFeedVideoV2View.extraCallback = null;
        nativeAdsFeedVideoV2View.IAuthTabCallback.access000.setPlayer((Player) null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        addOnLayoutChangeListener(this.access100);
        if (getViewTreeObserver().isAlive()) {
            int i4 = isEngagementSignalsApiAvailable + 7;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            getViewTreeObserver().addOnScrollChangedListener(this.getInterfaceDescriptor);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallbackStubProxy;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = null;
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            int i6 = ICustomTabsCallback_Parcel + 47;
            isEngagementSignalsApiAvailable = i6 % 128;
            if (i6 % 2 != 0) {
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
            if (lifecycle != null) {
                int i7 = ICustomTabsCallback_Parcel + 17;
                isEngagementSignalsApiAvailable = i7 % 128;
                if (i7 % 2 != 0) {
                    lifecycle.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
                    int i8 = 82 / 0;
                } else {
                    lifecycle.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
                }
            }
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle().IAuthTabCallback(this.IAuthTabCallback_Parcel);
            textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        }
        this.IAuthTabCallbackStubProxy = textFieldScrollKtExternalSyntheticLambda02;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        removeOnLayoutChangeListener(this.access100);
        Object obj = null;
        if (getViewTreeObserver().isAlive()) {
            int i2 = isEngagementSignalsApiAvailable + 93;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                getViewTreeObserver().removeOnScrollChangedListener(this.getInterfaceDescriptor);
            } else {
                getViewTreeObserver().removeOnScrollChangedListener(this.getInterfaceDescriptor);
                obj.hashCode();
                throw null;
            }
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallbackStubProxy;
        if (textFieldScrollKtExternalSyntheticLambda0 != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) != null) {
            lifecycle.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
        }
        this.IAuthTabCallbackStubProxy = null;
        this.access000 = null;
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(this);
        super/*android.view.View*/.onDetachedFromWindow();
        int i3 = ICustomTabsCallback_Parcel + 55;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        float f;
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 21;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            ExoPlayer exoPlayer = nativeAdsFeedVideoV2View.extraCallback;
            obj.hashCode();
            throw null;
        }
        ExoPlayer exoPlayer2 = nativeAdsFeedVideoV2View.extraCallback;
        if (exoPlayer2 != null) {
            int i4 = i3 + 15;
            int i5 = i4 % 128;
            isEngagementSignalsApiAvailable = i5;
            int i6 = i4 % 2;
            if (nativeAdsFeedVideoV2View.asBinder) {
                f = 0.0f;
            } else {
                int i7 = i5 + 3;
                ICustomTabsCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                f = 1.0f;
            }
            exoPlayer2.setVolume(f);
        }
        return null;
    }

    private final void IAuthTabCallback_Parcel() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            TdsImageView tdsImageView = this.IAuthTabCallback.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            if (this.asBinder) {
                int i3 = ICustomTabsCallback_Parcel + 13;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                a((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 50), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1111939047) - Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 807404187, TextUtils.lastIndexOf("", '0') + 46, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a((short) (KeyEvent.getDeadChar(0, 0) + 13), (byte) ((-1) - Process.getGidForName("")), TextUtils.getTrimmedLength("") - 1111938981, (ViewConfiguration.getTapTimeout() >> 16) + 807404187, TextUtils.indexOf("", "") + 44, objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                int i5 = ICustomTabsCallback_Parcel + 111;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
                strIntern = strIntern2;
            }
            TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.onWarmupCompleted, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        getInterfaceDescriptor();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy;
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
            int i2 = isEngagementSignalsApiAvailable + 25;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                return;
            }
        }
        this.onMessageChannelReady = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        int i4 = ICustomTabsCallback_Parcel + 113;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = NativeAdsFeedVideoV2View.this.new onNavigationEvent(access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
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
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0 && i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            while (findRes.onWarmupCompleted(findresandmsg)) {
                NativeAdsFeedVideoV2View.access100(NativeAdsFeedVideoV2View.this);
                this.L$0 = findresandmsg;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i4 = onWarmupCompleted + 121;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 59;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.onMessageChannelReady;
        if (getpackagetype != null) {
            int i2 = isEngagementSignalsApiAvailable + 27;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.onMessageChannelReady = null;
        int i3 = isEngagementSignalsApiAvailable + 23;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void access100() {
        long jLongValue;
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.extraCallback;
        if (exoPlayer != null) {
            long duration = exoPlayer.getDuration();
            if (duration > 0) {
                long jCoerceAtLeast = RangesKt.coerceAtLeast(exoPlayer.getCurrentPosition(), 0L);
                if (!this.IAuthTabCallbackStub) {
                    int i2 = isEngagementSignalsApiAvailable + 77;
                    ICustomTabsCallback_Parcel = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 15 / 0;
                        if (jCoerceAtLeast >= 2000) {
                            List<? extends NativeAdsEventLogType> list = this.onActivityLayout;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                                        int i4 = isEngagementSignalsApiAvailable + 117;
                                        ICustomTabsCallback_Parcel = i4 % 128;
                                        int i5 = i4 % 2;
                                        this.IAuthTabCallbackStub = true;
                                        Function1<? super NativeAdsEventLogType, Unit> function1 = this.access000;
                                        if (function1 != null) {
                                            function1.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (jCoerceAtLeast >= 2000) {
                    }
                }
                Iterator<T> it2 = this.onActivityResized.iterator();
                while (it2.hasNext()) {
                    float fFloatValue = ((Number) it2.next()).floatValue();
                    if (!this.onWarmupCompleted.contains(Float.valueOf(fFloatValue)) && jCoerceAtLeast >= ((long) (duration * fFloatValue))) {
                        this.onWarmupCompleted.add(Float.valueOf(fFloatValue));
                        Function1<? super NativeAdsEventLogType, Unit> function12 = this.access000;
                        if (function12 != null) {
                            function12.invoke(new NativeAdsEventLogType.extraCallback((long) (fFloatValue * 100.0f)));
                        }
                    }
                }
                Iterator<T> it3 = this.onMinimized.iterator();
                while (it3.hasNext()) {
                    int i6 = isEngagementSignalsApiAvailable + 75;
                    ICustomTabsCallback_Parcel = i6 % 128;
                    if (i6 % 2 == 0) {
                        jLongValue = ((Number) it3.next()).longValue();
                        int i7 = 99 / 0;
                        if (this.onExtraCallback.contains(Long.valueOf(jLongValue))) {
                            continue;
                        } else if (jCoerceAtLeast < 1000 * jLongValue) {
                            int i8 = isEngagementSignalsApiAvailable + 57;
                            ICustomTabsCallback_Parcel = i8 % 128;
                            if (i8 % 2 == 0) {
                                this.onExtraCallback.add(Long.valueOf(jLongValue));
                                throw null;
                            }
                            this.onExtraCallback.add(Long.valueOf(jLongValue));
                            Function1<? super NativeAdsEventLogType, Unit> function13 = this.access000;
                            if (function13 != null) {
                                function13.invoke(new NativeAdsEventLogType.extraCallbackWithResult(jLongValue));
                            }
                        } else {
                            continue;
                        }
                    } else {
                        jLongValue = ((Number) it3.next()).longValue();
                        if (!(!this.onExtraCallback.contains(Long.valueOf(jLongValue)))) {
                            continue;
                        } else if (jCoerceAtLeast < 1000 * jLongValue) {
                        }
                    }
                }
            }
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        if (!this.onActivityResized.contains(fValueOf)) {
            return;
        }
        int i4 = ICustomTabsCallback_Parcel + 5;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        if (!this.onWarmupCompleted.contains(fValueOf)) {
            this.onWarmupCompleted.add(fValueOf);
            Function1<? super NativeAdsEventLogType, Unit> function1 = this.access000;
            if (function1 != null) {
                function1.invoke(new NativeAdsEventLogType.extraCallback(100L));
            }
        }
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 93;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        if (!this.onNavigationEvent) {
            return false;
        }
        int i5 = i3 + 77;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            if (this.onTransact || !asBinder() || (!removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(this))) {
                return false;
            }
            int i6 = ICustomTabsCallback_Parcel + 91;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public interface onWarmupCompleted {
        void onWarmupCompleted(@NotNull NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            onwarmupcompleted.onWarmupCompleted(feedVideo, str, str2);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(new Object[]{onwarmupcompleted, feedVideo, motionEvent}, forceDomainCheck.IAuthTabCallback(), 139927239, forceDomainCheck.IAuthTabCallback(), -139927232, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ getRootAlpha onNavigationEvent(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (getRootAlpha) onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 411372990, forceDomainCheck.IAuthTabCallback(), -411372982, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View}, forceDomainCheck.IAuthTabCallback(), 1816874633, forceDomainCheck.IAuthTabCallback(), -1816874632, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    private final void onNavigationEvent() throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 920534250, forceDomainCheck.IAuthTabCallback(), -920534248, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void asInterface() throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 2050635543, forceDomainCheck.IAuthTabCallback(), -2050635543, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit asInterface(onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(new Object[]{onwarmupcompleted, feedVideo, motionEvent}, forceDomainCheck.IAuthTabCallback(), -1153897468, forceDomainCheck.IAuthTabCallback(), 1153897473, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, MotionEvent motionEvent) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(new Object[]{nativeAdsFeedVideoV2View, motionEvent}, forceDomainCheck.IAuthTabCallback(), 289975412, forceDomainCheck.IAuthTabCallback(), -289975406, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void access000() throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(new Object[]{this}, forceDomainCheck.IAuthTabCallback(), 629671145, forceDomainCheck.IAuthTabCallback(), -629671142, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final void IAuthTabCallback(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(objArr, forceDomainCheck.IAuthTabCallback(), -1729768599, forceDomainCheck.IAuthTabCallback(), 1729768603, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
    }
}
