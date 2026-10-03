package viva.republica.toss.password;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.Dynamic;
import o.EncryptedContentInfoParser;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GraniteBrownfieldModule_closeView;
import o.M_;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.TypeUtils8;
import o.UTF8Decoder;
import o.access15300;
import o.accessMapSafely;
import o.addPolicy;
import o.asArray;
import o.enableFabricRenderer;
import o.getAdService;
import o.getBillingPeriod;
import o.getExtraParameters;
import o.getPricingPhaseList;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.matches;
import o.noStore;
import o.readIntokhttp;
import o.setAdUnitIds;
import o.setHeadersokhttp;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class PasswordFragment extends Hilt_PasswordFragment {
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackStub;
    public static final String IAuthTabCallbackStubProxy;
    public static final String IAuthTabCallback_Parcel;
    public static final String ICustomTabsCallback;
    public static final String access000;
    public static final String access100;
    public static final String asBinder;
    public static final String asInterface;
    public static final String extraCallback;
    public static final String extraCallbackWithResult;
    public static final String getInterfaceDescriptor;
    private static long newSession;
    public static final String onActivityLayout;
    public static final String onActivityResized;
    public static final String onMessageChannelReady;
    public static final String onMinimized;
    public static final String onPostMessage;
    private static char[] prefetch;
    private static int prefetchWithMultipleUrls;
    public static final String readTypedObject;
    public static final String writeTypedObject;
    private long IAuthTabCallback;
    private IAuthTabCallback IAuthTabCallbackDefault;
    private boolean ICustomTabsCallbackDefault;
    private onNavigationEvent ICustomTabsCallbackStubProxy;

    @Inject
    public setAdUnitIds loginStatus;
    private TextView mayLaunchUrl;
    private boolean onNavigationEvent;
    private CharSequence onRelationshipValidationResult;
    private onWarmupCompleted onTransact;
    private CharSequence onUnminimized;
    private boolean onWarmupCompleted;

    @Inject
    public getBillingPeriod tossRegionManager;
    private static final byte[] $$g = {111, -17, 11, -125};
    private static final int $$h = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int receiveFile = 1;
    private static int newSessionWithExtras = 0;
    private static int postMessage = 1;
    private final Lazy newAuthTabSession = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(PasswordVerifyViewModel.class), new IAuthTabCallbackStub(this), new getInterfaceDescriptor(null, this), new access000(this));
    private boolean isEngagementSignalsApiAvailable = true;
    private final Handler onExtraCallback = new Handler(Looper.getMainLooper());
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordFragment$$ExternalSyntheticLambda2
        public final Object invoke() {
            return Boolean.valueOf(PasswordFragment.onExtraCallbackWithResult(this.f$0));
        }
    });
    private UTF8Decoder ICustomTabsCallbackStub = UTF8Decoder.UNKNOWN;
    private String extraCommand = "";
    private CharSequence ICustomTabsService = "";
    private CharSequence ICustomTabsCallback_Parcel = "";

    public interface IAuthTabCallback {
        void IAuthTabCallback();
    }

    public interface onWarmupCompleted {
        void onWarmupCompleted(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, @Nullable String str, @Nullable String str2, boolean z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 97
            byte[] r0 = viva.republica.toss.password.PasswordFragment.$$g
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordFragment.$$i(short, int, int):java.lang.String");
    }

    static {
        prefetchWithMultipleUrls = 0;
        newSessionWithExtras();
        Object[] objArr = new Object[1];
        d((KeyEvent.getMaxKeyCode() >> 16) + 10, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (7968 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr);
        onMinimized = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(23 - KeyEvent.getDeadChar(0, 0), 10 - View.MeasureSpec.getMode(0), (char) (5425 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr2);
        onPostMessage = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        d(19 - View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 34, (char) (27682 - Process.getGidForName("")), objArr3);
        onMessageChannelReady = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        d(TextUtils.lastIndexOf("", '0', 0) + 6, 52 - Color.alpha(0), (char) (61038 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr4);
        onActivityResized = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        d((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, ImageFormat.getBitsPerPixel(0) + 58, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 54502), objArr5);
        onActivityLayout = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        d((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19, 68 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37818), objArr6);
        writeTypedObject = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        d(TextUtils.indexOf((CharSequence) "", '0', 0) + 24, (KeyEvent.getMaxKeyCode() >> 16) + 88, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr7);
        extraCallback = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        d(23 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 112, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58883), objArr8);
        ICustomTabsCallback = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        d(((byte) KeyEvent.getModifierMetaStateMask()) + 36, 135 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr9);
        readTypedObject = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        d(((Process.getThreadPriority(0) + 20) >> 6) + 15, View.MeasureSpec.getSize(0) + 169, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr10);
        extraCallbackWithResult = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        d((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, 184 - (ViewConfiguration.getTapTimeout() >> 16), (char) (24963 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr11);
        getInterfaceDescriptor = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        d(24 - Color.green(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 208, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60736), objArr12);
        access000 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        d(10 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 232, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr13);
        IAuthTabCallbackStubProxy = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        d(16 - TextUtils.indexOf((CharSequence) "", '0'), 241 - TextUtils.lastIndexOf("", '0', 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr14);
        access100 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        d(19 - View.getDefaultSize(0, 0), 259 - (Process.myPid() >> 22), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr15);
        IAuthTabCallback_Parcel = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        d(Process.getGidForName("") + 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 278, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr16);
        asInterface = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        d((ViewConfiguration.getJumpTapTimeout() >> 16) + 13, (ViewConfiguration.getLongPressTimeout() >> 16) + 293, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr17);
        asBinder = ((String) objArr17[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackStub = 8;
        int i = receiveFile + 65;
        prefetchWithMultipleUrls = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = postMessage + 125;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onNavigationEvent(-2025232262, iOnNavigationEvent, 2025232271, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0]);
        }
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int i3 = 53 / 0;
        return (Unit) onNavigationEvent(-2025232262, iOnNavigationEvent3, 2025232271, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0]);
    }

    public static /* synthetic */ void onExtraCallback(PasswordFragment passwordFragment) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(passwordFragment);
        int i4 = newSessionWithExtras + 79;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(PasswordFragment passwordFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 91;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(passwordFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(passwordFragment);
        int i3 = newSessionWithExtras + 5;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i)) | (~(i7 | i8));
        int i10 = ~i;
        int i11 = (~(i2 | i10 | i3)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i + i3 + i5 + ((-1228711472) * i4) + ((-141981132) * i6);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i3) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i5) + ((-287309824) * i4) + ((-1573388288) * i6) + ((-2138374144) * i14);
        int i16 = ((i * (-646461497)) - 273503129) + (i3 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i5 * (-646461009)) + (i4 * 1623110960) + (i6 * (-2035004020)) + (i14 * 33882112);
        switch (i15 + (i16 * i16 * (-1051394048))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
                int i17 = 2 % 2;
                int i18 = postMessage + 57;
                newSessionWithExtras = i18 % 128;
                int i19 = i18 % 2;
                passwordFragment.IAuthTabCallbackDefault().smoothScrollTo(0, passwordFragment.IAuthTabCallbackDefault().getBottom());
                return null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordFragment passwordFragment) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 81;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(passwordFragment);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
    }

    public abstract String IAuthTabCallback();

    public void IAuthTabCallback(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = postMessage + 19;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
    }

    public abstract ScrollView IAuthTabCallbackDefault();

    public abstract View asBinder();

    public abstract ViewGroup onExtraCallbackWithResult();

    public void onExtraCallbackWithResult(@Nullable onNavigationEvent onnavigationevent, @Nullable UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void onNavigationEvent(@Nullable onNavigationEvent onnavigationevent, @Nullable UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
    }

    public abstract TextView onTransact();

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public asBinder(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements View.OnLayoutChangeListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int onTransact = 1;
        final /* synthetic */ PasswordFragment onExtraCallback;
        final /* synthetic */ ScrollView onExtraCallbackWithResult;
        final /* synthetic */ ViewGroup onWarmupCompleted;
        private static char[] IAuthTabCallback = {64980, 64997, 65064, 64960, 65023, 64976, 64986, 64966, 65057, 64915, 64983, 64925, 65065, 64964, 64967, 64991, 64977, 64989, 65066, 64961, 64926, 65070, 64990, 65071, 64970, 65069, 65067, 64988, 64965, 65012, 65022, 64982, 64963, 65068, 64995, 64978};
        private static char onNavigationEvent = 51247;

        public IAuthTabCallbackDefault(ScrollView scrollView, ViewGroup viewGroup, PasswordFragment passwordFragment) {
            this.onExtraCallbackWithResult = scrollView;
            this.onWarmupCompleted = viewGroup;
            this.onExtraCallback = passwordFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            WindowManager windowManager;
            int iHeight;
            int i9 = 2 % 2;
            int i10 = asInterface + 63;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (this.onExtraCallbackWithResult.getMeasuredHeight() < this.onWarmupCompleted.getMeasuredHeight()) {
                ScrollView scrollView = this.onExtraCallbackWithResult;
                DisplayMetrics displayMetrics = scrollView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                scrollView.setScrollBarSize(varyMatches.onNavigationEvent(4, displayMetrics));
                int i12 = onTransact + 79;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
            }
            FragmentActivity activity = this.onExtraCallback.getActivity();
            if (activity == null || (windowManager = activity.getWindowManager()) == null) {
                return;
            }
            int i14 = onTransact + 21;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            if (Build.VERSION.SDK_INT >= 30) {
                iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
            } else {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
                iHeight = displayMetrics2.heightPixels;
            }
            if (M_.onExtraCallback.IAuthTabCallbackDefault() < iHeight / 2) {
                ViewGroup viewGroupOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
                ViewGroup.LayoutParams layoutParams = viewGroupOnExtraCallbackWithResult.getLayoutParams();
                if (layoutParams == null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{'\r', 11, 13884, 13884, 11, 3, 5, 23, 15, 29, 15, '\b', '\r', '\"', 11, 3, '!', 5, 15, '\b', 15, 26, 11, 15, 29, 15, 23, 14, '\t', '\r', 21, 15, '\f', 26, '!', ' ', 11, '!', 16, 11, 21, 25, 7, 11, '\n', 29, 7, 30, 17, 7, 0, 7, 1, 19, 25, 23, 25, '\t', '#', '\b', 31, 30, 18, 1, 11, '\f', 5, '\"', 25, 28, '\b', '\r', '#', 30, 23, 31, 21, 4}, (byte) (70 - View.resolveSize(0, 0)), 78 - Color.green(0), objArr);
                    throw new NullPointerException(((String) objArr[0]).intern());
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                DisplayMetrics displayMetrics3 = this.onExtraCallback.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                marginLayoutParams.topMargin = varyMatches.onNavigationEvent(10, displayMetrics3);
                viewGroupOnExtraCallbackWithResult.setLayoutParams(marginLayoutParams);
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            float f = 0.0f;
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
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 26 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        f = 0.0f;
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
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23138 - TextUtils.lastIndexOf("", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $10 + 103;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 24825), 74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $11 + 9;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), 19488 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
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
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    public final boolean ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 75;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isEngagementSignalsApiAvailable;
        int i5 = i2 + 73;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return z;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = postMessage + 5;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        this.isEngagementSignalsApiAvailable = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 35;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public TextView IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 43;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.mayLaunchUrl;
        int i5 = i2 + 111;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    public void onWarmupCompleted(@Nullable TextView textView) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 95;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.mayLaunchUrl = textView;
        int i5 = i2 + 87;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 3;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((Boolean) this.onExtraCallbackWithResult.getValue()).booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.getValue()).booleanValue();
        int i3 = postMessage + 43;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(PasswordFragment passwordFragment) throws Throwable {
        ContentResolver contentResolver;
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 85;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Context context = passwordFragment.getContext();
        Object obj = null;
        if (context != null) {
            int i4 = newSessionWithExtras + 33;
            postMessage = i4 % 128;
            if (i4 % 2 == 0) {
                context.getContentResolver();
                obj.hashCode();
                throw null;
            }
            contentResolver = context.getContentResolver();
        } else {
            contentResolver = null;
        }
        Object[] objArr = new Object[1];
        d(22 - ExpandableListView.getPackedPositionChild(0L), 386 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 48717), objArr);
        if (Settings.Global.getFloat(contentResolver, ((String) objArr[0]).intern(), 1.0f) > 0.0f) {
            return true;
        }
        int i5 = newSessionWithExtras + 125;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 67;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public final boolean onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 55;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 51;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = passwordFragment.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 61;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 101;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStubProxy = onnavigationevent;
        if (i4 == 0) {
            int i5 = 54 / 0;
        }
        int i6 = i2 + 3;
        postMessage = i6 % 128;
        int i7 = i6 % 2;
    }

    public final onWarmupCompleted extraCallback() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 5;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = this.onTransact;
        int i5 = i3 + 83;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return onwarmupcompleted;
    }

    public final void onExtraCallbackWithResult(@Nullable onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 11;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.onTransact = onwarmupcompleted;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 63;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
    }

    public final IAuthTabCallback extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 95;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        int i5 = i2 + 85;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void IAuthTabCallback(@NotNull UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = postMessage + 85;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            this.ICustomTabsCallbackStub = uTF8Decoder;
        } else {
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            this.ICustomTabsCallbackStub = uTF8Decoder;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    protected final UTF8Decoder onActivityLayout() {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        UTF8Decoder uTF8Decoder = this.ICustomTabsCallbackStub;
        int i5 = i3 + 69;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return uTF8Decoder;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 41;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        String str = passwordFragment.extraCommand;
        int i5 = i2 + 77;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 119;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = passwordFragment.onUnminimized;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return charSequence;
    }

    protected final void onExtraCallback(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 51;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.onUnminimized = charSequence;
        int i5 = i3 + 27;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final CharSequence onPostMessage() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 37;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.onRelationshipValidationResult;
        int i5 = i2 + 95;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    protected final void onWarmupCompleted(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 61;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        this.onRelationshipValidationResult = charSequence;
        int i5 = i3 + 109;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = postMessage;
        int i3 = i2 + 43;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ICustomTabsCallbackDefault;
        int i5 = i2 + 27;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 63;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 69;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return z;
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(prefetch[i2 - i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (Process.myTid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, 10972 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(newSession), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Drawable.resolveOpacity(0, 0)), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49122), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 1494 - ExpandableListView.getPackedPositionType(0L), -1657859959, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
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
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(prefetch[i2 + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - Process.getGidForName("")), 17 - (ViewConfiguration.getTouchSlop() >> 8), 10973 - (ViewConfiguration.getTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(newSession), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46133), (ViewConfiguration.getLongPressTimeout() >> 16) + 31, 20220 - (Process.myPid() >> 22), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 49123), Drawable.resolveOpacity(0, 0) + 44, 1493 - ((byte) KeyEvent.getModifierMetaStateMask()), -1657859959, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1657859959, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    protected final long readTypedObject() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 15;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 39 / 0;
        return this.IAuthTabCallback;
    }

    public final setAdUnitIds ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setAdUnitIds setadunitids = this.loginStatus;
        if (setadunitids != null) {
            return setadunitids;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = newSessionWithExtras + 5;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final getBillingPeriod ICustomTabsCallbackStub() {
        int i = 2 % 2;
        getBillingPeriod getbillingperiod = this.tossRegionManager;
        Object obj = null;
        if (getbillingperiod != null) {
            int i2 = newSessionWithExtras + 31;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return getbillingperiod;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = postMessage + 7;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void asInterface() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r1 = r5.ICustomTabsCallbackStubProxy
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r2 = viva.republica.toss.password.PasswordFragment.onNavigationEvent.INPUT
            r3 = 0
            if (r1 == r2) goto L22
            int r2 = viva.republica.toss.password.PasswordFragment.postMessage
            int r2 = r2 + 3
            int r4 = r2 % 128
            viva.republica.toss.password.PasswordFragment.newSessionWithExtras = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L1d
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r2 = viva.republica.toss.password.PasswordFragment.onNavigationEvent.CONFIRM
            r4 = 8
            int r4 = r4 / r3
            if (r1 == r2) goto L22
            goto L21
        L1d:
            viva.republica.toss.password.PasswordFragment$onNavigationEvent r2 = viva.republica.toss.password.PasswordFragment.onNavigationEvent.CONFIRM
            if (r1 == r2) goto L22
        L21:
            r3 = 1
        L22:
            r5.isEngagementSignalsApiAvailable = r3
            int r1 = viva.republica.toss.password.PasswordFragment.postMessage
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordFragment.newSessionWithExtras = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordFragment.asInterface():void");
    }

    private static final void IAuthTabCallback(PasswordFragment passwordFragment) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 75;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        passwordFragment.asInterface();
        int i4 = postMessage + 93;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void extraCommand() {
        int i = 2 % 2;
        this.onExtraCallback.postDelayed(new Runnable() { // from class: viva.republica.toss.password.PasswordFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                PasswordFragment.onExtraCallback(this.f$0);
            }
        }, 500L);
        int i2 = postMessage + 7;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v5 android.widget.TextView) = (r1v4 android.widget.TextView), (r1v8 android.widget.TextView) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordFragment.newSessionWithExtras
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordFragment.postMessage = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            android.widget.TextView r1 = r10.IAuthTabCallbackStub()
            r4 = 31
            int r4 = r4 / r2
            if (r1 == 0) goto L39
            goto L2d
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            android.widget.TextView r1 = r10.IAuthTabCallbackStub()
            if (r1 == 0) goto L39
        L2d:
            r1.setText(r11)
            int r11 = viva.republica.toss.password.PasswordFragment.newSessionWithExtras
            int r11 = r11 + 111
            int r1 = r11 % 128
            viva.republica.toss.password.PasswordFragment.postMessage = r1
            int r11 = r11 % r0
        L39:
            android.content.Context r11 = r10.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            o.getUrlokhttp r1 = new o.getUrlokhttp
            viva.republica.toss.password.PasswordFragment$asBinder r3 = new viva.republica.toss.password.PasswordFragment$asBinder
            r3.<init>(r11)
            r1.<init>(r3)
            android.widget.TextView r11 = r10.IAuthTabCallbackStub()
            if (r11 == 0) goto L8b
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            int r8 = o.setVisitUrl.onExtraCallbackWithResult()
            int r7 = o.setVisitUrl.onExtraCallbackWithResult()
            int r9 = o.setVisitUrl.onExtraCallbackWithResult()
            int r6 = o.setVisitUrl.onExtraCallbackWithResult()
            r4 = -1763178192(0xffffffff96e80930, float:-3.748742E-25)
            r5 = 1763178195(0x6917f6d3, float:1.1482087E25)
            java.lang.Object r3 = o.getUrlokhttp.onNavigationEvent(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r11.setTextColor(r3)
            int r11 = viva.republica.toss.password.PasswordFragment.newSessionWithExtras
            int r11 = r11 + 43
            int r3 = r11 % 128
            viva.republica.toss.password.PasswordFragment.postMessage = r3
            int r11 = r11 % r0
        L8b:
            android.widget.TextView r11 = r10.onTransact()
            o.setHeadersokhttp r0 = r1.requestPostMessageChannel()
            int r0 = r0.onMessageChannelReady()
            r11.setTextColor(r0)
            android.widget.TextView r11 = r10.onTransact()
            r11.setText(r12)
            android.widget.TextView r11 = r10.onTransact()
            r11.getVisibility()
            android.widget.TextView r11 = r10.onTransact()
            android.widget.TextView r12 = r10.onTransact()
            int r12 = r12.length()
            if (r12 != 0) goto Lb8
            r2 = 8
        Lb8:
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordFragment.onExtraCallback(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r1 = r1 + 37;
        viva.republica.toss.password.PasswordFragment.postMessage = r1 % 128;
        r1 = r1 % 2;
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.onNavigationEvent(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r8 = new java.lang.Object[1];
        d((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 90, 697 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52899), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        throw new java.lang.UnsupportedOperationException(((java.lang.String) r8[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r7 & 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void onExtraCallback(viva.republica.toss.password.PasswordFragment r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordFragment.newSessionWithExtras
            int r2 = r1 + 17
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordFragment.postMessage = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 96
            int r2 = r2 / r3
            if (r8 != 0) goto L27
            goto L17
        L15:
            if (r8 != 0) goto L27
        L17:
            r7 = r7 & r0
            if (r7 == 0) goto L23
            int r1 = r1 + 37
            int r6 = r1 % 128
            viva.republica.toss.password.PasswordFragment.postMessage = r6
            int r1 = r1 % r0
            java.lang.String r6 = ""
        L23:
            r4.onNavigationEvent(r5, r6)
            return
        L27:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r5 = r5 + 90
            int r6 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r6 = r6 >> 16
            int r6 = 697 - r6
            r7 = 0
            float r8 = android.graphics.PointF.length(r7, r7)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            r8 = 52899(0xcea3, float:7.4127E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            d(r5, r6, r7, r8)
            r5 = r8[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordFragment.onExtraCallback(viva.republica.toss.password.PasswordFragment, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.Object):void");
    }

    private static final void IAuthTabCallbackStub(PasswordFragment passwordFragment) {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        passwordFragment.asInterface();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = postMessage + 17;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.isEngagementSignalsApiAvailable = true;
        try {
            Object[] objArr = {getActivity(), onExtraCallbackWithResult()};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 46481), 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 22731 - (Process.myTid() >> 22), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.onWarmupCompleted());
            TextView textViewIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub != null) {
                textViewIAuthTabCallbackStub.announceForAccessibility(charSequence);
            }
            TextView textViewIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub2 != null) {
                int i2 = postMessage + 87;
                newSessionWithExtras = i2 % 128;
                if (i2 % 2 != 0) {
                    textViewIAuthTabCallbackStub2.setText(charSequence);
                    throw null;
                }
                textViewIAuthTabCallbackStub2.setText(charSequence);
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Configuration configuration = contextRequireContext.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getUrlokhttp geturlokhttp = new getUrlokhttp(new asInterface(configuration));
            if ((charSequence instanceof SpannableStringBuilder) || charSequence2.length() != 0) {
                TextView textViewIAuthTabCallbackStub3 = IAuthTabCallbackStub();
                if (textViewIAuthTabCallbackStub3 != null) {
                    textViewIAuthTabCallbackStub3.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{geturlokhttp}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                }
            } else {
                int i3 = newSessionWithExtras + 65;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
                TextView textViewIAuthTabCallbackStub4 = IAuthTabCallbackStub();
                if (textViewIAuthTabCallbackStub4 != null) {
                    int i5 = postMessage + 17;
                    newSessionWithExtras = i5 % 128;
                    if (i5 % 2 != 0) {
                        textViewIAuthTabCallbackStub4.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1604678659, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 1604678665, matches.onExtraCallback())).intValue());
                        int i6 = 53 / 0;
                    } else {
                        textViewIAuthTabCallbackStub4.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1604678659, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 1604678665, matches.onExtraCallback())).intValue());
                    }
                }
            }
            onTransact().setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1604678659, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 1604678665, matches.onExtraCallback())).intValue());
            onTransact().setText(charSequence2);
            onTransact().setVisibility(onTransact().length() == 0 ? 8 : 0);
            this.onExtraCallback.postDelayed(new Runnable() { // from class: viva.republica.toss.password.PasswordFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PasswordFragment.onWarmupCompleted(this.f$0);
                }
            }, 500L);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordFragment passwordFragment, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = postMessage;
        int i4 = i3 + 11;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            Object[] objArr = new Object[1];
            d((ViewConfiguration.getTouchSlop() >> 8) + 95, 601 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr);
            throw new UnsupportedOperationException(((String) objArr[0]).intern());
        }
        int i6 = i3 + 35;
        int i7 = i6 % 128;
        newSessionWithExtras = i7;
        int i8 = i6 % 2;
        if ((i & 2) != 0) {
            int i9 = i7 + 57;
            postMessage = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 59 / 0;
            }
            int i11 = i7 + 33;
            postMessage = i11 % 128;
            int i12 = i11 % 2;
            charSequence2 = "";
        }
        passwordFragment.onWarmupCompleted(charSequence, charSequence2);
    }

    public final void onWarmupCompleted(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int i = 2 % 2;
        int i2 = postMessage + 7;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.onUnminimized = charSequence;
            this.onRelationshipValidationResult = charSequence2;
            return;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.onUnminimized = charSequence;
        this.onRelationshipValidationResult = charSequence2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (objArr[3] != null) {
            Object[] objArr2 = new Object[1];
            d(90 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 512, (char) View.MeasureSpec.getSize(0), objArr2);
            throw new UnsupportedOperationException(((String) objArr2[0]).intern());
        }
        int i2 = postMessage + 111;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            function0 = new Function0() { // from class: viva.republica.toss.password.PasswordFragment$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return PasswordFragment.getInterfaceDescriptor();
                }
            };
            int i4 = newSessionWithExtras + 13;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        passwordFragment.onNavigationEvent(function0);
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = postMessage + 97;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class getInterfaceDescriptor extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getInterfaceDescriptor(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class access000 extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public void onNavigationEvent(@NotNull Function0<Unit> function0) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        d(TextUtils.getCapsMode("", 0, 0) + 22, 869 - ImageFormat.getBitsPerPixel(0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), new Object[1]);
        if (!smallIconBitmap.onNavigationEvent(((String) r7[0]).intern())) {
            int i4 = newSessionWithExtras + 31;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            if (asBinder().getVisibility() == 0) {
                int i6 = newSessionWithExtras + 19;
                postMessage = i6 % 128;
                int i7 = i6 % 2;
                TextRoundCornerProgressBarSavedState1 smallIconBitmap2 = addPolicy.getSmallIconBitmap();
                Object[] objArr = new Object[1];
                d((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, 869 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.myTid() >> 22), objArr);
                smallIconBitmap2.onNavigationEvent(((String) objArr[0]).intern(), true);
            }
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 30, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 30, (ViewConfiguration.getScrollBarSize() >> 8) + 24887, 1041067539, false, "onExtraCallbackWithResult", new Class[0]);
            }
            ((Method) objOnExtraCallback2).invoke(obj, null);
            int i8 = newSessionWithExtras + 117;
            postMessage = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void ICustomTabsService() throws Throwable {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 5;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 29 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24886, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16752329) - Color.rgb(0, 0, 0), 1041067539, false, "onExtraCallbackWithResult", new Class[0]);
            }
            ((Method) objOnExtraCallback2).invoke(obj, null);
            int i4 = newSessionWithExtras + 73;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public interface onExtraCallback {
        default Long IAuthTabCallback() {
            return null;
        }

        default String IEngagementSignalsCallbackDefault() {
            return null;
        }

        default boolean IEngagementSignalsCallbackStub() {
            return false;
        }

        default boolean IEngagementSignalsCallbackStubProxy() {
            return false;
        }

        default String updateVisuals() {
            return null;
        }

        default String setEngagementSignalsCallback() {
            return "";
        }

        default Map<String, Object> ICustomTabsServiceStub() {
            return new LinkedHashMap();
        }
    }

    public final CharSequence onExtraCallbackWithResult(@NotNull UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 123;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        if (this.ICustomTabsService.length() > 0) {
            int i4 = newSessionWithExtras + 61;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            return this.ICustomTabsService;
        }
        String string = getString(Companion.onExtraCallbackWithResult(uTF8Decoder));
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = postMessage + 85;
        newSessionWithExtras = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent AUTH;
        public static final onNavigationEvent CONFIRM;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent INPUT;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent onnavigationevent = AUTH;
                onNavigationEvent onnavigationevent2 = INPUT;
                onNavigationEvent onnavigationevent3 = CONFIRM;
                onnavigationeventArr = new onNavigationEvent[5];
                onnavigationeventArr[1] = onnavigationevent;
                onnavigationeventArr[1] = onnavigationevent2;
                onnavigationeventArr[2] = onnavigationevent3;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{AUTH, INPUT, CONFIRM};
            }
            int i4 = i2 + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            EnumEntries<onNavigationEvent> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 38 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35283), 35 - KeyEvent.keyCodeFromString(""), Color.alpha(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                char[] cArr4 = i8 % 2 != 0 ? new char[i4] : new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = $10 + 63;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), 65 - Drawable.resolveOpacity(0, 0), 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 69, 12486 - (ViewConfiguration.getScrollBarSize() >> 8), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i13, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i13);
                int i14 = $10 + 43;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i16 = $10 + 119;
                $11 = i16 % 128;
                int i17 = 2;
                if (i16 % 2 == 0) {
                    int i18 = 2 % 5;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i19 = $10 + 27;
                    $11 = i19 % 128;
                    int i20 = i19 % i17;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    i17 = 2;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i21 = $11 + 65;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i23 = $10 + 107;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[4]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 0, 0}, false, new byte[]{1, 0, 1, 0}, objArr);
            AUTH = new onNavigationEvent(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(new int[]{4, 5, 34, 1}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
            INPUT = new onNavigationEvent(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            a(new int[]{9, 7, 0, 1}, false, new byte[]{1, 0, 0, 1, 0, 1, 1}, objArr3);
            CONFIRM = new onNavigationEvent(((String) objArr3[0]).intern(), 2);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 67;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean isChangingPassword() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == INPUT) {
                return true;
            }
            int i5 = i3 + 73;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (this == CONFIRM) {
                return true;
            }
            int i7 = i6 + 59;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        static void onNavigationEvent() {
            onWarmupCompleted = new char[]{27246, 27141, 27162, 27136, 27253, 27198, 27171, 27199, 27194, 27240, 27142, 27143, 27136, 27140, 27145, 27139};
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[1];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 59;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        if (passwordFragment.ICustomTabsCallback_Parcel.length() > 0) {
            int i4 = newSessionWithExtras + 3;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            return passwordFragment.ICustomTabsCallback_Parcel;
        }
        if (uTF8Decoder != UTF8Decoder.SIGN_IN) {
            int i6 = postMessage + 57;
            newSessionWithExtras = i6 % 128;
            int i7 = i6 % 2;
            if (uTF8Decoder != UTF8Decoder.SIGN_IN_GLOBAL && uTF8Decoder != UTF8Decoder.SIGN_IN_RESET_GLOBAL && uTF8Decoder != UTF8Decoder.SIGN_UP && uTF8Decoder != UTF8Decoder.SIGN_UP_WITH_CERT && uTF8Decoder != UTF8Decoder.SIGN_UP_GLOBAL) {
                int i8 = newSessionWithExtras + 13;
                postMessage = i8 % 128;
                if (i8 % 2 == 0) {
                    UTF8Decoder uTF8Decoder2 = UTF8Decoder.SETTING;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (uTF8Decoder != UTF8Decoder.SETTING && uTF8Decoder != UTF8Decoder.SETTING_CERT && uTF8Decoder != UTF8Decoder.SETTING_RECHECK && uTF8Decoder != UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID && uTF8Decoder != UTF8Decoder.SIGN_IN_OVERSEAS_PASSWORD_CHECK) {
                    int i9 = newSessionWithExtras + 61;
                    postMessage = i9 % 128;
                    int i10 = i9 % 2;
                    String string = passwordFragment.getString(Companion.IAuthTabCallback(uTF8Decoder));
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
            }
        }
        return passwordFragment.IAuthTabCallback();
    }

    public final boolean ICustomTabsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 24886 - ExpandableListView.getPackedPositionChild(0L), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {5};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(217202414);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 31, TextUtils.lastIndexOf("", '0', 0, 0) + 24888, 1035124862, false, "IAuthTabCallback", new Class[]{Integer.TYPE});
            }
            if (!(!((Boolean) ((Method) objOnExtraCallback2).invoke(obj2, objArr)).booleanValue())) {
                int i2 = postMessage + 99;
                newSessionWithExtras = i2 % 128;
                int i3 = i2 % 2;
                if (!TypeUtils8.onExtraCallbackWithResult(this.ICustomTabsCallbackStub)) {
                    int i4 = postMessage + 23;
                    newSessionWithExtras = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
            int i6 = postMessage + 63;
            newSessionWithExtras = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void prefetch() {
        int i = 2 % 2;
        int i2 = postMessage + 25;
        newSessionWithExtras = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TextView textViewIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Configuration configuration = contextRequireContext.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1604678659, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onTransact(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 1604678665, matches.onExtraCallback())).intValue());
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) requireContext().getString(R.string.last_chance_to_verify_password_with_max_count, 5));
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                textViewIAuthTabCallbackStub.setText(new SpannedString(spannableStringBuilder));
            }
            onTransact().setVisibility(8);
            TextView textViewIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub2 != null) {
                int i3 = newSessionWithExtras + 49;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
                Rally rallyOnExtraCallback = RallysKt.onExtraCallback(textViewIAuthTabCallbackStub2, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.onWarmupCompleted(), 300), Float.valueOf(0.2f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 3, getExtraParameters.Normal, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 952, (Object) null);
                if (rallyOnExtraCallback != null) {
                    isFireOS.onExtraCallbackWithResult(rallyOnExtraCallback, false, 1, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        IAuthTabCallbackStub();
        obj.hashCode();
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = postMessage + 91;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.removeCallbacksAndMessages(null);
            super.onDestroyView();
        } else {
            this.onExtraCallback.removeCallbacksAndMessages(null);
            super.onDestroyView();
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 31;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            passwordFragment.getArguments();
            throw null;
        }
        Bundle arguments = passwordFragment.getArguments();
        if (arguments != null) {
            Object[] objArr2 = new Object[1];
            d(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, (char) (5424 - ExpandableListView.getPackedPositionChild(0L)), objArr2);
            return Boolean.valueOf(arguments.getBoolean(((String) objArr2[0]).intern(), false));
        }
        int i3 = postMessage + 69;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        int i = 2 % 2;
        if (!CollectionsKt.listOf(new UTF8Decoder[]{UTF8Decoder.MOBILE_ID_NO_FINGER_PRINT, UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID}).contains(passwordFragment.ICustomTabsCallbackStub)) {
            if (passwordFragment.access000()) {
                int i2 = postMessage + 67;
                newSessionWithExtras = i2 % 128;
                return i2 % 2 == 0;
            }
            TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
            Object[] objArr2 = new Object[1];
            d((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, AndroidCharacter.getMirror('0') + 822, (char) (Process.myTid() >> 22), objArr2);
            return Boolean.valueOf(smallIconBitmap.onNavigationEvent(((String) objArr2[0]).intern()));
        }
        int i3 = newSessionWithExtras + 47;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(Dynamic.onExtraCallbackWithResult.onWarmupCompleted());
    }

    public static /* synthetic */ boolean onWarmupCompleted(PasswordFragment passwordFragment, UTF8Decoder uTF8Decoder, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if (obj != null) {
            Object[] objArr = new Object[1];
            d(104 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 409 - Color.alpha(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            throw new UnsupportedOperationException(((String) objArr[0]).intern());
        }
        if ((i & 1) != 0) {
            int i3 = newSessionWithExtras + 9;
            postMessage = i3 % 128;
            if (i3 % 2 == 0) {
                UTF8Decoder uTF8Decoder2 = passwordFragment.ICustomTabsCallbackStub;
                throw null;
            }
            uTF8Decoder = passwordFragment.ICustomTabsCallbackStub;
        }
        boolean zOnWarmupCompleted = passwordFragment.onWarmupCompleted(uTF8Decoder);
        int i4 = newSessionWithExtras + 83;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    protected final boolean onWarmupCompleted(@NotNull UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        if (!((Boolean) onNavigationEvent(-1249015494, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1249015496, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})).booleanValue()) {
            int i2 = postMessage + 19;
            newSessionWithExtras = i2 % 128;
            if (i2 % 2 != 0) {
                enableFabricRenderer enablefabricrenderer = enableFabricRenderer.onExtraCallback;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                enablefabricrenderer.onExtraCallbackWithResult(contextRequireContext).onExtraCallback();
                throw null;
            }
            enableFabricRenderer enablefabricrenderer2 = enableFabricRenderer.onExtraCallback;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            if (enablefabricrenderer2.onExtraCallbackWithResult(contextRequireContext2).onExtraCallback()) {
                accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                if ((!accessmapsafely.IAuthTabCallback(contextRequireContext3) || CollectionsKt.listOf(new UTF8Decoder[]{UTF8Decoder.MOBILE_ID_NO_FINGER_PRINT, UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID}).contains(uTF8Decoder)) && TypeUtils8.onWarmupCompleted(uTF8Decoder) && (!onExtraCallback(uTF8Decoder))) {
                    int i3 = postMessage + 31;
                    newSessionWithExtras = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
        }
        int i5 = newSessionWithExtras + 21;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return false;
    }

    private final boolean access000() {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        if (ICustomTabsCallbackStub().onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            int i4 = newSessionWithExtras + 53;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = newSessionWithExtras + 121;
        postMessage = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public String getBiometricTitle() {
        int i = 2 % 2;
        int i2 = postMessage + 7;
        newSessionWithExtras = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access000();
            throw null;
        }
        if (!access000()) {
            return "";
        }
        int i3 = newSessionWithExtras + 89;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getString(im.toss.base.R.string.base_biometric_auth_title_eu);
            Intrinsics.checkNotNull(string);
            return string;
        }
        Intrinsics.checkNotNull(getString(im.toss.base.R.string.base_biometric_auth_title_eu));
        obj.hashCode();
        throw null;
    }

    protected final String access100() {
        int i;
        int i2 = 2 % 2;
        if (access000()) {
            int i3 = newSessionWithExtras + 77;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            i = R.string.password_use_biometric_eu;
        } else {
            i = R.string.password_use_biometric;
        }
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i5 = postMessage + 85;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return string;
    }

    protected final String IAuthTabCallbackStubProxy() {
        int i;
        int i2 = 2 % 2;
        if (!(!access000())) {
            int i3 = postMessage + 51;
            newSessionWithExtras = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = R.string.password_use_biometric_dialog_title_eu;
                int i5 = newSessionWithExtras + 1;
                postMessage = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 2;
                }
                i = i4;
            } else {
                int i7 = R.string.password_use_biometric_dialog_title_eu;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            i = R.string.password_use_biometric_dialog_title;
        }
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final boolean onExtraCallback(UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = postMessage + 3;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            if (!access000()) {
                return false;
            }
            if (ICustomTabsCallback().IAuthTabCallback() && uTF8Decoder != UTF8Decoder.CHECK_RESET_PASSWORD) {
                return false;
            }
            int i3 = newSessionWithExtras + 23;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        access000();
        throw null;
    }

    protected final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = postMessage + 9;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = CollectionsKt.listOf(new UTF8Decoder[]{UTF8Decoder.SIGN_UP_RECHECK, UTF8Decoder.SETTING_RECHECK, UTF8Decoder.SIGN_UP_WITH_CERT_RECHECK, UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID, UTF8Decoder.SIGN_UP_GLOBAL_RECHECK, UTF8Decoder.SIGN_IN_RESET_RECHECK_GLOBAL}).contains(this.ICustomTabsCallbackStub);
        int i4 = postMessage + 31;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    public static final class onExtraCallbackWithResult {

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] onExtraCallback;

            static {
                int[] iArr = new int[UTF8Decoder.values().length];
                try {
                    iArr[UTF8Decoder.SIGN_IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_IN_GLOBAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_IN_RESET_GLOBAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_IN_RESET_RECHECK_GLOBAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP_WITH_CERT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP_GLOBAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP_RECHECK.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP_WITH_CERT_RECHECK.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_UP_GLOBAL_RECHECK.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[UTF8Decoder.SETTING.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[UTF8Decoder.SETTING_CERT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[UTF8Decoder.SETTING_RECHECK.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[UTF8Decoder.WITHDRAW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[UTF8Decoder.GLOBAL_WITHDRAW.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[UTF8Decoder.SETTING_FINGERPRINT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_AGREEMENT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[UTF8Decoder.CMA_SIGN_AGREEMENT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[UTF8Decoder.SIGN_AGREEMENT_V2.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_SAVING_BOX_ADD.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_SAVING_BOX_EDIT.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_SAVING_BOX_DEPOSIT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT_CANCEL.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[UTF8Decoder.PERIODIC_TRANSFER_POST.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[UTF8Decoder.PERIODIC_TRANSFER_EDIT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT_DETAIL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT_SCORE_RAISE.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT_TIP.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[UTF8Decoder.CREDIT_ADS.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[UTF8Decoder.BANKING_LOGIN.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[UTF8Decoder.DASHBOARD.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[UTF8Decoder.SERVICE_ENTER.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[UTF8Decoder.CARD_FIND_OWNED.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[UTF8Decoder.LOAN_INTERNAL_APPLICATION.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[UTF8Decoder.UNLOCK_SCREEN_SETTING.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[UTF8Decoder.LOCK_SCREEN.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[UTF8Decoder.TERMS_AGREEMENT.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_CARD_AUTO_CHARGE_AND_CONNECT.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_CERT_SIGN_DOC.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[UTF8Decoder.TOSS_CERT_SIGN_USER.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[UTF8Decoder.POINT_REFUND.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[UTF8Decoder.FORCE_APP_LOCK_SCREEN_SETTING.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[UTF8Decoder.MOBILE_ID_FOR_ISSUE_CERT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[UTF8Decoder.STANDARD_TERMS_V2_OPTIONAL_TERMS.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[UTF8Decoder.STANDARD_TERMS_V2_REQUIRED_TERMS.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[UTF8Decoder.STANDARD_TERMS_V2_MIXED_TERMS.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                onExtraCallback = iArr;
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ PasswordFragment onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, asArray asarray, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return onextracallbackwithresult.onExtraCallback(asarray, z, z2);
        }

        public final PasswordFragment onExtraCallback(@NotNull asArray asarray, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(asarray, "");
            if (z2 || asarray != asArray.PW_4_DIGIT_1_ALPHA) {
                if (z) {
                    return new PasswordNeo6DFragment();
                }
                return new Password6DFragment();
            }
            if (z) {
                return new PasswordNeo4D1AFragment();
            }
            return new Password4D1AFragment();
        }

        public final int onExtraCallbackWithResult(@NotNull UTF8Decoder uTF8Decoder) throws Throwable {
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            try {
                switch (onNavigationEvent.onExtraCallback[uTF8Decoder.ordinal()]) {
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 30 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj = ((Field) objOnExtraCallback).get(null);
                        Object[] objArr = {5};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(217202414);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Color.green(0) + 30, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24887, 1035124862, false, "IAuthTabCallback", new Class[]{Integer.TYPE});
                        }
                        if (((Boolean) ((Method) objOnExtraCallback2).invoke(obj, objArr)).booleanValue()) {
                            return R.string.password_title_sign_in_when_last_change;
                        }
                        return R.string.password_title_sign_in;
                    case 2:
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.keyCodeFromString("") + 30, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj2 = ((Field) objOnExtraCallback3).get(null);
                        Object[] objArr2 = {5};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(217202414);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 30, AndroidCharacter.getMirror('0') + 24839, 1035124862, false, "IAuthTabCallback", new Class[]{Integer.TYPE});
                        }
                        if (((Boolean) ((Method) objOnExtraCallback4).invoke(obj2, objArr2)).booleanValue()) {
                            return R.string.global_password_title_sign_in_when_last_change;
                        }
                        return R.string.global_password_title_sign_in;
                    case 3:
                        return R.string.global_password_title_sign_in_reset;
                    case 4:
                        return R.string.global_password_title_sign_up_recheck;
                    case 5:
                        return R.string.password_title_sign_up;
                    case 6:
                        return R.string.password_title_sign_up_overseas;
                    case 7:
                        return R.string.global_password_title_sign_up;
                    case 8:
                    case 9:
                        return R.string.password_title_sign_up_recheck;
                    case 10:
                        return R.string.global_password_title_sign_up_recheck;
                    case 11:
                        return R.string.password_title_setting;
                    case 12:
                        return R.string.app_password_title_setting_cert;
                    case 13:
                        return R.string.password_title_setting_recheck;
                    case 14:
                        return R.string.password_title_setting_recheck;
                    case 15:
                        return R.string.password_title_withdraw;
                    case 16:
                        return R.string.global_password_title_withdraw;
                    case 17:
                        return R.string.password_title_setting_fingerprint;
                    case 18:
                    case 19:
                        return R.string.password_title_sign_agreement;
                    case 20:
                        return R.string.password_title_sign_agreement_v2;
                    case 21:
                        return R.string.password_title_saving_box_add;
                    case 22:
                        return R.string.password_title_saving_box_edit;
                    case 23:
                        return R.string.password_title_saving_box_deposit;
                    case 24:
                        return R.string.password_title_credit_cancel;
                    case 25:
                        return R.string.password_title_periodic_transfer_post;
                    case 26:
                        return R.string.password_title_periodic_transfer_edit;
                    case 27:
                    case 28:
                        return R.string.password_title_credit_inquiry;
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        return R.string.password_title_verify;
                    case 37:
                        return R.string.password_title_unlock_screen_setting;
                    case 38:
                        return R.string.password_title_lock_screen;
                    case 39:
                        return R.string.password_title_terms_agreement;
                    case 40:
                        return R.string.password_title_toss_card_auto_charge_and_connect;
                    case 41:
                        return R.string.password_title_toss_cert_sign_doc;
                    case 42:
                        return R.string.password_title_toss_cert_sign_user;
                    case 43:
                        return R.string.password_title_point_refund;
                    case 44:
                        return R.string.password_title_force_app_lock_screen_setting;
                    case 45:
                        return R.string.app_password_change_for_mobile_id_issue_cert;
                    case 46:
                        return R.string.password_title_standard_terms_v2_optional_agreement;
                    case 47:
                        return R.string.password_title_standard_terms_v2_required_agreement;
                    case 48:
                        return R.string.password_title_standard_terms_v2_mixed_agreement;
                    default:
                        return R.string.password_title_default;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public final int IAuthTabCallback(@NotNull UTF8Decoder uTF8Decoder) {
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            return uTF8Decoder == UTF8Decoder.CREDIT_CANCEL ? R.string.password_subtitle_credit_cancel : R.string.empty;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        PasswordFragment passwordFragment = (PasswordFragment) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 87;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            Object[] objArr2 = new Object[1];
            d(Color.alpha(0) + 80, 306 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 2715), objArr2);
            throw new UnsupportedOperationException(((String) objArr2[0]).intern());
        }
        int i5 = i3 + 55;
        int i6 = i5 % 128;
        newSessionWithExtras = i6;
        int i7 = i5 % 2;
        if ((iIntValue & 1) != 0) {
            int i8 = i6 + 109;
            postMessage = i8 % 128;
            int i9 = i8 % 2;
            function0 = null;
        }
        passwordFragment.IAuthTabCallback(function0);
        return null;
    }

    protected final void onExtraCallbackWithResult(@NotNull View view) throws Throwable {
        ViewGroup viewGroup;
        int iHeight;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.password_scroll_view);
        if (scrollView != null && (viewGroup = (ViewGroup) view.findViewById(R.id.password_container)) != null) {
            if (!scrollView.isLaidOut() || scrollView.isLayoutRequested()) {
                scrollView.addOnLayoutChangeListener(new IAuthTabCallbackDefault(scrollView, viewGroup, this));
                return;
            }
            if (scrollView.getMeasuredHeight() < viewGroup.getMeasuredHeight()) {
                DisplayMetrics displayMetrics = scrollView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                scrollView.setScrollBarSize(varyMatches.onNavigationEvent(4, displayMetrics));
                int i2 = postMessage + 51;
                newSessionWithExtras = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 4;
                }
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                int i4 = newSessionWithExtras + 73;
                postMessage = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    activity.getWindowManager();
                    obj.hashCode();
                    throw null;
                }
                WindowManager windowManager = activity.getWindowManager();
                if (windowManager != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        int i5 = newSessionWithExtras + 57;
                        postMessage = i5 % 128;
                        int i6 = i5 % 2;
                        iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
                    } else {
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
                        iHeight = displayMetrics2.heightPixels;
                    }
                    if (M_.onExtraCallback.IAuthTabCallbackDefault() < iHeight / 2) {
                        int i7 = postMessage + 43;
                        newSessionWithExtras = i7 % 128;
                        if (i7 % 2 != 0) {
                            onExtraCallbackWithResult().getLayoutParams();
                            throw null;
                        }
                        ViewGroup viewGroupOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        ViewGroup.LayoutParams layoutParams = viewGroupOnExtraCallbackWithResult.getLayoutParams();
                        if (layoutParams == null) {
                            Object[] objArr = new Object[1];
                            d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 78, 789 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 27796), objArr);
                            throw new NullPointerException(((String) objArr[0]).intern());
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                        marginLayoutParams.topMargin = varyMatches.onNavigationEvent(10, displayMetrics3);
                        viewGroupOnExtraCallbackWithResult.setLayoutParams(marginLayoutParams);
                        return;
                    }
                }
            }
        }
        int i8 = newSessionWithExtras + 13;
        postMessage = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordFragment passwordFragment, Function0 function0, int i, Object obj) {
        Object[] objArr = {passwordFragment, function0, Integer.valueOf(i), obj};
        onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(PasswordFragment passwordFragment, Function0 function0, int i, Object obj) {
        Object[] objArr = {passwordFragment, function0, Integer.valueOf(i), obj};
        onNavigationEvent(-374755430, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 374755433, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr);
    }

    private static final Unit IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(-2025232262, iOnNavigationEvent, 2025232271, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0]);
    }

    public final onNavigationEvent onActivityResized() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (onNavigationEvent) onNavigationEvent(-853005714, iOnNavigationEvent, 853005718, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this});
    }

    protected final CharSequence onMinimized() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (CharSequence) onNavigationEvent(-1529118887, iOnNavigationEvent, 1529118893, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this});
    }

    protected final String onUnminimized() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onNavigationEvent(-420298243, iOnNavigationEvent, 420298251, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this});
    }

    public final CharSequence onNavigationEvent(@NotNull UTF8Decoder uTF8Decoder) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (CharSequence) onNavigationEvent(50819534, iOnNavigationEvent, -50819529, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, uTF8Decoder});
    }

    protected final boolean mayLaunchUrl() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onNavigationEvent(-1249015494, iOnNavigationEvent, 1249015496, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})).booleanValue();
    }

    protected final void postMessage() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(-866721945, iOnNavigationEvent, 866721945, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this});
    }

    protected final boolean newAuthTabSession() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onNavigationEvent(267836324, iOnNavigationEvent, -267836323, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})).booleanValue();
    }

    static void newSessionWithExtras() {
        char[] cArr = new char[892];
        ByteBuffer.wrap("ò°#ÜPC\u0086ô·på\u009f\u001a\u0006H·y4®Hø )ÌZS\u008cä½`ï\u008f\u0010\u0010B§s*¤[ÖÊ\u0007m)ýZ\u0007\u008c\u008d½;ï¶\u0010!AHsÇ¤dÖô\u0007\u001b\u0081²PÞ#AõöÄr\u0096\u009di\u0001;²\n:ÝX¯Ø~bPï#\u0015õ\u008bÄ-\u0096´i38Q\u0003ÎÒ¢¡,w\u0085F\u001b9Vè&\u009b£M\u0002|\u0084.nÑä\u0083Q²Óe¤\u00176~+¯GÜØ\no;ëi\u0004\u0096\u0083Ä<õ¿\"ÈPW\u0081ð¯pÜ\u0085\n\t;²i;\u0096°ÇÕõIí\u0091<ýOb\u0099Õ¨Qú¾\u0005;W\u0090f\u0003±yÃñ\u0012\\<ËO6\u0099¼¨\nú\u0087\u0005\u0010Tyfâ±SÃÔ\u0012&\u000b\u0093Úÿ©`\u007f×NS\u001c¼ã9±\u0092\u0080\u0001Wm%õôBÚ×©.\u007f¬N\u001b\u001c\u008fã\u0014²{\u0080àWQ%Öô$í\u0091<ýOb\u0099Õ¨Qú¾\u0005:W\u0082f\u0012±iÃò\u0012J<ÇO9\u0099»¨\u0018ú\u0097\u0005\u0002Tifå±DÃÎ\u00120<¶O\u001f\u0099\u0098¨úû`\u0005ÇTLf¾±(Ã½\u0012\u0001<\u0093í\u0091<ýOb\u0099Õ¨Qú¾\u00054W\u0096f\u0012±cÃû\u0012C<ÇO \u0099¾\u008c\u0013]\u007f.àøWÉÓ\u009b<d¶6\u0013\u0007\u0091Ðâ¢csÀ][.¢ø6É\u0096\u009b\u0007d\u00945ð\u0007|ÐÔ¢Zs´](\u0000ÑÑ½¢\"t\u0095E\u0011\u0017þètºÊ\u008bR\\$.\u00adÿ\u0007Ñ\u0087¢htüE_\u0017ÁèG¹9\u008b¥\\\u0005.\u0082ÿgÑçí±<ÝOB\u0099õ¨qú¾\u0005\u001bW\u00adf:±Bí\u0091<ýOb\u0099Õ¨Qú¾\u00057W\u0091f\u000e±bÃì\u0012P<ÌO \u0099®¨\u0007ú\u0081í\u0091<ýOb\u0099Õ¨Qú¾\u00057W\u0091f\u000e±bÃì\u0012P<ÕO,\u0099©¨\u0018ú\u0085\u0005\u0012Tcí\u0091<ýOb\u0099Õ¨Qú¾\u00056W\u0096f\u001d±aÃá\u0012B<×O-\u0099¿í\u0091<ýOb\u0099Õ¨Qú¾\u00051W\u008cf\u0011±}Ãÿ\u0012A<Áç\u001d6JEÜ\u0093x¢øð[\u000f\u008b]8lª»ÛÉW\u0018µ6uE\u009a\u0093\u0014¢¹ð~\u000f«^ÙlK»ûÉ~\u0018\u00946\u001dEö\u0093&¢FñÂ\u000fg^îl\u0015»\u008fÉ\u001a\u0018¬6lES\u0094Å¢oñ¨\u000f\n^\u0093l'»´ÊÚ\u0018P7çEe\u0094\u0095¢^ñ\u0086\u000f2^ímÎ»CÊñ\u0018z7ÖE\u0013\u0094µ¢7ñU\u0000Æ^dm\u00ad».Ê\u0099\u0018\u00197³E)\u0094O£Áñv\u0000è^MmÄ»6Ê®\u0019Ü7SFôSø\u0082\u0086ñ\u0012'§\u0016<DØ»PéüØN\u000f\u0004}\u0086¬0\u0082´ñP'Þ\u0016iDç»Gê\u0018Ø\u0099\u000f,}°¬Jí\u0087<ÐOF\u0099â¨búÁ\u0005\u0011W¢f0±AÃÍ\u0012/<ïO\u0000\u0099\u008e¨#úä\u00051TCfÑ±aÃä\u0012\u000e<\u0087Ol\u0099¼¨ÜûX\u0005ýTtf\u008f±\u0015Ã\u0080\u00126<öOÉ\u009e_¨õû2\u0005\u0090T\tf½±.À@\u0012Ê=}Oÿ\u009e\u000f¨Äû\u001c\u0005¨TwgT±ÙÀk\u0012à=LO\u0089\u009e/¨\u00adûÏ\n\\Tþg7±´À\u0003\u0012\u0083=)O³\u009eÕ©[ûì\nrT×g^±¡À=\u0013L=ÞL^\u009e÷©pû \n\u001eT®g6¶GÀÁ\u0013\\=ïL\u0007\u009e\u0091©<û\u008a\nßU\\gÓ¶`Àå\u0013\u0013=\u0099L.\u009e¼í\u0087<ÐOF\u0099â¨búÁ\u0005\u0011W¢f0±AÃÍ\u0012/<ïO\u0000\u0099\u008e¨#úä\u00051TCfÑ±aÃä\u0012\u000e<\u0087Ol\u0099¼¨ÜûX\u0005ýTtf\u008f±\u0015Ã\u0080\u00126<öOÉ\u009e_¨õû2\u0005\u0090T\tf½±.À@\u0012Ê=}Oÿ\u009e\u000f¨Äû\u001c\u0005¨TwgT±ÙÀk\u0012à=LO\u0089\u009e/¨\u00adûÏ\n\\Tþg7±´À\u0003\u0012\u0083=)O³\u009eÕ©[ûì\nrT×g^± À6\u0013\u007f=ßLy\u009eí©sû\u009f\n$Tµg2¶AÀÖ\u0013\u007f=îí\u0087<ÐOF\u0099â¨búÁ\u0005\u0011W¢f0±AÃÍ\u0012/<ïO\u0000\u0099\u008e¨#úä\u00051TCfÑ±aÃä\u0012\u000e<\u0087Ol\u0099¼¨ÜûX\u0005ýTtf\u008f±\u0015Ã\u0080\u00126<öOÉ\u009e_¨õû2\u0005\u0090T\tf½±.À@\u0012Ê=}Oÿ\u009e\u000f¨Äû\u001c\u0005¨TwgT±ÙÀk\u0012à=LO\u0089\u009e/¨\u00adûÏ\n\\Tþg7±´À\u0003\u0012\u0083=)O³\u009eÕ©[ûì\nrT×g^±¿À7\u0013Z=ÎLY\u009eá©fû\u0083\n\u0003T\u0097g8¶VÀÛ\u0013A=øL\u001d\u009e\u008c©)û¾\nÏ#$òs\u0081åWAfÁ4bË²\u0099\u0001¨\u0093\u007fâ\rnÜ\u008còL\u0081£W-f\u00804GË\u0092\u009aà¨r\u007fÂ\rGÜ\u00adò$\u0081ÏW\u001ff\u007f5ûË^\u009a×¨,\u007f¶\r#Ü\u0095òU\u0081jPüfV5\u0091Ë3\u009aª¨\u001e\u007f\u008d\u000eãÜióÞ\u0081\\P¬fg5¿Ë\u000b\u009aÔ©÷\u007fz\u000eÈÜCóï\u0081*P\u008cf\u000e5lÄÿ\u009a]©\u0094\u007f\u0017\u000e Ü ó\u008a\u0081\u0010Pvgø5OÄÑ\u009at©ý\u007f\u001e\u000e\u009eÝùó|\u0082ÜPpgß51Ä¼\u009a.©\u0097xò\u000ecÝÎóY\u0082¨\u0081)PC#ÉõxÄ£\u0096\u0011i\u0080;>\n¡ÝÑ¯Y~¼Pi#\u009fõIÄ»\u00966iµ8Á\n\u0004Ýç¯m~ÑP\u000e#°õ Ä\u0010\u0097Âin8æ\n\u0015ÝÈ¯\u0013~¯P5#Qò\u0083Äs\u0097ïi\u00148\u009d\n1Ý¤¬Ø~\u0005Qì#`ò\u009dÄ\u0000\u0097Èi\u00038\u00ad\u000bÖÝU¬Ö~rQ\u0090#\u001bò\u00adÄb\u0097vfË8k\u000bïÝn¬\u0098~)Qµ#:ò]ÅÔ\u0097dfß8\u001f\u000b\u009fÝ=¬¦\u007fÉlU½)Î³\u0018\u0017í§<ÐOQ\u0099à¨uú\u0092\u0005\u0006W¦f8±oÃ×\u0012`<õO\f\u0099\u008e¨9ú\u00ad\u00056TgfÂ±tÃù".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 892);
        prefetch = cArr;
        newSession = -6066688719111242587L;
    }
}
