package im.toss.features.edoc.wallet.issue;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment$;
import im.toss.features.edoc.wallet.issue.DocumentWalletIssueSelectTaxActivity;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.featurescommon.address.search.RoadAddress;
import im.toss.featurescommon.address.search.Sido;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2LocalizedString;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.Arrays;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BigIntegers;
import o.CollectionStore;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.FaceDetectCallBack;
import o.FileBridgeExtension3;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GraniteModule_closeView;
import o.GriverPageContainerPullFreshCallback;
import o.GriverTransActivityLite1;
import o.GriverTransActivityLite2;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPAddress;
import o.MultilevelSelectActivityExternalSyntheticLambda2;
import o.NativeDevSettingsSpec;
import o.PageContext;
import o.RippleNode;
import o.Selector;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.Store;
import o.StoreException;
import o.StreamParser;
import o.StreamParsingException;
import o.Strings;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleBarExtension1;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener;
import o.Utility;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addAllCommandLine;
import o.base64Encode;
import o.binToHexString;
import o.extraCommand;
import o.findResAndMsg;
import o.fromUTF8ByteArray;
import o.getAdService;
import o.getDataFromLDAP;
import o.getDummyAd;
import o.getOriginalFullResponse;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserFileSize;
import o.getUserFileSize$onTransact;
import o.getUserFileSize$onWarmupCompleted;
import o.getWrite;
import o.hexStringToBin;
import o.initMiniApp;
import o.isValidIPv4WithNetmask;
import o.isValidIPv6;
import o.isValidIPv6WithNetmask;
import o.logAndOpenStore;
import o.matches;
import o.maybeUpdateAnimatable;
import o.onAdViewAdDisplayFailed;
import o.onFastRefresh;
import o.onPageExit;
import o.preFillDefault;
import o.r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.readIntokhttp;
import o.setEnabledAmazonAdUnitIds;
import o.setHasShown;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.showAlert;
import o.showMessage;
import o.supportFilePath;
import o.supportFilePath$extraCallback;
import o.toLowerCase;
import o.toggleElementInspector;
import o.varyMatches;
import o.zip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DocumentWalletIssueInputFragment extends Hilt_DocumentWalletIssueInputFragment implements supportFilePath$extraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int[] IAuthTabCallback_Parcel = null;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault;
    private final SessionTrackera IAuthTabCallbackStub;
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder;
    private final Lazy asInterface;
    private Long onExtraCallback;
    private final PageContext onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact;

    @Inject
    public TitleBarExtension1 searchAddressIntent;

    @Inject
    public getDummyAd standardTermsV2Intent;

    static {
        IAuthTabCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(DocumentWalletIssueInputFragment.class, "binding", "getBinding()Lim/toss/features/edoc/databinding/FragmentDocumentWalletIssueBinding;", 0)};
        IAuthTabCallback = 8;
        int i = getInterfaceDescriptor + 27;
        access000 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(documentWalletIssueInputFragment, dialogInterface);
        }
        onExtraCallbackWithResult(documentWalletIssueInputFragment, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i | i4)) | i2;
        int i8 = ~i;
        int i9 = ~((~i2) | i8 | i4);
        int i10 = (~(i4 | i2)) | (~(i8 | (~i4)));
        int i11 = i + i2 + i5 + (1616745821 * i6) + (2077170981 * i3);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i) + 1587019776 + (806482222 * i2) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i5) + ((-395313152) * i6) + (904921088 * i3) + (345505792 * i12);
        int i14 = (i * (-1558553916)) + 318941677 + (i2 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i5 * (-1558553459)) + (i6 * 397062201) + (i3 * 609114465) + (i12 * (-138936320));
        switch (i13 + (i14 * i14 * 1630011392)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
                int i15 = 2 % 2;
                int i16 = access100 + 33;
                IAuthTabCallbackStubProxy = i16 % 128;
                int i17 = i16 % 2;
                supportFilePath supportfilepath = (supportFilePath) documentWalletIssueInputFragment.onNavigationEvent.getValue();
                int i18 = IAuthTabCallbackStubProxy + 57;
                access100 = i18 % 128;
                int i19 = i18 % 2;
                return supportfilepath;
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(documentWalletIssueInputFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = access100 + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(documentWalletIssueInputFragment, onBackPressedCallback);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(documentWalletIssueInputFragment, onBackPressedCallback);
        int i3 = access100 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(documentWalletIssueInputFragment, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(documentWalletIssueInputFragment, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = access100 + 81;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ supportFilePath onNavigationEvent(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(documentWalletIssueInputFragment);
        }
        IAuthTabCallbackStub(documentWalletIssueInputFragment);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Unit unit;
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            unit = (Unit) onExtraCallback(512436928, -512436921, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment, setDetectableSize}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
            int i3 = 73 / 0;
        } else {
            int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            unit = (Unit) onExtraCallback(512436928, -512436921, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment, setDetectableSize}, iOnWarmupCompleted4, iOnWarmupCompleted5, iOnWarmupCompleted6);
        }
        int i4 = access100 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, documentWalletIssueInputFragment, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 47;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(documentWalletIssueInputFragment, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(zip zipVar, DocumentWalletIssueInputFragment documentWalletIssueInputFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(zipVar, documentWalletIssueInputFragment, view);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(zipVar, documentWalletIssueInputFragment, view);
        int i3 = access100 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = i3 + 117;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class ICustomTabsCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final ICustomTabsCallback IAuthTabCallback = new ICustomTabsCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 57 / 0;
            }
        }

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class readTypedObject implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public readTypedObject(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallbackWithResult + 107;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final /* synthetic */ zip IAuthTabCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        zip zipVarIAuthTabCallbackStub = documentWalletIssueInputFragment.IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zipVarIAuthTabCallbackStub;
    }

    public static final /* synthetic */ void IAuthTabCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.onExtraCallbackWithResult(obj);
        int i4 = IAuthTabCallbackStubProxy + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackera sessionTrackera = documentWalletIssueInputFragment.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return sessionTrackera;
    }

    public static final /* synthetic */ void asBinder(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.getInterfaceDescriptor();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    public static final /* synthetic */ FileBridgeExtension3 asInterface(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3OnTransact = documentWalletIssueInputFragment.onTransact();
        int i4 = IAuthTabCallbackStubProxy + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return fileBridgeExtension3OnTransact;
        }
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = documentWalletIssueInputFragment.onTransact;
        if (i3 != 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, String str) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(documentWalletIssueInputFragment, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, StreamParsingException streamParsingException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        documentWalletIssueInputFragment.onExtraCallbackWithResult(streamParsingException);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.onNavigationEvent(zBooleanValue);
        if (i3 != 0) {
            return null;
        }
        int i4 = 13 / 0;
        return null;
    }

    public static final /* synthetic */ supportFilePath onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        supportFilePath supportfilepath = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
        int i4 = access100 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return supportfilepath;
    }

    public static final /* synthetic */ void onNavigationEvent(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, fromUTF8ByteArray fromutf8bytearray) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.IAuthTabCallback((fromUTF8ByteArray<Strings>) fromutf8bytearray);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 29;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
    }

    public static final class asInterface implements Function1<String, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallback = -4705209003346857733L;
        private static int onNavigationEvent = 1;

        public asInterface() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 57;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 24 - Color.argb(0, 0, 0, 0), 19628 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (Process.myTid() >> 22) + 59, View.resolveSizeAndState(0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 19627 - (ViewConfiguration.getTapTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 59 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 13;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.getMode(0) + 59, 6383 - TextUtils.indexOf("", "", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void IAuthTabCallback(String str) throws Throwable {
            int i = 2 % 2;
            String str2 = str;
            if (DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).asInterface()) {
                int i2 = IAuthTabCallback + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                DocumentWalletIssueInputFragment.onExtraCallback(DocumentWalletIssueInputFragment.this, str2);
                int i4 = onNavigationEvent + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("popup_referrer", "native");
            Object[] objArr = new Object[1];
            a(new char[]{62910, 59696, 52376, 41058, 34778, 31555, 24127, 15761}, 7322 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).writeTypedObject()), getWrite.IAuthTabCallback("trx_id", DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).onMinimized()), getWrite.IAuthTabCallback("from", DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).IAuthTabCallbackDefault())});
            ConvertByteArrayToFloatArray.onExtraCallback(1216997L, false, (String) null, mapOnExtraCallbackWithResult, (Function1) null, 22, (Object) null);
            Context contextRequireContext = DocumentWalletIssueInputFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback.IAuthTabCallback;
            logAndOpenStore.IAuthTabCallback(contextRequireContext, (Long) null);
            getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(contextRequireContext, 0, false, false, -1L, iCustomTabsCallback, 14, (DefaultConstructorMarker) null);
            gettypedexportedconstants.setOnCancelListener(DocumentWalletIssueInputFragment.this.new extraCallbackWithResult());
            Context context = gettypedexportedconstants.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            bottomSheetHeader.setTitle(DocumentWalletIssueInputFragment.this.getString(R.string.edoc_wallet_issue___70eead420f));
            bottomSheetHeader.setShowCloseIcon(false);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
            BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
            Intrinsics.checkNotNull(baseTextView);
            baseTextView.setText(DocumentWalletIssueInputFragment.this.getString(R.string.edoc_wallet_issue___8a1a8ad2cd));
            Context context3 = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            baseTextView.setTextColor(new getUrlokhttp(new readTypedObject(configuration)).ICustomTabsCallbackStubProxy());
            baseTextView.setPadding(varyMatches.IAuthTabCallback(baseTextView, 24), 0, varyMatches.IAuthTabCallback(baseTextView, 24), 0);
            Intrinsics.checkNotNull(baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, im.toss.uikit.R.string.uikit_confirm, new extraCallback(mapOnExtraCallbackWithResult, gettypedexportedconstants, DocumentWalletIssueInputFragment.this, str2), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
            gettypedexportedconstants.setContentView(linearLayout);
            gettypedexportedconstants.show();
        }
    }

    public DocumentWalletIssueInputFragment() {
        super(R.layout.fragment_document_wallet_issue);
        this.asInterface = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(FileBridgeExtension3.class), new onMinimized(this), new onMessageChannelReady(null, this), new onActivityResized(this));
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onExtraCallbackWithResult);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda4(this));
        this.IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda5(this));
        this.asBinder = onPageExit.onNavigationEvent(this, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda6(this));
        this.onTransact = onPageExit.onNavigationEvent(this, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda7(this));
        this.IAuthTabCallbackStub = AppLovinAdImpl.IAuthTabCallback(this, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda8(this));
    }

    public final TitleBarExtension1 onExtraCallback() {
        int i = 2 % 2;
        TitleBarExtension1 titleBarExtension1 = this.searchAddressIntent;
        if (titleBarExtension1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access100 + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return titleBarExtension1;
    }

    public final getDummyAd onWarmupCompleted() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i2 = IAuthTabCallbackStubProxy + 115;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallbackStubProxy + 29;
        access100 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        Long lValueOf;
        int i = 2 % 2;
        showMessage showmessage = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact()}, 1449511426)).getValue();
        String strOnExtraCallback = null;
        if (showmessage != null) {
            lValueOf = Long.valueOf(showmessage.onWarmupCompleted());
        } else {
            int i2 = IAuthTabCallbackStubProxy + 31;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            lValueOf = null;
        }
        Object[] objArr = new Object[1];
        a(new int[]{-1459809525, -1665828401}, Color.alpha(0) + 4, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), lValueOf);
        showMessage showmessage2 = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact()}, 1449511426)).getValue();
        if (showmessage2 != null) {
            strOnExtraCallback = showmessage2.onExtraCallback();
            int i4 = access100 + 67;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{1054710887, 2069427326, -2073455497, 634465658}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 5, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), strOnExtraCallback);
        Object[] objArr3 = new Object[1];
        a(new int[]{-1897972812, -1652475713, 1865305075, 938430892}, (KeyEvent.getMaxKeyCode() >> 16) + 8, objArr3);
        HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), onTransact().writeTypedObject()), getWrite.IAuthTabCallback("trx_id", onTransact().onMinimized()), getWrite.IAuthTabCallback("from", onTransact().IAuthTabCallbackDefault())});
        int i6 = access100 + 117;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return mapOnExtraCallbackWithResult;
    }

    private final FileBridgeExtension3 onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FileBridgeExtension3 fileBridgeExtension3 = (FileBridgeExtension3) this.asInterface.getValue();
        int i3 = access100 + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return fileBridgeExtension3;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, zip> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 7;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, zip.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/edoc/databinding/FragmentDocumentWalletIssueBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            zip zipVarOnNavigationEvent = onNavigationEvent((View) obj);
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            int i5 = onExtraCallback + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return zipVarOnNavigationEvent;
            }
            throw null;
        }

        public final zip onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return zip.onExtraCallback(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 52 / 0;
            return zip.onExtraCallback(view);
        }
    }

    private final zip IAuthTabCallbackStub() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.onExtraCallbackWithResult;
            addallcommandline = onWarmupCompleted[1];
        } else {
            pageContext = this.onExtraCallbackWithResult;
            addallcommandline = onWarmupCompleted[0];
        }
        zip zipVarOnExtraCallbackWithResult = pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = access100 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return zipVarOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final supportFilePath IAuthTabCallbackStub(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int i = 2 % 2;
        supportFilePath supportfilepath = new supportFilePath(documentWalletIssueInputFragment);
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return supportfilepath;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            onExtraCallback(-1749550820, 1749550822, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
            onTransact().onActivityLayout();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(-1749550820, 1749550822, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted4, iOnWarmupCompleted5, iOnWarmupCompleted6);
        if (onTransact().onActivityLayout()) {
            return;
        }
        int i3 = access100 + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int iOnWarmupCompleted7 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted8 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted9 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            onExtraCallback(1103027986, -1103027983, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted7, iOnWarmupCompleted8, iOnWarmupCompleted9);
            onTransact().onPostMessage();
            return;
        }
        int iOnWarmupCompleted10 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted11 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted12 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(1103027986, -1103027983, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted10, iOnWarmupCompleted11, iOnWarmupCompleted12);
        onTransact().onPostMessage();
        int i4 = 29 / 0;
    }

    private static final Unit onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        documentWalletIssueInputFragment.IAuthTabCallbackStub().onExtraCallback.asInterface().setLoading(false);
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = access100 + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                documentWalletIssueInputFragment.onTransact().ICustomTabsCallbackDefault();
                throw null;
            }
            documentWalletIssueInputFragment.onTransact().ICustomTabsCallbackDefault();
        } else {
            Object[] objArr = {documentWalletIssueInputFragment.onTransact()};
            showMessage showmessage = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 1449511426)).getValue();
            if (showmessage == null || !showmessage.onTransact()) {
                documentWalletIssueInputFragment.requireActivity().finish();
                int i3 = access100 + 79;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        Serializable serializableExtra;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            RoadAddress roadAddress = null;
            if (intentOnExtraCallbackWithResult != null) {
                Object[] objArr = new Object[1];
                a(new int[]{1577809824, 1045907022, 801415490, 984738210}, Color.green(0) + 6, objArr);
                serializableExtra = intentOnExtraCallbackWithResult.getSerializableExtra(((String) objArr[0]).intern());
            } else {
                serializableExtra = null;
            }
            if (serializableExtra instanceof RoadAddress) {
                roadAddress = (RoadAddress) serializableExtra;
                int i2 = access100 + 125;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            }
            documentWalletIssueInputFragment.onTransact().onWarmupCompleted(documentWalletIssueInputFragment.onExtraCallback, roadAddress);
            int i4 = IAuthTabCallbackStubProxy + 21;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        ArrayList parcelableArrayListExtra = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                Object[] objArr = new Object[1];
                a(new int[]{1577809824, 1045907022, 801415490, 984738210}, Color.argb(0, 0, 0, 0) + 6, objArr);
                parcelableArrayListExtra = intentOnExtraCallbackWithResult.getParcelableArrayListExtra(((String) objArr[0]).intern());
            }
            documentWalletIssueInputFragment.onTransact().onNavigationEvent(parcelableArrayListExtra);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 87;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            documentWalletIssueInputFragment.requireBaseActivity().finish();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        documentWalletIssueInputFragment.requireBaseActivity().finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 23;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback_Parcel;
        int i4 = -1469660336;
        int i5 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> i5), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback_Parcel;
        if (iArr5 != null) {
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 31;
                $10 = i10 % 128;
                int i11 = i10 % i2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ((Process.getThreadPriority(0) + 20) >> 6) + 72, 8848 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                int i12 = $10 + 95;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 / 4;
                }
                i2 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i14 = $11 + 125;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i16 = $10 + 107;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i18];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) + 39, View.MeasureSpec.getSize(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i18++;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4033), Color.alpha(0) + 78, (-16769818) - Color.rgb(0, 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(documentWalletIssueInputFragment.getScreenParams());
            unit = Unit.INSTANCE;
            int i3 = 95 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(documentWalletIssueInputFragment.getScreenParams());
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(zip zipVar, DocumentWalletIssueInputFragment documentWalletIssueInputFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        zipVar.onExtraCallback.asInterface().setLoading(true);
        ConvertByteArrayToFloatArray.onExtraCallback(1213783L, false, (String) null, (Map) null, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda9(documentWalletIssueInputFragment), 14, (Object) null);
        documentWalletIssueInputFragment.access100();
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onActivityResized extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityResized(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = onWarmupCompleted + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedIAuthTabCallback;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class onMessageChannelReady extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMessageChannelReady(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onExtraCallback + 109;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i3 = onNavigationEvent + 105;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onMinimized extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMinimized(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i4 = onWarmupCompleted + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 43 / 0;
            }
            return viewModelStore;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        int i2 = 2 % 2;
        zip zipVarIAuthTabCallbackStub = documentWalletIssueInputFragment.IAuthTabCallbackStub();
        extraCommand.IAuthTabCallback(documentWalletIssueInputFragment.requireBaseActivity().getOnBackPressedDispatcher(), documentWalletIssueInputFragment, false, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda1(documentWalletIssueInputFragment), 2, (Object) null);
        RecyclerView recyclerView = zipVarIAuthTabCallbackStub.onExtraCallbackWithResult;
        supportFilePath supportfilepath = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        SecureKeyboardView secureKeyboardView = zipVarIAuthTabCallbackStub.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
        supportFilePath.onNavigationEvent(-1678208604, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{supportfilepath, secureKeyboardView}, 1678208610, matches.onExtraCallback(), matches.onExtraCallback());
        recyclerView.setAdapter(supportfilepath);
        zipVarIAuthTabCallbackStub.onExtraCallback.asInterface().setEnabled(false);
        TdsBottomCtaV1View tdsBottomCtaV1View = zipVarIAuthTabCallbackStub.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = documentWalletIssueInputFragment.getString(R.string.edoc_wallet_issue___15e2a782cb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda2(zipVarIAuthTabCallbackStub, documentWalletIssueInputFragment), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        showMessage showmessage = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{documentWalletIssueInputFragment.onTransact()}, 1449511426)).getValue();
        Object obj = null;
        if (showmessage != null) {
            int i3 = access100 + 63;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String strOnNavigationEvent = showmessage.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                Iterator it = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult().iterator();
                int i5 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (!(!(((StreamParsingException) it.next()) instanceof BigIntegers))) {
                        break;
                    }
                    i5++;
                }
                Integer numValueOf = Integer.valueOf(i5);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                Iterator it2 = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult().iterator();
                int i6 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i7 = IAuthTabCallbackStubProxy + 109;
                    access100 = i7 % 128;
                    if (i7 % 2 == 0) {
                        boolean z = ((StreamParsingException) it2.next()) instanceof base64Encode;
                        obj.hashCode();
                        throw null;
                    }
                    if (((StreamParsingException) it2.next()) instanceof base64Encode) {
                        i = i6;
                        break;
                    }
                    i6++;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                if (numValueOf2.intValue() >= 0) {
                    int i8 = IAuthTabCallbackStubProxy + 77;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    supportFilePath supportfilepath2 = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult());
                    arrayList.set(numValueOf2.intValue(), new base64Encode(strOnNavigationEvent));
                    supportfilepath2.onNavigationEvent(arrayList);
                    ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).notifyItemChanged(numValueOf2.intValue());
                    zipVarIAuthTabCallbackStub.onExtraCallbackWithResult.scrollToPosition(0);
                    documentWalletIssueInputFragment.getInterfaceDescriptor();
                    return null;
                }
                if (numValueOf != null) {
                    supportFilePath supportfilepath3 = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult());
                    arrayList2.add(numValueOf.intValue() + 1, new base64Encode(strOnNavigationEvent));
                    supportfilepath3.onNavigationEvent(arrayList2);
                    ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).notifyItemChanged(numValueOf.intValue() + 1);
                    zipVarIAuthTabCallbackStub.onExtraCallbackWithResult.scrollToPosition(0);
                    documentWalletIssueInputFragment.getInterfaceDescriptor();
                    return null;
                }
                Context contextRequireContext = documentWalletIssueInputFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda3(strOnNavigationEvent, documentWalletIssueInputFragment));
            }
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.requireActivity().finish();
        if (i3 == 0) {
            return Unit.INSTANCE;
        }
        int i4 = 22 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, DocumentWalletIssueInputFragment documentWalletIssueInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.asBinder(new DocumentWalletIssueInputFragment$.ExternalSyntheticLambda0(documentWalletIssueInputFragment));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void access100() {
        int i = 2 % 2;
        Object[] objArr = {onTransact()};
        String str = (String) FileBridgeExtension3.onExtraCallbackWithResult(428737334, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -428737318);
        if (str == null) {
            int i2 = access100 + 95;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if (str.length() != 0) {
            onWarmupCompleted(str);
            int i4 = access100 + 29;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = access100 + 65;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            onTransact().ICustomTabsCallbackStub();
        } else {
            onTransact().ICustomTabsCallbackStub();
            throw null;
        }
    }

    private static final Unit onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i4 = IAuthTabCallbackStubProxy + 113;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            documentWalletIssueInputFragment.onTransact().ICustomTabsCallbackStub();
        } else {
            documentWalletIssueInputFragment.IAuthTabCallbackStub().onExtraCallback.asInterface().setLoading(false);
            int i6 = access100 + 63;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(str, null), 3, (Object) null);
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $standardTermsId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(String str, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$standardTermsId = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = DocumentWalletIssueInputFragment.this.new writeTypedObject(this.$standardTermsId, access13800Var);
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return writetypedobject;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 92 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[PHI: r6
          0x0099: PHI (r6v11 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment) = 
          (r6v10 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment)
          (r6v13 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment)
         binds: [B:22:0x0097, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[PHI: r6
          0x00a4: PHI (r6v12 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment) = 
          (r6v10 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment)
          (r6v13 im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment)
         binds: [B:22:0x0097, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            String strWriteTypedObject;
            String str;
            Throwable th;
            Object objOnExtraCallback;
            String strOnExtraCallback;
            DocumentWalletIssueInputFragment documentWalletIssueInputFragment;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                showMessage showmessage = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this)}, 1449511426)).getValue();
                if (showmessage == null || (strOnExtraCallback = showmessage.onExtraCallback()) == null) {
                    string = DocumentWalletIssueInputFragment.this.getString(R.string.edoc_standard_terms_v2_title_subject);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getDummyAd getdummyadOnWarmupCompleted = DocumentWalletIssueInputFragment.this.onWarmupCompleted();
                    Context contextRequireContext = DocumentWalletIssueInputFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr = {new StandardTermsV2CustomVariable("{{docName}}", new StandardTermsV2LocalizedString(string, string))};
                    strWriteTypedObject = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).writeTypedObject();
                    if (strWriteTypedObject != null) {
                        int i3 = IAuthTabCallback;
                        int i4 = i3 + 25;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = i3 + 95;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        str = "";
                    } else {
                        str = strWriteTypedObject;
                    }
                    String str2 = this.$standardTermsId;
                    this.L$0 = access15400.onNavigationEvent(string);
                    this.label = 1;
                    th = null;
                    objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnWarmupCompleted, contextRequireContext, str2, str, "document_wallet_issue", 97L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, standardTermsV2CustomVariableArr, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388064, (Object) null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        int i8 = IAuthTabCallback + 13;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    int i10 = onWarmupCompleted + 99;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        documentWalletIssueInputFragment = DocumentWalletIssueInputFragment.this;
                        string = FaceDetectCallBack.onExtraCallback(FaceDetectCallBack.onExtraCallbackWithResult, strOnExtraCallback, true, 5, (Object) null) ? documentWalletIssueInputFragment.getString(R.string.edoc_standard_terms_v2_title_subject_doc_name_is_korean_last_consonant, new Object[]{strOnExtraCallback}) : documentWalletIssueInputFragment.getString(R.string.edoc_standard_terms_v2_title_subject_doc_name, new Object[]{strOnExtraCallback});
                    } else {
                        documentWalletIssueInputFragment = DocumentWalletIssueInputFragment.this;
                        if (FaceDetectCallBack.onExtraCallback(FaceDetectCallBack.onExtraCallbackWithResult, strOnExtraCallback, false, 2, (Object) null)) {
                        }
                    }
                    if (string == null) {
                    }
                    getDummyAd getdummyadOnWarmupCompleted2 = DocumentWalletIssueInputFragment.this.onWarmupCompleted();
                    Context contextRequireContext2 = DocumentWalletIssueInputFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr2 = {new StandardTermsV2CustomVariable("{{docName}}", new StandardTermsV2LocalizedString(string, string))};
                    strWriteTypedObject = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).writeTypedObject();
                    if (strWriteTypedObject != null) {
                    }
                    String str22 = this.$standardTermsId;
                    this.L$0 = access15400.onNavigationEvent(string);
                    this.label = 1;
                    th = null;
                    objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnWarmupCompleted2, contextRequireContext2, str22, str, "document_wallet_issue", 97L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, standardTermsV2CustomVariableArr2, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388064, (Object) null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = IAuthTabCallback + 41;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i12 = 27 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                objOnExtraCallback = obj;
                th = null;
            }
            ((SessionTrackera) DocumentWalletIssueInputFragment.onExtraCallback(-934457292, 934457298, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{DocumentWalletIssueInputFragment.this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent((Intent) objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i13 = onWarmupCompleted + 53;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                return unit;
            }
            th.hashCode();
            throw th;
        }
    }

    static final class getInterfaceDescriptor implements Function1<SetDetectableSize, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ showMessage IAuthTabCallback;
        final /* synthetic */ DocumentWalletIssueInputFragment onWarmupCompleted;

        getInterfaceDescriptor(showMessage showmessage, DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
            this.IAuthTabCallback = showmessage;
            this.onWarmupCompleted = documentWalletIssueInputFragment;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((SetDetectableSize) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            String strOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            setDetectableSize.onExtraCallback("error_msg", strOnNavigationEvent != null ? strOnNavigationEvent : "");
            setDetectableSize.onExtraCallback(this.onWarmupCompleted.getScreenParams());
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback implements Function1<showMessage, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(showMessage showmessage) {
            boolean z;
            List listEmptyList;
            ArrayList arrayList;
            Object next;
            int i = 2 % 2;
            showMessage showmessage2 = showmessage;
            ConvertByteArrayToFloatArray.onExtraCallback(1213781L, false, (String) null, (Map) null, new getInterfaceDescriptor(showmessage2, DocumentWalletIssueInputFragment.this), 14, (Object) null);
            List interfaceDescriptor = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).getInterfaceDescriptor();
            if (interfaceDescriptor != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : interfaceDescriptor) {
                    if (obj instanceof fromUTF8ByteArray) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((fromUTF8ByteArray) it.next()).onNavigationEvent() instanceof StoreException) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
            }
            DocumentWalletIssueInputFragment.onExtraCallback(-1001427933, 1001427937, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{DocumentWalletIssueInputFragment.this, Boolean.valueOf(z)}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            if (!showmessage2.onTransact()) {
                DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).ICustomTabsCallbackStub();
                return;
            }
            List interfaceDescriptor2 = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).getInterfaceDescriptor();
            Object obj2 = null;
            if (interfaceDescriptor2 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = interfaceDescriptor2.iterator();
                while (it2.hasNext()) {
                    int i2 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        boolean z2 = it2.next() instanceof StreamParsingException;
                        throw null;
                    }
                    Object next2 = it2.next();
                    if (next2 instanceof StreamParsingException) {
                        arrayList3.add(next2);
                    }
                }
                listEmptyList = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    int i3 = onExtraCallbackWithResult + 27;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        next = it3.next();
                        int i4 = 88 / 0;
                        if (!((StreamParsingException) next).IAuthTabCallbackStub()) {
                            listEmptyList.add(next);
                        }
                    } else {
                        next = it3.next();
                        if (!((StreamParsingException) next).IAuthTabCallbackStub()) {
                            listEmptyList.add(next);
                        }
                    }
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
                int i5 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            if (listEmptyList.isEmpty()) {
                arrayList = new ArrayList();
                arrayList.add(new BigIntegers(showmessage2.IAuthTabCallbackDefault(), showmessage2.asInterface()));
                arrayList.add(new getDataFromLDAP(108.0f));
                arrayList.add(new hexStringToBin());
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new BigIntegers(showmessage2.IAuthTabCallbackDefault(), showmessage2.asInterface()));
                String strOnNavigationEvent = showmessage2.onNavigationEvent();
                if (strOnNavigationEvent != null) {
                    arrayList4.add(new base64Encode(strOnNavigationEvent));
                }
                arrayList4.addAll(listEmptyList);
                arrayList4.add(new getDataFromLDAP(32.0f));
                int i7 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                arrayList = arrayList4;
            }
            DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult(arrayList, true);
            DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).ICustomTabsCallbackStubProxy();
            List listOnExtraCallbackWithResult = DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult();
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = listOnExtraCallbackWithResult.iterator();
            while (it4.hasNext()) {
                int i9 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean z3 = it4.next() instanceof fromUTF8ByteArray;
                    obj2.hashCode();
                    throw null;
                }
                Object next3 = it4.next();
                if (!(!(next3 instanceof fromUTF8ByteArray))) {
                    arrayList5.add(next3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (!((fromUTF8ByteArray) obj3).IAuthTabCallback()) {
                    int i10 = onExtraCallbackWithResult + 117;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        arrayList6.add(obj3);
                        throw null;
                    }
                    arrayList6.add(obj3);
                }
            }
            Iterator it5 = arrayList6.iterator();
            while (!(!it5.hasNext())) {
                DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).onNavigationEvent((fromUTF8ByteArray) it5.next());
            }
            DocumentWalletIssueInputFragment.asBinder(DocumentWalletIssueInputFragment.this);
        }
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletIssueInputFragment documentWalletIssueInputFragment = DocumentWalletIssueInputFragment.this;
            Intrinsics.checkNotNull(obj);
            DocumentWalletIssueInputFragment.IAuthTabCallback(documentWalletIssueInputFragment, obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Pair<? extends Boolean, ? extends String>, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(Pair<? extends Boolean, ? extends String> pair) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Pair<? extends Boolean, ? extends String> pair2 = pair;
            boolean zBooleanValue = ((Boolean) pair2.onExtraCallbackWithResult()).booleanValue();
            String str = (String) pair2.IAuthTabCallback();
            if (str.length() > 0) {
                ConstraintLayout constraintLayout = DocumentWalletIssueInputFragment.IAuthTabCallback(DocumentWalletIssueInputFragment.this).IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(constraintLayout, str);
                TdsBottomCtaV1View tdsBottomCtaV1View = DocumentWalletIssueInputFragment.IAuthTabCallback(DocumentWalletIssueInputFragment.this).onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
                onnavigationevent.onNavigationEvent(tdsBottomCtaV1View);
                if (zBooleanValue) {
                    int i4 = onExtraCallback + 35;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    TdsToastV1.onNavigationEvent.onNavigationEvent(onnavigationevent, im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null);
                }
                onnavigationevent.onNavigationEvent();
                int i6 = onNavigationEvent + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public static final class access100 implements Function1<onFastRefresh, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public access100() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(onFastRefresh onfastrefresh) {
            int i = 2 % 2;
            onFastRefresh onfastrefresh2 = onfastrefresh;
            DocumentWalletPollCheckMeta documentWalletPollCheckMetaOnExtraCallback = onfastrefresh2.onExtraCallback();
            if (documentWalletPollCheckMetaOnExtraCallback != null) {
                int i2 = onExtraCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (documentWalletPollCheckMetaOnExtraCallback.IAuthTabCallback() == 0) {
                    int i4 = onNavigationEvent + 87;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        DocumentWalletIssueInputFragment.this.requireActivity().finish();
                        return;
                    }
                    DocumentWalletIssueInputFragment.this.requireActivity().finish();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            if (!DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this).onActivityLayout()) {
                RippleNode.onNavigationEvent(DocumentWalletIssueInputFragment.this).onNavigationEvent(R.id.action_to_documentWalletIssueRequestFragment);
                return;
            }
            if (onfastrefresh2.onExtraCallbackWithResult()) {
                RippleNode.onNavigationEvent(DocumentWalletIssueInputFragment.this).onNavigationEvent(R.id.action_to_documentWalletIssueRequestFragment);
                return;
            }
            DocumentWalletIssueInputFragment.this.requireActivity().finish();
            int i5 = onNavigationEvent + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class asBinder implements Function1<StreamParsingException, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 52 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(StreamParsingException streamParsingException) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                StreamParsingException streamParsingException2 = streamParsingException;
                DocumentWalletIssueInputFragment documentWalletIssueInputFragment = DocumentWalletIssueInputFragment.this;
                Intrinsics.checkNotNull(streamParsingException2);
                DocumentWalletIssueInputFragment.onExtraCallback(documentWalletIssueInputFragment, streamParsingException2);
                return;
            }
            StreamParsingException streamParsingException3 = streamParsingException;
            DocumentWalletIssueInputFragment documentWalletIssueInputFragment2 = DocumentWalletIssueInputFragment.this;
            Intrinsics.checkNotNull(streamParsingException3);
            DocumentWalletIssueInputFragment.onExtraCallback(documentWalletIssueInputFragment2, streamParsingException3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Throwable th2 = th;
            if (!(!(th2 instanceof getUserFileSize$onWarmupCompleted))) {
                DocumentWalletIssueInputFragment.this.requireActivity().finish();
                return;
            }
            if (th2 instanceof getUserFileSize$onTransact) {
                Context contextRequireContext = DocumentWalletIssueInputFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new access000(DocumentWalletIssueInputFragment.this));
                int i4 = onNavigationEvent + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            getUserFileSize getuserfilesize = getUserFileSize.onNavigationEvent;
            Context contextRequireContext2 = DocumentWalletIssueInputFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            Intrinsics.checkNotNull(th2);
            getuserfilesize.onExtraCallbackWithResult(contextRequireContext2, th2, new IAuthTabCallback_Parcel(th2, DocumentWalletIssueInputFragment.this));
            int i6 = onExtraCallback + 47;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onNavigationEvent implements Function1<showAlert, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(showAlert showalert) {
            int i = 2 % 2;
            showAlert showalert2 = showalert;
            List listOnExtraCallback = showalert2.onExtraCallback();
            if (listOnExtraCallback != null) {
                int i2 = IAuthTabCallback + 7;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    listOnExtraCallback.isEmpty();
                    throw null;
                }
                if (!listOnExtraCallback.isEmpty()) {
                    IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnExtraCallback = DocumentWalletIssueInputFragment.onExtraCallback(DocumentWalletIssueInputFragment.this);
                    DocumentWalletIssueSelectTaxActivity.onExtraCallbackWithResult onextracallbackwithresult = DocumentWalletIssueSelectTaxActivity.Companion;
                    Context contextRequireContext = DocumentWalletIssueInputFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    List listOnExtraCallback2 = showalert2.onExtraCallback();
                    Intrinsics.checkNotNull(listOnExtraCallback2);
                    List listOnExtraCallbackWithResult = DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listOnExtraCallbackWithResult) {
                        if (obj instanceof binToHexString) {
                            arrayList.add(obj);
                            int i3 = onNavigationEvent + 51;
                            IAuthTabCallback = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i5 = IAuthTabCallback + 103;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        arrayList2.add(((binToHexString) it.next()).IAuthTabCallback());
                    }
                    iEngagementSignalsCallback_ParcelOnExtraCallback.onNavigationEvent(onextracallbackwithresult.onExtraCallback(contextRequireContext, listOnExtraCallback2, arrayList2));
                    return;
                }
            }
            Context contextRequireContext2 = DocumentWalletIssueInputFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext2, DocumentWalletIssueInputFragment.this.new IAuthTabCallbackStubProxy());
            int i7 = onNavigationEvent + 5;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 47 / 0;
            }
        }
    }

    public static final class onTransact implements Function1<fromUTF8ByteArray<?>, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(fromUTF8ByteArray<?> fromutf8bytearray) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            fromUTF8ByteArray<?> fromutf8bytearray2 = null;
            if (i2 % 2 == 0) {
                fromUTF8ByteArray<?> fromutf8bytearray3 = fromutf8bytearray;
                FileBridgeExtension3 fileBridgeExtension3AsInterface = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this);
                Intrinsics.checkNotNull(fromutf8bytearray3);
                fileBridgeExtension3AsInterface.onNavigationEvent(fromutf8bytearray3);
                if (!(!CollectionsKt.contains(DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult(), fromutf8bytearray3))) {
                    DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).notifyItemChanged(CollectionsKt.indexOf(DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult(), fromutf8bytearray3));
                }
                if (fromutf8bytearray3.onNavigationEvent() instanceof Strings) {
                    fromutf8bytearray2 = fromutf8bytearray3;
                } else {
                    int i3 = onNavigationEvent + 121;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
                if (fromutf8bytearray2 != null) {
                    DocumentWalletIssueInputFragment.onNavigationEvent(DocumentWalletIssueInputFragment.this, fromutf8bytearray2);
                }
                DocumentWalletIssueInputFragment.asBinder(DocumentWalletIssueInputFragment.this);
                return;
            }
            fromUTF8ByteArray<?> fromutf8bytearray4 = fromutf8bytearray;
            FileBridgeExtension3 fileBridgeExtension3AsInterface2 = DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this);
            Intrinsics.checkNotNull(fromutf8bytearray4);
            fileBridgeExtension3AsInterface2.onNavigationEvent(fromutf8bytearray4);
            CollectionsKt.contains(DocumentWalletIssueInputFragment.onExtraCallbackWithResult(DocumentWalletIssueInputFragment.this).onExtraCallbackWithResult(), fromutf8bytearray4);
            fromutf8bytearray2.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function1<Boolean, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(Boolean bool) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (bool.booleanValue()) {
                int i4 = onNavigationEvent + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                BaseFragment.showProgressDialog$default(DocumentWalletIssueInputFragment.this, (String) null, false, 3, (Object) null);
                return;
            }
            DocumentWalletIssueInputFragment.this.dismissProgressDialog();
        }
    }

    private static final void onWarmupCompleted(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = documentWalletIssueInputFragment.IAuthTabCallbackDefault;
        r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback = UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener.IAuthTabCallback.IAuthTabCallback();
        Context contextRequireContext = documentWalletIssueInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNull(str);
        iEngagementSignalsCallback_Parcel.onNavigationEvent(r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.onExtraCallback(r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback, contextRequireContext, str, true, (GriverTransActivityLite1) null, (GriverTransActivityLite2) null, (UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2) null, (String) null, "electronic_document", (String) null, (List) null, false, false, (r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.IAuthTabCallback) null, 8056, (Object) null));
        int i4 = access100 + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    static final class extraCallbackWithResult implements DialogInterface.OnCancelListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        extraCallbackWithResult() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            TdsButtonV1View tdsButtonV1ViewAsInterface;
            int i = 2 % 2;
            Object[] objArr = {DocumentWalletIssueInputFragment.asInterface(DocumentWalletIssueInputFragment.this)};
            showMessage showmessage = (showMessage) ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 1449511426)).getValue();
            if (showmessage != null) {
                int i2 = IAuthTabCallback + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean z = true;
                if (showmessage.onTransact()) {
                    int i4 = IAuthTabCallback + 123;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        tdsButtonV1ViewAsInterface = DocumentWalletIssueInputFragment.IAuthTabCallback(DocumentWalletIssueInputFragment.this).onExtraCallback.asInterface();
                    } else {
                        tdsButtonV1ViewAsInterface = DocumentWalletIssueInputFragment.IAuthTabCallback(DocumentWalletIssueInputFragment.this).onExtraCallback.asInterface();
                        z = false;
                    }
                    tdsButtonV1ViewAsInterface.setLoading(z);
                    int i5 = onExtraCallback + 45;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
            DocumentWalletIssueInputFragment.this.requireActivity().finish();
        }
    }

    static final class extraCallback implements View.OnClickListener {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        final /* synthetic */ getTypedExportedConstants onExtraCallback;
        final /* synthetic */ HashMap<String, String> onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ DocumentWalletIssueInputFragment onWarmupCompleted;

        extraCallback(HashMap<String, String> map, getTypedExportedConstants gettypedexportedconstants, DocumentWalletIssueInputFragment documentWalletIssueInputFragment, String str) {
            this.onExtraCallbackWithResult = map;
            this.onExtraCallback = gettypedexportedconstants;
            this.onWarmupCompleted = documentWalletIssueInputFragment;
            this.onNavigationEvent = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                ConvertByteArrayToFloatArray.onExtraCallback(1216999L, false, (String) null, this.onExtraCallbackWithResult, (Function1) null, 23, (Object) null);
            } else {
                ConvertByteArrayToFloatArray.onExtraCallback(1216999L, false, (String) null, this.onExtraCallbackWithResult, (Function1) null, 22, (Object) null);
            }
            DocumentWalletIssueInputFragment.onExtraCallback(this.onWarmupCompleted, this.onNavigationEvent);
            this.onExtraCallback.dismiss();
        }
    }

    static final class IAuthTabCallbackStubProxy implements Function1<CommonModule_setLeftEdgeTouchEnabled, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackStubProxy() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((CommonModule_setLeftEdgeTouchEnabled) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 83 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(DocumentWalletIssueInputFragment.this.getString(R.string.edoc_wallet_issue___0174e67fa4));
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 0, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            } else {
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(DocumentWalletIssueInputFragment.this.getString(R.string.edoc_wallet_issue___0174e67fa4));
                int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
                int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            }
            int i3 = onWarmupCompleted + 69;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallback(@NotNull Utility utility, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(utility, "");
        utility.onWarmupCompleted(new Selector(String.valueOf(z)));
        onTransact().onNavigationEvent(utility);
        getInterfaceDescriptor();
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.supportFilePath$extraCallback
    public <T extends CollectionStore> void onNavigationEvent(@NotNull fromUTF8ByteArray<T> fromutf8bytearray) {
        fromUTF8ByteArray<T> fromutf8bytearray2;
        fromUTF8ByteArray<T> fromutf8bytearray3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Object obj = null;
        fromUTF8ByteArray<T> fromutf8bytearray4 = fromutf8bytearray.onNavigationEvent() instanceof Selector ? fromutf8bytearray : null;
        if (fromutf8bytearray4 != null) {
            int i2 = access100 + 93;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            FileBridgeExtension3 fileBridgeExtension3OnTransact = onTransact();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            fileBridgeExtension3OnTransact.IAuthTabCallback(contextRequireContext, fromutf8bytearray4);
        }
        if (fromutf8bytearray.onNavigationEvent() instanceof StreamParser) {
            int i4 = IAuthTabCallbackStubProxy + 75;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            fromutf8bytearray2 = fromutf8bytearray;
        } else {
            fromutf8bytearray2 = null;
        }
        if (fromutf8bytearray2 != null) {
            FileBridgeExtension3 fileBridgeExtension3OnTransact2 = onTransact();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            fileBridgeExtension3OnTransact2.onExtraCallbackWithResult(contextRequireContext2, fromutf8bytearray2);
        }
        if (fromutf8bytearray.onNavigationEvent() instanceof isValidIPv6) {
            int i6 = access100 + 3;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            fromutf8bytearray3 = fromutf8bytearray;
        } else {
            fromutf8bytearray3 = null;
        }
        if (fromutf8bytearray3 != null) {
            FileBridgeExtension3 fileBridgeExtension3OnTransact3 = onTransact();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            fileBridgeExtension3OnTransact3.IAuthTabCallback(contextRequireContext3, fromutf8bytearray3);
        }
        fromUTF8ByteArray<T> fromutf8bytearray5 = fromutf8bytearray.onNavigationEvent() instanceof isValidIPv4WithNetmask ? fromutf8bytearray : null;
        if (fromutf8bytearray5 != null) {
            FileBridgeExtension3 fileBridgeExtension3OnTransact4 = onTransact();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            fileBridgeExtension3OnTransact4.IAuthTabCallback(contextRequireContext4, fromutf8bytearray5);
        }
        fromUTF8ByteArray<T> fromutf8bytearray6 = fromutf8bytearray.onNavigationEvent() instanceof IPAddress ? fromutf8bytearray : null;
        if (fromutf8bytearray6 != null) {
            FileBridgeExtension3 fileBridgeExtension3OnTransact5 = onTransact();
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            fileBridgeExtension3OnTransact5.onWarmupCompleted(contextRequireContext5, fromutf8bytearray6);
        }
        if (!(fromutf8bytearray.onNavigationEvent() instanceof Store)) {
            fromutf8bytearray = null;
        }
        if (fromutf8bytearray != null) {
            FileBridgeExtension3 fileBridgeExtension3OnTransact6 = onTransact();
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            fileBridgeExtension3OnTransact6.onNavigationEvent(contextRequireContext6, fromutf8bytearray);
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallback(@NotNull Arrays<?> arrays) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(arrays, "");
            int i3 = 18 / 0;
            if (!(arrays.onNavigationEvent() instanceof isValidIPv6WithNetmask)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(arrays, "");
            if (!(arrays.onNavigationEvent() instanceof isValidIPv6WithNetmask)) {
                return;
            }
        }
        NativeDevSettingsSpec nativeDevSettingsSpecAsBinder = arrays.asBinder();
        if (nativeDevSettingsSpecAsBinder != null) {
            lValueOf = Long.valueOf(((Long) NativeDevSettingsSpec.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1194110157, new Object[]{nativeDevSettingsSpecAsBinder}, -1194110156, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).longValue());
        } else {
            int i4 = access100 + 23;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            lValueOf = null;
        }
        this.onExtraCallback = lValueOf;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.asBinder;
        TitleBarExtension1 titleBarExtension1OnExtraCallback = onExtraCallback();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(titleBarExtension1OnExtraCallback.onExtraCallbackWithResult(contextRequireContext, new MultilevelSelectActivityExternalSyntheticLambda2(false, true, getString(R.string.edoc_wallet_issue___5e60285fc9), (String) null, (String) null, (String) null, (String) null, (String) null, "document_wallet", (HashMap) null, (String) null, 0, (GriverPageContainerPullFreshCallback) null, (String) null, (RoadAddress) null, (Sido) null, 65272, (DefaultConstructorMarker) null)));
    }

    @Override // o.supportFilePath$extraCallback
    public void IAuthTabCallback(@NotNull fromUTF8ByteArray<Selector> fromutf8bytearray, @NotNull CharSequence charSequence) {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            int i2 = access100 + 119;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            string = null;
        } else {
            string = charSequence.toString();
            int i4 = IAuthTabCallbackStubProxy + 3;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        fromutf8bytearray.onNavigationEvent(new Selector(string));
        onTransact().onNavigationEvent(fromutf8bytearray);
        getInterfaceDescriptor();
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallbackWithResult(@NotNull fromUTF8ByteArray<StoreException> fromutf8bytearray, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        fromutf8bytearray.onNavigationEvent().onExtraCallback();
        fromutf8bytearray.onNavigationEvent(new StoreException(GraniteModule_closeView.onExtraCallback(charSequence), GraniteModule_closeView.onExtraCallback(charSequence2)));
        onTransact().onNavigationEvent(fromutf8bytearray);
        getInterfaceDescriptor();
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallbackWithResult(@NotNull fromUTF8ByteArray<Selector> fromutf8bytearray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(str, "");
        fromutf8bytearray.onNavigationEvent(new Selector(str));
        onTransact().onNavigationEvent(fromutf8bytearray);
        getInterfaceDescriptor();
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.supportFilePath$extraCallback
    public <T extends CollectionStore> void onExtraCallback(@NotNull fromUTF8ByteArray<T> fromutf8bytearray) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        if (!(fromutf8bytearray.onNavigationEvent() instanceof Strings)) {
            int i4 = IAuthTabCallbackStubProxy + 119;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 17 / 0;
            }
            fromutf8bytearray = null;
        }
        if (fromutf8bytearray != null) {
            Object[] objArr = {onTransact()};
            if (!(!((Boolean) FileBridgeExtension3.onExtraCallbackWithResult(-765436427, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 765436433)).booleanValue())) {
                int i6 = IAuthTabCallbackStubProxy + 51;
                access100 = i6 % 128;
                if (i6 % 2 == 0) {
                    FileBridgeExtension3.onExtraCallbackWithResult(2013785509, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact()}, -2013785509);
                    throw null;
                }
                FileBridgeExtension3.onExtraCallbackWithResult(2013785509, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact()}, -2013785509);
            }
        }
        int i7 = access100 + 73;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onWarmupCompleted(@NotNull binToHexString bintohexstring) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bintohexstring, "");
        onTransact().onWarmupCompleted(bintohexstring);
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(StreamParsingException streamParsingException) {
        int iIndexOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult().contains(streamParsingException)) {
            return;
        }
        List interfaceDescriptor = onTransact().getInterfaceDescriptor();
        int iIndexOf2 = interfaceDescriptor != null ? interfaceDescriptor.indexOf(streamParsingException) : 0;
        do {
            iIndexOf2--;
            if (iIndexOf2 < 0) {
                return;
            }
            List listOnExtraCallbackWithResult = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult();
            List interfaceDescriptor2 = onTransact().getInterfaceDescriptor();
            Object orNull = null;
            if (interfaceDescriptor2 != null) {
                int i4 = IAuthTabCallbackStubProxy + 77;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    CollectionsKt.getOrNull(interfaceDescriptor2, iIndexOf2);
                    orNull.hashCode();
                    throw null;
                }
                orNull = CollectionsKt.getOrNull(interfaceDescriptor2, iIndexOf2);
            }
            iIndexOf = CollectionsKt.indexOf(listOnExtraCallbackWithResult, orNull);
        } while (iIndexOf < 0);
        supportFilePath supportfilepath = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        ArrayList arrayList = new ArrayList(IAuthTabCallbackDefault().onExtraCallbackWithResult());
        int i5 = iIndexOf + 1;
        arrayList.add(i5, streamParsingException);
        supportfilepath.onNavigationEvent(arrayList);
        ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).notifyItemInserted(i5);
    }

    private final void IAuthTabCallback(fromUTF8ByteArray<Strings> fromutf8bytearray) {
        toLowerCase tolowercase;
        NativeDevSettingsSpec nativeDevSettingsSpecAsBinder;
        int i = 2 % 2;
        if (fromutf8bytearray.IAuthTabCallback()) {
            supportFilePath supportfilepath = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            List listOnExtraCallbackWithResult = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnExtraCallbackWithResult) {
                int i2 = access100 + 39;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                if (!(((StreamParsingException) obj) instanceof binToHexString)) {
                    arrayList.add(obj);
                }
            }
            supportfilepath.onNavigationEvent(arrayList);
        } else {
            supportFilePath supportfilepath2 = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            List listOnExtraCallbackWithResult2 = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listOnExtraCallbackWithResult2) {
                int i4 = IAuthTabCallbackStubProxy + 91;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                if (!(((StreamParsingException) obj2) instanceof binToHexString)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Integer numValueOf = Integer.valueOf(CollectionsKt.indexOf(arrayList3, fromutf8bytearray));
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                List listOnExtraCallback = fromutf8bytearray.onNavigationEvent().onExtraCallback();
                Intrinsics.checkNotNull(listOnExtraCallback);
                List<toggleElementInspector> list = listOnExtraCallback;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (toggleElementInspector toggleelementinspector : list) {
                    if (fromutf8bytearray instanceof toLowerCase) {
                        tolowercase = (toLowerCase) fromutf8bytearray;
                    } else {
                        int i6 = IAuthTabCallbackStubProxy + 51;
                        access100 = i6 % 128;
                        int i7 = i6 % 2;
                        tolowercase = null;
                    }
                    if (tolowercase != null) {
                        int i8 = access100 + 91;
                        IAuthTabCallbackStubProxy = i8 % 128;
                        int i9 = i8 % 2;
                        nativeDevSettingsSpecAsBinder = tolowercase.asBinder();
                    } else {
                        nativeDevSettingsSpecAsBinder = null;
                    }
                    arrayList4.add(new binToHexString(nativeDevSettingsSpecAsBinder, toggleelementinspector));
                }
                arrayList3.addAll(iIntValue, arrayList4);
            }
            supportfilepath2.onNavigationEvent(arrayList3);
        }
        ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).notifyDataSetChanged();
    }

    private final void onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        if (CollectionsKt.contains(((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult(), obj)) {
            int iIndexOf = CollectionsKt.indexOf(((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult(), obj);
            supportFilePath supportfilepath = (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            List listOnExtraCallbackWithResult = ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult();
            ArrayList arrayList = new ArrayList();
            int i2 = access100 + 115;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            for (Object obj2 : listOnExtraCallbackWithResult) {
                if (!Intrinsics.areEqual((StreamParsingException) obj2, obj)) {
                    int i4 = access100 + 115;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(obj2);
                    int i6 = IAuthTabCallbackStubProxy + 75;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            supportfilepath.onNavigationEvent(arrayList);
            ((supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).notifyItemRemoved(iIndexOf);
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub().onExtraCallback.asInterface().setEnabled(!((Boolean) FileBridgeExtension3.onExtraCallbackWithResult(-1562134314, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact(), null, 1, null}, 1562134357)).booleanValue());
        } else {
            IAuthTabCallbackStub().onExtraCallback.asInterface().setEnabled(!((Boolean) FileBridgeExtension3.onExtraCallbackWithResult(-1562134314, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{onTransact(), null, 1, null}, 1562134357)).booleanValue());
        }
    }

    private final void onNavigationEvent(boolean z) {
        setEnabledAmazonAdUnitIds setenabledamazonadunitids;
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        if (!z) {
            setenabledamazonadunitids = setEnabledAmazonAdUnitIds.NON_SECURE;
            int i4 = access100 + 125;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
        }
        BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{baseActivityRequireBaseActivity, setenabledamazonadunitids}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        baseActivityRequireBaseActivity.newSession();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DocumentWalletIssueInputFragment documentWalletIssueInputFragment = (DocumentWalletIssueInputFragment) objArr[0];
        int i = 2 % 2;
        Object[] objArr2 = {documentWalletIssueInputFragment.onTransact()};
        ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(1234508970, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr2, -1234508965)).observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new onWarmupCompleted()));
        documentWalletIssueInputFragment.onTransact().onExtraCallbackWithResult().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new onExtraCallbackWithResult()));
        Object[] objArr3 = {documentWalletIssueInputFragment.onTransact()};
        ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-1449511382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr3, 1449511426)).observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new IAuthTabCallback()));
        documentWalletIssueInputFragment.onTransact().extraCallback().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new asBinder()));
        Object[] objArr4 = {documentWalletIssueInputFragment.onTransact()};
        ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(-958348006, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr4, 958348026)).observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new IAuthTabCallbackDefault()));
        documentWalletIssueInputFragment.onTransact().IAuthTabCallback().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new onTransact()));
        documentWalletIssueInputFragment.onTransact().onMessageChannelReady().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new IAuthTabCallbackStub()));
        documentWalletIssueInputFragment.onTransact().onActivityResized().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new asInterface()));
        Object[] objArr5 = {documentWalletIssueInputFragment.onTransact()};
        ((LiveData) FileBridgeExtension3.onExtraCallbackWithResult(1507673556, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr5, -1507673525)).observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new access100()));
        documentWalletIssueInputFragment.onTransact().readTypedObject().observe(documentWalletIssueInputFragment.getViewLifecycleOwner(), new BaseFragment.asBinder(documentWalletIssueInputFragment.new onNavigationEvent()));
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(681876332, -681876332, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, DocumentWalletIssueInputFragment documentWalletIssueInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(-717284258, 717284259, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{str, documentWalletIssueInputFragment, commonModule_setLeftEdgeTouchEnabled}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(-805238507, 805238512, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment, setDetectableSize}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    public static final /* synthetic */ SessionTrackera onWarmupCompleted(DocumentWalletIssueInputFragment documentWalletIssueInputFragment) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (SessionTrackera) onExtraCallback(-934457292, 934457298, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    private final supportFilePath IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (supportFilePath) onExtraCallback(-18686365, 18686373, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    private final void asInterface() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(1103027986, -1103027983, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    private static final Unit onExtraCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(512436928, -512436921, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{documentWalletIssueInputFragment, setDetectableSize}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    private final void IAuthTabCallbackStubProxy() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(-1749550820, 1749550822, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback_Parcel = new int[]{-1192332980, 1090920370, 195448045, -632919089, 661859638, 544338659, -2067169420, -110242597, -1905572923, 978847894, -1890580523, -1113933180, 1247044824, 570741954, 376723325, -2091700787, -85400777, -744722541};
    }
}
