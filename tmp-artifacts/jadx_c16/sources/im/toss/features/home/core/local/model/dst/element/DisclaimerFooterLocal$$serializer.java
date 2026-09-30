package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
import im.toss.features.home.core.local.model.dst.widget.TextButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.TextButtonLocal$$serializer;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
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
public final /* synthetic */ class DisclaimerFooterLocal$$serializer implements aeu2<DisclaimerFooterLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final DisclaimerFooterLocal$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = asInterface + 7;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 5 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        DisclaimerFooterLocal$$serializer disclaimerFooterLocal$$serializer = new DisclaimerFooterLocal$$serializer();
        INSTANCE = disclaimerFooterLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DisclaimerFooterLocal", disclaimerFooterLocal$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{18357, 45663, 44599, 21116, 52896, 15001, 9478, 46525, 9026, 45728, 15918, 39899}, 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("textButton", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 55;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private DisclaimerFooterLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE, sp.IAuthTabCallback(TextButtonLocal$$serializer.INSTANCE), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = asInterface + 75;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DisclaimerFooterLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        PaddingLocal paddingLocal;
        TextButtonLocal textButtonLocal;
        TextAttributeLocal textAttributeLocal;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        PaddingLocal paddingLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            TextButtonLocal textButtonLocal2 = (TextButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextButtonLocal$$serializer.INSTANCE, (Object) null);
            PaddingLocal paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            int i3 = asInterface + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i = 15;
            textAttributeLocal = textAttributeLocal2;
            str = str2;
            textButtonLocal = textButtonLocal2;
            paddingLocal = paddingLocal3;
        } else {
            int i5 = 0;
            boolean z = true;
            TextButtonLocal textButtonLocal3 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            String str3 = null;
            while (z) {
                int i6 = onTransact + 11;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = asInterface + 49;
                    onTransact = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent == 1) {
                            textButtonLocal3 = (TextButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextButtonLocal$$serializer.INSTANCE, textButtonLocal3);
                            i5 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                            i5 |= 8;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        textButtonLocal3 = (TextButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextButtonLocal$$serializer.INSTANCE, textButtonLocal3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                    }
                } else {
                    textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                    i5 |= 1;
                }
            }
            i = i5;
            paddingLocal = paddingLocal2;
            textButtonLocal = textButtonLocal3;
            textAttributeLocal = textAttributeLocal3;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DisclaimerFooterLocal(i, textAttributeLocal, textButtonLocal, paddingLocal, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m331deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DisclaimerFooterLocal disclaimerFooterLocal) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(disclaimerFooterLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DisclaimerFooterLocal.onExtraCallbackWithResult(disclaimerFooterLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DisclaimerFooterLocal) obj);
        int i4 = asInterface + 119;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asInterface + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int windowTouchSlop = 12434 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, fadingEdgeLength, windowTouchSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Color.red(0) + 10, TextUtils.getTrimmedLength("") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 16015), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, Color.green(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = (char) 48377;
        onWarmupCompleted = (char) 61836;
        IAuthTabCallback = (char) 24772;
        onExtraCallback = (char) 19902;
    }
}
