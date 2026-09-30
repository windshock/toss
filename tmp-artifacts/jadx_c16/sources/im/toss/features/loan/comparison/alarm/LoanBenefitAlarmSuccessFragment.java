package im.toss.features.loan.comparison.alarm;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import im.toss.features.loan.comparison.alarm.LoanBenefitAlarmSuccessFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ComponentModelb;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.PageContext;
import o.RotationProvider1;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.access;
import o.access13800;
import o.access8100;
import o.addAllCommandLine;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.mediationData;
import o.parserDebugMode;
import o.preFillDefault;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanBenefitAlarmSuccessFragment extends Hilt_LoanBenefitAlarmSuccessFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static boolean asBinder = false;
    private static int asInterface = 1;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static boolean onTransact;

    @Inject
    public mediationData loanGatewayApis;
    private final Lazy onExtraCallbackWithResult;
    private final PageContext onWarmupCompleted;

    static {
        onExtraCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanBenefitAlarmSuccessFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRegularAlarmSuccessBinding;", 0)};
        Companion = new onWarmupCompleted(null);
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7);
        int i9 = ~i2;
        int i10 = ~(i9 | i6);
        int i11 = ~(i7 | i2);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i3);
        int i14 = (~(i3 | i7)) | i10 | i11;
        int i15 = i2 + i6 + i5 + (2052055731 * i) + (1687666023 * i4);
        int i16 = i15 * i15;
        int i17 = (i2 * (-1966771951)) + 1000013824 + ((-1966771951) * i6) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i5) + (632946688 * i) + ((-741212160) * i4) + (2121465856 * i16);
        int i18 = (i2 * 1533266457) + 1248777597 + (i6 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i5 * 1533266057) + (i * 706030027) + (i4 * 1023530015) + (i16 * (-2088042496));
        return i17 + ((i18 * i18) * 1434255360) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ String onExtraCallback(LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(loanBenefitAlarmSuccessFragment);
        }
        onWarmupCompleted(loanBenefitAlarmSuccessFragment);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setDetectableSize);
        }
        onWarmupCompleted(setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -55094650, iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 55094651, new Object[]{loanBenefitAlarmSuccessFragment, view});
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return 1249431L;
        }
        obj.hashCode();
        throw null;
    }

    public LoanBenefitAlarmSuccessFragment() {
        super(R.layout.fragment_loan_regular_alarm_success);
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new LoanBenefitAlarmSuccessFragment$.ExternalSyntheticLambda2(this));
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.IAuthTabCallback);
    }

    public final mediationData onExtraCallbackWithResult() {
        int i = 2 % 2;
        mediationData mediationdata = this.loanGatewayApis;
        if (mediationdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = asInterface;
        int i3 = i2 + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return mediationdata;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, parserDebugMode> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 23;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallbackWithResult() {
            super(1, parserDebugMode.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRegularAlarmSuccessBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                onWarmupCompleted(view);
                obj2.hashCode();
                throw null;
            }
            parserDebugMode parserdebugmodeOnWarmupCompleted = onWarmupCompleted(view);
            int i3 = onExtraCallback + 105;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return parserdebugmodeOnWarmupCompleted;
            }
            throw null;
        }

        public final parserDebugMode onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            parserDebugMode parserdebugmodeOnExtraCallback = parserDebugMode.onExtraCallback(view);
            int i4 = onExtraCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return parserdebugmodeOnExtraCallback;
        }
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.onExtraCallbackWithResult.getValue();
        int i3 = asInterface + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static final String onWarmupCompleted(LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = loanBenefitAlarmSuccessFragment.getArguments();
        if (arguments != null) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - View.MeasureSpec.getMode(0), objArr);
            String string = arguments.getString(((String) objArr[0]).intern());
            if (string != null) {
                int i4 = asInterface + 95;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return string;
            }
        }
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-123, -120, -121, -123, -122, -123, -124}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr2);
        return ((String) objArr2[0]).intern();
    }

    private final parserDebugMode asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 != 0 ? this.onWarmupCompleted.onExtraCallbackWithResult(this, onNavigationEvent[1]) : this.onWarmupCompleted.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        parserDebugMode parserdebugmode = (parserDebugMode) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = asInterface + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return parserdebugmode;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onTransact();
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1351182061, iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, -1351182061, new Object[]{this});
        int i4 = asInterface + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("agreed_yn", "N");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment = (LoanBenefitAlarmSuccessFragment) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1249433L, false, (String) null, (Map) null, new LoanBenefitAlarmSuccessFragment$.ExternalSyntheticLambda0(), 14, (Object) null);
        FragmentActivity activity = loanBenefitAlarmSuccessFragment.getActivity();
        Object obj = null;
        if (activity != null) {
            int i2 = asInterface + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            activity.finish();
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        parserDebugMode parserdebugmodeAsBinder = asBinder();
        parserdebugmodeAsBinder.onExtraCallback.asInterface().setOnClickListener(new LoanBenefitAlarmSuccessFragment$.ExternalSyntheticLambda1(this));
        TdsBottomCtaV1View tdsBottomCtaV1View = parserdebugmodeAsBinder.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        ScrollView scrollView = parserdebugmodeAsBinder.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, scrollView, false, 0, 6, (Object) null);
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, View.resolveSizeAndState(0, 0, 0) + 127, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), IAuthTabCallbackDefault()), getWrite.IAuthTabCallback("agreed_yn", "N")});
        int i4 = IAuthTabCallbackDefault + 117;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment = (LoanBenefitAlarmSuccessFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (Intrinsics.areEqual(loanBenefitAlarmSuccessFragment.IAuthTabCallbackDefault(), "my_loan_mgmt__mission_detail")) {
                maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(loanBenefitAlarmSuccessFragment, (access13800) null), 3, (Object) null);
                int i3 = asInterface + 49;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }
            return null;
        }
        Intrinsics.areEqual(loanBenefitAlarmSuccessFragment.IAuthTabCallbackDefault(), "my_loan_mgmt__mission_detail");
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = 7547193029730876747L;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 91;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $11 + 33;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 45812), TextUtils.indexOf((CharSequence) "", '0') + 85, 21233 - TextUtils.indexOf("", "", 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.MeasureSpec.getMode(0)), View.getDefaultSize(0, 0) + 19, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        public final LoanBenefitAlarmSuccessFragment onExtraCallbackWithResult(@NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment = new LoanBenefitAlarmSuccessFragment();
            Object[] objArr = new Object[1];
            a(new char[]{578, 5674, 59650, 560, 53256, 26090, 57605, 46005, 6956, 51515, 19661, 35462}, KeyEvent.normalizeMetaState(0) + 1, objArr);
            loanBenefitAlarmSuccessFragment.setArguments(RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)}));
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return loanBenefitAlarmSuccessFragment;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 77 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 76 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $10 + 49;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 63 - Color.green(0), 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr5);
            int i7 = $11 + 49;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                int i8 = 8 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (!onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $10 + 47;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0, 0)), 62 - ExpandableListView.getPackedPositionChild(0L), 12214 - (ViewConfiguration.getTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            c = '0';
            i4 = 1052772399;
        }
        objArr[0] = new String(cArr2);
    }

    private static final void onExtraCallbackWithResult(LoanBenefitAlarmSuccessFragment loanBenefitAlarmSuccessFragment, View view) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -55094650, iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 55094651, new Object[]{loanBenefitAlarmSuccessFragment, view});
    }

    private final void asInterface() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1351182061, iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, -1351182061, new Object[]{this});
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{32461, 32466, 32465, 32450, 32457, 32468, 32456, 32448};
        IAuthTabCallbackStub = -1184333953;
        onTransact = true;
        asBinder = true;
    }
}
