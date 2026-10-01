package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.R;
import im.toss.uikit.widget.TabBar$;
import im.toss.uikit.widget.TabBarItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import o.AFj1ySDK;
import o.Address;
import o.AppLovinSdkSettings;
import o.Cacheurls1;
import o.Challenge;
import o.ConvertFloatArrayToByteArray;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.ICrashCallback;
import o.RequestBodyCompanion;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TransitionKtExternalSyntheticLambda2;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access;
import o.access15300;
import o.attachAppLovinSdk;
import o.authParams;
import o.clearNumber;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.ensureCausesIsMutable;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.javaName;
import o.nSetPosition;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import o.setHasUserConsent;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProtocolsokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TabBar extends RoundBgView implements ICrashCallback {
    public static final IAuthTabCallback Companion;
    private static int newAuthTabSession = 1;
    private static int newSession = 1;
    private static int newSessionWithExtras;
    private static int prefetch;
    private float IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private onExtraCallback IAuthTabCallbackStubProxy;
    private ArrayList<TabBarItemView.IAuthTabCallback> IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private float ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private TabBarItemView ICustomTabsCallbackStubProxy;
    private onWarmupCompleted ICustomTabsCallback_Parcel;
    private final int ICustomTabsService;
    private float access000;
    private int access100;
    private final Lazy asBinder;
    private float asInterface;
    private final Lazy extraCallback;
    private onExtraCallbackWithResult extraCallbackWithResult;
    private final Lazy extraCommand;
    private final Paint getInterfaceDescriptor;
    private final Map<Integer, TabBarItemView> isEngagementSignalsApiAvailable;
    private Rally mayLaunchUrl;
    private final Lazy onActivityLayout;
    private int onActivityResized;
    private final long onExtraCallback;
    private final AFj1ySDK onExtraCallbackWithResult;
    private ArrayList<TabBarItemView.IAuthTabCallback> onMessageChannelReady;
    private final Lazy onMinimized;
    private float onNavigationEvent;
    private final boolean onPostMessage;
    private final Lazy onRelationshipValidationResult;
    private final Interpolator onTransact;
    private int onUnminimized;
    private final int onWarmupCompleted;
    private boolean postMessage;
    private final int readTypedObject;
    private runOnUiThreadDelayed writeTypedObject;

    public static final /* synthetic */ class asInterface {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.DEFAULT.ordinal()] = 1;
                int i = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onWarmupCompleted.FLOATING.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public interface onExtraCallbackWithResult {
        void IAuthTabCallback(int i);

        void IAuthTabCallback(@NotNull View view, int i);

        void onExtraCallback();
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = prefetch + 105;
        newAuthTabSession = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ int IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + Imgproc.COLOR_YUV2RGB_YVYU;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i4 = newSession + 69;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallback(TabBar tabBar) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 3;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iIntValue = ((Integer) onWarmupCompleted(2114378252, nSetPosition.onExtraCallbackWithResult(), -2114378233, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
        int i4 = newSession + 79;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TabBar tabBar, float f) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tabBar, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (i3 == 0) {
            return (Unit) onWarmupCompleted(1472600756, nSetPosition.onExtraCallbackWithResult(), -1472600750, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TabBar tabBar, Function0 function0) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 25;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tabBar, function0);
        int i4 = newSession + 75;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TabBarItemView tabBarItemView, TabBar tabBar, int i) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 45;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {tabBarItemView, tabBar, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (i4 != 0) {
            return (Unit) onWarmupCompleted(1549686270, nSetPosition.onExtraCallbackWithResult(), -1549686249, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        int i5 = 23 / 0;
        return (Unit) onWarmupCompleted(1549686270, nSetPosition.onExtraCallbackWithResult(), -1549686249, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallback(TabBarItemView tabBarItemView, boolean z, float f) {
        int i = 2 % 2;
        int i2 = newSession + 103;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tabBarItemView, z, f);
        int i4 = newSessionWithExtras + 73;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 15;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(585378840, nSetPosition.onExtraCallbackWithResult(), -585378826, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = newSessionWithExtras + 27;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 15;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return unitICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ Interpolator IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 37;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return isEngagementSignalsApiAvailable();
        }
        isEngagementSignalsApiAvailable();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 27;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(attachapplovinsdk);
        }
        IAuthTabCallbackDefault(attachapplovinsdk);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 37;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tabBar, iIntValue, iIntValue2);
        int i4 = newSessionWithExtras + 81;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 7;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tabBar, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = newSessionWithExtras + 47;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ deprecated_dns asBinder() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 29;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        deprecated_dns deprecated_dnsVar = (deprecated_dns) onWarmupCompleted(-340126100, nSetPosition.onExtraCallbackWithResult(), 340126111, new Object[0], iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = newSessionWithExtras + 69;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 45;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            extraCommand();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCommand = extraCommand();
        int i3 = newSession + Imgproc.COLOR_YUV2RGB_YVYU;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCommand;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 99;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (AppLovinSdkSettings) onWarmupCompleted(-671552313, nSetPosition.onExtraCallbackWithResult(), 671552326, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        TabBarItemView tabBarItemView = (TabBarItemView) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 25;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Integer.valueOf(iIntValue), tabBarItemView};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(-808321357, nSetPosition.onExtraCallbackWithResult(), 808321366, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
        int i4 = newSession + 123;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = newSession + 37;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tabBar, fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tabBar, fFloatValue);
        int i3 = newSessionWithExtras + 79;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Rally onExtraCallback(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSession + 113;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyAsBinder = asBinder(tabBarItemView);
        int i4 = newSession + 83;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return rallyAsBinder;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 69;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = asInterface(tabBar);
        int i4 = newSession + 57;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iAsInterface);
    }

    public static /* synthetic */ Unit onExtraCallback(TabBar tabBar, float f) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 89;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tabBar, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (i3 != 0) {
            return (Unit) onWarmupCompleted(353032995, nSetPosition.onExtraCallbackWithResult(), -353032978, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 1;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(attachapplovinsdk);
        }
        asBinder(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(int i, TabBarItemView tabBarItemView) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + Imgproc.COLOR_YUV2RGB_YVYU;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        boolean zAsInterface = asInterface(i, tabBarItemView);
        int i5 = newSessionWithExtras + 23;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return zAsInterface;
    }

    public static /* synthetic */ Rally onExtraCallbackWithResult(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 81;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Rally rally = (Rally) onWarmupCompleted(-503327346, nSetPosition.onExtraCallbackWithResult(), 503327349, new Object[]{tabBarItemView}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = newSessionWithExtras + 93;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, float f2, float f3, TabBar tabBar, float f4) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 105;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(f, f2, f3, tabBar, f4);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = newSessionWithExtras + 93;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TabBar tabBar, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 63;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tabBar, attachapplovinsdk);
        int i4 = newSession + 99;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TabBar tabBar, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tabBar, iAuthTabCallback, view);
        int i4 = newSessionWithExtras + 59;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TabBar tabBar, TabBarItemView tabBarItemView, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = newSession + 51;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tabBar, tabBarItemView, iAuthTabCallback, view);
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(tabBar, tabBarItemView, iAuthTabCallback, view);
        int i3 = newSession + 29;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ int onNavigationEvent(TabBar tabBar) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 57;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(tabBar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback = onExtraCallback(tabBar);
        int i3 = newSessionWithExtras + 31;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    public static /* synthetic */ Rally onNavigationEvent(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 25;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyOnTransact = onTransact(tabBarItemView);
        int i4 = newSessionWithExtras + 9;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return rallyOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, TabBar tabBar, float f3) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 101;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(f, f2, tabBar, f3);
        }
        IAuthTabCallback(f, f2, tabBar, f3);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 59;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = newSessionWithExtras + 113;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(int i, TabBarItemView tabBarItemView) {
        int i2 = 2 % 2;
        int i3 = newSession + 69;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(i, tabBarItemView);
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(i, tabBarItemView);
        int i4 = newSession + 11;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Rally onWarmupCompleted(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSession + 11;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(tabBarItemView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Rally rallyIAuthTabCallback = IAuthTabCallback(tabBarItemView);
        int i3 = newSessionWithExtras + 85;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return rallyIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TabBar tabBar, int i, float f) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 107;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(tabBar, i, f);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tabBar, i, f);
        int i4 = newSessionWithExtras + 63;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TabBar tabBar, Function0 function0) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 63;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tabBar, function0);
        int i4 = newSession + 43;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TabBarItemView tabBarItemView, TabBar tabBar) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 95;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(tabBarItemView, tabBar);
        }
        IAuthTabCallback(tabBarItemView, tabBar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 7;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(attachapplovinsdk);
        int i3 = newSession + 77;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onWarmupCompleted(boolean z, TabBar tabBar, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = newSession + 79;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(z, tabBar, iAuthTabCallback, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = newSessionWithExtras + 69;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBar(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFj1ySDK aFj1ySDKOnExtraCallbackWithResult = AFj1ySDK.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFj1ySDKOnExtraCallbackWithResult, "");
        this.onExtraCallbackWithResult = aFj1ySDKOnExtraCallbackWithResult;
        this.IAuthTabCallbackStub = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda31
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int iIAuthTabCallback = TabBar.IAuthTabCallback(context);
                if (i4 == 0) {
                    return Integer.valueOf(iIAuthTabCallback);
                }
                Integer.valueOf(iIAuthTabCallback);
                throw null;
            }
        });
        this.asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda32
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Integer numValueOf = Integer.valueOf(TabBar.onNavigationEvent(this.f$0));
                if (i4 == 0) {
                    int i5 = 8 / 0;
                }
                return numValueOf;
            }
        });
        this.ICustomTabsService = getResources().getDimensionPixelSize(R.dimen.bottom_tab_bar_height);
        this.readTypedObject = getResources().getDimensionPixelSize(R.dimen.floating_tab_bar_height);
        this.onWarmupCompleted = getResources().getDimensionPixelSize(R.dimen.back_circle_radius);
        this.asInterface = 1.0f;
        this.onNavigationEvent = 1.0f;
        this.IAuthTabCallback = 1.0f;
        Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.645f, 0.045f, 0.355f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback, "");
        this.onTransact = interpolatorIAuthTabCallback;
        this.onExtraCallback = 200L;
        this.ICustomTabsCallbackStub = -1;
        this.access100 = -1;
        this.onActivityResized = -1;
        this.IAuthTabCallback_Parcel = new ArrayList<>();
        this.ICustomTabsCallback_Parcel = onWarmupCompleted.DEFAULT;
        this.extraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda33
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                deprecated_dns deprecated_dnsVarAsBinder = TabBar.asBinder();
                int i5 = IAuthTabCallback + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return deprecated_dnsVarAsBinder;
            }
        });
        this.onMessageChannelReady = new ArrayList<>();
        this.ICustomTabsCallback = -1;
        this.onActivityLayout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda34
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                Integer numValueOf = Integer.valueOf(((Integer) TabBar.onWarmupCompleted(-1061381179, nSetPosition.onExtraCallbackWithResult(), 1061381184, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue());
                int i5 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return numValueOf;
                }
                throw null;
            }
        });
        this.onMinimized = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda35
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Integer numValueOf = Integer.valueOf(TabBar.IAuthTabCallback(this.f$0));
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 13 / 0;
                }
                return numValueOf;
            }
        });
        this.onRelationshipValidationResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda36
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Interpolator interpolatorIAuthTabCallbackStub = TabBar.IAuthTabCallbackStub();
                int i5 = onNavigationEvent + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return interpolatorIAuthTabCallbackStub;
            }
        });
        this.extraCommand = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda37
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) TabBar.onWarmupCompleted(-2067930, nSetPosition.onExtraCallbackWithResult(), 2067953, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
                int i5 = IAuthTabCallback + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 0;
                }
                return appLovinSdkSettings;
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = newSession + 55;
            newSessionWithExtras = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
        } else {
            int i5 = newSession + 85;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this.onPostMessage = z;
        this.isEngagementSignalsApiAvailable = new LinkedHashMap();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.getInterfaceDescriptor = paint;
        setRoundType(3);
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        setTopRadius(((Integer) onWarmupCompleted(-58124945, nSetPosition.onExtraCallbackWithResult(), 58124952, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue());
        setBgStrokeColor(RequestBodyCompanion.onNavigationEvent(this, authParams.BorderDefault));
        javaName javanameOnExtraCallback = Challenge.IAuthTabCallback.onExtraCallback();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setBgStrokeWidth(javanameOnExtraCallback.onWarmupCompleted(displayMetrics));
        setBgColor(RequestBodyCompanion.onNavigationEvent(this, authParams.BackgroundDefault));
        setShadow2SpreadDp(16);
        setProtocolsokhttp.IAuthTabCallback(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TabBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = newSession + 95;
            newSessionWithExtras = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = newSession + 23;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted DEFAULT = new onWarmupCompleted("DEFAULT", 0);
        public static final onWarmupCompleted FLOATING = new onWarmupCompleted("FLOATING", 1);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = DEFAULT;
                onWarmupCompleted onwarmupcompleted2 = FLOATING;
                onwarmupcompletedArr = new onWarmupCompleted[3];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{DEFAULT, FLOATING};
            }
            int i4 = i3 + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 != 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 5;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public interface onExtraCallback {
        void onExtraCallbackWithResult(int i, boolean z);

        static /* synthetic */ void onExtraCallbackWithResult(onExtraCallback onextracallback, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTabSelect");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            onextracallback.onExtraCallbackWithResult(i, z);
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 95;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) tabBar.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            number.intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = number.intValue();
        int i4 = newSessionWithExtras + 27;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iIntValue);
    }

    private static final int onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = newSession + 91;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
        int i4 = newSession + 23;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    private static final int onExtraCallback(TabBar tabBar) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = newSession + 69;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = tabBar.getResources().getDimensionPixelSize(R.dimen.bottom_tab_bar_translationY);
        int i4 = newSessionWithExtras + 103;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return dimensionPixelSize;
    }

    public final int access000() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 93;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.asBinder.getValue()).intValue();
        int i4 = newSessionWithExtras + 9;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 27;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = tabBar.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(-11, displayMetrics);
        int i4 = newSession + 105;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnNavigationEvent);
    }

    public final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 51;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.access100;
        int i6 = i2 + 33;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private final void onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 113;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(onwarmupcompleted);
            this.ICustomTabsCallback_Parcel = onwarmupcompleted;
        } else {
            onExtraCallbackWithResult(onwarmupcompleted);
            this.ICustomTabsCallback_Parcel = onwarmupcompleted;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 113;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (tabBar.ICustomTabsCallback_Parcel != onWarmupCompleted.FLOATING) {
            return false;
        }
        int i4 = newSessionWithExtras + 43;
        newSession = i4 % 128;
        return Boolean.valueOf(i4 % 2 != 0);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        deprecated_dns deprecated_dnsVar = new deprecated_dns(280.0d, 15.0d);
        int i2 = newSessionWithExtras + 43;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final deprecated_dns onMinimized() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 65;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.extraCallback.getValue();
        int i4 = newSessionWithExtras + 97;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newSession + 97;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onActivityLayout.getValue()).intValue();
        int i4 = newSessionWithExtras + 45;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int asInterface(TabBar tabBar) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 57;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(tabBar, 46);
        int i4 = newSession + 95;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return iIAuthTabCallback;
        }
        throw null;
    }

    private final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 89;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onMinimized.getValue()).intValue();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return iIntValue;
    }

    private final Interpolator onUnminimized() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 17;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.onRelationshipValidationResult.getValue();
        int i4 = newSession + 15;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Interpolator isEngagementSignalsApiAvailable() {
        Interpolator interpolatorIAuthTabCallback;
        int i = 2 % 2;
        int i2 = newSession + 111;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.25f, 0.25f, 0.75f, 0.75f);
            int i3 = 15 / 0;
        } else {
            interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.25f, 0.25f, 0.75f, 0.75f);
        }
        int i4 = newSessionWithExtras + 89;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return interpolatorIAuthTabCallback;
    }

    private final AppLovinSdkSettings ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = newSession + 57;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) this.extraCommand.getValue();
        int i4 = newSessionWithExtras + 43;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 111;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(tabBar.onUnminimized(), 500);
        int i4 = newSessionWithExtras + 97;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return appLovinSdkSettingsOnExtraCallback;
    }

    private final int onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = newSession + 93;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        authParams authparams = authParams.BorderDefault;
        if (i3 == 0) {
            return RequestBodyCompanion.onNavigationEvent(this, authparams);
        }
        RequestBodyCompanion.onNavigationEvent(this, authparams);
        throw null;
    }

    private static final Unit onNavigationEvent(TabBar tabBar, int i, float f) {
        int i2 = 2 % 2;
        int i3 = newSession + 45;
        newSessionWithExtras = i3 % 128;
        tabBar.setBgStrokeColor(i3 % 2 != 0 ? VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, (int) ((i >> 115) % f)) : VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, (int) ((i >>> 24) * f)));
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(float f, float f2, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = this.mayLaunchUrl;
        if (rally != null) {
            int i5 = i2 + 97;
            newSession = i5 % 128;
            if (i5 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        if (this.onPostMessage) {
            final int iOnRelationshipValidationResult = onRelationshipValidationResult();
            if (appLovinSdkSettings == null) {
                setBgStrokeColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(iOnRelationshipValidationResult, (int) ((iOnRelationshipValidationResult >>> 24) * f2)));
                return;
            }
            Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f2), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda14
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 63;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnWarmupCompleted = TabBar.onWarmupCompleted(this.f$0, iOnRelationshipValidationResult, ((Float) obj).floatValue());
                    int i9 = IAuthTabCallback + 55;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnWarmupCompleted;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            isFireOS.onExtraCallbackWithResult(rally2, false, 1, (Object) null);
            this.mayLaunchUrl = rally2;
        }
    }

    private final void onWarmupCompleted(runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 83;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed2 = this.writeTypedObject;
        if (runonuithreaddelayed2 != null) {
            int i5 = i2 + 119;
            newSession = i5 % 128;
            if (i5 % 2 == 0) {
                runonuithreaddelayed2.onNavigationEvent();
                throw null;
            }
            runonuithreaddelayed2.onNavigationEvent();
            int i6 = newSession + 79;
            newSessionWithExtras = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            }
        }
        this.writeTypedObject = runonuithreaddelayed;
    }

    private final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 5;
        int i3 = i2 % 128;
        newSession = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.access000 != f) {
            this.access000 = f;
            invalidate();
        } else {
            int i4 = i3 + 115;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // im.toss.uikit.widget.RoundBgView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        if (!(!this.onPostMessage)) {
            int i3 = newSession;
            int i4 = i3 + 111;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            if (this.access000 < 1.0f) {
                int i6 = i3 + 15;
                newSessionWithExtras = i6 % 128;
                int i7 = i6 % 2;
                if (onWarmupCompleted() > 0.0f) {
                    int i8 = newSession + 49;
                    newSessionWithExtras = i8 % 128;
                    if (i8 % 2 == 0 ? (i = (int) ((1.0f - this.access000) * 255.0f)) > 0 : (i = (int) ((2.0f % this.access000) * 255.0f)) > 0) {
                        this.getInterfaceDescriptor.setColor(RequestBodyCompanion.onNavigationEvent(this, authParams.BackgroundDefault));
                        this.getInterfaceDescriptor.setAlpha(i);
                        canvas.drawRect(0.0f, getHeight() - ((onWarmupCompleted() * 2.0f) + 1.0f), getWidth(), getHeight(), this.getInterfaceDescriptor);
                    }
                }
            }
        }
        int i9 = newSessionWithExtras + 69;
        newSession = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = newSession + 59;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.writeTypedObject;
        if (runonuithreaddelayed != null && runonuithreaddelayed.postMessage()) {
            int i3 = newSession + 63;
            newSessionWithExtras = i3 % 128;
            int i4 = i3 % 2;
            runOnUiThreadDelayed runonuithreaddelayed2 = this.writeTypedObject;
            if (runonuithreaddelayed2 != null) {
                runonuithreaddelayed2.IAuthTabCallback();
            }
        }
        int i5 = newSessionWithExtras + 91;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFloatingTabView$default(TabBar tabBar, List list, int i, boolean z, Set set, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 8) != 0) {
            int i4 = newSessionWithExtras + 103;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            set = clearNumber.onNavigationEvent();
        }
        tabBar.setFloatingTabView(list, i, z, set);
        int i6 = newSession + 55;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onExtraCallbackWithResult(TabBar tabBar, View view) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 7;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = tabBar.extraCallbackWithResult;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallback();
            int i4 = newSessionWithExtras + 47;
            newSession = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onWarmupCompleted(TabBar tabBar, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = newSession + 15;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = tabBar.extraCallbackWithResult;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.IAuthTabCallback(iAuthTabCallback.onExtraCallback());
            int i4 = newSession + 33;
            newSessionWithExtras = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onExtraCallback(TabBar tabBar, TabBarItemView tabBarItemView, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 13;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = tabBar.extraCallbackWithResult;
        if (i3 == 0) {
            throw null;
        }
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.IAuthTabCallback(tabBarItemView, iAuthTabCallback.onExtraCallback());
            int i4 = newSessionWithExtras + 75;
            newSession = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = newSessionWithExtras + 107;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, im.toss.uikit.widget.TabBarItemView, java.lang.Object] */
    public final void setFloatingTabView(@NotNull List<TabBarItemView.IAuthTabCallback> list, int i, boolean z, @NotNull Set<Integer> set) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        FrameLayout frameLayout = this.onExtraCallbackWithResult.onExtraCallback;
        frameLayout.setAlpha(0.0f);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = {this.f$0, view};
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                    TabBar.onWarmupCompleted(-89754304, nSetPosition.onExtraCallbackWithResult(), 89754314, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
                    int i5 = 40 / 0;
                } else {
                    Object[] objArr2 = {this.f$0, view};
                    int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                    TabBar.onWarmupCompleted(-89754304, nSetPosition.onExtraCallbackWithResult(), 89754314, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3);
                }
                int i6 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        });
        ICustomTabsService();
        this.onMessageChannelReady.addAll(list);
        for (final TabBarItemView.IAuthTabCallback iAuthTabCallback : this.onMessageChannelReady) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ?? tabBarItemView = new TabBarItemView(context, null, 0, 6, null);
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = 0;
            layoutParams2.height = -1;
            layoutParams2.weight = 1.0f;
            tabBarItemView.setLayoutParams(layoutParams);
            if (iAuthTabCallback.onExtraCallback() == i) {
                int i3 = newSession + 97;
                newSessionWithExtras = i3 % 128;
                int i4 = i3 % 2;
                tabBarItemView.setVisibility(4);
                DisplayMetrics displayMetrics = tabBarItemView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                Object[] objArr = {tabBarItemView, Integer.valueOf(varyMatches.onNavigationEvent(14, displayMetrics))};
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
            }
            if (iAuthTabCallback.onExtraCallback() == CollectionsKt__CollectionsKt.getLastIndex(this.onMessageChannelReady)) {
                int i5 = newSession + 99;
                newSessionWithExtras = i5 % 128;
                int i6 = i5 % 2;
                DisplayMetrics displayMetrics2 = tabBarItemView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult((View) tabBarItemView, varyMatches.onNavigationEvent(14, displayMetrics2));
            }
            tabBarItemView.setAlpha(0.0f);
            tabBarItemView.setTab(iAuthTabCallback);
            tabBarItemView.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 55;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    TabBar.onExtraCallbackWithResult(this.f$0, iAuthTabCallback, view);
                    int i10 = IAuthTabCallback + 83;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
            });
            if (z && !set.contains(Integer.valueOf(iAuthTabCallback.onExtraCallback()))) {
                tabBarItemView.setOnTouchListener(null);
                tabBarItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 119;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        boolean zOnExtraCallbackWithResult = TabBar.onExtraCallbackWithResult(this.f$0, tabBarItemView, iAuthTabCallback, view);
                        int i10 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 34 / 0;
                        }
                        return zOnExtraCallbackWithResult;
                    }
                });
                int i7 = newSessionWithExtras + 59;
                newSession = i7 % 128;
                int i8 = i7 % 2;
            }
            if (i == iAuthTabCallback.onExtraCallback()) {
                this.ICustomTabsCallbackStubProxy = tabBarItemView;
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult.addView(tabBarItemView);
        }
    }

    private final void ICustomTabsService() {
        int i = 2 % 2;
        int i2 = newSession + 29;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult.onExtraCallbackWithResult.getChildCount() > 1) {
            LinearLayout linearLayout = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        }
        int i4 = newSessionWithExtras + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(TabBar tabBar, TabBarItemView.IAuthTabCallback iAuthTabCallback, Function1 function1, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = newSessionWithExtras + 59;
            newSession = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            function1 = null;
        }
        if ((i & 4) != 0) {
            int i4 = newSession + 87;
            int i5 = i4 % 128;
            newSessionWithExtras = i5;
            z = i4 % 2 != 0;
            int i6 = i5 + 23;
            newSession = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
        }
        if ((i & 8) != 0) {
            int i8 = newSessionWithExtras;
            int i9 = i8 + 107;
            newSession = i9 % 128;
            boolean z3 = i9 % 2 == 0;
            int i10 = i8 + 41;
            newSession = i10 % 128;
            int i11 = i10 % 2;
            z2 = !z3;
        }
        tabBar.onWarmupCompleted(iAuthTabCallback, (Function1<? super TabBarItemView, Unit>) function1, z, z2);
    }

    private static final void IAuthTabCallback(boolean z, TabBar tabBar, TabBarItemView.IAuthTabCallback iAuthTabCallback, View view) {
        int i = 2 % 2;
        if (!z) {
            int i2 = newSessionWithExtras + 67;
            newSession = i2 % 128;
            if (i2 % 2 == 0) {
                tabBar.onWarmupCompleted(iAuthTabCallback.onExtraCallback());
                int i3 = 20 / 0;
            } else {
                tabBar.onWarmupCompleted(iAuthTabCallback.onExtraCallback());
            }
        }
        onExtraCallback onextracallback = tabBar.IAuthTabCallbackStubProxy;
        if (onextracallback != null) {
            onExtraCallback.onExtraCallbackWithResult(onextracallback, iAuthTabCallback.onExtraCallback(), false, 2, null);
            int i4 = newSessionWithExtras + 69;
            newSession = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.uikit.widget.TabBarItemView, java.lang.Object] */
    public final void onWarmupCompleted(@NotNull final TabBarItemView.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super TabBarItemView, Unit> function1, final boolean z, boolean z2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback_Parcel.add(iAuthTabCallback);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? tabBarItemView = new TabBarItemView(context, null, 0, 6, null);
        if (z) {
            tabBarItemView.onExtraCallback();
            int i2 = newSession + 87;
            newSessionWithExtras = i2 % 128;
            int i3 = i2 % 2;
        }
        tabBarItemView.setTab(iAuthTabCallback);
        tabBarItemView.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                boolean z3 = z;
                if (i6 != 0) {
                    TabBar.onWarmupCompleted(z3, this, iAuthTabCallback, view);
                } else {
                    TabBar.onWarmupCompleted(z3, this, iAuthTabCallback, view);
                    throw null;
                }
            }
        });
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tabBarItemView, Integer.valueOf(ICustomTabsCallbackDefault())}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult((View) tabBarItemView, ICustomTabsCallbackDefault());
        this.isEngagementSignalsApiAvailable.put(Integer.valueOf(iAuthTabCallback.onExtraCallback()), tabBarItemView);
        this.onExtraCallbackWithResult.IAuthTabCallback.addView(tabBarItemView);
        if (function1 != null) {
            function1.invoke(tabBarItemView);
            int i4 = newSession + 61;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
        }
        if (z2) {
            readTypedObject();
        }
    }

    public final void extraCallback() {
        int i = 2 % 2;
        int i2 = newSession + 1;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (!(!itIAuthTabCallback.hasNext())) {
            TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{itIAuthTabCallback.next()}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1272131073, -1272131071);
        }
        this.onExtraCallbackWithResult.IAuthTabCallback.removeAllViews();
        this.IAuthTabCallback_Parcel.clear();
        this.isEngagementSignalsApiAvailable.clear();
        int i4 = newSessionWithExtras + 85;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(int i) {
        TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = newSession + 53;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            iAuthTabCallbackOnWarmupCompleted = ((TabBarItemView) ensureCausesIsMutable.onNavigationEvent(onPostMessage(), i)).onWarmupCompleted();
            int i4 = 1 / 0;
            if (iAuthTabCallbackOnWarmupCompleted == null) {
                return;
            }
        } else {
            iAuthTabCallbackOnWarmupCompleted = ((TabBarItemView) ensureCausesIsMutable.onNavigationEvent(onPostMessage(), i)).onWarmupCompleted();
            if (iAuthTabCallbackOnWarmupCompleted == null) {
                return;
            }
        }
        onWarmupCompleted(iAuthTabCallbackOnWarmupCompleted.onExtraCallback());
        int i5 = newSession + 13;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = this.access100;
        if (i3 != i) {
            int i4 = newSession + Imgproc.COLOR_YUV2RGB_YVYU;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            this.ICustomTabsCallbackStub = i3;
            this.access100 = i;
        }
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            TabBarItemView next = itIAuthTabCallback.next();
            TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
            boolean z = false;
            if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                int i6 = newSession + 107;
                newSessionWithExtras = i6 % 128;
                if (i6 % 2 == 0) {
                    z = true;
                }
            }
            TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{next, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
        }
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 79;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        onTransact(i);
        int i5 = newSessionWithExtras + 69;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onTransact(int i) {
        int i2 = 2 % 2;
        int i3 = newSession + 51;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallback = i;
        Iterator<TabBarItemView> itIAuthTabCallback = onActivityLayout().IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i5 = newSession + 55;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            TabBarItemView next = itIAuthTabCallback.next();
            TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
            boolean z = false;
            if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                int i7 = newSession + 85;
                newSessionWithExtras = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
            TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{next, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
            int i9 = newSession + 37;
            newSessionWithExtras = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(TabBar tabBar, int i, Function0 function0, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = newSession + 13;
        int i5 = i4 % 128;
        newSessionWithExtras = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 1;
            newSession = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = tabBar.ICustomTabsCallbackStub;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i = tabBar.ICustomTabsCallbackStub;
        }
        if ((i2 & 2) != 0) {
            function0 = new TabBar$.ExternalSyntheticLambda29();
        }
        Object[] objArr = {tabBar, Integer.valueOf(i), function0};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(658606498, nSetPosition.onExtraCallbackWithResult(), -658606497, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
        int i9 = newSession + 25;
        newSessionWithExtras = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 77 / 0;
        }
        return zBooleanValue;
    }

    private static final Unit ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = newSession + 29;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 55;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final TabBar tabBar = (TabBar) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        final Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Object obj = null;
        if (!((Boolean) onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
            int i2 = newSessionWithExtras;
            int i3 = i2 + 93;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        tabBar.onExtraCallback(onWarmupCompleted.DEFAULT);
        int i6 = tabBar.onActivityResized;
        Object[] objArr2 = {tabBar, Integer.valueOf(i6), Integer.valueOf(iIntValue), new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 83;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                Unit unitIAuthTabCallback = TabBar.IAuthTabCallback(this.f$0, function0);
                int i10 = onExtraCallback + 67;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }};
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(-679546216, nSetPosition.onExtraCallbackWithResult(), 679546220, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4);
        int i7 = newSession + 123;
        newSessionWithExtras = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(TabBar tabBar, Function0 function0) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 93;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        tabBar.mayLaunchUrl();
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 123;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(TabBar tabBar, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
            z = false;
        }
        tabBar.onExtraCallback(i, z);
        int i5 = newSession + 49;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(int i, boolean z) {
        Object obj;
        TabBarItemView next;
        int i2 = 2 % 2;
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (true) {
            obj = null;
            if (!itIAuthTabCallback.hasNext()) {
                next = null;
                break;
            }
            int i3 = newSessionWithExtras + 7;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            next = itIAuthTabCallback.next();
            TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
            if (iAuthTabCallbackOnWarmupCompleted != null) {
                int i5 = newSession + 61;
                newSessionWithExtras = i5 % 128;
                int i6 = i5 % 2;
                if (iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                    break;
                }
            }
        }
        TabBarItemView tabBarItemView = next;
        if (tabBarItemView != null) {
            int i7 = newSession + Imgproc.COLOR_YUV2RGB_YVYU;
            newSessionWithExtras = i7 % 128;
            if (i7 % 2 != 0) {
                tabBarItemView.onExtraCallbackWithResult(TabBarItemView.onNavigationEvent.RED, z);
                obj.hashCode();
                throw null;
            }
            tabBarItemView.onExtraCallbackWithResult(TabBarItemView.onNavigationEvent.RED, z);
            int i8 = newSessionWithExtras + 33;
            newSession = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final void onExtraCallbackWithResult(int i) {
        TabBarItemView next;
        int i2 = 2 % 2;
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (true) {
            if (!itIAuthTabCallback.hasNext()) {
                int i3 = newSessionWithExtras + 59;
                newSession = i3 % 128;
                int i4 = i3 % 2;
                next = null;
                break;
            }
            int i5 = newSession + 27;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            next = itIAuthTabCallback.next();
            TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
            if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                break;
            }
        }
        TabBarItemView tabBarItemView = next;
        if (tabBarItemView != null) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{tabBarItemView}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1272131073, -1272131071);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = newSession + 23;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i8 = newSessionWithExtras + 43;
            newSession = i8 % 128;
            int i9 = i8 % 2;
            readTypedObject();
            if (i9 == 0) {
                throw null;
            }
            int i10 = newSession + 103;
            newSessionWithExtras = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = newSession + 111;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 15);
        LinearLayout linearLayout = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setPadding(iOnExtraCallbackWithResult, linearLayout.getPaddingTop(), iOnExtraCallbackWithResult, linearLayout.getPaddingBottom());
        if (!(!this.IAuthTabCallback_Parcel.isEmpty())) {
            return;
        }
        int iMax = Math.max(((getWidth() - (iOnExtraCallbackWithResult << 1)) - ((ICustomTabsCallbackDefault() << 1) * this.IAuthTabCallback_Parcel.size())) / this.IAuthTabCallback_Parcel.size(), ICustomTabsCallbackStubProxy());
        if (this.onUnminimized != iMax) {
            int i4 = newSession + 29;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout2 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            int childCount = linearLayout2.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                int i7 = newSessionWithExtras + 107;
                newSession = i7 % 128;
                int i8 = i7 % 2;
                View childAt = linearLayout2.getChildAt(i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iMax;
                childAt.setLayoutParams(layoutParams);
            }
            this.onUnminimized = iMax;
        }
    }

    public final void setOnTabSelectListener(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 99;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStubProxy = onextracallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 33;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setOnFloatingTabSelectListener(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 39;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallbackWithResult = onextracallbackwithresult;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        float y;
        float fIAuthTabCallback;
        float fOnExtraCallback;
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (((Boolean) onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
            int i2 = newSessionWithExtras + 53;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            if (onExtraCallback() > 0.0f) {
                int i4 = newSessionWithExtras + 87;
                newSession = i4 % 128;
                int i5 = i4 % 2;
                if (motionEvent != null && motionEvent.getActionMasked() == 0) {
                    int i6 = newSession + 99;
                    newSessionWithExtras = i6 % 128;
                    if (i6 % 2 != 0) {
                        y = motionEvent.getY();
                        fIAuthTabCallback = IAuthTabCallback();
                        fOnExtraCallback = onExtraCallback();
                        int i7 = 55 / 0;
                        if (y < fIAuthTabCallback) {
                            return true;
                        }
                    } else {
                        y = motionEvent.getY();
                        fIAuthTabCallback = IAuthTabCallback();
                        fOnExtraCallback = onExtraCallback();
                        if (y < fIAuthTabCallback) {
                            return true;
                        }
                    }
                    if (y > fOnExtraCallback + fIAuthTabCallback) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = newSession + 35;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        if (this.postMessage) {
            return true;
        }
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int i4 = newSessionWithExtras + 49;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zOnInterceptTouchEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        float interpolation;
        int i;
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 111;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            if (Math.abs(this.IAuthTabCallback + this.onNavigationEvent) > 1.0E-4d) {
                float f = this.asInterface;
                interpolation = f + ((this.onNavigationEvent - f) * this.onTransact.getInterpolation(onMessageChannelReady()));
                i = newSession + 123;
                newSessionWithExtras = i % 128;
            } else {
                interpolation = this.onNavigationEvent;
                i = newSessionWithExtras + 89;
                newSession = i % 128;
            }
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            if (Math.abs(this.IAuthTabCallback - this.onNavigationEvent) > 1.0E-4d) {
            }
        }
        int i4 = i % 2;
        this.IAuthTabCallback = interpolation;
        if (this.onNavigationEvent == interpolation) {
            return;
        }
        invalidate();
        int i5 = newSessionWithExtras + 101;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final float onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 49;
        newSession = i2 % 128;
        return i2 % 2 == 0 ? Math.min(this.onExtraCallback, System.currentTimeMillis() * this.IAuthTabCallbackDefault) - this.onExtraCallback : Math.min(this.onExtraCallback, System.currentTimeMillis() - this.IAuthTabCallbackDefault) / this.onExtraCallback;
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallbackDefault onNavigationEvent = new IAuthTabCallbackDefault();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallback = onExtraCallback(obj);
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            return boolOnExtraCallback;
        }

        public final Boolean onExtraCallback(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(obj instanceof TabBarItemView);
            int i4 = onExtraCallback + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return boolValueOf;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallbackStub onExtraCallback = new IAuthTabCallbackStub();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return boolOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Boolean onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(obj instanceof TabBarItemView);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 89;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult = SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo);
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (true) {
            int i4 = 0;
            while (itIAuthTabCallback.hasNext()) {
                if (((TabBarItemView) itIAuthTabCallback.next()).getVisibility() == 0) {
                    int i5 = newSession + 15;
                    newSessionWithExtras = i5 % 128;
                    if (i5 % 2 != 0) {
                        break;
                    }
                    i4++;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted(SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult.IAuthTabCallback(1, i4, false, 1));
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        onExtraCallback(r2);
        r4.onActivityResized = r5;
        r4.ICustomTabsCallbackDefault = onTransact();
        onExtraCallbackWithResult(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 == r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 == r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5 = im.toss.uikit.widget.TabBar.newSession + 101;
        im.toss.uikit.widget.TabBar.newSessionWithExtras = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(int i, int i2) {
        onWarmupCompleted onwarmupcompleted;
        int i3 = 2 % 2;
        int i4 = newSessionWithExtras + 13;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted onwarmupcompleted2 = this.ICustomTabsCallback_Parcel;
            onwarmupcompleted = onWarmupCompleted.FLOATING;
            int i5 = 19 / 0;
        } else {
            onWarmupCompleted onwarmupcompleted3 = this.ICustomTabsCallback_Parcel;
            onwarmupcompleted = onWarmupCompleted.FLOATING;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z = false;
        int iIntValue = ((Number) objArr[0]).intValue();
        TabBarItemView tabBarItemView = (TabBarItemView) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = tabBarItemView.onWarmupCompleted();
        if (iAuthTabCallbackOnWarmupCompleted != null) {
            int i2 = newSessionWithExtras + 75;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            if (iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == iIntValue) {
                int i4 = newSession + 19;
                newSessionWithExtras = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        return Boolean.valueOf(!z);
    }

    public final void onExtraCallback(final int i, int i2) {
        ConstraintLayout constraintLayout;
        int i3 = 2 % 2;
        int i4 = newSession + 71;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted onwarmupcompleted = this.ICustomTabsCallback_Parcel;
        onWarmupCompleted onwarmupcompleted2 = onWarmupCompleted.FLOATING;
        if (onwarmupcompleted != onwarmupcompleted2) {
            int i6 = newSession + 37;
            newSessionWithExtras = i6 % 128;
            if (i6 % 2 != 0) {
                onExtraCallback(onwarmupcompleted2);
                this.onActivityResized = i;
                this.ICustomTabsCallbackDefault = onTransact();
                constraintLayout = this.ICustomTabsCallbackStubProxy;
                int i7 = 87 / 0;
                if (constraintLayout == null) {
                    return;
                }
            } else {
                onExtraCallback(onwarmupcompleted2);
                this.onActivityResized = i;
                this.ICustomTabsCallbackDefault = onTransact();
                constraintLayout = this.ICustomTabsCallbackStubProxy;
                if (constraintLayout == null) {
                    return;
                }
            }
            try {
                Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    ConstraintLayout next = itIAuthTabCallback.next();
                    TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = ((TabBarItemView) next).onWarmupCompleted();
                    if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                        int i8 = newSession + 59;
                        newSessionWithExtras = i8 % 128;
                        Object obj = null;
                        if (i8 % 2 != 0) {
                            onWarmupCompleted(1217266318, nSetPosition.onExtraCallbackWithResult(), -1217266318, new Object[]{this, Integer.valueOf(i2)}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                            obj.hashCode();
                            throw null;
                        }
                        ConstraintLayout constraintLayout2 = (TabBarItemView) next;
                        onWarmupCompleted(1217266318, nSetPosition.onExtraCallbackWithResult(), -1217266318, new Object[]{this, Integer.valueOf(i2)}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                        if (this.ICustomTabsCallback != i2) {
                            TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{constraintLayout2, false}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
                        }
                        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                        onWarmupCompleted(-1771324024, nSetPosition.onExtraCallbackWithResult(), 1771324044, new Object[]{this, null, null}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                        this.onExtraCallbackWithResult.onExtraCallback.setAlpha(1.0f);
                        Iterator itIAuthTabCallback2 = ensureCausesIsMutable.access100(onPostMessage(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda30
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i9 = 2 % 2;
                                int i10 = onWarmupCompleted + 109;
                                IAuthTabCallback = i10 % 128;
                                int i11 = i10 % 2;
                                Integer numValueOf = Integer.valueOf(i);
                                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                                Boolean boolValueOf = Boolean.valueOf(((Boolean) TabBar.onWarmupCompleted(-636571844, nSetPosition.onExtraCallbackWithResult(), 636571862, new Object[]{numValueOf, (TabBarItemView) obj2}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2)).booleanValue());
                                int i12 = IAuthTabCallback + 27;
                                onWarmupCompleted = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return boolValueOf;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }).IAuthTabCallback();
                        while (itIAuthTabCallback2.hasNext()) {
                            int i9 = newSessionWithExtras + 67;
                            newSession = i9 % 128;
                            int i10 = i9 % 2;
                            ((TabBarItemView) itIAuthTabCallback2.next()).setAlpha(0.0f);
                        }
                        constraintLayout2.setTranslationX(0.0f);
                        constraintLayout2.setVisibility(4);
                        Iterator<TabBarItemView> itIAuthTabCallback3 = onActivityLayout().IAuthTabCallback();
                        int i11 = newSession + 69;
                        while (true) {
                            newSessionWithExtras = i11 % 128;
                            int i12 = i11 % 2;
                            if (!itIAuthTabCallback3.hasNext()) {
                                constraintLayout.setVisibility(0);
                                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                                setTranslationY(((Integer) onWarmupCompleted(-1022135893, nSetPosition.onExtraCallbackWithResult(), 1022135895, new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2)).intValue());
                                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                                int iOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
                                float f = iOnNavigationEvent;
                                setDrawInsetLeft(f);
                                setDrawInsetRight(f);
                                int i13 = (this.ICustomTabsService - this.readTypedObject) / 2;
                                this.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(iOnNavigationEvent, i13, iOnNavigationEvent, i13);
                                setDrawInsetTop(i13);
                                setTopRadius(this.onWarmupCompleted);
                                setBottomRadius(this.onWarmupCompleted);
                                setDrawHeight(this.readTypedObject);
                                invalidate();
                                return;
                            }
                            ConstraintLayout constraintLayout3 = (TabBarItemView) itIAuthTabCallback3.next();
                            constraintLayout3.setScaleX(1.0f);
                            constraintLayout3.setScaleY(1.0f);
                            constraintLayout3.setAlpha(1.0f);
                            i11 = newSession + 85;
                        }
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TabBar", e);
            }
        }
    }

    private final void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = newSession + 29;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        AFj1ySDK aFj1ySDK = this.onExtraCallbackWithResult;
        LinearLayout linearLayout = aFj1ySDK.IAuthTabCallback;
        int[] iArr = asInterface.onWarmupCompleted;
        int i6 = iArr[onwarmupcompleted.ordinal()];
        if (i6 != 1) {
            int i7 = newSessionWithExtras + 63;
            int i8 = i7 % 128;
            newSession = i8;
            int i9 = i7 % 2;
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = i8 + 11;
            newSessionWithExtras = i10 % 128;
            i = i10 % 2 != 0 ? 5 : 2;
        } else {
            int i11 = newSession + 75;
            newSessionWithExtras = i11 % 128;
            int i12 = i11 % 2;
            i = 1;
        }
        linearLayout.setImportantForAccessibility(i);
        LinearLayout linearLayout2 = aFj1ySDK.onExtraCallbackWithResult;
        int i13 = iArr[onwarmupcompleted.ordinal()];
        if (i13 != 1) {
            int i14 = newSessionWithExtras + 119;
            newSession = i14 % 128;
            if (i14 % 2 != 0 ? i13 != 2 : i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 1;
        }
        linearLayout2.setImportantForAccessibility(i2);
    }

    private static final boolean asInterface(int i, TabBarItemView tabBarItemView) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 43;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = tabBarItemView.onWarmupCompleted();
        boolean z = false;
        if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
            int i5 = newSessionWithExtras + 79;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                z = true;
            }
        }
        return !z;
    }

    private static final Rally onTransact(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSession + 25;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tabBarItemView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(200).onWarmupCompleted(Address.onNavigationEvent.asBinder()), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = newSessionWithExtras + 113;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static final Rally asBinder(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tabBarItemView, isMuted.onNavigationEvent(isMuted.asBinder(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = newSessionWithExtras + 47;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return rally;
    }

    private static final Unit onNavigationEvent(TabBar tabBar, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(tabBar.onMinimized());
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 25;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(float f, float f2, TabBar tabBar, float f3) {
        int i = 2 % 2;
        int i2 = newSession + 55;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f * f3, 0.0f);
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f2 + ((tabBar.readTypedObject - f2) * f3), 0.0f, tabBar.ICustomTabsService);
        int iCoerceAtLeast = (int) RangesKt___RangesKt.coerceAtLeast((tabBar.ICustomTabsService - fCoerceIn) / 2.0f, 0.0f);
        tabBar.setDrawInsetLeft(fCoerceAtLeast);
        tabBar.setDrawInsetRight(fCoerceAtLeast);
        tabBar.setDrawInsetTop(iCoerceAtLeast);
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        float fIntValue = ((Integer) onWarmupCompleted(-58124945, nSetPosition.onExtraCallbackWithResult(), 58124952, new Object[]{tabBar}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
        int i4 = tabBar.onWarmupCompleted;
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        tabBar.setTopRadius(fIntValue + ((i4 - ((Integer) onWarmupCompleted(-58124945, nSetPosition.onExtraCallbackWithResult(), 58124952, new Object[]{tabBar}, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).intValue()) * f3));
        tabBar.setBottomRadius(tabBar.onWarmupCompleted * f3);
        tabBar.setDrawHeight(fCoerceIn);
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 101;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 107;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = newSessionWithExtras + 81;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(TabBar tabBar, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = newSession + 15;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            tabBar.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(i, i2, i, i2);
            Object[] objArr = {tabBar, tabBar.ICustomTabsCallbackStub(), RallysKt.onExtraCallback(tabBar.onUnminimized(), 965)};
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            onWarmupCompleted(-1771324024, nSetPosition.onExtraCallbackWithResult(), 1771324044, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        } else {
            tabBar.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(i, i2, i, i2);
            Object[] objArr2 = {tabBar, tabBar.ICustomTabsCallbackStub(), RallysKt.onExtraCallback(tabBar.onUnminimized(), 500)};
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            onWarmupCompleted(-1771324024, nSetPosition.onExtraCallbackWithResult(), 1771324044, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 43;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(TabBarItemView tabBarItemView, TabBar tabBar) {
        int i = 2 % 2;
        tabBarItemView.setVisibility(4);
        ConstraintLayout constraintLayout = tabBar.ICustomTabsCallbackStubProxy;
        if (constraintLayout != null) {
            int i2 = newSession + 67;
            newSessionWithExtras = i2 % 128;
            if (i2 % 2 != 0) {
                constraintLayout.setVisibility(0);
            } else {
                constraintLayout.setVisibility(0);
            }
            int i3 = newSessionWithExtras + 71;
            newSession = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = newSessionWithExtras + 111;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: Exception -> 0x0650, TryCatch #0 {Exception -> 0x0650, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0030, B:15:0x0048, B:17:0x004e, B:25:0x005b, B:27:0x008a, B:28:0x00ad, B:29:0x013c, B:31:0x0142, B:32:0x0154, B:33:0x01b2, B:36:0x01c2, B:38:0x01c8, B:39:0x01cb, B:40:0x01e7, B:42:0x02ba, B:44:0x0371, B:45:0x0455, B:47:0x045b, B:49:0x0461, B:50:0x0464, B:52:0x0476, B:54:0x0507, B:55:0x050d, B:62:0x052c, B:64:0x0536, B:63:0x0531, B:23:0x0055, B:67:0x0648, B:68:0x064f), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142 A[Catch: Exception -> 0x0650, LOOP:1: B:29:0x013c->B:31:0x0142, LOOP_END, TryCatch #0 {Exception -> 0x0650, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0030, B:15:0x0048, B:17:0x004e, B:25:0x005b, B:27:0x008a, B:28:0x00ad, B:29:0x013c, B:31:0x0142, B:32:0x0154, B:33:0x01b2, B:36:0x01c2, B:38:0x01c8, B:39:0x01cb, B:40:0x01e7, B:42:0x02ba, B:44:0x0371, B:45:0x0455, B:47:0x045b, B:49:0x0461, B:50:0x0464, B:52:0x0476, B:54:0x0507, B:55:0x050d, B:62:0x052c, B:64:0x0536, B:63:0x0531, B:23:0x0055, B:67:0x0648, B:68:0x064f), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ba A[Catch: Exception -> 0x0650, TryCatch #0 {Exception -> 0x0650, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0030, B:15:0x0048, B:17:0x004e, B:25:0x005b, B:27:0x008a, B:28:0x00ad, B:29:0x013c, B:31:0x0142, B:32:0x0154, B:33:0x01b2, B:36:0x01c2, B:38:0x01c8, B:39:0x01cb, B:40:0x01e7, B:42:0x02ba, B:44:0x0371, B:45:0x0455, B:47:0x045b, B:49:0x0461, B:50:0x0464, B:52:0x0476, B:54:0x0507, B:55:0x050d, B:62:0x052c, B:64:0x0536, B:63:0x0531, B:23:0x0055, B:67:0x0648, B:68:0x064f), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x045b A[Catch: Exception -> 0x0650, TryCatch #0 {Exception -> 0x0650, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0030, B:15:0x0048, B:17:0x004e, B:25:0x005b, B:27:0x008a, B:28:0x00ad, B:29:0x013c, B:31:0x0142, B:32:0x0154, B:33:0x01b2, B:36:0x01c2, B:38:0x01c8, B:39:0x01cb, B:40:0x01e7, B:42:0x02ba, B:44:0x0371, B:45:0x0455, B:47:0x045b, B:49:0x0461, B:50:0x0464, B:52:0x0476, B:54:0x0507, B:55:0x050d, B:62:0x052c, B:64:0x0536, B:63:0x0531, B:23:0x0055, B:67:0x0648, B:68:0x064f), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0531 A[Catch: Exception -> 0x0650, TryCatch #0 {Exception -> 0x0650, blocks: (B:8:0x0022, B:9:0x002a, B:11:0x0030, B:15:0x0048, B:17:0x004e, B:25:0x005b, B:27:0x008a, B:28:0x00ad, B:29:0x013c, B:31:0x0142, B:32:0x0154, B:33:0x01b2, B:36:0x01c2, B:38:0x01c8, B:39:0x01cb, B:40:0x01e7, B:42:0x02ba, B:44:0x0371, B:45:0x0455, B:47:0x045b, B:49:0x0461, B:50:0x0464, B:52:0x0476, B:54:0x0507, B:55:0x050d, B:62:0x052c, B:64:0x0536, B:63:0x0531, B:23:0x0055, B:67:0x0648, B:68:0x064f), top: B:72:0x0022 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.View, im.toss.uikit.widget.TabBarItemView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, im.toss.uikit.widget.TabBarItemView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final int i, int i2) {
        Iterator it;
        float left;
        Object obj;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        char c;
        Float fValueOf;
        final float height;
        int i7;
        int i8 = 2;
        int i9 = 2 % 2;
        boolean z = false;
        Float fValueOf2 = Float.valueOf(0.0f);
        ?? r5 = this.ICustomTabsCallbackStubProxy;
        boolean z2 = 0;
        if (r5 == 0) {
            int i10 = newSessionWithExtras + 15;
            newSession = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 60 / 0;
                return;
            }
            return;
        }
        try {
            Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                TabBarItemView next = itIAuthTabCallback.next();
                TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
                if (iAuthTabCallbackOnWarmupCompleted != null) {
                    int i12 = newSessionWithExtras + 49;
                    newSession = i12 % 128;
                    if (i12 % i8 == 0) {
                        int i13 = 49 / z2;
                        if (iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                            final TabBarItemView tabBarItemView = next;
                            Object[] objArr = new Object[i8];
                            objArr[z2] = this;
                            objArr[1] = Integer.valueOf(i2);
                            onWarmupCompleted(1217266318, nSetPosition.onExtraCallbackWithResult(), -1217266318, objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                            if (this.ICustomTabsCallback != i2) {
                                Object[] objArr2 = new Object[i8];
                                objArr2[z2] = tabBarItemView;
                                objArr2[1] = Boolean.valueOf(z2);
                                TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr2, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
                            }
                            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                            float fOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
                            int i14 = (int) fOnNavigationEvent;
                            int i15 = (this.ICustomTabsService - this.readTypedObject) / 2;
                            this.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(i14, i15, i14, i15);
                            this.onExtraCallbackWithResult.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                            LinearLayout linearLayout = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
                            linearLayout.layout(linearLayout.getLeft(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getTop(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getRight(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getBottom());
                            float left2 = (r5.getLeft() + r5.onExtraCallbackWithResult()) - (tabBarItemView.getLeft() + tabBarItemView.onExtraCallbackWithResult());
                            List listOnRelationshipValidationResult = ensureCausesIsMutable.onRelationshipValidationResult(onActivityLayout());
                            List list = listOnRelationshipValidationResult;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(((TabBarItemView) it.next()).getLeft()));
                            }
                            int left3 = this.onExtraCallbackWithResult.onExtraCallback.getLeft();
                            this.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(z2, z2, z2, z2);
                            this.onExtraCallbackWithResult.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                            LinearLayout linearLayout2 = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
                            linearLayout2.layout(linearLayout2.getLeft(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getTop(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getRight(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getBottom());
                            List list2 = listOnRelationshipValidationResult;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            int i16 = 0;
                            for (Object obj2 : list2) {
                                int i17 = newSessionWithExtras + 31;
                                newSession = i17 % 128;
                                int i18 = i17 % 2;
                                if (i16 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                arrayList3.add(Float.valueOf(((TabBarItemView) obj2).getLeft() - ((Number) arrayList2.get(i16)).intValue()));
                                i16++;
                            }
                            left = this.onExtraCallbackWithResult.onExtraCallback.getLeft() - left3;
                            ArrayList arrayList4 = new ArrayList();
                            FrameLayout frameLayout = this.onExtraCallbackWithResult.onExtraCallback;
                            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                            arrayList4.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                            if (left == 0.0f) {
                                FrameLayout frameLayout2 = this.onExtraCallbackWithResult.onExtraCallback;
                                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                                Float fValueOf3 = Float.valueOf(left);
                                i3 = i15;
                                i5 = i14;
                                arrayList = arrayList4;
                                f = fOnNavigationEvent;
                                i6 = 1;
                                c = '\n';
                                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback_Parcel = isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, fValueOf3, fValueOf2, (Function1) null, 4, (Object) null);
                                i4 = 13;
                                obj = null;
                                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout2, appLovinSdkSettingsIAuthTabCallback_Parcel, 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                            } else {
                                obj = null;
                                arrayList = arrayList4;
                                i3 = i15;
                                i4 = 13;
                                i5 = i14;
                                f = fOnNavigationEvent;
                                i6 = 1;
                                c = '\n';
                            }
                            AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback_Parcel2 = isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(left2), (Function1) null, 5, (Object) null);
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = tabBarItemView;
                            objArr3[i6] = appLovinSdkSettingsIAuthTabCallback_Parcel2;
                            objArr3[2] = 0;
                            objArr3[3] = obj;
                            objArr3[4] = 0;
                            objArr3[5] = obj;
                            objArr3[6] = obj;
                            objArr3[7] = obj;
                            objArr3[8] = 0;
                            objArr3[9] = 0L;
                            objArr3[c] = false;
                            objArr3[11] = 2044;
                            objArr3[12] = obj;
                            arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr3, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ensureCausesIsMutable.extraCallback(ensureCausesIsMutable.access100(onPostMessage(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda0
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i19 = 2 % 2;
                                    int i20 = onNavigationEvent + 73;
                                    onWarmupCompleted = i20 % 128;
                                    int i21 = i20 % 2;
                                    Boolean boolValueOf = Boolean.valueOf(TabBar.onExtraCallback(i, (TabBarItemView) obj3));
                                    int i22 = onWarmupCompleted + 107;
                                    onNavigationEvent = i22 % 128;
                                    if (i22 % 2 == 0) {
                                        return boolValueOf;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            }), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda1
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i19 = 2 % 2;
                                    int i20 = onWarmupCompleted + 125;
                                    onExtraCallback = i20 % 128;
                                    TabBarItemView tabBarItemView2 = (TabBarItemView) obj3;
                                    if (i20 % 2 == 0) {
                                        return TabBar.onNavigationEvent(tabBarItemView2);
                                    }
                                    TabBar.onNavigationEvent(tabBarItemView2);
                                    throw null;
                                }
                            }));
                            arrayList.add(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(50), ensureCausesIsMutable.onRelationshipValidationResult(ensureCausesIsMutable.extraCallback(onActivityLayout(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda2
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i19 = 2 % 2;
                                    int i20 = onExtraCallbackWithResult + 45;
                                    onWarmupCompleted = i20 % 128;
                                    int i21 = i20 % 2;
                                    Rally rallyOnExtraCallback = TabBar.onExtraCallback((TabBarItemView) obj3);
                                    int i22 = onExtraCallbackWithResult + 51;
                                    onWarmupCompleted = i22 % 128;
                                    int i23 = i22 % 2;
                                    return rallyOnExtraCallback;
                                }
                            })), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null));
                            int i19 = 0;
                            for (Object obj3 : listOnRelationshipValidationResult) {
                                if (i19 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                TabBarItemView tabBarItemView2 = (TabBarItemView) obj3;
                                float fFloatValue = ((Number) arrayList3.get(i19)).floatValue();
                                if (fFloatValue != 0.0f) {
                                    i7 = i4;
                                    AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback_Parcel3 = isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(fFloatValue), fValueOf2, (Function1) null, 4, (Object) null);
                                    Object[] objArr4 = new Object[i7];
                                    objArr4[0] = tabBarItemView2;
                                    objArr4[i6] = appLovinSdkSettingsIAuthTabCallback_Parcel3;
                                    objArr4[2] = 0;
                                    objArr4[3] = null;
                                    objArr4[4] = 0;
                                    objArr4[5] = null;
                                    objArr4[6] = null;
                                    objArr4[7] = null;
                                    objArr4[8] = 0;
                                    objArr4[9] = 0L;
                                    objArr4[c] = false;
                                    objArr4[11] = 2044;
                                    objArr4[12] = null;
                                    arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr4, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                                } else {
                                    i7 = i4;
                                }
                                i19++;
                                i4 = i7;
                            }
                            int i20 = i4;
                            fValueOf = Float.valueOf(onExtraCallback());
                            if (fValueOf.floatValue() <= 0.0f) {
                                fValueOf = null;
                            }
                            if (fValueOf == null) {
                                int i21 = newSession + i20;
                                newSessionWithExtras = i21 % 128;
                                int i22 = i21 % 2;
                                height = fValueOf.floatValue();
                            } else {
                                height = getHeight();
                            }
                            AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                            final float f2 = f;
                            AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(appLovinSdkSettings2, (Float) null, Float.valueOf(((Integer) onWarmupCompleted(-1022135893, nSetPosition.onExtraCallbackWithResult(), 1022135895, new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue()), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda3
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i23 = 2 % 2;
                                    int i24 = onExtraCallback + 93;
                                    onNavigationEvent = i24 % 128;
                                    int i25 = i24 % 2;
                                    Unit unitOnExtraCallbackWithResult = TabBar.onExtraCallbackWithResult(this.f$0, (attachAppLovinSdk) obj4);
                                    int i26 = onExtraCallback + 53;
                                    onNavigationEvent = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            }, 1, (Object) null), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda4
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Unit unitOnNavigationEvent;
                                    int i23 = 2 % 2;
                                    int i24 = onExtraCallback + 123;
                                    onExtraCallbackWithResult = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        unitOnNavigationEvent = TabBar.onNavigationEvent(f2, height, this, ((Float) obj4).floatValue());
                                        int i25 = 4 / 0;
                                    } else {
                                        unitOnNavigationEvent = TabBar.onNavigationEvent(f2, height, this, ((Float) obj4).floatValue());
                                    }
                                    int i26 = onExtraCallbackWithResult + 101;
                                    onExtraCallback = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                            }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda5
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i23 = 2 % 2;
                                    int i24 = onExtraCallbackWithResult + 77;
                                    onWarmupCompleted = i24 % 128;
                                    int i25 = i24 % 2;
                                    int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                                    int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                                    int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
                                    Unit unit = (Unit) TabBar.onWarmupCompleted(-1498904813, nSetPosition.onExtraCallbackWithResult(), 1498904829, new Object[]{(attachAppLovinSdk) obj4}, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3);
                                    int i26 = onWarmupCompleted + 95;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    return unit;
                                }
                            });
                            Object[] objArr5 = new Object[i20];
                            objArr5[0] = this;
                            objArr5[i6] = appLovinSdkSettingsOnNavigationEvent;
                            objArr5[2] = 0;
                            objArr5[3] = null;
                            objArr5[4] = 0;
                            objArr5[5] = null;
                            objArr5[6] = null;
                            objArr5[7] = null;
                            objArr5[8] = 0;
                            objArr5[9] = 0L;
                            objArr5[c] = false;
                            objArr5[11] = 2044;
                            objArr5[12] = null;
                            arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr5, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                            final int i23 = i5;
                            final int i24 = i3;
                            onWarmupCompleted((runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 1;
                                private static int onNavigationEvent;

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25 = 2 % 2;
                                    int i26 = onNavigationEvent + 1;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    Object[] objArr6 = {this.f$0, Integer.valueOf(i23), Integer.valueOf(i24)};
                                    int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                                    int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                                    Unit unit = (Unit) TabBar.onWarmupCompleted(1757469613, nSetPosition.onExtraCallbackWithResult(), -1757469598, objArr6, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3);
                                    int i28 = onNavigationEvent + 27;
                                    onExtraCallbackWithResult = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        int i29 = 53 / 0;
                                    }
                                    return unit;
                                }
                            }, i6, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda7
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25 = 2 % 2;
                                    int i26 = onExtraCallback + 97;
                                    onExtraCallbackWithResult = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        TabBar.onWarmupCompleted(tabBarItemView, this);
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = TabBar.onWarmupCompleted(tabBarItemView, this);
                                    int i27 = onExtraCallback + 29;
                                    onExtraCallbackWithResult = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        int i28 = 98 / 0;
                                    }
                                    return unitOnWarmupCompleted;
                                }
                            }, i6, (Object) null), false, i6, (Object) null));
                            return;
                        }
                    } else if (iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == i) {
                        final TabBarItemView tabBarItemView3 = next;
                        Object[] objArr6 = new Object[i8];
                        objArr6[z2] = this;
                        objArr6[1] = Integer.valueOf(i2);
                        onWarmupCompleted(1217266318, nSetPosition.onExtraCallbackWithResult(), -1217266318, objArr6, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                        if (this.ICustomTabsCallback != i2) {
                        }
                        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                        float fOnNavigationEvent2 = varyMatches.onNavigationEvent(12, displayMetrics2);
                        int i142 = (int) fOnNavigationEvent2;
                        int i152 = (this.ICustomTabsService - this.readTypedObject) / 2;
                        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(i142, i152, i142, i152);
                        this.onExtraCallbackWithResult.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                        LinearLayout linearLayout3 = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
                        linearLayout3.layout(linearLayout3.getLeft(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getTop(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getRight(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getBottom());
                        float left22 = (r5.getLeft() + r5.onExtraCallbackWithResult()) - (tabBarItemView3.getLeft() + tabBarItemView3.onExtraCallbackWithResult());
                        List listOnRelationshipValidationResult2 = ensureCausesIsMutable.onRelationshipValidationResult(onActivityLayout());
                        List list3 = listOnRelationshipValidationResult2;
                        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        int left32 = this.onExtraCallbackWithResult.onExtraCallback.getLeft();
                        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(z2, z2, z2, z2);
                        this.onExtraCallbackWithResult.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                        LinearLayout linearLayout22 = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
                        linearLayout22.layout(linearLayout22.getLeft(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getTop(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getRight(), this.onExtraCallbackWithResult.onExtraCallbackWithResult.getBottom());
                        List list22 = listOnRelationshipValidationResult2;
                        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                        int i162 = 0;
                        while (r4.hasNext()) {
                        }
                        left = this.onExtraCallbackWithResult.onExtraCallback.getLeft() - left32;
                        ArrayList arrayList42 = new ArrayList();
                        FrameLayout frameLayout3 = this.onExtraCallbackWithResult.onExtraCallback;
                        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
                        arrayList42.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout3, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                        if (left == 0.0f) {
                        }
                        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback_Parcel22 = isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(left22), (Function1) null, 5, (Object) null);
                        Object[] objArr32 = new Object[i4];
                        objArr32[0] = tabBarItemView3;
                        objArr32[i6] = appLovinSdkSettingsIAuthTabCallback_Parcel22;
                        objArr32[2] = 0;
                        objArr32[3] = obj;
                        objArr32[4] = 0;
                        objArr32[5] = obj;
                        objArr32[6] = obj;
                        objArr32[7] = obj;
                        objArr32[8] = 0;
                        objArr32[9] = 0L;
                        objArr32[c] = false;
                        objArr32[11] = 2044;
                        objArr32[12] = obj;
                        arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr32, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList, ensureCausesIsMutable.extraCallback(ensureCausesIsMutable.access100(onPostMessage(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda0
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj32) {
                                int i192 = 2 % 2;
                                int i202 = onNavigationEvent + 73;
                                onWarmupCompleted = i202 % 128;
                                int i212 = i202 % 2;
                                Boolean boolValueOf = Boolean.valueOf(TabBar.onExtraCallback(i, (TabBarItemView) obj32));
                                int i222 = onWarmupCompleted + 107;
                                onNavigationEvent = i222 % 128;
                                if (i222 % 2 == 0) {
                                    return boolValueOf;
                                }
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        }), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj32) {
                                int i192 = 2 % 2;
                                int i202 = onWarmupCompleted + 125;
                                onExtraCallback = i202 % 128;
                                TabBarItemView tabBarItemView22 = (TabBarItemView) obj32;
                                if (i202 % 2 == 0) {
                                    return TabBar.onNavigationEvent(tabBarItemView22);
                                }
                                TabBar.onNavigationEvent(tabBarItemView22);
                                throw null;
                            }
                        }));
                        arrayList.add(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(50), ensureCausesIsMutable.onRelationshipValidationResult(ensureCausesIsMutable.extraCallback(onActivityLayout(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj32) {
                                int i192 = 2 % 2;
                                int i202 = onExtraCallbackWithResult + 45;
                                onWarmupCompleted = i202 % 128;
                                int i212 = i202 % 2;
                                Rally rallyOnExtraCallback = TabBar.onExtraCallback((TabBarItemView) obj32);
                                int i222 = onExtraCallbackWithResult + 51;
                                onWarmupCompleted = i222 % 128;
                                int i232 = i222 % 2;
                                return rallyOnExtraCallback;
                            }
                        })), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null));
                        int i192 = 0;
                        while (r0.hasNext()) {
                        }
                        int i202 = i4;
                        fValueOf = Float.valueOf(onExtraCallback());
                        if (fValueOf.floatValue() <= 0.0f) {
                        }
                        if (fValueOf == null) {
                        }
                        AppLovinSdkSettings appLovinSdkSettings22 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult22 = nSetPosition.onExtraCallbackWithResult();
                        final float f22 = f;
                        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent2 = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(appLovinSdkSettings22, (Float) null, Float.valueOf(((Integer) onWarmupCompleted(-1022135893, nSetPosition.onExtraCallbackWithResult(), 1022135895, new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult22, iOnExtraCallbackWithResult3)).intValue()), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i232 = 2 % 2;
                                int i242 = onExtraCallback + 93;
                                onNavigationEvent = i242 % 128;
                                int i25 = i242 % 2;
                                Unit unitOnExtraCallbackWithResult = TabBar.onExtraCallbackWithResult(this.f$0, (attachAppLovinSdk) obj4);
                                int i26 = onExtraCallback + 53;
                                onNavigationEvent = i26 % 128;
                                if (i26 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                throw null;
                            }
                        }, 1, (Object) null), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda4
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Unit unitOnNavigationEvent;
                                int i232 = 2 % 2;
                                int i242 = onExtraCallback + 123;
                                onExtraCallbackWithResult = i242 % 128;
                                if (i242 % 2 == 0) {
                                    unitOnNavigationEvent = TabBar.onNavigationEvent(f22, height, this, ((Float) obj4).floatValue());
                                    int i25 = 4 / 0;
                                } else {
                                    unitOnNavigationEvent = TabBar.onNavigationEvent(f22, height, this, ((Float) obj4).floatValue());
                                }
                                int i26 = onExtraCallbackWithResult + 101;
                                onExtraCallback = i26 % 128;
                                if (i26 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i232 = 2 % 2;
                                int i242 = onExtraCallbackWithResult + 77;
                                onWarmupCompleted = i242 % 128;
                                int i25 = i242 % 2;
                                int iOnExtraCallbackWithResult32 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
                                Unit unit = (Unit) TabBar.onWarmupCompleted(-1498904813, nSetPosition.onExtraCallbackWithResult(), 1498904829, new Object[]{(attachAppLovinSdk) obj4}, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult32);
                                int i26 = onWarmupCompleted + 95;
                                onExtraCallbackWithResult = i26 % 128;
                                int i27 = i26 % 2;
                                return unit;
                            }
                        });
                        Object[] objArr52 = new Object[i202];
                        objArr52[0] = this;
                        objArr52[i6] = appLovinSdkSettingsOnNavigationEvent2;
                        objArr52[2] = 0;
                        objArr52[3] = null;
                        objArr52[4] = 0;
                        objArr52[5] = null;
                        objArr52[6] = null;
                        objArr52[7] = null;
                        objArr52[8] = 0;
                        objArr52[9] = 0L;
                        objArr52[c] = false;
                        objArr52[11] = 2044;
                        objArr52[12] = null;
                        arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr52, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                        final int i232 = i5;
                        final int i242 = i3;
                        onWarmupCompleted((runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda6
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i25 = 2 % 2;
                                int i26 = onNavigationEvent + 1;
                                onExtraCallbackWithResult = i26 % 128;
                                int i27 = i26 % 2;
                                Object[] objArr62 = {this.f$0, Integer.valueOf(i232), Integer.valueOf(i242)};
                                int iOnExtraCallbackWithResult32 = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                                Unit unit = (Unit) TabBar.onWarmupCompleted(1757469613, nSetPosition.onExtraCallbackWithResult(), -1757469598, objArr62, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult32);
                                int i28 = onNavigationEvent + 27;
                                onExtraCallbackWithResult = i28 % 128;
                                if (i28 % 2 == 0) {
                                    int i29 = 53 / 0;
                                }
                                return unit;
                            }
                        }, i6, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda7
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i25 = 2 % 2;
                                int i26 = onExtraCallback + 97;
                                onExtraCallbackWithResult = i26 % 128;
                                if (i26 % 2 == 0) {
                                    TabBar.onWarmupCompleted(tabBarItemView3, this);
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = TabBar.onWarmupCompleted(tabBarItemView3, this);
                                int i27 = onExtraCallback + 29;
                                onExtraCallbackWithResult = i27 % 128;
                                if (i27 % 2 == 0) {
                                    int i28 = 98 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        }, i6, (Object) null), false, i6, (Object) null));
                        return;
                    }
                }
                z2 = z2;
                z = z;
                i8 = i8;
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TabBar", e);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(super.onSaveInstanceState());
        onnavigationevent.onNavigationEvent(this.ICustomTabsCallbackStub);
        onnavigationevent.onExtraCallback(this.access100);
        onnavigationevent.onWarmupCompleted(this.onActivityResized);
        int i2 = newSessionWithExtras + 57;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        int i = 2 % 2;
        if (!(parcelable instanceof onNavigationEvent)) {
            int i2 = newSessionWithExtras + 89;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            super.onRestoreInstanceState(parcelable);
            int i4 = newSessionWithExtras + 59;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) parcelable;
        super.onRestoreInstanceState(onnavigationevent.getSuperState());
        this.access100 = onnavigationevent.onNavigationEvent();
        this.onActivityResized = onnavigationevent.onWarmupCompleted();
        this.ICustomTabsCallbackStub = onnavigationevent.IAuthTabCallback();
        int i6 = newSession + 33;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit extraCommand() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final boolean z;
        boolean z2 = 0;
        final TabBar tabBar = (TabBar) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2;
        final int iIntValue2 = ((Number) objArr[2]).intValue();
        char c = 3;
        final Function0 function0 = (Function0) objArr[3];
        int i2 = 2 % 2;
        float f = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        try {
            Iterator<TabBarItemView> itIAuthTabCallback = tabBar.onPostMessage().IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                TabBarItemView next = itIAuthTabCallback.next();
                TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
                if (iAuthTabCallbackOnWarmupCompleted != null && iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == iIntValue) {
                    int i3 = newSession;
                    int i4 = i3 + 13;
                    newSessionWithExtras = i4 % 128;
                    if (i4 % i != 0) {
                        TabBarItemView tabBarItemView = next;
                        int i5 = tabBar.ICustomTabsCallback;
                        throw null;
                    }
                    final TabBarItemView tabBarItemView2 = next;
                    if (tabBar.ICustomTabsCallback == iIntValue) {
                        int i6 = i3 + 107;
                        newSessionWithExtras = i6 % 128;
                        int i7 = i6 % i;
                        z = true;
                    } else {
                        z = z2;
                    }
                    ArrayList arrayList = new ArrayList();
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Function1 function1 = new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda15
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 39;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            TabBarItemView tabBarItemView3 = tabBarItemView2;
                            if (i10 != 0) {
                                return TabBar.IAuthTabCallback(tabBarItemView3, z, ((Float) obj).floatValue());
                            }
                            TabBar.IAuthTabCallback(tabBarItemView3, z, ((Float) obj).floatValue());
                            throw null;
                        }
                    };
                    Object[] objArr2 = new Object[7];
                    objArr2[z2] = appLovinSdkSettings;
                    objArr2[1] = Float.valueOf(f);
                    objArr2[i] = Float.valueOf(1.0f);
                    objArr2[3] = function1;
                    objArr2[4] = null;
                    objArr2[5] = 8;
                    objArr2[6] = null;
                    AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback_Parcel = isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr2, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), (Float) null, fValueOf, (Function1) null, 5, (Object) null);
                    Object[] objArr3 = new Object[13];
                    objArr3[z2] = tabBarItemView2;
                    objArr3[1] = appLovinSdkSettingsIAuthTabCallback_Parcel;
                    objArr3[i] = 0;
                    objArr3[3] = null;
                    objArr3[4] = 0;
                    objArr3[5] = null;
                    objArr3[6] = null;
                    objArr3[7] = null;
                    objArr3[8] = 0;
                    objArr3[9] = 0L;
                    objArr3[10] = false;
                    objArr3[11] = 2044;
                    objArr3[12] = null;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr3, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    FrameLayout frameLayout = tabBar.onExtraCallbackWithResult.onExtraCallback;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 200), (Float) null, fValueOf, (Function1) null, 5, (Object) null);
                    Object[] objArr4 = new Object[13];
                    objArr4[z2] = frameLayout;
                    objArr4[1] = appLovinSdkSettingsOnNavigationEvent;
                    objArr4[2] = 0;
                    objArr4[3] = null;
                    objArr4[4] = 0;
                    objArr4[5] = null;
                    objArr4[6] = null;
                    objArr4[7] = null;
                    objArr4[8] = 0;
                    objArr4[9] = 0L;
                    objArr4[10] = false;
                    objArr4[11] = 2044;
                    objArr4[12] = null;
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(objArr4, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, ensureCausesIsMutable.extraCallback(tabBar.onActivityLayout(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda20
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 61;
                            onWarmupCompleted = i9 % 128;
                            TabBarItemView tabBarItemView3 = (TabBarItemView) obj;
                            if (i9 % 2 != 0) {
                                return TabBar.onWarmupCompleted(tabBarItemView3);
                            }
                            TabBar.onWarmupCompleted(tabBarItemView3);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }));
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, ensureCausesIsMutable.extraCallback(ensureCausesIsMutable.access100(tabBar.onPostMessage(), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda21
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 69;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            boolean zOnNavigationEvent = TabBar.onNavigationEvent(iIntValue, (TabBarItemView) obj);
                            if (i10 != 0) {
                                return Boolean.valueOf(zOnNavigationEvent);
                            }
                            Boolean.valueOf(zOnNavigationEvent);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }), new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda22
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 83;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            Rally rallyOnExtraCallbackWithResult = TabBar.onExtraCallbackWithResult((TabBarItemView) obj);
                            int i11 = onExtraCallbackWithResult + 89;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            return rallyOnExtraCallbackWithResult;
                        }
                    }));
                    float fOnTransact = tabBar.onTransact();
                    float fOnNavigationEvent = tabBar.onNavigationEvent();
                    final float fOnExtraCallbackWithResult = tabBar.onExtraCallbackWithResult();
                    Float fValueOf2 = Float.valueOf(tabBar.onExtraCallback());
                    if (fValueOf2.floatValue() > 0.0f) {
                        int i8 = newSessionWithExtras + 31;
                        newSession = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        fValueOf2 = null;
                    }
                    final float fFloatValue = fValueOf2 != null ? fValueOf2.floatValue() : tabBar.getHeight();
                    float f2 = tabBar.access000;
                    final float height = tabBar.getHeight();
                    arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tabBar, isMuted.onNavigationEvent(isMuted.onNavigationEvent(isMuted.onNavigationEvent(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(tabBar.access000()), (Function1) null, 5, (Object) null), fOnTransact, tabBar.ICustomTabsCallbackDefault, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda23
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallback + 83;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
                            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                            Unit unit = (Unit) TabBar.onWarmupCompleted(-1624722145, nSetPosition.onExtraCallbackWithResult(), 1624722157, objArr5, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
                            int i13 = onExtraCallback + 39;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                            return unit;
                        }
                    }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda24
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = IAuthTabCallback + 113;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitOnNavigationEvent = TabBar.onNavigationEvent((attachAppLovinSdk) obj);
                            if (i12 != 0) {
                                int i13 = 12 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    }), fOnNavigationEvent, 0.0f, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda25
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit unitIAuthTabCallback;
                            int i10 = 2 % 2;
                            int i11 = onWarmupCompleted + 69;
                            onNavigationEvent = i11 % 128;
                            if (i11 % 2 != 0) {
                                unitIAuthTabCallback = TabBar.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
                                int i12 = 53 / 0;
                            } else {
                                unitIAuthTabCallback = TabBar.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
                            }
                            int i13 = onNavigationEvent + 13;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            return unitIAuthTabCallback;
                        }
                    }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda26
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 39;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitOnWarmupCompleted = TabBar.onWarmupCompleted((attachAppLovinSdk) obj);
                            if (i12 == 0) {
                                int i13 = 37 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    }), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda27
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 41;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                TabBar.onExtraCallbackWithResult(fOnExtraCallbackWithResult, fFloatValue, height, tabBar, ((Float) obj).floatValue());
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = TabBar.onExtraCallbackWithResult(fOnExtraCallbackWithResult, fFloatValue, height, tabBar, ((Float) obj).floatValue());
                            int i12 = onNavigationEvent + 23;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda28
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallbackWithResult + 61;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitIAuthTabCallback = TabBar.IAuthTabCallback((attachAppLovinSdk) obj);
                            int i13 = onExtraCallbackWithResult + 7;
                            onNavigationEvent = i13 % 128;
                            if (i13 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    }), f2, !tabBar.onPostMessage ? 1.0f : 0.0f, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = IAuthTabCallback + 65;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitOnExtraCallback = TabBar.onExtraCallback(this.f$0, ((Float) obj).floatValue());
                            int i13 = onNavigationEvent + 89;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnExtraCallback;
                        }
                    }, new Function1() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda17
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallbackWithResult + 47;
                            onExtraCallback = i11 % 128;
                            attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                            if (i11 % 2 == 0) {
                                return TabBar.onExtraCallback(attachapplovinsdk);
                            }
                            TabBar.onExtraCallback(attachapplovinsdk);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    tabBar.onWarmupCompleted((runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda18
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 85;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitIAuthTabCallback = TabBar.IAuthTabCallback(tabBarItemView2, tabBar, iIntValue2);
                            int i13 = onNavigationEvent + 93;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            return unitIAuthTabCallback;
                        }
                    }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TabBar$$ExternalSyntheticLambda19
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitOnWarmupCompleted = TabBar.onWarmupCompleted(this.f$0, function0);
                            int i13 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, 1, (Object) null), false, 1, (Object) null));
                    int i10 = newSession + 75;
                    newSessionWithExtras = i10 % 128;
                    if (i10 % 2 == 0) {
                        return null;
                    }
                    int i11 = 95 / 0;
                    return null;
                }
                c = c;
                z2 = z2;
                f = f;
                i = i;
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TabBar", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r3
      0x0025: PHI (r3v4 int) = (r3v2 int), (r3v6 int) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(TabBarItemView tabBarItemView, boolean z, float f) {
        int iOnWarmupCompleted;
        int iOnWarmupCompleted2;
        int i = 2 % 2;
        int i2 = newSession + 1;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            iOnWarmupCompleted = tabBarItemView.onWarmupCompleted(false);
            iOnWarmupCompleted2 = tabBarItemView.onWarmupCompleted(true);
            if (!z) {
                iOnWarmupCompleted = iOnWarmupCompleted2;
                iOnWarmupCompleted2 = iOnWarmupCompleted;
            }
        } else {
            iOnWarmupCompleted = tabBarItemView.onWarmupCompleted(true);
            iOnWarmupCompleted2 = tabBarItemView.onWarmupCompleted(false);
            if (!z) {
            }
        }
        int iIntValue = new setHasUserConsent(iOnWarmupCompleted, iOnWarmupCompleted2).IAuthTabCallback(f).intValue();
        ImageView imageViewOnNavigationEvent = tabBarItemView.onNavigationEvent();
        if (imageViewOnNavigationEvent != null) {
            int i3 = newSessionWithExtras + 49;
            newSession = i3 % 128;
            if (i3 % 2 != 0) {
                Drawable drawable = imageViewOnNavigationEvent.getDrawable();
                if (drawable != null) {
                    drawable.setTint(iIntValue);
                }
            } else {
                imageViewOnNavigationEvent.getDrawable();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 49;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Rally IAuthTabCallback(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 3;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tabBarItemView, isMuted.onNavigationEvent(isMuted.asBinder(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = newSessionWithExtras + 57;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return rally;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onWarmupCompleted(int i, TabBarItemView tabBarItemView) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = newSession + 45;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = tabBarItemView.onWarmupCompleted();
        if (iAuthTabCallbackOnWarmupCompleted != null) {
            int i5 = newSessionWithExtras + 5;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            int iOnExtraCallback = iAuthTabCallbackOnWarmupCompleted.onExtraCallback();
            z = i6 != 0 ? iOnExtraCallback == i : iOnExtraCallback == i;
        }
        boolean z2 = !z;
        int i7 = newSession + 55;
        newSessionWithExtras = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 0 / 0;
        }
        return z2;
    }

    private static final Unit onExtraCallbackWithResult(TabBar tabBar, float f) {
        int i = 2 % 2;
        int i2 = newSession + 3;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            tabBar.setTopRadius(f);
            Unit unit = Unit.INSTANCE;
            int i3 = newSessionWithExtras + 65;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        tabBar.setTopRadius(f);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 21;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = newSession + 49;
        newSessionWithExtras = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tabBar.setBottomRadius(fFloatValue);
            Unit unit = Unit.INSTANCE;
            int i3 = newSession + 73;
            newSessionWithExtras = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        tabBar.setBottomRadius(fFloatValue);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 31;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(float f, float f2, float f3, TabBar tabBar, float f4) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f * (1.0f - f4), 0.0f);
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(f2 + (f4 * (f3 - f2)), f3);
        int iCoerceAtLeast = (int) RangesKt___RangesKt.coerceAtLeast((tabBar.ICustomTabsService - fCoerceAtMost) / 2.0f, 0.0f);
        tabBar.setDrawInsetLeft(fCoerceAtLeast);
        tabBar.setDrawInsetRight(fCoerceAtLeast);
        tabBar.setDrawInsetTop(iCoerceAtLeast);
        tabBar.setDrawHeight(fCoerceAtMost);
        int i4 = (int) fCoerceAtLeast;
        tabBar.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(i4, iCoerceAtLeast, i4, iCoerceAtLeast);
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 61;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 109;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = newSession + 97;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        tabBar.onNavigationEvent(fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 57;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = newSession + 17;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = newSessionWithExtras + 87;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r0
      0x002f: PHI (r0v2 androidx.constraintlayout.widget.ConstraintLayout) = (r0v1 androidx.constraintlayout.widget.ConstraintLayout), (r0v8 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:8:0x002d, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2 = (TabBarItemView) objArr[0];
        TabBar tabBar = (TabBar) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = newSession + 111;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            constraintLayout2.setVisibility(1);
            constraintLayout = tabBar.ICustomTabsCallbackStubProxy;
            if (constraintLayout != null) {
                int i3 = newSession + 11;
                newSessionWithExtras = i3 % 128;
                int i4 = i3 % 2;
                constraintLayout.setVisibility(4);
            }
        } else {
            constraintLayout2.setVisibility(0);
            constraintLayout = tabBar.ICustomTabsCallbackStubProxy;
            if (constraintLayout != null) {
            }
        }
        tabBar.onWarmupCompleted(iIntValue);
        onExtraCallback onextracallback = tabBar.IAuthTabCallbackStubProxy;
        if (onextracallback != null) {
            int i5 = newSession + 107;
            newSessionWithExtras = i5 % 128;
            if (i5 % 2 != 0) {
                onextracallback.onExtraCallbackWithResult(iIntValue, true);
            } else {
                onextracallback.onExtraCallbackWithResult(iIntValue, true);
            }
        }
        if (!(!tabBar.onPostMessage)) {
            Cacheurls1.IAuthTabCallback iAuthTabCallback = Cacheurls1.IAuthTabCallback.onWarmupCompleted;
            tabBar.setShadow(iAuthTabCallback, tabBar.ICustomTabsCallbackStub());
            tabBar.setShadow2(iAuthTabCallback, tabBar.ICustomTabsCallbackStub());
        }
        tabBar.onWarmupCompleted(0.0f, 1.0f, RallysKt.onExtraCallback(tabBar.onUnminimized(), 500));
        tabBar.extraCallbackWithResult();
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TabBar tabBar, Function0 function0) {
        int i = 2 % 2;
        int i2 = newSession + 75;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        tabBar.setRoundType(3);
        tabBar.setCornerCircular(false);
        tabBar.setDrawHeight(0.0f);
        tabBar.setDrawInsetLeft(0.0f);
        tabBar.setDrawInsetRight(0.0f);
        tabBar.setDrawInsetTop(0.0f);
        tabBar.onExtraCallbackWithResult.onExtraCallbackWithResult.setPadding(0, 0, 0, 0);
        tabBar.onExtraCallbackWithResult.onExtraCallbackWithResult.setVisibility(4);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 75;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        Iterator<TabBarItemView> itIAuthTabCallback = onPostMessage().IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i2 = newSessionWithExtras + 39;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            itIAuthTabCallback.next().setEnabled(true);
        }
        this.onExtraCallbackWithResult.onExtraCallback.setEnabled(false);
        Iterator<TabBarItemView> itIAuthTabCallback2 = onActivityLayout().IAuthTabCallback();
        while (!(!itIAuthTabCallback2.hasNext())) {
            int i4 = newSessionWithExtras + 61;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            itIAuthTabCallback2.next().setEnabled(false);
        }
        int i6 = newSession + 39;
        newSessionWithExtras = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TabBar tabBar = (TabBar) objArr[0];
        int i = 2 % 2;
        Iterator<TabBarItemView> itIAuthTabCallback = tabBar.onPostMessage().IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i2 = newSession + 81;
            newSessionWithExtras = i2 % 128;
            (i2 % 2 != 0 ? itIAuthTabCallback.next() : itIAuthTabCallback.next()).setEnabled(false);
        }
        tabBar.onExtraCallbackWithResult.onExtraCallback.setEnabled(true);
        Iterator<TabBarItemView> itIAuthTabCallback2 = tabBar.onActivityLayout().IAuthTabCallback();
        while (itIAuthTabCallback2.hasNext()) {
            int i3 = newSession + 57;
            newSessionWithExtras = i3 % 128;
            (i3 % 2 != 0 ? itIAuthTabCallback2.next() : itIAuthTabCallback2.next()).setEnabled(true);
        }
        return null;
    }

    public final TabBarItemView IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 7;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        TabBarItemView tabBarItemView = this.isEngagementSignalsApiAvailable.get(Integer.valueOf(i));
        if (i4 != 0) {
            return tabBarItemView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onWarmupCompleted(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = newSession + 29;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        boolean globalVisibleRect = getGlobalVisibleRect(rect);
        int i4 = newSession + 69;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return globalVisibleRect;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final Sequence<TabBarItemView> onPostMessage() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Sequence<TabBarItemView> sequenceAccess100 = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayout), IAuthTabCallbackDefault.onNavigationEvent);
        Intrinsics.checkNotNull(sequenceAccess100, "");
        int i4 = newSessionWithExtras + 41;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return sequenceAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Sequence<TabBarItemView> onActivityLayout() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Sequence<TabBarItemView> sequenceAccess100 = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayout), IAuthTabCallbackStub.onExtraCallback);
        Intrinsics.checkNotNull(sequenceAccess100, "");
        int i4 = newSession + 107;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return sequenceAccess100;
    }

    private final void mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = newSession + 51;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        try {
            Iterator<TabBarItemView> itIAuthTabCallback = onActivityLayout().IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                TabBarItemView next = itIAuthTabCallback.next();
                TabBarItemView.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = next.onWarmupCompleted();
                if (iAuthTabCallbackOnWarmupCompleted != null) {
                    int i4 = newSession + 73;
                    newSessionWithExtras = i4 % 128;
                    if (i4 % 2 != 0) {
                        iAuthTabCallbackOnWarmupCompleted.onExtraCallback();
                        throw null;
                    }
                    if (iAuthTabCallbackOnWarmupCompleted.onExtraCallback() == this.ICustomTabsCallback) {
                        TabBarItemView.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{next, false}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
                        this.ICustomTabsCallback = -1;
                        int i5 = newSessionWithExtras + 43;
                        newSession = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        Object objOnWarmupCompleted;
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = i8 | (~(i9 | i10 | i));
        int i12 = (~(i6 | i9 | i)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i3 + i + i5 + (762713021 * i4) + (1579510587 * i2);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-1364308824)) - 1074288667) + (i * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i5) + ((-893132913) * i4) + (986770329 * i2) + (i15 * (-1162149888));
        switch (((i3 * (-1846875272)) - 1480523776) + ((-1846875272) * i) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i5) + ((-750387200) * i4) + ((-523632640) * i2) + ((-1971257344) * i15) + (i16 * i16 * (-1529413632))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                TabBarItemView tabBarItemView = (TabBarItemView) objArr[0];
                int i17 = 2 % 2;
                int i18 = newSession + 71;
                newSessionWithExtras = i18 % 128;
                if (i18 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(tabBarItemView, "");
                    objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{tabBarItemView, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent(RallysKt.onExtraCallback(15470), (Float) null, Float.valueOf(0.0f), (Function1) null, 4, (Object) null), 14}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 1, null, null, null, 0, 1L, false, 24280, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                } else {
                    Intrinsics.checkNotNullParameter(tabBarItemView, "");
                    objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{tabBarItemView, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent(RallysKt.onExtraCallback(200), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 50}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                }
                return (Rally) objOnWarmupCompleted;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return extraCallbackWithResult(objArr);
            case 19:
                TabBar tabBar = (TabBar) objArr[0];
                int i19 = 2 % 2;
                int i20 = newSessionWithExtras + 9;
                newSession = i20 % 128;
                int i21 = i20 % 2;
                return Integer.valueOf(varyMatches.IAuthTabCallback(tabBar, 3));
            case 20:
                TabBar tabBar2 = (TabBar) objArr[0];
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) objArr[2];
                int i22 = 2 % 2;
                int i23 = newSession + 15;
                newSessionWithExtras = i23 % 128;
                if (i23 % 2 != 0) {
                    tabBar2.onExtraCallbackWithResult.onExtraCallback.setVisibility(1);
                    tabBar2.onExtraCallbackWithResult.onExtraCallbackWithResult.setVisibility(0);
                    tabBar2.onNavigationEvent(1.0f);
                    tabBar2.setCornerCircular(true);
                    tabBar2.setRoundType(49);
                    if (tabBar2.onPostMessage) {
                        tabBar2.setShadow(new Cacheurls1.onExtraCallback(200, 40, 639180584, -436207616), appLovinSdkSettings);
                        tabBar2.setShadow2(new Cacheurls1.onExtraCallback(20, 20, 169418536, 855638016), appLovinSdkSettings);
                        int i24 = newSessionWithExtras + 69;
                        newSession = i24 % 128;
                        int i25 = i24 % 2;
                    }
                } else {
                    tabBar2.onExtraCallbackWithResult.onExtraCallback.setVisibility(0);
                    tabBar2.onExtraCallbackWithResult.onExtraCallbackWithResult.setVisibility(0);
                    tabBar2.onNavigationEvent(1.0f);
                    tabBar2.setCornerCircular(true);
                    tabBar2.setRoundType(15);
                    if (tabBar2.onPostMessage) {
                    }
                }
                tabBar2.onWarmupCompleted(1.0f, 0.0f, appLovinSdkSettings2);
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                onWarmupCompleted(-560235035, nSetPosition.onExtraCallbackWithResult(), 560235043, new Object[]{tabBar2}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                return null;
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return readTypedObject(objArr);
            case 23:
                return extraCallback(objArr);
            default:
                TabBar tabBar3 = (TabBar) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i26 = 2 % 2;
                int i27 = newSessionWithExtras + 43;
                newSession = i27 % 128;
                int i28 = i27 % 2;
                Integer numValueOf = Integer.valueOf(tabBar3.ICustomTabsCallback);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int i29 = newSessionWithExtras + 89;
                    newSession = i29 % 128;
                    int i30 = i29 % 2;
                    iIntValue = numValueOf.intValue();
                    int i31 = newSessionWithExtras + 109;
                    newSession = i31 % 128;
                    int i32 = i31 % 2;
                }
                tabBar3.onTransact(iIntValue);
                return null;
        }
    }

    public static /* synthetic */ void onExtraCallback(TabBar tabBar, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(-89754304, nSetPosition.onExtraCallbackWithResult(), 89754314, new Object[]{tabBar, view}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ boolean IAuthTabCallback(int i, TabBarItemView tabBarItemView) {
        Object[] objArr = {Integer.valueOf(i), tabBarItemView};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-636571844, nSetPosition.onExtraCallbackWithResult(), 636571862, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }

    public static /* synthetic */ int onExtraCallbackWithResult(TabBar tabBar) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(-1061381179, nSetPosition.onExtraCallbackWithResult(), 1061381184, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
    }

    public static /* synthetic */ Unit onNavigationEvent(TabBar tabBar, float f) {
        Object[] objArr = {tabBar, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-1624722145, nSetPosition.onExtraCallbackWithResult(), 1624722157, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-1498904813, nSetPosition.onExtraCallbackWithResult(), 1498904829, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(TabBar tabBar) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(-2067930, nSetPosition.onExtraCallbackWithResult(), 2067953, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallback(TabBar tabBar, int i, int i2) {
        Object[] objArr = {tabBar, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(1757469613, nSetPosition.onExtraCallbackWithResult(), -1757469598, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, AppLovinSdkSettings appLovinSdkSettings2) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(-1771324024, nSetPosition.onExtraCallbackWithResult(), 1771324044, new Object[]{this, appLovinSdkSettings, appLovinSdkSettings2}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final void writeTypedObject() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(-560235035, nSetPosition.onExtraCallbackWithResult(), 560235043, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final deprecated_dns ICustomTabsCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (deprecated_dns) onWarmupCompleted(-340126100, nSetPosition.onExtraCallbackWithResult(), 340126111, new Object[0], iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final int onActivityResized() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(-58124945, nSetPosition.onExtraCallbackWithResult(), 58124952, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
    }

    private static final int asBinder(TabBar tabBar) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(2114378252, nSetPosition.onExtraCallbackWithResult(), -2114378233, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
    }

    private static final AppLovinSdkSettings onTransact(TabBar tabBar) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onWarmupCompleted(-671552313, nSetPosition.onExtraCallbackWithResult(), 671552326, new Object[]{tabBar}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final boolean onExtraCallbackWithResult(int i, TabBarItemView tabBarItemView) {
        Object[] objArr = {Integer.valueOf(i), tabBarItemView};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-808321357, nSetPosition.onExtraCallbackWithResult(), 808321366, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }

    private final void onExtraCallbackWithResult(int i, int i2, Function0<Unit> function0) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), function0};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(-679546216, nSetPosition.onExtraCallbackWithResult(), 679546220, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(585378840, nSetPosition.onExtraCallbackWithResult(), -585378826, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(TabBar tabBar, float f) {
        Object[] objArr = {tabBar, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(353032995, nSetPosition.onExtraCallbackWithResult(), -353032978, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(TabBarItemView tabBarItemView, TabBar tabBar, int i) {
        Object[] objArr = {tabBarItemView, tabBar, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(1549686270, nSetPosition.onExtraCallbackWithResult(), -1549686249, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Rally asInterface(TabBarItemView tabBarItemView) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Rally) onWarmupCompleted(-503327346, nSetPosition.onExtraCallbackWithResult(), 503327349, new Object[]{tabBarItemView}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallbackDefault(TabBar tabBar, float f) {
        Object[] objArr = {tabBar, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(1472600756, nSetPosition.onExtraCallbackWithResult(), -1472600750, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final void IAuthTabCallbackDefault(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onWarmupCompleted(1217266318, nSetPosition.onExtraCallbackWithResult(), -1217266318, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public final int access100() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(-1022135893, nSetPosition.onExtraCallbackWithResult(), 1022135895, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).intValue();
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }

    public final boolean onExtraCallback(int i, @NotNull Function0<Unit> function0) {
        Object[] objArr = {this, Integer.valueOf(i), function0};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(658606498, nSetPosition.onExtraCallbackWithResult(), -658606497, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }
}
