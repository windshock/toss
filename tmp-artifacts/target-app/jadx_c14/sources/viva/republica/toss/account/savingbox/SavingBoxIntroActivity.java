package viva.republica.toss.account.savingbox;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.base.BaseActivity;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BitmapUtilWhenMappings;
import o.CMP_Update_MakeTbsKurProtection;
import o.CollectPerformancePoint;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSet;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NetConverter3;
import o.ReactQueueConfigurationImplCompanion;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.TypeUtils2;
import o.UST_TSA_VerifyTimeStampTokenWithHash;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access15400;
import o.clearTid;
import o.decodeArrayLoop;
import o.decodeDimensionsAndColorSpace;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.downloadZip;
import o.findResAndMsg;
import o.getNavigationBar;
import o.getPadBits;
import o.getParamImp;
import o.getPixelSizeForBitmapConfig;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onDisclaimerClick;
import o.onExitFullscreen;
import o.onVisit;
import o.sendBroadcastSyncWithPendingBroadcasts;
import o.setFixDecodeDrmImageCrash;
import o.setRandomHost;
import o.shortValue;
import o.verifyHASH;
import o.writeRaw;
import o.zzat;
import o.zzav;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.SelectAccountBottomSheetDialog;
import viva.republica.toss.account.detail.TossAccountHistoryActivity;
import viva.republica.toss.account.savingbox.SavingBoxIntroActivity$;
import viva.republica.toss.main.SchemeWebActivity;
import viva.republica.toss.signup.SelectBankActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SavingBoxIntroActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static char access000;
    private static char access100;
    private static char asBinder;
    private static char[] getInterfaceDescriptor;
    public static final int onTransact;
    private static int writeTypedObject;
    private String IAuthTabCallbackDefault = "";
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        onTransact = 8;
        int i = ICustomTabsCallback + 75;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        setFixDecodeDrmImageCrash setfixdecodedrmimagecrash = (setFixDecodeDrmImageCrash) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(savingBoxIntroActivity, setfixdecodedrmimagecrash);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(savingBoxIntroActivity, setfixdecodedrmimagecrash);
        int i3 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash, CollectPerformancePoint collectPerformancePoint) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(savingBoxIntroActivity, setfixdecodedrmimagecrash, collectPerformancePoint);
        int i4 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1978852439, 1978852441, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, str, setDetectableSize}, zzmr.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        setFixDecodeDrmImageCrash setfixdecodedrmimagecrash = (setFixDecodeDrmImageCrash) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(savingBoxIntroActivity, setfixdecodedrmimagecrash);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(savingBoxIntroActivity, str, setDetectableSize);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(savingBoxIntroActivity, setfixdecodedrmimagecrash, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(savingBoxIntroActivity);
        }
        IAuthTabCallback(savingBoxIntroActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, String str, KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(savingBoxIntroActivity, str, keyBoardVisiblePoint);
        int i4 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, List list, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(savingBoxIntroActivity, list, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(savingBoxIntroActivity, deserializeurinullablecollection);
        int i4 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i4);
        int i11 = i9 | i10 | (~(i3 | i));
        int i12 = i8 | i3;
        int i13 = (~((~i) | i3)) | i10;
        int i14 = i3 + i4 + i5 + (111814883 * i2) + (1975835455 * i6);
        int i15 = i14 * i14;
        int i16 = ((i3 * 961080817) - 60187382) + (i4 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (961079685 * i5) + (1618335983 * i2) + (193609403 * i6) + (i15 * 1988296704);
        switch ((((-1960851331) * i3) - 1583611904) + (47848387 * i4) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i5) + ((-648806400) * i2) + (1432616960 * i6) + (442957824 * i15) + (i16 * i16 * 176226304)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
                String str = (String) objArr[1];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackStubProxy + 53;
                IAuthTabCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(savingBoxIntroActivity, str);
                int i20 = IAuthTabCallback_Parcel + 35;
                IAuthTabCallbackStubProxy = i20 % 128;
                int i21 = i20 % 2;
                return unitIAuthTabCallback;
            case 6:
                SavingBoxIntroActivity savingBoxIntroActivity2 = (SavingBoxIntroActivity) objArr[0];
                int i22 = 2 % 2;
                savingBoxIntroActivity2.writeTypedList();
                ConvertByteArrayToFloatArray.onExtraCallback(1005658L, false, (String) null, (Map) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda20(savingBoxIntroActivity2), 14, (Object) null);
                int i23 = IAuthTabCallbackStubProxy + 125;
                IAuthTabCallback_Parcel = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 7:
                return onExtraCallbackWithResult(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                SavingBoxIntroActivity savingBoxIntroActivity3 = (SavingBoxIntroActivity) objArr[0];
                int i25 = 2 % 2;
                disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, (Object) null).onExtraCallbackWithResult(1L).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new SavingBoxIntroActivity$.ExternalSyntheticLambda17(new SavingBoxIntroActivity$.ExternalSyntheticLambda16(savingBoxIntroActivity3, (setFixDecodeDrmImageCrash) objArr[1])), new SavingBoxIntroActivity$.ExternalSyntheticLambda19(new SavingBoxIntroActivity$.ExternalSyntheticLambda18(savingBoxIntroActivity3)));
                int i26 = IAuthTabCallbackStubProxy + 21;
                IAuthTabCallback_Parcel = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return asBinder(objArr);
            default:
                SavingBoxIntroActivity savingBoxIntroActivity4 = (SavingBoxIntroActivity) objArr[0];
                KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
                int i28 = 2 % 2;
                TrackLog.onWarmupCompleted onwarmupcompleted = new TrackLog.onWarmupCompleted(1005682L);
                Object[] objArr2 = new Object[1];
                c(false, new byte[]{0, 1, 1, 1}, new int[]{56, 4, 24, 0}, objArr2);
                TrackLog.onWarmupCompleted onWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted(((String) objArr2[0]).intern(), "saving_box_add");
                Object[] objArr3 = new Object[1];
                c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr3);
                TrackLog.onWarmupCompleted onWarmupCompleted3 = onWarmupCompleted2.onWarmupCompleted(((String) objArr3[0]).intern(), savingBoxIntroActivity4.IAuthTabCallbackDefault);
                deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = shortValue.onWarmupCompleted(shortValue.Companion, savingBoxIntroActivity4, UTF8Decoder.TOSS_SAVING_BOX_ADD, 0L, savingBoxIntroActivity4, false, false, false, false, (String) null, (decodeArrayLoop) null, (Function1) null, 2032, (Object) null).onExtraCallbackWithResult(new SavingBoxIntroActivity$.ExternalSyntheticLambda9(new SavingBoxIntroActivity$.ExternalSyntheticLambda8(keyBoardVisiblePoint, onWarmupCompleted3, savingBoxIntroActivity4))).onNavigationEvent(new SavingBoxIntroActivity$.ExternalSyntheticLambda11(new SavingBoxIntroActivity$.ExternalSyntheticLambda10(savingBoxIntroActivity4)), new SavingBoxIntroActivity$.ExternalSyntheticLambda13(new SavingBoxIntroActivity$.ExternalSyntheticLambda12(savingBoxIntroActivity4, onWarmupCompleted3)));
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                savingBoxIntroActivity4.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                int i29 = IAuthTabCallback_Parcel + 35;
                IAuthTabCallbackStubProxy = i29 % 128;
                int i30 = i29 % 2;
                return null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, TrackLog.onWarmupCompleted onwarmupcompleted, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(savingBoxIntroActivity, onwarmupcompleted, th);
        int i4 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(savingBoxIntroActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(savingBoxIntroActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, TrackLog.onWarmupCompleted onwarmupcompleted, SavingBoxIntroActivity savingBoxIntroActivity, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(keyBoardVisiblePoint, onwarmupcompleted, savingBoxIntroActivity, typeUtils2);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ deserializeIp onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipExtraCallback = extraCallback(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Intent intent, SavingBoxIntroActivity savingBoxIntroActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1114466555, -1114466548, iOnExtraCallbackWithResult2, new Object[]{intent, savingBoxIntroActivity}, zzmr.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(savingBoxIntroActivity, th);
        int i4 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(savingBoxIntroActivity);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1876993679, -1876993673, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, view}, zzmr.onExtraCallbackWithResult());
            int i3 = 72 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult3, zzmr.onExtraCallbackWithResult(), 1876993679, -1876993673, iOnExtraCallbackWithResult4, new Object[]{savingBoxIntroActivity, view}, zzmr.onExtraCallbackWithResult());
        }
        int i4 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return 1005656L;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements Function0<CMP_Update_MakeTbsKurProtection> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onWarmupCompleted(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CMP_Update_MakeTbsKurProtection invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Update_MakeTbsKurProtection.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final class onExtraCallbackWithResult extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ SavingBoxIntroActivity onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, SavingBoxIntroActivity savingBoxIntroActivity) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = savingBoxIntroActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            zzav.IAuthTabCallback(zzat.onExtraCallback(), th, onVisit.IAuthTabCallback(this.onExtraCallbackWithResult), false, 4, (Object) null);
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {savingBoxIntroActivity};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        if (i3 != 0) {
            onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 164092717, -164092714, iOnExtraCallbackWithResult2, objArr2, iOnExtraCallbackWithResult4);
            throw null;
        }
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 164092717, -164092714, iOnExtraCallbackWithResult2, objArr2, iOnExtraCallbackWithResult4);
        int i4 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        List<? extends KeyBoardVisiblePoint> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        savingBoxIntroActivity.IAuthTabCallback(list);
        int i4 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return null;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static char[] onNavigationEvent = {32609, 32630, 32629};
        private static int onExtraCallback = -1184334061;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onWarmupCompleted = true;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Activity activity, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(activity, (Class<?>) SavingBoxIntroActivity.class);
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = IAuthTabCallback + 123;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onNavigationEvent;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 77 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20952 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        int i4 = $11 + 113;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 75 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (!onWarmupCompleted) {
                if (!onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i6 = $11 + 79;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 64, 12214 - (KeyEvent.getMaxKeyCode() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $10 + 55;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 61;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] + iIntValue);
                    try {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 63 - TextUtils.getTrimmedLength(""), 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 'o' - AndroidCharacter.getMirror('0'), 12215 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super/*im.toss.uikit.base.UIKitBaseActivity*/.getScreenParams();
        if (screenParams == null) {
            screenParams = new LinkedHashMap<>();
            int i4 = IAuthTabCallbackStubProxy + 41;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = new Object[1];
        c(false, new byte[]{0, 0, 1, 1, 1}, new int[]{78, 5, 46, 3}, objArr);
        screenParams.put(((String) objArr[0]).intern(), getString(R.string.app_account_savingbox___3589732d41));
        Object[] objArr2 = new Object[1];
        c(false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1}, new int[]{83, 8, 125, 8}, objArr2);
        screenParams.put(((String) objArr2[0]).intern(), getString(R.string.app_account_savingbox___dd6461e8f1));
        Object[] objArr3 = new Object[1];
        c(false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{66, 12, 93, 0}, objArr3);
        screenParams.put(((String) objArr3[0]).intern(), getString(R.string.app_account_savingbox___59b650ab6b));
        Object[] objArr4 = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr4);
        screenParams.put(((String) objArr4[0]).intern(), this.IAuthTabCallbackDefault);
        return screenParams;
    }

    private final CMP_Update_MakeTbsKurProtection onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object value = this.asInterface.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            obj.hashCode();
            throw null;
        }
        Object value2 = this.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        CMP_Update_MakeTbsKurProtection cMP_Update_MakeTbsKurProtection = (CMP_Update_MakeTbsKurProtection) value2;
        int i3 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return cMP_Update_MakeTbsKurProtection;
        }
        throw null;
    }

    private final TdsImageView setEngagementSignalsCallback() {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            tdsImageView = onNavigationEvent().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            int i3 = 53 / 0;
        } else {
            tdsImageView = onNavigationEvent().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        }
        int i4 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return tdsImageView;
    }

    private final SubTypography3 ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SubTypography3 subTypography3 = onNavigationEvent().asInterface;
        Intrinsics.checkNotNullExpressionValue(subTypography3, "");
        int i4 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return subTypography3;
        }
        throw null;
    }

    private final Typography5 validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = onNavigationEvent().onTransact;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = savingBoxIntroActivity.onNavigationEvent().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsBottomCtaV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[PHI: r3
      0x00e3: PHI (r3v12 java.lang.String) = (r3v8 java.lang.String), (r3v95 java.lang.String) binds: [B:23:0x00d6, B:20:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.account.savingbox.SavingBoxIntroActivity] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingBoxIntroActivity.onCreate(android.os.Bundle):void");
    }

    private static final Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            savingBoxIntroActivity.ICustomTabsServiceDefault();
            savingBoxIntroActivity.access200();
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStubProxy + 107;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        savingBoxIntroActivity.ICustomTabsServiceDefault();
        savingBoxIntroActivity.access200();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menu, "");
            getMenuInflater().inflate(R.menu.menu_saving_box_intro, menu);
            super/*android.app.Activity*/.onCreateOptionsMenu(menu);
            throw null;
        }
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_saving_box_intro, menu);
        boolean zOnCreateOptionsMenu = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        int i3 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnCreateOptionsMenu;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        SchemeWebActivity.onExtraCallback onextracallback;
        String strIntern;
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == R.id.action_guide) {
            int i5 = IAuthTabCallbackStubProxy + 87;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                onextracallback = SchemeWebActivity.Companion;
                Object[] objArr = new Object[1];
                c(false, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1}, new int[]{91, 40, 0, 11}, objArr);
                strIntern = ((String) objArr[0]).intern();
                str = null;
                str2 = null;
                z = false;
                z2 = false;
                i = 61;
            } else {
                onextracallback = SchemeWebActivity.Companion;
                Object[] objArr2 = new Object[1];
                c(false, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1}, new int[]{91, 40, 0, 11}, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                str = null;
                str2 = null;
                z = false;
                z2 = false;
                i = 60;
            }
            startActivity(SchemeWebActivity.onExtraCallback.onExtraCallback(onextracallback, this, strIntern, str, str2, z, z2, i, null));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = 1;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                int i6 = defaultGainProviderExternalSyntheticLambda1.onNavigationEvent;
                cArr3[i3] = cArr[i3];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                char c = cArr3[i5];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (access100 ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access000);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + i5);
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        int doubleTapTimeout = 12434 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, i11, doubleTapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[i5] = cCharValue;
                    int i12 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 10, 12434 - (ViewConfiguration.getTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i12 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    i5 = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - MotionEvent.axisFromString("")), KeyEvent.getDeadChar(0, 0) + 14, 19901 - TextUtils.indexOf("", "", 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $10 + 31;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Function0<Unit> function0) {
        int i = 2 % 2;
        onDisclaimerClick ondisclaimerclickIAuthTabCallbackStub = DERConstructedSet.onNavigationEvent.IAuthTabCallbackStub();
        if (ondisclaimerclickIAuthTabCallbackStub != null) {
            int i2 = IAuthTabCallback_Parcel + 97;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getNavigationBar.IAuthTabCallback(TossAccountHistoryActivity.onExtraCallbackWithResult.IAuthTabCallback(TossAccountHistoryActivity.Companion, this, ondisclaimerclickIAuthTabCallbackStub.onExtraCallbackWithResult(), (String) null, (String) null, (String) null, 28, (Object) null), this);
            finish();
            return;
        }
        function0.invoke();
        int i4 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onExtraCallback((Function0<Unit>) new SavingBoxIntroActivity$.ExternalSyntheticLambda6(intent, this));
        int i2 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r4
      0x002b: PHI (r4v5 android.os.Bundle) = (r4v4 android.os.Bundle), (r4v54 android.os.Bundle) binds: [B:10:0x0029, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x059f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingBoxIntroActivity.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            getSupportActionBar();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i3 = IAuthTabCallback_Parcel + 31;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            supportActionBar.onNavigationEvent(true);
            int i5 = IAuthTabCallbackStubProxy + 91;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access200() throws Throwable {
        int i = 2 % 2;
        TdsImageView engagementSignalsCallback = setEngagementSignalsCallback();
        Object[] objArr = new Object[1];
        a(new char[]{26837, 23339, 19036, 10051, 48864, 3120, 40505, 2604, 22843, 25872, 12801, 59358, 37619, 7239, 12441, 53002, 47450, 7975, 7054, 34201, 52895, 47968, 7353, 36873, 20851, 54378, 18409, 51410, 38646, 9636, 11205, 61733, 19843, 21124, 18409, 51410, 42219, 23409, 20765, 7570, 58216, 8795, 44703, 43877, 37811, 18323, 22843, 25872, 51033, 30785, 52599, 17407, 26302, 31328, 42699, 27830, 42219, 23409, 40078, 7953, 25100, 38571, 20535, 41187, 59507, 45797}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 64, objArr);
        TdsImageView.setImage$default(engagementSignalsCallback, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        ICustomTabsServiceStub().setText(getString(R.string.app_account_savingbox___3589732d41));
        validateRelationship().setText(getString(R.string.app_account_savingbox___dd6461e8f1));
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1696034622, 1696034623, iOnExtraCallbackWithResult2, new Object[]{this}, zzmr.onExtraCallbackWithResult());
        String string = getString(R.string.app_account_savingbox___59b650ab6b);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new SavingBoxIntroActivity$.ExternalSyntheticLambda7(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(savingBoxIntroActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new onExtraCallbackWithResult(CoroutineExceptionHandler.extraCallbackWithResult, this), (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SavingBoxIntroActivity.this.new onNavigationEvent(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                List<? extends KeyBoardVisiblePoint> listSortedWith = CollectionsKt.sortedWith(DERConstructedSet.onNavigationEvent.asBinder(), new UST_TSA_VerifyTimeStampTokenWithHash());
                verifyHASH verifyhash = verifyHASH.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(listSortedWith);
                this.I$0 = 0;
                this.label = 1;
                obj = verifyhash.onNavigationEvent(listSortedWith, (access13800<? super List<? extends KeyBoardVisiblePoint>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                Object[] objArr = {SavingBoxIntroActivity.this};
                SavingBoxIntroActivity.onNavigationEvent(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1626109837, -1626109828, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult());
            } else {
                Object[] objArr2 = {SavingBoxIntroActivity.this, list};
                SavingBoxIntroActivity.onNavigationEvent(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1827300249, 1827300257, zzmr.onExtraCallbackWithResult(), objArr2, zzmr.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click_button");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), savingBoxIntroActivity.IAuthTabCallbackDefault);
        Object[] objArr2 = new Object[1];
        c(false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{66, 12, 93, 0}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity, String str, KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 858745144, -858745144, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult());
        ConvertByteArrayToFloatArray.onExtraCallback(1005668L, false, (String) null, (Map) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda14(savingBoxIntroActivity, str), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        SavingBoxIntroActivity savingBoxIntroActivity = (SavingBoxIntroActivity) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click_button");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), savingBoxIntroActivity.IAuthTabCallbackDefault);
        Object[] objArr3 = new Object[1];
        c(false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{66, 12, 93, 0}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity, String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 164092717, -164092714, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity}, zzmr.onExtraCallbackWithResult());
        ConvertByteArrayToFloatArray.onExtraCallback(1005668L, false, (String) null, (Map) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda21(savingBoxIntroActivity, str), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        String string = getString(R.string.app_account_savingbox___4621e680d9);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.app_account_savingbox___3ea4c341dc);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str = String.format("첫 저금은 %,d원으로 시작해요.", Arrays.copyOf(new Object[]{StringsKt.toLongOrNull(DERSet.onExtraCallback.validateRelationship())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        new SelectAccountBottomSheetDialog(this, string, string2, str, (String) null, list, (KeyBoardVisiblePoint) null, false, (TdsCheckBoxV2View.onNavigationEvent) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda22(this), new SavingBoxIntroActivity$.ExternalSyntheticLambda23(this), (String) null, (String) null, 6608, (DefaultConstructorMarker) null).show();
        ConvertByteArrayToFloatArray.onExtraCallback(1005666L, false, (String) null, (Map) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda24(this, list), 14, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity, List list, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(savingBoxIntroActivity.getScreenParams());
        setDetectableSize.onExtraCallback().put("action_type", sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onWarmupCompleted());
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), savingBoxIntroActivity.IAuthTabCallbackDefault);
        setDetectableSize.onExtraCallback("account_cnt", Integer.valueOf(list.size()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.account.savingbox.SavingBoxIntroActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ?? r1 = (SavingBoxIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SelectBankActivity.onExtraCallbackWithResult onextracallbackwithresult = SelectBankActivity.Companion;
        ReactQueueConfigurationImplCompanion reactQueueConfigurationImplCompanion = ReactQueueConfigurationImplCompanion.AVAILABLE_INQUIRY;
        String string = r1.getString(R.string.app_account_savingbox___b07a1246cf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = ((SavingBoxIntroActivity) r1).IAuthTabCallbackDefault;
        Object[] objArr2 = new Object[1];
        c(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0}, new int[]{0, 48, 52, 0}, objArr2);
        r1.startActivity(SelectBankActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (Context) r1, reactQueueConfigurationImplCompanion, str, string, (String) null, (String) null, (Integer[]) null, ((String) objArr2[0]).intern(), (getPadBits) null, (String) null, (String) null, (String) null, false, 8048, (Object) null));
        int i4 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final deserializeIp extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeip;
        }
        throw null;
    }

    private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = getInterfaceDescriptor;
        if (cArr2 != null) {
            int i6 = $10 + 91;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14239 - (Process.myPid() >> 22), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 119;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10935), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16719 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            int i10 = 21 / 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10936), 65 - TextUtils.indexOf("", "", 0), 16718 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 29 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 17657 - (ViewConfiguration.getEdgeSlop() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    int i13 = $11 + 75;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getEdgeSlop() >> 16)), 70 - View.combineMeasuredStates(0, 0), 12485 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $11 + 113;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $10 + 125;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i20 = $10 + 65;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(savingBoxIntroActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(false, new byte[]{0, 1, 1, 1}, new int[]{56, 4, 24, 0}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "savingbox");
        Object[] objArr2 = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), savingBoxIntroActivity.IAuthTabCallbackDefault);
        setDetectableSize.onExtraCallback("account_id", setfixdecodedrmimagecrash.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1005790L, false, (String) null, (Map) null, new SavingBoxIntroActivity$.ExternalSyntheticLambda0(savingBoxIntroActivity, setfixdecodedrmimagecrash), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return unit;
    }

    private static final deserializeIp onExtraCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, TrackLog.onWarmupCompleted onwarmupcompleted, SavingBoxIntroActivity savingBoxIntroActivity, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        getPixelSizeForBitmapConfig getpixelsizeforbitmapconfig = new getPixelSizeForBitmapConfig(new BitmapUtilWhenMappings(keyBoardVisiblePoint.onExtraCallbackWithResult(), keyBoardVisiblePoint.onWarmupCompleted(), null, true, null, 20, null), null, null, 6, null);
        getpixelsizeforbitmapconfig.onExtraCallbackWithResult(typeUtils2);
        onwarmupcompleted.onWarmupCompleted("method", typeUtils2.IAuthTabCallback().getEventName());
        Object[] objArr = new Object[1];
        c(false, new byte[]{0, 1, 0, 0, 1, 0}, new int[]{60, 6, 0, 6}, objArr);
        Object[] objArr2 = {onwarmupcompleted.onWarmupCompleted(((String) objArr[0]).intern(), "success").onExtraCallbackWithResult()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 29426), 22 - Color.green(0), 24734 - (ViewConfiguration.getEdgeSlop() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 24735 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw<decodeDimensionsAndColorSpace> writerawOnNavigationEvent = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(getpixelsizeforbitmapconfig);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new SavingBoxIntroActivity$.ExternalSyntheticLambda2(new SavingBoxIntroActivity$.ExternalSyntheticLambda1(savingBoxIntroActivity))).onNavigationEvent(new SavingBoxIntroActivity$.ExternalSyntheticLambda4(new SavingBoxIntroActivity$.ExternalSyntheticLambda3(savingBoxIntroActivity))).onWarmupCompleted(new SavingBoxIntroActivity$.ExternalSyntheticLambda5(savingBoxIntroActivity));
            int i2 = IAuthTabCallback_Parcel + 31;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return writerawOnWarmupCompleted;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        savingBoxIntroActivity.bo_();
        int i4 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(setfixdecodedrmimagecrash);
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 726065374, -726065364, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, setfixdecodedrmimagecrash}, zzmr.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(setfixdecodedrmimagecrash);
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult3, zzmr.onExtraCallbackWithResult(), 726065374, -726065364, iOnExtraCallbackWithResult4, new Object[]{savingBoxIntroActivity, setfixdecodedrmimagecrash}, zzmr.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, TrackLog.onWarmupCompleted onwarmupcompleted, Throwable th) throws Throwable {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingBoxIntroActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 125, (Object) null);
            Object[] objArr = new Object[1];
            c(false, new byte[]{0, 1, 0, 0, 1, 0}, new int[]{60, 6, 0, 6}, objArr);
            Object[] objArr2 = {onwarmupcompleted.onWarmupCompleted(((String) objArr[0]).intern(), "fail").onExtraCallbackWithResult()};
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            objOnWarmupCompleted = downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingBoxIntroActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            Object[] objArr3 = new Object[1];
            c(false, new byte[]{0, 1, 0, 0, 1, 0}, new int[]{60, 6, 0, 6}, objArr3);
            Object[] objArr4 = {onwarmupcompleted.onWarmupCompleted(((String) objArr3[0]).intern(), "fail").onExtraCallbackWithResult()};
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            objOnWarmupCompleted = downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -870178991, objArr4, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        }
        ((Boolean) objOnWarmupCompleted).booleanValue();
        return Unit.INSTANCE;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash, CollectPerformancePoint collectPerformancePoint) throws Throwable {
        int i = 2 % 2;
        Intent intent = new Intent((Context) savingBoxIntroActivity, (Class<?>) SavingBoxCreateCompleteActivity.class);
        Object[] objArr = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, new int[]{48, 8, 116, 0}, objArr);
        intent.putExtra(((String) objArr[0]).intern(), savingBoxIntroActivity.IAuthTabCallbackDefault);
        intent.putExtra("toss.intent.extra.ACCOUNT_ID", setfixdecodedrmimagecrash.onNavigationEvent());
        Object[] objArr2 = new Object[1];
        a(new char[]{60998, 3151, 20851, 54378, 33632, 49628, 28749, 19531}, 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        intent.putExtra(((String) objArr2[0]).intern(), setfixdecodedrmimagecrash.onExtraCallbackWithResult());
        savingBoxIntroActivity.startActivity(intent);
        savingBoxIntroActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingBoxIntroActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 19, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingBoxIntroActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 7;
        int i5 = i4 % 128;
        IAuthTabCallbackStubProxy = i5;
        int i6 = i4 % 2;
        if (i != 2001 || i2 != -1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i7 = i5 + 21;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            finish();
        } else {
            finish();
            int i8 = 10 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SavingBoxIntroActivity savingBoxIntroActivity, String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 56302424, -56302413, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, str, setDetectableSize}, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1232206912, -1232206900, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, setfixdecodedrmimagecrash}, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(SavingBoxIntroActivity savingBoxIntroActivity, String str) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 25220339, -25220334, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, str}, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(SavingBoxIntroActivity savingBoxIntroActivity, setFixDecodeDrmImageCrash setfixdecodedrmimagecrash) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1519936905, -1519936901, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, setfixdecodedrmimagecrash}, zzmr.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1626109837, -1626109828, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity}, zzmr.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, List list) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1827300249, 1827300257, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, list}, zzmr.onExtraCallbackWithResult());
    }

    private final TdsBottomCtaV1View updateVisuals() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (TdsBottomCtaV1View) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1696034622, 1696034623, iOnExtraCallbackWithResult2, new Object[]{this}, zzmr.onExtraCallbackWithResult());
    }

    private static final void onNavigationEvent(SavingBoxIntroActivity savingBoxIntroActivity, View view) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1876993679, -1876993673, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, view}, zzmr.onExtraCallbackWithResult());
    }

    private final void ICustomTabsService_Parcel() throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 164092717, -164092714, iOnExtraCallbackWithResult2, new Object[]{this}, zzmr.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(Intent intent, SavingBoxIntroActivity savingBoxIntroActivity) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1114466555, -1114466548, iOnExtraCallbackWithResult2, new Object[]{intent, savingBoxIntroActivity}, zzmr.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(setFixDecodeDrmImageCrash setfixdecodedrmimagecrash) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 726065374, -726065364, iOnExtraCallbackWithResult2, new Object[]{this, setfixdecodedrmimagecrash}, zzmr.onExtraCallbackWithResult());
    }

    private final void onWarmupCompleted(KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 858745144, -858745144, iOnExtraCallbackWithResult2, new Object[]{this, keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(SavingBoxIntroActivity savingBoxIntroActivity, String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1978852439, 1978852441, iOnExtraCallbackWithResult2, new Object[]{savingBoxIntroActivity, str, setDetectableSize}, zzmr.onExtraCallbackWithResult());
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = (char) 2220;
        asBinder = (char) 50517;
        access100 = (char) 22139;
        access000 = (char) 328;
        getInterfaceDescriptor = new char[]{27165, 27366, 27368, 27344, 27345, 27369, 27371, 27371, 27369, 27332, 27174, 27181, 27339, 27344, 27345, 27373, 27345, 27344, 27350, 27346, 27369, 27337, 27342, 27345, 27371, 27369, 27370, 27333, 27331, 27375, 27345, 27369, 27358, 27336, 27353, 27347, 27368, 27371, 27371, 27354, 27328, 27372, 27369, 27330, 27330, 27369, 27369, 27375, 27197, 27281, 27281, 27304, 27281, 27287, 27287, 27281, 27144, 27328, 27330, 27340, 27255, 27173, 27170, 27194, 27198, 27198, 27153, 27270, 27295, 27295, 27264, 27269, 27277, 27272, 27269, 27269, 27267, 27275, 27167, 27344, 27352, 27348, 27346, 27190, 27327, 27302, 27302, 27301, 27301, 27299, 27307, 27260, 27173, 27169, 27198, 27167, 27255, 27252, 27262, 27260, 27256, 27254, 27166, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27142, 27175, 27175, 27173, 27166, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27167};
    }
}
