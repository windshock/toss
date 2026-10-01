package im.toss.features.home.presentation.consumption_home;

import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import im.toss.base.BaseFragment;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.PlayerErrorCode;
import o.RotationProvider1;
import o.addExtra;
import o.getWrite;
import o.onRenderReady;
import o.onWifiConnectSuccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeConsumptionHomeActivity$onExtraCallback extends FragmentStatePagerAdapter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final Bundle onExtraCallback;
    private final Function1<Integer, String> onExtraCallbackWithResult;
    private final onWifiConnectSuccess onNavigationEvent;
    private final FlowMeasureLazyPolicyExternalSyntheticLambda3 onWarmupCompleted;
    private static char[] IAuthTabCallback = {51243, 64966, 64987, 64960, 64964, 51240, 64961, 51245, 64963, 64991, 64986, 64981, 64982, 64993, 51242, 51244};
    private static char asInterface = 51245;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeConsumptionHomeActivity$onExtraCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull onWifiConnectSuccess onwificonnectsuccess, @NotNull Function1<? super Integer, String> function1, @Nullable Bundle bundle) {
        super(flowMeasureLazyPolicyExternalSyntheticLambda3, 1);
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(onwificonnectsuccess, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = flowMeasureLazyPolicyExternalSyntheticLambda3;
        this.onNavigationEvent = onwificonnectsuccess;
        this.onExtraCallbackWithResult = function1;
        this.onExtraCallback = bundle;
    }

    public /* synthetic */ Fragment getItem(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 47;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(i);
            obj.hashCode();
            throw null;
        }
        BaseFragment baseFragmentOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        int i4 = asBinder + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return baseFragmentOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallback;
        float f = 0.0f;
        if (cArr3 != null) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 26 - (Process.myPid() >> 22), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 37;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 23138 - TextUtils.lastIndexOf("", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            int i8 = $10 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i10 = $11 + 75;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.alpha(0)), 74 - Color.alpha(0), Color.rgb(0, 0, 0) + 16785304, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.keyCodeFromString("") + 30, 19489 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                    } else {
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public int getCount() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted);
            throw null;
        }
        if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            return 1;
        }
        int i3 = asBinder + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return 2;
    }

    public CharSequence getPageTitle(int i) {
        CharSequence charSequence;
        int i2 = 2 % 2;
        int i3 = asBinder + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            charSequence = (CharSequence) this.onExtraCallbackWithResult.invoke(Integer.valueOf(i));
            int i4 = 98 / 0;
        } else {
            charSequence = (CharSequence) this.onExtraCallbackWithResult.invoke(Integer.valueOf(i));
        }
        int i5 = IAuthTabCallbackDefault + 21;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return charSequence;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseFragment onExtraCallbackWithResult(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = this.onWarmupCompleted;
            Bundle bundle = this.onExtraCallback;
            HomeConsumptionHomeListFragment homeConsumptionHomeListFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), HomeConsumptionHomeListFragment.class.getName());
            if (homeConsumptionHomeListFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.home.presentation.consumption_home.HomeConsumptionHomeListFragment");
            }
            int i6 = asBinder + 49;
            IAuthTabCallbackDefault = i6 % 128;
            HomeConsumptionHomeListFragment homeConsumptionHomeListFragment = homeConsumptionHomeListFragmentInstantiate;
            if (i6 % 2 == 0) {
                if (bundle != null) {
                    homeConsumptionHomeListFragment.setArguments(bundle);
                }
                return homeConsumptionHomeListFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i3 + 21;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        if (i == 1) {
            Uri.Builder builderBuildUpon = Uri.parse(this.onNavigationEvent.onExtraCallback()).buildUpon();
            Object[] objArr = new Object[1];
            a(new char[]{4, 14, '\b', 15, 13823, 13823, 14, 4}, (byte) (23 - (ViewConfiguration.getPressedStateDuration() >> 16)), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), "consumption");
            builderBuildUpon.appendQueryParameter("feedType", "consumption");
            builderBuildUpon.appendQueryParameter("embedInTab", "true");
            String string = builderBuildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda32 = this.onWarmupCompleted;
            Object[] objArr2 = new Object[1];
            a(new char[]{2, 5, 13923}, (byte) (109 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), string);
            Object[] objArr3 = new Object[1];
            a(new char[]{0, 7, 11, '\t', '\r', 14, 15, '\b', 4, 14, 0, 3}, (byte) (86 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.getCapsMode("", 0, 0) + 12, objArr3);
            return onRenderReady.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda32, RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "true")}), this.onNavigationEvent.onExtraCallbackWithResult());
        }
        throw new IllegalArgumentException();
    }
}
