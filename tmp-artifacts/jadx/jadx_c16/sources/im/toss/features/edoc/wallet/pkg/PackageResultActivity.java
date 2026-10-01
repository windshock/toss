package im.toss.features.edoc.wallet.pkg;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import im.toss.base.BaseActivity;
import im.toss.features.edoc.EDocCvsExportBottomCta;
import im.toss.features.edoc.EDocOpenSchemeActivity;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.EDocShareBaseActivity;
import im.toss.features.edoc.wallet.pkg.PackageIssueActivity;
import im.toss.features.edoc.wallet.pkg.PackageResultActivity$;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FileBridgeExtension31;
import o.FileBridgeExtension31$IAuthTabCallbackDefault;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NativeAppearanceSpec;
import o.NativeDeviceInfoSpec;
import o.NativeDialogManagerAndroidSpec;
import o.NetConverter3;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.beginScroll;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getAdService;
import o.getKekid;
import o.getPackageType;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserFileSize;
import o.getUserFileSize$onExtraCallbackWithResult;
import o.getWrite;
import o.initMiniApp;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.readIntokhttp;
import o.setAutoCaptured;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setTagBytes;
import o.varyMatches;
import o.writeRaw;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PackageResultActivity extends Hilt_PackageResultActivity implements FileBridgeExtension31$IAuthTabCallbackDefault {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static char[] ICustomTabsCallbackStub;
    private static int isEngagementSignalsApiAvailable;
    private static long onUnminimized;
    private EDocCvsExportBottomCta IAuthTabCallbackStub;
    private String IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private WebView ICustomTabsCallbackStubProxy;
    private String access000;
    private String asInterface;
    private NativeDeviceInfoSpec extraCallback;
    private getPackageType extraCallbackWithResult;
    private List<Long> getInterfaceDescriptor;
    private boolean onActivityLayout;
    private String onActivityResized;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private DocumentWalletPollCheckMeta onPostMessage;
    private String onRelationshipValidationResult;
    private TdsBottomCtaV1View onTransact;
    private String readTypedObject;

    @Inject
    public SessionTrackerb tossRouter;
    private Long writeTypedObject;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsService = 0;
    private static int ICustomTabsCallbackDefault = 0;
    private static int extraCommand = 1;
    private final boolean access100 = true;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new PackageResultActivity$.ExternalSyntheticLambda3(this));
    private boolean IAuthTabCallbackStubProxy = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 97 - (i * 4);
        int i7 = 3 - (i3 * 2);
        byte[] bArr = $$a;
        int i8 = (i2 * 4) + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i7;
            int i10 = 0;
            i6 += i7;
            i7 = i9;
            i4 = i10;
            int i11 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i5 = i4 + 1;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i11];
            i7 = i6;
            i6 = b;
            i10 = i5;
            i9 = i11;
            i6 += i7;
            i7 = i9;
            i4 = i10;
            int i112 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i5 = i4 + 1;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            int i1122 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i5 = i4 + 1;
            if (i5 == i8) {
            }
        }
    }

    static {
        isEngagementSignalsApiAvailable = 1;
        ICustomTabsServiceStub();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = ICustomTabsService + 57;
        isEngagementSignalsApiAvailable = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | (~(i7 | i5));
        int i9 = (~i2) | i4;
        int i10 = ~(i9 | i5);
        int i11 = (~(i2 | (~i5))) | (~i9);
        int i12 = i4 + i5 + i + (243328196 * i6) + (549715570 * i3);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i4) + 1264254976 + ((-1099560353) * i5) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i) + (781713408 * i6) + (665583616 * i3) + (1005256704 * i13);
        int i15 = (i4 * 1467389705) + 421362043 + (i5 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i * 1467388771) + (i6 * (-1383267380)) + (i3 * 1030937622) + (i13 * 484507648);
        switch (i14 + (i15 * i15 * 1164771328)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
                int i16 = 2 % 2;
                int i17 = extraCommand + 7;
                ICustomTabsCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageResultActivity, commonModule_setLeftEdgeTouchEnabled);
                int i19 = extraCommand + 107;
                ICustomTabsCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                return unitOnExtraCallbackWithResult;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return readTypedObject(objArr);
            case 17:
                return writeTypedObject(objArr);
            case 18:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) objArr[1];
                PackageResultActivity packageResultActivity2 = (PackageResultActivity) objArr[2];
                NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[3];
                View view = (View) objArr[4];
                int i21 = 2 % 2;
                int i22 = extraCommand + 33;
                ICustomTabsCallbackDefault = i22 % 128;
                int i23 = i22 % 2;
                onWarmupCompleted(packageResultActivity2, nativeDeviceInfoSpec, (String) objectRef.element);
                Function1 function1 = (Function1) objectRef2.element;
                Intrinsics.checkNotNull(view);
                function1.invoke(view);
                int i24 = ICustomTabsCallbackDefault + 71;
                extraCommand = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        }
        IAuthTabCallbackStub(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageResultActivity packageResultActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(packageResultActivity, th);
        }
        onExtraCallback(packageResultActivity, th);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageResultActivity, nativeDeviceInfoSpec);
        int i4 = extraCommand + 73;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(packageResultActivity, nativeDeviceInfoSpec, setDetectableSize);
        int i4 = extraCommand + 99;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(packageResultActivity);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 914127760, -914127755, getKekid.onExtraCallback());
            throw null;
        }
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 914127760, -914127755, getKekid.onExtraCallback());
        int i3 = extraCommand + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 79;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{objectRef, objectRef2, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1169329021, 1169329039, getKekid.onExtraCallback());
        int i4 = ICustomTabsCallbackDefault + 19;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(packageResultActivity);
        if (i3 == 0) {
            return null;
        }
        int i4 = 96 / 0;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 73;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCommand + 121;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[1];
        String str = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(packageResultActivity, nativeDeviceInfoSpec, str, setDetectableSize);
        int i4 = ICustomTabsCallbackDefault + 73;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(packageResultActivity, view);
        int i4 = ICustomTabsCallbackDefault + 59;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageResultActivity packageResultActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 35;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(packageResultActivity, dialogInterface);
        int i4 = extraCommand + 69;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(packageResultActivity, view);
        int i4 = extraCommand + 19;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1196003899, 1196003919, getKekid.onExtraCallback());
        int i4 = ICustomTabsCallbackDefault + 77;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        access100(packageResultActivity);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCommand + 63;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1502420521, -1502420520, getKekid.onExtraCallback());
            throw null;
        }
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 1502420521, -1502420520, getKekid.onExtraCallback());
        int i3 = ICustomTabsCallbackDefault + 85;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        }
        onExtraCallback(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(packageResultActivity, view);
        int i4 = ICustomTabsCallbackDefault + 77;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 2098475308, -2098475295, getKekid.onExtraCallback());
        int i4 = ICustomTabsCallbackDefault + 19;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ FileBridgeExtension31 onExtraCallbackWithResult(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension31 interfaceDescriptor = getInterfaceDescriptor(packageResultActivity);
        int i4 = ICustomTabsCallbackDefault + 45;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 91;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(gettypedexportedconstants, nativeDialogManagerAndroidSpec, view);
        int i4 = extraCommand + 77;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        int i4 = ICustomTabsCallbackDefault + 35;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageResultActivity packageResultActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(packageResultActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageResultActivity packageResultActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(packageResultActivity, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageResultActivity, th);
        int i3 = extraCommand + 117;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageResultActivity packageResultActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 49;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(packageResultActivity, deserializeurinullablecollection);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(packageResultActivity, deserializeurinullablecollection);
        int i3 = ICustomTabsCallbackDefault + 3;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(nativeDialogManagerAndroidSpec, setDetectableSize);
        }
        IAuthTabCallback(nativeDialogManagerAndroidSpec, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(packageResultActivity);
        int i4 = extraCommand + 113;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(packageResultActivity, view);
        int i4 = ICustomTabsCallbackDefault + 83;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 65;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = extraCommand + 29;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(eDocCvsExportBottomCta, packageResultActivity, nativeDeviceInfoSpec, view);
        int i4 = extraCommand + 63;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(packageResultActivity, view);
        }
        IAuthTabCallbackDefault(packageResultActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PackageResultActivity packageResultActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(packageResultActivity, pair);
        int i4 = extraCommand + 103;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PackageResultActivity packageResultActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(packageResultActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = extraCommand + 63;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeDialogManagerAndroidSpec, setDetectableSize);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 103;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(packageResultActivity);
        int i4 = ICustomTabsCallbackDefault + 23;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = extraCommand + 3;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -850080063, 850080074, getKekid.onExtraCallback());
        }
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 14 / 0;
        return -1L;
    }

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Long l = packageResultActivity.writeTypedObject;
        if (i3 != 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 11;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        String str = packageResultActivity.IAuthTabCallback_Parcel;
        if (i4 == 0) {
            int i5 = 35 / 0;
        }
        int i6 = i3 + 101;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean z = packageResultActivity.onMinimized;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String access000(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 59;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = packageResultActivity.onRelationshipValidationResult;
        int i5 = i2 + 13;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ String asBinder(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        String str = packageResultActivity.access000;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        int i6 = i3 + 33;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ void onExtraCallback(PackageResultActivity packageResultActivity, String str) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        packageResultActivity.onActivityResized = str;
        int i5 = i3 + 81;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(PackageResultActivity packageResultActivity, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 31;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        packageResultActivity.asInterface = str;
        int i5 = i2 + 35;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ String onTransact(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        String str = packageResultActivity.readTypedObject;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 109;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        packageResultActivity.access000 = str;
        int i5 = i3 + 119;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i4 = onExtraCallback + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i6 = onExtraCallback + 69;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", this.IAuthTabCallback_Parcel);
        Object[] objArr = new Object[1];
        a(11 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 8, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3951), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.readTypedObject), getWrite.IAuthTabCallback("trx_id", this.onRelationshipValidationResult)});
        int i4 = extraCommand + 39;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    public boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 109;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.access100;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.NativeDeviceInfoSpec) = (r1v4 o.NativeDeviceInfoSpec), (r1v10 o.NativeDeviceInfoSpec) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Long> onNavigationEvent() {
        NativeDeviceInfoSpec nativeDeviceInfoSpec;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            nativeDeviceInfoSpec = this.extraCallback;
            int i3 = 45 / 0;
            if (nativeDeviceInfoSpec != null) {
                List listAsInterface = nativeDeviceInfoSpec.asInterface();
                if (listAsInterface != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listAsInterface) {
                        if (((NativeDialogManagerAndroidSpec) obj).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
                            int i4 = extraCommand + 119;
                            ICustomTabsCallbackDefault = i4 % 128;
                            int i5 = i4 % 2;
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    int i6 = extraCommand + 45;
                    ICustomTabsCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it.next()).onNavigationEvent()));
                    }
                    return arrayList2;
                }
            }
        } else {
            nativeDeviceInfoSpec = this.extraCallback;
            if (nativeDeviceInfoSpec != null) {
            }
        }
        return CollectionsKt.emptyList();
    }

    public WebView ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        WebView webView = this.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 89;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return webView;
        }
        throw null;
    }

    protected void onNavigationEvent(@Nullable WebView webView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 119;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStubProxy = webView;
        int i5 = i2 + 119;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(ICustomTabsCallbackStub[i >> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 59649), 17 - (ViewConfiguration.getTouchSlop() >> 8), 10973 - View.MeasureSpec.getMode(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onUnminimized), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.combineMeasuredStates(0, 0)), 31 - (ViewConfiguration.getLongPressTimeout() >> 16), 20220 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49123), TextUtils.lastIndexOf("", '0', 0) + 45, 1494 - Color.alpha(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(ICustomTabsCallbackStub[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 59697), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onUnminimized), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.keyCodeFromString("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), 44 - TextUtils.getTrimmedLength(""), 1494 - (ViewConfiguration.getEdgeSlop() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43, TextUtils.lastIndexOf("", '0', 0) + 1495, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i9 = $10 + 63;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static final FileBridgeExtension31 getInterfaceDescriptor(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        FileBridgeExtension31 fileBridgeExtension31 = new FileBridgeExtension31(packageResultActivity);
        int i2 = extraCommand + 13;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return fileBridgeExtension31;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension31 fileBridgeExtension31 = (FileBridgeExtension31) packageResultActivity.asBinder.getValue();
        if (i3 == 0) {
            return fileBridgeExtension31;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 17933;
        private static char onExtraCallback = 46897;
        private static char onExtraCallbackWithResult = 26882;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private static char onWarmupCompleted = 33403;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            CharSequence charSequence;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = 58224;
                int i5 = i3;
                while (i5 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i7 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i7);
                        objArr2[1] = Integer.valueOf(i6);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            charSequence = "";
                            char cIndexOf = (char) TextUtils.indexOf(charSequence, charSequence, i3);
                            int i8 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9;
                            int i9 = 12435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i8, i9, -787580090, false, "C", clsArr);
                        } else {
                            charSequence = "";
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, 12433 - TextUtils.lastIndexOf(charSequence, '0'), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
                        int i10 = $11 + 117;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 3 / 2;
                        }
                        cArr3 = cArr4;
                        i3 = 0;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16014), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, KeyEvent.keyCodeFromString("") + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $10 + 93;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onExtraCallbackWithResult(onExtraCallback onextracallback, Context context, String str, DocumentWalletPollCheckMeta documentWalletPollCheckMeta, boolean z, boolean z2, String str2, String str3, List list, String str4, String str5, Long l, boolean z3, int i, Object obj) {
            String str6;
            String str7;
            String str8;
            int i2 = 2 % 2;
            Long l2 = null;
            String str9 = (i & 2) != 0 ? null : str;
            DocumentWalletPollCheckMeta documentWalletPollCheckMeta2 = (i & 4) != 0 ? null : documentWalletPollCheckMeta;
            boolean z4 = false;
            boolean z5 = (i & 8) != 0 ? false : z;
            boolean z6 = (i & 16) != 0 ? false : z2;
            if ((i & 32) != 0) {
                int i3 = onTransact + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                str6 = null;
            } else {
                str6 = str2;
            }
            if ((i & 64) != 0) {
                int i5 = onNavigationEvent + 95;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                str7 = null;
            } else {
                str7 = str3;
            }
            List list2 = (i & 128) != 0 ? null : list;
            String str10 = (i & 256) != 0 ? null : str4;
            if ((i & 512) != 0) {
                int i7 = onNavigationEvent + 51;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                str8 = null;
            } else {
                str8 = str5;
            }
            if ((i & 1024) != 0) {
                int i9 = onNavigationEvent + 113;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            } else {
                l2 = l;
            }
            if ((i & 2048) != 0) {
                int i10 = onTransact + 121;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            } else {
                z4 = z3;
            }
            return onextracallback.onExtraCallbackWithResult(context, str9, documentWalletPollCheckMeta2, z5, z6, str6, str7, list2, str10, str8, l2, z4);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @Nullable DocumentWalletPollCheckMeta documentWalletPollCheckMeta, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable List<Long> list, @Nullable String str4, @Nullable String str5, @Nullable Long l, boolean z3) throws Throwable {
            long[] longArray;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PackageResultActivity.class);
            intent.putExtra("trxId", str);
            intent.putExtra("pollCheckMeta", (Parcelable) documentWalletPollCheckMeta);
            intent.putExtra("successScheme", str2);
            intent.putExtra("dropOutScheme", str3);
            intent.putExtra("submit", z);
            intent.putExtra("reentry", z2);
            if (list != null) {
                int i2 = onTransact + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                longArray = CollectionsKt.toLongArray(list);
                int i4 = onTransact + 55;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            } else {
                longArray = null;
            }
            intent.putExtra("existDocIds", longArray);
            intent.putExtra("from", str4);
            Object[] objArr = new Object[1];
            a(new char[]{25374, 59307, 56494, 15453, 27121, 35510, 32654, 17243}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str5);
            intent.putExtra("placeId", l);
            intent.putExtra("skipAuth", z3);
            return intent;
        }
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 95;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 65;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return sessionTrackerb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseActivity*/.onCreate(bundle);
            int iOnExtraCallback = getKekid.onExtraCallback();
            setContentView((LinearLayout) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -405546088, 405546103, getKekid.onExtraCallback()));
            onExtraCallbackWithResult(getIntent());
            IEngagementSignalsCallbackDefault();
            int i3 = 15 / 0;
            return;
        }
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        setContentView((LinearLayout) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), -405546088, 405546103, getKekid.onExtraCallback()));
        onExtraCallbackWithResult(getIntent());
        IEngagementSignalsCallbackDefault();
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*im.toss.base.BaseActivity*/.onNewIntent(intent);
        onExtraCallbackWithResult(intent);
        IEngagementSignalsCallbackDefault();
        int i4 = ICustomTabsCallbackDefault + 45;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Unit unit;
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeDeviceInfoSpec, "");
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -925111678, 925111681, getKekid.onExtraCallback());
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            Intrinsics.checkNotNullParameter(nativeDeviceInfoSpec, "");
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), -925111678, 925111681, getKekid.onExtraCallback());
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallbackDefault + 85;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 43;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, packageResultActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 48, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, packageResultActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 7;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = extraCommand + 61;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeDeviceInfoSpec, "");
            i = 5;
        } else {
            Intrinsics.checkNotNullParameter(nativeDeviceInfoSpec, "");
        }
        onNavigationEvent(packageResultActivity, nativeDeviceInfoSpec, false, i, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        onNavigationEvent(new WebView(this));
        access200();
        this.IAuthTabCallbackStubProxy = true;
        String str = this.onRelationshipValidationResult;
        if (str != null) {
            int i2 = extraCommand + 123;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                IEngagementSignalsCallbackStub();
                getUserFileSize.onNavigationEvent.onWarmupCompleted(this, this.onRelationshipValidationResult, this.onPostMessage, new PackageResultActivity$.ExternalSyntheticLambda0(this), new PackageResultActivity$.ExternalSyntheticLambda1(this), new PackageResultActivity$.ExternalSyntheticLambda2(this), this.getInterfaceDescriptor);
                int i4 = extraCommand + 101;
                ICustomTabsCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        IEngagementSignalsCallback_Parcel();
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b43  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Intent intent) throws Throwable {
        boolean booleanExtra;
        String stringExtra;
        Long l;
        Boolean bool;
        String string;
        Object array;
        Object obj;
        Object obj2;
        Object intOrNull;
        Bundle extras;
        String string2;
        Object objValueOf;
        Object next;
        Object intOrNull2;
        long[] longArrayExtra;
        int i = 2 % 2;
        this.onRelationshipValidationResult = intent != null ? intent.getStringExtra("trxId") : null;
        this.onPostMessage = intent != null ? (DocumentWalletPollCheckMeta) intent.getParcelableExtra("pollCheckMeta") : null;
        this.onActivityResized = intent != null ? intent.getStringExtra("successScheme") : null;
        this.asInterface = intent != null ? intent.getStringExtra("dropOutScheme") : null;
        boolean zBooleanValue = false;
        if (intent != null) {
            int i2 = ICustomTabsCallbackDefault + 67;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            booleanExtra = intent.getBooleanExtra("submit", false);
        } else {
            booleanExtra = false;
        }
        this.onActivityLayout = booleanExtra;
        this.ICustomTabsCallback = intent != null ? intent.getBooleanExtra("reentry", false) : false;
        this.getInterfaceDescriptor = (intent == null || (longArrayExtra = intent.getLongArrayExtra("existDocIds")) == null) ? null : ArraysKt.toList(longArrayExtra);
        this.IAuthTabCallback_Parcel = intent != null ? intent.getStringExtra("from") : null;
        if (intent != null) {
            Object[] objArr = new Object[1];
            a(11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 8 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 3952), objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            stringExtra = null;
        }
        this.readTypedObject = stringExtra;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("placeId")) {
            l = null;
        } else if (zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null && (string2 = extras2.getString("placeId")) != null) {
                if (Intrinsics.areEqual(Long.class, Integer.class)) {
                    intOrNull2 = StringsKt.toIntOrNull(string2);
                } else {
                    if (Intrinsics.areEqual(Long.class, Long.class)) {
                        objValueOf = StringsKt.toLongOrNull(string2);
                    } else if (Intrinsics.areEqual(Long.class, Float.class)) {
                        objValueOf = StringsKt.toFloatOrNull(string2);
                    } else if (Intrinsics.areEqual(Long.class, Double.class)) {
                        objValueOf = StringsKt.toDoubleOrNull(string2);
                    } else if (Intrinsics.areEqual(Long.class, Short.class)) {
                        objValueOf = StringsKt.toShortOrNull(string2);
                    } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
                        objValueOf = StringsKt.toByteOrNull(string2);
                    } else if (!(!Intrinsics.areEqual(Long.class, Boolean.class))) {
                        objValueOf = Boolean.valueOf(Boolean.parseBoolean(string2));
                    } else if (Intrinsics.areEqual(Long.class, Character.class)) {
                        objValueOf = Character.valueOf(string2.charAt(0));
                    } else {
                        intOrNull2 = string2;
                        if (!Intrinsics.areEqual(Long.class, String.class)) {
                            if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : listSplit$default) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList.add(obj3);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                objValueOf = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(Long.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : listSplit$default2) {
                                    if (((String) obj4).length() > 0) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                objValueOf = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(Long.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj5 : listSplit$default3) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                objValueOf = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(Long.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : listSplit$default4) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                objValueOf = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(Long.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj7 : listSplit$default5) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList9.add(obj7);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                }
                                objValueOf = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj8 : listSplit$default6) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList11.add(obj8);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                }
                                objValueOf = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(Long.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj9 : listSplit$default7) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList13.add(obj9);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                }
                                objValueOf = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj10 : listSplit$default8) {
                                    if (((String) obj10).length() > 0) {
                                        arrayList15.add(obj10);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                }
                                objValueOf = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(Long.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj11 : listSplit$default9) {
                                    if (((String) obj11).length() > 0) {
                                        arrayList17.add(obj11);
                                    }
                                }
                                objValueOf = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = Long.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj12 : enumConstants) {
                                        Intrinsics.checkNotNull(obj12, "");
                                        arrayList18.add((Enum) obj12);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), string2)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    objValueOf = (Enum) next;
                                } else {
                                    objValueOf = null;
                                }
                                if (objValueOf == null) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                                    }
                                    objValueOf = null;
                                }
                            }
                        }
                    }
                    if (!(objValueOf instanceof Long)) {
                        objValueOf = null;
                    }
                    l = (Long) objValueOf;
                }
                objValueOf = intOrNull2;
                if (!(objValueOf instanceof Long)) {
                }
                l = (Long) objValueOf;
            }
        } else {
            Bundle extras3 = intent.getExtras();
            Object obj13 = extras3 != null ? extras3.get("placeId") : null;
            if (!(obj13 instanceof Long)) {
                obj13 = null;
            }
            l = (Long) obj13;
        }
        this.writeTypedObject = l;
        if (intent != null) {
            int i4 = ICustomTabsCallbackDefault + 51;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                intent.getExtras();
                throw null;
            }
            Bundle extras4 = intent.getExtras();
            if (extras4 == null || !extras4.containsKey("skipAuth")) {
                bool = null;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            } else {
                if (zzbq.onNavigationEvent(intent)) {
                    int i5 = extraCommand + 125;
                    ICustomTabsCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    Bundle extras5 = intent.getExtras();
                    if (extras5 != null && (string = extras5.getString("skipAuth")) != null) {
                        if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                            intOrNull = StringsKt.toIntOrNull(string);
                        } else {
                            if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                                array = StringsKt.toLongOrNull(string);
                            } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                                array = StringsKt.toFloatOrNull(string);
                            } else if (!(!Intrinsics.areEqual(Boolean.class, Double.class))) {
                                int i7 = ICustomTabsCallbackDefault + 9;
                                extraCommand = i7 % 128;
                                int i8 = i7 % 2;
                                array = StringsKt.toDoubleOrNull(string);
                            } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                                array = StringsKt.toShortOrNull(string);
                            } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                                array = StringsKt.toByteOrNull(string);
                            } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                                array = Boolean.valueOf(Boolean.parseBoolean(string));
                            } else if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                                array = Character.valueOf(string.charAt(0));
                            } else {
                                intOrNull = string;
                                if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                    if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                        List listSplit$default10 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList19 = new ArrayList();
                                        for (Object obj14 : listSplit$default10) {
                                            if (((String) obj14).length() > 0) {
                                                arrayList19.add(obj14);
                                            }
                                        }
                                        ArrayList arrayList20 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList19, 10));
                                        Iterator it10 = arrayList19.iterator();
                                        while (it10.hasNext()) {
                                            arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it10.next()).toString())));
                                        }
                                        array = arrayList20.toArray(new Integer[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                        List listSplit$default11 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList21 = new ArrayList();
                                        for (Object obj15 : listSplit$default11) {
                                            if (((String) obj15).length() > 0) {
                                                arrayList21.add(obj15);
                                            }
                                        }
                                        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList21, 10));
                                        Iterator it11 = arrayList21.iterator();
                                        while (it11.hasNext()) {
                                            arrayList22.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it11.next()).toString())));
                                        }
                                        array = arrayList22.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                        List listSplit$default12 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList23 = new ArrayList();
                                        for (Object obj16 : listSplit$default12) {
                                            if (((String) obj16).length() > 0) {
                                                arrayList23.add(obj16);
                                            }
                                        }
                                        ArrayList arrayList24 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList23, 10));
                                        Iterator it12 = arrayList23.iterator();
                                        while (it12.hasNext()) {
                                            arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it12.next()).toString())));
                                        }
                                        array = arrayList24.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                        List listSplit$default13 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList25 = new ArrayList();
                                        for (Object obj17 : listSplit$default13) {
                                            if (((String) obj17).length() > 0) {
                                                int i9 = extraCommand + 83;
                                                ICustomTabsCallbackDefault = i9 % 128;
                                                int i10 = i9 % 2;
                                                arrayList25.add(obj17);
                                            }
                                        }
                                        ArrayList arrayList26 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList25, 10));
                                        Iterator it13 = arrayList25.iterator();
                                        while (!(!it13.hasNext())) {
                                            int i11 = ICustomTabsCallbackDefault + 53;
                                            extraCommand = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it13.next()).toString())));
                                                Object obj18 = null;
                                                obj18.hashCode();
                                                throw null;
                                            }
                                            arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it13.next()).toString())));
                                        }
                                        array = arrayList26.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                        List listSplit$default14 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList27 = new ArrayList();
                                        for (Object obj19 : listSplit$default14) {
                                            if (((String) obj19).length() > 0) {
                                                arrayList27.add(obj19);
                                            }
                                        }
                                        ArrayList arrayList28 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList27, 10));
                                        Iterator it14 = arrayList27.iterator();
                                        while (it14.hasNext()) {
                                            arrayList28.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it14.next()).toString())));
                                        }
                                        array = arrayList28.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                        List listSplit$default15 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList29 = new ArrayList();
                                        for (Object obj20 : listSplit$default15) {
                                            if (((String) obj20).length() > 0) {
                                                arrayList29.add(obj20);
                                            }
                                        }
                                        ArrayList arrayList30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList29, 10));
                                        Iterator it15 = arrayList29.iterator();
                                        while (it15.hasNext()) {
                                            int i12 = ICustomTabsCallbackDefault + 41;
                                            extraCommand = i12 % 128;
                                            int i13 = i12 % 2;
                                            arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it15.next()).toString())));
                                        }
                                        array = arrayList30.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                        List listSplit$default16 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList31 = new ArrayList();
                                        for (Object obj21 : listSplit$default16) {
                                            if (((String) obj21).length() > 0) {
                                                arrayList31.add(obj21);
                                            }
                                        }
                                        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList31, 10));
                                        Iterator it16 = arrayList31.iterator();
                                        while (it16.hasNext()) {
                                            arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it16.next()).toString())));
                                        }
                                        array = arrayList32.toArray(new Boolean[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                        List listSplit$default17 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList33 = new ArrayList();
                                        for (Object obj22 : listSplit$default17) {
                                            if (((String) obj22).length() > 0) {
                                                int i14 = ICustomTabsCallbackDefault + 9;
                                                extraCommand = i14 % 128;
                                                int i15 = i14 % 2;
                                                arrayList33.add(obj22);
                                            }
                                        }
                                        ArrayList arrayList34 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList33, 10));
                                        Iterator it17 = arrayList33.iterator();
                                        while (it17.hasNext()) {
                                            int i16 = extraCommand + 93;
                                            ICustomTabsCallbackDefault = i16 % 128;
                                            int i17 = i16 % 2;
                                            arrayList34.add(Character.valueOf(StringsKt.trim((String) it17.next()).toString().charAt(0)));
                                        }
                                        array = arrayList34.toArray(new Character[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                        List listSplit$default18 = StringsKt.split$default(string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList35 = new ArrayList();
                                        for (Object obj23 : listSplit$default18) {
                                            if (((String) obj23).length() > 0) {
                                                arrayList35.add(obj23);
                                            }
                                        }
                                        array = arrayList35.toArray(new String[0]);
                                    } else {
                                        Object[] enumConstants2 = Boolean.class.getEnumConstants();
                                        if (enumConstants2 != null) {
                                            ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                            for (Object obj24 : enumConstants2) {
                                                Intrinsics.checkNotNull(obj24, "");
                                                arrayList36.add((Enum) obj24);
                                            }
                                            Iterator it18 = arrayList36.iterator();
                                            while (true) {
                                                if (!it18.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                Object next2 = it18.next();
                                                if (Intrinsics.areEqual(((Enum) next2).name(), string)) {
                                                    obj = next2;
                                                    break;
                                                }
                                            }
                                            array = (Enum) obj;
                                        } else {
                                            array = null;
                                        }
                                        if (array == null) {
                                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                            }
                                            array = null;
                                        }
                                    }
                                }
                            }
                            if (array instanceof Boolean) {
                                int i18 = ICustomTabsCallbackDefault + 55;
                                extraCommand = i18 % 128;
                                int i19 = i18 % 2;
                                obj2 = null;
                            } else {
                                obj2 = array;
                            }
                            bool = (Boolean) obj2;
                        }
                        array = intOrNull;
                        if (array instanceof Boolean) {
                        }
                        bool = (Boolean) obj2;
                    }
                } else {
                    Bundle extras6 = intent.getExtras();
                    Object obj25 = extras6 != null ? extras6.get("skipAuth") : null;
                    bool = (Boolean) (!(obj25 instanceof Boolean) ? null : obj25);
                }
                if (bool != null) {
                }
            }
        }
        this.onMinimized = zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        NativeDialogManagerAndroidSpec.onWarmupCompleted onwarmupcompletedOnExtraCallback;
        String str;
        SessionTrackerb sessionTrackerbIAuthTabCallback;
        String str2;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        String str3;
        int i2 = 2 % 2;
        super.onStop();
        if (!(!this.onMessageChannelReady) && (str3 = this.onActivityResized) != null && str3.length() != 0) {
            SessionTrackerb.IAuthTabCallback(IAuthTabCallback(), this, this.onActivityResized, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        List listListOf = CollectionsKt.listOf(new NativeDialogManagerAndroidSpec.onWarmupCompleted[]{NativeDialogManagerAndroidSpec.onWarmupCompleted.IN_PROCESS, NativeDialogManagerAndroidSpec.onWarmupCompleted.RESERVED});
        NativeDeviceInfoSpec nativeDeviceInfoSpec = this.extraCallback;
        Object obj = null;
        if (nativeDeviceInfoSpec != null) {
            int i3 = extraCommand + 65;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onwarmupcompletedOnExtraCallback = nativeDeviceInfoSpec.onExtraCallback();
        } else {
            onwarmupcompletedOnExtraCallback = null;
        }
        if (CollectionsKt.contains(listListOf, onwarmupcompletedOnExtraCallback) && (str = this.asInterface) != null) {
            int i5 = ICustomTabsCallbackDefault + 79;
            extraCommand = i5 % 128;
            if (i5 % 2 == 0) {
                str.length();
                obj.hashCode();
                throw null;
            }
            if (str.length() != 0) {
                int i6 = ICustomTabsCallbackDefault + 97;
                extraCommand = i6 % 128;
                if (i6 % 2 == 0) {
                    sessionTrackerbIAuthTabCallback = IAuthTabCallback();
                    str2 = this.asInterface;
                    z = true;
                    function1 = null;
                    bundle = null;
                    z2 = true;
                    i = 124;
                } else {
                    sessionTrackerbIAuthTabCallback = IAuthTabCallback();
                    str2 = this.asInterface;
                    z = false;
                    function1 = null;
                    bundle = null;
                    z2 = false;
                    i = 60;
                }
                SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, this, str2, z, function1, bundle, z2, i, (Object) null);
            }
        }
        int i7 = ICustomTabsCallbackDefault + 101;
        extraCommand = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new PackageResultActivity$.ExternalSyntheticLambda16(this));
        int i2 = extraCommand + 73;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(PackageResultActivity packageResultActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 21;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        packageResultActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(packageResultActivity.getString(R.string.bad_request_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new PackageResultActivity$.ExternalSyntheticLambda17(packageResultActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 13;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        this.onActivityResized = getIntent().getStringExtra("successScheme");
        this.asInterface = getIntent().getStringExtra("dropOutScheme");
        String str = this.onActivityResized;
        if (str != null) {
            int i2 = extraCommand + 73;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
                if (str.length() != 0) {
                    return;
                }
            } else if (str.length() != 0) {
                return;
            }
        }
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
        int i4 = ICustomTabsCallbackDefault + 43;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onWarmupCompleted = {27255, 27173, 27173, 27196, 27173, 27179, 27179, 27173};
        int I$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = PackageResultActivity.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 35283), 35 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                int i7 = $10 + 93;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i9 = $11 + 41;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10934), 65 - (KeyEvent.getMaxKeyCode() >> 16), 16718 - Color.alpha(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i12 = $10 + 65;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, 17656 - TextUtils.lastIndexOf("", '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.argb(0, 0, 0, 0)), 69 - ((byte) KeyEvent.getModifierMetaStateMask()), 12534 - AndroidCharacter.getMirror('0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i15 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i15, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i15);
            }
            if (z) {
                int i16 = $11 + 21;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i18 = $11 + 51;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                int i20 = $10 + 89;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i22 = $10 + 103;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r15 != r1) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
        
            if (r15 == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context, im.toss.features.edoc.wallet.pkg.PackageResultActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!PackageResultActivity.IAuthTabCallback_Parcel(PackageResultActivity.this)) {
                    int i3 = onExtraCallbackWithResult + 101;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    getUserFileSize getuserfilesize = getUserFileSize.onNavigationEvent;
                    PackageResultActivity packageResultActivity = PackageResultActivity.this;
                    this.label = 1;
                    obj = getuserfilesize.onNavigationEvent(packageResultActivity, this);
                }
                z = true;
                if (!(!z)) {
                    BaseActivity.IAuthTabCallback(PackageResultActivity.this, (String) null, false, 3, (Object) null);
                    getUserFileSize getuserfilesize2 = getUserFileSize.onNavigationEvent;
                    ?? r2 = PackageResultActivity.this;
                    List<Long> listOnNavigationEvent = r2.onNavigationEvent();
                    Long l = (Long) PackageResultActivity.IAuthTabCallback(new Object[]{PackageResultActivity.this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 960502753, -960502744, getKekid.onExtraCallback());
                    this.I$0 = 1;
                    this.label = 2;
                    objOnNavigationEvent = getuserfilesize2.onNavigationEvent((Context) r2, listOnNavigationEvent, l, this);
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                PackageResultActivity packageResultActivity2 = PackageResultActivity.this;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    int i5 = IAuthTabCallback + 13;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    SessionTrackerb sessionTrackerbIAuthTabCallback = packageResultActivity2.IAuthTabCallback();
                    getUserFileSize getuserfilesize3 = getUserFileSize.onNavigationEvent;
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                    getUserFileSize.IAuthTabCallback(sessionTrackerbIAuthTabCallback, packageResultActivity2, getuserfilesize3.onWarmupCompleted((String) objOnNavigationEvent, ((String) objArr[0]).intern(), PackageResultActivity.onTransact(packageResultActivity2)));
                    packageResultActivity2.bo_();
                }
                EDocShareBaseActivity eDocShareBaseActivity = PackageResultActivity.this;
                Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                    int i7 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    getParamImp.onWarmupCompleted(th, eDocShareBaseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    eDocShareBaseActivity.bo_();
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            if (obj == null) {
                z = false;
                if (!(!z)) {
                }
                return Unit.INSTANCE;
            }
            int i9 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z = true;
            if (!(!z)) {
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onWarmupCompleted(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int i = 2 % 2;
        packageResultActivity.onNavigationEvent(nativeDeviceInfoSpec, true);
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1787968526, 1787968540, getKekid.onExtraCallback());
        ConvertByteArrayToFloatArray.onExtraCallback(1221421L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda36(packageResultActivity, nativeDeviceInfoSpec), 14, (Object) null);
        int i2 = ICustomTabsCallbackDefault + 31;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(onExtraCallbackWithResult(packageResultActivity, nativeDeviceInfoSpec, null, 2, null));
        setDetectableSize.onExtraCallback(packageResultActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 93;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getUserFileSize$onExtraCallbackWithResult getuserfilesize_onextracallbackwithresult;
        String strName;
        BaseActivity baseActivity = (PackageResultActivity) objArr[0];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[1];
        int i = 2 % 2;
        ((PackageResultActivity) baseActivity).extraCallback = nativeDeviceInfoSpec;
        int i2 = onWarmupCompleted.onExtraCallback[nativeDeviceInfoSpec.onExtraCallback().ordinal()];
        if (i2 == 1) {
            getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.SUCCESS;
        } else if (i2 != 2) {
            int i3 = ICustomTabsCallbackDefault + 7;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0 ? i2 == 3 : i2 == 2) {
                getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.IN_PROCESS;
                int i4 = ICustomTabsCallbackDefault + 107;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
            } else if (i2 != 4) {
                getuserfilesize_onextracallbackwithresult = null;
            } else {
                List listAsInterface = nativeDeviceInfoSpec.asInterface();
                if (!(listAsInterface instanceof Collection)) {
                    Iterator it = listAsInterface.iterator();
                    int i6 = ICustomTabsCallbackDefault + 85;
                    extraCommand = i6 % 128;
                    int i7 = i6 % 2;
                    while (it.hasNext()) {
                        if (((NativeDialogManagerAndroidSpec) it.next()).asInterface() != NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL) {
                            getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.PARTIAL_FAIL;
                            break;
                        }
                    }
                    getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.ALL_FAIL;
                } else {
                    int i8 = ICustomTabsCallbackDefault + 13;
                    extraCommand = i8 % 128;
                    if (i8 % 2 == 0) {
                        listAsInterface.isEmpty();
                        throw null;
                    }
                    if (listAsInterface.isEmpty()) {
                        getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.ALL_FAIL;
                    }
                }
            }
        }
        if (!((PackageResultActivity) baseActivity).onActivityLayout) {
            Intent intent = new Intent();
            if (getuserfilesize_onextracallbackwithresult != null) {
                int i9 = ICustomTabsCallbackDefault + 69;
                extraCommand = i9 % 128;
                if (i9 % 2 == 0) {
                    getuserfilesize_onextracallbackwithresult.name();
                    throw null;
                }
                strName = getuserfilesize_onextracallbackwithresult.name();
            } else {
                strName = null;
            }
            baseActivity.setResult(-1, intent.putExtra("status", strName));
            onWarmupCompleted((PackageResultActivity) baseActivity, nativeDeviceInfoSpec);
            return null;
        }
        int i10 = ICustomTabsCallbackDefault + 7;
        extraCommand = i10 % 128;
        int i11 = i10 % 2;
        if (nativeDeviceInfoSpec.onExtraCallback() != NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
            if (nativeDeviceInfoSpec.onNavigationEvent()) {
                baseActivity.setResult(-1, new Intent().putExtra("status", getuserfilesize_onextracallbackwithresult != null ? getuserfilesize_onextracallbackwithresult.name() : null));
                onWarmupCompleted((PackageResultActivity) baseActivity, nativeDeviceInfoSpec);
                return null;
            }
            baseActivity.setResult(-1, new Intent().putExtra("status", getuserfilesize_onextracallbackwithresult != null ? getuserfilesize_onextracallbackwithresult.name() : null));
            baseActivity.finish();
            return null;
        }
        int i12 = ICustomTabsCallbackDefault + 45;
        extraCommand = i12 % 128;
        if (i12 % 2 == 0) {
            onWarmupCompleted((PackageResultActivity) baseActivity, nativeDeviceInfoSpec);
            baseActivity.IAuthTabCallback(false);
            return null;
        }
        onWarmupCompleted((PackageResultActivity) baseActivity, nativeDeviceInfoSpec);
        baseActivity.IAuthTabCallback(true);
        return null;
    }

    static /* synthetic */ void onNavigationEvent(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 65;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            z = false;
        }
        packageResultActivity.onNavigationEvent(nativeDeviceInfoSpec, z);
        int i4 = extraCommand + 125;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, SetDetectableSize setDetectableSize) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = extraCommand + 9;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            i = 5;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
        }
        setDetectableSize.onExtraCallback(onExtraCallbackWithResult(packageResultActivity, nativeDeviceInfoSpec, null, i, null));
        setDetectableSize.onExtraCallback(packageResultActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(NativeDeviceInfoSpec nativeDeviceInfoSpec, boolean z) {
        List listListOf;
        boolean z2;
        Object next;
        boolean z3;
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy) {
            this.IAuthTabCallbackStubProxy = false;
            ConvertByteArrayToFloatArray.onExtraCallback(1221421L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda6(this, nativeDeviceInfoSpec), 14, (Object) null);
        }
        Iterator it = nativeDeviceInfoSpec.asInterface().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                boolean z4 = !(DERSet.onExtraCallback.mayLaunchUrl() ^ true) && nativeDeviceInfoSpec.IAuthTabCallback();
                DocumentWalletConfigTitle documentWalletConfigTitleOnWarmupCompleted = nativeDeviceInfoSpec.onWarmupCompleted();
                String strIAuthTabCallback = documentWalletConfigTitleOnWarmupCompleted != null ? documentWalletConfigTitleOnWarmupCompleted.IAuthTabCallback() : null;
                DocumentWalletConfigTitle documentWalletConfigTitleOnWarmupCompleted2 = nativeDeviceInfoSpec.onWarmupCompleted();
                List listListOf2 = CollectionsKt.listOf(new Object[]{new FileBridgeExtension31.IAuthTabCallbackStubProxy(strIAuthTabCallback, documentWalletConfigTitleOnWarmupCompleted2 != null ? documentWalletConfigTitleOnWarmupCompleted2.onNavigationEvent() : null), new FileBridgeExtension31.access100(20)});
                int i3 = onWarmupCompleted.onExtraCallback[nativeDeviceInfoSpec.onExtraCallback().ordinal()];
                if (i3 != 2) {
                    int i4 = ICustomTabsCallbackDefault + 15;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 == 3) {
                        listListOf = z ? CollectionsKt.listOf(new FileBridgeExtension31.asInterface()) : nativeDeviceInfoSpec.asInterface();
                    } else if (i3 != 4) {
                        listListOf = nativeDeviceInfoSpec.asInterface();
                    } else {
                        List listAsInterface = nativeDeviceInfoSpec.asInterface();
                        if ((listAsInterface instanceof Collection) && listAsInterface.isEmpty()) {
                            z3 = true;
                            if (z4) {
                                listListOf = nativeDeviceInfoSpec.asInterface();
                            }
                        } else {
                            Iterator it2 = listAsInterface.iterator();
                            while (it2.hasNext()) {
                                if (((NativeDialogManagerAndroidSpec) it2.next()).asInterface() != NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL) {
                                    int i6 = extraCommand + 101;
                                    ICustomTabsCallbackDefault = i6 % 128;
                                    int i7 = i6 % 2;
                                    z3 = false;
                                    break;
                                }
                            }
                            z3 = true;
                            if (z4 || z3) {
                                listListOf = nativeDeviceInfoSpec.asInterface();
                            } else {
                                int i8 = extraCommand + 15;
                                ICustomTabsCallbackDefault = i8 % 128;
                                int i9 = i8 % 2;
                                if (nativeDeviceInfoSpec.onExtraCallbackWithResult()) {
                                    listListOf = CollectionsKt.plus(nativeDeviceInfoSpec.asInterface(), CollectionsKt.listOf(new FileBridgeExtension31.asBinder()));
                                }
                            }
                        }
                    }
                } else {
                    listListOf = CollectionsKt.listOf(new FileBridgeExtension31.IAuthTabCallbackStub());
                }
                List listPlus = CollectionsKt.plus(listListOf2, listListOf);
                if (((NativeDialogManagerAndroidSpec.onWarmupCompleted) FileBridgeExtension31.onWarmupCompleted(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -921031841, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), new Object[]{(FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())}, 921031841)) == nativeDeviceInfoSpec.onExtraCallback()) {
                    Object obj = listPlus.get(0);
                    List listOnExtraCallbackWithResult = ((FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())).onExtraCallbackWithResult();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = listOnExtraCallbackWithResult.iterator();
                    while (!(!it3.hasNext())) {
                        int i10 = ICustomTabsCallbackDefault + 65;
                        extraCommand = i10 % 128;
                        if (i10 % 2 == 0) {
                            next = it3.next();
                            int i11 = 34 / 0;
                            if (next instanceof FileBridgeExtension31.IAuthTabCallbackStubProxy) {
                                arrayList.add(next);
                            }
                        } else {
                            next = it3.next();
                            if (next instanceof FileBridgeExtension31.IAuthTabCallbackStubProxy) {
                                arrayList.add(next);
                            }
                        }
                    }
                    z2 = !Intrinsics.areEqual(obj, arrayList);
                }
                ((FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())).onExtraCallbackWithResult(z);
                if (!z2) {
                    List listOnExtraCallbackWithResult2 = ((FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())).onExtraCallbackWithResult();
                    ArrayList<NativeDialogManagerAndroidSpec> arrayList2 = new ArrayList();
                    for (Object obj2 : listOnExtraCallbackWithResult2) {
                        int i12 = ICustomTabsCallbackDefault + 65;
                        extraCommand = i12 % 128;
                        int i13 = i12 % 2;
                        if (obj2 instanceof NativeDialogManagerAndroidSpec) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec : arrayList2) {
                        if (!z2 && nativeDeviceInfoSpec.asInterface().contains(nativeDialogManagerAndroidSpec)) {
                            int i14 = extraCommand + 57;
                            ICustomTabsCallbackDefault = i14 % 128;
                            if (i14 % 2 == 0) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    ((FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())).onWarmupCompleted(nativeDeviceInfoSpec.onExtraCallback());
                    ((FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback())).onExtraCallbackWithResult(listPlus, true);
                    return;
                }
                return;
            }
            Object next2 = it.next();
            int i15 = i2 + 1;
            if (i2 < 0) {
                int i16 = extraCommand + 17;
                ICustomTabsCallbackDefault = i16 % 128;
                if (i16 % 2 != 0) {
                    CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            ((NativeDialogManagerAndroidSpec) next2).onExtraCallback(i15);
            i2 = i15;
        }
    }

    static /* synthetic */ Map onExtraCallbackWithResult(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = ICustomTabsCallbackDefault + 7;
            int i4 = i3 % 128;
            extraCommand = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 75;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        return packageResultActivity.onExtraCallbackWithResult(nativeDeviceInfoSpec, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, Object> onExtraCallbackWithResult(NativeDeviceInfoSpec nativeDeviceInfoSpec, String str) throws Throwable {
        String str2;
        String strOnNavigationEvent;
        String str3;
        String strIAuthTabCallback;
        Object next;
        int i = 2 % 2;
        List listAsInterface = nativeDeviceInfoSpec.asInterface();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsInterface, 10));
        Iterator it = listAsInterface.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it.next()).IAuthTabCallback()));
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("doc_code_list", CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        List listAsInterface2 = nativeDeviceInfoSpec.asInterface();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listAsInterface2.iterator();
        while (it2.hasNext()) {
            int i2 = ICustomTabsCallbackDefault + 97;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                next = it2.next();
                int i3 = 74 / 0;
                if (((NativeDialogManagerAndroidSpec) next).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
                    int i4 = extraCommand + 33;
                    ICustomTabsCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList2.add(next);
                }
            } else {
                next = it2.next();
                if (((NativeDialogManagerAndroidSpec) next).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
                    int i42 = extraCommand + 33;
                    ICustomTabsCallbackDefault = i42 % 128;
                    int i52 = i42 % 2;
                    arrayList2.add(next);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int i6 = extraCommand + 107;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            arrayList3.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it3.next()).IAuthTabCallback()));
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("issue_doc_code_list", CollectionsKt.joinToString$default(arrayList3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        List listAsInterface3 = nativeDeviceInfoSpec.asInterface();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listAsInterface3.iterator();
        while (true) {
            TdsBottomCtaV1View tdsBottomCtaV1View = null;
            if (!it4.hasNext()) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    int i8 = extraCommand + 33;
                    ICustomTabsCallbackDefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList5.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it5.next()).IAuthTabCallback()));
                        int i9 = 23 / 0;
                    } else {
                        arrayList5.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it5.next()).IAuthTabCallback()));
                    }
                }
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("fail_doc_code_list", CollectionsKt.joinToString$default(arrayList5, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                DocumentWalletConfigTitle documentWalletConfigTitleOnWarmupCompleted = nativeDeviceInfoSpec.onWarmupCompleted();
                if (documentWalletConfigTitleOnWarmupCompleted == null || (strIAuthTabCallback = documentWalletConfigTitleOnWarmupCompleted.IAuthTabCallback()) == null) {
                    str2 = "";
                } else {
                    str2 = strIAuthTabCallback + " ";
                    if (str2 == null) {
                    }
                }
                DocumentWalletConfigTitle documentWalletConfigTitleOnWarmupCompleted2 = nativeDeviceInfoSpec.onWarmupCompleted();
                if (documentWalletConfigTitleOnWarmupCompleted2 != null) {
                    int i10 = extraCommand + 117;
                    ICustomTabsCallbackDefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        documentWalletConfigTitleOnWarmupCompleted2.onNavigationEvent();
                        tdsBottomCtaV1View.hashCode();
                        throw null;
                    }
                    strOnNavigationEvent = documentWalletConfigTitleOnWarmupCompleted2.onNavigationEvent();
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = "";
                    }
                }
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 25645), objArr);
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2 + strOnNavigationEvent);
                TdsBottomCtaV1View tdsBottomCtaV1View2 = this.onTransact;
                if (tdsBottomCtaV1View2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    tdsBottomCtaV1View2 = null;
                }
                CharSequence text = ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{tdsBottomCtaV1View2}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getText();
                Intrinsics.checkNotNull(text);
                if (text.length() <= 0) {
                    text = null;
                }
                if (text != null) {
                    str3 = ((Object) text) + ",";
                    if (str3 == null) {
                        int i11 = ICustomTabsCallbackDefault + 13;
                        extraCommand = i11 % 128;
                        int i12 = i11 % 2;
                        str3 = "";
                    }
                } else {
                    str3 = "";
                }
                TdsBottomCtaV1View tdsBottomCtaV1View3 = this.onTransact;
                if (tdsBottomCtaV1View3 == null) {
                    int i13 = extraCommand + 125;
                    ICustomTabsCallbackDefault = i13 % 128;
                    if (i13 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    tdsBottomCtaV1View = tdsBottomCtaV1View3;
                }
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("button_name", str3 + ((Object) tdsBottomCtaV1View.asInterface().getText()));
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf("", "", 0) + 5, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)});
            }
            Object next2 = it4.next();
            if (((NativeDialogManagerAndroidSpec) next2).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL) {
                int i14 = extraCommand + 1;
                ICustomTabsCallbackDefault = i14 % 128;
                if (i14 % 2 != 0) {
                    arrayList4.add(next2);
                    throw null;
                }
                arrayList4.add(next2);
            }
        }
    }

    private static final void onWarmupCompleted(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1221425L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda15(packageResultActivity, nativeDeviceInfoSpec, str), 14, (Object) null);
        int i2 = ICustomTabsCallbackDefault + 85;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
    }

    private static final Unit IAuthTabCallback(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 39;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(packageResultActivity.onExtraCallbackWithResult(nativeDeviceInfoSpec, str));
        setDetectableSize.onExtraCallback(packageResultActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 55;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, tdsBottomCtaV1View.asInterface().getText().toString());
        packageResultActivity.finish();
        int i4 = ICustomTabsCallbackDefault + 3;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit asBinder(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            packageResultActivity.onSessionEnded();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        packageResultActivity.onSessionEnded();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onTransact(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            packageResultActivity.IPostMessageServiceDefault();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        packageResultActivity.IPostMessageServiceDefault();
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 11;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final void ICustomTabsCallback(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
        int i4 = extraCommand + 61;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onWarmupCompleted());
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onWarmupCompleted());
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 91;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onExtraCallback());
        packageResultActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 25;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity, false, 0, null}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 838170452, -838170440, getKekid.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity, false, 1, null}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 838170452, -838170440, getKekid.onExtraCallback());
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 35;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        packageResultActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 41;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[1];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        ICustomTabsCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getText().toString());
            packageResultActivity.onSessionEnded();
            return null;
        }
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getText().toString());
        packageResultActivity.onSessionEnded();
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(PackageResultActivity packageResultActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        packageResultActivity.onSessionEnded();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 37;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallbackWithResult(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 63;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
            int i3 = 36 / 0;
        } else {
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
        }
        int i4 = extraCommand + 21;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void writeTypedObject(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        packageResultActivity.IPostMessageServiceDefault();
        int i4 = extraCommand + 1;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 13;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onWarmupCompleted());
            int iOnExtraCallback = getKekid.onExtraCallback();
            IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onWarmupCompleted());
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback2, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 35;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallbackStub(EDocCvsExportBottomCta eDocCvsExportBottomCta, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, eDocCvsExportBottomCta.onExtraCallback());
        packageResultActivity.onGreatestScrollPercentageIncreased();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 61;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[1];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 63;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, tdsBottomCtaV1View.asInterface().getText().toString());
            packageResultActivity.onGreatestScrollPercentageIncreased();
            int i3 = 6 / 0;
        } else {
            onWarmupCompleted(packageResultActivity, nativeDeviceInfoSpec, tdsBottomCtaV1View.asInterface().getText().toString());
            packageResultActivity.onGreatestScrollPercentageIncreased();
        }
        int i4 = extraCommand + 23;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        boolean z;
        boolean z2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CharSequence charSequence;
        UIKitBaseActivity uIKitBaseActivity = (PackageResultActivity) objArr[0];
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        View view = ((PackageResultActivity) uIKitBaseActivity).onTransact;
        Object obj = null;
        if (view == null) {
            int i5 = i3 + 27;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(((PackageResultActivity) uIKitBaseActivity).IAuthTabCallback_Parcel, "pc");
        if (!DERSet.onExtraCallback.mayLaunchUrl() || (!nativeDeviceInfoSpec.IAuthTabCallback())) {
            z = false;
        } else {
            int i6 = ICustomTabsCallbackDefault + 9;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        int i8 = onWarmupCompleted.onExtraCallback[nativeDeviceInfoSpec.onExtraCallback().ordinal()];
        if (i8 != 1) {
            int i9 = extraCommand + 9;
            int i10 = i9 % 128;
            ICustomTabsCallbackDefault = i10;
            if (i9 % 2 == 0 ? i8 != 2 : i8 != 5) {
                if (i8 != 3) {
                    int i11 = i10 + 113;
                    extraCommand = i11 % 128;
                    if (i11 % 2 != 0 ? i8 == 4 : i8 == 4) {
                        List listAsInterface = nativeDeviceInfoSpec.asInterface();
                        if ((listAsInterface instanceof Collection) && listAsInterface.isEmpty()) {
                            z2 = true;
                            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                            if (!z2) {
                            }
                            objectRef = objectRef4;
                            objectRef2 = objectRef3;
                            charSequence = (CharSequence) objectRef2.element;
                            if (charSequence != null) {
                            }
                            return null;
                        }
                        Iterator it = listAsInterface.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((NativeDialogManagerAndroidSpec) it.next()).asInterface() != NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL) {
                                int i12 = ICustomTabsCallbackDefault + 21;
                                extraCommand = i12 % 128;
                                if (i12 % 2 == 0) {
                                    break;
                                }
                                z2 = false;
                            }
                        }
                        Ref.ObjectRef objectRef32 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef42 = new Ref.ObjectRef();
                        if (!z2) {
                            objectRef32.element = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___020cff604a);
                            objectRef42.element = new PackageResultActivity$.ExternalSyntheticLambda25(uIKitBaseActivity);
                        } else if (zAreEqual) {
                            uIKitBaseActivity.IPostMessageServiceDefault();
                            objectRef32.element = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___756c0df76c);
                            objectRef42.element = new PackageResultActivity$.ExternalSyntheticLambda26(uIKitBaseActivity);
                        } else {
                            if (!nativeDeviceInfoSpec.onExtraCallbackWithResult()) {
                                objectRef = objectRef42;
                                objectRef2 = objectRef32;
                                objectRef2.element = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___66fa074881);
                                objectRef.element = new PackageResultActivity$.ExternalSyntheticLambda33(uIKitBaseActivity);
                            } else if (z) {
                                if (((PackageResultActivity) uIKitBaseActivity).writeTypedObject != null) {
                                    deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = NetConverter3.onExtraCallback().onNavigationEvent(new PackageResultActivity$.ExternalSyntheticLambda27(uIKitBaseActivity), 1L, TimeUnit.SECONDS);
                                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                                    uIKitBaseActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                                }
                                EDocCvsExportBottomCta eDocCvsExportBottomCta = ((PackageResultActivity) uIKitBaseActivity).IAuthTabCallbackStub;
                                if (eDocCvsExportBottomCta == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    eDocCvsExportBottomCta = null;
                                }
                                eDocCvsExportBottomCta.setOnCvsPrintClick(new PackageResultActivity$.ExternalSyntheticLambda28(eDocCvsExportBottomCta, uIKitBaseActivity, nativeDeviceInfoSpec));
                                eDocCvsExportBottomCta.setOnExportClick(new PackageResultActivity$.ExternalSyntheticLambda29(eDocCvsExportBottomCta, uIKitBaseActivity, nativeDeviceInfoSpec));
                                eDocCvsExportBottomCta.setVisibility(0);
                            } else {
                                if (((PackageResultActivity) uIKitBaseActivity).onActivityLayout) {
                                    objectRef32.element = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___749c9ebfc2);
                                    objectRef42.element = new PackageResultActivity$.ExternalSyntheticLambda30(uIKitBaseActivity);
                                } else {
                                    objectRef32.element = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___c3a6ac356a);
                                    objectRef42.element = new PackageResultActivity$.ExternalSyntheticLambda31(uIKitBaseActivity);
                                }
                                String string = uIKitBaseActivity.getString(R.string.edoc_wallet_pkg___66fa074881);
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                objectRef = objectRef42;
                                objectRef2 = objectRef32;
                                TdsBottomCtaV1View.setSecondary$default(view, string, new PackageResultActivity$.ExternalSyntheticLambda32(view, uIKitBaseActivity, nativeDeviceInfoSpec), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null);
                            }
                            charSequence = (CharSequence) objectRef2.element;
                            if (charSequence != null && charSequence.length() != 0 && objectRef.element != null) {
                                TdsBottomCtaV1View.setCta$default(view, (CharSequence) objectRef2.element, new PackageResultActivity$.ExternalSyntheticLambda19(objectRef2, objectRef, uIKitBaseActivity, nativeDeviceInfoSpec), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                                view.setVisibility(0);
                                view.onExtraCallbackWithResult(true);
                                return null;
                            }
                        }
                        objectRef = objectRef42;
                        objectRef2 = objectRef32;
                        charSequence = (CharSequence) objectRef2.element;
                        if (charSequence != null) {
                            TdsBottomCtaV1View.setCta$default(view, (CharSequence) objectRef2.element, new PackageResultActivity$.ExternalSyntheticLambda19(objectRef2, objectRef, uIKitBaseActivity, nativeDeviceInfoSpec), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                            view.setVisibility(0);
                            view.onExtraCallbackWithResult(true);
                        }
                        return null;
                    }
                }
            }
            TdsBottomCtaV1View.setCta$default(view, im.toss.uikit.R.string.uikit_confirm, new PackageResultActivity$.ExternalSyntheticLambda18(view, uIKitBaseActivity, nativeDeviceInfoSpec), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            view.setVisibility(0);
            view.onExtraCallbackWithResult(true);
            int i13 = extraCommand + 75;
            ICustomTabsCallbackDefault = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        if (!((PackageResultActivity) uIKitBaseActivity).onActivityLayout) {
            if (!z) {
                if (zAreEqual) {
                    uIKitBaseActivity.IPostMessageServiceDefault();
                }
                String string2 = uIKitBaseActivity.getString(R.string.edoc_package_result_export_docs, Integer.valueOf(nativeDeviceInfoSpec.asInterface().size()));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsBottomCtaV1View.setCta$default(view, string2, new PackageResultActivity$.ExternalSyntheticLambda24(view, uIKitBaseActivity, nativeDeviceInfoSpec), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                view.setVisibility(0);
                view.onExtraCallbackWithResult(true);
            } else {
                if (((PackageResultActivity) uIKitBaseActivity).writeTypedObject != null) {
                    deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent2 = NetConverter3.onExtraCallback().onNavigationEvent(new PackageResultActivity$.ExternalSyntheticLambda20(uIKitBaseActivity), 1L, TimeUnit.SECONDS);
                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent2, "");
                    uIKitBaseActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent2);
                } else if (zAreEqual) {
                    deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent3 = NetConverter3.onExtraCallback().onNavigationEvent(new PackageResultActivity$.ExternalSyntheticLambda21(uIKitBaseActivity), 1L, TimeUnit.SECONDS);
                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent3, "");
                    uIKitBaseActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent3);
                }
                EDocCvsExportBottomCta eDocCvsExportBottomCta2 = ((PackageResultActivity) uIKitBaseActivity).IAuthTabCallbackStub;
                if (eDocCvsExportBottomCta2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    eDocCvsExportBottomCta2 = null;
                }
                eDocCvsExportBottomCta2.setOnCvsPrintClick(new PackageResultActivity$.ExternalSyntheticLambda22(eDocCvsExportBottomCta2, uIKitBaseActivity, nativeDeviceInfoSpec));
                eDocCvsExportBottomCta2.setOnExportClick(new PackageResultActivity$.ExternalSyntheticLambda23(eDocCvsExportBottomCta2, uIKitBaseActivity, nativeDeviceInfoSpec));
                eDocCvsExportBottomCta2.setVisibility(0);
            }
        }
        return null;
    }

    private final void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(this.IAuthTabCallback_Parcel, "pc")) {
            int i4 = extraCommand + 63;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                IPostMessageServiceDefault();
                return;
            } else {
                IPostMessageServiceDefault();
                int i5 = 64 / 0;
                return;
            }
        }
        ICustomTabsService_Parcel();
        int i6 = extraCommand + 75;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() {
        ArrayList arrayList;
        List listAsInterface;
        int i = 2 % 2;
        PackageIssueActivity.onWarmupCompleted onwarmupcompleted = PackageIssueActivity.Companion;
        String str = this.onRelationshipValidationResult;
        NativeDeviceInfoSpec nativeDeviceInfoSpec = this.extraCallback;
        Object obj = null;
        if (nativeDeviceInfoSpec == null || (listAsInterface = nativeDeviceInfoSpec.asInterface()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listAsInterface) {
                if (((NativeDialogManagerAndroidSpec) obj2).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL) {
                    int i2 = ICustomTabsCallbackDefault + 79;
                    extraCommand = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int i4 = extraCommand + 97;
                ICustomTabsCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList3.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it.next()).IAuthTabCallback()));
                    obj.hashCode();
                    throw null;
                }
                arrayList3.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it.next()).IAuthTabCallback()));
            }
            arrayList = arrayList3;
        }
        Intent intentIAuthTabCallback = PackageIssueActivity.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, this, str, this.onActivityLayout, arrayList, (Map) null, this.IAuthTabCallback_Parcel, this.readTypedObject, this.writeTypedObject, 16, (Object) null);
        intentIAuthTabCallback.addFlags(33554432);
        startActivity(intentIAuthTabCallback);
        finish();
        int i5 = extraCommand + 23;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        int i = 2 % 2;
        getPackageType getpackagetype = packageResultActivity.extraCallbackWithResult;
        Object obj = null;
        if (getpackagetype != null) {
            int i2 = extraCommand + 101;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0 ? getpackagetype.onExtraCallback() : !getpackagetype.onExtraCallback()) {
                int i3 = ICustomTabsCallbackDefault + 101;
                extraCommand = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        packageResultActivity.extraCallbackWithResult = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(packageResultActivity), (CoroutineContext) null, (setRandomHost) null, packageResultActivity.new IAuthTabCallback(null), 3, (Object) null);
        return null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 115;
            extraCommand = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i3 + 95;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            zBooleanValue = z;
        }
        packageResultActivity.IAuthTabCallback(zBooleanValue);
        int i8 = extraCommand + 5;
        ICustomTabsCallbackDefault = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackStubProxy(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(packageResultActivity, (String) null, false, 3, (Object) null);
        int i4 = ICustomTabsCallbackDefault + 21;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(PackageResultActivity packageResultActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = NetConverter3.onExtraCallback().onNavigationEvent(new PackageResultActivity$.ExternalSyntheticLambda37(packageResultActivity), 2L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        packageResultActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 5;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void access100(PackageResultActivity packageResultActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        packageResultActivity.bo_();
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCommand + 23;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PackageResultActivity packageResultActivity = (PackageResultActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(packageResultActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 15;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(PackageResultActivity packageResultActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        packageResultActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PackageResultActivity packageResultActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(packageResultActivity.getString(R.string.edoc_wallet_pkg___aa292bc212));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new PackageResultActivity$.ExternalSyntheticLambda38(packageResultActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackDefault + 65;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 33;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(PackageResultActivity packageResultActivity, Pair pair) {
        getUserFileSize$onExtraCallbackWithResult getuserfilesize_onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) pair.IAuthTabCallback();
        Intrinsics.checkNotNull(bool);
        packageResultActivity.onMessageChannelReady = bool.booleanValue();
        if (bool.booleanValue()) {
            int i4 = extraCommand + 19;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                getUserFileSize$onExtraCallbackWithResult getuserfilesize_onextracallbackwithresult2 = getUserFileSize$onExtraCallbackWithResult.SUCCESS;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.SUCCESS;
            int i5 = ICustomTabsCallbackDefault + 19;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getuserfilesize_onextracallbackwithresult = getUserFileSize$onExtraCallbackWithResult.ALL_FAIL;
        }
        packageResultActivity.setResult(-1, new Intent().putExtra("status", getuserfilesize_onextracallbackwithresult.name()));
        if (bool.booleanValue()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1221433L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda4(packageResultActivity), 14, (Object) null);
            packageResultActivity.finish();
        } else {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(packageResultActivity, new PackageResultActivity$.ExternalSyntheticLambda5(packageResultActivity));
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(boolean z) {
        long j;
        int i = 2 % 2;
        setTagBytes settagbytes = setTagBytes.onNavigationEvent;
        if (!z) {
            int i2 = extraCommand + 119;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        } else {
            int i4 = extraCommand + 13;
            ICustomTabsCallbackDefault = i4 % 128;
            j = 2700;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
        }
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(j, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onTransact().IAuthTabCallback(new beginScroll((List) null, (Long) null, 3, (DefaultConstructorMarker) null), this.onRelationshipValidationResult);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = settagbytes.IAuthTabCallback(writerawOnExtraCallback, writerawIAuthTabCallback2).IAuthTabCallback(NetConverter3.onExtraCallback()).onExtraCallback(new PackageResultActivity$.ExternalSyntheticLambda9(new PackageResultActivity$.ExternalSyntheticLambda8(this))).onWarmupCompleted(new PackageResultActivity$.ExternalSyntheticLambda10(this)).onNavigationEvent(new PackageResultActivity$.ExternalSyntheticLambda12(new PackageResultActivity$.ExternalSyntheticLambda11(this)), new PackageResultActivity$.ExternalSyntheticLambda14(new PackageResultActivity$.ExternalSyntheticLambda13(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(PackageResultActivity packageResultActivity, Throwable th) {
        int i = 2 % 2;
        packageResultActivity.setResult(-1, new Intent().putExtra("status", "ALL_FAIL"));
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, packageResultActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackDefault + 121;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    @Override // o.FileBridgeExtension31$IAuthTabCallbackDefault
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@NotNull NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec) {
        String string;
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeDialogManagerAndroidSpec, "");
        NativeDialogManagerAndroidSpec.onWarmupCompleted onwarmupcompletedAsInterface = nativeDialogManagerAndroidSpec.asInterface();
        int i2 = onwarmupcompletedAsInterface == null ? -1 : onWarmupCompleted.onExtraCallback[onwarmupcompletedAsInterface.ordinal()];
        if (i2 == 1) {
            startActivity(EDocOpenSchemeActivity.onExtraCallback.onExtraCallbackWithResult(EDocOpenSchemeActivity.Companion, this, nativeDialogManagerAndroidSpec.onNavigationEvent(), false, (String) null, this.readTypedObject, (Long) null, this.onMinimized, 44, (Object) null));
            return;
        }
        int i3 = extraCommand + 69;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            if (i2 != 5) {
                return;
            }
        } else if (i2 != 4) {
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1221423L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda34(nativeDialogManagerAndroidSpec), 14, (Object) null);
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        NativeAppearanceSpec nativeAppearanceSpecOnWarmupCompleted = nativeDialogManagerAndroidSpec.onWarmupCompleted();
        if (nativeAppearanceSpecOnWarmupCompleted != null) {
            int i4 = ICustomTabsCallbackDefault + 27;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                string = nativeAppearanceSpecOnWarmupCompleted.onExtraCallback();
                int i5 = 60 / 0;
                if (string == null) {
                    int i6 = R.string.edoc_issue_fail_bottomsheet_title;
                    String strOnExtraCallbackWithResult = nativeDialogManagerAndroidSpec.onExtraCallbackWithResult();
                    if (strOnExtraCallbackWithResult == null) {
                        strOnExtraCallbackWithResult = getString(R.string.edoc_issue_fail_bottomsheet_default_subject);
                        Intrinsics.checkNotNullExpressionValue(strOnExtraCallbackWithResult, "");
                    }
                    string = getString(i6, strOnExtraCallbackWithResult);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
            } else {
                string = nativeAppearanceSpecOnWarmupCompleted.onExtraCallback();
                if (string == null) {
                }
            }
        }
        bottomSheetHeader.setTitle(string);
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        NativeAppearanceSpec nativeAppearanceSpecOnWarmupCompleted2 = nativeDialogManagerAndroidSpec.onWarmupCompleted();
        if (nativeAppearanceSpecOnWarmupCompleted2 != null) {
            int i7 = ICustomTabsCallbackDefault + 109;
            extraCommand = i7 % 128;
            if (i7 % 2 == 0) {
                strIAuthTabCallback = nativeAppearanceSpecOnWarmupCompleted2.IAuthTabCallback();
                int i8 = 49 / 0;
                if (strIAuthTabCallback == null) {
                    int i9 = ICustomTabsCallbackDefault + 49;
                    extraCommand = i9 % 128;
                    int i10 = i9 % 2;
                    strIAuthTabCallback = "";
                }
            } else {
                strIAuthTabCallback = nativeAppearanceSpecOnWarmupCompleted2.IAuthTabCallback();
                if (strIAuthTabCallback == null) {
                }
            }
        }
        baseTextView.setText(strIAuthTabCallback);
        Context context3 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).ICustomTabsCallbackStubProxy());
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        baseTextView.setPadding(iOnNavigationEvent, 0, varyMatches.onNavigationEvent(24, displayMetrics2), 0);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, viva.republica.toss.R.string.close, new PackageResultActivity$.ExternalSyntheticLambda35(gettypedexportedconstants, nativeDialogManagerAndroidSpec), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    private static final Unit onExtraCallbackWithResult(NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, SetDetectableSize setDetectableSize) throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_code", Long.valueOf(nativeDialogManagerAndroidSpec.IAuthTabCallback()));
        NativeAppearanceSpec nativeAppearanceSpecOnWarmupCompleted = nativeDialogManagerAndroidSpec.onWarmupCompleted();
        if (nativeAppearanceSpecOnWarmupCompleted != null) {
            strIAuthTabCallback = nativeAppearanceSpecOnWarmupCompleted.IAuthTabCallback();
        } else {
            int i4 = extraCommand + 5;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            strIAuthTabCallback = null;
        }
        Object[] objArr = new Object[1];
        a(19 - (Process.myPid() >> 22), TextUtils.getTrimmedLength("") + 6, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strIAuthTabCallback);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 95;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_code", Long.valueOf(nativeDialogManagerAndroidSpec.IAuthTabCallback()));
        NativeAppearanceSpec nativeAppearanceSpecOnWarmupCompleted = nativeDialogManagerAndroidSpec.onWarmupCompleted();
        String strIAuthTabCallback = null;
        if (nativeAppearanceSpecOnWarmupCompleted != null) {
            int i4 = ICustomTabsCallbackDefault + 51;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                nativeAppearanceSpecOnWarmupCompleted.IAuthTabCallback();
                throw null;
            }
            strIAuthTabCallback = nativeAppearanceSpecOnWarmupCompleted.IAuthTabCallback();
        }
        Object[] objArr = new Object[1];
        a(19 - (ViewConfiguration.getEdgeSlop() >> 16), Color.argb(0, 0, 0, 0) + 6, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strIAuthTabCallback);
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1221427L, false, (String) null, (Map) null, new PackageResultActivity$.ExternalSyntheticLambda7(nativeDialogManagerAndroidSpec), 14, (Object) null);
        gettypedexportedconstants.dismiss();
        int i2 = extraCommand + 69;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.FileBridgeExtension31$IAuthTabCallbackDefault
    public void validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onSessionEnded();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 77;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IPostMessageServiceDefault() {
        ArrayList arrayList;
        List listAsInterface;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        NativeDeviceInfoSpec nativeDeviceInfoSpec = this.extraCallback;
        Object obj = null;
        if (nativeDeviceInfoSpec == null || (listAsInterface = nativeDeviceInfoSpec.asInterface()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listAsInterface.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (((NativeDialogManagerAndroidSpec) next).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((NativeDialogManagerAndroidSpec) it2.next()).onNavigationEvent()));
            }
        }
        if (arrayList != null) {
            int i4 = extraCommand + 77;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!arrayList.isEmpty()) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(this, arrayList, (access13800) null), 3, (Object) null);
            }
        }
        int i6 = extraCommand + 43;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AppCompatActivity appCompatActivity = (PackageResultActivity) objArr[0];
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(appCompatActivity);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toolbar.setTitle("");
        appCompatActivity.setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = extraCommand + 105;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRecyclerView.setLayoutManager(new LinearLayoutManager(tdsRecyclerView.getContext(), 1, false));
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsRecyclerView.setLayoutParams(layoutParams);
        tdsRecyclerView.setClipToPadding(false);
        int iOnExtraCallback = getKekid.onExtraCallback();
        tdsRecyclerView.setAdapter((FileBridgeExtension31) IAuthTabCallback(new Object[]{appCompatActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback()));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, tdsRecyclerView, false, 0, 6, (Object) null);
        tdsBottomCtaV1View.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        ((PackageResultActivity) appCompatActivity).onTransact = tdsBottomCtaV1View;
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        EDocCvsExportBottomCta eDocCvsExportBottomCta = new EDocCvsExportBottomCta(context5);
        eDocCvsExportBottomCta.onNavigationEvent();
        eDocCvsExportBottomCta.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, eDocCvsExportBottomCta);
        ((PackageResultActivity) appCompatActivity).IAuthTabCallbackStub = eDocCvsExportBottomCta;
        int i4 = extraCommand + 109;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageResultActivity packageResultActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -2070807472, 2070807489, getKekid.onExtraCallback());
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{function1, obj}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1671590945, -1671590945, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageResultActivity packageResultActivity, View view) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1792843330, -1792843324, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec, str, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 675578526, -675578507, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageResultActivity packageResultActivity, View view) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1088930989, -1088930982, getKekid.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(PackageResultActivity packageResultActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, commonModule_setLeftEdgeTouchEnabled}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 608644009, -608644001, getKekid.onExtraCallback());
    }

    public static /* synthetic */ void asInterface(PackageResultActivity packageResultActivity) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1474743817, -1474743807, getKekid.onExtraCallback());
    }

    public static final /* synthetic */ Long IAuthTabCallbackDefault(PackageResultActivity packageResultActivity) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Long) IAuthTabCallback(new Object[]{packageResultActivity}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 960502753, -960502744, getKekid.onExtraCallback());
    }

    public static final /* synthetic */ void onWarmupCompleted(PackageResultActivity packageResultActivity, String str) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{packageResultActivity, str}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -714079199, 714079215, getKekid.onExtraCallback());
    }

    private final LinearLayout IEngagementSignalsCallback() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (LinearLayout) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -405546088, 405546103, getKekid.onExtraCallback());
    }

    private final FileBridgeExtension31 ICustomTabsServiceStubProxy() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (FileBridgeExtension31) IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 323268178, -323268174, getKekid.onExtraCallback());
    }

    private final void onVerticalScrollEvent() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{this}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 949178456, -949178454, getKekid.onExtraCallback());
    }

    private static final Unit onNavigationEvent(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1196003899, 1196003919, getKekid.onExtraCallback());
    }

    private final void IAuthTabCallback(NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{this, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -925111678, 925111681, getKekid.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, nativeDeviceInfoSpec, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 2098475308, -2098475295, getKekid.onExtraCallback());
    }

    static /* synthetic */ void onNavigationEvent(PackageResultActivity packageResultActivity, boolean z, int i, Object obj) {
        Object[] objArr = {packageResultActivity, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(objArr, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 838170452, -838170440, getKekid.onExtraCallback());
    }

    private static final Unit onNavigationEvent(PackageResultActivity packageResultActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{packageResultActivity, setDetectableSize}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -850080063, 850080074, getKekid.onExtraCallback());
    }

    private final void onExtraCallback(NativeDeviceInfoSpec nativeDeviceInfoSpec) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{this, nativeDeviceInfoSpec}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1787968526, 1787968540, getKekid.onExtraCallback());
    }

    private static final void onWarmupCompleted(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{objectRef, objectRef2, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), -1169329021, 1169329039, getKekid.onExtraCallback());
    }

    private static final void onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 914127760, -914127755, getKekid.onExtraCallback());
    }

    private static final void IAuthTabCallbackDefault(TdsBottomCtaV1View tdsBottomCtaV1View, PackageResultActivity packageResultActivity, NativeDeviceInfoSpec nativeDeviceInfoSpec, View view) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        IAuthTabCallback(new Object[]{tdsBottomCtaV1View, packageResultActivity, nativeDeviceInfoSpec, view}, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), 1502420521, -1502420520, getKekid.onExtraCallback());
    }

    @Override // im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCommand + 75;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCommand + 81;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCommand + 17;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCommand + 111;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = ICustomTabsCallbackDefault + 7;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsServiceStub() {
        ICustomTabsCallbackStub = new char[]{35213, 16584, 6973, 54685, 44284, 60854, 9465, 32528, 45480, 51419, 770, 58070, 11161, 28786, 48841, 51126, 3182, 23249, 25534, 60838, 9449, 32517, 45487, 51419, 770};
        onUnminimized = -7126908231253547892L;
    }
}
