package viva.republica.toss.account.savingbox;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.network.throwable.TossApiCallException;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BEROctetStringParser;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BitmapUtilWhenMappings;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.ParamImpl;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.decodeDimensions;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.drawProgress;
import o.getParamImp;
import o.getSizeInBytes;
import o.initMiniApp;
import o.mergeParams;
import o.nSetPosition;
import o.setMessageBytes;
import o.setUseDecodeBufferHelper;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AutoSavingBoxAdjustSavingLevelActivity extends BaseActivity {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static long IAuthTabCallback_Parcel;
    private static char[] access000;
    private static int extraCallback;
    private Long IAuthTabCallbackDefault;
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 1;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return (TdsListRowV1View) AutoSavingBoxAdjustSavingLevelActivity.onExtraCallback(637458916, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -637458915, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
    });
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return (TdsListRowV1View) AutoSavingBoxAdjustSavingLevelActivity.onExtraCallback(409528993, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -409528981, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda3
        public final Object invoke() {
            return AutoSavingBoxAdjustSavingLevelActivity.asInterface(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda4
        public final Object invoke() {
            return AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return (TdsTextButtonV0View) AutoSavingBoxAdjustSavingLevelActivity.onExtraCallback(-221920023, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 221920025, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
    });

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[setUseDecodeBufferHelper.values().length];
            try {
                iArr[setUseDecodeBufferHelper.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setUseDecodeBufferHelper.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setUseDecodeBufferHelper.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setUseDecodeBufferHelper.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
        }
    }

    private static String $$c(int i, int i2, byte b) {
        int i3 = i2 * 2;
        int i4 = 4 - (i * 4);
        int i5 = (b * 4) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i5 += -i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4++;
            i5 += -bArr[i4];
        }
    }

    static {
        extraCallback = 1;
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = writeTypedObject + 27;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(autoSavingBoxAdjustSavingLevelActivity);
            throw null;
        }
        TdsTextButtonV0View interfaceDescriptor = getInterfaceDescriptor(autoSavingBoxAdjustSavingLevelActivity);
        int i3 = ICustomTabsCallback + 67;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(dialogInterface);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        int i3 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setUseDecodeBufferHelper setusedecodebufferhelper, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setusedecodebufferhelper, setDetectableSize);
        int i4 = ICustomTabsCallback + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) onExtraCallback(843308393, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, view}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -843308384, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(843308393, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, view}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -843308384, iOnWarmupCompleted2);
        int i3 = 15 / 0;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, setUseDecodeBufferHelper setusedecodebufferhelper, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function0, setusedecodebufferhelper, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallback(-673490273, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 673490273, iOnWarmupCompleted);
        } else {
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallback(-673490273, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 673490273, iOnWarmupCompleted2);
            int i3 = 11 / 0;
        }
    }

    public static /* synthetic */ TdsListRowV1View IAuthTabCallbackDefault(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy(autoSavingBoxAdjustSavingLevelActivity);
        }
        IAuthTabCallbackStubProxy(autoSavingBoxAdjustSavingLevelActivity);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(-1685842317, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1685842322, iOnWarmupCompleted);
        int i4 = IAuthTabCallbackStubProxy + 89;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) onExtraCallback(234058983, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -234058972, iOnWarmupCompleted);
        int i4 = ICustomTabsCallback + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    public static /* synthetic */ TdsListRowV1View asInterface(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(autoSavingBoxAdjustSavingLevelActivity);
        }
        extraCallback(autoSavingBoxAdjustSavingLevelActivity);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i | i5;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i;
        int i12 = i10 | (~(i11 | i6));
        int i13 = ~(i9 | i);
        int i14 = i12 | i13;
        int i15 = (~(i6 | i11 | i5)) | i13;
        int i16 = i + i5 + i2 + (1881146393 * i3) + ((-1035018111) * i4);
        int i17 = i16 * i16;
        int i18 = ((i * (-1924067824)) - 304087040) + ((-1924067824) * i5) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i2) + (1612709888 * i3) + ((-182452224) * i4) + ((-1611137024) * i17);
        int i19 = (i * (-928100048)) + 945860906 + (i5 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i2 * (-928100237)) + (i3 * (-1331189957)) + (i4 * 1329932787) + (i17 * 1550319616);
        switch (i18 + (i19 * i19 * 1690828800)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
                int i20 = 2 % 2;
                int i21 = ICustomTabsCallback + 81;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                BaseActivity.IAuthTabCallback(autoSavingBoxAdjustSavingLevelActivity, (String) null, false, 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i23 = IAuthTabCallbackStubProxy + 53;
                ICustomTabsCallback = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            default:
                AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity2 = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
                int i25 = 2 % 2;
                int i26 = ICustomTabsCallback + 31;
                IAuthTabCallbackStubProxy = i26 % 128;
                int i27 = i26 % 2;
                autoSavingBoxAdjustSavingLevelActivity2.bo_();
                int i28 = ICustomTabsCallback + 85;
                IAuthTabCallbackStubProxy = i28 % 128;
                int i29 = i28 % 2;
                return null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(setUseDecodeBufferHelper setusedecodebufferhelper, Long l, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(setusedecodebufferhelper, l, setDetectableSize);
        }
        IAuthTabCallback(setusedecodebufferhelper, l, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(autoSavingBoxAdjustSavingLevelActivity, th);
        int i4 = ICustomTabsCallback + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(autoSavingBoxAdjustSavingLevelActivity);
        }
        access000(autoSavingBoxAdjustSavingLevelActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(autoSavingBoxAdjustSavingLevelActivity);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = ICustomTabsCallback + 97;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper setusedecodebufferhelper, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(autoSavingBoxAdjustSavingLevelActivity, setusedecodebufferhelper, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallbackStubProxy + 97;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, DialogInterface dialogInterface) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(autoSavingBoxAdjustSavingLevelActivity, dialogInterface);
        int i4 = IAuthTabCallbackStubProxy + 105;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(-1567663340, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, deserializeurinullablecollection}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567663347, iOnWarmupCompleted);
        int i4 = IAuthTabCallbackStubProxy + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(autoSavingBoxAdjustSavingLevelActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 113;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {autoSavingBoxAdjustSavingLevelActivity};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(-1287973040, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1287973050, iOnWarmupCompleted);
        int i4 = ICustomTabsCallback + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(autoSavingBoxAdjustSavingLevelActivity);
        int i4 = ICustomTabsCallback + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, getSizeInBytes getsizeinbytes) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(autoSavingBoxAdjustSavingLevelActivity, getsizeinbytes);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(autoSavingBoxAdjustSavingLevelActivity, getsizeinbytes);
        int i3 = IAuthTabCallbackStubProxy + 29;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = ICustomTabsCallback + 101;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    private final TdsListRowV1View validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.asBinder.getValue();
        int i4 = ICustomTabsCallback + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return tdsListRowV1View;
    }

    private static final TdsListRowV1View access000(final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = R.id.saving_mode_heavy_row;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, 58 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) onExtraCallback(1515160280, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, Integer.valueOf(i2), ((String) objArr[0]).intern(), setUseDecodeBufferHelper.HIGH, new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda22
            public final Object invoke() {
                return AutoSavingBoxAdjustSavingLevelActivity.onTransact(this.f$0);
            }
        }}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1515160277, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = ICustomTabsCallback + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsListRowV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper.HIGH}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStubProxy + 77;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper.HIGH}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private final TdsListRowV1View ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.access100.getValue();
        if (i3 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = R.id.saving_mode_normal_row;
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 179, (ViewConfiguration.getTouchSlop() >> 8) + 58, (char) (38449 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr2);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) onExtraCallback(1515160280, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, Integer.valueOf(i2), ((String) objArr2[0]).intern(), setUseDecodeBufferHelper.NORMAL, new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda21
            public final Object invoke() {
                return AutoSavingBoxAdjustSavingLevelActivity.onWarmupCompleted(this.f$0);
            }
        }}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1515160277, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = IAuthTabCallbackStubProxy + 85;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return tdsListRowV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit extraCallbackWithResult(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper.NORMAL}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 89;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final TdsListRowV1View access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.getInterfaceDescriptor.getValue();
        int i4 = IAuthTabCallbackStubProxy + 67;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return tdsListRowV1View;
    }

    private static final TdsListRowV1View extraCallback(final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = R.id.saving_mode_light_row;
        Object[] objArr = new Object[1];
        a(169 - AndroidCharacter.getMirror('0'), 58 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (47721 - ImageFormat.getBitsPerPixel(0)), objArr);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) onExtraCallback(1515160280, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, Integer.valueOf(i2), ((String) objArr[0]).intern(), setUseDecodeBufferHelper.LOW, new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda9
            public final Object invoke() {
                return AutoSavingBoxAdjustSavingLevelActivity.onExtraCallbackWithResult(this.f$0);
            }
        }}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1515160277, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = IAuthTabCallbackStubProxy + 25;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return tdsListRowV1View;
    }

    private static final Unit readTypedObject(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper.LOW}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            unit = Unit.INSTANCE;
            int i3 = 38 / 0;
        } else {
            onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper.LOW}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallback + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsListRowV1View updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStubProxy + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return tdsListRowV1View;
    }

    private static final TdsListRowV1View IAuthTabCallbackStubProxy(final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = R.id.saving_mode_custom_row;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getPressedStateDuration() >> 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 59, (char) KeyEvent.getDeadChar(0, 0), objArr);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) onExtraCallback(1515160280, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, Integer.valueOf(i2), ((String) objArr[0]).intern(), setUseDecodeBufferHelper.CUSTOM, new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda0
            public final Object invoke() {
                return AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStub(this.f$0);
            }
        }}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1515160277, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = IAuthTabCallbackStubProxy + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return tdsListRowV1View;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        autoSavingBoxAdjustSavingLevelActivity.ICustomTabsServiceStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final TdsTextButtonV0View ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsTextButtonV0View tdsTextButtonV0View = (TdsTextButtonV0View) this.asInterface.getValue();
        int i4 = ICustomTabsCallback + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTextButtonV0View;
        }
        throw null;
    }

    private static final TdsTextButtonV0View getInterfaceDescriptor(final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int i = 2 % 2;
        TdsTextButtonV0View tdsTextButtonV0ViewFindViewById = autoSavingBoxAdjustSavingLevelActivity.findViewById(R.id.custom_amount_button);
        Intrinsics.checkNotNull(tdsTextButtonV0ViewFindViewById);
        tdsTextButtonV0ViewFindViewById.setVisibility(8);
        tdsTextButtonV0ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoSavingBoxAdjustSavingLevelActivity.onNavigationEvent(this.f$0, view);
            }
        });
        int i2 = IAuthTabCallbackStubProxy + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return tdsTextButtonV0ViewFindViewById;
    }

    private static final void onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallback(1251159950, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1251159944, iOnWarmupCompleted);
        } else {
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallback(1251159950, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1251159944, iOnWarmupCompleted2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        final setUseDecodeBufferHelper setusedecodebufferhelper = (setUseDecodeBufferHelper) objArr[3];
        final Function0 function0 = (Function0) objArr[4];
        int i = 2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = autoSavingBoxAdjustSavingLevelActivity.findViewById(iIntValue);
        TdsListRowV1View tdsListRowV1View = tdsListRowV1ViewFindViewById;
        tdsListRowV1View.setLeftImage(str);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            int i2 = ICustomTabsCallback + 59;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            } else {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            }
            int i3 = IAuthTabCallbackStubProxy + 39;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallback(function0, setusedecodebufferhelper, view);
            }
        });
        View viewFindViewById = tdsListRowV1View.findViewById(R.id.clickView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1ViewFindViewById, "");
        return tdsListRowV1View;
    }

    private static final Unit onExtraCallbackWithResult(setUseDecodeBufferHelper setusedecodebufferhelper, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(117 - TextUtils.indexOf("", ""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 26783), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), setusedecodebufferhelper.toLogValue());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(Function0 function0, final setUseDecodeBufferHelper setusedecodebufferhelper, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1008565L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallback(setusedecodebufferhelper, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        function0.invoke();
        int i2 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final setUseDecodeBufferHelper ICustomTabsServiceStub() {
        drawProgress<decodeDimensions> drawprogressOnExtraCallback;
        setUseDecodeBufferHelper setusedecodebufferhelperOnTransact;
        int i = 2 % 2;
        BEROctetStringParser bEROctetStringParserOnExtraCallback = BEROctetStringParser.Companion.onExtraCallback();
        if (bEROctetStringParserOnExtraCallback != null && (drawprogressOnExtraCallback = bEROctetStringParserOnExtraCallback.onExtraCallback()) != null) {
            int i2 = ICustomTabsCallback + 77;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            decodeDimensions decodedimensions = (decodeDimensions) drawprogressOnExtraCallback.onExtraCallback();
            if (decodedimensions != null) {
                int i4 = ICustomTabsCallback + 33;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    decodedimensions.onWarmupCompleted();
                    throw null;
                }
                BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted();
                if (bitmapUtilWhenMappingsOnWarmupCompleted != null && (setusedecodebufferhelperOnTransact = bitmapUtilWhenMappingsOnWarmupCompleted.onTransact()) != null) {
                    int i5 = IAuthTabCallbackStubProxy + 123;
                    ICustomTabsCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return setusedecodebufferhelperOnTransact;
                }
            }
        }
        return setUseDecodeBufferHelper.LOW;
    }

    private final Long setEngagementSignalsCallback() {
        drawProgress<decodeDimensions> drawprogressOnExtraCallback;
        decodeDimensions decodedimensions;
        BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted;
        int i = 2 % 2;
        BEROctetStringParser bEROctetStringParserOnExtraCallback = BEROctetStringParser.Companion.onExtraCallback();
        if (bEROctetStringParserOnExtraCallback == null || (drawprogressOnExtraCallback = bEROctetStringParserOnExtraCallback.onExtraCallback()) == null || (decodedimensions = (decodeDimensions) drawprogressOnExtraCallback.onExtraCallback()) == null || (bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted()) == null) {
            int i2 = ICustomTabsCallback + 121;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Long lOnExtraCallbackWithResult = bitmapUtilWhenMappingsOnWarmupCompleted.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(access000[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 59697), 17 - TextUtils.indexOf("", "", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 46134), (-16777185) - Color.rgb(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49123), TextUtils.getOffsetAfter("", 0) + 44, 1494 - Color.alpha(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 85;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49123), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 1495, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            autoSavingBoxAdjustSavingLevelActivity.writeTypedList();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        autoSavingBoxAdjustSavingLevelActivity.writeTypedList();
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.savingbox_adjust_saving_level);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = ICustomTabsCallback + 31;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onExtraCallbackWithResult("");
            supportActionBar.onNavigationEvent(true);
        }
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, ICustomTabsServiceStub()}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        onExtraCallbackWithResult(setEngagementSignalsCallback());
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = findViewById(R.id.fixed_bottom_cta);
        Intrinsics.checkNotNull(tdsBottomCtaV1ViewFindViewById);
        String string = getString(R.string.app_account_savingbox___ff50762346);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewFindViewById, string, new AutoSavingBoxAdjustSavingLevelActivity$.ExternalSyntheticLambda14(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1008563L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        int i4 = ICustomTabsCallback + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) + 117, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26782), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "N");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008577L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.onNavigationEvent((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((Process.myTid() >> 22) + 117, (ViewConfiguration.getEdgeSlop() >> 16) + 4, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26783), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "Y");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, DialogInterface dialogInterface) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008577L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.onWarmupCompleted((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        autoSavingBoxAdjustSavingLevelActivity.onSessionEnded();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper setusedecodebufferhelper, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int i2 = R.string.app_account_savingbox___16fbd1daa5;
        String shortText = setusedecodebufferhelper.toShortText();
        Object[] objArr = {DERSet.onExtraCallback.validateRelationship(), ParamImpl.EMPTY, null, 2, null};
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(autoSavingBoxAdjustSavingLevelActivity.getString(i2, shortText, (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 929961739, nSetPosition.onExtraCallbackWithResult(), -929961737, objArr)));
        String string = autoSavingBoxAdjustSavingLevelActivity.getString(R.string.do_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallback((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = autoSavingBoxAdjustSavingLevelActivity.getString(R.string.app_account_savingbox___b99530c023);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr3, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedList() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setUseDecodeBufferHelper setusedecodebufferhelperICustomTabsServiceStub = ICustomTabsServiceStub();
        final setUseDecodeBufferHelper setusedecodebufferhelperOnNavigationEvent = onNavigationEvent();
        setUseDecodeBufferHelper setusedecodebufferhelper = setUseDecodeBufferHelper.CUSTOM;
        if (setusedecodebufferhelperICustomTabsServiceStub == setusedecodebufferhelper) {
            int i4 = IAuthTabCallbackStubProxy + 95;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            if (setusedecodebufferhelperOnNavigationEvent != setusedecodebufferhelper) {
                ConvertByteArrayToFloatArray.onExtraCallback(1008575L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj) {
                        return AutoSavingBoxAdjustSavingLevelActivity.onExtraCallbackWithResult(this.f$0, setusedecodebufferhelperOnNavigationEvent, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                int i6 = ICustomTabsCallback + 27;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        onSessionEnded();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r2 == o.setUseDecodeBufferHelper.CUSTOM) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onSessionEnded() throws kotlin.NoWhenBranchMatchedException {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            o.setUseDecodeBufferHelper r1 = r10.ICustomTabsServiceStub()
            o.setUseDecodeBufferHelper r2 = r10.onNavigationEvent()
            java.lang.Long r3 = r10.setEngagementSignalsCallback()
            java.lang.Long r4 = r10.IAuthTabCallbackDefault
            if (r4 != 0) goto L20
            int r4 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback
            int r4 = r4 + 9
            int r5 = r4 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy = r5
            int r4 = r4 % r0
            java.lang.Long r4 = r10.setEngagementSignalsCallback()
        L20:
            r5 = 4
            r6 = 3
            r7 = 1
            if (r1 == r2) goto L27
            r1 = r7
            goto L34
        L27:
            int r1 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + r6
            int r8 = r1 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L33
            int r1 = r5 % 5
        L33:
            r1 = 0
        L34:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r4 = 0
            if (r1 != 0) goto L5a
            int r1 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback
            int r8 = r1 + 77
            int r9 = r8 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L59
            if (r3 == 0) goto L49
            goto L55
        L49:
            int r1 = r1 + 55
            int r3 = r1 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy = r3
            int r1 = r1 % r0
            o.setUseDecodeBufferHelper r1 = o.setUseDecodeBufferHelper.CUSTOM
            if (r2 != r1) goto L55
            goto L5a
        L55:
            r10.finish()
            return
        L59:
            throw r4
        L5a:
            o.setUseDecodeBufferHelper r1 = r10.onNavigationEvent()
            int[] r2 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.onWarmupCompleted.onExtraCallback
            int r3 = r1.ordinal()
            r2 = r2[r3]
            if (r2 == r7) goto La2
            if (r2 == r0) goto La2
            int r3 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy
            int r3 = r3 + 67
            int r7 = r3 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L78
            if (r2 == r0) goto La2
            goto L7a
        L78:
            if (r2 == r6) goto La2
        L7a:
            if (r2 != r5) goto L9c
            java.lang.Long r0 = r10.IAuthTabCallbackDefault
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r1, r0}
            int r8 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted()
            int r3 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted()
            int r5 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted()
            int r6 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted()
            r2 = -1031520673(0xffffffffc2843e5f, float:-66.12182)
            r7 = 1031520681(0x3d7bc1a9, float:0.061463986)
            onExtraCallback(r2, r3, r4, r5, r6, r7, r8)
            return
        L9c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        La2:
            onExtraCallback(r10, r1, r4, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.onSessionEnded():void");
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (setEngagementSignalsCallback() == null) {
                int i3 = IAuthTabCallbackStubProxy + 85;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (this.IAuthTabCallbackDefault == null) {
                    int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                    onExtraCallback(1251159950, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1251159944, iOnWarmupCompleted);
                    int i4 = IAuthTabCallbackStubProxy + 109;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            }
            onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, setUseDecodeBufferHelper.CUSTOM}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i6 = ICustomTabsCallback + 1;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        setEngagementSignalsCallback();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Intent intentOnExtraCallback;
        int i;
        ComponentActivity componentActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 1;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Long engagementSignalsCallback = ((AutoSavingBoxAdjustSavingLevelActivity) componentActivity).IAuthTabCallbackDefault;
        if (engagementSignalsCallback == null) {
            if (componentActivity.setEngagementSignalsCallback() != null) {
                int i5 = IAuthTabCallbackStubProxy + 109;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                engagementSignalsCallback = componentActivity.setEngagementSignalsCallback();
            } else {
                engagementSignalsCallback = 0L;
            }
        }
        if (engagementSignalsCallback == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i7 = ICustomTabsCallback + 11;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            intentOnExtraCallback = AutoSavingBoxCustomAmountActivity.Companion.onExtraCallback(componentActivity, engagementSignalsCallback.longValue());
            i = 11385;
        } else {
            intentOnExtraCallback = AutoSavingBoxCustomAmountActivity.Companion.onExtraCallback(componentActivity, engagementSignalsCallback.longValue());
            i = 8308;
        }
        componentActivity.startActivityForResult(intentOnExtraCallback, i);
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        setUseDecodeBufferHelper setusedecodebufferhelper = (setUseDecodeBufferHelper) objArr[1];
        int i = 2 % 2;
        TdsListRowV1View tdsListRowV1ViewValidateRelationship = autoSavingBoxAdjustSavingLevelActivity.validateRelationship();
        if (setusedecodebufferhelper == setUseDecodeBufferHelper.HIGH) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        tdsListRowV1ViewValidateRelationship.setRightCheckBoxChecked(z);
        autoSavingBoxAdjustSavingLevelActivity.ICustomTabsService_Parcel().setRightCheckBoxChecked(setusedecodebufferhelper == setUseDecodeBufferHelper.NORMAL);
        TdsListRowV1View tdsListRowV1ViewAccess200 = autoSavingBoxAdjustSavingLevelActivity.access200();
        if (setusedecodebufferhelper == setUseDecodeBufferHelper.LOW) {
            int i4 = ICustomTabsCallback;
            int i5 = i4 + 99;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 101;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        tdsListRowV1ViewAccess200.setRightCheckBoxChecked(z2);
        TdsListRowV1View tdsListRowV1ViewUpdateVisuals = autoSavingBoxAdjustSavingLevelActivity.updateVisuals();
        if (setusedecodebufferhelper == setUseDecodeBufferHelper.CUSTOM) {
            int i9 = ICustomTabsCallback + 79;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            z3 = true;
        }
        tdsListRowV1ViewUpdateVisuals.setRightCheckBoxChecked(z3);
        return null;
    }

    private final setUseDecodeBufferHelper onNavigationEvent() {
        int i = 2 % 2;
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = validateRelationship().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null && tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked()) {
            setUseDecodeBufferHelper setusedecodebufferhelper = setUseDecodeBufferHelper.HIGH;
            int i2 = IAuthTabCallbackStubProxy + 103;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return setusedecodebufferhelper;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = ICustomTabsService_Parcel().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            int i3 = IAuthTabCallbackStubProxy + 113;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.isChecked()) {
                int i5 = IAuthTabCallbackStubProxy + 87;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                return setUseDecodeBufferHelper.NORMAL;
            }
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 = access200().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 != null && tdsCheckBoxV2ViewPrefetchWithMultipleUrls3.isChecked()) {
            int i7 = IAuthTabCallbackStubProxy + 15;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return setUseDecodeBufferHelper.LOW;
            }
            int i8 = 63 / 0;
            return setUseDecodeBufferHelper.LOW;
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls4 = updateVisuals().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls4 != null) {
            int i9 = ICustomTabsCallback + 121;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 == 0 ? tdsCheckBoxV2ViewPrefetchWithMultipleUrls4.isChecked() : tdsCheckBoxV2ViewPrefetchWithMultipleUrls4.isChecked()) {
                return setUseDecodeBufferHelper.CUSTOM;
            }
        }
        throw new IllegalStateException("should not happen");
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        Object obj = null;
        if (i != 8308 || i2 != -1) {
            if (i == 8308) {
                int i6 = IAuthTabCallbackStubProxy + 107;
                ICustomTabsCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, ICustomTabsServiceStub()}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                    obj.hashCode();
                    throw null;
                }
                onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, ICustomTabsServiceStub()}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            }
            int i7 = ICustomTabsCallback + 113;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 87 / 0;
                return;
            }
            return;
        }
        int i9 = IAuthTabCallbackStubProxy;
        int i10 = i9 + 89;
        ICustomTabsCallback = i10 % 128;
        if (i10 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long longExtra = -1;
        if (intent != null) {
            int i11 = i9 + 69;
            ICustomTabsCallback = i11 % 128;
            if (i11 % 2 == 0) {
                intent.getLongExtra("newAmount", -1L);
                throw null;
            }
            longExtra = intent.getLongExtra("newAmount", -1L);
        }
        this.IAuthTabCallbackDefault = Long.valueOf(longExtra);
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, setUseDecodeBufferHelper.CUSTOM}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
    }

    static /* synthetic */ void onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, setUseDecodeBufferHelper setusedecodebufferhelper, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            l = null;
        }
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-1031520673, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, setusedecodebufferhelper, l}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1031520681, iOnWarmupCompleted);
        int i4 = ICustomTabsCallback + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(setUseDecodeBufferHelper setusedecodebufferhelper, Long l, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(117 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 4, (char) (26782 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), setusedecodebufferhelper.toLogValue());
        Object obj = l;
        if (l == null) {
            int i4 = IAuthTabCallbackStubProxy + 93;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            obj = "NULL";
        }
        setDetectableSize.onExtraCallback("custom_amt", obj);
        return Unit.INSTANCE;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        writeRaw writerawOnWarmupCompleted;
        final AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity = (AutoSavingBoxAdjustSavingLevelActivity) objArr[0];
        final setUseDecodeBufferHelper setusedecodebufferhelper = (setUseDecodeBufferHelper) objArr[1];
        final Long l = (Long) objArr[2];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1008567L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return AutoSavingBoxAdjustSavingLevelActivity.onExtraCallback(setusedecodebufferhelper, l, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        BEROctetStringParser bEROctetStringParserOnExtraCallback = BEROctetStringParser.Companion.onExtraCallback();
        if (bEROctetStringParserOnExtraCallback != null) {
            int i2 = IAuthTabCallbackStubProxy + 113;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                bEROctetStringParserOnExtraCallback.onExtraCallbackWithResult(setusedecodebufferhelper, l);
                throw null;
            }
            writeRaw<getSizeInBytes> writerawOnExtraCallbackWithResult = bEROctetStringParserOnExtraCallback.onExtraCallbackWithResult(setusedecodebufferhelper, l);
            if (writerawOnExtraCallbackWithResult != null) {
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda16
                    public final Object invoke(Object obj) {
                        return AutoSavingBoxAdjustSavingLevelActivity.onNavigationEvent(this.f$0, (deserializeUriNullableCollection) obj);
                    }
                };
                writeRaw writerawOnExtraCallback = writerawOnExtraCallbackWithResult.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda17
                    public final void accept(Object obj) {
                        AutoSavingBoxAdjustSavingLevelActivity.onWarmupCompleted(function1, obj);
                    }
                });
                if (writerawOnExtraCallback != null && (writerawOnWarmupCompleted = writerawOnExtraCallback.onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda18
                    public final void run() {
                        AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallback(this.f$0);
                    }
                })) != null) {
                    setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda19
                        public final Object invoke(Object obj) {
                            return AutoSavingBoxAdjustSavingLevelActivity.onExtraCallback(this.f$0, (Throwable) obj);
                        }
                    }, new Function1() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity$$ExternalSyntheticLambda20
                        public final Object invoke(Object obj) {
                            return AutoSavingBoxAdjustSavingLevelActivity.onWarmupCompleted(this.f$0, (getSizeInBytes) obj);
                        }
                    });
                    int i3 = ICustomTabsCallback + 121;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, getSizeInBytes getsizeinbytes) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        autoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackDefault = null;
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, autoSavingBoxAdjustSavingLevelActivity.ICustomTabsServiceStub()}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        autoSavingBoxAdjustSavingLevelActivity.onExtraCallbackWithResult(autoSavingBoxAdjustSavingLevelActivity.setEngagementSignalsCallback());
        autoSavingBoxAdjustSavingLevelActivity.setResult(-1);
        autoSavingBoxAdjustSavingLevelActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            boolean z = th instanceof TossApiCallException.ApiError;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof TossApiCallException.ApiError) {
            getParamImp.onWarmupCompleted(th, autoSavingBoxAdjustSavingLevelActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            int i3 = ICustomTabsCallback + 73;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        } else {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AutoSavingBoxAdjustSavingLevelActivity", th);
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) AutoSavingBoxAdjustSavingLevelActivity.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        ICustomTabsServiceDefault().setText(getString(viva.republica.toss.R.string.app_account_savingbox___a2073caebc, o.getLongName.onNavigationEvent(r8.longValue(), (o.ParamImpl) null, 1, (java.lang.Object) null)));
        r8 = ICustomTabsServiceDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        r8.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r8 = ICustomTabsServiceDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        r8.setVisibility(8);
        r8 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback + 33;
        viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r8 % 2) != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(java.lang.Long r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L18
            r1 = 18
            int r1 = r1 / r3
            if (r8 != 0) goto L36
            goto L1a
        L18:
            if (r8 != 0) goto L36
        L1a:
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r8 = r7.ICustomTabsServiceDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r1 = 8
            r8.setVisibility(r1)
            int r8 = viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.ICustomTabsCallback
            int r8 = r8 + 33
            int r1 = r8 % 128
            viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.IAuthTabCallbackStubProxy = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L32
            return
        L32:
            r4.hashCode()
            throw r4
        L36:
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r0 = r7.ICustomTabsServiceDefault()
            int r1 = viva.republica.toss.R.string.app_account_savingbox___a2073caebc
            long r5 = r8.longValue()
            r8 = 1
            java.lang.String r8 = o.getLongName.onNavigationEvent(r5, r4, r8, r4)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r7.getString(r1, r8)
            r0.setText(r8)
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r8 = r7.ICustomTabsServiceDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r8.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.AutoSavingBoxAdjustSavingLevelActivity.onExtraCallbackWithResult(java.lang.Long):void");
    }

    public static /* synthetic */ TdsTextButtonV0View onNavigationEvent(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (TdsTextButtonV0View) onExtraCallback(-221920023, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 221920025, iOnWarmupCompleted);
    }

    public static /* synthetic */ TdsListRowV1View onExtraCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (TdsListRowV1View) onExtraCallback(637458916, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -637458915, iOnWarmupCompleted);
    }

    public static /* synthetic */ TdsListRowV1View asBinder(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (TdsListRowV1View) onExtraCallback(409528993, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -409528981, iOnWarmupCompleted);
    }

    private static final Unit access100(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(-1685842317, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1685842322, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallback_Parcel(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(-1287973040, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1287973050, iOnWarmupCompleted);
    }

    private final TdsListRowV1View onNavigationEvent(int i, String str, setUseDecodeBufferHelper setusedecodebufferhelper, Function0<Unit> function0) {
        return (TdsListRowV1View) onExtraCallback(1515160280, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, Integer.valueOf(i), str, setusedecodebufferhelper, function0}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1515160277, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final TdsListRowV1View ICustomTabsCallback(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (TdsListRowV1View) onExtraCallback(234058983, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -234058972, iOnWarmupCompleted);
    }

    private final void IEngagementSignalsCallback() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(1251159950, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1251159944, iOnWarmupCompleted);
    }

    private static final Unit onWarmupCompleted(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, View view) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(843308393, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, view}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -843308384, iOnWarmupCompleted);
    }

    private final void onExtraCallback(setUseDecodeBufferHelper setusedecodebufferhelper, Long l) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-1031520673, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, setusedecodebufferhelper, l}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1031520681, iOnWarmupCompleted);
    }

    private static final Unit onExtraCallbackWithResult(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(-1567663340, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity, deserializeurinullablecollection}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567663347, iOnWarmupCompleted);
    }

    private static final void writeTypedObject(AutoSavingBoxAdjustSavingLevelActivity autoSavingBoxAdjustSavingLevelActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-673490273, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{autoSavingBoxAdjustSavingLevelActivity}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 673490273, iOnWarmupCompleted);
    }

    private final void IAuthTabCallback(setUseDecodeBufferHelper setusedecodebufferhelper) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-415557483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, setusedecodebufferhelper}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 415557487, iOnWarmupCompleted);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 55;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        access000 = new char[]{60860, 60134, 58156, 63606, 61631, 51632, 50783, 57105, 55191, 44246, 42249, 48546, 47861, 45881, 34862, 32954, 39387, 38401, 28491, 26568, 31941, 29959, 19967, 19199, 17207, 22641, 20653, 10690, 9743, 16149, 14210, 3291, 1392, 7605, 6909, 4914, 59493, 57508, 63959, 63057, 53069, 51087, 56527, 54587, 44469, 43769, 41775, 47200, 45273, 35281, 34317, 40789, 38808, 27845, 25981, 32240, 31476, 29484, 18543, 60860, 60134, 58156, 63606, 61631, 51632, 50783, 57105, 55191, 44246, 42249, 48546, 47861, 45881, 34862, 32954, 39387, 38401, 28491, 26568, 31941, 29959, 19967, 19199, 17207, 22641, 20653, 10690, 9743, 16149, 14210, 3291, 1392, 7605, 6909, 4914, 59493, 57508, 63959, 63057, 53069, 51087, 56527, 54587, 44469, 43769, 41775, 47200, 45273, 35284, 34321, 40788, 38793, 27803, 25918, 32174, 31466, 29477, 34111, 33396, 35767, 37116, 22486, 20620, 22854, 16924, 19157, 29658, 31797, 25979, 28157, 5820, 8035, 1992, 159, 2387, 12868, 15056, 9137, 11371, 54561, 56738, 50863, 53101, 63381, 61589, 63837, 57883, 60103, 37800, 40037, 34175, 36328, 46769, 48922, 42975, 41111, 43352, 21007, 23246, 17341, 19515, 29991, 32229, 26277, 28497, 6111, 4243, 6469, 522, 2739, 13246, 15483, 9534, 11747, 55027, 57172, 51140, 49280, 51535, 31629, 31959, 29981, 28231, 26254, 24449, 20590, 18720, 16806, 15079, 13112, 11155, 11460, 9480, 7711, 5771, 4074, '0', 63866, 61945, 60148, 58166, 56270, 56526, 54534, 52800, 50844, 49139, 45118, 43300, 41395, 39658, 37697, 35716, 36044, 34051, 32340, 30357, 28646, 24672, 22908, 20926, 19198, 17162, 15236, 15560, 13598, 11857, 9960, 8165, 4128, 2405, 440, 64169, 62223, 60319, 60635, 58644};
        IAuthTabCallback_Parcel = 260247469446589074L;
    }
}
