package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAdBannerBLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAdBannerBLocal$$serializer implements aeu2<ExperimentHomeOverviewAdBannerBLocal> {
    private static int IAuthTabCallback;
    public static final ExperimentHomeOverviewAdBannerBLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {66, -42, -1, 80};
    private static final int $$b = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + 109;
        byte[] bArr = $$a;
        int i7 = (i3 * 3) + 1;
        int i8 = (i2 * 4) + 4;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i8;
            i6 = i7;
            i5 = 0;
            i8++;
            i6 += -i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i8];
            i8++;
            i6 += -i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        ExperimentHomeOverviewAdBannerBLocal$$serializer experimentHomeOverviewAdBannerBLocal$$serializer = new ExperimentHomeOverviewAdBannerBLocal$$serializer();
        INSTANCE = experimentHomeOverviewAdBannerBLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAdBannerBLocal", experimentHomeOverviewAdBannerBLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        a((char) (35631 - TextUtils.indexOf((CharSequence) "", '0')), 1919942311 - TextUtils.getOffsetBefore("", 0), new char[]{55159, 47890, 34329, 11440, 24110}, new char[]{0, 0, 0, 0}, new char[]{42835, 28670, 12402, 22923}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) - 1694416419, new char[]{21076, 43181, 2206, 44663, 17633, 38518, 57346, 26853, 34384, 61447, 47154}, new char[]{0, 0, 0, 0}, new char[]{56710, 321, 15515, 43465}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("reviewNo", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 117;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAdBannerBLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        ExperimentHomeOverviewAdBannerBLocal$Text$$serializer experimentHomeOverviewAdBannerBLocal$Text$$serializer = ExperimentHomeOverviewAdBannerBLocal$Text$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {removeNextStartHandler.onWarmupCompleted, experimentHomeOverviewAdBannerBLocal$Text$$serializer, experimentHomeOverviewAdBannerBLocal$Text$$serializer, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = asBinder + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAdBannerBLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        HandlerLocal handlerLocal;
        ExperimentHomeOverviewAdBannerBLocal.Text text;
        ImageSourceLocal imageSourceLocal;
        ExperimentHomeOverviewAdBannerBLocal.Text text2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asBinder + 63;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            ExperimentHomeOverviewAdBannerBLocal$Text$$serializer experimentHomeOverviewAdBannerBLocal$Text$$serializer = ExperimentHomeOverviewAdBannerBLocal$Text$$serializer.INSTANCE;
            ExperimentHomeOverviewAdBannerBLocal.Text text3 = (ExperimentHomeOverviewAdBannerBLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeOverviewAdBannerBLocal$Text$$serializer, (Object) null);
            text = (ExperimentHomeOverviewAdBannerBLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, experimentHomeOverviewAdBannerBLocal$Text$$serializer, (Object) null);
            imageSourceLocal = imageSourceLocal2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 31;
            text2 = text3;
        } else {
            int i5 = 0;
            boolean z2 = true;
            HandlerLocal handlerLocal2 = null;
            ExperimentHomeOverviewAdBannerBLocal.Text text4 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            ExperimentHomeOverviewAdBannerBLocal.Text text5 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = IAuthTabCallbackStub + 73;
                    int i7 = i6 % 128;
                    asBinder = i7;
                    if (i6 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                        text5 = (ExperimentHomeOverviewAdBannerBLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAdBannerBLocal$Text$$serializer.INSTANCE, text5);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        text4 = (ExperimentHomeOverviewAdBannerBLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentHomeOverviewAdBannerBLocal$Text$$serializer.INSTANCE, text4);
                        i5 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 8;
                        int i8 = asBinder + 93;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i7 + 109;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i5 |= 16;
                    }
                    z = false;
                } else {
                    imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                    i5 |= 1;
                    z = false;
                }
            }
            i = i5;
            str = str2;
            handlerLocal = handlerLocal2;
            text = text4;
            imageSourceLocal = imageSourceLocal3;
            text2 = text5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAdBannerBLocal(i, imageSourceLocal, text2, text, str, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m352deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAdBannerBLocal experimentHomeOverviewAdBannerBLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 35;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return experimentHomeOverviewAdBannerBLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAdBannerBLocal experimentHomeOverviewAdBannerBLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAdBannerBLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAdBannerBLocal.onExtraCallback(experimentHomeOverviewAdBannerBLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (ExperimentHomeOverviewAdBannerBLocal) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2 = 2;
        int i2 = 2 % 2;
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
            int i3 = $11 + 13;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int keyRepeatDelay = 43 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 1451;
                    byte b = (byte) (-$$a[c2]);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, keyRepeatDelay, trimmedLength, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char threadPriority = (char) (49123 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int packedPositionType = 44 - ExpandableListView.getPackedPositionType(0L);
                    int iCombineMeasuredStates = 1494 - View.combineMeasuredStates(0, 0);
                    byte b3 = (byte) ($$a[2] + 1);
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, packedPositionType, iCombineMeasuredStates, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 50 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45848), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, 12577 - (KeyEvent.getMaxKeyCode() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 119;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                c2 = 2;
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

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 7798559133331975163L;
        IAuthTabCallback = 1133729154;
        onNavigationEvent = (char) 27643;
    }
}
