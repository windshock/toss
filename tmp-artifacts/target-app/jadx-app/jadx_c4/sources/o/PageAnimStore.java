package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.base.UIKitBaseFragment;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageAnimStore {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i6 | i3)) | (~(i7 | i9));
        int i12 = ~(i9 | i4 | i3);
        int i13 = i4 + i3 + i + ((-194346734) * i5) + (9035316 * i2);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i4) - 443744256) + ((-1492047866) * i3) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i) + (1190920192 * i5) + (1456996352 * i2) + ((-1774911488) * i14);
        int i16 = (i4 * 1174986172) + 1294669563 + (i3 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i * 1174986385) + (i5 * (-1060063438)) + (i2 * 107475828) + (i14 * 168099840);
        return i15 + ((i16 * i16) * 40566784) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        LinkedList linkedList = new LinkedList(list);
        while (true) {
            Object obj = null;
            if (linkedList.isEmpty()) {
                return null;
            }
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = ((Fragment) linkedList.poll()) instanceof WebViewContentOwner;
                throw null;
            }
            Fragment fragment = (Fragment) linkedList.poll();
            if ((fragment instanceof WebViewContentOwner) && fragment.isVisible()) {
                int i3 = onWarmupCompleted + 27;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return fragment;
                }
                obj.hashCode();
                throw null;
            }
            if (fragment != null) {
                List listOnActivityLayout = fragment.getChildFragmentManager().onActivityLayout();
                Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                linkedList.addAll(listOnActivityLayout);
            }
        }
    }

    public static /* synthetic */ void onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Intent intent, int i, Bundle bundle, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
            int i6 = i4 + 99;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 5;
            }
            bundle = null;
        }
        onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, i, bundle);
    }

    public static final void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Intent intent, int i, @Nullable Bundle bundle) {
        Fragment fragment;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        List listOnActivityLayout;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(intent, "");
        UIKitBaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        ComponentActivity context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        Object obj = null;
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (listOnActivityLayout = supportFragmentManager.onActivityLayout()) == null) {
            fragment = null;
        } else {
            fragment = (Fragment) onExtraCallback(new Object[]{listOnActivityLayout}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -661637604, 661637604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseActivity) {
            int i5 = IAuthTabCallback + 47;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ((UIKitBaseActivity) r8lambdakrhaimf1bm5cgjbilhp45vln_xq).startActivityForResult(intent, i, bundle);
            return;
        }
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseFragment) {
            ((UIKitBaseFragment) r8lambdakrhaimf1bm5cgjbilhp45vln_xq).startActivityForResult(intent, i, bundle);
            return;
        }
        if (fragment != null) {
            int i7 = IAuthTabCallback + 19;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                fragment.startActivityForResult(intent, i, bundle);
                return;
            } else {
                fragment.startActivityForResult(intent, i, bundle);
                throw null;
            }
        }
        if (context instanceof UIKitBaseActivity) {
            int i8 = onWarmupCompleted + 17;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (context instanceof WebViewContentOwner) {
                context.startActivityForResult(intent, i, bundle);
                return;
            }
        }
        if (!(activity instanceof UIKitBaseActivity)) {
            throw new RuntimeException("unsupported contentOwner:" + r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
        int i10 = IAuthTabCallback + 21;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i, bundle);
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, IntentSender intentSender, int i, Bundle bundle, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 5;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            if (i7 % 2 != 0) {
                int i9 = 86 / 0;
            }
            int i10 = i8 + 107;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            bundle = null;
        }
        Object[] objArr = {r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentSender, Integer.valueOf(i), bundle};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallback(objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -336362763, 336362764, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Fragment fragment;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        UIKitBaseActivity uIKitBaseActivity = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[0];
        IntentSender intentSender = (IntentSender) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Bundle bundle = (Bundle) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uIKitBaseActivity, "");
        Intrinsics.checkNotNullParameter(intentSender, "");
        UIKitBaseActivity activity = uIKitBaseActivity.getActivity();
        UIKitBaseActivity context = uIKitBaseActivity.getContext();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            List listOnActivityLayout = supportFragmentManager.onActivityLayout();
            if (listOnActivityLayout != null) {
                int i4 = IAuthTabCallback + 61;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                    fragment = (Fragment) onExtraCallback(new Object[]{listOnActivityLayout}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -661637604, 661637604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                } else {
                    fragment = (Fragment) onExtraCallback(new Object[]{listOnActivityLayout}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -661637604, 661637604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
            }
        }
        if (uIKitBaseActivity instanceof UIKitBaseActivity) {
            int i6 = onWarmupCompleted + 123;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            uIKitBaseActivity.startIntentSenderForResult(intentSender, iIntValue, (Intent) null, 0, 0, 0, bundle);
            return null;
        }
        if (uIKitBaseActivity instanceof UIKitBaseFragment) {
            ((UIKitBaseFragment) uIKitBaseActivity).startIntentSenderForResult(intentSender, iIntValue, (Intent) null, 0, 0, 0, bundle);
            return null;
        }
        if (fragment != null) {
            fragment.startIntentSenderForResult(intentSender, iIntValue, (Intent) null, 0, 0, 0, bundle);
            return null;
        }
        if (activity instanceof UIKitBaseActivity) {
            int i8 = IAuthTabCallback + 21;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            activity.startIntentSenderForResult(intentSender, iIntValue, (Intent) null, 0, 0, 0, bundle);
            return null;
        }
        if (context instanceof UIKitBaseActivity) {
            context.startIntentSenderForResult(intentSender, iIntValue, (Intent) null, 0, 0, 0, bundle);
            return null;
        }
        throw new RuntimeException("unsupported contentOwner:" + uIKitBaseActivity);
    }

    public static /* synthetic */ void IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Intent intent, Bundle bundle, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 71;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            bundle = null;
        }
        onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Intent intent, @Nullable Bundle bundle) {
        Fragment fragment;
        List listOnActivityLayout;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(intent, "");
        UIKitBaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        UIKitBaseActivity context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        Object obj = null;
        if (activity != null) {
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                activity.getSupportFragmentManager();
                obj.hashCode();
                throw null;
            }
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = activity.getSupportFragmentManager();
            if (supportFragmentManager == null || (listOnActivityLayout = supportFragmentManager.onActivityLayout()) == null) {
                fragment = null;
            } else {
                fragment = (Fragment) onExtraCallback(new Object[]{listOnActivityLayout}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -661637604, 661637604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        }
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseActivity) {
            int i3 = IAuthTabCallback + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                ((UIKitBaseActivity) r8lambdakrhaimf1bm5cgjbilhp45vln_xq).startActivity(intent, bundle);
                return;
            } else {
                ((UIKitBaseActivity) r8lambdakrhaimf1bm5cgjbilhp45vln_xq).startActivity(intent, bundle);
                obj.hashCode();
                throw null;
            }
        }
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseFragment) {
            ((UIKitBaseFragment) r8lambdakrhaimf1bm5cgjbilhp45vln_xq).startActivity(intent, bundle);
            return;
        }
        if (fragment != null) {
            fragment.startActivity(intent, bundle);
            return;
        }
        if (!(activity instanceof UIKitBaseActivity)) {
            if (context instanceof UIKitBaseActivity) {
                context.startActivity(intent, bundle);
                return;
            }
            throw new RuntimeException("unsupported contentOwner:" + r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        activity.startActivity(intent, bundle);
        int i6 = onWarmupCompleted + 5;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final RxPermissions onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            boolean z = r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseActivity;
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        FragmentActivity context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseActivity) {
            return new RxPermissions((FragmentActivity) r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UIKitBaseFragment) {
            return new RxPermissions((Fragment) r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
        if (activity instanceof UIKitBaseActivity) {
            return new RxPermissions(activity);
        }
        if (!(context instanceof UIKitBaseActivity)) {
            throw new IllegalStateException("unexpected");
        }
        RxPermissions rxPermissions = new RxPermissions(context);
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return rxPermissions;
    }

    public static final boolean onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            boolean z = r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof setTopGuideFont;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof setTopGuideFont) {
            return true;
        }
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext() instanceof setTopGuideFont;
            obj.hashCode();
            throw null;
        }
        if ((r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext() instanceof setTopGuideFont) || (r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity() instanceof setTopGuideFont)) {
            return true;
        }
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final setTopGuideFont onNavigationEvent(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        setTopGuideFont settopguidefont;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Object obj = null;
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof setTopGuideFont) {
            settopguidefont = (setTopGuideFont) r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        } else {
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            settopguidefont = null;
        }
        if (settopguidefont == null) {
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Object context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            settopguidefont = context instanceof setTopGuideFont ? (setTopGuideFont) context : null;
            if (settopguidefont == null) {
                int i6 = IAuthTabCallback + 13;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                setTopGuideFont activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
                if (i7 == 0) {
                    boolean z = activity instanceof setTopGuideFont;
                    throw null;
                }
                if (!(activity instanceof setTopGuideFont)) {
                    return null;
                }
                int i8 = onWarmupCompleted + 59;
                IAuthTabCallback = i8 % 128;
                setTopGuideFont settopguidefont2 = activity;
                if (i8 % 2 == 0) {
                    return settopguidefont2;
                }
                obj.hashCode();
                throw null;
            }
        }
        return settopguidefont;
    }

    public static final setCallBack IAuthTabCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        setCallBack setcallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof setCallBack) {
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            setcallback = (setCallBack) r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        } else {
            setcallback = null;
        }
        if (setcallback == null) {
            int i3 = IAuthTabCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context instanceof setCallBack) {
                setcallback = (setCallBack) context;
            } else {
                int i5 = onWarmupCompleted + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                setcallback = null;
            }
            if (setcallback == null) {
                int i7 = onWarmupCompleted + 33;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                setCallBack activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
                if (i8 != 0) {
                    boolean z = activity instanceof setCallBack;
                    throw null;
                }
                if (activity instanceof setCallBack) {
                    return activity;
                }
                return null;
            }
        }
        return setcallback;
    }

    public static final Fragment onExtraCallback(@NotNull List<? extends Fragment> list) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Fragment) onExtraCallback(new Object[]{list}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -661637604, 661637604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static final void IAuthTabCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull IntentSender intentSender, int i, @Nullable Bundle bundle) {
        Object[] objArr = {r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentSender, Integer.valueOf(i), bundle};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallback(objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -336362763, 336362764, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }
}
