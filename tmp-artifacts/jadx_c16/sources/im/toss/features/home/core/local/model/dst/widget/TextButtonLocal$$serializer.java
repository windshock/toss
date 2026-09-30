package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.SizeLocal;
import im.toss.features.home.core.local.model.dst.property.SizeLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TextButtonLocal$$serializer implements aeu2<TextButtonLocal> {
    private static char IAuthTabCallback;
    public static final TextButtonLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {118, 33, 67, 92};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3 = b + 109;
        int i4 = i * 2;
        byte[] bArr = $$a;
        int i5 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i6;
            i3 = (-i3) + i9;
            i5 = i7;
            i2 = i8;
            int i10 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i10];
            i9 = i3;
            i3 = b3;
            i7 = i10;
            i3 = (-i3) + i9;
            i5 = i7;
            i2 = i8;
            int i102 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallback = 0;
        IAuthTabCallback();
        TextButtonLocal$$serializer textButtonLocal$$serializer = new TextButtonLocal$$serializer();
        INSTANCE = textButtonLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.TextButtonLocal", textButtonLocal$$serializer, 4);
        Object[] objArr = new Object[1];
        a((char) (57600 - ImageFormat.getBitsPerPixel(0)), 327633335 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{53337, 5410, 5740, 39980, 61053}, new char[]{25574, 29441, 41610, 50727}, new char[]{46968, 34633, 275, 16097}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("rightIcon", false);
        setanimationsloop.onWarmupCompleted("rightIconSize", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 85;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    private TextButtonLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE, sp.IAuthTabCallback(ImageSourceLocal$Icon$$serializer.INSTANCE), sp.IAuthTabCallback(SizeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE)};
        int i4 = onTransact + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TextButtonLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal.Icon icon;
        int i;
        SizeLocal sizeLocal;
        TextAttributeLocal textAttributeLocal;
        MarginLocal marginLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        SizeLocal sizeLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            ImageSourceLocal.Icon icon2 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImageSourceLocal$Icon$$serializer.INSTANCE, (Object) null);
            sizeLocal = (SizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SizeLocal$.serializer.INSTANCE, (Object) null);
            textAttributeLocal = textAttributeLocal2;
            i = 15;
            marginLocal = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, MarginLocal$$serializer.INSTANCE, (Object) null);
            icon = icon2;
        } else {
            int i3 = onTransact + 15;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            ImageSourceLocal.Icon icon3 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            MarginLocal marginLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    icon3 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImageSourceLocal$Icon$$serializer.INSTANCE, icon3);
                    i5 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    sizeLocal2 = (SizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SizeLocal$.serializer.INSTANCE, sizeLocal2);
                    i5 |= 4;
                    int i6 = onTransact + 5;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, MarginLocal$$serializer.INSTANCE, marginLocal2);
                    i5 |= 8;
                }
            }
            icon = icon3;
            i = i5;
            sizeLocal = sizeLocal2;
            textAttributeLocal = textAttributeLocal3;
            marginLocal = marginLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TextButtonLocal(i, textAttributeLocal, icon, sizeLocal, marginLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m511deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TextButtonLocal textButtonLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textButtonLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TextButtonLocal.IAuthTabCallback(textButtonLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TextButtonLocal) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
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
        int i4 = $11 + 27;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, 1450 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49123), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1494 - TextUtils.getTrimmedLength(""), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 23972), 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22987 - AndroidCharacter.getMirror('0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, 12577 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 9;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -6188598186616027107L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
