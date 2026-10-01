package im.toss.features.edoc.wallet.pkg;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzaq;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.issue.DocumentWalletIssueSelectTaxActivity;
import im.toss.features.edoc.wallet.pkg.PackageIssueFragment$;
import im.toss.features.edoc.wallet.pkg.PackageResultActivity;
import im.toss.featurescommon.address.search.RoadAddress;
import im.toss.featurescommon.address.search.Sido;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BigIntegers;
import o.CollectionStore;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.FaceDetectCallBack;
import o.FileBridgeExtension4;
import o.FileBridgeExtensionIExternalStoragePermissionCheckCallback;
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
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.Store;
import o.StoreException;
import o.StreamParser;
import o.StreamParsingException;
import o.Strings;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleBarExtension1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener;
import o.Utility;
import o.access13800;
import o.access14300;
import o.access8100;
import o.addAllCommandLine;
import o.binToHexString;
import o.extraCommand;
import o.findResAndMsg;
import o.fromUTF8ByteArray;
import o.getAdService;
import o.getDataFromLDAP;
import o.getDummyAd;
import o.getOriginalFullResponse;
import o.getSpecialFeatureOptInStatus;
import o.getUserFileSize;
import o.getWrite;
import o.initMiniApp;
import o.isApkAvailable;
import o.isValidIPv4WithNetmask;
import o.isValidIPv6;
import o.isValidIPv6WithNetmask;
import o.matches;
import o.maybeUpdateAnimatable;
import o.onAdViewAdDisplayFailed;
import o.onCheckPermissionResult;
import o.onFastRefresh;
import o.onPageExit;
import o.preFillDefault;
import o.r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.resumeForClick;
import o.setApTextSize;
import o.setDummyAd;
import o.setEnabledAmazonAdUnitIds;
import o.setHasShown;
import o.setPositionProvider;
import o.setRandomHost;
import o.showAlert;
import o.supportFilePath;
import o.supportFilePath$extraCallback;
import o.toLowerCase;
import o.toggleElementInspector;
import o.zip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PackageIssueFragment extends Hilt_PackageIssueFragment implements supportFilePath$extraCallback {
    private static byte[] IAuthTabCallback_Parcel;
    private static int access000;
    private static int access100;
    private static short[] extraCallback;
    private static int extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private final PageContext IAuthTabCallback;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder;
    private final SessionTrackera asInterface;
    private final Lazy onExtraCallback;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact;
    private Long onWarmupCompleted;

    @Inject
    public TitleBarExtension1 searchAddressIntent;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int writeTypedObject = 0;
    private static int readTypedObject = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4 = (s * 2) + 115;
        byte[] bArr = $$a;
        int i5 = 4 - (i * 2);
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i4 = (-i4) + i8;
            i5++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i4;
            i4 = bArr[i5];
            i4 = (-i4) + i8;
            i5++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        extraCallbackWithResult = 0;
        asBinder();
        onExtraCallbackWithResult = new addAllCommandLine[]{new PropertyReference1Impl<>(PackageIssueFragment.class, "binding", "getBinding()Lim/toss/features/edoc/databinding/FragmentDocumentWalletIssueBinding;", 0)};
        onNavigationEvent = 8;
        int i = ICustomTabsCallback + 73;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(packageIssueFragment, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageIssueFragment, iEngagementSignalsCallbackDefault);
        int i3 = writeTypedObject + 27;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageIssueFragment packageIssueFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(packageIssueFragment, onBackPressedCallback);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(packageIssueFragment, iEngagementSignalsCallbackDefault);
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, dialogInterface);
        int i4 = readTypedObject + 35;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent, str, setDetectableSize);
        int i4 = readTypedObject + 87;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        FileBridgeExtension4.onNavigationEvent onnavigationevent = (FileBridgeExtension4.onNavigationEvent) objArr[0];
        String str = (String) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{onnavigationevent, str, dialogInterface}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent3, 2054282729, -2054282723);
        int i3 = writeTypedObject + 115;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(onnavigationevent, str, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent, str, setDetectableSize);
        int i3 = writeTypedObject + 15;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, PackageIssueFragment packageIssueFragment, FileBridgeExtension4.onNavigationEvent onnavigationevent, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, packageIssueFragment, onnavigationevent, commonModule_setLeftEdgeTouchEnabled);
        int i4 = writeTypedObject + 41;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FileBridgeExtension4.onNavigationEvent onnavigationevent, PackageIssueFragment packageIssueFragment, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, packageIssueFragment, str, dialogInterface);
        int i4 = readTypedObject + 73;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(onnavigationevent, str, setDetectableSize);
        }
        onTransact(onnavigationevent, str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i5 | i2)) | i6;
        int i8 = i2 | i5 | i6;
        int i9 = ~i5;
        int i10 = i5 + i6 + i4 + ((-421447895) * i) + ((-859425246) * i3);
        int i11 = i10 * i10;
        int i12 = (i5 * (-629045104)) + 1817116672 + ((-629045104) * i6) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i4) + ((-2125594624) * i) + (888930304 * i3) + (441384960 * i11);
        int i13 = (i5 * 1303038832) + 2077918271 + (i6 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i4 * 1303038783) + (i * 1583617559) + (i3 * (-1102559138)) + (i11 * 510722048);
        switch (i12 + (i13 * i13 * 607191040)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
                int i14 = 2 % 2;
                supportFilePath supportfilepath = new supportFilePath(packageIssueFragment);
                int i15 = writeTypedObject + 123;
                readTypedObject = i15 % 128;
                int i16 = i15 % 2;
                return supportfilepath;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                PackageIssueFragment packageIssueFragment2 = (PackageIssueFragment) objArr[0];
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
                int i17 = 2 % 2;
                int i18 = writeTypedObject + 25;
                readTypedObject = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnTransact = onTransact(packageIssueFragment2, iEngagementSignalsCallbackDefault);
                int i20 = writeTypedObject + 25;
                readTypedObject = i20 % 128;
                int i21 = i20 % 2;
                return unitOnTransact;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageIssueFragment packageIssueFragment, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(packageIssueFragment, view);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageIssueFragment packageIssueFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(packageIssueFragment, setDetectableSize);
        int i4 = readTypedObject + 9;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageIssueFragment packageIssueFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageIssueFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = writeTypedObject + 21;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(packageIssueFragment, iEngagementSignalsCallbackDefault);
        int i4 = readTypedObject + 35;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ supportFilePath onWarmupCompleted(PackageIssueFragment packageIssueFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        supportFilePath supportfilepath = (supportFilePath) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 1955898053, -1955898051);
        int i4 = writeTypedObject + 93;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return supportfilepath;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 27;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class ICustomTabsCallbackStubProxy implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 0;
        public static final ICustomTabsCallbackStubProxy onExtraCallback = new ICustomTabsCallbackStubProxy();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 28 / 0;
            }
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public static final class ICustomTabsCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public ICustomTabsCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.edoc.wallet.pkg.PackageIssueFragment.ICustomTabsCallbackDefault.IAuthTabCallback + 31;
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.ICustomTabsCallbackDefault.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
        }
    }

    public static final /* synthetic */ zip IAuthTabCallback(PackageIssueFragment packageIssueFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return packageIssueFragment.onTransact();
        }
        packageIssueFragment.onTransact();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(PackageIssueFragment packageIssueFragment, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(packageIssueFragment, str);
        int i4 = writeTypedObject + 113;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        StreamParsingException streamParsingException = (StreamParsingException) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        packageIssueFragment.onExtraCallback(streamParsingException);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 103;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return null;
    }

    public static final /* synthetic */ onCheckPermissionResult IAuthTabCallbackStub(PackageIssueFragment packageIssueFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub = packageIssueFragment.IAuthTabCallbackStub();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = writeTypedObject + 105;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return oncheckpermissionresultIAuthTabCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        SessionTrackera sessionTrackera = packageIssueFragment.asInterface;
        int i5 = i3 + 39;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackera;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        packageIssueFragment.access100();
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallback(PackageIssueFragment packageIssueFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = packageIssueFragment.IAuthTabCallbackStub;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ void onExtraCallback(PackageIssueFragment packageIssueFragment, FileBridgeExtension4.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, onnavigationevent}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -1684971117, 1684971117);
            return;
        }
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent3, new Object[]{packageIssueFragment, onnavigationevent}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, -1684971117, 1684971117);
        int i3 = 83 / 0;
    }

    public static final /* synthetic */ void onExtraCallback(PackageIssueFragment packageIssueFragment, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        packageIssueFragment.onExtraCallback(z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, str}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 666069389, -666069382);
        int i4 = writeTypedObject + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    public static final /* synthetic */ supportFilePath onNavigationEvent(PackageIssueFragment packageIssueFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            packageIssueFragment.IAuthTabCallbackDefault();
            throw null;
        }
        supportFilePath supportfilepathIAuthTabCallbackDefault = packageIssueFragment.IAuthTabCallbackDefault();
        int i3 = writeTypedObject + 111;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return supportfilepathIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(PackageIssueFragment packageIssueFragment, fromUTF8ByteArray fromutf8bytearray) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        packageIssueFragment.onExtraCallbackWithResult((fromUTF8ByteArray<Strings>) fromutf8bytearray);
        int i4 = readTypedObject + 83;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = packageIssueFragment.asBinder;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 11;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ void onWarmupCompleted(PackageIssueFragment packageIssueFragment, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        packageIssueFragment.onExtraCallbackWithResult(obj);
        int i4 = readTypedObject + 61;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public PackageIssueFragment() {
        super(R.layout.fragment_document_wallet_issue);
        this.IAuthTabCallbackStubProxy = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(onCheckPermissionResult.class), new isEngagementSignalsApiAvailable(this), new mayLaunchUrl(null, this), new ICustomTabsService(this));
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new PackageIssueFragment$.ExternalSyntheticLambda8(this));
        this.IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new PackageIssueFragment$.ExternalSyntheticLambda9(this));
        this.onTransact = onPageExit.onNavigationEvent(this, new PackageIssueFragment$.ExternalSyntheticLambda10(this));
        this.asBinder = onPageExit.onNavigationEvent(this, new PackageIssueFragment$.ExternalSyntheticLambda11(this));
        this.IAuthTabCallbackStub = onPageExit.onNavigationEvent(this, new PackageIssueFragment$.ExternalSyntheticLambda12(this));
        this.asInterface = AppLovinAdImpl.IAuthTabCallback(this, new PackageIssueFragment$.ExternalSyntheticLambda13(this));
    }

    public final TitleBarExtension1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 27;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        TitleBarExtension1 titleBarExtension1 = this.searchAddressIntent;
        if (titleBarExtension1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 33;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return titleBarExtension1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r1 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r2 = r2 + 59;
        im.toss.features.edoc.wallet.pkg.PackageIssueFragment.readTypedObject = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 71;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getDummyAd getdummyad = packageIssueFragment.standardTermsV2Intent;
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("trx_id", (String) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1958115472, new Object[]{IAuthTabCallbackStub()}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1958115517));
        FileBridgeExtension4.onNavigationEvent onnavigationeventOnExtraCallback = IAuthTabCallbackStub().writeTypedObject().onExtraCallback();
        String strOnExtraCallback = null;
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("doc_code", onnavigationeventOnExtraCallback != null ? Long.valueOf(onnavigationeventOnExtraCallback.onExtraCallbackWithResult()) : null);
        FileBridgeExtension4.onNavigationEvent onnavigationeventOnExtraCallback2 = IAuthTabCallbackStub().writeTypedObject().onExtraCallback();
        if (onnavigationeventOnExtraCallback2 != null) {
            int i2 = writeTypedObject + 87;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationeventOnExtraCallback2.onExtraCallback();
                throw null;
            }
            strOnExtraCallback = onnavigationeventOnExtraCallback2.onExtraCallback();
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("doc_title", strOnExtraCallback);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("from", IAuthTabCallbackStub().IAuthTabCallbackStub());
        Object[] objArr = new Object[1];
        a((short) (5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) ((-45) - TextUtils.getCapsMode("", 0, 0)), (-1359987022) - View.getDefaultSize(0, 0), (-272250564) + (ViewConfiguration.getKeyRepeatDelay() >> 16), (-14) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), (String) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 179536895, new Object[]{IAuthTabCallbackStub()}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -179536879))});
        int i3 = readTypedObject + 119;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return mapOnExtraCallbackWithResult;
    }

    private final onCheckPermissionResult IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onCheckPermissionResult oncheckpermissionresult = (onCheckPermissionResult) this.IAuthTabCallbackStubProxy.getValue();
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return oncheckpermissionresult;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, zip> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 73;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallbackWithResult() {
            super(1, zip.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/edoc/databinding/FragmentDocumentWalletIssueBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            zip zipVarOnExtraCallback = onExtraCallback((View) obj);
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zipVarOnExtraCallback;
        }

        public final zip onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            zip zipVarOnExtraCallback = zip.onExtraCallback(view);
            int i4 = onWarmupCompleted + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return zipVarOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final zip onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        readTypedObject = i2 % 128;
        return this.IAuthTabCallback.onExtraCallbackWithResult(this, i2 % 2 == 0 ? onExtraCallbackWithResult[1] : onExtraCallbackWithResult[0]);
    }

    private final supportFilePath IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallback.getValue();
        if (i3 == 0) {
            return (supportFilePath) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStubProxy();
        asInterface();
        IAuthTabCallbackStub().onMessageChannelReady();
        int i4 = writeTypedObject + 105;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onTransact(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        packageIssueFragment.onTransact().onExtraCallback.asInterface().setLoading(false);
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = readTypedObject + 69;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {packageIssueFragment.IAuthTabCallbackStub()};
            onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1252443091, objArr, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1252443074);
            int i6 = writeTypedObject + 81;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        } else {
            packageIssueFragment.IAuthTabCallbackStub().ICustomTabsCallbackStub();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        Serializable serializableExtra;
        RoadAddress roadAddress;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            RoadAddress roadAddress2 = null;
            if (intentOnExtraCallbackWithResult != null) {
                Object[] objArr = new Object[1];
                a((short) (57 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (ImageFormat.getBitsPerPixel(0) - 91), (-1359987031) - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) - 272250563, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 16, objArr);
                serializableExtra = intentOnExtraCallbackWithResult.getSerializableExtra(((String) objArr[0]).intern());
                int i2 = writeTypedObject + 53;
                readTypedObject = i2 % 128;
                int i3 = i2 % 2;
            } else {
                serializableExtra = null;
            }
            if (serializableExtra instanceof RoadAddress) {
                int i4 = readTypedObject + 85;
                int i5 = i4 % 128;
                writeTypedObject = i5;
                if (i4 % 2 != 0) {
                    roadAddress = (RoadAddress) serializableExtra;
                    int i6 = 55 / 0;
                } else {
                    roadAddress = (RoadAddress) serializableExtra;
                }
                int i7 = i5 + 83;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                roadAddress2 = roadAddress;
            }
            packageIssueFragment.IAuthTabCallbackStub().onExtraCallbackWithResult(packageIssueFragment.onWarmupCompleted, roadAddress2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        ArrayList parcelableArrayListExtra;
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = writeTypedObject + 55;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                int i6 = writeTypedObject + 59;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                a((short) (KeyEvent.keyCodeFromString("") + 56), (byte) (TextUtils.getTrimmedLength("") - 92), (-1359987030) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-272250564) - ExpandableListView.getPackedPositionGroup(0L), (-16) - KeyEvent.keyCodeFromString(""), objArr);
                parcelableArrayListExtra = intentOnExtraCallbackWithResult.getParcelableArrayListExtra(((String) objArr[0]).intern());
            } else {
                parcelableArrayListExtra = null;
            }
            packageIssueFragment.IAuthTabCallbackStub().onWarmupCompleted(parcelableArrayListExtra);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            FragmentActivity fragmentActivityRequireActivity = packageIssueFragment.requireActivity();
            fragmentActivityRequireActivity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            fragmentActivityRequireActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        FragmentActivity fragmentActivityRequireActivity2 = packageIssueFragment.requireActivity();
        fragmentActivityRequireActivity2.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        fragmentActivityRequireActivity2.finish();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onNavigationEvent(PackageIssueFragment packageIssueFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        packageIssueFragment.IAuthTabCallbackStub().ICustomTabsCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 9;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void asInterface() {
        int i = 2 % 2;
        zip zipVarOnTransact = onTransact();
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new PackageIssueFragment$.ExternalSyntheticLambda14(this), 2, (Object) null);
        RecyclerView recyclerView = zipVarOnTransact.onExtraCallbackWithResult;
        supportFilePath supportfilepathIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        SecureKeyboardView secureKeyboardView = zipVarOnTransact.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
        supportFilePath.onNavigationEvent(-1678208604, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{supportfilepathIAuthTabCallbackDefault, secureKeyboardView}, 1678208610, matches.onExtraCallback(), matches.onExtraCallback());
        recyclerView.setAdapter(supportfilepathIAuthTabCallbackDefault);
        zipVarOnTransact.onExtraCallback.asInterface().setEnabled(false);
        TdsBottomCtaV1View tdsBottomCtaV1View = zipVarOnTransact.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, viva.republica.toss.R.string.next, new PackageIssueFragment$.ExternalSyntheticLambda15(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = readTypedObject + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    private static final Unit IAuthTabCallback(PackageIssueFragment packageIssueFragment, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(packageIssueFragment.getScreenParams());
            unit = Unit.INSTANCE;
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(packageIssueFragment.getScreenParams());
            unit = Unit.INSTANCE;
        }
        int i4 = readTypedObject + 97;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(PackageIssueFragment packageIssueFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1221417L, false, (String) null, (Map) null, new PackageIssueFragment$.ExternalSyntheticLambda0(packageIssueFragment), 14, (Object) null);
        packageIssueFragment.IAuthTabCallbackStub().ICustomTabsCallbackDefault();
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class ICustomTabsService extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsService(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class isEngagementSignalsApiAvailable extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public isEngagementSignalsApiAvailable(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
            Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class mayLaunchUrl extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mayLaunchUrl(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 3 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = IAuthTabCallback + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onActivityLayout implements Function1<SetDetectableSize, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ PackageIssueFragment onExtraCallback;
        final /* synthetic */ Throwable onWarmupCompleted;

        onActivityLayout(Throwable th, PackageIssueFragment packageIssueFragment) {
            this.onWarmupCompleted = th;
            this.onExtraCallback = packageIssueFragment;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((SetDetectableSize) obj);
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        public final void onNavigationEvent(SetDetectableSize setDetectableSize) {
            String strOnExtraCallback;
            String str = "";
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            String message = this.onWarmupCompleted.getMessage();
            Long lValueOf = null;
            if (message == null) {
                int i2 = onNavigationEvent + 15;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                message = "";
            }
            setDetectableSize.onExtraCallback("error_msg", message);
            FileBridgeExtension4.onNavigationEvent onnavigationeventOnExtraCallback = PackageIssueFragment.IAuthTabCallbackStub(this.onExtraCallback).writeTypedObject().onExtraCallback();
            if (onnavigationeventOnExtraCallback != null) {
                lValueOf = Long.valueOf(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
            } else {
                int i3 = onNavigationEvent + 43;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            setDetectableSize.onExtraCallback("doc_code", lValueOf);
            FileBridgeExtension4.onNavigationEvent onnavigationeventOnExtraCallback2 = PackageIssueFragment.IAuthTabCallbackStub(this.onExtraCallback).writeTypedObject().onExtraCallback();
            if (onnavigationeventOnExtraCallback2 != null && (strOnExtraCallback = onnavigationeventOnExtraCallback2.onExtraCallback()) != null) {
                str = strOnExtraCallback;
            }
            setDetectableSize.onExtraCallback("doc_title", str);
        }
    }

    static final class onMessageChannelReady implements Function1<SetDetectableSize, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        onMessageChannelReady() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((SetDetectableSize) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 61 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 53;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onWarmupCompleted(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(PackageIssueFragment.this.getScreenParams());
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(access000)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 42, 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = IAuthTabCallback_Parcel;
                if (bArr2 != null) {
                    int i7 = $10 + 13;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 91;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), AndroidCharacter.getMirror('0') + 7, KeyEvent.getDeadChar(0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8 %= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 55, KeyEvent.normalizeMetaState(0) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                    }
                    int i10 = $10 + 79;
                    $11 = i10 % 128;
                    i4 = 2;
                    int i11 = i10 % 2;
                    bArr2 = bArr;
                } else {
                    i4 = 2;
                }
                if (bArr2 != null) {
                    int i12 = $10 + 123;
                    $11 = i12 % 128;
                    if (i12 % i4 == 0) {
                        byte[] bArr3 = IAuthTabCallback_Parcel;
                        Object[] objArr5 = new Object[i4];
                        objArr5[1] = Integer.valueOf(getInterfaceDescriptor);
                        objArr5[0] = Integer.valueOf(i);
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, 22439 - (ViewConfiguration.getTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] | (-4629411779493505016L))) / ((int) (access000 * (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = IAuthTabCallback_Parcel;
                        Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16820640), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.getSize(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue()] ^ (-4629411779493505016L))) + ((int) (access000 ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (extraCallback[i + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (access000 ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (getInterfaceDescriptor ^ j)) + (!z2 ? 0 : 1);
                Object[] objArr7 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(access100), sb};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), Color.red(0) + 86, TextUtils.getCapsMode("", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback6).invoke(null, objArr7)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallback_Parcel;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr6[i13] = (byte) (bArr5[i13] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i14 = $11 + 63;
                    int i15 = i14 % 128;
                    $10 = i15;
                    int i16 = i14 % 2;
                    int i17 = i15 + 23;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i19 = $11 + 23;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        byte[] bArr7 = IAuthTabCallback_Parcel;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = extraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static final class onMinimized implements Function1<SetDetectableSize, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        onMinimized() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((SetDetectableSize) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallback(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(PackageIssueFragment.this.getScreenParams());
            int i4 = onNavigationEvent + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class ICustomTabsCallbackStub implements Function1<SetDetectableSize, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        ICustomTabsCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((SetDetectableSize) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback(PackageIssueFragment.this.getScreenParams());
                throw null;
            }
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(PackageIssueFragment.this.getScreenParams());
            int i3 = onExtraCallbackWithResult + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final class onRelationshipValidationResult implements Runnable {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        onRelationshipValidationResult() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            List listOnExtraCallbackWithResult = PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).onExtraCallbackWithResult();
            ArrayList arrayList = new ArrayList();
            Iterator it = listOnExtraCallbackWithResult.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!((fromUTF8ByteArray) obj2).IAuthTabCallback()) {
                            arrayList2.add(obj2);
                            int i2 = onWarmupCompleted + 83;
                            IAuthTabCallback = i2 % 128;
                            int i3 = i2 % 2;
                        }
                    }
                    PackageIssueFragment packageIssueFragment = PackageIssueFragment.this;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int i4 = IAuthTabCallback + 25;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            PackageIssueFragment.IAuthTabCallbackStub(packageIssueFragment).IAuthTabCallback((fromUTF8ByteArray) it2.next());
                            throw null;
                        }
                        PackageIssueFragment.IAuthTabCallbackStub(packageIssueFragment).IAuthTabCallback((fromUTF8ByteArray) it2.next());
                    }
                    return;
                }
                Object next = it.next();
                if (next instanceof fromUTF8ByteArray) {
                    int i5 = IAuthTabCallback + 59;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        arrayList.add(next);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
        }
    }

    private static final void onWarmupCompleted(PackageIssueFragment packageIssueFragment, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = packageIssueFragment.IAuthTabCallbackDefault;
        r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback = UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener.IAuthTabCallback.IAuthTabCallback();
        Context contextRequireContext = packageIssueFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNull(str);
        iEngagementSignalsCallback_Parcel.onNavigationEvent(r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.onExtraCallback(r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback, contextRequireContext, str, true, (GriverTransActivityLite1) null, (GriverTransActivityLite2) null, (UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2) null, (String) null, "electronic_document", (String) null, (List) null, false, false, (r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.IAuthTabCallback) null, 8056, (Object) null));
        int i4 = writeTypedObject + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class readTypedObject implements Function1<SetDetectableSize, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        readTypedObject() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((SetDetectableSize) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("public_cert_yn", "n");
            setDetectableSize.onExtraCallback(PackageIssueFragment.this.getScreenParams());
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallback implements Function1<Pair<? extends Boolean, ? extends String>, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(Pair<? extends Boolean, ? extends String> pair) {
            int i = 2 % 2;
            Pair<? extends Boolean, ? extends String> pair2 = pair;
            boolean zBooleanValue = ((Boolean) pair2.onExtraCallbackWithResult()).booleanValue();
            String str = (String) pair2.IAuthTabCallback();
            if (str.length() > 0) {
                ConstraintLayout constraintLayout = PackageIssueFragment.IAuthTabCallback(PackageIssueFragment.this).IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(constraintLayout, str);
                TdsBottomCtaV1View tdsBottomCtaV1View = PackageIssueFragment.IAuthTabCallback(PackageIssueFragment.this).onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
                onnavigationevent.onNavigationEvent(tdsBottomCtaV1View);
                if (!(!zBooleanValue)) {
                    TdsToastV1.onNavigationEvent.onNavigationEvent(onnavigationevent, im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null);
                    int i2 = onWarmupCompleted + 125;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                }
                onnavigationevent.onNavigationEvent();
                int i4 = onWarmupCompleted + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public static final class IAuthTabCallbackDefault implements Function1<Throwable, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            int i5 = onNavigationEvent + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Throwable th2 = th;
                if (th2 instanceof FileBridgeExtensionIExternalStoragePermissionCheckCallback) {
                    PackageIssueFragment.this.requireActivity().finish();
                    int i3 = onNavigationEvent + 23;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 84 / 0;
                        return;
                    }
                    return;
                }
                if (th2 instanceof isApkAvailable) {
                    Context contextRequireContext = PackageIssueFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new ICustomTabsCallback(PackageIssueFragment.this));
                    return;
                }
                if (th2 instanceof TossApiCallException.ApiError) {
                    ConvertByteArrayToFloatArray.onExtraCallback(1228553L, false, (String) null, (Map) null, new onActivityLayout(th2, PackageIssueFragment.this), 14, (Object) null);
                }
                getUserFileSize getuserfilesize = getUserFileSize.onNavigationEvent;
                Context contextRequireContext2 = PackageIssueFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                Intrinsics.checkNotNull(th2);
                getuserfilesize.onExtraCallbackWithResult(contextRequireContext2, th2, new onActivityResized(th2, PackageIssueFragment.this));
                return;
            }
            boolean z = th instanceof FileBridgeExtensionIExternalStoragePermissionCheckCallback;
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<String, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str2 = str;
            Intrinsics.checkNotNull(str2);
            if (str2.length() > 0) {
                SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, PackageIssueFragment.this.requireActivity(), str2, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i4 = onExtraCallbackWithResult + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            FragmentActivity fragmentActivityRequireActivity = PackageIssueFragment.this.requireActivity();
            fragmentActivityRequireActivity.setResult(-1, new Intent().putExtra("status", "IN_PROCESS"));
            fragmentActivityRequireActivity.finish();
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function1<Boolean, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public IAuthTabCallbackStubProxy() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            if (r12.length() != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r12.length() != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            r1 = im.toss.features.edoc.wallet.pkg.PackageIssueFragment.IAuthTabCallbackStubProxy.onNavigationEvent + 25;
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.IAuthTabCallbackStubProxy.onExtraCallbackWithResult = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if ((r1 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.onExtraCallbackWithResult(r11.IAuthTabCallback, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.onExtraCallbackWithResult(r11.IAuthTabCallback, r12);
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(Boolean bool) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (bool.booleanValue()) {
                    PackageIssueFragment.IAuthTabCallback(PackageIssueFragment.this).onExtraCallback.asInterface().setLoading(true);
                    ConvertByteArrayToFloatArray.onExtraCallback(1221413L, false, (String) null, (Map) null, PackageIssueFragment.this.new onMinimized(), 14, (Object) null);
                    String strOnWarmupCompleted = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).writeTypedObject().onWarmupCompleted();
                    if (strOnWarmupCompleted != null) {
                        int i3 = onNavigationEvent + 73;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 15 / 0;
                        }
                    }
                    PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).mayLaunchUrl();
                    return;
                }
                return;
            }
            bool.booleanValue();
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<StreamParsingException, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallback_Parcel() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(StreamParsingException streamParsingException) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                StreamParsingException streamParsingException2 = streamParsingException;
                PackageIssueFragment packageIssueFragment = PackageIssueFragment.this;
                Intrinsics.checkNotNull(streamParsingException2);
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, streamParsingException2}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 2090175284, -2090175274);
                return;
            }
            StreamParsingException streamParsingException3 = streamParsingException;
            PackageIssueFragment packageIssueFragment2 = PackageIssueFragment.this;
            Intrinsics.checkNotNull(streamParsingException3);
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent3, new Object[]{packageIssueFragment2, streamParsingException3}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, 2090175284, -2090175274);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class access000 implements Function1<fromUTF8ByteArray<?>, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public access000() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(fromUTF8ByteArray<?> fromutf8bytearray) {
            int i = 2 % 2;
            fromUTF8ByteArray<?> fromutf8bytearray2 = fromutf8bytearray;
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this);
            Intrinsics.checkNotNull(fromutf8bytearray2);
            oncheckpermissionresultIAuthTabCallbackStub.IAuthTabCallback(fromutf8bytearray2);
            if (CollectionsKt.contains(PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).onExtraCallbackWithResult(), fromutf8bytearray2)) {
                PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).notifyItemChanged(CollectionsKt.indexOf(PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).onExtraCallbackWithResult(), fromutf8bytearray2));
            }
            if (!(fromutf8bytearray2.onNavigationEvent() instanceof Strings)) {
                int i2 = onExtraCallbackWithResult + 5;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 2;
                }
                fromutf8bytearray2 = null;
            }
            if (fromutf8bytearray2 != null) {
                int i7 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this, fromutf8bytearray2);
                    int i8 = 23 / 0;
                } else {
                    PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this, fromutf8bytearray2);
                }
            }
            PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{PackageIssueFragment.this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 2055914037, -2055914036);
        }
    }

    public static final class access100 implements Function1<FileBridgeExtension4.onNavigationEvent, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public access100() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent) {
            boolean z;
            Collection collectionEmptyList;
            Object next;
            int i = 2 % 2;
            FileBridgeExtension4.onNavigationEvent onnavigationevent2 = onnavigationevent;
            ConvertByteArrayToFloatArray.onExtraCallback(1221413L, false, (String) null, (Map) null, PackageIssueFragment.this.new ICustomTabsCallbackStub(), 14, (Object) null);
            List listOnWarmupCompleted = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).onWarmupCompleted();
            if (listOnWarmupCompleted != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = listOnWarmupCompleted.iterator();
                while (it.hasNext()) {
                    int i2 = onExtraCallbackWithResult + 13;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        boolean z2 = it.next() instanceof fromUTF8ByteArray;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object next2 = it.next();
                    if (!(!(next2 instanceof fromUTF8ByteArray))) {
                        arrayList.add(next2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i3 = onWarmupCompleted + 75;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (((fromUTF8ByteArray) it2.next()).onNavigationEvent() instanceof StoreException) {
                            int i5 = onExtraCallbackWithResult + 49;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            z = true;
                            break;
                        }
                    }
                } else {
                    int i7 = onExtraCallbackWithResult + 71;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
                z = false;
            } else {
                z = false;
            }
            PackageIssueFragment.onExtraCallback(PackageIssueFragment.this, z);
            List listOnWarmupCompleted2 = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).onWarmupCompleted();
            if (listOnWarmupCompleted2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = listOnWarmupCompleted2.iterator();
                while (it3.hasNext()) {
                    int i9 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        next = it3.next();
                        int i10 = 12 / 0;
                        if (!(!(next instanceof StreamParsingException))) {
                            arrayList2.add(next);
                        }
                    } else {
                        next = it3.next();
                        if (next instanceof StreamParsingException) {
                            arrayList2.add(next);
                        }
                    }
                }
                collectionEmptyList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    int i11 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    if (!((StreamParsingException) obj2).IAuthTabCallbackStub()) {
                        collectionEmptyList.add(obj2);
                    }
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(new BigIntegers(onnavigationevent2.IAuthTabCallbackStubProxy(), onnavigationevent2.onTransact()));
            listCreateListBuilder.addAll(collectionEmptyList);
            listCreateListBuilder.add(new getDataFromLDAP(32.0f));
            PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).onExtraCallbackWithResult(CollectionsKt.build(listCreateListBuilder), true);
            onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1279982537, new Object[]{PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this)}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1279982539);
            PackageIssueFragment.IAuthTabCallback(PackageIssueFragment.this).onExtraCallbackWithResult.post(PackageIssueFragment.this.new onRelationshipValidationResult());
            PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{PackageIssueFragment.this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 2055914037, -2055914036);
            PackageIssueFragment packageIssueFragment = PackageIssueFragment.this;
            Intrinsics.checkNotNull(onnavigationevent2);
            PackageIssueFragment.onExtraCallback(packageIssueFragment, onnavigationevent2);
        }
    }

    public static final class asBinder implements Function1<Boolean, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(Boolean bool) {
            int i = 2 % 2;
            Boolean bool2 = bool;
            setPositionProvider.IAuthTabCallback iAuthTabCallback = new setPositionProvider.IAuthTabCallback();
            int i2 = R.id.packageIssueFragment;
            Intrinsics.checkNotNull(bool2);
            Object obj = null;
            RippleNode.onNavigationEvent(PackageIssueFragment.this).onWarmupCompleted(R.id.action_to_packageInputFragment, (Bundle) null, setPositionProvider.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, i2, bool2.booleanValue(), false, 4, (Object) null).onExtraCallbackWithResult());
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Function1<showAlert, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(showAlert showalert) {
            int i = 2 % 2;
            showAlert showalert2 = showalert;
            List listOnExtraCallback = showalert2.onExtraCallback();
            if (listOnExtraCallback == null || listOnExtraCallback.isEmpty()) {
                Context contextRequireContext = PackageIssueFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, PackageIssueFragment.this.new extraCallbackWithResult());
                return;
            }
            Object[] objArr = {PackageIssueFragment.this};
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel = (IEngagementSignalsCallback_Parcel) PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -2517099, 2517103);
            DocumentWalletIssueSelectTaxActivity.onExtraCallbackWithResult onextracallbackwithresult = DocumentWalletIssueSelectTaxActivity.Companion;
            Context contextRequireContext2 = PackageIssueFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            List listOnExtraCallback2 = showalert2.onExtraCallback();
            Intrinsics.checkNotNull(listOnExtraCallback2);
            List listOnExtraCallbackWithResult = PackageIssueFragment.onNavigationEvent(PackageIssueFragment.this).onExtraCallbackWithResult();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnExtraCallbackWithResult) {
                if (obj instanceof binToHexString) {
                    int i2 = onWarmupCompleted + 5;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(obj);
                        int i3 = 68 / 0;
                    } else {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i4 = IAuthTabCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = onWarmupCompleted + 125;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList2.add(((binToHexString) it.next()).IAuthTabCallback());
                    int i7 = 5 / 0;
                } else {
                    arrayList2.add(((binToHexString) it.next()).IAuthTabCallback());
                }
                int i8 = onWarmupCompleted + 77;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(onextracallbackwithresult.onExtraCallback(contextRequireContext2, listOnExtraCallback2, arrayList2));
        }
    }

    public static final class getInterfaceDescriptor implements Function1<Object, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public getInterfaceDescriptor() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                PackageIssueFragment packageIssueFragment = PackageIssueFragment.this;
                Intrinsics.checkNotNull(obj);
                PackageIssueFragment.onWarmupCompleted(packageIssueFragment, obj);
                throw null;
            }
            PackageIssueFragment packageIssueFragment2 = PackageIssueFragment.this;
            Intrinsics.checkNotNull(obj);
            PackageIssueFragment.onWarmupCompleted(packageIssueFragment2, obj);
            int i3 = onWarmupCompleted + 3;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallback implements Function1<onFastRefresh, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(onFastRefresh onfastrefresh) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).readTypedObject();
                throw null;
            }
            onFastRefresh onfastrefresh2 = onfastrefresh;
            if (PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).readTypedObject()) {
                int i3 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    onfastrefresh2.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                DocumentWalletPollCheckMeta documentWalletPollCheckMetaOnExtraCallback = onfastrefresh2.onExtraCallback();
                if (documentWalletPollCheckMetaOnExtraCallback != null && documentWalletPollCheckMetaOnExtraCallback.IAuthTabCallback() == 0) {
                    PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).onExtraCallbackWithResult();
                    return;
                }
            }
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnExtraCallback = PackageIssueFragment.onExtraCallback(PackageIssueFragment.this);
            PackageResultActivity.onExtraCallback onextracallback = PackageResultActivity.Companion;
            Context contextRequireContext = PackageIssueFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Object[] objArr = {PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this)};
            String str = (String) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1958115472, objArr, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1958115517);
            DocumentWalletPollCheckMeta documentWalletPollCheckMetaOnExtraCallback2 = onfastrefresh2.onExtraCallback();
            boolean typedObject = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).readTypedObject();
            String strIAuthTabCallbackStub = PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).IAuthTabCallbackStub();
            Object[] objArr2 = {PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this)};
            iEngagementSignalsCallback_ParcelOnExtraCallback.onNavigationEvent(PackageResultActivity.onExtraCallback.onExtraCallbackWithResult(onextracallback, contextRequireContext, str, documentWalletPollCheckMetaOnExtraCallback2, typedObject, false, null, null, null, strIAuthTabCallbackStub, (String) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 179536895, objArr2, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -179536879), PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).IAuthTabCallbackStubProxy(), true, 224, null));
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onNavigationEvent implements Function1<Boolean, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(Boolean bool) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!bool.booleanValue()) {
                    PackageIssueFragment.this.dismissProgressDialog();
                    return;
                }
                BaseFragment.showProgressDialog$default(PackageIssueFragment.this, (String) null, false, 3, (Object) null);
                int i3 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function1<Boolean, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            int i5 = IAuthTabCallback + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(Boolean bool) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!bool.booleanValue()) {
                ConvertByteArrayToFloatArray.onExtraCallback(1221415L, false, (String) null, (Map) null, PackageIssueFragment.this.new onMessageChannelReady(), 14, (Object) null);
                Context contextRequireContext = PackageIssueFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new onPostMessage(PackageIssueFragment.this));
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = onNavigationEvent + 87;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                RippleNode.onNavigationEvent(PackageIssueFragment.this).access100();
            } else {
                RippleNode.onNavigationEvent(PackageIssueFragment.this).access100();
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<String, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        
            r5 = r23.onWarmupCompleted.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r11 = im.toss.features.edoc.wallet.pkg.PackageIssueFragment.ICustomTabsCallbackStubProxy.onExtraCallback;
            o.logAndOpenStore.IAuthTabCallback(r5, (java.lang.Long) null);
            r14 = new o.getTypedExportedConstants(r5, 0, false, false, -1, r11, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            o.ConvertByteArrayToFloatArray.onExtraCallback(1221535, false, (java.lang.String) null, (java.util.Map) null, new im.toss.features.edoc.wallet.pkg.PackageIssueFragment.readTypedObject(r23.onWarmupCompleted), 14, (java.lang.Object) null);
            r4 = r14.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
            r5 = new android.widget.LinearLayout(r4);
            r5.setOrientation(1);
            r7 = r5.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
            r4 = new im.toss.uikit.widget.dialog.BottomSheetHeader(r7, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            r4.setTitle(r23.onWarmupCompleted.getString(im.toss.features.edoc.R.string.edoc_wallet_pkg___70eead420f));
            r4.setShowCloseIcon(false);
            o.setProxySelectorokhttp.onExtraCallbackWithResult(r5, r4);
            r4 = (im.toss.tds.view.component.atom.text.BaseTextView) im.toss.tds.view.component.atom.text.Typography5.class.getDeclaredConstructor(android.content.Context.class).newInstance(r5.getContext());
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
            r4.setText(r23.onWarmupCompleted.getString(im.toss.features.edoc.R.string.edoc_wallet_pkg___8a1a8ad2cd));
            r7 = r4.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
            r7 = r7.getResources().getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
            r4.setTextColor(new o.getUrlokhttp(new im.toss.features.edoc.wallet.pkg.PackageIssueFragment.ICustomTabsCallbackDefault(r7)).ICustomTabsCallbackStubProxy());
            r4.setPadding(o.varyMatches.IAuthTabCallback(r4, r2), 0, o.varyMatches.IAuthTabCallback(r4, r2), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
            o.setProxySelectorokhttp.onExtraCallbackWithResult(r5, r4);
            r2 = r5.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
            r1 = new im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View(r2);
            im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.setCta$default(r1, im.toss.uikit.R.string.uikit_confirm, new im.toss.features.edoc.wallet.pkg.PackageIssueFragment.writeTypedObject(r14, r23.onWarmupCompleted, r3), (im.toss.tds.view.component.atom.button.TdsButtonV1View.asInterface) null, false, 12, (java.lang.Object) null);
            o.setProxySelectorokhttp.onExtraCallbackWithResult(r5, r1);
            r14.setOnCancelListener(new im.toss.features.edoc.wallet.pkg.PackageIssueFragment.extraCallback(r23.onWarmupCompleted));
            r14.setContentView(r5);
            r14.show();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0144, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            if (im.toss.features.edoc.wallet.pkg.PackageIssueFragment.IAuthTabCallbackStub(r23.onWarmupCompleted).asInterface() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (im.toss.features.edoc.wallet.pkg.PackageIssueFragment.IAuthTabCallbackStub(r23.onWarmupCompleted).asInterface() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.IAuthTabCallback(r23.onWarmupCompleted, r3);
            r2 = im.toss.features.edoc.wallet.pkg.PackageIssueFragment.onWarmupCompleted.onExtraCallbackWithResult + 3;
            im.toss.features.edoc.wallet.pkg.PackageIssueFragment.onWarmupCompleted.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(String str) {
            int i;
            String str2;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                i = 92;
                str2 = str;
            } else {
                i = 24;
                str2 = str;
            }
        }
    }

    static final class extraCallback implements DialogInterface.OnCancelListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        extraCallback() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PackageIssueFragment.IAuthTabCallback(PackageIssueFragment.this).onExtraCallback.asInterface().setLoading(false);
            PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this).ICustomTabsCallbackStub();
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class extraCallbackWithResult implements Function1<CommonModule_setLeftEdgeTouchEnabled, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        extraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((CommonModule_setLeftEdgeTouchEnabled) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(PackageIssueFragment.this.getString(R.string.edoc_wallet_pkg___0174e67fa4));
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 0, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                return;
            }
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(PackageIssueFragment.this.getString(R.string.edoc_wallet_pkg___0174e67fa4));
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
    }

    private static final Unit onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i3 = readTypedObject + 13;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            packageIssueFragment.IAuthTabCallbackStub().mayLaunchUrl();
            i = writeTypedObject + 101;
        } else {
            packageIssueFragment.onTransact().onExtraCallback.asInterface().setLoading(false);
            packageIssueFragment.IAuthTabCallbackStub().ICustomTabsCallbackStub();
            i = writeTypedObject + 57;
        }
        readTypedObject = i % 128;
        int i5 = i % 2;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(packageIssueFragment), (CoroutineContext) null, (setRandomHost) null, packageIssueFragment.new onUnminimized((String) objArr[1], null), 3, (Object) null);
        int i2 = readTypedObject + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class onUnminimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $standardTermsId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onUnminimized(String str, access13800<? super onUnminimized> access13800Var) {
            super(2, access13800Var);
            this.$standardTermsId = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = PackageIssueFragment.this.new onUnminimized(this.$standardTermsId, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onunminimized;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyad = (getDummyAd) PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{PackageIssueFragment.this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -942882106, 942882111);
                Context contextRequireContext = PackageIssueFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Context contextRequireContext2 = PackageIssueFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr = {new StandardTermsV2CustomVariable("{{docName}}", setDummyAd.onNavigationEvent(contextRequireContext2, R.string.edoc_standard_terms_v2_title_subject, new Object[0]))};
                String str2 = (String) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 179536895, new Object[]{PackageIssueFragment.IAuthTabCallbackStub(PackageIssueFragment.this)}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -179536879);
                if (str2 == null) {
                    int i3 = onWarmupCompleted + 87;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    str = "";
                } else {
                    str = str2;
                }
                String str3 = this.$standardTermsId;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyad, contextRequireContext, str3, str, "document_wallet_issue", 97L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, standardTermsV2CustomVariableArr, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388064, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i4 = onWarmupCompleted + 77;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 69;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            ((SessionTrackera) PackageIssueFragment.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{PackageIssueFragment.this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 516726803, -516726792)).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallback(@NotNull Utility utility, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(utility, "");
        utility.onWarmupCompleted(new Selector(String.valueOf(z)));
        IAuthTabCallbackStub().IAuthTabCallback(utility);
        access100();
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public <T extends CollectionStore> void onNavigationEvent(@NotNull fromUTF8ByteArray<T> fromutf8bytearray) {
        fromUTF8ByteArray<T> fromutf8bytearray2;
        fromUTF8ByteArray<T> fromutf8bytearray3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        if (fromutf8bytearray.onNavigationEvent() instanceof Selector) {
            int i2 = writeTypedObject + 15;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            fromutf8bytearray2 = fromutf8bytearray;
        } else {
            fromutf8bytearray2 = null;
        }
        if (fromutf8bytearray2 != null) {
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub = IAuthTabCallbackStub();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 224579286, new Object[]{oncheckpermissionresultIAuthTabCallbackStub, contextRequireContext, fromutf8bytearray2}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -224579258);
        }
        fromUTF8ByteArray<T> fromutf8bytearray4 = fromutf8bytearray.onNavigationEvent() instanceof StreamParser ? fromutf8bytearray : null;
        if (fromutf8bytearray4 != null) {
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            oncheckpermissionresultIAuthTabCallbackStub2.IAuthTabCallback(contextRequireContext2, fromutf8bytearray4);
        }
        fromUTF8ByteArray<T> fromutf8bytearray5 = fromutf8bytearray.onNavigationEvent() instanceof isValidIPv6 ? fromutf8bytearray : null;
        if (fromutf8bytearray5 != null) {
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub3 = IAuthTabCallbackStub();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 224579286, new Object[]{oncheckpermissionresultIAuthTabCallbackStub3, contextRequireContext3, fromutf8bytearray5}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -224579258);
        }
        if (fromutf8bytearray.onNavigationEvent() instanceof isValidIPv4WithNetmask) {
            fromutf8bytearray3 = fromutf8bytearray;
        } else {
            int i4 = writeTypedObject + 21;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            fromutf8bytearray3 = null;
        }
        if (fromutf8bytearray3 != null) {
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub4 = IAuthTabCallbackStub();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 224579286, new Object[]{oncheckpermissionresultIAuthTabCallbackStub4, contextRequireContext4, fromutf8bytearray3}, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -224579258);
        }
        fromUTF8ByteArray<T> fromutf8bytearray6 = fromutf8bytearray.onNavigationEvent() instanceof IPAddress ? fromutf8bytearray : null;
        if (fromutf8bytearray6 != null) {
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub5 = IAuthTabCallbackStub();
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            oncheckpermissionresultIAuthTabCallbackStub5.onWarmupCompleted(contextRequireContext5, fromutf8bytearray6);
        }
        if (!(fromutf8bytearray.onNavigationEvent() instanceof Store)) {
            fromutf8bytearray = null;
        }
        if (fromutf8bytearray != null) {
            int i6 = writeTypedObject + 23;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            onCheckPermissionResult oncheckpermissionresultIAuthTabCallbackStub6 = IAuthTabCallbackStub();
            if (i7 != 0) {
                Context contextRequireContext6 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
                oncheckpermissionresultIAuthTabCallbackStub6.onNavigationEvent(contextRequireContext6, fromutf8bytearray);
            } else {
                Context contextRequireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
                oncheckpermissionresultIAuthTabCallbackStub6.onNavigationEvent(contextRequireContext7, fromutf8bytearray);
                throw null;
            }
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallback(@NotNull Arrays<?> arrays) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(arrays, "");
        if (arrays.onNavigationEvent() instanceof isValidIPv6WithNetmask) {
            int i4 = readTypedObject + 53;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            NativeDevSettingsSpec nativeDevSettingsSpecAsBinder = arrays.asBinder();
            if (nativeDevSettingsSpecAsBinder != null) {
                lValueOf = Long.valueOf(((Long) NativeDevSettingsSpec.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1194110157, new Object[]{nativeDevSettingsSpecAsBinder}, -1194110156, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).longValue());
            } else {
                lValueOf = null;
            }
            this.onWarmupCompleted = lValueOf;
            IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.onTransact;
            TitleBarExtension1 titleBarExtension1OnExtraCallback = onExtraCallback();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            iEngagementSignalsCallback_Parcel.onNavigationEvent(titleBarExtension1OnExtraCallback.onExtraCallbackWithResult(contextRequireContext, new MultilevelSelectActivityExternalSyntheticLambda2(false, true, getString(R.string.edoc_wallet_pkg___5e60285fc9), (String) null, (String) null, (String) null, (String) null, (String) null, "document_wallet", (HashMap) null, (String) null, 0, (GriverPageContainerPullFreshCallback) null, (String) null, (RoadAddress) null, (Sido) null, 65272, (DefaultConstructorMarker) null)));
            int i6 = writeTypedObject + 37;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = readTypedObject + 7;
        writeTypedObject = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void IAuthTabCallback(@NotNull fromUTF8ByteArray<Selector> fromutf8bytearray, @NotNull CharSequence charSequence) {
        String string;
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            int i4 = readTypedObject + 37;
            writeTypedObject = i4 % 128;
            string = null;
            if (i4 % 2 != 0) {
                throw null;
            }
        } else {
            string = charSequence.toString();
        }
        fromutf8bytearray.onNavigationEvent(new Selector(string));
        IAuthTabCallbackStub().IAuthTabCallback(fromutf8bytearray);
        access100();
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallbackWithResult(@NotNull fromUTF8ByteArray<StoreException> fromutf8bytearray, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        fromutf8bytearray.onNavigationEvent().onExtraCallback();
        fromutf8bytearray.onNavigationEvent(new StoreException(GraniteModule_closeView.onExtraCallback(charSequence), GraniteModule_closeView.onExtraCallback(charSequence2)));
        IAuthTabCallbackStub().IAuthTabCallback(fromutf8bytearray);
        access100();
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.supportFilePath$extraCallback
    public void onExtraCallbackWithResult(@NotNull fromUTF8ByteArray<Selector> fromutf8bytearray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        Intrinsics.checkNotNullParameter(str, "");
        fromutf8bytearray.onNavigationEvent(new Selector(str));
        IAuthTabCallbackStub().IAuthTabCallback(fromutf8bytearray);
        access100();
        int i2 = writeTypedObject + 69;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.supportFilePath$extraCallback
    public <T extends CollectionStore> void onExtraCallback(@NotNull fromUTF8ByteArray<T> fromutf8bytearray) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromutf8bytearray, "");
        if (!(fromutf8bytearray.onNavigationEvent() instanceof Strings)) {
            int i2 = readTypedObject + 11;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            fromutf8bytearray = null;
        }
        if (fromutf8bytearray != null) {
            int i4 = writeTypedObject + 13;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (IAuthTabCallbackStub().onNavigationEvent()) {
                int i6 = writeTypedObject + 73;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                IAuthTabCallbackStub().onRelationshipValidationResult();
            }
        }
    }

    @Override // o.supportFilePath$extraCallback
    public void onWarmupCompleted(@NotNull binToHexString bintohexstring) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bintohexstring, "");
            IAuthTabCallbackStub().IAuthTabCallback(bintohexstring);
        } else {
            Intrinsics.checkNotNullParameter(bintohexstring, "");
            IAuthTabCallbackStub().IAuthTabCallback(bintohexstring);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onExtraCallback(StreamParsingException streamParsingException) {
        int i;
        toLowerCase tolowercase;
        Iterator it;
        int i2 = 2 % 2;
        if (IAuthTabCallbackDefault().onExtraCallbackWithResult().contains(streamParsingException)) {
            return;
        }
        List listOnWarmupCompleted = IAuthTabCallbackStub().onWarmupCompleted();
        if (listOnWarmupCompleted != null) {
            int i3 = writeTypedObject + 37;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                it = listOnWarmupCompleted.iterator();
                i = 1;
            } else {
                it = listOnWarmupCompleted.iterator();
                i = 0;
            }
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i4 = readTypedObject + 1;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (Intrinsics.areEqual((toLowerCase) it.next(), streamParsingException)) {
                    break;
                }
                int i6 = writeTypedObject + 83;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                i++;
            }
        } else {
            int i8 = readTypedObject + 121;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        for (int i10 = i - 1; i10 >= 0; i10--) {
            int i11 = writeTypedObject + 35;
            readTypedObject = i11 % 128;
            int i12 = i11 % 2;
            Iterator it2 = IAuthTabCallbackDefault().onExtraCallbackWithResult().iterator();
            int i13 = writeTypedObject + 3;
            readTypedObject = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i15 = -1;
                    break;
                }
                StreamParsingException streamParsingException2 = (StreamParsingException) it2.next();
                List listOnWarmupCompleted2 = IAuthTabCallbackStub().onWarmupCompleted();
                if (listOnWarmupCompleted2 != null) {
                    tolowercase = (toLowerCase) CollectionsKt.getOrNull(listOnWarmupCompleted2, i10);
                } else {
                    int i16 = readTypedObject + 59;
                    writeTypedObject = i16 % 128;
                    int i17 = i16 % 2;
                    tolowercase = null;
                }
                if (Intrinsics.areEqual(streamParsingException2, tolowercase)) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 >= 0) {
                supportFilePath supportfilepathIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                ArrayList arrayList = new ArrayList(IAuthTabCallbackDefault().onExtraCallbackWithResult());
                int i18 = i15 + 1;
                arrayList.add(i18, streamParsingException);
                supportfilepathIAuthTabCallbackDefault.onNavigationEvent(arrayList);
                IAuthTabCallbackDefault().notifyItemInserted(i18);
                return;
            }
        }
    }

    private final void onExtraCallbackWithResult(fromUTF8ByteArray<Strings> fromutf8bytearray) {
        ArrayList arrayList;
        toLowerCase tolowercase;
        int i = 2 % 2;
        if (fromutf8bytearray.IAuthTabCallback()) {
            List listOnExtraCallbackWithResult = IAuthTabCallbackDefault().onExtraCallbackWithResult();
            arrayList = new ArrayList();
            Iterator it = listOnExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                int i2 = readTypedObject + 69;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = ((StreamParsingException) it.next()) instanceof binToHexString;
                    throw null;
                }
                Object next = it.next();
                if (!(((StreamParsingException) next) instanceof binToHexString)) {
                    arrayList.add(next);
                }
            }
        } else {
            List listOnExtraCallbackWithResult2 = IAuthTabCallbackDefault().onExtraCallbackWithResult();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listOnExtraCallbackWithResult2) {
                int i3 = writeTypedObject + 103;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                if (!(((StreamParsingException) obj) instanceof binToHexString)) {
                    arrayList2.add(obj);
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
                List list = listOnExtraCallback;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (!(!it2.hasNext())) {
                    toggleElementInspector toggleelementinspector = (toggleElementInspector) it2.next();
                    if (fromutf8bytearray instanceof toLowerCase) {
                        int i5 = writeTypedObject + 101;
                        readTypedObject = i5 % 128;
                        int i6 = i5 % 2;
                        tolowercase = (toLowerCase) fromutf8bytearray;
                    } else {
                        tolowercase = null;
                    }
                    arrayList4.add(new binToHexString(tolowercase != null ? tolowercase.asBinder() : null, toggleelementinspector));
                }
                arrayList3.addAll(iIntValue, arrayList4);
            }
            arrayList = arrayList3;
        }
        IAuthTabCallbackDefault().onExtraCallbackWithResult(arrayList, true);
    }

    private final void onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        readTypedObject = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            if (CollectionsKt.contains(IAuthTabCallbackDefault().onExtraCallbackWithResult(), obj)) {
                int iIndexOf = CollectionsKt.indexOf(IAuthTabCallbackDefault().onExtraCallbackWithResult(), obj);
                supportFilePath supportfilepathIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                List listOnExtraCallbackWithResult = IAuthTabCallbackDefault().onExtraCallbackWithResult();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listOnExtraCallbackWithResult) {
                    if (!Intrinsics.areEqual((StreamParsingException) obj3, obj)) {
                        int i3 = writeTypedObject + 1;
                        readTypedObject = i3 % 128;
                        if (i3 % 2 == 0) {
                            arrayList.add(obj3);
                            obj2.hashCode();
                            throw null;
                        }
                        arrayList.add(obj3);
                    }
                }
                supportfilepathIAuthTabCallbackDefault.onNavigationEvent(arrayList);
                IAuthTabCallbackDefault().notifyItemRemoved(iIndexOf);
                return;
            }
            return;
        }
        CollectionsKt.contains(IAuthTabCallbackDefault().onExtraCallbackWithResult(), obj);
        throw null;
    }

    private final void access100() {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            tdsButtonV1ViewAsInterface = onTransact().onExtraCallback.asInterface();
            zOnNavigationEvent = onCheckPermissionResult.onNavigationEvent(IAuthTabCallbackStub(), (List) null, 1, (Object) null);
        } else {
            tdsButtonV1ViewAsInterface = onTransact().onExtraCallback.asInterface();
            zOnNavigationEvent = true ^ onCheckPermissionResult.onNavigationEvent(IAuthTabCallbackStub(), (List) null, 1, (Object) null);
        }
        tdsButtonV1ViewAsInterface.setEnabled(zOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        setDetectableSize.onExtraCallback("doc_no", (Long) FileBridgeExtension4.onNavigationEvent.onWarmupCompleted(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{onnavigationevent}, -1596475053, zzaq.onNavigationEvent(), iOnNavigationEvent, 1596475054));
        setDetectableSize.onExtraCallback("doc_name", onnavigationevent.onExtraCallback());
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 113), (byte) (106 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-1359987026) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-272250563) - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 18, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String string;
        PackageIssueFragment packageIssueFragment = (PackageIssueFragment) objArr[0];
        FileBridgeExtension4.onNavigationEvent onnavigationevent = (FileBridgeExtension4.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onnavigationevent.asBinder();
            obj.hashCode();
            throw null;
        }
        if (onnavigationevent.asBinder()) {
            String strOnExtraCallback = onnavigationevent.onExtraCallback();
            if (strOnExtraCallback == null) {
                int i3 = writeTypedObject + 53;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallback = packageIssueFragment.getString(R.string.edoc_wallet_pkg___9fdcb8032b);
                Intrinsics.checkNotNullExpressionValue(strOnExtraCallback, "");
            }
            if (FaceDetectCallBack.onExtraCallback(FaceDetectCallBack.onExtraCallbackWithResult, strOnExtraCallback, false, 2, (Object) null)) {
                int i5 = writeTypedObject + 93;
                readTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = R.string.edoc_package_already_issued_subject_is_korean_last_consonant;
                    Object[] objArr2 = new Object[0];
                    objArr2[0] = strOnExtraCallback;
                    string = packageIssueFragment.getString(i6, objArr2);
                } else {
                    string = packageIssueFragment.getString(R.string.edoc_package_already_issued_subject_is_korean_last_consonant, new Object[]{strOnExtraCallback});
                }
            } else {
                string = packageIssueFragment.getString(R.string.edoc_package_already_issued_subject, new Object[]{strOnExtraCallback});
            }
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = packageIssueFragment.getString(R.string.edoc_package_already_issued_title, new Object[]{string});
            Intrinsics.checkNotNullExpressionValue(string2, "");
            ConvertByteArrayToFloatArray.onExtraCallback(1232623L, false, (String) null, (Map) null, new PackageIssueFragment$.ExternalSyntheticLambda6(onnavigationevent, string2), 14, (Object) null);
            Context contextRequireContext = packageIssueFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new PackageIssueFragment$.ExternalSyntheticLambda7(string2, packageIssueFragment, onnavigationevent));
        }
        int i7 = writeTypedObject + 33;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static final Unit onNavigationEvent(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        setDetectableSize.onExtraCallback("doc_no", (Long) FileBridgeExtension4.onNavigationEvent.onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent2, new Object[]{onnavigationevent}, -1596475053, zzaq.onNavigationEvent(), iOnNavigationEvent, 1596475054));
        setDetectableSize.onExtraCallback("doc_name", onnavigationevent.onExtraCallback());
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        setDetectableSize.onExtraCallback("button_type", "new");
        Object[] objArr = new Object[1];
        a((short) (113 - View.combineMeasuredStates(0, 0)), (byte) (106 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-1359987027) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-272250563) - TextUtils.lastIndexOf("", '0', 0, 0), (-16) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 89;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        FileBridgeExtension4.onNavigationEvent onnavigationevent = (FileBridgeExtension4.onNavigationEvent) objArr[0];
        String str = (String) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1232625L, false, (String) null, (Map) null, new PackageIssueFragment$.ExternalSyntheticLambda2(onnavigationevent, str), 14, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 125;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        setDetectableSize.onExtraCallback("doc_no", (Long) FileBridgeExtension4.onNavigationEvent.onWarmupCompleted(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{onnavigationevent}, -1596475053, zzaq.onNavigationEvent(), iOnNavigationEvent, 1596475054));
        setDetectableSize.onExtraCallback("doc_name", onnavigationevent.onExtraCallback());
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        setDetectableSize.onExtraCallback("button_type", "view");
        Object[] objArr = new Object[1];
        a((short) (View.resolveSize(0, 0) + 113), (byte) (106 - TextUtils.getTrimmedLength("")), View.MeasureSpec.getSize(0) - 1359987026, View.resolveSize(0, 0) - 272250562, (-17) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 83;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, PackageIssueFragment packageIssueFragment, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1232625L, false, (String) null, (Map) null, new PackageIssueFragment$.ExternalSyntheticLambda1(onnavigationevent, str), 14, (Object) null);
        dialogInterface.dismiss();
        onnavigationevent.access100();
        packageIssueFragment.IAuthTabCallbackStub().ICustomTabsCallbackDefault();
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onnavigationevent.IAuthTabCallback_Parcel();
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 61;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        onnavigationevent.IAuthTabCallback_Parcel();
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, PackageIssueFragment packageIssueFragment, FileBridgeExtension4.onNavigationEvent onnavigationevent, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = packageIssueFragment.getString(R.string.edoc_wallet_pkg___65e3bb24ab);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.INLINE;
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, new PackageIssueFragment$.ExternalSyntheticLambda3(onnavigationevent, str), 4, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = packageIssueFragment.getString(viva.republica.toss.R.string.skip);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, new PackageIssueFragment$.ExternalSyntheticLambda4(onnavigationevent, packageIssueFragment, str), 4, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new PackageIssueFragment$.ExternalSyntheticLambda5(onnavigationevent));
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void onExtraCallback(boolean z) {
        setEnabledAmazonAdUnitIds setenabledamazonadunitids;
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        if (z) {
            int i4 = writeTypedObject + 23;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
                int i5 = 35 / 0;
            } else {
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
            }
        } else {
            setenabledamazonadunitids = setEnabledAmazonAdUnitIds.NON_SECURE;
        }
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{baseActivityRequireBaseActivity, setenabledamazonadunitids}, -1566333132, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        baseActivityRequireBaseActivity.newSession();
        int i6 = readTypedObject + 77;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        Object[] objArr = {IAuthTabCallbackStub()};
        ((LiveData) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -365183757, objArr, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 365183767)).observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new onNavigationEvent()));
        IAuthTabCallbackStub().asBinder().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new IAuthTabCallbackDefault()));
        IAuthTabCallbackStub().access000().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new asBinder()));
        Object[] objArr2 = {IAuthTabCallbackStub()};
        ((LiveData) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1740224227, objArr2, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1740224254)).observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new onTransact()));
        IAuthTabCallbackStub().extraCallback().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new IAuthTabCallbackStubProxy()));
        IAuthTabCallbackStub().getInterfaceDescriptor().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new access100()));
        Object[] objArr3 = {IAuthTabCallbackStub()};
        ((LiveData) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 1583394745, objArr3, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -1583394712)).observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new IAuthTabCallback_Parcel()));
        IAuthTabCallbackStub().onTransact().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new getInterfaceDescriptor()));
        IAuthTabCallbackStub().onExtraCallback().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new access000()));
        IAuthTabCallbackStub().onActivityResized().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new IAuthTabCallback()));
        IAuthTabCallbackStub().onActivityLayout().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new onWarmupCompleted()));
        IAuthTabCallbackStub().IAuthTabCallbackDefault().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new onExtraCallback()));
        IAuthTabCallbackStub().IAuthTabCallback().observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new IAuthTabCallbackStub()));
        Object[] objArr4 = {IAuthTabCallbackStub()};
        ((LiveData) onCheckPermissionResult.onNavigationEvent(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), 2088905133, objArr4, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), -2088905130)).observe(getViewLifecycleOwner(), new BaseFragment.asInterface(new asInterface()));
        int i2 = readTypedObject + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, iEngagementSignalsCallbackDefault}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -456034217, 456034220);
    }

    public static /* synthetic */ Unit onExtraCallback(PackageIssueFragment packageIssueFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, iEngagementSignalsCallbackDefault}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -1547768726, 1547768735);
    }

    public static /* synthetic */ Unit onExtraCallback(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, DialogInterface dialogInterface) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent, str, dialogInterface}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 521740129, -521740121);
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (IEngagementSignalsCallback_Parcel) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -2517099, 2517103);
    }

    public static final /* synthetic */ SessionTrackera asInterface(PackageIssueFragment packageIssueFragment) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (SessionTrackera) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 516726803, -516726792);
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(PackageIssueFragment packageIssueFragment) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 2055914037, -2055914036);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment, StreamParsingException streamParsingException) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment, streamParsingException}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 2090175284, -2090175274);
    }

    private static final supportFilePath asBinder(PackageIssueFragment packageIssueFragment) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (supportFilePath) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{packageIssueFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 1955898053, -1955898051);
    }

    private final void onNavigationEvent(FileBridgeExtension4.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, onnavigationevent}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -1684971117, 1684971117);
    }

    private static final Unit onWarmupCompleted(FileBridgeExtension4.onNavigationEvent onnavigationevent, String str, DialogInterface dialogInterface) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent, str, dialogInterface}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 2054282729, -2054282723);
    }

    private final void onExtraCallback(String str) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, str}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, 666069389, -666069382);
    }

    public final getDummyAd onNavigationEvent() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (getDummyAd) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, -942882106, 942882111);
    }

    static void asBinder() {
        getInterfaceDescriptor = -179824289;
        access000 = -1538795490;
        access100 = -1266815170;
        IAuthTabCallback_Parcel = new byte[]{124, 19, 102, 122, 23, 42, 41, -8, 38, -47, 19, -58, -47, 47, -59, 19, 8, 8, 8};
    }
}
