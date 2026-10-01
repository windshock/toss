package im.toss.features.loan.refinancing.funnel.input;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.gson.JsonObject;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.base.BaseActivity;
import im.toss.features.loan.common.LoanApplicationTermsWebViewFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingScrapingHandleActivity$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncoderImplExternalSyntheticLambda3;
import o.RightClickGesturesKtonRightClickDown2;
import o.RsaUtil;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TraceDebugEngineImpl;
import o.clearWrite;
import o.disableImageViewPreallocationAndroid;
import o.getEmbedViewManager;
import o.getKekid;
import o.nSetPosition;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingScrapingHandleActivity extends Hilt_LoanRefinancingScrapingHandleActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallback = 0;
    private static char[] access000 = null;
    public static final int asInterface;
    private static boolean extraCallback = false;
    private static int extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int onMessageChannelReady = 0;
    private static int readTypedObject = 1;
    private static boolean writeTypedObject;

    @Inject
    public zzag tossClock;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy access100 = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(LoanRefinancingViewModel.class), new IAuthTabCallbackDefault(this), new asBinder(this), new onTransact(null, this));
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda0(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda1(this));
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda2(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda3(this));
    private final onExtraCallback IAuthTabCallbackStubProxy = new onExtraCallback();
    private final IAuthTabCallback asBinder = new IAuthTabCallback();

    static final /* synthetic */ class onExtraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onNavigationEvent + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.invoke(obj);
                int i3 = 23 / 0;
            } else {
                this.onExtraCallback.invoke(obj);
            }
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        asInterface = 8;
        int i = onMessageChannelReady + 61;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i4 | i | i3);
        int i8 = ~i4;
        int i9 = ~i;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i4 + i + i5 + (105149790 * i6) + ((-719480883) * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * (-424837635)) + 281018368 + ((-424837635) * i) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i5) + ((-654311424) * i6) + (1702887424 * i2) + ((-155189248) * i15);
        int i17 = (i4 * 910058005) + 1460508013 + (i * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i5 * 910058489) + (i6 * (-759332242)) + (i2 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? onExtraCallbackWithResult(objArr) : asBinder(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-1278826395, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity, bool}, 1278826398, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
        int i4 = extraCallbackWithResult + 123;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingScrapingHandleActivity, str);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ SubsamplingScaleImageViewDefaultOnStateChangedListener IAuthTabCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerOnWarmupCompleted = onWarmupCompleted(loanRefinancingScrapingHandleActivity);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return subsamplingScaleImageViewDefaultOnStateChangedListenerOnWarmupCompleted;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean zBooleanValue;
        LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) IAuthTabCallback(1620845915, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity}, -1620845914, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3)).booleanValue();
            int i3 = 65 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) IAuthTabCallback(1620845915, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{loanRefinancingScrapingHandleActivity}, -1620845914, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingScrapingHandleActivity, bool);
        int i4 = readTypedObject + 85;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingScrapingHandleActivity, th);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder(loanRefinancingScrapingHandleActivity);
        int i4 = extraCallbackWithResult + 89;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zAsBinder;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str;
        LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {loanRefinancingScrapingHandleActivity};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        if (i3 != 0) {
            str = (String) IAuthTabCallback(1569828634, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, objArr2, -1569828634, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
            int i4 = 6 / 0;
        } else {
            str = (String) IAuthTabCallback(1569828634, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, objArr2, -1569828634, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
        }
        int i5 = readTypedObject + 5;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 13;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 23;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class onWarmupCompleted implements Function0<TraceDebugEngineImpl> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Activity onWarmupCompleted;

        public onWarmupCompleted(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }

        public final TraceDebugEngineImpl onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            TraceDebugEngineImpl traceDebugEngineImplOnExtraCallback = TraceDebugEngineImpl.onExtraCallback(layoutInflater);
            int i4 = onExtraCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return traceDebugEngineImplOnExtraCallback;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingScrapingHandleActivity.onExtraCallbackWithResult(intent);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        loanRefinancingScrapingHandleActivity.IAuthTabCallback(intent);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 115;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final TraceDebugEngineImpl updateVisuals() {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        TraceDebugEngineImpl traceDebugEngineImpl = (TraceDebugEngineImpl) value;
        int i4 = readTypedObject + 97;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return traceDebugEngineImpl;
    }

    private final LoanRefinancingViewModel access200() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingViewModel loanRefinancingViewModel = (LoanRefinancingViewModel) this.access100.getValue();
        int i4 = readTypedObject + 65;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return loanRefinancingViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = baseActivity.getIntent();
        if (i3 != 0) {
            int i4 = 65 / 0;
            if (intent == null) {
                return "";
            }
        } else if (intent == null) {
            return "";
        }
        int i5 = readTypedObject + 17;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        String stringExtra = intent.getStringExtra("EXTRA_URI");
        return stringExtra != null ? stringExtra : "";
    }

    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallback_Parcel.getValue();
        int i4 = readTypedObject + 87;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    private final SubsamplingScaleImageViewDefaultOnStateChangedListener ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) this.IAuthTabCallbackStub.getValue();
        int i4 = readTypedObject + 115;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return subsamplingScaleImageViewDefaultOnStateChangedListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final SubsamplingScaleImageViewDefaultOnStateChangedListener onWarmupCompleted(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int i = 2 % 2;
        Intent intent = loanRefinancingScrapingHandleActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (Parcelable) EncoderImplExternalSyntheticLambda3.onWarmupCompleted(intent, "EXTRA_INPUT_DATA", SubsamplingScaleImageViewDefaultOnStateChangedListener.class);
        if (subsamplingScaleImageViewDefaultOnStateChangedListener == null) {
            SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener2 = new SubsamplingScaleImageViewDefaultOnStateChangedListener((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Triple) null, (Triple) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, false, (LoanFunnelType) null, 1048575, (DefaultConstructorMarker) null);
            int i2 = extraCallbackWithResult + 109;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return subsamplingScaleImageViewDefaultOnStateChangedListener2;
        }
        int i4 = readTypedObject + 63;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return subsamplingScaleImageViewDefaultOnStateChangedListener;
        }
        throw null;
    }

    private final boolean ICustomTabsServiceDefault() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.getInterfaceDescriptor.getValue()).booleanValue();
            int i3 = 5 / 0;
        } else {
            zBooleanValue = ((Boolean) this.getInterfaceDescriptor.getValue()).booleanValue();
        }
        int i4 = extraCallbackWithResult + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean asBinder(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        return loanRefinancingScrapingHandleActivity.getIntent().getBooleanExtra("reserveScreen", i2 % 2 != 0);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseActivity baseActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = baseActivity.getIntent().getBooleanExtra("isBizRefinancing", false);
        int i4 = readTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(booleanExtra);
    }

    private final boolean ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) this.IAuthTabCallbackDefault.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackDefault.getValue()).booleanValue();
        int i3 = extraCallbackWithResult + 99;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return zBooleanValue;
    }

    public final zzag onNavigationEvent() {
        int i = 2 % 2;
        zzag zzagVar = this.tossClock;
        Object obj = null;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = extraCallbackWithResult + 35;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 0 / 0;
            }
            return null;
        }
        int i4 = readTypedObject;
        int i5 = i4 + 97;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 119;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return zzagVar;
    }

    public static final class onExtraCallback extends BroadcastReceiver {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int asInterface = 0;
        private static char onExtraCallback = 36159;
        private static char onExtraCallbackWithResult = 49455;
        private static char onNavigationEvent = 49172;
        private static char onWarmupCompleted = 47657;

        onExtraCallback() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 21;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            String action = intent != null ? intent.getAction() : null;
            a(new char[]{38686, 11827, 35688, 21481, 3071, 3633, 14177, 40913, 64206, 38650, 49693, 37337, 17430, 37181, 62269, 64114, 24219, 39143, 48383, 55007}, (Process.myPid() >> 22) + 19, new Object[1]);
            if (!(!Intrinsics.areEqual(((String) r5[0]).intern(), action))) {
                LoanRefinancingScrapingHandleActivity.this.setResult(-1, intent);
                LoanRefinancingScrapingHandleActivity.this.finish();
            }
            int i4 = asBinder + 23;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i7 = $11 + 41;
                $10 = i7 % 128;
                int i8 = 58224;
                if (i7 % 2 != 0) {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    i2 = 1;
                } else {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    i2 = i4;
                }
                while (i2 < 16) {
                    int i9 = $10 + 55;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i11 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i12 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i12);
                        objArr2[1] = Integer.valueOf(i11);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            int i13 = 10 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1));
                            int maximumDrawingCacheSize = 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), i13, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, MotionEvent.axisFromString("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.indexOf((CharSequence) "", '0')), 13 - TextUtils.indexOf((CharSequence) "", '0'), 19901 - KeyEvent.keyCodeFromString(""), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i4 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final class IAuthTabCallback extends BroadcastReceiver {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallback() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual("receiveLoanScraping", intent != null ? intent.getAction() : null)) {
                int i3 = onExtraCallbackWithResult + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (Intrinsics.areEqual(intent.getStringExtra("loanComparisonScrapingType"), "HEALTH_INSURANCE_SCRAPE")) {
                    int i5 = onExtraCallback + 43;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        LoanRefinancingScrapingHandleActivity.IAuthTabCallback(LoanRefinancingScrapingHandleActivity.this, intent);
                        return;
                    } else {
                        LoanRefinancingScrapingHandleActivity.IAuthTabCallback(LoanRefinancingScrapingHandleActivity.this, intent);
                        throw null;
                    }
                }
                LoanRefinancingScrapingHandleActivity.onExtraCallbackWithResult(LoanRefinancingScrapingHandleActivity.this, intent);
            }
        }
    }

    public static final class asBinder implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public asBinder(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onExtraCallback.getDefaultViewModelProviderFactory();
            int i4 = onWarmupCompleted + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            if (i3 != 0) {
                int i4 = 29 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.IAuthTabCallback.getViewModelStore();
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onNavigationEvent;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onNavigationEvent = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.onWarmupCompleted;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                return this.onNavigationEvent.getDefaultViewModelCreationExtras();
            }
            int i4 = onExtraCallbackWithResult + 49;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 55;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(Intent intent) throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-121, -116, -121, -117, -118, -119, -126, -120, -121, -122, -123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023873).substring(0, 4).codePointAt(2) + 91, objArr);
            String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
            if (stringExtra == null) {
                int i2 = extraCallbackWithResult + 119;
                readTypedObject = i2 % 128;
                int i3 = i2 % 2;
                stringExtra = "";
            }
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-121, -116, -121, -115}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 9, objArr2);
            JsonObject jsonObjectOnNavigationEvent = onNavigationEvent(stringExtra, ((String) objArr2[0]).intern());
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(stringExtra, "verifyTs");
            if (!(!jsonObjectOnNavigationEvent.isJsonObject())) {
                int i4 = extraCallbackWithResult + 49;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (jsonObjectOnNavigationEvent.getAsJsonObject().size() != 0) {
                    if (ICustomTabsService_Parcel()) {
                        Intent intent2 = new Intent();
                        Object[] objArr3 = new Object[1];
                        a(null, null, new byte[]{-121, -116, -121, -117, -118, -119, -126, -120, -121, -122, -123, -124, -125, -126, -127}, ExpandableListView.getPackedPositionGroup(0L) + 127, objArr3);
                        setResult(-1, intent2.putExtra(((String) objArr3[0]).intern(), jsonObjectOnNavigationEvent.toString()).putExtra("EXTRA_VERIFIED_TS", strOnExtraCallbackWithResult));
                        finish();
                        return;
                    }
                    if (ICustomTabsServiceDefault()) {
                        LoanRefinancingViewModel loanRefinancingViewModelAccess200 = access200();
                        JsonObject asJsonObject = jsonObjectOnNavigationEvent.getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        loanRefinancingViewModelAccess200.onNavigationEvent(asJsonObject, LoanFunnelType.BUSINESS_NTS_SCRAPE);
                        return;
                    }
                    LoanRefinancingViewModel loanRefinancingViewModelAccess2002 = access200();
                    JsonObject asJsonObject2 = jsonObjectOnNavigationEvent.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                    loanRefinancingViewModelAccess2002.IAuthTabCallback(asJsonObject2, LoanFunnelType.BUSINESS_NTS_SCRAPE);
                    return;
                }
            }
            JsonObject jsonObjectOnNavigationEvent2 = onNavigationEvent(stringExtra, ApiDowngradeLogger.EXT_KEY_ERROR_CODE);
            JsonObject asJsonObject3 = jsonObjectOnNavigationEvent2.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
            String strIAuthTabCallback = getEmbedViewManager.IAuthTabCallback(asJsonObject3, "code", "");
            JsonObject asJsonObject4 = jsonObjectOnNavigationEvent2.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-113, -118, -121, -112, -112, -113, -114}, 126 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
            String strIAuthTabCallback2 = getEmbedViewManager.IAuthTabCallback(asJsonObject4, ((String) objArr4[0]).intern(), "");
            if (!Intrinsics.areEqual(strIAuthTabCallback, "LOAN_BIZ_SCRAPING_FALLBACK")) {
                Intent intentPutExtra = new Intent().putExtra("code", strIAuthTabCallback);
                Object[] objArr5 = new Object[1];
                a(null, null, new byte[]{-113, -118, -121, -112, -112, -113, -114}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 108, objArr5);
                setResult(0, intentPutExtra.putExtra(((String) objArr5[0]).intern(), strIAuthTabCallback2).putExtra("funnelType", "BUSINESS_NTS_SCRAPE").putExtra("EXTRA_VERIFIED_TS", strOnExtraCallbackWithResult));
                finish();
                return;
            }
            setResult(0, new Intent().putExtra("backPressed", false).putExtra("EXTRA_VERIFIED_TS", strOnExtraCallbackWithResult));
            finish();
            int i6 = readTypedObject + 99;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 22 / 0;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanRefinancingFunnelActivity", "biz scraping " + e.getMessage(), e, (Map) null, 8, (Object) null);
            setResult(0, new Intent().putExtra("backPressed", false));
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Intent intent) throws Throwable {
        int i = 2 % 2;
        try {
            Object obj = null;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-121, -116, -121, -117, -118, -119, -126, -120, -121, -122, -123, -124, -112, -126, -111, -119}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 108, objArr);
            String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
            if (stringExtra == null) {
                stringExtra = "";
            }
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-121, -116, -121, -115}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr2);
            JsonObject jsonObjectOnNavigationEvent = onNavigationEvent(stringExtra, ((String) objArr2[0]).intern());
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(stringExtra, "verifyTs");
            JsonObject jsonObjectOnNavigationEvent2 = onNavigationEvent(stringExtra, "automobileInfo");
            access200().IAuthTabCallback_Parcel().access000(strOnExtraCallbackWithResult);
            access200().IAuthTabCallback_Parcel().onExtraCallback("");
            access200().IAuthTabCallback_Parcel().onNavigationEvent(Long.valueOf(onNavigationEvent().IAuthTabCallbackDefault()));
            if (DERSet.onExtraCallback.AudioAttributesImplBaseParcelizer() == 2) {
                int i2 = readTypedObject + 27;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    jsonObjectOnNavigationEvent2.isJsonObject();
                    obj.hashCode();
                    throw null;
                }
                if (jsonObjectOnNavigationEvent2.isJsonObject() && jsonObjectOnNavigationEvent2.getAsJsonObject().size() != 0) {
                    int i3 = extraCallbackWithResult + 11;
                    readTypedObject = i3 % 128;
                    if (i3 % 2 == 0) {
                        access200().IAuthTabCallback_Parcel().IAuthTabCallback(jsonObjectOnNavigationEvent2.toString());
                        obj.hashCode();
                        throw null;
                    }
                    access200().IAuthTabCallback_Parcel().IAuthTabCallback(jsonObjectOnNavigationEvent2.toString());
                }
            }
            if (jsonObjectOnNavigationEvent.isJsonObject()) {
                int i4 = extraCallbackWithResult + 39;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (jsonObjectOnNavigationEvent.getAsJsonObject().size() != 0) {
                    if (ICustomTabsServiceDefault()) {
                        LoanRefinancingViewModel loanRefinancingViewModelAccess200 = access200();
                        JsonObject asJsonObject = jsonObjectOnNavigationEvent.getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        loanRefinancingViewModelAccess200.onNavigationEvent(asJsonObject, LoanFunnelType.HEALTH_INSURANCE_SCRAPE);
                        return;
                    }
                    LoanRefinancingViewModel loanRefinancingViewModelAccess2002 = access200();
                    JsonObject asJsonObject2 = jsonObjectOnNavigationEvent.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                    loanRefinancingViewModelAccess2002.IAuthTabCallback(asJsonObject2, LoanFunnelType.HEALTH_INSURANCE_SCRAPE);
                    return;
                }
                int i6 = extraCallbackWithResult + 39;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
            JsonObject jsonObjectOnNavigationEvent3 = onNavigationEvent(stringExtra, ApiDowngradeLogger.EXT_KEY_ERROR_CODE);
            JsonObject asJsonObject3 = jsonObjectOnNavigationEvent3.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
            String strIAuthTabCallback = getEmbedViewManager.IAuthTabCallback(asJsonObject3, "code", "");
            JsonObject asJsonObject4 = jsonObjectOnNavigationEvent3.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-113, -118, -121, -112, -112, -113, -114}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022750).substring(0, 5).length() + 122, objArr3);
            String strIAuthTabCallback2 = getEmbedViewManager.IAuthTabCallback(asJsonObject4, ((String) objArr3[0]).intern(), "");
            Intent intentPutExtra = new Intent().putExtra("code", strIAuthTabCallback);
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-113, -118, -121, -112, -112, -113, -114}, 126 - ExpandableListView.getPackedPositionChild(0L), objArr4);
            setResult(0, intentPutExtra.putExtra(((String) objArr4[0]).intern(), strIAuthTabCallback2).putExtra("funnelType", "HEALTH_INSURANCE_SCRAPE").putExtra("EXTRA_VERIFIED_TS", strOnExtraCallbackWithResult).putExtra("automobileInfo", (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(2037626876, -2037626871, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{access200().IAuthTabCallback_Parcel()})));
            finish();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanRefinancingFunnelActivity", "nhis scraping " + e.getMessage(), e, (Map) null, 8, (Object) null);
            setResult(0, new Intent().putExtra("backPressed", false));
            finish();
        }
    }

    private final JsonObject onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        Object[] objArr = {RsaUtil.onNavigationEvent, str};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        JsonObject asJsonObject = getEmbedViewManager.IAuthTabCallback((JsonObject) RsaUtil.IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), objArr, -1025874369, 1025874369, iOnExtraCallback2), "params", new JsonObject()).getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        JsonObject jsonObjectIAuthTabCallback = getEmbedViewManager.IAuthTabCallback(asJsonObject, str2, new JsonObject());
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return jsonObjectIAuthTabCallback;
    }

    private final String onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        Object[] objArr = {RsaUtil.onNavigationEvent, str};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        JsonObject asJsonObject = getEmbedViewManager.IAuthTabCallback((JsonObject) RsaUtil.IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), objArr, -1025874369, 1025874369, iOnExtraCallback2), "params", new JsonObject()).getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        String strIAuthTabCallback = getEmbedViewManager.IAuthTabCallback(asJsonObject, str2, "");
        int i2 = readTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return strIAuthTabCallback;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = access000;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myPid() >> 22) + 77, TextUtils.getCapsMode("", 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
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
        try {
            Object[] objArr3 = {Integer.valueOf(ICustomTabsCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 75, 16038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (!(!extraCallback)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 63, Color.green(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!writeTypedObject) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i8 = $10 + 49;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = $10 + 85;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr6 = new char[i2];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().onWarmupCompleted());
        ConstraintLayout constraintLayoutOnWarmupCompleted = updateVisuals().onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnWarmupCompleted, (View) null, (View) null, (View) null, true, 7, (Object) null);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        onExtraCallback onextracallback = this.IAuthTabCallbackStubProxy;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-116, -122, -113, -108, -116, -119, -113, -115, -126, -112, -113, -109, -113, -110, -126, -113, -123, -113, -122}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022753).substring(0, 5).length() + 122, objArr);
        localBroadcastManager.registerReceiver(onextracallback, new IntentFilter(((String) objArr[0]).intern()));
        LocalBroadcastManager.getInstance(this).registerReceiver(this.asBinder, new IntentFilter("receiveLoanScraping"));
        getSupportFragmentManager().onExtraCallbackWithResult().onWarmupCompleted(updateVisuals().onWarmupCompleted.getId(), LoanApplicationTermsWebViewFragment.onWarmupCompleted.onExtraCallback(LoanApplicationTermsWebViewFragment.Companion, validateRelationship(), null, null, false, 14, null)).onExtraCallbackWithResult();
        ICustomTabsServiceStubProxy();
        Object[] objArr2 = {access200(), ICustomTabsServiceStub()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -889473517, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 889473523, iOnNavigationEvent2, objArr2);
        int i2 = readTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            loanRefinancingScrapingHandleActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = extraCallbackWithResult + 53;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        loanRefinancingScrapingHandleActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BaseActivity baseActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            if (bool.booleanValue()) {
                baseActivity.setResult(-1);
            } else {
                baseActivity.setResult(0, new Intent().putExtra("FUNNEL_EXTRA_SCRAPING_FAILED", true));
                int i3 = readTypedObject + 85;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            baseActivity.finish();
            return Unit.INSTANCE;
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(str);
        if (!StringsKt.isBlank(str)) {
            loanRefinancingScrapingHandleActivity.setResult(-1, new Intent().putExtra("EXTRA_SCHEDULE_SUCCESS_MESSAGE", str));
            int i4 = readTypedObject + 89;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            loanRefinancingScrapingHandleActivity.setResult(0, new Intent().putExtra("FUNNEL_EXTRA_SCRAPING_FAILED", true));
        }
        loanRefinancingScrapingHandleActivity.finish();
        return Unit.INSTANCE;
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        access200().onPostMessage().observe(this, new onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda4(this)));
        access200().newSession().observe(this, new onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda5(this)));
        access200().isEngagementSignalsApiAvailable().observe(this, new onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda6(this)));
        access200().ICustomTabsServiceDefault().observe(this, new onExtraCallbackWithResult(new LoanRefinancingScrapingHandleActivity$.ExternalSyntheticLambda7(this)));
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Boolean bool) {
        int i = 2 % 2;
        if (!bool.booleanValue()) {
            loanRefinancingScrapingHandleActivity.bo_();
        } else {
            int i2 = readTypedObject + 47;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BaseActivity.IAuthTabCallback(loanRefinancingScrapingHandleActivity, (String) null, false, 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 69;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(124745969, nSetPosition.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1299197077, new Object[]{this}, -124745967, nSetPosition.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019321).substring(0, 4).length() - 1661995335);
            super.onDestroy();
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.IAuthTabCallbackStubProxy);
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.asBinder);
            return;
        }
        IAuthTabCallback(124745969, nSetPosition.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1299197077, new Object[]{this}, -124745967, nSetPosition.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019321).substring(0, 4).length() - 1661995335);
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.IAuthTabCallbackStubProxy);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.asBinder);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String path;
        BaseActivity baseActivity = (LoanRefinancingScrapingHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        File externalFilesDir = baseActivity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            int i4 = readTypedObject + 49;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                externalFilesDir.getPath();
                throw null;
            }
            path = externalFilesDir.getPath();
        } else {
            path = null;
        }
        File file = new File(path, "/LoanViewer/Temp");
        if (!file.exists()) {
            return null;
        }
        file.delete();
        return null;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, boolean z, @NotNull SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(subsamplingScaleImageViewDefaultOnStateChangedListener, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) LoanRefinancingScrapingHandleActivity.class).putExtra("EXTRA_INPUT_DATA", (Parcelable) subsamplingScaleImageViewDefaultOnStateChangedListener).putExtra("EXTRA_URI", str).putExtra("reserveScreen", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) LoanRefinancingScrapingHandleActivity.class).putExtra("EXTRA_URI", str).putExtra("isBizRefinancing", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return intentPutExtra;
            }
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(1418075910, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity}, -1418075905, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3)).booleanValue();
    }

    public static /* synthetic */ String onNavigationEvent(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(1235267033, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity}, -1235267029, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private final void setEngagementSignalsCallback() {
        IAuthTabCallback(124745969, nSetPosition.onExtraCallbackWithResult(), 1299197077 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), new Object[]{this}, -124745967, nSetPosition.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019321).substring(0, 4).length() - 1661995335);
    }

    private static final Unit onWarmupCompleted(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, Boolean bool) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1278826395, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity, bool}, 1278826398, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private static final boolean asInterface(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(1620845915, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity}, -1620845914, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3)).booleanValue();
    }

    private static final String IAuthTabCallbackDefault(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(1569828634, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{loanRefinancingScrapingHandleActivity}, -1569828634, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    @Override // im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallbackWithResult + 55;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
    }

    @Override // im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        access000 = new char[]{32504, 32497, 32480, 32463, 32511, 32488, 32505, 32490, 32500, 32499, 32478, 32494, 32510, 32501, 32509, 32495, 32498, 32492, 32456, 32479};
        ICustomTabsCallback = -1184334182;
        writeTypedObject = true;
        extraCallback = true;
    }
}
