package im.toss.features.home.core.local.model.dst.element;

import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeListHeaderLocal;
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
public final /* synthetic */ class HomeListHeaderLocal$Right$Text$$serializer implements aeu2<HomeListHeaderLocal.Right.Text> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final HomeListHeaderLocal$Right$Text$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 13;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        HomeListHeaderLocal$Right$Text$$serializer homeListHeaderLocal$Right$Text$$serializer = new HomeListHeaderLocal$Right$Text$$serializer();
        INSTANCE = homeListHeaderLocal$Right$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeListHeaderLocal.Right.Text", homeListHeaderLocal$Right$Text$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{41523, 36279, 50985, 59635}, TextUtils.indexOf((CharSequence) "", '0') + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("textAlt", false);
        setanimationsloop.onWarmupCompleted("logTextAlt", false);
        descriptor = setanimationsloop;
        int i = onTransact + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeListHeaderLocal$Right$Text$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[2] = kSerializerIAuthTabCallback;
        } else {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        int i3 = asInterface + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[PHI: r1 r13
      0x0052: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListHeaderLocal.Right.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        String strAsInterface2;
        int i;
        String str;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        asInterface = i3 % 128;
        String strAsInterface3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 57 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = asInterface + 63;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                i = 7;
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            } else {
                boolean z = true;
                strAsInterface = null;
                String str2 = null;
                i = 0;
                while (z) {
                    int i7 = IAuthTabCallbackStub + 77;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i8 = 7 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent != 0) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            int i9 = asInterface + 19;
                            IAuthTabCallbackStub = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            i |= 4;
                        } else {
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i |= 2;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent != 0) {
                        }
                    }
                }
                strAsInterface2 = strAsInterface3;
                str = str2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListHeaderLocal.Right.Text(i, strAsInterface, strAsInterface2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m389deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeListHeaderLocal.Right.Text textDeserialize = deserialize(decoder);
        int i4 = asInterface + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return textDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListHeaderLocal.Right.Text text) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListHeaderLocal.Right.Text.onWarmupCompleted(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListHeaderLocal.Right.Text) obj);
        int i4 = IAuthTabCallbackStub + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 91;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 99;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i4, i4);
                        int mode = 10 - View.MeasureSpec.getMode(i4);
                        int offsetAfter = TextUtils.getOffsetAfter("", i4) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, mode, offsetAfter, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.MeasureSpec.getSize(0)), '>' - AndroidCharacter.getMirror('0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 18996;
        onWarmupCompleted = (char) 6514;
        onNavigationEvent = (char) 38163;
        onExtraCallbackWithResult = (char) 65020;
    }
}
