package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer implements aeu2<DepositTargetRecommendResponse.TransferShareInProgressInfoModel> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer depositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer = new DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer();
        INSTANCE = depositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse.TransferShareInProgressInfoModel", depositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer, 2);
        setanimationsloop.onWarmupCompleted("count", true);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-124, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, Color.alpha(0) + CertificateBody.profileType, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = asBinder + 53;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{getDynamicHeight.onWarmupCompleted, getWriggleLayout.onNavigationEvent};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetRecommendResponse.TransferShareInProgressInfoModel transferShareInProgressInfoModelM91deserialize = m91deserialize(decoder);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return transferShareInProgressInfoModelM91deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DepositTargetRecommendResponse.TransferShareInProgressInfoModel m91deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        int iOnTransact;
        String strAsInterface;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallbackDefault + 91;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            int i5 = onTransact + 9;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i = 3;
        } else {
            String strAsInterface2 = null;
            int i7 = 0;
            int iOnTransact2 = 0;
            boolean z = true;
            while (z) {
                int i8 = IAuthTabCallbackDefault + 15;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onTransact + 53;
                    IAuthTabCallbackDefault = i9 % 128;
                    if (i9 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                    }
                } else {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            i = i7;
            iOnTransact = iOnTransact2;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTargetRecommendResponse.TransferShareInProgressInfoModel(i, iOnTransact, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetRecommendResponse.TransferShareInProgressInfoModel) obj);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetRecommendResponse.TransferShareInProgressInfoModel transferShareInProgressInfoModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferShareInProgressInfoModel, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTargetRecommendResponse.TransferShareInProgressInfoModel.onExtraCallbackWithResult(transferShareInProgressInfoModel, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        char c = '0';
        if (cArr3 != null) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, 0, 0) + 78, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.blue(0) + 75, 16037 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), 64 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 12213 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i8 = $11 + 23;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 17;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 119;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 63, 12213 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 63, 12214 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{32409, 32617, 32620, 32623, 32615};
        onNavigationEvent = -1184334060;
        onExtraCallbackWithResult = true;
        onExtraCallback = true;
    }
}
