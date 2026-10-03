package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.cascraping.AbsCaScrapingMessageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class getSemanticsIdentifier implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final String IAuthTabCallback;
    public static final String IAuthTabCallbackDefault;
    public static final String IAuthTabCallbackStub;
    public static final String IAuthTabCallbackStubProxy;
    public static final String IAuthTabCallback_Parcel;
    public static final String ICustomTabsCallback;
    public static final String ICustomTabsCallbackDefault;
    public static final String ICustomTabsCallbackStub;
    public static final String ICustomTabsCallbackStubProxy;
    public static final String ICustomTabsCallback_Parcel;
    public static final String ICustomTabsService;
    public static final String access000;
    public static final String access100;
    public static final String asBinder;
    public static final String asInterface;
    public static final String extraCallback;
    public static final String extraCallbackWithResult;
    public static final String getInterfaceDescriptor;
    public static final String isEngagementSignalsApiAvailable;
    public static final String mayLaunchUrl;
    private static char newAuthTabSession = 0;
    private static char newSession = 0;
    private static char newSessionWithExtras = 0;
    public static final String onActivityLayout;
    public static final String onActivityResized;
    public static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    public static final String onMessageChannelReady;
    public static final String onMinimized;
    public static final String onNavigationEvent;
    public static final String onPostMessage;
    public static final String onRelationshipValidationResult;
    public static final String onTransact;
    public static final String onUnminimized;
    public static final String onWarmupCompleted;
    private static char postMessage = 0;
    private static char[] prefetch = null;
    public static final String readTypedObject;
    private static int receiveFile = 1;
    private static int requestPostMessageChannel = 0;
    private static int requestPostMessageChannelWithExtras = 0;
    private static int setEngagementSignalsCallback = 1;
    public static final String writeTypedObject;
    private final boolean extraCommand;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 22, 0, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0}, objArr);
        ICustomTabsService = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{22, 16, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr2);
        mayLaunchUrl = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{38, 9, 5, 3}, true, new byte[]{1, 1, 0, 1, 1, 0, 0, 0, 1}, objArr3);
        isEngagementSignalsApiAvailable = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(new char[]{36312, 58390, 3415, 2286, 41764, 13598, 57386, 20452}, 7 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        ICustomTabsCallback_Parcel = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{47, 6, 165, 3}, false, new byte[]{1, 0, 1, 0, 0, 0}, objArr5);
        onRelationshipValidationResult = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{53, 6, 81, 4}, true, new byte[]{1, 1, 0, 0, 1, 1}, objArr6);
        ICustomTabsCallbackStubProxy = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(new char[]{42683, 60008, 40043, 3795, 47149, 25307}, 6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr7);
        onUnminimized = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(new char[]{18487, 55031, 30458, 43835, 24494, 46196, 32992, 21931, 37938, 14020, 40284, 32649, 45057, 57077}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, objArr8);
        ICustomTabsCallbackDefault = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b(new char[]{61223, 18779, 39766, 50404}, 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
        ICustomTabsCallbackStub = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(new int[]{59, 6, 0, 0}, true, new byte[]{1, 1, 0, 1, 0, 0}, objArr10);
        onMessageChannelReady = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(new int[]{65, 7, 77, 0}, false, new byte[]{0, 0, 0, 1, 0, 0, 1}, objArr11);
        onMinimized = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(new char[]{3415, 2286, 33759, 56081, 32350, 24390, 52388, 20248}, View.resolveSize(0, 0) + 8, objArr12);
        onActivityLayout = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b(new char[]{6312, 7235, 38739, 61110, 57386, 20452}, KeyEvent.keyCodeFromString("") + 5, objArr13);
        onActivityResized = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(new char[]{27390, 56069, 37938, 14020, 7442, 49318, 7582, 38109, 27415, 27008}, TextUtils.getOffsetAfter("", 0) + 9, objArr14);
        onPostMessage = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        b(new char[]{54503, 2629, 56581, 35304, 54503, 2629, 11801, 33874}, (-16777209) - Color.rgb(0, 0, 0), objArr15);
        writeTypedObject = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(new int[]{72, 8, 0, 0}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1}, objArr16);
        extraCallbackWithResult = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a(new int[]{80, 12, 49, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1}, objArr17);
        extraCallback = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(new char[]{14434, 39400, 37309, 40573, 19398, 13363, 47149, 25307}, (ViewConfiguration.getScrollBarSize() >> 8) + 7, objArr18);
        readTypedObject = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        a(new int[]{92, 5, 58, 4}, true, new byte[]{1, 0, 1, 1, 1}, objArr19);
        ICustomTabsCallback = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b(new char[]{23557, 10539, 61223, 18779, 24494, 46196, 57386, 20452}, TextUtils.getTrimmedLength("") + 7, objArr20);
        getInterfaceDescriptor = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        b(new char[]{6705, 53570, 40284, 32649, 26286, 56333, 12568, 4588, 56312, 34135, 47149, 25307}, TextUtils.indexOf("", "", 0) + 11, objArr21);
        IAuthTabCallback_Parcel = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b(new char[]{58411, 17993, 32868, 46093, 48970, 56365, 26929, 6373, 54635, 52864, 2594, 7110, 8470, 55297, 54635, 52864}, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr22);
        access100 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        b(new char[]{33247, 6576, 38739, 61110, 57386, 20452}, 5 - View.getDefaultSize(0, 0), objArr23);
        IAuthTabCallbackStubProxy = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        b(new char[]{46957, 56059, 48404, 36094}, 4 - ((Process.getThreadPriority(0) + 20) >> 6), objArr24);
        access000 = ((String) objArr24[0]).intern();
        Object[] objArr25 = new Object[1];
        b(new char[]{7783, 42404, 8033, 57742, 49733, 25382, 42581, 13685, 34850, 10778, 11692, 7235, 13585, 12064}, 13 - Color.green(0), objArr25);
        onTransact = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a(new int[]{97, 10, 0, 0}, false, new byte[]{1, 1, 1, 0, 1, 1, 0, 0, 1, 1}, objArr26);
        asBinder = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        a(new int[]{107, 11, 0, 0}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1}, objArr27);
        IAuthTabCallbackStub = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a(new int[]{118, 6, 0, 1}, true, new byte[]{1, 1, 1, 1, 0, 1}, objArr28);
        IAuthTabCallbackDefault = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        a(new int[]{124, 9, 196, 4}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 1}, objArr29);
        asInterface = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a(new int[]{133, 6, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1}, objArr30);
        onExtraCallbackWithResult = ((String) objArr30[0]).intern();
        Object[] objArr31 = new Object[1];
        b(new char[]{23988, 41042, 62552, 7123, 62882, 21391, 14339, 57070}, 8 - (ViewConfiguration.getScrollBarSize() >> 8), objArr31);
        onNavigationEvent = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        b(new char[]{1003, 12663, 62552, 7123, 21962, 36610}, 6 - TextUtils.indexOf("", ""), objArr32);
        onWarmupCompleted = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        a(new int[]{139, 9, 0, 0}, false, new byte[]{0, 1, 1, 1, 0, 0, 1, 1, 0}, objArr33);
        IAuthTabCallback = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        a(new int[]{148, 30, 158, 7}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1}, objArr34);
        onExtraCallback = ((String) objArr34[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = requestPostMessageChannel + 25;
        setEngagementSignalsCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(JsonElement jsonElement, String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = receiveFile + 19;
        requestPostMessageChannelWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(jsonElement, str, startrunning);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = receiveFile + 1;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 121;
        receiveFile = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str, jsonElement, startrunning);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, jsonElement, startrunning);
        int i3 = requestPostMessageChannelWithExtras + 109;
        receiveFile = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = receiveFile + 39;
        requestPostMessageChannelWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, str, startrunning);
        int i4 = requestPostMessageChannelWithExtras + 19;
        receiveFile = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle) {
        int i3 = 2 % 2;
        int i4 = receiveFile + 55;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        int i6 = requestPostMessageChannelWithExtras + 51;
        receiveFile = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = receiveFile + 103;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = requestPostMessageChannelWithExtras + 113;
        receiveFile = i3 % 128;
        int i4 = i3 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 13;
        receiveFile = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = receiveFile + 119;
        requestPostMessageChannelWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = receiveFile + 103;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            int i6 = 47 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 71;
        receiveFile = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = requestPostMessageChannelWithExtras + 1;
        receiveFile = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = receiveFile + 107;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static final Unit onExtraCallback(String str, JsonElement jsonElement, startRunning startrunning) {
        Unit unit;
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 115;
        receiveFile = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            unit = Unit.INSTANCE;
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            unit = Unit.INSTANCE;
        }
        int i4 = receiveFile + 67;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(getSemanticsIdentifier getsemanticsidentifier, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, JsonElement jsonElement, String str2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = receiveFile + 21;
        int i4 = i3 % 128;
        requestPostMessageChannelWithExtras = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            Object[] objArr = new Object[1];
            a(new int[]{178, 89, 0, 63}, true, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0}, objArr);
            throw new UnsupportedOperationException(((String) objArr[0]).intern());
        }
        if ((i & 8) != 0) {
            int i5 = i4 + 37;
            receiveFile = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            str2 = null;
        }
        getsemanticsidentifier.onWarmupCompleted(settopguidebackgroundcolor, str, jsonElement, str2);
    }

    private static final Unit onWarmupCompleted(JsonElement jsonElement, String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = receiveFile + 67;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, @NotNull String str, @Nullable JsonElement jsonElement, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        Intrinsics.checkNotNullParameter(str, "");
        settopguidebackgroundcolor.IAuthTabCallback(str, new AbsCaScrapingMessageHandler$.ExternalSyntheticLambda2(jsonElement, str2));
        if (this.extraCommand) {
            Object[] objArr = new Object[1];
            a(new int[]{267, 12, 183, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1}, objArr);
            ((String) objArr[0]).intern();
            Objects.toString(jsonElement);
            Object[] objArr2 = new Object[1];
            a(new int[]{279, 2, 15, 0}, false, new byte[]{1, 0}, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new int[]{281, 1, 0, 1}, true, new byte[]{1}, objArr3);
            ((String) objArr3[0]).intern();
            int i2 = requestPostMessageChannelWithExtras + 7;
            receiveFile = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = requestPostMessageChannelWithExtras + 77;
        receiveFile = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(boolean z, String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = receiveFile + 9;
        requestPostMessageChannelWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(Boolean.valueOf(z));
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = requestPostMessageChannelWithExtras + 119;
        receiveFile = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = receiveFile + 7;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle);
        int i6 = receiveFile + 65;
        requestPostMessageChannelWithExtras = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 119;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 4;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >>> 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (postMessage ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(newSession);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char defaultSize = (char) View.getDefaultSize(i4, i4);
                        int i11 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iIndexOf = 12434 - TextUtils.indexOf("", "");
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, i11, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (newAuthTabSession ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(newSessionWithExtras)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf("", '0')), Gravity.getAbsoluteGravity(0, 0) + 14, 19900 - TextUtils.lastIndexOf("", '0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = prefetch;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 99;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.MeasureSpec.getMode(0)), 35 - KeyEvent.getDeadChar(0, 0), 14239 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $11 + 103;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i16 = $10 + 87;
                $11 = i16 % 128;
                int i17 = i16 % i14;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i18 = $11 + 81;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10935), ExpandableListView.getPackedPositionType(0L) + 65, TextUtils.getOffsetAfter("", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i20] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i21 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 29 - View.resolveSize(0, 0), 17657 - ExpandableListView.getPackedPositionType(0L), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i21] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getEdgeSlop() >> 16)), (-16777146) - Color.rgb(0, 0, 0), Color.blue(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i14 = 2;
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i22 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i22, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i22);
        }
        if (z) {
            int i23 = $11 + 51;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i24 = $10 + 87;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent >> 1;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        prefetch = new char[]{27255, 27173, 27174, 27174, 27175, 27177, 27162, 27160, 27176, 27178, 27172, 27197, 27170, 27159, 27156, 27172, 27173, 27170, 27174, 27175, 27172, 27157, 27253, 27168, 27181, 27154, 27153, 27177, 27168, 27181, 27183, 27198, 27172, 27177, 27172, 27174, 27161, 27160, 27261, 27174, 27197, 27196, 27157, 27179, 27197, 27170, 27178, 27333, 27464, 27462, 27477, 27479, 27487, 27183, 27378, 27379, 27275, 27379, 27369, 27253, 27181, 27153, 27172, 27174, 27168, 27182, 27381, 27387, 27385, 27362, 27360, 27380, 27255, 27173, 27178, 27178, 27177, 27169, 27171, 27173, 27141, 27346, 27370, 27371, 27373, 27351, 27341, 27332, 27373, 27373, 27374, 27374, 27248, 27329, 27368, 27364, 27373, 27263, 27177, 27174, 27181, 27175, 27156, 27164, 27180, 27179, 27176, 27263, 27177, 27174, 27181, 27177, 27152, 27152, 27155, 27155, 27174, 27180, 27263, 27181, 27160, 27152, 27197, 27173, 27351, 27491, 27494, 27518, 27489, 27496, 27491, 27489, 27481, 27263, 27180, 27175, 27173, 27165, 27165, 27263, 27183, 27177, 27170, 27161, 27159, 27175, 27178, 27170, 27184, 27313, 27468, 27465, 27463, 27467, 27468, 27471, 27467, 27464, 27471, 27467, 27314, 27314, 27317, 27317, 27464, 27470, 27313, 27465, 27457, 27457, 27487, 27465, 27313, 27465, 27458, 27467, 27469, 27463, 27252, 27170, 27176, 27170, 27175, 27172, 27140, 27143, 27168, 27174, 27168, 27140, 27145, 27173, 27146, 27148, 27178, 27170, 27197, 27198, 27169, 27198, 27196, 27194, 27143, 27140, 27199, 27168, 27145, 27143, 27197, 27199, 27175, 27175, 27199, 27168, 27170, 27175, 27150, 27140, 27198, 27198, 27173, 27181, 27179, 27178, 27148, 27146, 27168, 27168, 27198, 27141, 27143, 27169, 27170, 27176, 27180, 27151, 27143, 27173, 27172, 27196, 27178, 27153, 27177, 27180, 27183, 27177, 27170, 27176, 27164, 27162, 27174, 27171, 27196, 27196, 27173, 27146, 27235, 27162, 27168, 27170, 27168, 27173, 27174, 27199, 27171, 27149, 27240, 27191, 27301, 27283, 27318, 27479, 27475, 27501, 27472, 27478, 27479, 27472, 27470, 27219, 27259, 27226};
        newAuthTabSession = (char) 17118;
        newSessionWithExtras = (char) 32699;
        postMessage = (char) 62144;
        newSession = (char) 21672;
    }
}
