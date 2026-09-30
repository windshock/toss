package com.swmansion.rnscreens;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import com.initech.pkix.cmp.client.util.URI;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.bottomsheet.SheetDetents;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.HeaderHeightChangeEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = ScreenViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ScreenViewManager extends ViewGroupManager<Screen> implements RNSScreenManagerInterface<Screen> {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final String REACT_CLASS = "RNSScreen";
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<Screen> delegate;
    private static final byte[] $$a = {66, -42, -1, 80};
    private static final int $$b = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = (b * 3) + 115;
        int i3 = s + 4;
        int i4 = b2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i = 0;
            int i8 = i6;
            i2 = i3 + i7;
            i3 = i8;
            int i9 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i++;
            i7 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i3 = i10;
            int i82 = i6;
            i2 = i3 + i7;
            i3 = i82;
            int i92 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i922 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onNavigationEvent();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onTransact + 69;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setBottomScrollEdgeEffect(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setCustomAnimationOnSwipe(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }

    public void setFullScreenSwipeEnabled(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
    }

    public void setFullScreenSwipeShadowEnabled(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setGestureResponseDistance(@Nullable Screen screen, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    public void setHideKeyboardOnSwipe(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setHomeIndicatorHidden(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    public void setLeftScrollEdgeEffect(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setPreventNativeDismiss(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setRightScrollEdgeEffect(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setSwipeDirection(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setSynchronousShadowStateUpdatesEnabled(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setTopScrollEdgeEffect(@Nullable Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransitionDuration(@Nullable Screen screen, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public ScreenViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenManagerDelegate(this);
    }

    public /* bridge */ /* synthetic */ void addView(View view, View view2, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        addView((Screen) view, view2, i);
        if (i4 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        addView((Screen) viewGroup, view, i);
        int i5 = IAuthTabCallbackStub + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ View createViewInstance(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            m14createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Screen screenM14createViewInstance = m14createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i3 = IAuthTabCallbackStub + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return screenM14createViewInstance;
    }

    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onAfterUpdateTransaction((Screen) view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void removeView(ViewGroup viewGroup, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        removeView((Screen) viewGroup, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void removeViewAt(View view, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 39;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        removeViewAt((Screen) view, i);
        int i5 = asInterface + 45;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        removeViewAt((Screen) viewGroup, i);
        int i5 = IAuthTabCallbackStub + 99;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setActivityState(View view, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setActivityState((Screen) view, f);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = asInterface + 109;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setAndroidResetScreenShadowStateOnOrientationChangeEnabled((Screen) view, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setBottomScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setBottomScrollEdgeEffect((Screen) view, str);
        int i4 = IAuthTabCallbackStub + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setCustomAnimationOnSwipe(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setCustomAnimationOnSwipe((Screen) view, z);
        int i4 = IAuthTabCallbackStub + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setFullScreenSwipeEnabled(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setFullScreenSwipeEnabled((Screen) view, str);
        int i4 = asInterface + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setFullScreenSwipeShadowEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setFullScreenSwipeShadowEnabled((Screen) view, z);
        int i4 = IAuthTabCallbackStub + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setGestureEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setGestureEnabled((Screen) view, z);
        int i4 = IAuthTabCallbackStub + 93;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setGestureResponseDistance(View view, ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setGestureResponseDistance((Screen) view, readableMap);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallbackStub + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setHideKeyboardOnSwipe(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setHideKeyboardOnSwipe((Screen) view, z);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setHomeIndicatorHidden(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setHomeIndicatorHidden((Screen) view, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setLeftScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setLeftScrollEdgeEffect((Screen) view, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setNativeBackButtonDismissalEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setNativeBackButtonDismissalEnabled((Screen) view, z);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = asInterface + 117;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setNavigationBarColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setNavigationBarColor((Screen) view, num);
        int i4 = asInterface + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setNavigationBarHidden(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setNavigationBarHidden((Screen) view, z);
        int i4 = asInterface + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setNavigationBarTranslucent(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setNavigationBarTranslucent((Screen) view, z);
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setPreventNativeDismiss(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setPreventNativeDismiss((Screen) view, z);
        int i4 = asInterface + 97;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setReplaceAnimation(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setReplaceAnimation((Screen) view, str);
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setRightScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setRightScrollEdgeEffect((Screen) view, str);
        int i4 = IAuthTabCallbackStub + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setScreenId(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setScreenId((Screen) view, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setScreenOrientation(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setScreenOrientation((Screen) view, str);
        int i4 = IAuthTabCallbackStub + 97;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setSheetAllowedDetents(View view, ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setSheetAllowedDetents((Screen) view, readableArray);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setSheetCornerRadius(View view, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setSheetCornerRadius((Screen) view, f);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setSheetDefaultResizeAnimationEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSheetDefaultResizeAnimationEnabled((Screen) view, z);
        int i4 = asInterface + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setSheetElevation(View view, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        setSheetElevation((Screen) view, i);
        int i5 = IAuthTabCallbackStub + 73;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setSheetExpandsWhenScrolledToEdge(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSheetExpandsWhenScrolledToEdge((Screen) view, z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setSheetGrabberVisible(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSheetGrabberVisible((Screen) view, z);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallbackStub + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setSheetInitialDetent(View view, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        setSheetInitialDetent((Screen) view, i);
        int i5 = asInterface + 99;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setSheetLargestUndimmedDetent(View view, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 83;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        setSheetLargestUndimmedDetent((Screen) view, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackStub + 1;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setSheetShouldOverflowTopInset(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSheetShouldOverflowTopInset((Screen) view, z);
        int i4 = asInterface + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setStackAnimation(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setStackAnimation((Screen) view, str);
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setStackPresentation(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setStackPresentation((Screen) view, str);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setStatusBarAnimation(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarAnimation((Screen) view, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setStatusBarColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarColor((Screen) view, num);
        int i4 = IAuthTabCallbackStub + 51;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setStatusBarHidden(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarHidden((Screen) view, z);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = IAuthTabCallbackStub + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setStatusBarStyle(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarStyle((Screen) view, str);
        int i4 = asInterface + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setStatusBarTranslucent(View view, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setStatusBarTranslucent((Screen) view, z);
        int i4 = asInterface + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setSwipeDirection(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSwipeDirection((Screen) view, str);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setSynchronousShadowStateUpdatesEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setSynchronousShadowStateUpdatesEnabled((Screen) view, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setTopScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTopScrollEdgeEffect((Screen) view, str);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setTransitionDuration(View view, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 93;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setTransitionDuration((Screen) view, i);
        if (i4 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, ReactStylesDiffMap reactStylesDiffMap, CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objUpdateState = updateState((Screen) view, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
        int i4 = asInterface + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objUpdateState;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return REACT_CLASS;
        }
        throw null;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected Screen m14createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Screen screen = new Screen(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return screen;
    }

    public void setActivityState(@NotNull Screen screen, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        setActivityState(screen, (int) f);
        int i4 = IAuthTabCallbackStub + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void addView(@NotNull Screen screen, @NotNull View view, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 1;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof ScreenContentWrapper;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof ScreenContentWrapper) {
            int i4 = IAuthTabCallbackStub + 41;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                screen.registerLayoutCallbackForWrapper((ScreenContentWrapper) view);
                obj.hashCode();
                throw null;
            }
            screen.registerLayoutCallbackForWrapper((ScreenContentWrapper) view);
        } else if (view instanceof ScreenFooter) {
            screen.setFooter((ScreenFooter) view);
        }
        super.addView(screen, view, i);
        int i5 = asInterface + 43;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void removeViewAt(@NotNull Screen screen, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            boolean z = screen.getChildAt(i) instanceof ScreenFooter;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        if (screen.getChildAt(i) instanceof ScreenFooter) {
            int i4 = IAuthTabCallbackStub + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            screen.setFooter((ScreenFooter) null);
        }
        super.removeViewAt(screen, i);
        int i6 = IAuthTabCallbackStub + 11;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void removeView(@NotNull Screen screen, @NotNull View view) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(view, "");
            super.removeView(screen, view);
            int i3 = 62 / 0;
            if (!(view instanceof ScreenFooter)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(view, "");
            super.removeView(screen, view);
            if (!(view instanceof ScreenFooter)) {
                return;
            }
        }
        int i4 = asInterface + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        screen.setFooter((ScreenFooter) null);
        if (i5 != 0) {
            int i6 = 77 / 0;
        }
    }

    public Object updateState(@NotNull Screen screen, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        Object objUpdateState = super/*com.facebook.react.uimanager.ViewManager*/.updateState(screen, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
        int i4 = asInterface + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objUpdateState;
    }

    protected void onAfterUpdateTransaction(@NotNull Screen screen) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(screen);
            screen.onFinalizePropsUpdate$react_native_screens_release();
        } else {
            Intrinsics.checkNotNullParameter(screen, "");
            super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(screen);
            screen.onFinalizePropsUpdate$react_native_screens_release();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void logNotAvailable(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "activityState")
    public final void setActivityState(@NotNull Screen screen, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        if (i != -1) {
            if (i == 0) {
                screen.setActivityState(Screen.ActivityState.INACTIVE);
                return;
            }
            if (i == 1) {
                screen.setActivityState(Screen.ActivityState.TRANSITIONING_OR_BELOW_TOP);
                int i3 = asInterface + 113;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            screen.setActivityState(Screen.ActivityState.ON_TOP);
            int i4 = asInterface + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r14.equals("fullScreenModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r14.equals("containedTransparentModal") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r14.equals("containedModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r14.equals("modal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        if (r14.equals("transparentModal") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        r14 = com.swmansion.rnscreens.Screen.StackPresentation.TRANSPARENT_MODAL;
     */
    @ReactProp(IAuthTabCallbackStub = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackPresentation(@NotNull Screen screen, @Nullable String str) throws Throwable {
        Screen.StackPresentation stackPresentation;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        if (str != null) {
            int i4 = IAuthTabCallbackStub + 19;
            asInterface = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            switch (str.hashCode()) {
                case -76271493:
                    break;
                case 3452698:
                    b((byte) ExpandableListView.getPackedPositionType(0L), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 103), (-1453130394) + TextUtils.getOffsetBefore("", 0), (Process.myTid() >> 22) - 111, (-1380175122) - ExpandableListView.getPackedPositionType(0L), new Object[1]);
                    if (!(!str.equals(((String) r4[0]).intern()))) {
                        int i5 = IAuthTabCallbackStub + 37;
                        asInterface = i5 % 128;
                        if (i5 % 2 != 0) {
                            stackPresentation = Screen.StackPresentation.PUSH;
                            screen.setStackPresentation(stackPresentation);
                            return;
                        } else {
                            Screen.StackPresentation stackPresentation2 = Screen.StackPresentation.PUSH;
                            obj.hashCode();
                            throw null;
                        }
                    }
                    break;
                case 104069805:
                    break;
                case 438078970:
                    break;
                case 872434704:
                    if (str.equals("pageSheet")) {
                        int i6 = asInterface + 13;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        stackPresentation = Screen.StackPresentation.MODAL;
                        screen.setStackPresentation(stackPresentation);
                        return;
                    }
                    break;
                case 955284238:
                    break;
                case 1171936146:
                    break;
                case 1798290171:
                    if (str.equals("formSheet")) {
                        int i8 = IAuthTabCallbackStub + 105;
                        asInterface = i8 % 128;
                        if (i8 % 2 == 0) {
                            Screen.StackPresentation stackPresentation3 = Screen.StackPresentation.FORM_SHEET;
                            throw null;
                        }
                        stackPresentation = Screen.StackPresentation.FORM_SHEET;
                        screen.setStackPresentation(stackPresentation);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r14.equals("flip") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r14.equals("simple_push") != false) goto L50;
     */
    @ReactProp(IAuthTabCallbackStub = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackAnimation(@NotNull Screen screen, @Nullable String str) throws Throwable {
        Screen$StackAnimation screen$StackAnimation;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        if (str != null) {
            Object obj = null;
            switch (str.hashCode()) {
                case -1418955385:
                    break;
                case -1198710326:
                    if (str.equals("ios_from_left")) {
                        screen$StackAnimation = Screen$StackAnimation.IOS_FROM_LEFT;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case -427095442:
                    if (str.equals("slide_from_left")) {
                        screen$StackAnimation = Screen$StackAnimation.SLIDE_FROM_LEFT;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case -349395819:
                    if (str.equals("slide_from_right")) {
                        int i2 = asInterface + 65;
                        IAuthTabCallbackStub = i2 % 128;
                        int i3 = i2 % 2;
                        screen$StackAnimation = Screen$StackAnimation.SLIDE_FROM_RIGHT;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 3135100:
                    if (str.equals("fade")) {
                        screen$StackAnimation = Screen$StackAnimation.FADE;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 3145837:
                    break;
                case 3387192:
                    Object[] objArr = new Object[1];
                    b((byte) View.resolveSizeAndState(0, 0, 0), (short) (MotionEvent.axisFromString("") - 63), (-1453130391) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) - 110, (-1380175125) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
                    if (str.equals(((String) objArr[0]).intern())) {
                        int i4 = IAuthTabCallbackStub + 91;
                        asInterface = i4 % 128;
                        if (i4 % 2 == 0) {
                            Screen$StackAnimation screen$StackAnimation2 = Screen$StackAnimation.NONE;
                            obj.hashCode();
                            throw null;
                        }
                        screen$StackAnimation = Screen$StackAnimation.NONE;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 182437661:
                    if (str.equals("fade_from_bottom")) {
                        screen$StackAnimation = Screen$StackAnimation.FADE_FROM_BOTTOM;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 1500346553:
                    if (str.equals("ios_from_right")) {
                        int i5 = asInterface + 35;
                        IAuthTabCallbackStub = i5 % 128;
                        if (i5 % 2 != 0) {
                            Screen$StackAnimation screen$StackAnimation3 = Screen$StackAnimation.IOS_FROM_RIGHT;
                            obj.hashCode();
                            throw null;
                        }
                        screen$StackAnimation = Screen$StackAnimation.IOS_FROM_RIGHT;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 1544803905:
                    if (str.equals(BizSceneNavigateManager.KEY_DEFAULT)) {
                        int i6 = IAuthTabCallbackStub + 67;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        screen$StackAnimation = Screen$StackAnimation.DEFAULT;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 1601504978:
                    if (str.equals("slide_from_bottom")) {
                        screen$StackAnimation = Screen$StackAnimation.SLIDE_FROM_BOTTOM;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                default:
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
            }
        } else {
            screen$StackAnimation = Screen$StackAnimation.DEFAULT;
        }
        screen.setStackAnimation(screen$StackAnimation);
    }

    @ReactProp(IAuthTabCallbackStub = "gestureEnabled", onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY)
    public void setGestureEnabled(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setGestureEnabled(z);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setGestureEnabled(z);
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    @ReactProp(IAuthTabCallbackStub = "replaceAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setReplaceAnimation(@NotNull Screen screen, @Nullable String str) throws Throwable {
        Screen$ReplaceAnimation screen$ReplaceAnimation;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        if (str != null) {
            int i3 = asInterface + 39;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(str, "pop")) {
                screen$ReplaceAnimation = Screen$ReplaceAnimation.POP;
            } else {
                Object[] objArr = new Object[1];
                b((byte) TextUtils.getOffsetAfter("", 0), (short) (View.resolveSizeAndState(0, 0, 0) + 103), Color.green(0) - 1453130394, (-112) - MotionEvent.axisFromString(""), (-1380175122) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                    throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
                }
                int i5 = asInterface + 115;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                screen$ReplaceAnimation = Screen$ReplaceAnimation.PUSH;
            }
        }
        screen.setReplaceAnimation(screen$ReplaceAnimation);
    }

    @ReactProp(IAuthTabCallbackStub = "screenOrientation")
    public void setScreenOrientation(@NotNull Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setScreenOrientation(str);
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    @ReactProp(IAuthTabCallbackStub = "statusBarAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStatusBarAnimation(@NotNull Screen screen, @Nullable String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        boolean z = false;
        if (str != null) {
            int i2 = IAuthTabCallbackStub + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((byte) (ViewConfiguration.getEdgeSlop() >> 16), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 64), (-1453130389) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-112) - ExpandableListView.getPackedPositionChild(0L), (-1380175123) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            if (Intrinsics.areEqual(((String) objArr[0]).intern(), str)) {
                int i4 = asInterface + 23;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                z = true;
            }
        }
        screen.setStatusBarAnimated(Boolean.valueOf(z));
    }

    @ReactProp(IAuthTabCallbackStub = "statusBarColor", onWarmupCompleted = "Color")
    public void setStatusBarColor(@NotNull Screen screen, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            logNotAvailable("statusBarColor");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        logNotAvailable("statusBarColor");
        int i3 = asInterface + 101;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "statusBarStyle")
    public void setStatusBarStyle(@NotNull Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setStatusBarStyle(str);
        } else {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setStatusBarStyle(str);
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        logNotAvailable("statusBarTranslucent");
        int i4 = IAuthTabCallbackStub + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "statusBarHidden")
    public void setStatusBarHidden(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setStatusBarHidden(Boolean.valueOf(z));
        int i4 = asInterface + 35;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int length;
        byte[] bArr;
        int i4;
        char c = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 43425), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $10 + 85;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char offsetBefore = (char) (12843 - TextUtils.getOffsetBefore("", 0));
                            int keyRepeatTimeout = 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int scrollBarSize = 2167 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b2 = $$a[c];
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, keyRepeatTimeout, scrollBarSize, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        c = 2;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43424), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    int i9 = $10 + 47;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                if (z2) {
                    int i12 = $10 + 65;
                    $11 = i12 % 128;
                    int i13 = i12 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i13;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 86 - (Process.myTid() >> 22), 9568 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int i14 = $11 + 69;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i4 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i4 = 0;
                        }
                        while (i4 < length) {
                            bArr[i4] = (byte) (bArr5[i4] ^ (-4629411779493505016L));
                            i4++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i15 = $10 + 83;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    @ReactProp(IAuthTabCallbackStub = "navigationBarColor", onWarmupCompleted = "Color")
    public void setNavigationBarColor(@NotNull Screen screen, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        logNotAvailable("navigationBarColor");
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        logNotAvailable("navigationBarTranslucent");
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "navigationBarHidden")
    public void setNavigationBarHidden(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setNavigationBarHidden(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setNativeBackButtonDismissalEnabled(z);
            int i3 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setNativeBackButtonDismissalEnabled(z);
        }
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @ReactProp(IAuthTabCallbackStub = "sheetElevation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSheetElevation(@Nullable Screen screen, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
            if (screen != null) {
                screen.setSheetElevation(i);
            }
        } else if (screen != null) {
        }
        int i5 = IAuthTabCallbackStub + 119;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "sheetShouldOverflowTopInset")
    public void setSheetShouldOverflowTopInset(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (screen != null) {
            screen.setSheetShouldOverflowTopInset(z);
            int i4 = asInterface + 31;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "sheetDefaultResizeAnimationEnabled")
    public void setSheetDefaultResizeAnimationEnabled(@Nullable Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (screen != null) {
            int i5 = i2 + 25;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            screen.setSheetDefaultResizeAnimationEnabled(z);
            if (i6 == 0) {
                int i7 = 45 / 0;
            }
        }
        int i8 = asInterface + 109;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @ReactProp(IAuthTabCallbackStub = "sheetAllowedDetents")
    public void setSheetAllowedDetents(@NotNull Screen screen, @Nullable ReadableArray readableArray) {
        ?? ListOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        if (readableArray == null || readableArray.size() <= 0) {
            ListOf = CollectionsKt.listOf(Double.valueOf(1.0d));
            int i3 = asInterface + 43;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int size = readableArray.size();
            ListOf = new ArrayList(size);
            int i5 = 0;
            while (i5 < size) {
                int i6 = asInterface + 103;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    ListOf.add(Double.valueOf(readableArray.getDouble(i5)));
                    i5 += 121;
                } else {
                    ListOf.add(Double.valueOf(readableArray.getDouble(i5)));
                    i5++;
                }
            }
        }
        screen.setSheetDetents(new SheetDetents((List) ListOf));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @ReactProp(IAuthTabCallbackStub = "sheetLargestUndimmedDetent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSheetLargestUndimmedDetent(@NotNull Screen screen, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 91;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            int i4 = 44 / 0;
            if (-1 <= i) {
                if (i < 3) {
                    int i5 = IAuthTabCallbackStub + 71;
                    asInterface = i5 % 128;
                    if (i5 % 2 != 0) {
                        screen.setSheetLargestUndimmedDetentIndex(i);
                        return;
                    } else {
                        screen.setSheetLargestUndimmedDetentIndex(i);
                        int i6 = 27 / 0;
                        return;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(screen, "");
            if (-1 <= i) {
            }
        }
        throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
    }

    @ReactProp(IAuthTabCallbackStub = "sheetGrabberVisible")
    public void setSheetGrabberVisible(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setSheetGrabberVisible(z);
        int i4 = asInterface + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "sheetCornerRadius")
    public void setSheetCornerRadius(@NotNull Screen screen, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setSheetCornerRadius(f);
        int i4 = IAuthTabCallbackStub + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(@NotNull Screen screen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setSheetExpandsWhenScrolledToEdge(z);
        int i4 = asInterface + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "sheetInitialDetent")
    public void setSheetInitialDetent(@NotNull Screen screen, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 103;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screen, "");
            screen.setSheetInitialDetentIndex(i);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(screen, "");
        screen.setSheetInitialDetentIndex(i);
        int i4 = asInterface + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setScreenId(@NotNull Screen screen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screen, "");
        if (str == null || str.length() == 0) {
            int i4 = asInterface + 23;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        screen.setScreenId(str);
        int i6 = asInterface + 27;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("topDismissed", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onDismissed")})), getWrite.IAuthTabCallback("topWillAppear", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onWillAppear")})), getWrite.IAuthTabCallback("topAppear", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onAppear")})), getWrite.IAuthTabCallback("topWillDisappear", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onWillDisappear")})), getWrite.IAuthTabCallback("topDisappear", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onDisappear")})), getWrite.IAuthTabCallback(HeaderHeightChangeEvent.EVENT_NAME, access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onHeaderHeightChange")})), getWrite.IAuthTabCallback(HeaderBackButtonClickedEvent.EVENT_NAME, access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onHeaderBackButtonClicked")})), getWrite.IAuthTabCallback("topTransitionProgress", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onTransitionProgress")})), getWrite.IAuthTabCallback("topSheetDetentChanged", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onSheetDetentChanged")}))});
        int i4 = IAuthTabCallbackStub + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<Screen> getDelegate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<Screen> r8lambdafabcsqiuodz2nkxqdax2sri9ddq = this.delegate;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return r8lambdafabcsqiuodz2nkxqdax2sri9ddq;
    }

    static void onNavigationEvent() {
        onExtraCallback = -220538222;
        IAuthTabCallback = -1538795418;
        onNavigationEvent = -167504502;
        onWarmupCompleted = new byte[]{-98, -122, -97, -106, -98, 63, 55, 73};
    }
}
