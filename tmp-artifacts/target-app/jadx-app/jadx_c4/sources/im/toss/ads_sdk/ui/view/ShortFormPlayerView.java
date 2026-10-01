package im.toss.ads_sdk.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.view.ShortFormPlayerView$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.view.component.atom.image.TdsImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getPackageType;
import o.getStrokeWidth;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdaHj15cOoPiWk5EBmraCDXuOEYgM;
import o.setRandomHost;
import o.setViewPagerObserver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ShortFormPlayerView extends ConstraintLayout {
    public static final onExtraCallback Companion;
    private static int newSession;
    public static final int onWarmupCompleted;
    private static int prefetch;
    private getPackageType IAuthTabCallback;
    private final Set<Float> IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private Bitmap IAuthTabCallback_Parcel;
    private ValueAnimator ICustomTabsCallback;
    private getPackageType ICustomTabsCallbackDefault;
    private long ICustomTabsCallbackStub;
    private ValueAnimator ICustomTabsCallbackStubProxy;
    private final List<Long> ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private boolean access000;
    private boolean access100;
    private final long asBinder;
    private final Set<Long> asInterface;
    private long extraCallback;
    private TextFieldScrollKtExternalSyntheticLambda0 extraCallbackWithResult;
    private IAuthTabCallback extraCommand;
    private boolean getInterfaceDescriptor;
    private String isEngagementSignalsApiAvailable;
    private NativeAdsDto.Creative.ShortFormVideo mayLaunchUrl;
    private getPackageType onActivityLayout;
    private final onExtraCallbackWithResult onActivityResized;
    private boolean onExtraCallback;
    private final setViewPagerObserver onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private MediaMetadataRetriever onMinimized;
    private ExoPlayer onNavigationEvent;
    private final Rect onPostMessage;
    private final List<Float> onRelationshipValidationResult;
    private boolean onTransact;
    private List<? extends NativeAdsEventLogType> onUnminimized;
    private long readTypedObject;
    private long writeTypedObject;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int newSessionWithExtras = 1;
    private static int postMessage = 0;
    private static int newAuthTabSession = 1;

    public interface IAuthTabCallback {
        void IAuthTabCallback(@NotNull NativeAdsEventLogType nativeAdsEventLogType);

        void IAuthTabCallback(boolean z);

        void onExtraCallbackWithResult();

        void onExtraCallbackWithResult(@NotNull NativeAdsEventLogType nativeAdsEventLogType);

        void onNavigationEvent(@NotNull PlaybackException playbackException);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = i + 4;
        int i4 = (s * 3) + 105;
        int i5 = s2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i6;
            i2 = i7;
            int i8 = i3;
            int i9 = i4;
            int i10 = i8 + 1;
            bArr2[i2] = (byte) i9;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i3 = i10;
            i4 = bArr[i10];
            i6 = i9;
            i4 = (-i4) + i6;
            i2 = i7;
            int i82 = i3;
            int i92 = i4;
            int i102 = i82 + 1;
            bArr2[i2] = (byte) i92;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i3;
            int i922 = i4;
            int i1022 = i822 + 1;
            bArr2[i2] = (byte) i922;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    static {
        newSession = 0;
        asBinder();
        Companion = new onExtraCallback(null);
        onWarmupCompleted = 8;
        int i = newSessionWithExtras + 47;
        newSession = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShortFormPlayerView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public static /* synthetic */ void IAuthTabCallback(ShortFormPlayerView shortFormPlayerView, View view) {
        int i = 2 % 2;
        int i2 = postMessage + 11;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(shortFormPlayerView, view);
        int i4 = postMessage + 77;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        setViewPagerObserver setviewpagerobserver = (setViewPagerObserver) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{setviewpagerobserver, valueAnimator}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 328703562, -328703555);
            int i3 = 91 / 0;
            return null;
        }
        Object[] objArr2 = {setviewpagerobserver, valueAnimator};
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 328703562, -328703555);
        return null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i | i6)) | (~(i7 | i9));
        int i12 = ~(i9 | i5 | i6);
        int i13 = i5 + i6 + i2 + ((-194346734) * i4) + (9035316 * i3);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i6) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i2) + (1190920192 * i4) + (1456996352 * i3) + ((-1774911488) * i14);
        int i16 = (i5 * 1174986172) + 1294669563 + (i6 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i2 * 1174986385) + (i4 * (-1060063438)) + (i3 * 107475828) + (i14 * 168099840);
        switch (i15 + (i16 * i16 * 40566784)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
                int i17 = 2 % 2;
                int i18 = postMessage + 11;
                int i19 = i18 % 128;
                newAuthTabSession = i19;
                int i20 = i18 % 2;
                long j = shortFormPlayerView.writeTypedObject;
                int i21 = i19 + 65;
                postMessage = i21 % 128;
                int i22 = i21 % 2;
                return Long.valueOf(j);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access000(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ void onExtraCallback(setViewPagerObserver setviewpagerobserver) {
        int i = 2 % 2;
        int i2 = postMessage + 33;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setviewpagerobserver);
        int i4 = newAuthTabSession + 9;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(ShortFormPlayerView shortFormPlayerView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 11;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(shortFormPlayerView, view, motionEvent);
        int i4 = newAuthTabSession + 87;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(setViewPagerObserver setviewpagerobserver, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = postMessage + 39;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setviewpagerobserver, valueAnimator);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 51;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(shortFormPlayerView);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortFormPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.isEngagementSignalsApiAvailable = "301";
        setViewPagerObserver setviewpagerobserverIAuthTabCallback = setViewPagerObserver.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(setviewpagerobserverIAuthTabCallback, "");
        this.onExtraCallbackWithResult = setviewpagerobserverIAuthTabCallback;
        this.onPostMessage = new Rect();
        this.ICustomTabsCallback_Parcel = new ArrayList();
        this.onRelationshipValidationResult = new ArrayList();
        this.extraCallback = -1L;
        this.readTypedObject = -1L;
        this.asBinder = 10000L;
        this.IAuthTabCallbackDefault = new LinkedHashSet();
        this.asInterface = new LinkedHashSet();
        this.onActivityResized = new onExtraCallbackWithResult();
        getInterfaceDescriptor();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShortFormPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = postMessage + 31;
            int i3 = i2 % 128;
            newAuthTabSession = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ long IAuthTabCallback(ShortFormPlayerView shortFormPlayerView) {
        long jLongValue;
        int i = 2 % 2;
        int i2 = postMessage + 115;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            jLongValue = ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
            int i3 = 77 / 0;
        } else {
            jLongValue = ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
        }
        int i4 = newAuthTabSession + 101;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = newAuthTabSession + 123;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        shortFormPlayerView.writeTypedObject = jLongValue;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Set IAuthTabCallbackDefault(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 15;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        Set<Long> set = shortFormPlayerView.asInterface;
        int i5 = i3 + 23;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getPackageType IAuthTabCallbackStub(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 61;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = shortFormPlayerView.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        int i6 = i2 + 67;
        postMessage = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return getpackagetype;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        boolean z = shortFormPlayerView.getInterfaceDescriptor;
        int i5 = i3 + 57;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int access000(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 9;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        int i5 = shortFormPlayerView.onMessageChannelReady;
        if (i4 == 0) {
            int i6 = 7 / 0;
        }
        int i7 = i3 + 5;
        postMessage = i7 % 128;
        if (i7 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Set asBinder(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Set<Float> set = shortFormPlayerView.IAuthTabCallbackDefault;
        if (i3 == 0) {
            return set;
        }
        throw null;
    }

    public static final /* synthetic */ ExoPlayer asInterface(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 39;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = shortFormPlayerView.onNavigationEvent;
        int i5 = i3 + 79;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return exoPlayer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void extraCallback(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        shortFormPlayerView.IAuthTabCallbackStubProxy();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = postMessage + 85;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void extraCallbackWithResult(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 59;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        shortFormPlayerView.writeTypedObject();
        int i4 = postMessage + 41;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        boolean z = shortFormPlayerView.onTransact;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 93;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ void onExtraCallback(ShortFormPlayerView shortFormPlayerView, long j) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 117;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        shortFormPlayerView.IAuthTabCallbackStub = j;
        int i5 = i3 + 61;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(ShortFormPlayerView shortFormPlayerView, boolean z) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 55;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        shortFormPlayerView.access000 = z;
        int i5 = i3 + 13;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        shortFormPlayerView.IAuthTabCallbackDefault();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = postMessage + 67;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ setViewPagerObserver onExtraCallbackWithResult(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 17;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        setViewPagerObserver setviewpagerobserver = shortFormPlayerView.onExtraCallbackWithResult;
        int i5 = i3 + 41;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return setviewpagerobserver;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(ShortFormPlayerView shortFormPlayerView, String str) {
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        shortFormPlayerView.onExtraCallback(str);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(ShortFormPlayerView shortFormPlayerView, boolean z) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        shortFormPlayerView.onTransact = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 9;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 99;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = shortFormPlayerView.ICustomTabsCallbackDefault;
        int i5 = i2 + 61;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return getpackagetype;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 87;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        shortFormPlayerView.onTransact();
        int i4 = postMessage + 93;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(ShortFormPlayerView shortFormPlayerView, int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 115;
        int i4 = i3 % 128;
        postMessage = i4;
        int i5 = i3 % 2;
        shortFormPlayerView.onMessageChannelReady = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 25;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(ShortFormPlayerView shortFormPlayerView, long j) {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(j);
        if (i3 == 0) {
            onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView, lValueOf}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2071652452, -2071652446);
            throw null;
        }
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView, lValueOf}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2071652452, -2071652446);
        int i4 = postMessage + 59;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(ShortFormPlayerView shortFormPlayerView, PlaybackException playbackException) {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        shortFormPlayerView.onExtraCallback(playbackException);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(ShortFormPlayerView shortFormPlayerView, boolean z) {
        int i = 2 % 2;
        int i2 = postMessage + 47;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        shortFormPlayerView.access100 = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ long onTransact(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 1;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        long j = shortFormPlayerView.asBinder;
        int i5 = i2 + 97;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = shortFormPlayerView.access000();
        int i4 = postMessage + 43;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return unitAccess000;
    }

    public static final /* synthetic */ void onWarmupCompleted(ShortFormPlayerView shortFormPlayerView, long j) {
        int i = 2 % 2;
        int i2 = postMessage + 117;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        shortFormPlayerView.IAuthTabCallbackStubProxy = j;
        int i5 = i3 + 75;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(ShortFormPlayerView shortFormPlayerView, boolean z) {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        shortFormPlayerView.getInterfaceDescriptor = z;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = i3 + 27;
        postMessage = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void readTypedObject(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        int i4 = newAuthTabSession + 81;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 125;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ICustomTabsService;
        int i5 = i2 + 101;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setVideoCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 85;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsService = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 113;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IAuthTabCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 27;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = this.extraCommand;
        int i5 = i2 + 95;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public final void setVideoListener(@Nullable IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 3;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.extraCommand = iAuthTabCallback;
        int i5 = i3 + 83;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setTrackingData(@Nullable List<? extends NativeAdsEventLogType> list) {
        int i = 2 % 2;
        int i2 = postMessage + 31;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        this.onUnminimized = list;
        int i5 = i3 + 77;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onExtraCallbackWithResult implements Player.Listener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[PHI: r1
          0x0080: PHI (r1v32 o.getPackageType) = (r1v31 o.getPackageType), (r1v39 o.getPackageType) binds: [B:21:0x007e, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPlaybackStateChanged(int i) {
            getPackageType getpackagetype;
            int i2 = 2 % 2;
            setViewPagerObserver setviewpagerobserverOnExtraCallbackWithResult = ShortFormPlayerView.onExtraCallbackWithResult(ShortFormPlayerView.this);
            ShortFormPlayerView shortFormPlayerView = ShortFormPlayerView.this;
            ExoPlayer exoPlayerAsInterface = ShortFormPlayerView.asInterface(shortFormPlayerView);
            if (exoPlayerAsInterface != null) {
                if (i == 1) {
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1524118916, 1524118919);
                    int i3 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 / 0;
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView, null, 1, null}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 21510894, -21510885);
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                long duration = 0;
                if (i == 3) {
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1524118916, 1524118919);
                    ShortFormPlayerView.onWarmupCompleted(shortFormPlayerView, exoPlayerAsInterface.getDuration() > 0 ? exoPlayerAsInterface.getDuration() : 0L);
                    ShortFormPlayerView.onNavigationEvent(shortFormPlayerView);
                    ShortFormPlayerView.onExtraCallback(shortFormPlayerView, true);
                    if (exoPlayerAsInterface.getDuration() > 0) {
                        int i6 = onExtraCallbackWithResult + 89;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        duration = exoPlayerAsInterface.getDuration();
                        int i8 = onExtraCallbackWithResult + 77;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    ShortFormPlayerView.onExtraCallback(shortFormPlayerView, duration);
                    TdsImageView tdsImageView = setviewpagerobserverOnExtraCallbackWithResult.onWarmupCompleted;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    tdsImageView.setVisibility(8);
                    if (!ShortFormPlayerView.IAuthTabCallback_Parcel(shortFormPlayerView)) {
                        ShortFormPlayerView.onWarmupCompleted(shortFormPlayerView, true);
                        if (!exoPlayerAsInterface.isPlaying()) {
                            exoPlayerAsInterface.play();
                        }
                    }
                } else if (i == 4) {
                    if (!shortFormPlayerView.onExtraCallbackWithResult()) {
                        int i10 = onExtraCallbackWithResult + 69;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            getpackagetype = (getPackageType) ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -663904194, 663904198);
                            int i11 = 50 / 0;
                            if (getpackagetype != null) {
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                            }
                            ShortFormPlayerView.extraCallbackWithResult(shortFormPlayerView);
                            ShortFormPlayerView.IAuthTabCallback(shortFormPlayerView, "VIEW_COMPLETE", false, null, 6, null);
                            ShortFormPlayerView.onExtraCallbackWithResult(shortFormPlayerView, "VIEW_COMPLETE");
                            ShortFormPlayerView.onNavigationEvent(shortFormPlayerView, ShortFormPlayerView.access000(shortFormPlayerView) + 1);
                            ShortFormPlayerView.asBinder(shortFormPlayerView).clear();
                            ShortFormPlayerView.IAuthTabCallbackDefault(shortFormPlayerView).clear();
                        } else {
                            getpackagetype = (getPackageType) ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -663904194, 663904198);
                            if (getpackagetype != null) {
                            }
                            ShortFormPlayerView.extraCallbackWithResult(shortFormPlayerView);
                            ShortFormPlayerView.IAuthTabCallback(shortFormPlayerView, "VIEW_COMPLETE", false, null, 6, null);
                            ShortFormPlayerView.onExtraCallbackWithResult(shortFormPlayerView, "VIEW_COMPLETE");
                            ShortFormPlayerView.onNavigationEvent(shortFormPlayerView, ShortFormPlayerView.access000(shortFormPlayerView) + 1);
                            ShortFormPlayerView.asBinder(shortFormPlayerView).clear();
                            ShortFormPlayerView.IAuthTabCallbackDefault(shortFormPlayerView).clear();
                        }
                    }
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1524118916, 1524118919);
                    shortFormPlayerView.setVideoCompleted(true);
                    exoPlayerAsInterface.seekTo(0L);
                    exoPlayerAsInterface.pause();
                    IAuthTabCallback IAuthTabCallback = shortFormPlayerView.IAuthTabCallback();
                    if (IAuthTabCallback != null) {
                        int i12 = onExtraCallbackWithResult + 9;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            IAuthTabCallback.IAuthTabCallback(false);
                            return;
                        } else {
                            IAuthTabCallback.IAuthTabCallback(false);
                            return;
                        }
                    }
                }
            }
            int i13 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
        }

        public void onPlayerError(PlaybackException playbackException) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(playbackException, "");
            ShortFormPlayerView.onExtraCallbackWithResult(ShortFormPlayerView.this);
            ShortFormPlayerView.onNavigationEvent(ShortFormPlayerView.this, playbackException);
            int i4 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
        }

        public void onIsPlayingChanged(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ShortFormPlayerView.onExtraCallbackWithResult(ShortFormPlayerView.this);
            ShortFormPlayerView shortFormPlayerView = ShortFormPlayerView.this;
            ExoPlayer exoPlayerAsInterface = ShortFormPlayerView.asInterface(shortFormPlayerView);
            if (exoPlayerAsInterface == null) {
                int i4 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 62 / 0;
                    return;
                }
                return;
            }
            if (z) {
                ShortFormPlayerView.onExtraCallbackWithResult(shortFormPlayerView, true);
                ShortFormPlayerView.onExtraCallbackWithResult(shortFormPlayerView, "VIEW_START");
                if (((Long) ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2001189526, -2001189521)).longValue() == 0) {
                    Object[] objArr = {shortFormPlayerView, Long.valueOf(System.currentTimeMillis())};
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2121092400, -2121092398);
                }
                ShortFormPlayerView.onNavigationEvent(shortFormPlayerView);
                ShortFormPlayerView.onNavigationEvent(shortFormPlayerView, ShortFormPlayerView.IAuthTabCallback(shortFormPlayerView));
                ShortFormPlayerView.extraCallback(shortFormPlayerView);
                IAuthTabCallback IAuthTabCallback = shortFormPlayerView.IAuthTabCallback();
                if (IAuthTabCallback != null) {
                    IAuthTabCallback.IAuthTabCallback(true);
                }
            } else {
                int playbackState = exoPlayerAsInterface.getPlaybackState();
                if (ShortFormPlayerView.getInterfaceDescriptor(shortFormPlayerView) && playbackState != 2 && playbackState != 4) {
                    ShortFormPlayerView.IAuthTabCallback(shortFormPlayerView, "pause", true, null, 4, null);
                }
                ShortFormPlayerView.readTypedObject(shortFormPlayerView);
                int i6 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            ShortFormPlayerView.onNavigationEvent(shortFormPlayerView, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(prefetch)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35125), 23 - (ViewConfiguration.getEdgeSlop() >> 16), 10278 - View.MeasureSpec.getSize(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), 55 - View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            int i7 = $10 + 9;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i >>> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12844), 55 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            int i10 = $11 + 25;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        List<? extends NativeAdsEventLogType> list = this.onUnminimized;
        if (list != null) {
            int i2 = postMessage + 57;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            for (NativeAdsEventLogType nativeAdsEventLogType : list) {
                int i4 = postMessage + 9;
                newAuthTabSession = i4 % 128;
                int i5 = i4 % 2;
                if (!(!Intrinsics.areEqual(nativeAdsEventLogType.toString(), str))) {
                    IAuthTabCallback iAuthTabCallback = this.extraCommand;
                    if (iAuthTabCallback != null) {
                        int i6 = postMessage + 35;
                        newAuthTabSession = i6 % 128;
                        int i7 = i6 % 2;
                        iAuthTabCallback.IAuthTabCallback(nativeAdsEventLogType);
                        if (i7 == 0) {
                            throw null;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void setupVideoSlotRect(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 13;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.onPostMessage.set(rect);
        } else {
            Intrinsics.checkNotNullParameter(rect, "");
            this.onPostMessage.set(rect);
            throw null;
        }
    }

    private static final boolean onNavigationEvent(ShortFormPlayerView shortFormPlayerView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 69;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() == 1) {
            if (((Boolean) getStrokeWidth.onExtraCallback(1503549074, new Object[]{getStrokeWidth.onExtraCallback, shortFormPlayerView.onPostMessage, Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1503549069, GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue()) {
                int i4 = newAuthTabSession + 59;
                postMessage = i4 % 128;
                if (i4 % 2 != 0) {
                    IAuthTabCallback iAuthTabCallback = shortFormPlayerView.extraCommand;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IAuthTabCallback iAuthTabCallback2 = shortFormPlayerView.extraCommand;
                if (iAuthTabCallback2 != null) {
                    iAuthTabCallback2.onExtraCallbackWithResult(new NativeAdsEventLogType.onExtraCallback(shortFormPlayerView.isEngagementSignalsApiAvailable));
                }
            }
        }
        return true;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        setViewPagerObserver setviewpagerobserver = this.onExtraCallbackWithResult;
        setviewpagerobserver.onExtraCallback.setUseController(false);
        setviewpagerobserver.onExtraCallback.setShutterBackgroundColor(0);
        setviewpagerobserver.onExtraCallback.setKeepContentOnPlayerReset(true);
        setviewpagerobserver.onExtraCallback.setOnTouchListener(new ShortFormPlayerView$.ExternalSyntheticLambda1(this));
        setviewpagerobserver.IAuthTabCallback.setOnClickListener(new ShortFormPlayerView$.ExternalSyntheticLambda2(this));
        int i2 = newAuthTabSession + 19;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    private static final void onExtraCallback(ShortFormPlayerView shortFormPlayerView, View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 5;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (!shortFormPlayerView.access100) {
            shortFormPlayerView.extraCallbackWithResult();
            int i4 = postMessage + 47;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
        } else {
            shortFormPlayerView.access100();
        }
        IAuthTabCallback iAuthTabCallback = shortFormPlayerView.extraCommand;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult(new NativeAdsEventLogType.onExtraCallback(shortFormPlayerView.isEngagementSignalsApiAvailable));
        }
    }

    private static final void IAuthTabCallback(setViewPagerObserver setviewpagerobserver) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 37;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setviewpagerobserver.onExtraCallback.requestLayout();
        int i4 = newAuthTabSession + 19;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull ExoPlayer exoPlayer) {
        ExoPlayer exoPlayer2;
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(exoPlayer, "");
            this.onExtraCallback = true;
            exoPlayer2 = this.onNavigationEvent;
            if (exoPlayer2 == exoPlayer) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(exoPlayer, "");
            this.onExtraCallback = false;
            exoPlayer2 = this.onNavigationEvent;
            if (exoPlayer2 == exoPlayer) {
                return;
            }
        }
        if (exoPlayer2 != null) {
            exoPlayer2.removeListener(this.onActivityResized);
        }
        this.onNavigationEvent = exoPlayer;
        this.onExtraCallbackWithResult.onExtraCallback.setPlayer(exoPlayer);
        exoPlayer.addListener(this.onActivityResized);
        int i3 = newAuthTabSession + 79;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault();
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        ExoPlayer exoPlayer = this.onNavigationEvent;
        if (exoPlayer != null) {
            try {
                if (exoPlayer.isPlaying()) {
                    int i4 = postMessage + 67;
                    newAuthTabSession = i4 % 128;
                    if (i4 % 2 == 0) {
                        exoPlayer.pause();
                        int i5 = 52 / 0;
                    } else {
                        exoPlayer.pause();
                    }
                    int i6 = postMessage + 125;
                    newAuthTabSession = i6 % 128;
                    int i7 = i6 % 2;
                }
            } catch (Throwable unused) {
            }
            try {
                exoPlayer.setPlayWhenReady(false);
            } catch (Throwable unused2) {
            }
            try {
                exoPlayer.removeListener(this.onActivityResized);
                int i8 = newAuthTabSession + 121;
                postMessage = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable unused3) {
            }
        }
        this.onExtraCallbackWithResult.onExtraCallback.setPlayer((Player) null);
        this.onNavigationEvent = null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean z = false;
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 121;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        setViewPagerObserver setviewpagerobserver = shortFormPlayerView.onExtraCallbackWithResult;
        setviewpagerobserver.onExtraCallback.setVisibility(0);
        ExoPlayer exoPlayer = shortFormPlayerView.onNavigationEvent;
        if (exoPlayer != null && exoPlayer.getPlaybackState() == 3) {
            z = true;
        }
        shortFormPlayerView.getInterfaceDescriptor = z;
        if (!z) {
            return null;
        }
        shortFormPlayerView.getInterfaceDescriptor = true;
        TdsImageView tdsImageView = setviewpagerobserver.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        shortFormPlayerView.access100();
        ExoPlayer exoPlayer2 = shortFormPlayerView.onNavigationEvent;
        if (exoPlayer2 == null) {
            return null;
        }
        exoPlayer2.play();
        int i4 = postMessage + 83;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final Unit onNavigationEvent() {
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.onNavigationEvent;
        if (exoPlayer == null) {
            return null;
        }
        int i2 = postMessage + 55;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        if (exoPlayer.isPlaying()) {
            exoPlayer.pause();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 125;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        setViewPagerObserver setviewpagerobserver = this.onExtraCallbackWithResult;
        IAuthTabCallbackDefault();
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        ExoPlayer exoPlayer = this.onNavigationEvent;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        ExoPlayer exoPlayer2 = this.onNavigationEvent;
        if (exoPlayer2 != null) {
            int i2 = postMessage + 123;
            newAuthTabSession = i2 % 128;
            if (i2 % 2 == 0) {
                exoPlayer2.setPlayWhenReady(false);
            } else {
                exoPlayer2.setPlayWhenReady(false);
            }
            int i3 = newAuthTabSession + 91;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
        }
        TdsImageView tdsImageView = setviewpagerobserver.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        this.access000 = false;
        asInterface();
    }

    static /* synthetic */ void onWarmupCompleted(ShortFormPlayerView shortFormPlayerView, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = postMessage + 45;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            l = null;
        }
        shortFormPlayerView.onWarmupCompleted(l);
        int i4 = newAuthTabSession + 65;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(Long l) {
        int i = 2 % 2;
        setViewPagerObserver setviewpagerobserver = this.onExtraCallbackWithResult;
        IAuthTabCallback(this, "CLOSE", false, l, 2, null);
        this.onMessageChannelReady = 0;
        setviewpagerobserver.IAuthTabCallback.setAlpha(0.0f);
        setviewpagerobserver.onNavigationEvent.setAlpha(0.0f);
        ExoPlayer exoPlayer = this.onNavigationEvent;
        if (exoPlayer != null) {
            int i2 = postMessage + 35;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.seekTo(0L);
            int i4 = newAuthTabSession + 103;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        TdsImageView tdsImageView = setviewpagerobserver.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        this.access000 = false;
        IAuthTabCallbackDefault();
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        this.IAuthTabCallbackDefault.clear();
        this.asInterface.clear();
        asInterface();
        int i6 = postMessage + 75;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.onNavigationEvent;
        if (exoPlayer == null) {
            int i2 = postMessage + 67;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
        } else {
            if (!exoPlayer.isPlaying()) {
                access100();
                exoPlayer.play();
                return;
            }
            int i4 = newAuthTabSession + 79;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            access000();
            onNavigationEvent();
        }
    }

    private static final void onExtraCallback(setViewPagerObserver setviewpagerobserver, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            setviewpagerobserver.onNavigationEvent.setAlpha(fFloatValue);
            setviewpagerobserver.IAuthTabCallback.setAlpha(fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue2 = ((Float) animatedValue2).floatValue();
        setviewpagerobserver.onNavigationEvent.setAlpha(fFloatValue2);
        setviewpagerobserver.IAuthTabCallback.setAlpha(fFloatValue2);
        int i3 = postMessage + 45;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
    }

    private final Unit access100() {
        int i = 2 % 2;
        final setViewPagerObserver setviewpagerobserver = this.onExtraCallbackWithResult;
        asInterface();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(setviewpagerobserver.onNavigationEvent.getAlpha(), 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.ShortFormPlayerView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ShortFormPlayerView.onNavigationEvent(setviewpagerobserver, valueAnimator);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        this.ICustomTabsCallbackStubProxy = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        setViewPagerObserver setviewpagerobserver = (setViewPagerObserver) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 3;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            setviewpagerobserver.onNavigationEvent.setAlpha(fFloatValue);
            setviewpagerobserver.IAuthTabCallback.setAlpha(fFloatValue);
            return null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue2 = ((Float) animatedValue2).floatValue();
        setviewpagerobserver.onNavigationEvent.setAlpha(fFloatValue2);
        setviewpagerobserver.IAuthTabCallback.setAlpha(fFloatValue2);
        obj.hashCode();
        throw null;
    }

    private final Unit access000() {
        int i = 2 % 2;
        final setViewPagerObserver setviewpagerobserver = this.onExtraCallbackWithResult;
        asInterface();
        setviewpagerobserver.IAuthTabCallback.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(setviewpagerobserver.onNavigationEvent.getAlpha(), 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.ShortFormPlayerView$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {setviewpagerobserver, valueAnimator};
                if (i4 == 0) {
                    ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1910707796, -1910707785);
                    return;
                }
                ShortFormPlayerView.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1910707796, -1910707785);
                int i5 = 61 / 0;
            }
        });
        this.ICustomTabsCallback = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 55;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return unit;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 117;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        ValueAnimator valueAnimator = this.ICustomTabsCallbackStubProxy;
        Object obj = null;
        if (valueAnimator != null) {
            int i5 = i3 + 17;
            newAuthTabSession = i5 % 128;
            if (i5 % 2 != 0) {
                valueAnimator.cancel();
            } else {
                valueAnimator.cancel();
                obj.hashCode();
                throw null;
            }
        }
        ValueAnimator valueAnimator2 = this.ICustomTabsCallback;
        if (valueAnimator2 != null) {
            int i6 = postMessage + 55;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            valueAnimator2.cancel();
            if (i7 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() throws Throwable {
        int i = 2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 8, TextUtils.indexOf((CharSequence) "", '0', 0) + 3, new char[]{65535, 65534, 65534, 65535, 2, 65533, 65531, 14}, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 269, objArr);
        IAuthTabCallback(this, ((String) objArr[0]).intern(), false, null, 6, null);
        try {
            MediaMetadataRetriever mediaMetadataRetriever = this.onMinimized;
            if (mediaMetadataRetriever != null) {
                int i2 = newAuthTabSession + 117;
                postMessage = i2 % 128;
                int i3 = i2 % 2;
                mediaMetadataRetriever.release();
                int i4 = postMessage + 75;
                newAuthTabSession = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 4;
                }
            }
        } catch (Throwable unused) {
        }
        this.onMinimized = null;
        IAuthTabCallbackDefault();
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        onWarmupCompleted(this, null, 1, null);
        asInterface();
        IAuthTabCallbackStub();
        int i6 = postMessage + 125;
        newAuthTabSession = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void writeTypedObject(ShortFormPlayerView shortFormPlayerView) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 97;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsDto.Creative.ShortFormVideo shortFormVideo = shortFormPlayerView.mayLaunchUrl;
            Intrinsics.checkNotNull(shortFormVideo);
            onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView, shortFormVideo}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 759064346, -759064338);
            int i3 = 32 / 0;
        } else {
            NativeAdsDto.Creative.ShortFormVideo shortFormVideo2 = shortFormPlayerView.mayLaunchUrl;
            Intrinsics.checkNotNull(shortFormVideo2);
            onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView, shortFormVideo2}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 759064346, -759064338);
        }
        int i4 = postMessage + 89;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        ExoPlayer exoPlayer = this.onNavigationEvent;
        boolean z = false;
        if (exoPlayer != null && exoPlayer.isPlaying()) {
            z = true;
        }
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (this.mayLaunchUrl != null) {
            post(new ShortFormPlayerView$.ExternalSyntheticLambda4(this));
        }
        if (z) {
            TdsImageView tdsImageView = this.onExtraCallbackWithResult.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
            ExoPlayer exoPlayer2 = this.onNavigationEvent;
            if (exoPlayer2 != null) {
                int i6 = postMessage + 69;
                newAuthTabSession = i6 % 128;
                int i7 = i6 % 2;
                exoPlayer2.play();
                int i8 = postMessage + 91;
                newAuthTabSession = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            ExoPlayer exoPlayer = shortFormPlayerView.onNavigationEvent;
            if (exoPlayer == null) {
                return 0L;
            }
            long currentPosition = exoPlayer.getCurrentPosition();
            int i3 = postMessage + 111;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 != 0) {
                return Long.valueOf(currentPosition);
            }
            int i4 = 32 / 0;
            return Long.valueOf(currentPosition);
        }
        ExoPlayer exoPlayer2 = shortFormPlayerView.onNavigationEvent;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = postMessage + 55;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        if (i3 != 0) {
            this.ICustomTabsCallbackStub = ((Long) onExtraCallback(iOnExtraCallback, iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, -139728280, 139728281)).longValue();
            return;
        }
        this.ICustomTabsCallbackStub = ((Long) onExtraCallback(iOnExtraCallback, iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, -139728280, 139728281)).longValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(ShortFormPlayerView shortFormPlayerView, String str, boolean z, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = newAuthTabSession + 41;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            int i5 = newAuthTabSession + 47;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            l = null;
        }
        shortFormPlayerView.onNavigationEvent(str, z, l);
    }

    private final void onNavigationEvent(String str, boolean z, Long l) {
        long jLongValue;
        int i = 2 % 2;
        if (this.access100 || z) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
            }
            if (RangesKt.coerceAtLeast(jLongValue - this.ICustomTabsCallbackStub, 0L) <= 20) {
                int i2 = newAuthTabSession + 19;
                postMessage = i2 % 128;
                int i3 = i2 % 2;
                this.ICustomTabsCallbackStub = jLongValue;
                return;
            }
            if (!(!Intrinsics.areEqual(str, "CLOSE"))) {
                int i4 = newAuthTabSession + 21;
                postMessage = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallback("scroll");
            }
            this.ICustomTabsCallbackStub = ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        PlaybackException playbackException = (PlaybackException) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 97;
            newAuthTabSession = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            playbackException = null;
        }
        shortFormPlayerView.onExtraCallback(playbackException);
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ PlaybackException $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(PlaybackException playbackException, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$error = playbackException;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = ShortFormPlayerView.this.new onWarmupCompleted(this.$error, access13800Var);
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 27 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                long jOnTransact = ShortFormPlayerView.onTransact(ShortFormPlayerView.this);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jOnTransact, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 27;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            if (this.$error != null) {
                IAuthTabCallback IAuthTabCallback = ShortFormPlayerView.this.IAuthTabCallback();
                if (IAuthTabCallback != null) {
                    IAuthTabCallback.onNavigationEvent(this.$error);
                }
            } else {
                IAuthTabCallback IAuthTabCallback2 = ShortFormPlayerView.this.IAuthTabCallback();
                if (IAuthTabCallback2 != null) {
                    IAuthTabCallback2.onNavigationEvent(new PlaybackException("Timeout", (Throwable) null, 1003));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(PlaybackException playbackException) {
        int i = 2 % 2;
        IAuthTabCallbackDefault();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = this.extraCallbackWithResult;
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
            int i2 = newAuthTabSession + 97;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
                throw null;
            }
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                int i3 = postMessage + 67;
                newAuthTabSession = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        this.IAuthTabCallback = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onWarmupCompleted(playbackException, null), 2, (Object) null);
        this.onActivityLayout = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = ShortFormPlayerView.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r7.onExtraCallback() == true) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r7.onExtraCallback() == true) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            r7 = im.toss.ads_sdk.ui.view.ShortFormPlayerView.onNavigationEvent.onExtraCallbackWithResult + 23;
            im.toss.ads_sdk.ui.view.ShortFormPlayerView.onNavigationEvent.onNavigationEvent = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if ((r7 % 2) == 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        
            r6.label = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(500, r6) != r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r6.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(500, r6) != r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0051 -> B:26:0x005d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:26:0x005d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            getPackageType getpackagetypeIAuthTabCallbackStub;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getpackagetypeIAuthTabCallbackStub = ShortFormPlayerView.IAuthTabCallbackStub(ShortFormPlayerView.this);
                if (getpackagetypeIAuthTabCallbackStub != null) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            IAuthTabCallback IAuthTabCallback = ShortFormPlayerView.this.IAuthTabCallback();
            if (IAuthTabCallback != null) {
                int i3 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    IAuthTabCallback.onExtraCallbackWithResult();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                IAuthTabCallback.onExtraCallbackWithResult();
            }
            getpackagetypeIAuthTabCallbackStub = ShortFormPlayerView.IAuthTabCallbackStub(ShortFormPlayerView.this);
            if (getpackagetypeIAuthTabCallbackStub != null) {
                int i4 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                }
                IAuthTabCallback IAuthTabCallback2 = ShortFormPlayerView.this.IAuthTabCallback();
                if (IAuthTabCallback2 != null) {
                }
                getpackagetypeIAuthTabCallbackStub = ShortFormPlayerView.IAuthTabCallbackStub(ShortFormPlayerView.this);
                if (getpackagetypeIAuthTabCallbackStub != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = postMessage + 121;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallback;
        if (getpackagetype != null) {
            int i5 = i3 + 93;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.IAuthTabCallback = null;
        getPackageType getpackagetype2 = this.onActivityLayout;
        if (getpackagetype2 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
            int i7 = postMessage + 111;
            newAuthTabSession = i7 % 128;
            int i8 = i7 % 2;
        }
        this.onActivityLayout = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 5;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            if (this.ICustomTabsService) {
                return;
            }
        } else if (this.ICustomTabsService) {
            return;
        }
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
            return;
        }
        Object obj = null;
        this.ICustomTabsCallbackDefault = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onTransact(null), 2, (Object) null);
        int i4 = postMessage + 123;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private /* synthetic */ Object L$0;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = ShortFormPlayerView.this.new onTransact(access13800Var);
            ontransact.L$0 = obj;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            while (findRes.onWarmupCompleted(findresandmsg)) {
                ShortFormPlayerView.extraCallbackWithResult(ShortFormPlayerView.this);
                this.L$0 = findresandmsg;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i6 = IAuthTabCallback + 61;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onNavigationEvent + 93;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedObject() {
        long j;
        int i = 2 % 2;
        int i2 = postMessage + 93;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            j = this.IAuthTabCallbackStub;
            int i3 = 89 / 0;
            if (!isAttachedToWindow()) {
                return;
            }
        } else {
            j = this.IAuthTabCallbackStub;
            if (!isAttachedToWindow()) {
                return;
            }
        }
        if (j > 0) {
            long jLongValue = ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
            if (!this.onExtraCallback && jLongValue >= 2000) {
                List<? extends NativeAdsEventLogType> listEmptyList = this.onUnminimized;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<? extends NativeAdsEventLogType> list = listEmptyList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                            this.onExtraCallback = true;
                            onExtraCallback("VIEW");
                            break;
                        }
                    }
                }
            }
            if (!this.onRelationshipValidationResult.isEmpty()) {
                Iterator it2 = CollectionsKt.toList(this.onRelationshipValidationResult).iterator();
                while (it2.hasNext()) {
                    int i4 = postMessage + 111;
                    newAuthTabSession = i4 % 128;
                    int i5 = i4 % 2;
                    float fFloatValue = ((Number) it2.next()).floatValue();
                    if (!this.IAuthTabCallbackDefault.contains(Float.valueOf(fFloatValue))) {
                        int i6 = newAuthTabSession + 107;
                        postMessage = i6 % 128;
                        if (i6 % 2 != 0) {
                            if (jLongValue >= ((long) (j % fFloatValue))) {
                                onExtraCallback("VIEW_" + ((int) (100.0f * fFloatValue)) + "P");
                                this.IAuthTabCallbackDefault.add(Float.valueOf(fFloatValue));
                            }
                        } else if (jLongValue >= ((long) (j * fFloatValue))) {
                            onExtraCallback("VIEW_" + ((int) (100.0f * fFloatValue)) + "P");
                            this.IAuthTabCallbackDefault.add(Float.valueOf(fFloatValue));
                        }
                    }
                }
            }
            if (this.ICustomTabsCallback_Parcel.isEmpty()) {
                return;
            }
            Iterator it3 = CollectionsKt.toList(this.ICustomTabsCallback_Parcel).iterator();
            while (it3.hasNext()) {
                int i7 = newAuthTabSession + 23;
                postMessage = i7 % 128;
                int i8 = i7 % 2;
                long jLongValue2 = ((Number) it3.next()).longValue();
                if (!this.asInterface.contains(Long.valueOf(jLongValue2))) {
                    int i9 = newAuthTabSession + 23;
                    postMessage = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (jLongValue >= 1000 * jLongValue2) {
                            onExtraCallback("VIEW_" + jLongValue2 + "S");
                            this.asInterface.add(Long.valueOf(jLongValue2));
                        }
                    } else if (jLongValue >= 1000 * jLongValue2) {
                        onExtraCallback("VIEW_" + jLongValue2 + "S");
                        this.asInterface.add(Long.valueOf(jLongValue2));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r2
      0x0020: PHI (r2v5 o.getPackageType) = (r2v4 o.getPackageType), (r2v7 o.getPackageType) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getPackageType getpackagetype;
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            getpackagetype = shortFormPlayerView.ICustomTabsCallbackDefault;
            int i3 = 86 / 0;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i4 = newAuthTabSession + 27;
                postMessage = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            getpackagetype = shortFormPlayerView.ICustomTabsCallbackDefault;
            if (getpackagetype != null) {
            }
        }
        shortFormPlayerView.ICustomTabsCallbackDefault = null;
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        long jLongValue;
        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) objArr[0];
        long jLongValue2 = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        long j = shortFormPlayerView.IAuthTabCallbackStub;
        if (j > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = shortFormPlayerView.IAuthTabCallbackDefault.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (jLongValue2 < ((long) (j * fFloatValue))) {
                    int i2 = newAuthTabSession + 123;
                    postMessage = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(Float.valueOf(fFloatValue));
                        throw null;
                    }
                    arrayList.add(Float.valueOf(fFloatValue));
                    int i3 = postMessage + 73;
                    newAuthTabSession = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 2;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int i5 = postMessage + 77;
                newAuthTabSession = i5 % 128;
                int i6 = i5 % 2;
                shortFormPlayerView.IAuthTabCallbackDefault.removeAll(CollectionsKt.toSet(arrayList));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = shortFormPlayerView.asInterface.iterator();
            while (it2.hasNext()) {
                int i7 = postMessage + 57;
                newAuthTabSession = i7 % 128;
                if (i7 % 2 == 0) {
                    jLongValue = ((Number) it2.next()).longValue();
                    if (jLongValue2 < 1000 + jLongValue) {
                        arrayList2.add(Long.valueOf(jLongValue));
                    }
                } else {
                    jLongValue = ((Number) it2.next()).longValue();
                    if (jLongValue2 < 1000 * jLongValue) {
                        arrayList2.add(Long.valueOf(jLongValue));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                shortFormPlayerView.asInterface.removeAll(CollectionsKt.toSet(arrayList2));
            }
        }
        return null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public final Unit onWarmupCompleted(@NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsDto.Creative.ShortFormVideo shortFormVideo, @NotNull String str) {
        List<Float> list;
        float fIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(shortFormVideo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.mayLaunchUrl = shortFormVideo;
        this.isEngagementSignalsApiAvailable = str;
        this.IAuthTabCallbackStub = 0L;
        this.access000 = false;
        this.extraCallback = -1L;
        this.readTypedObject = -1L;
        this.IAuthTabCallback_Parcel = null;
        this.ICustomTabsCallbackStub = 0L;
        IAuthTabCallbackDefault();
        this.ICustomTabsCallback_Parcel.clear();
        this.onRelationshipValidationResult.clear();
        this.IAuthTabCallbackDefault.clear();
        this.asInterface.clear();
        this.onExtraCallback = false;
        this.onTransact = false;
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, shortFormVideo}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 759064346, -759064338);
        List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it.next()));
        }
        this.onUnminimized = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i2 = postMessage + 125;
            newAuthTabSession = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = ((NativeAdsEventLogType) it2.next()) instanceof NativeAdsEventLogType.extraCallback;
                throw null;
            }
            NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) it2.next();
            if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                int i3 = newAuthTabSession + 113;
                postMessage = i3 % 128;
                if (i3 % 2 != 0) {
                    list = this.onRelationshipValidationResult;
                    fIAuthTabCallback = ((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() + 100.0f;
                } else {
                    list = this.onRelationshipValidationResult;
                    fIAuthTabCallback = ((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() / 100.0f;
                }
                list.add(Float.valueOf(fIAuthTabCallback));
            } else if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                this.ICustomTabsCallback_Parcel.add(Long.valueOf(((NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType).onExtraCallbackWithResult()));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, im.toss.ads_sdk.ui.view.ShortFormPlayerView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z;
        ?? r2 = (ShortFormPlayerView) objArr[0];
        NativeAdsDto.Creative.ShortFormVideo shortFormVideo = (NativeAdsDto.Creative.ShortFormVideo) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        final setViewPagerObserver setviewpagerobserver = ((ShortFormPlayerView) r2).onExtraCallbackWithResult;
        ConstraintLayout.onExtraCallbackWithResult layoutParams = setviewpagerobserver.onExtraCallback.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = layoutParams;
        Context context = r2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (r8lambdaHj15cOoPiWk5EBmraCDXuOEYgM.onExtraCallbackWithResult(context)) {
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).width = -2;
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).height = -1;
            onextracallbackwithresult.ITrustedWebActivityCallback = 0;
            onextracallbackwithresult.ICustomTabsCallback = 0;
            onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
            onextracallbackwithresult.IAuthTabCallback = 0;
            onextracallbackwithresult.access000 = true;
            setviewpagerobserver.onExtraCallback.setLayoutParams(onextracallbackwithresult);
            setviewpagerobserver.onExtraCallback.setResizeMode(2);
        } else {
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).width = -1;
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).height = -2;
            onextracallbackwithresult.ITrustedWebActivityCallback = 0;
            onextracallbackwithresult.ICustomTabsCallback = 0;
            onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
            onextracallbackwithresult.IAuthTabCallback = 0;
            onextracallbackwithresult.asBinder = true;
            setviewpagerobserver.onExtraCallback.setLayoutParams(onextracallbackwithresult);
            setviewpagerobserver.onExtraCallback.setResizeMode(1);
        }
        setviewpagerobserver.onExtraCallback.requestLayout();
        r2.post(new Runnable() { // from class: im.toss.ads_sdk.ui.view.ShortFormPlayerView$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 79;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ShortFormPlayerView.onExtraCallback(setviewpagerobserver);
                    int i6 = 92 / 0;
                } else {
                    ShortFormPlayerView.onExtraCallback(setviewpagerobserver);
                }
                int i7 = onNavigationEvent + 87;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }
        });
        setviewpagerobserver.onWarmupCompleted.setScaleType(ImageView.ScaleType.FIT_CENTER);
        TdsImageView tdsImageView = ((ShortFormPlayerView) r2).onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, shortFormVideo.getInterfaceDescriptor(), (Function1) null, (Function1) null, 6, (Object) null);
        ExoPlayer exoPlayer = ((ShortFormPlayerView) r2).onNavigationEvent;
        boolean z2 = exoPlayer != null && exoPlayer.getPlaybackState() == 3;
        boolean z3 = exoPlayer != null && exoPlayer.isPlaying();
        TdsImageView tdsImageView2 = ((ShortFormPlayerView) r2).onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        if (!((ShortFormPlayerView) r2).access000) {
            int i4 = newAuthTabSession;
            int i5 = i4 + 11;
            postMessage = i5 % 128;
            int i6 = i5 % 2;
            if (!z2) {
                z = true;
            } else if (!z3) {
                int i7 = i4 + 105;
                int i8 = i7 % 128;
                postMessage = i8;
                z = i7 % 2 == 0;
                int i9 = i8 + 71;
                newAuthTabSession = i9 % 128;
                int i10 = i9 % 2;
            } else {
                z = false;
            }
        }
        tdsImageView2.setVisibility(z ^ true ? 8 : 0);
        return null;
    }

    public static final /* synthetic */ getPackageType access100(ShortFormPlayerView shortFormPlayerView) {
        return (getPackageType) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -663904194, 663904198);
    }

    public static final /* synthetic */ Unit ICustomTabsCallback(ShortFormPlayerView shortFormPlayerView) {
        return (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{shortFormPlayerView}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1707722963, 1707722963);
    }

    public static final /* synthetic */ void IAuthTabCallback(ShortFormPlayerView shortFormPlayerView, long j) {
        Object[] objArr = {shortFormPlayerView, Long.valueOf(j)};
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2121092400, -2121092398);
    }

    private final long IAuthTabCallback_Parcel() {
        return ((Long) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -139728280, 139728281)).longValue();
    }

    private final void onExtraCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2071652452, -2071652446);
    }

    private static final void IAuthTabCallback(setViewPagerObserver setviewpagerobserver, ValueAnimator valueAnimator) {
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{setviewpagerobserver, valueAnimator}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 328703562, -328703555);
    }

    private final void onWarmupCompleted(NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, shortFormVideo}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 759064346, -759064338);
    }

    static /* synthetic */ void onExtraCallbackWithResult(ShortFormPlayerView shortFormPlayerView, PlaybackException playbackException, int i, Object obj) {
        Object[] objArr = {shortFormPlayerView, playbackException, Integer.valueOf(i), obj};
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 21510894, -21510885);
    }

    private final void extraCallback() {
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1076374675, 1076374685);
    }

    public final void onWarmupCompleted() {
        onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1906653765, 1906653777);
    }

    static void asBinder() {
        prefetch = 478309006;
    }
}
