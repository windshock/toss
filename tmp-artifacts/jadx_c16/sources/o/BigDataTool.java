package o;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import im.toss.base.BaseFragment;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment;
import im.toss.features.foreigner.ForeignerPayTabFragment;
import im.toss.features.foreigner.home.ui.ForeignerHomeFragment;
import im.toss.features.launcher.HomeLauncherFragment;
import im.toss.features.main.ui.MainTabFragment;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.teens.benefit.UssBenefitFragment;
import im.toss.features.teens.social.TeensSocialFragment;
import im.toss.features.usshome.UssHomeTabFragment;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.getPreRenderJob;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse;
import viva.republica.toss.send.v4.entity.ReceiverTab;
import viva.republica.toss.send.v4.receiver.TransferReceiverTabFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BigDataTool implements ExtHubPage {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final RVTabbarLayout IAuthTabCallback;
    private final MySubscribeProxySubscriptionsSetting onExtraCallbackWithResult;
    private final CacheStrategy onWarmupCompleted;
    private static char[] onNavigationEvent = {32474, 32431, 32430};
    private static int onExtraCallback = -1184333996;
    private static boolean asBinder = true;
    private static boolean IAuthTabCallbackDefault = true;

    public BigDataTool(@NotNull MySubscribeProxySubscriptionsSetting mySubscribeProxySubscriptionsSetting, @NotNull RVTabbarLayout rVTabbarLayout, @NotNull CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(mySubscribeProxySubscriptionsSetting, "");
        Intrinsics.checkNotNullParameter(rVTabbarLayout, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        this.onExtraCallbackWithResult = mySubscribeProxySubscriptionsSetting;
        this.IAuthTabCallback = rVTabbarLayout;
        this.onWarmupCompleted = cacheStrategy;
    }

    @Override // o.ExtHubPage
    public /* bridge */ Fragment onExtraCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull String str, @Nullable Bundle bundle, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, str, bundle, num);
        }
        super.onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, str, bundle, num);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[PHI: r2
      0x00ee: PHI (r2v30 im.toss.features.teens.benefit.UssBenefitFragment) = (r2v29 im.toss.features.teens.benefit.UssBenefitFragment), (r2v32 im.toss.features.teens.benefit.UssBenefitFragment) binds: [B:52:0x00ec, B:49:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.ExtHubPage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment onExtraCallbackWithResult(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, int i, @Nullable Bundle bundle, @Nullable Integer num) throws Throwable {
        Uri uriOnWarmupCompleted;
        Uri uriIAuthTabCallback;
        Uri uriIAuthTabCallback2;
        Uri uriIAuthTabCallback3;
        Uri uriIAuthTabCallback4;
        UssBenefitFragment ussBenefitFragment;
        int i2 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        if (i == 1) {
            return onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, this.IAuthTabCallback.onNavigationEvent(), bundle, num);
        }
        String str2 = "tab";
        if (i == 8) {
            PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
            if (addExtra.writeTypedObject(playerErrorCode)) {
                UssHomeTabFragment ussHomeTabFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), UssHomeTabFragment.class.getName());
                if (ussHomeTabFragmentInstantiate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.features.usshome.UssHomeTabFragment");
                }
                UssHomeTabFragment ussHomeTabFragment = ussHomeTabFragmentInstantiate;
                if (bundle != null) {
                    int i3 = onTransact + 47;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    ussHomeTabFragment.setArguments(bundle);
                }
                return ussHomeTabFragment;
            }
            if (!callMode.onExtraCallbackWithResult(playerErrorCode)) {
                return (BaseFragment) onRenderReady.onWarmupCompleted(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -679646364, 679646364, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{flowMeasureLazyPolicyExternalSyntheticLambda3, null, this.onExtraCallbackWithResult.onNavigationEvent(), 1, null}, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            }
            if (num != null && num.intValue() != 8) {
                str = "tab";
            }
            Bundle bundleOnExtraCallbackWithResult = ForeignerHomeFragment.Companion.onExtraCallbackWithResult(str);
            ForeignerHomeFragment foreignerHomeFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), ForeignerHomeFragment.class.getName());
            if (foreignerHomeFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.foreigner.home.ui.ForeignerHomeFragment");
            }
            ForeignerHomeFragment foreignerHomeFragment = foreignerHomeFragmentInstantiate;
            if (bundleOnExtraCallbackWithResult != null) {
                foreignerHomeFragment.setArguments(bundleOnExtraCallbackWithResult);
            }
            return foreignerHomeFragment;
        }
        if (i == 13) {
            if (bundle != null) {
                int i5 = onTransact + 81;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    MainTabFragment.Companion.IAuthTabCallback(bundle);
                    throw null;
                }
                uriOnWarmupCompleted = MainTabFragment.Companion.IAuthTabCallback(bundle);
                if (uriOnWarmupCompleted == null) {
                    uriOnWarmupCompleted = Uri.EMPTY;
                }
            }
            BigDataAIDLLiteServiceStubProxy bigDataAIDLLiteServiceStubProxy = BigDataAIDLLiteServiceStubProxy.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(uriOnWarmupCompleted);
            if (bigDataAIDLLiteServiceStubProxy.onWarmupCompleted(uriOnWarmupCompleted, ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue())) {
                uriOnWarmupCompleted = NestfgetmDriveCxxAnimations.onExtraCallbackWithResult.onWarmupCompleted();
            }
            setDebugLog setdebuglog = setDebugLog.onNavigationEvent;
            Intrinsics.checkNotNull(uriOnWarmupCompleted);
            Bundle bundleOnExtraCallback = setdebuglog.onExtraCallback(uriOnWarmupCompleted);
            String name = setDebugLog.onNavigationEvent(setdebuglog, (Context) null, 1, (Object) null).getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return onRenderReady.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, bundleOnExtraCallback, name);
        }
        int i6 = asInterface + 77;
        onTransact = i6 % 128;
        if (i6 % 2 != 0 ? i == 21 : i == 19) {
            Bundle bundleOnWarmupCompleted = ForeignerPayTabFragment.Companion.onWarmupCompleted();
            ForeignerPayTabFragment foreignerPayTabFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), ForeignerPayTabFragment.class.getName());
            if (foreignerPayTabFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.foreigner.ForeignerPayTabFragment");
            }
            ForeignerPayTabFragment foreignerPayTabFragment = foreignerPayTabFragmentInstantiate;
            if (bundleOnWarmupCompleted != null) {
                foreignerPayTabFragment.setArguments(bundleOnWarmupCompleted);
            }
            return foreignerPayTabFragment;
        }
        if (i == 45) {
            if (bundle == null || (uriIAuthTabCallback = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
                uriIAuthTabCallback = Uri.EMPTY;
            }
            TeensSocialFragment.onExtraCallback onextracallback = TeensSocialFragment.Companion;
            Intrinsics.checkNotNull(uriIAuthTabCallback);
            Bundle bundleOnExtraCallback2 = onextracallback.onExtraCallback(uriIAuthTabCallback);
            TeensSocialFragment teensSocialFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), TeensSocialFragment.class.getName());
            if (teensSocialFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.teens.social.TeensSocialFragment");
            }
            TeensSocialFragment teensSocialFragment = teensSocialFragmentInstantiate;
            if (bundleOnExtraCallback2 != null) {
                teensSocialFragment.setArguments(bundleOnExtraCallback2);
            }
            return teensSocialFragment;
        }
        if (i == 52) {
            if (bundle == null || (uriIAuthTabCallback2 = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
                uriIAuthTabCallback2 = Uri.EMPTY;
            }
            Uri uri = uriIAuthTabCallback2;
            GriverSessionDataExtension griverSessionDataExtension = GriverSessionDataExtension.onExtraCallback;
            Intrinsics.checkNotNull(uri);
            return GriverSessionDataExtension.onWarmupCompleted(griverSessionDataExtension, flowMeasureLazyPolicyExternalSyntheticLambda3, uri, false, 4, (Object) null);
        }
        if (i == 55) {
            HomeLauncherFragment homeLauncherFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), HomeLauncherFragment.class.getName());
            if (homeLauncherFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.launcher.HomeLauncherFragment");
            }
            int i7 = onTransact + 17;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                return homeLauncherFragmentInstantiate;
            }
            int i8 = 24 / 0;
            return homeLauncherFragmentInstantiate;
        }
        if (i != 17) {
            if (i != 18) {
                return null;
            }
            Bundle bundleIAuthTabCallback = TransferReceiverTabFragment.onExtraCallback.IAuthTabCallback(TransferReceiverTabFragment.Companion, (String) null, 0L, (String) null, (String) null, (ReceiverTab) null, false, "transfer_tab", (InitSessionKeyResponse) null, false, (String) null, (DepositTargetTabListResponse) null, 1983, (Object) null);
            TransferReceiverTabFragment transferReceiverTabFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), TransferReceiverTabFragment.class.getName());
            if (transferReceiverTabFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.send.v4.receiver.TransferReceiverTabFragment");
            }
            int i9 = asInterface + 17;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            TransferReceiverTabFragment transferReceiverTabFragment = transferReceiverTabFragmentInstantiate;
            if (bundleIAuthTabCallback != null) {
                transferReceiverTabFragment.setArguments(bundleIAuthTabCallback);
            }
            return transferReceiverTabFragment;
        }
        if (!addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            if (bundle == null || (uriIAuthTabCallback3 = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
                uriIAuthTabCallback3 = Uri.EMPTY;
            }
            Intrinsics.checkNotNull(uriIAuthTabCallback3);
            if (num != null) {
                int i11 = onTransact + 87;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                if (num.intValue() == 17) {
                    int i13 = onTransact + 41;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                    str2 = "last_tab";
                }
            }
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, (-16777089) - Color.rgb(0, 0, 0), objArr);
            Bundle bundleIAuthTabCallback2 = KoreaBenefitTabFragment.onExtraCallbackWithResult.IAuthTabCallback(KoreaBenefitTabFragment.Companion, filterCreatePageParams.IAuthTabCallback(uriIAuthTabCallback3, ((String) objArr[0]).intern(), str2), (String) null, 2, (Object) null);
            KoreaBenefitTabFragment koreaBenefitTabFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), KoreaBenefitTabFragment.class.getName());
            if (koreaBenefitTabFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.benefit.ui.KoreaBenefitTabFragment");
            }
            KoreaBenefitTabFragment koreaBenefitTabFragment = koreaBenefitTabFragmentInstantiate;
            if (bundleIAuthTabCallback2 != null) {
                koreaBenefitTabFragment.setArguments(bundleIAuthTabCallback2);
            }
            return koreaBenefitTabFragment;
        }
        if (bundle != null) {
            int i15 = onTransact + 9;
            asInterface = i15 % 128;
            if (i15 % 2 != 0) {
                MainTabFragment.Companion.IAuthTabCallback(bundle);
                throw null;
            }
            uriIAuthTabCallback4 = MainTabFragment.Companion.IAuthTabCallback(bundle);
            if (uriIAuthTabCallback4 == null) {
                uriIAuthTabCallback4 = Uri.EMPTY;
            }
        }
        UssBenefitFragment.onNavigationEvent onnavigationevent = UssBenefitFragment.Companion;
        Intrinsics.checkNotNull(uriIAuthTabCallback4);
        Bundle bundleIAuthTabCallback3 = onnavigationevent.IAuthTabCallback(uriIAuthTabCallback4);
        UssBenefitFragment ussBenefitFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), UssBenefitFragment.class.getName());
        if (ussBenefitFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type im.toss.features.teens.benefit.UssBenefitFragment");
        }
        int i16 = onTransact + 45;
        asInterface = i16 % 128;
        if (i16 % 2 != 0) {
            ussBenefitFragment = ussBenefitFragmentInstantiate;
            int i17 = 62 / 0;
            if (bundleIAuthTabCallback3 != null) {
                ussBenefitFragment.setArguments(bundleIAuthTabCallback3);
            }
        } else {
            ussBenefitFragment = ussBenefitFragmentInstantiate;
            if (bundleIAuthTabCallback3 != null) {
            }
        }
        int i18 = asInterface + 43;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        return ussBenefitFragment;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        Object obj = null;
        if (cArr2 != null) {
            int i4 = $10 + 109;
            int i5 = i4 % 128;
            $11 = i5;
            int i6 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i5 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 31;
                $10 = i10 % 128;
                if (i10 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 77 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        i9 %= 1;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), KeyEvent.getDeadChar(0, 0) + 77, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                    i2 = 2;
                    obj = null;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        double d = 0.0d;
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 75 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16037 - View.MeasureSpec.makeMeasureSpec(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallbackDefault) {
            int i11 = $11 + 27;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $11 + 11;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, 12214 - View.getDefaultSize(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)) + 63, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            d = 0.0d;
        }
        objArr[0] = new String(cArr6);
    }
}
