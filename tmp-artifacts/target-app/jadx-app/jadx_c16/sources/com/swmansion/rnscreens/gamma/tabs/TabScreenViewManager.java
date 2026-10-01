package com.swmansion.rnscreens.gamma.tabs;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface;
import com.swmansion.rnscreens.gamma.helpers.EventHelpersKt;
import com.swmansion.rnscreens.gamma.tabs.event.TabScreenDidAppearEvent;
import com.swmansion.rnscreens.gamma.tabs.event.TabScreenDidDisappearEvent;
import com.swmansion.rnscreens.gamma.tabs.event.TabScreenWillAppearEvent;
import com.swmansion.rnscreens.gamma.tabs.event.TabScreenWillDisappearEvent;
import com.swmansion.rnscreens.gamma.tabs.image.TabsImageLoaderKt;
import com.swmansion.rnscreens.utils.RNSLog;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8100;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = TabScreenViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TabScreenViewManager extends ViewGroupManager<TabScreen> implements RNSBottomTabsScreenManagerInterface<TabScreen> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final String REACT_CLASS = "RNSBottomTabsScreen";
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private CredentialProviderGetSignInIntentControllerhandleResponse2 context;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TabScreen> delegate;

    static {
        onNavigationEvent();
        Object obj = null;
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setBottomScrollEdgeEffect(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    public void setIconImageSource(@Nullable TabScreen tabScreen, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setIconResourceName(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setIconType(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsTitleUndefined(@NotNull TabScreen tabScreen, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setLeftScrollEdgeEffect(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
    }

    public void setOrientation(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        int i4 = IAuthTabCallbackStub + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setOverrideScrollViewContentInsetAdjustmentBehavior(@NotNull TabScreen tabScreen, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setRightScrollEdgeEffect(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setScrollEdgeAppearance(@NotNull TabScreen tabScreen, @NotNull Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        Intrinsics.checkNotNullParameter(dynamic, "");
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    public void setSelectedIconImageSource(@Nullable TabScreen tabScreen, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void setSelectedIconResourceName(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setStandardAppearance(@NotNull TabScreen tabScreen, @NotNull Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        Intrinsics.checkNotNullParameter(dynamic, "");
        int i4 = IAuthTabCallbackStub + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSystemItem(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setTopScrollEdgeEffect(@Nullable TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
    }

    public void setUserInterfaceStyle(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public TabScreenViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSBottomTabsScreenManagerDelegate(this);
    }

    public /* bridge */ /* synthetic */ void addEventEmitters(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, (TabScreen) view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ View createViewInstance(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TabScreen tabScreenM18createViewInstance = m18createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i4 = IAuthTabCallbackStub + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return tabScreenM18createViewInstance;
    }

    public /* bridge */ /* synthetic */ void setBadgeValue(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setBadgeValue((TabScreen) view, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setBottomScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setBottomScrollEdgeEffect((TabScreen) view, str);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        int i5 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setDrawableIconResourceName(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setDrawableIconResourceName((TabScreen) view, str);
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setIconImageSource(View view, ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setIconImageSource((TabScreen) view, readableMap);
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setIconResourceName(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setIconResourceName((TabScreen) view, str);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setIconType(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setIconType((TabScreen) view, str);
        int i4 = IAuthTabCallbackStub + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setImageIconResource(View view, ReadableMap readableMap) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setImageIconResource((TabScreen) view, readableMap);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setIsFocused(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setIsFocused((TabScreen) view, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setIsTitleUndefined(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setIsTitleUndefined((TabScreen) view, z);
        int i4 = IAuthTabCallbackStub + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setLeftScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setLeftScrollEdgeEffect((TabScreen) view, str);
        int i4 = IAuthTabCallbackStub + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setOrientation(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setOrientation((TabScreen) view, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setOverrideScrollViewContentInsetAdjustmentBehavior(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setOverrideScrollViewContentInsetAdjustmentBehavior((TabScreen) view, z);
        int i4 = IAuthTabCallbackStub + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setRightScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setRightScrollEdgeEffect((TabScreen) view, str);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = IAuthTabCallbackStub + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setScrollEdgeAppearance(View view, Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setScrollEdgeAppearance((TabScreen) view, dynamic);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setSelectedIconImageSource(View view, ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setSelectedIconImageSource((TabScreen) view, readableMap);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setSelectedIconResourceName(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setSelectedIconResourceName((TabScreen) view, str);
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setSpecialEffects(View view, ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setSpecialEffects((TabScreen) view, readableMap);
        int i4 = IAuthTabCallbackStub + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setStandardAppearance(View view, Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setStandardAppearance((TabScreen) view, dynamic);
        int i4 = IAuthTabCallbackStub + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setSystemItem(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setSystemItem((TabScreen) view, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setTabBarItemAccessibilityLabel(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTabBarItemAccessibilityLabel((TabScreen) view, str);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setTabBarItemBadgeBackgroundColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTabBarItemBadgeBackgroundColor((TabScreen) view, num);
        int i4 = IAuthTabCallbackStub + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setTabBarItemBadgeTextColor(View view, Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setTabBarItemBadgeTextColor((TabScreen) view, num);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setTabBarItemTestID(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTabBarItemTestID((TabScreen) view, str);
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setTabKey(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTabKey((TabScreen) view, str);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setTitle(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setTitle((TabScreen) view, str);
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setTopScrollEdgeEffect(View view, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setTopScrollEdgeEffect((TabScreen) view, str);
        int i4 = IAuthTabCallbackStub + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setUserInterfaceStyle(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setUserInterfaceStyle((TabScreen) view, str);
        if (i3 == 0) {
            throw null;
        }
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return REACT_CLASS;
    }

    public final CredentialProviderGetSignInIntentControllerhandleResponse2 getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2 = this.context;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return credentialProviderGetSignInIntentControllerhandleResponse2;
    }

    public final void setContext(@Nullable CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.context = credentialProviderGetSignInIntentControllerhandleResponse2;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected TabScreen m18createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        RNSLog.INSTANCE.d(REACT_CLASS, "createViewInstance");
        TabScreen tabScreen = new TabScreen(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return tabScreen;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TabScreen> getDelegate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TabScreen> r8lambdafabcsqiuodz2nkxqdax2sri9ddq = this.delegate;
        int i4 = i2 + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdafabcsqiuodz2nkxqdax2sri9ddq;
        }
        throw null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{EventHelpersKt.makeEventRegistrationInfo(TabScreenWillAppearEvent.Companion), EventHelpersKt.makeEventRegistrationInfo(TabScreenDidAppearEvent.Companion), EventHelpersKt.makeEventRegistrationInfo(TabScreenWillDisappearEvent.Companion), EventHelpersKt.makeEventRegistrationInfo(TabScreenDidDisappearEvent.Companion)});
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    protected void addEventEmitters(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull TabScreen tabScreen) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
            Intrinsics.checkNotNullParameter(tabScreen, "");
            super/*com.facebook.react.uimanager.BaseViewManager*/.addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, tabScreen);
            tabScreen.onViewManagerAddEventEmitters$react_native_screens_release();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(tabScreen, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, tabScreen);
        tabScreen.onViewManagerAddEventEmitters$react_native_screens_release();
        int i3 = IAuthTabCallbackStub + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemBadgeBackgroundColor", onWarmupCompleted = "Color")
    public void setTabBarItemBadgeBackgroundColor(@NotNull TabScreen tabScreen, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        tabScreen.setTabBarItemBadgeBackgroundColor(num);
        int i4 = onExtraCallbackWithResult + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "isFocused")
    public void setIsFocused(@NotNull TabScreen tabScreen, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        RNSLog.INSTANCE.d(REACT_CLASS, "TabScreen [" + tabScreen.getId() + "] setIsFocused " + z);
        tabScreen.setFocusedTab(z);
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "tabKey")
    public void setTabKey(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabKey(str);
        } else {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabKey(str);
            int i3 = 64 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "badgeValue")
    public void setBadgeValue(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setBadgeValue(str);
        } else {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setBadgeValue(str);
            int i3 = 55 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "title")
    public void setTitle(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        tabScreen.setTabTitle(str);
        int i4 = IAuthTabCallbackStub + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[PHI: r9
      0x004d: PHI (r9v3 com.facebook.react.bridge.ReadableMap) = (r9v2 com.facebook.react.bridge.ReadableMap), (r9v4 com.facebook.react.bridge.ReadableMap) binds: [B:18:0x004b, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    @ReactProp(IAuthTabCallbackStub = "specialEffects")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSpecialEffects(@NotNull TabScreen tabScreen, @Nullable ReadableMap readableMap) {
        boolean zHasKey;
        boolean z;
        ReadableMap map;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        Object obj = null;
        if (readableMap != null) {
            int i4 = IAuthTabCallbackStub + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                readableMap.hasKey("repeatedTabSelection");
                obj.hashCode();
                throw null;
            }
            zHasKey = readableMap.hasKey("repeatedTabSelection");
        } else {
            zHasKey = false;
        }
        boolean z2 = true;
        if (zHasKey) {
            int i5 = onExtraCallbackWithResult + 27;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                map = readableMap.getMap("repeatedTabSelection");
                int i6 = 30 / 0;
                if (map != null) {
                    z = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
                    if (map.hasKey("popToRoot")) {
                        int i7 = IAuthTabCallbackStub + 89;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            map.getBoolean("popToRoot");
                            obj.hashCode();
                            throw null;
                        }
                        z2 = map.getBoolean("popToRoot");
                    }
                } else {
                    z = true;
                }
            } else {
                map = readableMap.getMap("repeatedTabSelection");
                if (map != null) {
                }
            }
        }
        tabScreen.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z2);
        tabScreen.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z);
        int i8 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTestID")
    public void setTabBarItemTestID(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabBarItemTestID(str);
        } else {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabBarItemTestID(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemAccessibilityLabel")
    public void setTabBarItemAccessibilityLabel(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabBarItemAccessibilityLabel(str);
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setTabBarItemAccessibilityLabel(str);
        }
        int i4 = IAuthTabCallbackStub + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemBadgeTextColor", onWarmupCompleted = "Color")
    public void setTabBarItemBadgeTextColor(@NotNull TabScreen tabScreen, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        tabScreen.setTabBarItemBadgeTextColor(num);
        int i4 = IAuthTabCallbackStub + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "drawableIconResourceName")
    public void setDrawableIconResourceName(@NotNull TabScreen tabScreen, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setDrawableIconResourceName(str);
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tabScreen, "");
            tabScreen.setDrawableIconResourceName(str);
        }
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "imageIconResource")
    public void setImageIconResource(@NotNull TabScreen tabScreen, @Nullable ReadableMap readableMap) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabScreen, "");
        Object obj = null;
        if (readableMap != null) {
            Object[] objArr = new Object[1];
            b((byte) (78 - TextUtils.indexOf((CharSequence) "", '0')), 3 - TextUtils.indexOf("", "", 0), new char[]{0, 1, 13890}, objArr);
            string = readableMap.getString(((String) objArr[0]).intern());
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = null;
        }
        if (string != null) {
            int i6 = onExtraCallbackWithResult + 3;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            Context context = tabScreen.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            TabsImageLoaderKt.loadTabImage(context, string, tabScreen);
            if (i7 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, 23139 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $11 + 41;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    c = '0';
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Color.green(0) + 26, (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 24824), View.MeasureSpec.getSize(0) + 74, 8089 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $11 + 101;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 30 - Color.green(0), 19487 - TextUtils.lastIndexOf("", '0', 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $10 + 69;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{64961, 64966, 64986, 64960};
        onNavigationEvent = (char) 51243;
    }
}
