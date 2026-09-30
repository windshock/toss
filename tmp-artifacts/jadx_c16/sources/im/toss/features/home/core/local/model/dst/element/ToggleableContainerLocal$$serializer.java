package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ToggleableContainerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ToggleableContainerLocal$$serializer implements aeu2<ToggleableContainerLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    public static final ToggleableContainerLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        ToggleableContainerLocal$$serializer toggleableContainerLocal$$serializer = new ToggleableContainerLocal$$serializer();
        INSTANCE = toggleableContainerLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ToggleableContainerLocal", toggleableContainerLocal$$serializer, 6);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 0}, false, new byte[]{1, 0, 0}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 5, 0, 0}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("defaultItem", false);
        setanimationsloop.onWarmupCompleted("toggledItem", false);
        Object[] objArr3 = new Object[1];
        a(new int[]{8, 5, 0, 0}, false, new byte[]{1, 1, 1, 1, 1}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 101;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ToggleableContainerLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = ToggleableContainerLocal.onExtraCallbackWithResult();
        ToggleableContainerLocal$ToggleItem$$serializer toggleableContainerLocal$ToggleItem$$serializer = ToggleableContainerLocal$ToggleItem$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, TextAttributeLocal$.serializer.INSTANCE, sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), toggleableContainerLocal$ToggleItem$$serializer, sp.IAuthTabCallback(toggleableContainerLocal$ToggleItem$$serializer), lazyArrOnExtraCallbackWithResult[5].getValue()};
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ToggleableContainerLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        PaddingLocal paddingLocal;
        ToggleableContainerLocal.onExtraCallbackWithResult onextracallbackwithresult;
        String str;
        ToggleableContainerLocal.ToggleItem toggleItem;
        ToggleableContainerLocal.ToggleItem toggleItem2;
        TextAttributeLocal textAttributeLocal;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        PaddingLocal paddingLocal2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ToggleableContainerLocal.onExtraCallbackWithResult();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = ToggleableContainerLocal.onExtraCallbackWithResult();
        boolean z = true;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, (Object) null);
            ToggleableContainerLocal$ToggleItem$$serializer toggleableContainerLocal$ToggleItem$$serializer = ToggleableContainerLocal$ToggleItem$$serializer.INSTANCE;
            toggleItem = (ToggleableContainerLocal.ToggleItem) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, toggleableContainerLocal$ToggleItem$$serializer, (Object) null);
            toggleItem2 = (ToggleableContainerLocal.ToggleItem) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, toggleableContainerLocal$ToggleItem$$serializer, (Object) null);
            ToggleableContainerLocal.onExtraCallbackWithResult onextracallbackwithresult2 = (ToggleableContainerLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), (Object) null);
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onextracallbackwithresult = onextracallbackwithresult2;
            str = strAsInterface;
            textAttributeLocal = textAttributeLocal2;
            i = 63;
        } else {
            ToggleableContainerLocal.onExtraCallbackWithResult onextracallbackwithresult3 = null;
            String strAsInterface2 = null;
            ToggleableContainerLocal.ToggleItem toggleItem3 = null;
            ToggleableContainerLocal.ToggleItem toggleItem4 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            i = 0;
            boolean z2 = true;
            while ((!z2) != z) {
                int i6 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        z = true;
                        strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        z = true;
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i |= 2;
                        continue;
                    case 2:
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i |= 4;
                        break;
                    case 3:
                        toggleItem3 = (ToggleableContainerLocal.ToggleItem) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, ToggleableContainerLocal$ToggleItem$$serializer.INSTANCE, toggleItem3);
                        i |= 8;
                        break;
                    case 4:
                        toggleItem4 = (ToggleableContainerLocal.ToggleItem) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, ToggleableContainerLocal$ToggleItem$$serializer.INSTANCE, toggleItem4);
                        i |= 16;
                        break;
                    case 5:
                        onextracallbackwithresult3 = (ToggleableContainerLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), onextracallbackwithresult3);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                z = true;
            }
            paddingLocal = paddingLocal2;
            onextracallbackwithresult = onextracallbackwithresult3;
            str = strAsInterface2;
            toggleItem = toggleItem3;
            toggleItem2 = toggleItem4;
            textAttributeLocal = textAttributeLocal3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new ToggleableContainerLocal(i, str, textAttributeLocal, paddingLocal, toggleItem, toggleItem2, onextracallbackwithresult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m414deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ToggleableContainerLocal toggleableContainerLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(toggleableContainerLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ToggleableContainerLocal.onExtraCallback(toggleableContainerLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ToggleableContainerLocal) obj);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 35283), 36 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
            int i7 = $10 + 111;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 65 - View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), Color.blue(0) + 29, 17657 - View.getDefaultSize(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getEdgeSlop() >> 16)), 70 - TextUtils.indexOf("", "", 0, 0), 12486 - View.MeasureSpec.getSize(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i12 = $11 + 51;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i14 = $10 + 93;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
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

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{27259, 27174, 27169, 27252, 27168, 27168, 27198, 27174, 27255, 27197, 27192, 27196, 27174};
    }
}
