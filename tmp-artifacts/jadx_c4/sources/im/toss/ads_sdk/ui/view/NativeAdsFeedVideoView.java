package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView;
import im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
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
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access8100;
import o.deleteProfile;
import o.endRearDisplayPresentationSession;
import o.endRearDisplaySession;
import o.findRes;
import o.findResAndMsg;
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
public final class NativeAdsFeedVideoView extends ConstraintLayout implements endRearDisplaySession {
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    private final ViewTreeObserver.OnScrollChangedListener IAuthTabCallback_Parcel;
    private final IAuthTabCallback ICustomTabsCallback;
    private final View.OnLayoutChangeListener access000;
    private Function1<? super NativeAdsEventLogType, Unit> access100;
    private boolean asBinder;
    private boolean asInterface;
    private String extraCallback;
    private ExoPlayer extraCallbackWithResult;
    private final NativeAdsFeedVideoView$lifecycleObserver$1 getInterfaceDescriptor;
    private final List<Float> onActivityLayout;
    private List<? extends NativeAdsEventLogType> onActivityResized;
    private final Set<Float> onExtraCallback;
    private final Set<Long> onExtraCallbackWithResult;
    private getPackageType onMessageChannelReady;
    private String onMinimized;
    private String onNavigationEvent;
    private final List<Long> onPostMessage;
    private boolean onRelationshipValidationResult;
    private Boolean onTransact;
    private final getRootAlpha onWarmupCompleted;
    private NativeAdsDto.Creative.FeedVideo readTypedObject;
    private String writeTypedObject;
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static int ICustomTabsCallbackStub = 1;
    private static char[] onUnminimized = {59977, 60860, 6501, 1066, 13291, 16051, 10807, 20837, 23704, 19343, 30541, 25095, 27095, 38017, 33718, 36668, 47659, 41451, 44210, 55421, 51045, 62169, 63888, 58645, 4110, 8143, 2694, 12728, 15712, 10359, 22517, 17068, 20072, 30043, 24709, 28550, 39700, 34313, 36302, 47237, 42937, 54065, 56874, 50665, 61622, 64614, 60177, 5791, 7568, 2370, 13319, 9091, 11910, 21951, 16755, 19509, 31658, 26366, 37412, 39169, 34011, 45969, 48977, 43527, 53633, 56548, 52159, 63353, 60860, 6501, 1066, 13291, 16051, 10807, 20837, 23704, 19343, 30541, 25095, 27095, 38017, 33718, 36668, 47659, 41451, 44210, 55421, 51045, 62169, 63888, 58645, 4110, 8143, 2694, 12728, 15712, 10359, 22517, 17068, 20072, 30043, 24709, 28550, 39700, 34313, 36302, 47237, 42937, 54065, 56874, 50665, 61622, 64614, 60177, 5791, 7568, 2378, 13388, 9155, 11908, 21950, 16754, 19575, 31669, 26337, 37502, 39198, 34010, 45964, 48960, 43596, 53727, 56570, 52150};
    private static long ICustomTabsCallbackDefault = -3815354714276357871L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = i * 2;
        int i4 = (s2 * 4) + 97;
        byte[] bArr = $$a;
        int i5 = 3 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += -i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i5++;
            i7 = bArr[i5];
            i4 += -i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i6);
        int i11 = i9 | i10 | (~(i5 | i));
        int i12 = i8 | i5;
        int i13 = (~((~i) | i5)) | i10;
        int i14 = i5 + i6 + i4 + (111814883 * i3) + (1975835455 * i2);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i5) - 1583611904) + (47848387 * i6) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i4) + ((-648806400) * i3) + (1432616960 * i2) + (442957824 * i15);
        int i17 = ((i5 * 961080817) - 60187382) + (i6 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i4 * 961079685) + (i3 * 1618335983) + (i2 * 193609403) + (i15 * 1988296704);
        switch (i16 + (i17 * i17 * 176226304)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder(onextracallback, feedVideo, motionEvent);
            throw null;
        }
        Unit unitAsBinder = asBinder(onextracallback, feedVideo, motionEvent);
        int i3 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(nativeAdsFeedVideoView);
        int i4 = ICustomTabsCallbackStubProxy + 125;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onExtraCallback onextracallback = (onExtraCallback) objArr[0];
        NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 117;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(onextracallback, feedVideo, motionEvent);
        int i4 = ICustomTabsCallbackStubProxy + 105;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(onextracallback, feedVideo, motionEvent);
        int i4 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFeedVideoView nativeAdsFeedVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsFeedVideoView, motionEvent);
        int i4 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onExtraCallback onextracallback = (onExtraCallback) objArr[0];
        NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(onextracallback, feedVideo, motionEvent);
        int i4 = ICustomTabsCallbackStubProxy + 49;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(onextracallback, feedVideo, motionEvent);
        }
        onTransact(onextracallback, feedVideo, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRootAlpha getrootalpha, onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 121;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getrootalpha, onextracallback, feedVideo, motionEvent);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsFeedVideoView nativeAdsFeedVideoView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = ICustomTabsCallbackStub + 97;
        ICustomTabsCallbackStubProxy = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        onNavigationEvent(nativeAdsFeedVideoView, view, i, i2, i3, i4, i5, i6, i7, i8);
        if (i11 != 0) {
            obj.hashCode();
            throw null;
        }
        int i12 = ICustomTabsCallbackStubProxy + 77;
        ICustomTabsCallbackStub = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$lifecycleObserver$1] */
    public NativeAdsFeedVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getRootAlpha getrootalphaOnNavigationEvent = getRootAlpha.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(getrootalphaOnNavigationEvent, "");
        this.onWarmupCompleted = getrootalphaOnNavigationEvent;
        this.asInterface = true;
        this.onActivityResized = CollectionsKt.emptyList();
        this.onPostMessage = new ArrayList();
        this.onActivityLayout = new ArrayList();
        this.onExtraCallback = new LinkedHashSet();
        this.onExtraCallbackWithResult = new LinkedHashSet();
        this.IAuthTabCallback_Parcel = new NativeAdsFeedVideoView$.ExternalSyntheticLambda7(this);
        this.access000 = new NativeAdsFeedVideoView$.ExternalSyntheticLambda8(this);
        this.ICustomTabsCallback = new IAuthTabCallback();
        this.getInterfaceDescriptor = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$lifecycleObserver$1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    int i5 = 95 / 0;
                }
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    int i5 = 59 / 0;
                }
                int i6 = onNavigationEvent + 41;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 53;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = onExtraCallback + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 113;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                NativeAdsFeedVideoView.onNavigationEvent(this.IAuthTabCallback, true);
                this.IAuthTabCallback.onWarmupCompleted();
                int i5 = onNavigationEvent + 93;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                NativeAdsFeedVideoView nativeAdsFeedVideoView;
                boolean z;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    nativeAdsFeedVideoView = this.IAuthTabCallback;
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    nativeAdsFeedVideoView = this.IAuthTabCallback;
                    z = false;
                }
                NativeAdsFeedVideoView.onNavigationEvent(nativeAdsFeedVideoView, z);
                NativeAdsFeedVideoView.access000(this.IAuthTabCallback);
                int i4 = onNavigationEvent + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsFeedVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallbackStubProxy + 117;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallbackStub + 59;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 5;
            } else {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsFeedVideoView nativeAdsFeedVideoView, String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.onNavigationEvent(str, z);
        int i4 = ICustomTabsCallbackStub + 99;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public static final /* synthetic */ ExoPlayer IAuthTabCallbackStub(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsFeedVideoView.extraCallbackWithResult;
        if (i3 == 0) {
            return exoPlayer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access000(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsFeedVideoView.getInterfaceDescriptor();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access100(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.IAuthTabCallbackStubProxy();
        int i4 = ICustomTabsCallbackStub + 99;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean asBinder(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 119;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = nativeAdsFeedVideoView.onRelationshipValidationResult;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 25;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ String asInterface(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 77;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = nativeAdsFeedVideoView.writeTypedObject;
        if (i4 == 0) {
            int i5 = 48 / 0;
        }
        int i6 = i2 + 101;
        ICustomTabsCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.IAuthTabCallback_Parcel();
        int i4 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getRootAlpha onExtraCallback(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 23;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getRootAlpha getrootalpha = nativeAdsFeedVideoView.onWarmupCompleted;
        int i5 = i2 + 29;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getrootalpha;
    }

    public static final /* synthetic */ Function1 onExtraCallbackWithResult(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 69;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsFeedVideoView.access100;
        int i5 = i3 + 105;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsFeedVideoView nativeAdsFeedVideoView, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 17;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        nativeAdsFeedVideoView.onRelationshipValidationResult = z;
        int i5 = i3 + 85;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 63;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {nativeAdsFeedVideoView};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        if (i3 != 0) {
            IAuthTabCallback(iOnExtraCallback, iOnExtraCallback4, iOnExtraCallback3, objArr2, iOnExtraCallback2, -1203633377, 1203633379);
            throw null;
        }
        IAuthTabCallback(iOnExtraCallback, iOnExtraCallback4, iOnExtraCallback3, objArr2, iOnExtraCallback2, -1203633377, 1203633379);
        int i4 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = nativeAdsFeedVideoView.onNavigationEvent;
        int i5 = i3 + 21;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsFeedVideoView nativeAdsFeedVideoView, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 69;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.onNavigationEvent = str;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsFeedVideoView nativeAdsFeedVideoView, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        nativeAdsFeedVideoView.IAuthTabCallbackStub = z;
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        int i6 = i3 + 9;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean zBooleanValue;
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback2, -268195092, 268195100)).booleanValue();
            int i3 = 0 / 0;
        } else {
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback4, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback6, new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback5, -268195092, 268195100)).booleanValue();
        }
        int i4 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static final /* synthetic */ void onTransact(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.asBinder();
        int i4 = ICustomTabsCallbackStubProxy + 23;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.IAuthTabCallbackDefault();
        int i4 = ICustomTabsCallbackStubProxy + 27;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback_Parcel(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        boolean z;
        int i = 2 % 2;
        if (!nativeAdsFeedVideoView.IAuthTabCallback || nativeAdsFeedVideoView.IAuthTabCallbackStub) {
            int i2 = ICustomTabsCallbackStub + 31;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            int i4 = ICustomTabsCallbackStubProxy + 79;
            ICustomTabsCallbackStub = i4 % 128;
            z = true;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
                if (!nativeAdsFeedVideoView.asInterface()) {
                }
            } else if (!nativeAdsFeedVideoView.asInterface()) {
            }
        }
        if (Intrinsics.areEqual(nativeAdsFeedVideoView.onTransact, Boolean.valueOf(z))) {
            return;
        }
        int i6 = ICustomTabsCallbackStub + 93;
        ICustomTabsCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            nativeAdsFeedVideoView.onTransact = Boolean.valueOf(z);
            int i7 = 56 / 0;
            if (z) {
                return;
            }
        } else {
            nativeAdsFeedVideoView.onTransact = Boolean.valueOf(z);
            if (z) {
                return;
            }
        }
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(nativeAdsFeedVideoView);
    }

    private static final void onNavigationEvent(NativeAdsFeedVideoView nativeAdsFeedVideoView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        nativeAdsFeedVideoView.getInterfaceDescriptor();
        if (i11 == 0) {
            int i12 = 37 / 0;
        }
        int i13 = ICustomTabsCallbackStubProxy + 73;
        ICustomTabsCallbackStub = i13 % 128;
        int i14 = i13 % 2;
    }

    public static final class IAuthTabCallback implements Player.Listener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback() {
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 103;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            if (i3 % 2 == 0) {
                if (i != 2) {
                    return;
                }
            } else if (i != 4) {
                return;
            }
            int i5 = i4 + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            NativeAdsFeedVideoView.onWarmupCompleted(NativeAdsFeedVideoView.this);
            if (!NativeAdsFeedVideoView.asBinder(NativeAdsFeedVideoView.this)) {
                NativeAdsFeedVideoView.onExtraCallbackWithResult(NativeAdsFeedVideoView.this, true);
                Function1 function1OnExtraCallbackWithResult = NativeAdsFeedVideoView.onExtraCallbackWithResult(NativeAdsFeedVideoView.this);
                if (function1OnExtraCallbackWithResult != null) {
                    int i7 = onExtraCallback + 17;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                }
            }
            Object[] objArr = {NativeAdsFeedVideoView.this};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            if (!((Boolean) NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback2, 362494695, -362494690)).booleanValue()) {
                return;
            }
            ExoPlayer exoPlayerIAuthTabCallbackStub = NativeAdsFeedVideoView.IAuthTabCallbackStub(NativeAdsFeedVideoView.this);
            if (exoPlayerIAuthTabCallbackStub != null) {
                exoPlayerIAuthTabCallbackStub.seekTo(0L);
            }
            ExoPlayer exoPlayerIAuthTabCallbackStub2 = NativeAdsFeedVideoView.IAuthTabCallbackStub(NativeAdsFeedVideoView.this);
            if (exoPlayerIAuthTabCallbackStub2 != null) {
                exoPlayerIAuthTabCallbackStub2.setPlayWhenReady(true);
            }
            ExoPlayer exoPlayerIAuthTabCallbackStub3 = NativeAdsFeedVideoView.IAuthTabCallbackStub(NativeAdsFeedVideoView.this);
            if (exoPlayerIAuthTabCallbackStub3 != null) {
                int i9 = onWarmupCompleted + 17;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                exoPlayerIAuthTabCallbackStub3.play();
                if (i10 == 0) {
                    int i11 = 46 / 0;
                }
                int i12 = onWarmupCompleted + 33;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        public void onIsPlayingChanged(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!z) {
                TdsImageView tdsImageView = NativeAdsFeedVideoView.onExtraCallback(NativeAdsFeedVideoView.this).IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(!removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(NativeAdsFeedVideoView.this) ? 0 : 8);
                NativeAdsFeedVideoView.getInterfaceDescriptor(NativeAdsFeedVideoView.this);
                return;
            }
            TdsImageView tdsImageView2 = NativeAdsFeedVideoView.onExtraCallback(NativeAdsFeedVideoView.this).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(8);
            Function1 function1OnExtraCallbackWithResult = NativeAdsFeedVideoView.onExtraCallbackWithResult(NativeAdsFeedVideoView.this);
            if (function1OnExtraCallbackWithResult != null) {
                int i4 = onWarmupCompleted + 61;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                    throw null;
                }
                function1OnExtraCallbackWithResult.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
            }
            NativeAdsFeedVideoView.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{NativeAdsFeedVideoView.this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 381196659, -381196658);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onUnminimized[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 59697), 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(ICustomTabsCallbackDefault), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 32, 20220 - Color.argb(0, 0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, Process.getGidForName("") + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 101;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 49124);
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int i8 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 1493;
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iLastIndexOf, i8, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), 44 - KeyEvent.keyCodeFromString(""), 1494 - Color.alpha(0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            j = 0;
        }
        String str = new String(cArr);
        int i9 = $10 + 55;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit IAuthTabCallbackStub(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), "103");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 35;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 95;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), "202");
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallbackStub + 17;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), "202");
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getRootAlpha getrootalpha, onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (motionEvent != null) {
            int i5 = i3 + 83;
            ICustomTabsCallbackStub = i5 % 128;
            String str = null;
            if (i5 % 2 == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                Typography6 typography6 = getrootalpha.IAuthTabCallbackStubProxy;
                Intrinsics.checkNotNullExpressionValue(typography6, "");
                getstrokewidth.onExtraCallback((View) typography6, x, y);
                throw null;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            getStrokeWidth getstrokewidth2 = getStrokeWidth.onExtraCallback;
            Typography6 typography62 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography62, "");
            if (getstrokewidth2.onExtraCallback((View) typography62, x2, y2)) {
                str = "101";
            } else {
                Typography6 typography63 = getrootalpha.access100;
                Intrinsics.checkNotNullExpressionValue(typography63, "");
                if (getstrokewidth2.onExtraCallback((View) typography63, x2, y2)) {
                    int i6 = ICustomTabsCallbackStubProxy;
                    int i7 = i6 + 63;
                    ICustomTabsCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 + 65;
                    ICustomTabsCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    str = "102";
                }
            }
            onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), str);
        } else {
            onExtraCallback.onWarmupCompleted(onextracallback, feedVideo, feedVideo.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 59;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), "301");
            int i3 = 0 / 0;
            return Unit.INSTANCE;
        }
        onextracallback.onExtraCallbackWithResult(feedVideo, feedVideo.onWarmupCompleted(), "301");
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.onWarmupCompleted(onextracallback, feedVideo, feedVideo.onWarmupCompleted(), null, 4, null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 73;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) throws Throwable {
        String strOnWarmupCompleted;
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            strOnWarmupCompleted = feedVideo.onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionType(1L), 1 - Drawable.resolveOpacity(1, 1), (char) (31779 % TextUtils.getCapsMode("", 0, 0)), objArr);
            obj = objArr[0];
        } else {
            strOnWarmupCompleted = feedVideo.onWarmupCompleted();
            Object[] objArr2 = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L), Drawable.resolveOpacity(0, 0) + 1, (char) (1965 - TextUtils.getCapsMode("", 0, 0)), objArr2);
            obj = objArr2[0];
        }
        onextracallback.onExtraCallbackWithResult(feedVideo, strOnWarmupCompleted, ((String) obj).intern());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsFeedVideoView nativeAdsFeedVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 65;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFeedVideoView.asInterface = !nativeAdsFeedVideoView.asInterface;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback2, -670349701, 670349708);
        nativeAdsFeedVideoView.access100();
        if (!nativeAdsFeedVideoView.asInterface) {
            Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsFeedVideoView.access100;
            if (function1 != null) {
                function1.invoke(NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
            }
        } else {
            int i4 = ICustomTabsCallbackStub + 9;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                Function1<? super NativeAdsEventLogType, Unit> function12 = nativeAdsFeedVideoView.access100;
                if (function12 != null) {
                    function12.invoke(NativeAdsEventLogType.writeTypedObject.onExtraCallback);
                }
            } else {
                Function1<? super NativeAdsEventLogType, Unit> function13 = nativeAdsFeedVideoView.access100;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(@NotNull String str, @NotNull final NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull deleteProfile deleteprofile, boolean z, @NotNull List<? extends NativeAdsEventLogType> list, @NotNull Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull final onExtraCallback onextracallback) throws Throwable {
        boolean z2;
        int i;
        boolean z3;
        Configuration configuration;
        Integer num;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 103;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Integer num2 = 10;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(feedVideo, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        final getRootAlpha getrootalpha = this.onWarmupCompleted;
        if (Intrinsics.areEqual(this.extraCallback, str)) {
            NativeAdsDto.Creative.FeedVideo feedVideo2 = this.readTypedObject;
            if (Intrinsics.areEqual(feedVideo2 != null ? feedVideo2.getInterfaceDescriptor() : null, feedVideo.getInterfaceDescriptor())) {
                int i6 = ICustomTabsCallbackStub + 89;
                ICustomTabsCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            TdsImageView tdsImageView = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            this.IAuthTabCallback = false;
            this.onTransact = null;
            this.asInterface = true;
            this.IAuthTabCallbackStub = false;
            this.IAuthTabCallbackDefault = false;
            this.onRelationshipValidationResult = false;
            this.asBinder = false;
            this.onActivityResized = list;
            this.onPostMessage.clear();
            this.onActivityLayout.clear();
            this.onExtraCallback.clear();
            this.onExtraCallbackWithResult.clear();
            for (NativeAdsEventLogType nativeAdsEventLogType : list) {
                if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                    int i8 = ICustomTabsCallbackStubProxy + 15;
                    ICustomTabsCallbackStub = i8 % 128;
                    if (i8 % i2 == 0) {
                        this.onActivityLayout.add(Float.valueOf(((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() / 100.0f));
                        num2 = num2;
                        i2 = 2;
                    } else {
                        num = num2;
                        this.onActivityLayout.add(Float.valueOf(((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() / 100.0f));
                    }
                } else {
                    num = num2;
                    if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                        this.onPostMessage.add(Long.valueOf(((NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType).onExtraCallbackWithResult()));
                    } else {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                num2 = num;
                i2 = 2;
            }
        }
        Integer num3 = num2;
        this.access100 = function1;
        this.extraCallback = str;
        this.readTypedObject = feedVideo;
        View view = getrootalpha.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        int color = Color.parseColor(zOnExtraCallbackWithResult ? "#1cd9d9ff" : "#0d022047");
        int i9 = ICustomTabsCallbackStub + 21;
        ICustomTabsCallbackStubProxy = i9 % 128;
        int i10 = i9 % 2;
        this.onWarmupCompleted.asInterface.setStrokeColor(color);
        this.onWarmupCompleted.writeTypedObject.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff333d4b"));
        this.onWarmupCompleted.extraCallbackWithResult.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff8b95a1"));
        this.onWarmupCompleted.IAuthTabCallbackStubProxy.setTextColor(!zOnExtraCallbackWithResult ? Color.parseColor("#ff333d4b") : -1);
        this.onWarmupCompleted.access100.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff4e5968"));
        this.onWarmupCompleted.readTypedObject.setTextColor(Color.parseColor("#ff8b95a1"));
        this.onWarmupCompleted.IAuthTabCallbackDefault.setStrokeColor(color);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(getrootalpha.writeTypedObject, "103");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(getrootalpha.asInterface, "202");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(getrootalpha.IAuthTabCallbackStubProxy, "101");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(getrootalpha.access100, "102");
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(getrootalpha.ICustomTabsCallback, "301");
        ConstraintLayout constraintLayout = getrootalpha.IAuthTabCallbackStub;
        boolean z4 = z2;
        Object[] objArr = new Object[1];
        a(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1965), objArr);
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
        Typography6 typography6 = getrootalpha.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        View root = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography6, false, null, 0, root, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 97;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                NativeAdsFeedVideoView.onExtraCallback onextracallback2 = onextracallback;
                if (i13 != 0) {
                    Object[] objArr2 = {onextracallback2, feedVideo, (MotionEvent) obj};
                    int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    return (Unit) NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, iOnExtraCallback2, -1105562812, 1105562815);
                }
                Object[] objArr3 = {onextracallback2, feedVideo, (MotionEvent) obj};
                int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                throw null;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout2 = getrootalpha.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        View root2 = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout2, false, null, 0, root2, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onNavigationEvent + 117;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                NativeAdsFeedVideoView.onExtraCallback onextracallback2 = onextracallback;
                if (i13 != 0) {
                    return NativeAdsFeedVideoView.IAuthTabCallback(onextracallback2, feedVideo, (MotionEvent) obj);
                }
                NativeAdsFeedVideoView.IAuthTabCallback(onextracallback2, feedVideo, (MotionEvent) obj);
                throw null;
            }
        }, 1973, null);
        if (z) {
            Typography7 typography7 = getrootalpha.extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            typography7.setVisibility(0);
            getrootalpha.extraCallbackWithResult.setContentDescription(null);
            getrootalpha.extraCallbackWithResult.setFocusable(false);
            i = 8;
        } else {
            getrootalpha.writeTypedObject.setMinHeight(setTagsokhttp.onExtraCallbackWithResult(this, 36));
            Typography7 typography72 = getrootalpha.extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            i = 8;
            typography72.setVisibility(8);
        }
        if (!(!StringsKt.isBlank(feedVideo.asInterface()))) {
            Typography6 typography62 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography62, "");
            typography62.setVisibility(i);
            ConstraintLayout constraintLayout2 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(i);
            View view2 = getrootalpha.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(0);
        } else {
            int i11 = ICustomTabsCallbackStubProxy + 39;
            ICustomTabsCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            getrootalpha.IAuthTabCallbackStubProxy.setText(feedVideo.asInterface());
            View view3 = getrootalpha.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(8);
            ConstraintLayout constraintLayout3 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            Typography6 typography63 = getrootalpha.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(typography63, "");
            typography63.setVisibility(0);
            if (StringsKt.isBlank(feedVideo.IAuthTabCallbackStub())) {
                Typography6 typography64 = getrootalpha.access100;
                Intrinsics.checkNotNullExpressionValue(typography64, "");
                typography64.setVisibility(8);
            } else {
                getrootalpha.access100.setText(feedVideo.IAuthTabCallbackStub());
                Typography6 typography65 = getrootalpha.access100;
                Intrinsics.checkNotNullExpressionValue(typography65, "");
                typography65.setVisibility(0);
            }
            getrootalpha.onTransact.setContentDescription(StringsKt.isBlank(feedVideo.IAuthTabCallbackStub()) ? feedVideo.asInterface() : feedVideo.asInterface() + ", " + feedVideo.IAuthTabCallbackStub());
            getrootalpha.onTransact.setImportantForAccessibility(1);
            getrootalpha.onTransact.setFocusable(true);
            ConstraintLayout constraintLayout4 = getrootalpha.onTransact;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            View root3 = this.onWarmupCompleted.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout4, false, null, 0, root3, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 15;
                    onWarmupCompleted = i14 % 128;
                    Object obj2 = null;
                    if (i14 % 2 != 0) {
                        NativeAdsFeedVideoView.onWarmupCompleted(getrootalpha, onextracallback, feedVideo, (MotionEvent) obj);
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = NativeAdsFeedVideoView.onWarmupCompleted(getrootalpha, onextracallback, feedVideo, (MotionEvent) obj);
                    int i15 = onWarmupCompleted + 5;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }, 1973, null);
        }
        if (z4) {
            z3 = false;
        } else {
            TdsImageView tdsImageView3 = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "ivThumbnail");
            TdsImageView.setImage$default(tdsImageView3, feedVideo.access000(), (Function1) null, (Function1) null, 6, (Object) null);
            TdsImageView tdsImageView4 = getrootalpha.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "ivThumbnail");
            z3 = false;
            tdsImageView4.setVisibility(0);
            access100();
        }
        getrootalpha.IAuthTabCallback.setContentDescription(null);
        getrootalpha.IAuthTabCallback.setImportantForAccessibility(2);
        getrootalpha.IAuthTabCallback.setFocusable(z3);
        FrameLayout frameLayout = getrootalpha.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        View root4 = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, frameLayout, false, null, 0, root4, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                Unit unit2;
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 7;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    Object[] objArr2 = {onextracallback, feedVideo, (MotionEvent) obj};
                    int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    unit2 = (Unit) NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, iOnExtraCallback2, -824174132, 824174132);
                    int i15 = 4 / 0;
                } else {
                    Object[] objArr3 = {onextracallback, feedVideo, (MotionEvent) obj};
                    int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    unit2 = (Unit) NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback3, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr3, iOnExtraCallback4, -824174132, 824174132);
                }
                int i16 = onExtraCallback + 123;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                return unit2;
            }
        }, 1973, null);
        View root5 = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root5, false, null, 0, null, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i13 = 2 % 2;
                int i14 = onExtraCallbackWithResult + 117;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsFeedVideoView.onExtraCallbackWithResult(onextracallback, feedVideo, (MotionEvent) obj);
                int i16 = onExtraCallbackWithResult + 41;
                onExtraCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 55 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 1981, null);
        ConstraintLayout constraintLayout5 = getrootalpha.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        View root6 = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout5, false, null, 0, root6, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i13 = 2 % 2;
                int i14 = IAuthTabCallback + 43;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                NativeAdsFeedVideoView.onExtraCallback onextracallback2 = onextracallback;
                if (i15 != 0) {
                    return NativeAdsFeedVideoView.onWarmupCompleted(onextracallback2, feedVideo, (MotionEvent) obj);
                }
                NativeAdsFeedVideoView.onWarmupCompleted(onextracallback2, feedVideo, (MotionEvent) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout3 = getrootalpha.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        View root7 = this.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root7, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout3, false, null, 0, root7, null, 0.0f, 0.99f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i13 = 2 % 2;
                int i14 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsFeedVideoView.onExtraCallbackWithResult(this.f$0, (MotionEvent) obj);
                int i16 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 4021, null);
        if (StringsKt.isBlank(feedVideo.IAuthTabCallbackStubProxy())) {
            getrootalpha.extraCallback.setText(getContext().getString(R.string.ads_sdk_text_more));
        } else {
            getrootalpha.extraCallback.setText(feedVideo.IAuthTabCallbackStubProxy());
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
        onNavigationEvent(feedVideo.getInterfaceDescriptor(), z4);
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
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.writeTypedObject.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, num3));
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getrootalpha.extraCallbackWithResult.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, num3));
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
            requestLayout();
        }
        Unit unit2 = Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Player.Listener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ NativeAdsFeedVideoView IAuthTabCallback;
        final /* synthetic */ String onWarmupCompleted;

        onWarmupCompleted(String str, NativeAdsFeedVideoView nativeAdsFeedVideoView) {
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = nativeAdsFeedVideoView;
        }

        public void onPlayerError(PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(playbackException, "");
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(this.onWarmupCompleted);
            if (strOnExtraCallbackWithResult != null) {
                int i2 = onNavigationEvent + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!Intrinsics.areEqual(NativeAdsFeedVideoView.onNavigationEvent(this.IAuthTabCallback), strOnExtraCallbackWithResult)) {
                    int i4 = onNavigationEvent + 121;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        NativeAdsFeedVideoView.onNavigationEvent(this.IAuthTabCallback, strOnExtraCallbackWithResult);
                        NativeAdsFeedVideoView.asInterface(this.IAuthTabCallback);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    NativeAdsFeedVideoView.onNavigationEvent(this.IAuthTabCallback, strOnExtraCallbackWithResult);
                    NativeAdsFeedVideoView nativeAdsFeedVideoView = this.IAuthTabCallback;
                    String strAsInterface = NativeAdsFeedVideoView.asInterface(nativeAdsFeedVideoView);
                    if (strAsInterface != null) {
                        strOnExtraCallbackWithResult = strAsInterface;
                    }
                    NativeAdsFeedVideoView.IAuthTabCallback(nativeAdsFeedVideoView, strOnExtraCallbackWithResult, false);
                    return;
                }
            }
            NativeAdsFeedVideoView.onTransact(this.IAuthTabCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str, boolean z) throws Throwable {
        String str2 = str;
        int i = 2 % 2;
        Object obj = null;
        if (!Intrinsics.areEqual(this.writeTypedObject, str2)) {
            this.writeTypedObject = str2;
            this.onNavigationEvent = null;
        }
        String str3 = this.onNavigationEvent;
        if (str3 != null) {
            str2 = str3;
        }
        if (Intrinsics.areEqual(this.onMinimized, str2)) {
            int i2 = ICustomTabsCallbackStub;
            int i3 = i2 + 93;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.extraCallbackWithResult != null) {
                int i4 = i2 + 67;
                ICustomTabsCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        this.onMinimized = str2;
        onTransact();
        if (StringsKt.isBlank(str2)) {
            TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            return;
        }
        CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayerIAuthTabCallback, context2, str2, false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        exoPlayerIAuthTabCallback.setPlayWhenReady(false);
        exoPlayerIAuthTabCallback.addListener(this.ICustomTabsCallback);
        exoPlayerIAuthTabCallback.addListener(new onWarmupCompleted(str2, this));
        this.extraCallbackWithResult = exoPlayerIAuthTabCallback;
        this.onWarmupCompleted.access000.setPlayer(exoPlayerIAuthTabCallback);
        this.onWarmupCompleted.access000.setUseController(false);
        this.onWarmupCompleted.access000.setKeepContentOnPlayerReset(true);
        if (!z) {
            int i5 = ICustomTabsCallbackStub + 109;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                TdsImageView tdsImageView2 = this.onWarmupCompleted.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(1);
            } else {
                TdsImageView tdsImageView3 = this.onWarmupCompleted.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                tdsImageView3.setVisibility(0);
            }
        }
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, -670349701, 670349708);
        access100();
        IAuthTabCallback_Parcel();
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onMinimized = "";
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this);
        TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        onTransact();
        int i4 = ICustomTabsCallbackStub + 59;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        getInterfaceDescriptor();
        int i4 = ICustomTabsCallbackStubProxy + 71;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsFeedVideoView.IAuthTabCallbackDefault = zBooleanValue;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getInterfaceDescriptor() {
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
            if (this.IAuthTabCallback) {
                if (!asInterface()) {
                    z = false;
                } else {
                    int i4 = ICustomTabsCallbackStub;
                    int i5 = i4 + 41;
                    ICustomTabsCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 83;
                    ICustomTabsCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                }
            }
        } else if (this.IAuthTabCallback) {
        }
        this.onTransact = Boolean.valueOf(z);
        if (!z) {
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this);
            return;
        }
        int i9 = ICustomTabsCallbackStubProxy + 51;
        ICustomTabsCallbackStub = i9 % 128;
        if (i9 % 2 != 0) {
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(this);
        } else {
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(this);
            int i10 = 45 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
            if (isAttachedToWindow()) {
                if (isShown()) {
                    int i4 = ICustomTabsCallbackStubProxy + 45;
                    ICustomTabsCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    FrameLayout frameLayout = this.onWarmupCompleted.ICustomTabsCallback;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    int width = frameLayout.getWidth() * frameLayout.getHeight();
                    if (width <= 0) {
                        return false;
                    }
                    Rect rect = new Rect();
                    if (!frameLayout.getGlobalVisibleRect(rect)) {
                        int i6 = ICustomTabsCallbackStub + 7;
                        ICustomTabsCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (((rect.width() * rect.height()) << 1) >= width) {
                        int i8 = ICustomTabsCallbackStub + 117;
                        ICustomTabsCallbackStubProxy = i8 % 128;
                        return i8 % 2 == 0;
                    }
                }
            }
        } else if (isAttachedToWindow()) {
        }
        return false;
    }

    @Override // o.endRearDisplaySession
    public void onExtraCallback() throws Throwable {
        int i = 2 % 2;
        if (this.IAuthTabCallback) {
            int i2 = ICustomTabsCallbackStubProxy + 7;
            int i3 = i2 % 128;
            ICustomTabsCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.onMinimized;
            if (str != null) {
                int i5 = i3 + 67;
                ICustomTabsCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                if (StringsKt.isBlank(str)) {
                    return;
                }
                int i7 = ICustomTabsCallbackStub + 37;
                ICustomTabsCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                if (this.extraCallbackWithResult == null) {
                    String str2 = this.onMinimized;
                    Intrinsics.checkNotNull(str2);
                    onNavigationEvent(str2, true);
                }
                ExoPlayer exoPlayer = this.extraCallbackWithResult;
                if (exoPlayer != null) {
                    int i9 = ICustomTabsCallbackStubProxy + 97;
                    ICustomTabsCallbackStub = i9 % 128;
                    if (i9 % 2 != 0 ? exoPlayer.getPlaybackState() == 1 : exoPlayer.getPlaybackState() == 0) {
                        ExoPlayer exoPlayer2 = this.extraCallbackWithResult;
                        if (exoPlayer2 != null) {
                            exoPlayer2.prepare();
                        }
                    }
                }
                ExoPlayer exoPlayer3 = this.extraCallbackWithResult;
                if (exoPlayer3 != null) {
                    int i10 = ICustomTabsCallbackStubProxy + 61;
                    ICustomTabsCallbackStub = i10 % 128;
                    if (i10 % 2 == 0) {
                        exoPlayer3.setPlayWhenReady(true);
                    } else {
                        exoPlayer3.setPlayWhenReady(true);
                    }
                }
                ExoPlayer exoPlayer4 = this.extraCallbackWithResult;
                if (exoPlayer4 != null) {
                    int i11 = ICustomTabsCallbackStub + 61;
                    ICustomTabsCallbackStubProxy = i11 % 128;
                    int i12 = i11 % 2;
                    exoPlayer4.play();
                    if (i12 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    @Override // o.endRearDisplaySession
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ExoPlayer exoPlayer = this.extraCallbackWithResult;
            if (exoPlayer != null) {
                exoPlayer.pause();
                int i3 = ICustomTabsCallbackStub + 113;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            ExoPlayer exoPlayer2 = this.extraCallbackWithResult;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(false);
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.endRearDisplaySession
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ExoPlayer exoPlayer = this.extraCallbackWithResult;
            if (exoPlayer != null) {
                exoPlayer.stop();
            }
            ExoPlayer exoPlayer2 = this.extraCallbackWithResult;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(false);
                int i3 = ICustomTabsCallbackStub + 83;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = ICustomTabsCallbackStubProxy + 43;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    @Override // o.endRearDisplaySession
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onTransact();
        int i4 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        IAuthTabCallback_Parcel();
        ExoPlayer exoPlayer = this.extraCallbackWithResult;
        if (exoPlayer != null) {
            int i2 = ICustomTabsCallbackStub + 121;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                exoPlayer.removeListener(this.ICustomTabsCallback);
            } else {
                exoPlayer.removeListener(this.ICustomTabsCallback);
                int i3 = 23 / 0;
            }
        }
        ExoPlayer exoPlayer2 = this.extraCallbackWithResult;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.extraCallbackWithResult = null;
        this.onWarmupCompleted.access000.setPlayer((Player) null);
        int i4 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        addOnLayoutChangeListener(this.access000);
        if (getViewTreeObserver().isAlive()) {
            int i2 = ICustomTabsCallbackStub + 21;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getViewTreeObserver().addOnScrollChangedListener(this.IAuthTabCallback_Parcel);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallbackStubProxy;
        if (textFieldScrollKtExternalSyntheticLambda0 != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) != null) {
            int i4 = ICustomTabsCallbackStubProxy + 71;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            lifecycle.onExtraCallbackWithResult(this.getInterfaceDescriptor);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle().IAuthTabCallback(this.getInterfaceDescriptor);
            int i6 = ICustomTabsCallbackStubProxy + 13;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } else {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = null;
        }
        this.IAuthTabCallbackStubProxy = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        getInterfaceDescriptor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 93;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            removeOnLayoutChangeListener(this.access000);
            getViewTreeObserver().isAlive();
            obj.hashCode();
            throw null;
        }
        removeOnLayoutChangeListener(this.access000);
        if (getViewTreeObserver().isAlive()) {
            int i3 = ICustomTabsCallbackStub + 65;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                getViewTreeObserver().removeOnScrollChangedListener(this.IAuthTabCallback_Parcel);
                int i4 = 97 / 0;
            } else {
                getViewTreeObserver().removeOnScrollChangedListener(this.IAuthTabCallback_Parcel);
            }
            int i5 = ICustomTabsCallbackStubProxy + 9;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallbackStubProxy;
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            int i7 = ICustomTabsCallbackStub + 49;
            ICustomTabsCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
            if (lifecycle != null) {
                lifecycle.onExtraCallbackWithResult(this.getInterfaceDescriptor);
            }
        }
        this.IAuthTabCallbackStubProxy = null;
        this.access100 = null;
        removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(this);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        float f;
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        ExoPlayer exoPlayer = nativeAdsFeedVideoView.extraCallbackWithResult;
        if (exoPlayer == null) {
            return null;
        }
        if (nativeAdsFeedVideoView.asInterface) {
            int i2 = ICustomTabsCallbackStub + 9;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            f = 0.0f;
        } else {
            int i4 = ICustomTabsCallbackStub + 35;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            f = 1.0f;
        }
        exoPlayer.setVolume(f);
        return null;
    }

    private final void access100() throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        TdsImageView tdsImageView = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (this.asInterface) {
            int i2 = ICustomTabsCallbackStubProxy + 111;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(0 % (ViewConfiguration.getMinimumFlingVelocity() % 121), 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() / 62), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 66, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                obj = objArr2[0];
            }
            String strIntern2 = ((String) obj).intern();
            int i3 = ICustomTabsCallbackStub + 75;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            strIntern = strIntern2;
        } else {
            Object[] objArr3 = new Object[1];
            a(69 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 66, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            strIntern = ((String) objArr3[0]).intern();
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r9 = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        r9.IAuthTabCallback_Parcel();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = ((NativeAdsFeedVideoView) r9).IAuthTabCallbackStubProxy;
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
            int i2 = ICustomTabsCallbackStubProxy + 97;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult((View) r9);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                return null;
            }
        }
        ((NativeAdsFeedVideoView) r9).onMessageChannelReady = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i4 = ICustomTabsCallbackStubProxy + 109;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private /* synthetic */ Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = NativeAdsFeedVideoView.this.new onExtraCallbackWithResult(access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 37;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            while (findRes.onWarmupCompleted(findresandmsg)) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    NativeAdsFeedVideoView.access100(NativeAdsFeedVideoView.this);
                    this.L$0 = findresandmsg;
                    this.label = 0;
                    if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    NativeAdsFeedVideoView.access100(NativeAdsFeedVideoView.this);
                    this.L$0 = findresandmsg;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.onMessageChannelReady;
        if (getpackagetype != null) {
            int i2 = ICustomTabsCallbackStub + 109;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = ICustomTabsCallbackStubProxy + 103;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
        }
        this.onMessageChannelReady = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[PHI: r1
      0x006c: PHI (r1v21 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>) = 
      (r1v20 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>)
      (r1v22 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>)
     binds: [B:26:0x006a, B:23:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStubProxy() {
        float fFloatValue;
        Function1<? super NativeAdsEventLogType, Unit> function1;
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.extraCallbackWithResult;
        if (exoPlayer != null) {
            long duration = exoPlayer.getDuration();
            if (duration > 0) {
                long jCoerceAtLeast = RangesKt.coerceAtLeast(exoPlayer.getCurrentPosition(), 0L);
                if ((!this.asBinder) && jCoerceAtLeast >= 2000) {
                    int i2 = ICustomTabsCallbackStub + 89;
                    ICustomTabsCallbackStubProxy = i2 % 128;
                    int i3 = i2 % 2;
                    List<? extends NativeAdsEventLogType> list = this.onActivityResized;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                                int i4 = ICustomTabsCallbackStub + 101;
                                ICustomTabsCallbackStubProxy = i4 % 128;
                                if (i4 % 2 != 0) {
                                    this.asBinder = true;
                                    function1 = this.access100;
                                    if (function1 != null) {
                                        function1.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                                    }
                                } else {
                                    this.asBinder = true;
                                    function1 = this.access100;
                                    if (function1 != null) {
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator<T> it2 = this.onActivityLayout.iterator();
                while (it2.hasNext()) {
                    int i5 = ICustomTabsCallbackStubProxy + 45;
                    ICustomTabsCallbackStub = i5 % 128;
                    if (i5 % 2 == 0) {
                        fFloatValue = ((Number) it2.next()).floatValue();
                        int i6 = 23 / 0;
                        if (!this.onExtraCallback.contains(Float.valueOf(fFloatValue))) {
                            if (jCoerceAtLeast < ((long) (duration * fFloatValue))) {
                                this.onExtraCallback.add(Float.valueOf(fFloatValue));
                                Function1<? super NativeAdsEventLogType, Unit> function12 = this.access100;
                                if (function12 != null) {
                                    function12.invoke(new NativeAdsEventLogType.extraCallback((long) (fFloatValue * 100.0f)));
                                }
                            }
                        }
                    } else {
                        fFloatValue = ((Number) it2.next()).floatValue();
                        if (!this.onExtraCallback.contains(Float.valueOf(fFloatValue))) {
                            if (jCoerceAtLeast < ((long) (duration * fFloatValue))) {
                            }
                        }
                    }
                }
                Iterator<T> it3 = this.onPostMessage.iterator();
                while (it3.hasNext()) {
                    int i7 = ICustomTabsCallbackStubProxy + 39;
                    ICustomTabsCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    long jLongValue = ((Number) it3.next()).longValue();
                    if ((!this.onExtraCallbackWithResult.contains(Long.valueOf(jLongValue))) && jCoerceAtLeast >= 1000 * jLongValue) {
                        this.onExtraCallbackWithResult.add(Long.valueOf(jLongValue));
                        Function1<? super NativeAdsEventLogType, Unit> function13 = this.access100;
                        if (function13 != null) {
                            function13.invoke(new NativeAdsEventLogType.extraCallbackWithResult(jLongValue));
                        }
                    }
                }
            }
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        if (this.onActivityLayout.contains(fValueOf)) {
            int i2 = ICustomTabsCallbackStubProxy + 101;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.contains(fValueOf);
                throw null;
            }
            if (!(!this.onExtraCallback.contains(fValueOf))) {
                return;
            }
            this.onExtraCallback.add(fValueOf);
            Function1<? super NativeAdsEventLogType, Unit> function1 = this.access100;
            if (function1 != null) {
                function1.invoke(new NativeAdsEventLogType.extraCallback(100L));
                int i3 = ICustomTabsCallbackStubProxy + 91;
                ICustomTabsCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (o.removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(r5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (o.removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(r5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r5 = im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView.ICustomTabsCallbackStub + 33;
        im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView.ICustomTabsCallbackStubProxy = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        NativeAdsFeedVideoView nativeAdsFeedVideoView = (NativeAdsFeedVideoView) objArr[0];
        int i = 2 % 2;
        if (!(!nativeAdsFeedVideoView.IAuthTabCallback) && !nativeAdsFeedVideoView.IAuthTabCallbackStub) {
            int i2 = ICustomTabsCallbackStub + 77;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (nativeAdsFeedVideoView.asInterface()) {
                int i4 = ICustomTabsCallbackStub + 83;
                ICustomTabsCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 0 / 0;
                }
            }
        }
        return false;
    }

    public interface onExtraCallback {
        void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            onextracallback.onExtraCallbackWithResult(feedVideo, str, str2);
        }
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback2, -12255059, 12255065);
    }

    public static /* synthetic */ Unit onNavigationEvent(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{onextracallback, feedVideo, motionEvent}, iOnExtraCallback2, -1105562812, 1105562815);
    }

    public static /* synthetic */ Unit onExtraCallback(onExtraCallback onextracallback, NativeAdsDto.Creative.FeedVideo feedVideo, MotionEvent motionEvent) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{onextracallback, feedVideo, motionEvent}, iOnExtraCallback2, -824174132, 824174132);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback2, 362494695, -362494690)).booleanValue();
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(NativeAdsFeedVideoView nativeAdsFeedVideoView) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{nativeAdsFeedVideoView}, iOnExtraCallback2, 381196659, -381196658);
    }

    private final void onNavigationEvent() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2, -670349701, 670349708);
    }

    private final boolean IAuthTabCallbackStub() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2, -268195092, 268195100)).booleanValue();
    }

    private final void access000() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2, -1203633377, 1203633379);
    }

    public final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback2, -1854618277, 1854618281);
    }
}
