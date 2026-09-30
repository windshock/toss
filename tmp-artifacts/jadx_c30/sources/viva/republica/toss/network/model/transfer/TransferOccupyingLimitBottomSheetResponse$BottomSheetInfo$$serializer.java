package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferOccupyingLimitBottomSheetResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer implements aeu2<TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    public static final TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer transferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer = new TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer();
        INSTANCE = transferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo", transferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer, 4);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO}, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("shareTransfers", true);
        setanimationsloop.onWarmupCompleted("prepaidAccounts", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 67;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, lazyArrOnWarmupCompleted[2].getValue(), lazyArrOnWarmupCompleted[3].getValue()};
        int i4 = IAuthTabCallbackStub + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo bottomSheetInfoM105deserialize = m105deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bottomSheetInfoM105deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo m105deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo.onWarmupCompleted();
        List list3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallbackStub + 51;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), (Object) null);
            str2 = strAsInterface;
            str = strAsInterface2;
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            List list4 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = asInterface + 117;
                    int i7 = i6 % 128;
                    IAuthTabCallbackStub = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        int i9 = i7 + 25;
                        asInterface = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), list4);
                        i5 |= 8;
                    } else {
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list3);
                        i5 |= 4;
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                }
            }
            i = i5;
            list = list3;
            list2 = list4;
            str = strAsInterface3;
            str2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo(i, str2, str, list, list2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo bottomSheetInfo) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(bottomSheetInfo, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo.onWarmupCompleted(bottomSheetInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bottomSheetInfo, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo.onWarmupCompleted(bottomSheetInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 97;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20952 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 74, View.combineMeasuredStates(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i7 = 1052772399;
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 15, Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i7 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.resolveSize(0, 0) + 63, 12214 - Color.red(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{32636, 32583, 32580, 32579, 32637, 32627, 32590};
        onExtraCallback = -1184333848;
        onExtraCallbackWithResult = true;
        onWarmupCompleted = true;
    }
}
