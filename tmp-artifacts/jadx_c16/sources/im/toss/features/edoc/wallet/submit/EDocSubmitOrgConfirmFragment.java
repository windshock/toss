package im.toss.features.edoc.wallet.submit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.submit.EDocSubmitOrgConfirmFragment$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AdSettingsIntegrationErrorMode;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FSManageExtension2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.H5DownloadExtension;
import o.IEngagementSignalsCallback_Parcel;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.RippleNode;
import o.SessionTrackera;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addAllCommandLine;
import o.beginScroll;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.extraCommand;
import o.findResAndMsg;
import o.getDummyAd;
import o.getMediationData;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getUserFileSize;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.putChannelInfo;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.readAsDataURL;
import o.reportSoftException;
import o.setHasShown;
import o.setRandomHost;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDoc;
import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmitOrg;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EDocSubmitOrgConfirmFragment extends Hilt_EDocSubmitOrgConfirmFragment {
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int access000;
    private static byte[] access100;
    private static int asInterface;
    private static short[] getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onWarmupCompleted;
    private String IAuthTabCallback;
    private final Lazy asBinder;
    private final onExtraCallbackWithResult onExtraCallbackWithResult;
    private final PageContext onNavigationEvent;
    private final SessionTrackera onTransact;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = EDocSubmitOrgConfirmFragment.onExtraCallbackWithResult(EDocSubmitOrgConfirmFragment.this, (access13800) this);
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = EDocSubmitOrgConfirmFragment.onExtraCallback(EDocSubmitOrgConfirmFragment.this, null, this);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = 4 - (b * 3);
        int i4 = (s * 3) + 115;
        byte[] bArr = $$a;
        int i5 = i * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            i2 = 0;
            i4 = i6;
            i3++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i3++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static {
        access000 = 0;
        onExtraCallbackWithResult();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(EDocSubmitOrgConfirmFragment.class, "binding", "getBinding()Lim/toss/features/edoc/databinding/FragmentEdocSubmitOrgConfirmBinding;", 0)};
        onWarmupCompleted = 8;
        int i = extraCallback + 43;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(-424809557, 424809563, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, th}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallbackDefault(eDocSubmitOrgConfirmFragment);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | (~i5) | i)) | (~(i | i2 | i5));
        int i10 = ~i;
        int i11 = (~(i5 | i2)) | (~(i10 | i5)) | (~(i10 | i2));
        int i12 = i + i2 + i6 + (1698977638 * i4) + (1466394737 * i3);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i) - 490274816) + ((-1116082190) * i2) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i6) + (1553727488 * i4) + (1859780608 * i3) + (925827072 * i13);
        int i15 = ((i * (-1787956080)) - 1478154965) + (i2 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i6 * (-1787955639)) + (i4 * 552005654) + (i3 * (-2013897159)) + (i13 * (-429457408));
        switch (i14 + (i15 * i15 * (-402587648))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i16 = 2 % 2;
                getUserFileSize getuserfilesize = getUserFileSize.onNavigationEvent;
                Context contextRequireContext = eDocSubmitOrgConfirmFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Intrinsics.checkNotNull(th);
                getuserfilesize.onExtraCallbackWithResult(contextRequireContext, th, new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda10(th, eDocSubmitOrgConfirmFragment));
                Unit unit = Unit.INSTANCE;
                int i17 = IAuthTabCallback_Parcel + 47;
                IAuthTabCallbackStubProxy = i17 % 128;
                int i18 = i17 % 2;
                return unit;
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eDocSubmitOrgConfirmFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (Unit) onExtraCallback(805716323, -805716318, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, deserializeurinullablecollection}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(805716323, -805716318, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, deserializeurinullablecollection}, iOnWarmupCompleted6, iOnWarmupCompleted4, iOnWarmupCompleted5);
        int i3 = 9 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eDocSubmitOrgConfirmFragment, onBackPressedCallback);
        int i4 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th, EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(-338187714, 338187718, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{th, eDocSubmitOrgConfirmFragment}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unit;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            onTransact(function1, obj);
            obj2.hashCode();
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnTransact = onTransact(function1, obj);
        int i3 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnTransact;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(eDocSubmitOrgConfirmFragment, bool);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(eDocSubmitOrgConfirmFragment, bool);
        int i3 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        eDocSubmitOrgConfirmFragment.getInterfaceDescriptor();
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Object onExtraCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, readAsDataURL readasdataurl, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return eDocSubmitOrgConfirmFragment.onExtraCallbackWithResult(readasdataurl, (access13800<? super Unit>) access13800Var);
        }
        eDocSubmitOrgConfirmFragment.onExtraCallbackWithResult(readasdataurl, (access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ FSManageExtension2 onExtraCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            eDocSubmitOrgConfirmFragment.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FSManageExtension2 fSManageExtension2AsInterface = eDocSubmitOrgConfirmFragment.asInterface();
        int i3 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return fSManageExtension2AsInterface;
    }

    public static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = eDocSubmitOrgConfirmFragment.onExtraCallbackWithResult;
        int i5 = i2 + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = eDocSubmitOrgConfirmFragment.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        int i4 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(513170196, -513170193, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ H5DownloadExtension onTransact(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        H5DownloadExtension h5DownloadExtensionIAuthTabCallbackDefault = eDocSubmitOrgConfirmFragment.IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return h5DownloadExtensionIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = eDocSubmitOrgConfirmFragment.IAuthTabCallback;
        int i5 = i3 + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public EDocSubmitOrgConfirmFragment() {
        super(R.layout.fragment_edoc_submit_org_confirm);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, asInterface.onWarmupCompleted);
        this.asBinder = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(H5DownloadExtension.class), new IAuthTabCallbackDefault(this), new access000(null, this), new getInterfaceDescriptor(this));
        this.onTransact = AppLovinAdImpl.IAuthTabCallback(this, new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda9(this));
        this.onExtraCallbackWithResult = new onExtraCallbackWithResult(this);
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = IAuthTabCallback_Parcel + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return getdummyad;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 viva.republica.toss.network.model.electronicdocument.wallet.EDoc) = 
      (r1v5 viva.republica.toss.network.model.electronicdocument.wallet.EDoc)
      (r1v12 viva.republica.toss.network.model.electronicdocument.wallet.EDoc)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getScreenParams() throws Throwable {
        EDoc eDocOnWarmupCompleted;
        String strIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            eDocOnWarmupCompleted = IAuthTabCallbackDefault().onWarmupCompleted();
            int i3 = 6 / 0;
            if (eDocOnWarmupCompleted != null) {
                int i4 = IAuthTabCallback_Parcel + 37;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                strIAuthTabCallbackDefault = eDocOnWarmupCompleted.IAuthTabCallbackDefault();
            } else {
                strIAuthTabCallbackDefault = null;
            }
        } else {
            eDocOnWarmupCompleted = IAuthTabCallbackDefault().onWarmupCompleted();
            if (eDocOnWarmupCompleted != null) {
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("doc_name", strIAuthTabCallbackDefault);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("doc_no", IAuthTabCallbackDefault().onExtraCallback());
        DocumentWalletSubmitOrg documentWalletSubmitOrgOnNavigationEvent = IAuthTabCallbackDefault().onNavigationEvent();
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("destination", documentWalletSubmitOrgOnNavigationEvent != null ? documentWalletSubmitOrgOnNavigationEvent.onExtraCallbackWithResult() : null);
        Object[] objArr = new Object[1];
        a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) (View.getDefaultSize(0, 0) - 15), (-829727345) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1795749429) - TextUtils.lastIndexOf("", '0', 0), (-93) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), IAuthTabCallbackDefault().onExtraCallbackWithResult())});
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function1<View, FSManageExtension2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final asInterface onWarmupCompleted = new asInterface();

        static {
            int i = onNavigationEvent + 45;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 28 / 0;
            }
        }

        asInterface() {
            super(1, FSManageExtension2.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/edoc/databinding/FragmentEdocSubmitOrgConfirmBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            FSManageExtension2 fSManageExtension2OnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return fSManageExtension2OnNavigationEvent;
        }

        public final FSManageExtension2 onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            FSManageExtension2 fSManageExtension2OnExtraCallbackWithResult = FSManageExtension2.onExtraCallbackWithResult(view);
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fSManageExtension2OnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    private final FSManageExtension2 asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        FSManageExtension2 fSManageExtension2OnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallback[0]);
        int i4 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return fSManageExtension2OnExtraCallbackWithResult;
    }

    private final H5DownloadExtension IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        H5DownloadExtension h5DownloadExtension = (H5DownloadExtension) this.asBinder.getValue();
        int i4 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return h5DownloadExtension;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        asBinder();
        IAuthTabCallbackStub();
        int i4 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallbackDefault().onExtraCallback() == null) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(this, (access13800) null), 3, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = eDocSubmitOrgConfirmFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(eDocSubmitOrgConfirmFragment, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = EDocSubmitOrgConfirmFragment.this.new access100(access13800Var);
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 7 / 0;
            }
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = access100VarCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 73 / 0;
            } else {
                objInvokeSuspend = access100VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment2 = EDocSubmitOrgConfirmFragment.this;
                    Result.Companion companion = Result.Companion;
                    this.L$0 = eDocSubmitOrgConfirmFragment2;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (EDocSubmitOrgConfirmFragment.onExtraCallbackWithResult(eDocSubmitOrgConfirmFragment2, (access13800) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    eDocSubmitOrgConfirmFragment = eDocSubmitOrgConfirmFragment2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                EDocSubmitOrgConfirmFragment.IAuthTabCallbackStub(eDocSubmitOrgConfirmFragment);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment3 = EDocSubmitOrgConfirmFragment.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, eDocSubmitOrgConfirmFragment3.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                int i4 = onExtraCallback + 33;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(eDocSubmitOrgConfirmFragment), (CoroutineContext) null, (setRandomHost) null, eDocSubmitOrgConfirmFragment.new access100(null), 3, (Object) null);
            int i3 = IAuthTabCallbackStubProxy + 99;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ EDocSubmitOrgConfirmFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
            super(2, access13800Var);
            this.this$0 = eDocSubmitOrgConfirmFragment;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.this$0);
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getMediationData getmediationdataOnTransact = AdSettingsIntegrationErrorMode.onNavigationEvent.onTransact();
                DocumentWalletSubmitOrg documentWalletSubmitOrgOnNavigationEvent = EDocSubmitOrgConfirmFragment.onTransact(this.this$0).onNavigationEvent();
                reportSoftException reportsoftexception = new reportSoftException(documentWalletSubmitOrgOnNavigationEvent != null ? access14000.onExtraCallback(documentWalletSubmitOrgOnNavigationEvent.onWarmupCompleted()) : null, EDocSubmitOrgConfirmFragment.onWarmupCompleted(this.this$0));
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getmediationdataOnTransact.onExtraCallbackWithResult(reportsoftexception, this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 93;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    baseApiResponse.onTransact();
                    obj2.hashCode();
                    throw null;
                }
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return objOnTransact;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                int i5 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                int i6 = 11 / 0;
                throw apiErrorOnExtraCallbackWithResult2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(readAsDataURL readasdataurl, access13800<? super Unit> access13800Var) {
        asBinder asbinder;
        String str;
        int i = 2 % 2;
        if (!(access13800Var instanceof asBinder)) {
            asbinder = new asBinder(access13800Var);
        } else {
            int i2 = IAuthTabCallback_Parcel + 109;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((asBinder) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            asbinder = (asBinder) access13800Var;
            int i4 = asbinder.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i4 - 2147483648;
            }
        }
        Object objOnExtraCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asbinder.label;
        if (i5 != 0) {
            int i6 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            this.IAuthTabCallback = readasdataurl.onExtraCallbackWithResult();
            if (!readasdataurl.onWarmupCompleted() || (str = this.IAuthTabCallback) == null || str.length() == 0) {
                getInterfaceDescriptor();
                Unit unit = Unit.INSTANCE;
                int i7 = IAuthTabCallback_Parcel + 99;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
            getDummyAd getdummyadOnNavigationEvent = onNavigationEvent();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str2 = this.IAuthTabCallback;
            Intrinsics.checkNotNull(str2);
            String strOnExtraCallbackWithResult = IAuthTabCallbackDefault().onExtraCallbackWithResult();
            String str3 = strOnExtraCallbackWithResult != null ? strOnExtraCallbackWithResult : "";
            asbinder.L$0 = access15400.onNavigationEvent(readasdataurl);
            asbinder.label = 1;
            objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, contextRequireContext, str2, str3, "document_wallet_issue", 97L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, asbinder, 8388576, (Object) null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i9 = IAuthTabCallback_Parcel + 75;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
        }
        this.onTransact.onNavigationEvent((Intent) objOnExtraCallback);
        Unit unit2 = Unit.INSTANCE;
        int i72 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i72 % 128;
        int i82 = i72 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object obj;
        int i = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
        } else {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
                int i3 = IAuthTabCallback_Parcel + 37;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                Object obj2 = null;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, this);
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(iAuthTabCallback);
                iAuthTabCallback.I$0 = 0;
                iAuthTabCallback.I$1 = 0;
                iAuthTabCallback.I$2 = 0;
                iAuthTabCallback.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, iAuthTabCallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i6 = IAuthTabCallbackStubProxy + 23;
                    int i7 = i6 % 128;
                    IAuthTabCallback_Parcel = i7;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    int i8 = i7 + 41;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    if (i8 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            obj = Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
            int i9 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
        }
        ResultKt.onNavigationEvent(obj);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (eDocSubmitOrgConfirmFragment.IAuthTabCallbackDefault().IAuthTabCallback()) {
            eDocSubmitOrgConfirmFragment.requireActivity().finish();
            int i4 = IAuthTabCallbackStubProxy + 115;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            RippleNode.onNavigationEvent(eDocSubmitOrgConfirmFragment).access100();
        }
        return Unit.INSTANCE;
    }

    private final void asBinder() {
        int i = 2 % 2;
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda0(this), 2, (Object) null);
        asInterface().IAuthTabCallback.setAdapter(this.onExtraCallbackWithResult);
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                int i3 = 24 / 0;
            } else {
                viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            }
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class access000 extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelCreationExtras;
        }
    }

    public static final class getInterfaceDescriptor extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getInterfaceDescriptor(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return onwarmupcompletedOnNavigationEvent;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        eDocSubmitOrgConfirmFragment.asInterface().onNavigationEvent.asInterface().setLoading(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackDefault(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        eDocSubmitOrgConfirmFragment.asInterface().onNavigationEvent.asInterface().setLoading(false);
        int i4 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            if (bool.booleanValue()) {
                FragmentActivity fragmentActivityRequireActivity = eDocSubmitOrgConfirmFragment.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("docId", eDocSubmitOrgConfirmFragment.IAuthTabCallbackDefault().onExtraCallback());
                Unit unit = Unit.INSTANCE;
                fragmentActivityRequireActivity.setResult(-1, intent);
                RippleNode.onNavigationEvent(eDocSubmitOrgConfirmFragment).onNavigationEvent(R.id.action_org_confirm_to_done);
                int i3 = IAuthTabCallback_Parcel + 75;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = IAuthTabCallback_Parcel + 93;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return unit2;
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment = (EDocSubmitOrgConfirmFragment) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, eDocSubmitOrgConfirmFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void getInterfaceDescriptor() {
        Long lValueOf;
        int i = 2 % 2;
        getMediationData getmediationdataOnTransact = AdSettingsIntegrationErrorMode.onNavigationEvent.onTransact();
        Long lOnExtraCallback = IAuthTabCallbackDefault().onExtraCallback();
        List listListOf = CollectionsKt.listOf(Long.valueOf(lOnExtraCallback != null ? lOnExtraCallback.longValue() : 0L));
        DocumentWalletSubmitOrg documentWalletSubmitOrgOnNavigationEvent = IAuthTabCallbackDefault().onNavigationEvent();
        if (documentWalletSubmitOrgOnNavigationEvent != null) {
            int i2 = IAuthTabCallbackStubProxy + 27;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            lValueOf = Long.valueOf(documentWalletSubmitOrgOnNavigationEvent.onWarmupCompleted());
            int i4 = IAuthTabCallback_Parcel + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            lValueOf = null;
        }
        writeRaw writerawOnExtraCallback = getMediationData.onExtraCallback(getmediationdataOnTransact, new beginScroll(listListOf, lValueOf), (String) null, 2, (Object) null);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new IAuthTabCallbackStubProxy(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda2(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda1(this))).onWarmupCompleted(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda3(this));
        getUserFileSize getuserfilesize = getUserFileSize.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.IAuthTabCallbackStub(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda4(getUserFileSize.onWarmupCompleted(getuserfilesize, contextRequireContext, (String) null, (IEngagementSignalsCallback_Parcel) null, 6, (Object) null))).onNavigationEvent(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda6(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda5(this)), new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda8(new EDocSubmitOrgConfirmFragment$.ExternalSyntheticLambda7(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0229 A[PHI: r0
      0x0229: PHI (r0v38 int) = (r0v8 int), (r0v41 int) binds: [B:54:0x0227, B:51:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022b A[PHI: r0
      0x022b: PHI (r0v9 int) = (r0v8 int), (r0v41 int) binds: [B:54:0x0227, B:51:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "", 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!(!z)) {
                byte[] bArr = access100;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) ($$a[0] - 1);
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 12843), 55 - Drawable.resolveOpacity(0, 0), View.combineMeasuredStates(0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    iIntValue = (short) (((short) (getInterfaceDescriptor[i + ((int) (asInterface ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                } else {
                    int i9 = $10 + 111;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        byte[] bArr3 = access100;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(asInterface)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getPressedStateDuration() >> 16)), 41 - Process.getGidForName(""), 22439 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L))) >>> ((int) (IAuthTabCallbackStub - 4629411779493505016L));
                    } else {
                        byte[] bArr4 = access100;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(asInterface)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 42, 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i6;
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = ((i * iIntValue) >>> 2) - ((int) (asInterface / (-4629411779493505016L)));
                    i5 = !z ? 0 : 1;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (asInterface ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackDefault), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 87, Color.green(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = access100;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr6[i11] = (byte) (bArr5[i11] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i12 = $10;
                    int i13 = i12 + 117;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    if (z2) {
                        int i15 = i12 + 25;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            byte[] bArr7 = access100;
                            int i16 = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = 0;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr7[i16] % (-4629411779493505016L))) - s)) ^ b));
                        } else {
                            byte[] bArr8 = access100;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } else {
                        short[] sArr = getInterfaceDescriptor;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(-363614188, 363614189, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(1486659234, -1486659232, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallback(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(-607670254, 607670254, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, deserializeurinullablecollection}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final void onTransact() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(513170196, -513170193, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit onNavigationEvent(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(805716323, -805716318, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, deserializeurinullablecollection}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment, Throwable th) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(-424809557, 424809563, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{eDocSubmitOrgConfirmFragment, th}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit onExtraCallbackWithResult(Throwable th, EDocSubmitOrgConfirmFragment eDocSubmitOrgConfirmFragment) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(-338187714, 338187718, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{th, eDocSubmitOrgConfirmFragment}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    static void onExtraCallbackWithResult() {
        asInterface = -1791788422;
        IAuthTabCallbackStub = -1538795412;
        IAuthTabCallbackDefault = -816894290;
        access100 = new byte[]{-12, 10, -7, -12, 6, -8, 10, 8};
    }
}
