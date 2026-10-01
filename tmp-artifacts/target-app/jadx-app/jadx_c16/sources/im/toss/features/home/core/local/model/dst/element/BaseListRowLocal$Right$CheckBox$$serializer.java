package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Right$CheckBox$$serializer implements aeu2<BaseListRowLocal.Right.CheckBox> {
    private static char IAuthTabCallback;
    public static final BaseListRowLocal$Right$CheckBox$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {50, -82, -81, 124};
    private static final int $$b = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = s2 * 3;
        int i4 = i + 109;
        int i5 = (s * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = i5 + i7;
            int i11 = i9 + 1;
            i2 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i12 = i4;
            i9 = i5;
            i5 = i12;
            int i102 = i5 + i7;
            int i112 = i9 + 1;
            i2 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return serialDescriptor;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 53;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i5) + 1);
                    int iNormalizeMetaState = 43 - KeyEvent.normalizeMetaState(i5);
                    int i10 = (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 1452;
                    byte b = (byte) i5;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, iNormalizeMetaState, i10, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49123), 44 - KeyEvent.keyCodeFromString(""), 1494 - Color.argb(i5, i5, i5, i5), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23971), Drawable.resolveOpacity(0, 0) + 50, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45848), KeyEvent.keyCodeFromString("") + 29, 12577 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
                i5 = 0;
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

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        BaseListRowLocal$Right$CheckBox$$serializer baseListRowLocal$Right$CheckBox$$serializer = new BaseListRowLocal$Right$CheckBox$$serializer();
        INSTANCE = baseListRowLocal$Right$CheckBox$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Right.CheckBox", baseListRowLocal$Right$CheckBox$$serializer, 5);
        Object[] objArr = new Object[1];
        a((char) (56458 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-1386850888) - Drawable.resolveOpacity(0, 0), new char[]{13782, 6773, 8716, 51331, 24846}, new char[]{50152, 61717, 36663, 27025}, new char[]{47349, 22101, 35501, 5852}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("checked", false);
        setanimationsloop.onWarmupCompleted("disabled", false);
        setanimationsloop.onWarmupCompleted("checkedHandler", false);
        setanimationsloop.onWarmupCompleted("uncheckedHandler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Right$CheckBox$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal.Right.CheckBox.onExtraCallbackWithResult()[0].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker)};
        int i4 = asInterface + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Right.CheckBox deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        BaseListRowLocal.Right.CheckBox.IAuthTabCallback iAuthTabCallback;
        boolean z;
        int i;
        boolean z2;
        char c;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = BaseListRowLocal.Right.CheckBox.onExtraCallbackWithResult();
        char c2 = 4;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = asInterface + 53;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            BaseListRowLocal.Right.CheckBox.IAuthTabCallback iAuthTabCallback2 = (BaseListRowLocal.Right.CheckBox.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            z2 = zOnExtraCallbackWithResult2;
            iAuthTabCallback = iAuthTabCallback2;
            z = zOnExtraCallbackWithResult;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            handlerLocal2 = handlerLocal3;
            i = 31;
        } else {
            boolean z3 = true;
            BaseListRowLocal.Right.CheckBox.IAuthTabCallback iAuthTabCallback3 = null;
            HandlerLocal handlerLocal4 = null;
            HandlerLocal handlerLocal5 = null;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            int i7 = 0;
            while (z3) {
                int i8 = IAuthTabCallbackDefault + 115;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i10 = asInterface + 91;
                    int i11 = i10 % 128;
                    IAuthTabCallbackDefault = i11;
                    if (i10 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i12 = i11 + 63;
                            int i13 = i12 % 128;
                            asInterface = i13;
                            if (i12 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 3) {
                                c = 4;
                                zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                                i7 |= 4;
                                int i14 = asInterface + 121;
                                IAuthTabCallbackDefault = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i15 = 3 / 5;
                                }
                            } else if (iOnNavigationEvent == 3) {
                                c = 4;
                                handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                                i7 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i16 = i13 + 79;
                                IAuthTabCallbackDefault = i16 % 128;
                                int i17 = i16 % 2;
                                c = 4;
                                handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                                i7 |= 16;
                            }
                        } else {
                            c = 4;
                            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i7 |= 2;
                        }
                        c2 = c;
                    } else {
                        iAuthTabCallback3 = (BaseListRowLocal.Right.CheckBox.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), iAuthTabCallback3);
                        i7 |= 1;
                        c2 = 4;
                    }
                } else {
                    z3 = false;
                    c2 = c2;
                }
            }
            handlerLocal = handlerLocal4;
            handlerLocal2 = handlerLocal5;
            iAuthTabCallback = iAuthTabCallback3;
            z = zOnExtraCallbackWithResult4;
            i = i7;
            z2 = zOnExtraCallbackWithResult3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Right.CheckBox(i, iAuthTabCallback, z, z2, handlerLocal2, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m298deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseListRowLocal.Right.CheckBox checkBoxDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 31;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return checkBoxDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Right.CheckBox checkBox) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(checkBox, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Right.CheckBox.onExtraCallback(checkBox, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(checkBox, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Right.CheckBox.onExtraCallback(checkBox, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Right.CheckBox) obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 55;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 408564233256871955L;
        onNavigationEvent = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
