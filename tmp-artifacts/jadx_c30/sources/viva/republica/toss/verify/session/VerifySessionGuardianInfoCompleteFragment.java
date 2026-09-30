package viva.republica.toss.verify.session;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.accessgetProtocolp;
import o.createPaints;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifySessionGuardianInfoCompleteFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = {-2125798023, -1883186982, -983055938, -596638915, -835992709, -1740249021, 430105066, -1825024237, -585021424, -1203225638, -1940847670, 1962016953, 1480569338, 131266295, 661736552, 975747384, -454059563, 1051684822};
    private static int onNavigationEvent;
    private final Lazy IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new onWarmupCompleted(this), new IAuthTabCallback(null, this), new onExtraCallback(this));

    public static /* synthetic */ void onWarmupCompleted(VerifySessionGuardianInfoCompleteFragment verifySessionGuardianInfoCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(verifySessionGuardianInfoCompleteFragment, view);
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    private final VerifySessionViewModel onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return verifySessionViewModel;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult extends OnBackPressedCallback {
        final /* synthetic */ FragmentActivity onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(FragmentActivity fragmentActivity) {
            super(true);
            this.onExtraCallback = fragmentActivity;
        }

        public void handleOnBackPressed() {
            this.onExtraCallback.finish();
        }
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onAttach(context);
        hideSoftKeyboard();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, BuildConfig.FLAVOR);
        fragmentActivityRequireActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new onExtraCallbackWithResult(fragmentActivityRequireActivity));
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(VerifySessionGuardianInfoCompleteFragment verifySessionGuardianInfoCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel.IAuthTabCallback(verifySessionGuardianInfoCompleteFragment.onExtraCallback(), (Function1) null, (Function1) null, 3, (Object) null);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        int iOnWarmupCompleted = accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iOnWarmupCompleted);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP5);
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP3);
        tdsTopV1View.setUpperText(getString(R.string.teens_guardian_agreement_complete));
        tdsTopV1View.setLowerText(getString(R.string.teens_guardian_agreement_complete_info, new Object[]{createPaints.IAuthTabCallback.asBinder()}));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        DisplayMetrics displayMetrics = lottieAnimationView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
        layoutParams2.height = varyMatches.onNavigationEvent(210, displayMetrics);
        layoutParams2.weight = 1.0f;
        lottieAnimationView.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        Object[] objArr = new Object[1];
        a(new int[]{-1883834410, 731005832, -618513821, -359101231, -185481569, -483944557, 1347887167, 1175242436, -1519477063, 1100545668, -277221282, 1534097911, 1221814328, -2012221521, 66129825, 328342475, 640483582, 1965909891, 1703838144, -680606347, 210429162, 685838479, -205935793, 1343005352, 370991047, 647394656, -355258423, 1769936407, -481933556, 2015728533, -1572257235, 1263080622, 537076635, -819939274, -880938393, -1715770281, 1608834992, 1814298976}, 74 - Color.argb(0, 0, 0, 0), objArr);
        Object obj = null;
        zzck.onExtraCallback(lottieAnimationView, ((String) objArr[0]).intern(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, lottieAnimationView);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context2);
        String string = getString(R.string.next);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.verify.session.VerifySessionGuardianInfoCompleteFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifySessionGuardianInfoCompleteFragment.onWarmupCompleted(this.f$0, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 72, 8848 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i6 = $11 + 107;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 117;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = Integer.valueOf(iArr6[i7]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(i4, i4), 73 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 8848 - Color.argb(i4, i4, i4, i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7 <<= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i7])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 71, 8848 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i7++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                i4 = 0;
            }
            iArr6 = iArr2;
        }
        int i9 = i4;
        System.arraycopy(iArr6, i9, iArr5, i9, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i9] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 51;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i10];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionType(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, (ViewConfiguration.getTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 4033), Color.argb(0, 0, 0, 0) + 78, Process.getGidForName(BuildConfig.FLAVOR) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }
}
