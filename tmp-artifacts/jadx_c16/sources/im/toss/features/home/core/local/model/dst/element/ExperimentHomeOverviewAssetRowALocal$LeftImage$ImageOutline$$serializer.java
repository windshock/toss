package im.toss.features.home.core.local.model.dst.element;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline> {
    private static int IAuthTabCallback;
    public static final ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {68, -59, -116, 119};
    private static final int $$b = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    private static String $$c(short s, byte b, int i) {
        int i2 = s * 2;
        byte[] bArr = $$a;
        int i3 = (b * 3) + 4;
        int i4 = i + 109;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
            i3++;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallback();
        ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer experimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer = new ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline", experimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer, 2);
        Object[] objArr = new Object[1];
        a((char) (33638 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 2015540168 - TextUtils.indexOf("", ""), new char[]{24839, 38546, 4298, 17775, 9441}, new char[]{0, 0, 0, 0}, new char[]{51242, 8883, 26232, 4483}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("color", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE)};
        int i4 = asBinder + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        ColorAttributeLocal colorAttributeLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            String str2 = null;
            ColorAttributeLocal colorAttributeLocal2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = asBinder;
                    int i5 = i4 + 59;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i3 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i4 + 121;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            str = str2;
            colorAttributeLocal = colorAttributeLocal2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline(i, str, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m370deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline imageOutline) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(imageOutline, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline.onExtraCallback(imageOutline, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageOutline, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline.onExtraCallback(imageOutline, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackStub + 125;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline) obj);
        int i4 = asBinder + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 43;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int deadChar = 43 - KeyEvent.getDeadChar(i3, i3);
                    int threadPriority = ((Process.getThreadPriority(i3) + 20) >> 6) + 1451;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, deadChar, threadPriority, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 45;
                    int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493;
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, bitsPerPixel, i6, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)) + 23972);
                    int packedPositionType = 50 - ExpandableListView.getPackedPositionType(0L);
                    int maxKeyCode = 22939 - (KeyEvent.getMaxKeyCode() >> 16);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionType, maxKeyCode, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i8);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cMyTid = (char) (45848 - (Process.myTid() >> 22));
                    int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28;
                    int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12576;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, i9, i10, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i11 = $10 + 23;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 % 5;
                }
                i3 = 0;
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

    static void onExtraCallback() {
        onExtraCallback = 7798559133331975163L;
        onWarmupCompleted = -1776194565;
        onNavigationEvent = (char) 11783;
    }
}
