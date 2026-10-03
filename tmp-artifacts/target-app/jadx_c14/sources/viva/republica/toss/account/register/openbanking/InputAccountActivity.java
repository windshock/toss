package viva.republica.toss.account.register.openbanking;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.define.MobileCarrier;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T06View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_SetCACert;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSet;
import o.EncryptedContentInfoParser;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.IdGeneratorExternalSyntheticLambda1;
import o.M_;
import o.MapConverter;
import o.NavigationBarCompat;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsAccessor;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UST_CMP_IssueCertificate_SendConf;
import o.bindApp;
import o.checkDeviceBrand;
import o.checkNavigationBarBySystemProperties;
import o.checkNavigationBarByWindowManagerService;
import o.clearTid;
import o.commonTestFlag;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.getIssuerAndSerialNumber;
import o.onExitFullscreen;
import o.onPageExit;
import o.overrideEventDispatcher;
import o.requestTimeStamp;
import o.send;
import o.sendBroadcastWithAdObject;
import o.setPhotoIndex;
import o.setTagBytes;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.wasLastName;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.register.openbanking.InputAccountActivity$;
import viva.republica.toss.account.register.openbanking.InputAccountActivity$onClickNoDap$2$;
import viva.republica.toss.dialogs.RichSelectBottomSheetDialog;
import viva.republica.toss.network.model.transfer.deposit.TransferHistoryItem;
import viva.republica.toss.network.model.transfer.deposit.TransferHistoryRange;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InputAccountActivity extends Hilt_InputAccountActivity {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static int access100;
    private static int extraCallback;
    private static byte[] extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    private static short[] writeTypedObject;
    private boolean access000;

    @Inject
    public zzag tossClock;
    private static final byte[] $$a = {79, 7, -80, -125};
    private static final int $$b = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityResized = 1;
    private static int readTypedObject = 0;
    private static int ICustomTabsCallback = 1;
    private checkNavigationBarBySystemProperties asInterface = checkNavigationBarBySystemProperties.Companion.IAuthTabCallback();
    private final List<String> IAuthTabCallbackStubProxy = new ArrayList();
    private String onTransact = "";
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda25
        public final Object invoke(Object obj) {
            return InputAccountActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    private static String $$c(int i, int i2, short s) {
        int i3 = 115 - (i * 4);
        int i4 = (i2 * 4) + 4;
        int i5 = s * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i4]) + i3;
            i4++;
            i6 = i7;
        }
    }

    static {
        extraCallback = 0;
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallbackStub = 8;
        int i = onActivityResized + 95;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputAccountActivity inputAccountActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(inputAccountActivity, pair);
        int i4 = ICustomTabsCallback + 37;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputAccountActivity inputAccountActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(inputAccountActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(inputAccountActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(InputAccountActivity inputAccountActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(inputAccountActivity);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        int i4 = readTypedObject + 5;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(inputAccountActivity, str);
        int i4 = readTypedObject + 9;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = readTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return (List) onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 2047602968, -2047602961, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
        CERT_SetCACert cERT_SetCACert = (CERT_SetCACert) objArr[1];
        CharSequence charSequence = (CharSequence) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(inputAccountActivity, cERT_SetCACert, charSequence);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(inputAccountActivity, cERT_SetCACert, charSequence);
        int i3 = readTypedObject + 111;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ List onExtraCallback(List list, InputAccountActivity inputAccountActivity, List list2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallbackWithResult = onExtraCallbackWithResult(list, inputAccountActivity, list2);
        int i4 = readTypedObject + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InputAccountActivity inputAccountActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(inputAccountActivity, setDetectableSize);
        int i4 = ICustomTabsCallback + 3;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(InputAccountActivity inputAccountActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(inputAccountActivity, view);
        int i4 = readTypedObject + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = ICustomTabsCallback + 101;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(InputAccountActivity inputAccountActivity, String str, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(inputAccountActivity, str, view);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i3 = readTypedObject + 83;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i4 | i5)) | (~(i3 | i5));
        int i10 = ~i3;
        int i11 = (~(i10 | i5)) | i4;
        int i12 = (~(i5 | i4 | i3)) | (~(i8 | i10));
        int i13 = i4 + i3 + i + ((-373584967) * i2) + ((-1711780345) * i6);
        int i14 = i13 * i13;
        int i15 = (i4 * 1075882953) + 1902575616 + (1075882953 * i3) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i) + ((-375259136) * i2) + ((-1109524480) * i6) + (585564160 * i14);
        int i16 = ((i4 * 235012993) - 778813113) + (i3 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i * 235013625) + (i2 * 915899377) + (i6 * (-1709701169)) + (i14 * 1974403072);
        switch (i15 + (i16 * i16 * (-848756736))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                final InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
                int i17 = 2 % 2;
                IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnNavigationEvent = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss", locale);
                Calendar calendarOnNavigationEvent = inputAccountActivity.IAuthTabCallback().onNavigationEvent();
                calendarOnNavigationEvent.add(2, -6);
                String str = idGeneratorExternalSyntheticLambda1OnNavigationEvent.format(calendarOnNavigationEvent.getTime());
                String str2 = idGeneratorExternalSyntheticLambda1OnNavigationEvent.format(commonTestFlag.onExtraCallback.onExtraCallback(inputAccountActivity.IAuthTabCallback().asBinder()));
                Intrinsics.checkNotNull(str);
                Intrinsics.checkNotNull(str2);
                TransferHistoryRange transferHistoryRange = new TransferHistoryRange(str, str2);
                final List listListOf = CollectionsKt.listOf(new String[]{String.valueOf(inputAccountActivity.asInterface.IAuthTabCallbackStub()), String.valueOf(inputAccountActivity.asInterface.extraCallback())});
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (Process.myTid() >> 22)), 22 - TextUtils.indexOf("", "", 0), 24734 - TextUtils.indexOf("", "", 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29426), Gravity.getAbsoluteGravity(0, 0) + 22, 24734 - View.resolveSizeAndState(0, 0, 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                    }
                    writeRaw<BaseApiResponse<List<TransferHistoryItem>>> writerawOnNavigationEvent = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(transferHistoryRange);
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, null));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj2) {
                            return InputAccountActivity.onExtraCallback(listListOf, inputAccountActivity, (List) obj2);
                        }
                    };
                    writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda4
                        public final Object apply(Object obj2) {
                            return (List) InputAccountActivity.onNavigationEvent(new Object[]{function1, obj2}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -179638705, 179638718, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                    int i18 = ICustomTabsCallback + 59;
                    readTypedObject = i18 % 128;
                    int i19 = i18 % 2;
                    return writerawOnWarmupCompleted;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                Throwable th2 = (Throwable) objArr[0];
                int i20 = 2 % 2;
                int i21 = readTypedObject + 17;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnTransact = onTransact(th2);
                int i23 = ICustomTabsCallback + 119;
                readTypedObject = i23 % 128;
                int i24 = i23 % 2;
                return unitOnTransact;
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access000(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(InputAccountActivity inputAccountActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(inputAccountActivity, iEngagementSignalsCallbackDefault);
        int i4 = ICustomTabsCallback + 59;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(InputAccountActivity inputAccountActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inputAccountActivity, setDetectableSize);
        int i4 = readTypedObject + 71;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onNavigationEvent(ExternalAppExecutingDialog externalAppExecutingDialog) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(externalAppExecutingDialog);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 49;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(InputAccountActivity inputAccountActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(inputAccountActivity);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 69;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(inputAccountActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onNavigationEvent(inputAccountActivity, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -290577126, 290577127, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            int i3 = 49 / 0;
        } else {
            onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -290577126, 290577127, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        int i4 = readTypedObject + 111;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(ClipboardManager clipboardManager) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(clipboardManager);
        int i4 = ICustomTabsCallback + 1;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1318703761, -1318703751, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = readTypedObject + 13;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(InputAccountActivity inputAccountActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(inputAccountActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 1000868L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements Function0<CERT_SetCACert> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onExtraCallbackWithResult(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CERT_SetCACert invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_SetCACert.onNavigationEvent(layoutInflater);
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<List<? extends TransferHistoryItem>> apply(writeRaw<BaseApiResponse<List<? extends TransferHistoryItem>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass2 anonymousClass2 = new Function1<BaseApiResponse<List<? extends TransferHistoryItem>>, deserializeIp<? extends List<? extends TransferHistoryItem>>>() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity.onNavigationEvent.2
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends TransferHistoryItem>> invoke(BaseApiResponse<List<? extends TransferHistoryItem>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass2) { // from class: o.UtilsKtExternalSyntheticLambda17$onPreparePanel
                private final /* synthetic */ Function1 IAuthTabCallback;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass2, "");
                    this.IAuthTabCallback = anonymousClass2;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.IAuthTabCallback.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(new Object[]{inputAccountActivity}, setPhotoIndex.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021129).substring(0, 1).length() + 1799022081, -1417744568, 1417744568, iOnNavigationEvent, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = readTypedObject + 77;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ Map onExtraCallbackWithResult(InputAccountActivity inputAccountActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Map map = (Map) onNavigationEvent(new Object[]{inputAccountActivity}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = ICustomTabsCallback + 103;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(InputAccountActivity inputAccountActivity, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        inputAccountActivity.onWarmupCompleted(str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 53;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onWarmupCompleted(InputAccountActivity inputAccountActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<String> list = inputAccountActivity.IAuthTabCallbackStubProxy;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 23;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallback = 946248780319635255L;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 39;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 47;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.argb(0, 0, 0, 0)), 84 - KeyEvent.keyCodeFromString(""), 21233 - Color.alpha(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 20, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable String str3) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) InputAccountActivity.class).putExtra("bankCode", str);
            Object[] objArr = new Object[1];
            a(new char[]{31725, 63565, 31647, 40788, 49129, 46099, 1860, 23357, 19315, 34072, 22099, 43526}, ExpandableListView.getPackedPositionType(0L) + 1, objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), str2).putExtra("serviceReferrer", str3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra2;
            }
            throw null;
        }
    }

    public final zzag IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsService_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) TextUtils.getOffsetBefore("", 0), 1229412313 - View.combineMeasuredStates(0, 0), 821331723 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-118) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = readTypedObject + 23;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String writeTypedList() {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = ICustomTabsCallback + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    private final CERT_SetCACert ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_SetCACert cERT_SetCACert = (CERT_SetCACert) value;
        int i4 = ICustomTabsCallback + 79;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return cERT_SetCACert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(InputAccountActivity inputAccountActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            inputAccountActivity.setResult(-1, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            inputAccountActivity.finish();
            int i4 = readTypedObject + 57;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity
    public void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView(ICustomTabsServiceDefault().getRoot());
            access200();
            send sendVarOnWarmupCompleted = send.Companion.onWarmupCompleted();
            Intent intent = getIntent();
            if (intent != null) {
                stringExtra = intent.getStringExtra("bankCode");
                int i3 = readTypedObject + 99;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                stringExtra = null;
            }
            if (stringExtra == null) {
                int i5 = readTypedObject + 45;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                stringExtra = "";
            }
            checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallbackWithResult = bindApp.onExtraCallbackWithResult(sendVarOnWarmupCompleted, stringExtra);
            this.asInterface = checknavigationbarbysystempropertiesOnExtraCallbackWithResult;
            if (checknavigationbarbysystempropertiesOnExtraCallbackWithResult.onActivityLayout()) {
                finish();
                return;
            } else {
                ICustomTabsServiceStubProxy();
                return;
            }
        }
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceDefault().getRoot());
        access200();
        send.Companion.onWarmupCompleted();
        getIntent();
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (this.access000) {
            this.access000 = false;
            onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 569722428, -569722416, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            Object[] objArr = {M_.onExtraCallback, access000()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
            int i4 = ICustomTabsCallback + 87;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ICustomTabsCallback + 1;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
    }

    public View access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLine = ICustomTabsServiceDefault().IAuthTabCallbackStub;
        if (i3 == 0) {
            return textFieldLine.getEditText();
        }
        textFieldLine.getEditText();
        throw null;
    }

    private final void access200() {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                int i3 = readTypedObject + 89;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                supportActionBar.onNavigationEvent(true);
            }
            int i5 = ICustomTabsCallback + 113;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        getSupportActionBar();
        throw null;
    }

    private static final void IAuthTabCallback(InputAccountActivity inputAccountActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        inputAccountActivity.onSessionEnded();
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(InputAccountActivity inputAccountActivity, View view) throws Throwable {
        int i = 2 % 2;
        inputAccountActivity.onGreatestScrollPercentageIncreased();
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button_confirm", false, (String) null, (List) null, (Map) null, new InputAccountActivity$.ExternalSyntheticLambda0(inputAccountActivity), 30, (Object) null);
        int i2 = readTypedObject + 1;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(InputAccountActivity inputAccountActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
            setDetectableSize.onExtraCallback((Map) onNavigationEvent(new Object[]{inputAccountActivity}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
        setDetectableSize.onExtraCallback((Map) onNavigationEvent(new Object[]{inputAccountActivity}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements RichSelectBottomSheetDialog.Callback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int[] onWarmupCompleted = {86486416, -1003017913, 1851149443, -1593900944, 1255494249, -1470760953, 1604556388, 1992451196, -658071998, 1157538690, 1068647352, -1434019413, 2046938735, 1158008414, 1642738198, -557697463, -597479501, -804442726};

        public static /* synthetic */ Unit onExtraCallbackWithResult(InputAccountActivity inputAccountActivity, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(inputAccountActivity, z, setDetectableSize);
                throw null;
            }
            Unit unitOnNavigationEvent = onNavigationEvent(inputAccountActivity, z, setDetectableSize);
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            int i5 = -1469660336;
            float f = 0.0f;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 37;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 72, Color.alpha(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i7 <<= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                    }
                    i3 = 2;
                    f = 0.0f;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int i9 = $10 + 103;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    int i12 = $11 + 67;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i6] = Integer.valueOf(iArr5[i11]);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(i6), 72 - Gravity.getAbsoluteGravity(i6, i6), View.getDefaultSize(i6, i6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i11 >>= 1;
                    } else {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 72 - TextUtils.getOffsetAfter("", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        i11++;
                    }
                    i5 = -1469660336;
                    i6 = 0;
                }
                int i13 = $11 + 3;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $11 + 91;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16754964) - Color.rgb(0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 39, 10301 - Color.green(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i15 += 73;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        try {
                            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                            if (objOnExtraCallback6 == null) {
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), 39 - View.MeasureSpec.getSize(0), 10301 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objOnExtraCallback6).invoke(null, objArr7)).intValue();
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                            i15++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr8 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4033), Color.blue(0) + 78, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i21 = $11 + 77;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        IAuthTabCallback() {
        }

        @Override // viva.republica.toss.dialogs.RichSelectBottomSheetDialog.Callback
        public void onExtraCallback(RichSelectBottomSheetDialog richSelectBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(richSelectBottomSheetDialog, "");
            richSelectBottomSheetDialog.dismiss();
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit onNavigationEvent(InputAccountActivity inputAccountActivity, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("action_type", "click");
                setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
                throw null;
            }
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
            if (z) {
                int i3 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                str = "account_num";
            } else {
                str = "bank_app";
            }
            Object[] objArr = new Object[1];
            a(new int[]{-893398504, 1061951221, -1279962165, 1180453462}, (ViewConfiguration.getScrollBarSize() >> 8) + 6, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            setDetectableSize.onExtraCallback(InputAccountActivity.onExtraCallbackWithResult(inputAccountActivity));
            Unit unit = Unit.INSTANCE;
            int i5 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        @Override // viva.republica.toss.dialogs.RichSelectBottomSheetDialog.Callback
        public void IAuthTabCallback(RichSelectBottomSheetDialog richSelectBottomSheetDialog, int i, Object obj) throws Throwable {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(richSelectBottomSheetDialog, "");
            if (i < InputAccountActivity.onWarmupCompleted(InputAccountActivity.this).size()) {
                int i3 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                InputAccountActivity inputAccountActivity = InputAccountActivity.this;
                InputAccountActivity.onExtraCallbackWithResult(inputAccountActivity, (String) InputAccountActivity.onWarmupCompleted(inputAccountActivity).get(i));
            } else {
                InputAccountActivity.onNavigationEvent(new Object[]{InputAccountActivity.this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 346639578, -346639574, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                int i5 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 4;
                }
            }
            ConvertByteArrayToFloatArray.onWarmupCompleted("click_bottom_sheet", false, (String) null, (List) null, (Map) null, new InputAccountActivity$onClickNoDap$2$.ExternalSyntheticLambda0(InputAccountActivity.this, z), 30, (Object) null);
            richSelectBottomSheetDialog.dismiss();
            int i7 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 55;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 119;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.account.register.openbanking.InputAccountActivity r7, o.CERT_SetCACert r8, java.lang.CharSequence r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r1 = r1 + 101
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r2
            int r1 = r1 % r0
            o.checkNavigationBarBySystemProperties r1 = r7.asInterface
            int r1 = r1.IAuthTabCallbackStub()
            o.checkNavigationBarByWindowManagerService r2 = o.checkNavigationBarByWindowManagerService.KAKAO
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = r2.getCode()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L48
            int r1 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r1 = r1 + 91
            int r6 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r6
            int r1 = r1 % r0
            java.lang.String r6 = "7979"
            if (r1 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r1 = 3
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r9, r6, r5, r1, r3)
            if (r1 == 0) goto L48
            goto L46
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r9, r6, r5, r0, r3)
            if (r1 == 0) goto L48
        L46:
            r1 = r4
            goto L49
        L48:
            r1 = r5
        L49:
            o.checkNavigationBarBySystemProperties r6 = r7.asInterface
            int r6 = r6.IAuthTabCallbackStub()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = r2.getCode()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            r2 = r2 ^ r4
            if (r2 == r4) goto L6b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.String r2 = "7777"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r9, r2, r5, r0, r3)
            if (r2 == 0) goto L6b
            r2 = r4
            goto L6c
        L6b:
            r2 = r5
        L6c:
            im.toss.uikit.widget.textField.TextFieldLine r6 = r8.IAuthTabCallbackStub
            if (r1 == 0) goto L77
            int r2 = viva.republica.toss.R.string.app_account_register_openbanking___4f30045e22
            java.lang.String r3 = r7.getString(r2)
            goto L88
        L77:
            if (r2 == 0) goto L88
            int r2 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r2 = r2 + 33
            int r3 = r2 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r3
            int r2 = r2 % r0
            int r2 = viva.republica.toss.R.string.app_account_register_openbanking___188e069f2f
            java.lang.String r3 = r7.getString(r2)
        L88:
            r6.setError(r3)
            im.toss.uikit.widget.KeyboardBottomCta r7 = r8.IAuthTabCallback
            im.toss.tds.view.component.atom.button.TdsButtonV1View r7 = r7.onWarmupCompleted()
            if (r1 != 0) goto Lc0
            int r8 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r8 = r8 + 5
            int r1 = r8 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r1
            int r8 = r8 % r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r8 = r9.length()
            if (r8 <= 0) goto Lc0
            int r8 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r8 = r8 + 113
            int r1 = r8 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r1
            int r8 = r8 % r0
            if (r8 != 0) goto Lb9
            int r8 = r9.length()
            r9 = 40
            if (r8 >= r9) goto Lc1
            goto Lc0
        Lb9:
            int r8 = r9.length()
            r9 = 7
            if (r8 >= r9) goto Lc1
        Lc0:
            r4 = r5
        Lc1:
            r7.setEnabled(r4)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputAccountActivity.IAuthTabCallback(viva.republica.toss.account.register.openbanking.InputAccountActivity, o.CERT_SetCACert, java.lang.CharSequence):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallbackDefault(viva.republica.toss.account.register.openbanking.InputAccountActivity r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.List<java.lang.String> r1 = r12.IAuthTabCallbackStubProxy
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 == 0) goto L2a
            int r1 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r1 = r1 + 31
            int r3 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r3
            int r1 = r1 % r0
            java.lang.String r1 = r12.onTransact
            int r1 = r1.length()
            if (r1 > 0) goto L2a
            int r1 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r1 = r1 + 107
            int r3 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r3
            int r1 = r1 % r0
            r1 = r2
            goto L2b
        L2a:
            r1 = 1
        L2b:
            o.CERT_SetCACert r3 = r12.ICustomTabsServiceDefault()
            im.toss.tds.view.component.atom.button.TdsButtonV1View r3 = r3.asBinder
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            if (r1 == 0) goto L39
            goto L44
        L39:
            int r2 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r2 = r2 + 113
            int r4 = r2 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r4
            int r2 = r2 % r0
            r2 = 8
        L44:
            r3.setVisibility(r2)
            if (r1 == 0) goto L5a
            java.lang.String r4 = "impression_find_accnt_num"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda15 r9 = new viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda15
            r9.<init>(r12)
            r10 = 30
            r11 = 0
            o.ConvertByteArrayToFloatArray.onWarmupCompleted(r4, r5, r6, r7, r8, r9, r10, r11)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputAccountActivity.IAuthTabCallbackDefault(viva.republica.toss.account.register.openbanking.InputAccountActivity):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[PHI: r1
      0x004c: PHI (r1v6 java.util.Map) = (r1v5 java.util.Map), (r1v10 java.util.Map) binds: [B:8:0x0047, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 java.util.Map) = (r1v5 java.util.Map), (r1v10 java.util.Map) binds: [B:8:0x0047, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.account.register.openbanking.InputAccountActivity r12, o.SetDetectableSize r13) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r2
            int r1 = r1 % r0
            java.lang.String r2 = "impression"
            java.lang.String r3 = "action_type"
            java.lang.String r4 = ""
            r5 = 0
            if (r1 == 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            java.util.Map r1 = r13.onExtraCallback()
            r1.put(r3, r2)
            java.util.Map r1 = r13.onExtraCallback()
            java.util.List<java.lang.String> r2 = r12.IAuthTabCallbackStubProxy
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 57
            int r3 = r3 / r5
            if (r2 == 0) goto L49
            goto L4c
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            java.util.Map r1 = r13.onExtraCallback()
            r1.put(r3, r2)
            java.util.Map r1 = r13.onExtraCallback()
            java.util.List<java.lang.String> r2 = r12.IAuthTabCallbackStubProxy
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L4c
        L49:
            java.lang.String r0 = "recommended"
            goto L57
        L4c:
            int r2 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r2 = r2 + 35
            int r3 = r2 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r3
            int r2 = r2 % r0
            java.lang.String r0 = "app_installed"
        L57:
            int r2 = android.graphics.Color.blue(r5)
            short r6 = (short) r2
            int r2 = android.view.KeyEvent.keyCodeFromString(r4)
            byte r7 = (byte) r2
            r2 = 1229412309(0x494757d5, float:816509.3)
            int r3 = android.view.KeyEvent.getDeadChar(r5, r5)
            int r8 = r2 - r3
            int r2 = android.view.ViewConfiguration.getPressedStateDuration()
            int r2 = r2 >> 16
            r3 = 821331725(0x30f4870d, float:1.779172E-9)
            int r9 = r3 - r2
            int r2 = android.view.View.combineMeasuredStates(r5, r5)
            int r10 = (-118) - r2
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r11 = r2
            a(r6, r7, r8, r9, r10, r11)
            r2 = r2[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r1.put(r2, r0)
            java.util.Map r12 = r12.getScreenParams()
            r13.onExtraCallback(r12)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputAccountActivity.onWarmupCompleted(viva.republica.toss.account.register.openbanking.InputAccountActivity, o.SetDetectableSize):kotlin.Unit");
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = ICustomTabsCallback + 13;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return null;
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 125;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(InputAccountActivity inputAccountActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        inputAccountActivity.IAuthTabCallbackStubProxy.clear();
        List<String> list = inputAccountActivity.IAuthTabCallbackStubProxy;
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        list.addAll((Collection) first);
        Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        inputAccountActivity.onTransact = (String) second;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        CERT_SetCACert cERT_SetCACertICustomTabsServiceDefault = ICustomTabsServiceDefault();
        cERT_SetCACertICustomTabsServiceDefault.IAuthTabCallbackDefault.setText(getString(R.string.app_account_register_openbanking___45604b13d4, this.asInterface.IAuthTabCallbackStubProxy()));
        TdsTopV1T06View tdsTopV1T06View = cERT_SetCACertICustomTabsServiceDefault.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T06View, "");
        tdsTopV1T06View.setVisibility(Intrinsics.areEqual(String.valueOf(this.asInterface.IAuthTabCallbackStub()), checkNavigationBarByWindowManagerService.KAKAO.getCode()) ? 0 : 8);
        cERT_SetCACertICustomTabsServiceDefault.asBinder.setOnClickListener(new InputAccountActivity$.ExternalSyntheticLambda5(this));
        KeyboardBottomCta keyboardBottomCta = cERT_SetCACertICustomTabsServiceDefault.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCta, im.toss.uikit.R.string.uikit_confirm, new InputAccountActivity$.ExternalSyntheticLambda6(this), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        EditText editText = cERT_SetCACertICustomTabsServiceDefault.IAuthTabCallbackStub.getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
            editText.setImeOptions(6);
            editText.setInputType(2);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(editText).IAuthTabCallback(new InputAccountActivity$.ExternalSyntheticLambda8(new InputAccountActivity$.ExternalSyntheticLambda7(this, cERT_SetCACertICustomTabsServiceDefault)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
            int i4 = readTypedObject + 97;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = setTagBytes.onNavigationEvent.IAuthTabCallback((writeRaw) onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 885641837, -885641834, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()), validateRelationship()).IAuthTabCallback(NetConverter3.onExtraCallback()).onWarmupCompleted(new InputAccountActivity$.ExternalSyntheticLambda9(this)).onNavigationEvent(new InputAccountActivity$.ExternalSyntheticLambda11(new InputAccountActivity$.ExternalSyntheticLambda10(this)), new InputAccountActivity$.ExternalSyntheticLambda13(new InputAccountActivity$.ExternalSyntheticLambda12()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    private static final Unit IAuthTabCallbackDefault(InputAccountActivity inputAccountActivity, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
            setDetectableSize.onExtraCallback((Map) onNavigationEvent(new Object[]{inputAccountActivity}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()));
            unit = Unit.INSTANCE;
            int i3 = 30 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", inputAccountActivity.getScreenName());
            setDetectableSize.onExtraCallback((Map) onNavigationEvent(new Object[]{inputAccountActivity}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()));
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallback + 99;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button_find_accnt_num", false, (String) null, (List) null, (Map) null, new InputAccountActivity$.ExternalSyntheticLambda2(this), 30, (Object) null);
        if (this.IAuthTabCallbackStubProxy.isEmpty()) {
            if (this.onTransact.length() > 0) {
                onNavigationEvent(new Object[]{this}, setPhotoIndex.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021129).substring(0, 1).length() + 1799022081, -1417744568, 1417744568, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = this.IAuthTabCallbackStubProxy;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        int i2 = readTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            arrayList2.add(new requestTimeStamp((String) it.next(), 0, this.asInterface.IAuthTabCallback_Parcel(), true, null, null, 50, null));
        }
        arrayList.addAll(arrayList2);
        if (this.onTransact.length() > 0) {
            String string = getString(R.string.app_account_register_openbanking___2ae6a11a85, this.asInterface.IAuthTabCallbackStubProxy());
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new requestTimeStamp(string, 0, this.asInterface.IAuthTabCallback_Parcel(), true, null, null, 50, null));
        }
        RichSelectBottomSheetDialog richSelectBottomSheetDialog = new RichSelectBottomSheetDialog();
        String string2 = getString(R.string.app_account_register_openbanking___ee9d653811);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RichSelectBottomSheetDialog richSelectBottomSheetDialogOnNavigationEvent = richSelectBottomSheetDialog.onNavigationEvent(string2);
        String string3 = getString(R.string.app_account_register_openbanking___f943a7a17c);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        RichSelectBottomSheetDialog richSelectBottomSheetDialogOnExtraCallback = richSelectBottomSheetDialogOnNavigationEvent.onWarmupCompleted(string3).onExtraCallback(arrayList).onExtraCallback(new IAuthTabCallback());
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        richSelectBottomSheetDialogOnExtraCallback.show(supportFragmentManager, (String) null);
        int i4 = ICustomTabsCallback + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        boolean z2;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "")), 42 - Color.argb(0, 0, 0, 0), 22440 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i6 = $10 + 13;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr2 = extraCallbackWithResult;
                if (bArr2 != null) {
                    int i8 = $11 + 37;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), AndroidCharacter.getMirror('0') + 7, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    int i10 = $11 + 53;
                    $10 = i10 % 128;
                    i4 = 2;
                    int i11 = i10 % 2;
                    bArr2 = bArr;
                } else {
                    i4 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = extraCallbackWithResult;
                    Object[] objArr4 = new Object[i4];
                    objArr4[1] = Integer.valueOf(access100);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "")), View.MeasureSpec.getMode(0) + 42, 22439 - Color.red(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (writeTypedObject[i + ((int) (access100 ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (access100 ^ j)) + (!(z ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback_Parcel), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0) + 86, Process.getGidForName("") + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = extraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 47;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = extraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = writeTypedObject;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #0 {Exception -> 0x0071, blocks: (B:4:0x0007, B:8:0x0017, B:13:0x002a, B:18:0x0037, B:20:0x003d, B:29:0x005d, B:31:0x0069, B:16:0x0031), top: B:37:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String onExtraCallbackWithResult(android.content.ClipboardManager r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            if (r9 == 0) goto L71
            boolean r2 = r9.hasPrimaryClip()     // Catch: java.lang.Exception -> L71
            r3 = 1
            if (r2 != r3) goto L71
            int r2 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r2 = r2 + 63
            int r3 = r2 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r3
            int r2 = r2 % r0
            android.content.ClipData r9 = r9.getPrimaryClip()     // Catch: java.lang.Exception -> L71
            r2 = 0
            if (r9 == 0) goto L4b
            int r3 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r3 = r3 + 13
            int r4 = r3 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L31
            android.content.ClipData$Item r9 = r9.getItemAt(r4)     // Catch: java.lang.Exception -> L71
            if (r9 == 0) goto L4b
            goto L37
        L31:
            android.content.ClipData$Item r9 = r9.getItemAt(r4)     // Catch: java.lang.Exception -> L71
            if (r9 == 0) goto L4b
        L37:
            java.lang.CharSequence r9 = r9.getText()     // Catch: java.lang.Exception -> L71
            if (r9 == 0) goto L4b
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L71
            int r3 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r3 = r3 + 37
            int r4 = r3 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r4
            int r3 = r3 % r0
            goto L4c
        L4b:
            r9 = r2
        L4c:
            if (r9 != 0) goto L5c
            int r9 = viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject
            int r9 = r9 + 79
            int r3 = r9 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback = r3
            int r9 = r9 % r0
            if (r9 == 0) goto L5b
            r4 = r1
            goto L5d
        L5b:
            throw r2
        L5c:
            r4 = r9
        L5d:
            o.enableFabricLogs r3 = o.enableFabricLogs.onExtraCallback     // Catch: java.lang.Exception -> L71
            r5 = 1
            r6 = 0
            r7 = 4
            r8 = 0
            o.processBytes r9 = o.enableFabricLogs.onWarmupCompleted(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L71
            if (r9 == 0) goto L6d
            java.lang.String r2 = r9.onNavigationEvent()     // Catch: java.lang.Exception -> L71
        L6d:
            if (r2 != 0) goto L70
            return r1
        L70:
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputAccountActivity.onExtraCallbackWithResult(android.content.ClipboardManager):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Object systemService;
        final InputAccountActivity inputAccountActivity = (InputAccountActivity) objArr[0];
        int i = 2 % 2;
        FragmentActivity activity = inputAccountActivity.getActivity();
        if (activity != null) {
            int i2 = readTypedObject + 33;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                activity.getSystemService("clipboard");
                throw null;
            }
            systemService = activity.getSystemService("clipboard");
            int i3 = ICustomTabsCallback + 43;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        } else {
            systemService = null;
        }
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InputAccountActivity.onWarmupCompleted(clipboardManager);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return (Unit) InputAccountActivity.onNavigationEvent(new Object[]{this.f$0, (String) obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1474526154, 1474526165, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda18
            public final void accept(Object obj) {
                InputAccountActivity.access100(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return (Unit) InputAccountActivity.onNavigationEvent(new Object[]{(Throwable) obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1073451271, 1073451280, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            }
        };
        writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda20
            public final void accept(Object obj) {
                InputAccountActivity.IAuthTabCallbackStub(function12, obj);
            }
        });
        return null;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 123;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(InputAccountActivity inputAccountActivity, String str, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(str);
        inputAccountActivity.onWarmupCompleted(str);
        int i4 = readTypedObject + 37;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(final InputAccountActivity inputAccountActivity, final String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 63;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(inputAccountActivity.ICustomTabsServiceDefault().asBinder, "");
            Intrinsics.checkNotNull(str);
            str.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsButtonV1View tdsButtonV1View = inputAccountActivity.ICustomTabsServiceDefault().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        Intrinsics.checkNotNull(str);
        int i4 = 0;
        if (str.length() == 0) {
            int i5 = readTypedObject + 125;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsButtonV1View.setVisibility(i);
        TdsButtonV1View tdsButtonV1View2 = inputAccountActivity.ICustomTabsServiceDefault().onExtraCallback;
        tdsButtonV1View2.setText(inputAccountActivity.getString(R.string.app_account_register_openbanking___28b8525906, str));
        Intrinsics.checkNotNull(tdsButtonV1View2);
        if (str.length() > 0) {
            int i7 = ICustomTabsCallback;
            int i8 = i7 + 119;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 1;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i4 = 8;
        }
        tdsButtonV1View2.setVisibility(i4);
        tdsButtonV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputAccountActivity.onExtraCallbackWithResult(this.f$0, str, view);
            }
        });
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 51;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        EditText editText = ICustomTabsServiceDefault().IAuthTabCallbackStub.getEditText();
        if (editText != null) {
            int i2 = ICustomTabsCallback + 77;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                editText.setText(str);
                editText.setSelection(str.length());
                int i3 = 60 / 0;
            } else {
                editText.setText(str);
                editText.setSelection(str.length());
            }
        }
        TdsButtonV1View tdsButtonV1View = ICustomTabsServiceDefault().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        tdsButtonV1View.setVisibility(0);
        TdsButtonV1View tdsButtonV1View2 = ICustomTabsServiceDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View2, "");
        tdsButtonV1View2.setVisibility(8);
        ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(this, "");
        int i4 = readTypedObject + 27;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(InputAccountActivity inputAccountActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(inputAccountActivity.getString(R.string.app_account_register_openbanking___55d180cecf));
        Object obj = null;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 117;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onGreatestScrollPercentageIncreased() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            o.CERT_SetCACert r1 = r5.ICustomTabsServiceDefault()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackStub
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L23
            int r2 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r2 = r2 + 83
            int r3 = r2 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r3
            int r2 = r2 % r0
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L23
            java.lang.String r1 = r1.toString()
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L28
            java.lang.String r1 = ""
        L28:
            o.PageShowPoint$onWarmupCompleted r2 = o.PageShowPoint.Companion
            o.checkNavigationBarBySystemProperties r3 = r5.asInterface
            int r3 = r3.IAuthTabCallbackStub()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r2 = r2.onExtraCallback(r3, r1)
            if (r2 == 0) goto L59
            o.queryTabBarInfo r2 = r2.ICustomTabsCallbackDefault()
            if (r2 == 0) goto L59
            int r3 = viva.republica.toss.account.register.openbanking.InputAccountActivity.ICustomTabsCallback
            int r3 = r3 + 105
            int r4 = r3 % 128
            viva.republica.toss.account.register.openbanking.InputAccountActivity.readTypedObject = r4
            int r3 = r3 % r0
            boolean r0 = r2.isApiType()
            r2 = 1
            if (r0 != r2) goto L59
            viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda14 r0 = new viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda14
            r0.<init>(r5)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r5, r0)
            return
        L59:
            o.checkNavigationBarBySystemProperties r0 = r5.asInterface
            int r0 = r0.IAuthTabCallbackStub()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.onExtraCallbackWithResult(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputAccountActivity.onGreatestScrollPercentageIncreased():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, String str2) throws Throwable {
        String str3;
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.IAuthTabCallbackDefault;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String strName = SessionKnownType.REGISTER_BANK_ACCOUNT.name();
        String str4 = "OPENBANKING_EXECUTION_ID:" + getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK);
        String strICustomTabsService_Parcel = ICustomTabsService_Parcel();
        String str5 = strICustomTabsService_Parcel == null ? "" : strICustomTabsService_Parcel;
        String strWriteTypedList = writeTypedList();
        if (strWriteTypedList == null) {
            int i2 = readTypedObject + 27;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            str3 = "";
        } else {
            str3 = strWriteTypedList;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, strName, "SV-OBA", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, str5, str3, str4, true, Boolean.TRUE, false, (String) null, (String) null, str, str2, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -13090824, 127, (Object) null));
        int i4 = readTypedObject + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(ExternalAppExecutingDialog externalAppExecutingDialog) {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        externalAppExecutingDialog.dismiss();
        int i4 = readTypedObject + 41;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context, viva.republica.toss.account.register.openbanking.InputAccountActivity] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.app.Dialog, viva.republica.toss.account.register.openbanking.ExternalAppExecutingDialog] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final ?? r11 = (InputAccountActivity) objArr[0];
        int i = 2 % 2;
        Object[] objArr2 = {M_.onExtraCallback, r11.ICustomTabsServiceDefault().IAuthTabCallbackStub.getEditText()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1483765845, objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        String string = r11.getString(R.string.app_account_register_openbanking___3c5e90c316, ((InputAccountActivity) r11).asInterface.IAuthTabCallbackStubProxy());
        Intrinsics.checkNotNullExpressionValue(string, "");
        final ?? externalAppExecutingDialog = new ExternalAppExecutingDialog(r11, string);
        externalAppExecutingDialog.setCanceledOnTouchOutside(false);
        externalAppExecutingDialog.setCancelable(false);
        externalAppExecutingDialog.show();
        wasLastName waslastnameOnWarmupCompleted = wasLastName.onNavigationEvent(2L, TimeUnit.SECONDS).onNavigationEvent(NetConverter3.onExtraCallback()).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda21
            public final void run() {
                InputAccountActivity.onNavigationEvent(externalAppExecutingDialog);
            }
        });
        deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda22
            public final void run() {
                InputAccountActivity.onNavigationEvent(this.f$0);
            }
        };
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return (Unit) InputAccountActivity.onNavigationEvent(new Object[]{(Throwable) obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -303066876, 303066878, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            }
        };
        waslastnameOnWarmupCompleted.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.InputAccountActivity$$ExternalSyntheticLambda24
            public final void accept(Object obj) throws Throwable {
                InputAccountActivity.onTransact(function1, obj);
            }
        });
        int i2 = readTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackStub(InputAccountActivity inputAccountActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        inputAccountActivity.access000 = true;
        ReactNativeFeatureFlagsAccessor.onExtraCallback.onExtraCallbackWithResult(inputAccountActivity, inputAccountActivity.onTransact);
        int i4 = readTypedObject + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 117;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (List) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final writeRaw<String> validateRelationship() {
        int i = 2 % 2;
        NavigationBarCompat navigationBarCompatOnNavigationEvent = this.asInterface.onNavigationEvent();
        Object obj = null;
        List listBT_ = navigationBarCompatOnNavigationEvent != null ? navigationBarCompatOnNavigationEvent.bT_() : null;
        if (listBT_ == null) {
            int i2 = readTypedObject + 91;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            listBT_ = CollectionsKt.emptyList();
        }
        Iterator it = listBT_.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i4 = readTypedObject + 121;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallbackWithResult(this, (String) it.next());
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallbackWithResult(this, (String) next)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        writeRaw<String> writerawOnExtraCallback = writeRaw.onExtraCallback(str);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        return writerawOnExtraCallback;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return "account_register__input_account_number";
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "screen");
        linkedHashMap.putAll((Map) onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()));
        int i2 = readTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [android.app.Activity, viva.republica.toss.account.register.openbanking.InputAccountActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str;
        ?? r15 = (InputAccountActivity) objArr[0];
        int i = 2 % 2;
        Intent intent = r15.getIntent();
        Object obj = null;
        if (intent == null || !intent.getBooleanExtra("EXTRA_KEY_IS_INITIAL", false)) {
            str = "additional";
        } else {
            int i2 = readTypedObject + 67;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "initial";
        }
        String strICustomTabsService_Parcel = r15.ICustomTabsService_Parcel();
        String strWriteTypedList = r15.writeTypedList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sendBroadcastWithAdObject sendbroadcastwithadobject = sendBroadcastWithAdObject.ACCOUNT_REGISTER;
        linkedHashMap.put("category", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("service", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("bank_code", Integer.valueOf(((InputAccountActivity) r15).asInterface.IAuthTabCallbackStub()));
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1229412309 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 821331725 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) - 118, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), str);
        linkedHashMap.put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        if (strICustomTabsService_Parcel != null && (!StringsKt.isBlank(strICustomTabsService_Parcel))) {
            Object[] objArr3 = new Object[1];
            a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) KeyEvent.keyCodeFromString(""), 1229412313 - KeyEvent.keyCodeFromString(""), 821331723 - View.getDefaultSize(0, 0), (-118) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
            linkedHashMap.put(((String) objArr3[0]).intern(), strICustomTabsService_Parcel);
        }
        if (strWriteTypedList != null) {
            int i3 = readTypedObject + 11;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!StringsKt.isBlank(strWriteTypedList)) {
                linkedHashMap.put("service_referrer", strWriteTypedList);
            }
        }
        int i5 = ICustomTabsCallback + 55;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }

    private static final List onExtraCallbackWithResult(List list, InputAccountActivity inputAccountActivity, List list2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        ArrayList arrayList = new ArrayList();
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list3.iterator();
        while (!(!it.hasNext())) {
            int i2 = readTypedObject + 11;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                list.contains(((TransferHistoryItem) it.next()).IAuthTabCallbackDefault());
                throw null;
            }
            Object next = it.next();
            if (list.contains(((TransferHistoryItem) next).IAuthTabCallbackDefault())) {
                arrayList2.add(next);
                int i3 = ICustomTabsCallback + 91;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 3;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((TransferHistoryItem) it2.next()).asBinder());
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list3) {
            TransferHistoryItem transferHistoryItem = (TransferHistoryItem) obj;
            if (list.contains(transferHistoryItem.onWarmupCompleted()) && Intrinsics.areEqual(transferHistoryItem.onTransact(), PlayerErrorCode.onPostMessage())) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            int i5 = ICustomTabsCallback + 19;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            arrayList5.add(((TransferHistoryItem) it3.next()).asInterface());
            int i7 = ICustomTabsCallback + 97;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        arrayList.addAll(arrayList5);
        List listDistinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : listDistinct) {
            if (!DERConstructedSet.IAuthTabCallback(DERConstructedSet.onNavigationEvent, String.valueOf(inputAccountActivity.asInterface.IAuthTabCallbackStub()), (String) obj2, false, 4, null)) {
                arrayList6.add(obj2);
            }
        }
        return arrayList6;
    }

    public static /* synthetic */ Unit asBinder(Throwable th) {
        return (Unit) onNavigationEvent(new Object[]{th}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1073451271, 1073451280, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(InputAccountActivity inputAccountActivity, String str) {
        return (Unit) onNavigationEvent(new Object[]{inputAccountActivity, str}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1474526154, 1474526165, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ List asBinder(Function1 function1, Object obj) {
        return (List) onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -179638705, 179638718, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(InputAccountActivity inputAccountActivity, CERT_SetCACert cERT_SetCACert, CharSequence charSequence) {
        return (Unit) onNavigationEvent(new Object[]{inputAccountActivity, cERT_SetCACert, charSequence}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1608928343, -1608928337, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputAccountActivity inputAccountActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onNavigationEvent(new Object[]{inputAccountActivity, commonModule_setLeftEdgeTouchEnabled}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1617927338, -1617927330, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Throwable th) {
        return (Unit) onNavigationEvent(new Object[]{th}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -303066876, 303066878, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final void setEngagementSignalsCallback() throws Throwable {
        onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 569722428, -569722416, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final void ICustomTabsServiceStub() throws Throwable {
        onNavigationEvent(new Object[]{this}, setPhotoIndex.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021129).substring(0, 1).length() + 1799022081, -1417744568, 1417744568, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -290577126, 290577127, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final Map<String, Object> updateVisuals() {
        return (Map) onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1012851432, 1012851437, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final writeRaw<List<String>> IEngagementSignalsCallback() {
        return (writeRaw) onNavigationEvent(new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 885641837, -885641834, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final List IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        return (List) onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 2047602968, -2047602961, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final void writeTypedObject(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(new Object[]{function1, obj}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1318703761, -1318703751, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = readTypedObject + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallback + 93;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 3;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void onNavigationEvent() {
        access100 = 318730275;
        getInterfaceDescriptor = -1538795395;
        IAuthTabCallback_Parcel = 1800184175;
        extraCallbackWithResult = new byte[]{-121, -3, -1, 13, -101, 5, -5, 8, 5, -9, 9, -5};
    }
}
