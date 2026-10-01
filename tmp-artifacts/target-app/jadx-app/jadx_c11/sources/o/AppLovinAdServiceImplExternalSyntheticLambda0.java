package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import dagger.Lazy;
import im.toss.TossApplication;
import im.toss.base.BaseActivity;
import im.toss.base.BaseLauncherWrapperActivity;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.validationchecker.RRNUtils;
import im.toss.rn.spec.ReactDeepLinkUriHandler;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.tosssecurities.singlepage.TossSecBaseActivity;
import im.toss.utils.RxUtils;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppLovinAdServiceImplExternalSyntheticLambda0;
import o.getMaxLevel;
import o.h5ScreenShotObserverOnChangeOpt;
import o.pauseForClick;
import o.trackEventSynchronously;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.splash.QuitActivity;
import viva.republica.toss.splash.SchemeActivity;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplExternalSyntheticLambda0 implements getCurrentApplicationState {
    public static final IAuthTabCallback Companion;
    private static final String IAuthTabCallback;
    private static final String IAuthTabCallbackDefault;
    private static final String IAuthTabCallbackStub;
    private static final Map<String, String> IAuthTabCallback_Parcel;
    private static final String asBinder;
    private static final String asInterface;
    private static char[] onActivityLayout;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static long onMessageChannelReady;
    private static final String onNavigationEvent;
    private static int onRelationshipValidationResult;
    private static final String onTransact;
    private static final String onWarmupCompleted;
    private final zzad IAuthTabCallbackStubProxy;
    private final Lazy<isApplicationPaused> ICustomTabsCallback;
    private final AppLovinAdServiceImplExternalSyntheticLambda2 access000;
    private final Lazy<isApplicationPaused> access100;
    private Function0<Unit> extraCallback;
    private final pauseForClick extraCallbackWithResult;
    private final setAdUnitIds getInterfaceDescriptor;
    private final Lazy<isApplicationPaused> onActivityResized;
    private final getBillingPeriod onMinimized;
    private final Lazy<isApplicationPaused> readTypedObject;
    private final trackCheckout writeTypedObject;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 1;
    private static int onPostMessage = 0;
    private static int ICustomTabsCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (i2 * 4);
        byte[] bArr = $$a;
        int i6 = i * 4;
        int i7 = (b * 3) + 97;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i5 += -i7;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i9 = i4;
            i7 = bArr[i4];
            i10 = i11;
            i5 += -i7;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i5 = i7;
            i4 = i5;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i));
        int i11 = ~(i3 | i);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i + i2 + (1349231875 * i4) + (1735201104 * i5);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i2) + ((-1337982976) * i4) + (469762048 * i5) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i2 * 236313959) + (i4 * (-66979019)) + (i5 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        return i19 != 1 ? i19 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(uri);
        }
        IAuthTabCallback(uri);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackEventSynchronously trackeventsynchronously) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(trackeventsynchronously);
        int i4 = ICustomTabsCallbackStub + 21;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public AppLovinAdServiceImplExternalSyntheticLambda0(@NotNull trackCheckout trackcheckout, @NotNull setAdUnitIds setadunitids, @NotNull getBillingPeriod getbillingperiod, @NotNull pauseForClick pauseforclick, @ReactDeepLinkUriHandler @NotNull Lazy<isApplicationPaused> lazy, @NotNull Lazy<isApplicationPaused> lazy2, @NotNull Lazy<isApplicationPaused> lazy3, @NotNull Lazy<isApplicationPaused> lazy4, @NotNull zzad zzadVar) throws Exception {
        Intrinsics.checkNotNullParameter(trackcheckout, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(pauseforclick, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(lazy3, "");
        Intrinsics.checkNotNullParameter(lazy4, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.writeTypedObject = trackcheckout;
        this.getInterfaceDescriptor = setadunitids;
        this.onMinimized = getbillingperiod;
        this.extraCallbackWithResult = pauseforclick;
        this.readTypedObject = lazy;
        this.onActivityResized = lazy2;
        this.access100 = lazy3;
        this.ICustomTabsCallback = lazy4;
        this.IAuthTabCallbackStubProxy = zzadVar;
        AppLovinAdServiceImplExternalSyntheticLambda2 appLovinAdServiceImplExternalSyntheticLambda2 = new AppLovinAdServiceImplExternalSyntheticLambda2();
        this.access000 = appLovinAdServiceImplExternalSyntheticLambda2;
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 305, 15 - TextUtils.lastIndexOf("", '0'), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(321 - TextUtils.indexOf("", "", 0, 0), 29 - TextUtils.getOffsetAfter("", 0), (char) Color.argb(0, 0, 0, 0), objArr2);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr2[0]).intern(), 2);
        Object[] objArr3 = new Object[1];
        a(350 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 29, (char) Gravity.getAbsoluteGravity(0, 0), objArr3);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr3[0]).intern(), 3);
        Object[] objArr4 = new Object[1];
        a(378 - TextUtils.lastIndexOf("", '0', 0), 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (8138 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr4);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr4[0]).intern(), 4);
        Object[] objArr5 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 398, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (60623 - Color.argb(0, 0, 0, 0)), objArr5);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr5[0]).intern(), 5);
        Object[] objArr6 = new Object[1];
        a(419 - (ViewConfiguration.getScrollBarSize() >> 8), 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - MotionEvent.axisFromString("")), objArr6);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr6[0]).intern(), 5);
        Object[] objArr7 = new Object[1];
        a(440 - TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr7);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr7[0]).intern(), 12);
        Object[] objArr8 = new Object[1];
        a(463 - (Process.myTid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37912), objArr8);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr8[0]).intern(), 10);
        Object[] objArr9 = new Object[1];
        a(554 - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr9[0]).intern(), 11);
        Object[] objArr10 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 552, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, (char) ((Process.myTid() >> 22) + 1810), objArr10);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr10[0]).intern(), 14);
        Object[] objArr11 = new Object[1];
        a(579 - TextUtils.getCapsMode("", 0, 0), 31 - TextUtils.indexOf((CharSequence) "", '0'), (char) (32126 - (Process.myTid() >> 22)), objArr11);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr11[0]).intern(), 16);
        Object[] objArr12 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 610, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr12);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr12[0]).intern(), 17);
        Object[] objArr13 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 630, 23 - TextUtils.lastIndexOf("", '0'), (char) Color.alpha(0), objArr13);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr13[0]).intern(), 1100);
        Object[] objArr14 = new Object[1];
        a(654 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr14);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr14[0]).intern(), 21);
        Object[] objArr15 = new Object[1];
        a(672 - (Process.myTid() >> 22), 19 - Process.getGidForName(""), (char) (KeyEvent.normalizeMetaState(0) + 2292), objArr15);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr15[0]).intern(), 21);
        Object[] objArr16 = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 692, Color.rgb(0, 0, 0) + 16777238, (char) View.resolveSizeAndState(0, 0, 0), objArr16);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr16[0]).intern(), 21);
        Object[] objArr17 = new Object[1];
        a(714 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') - 24, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr17[0]).intern(), 21);
        Object[] objArr18 = new Object[1];
        a(738 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 26, (char) (ExpandableListView.getPackedPositionChild(0L) + 25098), objArr18);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr18[0]).intern(), 21);
        Object[] objArr19 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 764, 28 - TextUtils.indexOf("", "", 0, 0), (char) (6199 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr19);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr19[0]).intern(), 21);
        Object[] objArr20 = new Object[1];
        a(792 - TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, (char) (TextUtils.lastIndexOf("", '0') + 12945), objArr20);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr20[0]).intern(), 2000);
        Object[] objArr21 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 813, 'Q' - AndroidCharacter.getMirror('0'), (char) Drawable.resolveOpacity(0, 0), objArr21);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr21[0]).intern(), 2001);
        Object[] objArr22 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 846, 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr22);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr22[0]).intern(), 71);
        Object[] objArr23 = new Object[1];
        a(869 - Color.blue(0), View.MeasureSpec.getSize(0) + 20, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr23);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr23[0]).intern(), 2002);
        Object[] objArr24 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 889, AndroidCharacter.getMirror('0') - 22, (char) (TextUtils.lastIndexOf("", '0', 0) + 5749), objArr24);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr24[0]).intern(), 2003);
        if (zzadVar.onActivityLayout()) {
            Object[] objArr25 = new Object[1];
            a(915 - (ViewConfiguration.getScrollBarSize() >> 8), 21 - TextUtils.getOffsetBefore("", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr25);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr25[0]).intern(), 999);
            Object[] objArr26 = new Object[1];
            a(936 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, (char) (12755 - Color.blue(0)), objArr26);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr26[0]).intern(), 1000);
            Object[] objArr27 = new Object[1];
            a(960 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 32 - KeyEvent.keyCodeFromString(""), (char) (15463 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr27);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr27[0]).intern(), 1008);
            Object[] objArr28 = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 992, Color.blue(0) + 22, (char) (30164 - Drawable.resolveOpacity(0, 0)), objArr28);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr28[0]).intern(), 1002);
            Object[] objArr29 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 1014, 'L' - AndroidCharacter.getMirror('0'), (char) (34316 - Color.red(0)), objArr29);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr29[0]).intern(), 1003);
            Object[] objArr30 = new Object[1];
            a(1043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 24, (char) TextUtils.getCapsMode("", 0, 0), objArr30);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr30[0]).intern(), 1004);
            Object[] objArr31 = new Object[1];
            a(1067 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 26 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), objArr31);
            appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr31[0]).intern(), 1010);
            int i = onPostMessage + 125;
            ICustomTabsCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        Object[] objArr32 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1091, 36 - MotionEvent.axisFromString(""), (char) (64417 - ImageFormat.getBitsPerPixel(0)), objArr32);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr32[0]).intern(), 2004);
        Object[] objArr33 = new Object[1];
        a(1129 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 35, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 61426), objArr33);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr33[0]).intern(), 2004);
        Object[] objArr34 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 1164, View.MeasureSpec.getSize(0) + 42, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr34);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr34[0]).intern(), 2004);
        Object[] objArr35 = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 1206, 28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (14050 - TextUtils.indexOf("", "", 0)), objArr35);
        appLovinAdServiceImplExternalSyntheticLambda2.onExtraCallback(((String) objArr35[0]).intern(), 2004);
        int i3 = ICustomTabsCallbackStub + 93;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 87;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onActivityLayout[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 59697), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onMessageChannelReady), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 46134), ((byte) KeyEvent.getModifierMetaStateMask()) + 32, TextUtils.getCapsMode("", 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1494 - TextUtils.getTrimmedLength(""), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.green(0) + 44, 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.getCurrentApplicationState
    public void onWarmupCompleted() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            function0 = this.extraCallback;
            int i3 = 49 / 0;
            if (function0 == null) {
                return;
            }
        } else {
            function0 = this.extraCallback;
            if (function0 == null) {
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
        this.extraCallback = null;
        int i4 = ICustomTabsCallbackStub + 5;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getCurrentApplicationState
    public boolean onExtraCallbackWithResult(@NotNull Context context, @Nullable Uri uri, boolean z, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        boolean zOnExtraCallback = onExtraCallback(context, uri, z, z2, null);
        int i4 = ICustomTabsCallbackStub + 21;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0521 A[PHI: r3
      0x0521: PHI (r3v146 java.lang.String) = (r3v144 java.lang.String), (r3v148 java.lang.String) binds: [B:134:0x051f, B:131:0x050c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05d6 A[PHI: r3
      0x05d6: PHI (r3v132 java.lang.String) = (r3v131 java.lang.String), (r3v139 java.lang.String) binds: [B:138:0x057e, B:140:0x05d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0f04  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // o.getCurrentApplicationState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(@NotNull Context context, @Nullable final Uri uri, boolean z, boolean z2, @Nullable Bundle bundle) throws Throwable {
        String str;
        String str2;
        int i;
        Intent flags;
        int i2;
        Activity activity;
        String str3;
        String queryParameter;
        Activity activity2;
        Uri uriOnWarmupCompleted;
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        a(22 - View.getDefaultSize(0, 0), 3 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.combineMeasuredStates(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(context, "");
        if (uri == null) {
            int i4 = ICustomTabsCallbackStub + 69;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        pauseForClick.onExtraCallbackWithResult onExtraCallbackWithResult2 = this.extraCallbackWithResult.onExtraCallbackWithResult(context, uri, z);
        if (onExtraCallbackWithResult2 instanceof pauseForClick.onExtraCallbackWithResult.onWarmupCompleted) {
            return true;
        }
        if (!(onExtraCallbackWithResult2 instanceof pauseForClick.onExtraCallbackWithResult.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = ICustomTabsCallbackStub + 79;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (!addExtra.onExtraCallback(playerErrorCode) || (uriOnWarmupCompleted = onWarmupCompleted(uri)) == null) {
            str = "";
            str2 = strIntern;
            i = 1;
        } else {
            Uri.Builder builder = new Uri.Builder();
            Object[] objArr2 = new Object[1];
            a(1232 - KeyEvent.normalizeMetaState(0), Color.argb(0, 0, 0, 0) + 9, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            Uri.Builder builderScheme = builder.scheme(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(1592 - TextUtils.getOffsetAfter("", 0), 3 - TextUtils.getOffsetBefore("", 0), (char) (ImageFormat.getBitsPerPixel(0) + 38262), objArr3);
            Uri.Builder builderAuthority = builderScheme.authority(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a(TextUtils.lastIndexOf("", '0') + 1596, 10 - Color.alpha(0), (char) (MotionEvent.axisFromString("") + 1), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(1319 - (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 5, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 51624), objArr5);
            Uri.Builder builderAppendQueryParameter = builderAuthority.appendQueryParameter(strIntern2, ((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            a(1604 - ExpandableListView.getPackedPositionChild(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 11, (char) (64485 - Color.argb(0, 0, 0, 0)), objArr6);
            String strIntern3 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a(76 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 30334), objArr7);
            Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter.appendQueryParameter(strIntern3, ((String) objArr7[0]).intern()).appendQueryParameter(strIntern, uriOnWarmupCompleted.toString()).build().toString(), "");
            str = "";
            i = 1;
            str2 = strIntern;
            if (!(!SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, r4, false, null, null, z2, 28, null))) {
                return true;
            }
        }
        if (access3902.onWarmupCompleted.onExtraCallbackWithResult(this.onMinimized.onExtraCallbackWithResult())) {
            if (onWarmupCompleted(context, uri, z2)) {
                return i;
            }
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(uri);
            if (strOnExtraCallbackWithResult != null && IAuthTabCallback(context, strOnExtraCallbackWithResult, z2)) {
                return i;
            }
            String str4 = (String) IAuthTabCallback(1789909324, new Object[]{this, uri}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1789909322);
            if (str4 != null && IAuthTabCallback(context, str4, z2)) {
                return i;
            }
        }
        String scheme = uri.getScheme();
        Object[] objArr8 = new Object[i];
        a(1614 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
        if (((Intrinsics.areEqual(scheme, ((String) objArr8[0]).intern()) ? 1 : 0) ^ i) != 0) {
            String scheme2 = uri.getScheme();
            String str5 = str;
            Object[] objArr9 = new Object[i];
            a(Color.alpha(0) + 1621, 14 - TextUtils.getOffsetAfter(str5, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54928), objArr9);
            if (!Intrinsics.areEqual(scheme2, ((String) objArr9[0]).intern())) {
                String scheme3 = uri.getScheme();
                Object[] objArr10 = new Object[i];
                a(TextUtils.indexOf(str5, str5) + 1635, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, (char) (Process.getGidForName(str5) + i), objArr10);
                if (Intrinsics.areEqual(scheme3, ((String) objArr10[0]).intern())) {
                    return ((isApplicationPaused) this.ICustomTabsCallback.get()).IAuthTabCallback(context, uri, z2);
                }
                Object obj = null;
                if (!z) {
                    int i8 = ICustomTabsCallbackStub + 47;
                    onPostMessage = i8 % 128;
                    if (i8 % 2 != 0) {
                        resumeForClick.asBinder.onWarmupCompleted(uri);
                        obj.hashCode();
                        throw null;
                    }
                    if (resumeForClick.asBinder.onWarmupCompleted(uri)) {
                        if (this.IAuthTabCallbackStubProxy.onActivityLayout()) {
                            String scheme4 = uri.getScheme();
                            String host = uri.getHost();
                            String path = uri.getPath();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr11 = new Object[i];
                            a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1647, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 56181), objArr11);
                            sb.append(((String) objArr11[0]).intern());
                            sb.append(scheme4);
                            Object[] objArr12 = new Object[i];
                            a(1683 - TextUtils.getCapsMode(str5, 0, 0), Color.blue(0) + 3, (char) (View.MeasureSpec.getSize(0) + 57263), objArr12);
                            sb.append(((String) objArr12[0]).intern());
                            sb.append(host);
                            sb.append(path);
                            onJsBridgeReady.onNavigationEvent(context, sb.toString(), 0, 2, (Object) null);
                        }
                        return i;
                    }
                }
                if (!enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallback(uri)) {
                    return false;
                }
                int iOnExtraCallback = this.access000.onExtraCallback(uri);
                if (iOnExtraCallback != 0) {
                    int i9 = onPostMessage;
                    int i10 = i9 + 31;
                    int i11 = i10 % 128;
                    ICustomTabsCallbackStub = i11;
                    if (i10 % 2 != 0 ? iOnExtraCallback == 14 : iOnExtraCallback == 126) {
                        allowAdditionalDecoder allowadditionaldecoder = allowAdditionalDecoder.onNavigationEvent;
                        Object[] objArr13 = new Object[i];
                        a(2101 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777223, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57165), objArr13);
                        allowadditionaldecoder.onExtraCallbackWithResult(uri.getQueryParameter(((String) objArr13[0]).intern()));
                    } else if (iOnExtraCallback == 21) {
                        if (!this.getInterfaceDescriptor.IAuthTabCallback()) {
                            return i;
                        }
                        if (!addExtra.asInterface(playerErrorCode)) {
                            boolean zIAuthTabCallbackStub = h5ScreenShotObserverOnChangeOpt.Companion.IAuthTabCallbackStub(uri);
                            SubsamplingScaleImageViewTileLoadTask subsamplingScaleImageViewTileLoadTask = SubsamplingScaleImageViewTileLoadTask.onNavigationEvent;
                            String string = context.getString(zIAuthTabCallbackStub ? R.string.credit_under_age_plus_error : R.string.credit_under_age_common_error);
                            Intrinsics.checkNotNullExpressionValue(string, str5);
                            SubsamplingScaleImageViewTileLoadTask.onNavigationEvent(subsamplingScaleImageViewTileLoadTask, string, getEnabledAmazonAdUnitIds.Companion.IAuthTabCallback(), (View) null, 0, (Integer) null, (String) null, (Function0) null, 124, (Object) null);
                            return i;
                        }
                        h5ScreenShotObserverOnChangeOpt.onNavigationEvent onnavigationevent = h5ScreenShotObserverOnChangeOpt.onNavigationEvent.onExtraCallbackWithResult;
                        boolean zOnWarmupCompleted = h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(onnavigationevent, uri, (String) null, 2, (Object) null);
                        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
                        boolean zOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(uri);
                        boolean zIAuthTabCallback = onextracallback.IAuthTabCallback(uri);
                        boolean zAsInterface = onextracallback.asInterface(uri);
                        boolean zAsBinder = onextracallback.asBinder(uri);
                        if (!zAsInterface) {
                            if (zOnWarmupCompleted || zIAuthTabCallback) {
                                if (!zOnWarmupCompleted && !zOnExtraCallbackWithResult) {
                                    resumeForClick resumeforclick = resumeForClick.asBinder;
                                    h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault iAuthTabCallbackDefault = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback;
                                    String str6 = (String) h5ScreenShotObserverOnChangeOpt.onExtraCallback.onExtraCallback(new Object[]{onextracallback, uri}, 1816239997, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1816239996, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
                                    Object[] objArr14 = new Object[i];
                                    a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2094, View.resolveSizeAndState(0, 0, 0) + 6, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr14);
                                    SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, iAuthTabCallbackDefault.onNavigationEvent(true, str6, true, ((Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr14[0]).intern()}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971)).toString(), true), false, null, null, false, 60, null);
                                }
                            } else if (zAsBinder) {
                                h5ScreenShotObserverOnChangeOpt.onWarmupCompleted onwarmupcompleted = h5ScreenShotObserverOnChangeOpt.onWarmupCompleted.onExtraCallback;
                                String string2 = uri.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, str5);
                                context.startActivity(onwarmupcompleted.onWarmupCompleted(context, string2, (String) h5ScreenShotObserverOnChangeOpt.onExtraCallback.onExtraCallback(new Object[]{onextracallback, uri}, 1816239997, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1816239996, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())));
                            } else {
                                resumeForClick resumeforclick2 = resumeForClick.asBinder;
                                String string3 = uri.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, str5);
                                SessionTrackerb.onExtraCallbackWithResult(resumeforclick2, context, h5ScreenShotObserverOnChangeOpt.onNavigationEvent.onWarmupCompleted(onnavigationevent, string3, (String) h5ScreenShotObserverOnChangeOpt.onExtraCallback.onExtraCallback(new Object[]{onextracallback, uri}, 1816239997, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1816239996, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult()), false, 4, (Object) null), false, null, null, false, 60, null);
                            }
                        }
                    } else if (iOnExtraCallback == 71) {
                        resumeForClick resumeforclick3 = resumeForClick.asBinder;
                        Object[] objArr15 = new Object[i];
                        a(2069 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0), TextUtils.indexOf(str5, str5, 0, 0) + 24, (char) (49311 - View.resolveSizeAndState(0, 0, 0)), objArr15);
                        SessionTrackerb.onExtraCallbackWithResult(resumeforclick3, context, ((String) objArr15[0]).intern(), false, null, null, false, 60, null);
                    } else if (iOnExtraCallback == 1008) {
                        Object[] objArr16 = new Object[i];
                        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1912, Color.rgb(0, 0, 0) + 16777228, (char) (Process.getGidForName(str5) + 37602), objArr16);
                        String strIntern4 = ((String) objArr16[0]).intern();
                        Object[] objArr17 = new Object[i];
                        a(1320 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (51624 - KeyEvent.keyCodeFromString(str5)), objArr17);
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern4, ((String) objArr17[0]).intern());
                        Object[] objArr18 = new Object[i];
                        a(Color.red(0) + 1925, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, (char) (KeyEvent.getDeadChar(0, 0) + 27120), objArr18);
                        String strIntern5 = ((String) objArr18[0]).intern();
                        Object[] objArr19 = new Object[i];
                        a(1318 - ((byte) KeyEvent.getModifierMetaStateMask()), 3 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51623), objArr19);
                        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(strIntern5, ((String) objArr19[0]).intern());
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = pairIAuthTabCallback;
                        pairArr[i] = pairIAuthTabCallback2;
                        Object[] objArr20 = new Object[i];
                        a(View.combineMeasuredStates(0, 0) + 1937, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr20);
                        String strIAuthTabCallback = IAuthTabCallback(((String) objArr20[0]).intern(), (Pair<String, ? extends Object>[]) pairArr);
                        Object[] objArr21 = new Object[i];
                        a(KeyEvent.normalizeMetaState(0) + 1913, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, (char) (37601 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr21);
                        String strIntern6 = ((String) objArr21[0]).intern();
                        Object[] objArr22 = new Object[i];
                        a(1319 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 4, (char) (51625 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr22);
                        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(strIntern6, ((String) objArr22[0]).intern());
                        Boolean bool = Boolean.FALSE;
                        Object[] objArr23 = new Object[i];
                        a(1925 - Gravity.getAbsoluteGravity(0, 0), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (27120 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr23);
                        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr23[0]).intern(), bool);
                        Pair[] pairArr2 = new Pair[2];
                        pairArr2[0] = pairIAuthTabCallback3;
                        pairArr2[i] = pairIAuthTabCallback4;
                        Object[] objArr24 = new Object[i];
                        a(1952 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter(str5, 0) + 20, (char) TextUtils.getOffsetAfter(str5, 0), objArr24);
                        String strIAuthTabCallback2 = IAuthTabCallback(((String) objArr24[0]).intern(), (Pair<String, ? extends Object>[]) pairArr2);
                        Object[] objArr25 = new Object[i];
                        a(1913 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 12, (char) (37602 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr25);
                        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr25[0]).intern(), bool);
                        Object[] objArr26 = new Object[i];
                        a(1925 - (ViewConfiguration.getEdgeSlop() >> 16), 12 - KeyEvent.getDeadChar(0, 0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27120), objArr26);
                        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr26[0]).intern(), bool);
                        Pair[] pairArr3 = new Pair[2];
                        pairArr3[0] = pairIAuthTabCallback5;
                        pairArr3[i] = pairIAuthTabCallback6;
                        Object[] objArr27 = new Object[i];
                        a(1972 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 8469), objArr27);
                        String strIAuthTabCallback3 = IAuthTabCallback(((String) objArr27[0]).intern(), (Pair<String, ? extends Object>[]) pairArr3);
                        Object[] objArr28 = new Object[i];
                        a(TextUtils.indexOf(str5, str5, 0, 0) + 1913, 12 - (Process.myTid() >> 22), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37601), objArr28);
                        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr28[0]).intern(), bool);
                        Object[] objArr29 = new Object[i];
                        a((ViewConfiguration.getScrollBarSize() >> 8) + 1925, 12 - (ViewConfiguration.getTapTimeout() >> 16), (char) (27120 - Color.green(0)), objArr29);
                        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr29[0]).intern(), Boolean.TRUE);
                        Pair[] pairArr4 = new Pair[2];
                        pairArr4[0] = pairIAuthTabCallback7;
                        pairArr4[i] = pairIAuthTabCallback8;
                        Object[] objArr30 = new Object[i];
                        a(1994 - TextUtils.getOffsetAfter(str5, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, (char) Gravity.getAbsoluteGravity(0, 0), objArr30);
                        String strIAuthTabCallback4 = IAuthTabCallback(((String) objArr30[0]).intern(), (Pair<String, ? extends Object>[]) pairArr4);
                        Object[] objArr31 = new Object[i];
                        a(TextUtils.lastIndexOf(str5, '0') + 2014, Process.getGidForName(str5) + 21, (char) (TextUtils.indexOf((CharSequence) str5, '0', 0) + 62613), objArr31);
                        String strIAuthTabCallback5 = IAuthTabCallback(((String) objArr31[0]).intern(), (Pair<String, ? extends Object>[]) new Pair[0]);
                        Object[] objArr32 = new Object[i];
                        a(2034 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 22 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 44483), objArr32);
                        int i12 = 0;
                        for (Object obj2 : CollectionsKt.listOf(new String[]{strIAuthTabCallback, strIAuthTabCallback2, strIAuthTabCallback3, strIAuthTabCallback4, strIAuthTabCallback5, IAuthTabCallback(((String) objArr32[0]).intern(), (Pair<String, ? extends Object>[]) new Pair[0])})) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String str7 = (String) obj2;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Uri uri2 = Uri.parse(str7);
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr33 = new Object[i];
                            a(2055 - View.MeasureSpec.getSize(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + i, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr33);
                            sb2.append(((String) objArr33[0]).intern());
                            sb2.append(i13);
                            Object[] objArr34 = new Object[i];
                            a(2056 - TextUtils.getCapsMode(str5, 0, 0), TextUtils.indexOf(str5, str5) + 6, (char) (24390 - (KeyEvent.getMaxKeyCode() >> 16)), objArr34);
                            sb2.append(((String) objArr34[0]).intern());
                            Object[] objArr35 = new Object[i];
                            a(1543 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, (char) (Drawable.resolveOpacity(0, 0) + 42956), objArr35);
                            linkedHashMap.put(((String) objArr35[0]).intern(), sb2.toString());
                            String queryParameter2 = uri2.getQueryParameter(str2);
                            if (queryParameter2 == null) {
                                Object[] objArr36 = new Object[i];
                                a(2062 - TextUtils.getOffsetBefore(str5, 0), TextUtils.getOffsetBefore(str5, 0) + 8, (char) (39288 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr36);
                                queryParameter2 = ((String) objArr36[0]).intern();
                            }
                            Object[] objArr37 = new Object[i];
                            a(1853 - Color.green(0), 3 - View.resolveSizeAndState(0, 0, 0), (char) (61788 - (Process.myTid() >> 22)), objArr37);
                            String strIntern7 = ((String) objArr37[0]).intern();
                            Object[] objArr38 = new Object[i];
                            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1475, TextUtils.indexOf(str5, str5, 0) + 5, (char) (40193 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr38);
                            linkedHashMap.put(strIntern7, URLDecoder.decode(queryParameter2, ((String) objArr38[0]).intern()));
                            Object[] objArr39 = new Object[i];
                            a(1868 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf(str5, '0', 0) + 5, (char) (AndroidCharacter.getMirror('0') - '0'), objArr39);
                            linkedHashMap.put(((String) objArr39[0]).intern(), getConsentDialogState.SCHEME.getServerValue());
                            linkedHashMap.put(str2, str7);
                            r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.onExtraCallback(r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion, context, linkedHashMap, (Map) null, 4, (Object) null);
                            i12 = i13;
                        }
                    } else if (iOnExtraCallback == 1010) {
                        Intent intentOnExtraCallback = UST_CERT_GetSubjectAltName.onNavigationEvent.onExtraCallback(uri);
                        if (intentOnExtraCallback != null) {
                            context.startActivity(intentOnExtraCallback);
                        }
                    } else if (iOnExtraCallback != 1100) {
                        if (iOnExtraCallback == 2 || iOnExtraCallback == 3) {
                            onJsBridgeReady.IAuthTabCallback(context, R.string.multilogin_not_supported, 0, 2, (Object) null);
                        } else if (iOnExtraCallback != 4) {
                            int i14 = i9 + 79;
                            int i15 = i14 % 128;
                            ICustomTabsCallbackStub = i15;
                            int i16 = i14 % 2;
                            if (iOnExtraCallback != 5) {
                                if (iOnExtraCallback != 16) {
                                    if (iOnExtraCallback == 17) {
                                        resumeForClick resumeforclick4 = resumeForClick.asBinder;
                                        Object[] objArr40 = new Object[i];
                                        a(1877 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 37 - TextUtils.getOffsetAfter(str5, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr40);
                                        SessionTrackerb.onExtraCallbackWithResult(resumeforclick4, context, ((String) objArr40[0]).intern(), false, null, null, false, 60, null);
                                    } else if (iOnExtraCallback == 999) {
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                                        Intrinsics.checkNotNullExpressionValue(queryParameterNames, str5);
                                        for (String str8 : queryParameterNames) {
                                            String queryParameter3 = uri.getQueryParameter(str8);
                                            if (queryParameter3 == null) {
                                                queryParameter3 = str5;
                                            }
                                            linkedHashMap2.put(str8, queryParameter3);
                                        }
                                        r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.onExtraCallback(r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion, context, linkedHashMap2, (Map) null, 4, (Object) null);
                                    } else if (iOnExtraCallback != 1000) {
                                        int i17 = i15 + 111;
                                        int i18 = i17 % 128;
                                        onPostMessage = i18;
                                        int i19 = i17 % 2;
                                        switch (iOnExtraCallback) {
                                            case 10:
                                            case 11:
                                                if (context instanceof Activity) {
                                                    int i20 = i18 + 59;
                                                    ICustomTabsCallbackStub = i20 % 128;
                                                    if (i20 % 2 == 0) {
                                                        activity2 = (Activity) context;
                                                        i2 = 0;
                                                        int i21 = 4 / 0;
                                                    } else {
                                                        i2 = 0;
                                                        activity2 = (Activity) context;
                                                    }
                                                    activity = activity2;
                                                } else {
                                                    i2 = 0;
                                                    activity = null;
                                                }
                                                if (activity != null) {
                                                    Object[] objArr41 = new Object[i];
                                                    a(ExpandableListView.getPackedPositionChild(0L) + 1789, View.getDefaultSize(i2, i2) + 34, (char) (42656 - View.MeasureSpec.makeMeasureSpec(i2, i2)), objArr41);
                                                    Uri uri3 = Uri.parse(((String) objArr41[i2]).intern());
                                                    Set<String> queryParameterNames2 = uri.getQueryParameterNames();
                                                    Intrinsics.checkNotNullExpressionValue(queryParameterNames2, str5);
                                                    Iterator<T> it = queryParameterNames2.iterator();
                                                    while (it.hasNext()) {
                                                        int i22 = onPostMessage + 23;
                                                        ICustomTabsCallbackStub = i22 % 128;
                                                        if (i22 % 2 == 0) {
                                                            str3 = (String) it.next();
                                                            Intrinsics.checkNotNullExpressionValue(uri3, str5);
                                                            Intrinsics.checkNotNull(str3);
                                                            queryParameter = uri.getQueryParameter(str3);
                                                            int i23 = 0 / 0;
                                                            if (queryParameter == null) {
                                                                queryParameter = str5;
                                                            }
                                                        } else {
                                                            str3 = (String) it.next();
                                                            Intrinsics.checkNotNullExpressionValue(uri3, str5);
                                                            Intrinsics.checkNotNull(str3);
                                                            queryParameter = uri.getQueryParameter(str3);
                                                            if (queryParameter == null) {
                                                            }
                                                        }
                                                        uri3 = Uri.parse(filterCreatePageParams.onExtraCallback(uri3, str3, queryParameter));
                                                    }
                                                    resumeForClick resumeforclick5 = resumeForClick.asBinder;
                                                    Intrinsics.checkNotNullExpressionValue(uri3, str5);
                                                    List<String> pathSegments = uri.getPathSegments();
                                                    Object[] objArr42 = new Object[i];
                                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1426, 7 - TextUtils.indexOf((CharSequence) str5, '0', 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr42);
                                                    String strIntern8 = ((String) objArr42[0]).intern();
                                                    Object[] objArr43 = new Object[i];
                                                    a(MotionEvent.axisFromString(str5) + 1427, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr43);
                                                    if (!pathSegments.contains(((String) objArr43[0]).intern())) {
                                                        List<String> pathSegments2 = uri.getPathSegments();
                                                        Object[] objArr44 = new Object[i];
                                                        a(1821 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.getMode(0) + 11, (char) (48138 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr44);
                                                        strIntern8 = ((String) objArr44[0]).intern();
                                                        Object[] objArr45 = new Object[i];
                                                        a(1821 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48137), objArr45);
                                                        String str9 = pathSegments2.contains(((String) objArr45[0]).intern()) ? strIntern8 : str5;
                                                        Object[] objArr46 = new Object[i];
                                                        a(1832 - Process.getGidForName(str5), 10 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55638), objArr46);
                                                        SessionTrackerb.IAuthTabCallback((SessionTrackerb) resumeforclick5, activity, filterCreatePageParams.onExtraCallback(uri3, ((String) objArr46[0]).intern(), str9), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                                                        break;
                                                    }
                                                } else if (!((isApplicationPaused) this.readTypedObject.get()).onWarmupCompleted(context, uri, z2, bundle) && !((isApplicationPaused) this.onActivityResized.get()).IAuthTabCallback(context, uri, z2)) {
                                                    return false;
                                                }
                                                break;
                                            case 12:
                                                Object[] objArr47 = new Object[i];
                                                a(1767 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - Process.getGidForName(str5), (char) (36627 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr47);
                                                String strIAuthTabCallback6 = filterCreatePageParams.IAuthTabCallback(uri, ((String) objArr47[0]).intern(), str5);
                                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                                                if (objOnExtraCallback == null) {
                                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                                                }
                                                Object obj3 = ((Field) objOnExtraCallback).get(null);
                                                try {
                                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                                                    if (objOnExtraCallback2 == null) {
                                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 29426), 22 - Color.red(0), 24734 - (Process.myTid() >> 22), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                                                    }
                                                    writeRaw writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj3, null)).asBinder(strIAuthTabCallback6).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                                                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, str5);
                                                    writerawIAuthTabCallback.IAuthTabCallback();
                                                    Activity activity3 = context instanceof Activity ? (Activity) context : null;
                                                    if (activity3 != null) {
                                                        int i24 = ICustomTabsCallbackStub + 67;
                                                        onPostMessage = i24 % 128;
                                                        int i25 = i24 % 2;
                                                        resumeForClick resumeforclick6 = resumeForClick.asBinder;
                                                        Object[] objArr48 = new Object[i];
                                                        a((ViewConfiguration.getScrollBarSize() >> 8) + 1772, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (47548 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr48);
                                                        SessionTrackerb.IAuthTabCallback((SessionTrackerb) resumeforclick6, activity3, ((String) objArr48[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            default:
                                                switch (iOnExtraCallback) {
                                                    case 1002:
                                                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                                        if (defaultUncaughtExceptionHandler != null) {
                                                            Thread thread = Looper.getMainLooper().getThread();
                                                            Object[] objArr49 = new Object[i];
                                                            a(1755 - KeyEvent.getDeadChar(0, 0), 12 - Drawable.resolveOpacity(0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), objArr49);
                                                            defaultUncaughtExceptionHandler.uncaughtException(thread, new RuntimeException(((String) objArr49[0]).intern()));
                                                            break;
                                                        }
                                                        break;
                                                    case 1003:
                                                        ReactInstanceDevHelper.onNavigationEvent.onWarmupCompleted();
                                                        break;
                                                    case 1004:
                                                        trackCheckout trackcheckout = this.writeTypedObject;
                                                        Object[] objArr50 = new Object[i];
                                                        a(1434 - TextUtils.getCapsMode(str5, 0, 0), 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Color.red(0), objArr50);
                                                        trackcheckout.onWarmupCompleted(((String) objArr50[0]).intern(), 0, new Function1() { // from class: im.toss.splittarget.impl.util.DeepLinkInterceptorImpl$$ExternalSyntheticLambda1
                                                            private static int onExtraCallback = 0;
                                                            private static int onWarmupCompleted = 1;

                                                            public final Object invoke(Object obj4) throws Throwable {
                                                                int i26 = 2 % 2;
                                                                int i27 = onWarmupCompleted + 7;
                                                                onExtraCallback = i27 % 128;
                                                                int i28 = i27 % 2;
                                                                Unit unitOnWarmupCompleted = AppLovinAdServiceImplExternalSyntheticLambda0.onWarmupCompleted((trackEventSynchronously) obj4);
                                                                int i29 = onWarmupCompleted + 115;
                                                                onExtraCallback = i29 % 128;
                                                                if (i29 % 2 == 0) {
                                                                    return unitOnWarmupCompleted;
                                                                }
                                                                Object obj5 = null;
                                                                obj5.hashCode();
                                                                throw null;
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        switch (iOnExtraCallback) {
                                                            case 2000:
                                                                return onExtraCallbackWithResult(context, uri);
                                                            case 2001:
                                                                Object[] objArr51 = new Object[i];
                                                                a(KeyEvent.normalizeMetaState(0) + 1723, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 32, (char) (TextUtils.lastIndexOf(str5, '0', 0, 0) + i), objArr51);
                                                                Uri uri4 = Uri.parse(((String) objArr51[0]).intern());
                                                                Intrinsics.checkNotNullExpressionValue(uri4, str5);
                                                                SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, processTransparent.onWarmupCompleted(uri, uri4), false, null, null, false, 60, null);
                                                                break;
                                                            case 2002:
                                                                if (this.onMinimized.onExtraCallback() || addExtra.extraCallback(playerErrorCode)) {
                                                                    resumeForClick resumeforclick7 = resumeForClick.asBinder;
                                                                    Object[] objArr52 = new Object[i];
                                                                    a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1693, KeyEvent.getDeadChar(0, 0) + 29, (char) (31460 - View.resolveSizeAndState(0, 0, 0)), objArr52);
                                                                    SessionTrackerb.onExtraCallbackWithResult(resumeforclick7, context, ((String) objArr52[0]).intern(), false, null, null, false, 60, null);
                                                                    break;
                                                                }
                                                                break;
                                                            case 2003:
                                                                Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
                                                                if (typedObject != null) {
                                                                    Object[] objArr53 = new Object[i];
                                                                    a(1686 - Color.blue(0), 8 - Color.blue(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr53);
                                                                    new getMaxLevel.IAuthTabCallback(typedObject).onNavigationEvent(uri.getQueryParameter(((String) objArr53[0]).intern())).IAuthTabCallback();
                                                                    break;
                                                                }
                                                                break;
                                                            case 2004:
                                                                if (!IAuthTabCallback(context, uri)) {
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                    } else {
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        Object[] objArr54 = new Object[i];
                                        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1542, 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (42956 - Color.argb(0, 0, 0, 0)), objArr54);
                                        String strIntern9 = ((String) objArr54[0]).intern();
                                        Object[] objArr55 = new Object[i];
                                        a(TextUtils.getOffsetAfter(str5, 0) + 1843, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, (char) (8015 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr55);
                                        linkedHashMap3.put(strIntern9, ((String) objArr55[0]).intern());
                                        Object[] objArr56 = new Object[i];
                                        a((ViewConfiguration.getPressedStateDuration() >> 16) + 1853, View.resolveSize(0, 0) + 3, (char) (61788 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr56);
                                        String strIntern10 = ((String) objArr56[0]).intern();
                                        Object[] objArr57 = new Object[i];
                                        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 1856, 12 - TextUtils.getCapsMode(str5, 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 58694), objArr57);
                                        linkedHashMap3.put(strIntern10, ((String) objArr57[0]).intern());
                                        Object[] objArr58 = new Object[i];
                                        a(TextUtils.indexOf(str5, str5) + 1868, 3 - MotionEvent.axisFromString(str5), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr58);
                                        String strIntern11 = ((String) objArr58[0]).intern();
                                        Object[] objArr59 = new Object[i];
                                        a(1872 - KeyEvent.keyCodeFromString(str5), 3 - ImageFormat.getBitsPerPixel(0), (char) (61695 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr59);
                                        linkedHashMap3.put(strIntern11, ((String) objArr59[0]).intern());
                                        String queryParameter4 = uri.getQueryParameter(str2);
                                        if (queryParameter4 == null) {
                                            queryParameter4 = str5;
                                        }
                                        linkedHashMap3.put(str2, queryParameter4);
                                        Set<String> queryParameterNames3 = uri.getQueryParameterNames();
                                        Intrinsics.checkNotNullExpressionValue(queryParameterNames3, str5);
                                        for (String str10 : queryParameterNames3) {
                                            String queryParameter5 = uri.getQueryParameter(str10);
                                            if (queryParameter5 == null) {
                                                queryParameter5 = str5;
                                            }
                                            linkedHashMap3.put(str10, queryParameter5);
                                        }
                                        r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.onExtraCallback(r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion, context, linkedHashMap3, (Map) null, 4, (Object) null);
                                    }
                                } else if (context instanceof BaseActivity) {
                                    onWarmupCompleted((Activity) context, uri);
                                }
                            } else if (AppStateManager.onExtraCallbackWithResult.readTypedObject() instanceof SchemeActivity) {
                                this.extraCallback = new Function0() { // from class: im.toss.splittarget.impl.util.DeepLinkInterceptorImpl$$ExternalSyntheticLambda0
                                    private static int onExtraCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke() throws Throwable {
                                        int i26 = 2 % 2;
                                        int i27 = onExtraCallback + 73;
                                        onWarmupCompleted = i27 % 128;
                                        int i28 = i27 % 2;
                                        Uri uri5 = uri;
                                        if (i28 != 0) {
                                            return AppLovinAdServiceImplExternalSyntheticLambda0.onNavigationEvent(uri5);
                                        }
                                        AppLovinAdServiceImplExternalSyntheticLambda0.onNavigationEvent(uri5);
                                        throw null;
                                    }
                                };
                            } else {
                                getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new verifySignEX(filterCreatePageParams.IAuthTabCallback(uri, str2, str5)));
                            }
                        } else {
                            QuitActivity.Companion.onWarmupCompleted(context);
                        }
                    } else if (((context instanceof Activity ? 1 : 0) ^ i) == 0) {
                        int i26 = i11 + 29;
                        onPostMessage = i26 % 128;
                        if (i26 % 2 != 0) {
                            resumeForClick.asBinder.onWarmupCompleted(context, uri);
                            throw null;
                        }
                        Intent intentOnWarmupCompleted = resumeForClick.asBinder.onWarmupCompleted(context, uri);
                        if (intentOnWarmupCompleted != null && (flags = intentOnWarmupCompleted.setFlags(33554432)) != null) {
                            ((Activity) context).startActivity(flags);
                        }
                    }
                }
                return i;
            }
        }
        return ((isApplicationPaused) this.access100.get()).IAuthTabCallback(context, uri, z2);
    }

    private static final Unit IAuthTabCallback(Uri uri) throws Throwable {
        int i = 2 % 2;
        getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 3 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr);
        geticonpaddingleft.onExtraCallbackWithResult(new verifySignEX(filterCreatePageParams.IAuthTabCallback(uri, ((String) objArr[0]).intern(), "")));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStub + 117;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final String IAuthTabCallback(String str, Pair<String, ? extends Object>... pairArr) throws Throwable {
        int i = 2 % 2;
        List mutableList = ArraysKt.toMutableList(pairArr);
        Object[] objArr = new Object[1];
        a(21 - ((byte) KeyEvent.getModifierMetaStateMask()), 3 - (Process.myTid() >> 22), (char) KeyEvent.getDeadChar(0, 0), objArr);
        mutableList.add(0, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str));
        List<Pair> list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Pair pair : list) {
            Object first = pair.getFirst();
            String string = pair.getSecond().toString();
            Object[] objArr2 = new Object[1];
            a(1476 - TextUtils.getTrimmedLength(""), 4 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.getGidForName("") + 40194), objArr2);
            String strEncode = URLEncoder.encode(string, ((String) objArr2[0]).intern());
            StringBuilder sb = new StringBuilder();
            sb.append(first);
            Object[] objArr3 = new Object[1];
            a(1481 - ExpandableListView.getPackedPositionType(0L), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(strEncode);
            arrayList.add(sb.toString());
            int i2 = ICustomTabsCallbackStub + 41;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
        }
        Object[] objArr4 = new Object[1];
        a(1482 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - View.combineMeasuredStates(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr4);
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ((String) objArr4[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr5 = new Object[1];
        a(1482 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf("", "", 0) + 23, (char) (25277 - TextUtils.getTrimmedLength("")), objArr5);
        sb2.append(((String) objArr5[0]).intern());
        sb2.append(strJoinToString$default);
        String string2 = sb2.toString();
        int i4 = onPostMessage + 37;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(trackEventSynchronously trackeventsynchronously) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        Object[] objArr = new Object[1];
        a(1434 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getEdgeSlop() >> 16) + 8, (char) TextUtils.getTrimmedLength(""), objArr);
        trackeventsynchronously.onExtraCallbackWithResult(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(1442 - Color.alpha(0), 34 - View.MeasureSpec.getMode(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1065), objArr2);
        Object[] objArr3 = {trackeventsynchronously, ((String) objArr2[0]).intern()};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 27;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onWarmupCompleted(Activity activity, Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1536, 6 - ExpandableListView.getPackedPositionGroup(0L), (char) (22651 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        String str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        Object[] objArr2 = new Object[1];
        a(1543 - View.MeasureSpec.getSize(0), 5 - Color.red(0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42956), objArr2);
        String str2 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr2[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 1548, (ViewConfiguration.getLongPressTimeout() >> 16) + 4, (char) (62243 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr3);
        String str3 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr3[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        Object[] objArr4 = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1553, 9 - TextUtils.indexOf("", ""), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7750), objArr4);
        String str4 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr4[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        Object[] objArr5 = new Object[1];
        a(1561 - TextUtils.getTrimmedLength(""), 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), objArr5);
        String str5 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr5[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        Object[] objArr6 = new Object[1];
        a(1576 - Color.argb(0, 0, 0, 0), 13 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
        boolean zOnExtraCallback = filterCreatePageParams.onExtraCallback(uri, ((String) objArr6[0]).intern(), false);
        if (str.length() != 0) {
            Uri uri2 = Uri.parse(str);
            Object[] objArr7 = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1589, 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 16324), objArr7);
            String str6 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri2, ((String) objArr7[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
            if (addPolicy.ITrustedWebActivityService_Parcel().onWarmupCompleted(str6, 0) < 2) {
                addSDKNotificationListener.Companion.onExtraCallback(activity, str, str6, str2, str3, str4, str5, zOnExtraCallback).onExtraCallback();
                int i4 = ICustomTabsCallbackStub + 31;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        int i6 = onPostMessage + 55;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final boolean onExtraCallbackWithResult(Context context, Uri uri) throws Throwable {
        int i = 2 % 2;
        if (this.getInterfaceDescriptor.IAuthTabCallback()) {
            if (RRNUtils.onExtraCallback(String.valueOf(((Integer) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1226907050, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1226907059, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).intValue())).booleanValue()) {
                Object[] objArr = new Object[1];
                a(View.resolveSize(0, 0) + 1323, 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (12633 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr);
                String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                if (queryParameter == null) {
                    int i2 = ICustomTabsCallbackStub + 119;
                    onPostMessage = i2 % 128;
                    if (i2 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    queryParameter = "";
                }
                DERSet dERSet = DERSet.onExtraCallback;
                List<Pair> listListOf = CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(dERSet.ITrustedWebActivityCallback(), dERSet.IEngagementSignalsCallbackDefault()), getWrite.IAuthTabCallback(dERSet.IPostMessageServiceStubProxy(), dERSet.IEngagementSignalsCallbackStubProxy()), getWrite.IAuthTabCallback(dERSet.ITrustedWebActivityCallbackDefault(), dERSet.onVerticalScrollEvent()), getWrite.IAuthTabCallback(dERSet.IPostMessageService_Parcel(), dERSet.IPostMessageService())});
                List list = listListOf;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getSecond());
                }
                if (!(!arrayList.contains(queryParameter))) {
                    return false;
                }
                for (Pair pair : listListOf) {
                    Uri uri2 = Uri.parse((String) pair.getFirst());
                    Object[] objArr2 = new Object[1];
                    a(1324 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 5 - TextUtils.getTrimmedLength(""), (char) (12633 - View.combineMeasuredStates(0, 0)), objArr2);
                    String queryParameter2 = uri2.getQueryParameter(((String) objArr2[0]).intern());
                    if (queryParameter2 == null) {
                        int i3 = ICustomTabsCallbackStub + 115;
                        onPostMessage = i3 % 128;
                        int i4 = i3 % 2;
                        queryParameter2 = "";
                    }
                    if (Intrinsics.areEqual(queryParameter2, queryParameter)) {
                        String str = (String) pair.getSecond();
                        Object[] objArr3 = new Object[1];
                        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1323, TextUtils.getOffsetBefore("", 0) + 5, (char) (Process.getGidForName("") + 12634), objArr3);
                        SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, filterCreatePageParams.onExtraCallback(uri, ((String) objArr3[0]).intern(), str), false, null, null, false, 60, null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(Context context, Uri uri, boolean z) throws Throwable {
        Object obj;
        String scheme;
        boolean z2;
        boolean z3;
        String strSubstringBefore$default;
        String str;
        int i = 2 % 2;
        String scheme2 = uri.getScheme();
        Object[] objArr = new Object[1];
        a(1232 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, (char) Color.red(0), objArr);
        if (!Intrinsics.areEqual(scheme2, ((String) objArr[0]).intern())) {
            return false;
        }
        String host = uri.getHost();
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 89, View.MeasureSpec.getMode(0) + 4, (char) (10893 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr2);
        if (!Intrinsics.areEqual(host, ((String) objArr2[0]).intern())) {
            String host2 = uri.getHost();
            Object[] objArr3 = new Object[1];
            a(85 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 4, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
            if (!Intrinsics.areEqual(host2, ((String) objArr3[0]).intern())) {
                String host3 = uri.getHost();
                Object[] objArr4 = new Object[1];
                a(Color.alpha(0) + 93, 7 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 32525), objArr4);
                if (!Intrinsics.areEqual(host3, ((String) objArr4[0]).intern())) {
                    int i2 = ICustomTabsCallbackStub + 25;
                    onPostMessage = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
            }
        }
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            String path2 = uri.getPath();
            Object[] objArr5 = new Object[1];
            a(1241 - Color.alpha(0), 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (40432 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr5);
            if (!Intrinsics.areEqual(path2, ((String) objArr5[0]).intern())) {
                int i4 = onPostMessage + 47;
                ICustomTabsCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        String host4 = uri.getHost();
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 85, ((Process.getThreadPriority(0) + 20) >> 6) + 4, (char) View.getDefaultSize(0, 0), objArr6);
        if (Intrinsics.areEqual(host4, ((String) objArr6[0]).intern())) {
            Object[] objArr7 = new Object[1];
            a(25 - (ViewConfiguration.getWindowTouchSlop() >> 8), 4 - Drawable.resolveOpacity(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr7);
            String queryParameter = uri.getQueryParameter(((String) objArr7[0]).intern());
            if (queryParameter != null) {
                int i6 = onPostMessage + 45;
                ICustomTabsCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                if (queryParameter.length() != 0) {
                    return false;
                }
            }
        }
        Object[] objArr8 = new Object[1];
        a(22 - View.combineMeasuredStates(0, 0), 3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr8);
        String queryParameter2 = uri.getQueryParameter(((String) objArr8[0]).intern());
        if (queryParameter2 != null) {
            String str2 = StringsKt.isBlank(queryParameter2) ^ true ? queryParameter2 : null;
            if (str2 != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(Uri.parse(str2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    obj = null;
                }
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    scheme = uri2.getScheme();
                } else {
                    int i8 = ICustomTabsCallbackStub + 7;
                    onPostMessage = i8 % 128;
                    int i9 = i8 % 2;
                    scheme = null;
                }
                Object[] objArr9 = new Object[1];
                a(1232 - KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                if (Intrinsics.areEqual(scheme, ((String) objArr9[0]).intern())) {
                    int i10 = onPostMessage + 57;
                    ICustomTabsCallbackStub = i10 % 128;
                    if (i10 % 2 == 0) {
                        String host5 = uri2.getHost();
                        Object[] objArr10 = new Object[1];
                        a(7 % (ViewConfiguration.getDoubleTapTimeout() * 112), 3 >>> TextUtils.indexOf("", ""), (char) (12091 / TextUtils.indexOf((CharSequence) "", (char) 16)), objArr10);
                        if (Intrinsics.areEqual(host5, ((String) objArr10[0]).intern())) {
                            String path3 = uri2.getPath();
                            if (path3 != null) {
                                int i11 = onPostMessage + 81;
                                ICustomTabsCallbackStub = i11 % 128;
                                int i12 = i11 % 2;
                                if (path3.length() != 0) {
                                    int i13 = onPostMessage + 11;
                                    ICustomTabsCallbackStub = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        String path4 = uri2.getPath();
                                        Object[] objArr11 = new Object[1];
                                        a(23214 / Color.alpha(0), 1 << (ViewConfiguration.getTapTimeout() - 9), (char) (40432 >> (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1))), objArr11);
                                        z2 = Intrinsics.areEqual(path4, ((String) objArr11[0]).intern()) ^ true;
                                    } else {
                                        String path5 = uri2.getPath();
                                        Object[] objArr12 = new Object[1];
                                        a(Color.alpha(0) + 1241, 1 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40432), objArr12);
                                        if (!Intrinsics.areEqual(path5, ((String) objArr12[0]).intern())) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        String host6 = uri2.getHost();
                        Object[] objArr13 = new Object[1];
                        a(89 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 4 - TextUtils.indexOf("", ""), (char) (10892 - TextUtils.indexOf((CharSequence) "", '0')), objArr13);
                        if (Intrinsics.areEqual(host6, ((String) objArr13[0]).intern())) {
                        }
                    }
                }
                String host7 = uri.getHost();
                a(KeyEvent.normalizeMetaState(0) + 89, (-16777212) - Color.rgb(0, 0, 0), (char) (10893 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), new Object[1]);
                if (!Intrinsics.areEqual(host7, ((String) r14[0]).intern())) {
                    int i14 = ICustomTabsCallbackStub + 11;
                    onPostMessage = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    z3 = z2;
                }
                if (z3) {
                    Object[] objArr14 = new Object[1];
                    a(45 - View.getDefaultSize(0, 0), AndroidCharacter.getMirror('0') - 18, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36688), objArr14);
                    strSubstringBefore$default = ((String) objArr14[0]).intern();
                    int i15 = onPostMessage + 41;
                    ICustomTabsCallbackStub = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 4 / 2;
                    }
                } else if (uri2 != null) {
                    String str3 = (String) IAuthTabCallback(1789909324, new Object[]{this, uri2}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1789909322);
                    if (str3 != null) {
                        str = null;
                        String strSubstringBefore$default2 = StringsKt.substringBefore$default(str3, '?', (String) null, 2, (Object) null);
                        if (strSubstringBefore$default2 != null) {
                            strSubstringBefore$default = strSubstringBefore$default2;
                        }
                    } else {
                        str = null;
                    }
                    strSubstringBefore$default = StringsKt.substringBefore$default(str2, '?', str, 2, str);
                } else {
                    strSubstringBefore$default = null;
                }
                List list = (List) IAuthTabCallback(1176100674, new Object[]{this, strSubstringBefore$default}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1176100674);
                onNavigationEvent(context);
                if (z3) {
                    resumeForClick resumeforclick = resumeForClick.asBinder;
                    Object[] objArr15 = new Object[1];
                    a(45 - TextUtils.getTrimmedLength(""), 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (36688 - View.getDefaultSize(0, 0)), objArr15);
                    SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, ((String) objArr15[0]).intern(), false, null, null, z, 28, null);
                }
                SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, str2, false, null, null, z, 28, null);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).finish();
                }
                return true;
            }
        }
        return false;
    }

    private final boolean IAuthTabCallback(Context context, String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) IAuthTabCallback(1176100674, new Object[]{this, StringsKt.substringBefore$default(str, '?', (String) null, 2, (Object) null)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1176100674);
        onNavigationEvent(context);
        if (!SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, str, false, null, null, z, 28, null)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
            int i4 = ICustomTabsCallbackStub + 7;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        return true;
    }

    private final void onNavigationEvent(Context context) throws Throwable {
        int i = 2 % 2;
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback == null || !activityIAuthTabCallback.isTaskRoot()) {
            return;
        }
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 81;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        if (activityIAuthTabCallback instanceof SidecarAdapterExternalSyntheticLambda0) {
            return;
        }
        int i5 = i2 + 97;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
            if (!this.getInterfaceDescriptor.IAuthTabCallback()) {
                return;
            }
        } else if (!this.getInterfaceDescriptor.IAuthTabCallback()) {
            return;
        }
        int i7 = ICustomTabsCallbackStub + 95;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        Intent intentOnExtraCallbackWithResult = resumeForClick.asBinder.onExtraCallbackWithResult(activityIAuthTabCallback);
        Object[] objArr = new Object[1];
        a(1506 - TextUtils.getCapsMode("", 0, 0), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (64411 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        Intent intentPutExtra = intentOnExtraCallbackWithResult.putExtra(((String) objArr[0]).intern(), true);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        activityIAuthTabCallback.startActivity(intentPutExtra);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int iNextIndex;
        String str = (String) objArr[1];
        int i = 2 % 2;
        List listOnMessageChannelReady = AppStateManager.onExtraCallbackWithResult.onMessageChannelReady();
        List arrayList = new ArrayList();
        Iterator it = listOnMessageChannelReady.iterator();
        while (it.hasNext()) {
            int i2 = onPostMessage + 49;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Activity activity = (Activity) ((WeakReference) ((Pair) it.next()).getFirst()).get();
            if (activity != null) {
                int i4 = ICustomTabsCallbackStub + 47;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(activity);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((Activity) listIterator.previous()) instanceof SidecarAdapterExternalSyntheticLambda0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            arrayList = arrayList.subList(iNextIndex + 1, arrayList.size());
        }
        String str2 = IAuthTabCallback_Parcel.get(str);
        String host = null;
        if (str2 != null) {
            int i6 = ICustomTabsCallbackStub + 5;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = arrayList instanceof Collection;
                host.hashCode();
                throw null;
            }
            List<BaseLauncherWrapperActivity> list = arrayList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                int i7 = onPostMessage + 97;
                ICustomTabsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                for (BaseLauncherWrapperActivity baseLauncherWrapperActivity : list) {
                    BaseLauncherWrapperActivity baseLauncherWrapperActivity2 = (baseLauncherWrapperActivity instanceof BaseLauncherWrapperActivity) ^ true ? null : baseLauncherWrapperActivity;
                    if (Intrinsics.areEqual(baseLauncherWrapperActivity2 != null ? baseLauncherWrapperActivity2.IAuthTabCallback() : null, str2)) {
                        int i9 = ICustomTabsCallbackStub + 103;
                        onPostMessage = i9 % 128;
                        int i10 = i9 % 2;
                        return CollectionsKt.emptyList();
                    }
                }
            }
        }
        if (str != null) {
            int i11 = ICustomTabsCallbackStub + 71;
            onPostMessage = i11 % 128;
            int i12 = i11 % 2;
            Uri uri = Uri.parse(str);
            if (uri != null) {
                host = uri.getHost();
            }
        }
        Object[] objArr2 = new Object[1];
        a(74 - MotionEvent.axisFromString(""), AndroidCharacter.getMirror('0') - '&', (char) (30333 - TextUtils.getOffsetAfter("", 0)), objArr2);
        if (Intrinsics.areEqual(host, ((String) objArr2[0]).intern())) {
            int i13 = ICustomTabsCallbackStub + 39;
            onPostMessage = i13 % 128;
            int i14 = i13 % 2;
            if (CollectionsKt.lastOrNull(arrayList) instanceof TossSecBaseActivity) {
                int i15 = onPostMessage + 1;
                ICustomTabsCallbackStub = i15 % 128;
                return i15 % 2 == 0 ? CollectionsKt.reversed(CollectionsKt.dropLast(arrayList, 0)) : CollectionsKt.reversed(CollectionsKt.dropLast(arrayList, 1));
            }
        }
        return CollectionsKt.reversed(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, ((java.lang.String) r10[0]).intern()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, ((java.lang.String) r11[0]).intern()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0148, code lost:
    
        if (r1.equals(((java.lang.String) r7[0]).intern()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c3, code lost:
    
        if (r1.equals(((java.lang.String) r7[0]).intern()) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c5, code lost:
    
        r4 = new java.lang.Object[1];
        a(android.graphics.Color.green(0) + 258, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, (char) (22763 - android.view.View.getDefaultSize(0, 0)), r4);
        r0 = ((java.lang.String) r4[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x020f, code lost:
    
        if (r1.equals(((java.lang.String) r7[0]).intern()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x028c, code lost:
    
        if (r1.equals(((java.lang.String) r6[0]).intern()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b8, code lost:
    
        if (r1.equals(((java.lang.String) r7[0]).intern()) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ba, code lost:
    
        r4 = new java.lang.Object[1];
        a(45 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 36688), r4);
        r0 = ((java.lang.String) r4[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0308, code lost:
    
        if (r1.equals(((java.lang.String) r6[0]).intern()) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x030a, code lost:
    
        r4 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 216, 34 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.graphics.Color.green(0), r4);
        r0 = ((java.lang.String) r4[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallbackWithResult(Uri uri) throws Throwable {
        int i = 2 % 2;
        String scheme = uri.getScheme();
        Object[] objArr = new Object[1];
        a(1232 - Color.green(0), 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        Object obj = null;
        if (!Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
            return null;
        }
        String host = uri.getHost();
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 85, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), objArr2);
        if (!Intrinsics.areEqual(host, ((String) objArr2[0]).intern())) {
            int i2 = onPostMessage + 9;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            int i3 = ICustomTabsCallbackStub + 25;
            onPostMessage = i3 % 128;
            if (i3 % 2 != 0) {
                String path2 = uri.getPath();
                int iRed = Color.red(0) + 25220;
                ViewConfiguration.getScrollBarSize();
                Object[] objArr3 = new Object[1];
                a(iRed, 0, (char) (40432 >> (ViewConfiguration.getEdgeSlop() + 34)), objArr3);
            } else {
                String path3 = uri.getPath();
                Object[] objArr4 = new Object[1];
                a(Color.red(0) + 1241, (ViewConfiguration.getScrollBarSize() >> 8) + 1, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 40432), objArr4);
            }
        }
        Object[] objArr5 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, (char) KeyEvent.getDeadChar(0, 0), objArr5);
        String queryParameter = uri.getQueryParameter(((String) objArr5[0]).intern());
        if (queryParameter != null) {
            int i4 = onPostMessage + 103;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                queryParameter.hashCode();
                throw null;
            }
            switch (queryParameter.hashCode()) {
                case -1136178003:
                    Object[] objArr6 = new Object[1];
                    a(((byte) KeyEvent.getModifierMetaStateMask()) + 1257, 7 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (34880 - ExpandableListView.getPackedPositionType(0L)), objArr6);
                    break;
                case -1047860588:
                    Object[] objArr7 = new Object[1];
                    a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 167, TextUtils.lastIndexOf("", '0', 0) + 10, (char) (41674 - KeyEvent.getDeadChar(0, 0)), objArr7);
                    break;
                case -344460952:
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 250, 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (63782 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr8);
                    break;
                case -222710633:
                    Object[] objArr9 = new Object[1];
                    a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 210, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr9);
                    if (queryParameter.equals(((String) objArr9[0]).intern())) {
                        Object[] objArr10 = new Object[1];
                        a(TextUtils.indexOf("", "") + 176, 'Q' - AndroidCharacter.getMirror('0'), (char) (Color.rgb(0, 0, 0) + 16777216), objArr10);
                        String strIntern = ((String) objArr10[0]).intern();
                        Uri uri2 = Uri.parse(strIntern);
                        Intrinsics.checkNotNullExpressionValue(uri2, "");
                        return processTransparent.onWarmupCompleted(uri, uri2);
                    }
                    break;
                case 3208415:
                    Object[] objArr11 = new Object[1];
                    a(TextUtils.indexOf("", "", 0) + 89, 4 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 10894), objArr11);
                    break;
                case 464397511:
                    Object[] objArr12 = new Object[1];
                    a(1242 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46250 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr12);
                    break;
                case 1574008798:
                    Object[] objArr13 = new Object[1];
                    a((ViewConfiguration.getEdgeSlop() >> 16) + 75, 9 - Process.getGidForName(""), (char) ((-16746883) - Color.rgb(0, 0, 0)), objArr13);
                    if (queryParameter.equals(((String) objArr13[0]).intern())) {
                        return (String) IAuthTabCallback(-1040202274, new Object[]{this, uri}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1040202275);
                    }
                    break;
                case 1984153269:
                    Object[] objArr14 = new Object[1];
                    a(299 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 7, (char) (14201 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr14);
                    break;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r8 = new java.lang.Object[1];
        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, 3 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0), r8);
        r3 = r13.getQueryParameter(((java.lang.String) r8[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        if (r3.length() != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        r8 = new java.lang.Object[1];
        a(25 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), r8);
        r3 = r13.getQueryParameter(((java.lang.String) r8[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c9, code lost:
    
        if (r3.length() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        r6 = r13.getHost();
        r10 = new java.lang.Object[1];
        a(85 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 4 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.text.TextUtils.getTrimmedLength(""), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, ((java.lang.String) r10[0]).intern()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f8, code lost:
    
        r3 = o.AppLovinAdServiceImplExternalSyntheticLambda0.ICustomTabsCallbackStub + 65;
        o.AppLovinAdServiceImplExternalSyntheticLambda0.onPostMessage = r3 % 128;
        r3 = r3 % 2;
        r8 = new java.lang.Object[1];
        a(24 - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.indexOf("", "") + 4, (char) android.view.View.getDefaultSize(0, 0), r8);
        r13 = (android.net.Uri) o.filterCreatePageParams.onWarmupCompleted(new java.lang.Object[]{r13, ((java.lang.String) r8[0]).intern()}, -1629497967, im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
        r8 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 22, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 25194), r8);
        r13 = o.processTransparent.onWarmupCompleted(r13, android.net.Uri.parse(((java.lang.String) r8[0]).intern()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016c, code lost:
    
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x016e, code lost:
    
        r13 = o.processTransparent.onWarmupCompleted(r13, o.NestfgetmDriveCxxAnimations.onExtraCallbackWithResult.onWarmupCompleted());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0179, code lost:
    
        r13 = r13.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0180, code lost:
    
        r13 = android.net.Uri.parse(r13);
        r3 = r13.getScheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0188, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        r6 = o.AppLovinAdServiceImplExternalSyntheticLambda0.ICustomTabsCallbackStub + 31;
        o.AppLovinAdServiceImplExternalSyntheticLambda0.onPostMessage = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0193, code lost:
    
        if ((r6 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0195, code lost:
    
        r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019e, code lost:
    
        if (r3.length() != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a0, code lost:
    
        r13 = o.AppLovinAdServiceImplExternalSyntheticLambda0.ICustomTabsCallbackStub + 71;
        o.AppLovinAdServiceImplExternalSyntheticLambda0.onPostMessage = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a9, code lost:
    
        if ((r13 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ab, code lost:
    
        r13 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ae, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01af, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b1, code lost:
    
        r6 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.getMode(0) + 29, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 11163), r6);
        r2 = ((java.lang.String) r6[0]).intern();
        r1 = new java.lang.Object[1];
        a(1318 - android.text.TextUtils.lastIndexOf("", '0'), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 5, (char) (51623 - android.os.Process.getGidForName("")), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        return o.filterCreatePageParams.onExtraCallback(r13, r2, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0200, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r13.getBooleanQueryParameter(((java.lang.String) r8[0]).intern(), false) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if ((!r13.getBooleanQueryParameter(((java.lang.String) r8[0]).intern(), false)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(116 >>> ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 1) + 24, (char) (19657 >> ImageFormat.getBitsPerPixel(1)), objArr2);
        } else {
            a(ImageFormat.getBitsPerPixel(0) + 30, 16 - TextUtils.getCapsMode("", 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 11164), new Object[1]);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0264, code lost:
    
        if (r4.equals(((java.lang.String) r7[0]).intern()) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0290, code lost:
    
        if (r4.equals(((java.lang.String) r8[0]).intern()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02de, code lost:
    
        if (r4.equals(((java.lang.String) r6[0]).intern()) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x030d, code lost:
    
        if (r4.equals(((java.lang.String) r7[0]).intern()) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x030f, code lost:
    
        r2 = new java.lang.Object[1];
        a(216 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0) + 35, (char) android.graphics.Color.blue(0), r2);
        r0 = ((java.lang.String) r2[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String strIntern;
        Object obj;
        AppLovinAdServiceImplExternalSyntheticLambda0 appLovinAdServiceImplExternalSyntheticLambda0 = (AppLovinAdServiceImplExternalSyntheticLambda0) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        String scheme = uri.getScheme();
        Object[] objArr2 = new Object[1];
        a(1232 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr2);
        if (!Intrinsics.areEqual(scheme, ((String) objArr2[0]).intern())) {
            int i2 = onPostMessage + 107;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
            return null;
        }
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            String path2 = uri.getPath();
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 1241, 1 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (40432 - Color.blue(0)), objArr3);
            if (!Intrinsics.areEqual(path2, ((String) objArr3[0]).intern())) {
                return null;
            }
        }
        String host = uri.getHost();
        if (host != null) {
            int i4 = onPostMessage + 61;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            switch (host.hashCode()) {
                case -1694906844:
                    Object[] objArr4 = new Object[1];
                    a((Process.myTid() >> 22) + 1267, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr4);
                    break;
                case -1136178003:
                    Object[] objArr5 = new Object[1];
                    a(1255 - TextUtils.lastIndexOf("", '0', 0, 0), 7 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.getTrimmedLength("") + 34880), objArr5);
                    break;
                case -1047860588:
                    Object[] objArr6 = new Object[1];
                    a(TextUtils.indexOf("", "", 0) + 167, View.MeasureSpec.getMode(0) + 9, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41674), objArr6);
                    break;
                case -344460952:
                    Object[] objArr7 = new Object[1];
                    a(250 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63782), objArr7);
                    break;
                case -222710633:
                    a(208 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getOffsetBefore("", 0), new Object[1]);
                    if (!(!host.equals(((String) r7[0]).intern()))) {
                        Object[] objArr8 = new Object[1];
                        a(176 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 33 - TextUtils.indexOf("", "", 0, 0), (char) TextUtils.indexOf("", "", 0, 0), objArr8);
                        strIntern = ((String) objArr8[0]).intern();
                        Uri uri2 = Uri.parse(strIntern);
                        Intrinsics.checkNotNullExpressionValue(uri2, "");
                        break;
                    }
                    break;
                case 3016252:
                    Object[] objArr9 = new Object[1];
                    a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1262, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr9);
                    if (host.equals(((String) objArr9[0]).intern())) {
                        int i6 = onPostMessage + 75;
                        ICustomTabsCallbackStub = i6 % 128;
                        if (i6 % 2 == 0) {
                            Object[] objArr10 = new Object[1];
                            a(110 / TextUtils.indexOf("", "", 1, 0), 7 >>> ExpandableListView.getPackedPositionChild(0L), (char) ExpandableListView.getPackedPositionType(0L), objArr10);
                            obj = objArr10[0];
                        } else {
                            Object[] objArr11 = new Object[1];
                            a(TextUtils.indexOf("", "", 0, 0) + 101, ExpandableListView.getPackedPositionChild(0L) + 67, (char) ExpandableListView.getPackedPositionType(0L), objArr11);
                            obj = objArr11[0];
                        }
                        strIntern = ((String) obj).intern();
                        Uri uri22 = Uri.parse(strIntern);
                        Intrinsics.checkNotNullExpressionValue(uri22, "");
                        break;
                    }
                    break;
                case 3208415:
                    Object[] objArr12 = new Object[1];
                    a(TextUtils.indexOf((CharSequence) "", '0') + 90, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (10893 - KeyEvent.getDeadChar(0, 0)), objArr12);
                    if (!host.equals(((String) objArr12[0]).intern())) {
                        int i7 = ICustomTabsCallbackStub + 91;
                        onPostMessage = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 5 % 5;
                            break;
                        }
                    }
                    Object[] objArr13 = new Object[1];
                    a(45 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36687), objArr13);
                    strIntern = ((String) objArr13[0]).intern();
                    Uri uri222 = Uri.parse(strIntern);
                    Intrinsics.checkNotNullExpressionValue(uri222, "");
                    break;
                case 464397511:
                    Object[] objArr14 = new Object[1];
                    a(TextUtils.getOffsetAfter("", 0) + 1242, KeyEvent.keyCodeFromString("") + 14, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46250), objArr14);
                    if (host.equals(((String) objArr14[0]).intern())) {
                        Object[] objArr15 = new Object[1];
                        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 258, ((byte) KeyEvent.getModifierMetaStateMask()) + 41, (char) (22762 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr15);
                        strIntern = ((String) objArr15[0]).intern();
                        Uri uri2222 = Uri.parse(strIntern);
                        Intrinsics.checkNotNullExpressionValue(uri2222, "");
                        break;
                    }
                    break;
                case 1574008798:
                    Object[] objArr16 = new Object[1];
                    a(75 - TextUtils.getOffsetBefore("", 0), TextUtils.getCapsMode("", 0, 0) + 10, (char) (30333 - Color.red(0)), objArr16);
                    if (host.equals(((String) objArr16[0]).intern())) {
                        int i9 = onPostMessage + 7;
                        ICustomTabsCallbackStub = i9 % 128;
                        int i10 = i9 % 2;
                        break;
                    }
                    break;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, ((java.lang.String) r15[0]).intern()) != true) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Uri onWarmupCompleted(Uri uri) throws Throwable {
        Uri uri2;
        Uri.Builder builderBuildUpon;
        int i = 2 % 2;
        String scheme = uri.getScheme();
        Object obj = null;
        if (scheme == null) {
            return null;
        }
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 1232, (ViewConfiguration.getTouchSlop() >> 8) + 9, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(1280 - Gravity.getAbsoluteGravity(0, 0), Color.green(0) + 14, (char) ExpandableListView.getPackedPositionType(0L), objArr2);
        if (!ArraysKt.contains(new String[]{strIntern, ((String) objArr2[0]).intern()}, scheme)) {
            int i2 = ICustomTabsCallbackStub + 121;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (path == null) {
            int i3 = onPostMessage + 103;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            path = "";
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        Set<String> set = queryParameterNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj2 : set) {
            linkedHashMap.put(obj2, uri.getQueryParameter((String) obj2));
        }
        Object[] objArr3 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 75, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, (char) (30332 - Process.getGidForName("")), objArr3);
        if (!Intrinsics.areEqual(host, ((String) objArr3[0]).intern())) {
            int i5 = onPostMessage + 11;
            ICustomTabsCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr4 = new Object[1];
                a(12313 / (ViewConfiguration.getMinimumFlingVelocity() / 36), 88 << ExpandableListView.getPackedPositionType(1L), (char) (ViewConfiguration.getScrollBarSize() - 63), objArr4);
                if (!Intrinsics.areEqual(scheme, ((String) objArr4[0]).intern())) {
                    Object[] objArr5 = new Object[1];
                    a(85 - TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
                    if (Intrinsics.areEqual(host, ((String) objArr5[0]).intern())) {
                        Object[] objArr6 = new Object[1];
                        a(TextUtils.indexOf("", "", 0) + 25, Color.rgb(0, 0, 0) + 16777220, (char) Color.green(0), objArr6);
                        String queryParameter = uri.getQueryParameter(((String) objArr6[0]).intern());
                        Object[] objArr7 = new Object[1];
                        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 74, TextUtils.indexOf((CharSequence) "", '0') + 11, (char) (ExpandableListView.getPackedPositionChild(0L) + 30334), objArr7);
                    }
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getFadingEdgeLength() >> 16) + 1294, 'A' - AndroidCharacter.getMirror('0'), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
                    if (!Intrinsics.areEqual(host, ((String) objArr8[0]).intern())) {
                        return null;
                    }
                    StringsKt.isBlank(path);
                    return null;
                }
            } else {
                Object[] objArr9 = new Object[1];
                a(1280 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr9);
                if (!Intrinsics.areEqual(scheme, ((String) objArr9[0]).intern())) {
                }
            }
        }
        Set<String> queryParameterNames2 = uri.getQueryParameterNames();
        Object[] objArr10 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 3 - TextUtils.getCapsMode("", 0, 0), (char) View.resolveSizeAndState(0, 0, 0), objArr10);
        if (queryParameterNames2.contains(((String) objArr10[0]).intern())) {
            Object[] objArr11 = new Object[1];
            a(22 - TextUtils.getCapsMode("", 0, 0), (-16777213) - Color.rgb(0, 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr11);
            String queryParameter2 = uri.getQueryParameter(((String) objArr11[0]).intern());
            uri2 = queryParameter2 != null ? Uri.parse(queryParameter2) : null;
        } else {
            uri2 = Uri.parse(newChunkedSink.onExtraCallbackWithResult().ResultReceiver());
        }
        if (uri2 == null || (builderBuildUpon = uri2.buildUpon()) == null) {
            return null;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object[] objArr12 = new Object[1];
            a(25 - TextUtils.getTrimmedLength(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
            if (!Intrinsics.areEqual(str, ((String) objArr12[0]).intern())) {
                int i6 = ICustomTabsCallbackStub + 35;
                onPostMessage = i6 % 128;
                if (i6 % 2 != 0) {
                    Object[] objArr13 = new Object[1];
                    a(7 << (ViewConfiguration.getMaximumDrawingCacheSize() >> 2), 3 - ImageFormat.getBitsPerPixel(1), (char) (ViewConfiguration.getEdgeSlop() % 68), objArr13);
                    if (!Intrinsics.areEqual(str, ((String) objArr13[0]).intern())) {
                        builderBuildUpon.appendQueryParameter(str, str2);
                    }
                } else {
                    Object[] objArr14 = new Object[1];
                    a(22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr14);
                    if (!Intrinsics.areEqual(str, ((String) objArr14[0]).intern())) {
                        builderBuildUpon.appendQueryParameter(str, str2);
                    }
                }
            }
        }
        Object[] objArr15 = new Object[1];
        a(1311 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 8, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr15);
        String strIntern2 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(1320 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 4, (char) (ExpandableListView.getPackedPositionChild(0L) + 51625), objArr16);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(strIntern2, ((String) objArr16[0]).intern());
        if (builderAppendQueryParameter != null) {
            return builderAppendQueryParameter.build();
        }
        return null;
    }

    private final boolean IAuthTabCallback(Context context, Uri uri) throws Throwable {
        Pair pairIAuthTabCallback;
        Pair pairIAuthTabCallback2;
        Object obj;
        int i = 2 % 2;
        int i2 = onPostMessage + 125;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (uri == null) {
            return false;
        }
        String strOnExtraCallback = processTransparent.onExtraCallback(uri);
        int iHashCode = strOnExtraCallback.hashCode();
        if (iHashCode != 629515499) {
            if (iHashCode == 1373921727) {
                Object[] objArr = new Object[1];
                a((Process.myTid() >> 22) + 1205, 27 - (ViewConfiguration.getTapTimeout() >> 16), (char) (14049 - TextUtils.indexOf((CharSequence) "", '0')), objArr);
                if (strOnExtraCallback.equals(((String) objArr[0]).intern())) {
                    int i4 = ICustomTabsCallbackStub + 23;
                    onPostMessage = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr2 = new Object[1];
                        a(TextUtils.indexOf("", "", 0) + 5111, View.MeasureSpec.getMode(0) * 87, (char) ((-1) << TextUtils.lastIndexOf("", 'G', 0)), objArr2);
                        obj = objArr2[0];
                    } else {
                        Object[] objArr3 = new Object[1];
                        a(TextUtils.indexOf("", "", 0) + 1364, View.MeasureSpec.getMode(0) + 47, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr3);
                        obj = objArr3[0];
                    }
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) obj).intern(), (Object) null);
                    int i5 = onPostMessage + 39;
                    ICustomTabsCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    pairIAuthTabCallback2 = pairIAuthTabCallback;
                }
            } else if (iHashCode == 1654237082) {
                a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1128, 'S' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61426), new Object[1]);
                if (!(!strOnExtraCallback.equals(((String) r12[0]).intern()))) {
                    Object[] objArr4 = new Object[1];
                    a(1328 - Gravity.getAbsoluteGravity(0, 0), 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    a(250 - View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 8, (char) (63782 - TextUtils.getCapsMode("", 0, 0)), objArr5);
                    pairIAuthTabCallback2 = getWrite.IAuthTabCallback(strIntern, ((String) objArr5[0]).intern());
                }
            }
            Object[] objArr6 = new Object[1];
            a(1327 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr6);
            pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), (Object) null);
        } else {
            Object[] objArr7 = new Object[1];
            a(Drawable.resolveOpacity(0, 0) + 1163, 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) View.MeasureSpec.getMode(0), objArr7);
            if (strOnExtraCallback.equals(((String) objArr7[0]).intern())) {
                Object[] objArr8 = new Object[1];
                a(1328 - Color.red(0), 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr8);
                String strIntern2 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                a(1411 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.keyCodeFromString("") + 15, (char) (53935 - Color.blue(0)), objArr9);
                pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern2, ((String) objArr9[0]).intern());
                int i7 = onPostMessage + 5;
                ICustomTabsCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 3;
                }
                pairIAuthTabCallback2 = pairIAuthTabCallback;
            }
            Object[] objArr62 = new Object[1];
            a(1327 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr62);
            pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr62[0]).intern(), (Object) null);
        }
        String strIAuthTabCallback = (String) pairIAuthTabCallback2.onExtraCallbackWithResult();
        String str = (String) pairIAuthTabCallback2.IAuthTabCallback();
        for (Map.Entry entry : zzcr.onExtraCallbackWithResult(uri).entrySet()) {
            strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, (String) entry.getKey(), (String) entry.getValue());
        }
        if (str != null) {
            Object[] objArr10 = new Object[1];
            a(1426 - (Process.myTid() >> 22), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr10);
            strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, ((String) objArr10[0]).intern(), str);
        }
        return SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, strIAuthTabCallback, false, null, null, false, 60, null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        onRelationshipValidationResult = 0;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (char) (25194 - TextUtils.indexOf("", "")), objArr);
        asInterface = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(21 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - KeyEvent.getDeadChar(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        onTransact = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(25 - View.MeasureSpec.getMode(0), MotionEvent.axisFromString("") + 5, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr3);
        IAuthTabCallbackDefault = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 16, (char) (ExpandableListView.getPackedPositionGroup(0L) + 11163), objArr4);
        IAuthTabCallbackStub = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(45 - View.MeasureSpec.getSize(0), View.combineMeasuredStates(0, 0) + 30, (char) (36688 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr5);
        asBinder = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(75 - ((Process.getThreadPriority(0) + 20) >> 6), 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.getCapsMode("", 0, 0) + 30333), objArr6);
        onExtraCallbackWithResult = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(85 - TextUtils.indexOf("", ""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (char) View.resolveSizeAndState(0, 0, 0), objArr7);
        onNavigationEvent = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 89, 3 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (10893 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr8);
        onExtraCallback = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(Color.alpha(0) + 93, 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32524), objArr9);
        IAuthTabCallback = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(101 - (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 65, (char) Color.argb(0, 0, 0, 0), objArr10);
        onWarmupCompleted = ((String) objArr10[0]).intern();
        Companion = new IAuthTabCallback(null);
        Object[] objArr11 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 45, 30 - KeyEvent.keyCodeFromString(""), (char) (TextUtils.lastIndexOf("", '0', 0) + 36689), objArr11);
        String strIntern = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((Process.myTid() >> 22) + 167, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, (char) (41673 - ExpandableListView.getPackedPositionChild(0L)), objArr12);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(176 - (ViewConfiguration.getLongPressTimeout() >> 16), 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr13);
        String strIntern2 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(209 - View.resolveSizeAndState(0, 0, 0), 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr14);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(strIntern2, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        a(Color.alpha(0) + 216, Color.argb(0, 0, 0, 0) + 34, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr15);
        String strIntern3 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(250 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (char) (Color.green(0) + 63782), objArr16);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(strIntern3, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 259, 40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf("", "", 0) + 22763), objArr17);
        String strIntern4 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 298, 7 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (14202 - (Process.myPid() >> 22)), objArr18);
        IAuthTabCallback_Parcel = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(strIntern4, ((String) objArr18[0]).intern())});
        int i = ICustomTabsCallbackDefault + 101;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    private final String onExtraCallback(Uri uri) {
        return (String) IAuthTabCallback(1789909324, new Object[]{this, uri}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1789909322);
    }

    private final String onTransact(Uri uri) {
        return (String) IAuthTabCallback(-1040202274, new Object[]{this, uri}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1040202275);
    }

    private final List<Activity> onExtraCallbackWithResult(String str) {
        return (List) IAuthTabCallback(1176100674, new Object[]{this, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1176100674);
    }

    static void onExtraCallbackWithResult() {
        char[] cArr = new char[2107];
        ByteBuffer.wrap("\u008fÍY4\"0\u000b&Ô0½1\u0086+o485\u0001sêg³d\u009c9e(N/\u0017:à<É8\u0092${:D7-&í¡;Y@Fí¤;J@MiLÆ)\u0010ßkÃBÑ\u009dÖôúÏÐ&ÁqöHÛ£ÍúÓÕÍ,Õ\u0007É^Çb÷´\u000eÏ\næ\u001c9\nP\u000bk\u0011\u0082\u000eÕ\u000fìI\u0007]^^q\u0018\u0088\u0018£\u001bú\u0010\r[$\u0007\u007f\u000b\u0096\u001c©\u0006À\f\u001b\u00062\bE\u001e\u009cL·\nÎ\u000eá\r8\u0002\u009bÚM364\u001f!À'©;\u0092'{9,4\u0015-í¹;J@CiGÇ1\u0011ÉjÊCÁ\u0092¸DV?W\u0016\tÉW M\u009bLrTí¶;J@DiB¶\\ß@ä]\r^Z\u0016c\f\u0088\rÑIþO\u0007J,Cu\u001a\u0082W«SðU\u0019N&zOM\u0094W½YÊ[\u0013V8\u000fAEnB·BÜSå\u00132V[y`c\u0089mÖoÿj\u0004Z-tz|\u0083f¨?ñc\u001ea'iLm\u0095#¢[Ëz\u0010o9mFpo@´jÝdêl3vX/ab\u008eu×düe\u0005|R{{\u0005Oz\u0099\u0080â\u0093Ë\u008b\u0014\u0080}\u008aF\u0085¯\u0095ø\u0082í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþH\u0007H,Ku@\u0082\u000b«Wð[\u0019L&VO\\\u0094V½XÊN\u0013\u001c8PATn^·RÜPå\\2@í¶;N@DiL¶NßFäZí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþH\u0007H,Ku@\u0082\u000b«Wð[\u0019L&VO\\\u0094V½XÊN\u0013\u001c8AAYn_·GÜFå\\2Z[l\u0014\u0081Âe¹c\u0090\u007fO~&`\u001dfôlµLcµ\u0018±1§î±\u0087°¼ªUµ\u0002´;òÐæ\u0089å¦£_£t -«Úàó¼¨°A§~½\u0017·Ì½å³\u0092¥K÷`\u00ad\u0019µ6¯ï½\u0084±½ój¬\u0003\u00858\u0093Ñ\u0094\u008e\u008a§\u0087\\\u0080u\u0095ÚÝ\f4w\"^%\u0081;è6Ó1í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþN\u0007H,Hu@í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþM\u0007R,JuQ\u0082M«WðU\u0019^&QOQ\u0094\u0011½TÊQ\u0013C8]ACnDí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþM\u0007R,JuQ\u0082M«WðU\u0019^&QOQ\u0094\u0011½XÊD\u0013C8]ACnDòm$\u0094_\u0090v\u0086©\u0090À\u0091û\u008b\u0012\u0094E\u0095|Ó\u0097ÇÎÄá\u009b\u0018\u00983\u0085j\u009b\u009d\u008f´\u0081ï\u0080\u0001h×\u0091¬\u0095\u0085\u0083Z\u00953\u0094\b\u008eá\u0091¶\u0090\u008fÖdÂ=Á\u0012\u008cë\u0084À\u0086\u0099\u0099n\u008eG\u0084\u001c\u0094õ\u0091Ê\u0092í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþC\u0007K,IuV\u0082A«kð[\u0019^&]í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþO\u0007W,CuK\u0082p«IðS\u0019^&_OZ\u0094Ly¿¯FÔBýT\"BKCpY\u0099FÎG÷\u0001\u001c\u0015E\u0016jL\u0093V¸SáX\u0016P?JdL\u008dD²\u000fÛU\u0000C)U^K\u0087Y¬^Õ\u0006úK#NHZqH¦KÏ|ô`\u001dhB?ks\u0090s¹aîu\u0017r<ví§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007N,Ku@\u0082H«RðT\u0019\\&\u0017OM\u0094[½MÊS\u0013A8FA\u001enD·EÜWå[2G[j`i\u0089}Öaÿ`\u0004`-\"zh\u0083f¨vñ`\u001ei'kêµ<LGHn^±HØIãS\nL]Md\u000b\u008f\u001fÖ\u001cùF\u0000T+VrD\u0085\u0019¬Z÷M\u001e_!\u0007HO\u0093MºKÍI\u0014D?S\u0090ÙF =$\u00142Ë$¢%\u0099?p '!\u001egõs¬p\u0083-z<Q*\b-ÿ3Ö&\u008d!dj[322é!À$·'n`E?<:\u0013<Ê?¡-\u00982í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþS\u0007R,VuU\u0082K«IðNí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþD\u0007B,PuQ\u0082K«TðV\u0019\u0016&KOF\u0094P½^í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþC\u0007U,CuA\u0082M«OåS3ªH®a¸¾®×¯ìµ\u0005ªR«kí\u0080ùÙúö·\u000f¡$·}µ\u008a¹£»øá\u0011çí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþC\u0007U,CuA\u0082M«Oð\u0015\u0019\u0013&\u0017O\u0015í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþC\u0007U,CuA\u0082M«Oð\u0015\u0019\u0013&\u0017O\u0015\u0094\u0011½\u0017\u008f®YW\"S\u000bEÔS½R\u0086HoW8V\u0001\u0010ê\u0004³\u0007\u009cEeONA\u0017HàDÉ\\\u0092T{\u001fDR-DöRßP¨\\qNõ\u0090#iXmq{®mÇlüv\u0015iBh{.\u0090:É9æs\u001fq4bmz\u009aq³cèl\u0001|>kW'\u008cj¥xÒn\u000b` lYrß7\tÎrÊ[Ü\u0084ÊíËÖÑ?ÎhÏQ\u0089º\u009dã\u009eÌØ5Ö\u001eÆGÅ°Í\u0099ßÂË+Å\u0014Ãí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþS\u0007B,RuQ\u0082M«Uð]\u0019J&\u0017OO\u0094_½DÊQ\u0013V8\\AEn\u001f·TÜWåG2Pí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþS\u0007B,HuL\u0082K«Ið\u0017\u0019S&WO]\u0094Mí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþS\u0007B,RuQ\u0082M«Uð]\u0019JûÓ-*V.\u007f8 .É/ò5\u001b*L+um\u009eyÇzè9\u0011*:6c0\u0094$½.æa\u000f90>Y\"\u0082-«.Ü-\u00055í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007B,UuQ\u0082\u000b«KðO\u0019J&PÜt\n\u008dq\u0089X\u009f\u0087\u0089î\u0088Õ\u0092<\u008dk\u008cRÊ¹ÞàÝÏ\u00876\u0091\u001d\u0086D\u0082³Ø\u009a\u0098Á\u009c(\u0099\u0017\u0083~¹¥\u009f\u008c\u0082ÑÏ\u00076|2U$\u008a2ã3Ø)16f7_q´eífÂ<;*\u0010=I9¾c\u0097#Ì'%\"\u001a8sx¨%\u00810ö7/.\u0004(}0R,\u008b6à;Ù.\u0098sN\u008a5\u008e\u001c\u0098Ã\u008eª\u008f\u0091\u0095x\u008a/\u008b\u0016ÍýÙ¤Ú\u008b\u0080r\u0096Y\u0081\u0000\u0085÷ßÞ\u008c\u0085\u009cl\u008cS\u009f:\u0083k«½RÆVï@0VYWbM\u008bRÜSå\u0015\u000e\u0001W\u0002xX\u0081NªYó]\u0004\u0007-YvW\u009fA ]ÉE\u0012W;RLB\u0095^¾MÇUí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007B,UuQ\u0082\u000b«UðU\u0019J&HO^\u0094]½Xí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007B,UuQ\u0082\u000b«Wð[\u0019L&VO\\\u0094V½\u0012Ê\u0016\u0016\u0005Àü»ø\u0092îMø$ù\u001fãöü¡ý\u0098»s¯*¬\u0005êüê×é\u008eây©P÷\u000bùâíÝó´úoýFë1÷èþÃþº¼\u0095ÿLü'ú\u001eþÉ» Á\u009bÇrÆ-Ï\u0002UÔ¬¯¨\u0086¾Y¨0©\u000b³â¬µ\u00ad\u008cëgÿ>ü\u0011ºèºÃ¹\u009a²mùDº\u001f ö¤Éº ½{¥R¡%©üî×\u00ad®ª\u0081¬X¬3é\n¯Ý©´\u0094\u008f\u009dí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþH\u0007H,Ku@\u0082\u000b«XðS\u0019O&QOS\u0094\u0013½^ÊS\u0013^8BA]nQ·^ÜXåA2\u001b[f`c\u0089gÖaÿ\"\u0004f-bza\u0083fÛE\r¼v¸_®\u0080¸é¹Ò£;¼l½Uû¾ïçìÈª1ª\u001a©C¢´é\u009d°Æ¶/\u00ad\u0010¿y®¢¨\u008b²ü»%¿\u000e¤í§;^@ZiL¶Zß[äA\r^Z_p\u000bY\t\u008fíô÷Ýá\u0002ík«Pô¹áî÷×ü<âeëJì³ýeà³\u0004È\u0019á\u001a>\u0018W\u000el\u0017í¶;J@DiBí§;C@EiY¶XßFä@\rJZ\u0001cK\u0088MÑLþEí§;N@Ii\\¶ZßFäZ\rDZIcP\u0088VÑNþS\u0007Tíº;J@^i@¶^ßJä\u0003\r^ZIc@\u0088WÑSþI\u0007S,Ou@\u0082Wí¼;J@Yi\u0004¶JßNäM\rF$\bòñ\u0089÷ äÜï\n\u001dq\u0007X9\u0087\u0015í§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007H,RuD\u0082H«\u0016ðI\u0019\\&JOI\u0094W½^ÊY\u0013@8\u001dA\\nY·YÜ_å\u00182\\[d`g\u0089lí§;^@ZiL¶Zß[äA\r^Z_c\u0019\u0088\rÑ\u000eþT\u0007H,RuD\u0082H«\u0016ðI\u0019\\&JOI\u0094W½^ÊY\u0013@8\u001dA\\nY·YÜ_å\u00182\\[d`g\u0089lÖ'ÿf\u0004`-{zi\u0083p¨vñl\u001ee'iLr?\u000béñ\u0092ç»êdî\rã6Þßñ\u0088æ±þZû\u0003ç,ìÕíþúí·;J@^iL¶Oß@ä\\\rT%Ôü\u008e@\nÅÜ\u001a,ß\u000fY®Å\\/.é]\u0091\\m#wsÛ%\"àÜ\u008e\u0099Bg)K\f\u0000\u007fú*\u00ad=\u0086<¶W\u0086.jý30\u001d3ê\u0012\u008c°\u00904\u0015âb\u0012Ð]<8\u0093NÖîfi\u0010à 'ð\u008a_\u000fp\u0080¦~Ýmô\u0005+\u0011íéíò\u008f\u001aYã\"ç\u000bñÔç½æ\u0086üoã8â\u0001¤ê°³³\u009cîeÿNø\u0017íàëÉï\u0092ó{íDà-ñö¼\u0016'ÀÜ»\u009e\u0092ÇMÝ$Æ\u001fÇö\u0099¡ß\u0098Êsç*Ë\u0005ÛüÏ×Ù\u008eÑyÊPþ\u000bÁâÀÝÖ´ÌoÒFÎ1ÒèÐÃ÷ºÍ\u0095ÆLÌ'ËµÜc3\u0018917î>\u00871Jl\u009c\u008eç\u0092Î\u0089\u0011\u0081\u001e\u0093Èm³z\u009aióò%\u001a^\u000ew3¨\u0019Á\u0003ú\u001f\u0013\u0004D\fí§;N@IiF¶FßKäO\r_ZUc|\u0088VÑHþT\u0007K,Cí¼;J@Yiv¶Jß@äZ\rYZCcN\u0088}ÑCþA\u0007UÒ~\u0004\u008cxÍ®?Õ=í§;C@Ei^¶jß]äG\rIZKcF\u0016SÀ¼»¦\u0092¨Mª$¯\u001f\u009fö±¡¹\u0098£í½;E@^iF¶[ß\\;-íÕ\u0096Î¿Ö`Ë\tÌ2\u0093ÛÍ\u008cÎµÚ^Ä\u0007Ð(ÄÑÒí¹;D@Hi@¶DßJäG\rIZ\u0001cW\u0088MÑRþS6úà\u001a\u009b\u001a²\u001em\b\u0004\u001d?\u0006Öx\u0081\n¸#S'\n1%'Ü&÷<®#Y\"p\u0003+ Â(ý8\u0094&O.fhÀü\u001d2\"[#\u0088µe¬îÁê>`EA2Û»u2Aä«\u009fªí¦;N@LiL¶Zß]äK\r_\u0097CAº:¾\u0013¨Ì¾¥¿\u009e¥wº »\u0019ýòé«ê\u0084©}¢V«\u000f¯øÿÑ¯\u008a¿cº\\¹5æî©Ç¼°¬i£B¿;»\u0014³í§;N@Xi_¶AßLäK\rYZCcP\u0088QÑ\u001bþ\u000f\u0007\b,VuD\u0082]«\u0016ðN\u0019X&ZO\u0010\u0094N½\\ÊE\u0013\u001e8_ATnD·_ÜYåQí\u0080;n@yi}¶\bß\u007fä{\r\u007fZ|cl\u0088qÑdb£´OÏ]æU9NT\u001c\u0082åùáÐ÷\u000fáfà]ú´åãäÚ¢1¶hµGö¾ý\u0095ôÌðK\u0007\u009dþæúÏì\u0010úyûBá«þüÿÅ¹.\u00adw®Xô¡î\u008aëÓà$è\ròVô¿ü\u0080·éí2û\u001bílóµá\u009eæç¾Èô\u0011òzâCô\u0094ýýÇQ©\u0087PüBÕN\nRcGXD±PæLßE4E4æâ\u0018\u0099\b°\u001eo\u0017\u0006\u0015=,Ô\u0002\u0083\nº\u0010òï$\u0001_\u0016v\u0012©GÀ\u0014û\b\u0012\u0016E\u000f|\t\u001cåÊ\u0004±\u0011\båÞ\u000b¥\u001c\u008c\u0018SM:\u0007\u0001\u000eè\u001b¿\u001a\u0086\u0007m\u00004\u0001í ;R@ZiL\u001d\u001bËå°ä\u0099æí§;N@Xi_¶AßLäK\rYZCcP\u0088QÑ\u001bþ\u000f\u0007\b,EuP\u0082W«OðU\u0019T&]OM\u0094\u0013½NÊY\u0013A8DAXnS·RÜ\u001båV2Q[e`~\u0089lÖz\u007fV©¦Ò®û©$»M\u0086v¦\u009f¿È¹ñ\u00ad\u001a±C¹\u0084WR¬)³\u0000©ß½¶\u008d\u008d»d»3®\n¶á¡¸¹í¼;_@^iY¶[ß\u0015ä\u0001\r\u0002ZXcL\u0088QÑRþ\u000e\u0007N,Kí¼;_@^iY¶[ß\u0015ä\u0001\r\u0002ZXcF\u0088CÑLþ\u000e\u0007S,IuV\u0082W«\u0015ðS\u0019TÌ©\u001aJaKHL\u0097Nþ\u0000Å\u0014,\u0017{MBY©DðGß\u001b&[\r^T\u001f£B\u008aOÑI8I\u0007YnSí¼;_@^iY¶[ß\u0015ä\u0001\r\u0002ZXcL\u0088QÑRþ\u000e\u0007N,Ku\n\u0082B«ZðK\u0019(ÏË´Ê\u009dÍBÏ+\u0081\u0010\u0095ù\u0096®Ì\u0097Ø|Å%Æ\n\u009aóÚØß\u0081\u009evÓ_Ê\u0004ÜíÙ@~\u0096\u009dí\u009cÄ\u009b\u001b\u0099r×IÃ À÷\u009aÎ\u008e%\u0093|\u0090SÌª\u008c\u0081\u0089ØÈ/\u0085\u0006\u0098]\u008a´\u009e\u008b\u009fâ\u008fí\u008f²ÏdM\u001f\u00186\né\u001d\u0080\u001dtÉ¢>Ù\"ð%/)F\u0002}$\u00949-8ûÑ\u0080Ç©ÀvÞ\u001fÓ$ÔÍÆ\u009aÜ£ÏHÎ\u0011\u0084>\u0090Ç\u0097ìßµÕBÉkÉ0ÖÙ\u0089æ\u0093\u008f\u0096T\u0098}\u0097í°;B@XiL¶Kß[2íä\u0007\u009f\u0005¶;i\f\u0000\u0006;\u0010".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2107);
        onActivityLayout = cArr;
        onMessageChannelReady = -3074873189737940181L;
    }
}
