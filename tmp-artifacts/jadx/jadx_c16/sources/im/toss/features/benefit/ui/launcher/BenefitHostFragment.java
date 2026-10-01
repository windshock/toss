package im.toss.features.benefit.ui.launcher;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import im.toss.features.benefit.R;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.SDKInstallCallBack;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.removeTaskIdOnSocketError;
import o.setShine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitHostFragment extends Hilt_BenefitHostFragment implements removeTaskIdOnSocketError {
    public static final onExtraCallback Companion;
    private static final List<String> onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final int onWarmupCompleted;
    private Bundle IAuthTabCallback;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 226;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (i * 2);
        byte[] bArr = $$a;
        int i6 = (b * 2) + 105;
        int i7 = i2 * 3;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            i4 = i5;
            int i8 = i7;
            int i9 = 0;
            i5 += i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i4];
            i5 += i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 17;
    }

    public BenefitHostFragment() {
        super(R.layout.benefit_host_fragment);
    }

    public void onNewArgument(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bundle == null) {
            bundle = new Bundle();
            int i3 = asBinder + 43;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        this.IAuthTabCallback = new Bundle(bundle);
        asBinder();
    }

    public void onStart() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            asBinder();
            int i3 = asBinder + 17;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStart();
        asBinder();
        throw null;
    }

    private final boolean onExtraCallbackWithResult(Bundle bundle) {
        Bundle arguments;
        int i = 2 % 2;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("korea_benefit_tab_fragment");
        if (fragmentFindFragmentByTag == null || (arguments = fragmentFindFragmentByTag.getArguments()) == null) {
            return true;
        }
        List<String> list = onExtraCallback;
        if (list instanceof Collection) {
            int i2 = IAuthTabCallbackStub + 75;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (list.isEmpty()) {
                int i4 = IAuthTabCallbackStub + 1;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        for (String str : list) {
            if (!Intrinsics.areEqual(bundle.getString(str), arguments.getString(str))) {
                int i6 = asBinder + 87;
                IAuthTabCallbackStub = i6 % 128;
                return i6 % 2 != 0;
            }
        }
        return false;
    }

    public TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent(@NotNull Fragment fragment, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = fragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        SDKInstallCallBack sDKInstallCallBack = new SDKInstallCallBack(lifecycle, setShine.onNavigationEvent(Boolean.TRUE), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragment));
        int i3 = asBinder + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return sDKInstallCallBack;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
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
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10278 - (Process.myTid() >> 22), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12843), KeyEvent.keyCodeFromString("") + 55, TextUtils.getCapsMode("", 0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i9 = $11 + 55;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), Color.alpha(0) + 55, ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $10 + 49;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        onExtraCallbackWithResult = 0;
        onExtraCallback();
        Companion = new onExtraCallback((DefaultConstructorMarker) null);
        onWarmupCompleted = 8;
        onExtraCallback = CollectionsKt.listOf(new String[]{"highlightServiceType", "scrollToSection", "pointBackReferrer", "topFloatingLandingURL"});
        int i = onTransact + 43;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().findFragmentByTag("korea_benefit_tab_fragment") != null) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            int i2 = IAuthTabCallbackStub + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        Bundle bundle2 = new Bundle(arguments);
        Object[] objArr = new Object[1];
        a(8 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, false, ExpandableListView.getPackedPositionGroup(0L) + 145, objArr);
        String string = bundle2.getString(((String) objArr[0]).intern());
        if (string != null) {
            int i4 = asBinder + 29;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (StringsKt.isBlank(string)) {
                Object[] objArr2 = new Object[1];
                a(8 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 5, new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, false, 146 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                bundle2.putString(((String) objArr2[0]).intern(), "home_launcher");
            }
        }
        KoreaBenefitTabFragment koreaBenefitTabFragment = new KoreaBenefitTabFragment();
        bundle2.putBoolean("from_home_launcher", true);
        koreaBenefitTabFragment.setArguments(bundle2);
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = childFragmentManager.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(R.id.benefit_host_fragment_container, koreaBenefitTabFragment, "korea_benefit_tab_fragment");
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback();
        int i6 = asBinder + 1;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void asBinder() throws Throwable {
        int i = 2 % 2;
        Bundle bundle = this.IAuthTabCallback;
        if (bundle != null) {
            int i2 = IAuthTabCallbackStub + 105;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 39 / 0;
                if (getChildFragmentManager().ICustomTabsService()) {
                    return;
                }
            } else if (getChildFragmentManager().ICustomTabsService()) {
                return;
            }
            this.IAuthTabCallback = null;
            if (onExtraCallbackWithResult(bundle)) {
                Bundle bundle2 = new Bundle(bundle);
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') + 9, 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 144, objArr);
                String string = bundle2.getString(((String) objArr[0]).intern());
                if (string != null) {
                    int i4 = asBinder + 19;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 == 0) {
                        boolean zIsBlank = StringsKt.isBlank(string);
                        int i5 = 35 / 0;
                        if (zIsBlank) {
                            Object[] objArr2 = new Object[1];
                            a(Color.blue(0) + 8, 4 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, false, 145 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                            bundle2.putString(((String) objArr2[0]).intern(), "home_launcher");
                        }
                    } else if (StringsKt.isBlank(string)) {
                    }
                }
                bundle2.putBoolean("from_home_launcher", true);
                FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = childFragmentManager.onExtraCallbackWithResult();
                Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
                int i6 = R.id.benefit_host_fragment_container;
                KoreaBenefitTabFragment koreaBenefitTabFragment = new KoreaBenefitTabFragment();
                koreaBenefitTabFragment.setArguments(bundle2);
                Unit unit = Unit.INSTANCE;
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(i6, koreaBenefitTabFragment, "korea_benefit_tab_fragment");
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult();
            }
        }
    }

    static void onExtraCallback() {
        onNavigationEvent = 478308879;
    }
}
