package viva.republica.toss.account.wait;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.network.model.BaseApiResponse;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetOCSPAddr;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DEREnumerated;
import o.DERInputStream;
import o.EncryptedContentInfoParser;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NativeAdsManager;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.UtilsKtExternalSyntheticLambda11;
import o.UtilsKtExternalSyntheticLambda3;
import o.access13800;
import o.access14300;
import o.access27100;
import o.addExtra;
import o.clearMessage;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getButtonBorderColor;
import o.getCodeNameBytes;
import o.getLegacyJavaModule;
import o.getNativeAdLayoutApi;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.initMiniApp;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.onExitFullscreen;
import o.onJsBridgeReady;
import o.readIntokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.varyMatches;
import o.writeRaw;
import o.zzad;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$;
import viva.republica.toss.util.SmoothScrollLinearLayoutManager;

@RequiresAuth(onExtraCallback = 220, onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.TOSS_MONEY_HISTORY_LIST)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DepositWaitAccountHistoryListActivity extends Hilt_DepositWaitAccountHistoryListActivity implements DEREnumerated.onExtraCallback {
    public static final onNavigationEvent Companion;
    private static char ICustomTabsCallback;
    private static int extraCallback;
    private static int extraCallbackWithResult;
    private static long getInterfaceDescriptor;
    public static final int onTransact;
    private DEREnumerated IAuthTabCallbackDefault;
    private final access27100<DEREnumerated.onWarmupCompleted> IAuthTabCallbackStub;
    private final access27100<Boolean> IAuthTabCallbackStubProxy;
    private final access27100<Integer> IAuthTabCallback_Parcel;
    private String access000;
    private IAuthTabCallback access100;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));
    private final access27100<getButtonBorderColor> asInterface;

    @Inject
    public zzad environments;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityResized = 1;
    private static int writeTypedObject = 0;
    private static int readTypedObject = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r8 = 110 - r8
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.$$c(short, short, short):java.lang.String");
    }

    static {
        extraCallbackWithResult = 0;
        ICustomTabsServiceDefault();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = onActivityResized + 93;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i5);
        int i10 = (~i5) | (~((~i3) | i2));
        int i11 = (~(i5 | i3)) | (~(i7 | i5)) | (~i8);
        int i12 = i2 + i3 + i4 + ((-953487067) * i) + ((-1992133889) * i6);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i4) + ((-1703411712) * i) + (1961361408 * i6) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i4 * 272662391) + (i * 2077717299) + (i6 * 1957688713) + (i13 * 166854656);
        switch (i14 + (i15 * i15 * (-213778432))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
                List list = (List) objArr[1];
                int i16 = 2 % 2;
                int i17 = writeTypedObject + 79;
                readTypedObject = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(depositWaitAccountHistoryListActivity, list);
                int i19 = writeTypedObject + 37;
                readTypedObject = i19 % 128;
                int i20 = i19 % 2;
                return unitOnExtraCallbackWithResult;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                BaseActivity baseActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i21 = 2 % 2;
                int i22 = readTypedObject + 75;
                writeTypedObject = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNull(th);
                getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DepositWaitAccountHistoryListActivity::getHistory", th);
                Unit unit = Unit.INSTANCE;
                int i24 = readTypedObject + 87;
                writeTypedObject = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(th);
        int i4 = readTypedObject + 113;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {depositWaitAccountHistoryListActivity, dialogInterface};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 855292525, -855292514, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        int i4 = writeTypedObject + 5;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(depositWaitAccountHistoryListActivity, bool);
        int i4 = readTypedObject + 63;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(depositWaitAccountHistoryListActivity);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Unit unit;
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1188352548, 1188352560, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity, th}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            int i3 = 37 / 0;
        } else {
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1188352548, 1188352560, iOnNavigationEvent4, iOnNavigationEvent3, new Object[]{depositWaitAccountHistoryListActivity, th}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        }
        int i4 = writeTypedObject + 19;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = writeTypedObject + 23;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ List IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List listICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(function1, obj);
        int i4 = readTypedObject + 35;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return listICustomTabsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        int i4 = writeTypedObject + 33;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onRelationshipValidationResult(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 33;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = readTypedObject + 65;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return null;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(function1, obj);
        int i4 = writeTypedObject + 51;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(function1, obj);
        int i4 = writeTypedObject + 101;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(depositWaitAccountHistoryListActivity);
        int i4 = readTypedObject + 69;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = writeTypedObject + 17;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackDefault(function1, obj);
        int i4 = writeTypedObject + 39;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        int i4 = writeTypedObject + 19;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1968919594, 1968919599, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{function1, obj}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        int i4 = readTypedObject + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(depositWaitAccountHistoryListActivity, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, boolean z, NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(depositWaitAccountHistoryListActivity, z, nativeAdsManager);
        int i4 = writeTypedObject + 69;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(depositWaitAccountHistoryListActivity, deserializeurinullablecollection);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(depositWaitAccountHistoryListActivity, deserializeurinullablecollection);
        int i3 = readTypedObject + 87;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = writeTypedObject + 123;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Integer num) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(depositWaitAccountHistoryListActivity, num);
        int i4 = writeTypedObject + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(depositWaitAccountHistoryListActivity, getbuttonbordercolor);
        int i4 = writeTypedObject + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = readTypedObject + 99;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = readTypedObject + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = onExtraCallback(depositWaitAccountHistoryListActivity, pair);
        int i4 = writeTypedObject + 97;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gettypedexportedconstants, view);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = writeTypedObject + 67;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(depositWaitAccountHistoryListActivity, th);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = readTypedObject + 107;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(function1, obj);
        int i4 = readTypedObject + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1634299879, 1634299889, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        int i4 = readTypedObject + 35;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return 1010781L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements Function0<CERT_GetOCSPAddr> {
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallbackStub(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_GetOCSPAddr invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetOCSPAddr.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final asBinder IAuthTabCallback = new asBinder();

        public final void onWarmupCompleted(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DepositWaitAccountHistoryListActivity() {
        access27100<getButtonBorderColor> access27100VarICustomTabsCallback = access27100.ICustomTabsCallback();
        Intrinsics.checkNotNullExpressionValue(access27100VarICustomTabsCallback, "");
        this.asInterface = access27100VarICustomTabsCallback;
        access27100<DEREnumerated.onWarmupCompleted> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(DEREnumerated.onWarmupCompleted.onExtraCallbackWithResult.onWarmupCompleted);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.IAuthTabCallbackStub = access27100VarIAuthTabCallback;
        access27100<Boolean> access27100VarIAuthTabCallback2 = access27100.IAuthTabCallback(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback2, "");
        this.IAuthTabCallbackStubProxy = access27100VarIAuthTabCallback2;
        access27100<Integer> access27100VarIAuthTabCallback3 = access27100.IAuthTabCallback(0);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback3, "");
        this.IAuthTabCallback_Parcel = access27100VarIAuthTabCallback3;
        this.access000 = "";
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        depositWaitAccountHistoryListActivity.onWarmupCompleted(zBooleanValue);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = readTypedObject + 13;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SessionTrackerb sessionTrackerb = depositWaitAccountHistoryListActivity.tossRouter;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = writeTypedObject + 55;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final zzad IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            int i5 = i3 + 63;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                return zzadVar;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = writeTypedObject + 47;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final CERT_GetOCSPAddr updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CERT_GetOCSPAddr cERT_GetOCSPAddr = (CERT_GetOCSPAddr) this.asBinder.getValue();
        int i4 = readTypedObject + 29;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return cERT_GetOCSPAddr;
        }
        throw null;
    }

    private final DEREnumerated.onWarmupCompleted.onExtraCallback ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = this.IAuthTabCallbackStub.readTypedObject() instanceof DEREnumerated.onWarmupCompleted.onExtraCallback;
            throw null;
        }
        Object typedObject = this.IAuthTabCallbackStub.readTypedObject();
        if (!(typedObject instanceof DEREnumerated.onWarmupCompleted.onExtraCallback)) {
            return null;
        }
        DEREnumerated.onWarmupCompleted.onExtraCallback onextracallback = (DEREnumerated.onWarmupCompleted.onExtraCallback) typedObject;
        int i3 = readTypedObject + 95;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (!(!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted))) {
            setContentView(updateVisuals().getRoot());
            extraCommand().onNavigationEvent(true);
            writeTypedList();
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1648182689, 1648182689, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            IEngagementSignalsCallback();
            ICustomTabsServiceStubProxy();
            return;
        }
        int i4 = writeTypedObject + 27;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (IAuthTabCallback().MediaMetadataCompat()) {
                onJsBridgeReady.onNavigationEvent(this, "(DEBUG) 미성년자는 받을 토스머니 기능을 사용할 수 없어요.", 0, 2, (Object) null);
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            a((char) ((-16777216) - Color.rgb(0, 0, 0)), Color.red(0), new char[]{5304, 60897, 46807, 20911, 26295, 6148, 49471, 56690}, new char[]{0, 0, 0, 0}, new char[]{20639, 34532, 38875, 19324}, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "DepositWaitAccountHistoryListActivity", "user is not adult, referrer: " + intent.getStringExtra(((String) objArr[0]).intern()), (Throwable) null, (Map) null, 12, (Object) null);
            finish();
            return;
        }
        IAuthTabCallback().MediaMetadataCompat();
        obj.hashCode();
        throw null;
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        MenuInflater menuInflater = getMenuInflater();
        if (i3 != 0) {
            menuInflater.inflate(R.menu.menu_deposit_wait_account_history_list, menu);
            return false;
        }
        menuInflater.inflate(R.menu.menu_deposit_wait_account_history_list, menu);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r6 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ICustomTabsService_Parcel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        ICustomTabsService_Parcel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return super.onOptionsItemSelected(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r6.getItemId() == viva.republica.toss.R.id.information) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r6.getItemId() == viva.republica.toss.R.id.information) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r6 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject + 7;
        viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull android.view.MenuItem r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r2
            int r1 = r1 % r0
            r2 = 7
            java.lang.String r3 = ""
            if (r1 == 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            int r1 = r6.getItemId()
            int r3 = viva.republica.toss.R.id.information
            int r4 = r2 / 0
            if (r1 != r3) goto L3d
            goto L2a
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            int r1 = r6.getItemId()
            int r3 = viva.republica.toss.R.id.information
            if (r1 != r3) goto L3d
        L2a:
            int r6 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject
            int r6 = r6 + r2
            int r1 = r6 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r1
            int r6 = r6 % r0
            r0 = 1
            if (r6 == 0) goto L39
            r5.ICustomTabsService_Parcel()
            return r0
        L39:
            r5.ICustomTabsService_Parcel()
            return r0
        L3d:
            boolean r6 = super.onOptionsItemSelected(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = updateVisuals().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, updateVisuals().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        int i4 = readTypedObject + 65;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((getNativeAdLayoutApi) t2).onWarmupCompleted()), Long.valueOf(((getNativeAdLayoutApi) t).onWarmupCompleted()));
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        depositWaitAccountHistoryListActivity.ICustomTabsServiceStubProxy();
        int i4 = readTypedObject + 77;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 125;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), MotionEvent.axisFromString("") + 44, AndroidCharacter.getMirror('0') + 1403, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), TextUtils.indexOf("", "", 0) + 44, TextUtils.indexOf("", "", 0) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 23972), 50 - (ViewConfiguration.getTouchSlop() >> 8), 22939 - View.combineMeasuredStates(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45848), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12577 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (getInterfaceDescriptor ^ 7798559133331975163L)) ^ ((int) (extraCallback ^ 7798559133331975163L))) ^ ((char) (ICustomTabsCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 59;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.Context, o.DEREnumerated$onExtraCallback, viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r8 = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        r8.updateVisuals().IAuthTabCallback.setOnRefreshListener(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda9((DepositWaitAccountHistoryListActivity) r8));
        ((DepositWaitAccountHistoryListActivity) r8).IAuthTabCallbackDefault = new DEREnumerated(r8);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager((Context) r8, 0.0f, (Function1) null, 6, (DefaultConstructorMarker) null);
        ((DepositWaitAccountHistoryListActivity) r8).access100 = new IAuthTabCallback((DepositWaitAccountHistoryListActivity) r8, smoothScrollLinearLayoutManager);
        r8.updateVisuals().onExtraCallbackWithResult.setLayoutManager(smoothScrollLinearLayoutManager);
        RecyclerView recyclerView = r8.updateVisuals().onExtraCallbackWithResult;
        RecyclerView.OnScrollListener onScrollListener = ((DepositWaitAccountHistoryListActivity) r8).access100;
        if (onScrollListener == null) {
            int i2 = readTypedObject + 99;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            onScrollListener = null;
        }
        recyclerView.addOnScrollListener(onScrollListener);
        RecyclerView recyclerView2 = r8.updateVisuals().onExtraCallbackWithResult;
        RecyclerView.Adapter adapter = ((DepositWaitAccountHistoryListActivity) r8).IAuthTabCallbackDefault;
        if (adapter == null) {
            int i4 = writeTypedObject + 111;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = readTypedObject + 83;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            adapter = null;
        }
        recyclerView2.setAdapter(adapter);
        return null;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 5;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 39;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 17;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getLegacyJavaModule getlegacyjavamodule = depositWaitAccountHistoryListActivity.access100;
        if (getlegacyjavamodule == null) {
            int i5 = i2 + 101;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = writeTypedObject + 21;
            readTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            }
            getlegacyjavamodule = null;
        }
        Intrinsics.checkNotNull(bool);
        getlegacyjavamodule.IAuthTabCallback(bool.booleanValue());
        depositWaitAccountHistoryListActivity.IAuthTabCallback_Parcel.onWarmupCompleted(Integer.valueOf(bool.booleanValue() ? 1 : 0));
        return Unit.INSTANCE;
    }

    private static final void onRelationshipValidationResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 73;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] onExtraCallback = {-725758014, -1929258848, -973400583, 1838670566, -1164923266, 551970980, -1835103844, -332850321, -1897827029, 302065241, -1435708817, 1410130578, 551292436, -1409213902, 1047195131, -787200977, -2007322454, 117789179};
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = DepositWaitAccountHistoryListActivity.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i5 = -1469660336;
            int i6 = 16;
            int i7 = 0;
            if (iArr2 != null) {
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i10 = 0;
                while (i10 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, (ViewConfiguration.getTouchSlop() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i10++;
                        i5 = -1469660336;
                        i6 = 16;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i11 = $11 + 107;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    int i14 = $10 + 9;
                    $11 = i14 % 128;
                    if (i14 % i3 == 0) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(iArr5[i13]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i7, i7), ExpandableListView.getPackedPositionChild(0L) + 73, ExpandableListView.getPackedPositionGroup(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i13 %= 1;
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 72, View.resolveSizeAndState(0, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i13++;
                    }
                    i3 = 2;
                    i7 = 0;
                }
                i2 = i7;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i15 = $11 + 105;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 22252), 39 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i17++;
                }
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4033), 78 - Color.alpha(0), 7398 - View.combineMeasuredStates(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2, 0, i);
            int i22 = $11 + 35;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            String strIntern;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                UtilsKtExternalSyntheticLambda11 utilsKtExternalSyntheticLambda11 = UtilsKtExternalSyntheticLambda11.IAuthTabCallback;
                this.label = 1;
                obj = UtilsKtExternalSyntheticLambda11.onExtraCallback(utilsKtExternalSyntheticLambda11, "dashboard.home-overview.toss-money-exit.toss-pay-money", (UtilsKtExternalSyntheticLambda3) null, this, 2, (Object) null);
                if (obj == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 99;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 87 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                Object[] objArr = new Object[1];
                a(new int[]{-2121123479, 556382328, 517212592, -387767887, 538765, -28441524, -770109671, 405309458, 1447873901, -809555580, -501348825, -1854182482, 587945690, -884162359, 1947616874, -954285128, 476183446, -854259552, -325791402, -363992078, 1630184266, 1063111475, 1779799450, 400104328, -250754763, -567359257, 941524562, -1699760961, -95326052, -284198523, 307890559, -1503326807, -328035633, -1914425405, -413811631, -510342282, -186480655, -1260572998}, 74 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                int i7 = onNavigationEvent + 23;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-2121123479, 556382328, 517212592, -387767887, 538765, -28441524, 1169784396, -1471196358, 1914015593, -145691986, 652360977, -1275732736, 1605596748, -1127052243, 476183446, -854259552, -702399412, 846322918, -774411680, 713241379, -233366383, 1421024927, -496685261, -1661476349, -1604675686, 1653709015, 1651436500, 1118158761, 1440805951, -104932213, -1090814541, 1110097063, -1654691216, 2112592943}, 115 >>> Drawable.resolveOpacity(0, 1), objArr2);
                    obj2 = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new int[]{-2121123479, 556382328, 517212592, -387767887, 538765, -28441524, 1169784396, -1471196358, 1914015593, -145691986, 652360977, -1275732736, 1605596748, -1127052243, 476183446, -854259552, -702399412, 846322918, -774411680, 713241379, -233366383, 1421024927, -496685261, -1661476349, -1604675686, 1653709015, 1651436500, 1118158761, 1440805951, -104932213, -1090814541, 1110097063, -1654691216, 2112592943}, Drawable.resolveOpacity(0, 0) + 68, objArr3);
                    obj2 = objArr3[0];
                }
                strIntern = ((String) obj2).intern();
            }
            String str = strIntern;
            Object[] objArr4 = {DepositWaitAccountHistoryListActivity.this};
            SessionTrackerb.onExtraCallbackWithResult((SessionTrackerb) DepositWaitAccountHistoryListActivity.IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -203158113, 203158127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr4, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()), DepositWaitAccountHistoryListActivity.this, str, 1001, (Bundle) null, 8, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Integer num) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        readTypedObject = i2 % 128;
        DEREnumerated dEREnumerated = null;
        if (i2 % 2 == 0) {
            DEREnumerated dEREnumerated2 = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
            throw null;
        }
        DEREnumerated dEREnumerated3 = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
        if (dEREnumerated3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            dEREnumerated3 = null;
        }
        DERInputStream.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = dEREnumerated3.onWarmupCompleted();
        if (iAuthTabCallbackOnWarmupCompleted != null) {
            int iOnExtraCallback = iAuthTabCallbackOnWarmupCompleted.onExtraCallback();
            if (num == null || iOnExtraCallback != num.intValue()) {
                Intrinsics.checkNotNull(num);
                iAuthTabCallbackOnWarmupCompleted.onNavigationEvent(num.intValue());
                RecyclerView.Adapter adapter = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
                if (adapter == null) {
                    int i3 = writeTypedObject + 73;
                    readTypedObject = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = readTypedObject + 105;
                    writeTypedObject = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 3;
                    }
                    adapter = null;
                }
                DEREnumerated dEREnumerated4 = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
                if (dEREnumerated4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = writeTypedObject + 45;
                    readTypedObject = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 4 % 2;
                    }
                } else {
                    dEREnumerated = dEREnumerated4;
                }
                adapter.notifyItemChanged(dEREnumerated.onExtraCallbackWithResult().indexOf(iAuthTabCallbackOnWarmupCompleted));
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return unit;
    }

    private static final void onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 23;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final List ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        List list;
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
            int i3 = 18 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
        }
        int i4 = writeTypedObject + 23;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static final List onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Pair pair) {
        DEREnumerated dEREnumerated;
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            DEREnumerated dEREnumerated2 = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pair, "");
        getButtonBorderColor getbuttonbordercolor = (getButtonBorderColor) pair.onExtraCallbackWithResult();
        DEREnumerated.onWarmupCompleted onwarmupcompleted = (DEREnumerated.onWarmupCompleted) pair.IAuthTabCallback();
        DEREnumerated dEREnumerated3 = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
        if (dEREnumerated3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = writeTypedObject + 29;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            dEREnumerated = null;
        } else {
            dEREnumerated = dEREnumerated3;
        }
        Intrinsics.checkNotNull(getbuttonbordercolor);
        Intrinsics.checkNotNull(onwarmupcompleted);
        return DEREnumerated.IAuthTabCallback(dEREnumerated, getbuttonbordercolor, onwarmupcompleted, 0, 4, null);
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 81;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, List list) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 19;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        DEREnumerated dEREnumerated = depositWaitAccountHistoryListActivity.IAuthTabCallbackDefault;
        if (dEREnumerated == null) {
            int i5 = i2 + 81;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = writeTypedObject + 117;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            dEREnumerated = null;
        }
        Intrinsics.checkNotNull(list);
        dEREnumerated.onExtraCallbackWithResult(list, true);
        return Unit.INSTANCE;
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = this.IAuthTabCallbackStubProxy.asInterface().onWarmupCompleted(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda15(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda10(this)), new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda17(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda16()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface = this.IAuthTabCallback_Parcel.asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted2 = jsonReaderUnknownNumberParsingAsInterface.onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda19(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda18(this)), new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda21(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda20()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted2, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted2);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface2 = clearMessage.onWarmupCompleted.IAuthTabCallback(this.asInterface, this.IAuthTabCallbackStub).asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface2, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAsInterface2.onWarmupCompleted(clearTid.onExtraCallback()).onNavigationEvent(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda23(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda22(this)));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted3 = jsonReaderUnknownNumberParsingOnNavigationEvent.onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda12(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda11(this)), new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda14(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda13()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted3, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted3);
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class asInterface<T> implements Comparator {
        final /* synthetic */ Comparator onNavigationEvent;

        public asInterface(Comparator comparator) {
            this.onNavigationEvent = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.onNavigationEvent.compare(t, t2);
            return iCompare != 0 ? iCompare : getCodeNameBytes.IAuthTabCallback(((getNativeAdLayoutApi) t2).IAuthTabCallbackStub(), ((getNativeAdLayoutApi) t).IAuthTabCallbackStub());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ICustomTabsServiceStubProxy() throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L17
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$IAuthTabCallback r1 = r10.access100
            r3 = 19
            int r3 = r3 / r2
            if (r1 != 0) goto L2a
            goto L1b
        L17:
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$IAuthTabCallback r1 = r10.access100
            if (r1 != 0) goto L2a
        L1b:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject
            int r1 = r1 + 49
            int r3 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r3
            int r1 = r1 % r0
            r1 = 0
        L2a:
            r1.onExtraCallback(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r10}
            int r7 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r6 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r3 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r9 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            r4 = -1691766132(0xffffffff9b29b28c, float:-1.4037044E-22)
            r5 = 1691766139(0x64d64d7b, float:3.162549E22)
            IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            r0 = 1
            r10.onWarmupCompleted(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.ICustomTabsServiceStubProxy():void");
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 13;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        depositWaitAccountHistoryListActivity.updateVisuals().IAuthTabCallback.setRefreshing(true);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 17;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        depositWaitAccountHistoryListActivity.updateVisuals().IAuthTabCallback.setRefreshing(false);
        int i4 = writeTypedObject + 63;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            depositWaitAccountHistoryListActivity.asInterface.onWarmupCompleted(getbuttonbordercolor);
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 49;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        depositWaitAccountHistoryListActivity.asInterface.onWarmupCompleted(getbuttonbordercolor);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            depositWaitAccountHistoryListActivity.finish();
            return Unit.INSTANCE;
        }
        depositWaitAccountHistoryListActivity.finish();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity = (DepositWaitAccountHistoryListActivity) objArr[0];
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 29427), (KeyEvent.getMaxKeyCode() >> 16) + 22, 24734 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29426), ExpandableListView.getPackedPositionChild(0L) + 23, 24734 - Color.blue(0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw<BaseApiResponse<getButtonBorderColor>> writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj2, null)).IAuthTabCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback2.onExtraCallback(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda27(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda26(depositWaitAccountHistoryListActivity))).onWarmupCompleted(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda28(depositWaitAccountHistoryListActivity)).onNavigationEvent(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda30(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda29(depositWaitAccountHistoryListActivity)), new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda32(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda31(depositWaitAccountHistoryListActivity)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            depositWaitAccountHistoryListActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            int i2 = writeTypedObject + 101;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, depositWaitAccountHistoryListActivity, false, (initMiniApp) null, (Function0) null, new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda0(depositWaitAccountHistoryListActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 125;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 109;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        depositWaitAccountHistoryListActivity.IAuthTabCallbackStubProxy.onWarmupCompleted(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access27100<Boolean> access27100Var = depositWaitAccountHistoryListActivity.IAuthTabCallbackStubProxy;
        Boolean bool = Boolean.FALSE;
        if (i3 != 0) {
            access27100Var.onWarmupCompleted(bool);
        } else {
            access27100Var.onWarmupCompleted(bool);
            int i4 = 93 / 0;
        }
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = writeTypedObject + 51;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 81;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity r4, boolean r5, o.NativeAdsManager r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r6.onExtraCallback()
            r4.access000 = r1
            java.util.List r1 = r6.IAuthTabCallback()
            int r1 = r1.size()
            r2 = 30
            r3 = 0
            if (r1 < r2) goto L37
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject
            int r1 = r1 + 61
            int r2 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L2c
            java.lang.String r1 = r6.onExtraCallback()
            int r1 = r1.length()
            if (r1 != 0) goto L4f
            goto L37
        L2c:
            java.lang.String r4 = r6.onExtraCallback()
            r4.length()
            r3.hashCode()
            throw r3
        L37:
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$IAuthTabCallback r1 = r4.access100
            if (r1 != 0) goto L41
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L42
        L41:
            r3 = r1
        L42:
            r1 = 1
            r3.onExtraCallback(r1)
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject
            int r1 = r1 + 23
            int r2 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject = r2
            int r1 = r1 % r0
        L4f:
            java.util.List r6 = r6.IAuthTabCallback()
            r4.onExtraCallback(r6, r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.onWarmupCompleted(viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity, boolean, o.NativeAdsManager):kotlin.Unit");
    }

    private final void onWarmupCompleted(boolean z) throws Throwable {
        int i = 2 % 2;
        if (z) {
            int i2 = readTypedObject + 91;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            this.access000 = "";
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29427), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, 24733 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29427), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 24734 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw<BaseApiResponse<NativeAdsManager>> writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(30, this.access000);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback2.onExtraCallback(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda2(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda1(this))).onWarmupCompleted(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda3(this)).onNavigationEvent(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda5(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda4(this, z)), new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda7(new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda6(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            int i4 = writeTypedObject + 97;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(java.util.List<? extends o.getNativeAdLayoutApi> r5, boolean r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L60
            if (r6 == 0) goto L17
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L43
        L17:
            o.DEREnumerated$onWarmupCompleted$onExtraCallback r6 = r4.ICustomTabsServiceStub()
            if (r6 == 0) goto L3e
            int r1 = viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.writeTypedObject
            int r1 = r1 + 71
            int r3 = r1 % 128
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.readTypedObject = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L37
            java.util.List r6 = r6.IAuthTabCallback()
            if (r6 == 0) goto L3e
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r6 = kotlin.collections.CollectionsKt.toMutableList(r6)
            if (r6 != 0) goto L43
            goto L3e
        L37:
            r6.IAuthTabCallback()
            r2.hashCode()
            throw r2
        L3e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L43:
            java.util.Collection r5 = (java.util.Collection) r5
            r6.addAll(r5)
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$asInterface r5 = new viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$asInterface
            viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$onWarmupCompleted r0 = new viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity$onWarmupCompleted
            r0.<init>()
            r5.<init>(r0)
            kotlin.collections.CollectionsKt.sortWith(r6, r5)
            o.access27100<o.DEREnumerated$onWarmupCompleted> r5 = r4.IAuthTabCallbackStub
            o.DEREnumerated$onWarmupCompleted$onExtraCallback r0 = new o.DEREnumerated$onWarmupCompleted$onExtraCallback
            r0.<init>(r6)
            r5.onWarmupCompleted(r0)
            return
        L60:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.wait.DepositWaitAccountHistoryListActivity.onExtraCallback(java.util.List, boolean):void");
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a((char) (46807 << (ViewConfiguration.getMaximumDrawingCacheSize() * 28)), View.MeasureSpec.getSize(0), new char[]{35352, 62461, 12404, 30759}, new char[]{0, 0, 0, 0}, new char[]{25314, 19235, 55088, 11190}, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46807), View.MeasureSpec.getSize(0), new char[]{35352, 62461, 12404, 30759}, new char[]{0, 0, 0, 0}, new char[]{25314, 19235, 55088, 11190}, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), "receive");
        return Unit.INSTANCE;
    }

    @Override // o.DERGeneralString.onWarmupCompleted
    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1010783L, false, (String) null, (Map) null, new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda8(), 14, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i2 = writeTypedObject + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((char) (46807 - KeyEvent.getDeadChar(0, 0)), KeyEvent.keyCodeFromString(""), new char[]{35352, 62461, 12404, 30759}, new char[]{0, 0, 0, 0}, new char[]{25314, 19235, 55088, 11190}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "disclaimer");
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 57;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsService_Parcel() {
        int i;
        int i2;
        int i3 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1010783L, false, (String) null, (Map) null, new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda24(), 14, (Object) null);
        asBinder asbinder = asBinder.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, asbinder, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        if (PlayerErrorCode.writeTypedObject() > 20) {
            i = R.string.deposit_wait_account_history_list_bottom_sheet_title_for_over_19_age;
        } else if (PlayerErrorCode.writeTypedObject() != 19) {
            i = R.string.deposit_wait_account_history_list_bottom_sheet_title_default;
        } else {
            int i4 = readTypedObject + 49;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = R.string.deposit_wait_account_history_list_bottom_sheet_title_for_19_age;
                throw null;
            }
            i = R.string.deposit_wait_account_history_list_bottom_sheet_title_for_19_age;
        }
        bottomSheetHeader.setTitle(i);
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(0, displayMetrics2);
        DisplayMetrics displayMetrics3 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(0, displayMetrics4));
        Context context3 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new onTransact(configuration)).ICustomTabsCallbackStubProxy());
        if (PlayerErrorCode.writeTypedObject() > 20) {
            i2 = R.string.deposit_wait_account_history_list_bottom_sheet_description_for_over_19_age;
        } else if (PlayerErrorCode.writeTypedObject() == 19) {
            i2 = R.string.deposit_wait_account_history_list_bottom_sheet_description_for_19_age;
        } else {
            i2 = R.string.deposit_wait_account_history_list_bottom_sheet_description_default;
        }
        baseTextView.setText(i2);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new DepositWaitAccountHistoryListActivity$.ExternalSyntheticLambda25(gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i6 = readTypedObject + 105;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        Object obj = null;
        if (i == 1001) {
            int i4 = readTypedObject + 85;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 == -1) {
                finish();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        int i5 = writeTypedObject + 45;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 563424321, -563424317, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{th}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ void onNavigationEvent(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1347145732, 1347145738, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Throwable th) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1044836593, -1044836584, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity, th}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, List list) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1514614203, -1514614200, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity, list}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 936842323, -936842310, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{function1, obj}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -539248914, 539248916, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{setDetectableSize}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ void writeTypedObject(Function1 function1, Object obj) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 697040720, -697040719, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{function1, obj}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static final /* synthetic */ void onWarmupCompleted(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, boolean z) {
        Object[] objArr = {depositWaitAccountHistoryListActivity, Boolean.valueOf(z)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1147398358, 1147398366, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private final void validateRelationship() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1691766132, 1691766139, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 855292525, -855292514, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity, dialogInterface}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1968919594, 1968919599, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{function1, obj}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity, Throwable th) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1188352548, 1188352560, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity, th}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private final void access200() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1648182689, 1648182689, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private static final void IAuthTabCallbackDefault(DepositWaitAccountHistoryListActivity depositWaitAccountHistoryListActivity) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1634299879, 1634299889, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{depositWaitAccountHistoryListActivity}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public final SessionTrackerb onNavigationEvent() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (SessionTrackerb) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -203158113, 203158127, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    @Override // viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = readTypedObject + 47;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsServiceDefault() {
        getInterfaceDescriptor = 7798559133331975163L;
        extraCallback = -1981704704;
        ICustomTabsCallback = (char) 27643;
    }
}
