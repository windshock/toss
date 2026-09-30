package im.toss.features.mobileid.impl.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseActivity;
import im.toss.features.mobileid.impl.MobileIdIssueViewModel;
import im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinSdkInitializationConfigurationImplBuilderImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.Enable;
import o.ExtHubMetaInfoHelper;
import o.ExtHubUtils1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GraniteBrownfieldModule_closeView;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.M_;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TransitionTransitionNotificationExternalSyntheticLambda1;
import o.UTF8Decoder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addExtra;
import o.asDouble;
import o.clearWrite;
import o.deserializeFloat;
import o.findResAndMsg;
import o.getBigDecimal;
import o.getPackageType;
import o.getParamImp;
import o.getThisUpdate;
import o.getTypedExportedConstants;
import o.getUserData;
import o.getWrite;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isJSONTypeIgnore;
import o.isNumber;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.onRenderReady;
import o.readIntokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.supportWideGamut;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.securekey.SecureKeyboardView;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdIssueRrnFragment extends Hilt_MobileIdIssueRrnFragment implements SetDetectingInterval {
    private getPackageType IAuthTabCallback;

    @Inject
    public AppLovinSdkInitializationConfigurationImplBuilderImpl birthdayValidator;

    @Inject
    public zzad environments;
    private boolean onExtraCallback;
    private ExtHubUtils1 onWarmupCompleted;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public getBigDecimal walletErrorHandler;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int getInterfaceDescriptor = 1;
    private static char[] asBinder = {60817, 45870, 20676, 63072, 38685, 13473, 55894, 31743, 6291, 48697, 24528, 64867, 33311, 9149, 49503, 26341, 1958, 42322, 16564, 7681, 64996, 23365, 14908, 39326, 30575, 55002};
    private static long IAuthTabCallbackStub = 4955713980990403446L;
    private final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent = onPageExit.onNavigationEvent(this, new MobileIdIssueRrnFragment$.ExternalSyntheticLambda0(this));
    private final IEngagementSignalsCallback_Parcel<Intent> onExtraCallbackWithResult = onPageExit.onNavigationEvent(this, new MobileIdIssueRrnFragment$.ExternalSyntheticLambda1(this));
    private final Lazy onTransact = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(Class.forName("im.toss.features.mobileid.impl.MobileIdIssueViewModel")), new IAuthTabCallbackDefault(this), new asInterface(null, this), new IAuthTabCallbackStub(this));
    private final Lazy asInterface = isStopUpload.onExtraCallback(this, 1576901, (Function1) null, (Function1) null, 6, (Object) null);

    static final /* synthetic */ class asBinder implements deserializeFloat {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        asBinder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i3 + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i2 + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.invoke(obj);
                throw null;
            }
            this.onWarmupCompleted.invoke(obj);
            int i3 = IAuthTabCallback + 101;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 19 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = (b * 3) + 4;
        int i5 = i * 4;
        int i6 = (s * 2) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i8 = i7;
            int i9 = 0;
            i4 += -i8;
            i3++;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i4 += -i8;
            i3++;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(mobileIdIssueRrnFragment, view);
        int i4 = getInterfaceDescriptor + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault);
        int i3 = getInterfaceDescriptor + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault}, 1047429404, -1047429398, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
        int i4 = IAuthTabCallbackDefault + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(mobileIdIssueRrnFragment, view);
        int i4 = getInterfaceDescriptor + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i4)) | (~(i3 | i4));
        int i11 = i7 | i4;
        int i12 = i9 | i11;
        int i13 = i3 + i4 + i2 + ((-1542968645) * i6) + (1789173782 * i5);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i3) + 752877568 + ((-368479342) * i4) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i2) + (1802502144 * i6) + (148897792 * i5) + (289275904 * i14);
        int i16 = (i3 * (-930071408)) + 1959937684 + (i4 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i2 * (-930070801)) + (i6 * 1059663509) + (i5 * (-1428764534)) + (i14 * 484573184);
        switch (i15 + (i16 * i16 * 411172864)) {
            case 1:
                MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackDefault;
                int i19 = i18 + 75;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                ExtHubUtils1 extHubUtils1 = mobileIdIssueRrnFragment.onWarmupCompleted;
                ExtHubUtils1 extHubUtils12 = null;
                if (extHubUtils1 == null) {
                    int i21 = i18 + 109;
                    getInterfaceDescriptor = i21 % 128;
                    int i22 = i21 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    extHubUtils1 = null;
                }
                TdsBottomCtaV1View tdsBottomCtaV1View = extHubUtils1.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
                tdsBottomCtaV1View.setVisibility(iIntValue == 0 ? 8 : 0);
                ExtHubUtils1 extHubUtils13 = mobileIdIssueRrnFragment.onWarmupCompleted;
                if (extHubUtils13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i23 = IAuthTabCallbackDefault + 59;
                    getInterfaceDescriptor = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    extHubUtils12 = extHubUtils13;
                }
                extHubUtils12.onNavigationEvent.setVisibility(iIntValue);
                return Unit.INSTANCE;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(mobileIdIssueRrnFragment, view);
        }
        onWarmupCompleted(mobileIdIssueRrnFragment, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function0, gettypedexportedconstants, view);
        }
        IAuthTabCallback(function0, gettypedexportedconstants, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {mobileIdIssueRrnFragment, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2094760162, 2094760163, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
        int i5 = IAuthTabCallbackDefault + 53;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final class onTransact implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onTransact IAuthTabCallback = new onTransact();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 63;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return unit;
        }
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onWarmupCompleted + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onWarmupCompleted + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        public onExtraCallbackWithResult() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            if (editable == null || editable.length() != 0) {
                ExtHubUtils1 extHubUtils1IAuthTabCallback = MobileIdIssueRrnFragment.IAuthTabCallback(MobileIdIssueRrnFragment.this);
                if (extHubUtils1IAuthTabCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i2 = onNavigationEvent + 121;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    extHubUtils1IAuthTabCallback = null;
                }
                extHubUtils1IAuthTabCallback.IAuthTabCallback.setRrn7error(null);
                int i4 = onWarmupCompleted + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            MobileIdIssueRrnFragment mobileIdIssueRrnFragment = MobileIdIssueRrnFragment.this;
            boolean z = false;
            if (editable != null && editable.length() == 7) {
                z = true;
            }
            MobileIdIssueRrnFragment.onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment, Boolean.valueOf(z)}, 52603539, -52603535, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
            int i6 = onWarmupCompleted + 31;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ ExtHubUtils1 IAuthTabCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ExtHubUtils1 extHubUtils1 = mobileIdIssueRrnFragment.onWarmupCompleted;
        int i5 = i2 + 65;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return extHubUtils1;
    }

    public static final /* synthetic */ void onExtraCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.onExtraCallback = z;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = mobileIdIssueRrnFragment.onExtraCallback;
        int i5 = i2 + 113;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = mobileIdIssueRrnFragment.onExtraCallbackWithResult;
        int i5 = i3 + 59;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, String str, String str2, Function0 function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment, str, str2, function0}, 578926744, -578926744, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mobileIdIssueRrnFragment.onNavigationEvent(z);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MobileIdIssueViewModel onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment}, 328222250, -328222248, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mobileIdIssueViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.IAuthTabCallback(zBooleanValue);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 17;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onWarmupCompleted(MobileIdIssueRrnFragment mobileIdIssueRrnFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = mobileIdIssueRrnFragment.onNavigationEvent;
        int i5 = i2 + 109;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = getInterfaceDescriptor + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallbackDefault + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        Map<String, Object> mapAr_;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
            int i3 = 63 / 0;
        } else {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        }
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackDefault + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        long screenId;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            screenId = super.getScreenId();
            int i3 = 2 / 0;
        } else {
            screenId = super.getScreenId();
        }
        int i4 = IAuthTabCallbackDefault + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceDefault();
        }
        ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashAsInterface = asInterface();
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrashAsInterface;
        }
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    public final AppLovinSdkInitializationConfigurationImplBuilderImpl asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 53;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkInitializationConfigurationImplBuilderImpl appLovinSdkInitializationConfigurationImplBuilderImpl = this.birthdayValidator;
        if (appLovinSdkInitializationConfigurationImplBuilderImpl != null) {
            int i5 = i2 + 29;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return appLovinSdkInitializationConfigurationImplBuilderImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = IAuthTabCallbackDefault + 63;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final getBigDecimal IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getBigDecimal getbigdecimal = this.walletErrorHandler;
        if (getbigdecimal == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getbigdecimal;
    }

    public final SessionTrackerb IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 107;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 89;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public final zzad IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = getInterfaceDescriptor + 49;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 1;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(asBinder[i >> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 59697), 17 - View.MeasureSpec.getMode(0), 10973 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46134), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), 20220 - (ViewConfiguration.getPressedStateDuration() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), 44 - KeyEvent.keyCodeFromString(""), 1494 - View.resolveSize(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                    Object[] objArr5 = {Integer.valueOf(asBinder[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), 10973 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 46134), 30 - TextUtils.lastIndexOf("", '0', 0, 0), 20219 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSizeAndState(0, 0, 0)), 44 - View.getDefaultSize(0, 0), 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 3;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, 1494 - View.getDefaultSize(0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MobileIdIssueRrnFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, MobileIdIssueRrnFragment mobileIdIssueRrnFragment, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.this$0 = mobileIdIssueRrnFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$password, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Fragment fragment;
            Object objOnNavigationEvent;
            BaseActivity baseActivity;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Unit unit = null;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 11;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fragment fragment2 = (MobileIdIssueRrnFragment) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    fragment = fragment2;
                    objOnNavigationEvent = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                    fragment = this.this$0;
                    Result.Companion companion = Result.Companion;
                    asDouble.onExtraCallbackWithResult onextracallbackwithresult = asDouble.Companion;
                    isNumber isnumber = isNumber.PASSWORD;
                    this.L$0 = fragment;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnNavigationEvent = asDouble.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, isnumber, graniteBrownfieldModule_closeView, true, false, false, this, 24, (Object) null);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 113;
                        int i6 = i5 % 128;
                        onNavigationEvent = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 57;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        unit.hashCode();
                        throw null;
                    }
                }
                isJSONTypeIgnore isjsontypeignoreIAuthTabCallback = supportWideGamut.IAuthTabCallback((asDouble) objOnNavigationEvent, (UTF8Decoder) null, 1, (Object) null);
                BaseActivity activity = fragment.getActivity();
                if (activity instanceof BaseActivity) {
                    baseActivity = activity;
                    int i9 = onNavigationEvent + 107;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    baseActivity = null;
                }
                if (baseActivity != null) {
                    MobileIdIssueViewModel.onNavigationEvent(-931324951, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 931324958, R.drawable.IAuthTabCallback(), new Object[]{MobileIdIssueRrnFragment.onNavigationEvent((MobileIdIssueRrnFragment) fragment), baseActivity, isjsontypeignoreIAuthTabCallback.onNavigationEvent(), Boolean.valueOf(MobileIdIssueRrnFragment.onExtraCallback((MobileIdIssueRrnFragment) fragment))}, R.drawable.IAuthTabCallback());
                    unit = Unit.INSTANCE;
                }
                obj2 = Result.constructor-impl(unit);
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            MobileIdIssueRrnFragment mobileIdIssueRrnFragment = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, mobileIdIssueRrnFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        byte[] byteArrayExtra;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                int i3 = getInterfaceDescriptor + 117;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 18 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ExpandableListView.getPackedPositionType(0L), objArr);
                byteArrayExtra = intentOnExtraCallbackWithResult.getByteArrayExtra(((String) objArr[0]).intern());
                int i5 = IAuthTabCallbackDefault + 117;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            } else {
                byteArrayExtra = null;
            }
            Intrinsics.checkNotNull(byteArrayExtra);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(mobileIdIssueRrnFragment), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(new GraniteBrownfieldModule_closeView(byteArrayExtra), mobileIdIssueRrnFragment, null), 3, (Object) null);
            int i7 = getInterfaceDescriptor + 55;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
        private static final int $$b = 165;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 8353511867833909513L;
        private static int onNavigationEvent = -1776194565;
        private static char onWarmupCompleted = 27643;
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ IEngagementSignalsCallbackDefault $result;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MobileIdIssueRrnFragment this$0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, short s2) {
            int i2;
            int i3 = s2 + 4;
            byte[] bArr = $$a;
            int i4 = 110 - s;
            int i5 = (i * 3) + 1;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i4 += i6;
                bArr2[i2] = (byte) i4;
                i2++;
                i3++;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i3];
                i4 += i6;
                bArr2[i2] = (byte) i4;
                i2++;
                i3++;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                i2++;
                i3++;
                if (i2 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, MobileIdIssueRrnFragment mobileIdIssueRrnFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.this$0 = mobileIdIssueRrnFragment;
            this.$result = iEngagementSignalsCallbackDefault;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$password, this.this$0, this.$result, access13800Var);
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Fragment fragment;
            Object objOnNavigationEvent;
            IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault;
            BaseActivity baseActivity;
            boolean booleanExtra;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallback + 123;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 43;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) this.L$1;
                    Fragment fragment2 = (MobileIdIssueRrnFragment) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    fragment = fragment2;
                    objOnNavigationEvent = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                    fragment = this.this$0;
                    IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault2 = this.$result;
                    Result.Companion companion = Result.Companion;
                    asDouble.onExtraCallbackWithResult onextracallbackwithresult = asDouble.Companion;
                    isNumber isnumber = isNumber.PASSWORD;
                    this.L$0 = fragment;
                    this.L$1 = iEngagementSignalsCallbackDefault2;
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnNavigationEvent = asDouble.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, isnumber, graniteBrownfieldModule_closeView, true, false, false, this, 24, (Object) null);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    iEngagementSignalsCallbackDefault = iEngagementSignalsCallbackDefault2;
                }
                Unit unit = null;
                isJSONTypeIgnore isjsontypeignoreIAuthTabCallback = supportWideGamut.IAuthTabCallback((asDouble) objOnNavigationEvent, (UTF8Decoder) null, 1, (Object) null);
                BaseActivity activity = fragment.getActivity();
                if (activity instanceof BaseActivity) {
                    int i7 = onExtraCallback + 47;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    baseActivity = activity;
                } else {
                    baseActivity = null;
                }
                if (baseActivity != null) {
                    MobileIdIssueViewModel mobileIdIssueViewModelOnNavigationEvent = MobileIdIssueRrnFragment.onNavigationEvent((MobileIdIssueRrnFragment) fragment);
                    String strOnNavigationEvent = isjsontypeignoreIAuthTabCallback.onNavigationEvent();
                    Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                    if (intentOnExtraCallbackWithResult != null) {
                        Object[] objArr = new Object[1];
                        a((char) (52547 - ExpandableListView.getPackedPositionGroup(0L)), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{34511, 54272, 26342, 4640, 10689, 32001, 30946, 37156, 49868, 32707, 33747, 37112, 48495, 22768, 19595, 54020, 11925, 57522, 22893, 36525, 17989, 19159, 17377, 36039, 17916, 29633}, new char[]{27378, 25441, 44798, 8151}, new char[]{52909, 25580, 17158, 8653}, objArr);
                        booleanExtra = intentOnExtraCallbackWithResult.getBooleanExtra(((String) objArr[0]).intern(), false);
                    } else {
                        booleanExtra = false;
                    }
                    MobileIdIssueViewModel.onNavigationEvent(-931324951, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 931324958, R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueViewModelOnNavigationEvent, baseActivity, strOnNavigationEvent, Boolean.valueOf(booleanExtra)}, R.drawable.IAuthTabCallback());
                    unit = Unit.INSTANCE;
                }
                obj2 = Result.constructor-impl(unit);
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            MobileIdIssueRrnFragment mobileIdIssueRrnFragment = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, mobileIdIssueRrnFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                int i9 = IAuthTabCallback + 19;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i8 = $10 + 21;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char mode = (char) View.MeasureSpec.getMode(i5);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1451;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, scrollBarFadeDuration, minimumFlingVelocity, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49123);
                        int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 1494;
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 + 1);
                        String str$$c2 = $$c(b3, b4, (byte) (-b4));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, scrollDefaultDelay, iMyPid, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i10);
                    objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        char c2 = (char) (23972 - (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int deadChar = 50 - KeyEvent.getDeadChar(i5, i5);
                        int bitsPerPixel = 22938 - ImageFormat.getBitsPerPixel(i5);
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i5] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, deadChar, bitsPerPixel, 1872485556, false, "k", clsArr3);
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i5] = Integer.valueOf(i11);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        char packedPositionGroup = (char) (45848 - ExpandableListView.getPackedPositionGroup(0L));
                        int iIndexOf = TextUtils.indexOf("", "", i5) + 29;
                        int i12 = 12578 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        i2 = 2;
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i5] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, iIndexOf, i12, 1401536470, false, "l", clsArr4);
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onNavigationEvent ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[PHI: r4
      0x003e: PHI (r4v10 android.content.Intent) = (r4v9 android.content.Intent), (r4v12 android.content.Intent) binds: [B:10:0x003c, B:7:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Intent intentOnExtraCallbackWithResult;
        byte[] byteArrayExtra;
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Object obj = null;
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = IAuthTabCallbackDefault + 39;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                int i5 = 37 / 0;
                if (intentOnExtraCallbackWithResult != null) {
                    Object[] objArr2 = new Object[1];
                    a(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.blue(0) + 18, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                    byteArrayExtra = intentOnExtraCallbackWithResult.getByteArrayExtra(((String) objArr2[0]).intern());
                    int i6 = IAuthTabCallbackDefault + 89;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    byteArrayExtra = null;
                }
            } else {
                intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                if (intentOnExtraCallbackWithResult != null) {
                }
            }
            Intrinsics.checkNotNull(byteArrayExtra);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(mobileIdIssueRrnFragment), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(new GraniteBrownfieldModule_closeView(byteArrayExtra), mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault, null), 3, (Object) null);
            int i8 = getInterfaceDescriptor + 15;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallbackDefault + 97;
        getInterfaceDescriptor = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = mobileIdIssueRrnFragment.onTransact.getValue();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) value;
        int i4 = getInterfaceDescriptor + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return mobileIdIssueViewModel;
    }

    public hasCrashWhenJavaCrash asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.asInterface.getValue();
        int i3 = getInterfaceDescriptor + 77;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrash;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ExtHubMetaInfoHelper extHubMetaInfoHelperOnNavigationEvent = ((MobileIdIssueViewModel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this}, 328222250, -328222248, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback())).onNavigationEvent();
        if (extHubMetaInfoHelperOnNavigationEvent != null) {
            int i4 = IAuthTabCallbackDefault + 29;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallback = extHubMetaInfoHelperOnNavigationEvent.onExtraCallback();
            int i6 = IAuthTabCallbackDefault + 125;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        } else {
            strOnExtraCallback = null;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("tx_id", strOnExtraCallback);
        Object[] objArr = new Object[1];
        a(19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 8, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44306), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {(MobileIdIssueViewModel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this}, 328222250, -328222248, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback())};
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(strIntern, (String) MobileIdIssueViewModel.onNavigationEvent(-147195383, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 147195405, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback()))});
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ExtHubUtils1 extHubUtils1IAuthTabCallback = ExtHubUtils1.IAuthTabCallback(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(extHubUtils1IAuthTabCallback, "");
        this.onWarmupCompleted = extHubUtils1IAuthTabCallback;
        if (extHubUtils1IAuthTabCallback == null) {
            int i2 = IAuthTabCallbackDefault + 77;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            extHubUtils1IAuthTabCallback = null;
        }
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = extHubUtils1IAuthTabCallback.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallbackWithResult;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            writeTypedObject();
            extraCallbackWithResult();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        writeTypedObject();
        extraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        ExtHubUtils1 extHubUtils1 = mobileIdIssueRrnFragment.onWarmupCompleted;
        if (extHubUtils1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = getInterfaceDescriptor + 11;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            extHubUtils1 = null;
        }
        Object[] objArr = {m_, extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        mobileIdIssueRrnFragment.extraCallback();
    }

    private static final Unit onWarmupCompleted(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        mobileIdIssueRrnFragment.extraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i3 = onWarmupCompleted + 73;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return viewModelStore;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
                int i3 = 72 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 15 / 0;
                    }
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    private final void writeTypedObject() {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ExtHubUtils1 extHubUtils1 = this.onWarmupCompleted;
        ExtHubUtils1 extHubUtils12 = null;
        if (extHubUtils1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils1 = null;
        }
        TdsTopV2View tdsTopV2View = extHubUtils1.onExtraCallbackWithResult;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (addExtra.onExtraCallback(playerErrorCode)) {
            string = tdsTopV2View.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_rrn_foreigner_title);
        } else {
            int i4 = IAuthTabCallbackDefault + 23;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            string = tdsTopV2View.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_rrn_title);
        }
        Intrinsics.checkNotNull(string);
        tdsTopV2View.setTitleText(string);
        if (addExtra.onExtraCallback(playerErrorCode)) {
            ExtHubUtils1 extHubUtils13 = this.onWarmupCompleted;
            if (extHubUtils13 == null) {
                int i6 = getInterfaceDescriptor + 57;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = 93 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                extHubUtils13 = null;
            }
            extHubUtils13.IAuthTabCallback.onExtraCallback().setHint(getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_foreigner_registration_number));
        }
        ExtHubUtils1 extHubUtils14 = this.onWarmupCompleted;
        if (extHubUtils14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils14 = null;
        }
        EditText editText = extHubUtils14.IAuthTabCallback.onExtraCallback().getEditText();
        if (editText != null) {
            editText.setText(StringsKt.takeLast(PlayerErrorCode.extraCallback(), 6));
        }
        ExtHubUtils1 extHubUtils15 = this.onWarmupCompleted;
        if (extHubUtils15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils15 = null;
        }
        EditText editText2 = extHubUtils15.IAuthTabCallback.onExtraCallback().getEditText();
        if (editText2 != null) {
            editText2.setEnabled(false);
        }
        ExtHubUtils1 extHubUtils16 = this.onWarmupCompleted;
        if (extHubUtils16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i8 = IAuthTabCallbackDefault + 33;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            extHubUtils16 = null;
        }
        extHubUtils16.onNavigationEvent.setOnClickListener(new MobileIdIssueRrnFragment$.ExternalSyntheticLambda4(this));
        ExtHubUtils1 extHubUtils17 = this.onWarmupCompleted;
        if (extHubUtils17 == null) {
            int i10 = IAuthTabCallbackDefault + 27;
            getInterfaceDescriptor = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils17 = null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = extHubUtils17.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string2 = getString(viva.republica.toss.R.string.next);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new MobileIdIssueRrnFragment$.ExternalSyntheticLambda5(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        ExtHubUtils1 extHubUtils18 = this.onWarmupCompleted;
        if (extHubUtils18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils18 = null;
        }
        extHubUtils18.onExtraCallback.setOnVisibilityChangedListener(new MobileIdIssueRrnFragment$.ExternalSyntheticLambda6(this));
        ExtHubUtils1 extHubUtils19 = this.onWarmupCompleted;
        if (extHubUtils19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils19 = null;
        }
        SecureKeyboardView secureKeyboardView = extHubUtils19.onExtraCallback;
        ExtHubUtils1 extHubUtils110 = this.onWarmupCompleted;
        if (extHubUtils110 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils110 = null;
        }
        Context context = extHubUtils110.onExtraCallback.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        secureKeyboardView.setDarkMode(readIntokhttp.onExtraCallback(configuration));
        ExtHubUtils1 extHubUtils111 = this.onWarmupCompleted;
        if (extHubUtils111 == null) {
            int i12 = getInterfaceDescriptor + 107;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils111 = null;
        }
        EditText editText3 = extHubUtils111.IAuthTabCallback.IAuthTabCallback().getEditText();
        if (editText3 != null) {
            editText3.addTextChangedListener(new onExtraCallbackWithResult());
            editText3.setInputType(18);
            editText3.setTransformationMethod(new TransitionTransitionNotificationExternalSyntheticLambda1());
            ExtHubUtils1 extHubUtils112 = this.onWarmupCompleted;
            if (extHubUtils112 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                extHubUtils112 = null;
            }
            SecureKeyboardView secureKeyboardView2 = extHubUtils112.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(secureKeyboardView2, "");
            getThisUpdate.onExtraCallback(editText3, secureKeyboardView2, false, (Function1) null, 6, (Object) null);
        }
        ExtHubUtils1 extHubUtils113 = this.onWarmupCompleted;
        if (extHubUtils113 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            extHubUtils12 = extHubUtils113;
        }
        extHubUtils12.IAuthTabCallback.IAuthTabCallback().requestFocus();
        IAuthTabCallback(false);
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private final String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ExtHubUtils1 extHubUtils1 = this.onWarmupCompleted;
        if (extHubUtils1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils1 = null;
        }
        EditText editText = extHubUtils1.IAuthTabCallback.onExtraCallback().getEditText();
        if (editText != null) {
            int i3 = getInterfaceDescriptor + 63;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Editable text = editText.getText();
            if (text != null) {
                int i5 = IAuthTabCallbackDefault + 27;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    text.toString();
                    throw null;
                }
                String string = text.toString();
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }

    private final String access000() {
        CharSequence charSequenceOnNavigationEvent;
        int i = 2 % 2;
        ExtHubUtils1 extHubUtils1 = this.onWarmupCompleted;
        Character chValueOf = null;
        if (extHubUtils1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils1 = null;
        }
        EditText editText = extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText();
        if (editText != null && (charSequenceOnNavigationEvent = Enable.onNavigationEvent(editText)) != null) {
            int i2 = getInterfaceDescriptor + 99;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Character.valueOf(StringsKt.first(charSequenceOnNavigationEvent));
                chValueOf.hashCode();
                throw null;
            }
            chValueOf = Character.valueOf(StringsKt.first(charSequenceOnNavigationEvent));
        }
        String strValueOf = String.valueOf(chValueOf);
        int i3 = IAuthTabCallbackDefault + 27;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return strValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    private final void extraCallback() {
        ?? OnNavigationEvent;
        int i = 2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallback;
        if (getpackagetype != null) {
            int i2 = IAuthTabCallbackDefault + 23;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (getpackagetype.onExtraCallback()) {
                return;
            }
        }
        String strAccess100 = access100();
        String strAccess000 = access000();
        String str = "";
        ExtHubUtils1 extHubUtils1 = null;
        if (!asBinder().onNavigationEvent(strAccess000)) {
            int i4 = getInterfaceDescriptor;
            int i5 = i4 + 15;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            ExtHubUtils1 extHubUtils12 = this.onWarmupCompleted;
            if (extHubUtils12 == null) {
                int i7 = i4 + 1;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                extHubUtils12 = null;
            }
            extHubUtils12.IAuthTabCallback.setRrn7error(IAuthTabCallback_Parcel());
            ExtHubUtils1 extHubUtils13 = this.onWarmupCompleted;
            if (extHubUtils13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                extHubUtils1 = extHubUtils13;
            }
            EditText editText = extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText();
            if (editText != null) {
                editText.requestFocus();
                return;
            }
            return;
        }
        if (!asBinder().onNavigationEvent(strAccess100, strAccess000)) {
            ExtHubUtils1 extHubUtils14 = this.onWarmupCompleted;
            if (extHubUtils14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                extHubUtils14 = null;
            }
            extHubUtils14.IAuthTabCallback.setRrn7error(IAuthTabCallback_Parcel());
            ExtHubUtils1 extHubUtils15 = this.onWarmupCompleted;
            if (extHubUtils15 == null) {
                int i9 = IAuthTabCallbackDefault + 5;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                extHubUtils1 = extHubUtils15;
            }
            EditText editText2 = extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText();
            if (editText2 != null) {
                editText2.requestFocus();
                return;
            }
            return;
        }
        ExtHubUtils1 extHubUtils16 = this.onWarmupCompleted;
        if (extHubUtils16 == null) {
            int i11 = IAuthTabCallbackDefault + 39;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils16 = null;
        }
        extHubUtils16.IAuthTabCallback.setBirthdayError(null);
        ExtHubUtils1 extHubUtils17 = this.onWarmupCompleted;
        if (extHubUtils17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils17 = null;
        }
        extHubUtils17.IAuthTabCallback.setRrn7error(null);
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this}, 328222250, -328222248, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
        ExtHubUtils1 extHubUtils18 = this.onWarmupCompleted;
        if (extHubUtils18 == null) {
            int i13 = getInterfaceDescriptor + 107;
            IAuthTabCallbackDefault = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            extHubUtils1 = extHubUtils18;
        }
        EditText editText3 = extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText();
        if (editText3 != null && (OnNavigationEvent = Enable.onNavigationEvent(editText3)) != 0) {
            str = OnNavigationEvent;
        }
        mobileIdIssueViewModel.onExtraCallback(strAccess100, str);
    }

    private static final Unit IAuthTabCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 19;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = mobileIdIssueRrnFragment.getActivity();
        if (activity != null) {
            int i4 = getInterfaceDescriptor + 73;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            activity.finish();
            int i6 = getInterfaceDescriptor + 37;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r16 = im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment.onTransact.IAuthTabCallback;
        o.logAndOpenStore.IAuthTabCallback(r7, (java.lang.Long) null);
        r14 = new o.getTypedExportedConstants(r7, 0, false, false, -1, r16, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r9 = r14.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r11 = new android.widget.LinearLayout(r9);
        r11.setOrientation(1);
        r13 = r11.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        r2 = new im.toss.uikit.widget.dialog.BottomSheetHeader(r13, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r2.setShowCloseIcon(false);
        r2.setTitle(r3);
        r2.setDescription(r5);
        o.setProxySelectorokhttp.onExtraCallbackWithResult(r11, r2);
        r0 = r11.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = new im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View(r0);
        r13 = r1.getString(viva.republica.toss.R.string.next);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.setCta$default(r2, r13, new im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment$.ExternalSyntheticLambda2(r6, r14), (im.toss.tds.view.component.atom.button.TdsButtonV1View.asInterface) null, false, 12, (java.lang.Object) null);
        r2.setBottomButton(r7.getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_rrn_bottomsheet_bottom_button), new im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment$.ExternalSyntheticLambda3(r1));
        r2.setBottomButtonType(im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
        o.setProxySelectorokhttp.onExtraCallbackWithResult(r11, r2);
        r14.setContentView(r11);
        r14.show();
        r0 = im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment.getInterfaceDescriptor + 107;
        im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment.IAuthTabCallbackDefault = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context;
        MobileIdIssueRrnFragment mobileIdIssueRrnFragment = (MobileIdIssueRrnFragment) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            context = mobileIdIssueRrnFragment.getContext();
            int i3 = 20 / 0;
        } else {
            context = mobileIdIssueRrnFragment.getContext();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z) {
        ExtHubUtils1 extHubUtils1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        getInterfaceDescriptor = i2 % 128;
        ExtHubUtils1 extHubUtils12 = null;
        if (i2 % 2 == 0) {
            extHubUtils1 = this.onWarmupCompleted;
            int i3 = 83 / 0;
            if (extHubUtils1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                extHubUtils1 = null;
            }
        } else {
            extHubUtils1 = this.onWarmupCompleted;
            if (extHubUtils1 == null) {
            }
        }
        EditText editText = extHubUtils1.IAuthTabCallback.IAuthTabCallback().getEditText();
        if (editText != null) {
            int i4 = getInterfaceDescriptor + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            editText.setEnabled(!z);
        }
        ExtHubUtils1 extHubUtils13 = this.onWarmupCompleted;
        if (extHubUtils13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            extHubUtils13 = null;
        }
        extHubUtils13.onWarmupCompleted.asInterface().setLoading(z);
        ExtHubUtils1 extHubUtils14 = this.onWarmupCompleted;
        if (extHubUtils14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            extHubUtils12 = extHubUtils14;
        }
        extHubUtils12.onNavigationEvent.setLoading(z);
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackDefault = i2 % 128;
        ExtHubUtils1 extHubUtils1 = null;
        if (i2 % 2 == 0) {
            ExtHubUtils1 extHubUtils12 = this.onWarmupCompleted;
            if (extHubUtils12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = IAuthTabCallbackDefault + 91;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                extHubUtils12 = null;
            }
            extHubUtils12.onWarmupCompleted.asInterface().setEnabled(z);
            ExtHubUtils1 extHubUtils13 = this.onWarmupCompleted;
            if (extHubUtils13 == null) {
                int i5 = IAuthTabCallbackDefault + 11;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                extHubUtils1 = extHubUtils13;
            }
            extHubUtils1.onNavigationEvent.setEnabled(z);
            return;
        }
        throw null;
    }

    private final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        Object obj = null;
        if (addExtra.onExtraCallback(PlayerErrorCode.onWarmupCompleted)) {
            String string = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_foreigner_rrn_worgn);
            Intrinsics.checkNotNull(string);
            int i2 = getInterfaceDescriptor + 67;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }
        String string2 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_rrn_error);
        Intrinsics.checkNotNull(string2);
        int i3 = getInterfaceDescriptor + 83;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return string2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        return (Unit) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault}, -1188779546, 1188779551, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment) {
        return (IEngagementSignalsCallback_Parcel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment}, 782824337, -782824334, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    public static final /* synthetic */ void onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, boolean z) {
        Object[] objArr = {mobileIdIssueRrnFragment, Boolean.valueOf(z)};
        onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 52603539, -52603535, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    private final MobileIdIssueViewModel getInterfaceDescriptor() {
        return (MobileIdIssueViewModel) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this}, 328222250, -328222248, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, int i) {
        Object[] objArr = {mobileIdIssueRrnFragment, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2094760162, 2094760163, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        return (Unit) onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{mobileIdIssueRrnFragment, iEngagementSignalsCallbackDefault}, 1047429404, -1047429398, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }

    private final void onNavigationEvent(String str, String str2, Function0<Unit> function0) {
        onExtraCallbackWithResult(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this, str, str2, function0}, 578926744, -578926744, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback());
    }
}
