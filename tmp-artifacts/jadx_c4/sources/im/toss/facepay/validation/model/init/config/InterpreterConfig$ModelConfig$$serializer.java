package im.toss.facepay.validation.model.init.config;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
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
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class InterpreterConfig$ModelConfig$$serializer implements aeu2<InterpreterConfig.ModelConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final InterpreterConfig$ModelConfig$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    private InterpreterConfig$ModelConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 1;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        InterpreterConfig$ModelConfig$$serializer interpreterConfig$ModelConfig$$serializer = new InterpreterConfig$ModelConfig$$serializer();
        INSTANCE = interpreterConfig$ModelConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{42714, 35322, 49203, 27014, 14784, 20120, 36550, 4976, 50334, 57898, 13904, 23276, 56900, 11373, 45123, 47543, 52301, 43102, 56152, 17588, 24991, 28873, 14903, 37854, 29250, 56095, 27768, 61711, 59676, 14348, 21390, 47233, 33166, 65156, 9773, 47004, 65373, 6140, 46690, 25943, 11846, 680, 63358, 45819, 14612, 11358, 50171, 11652, 40990, 38541, 45870, 18019, 42298, 5538, 40990, 38541, 34467, 63165, 11846, 680, 63358, 45819, 11277, 24354, 59676, 14348, 21390, 47233, 34467, 63165, 11846, 680, 63358, 45819}, 74 - TextUtils.getOffsetAfter("", 0), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), interpreterConfig$ModelConfig$$serializer, 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{57685, 25653, 37156, 28159, 49500, 39172, 34467, 63165, 4329, 45046, 9676, 31588}, TextUtils.lastIndexOf("", '0') + 12, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{40793, 60451, 4663, 46656, 60728, 25840, 53865, 45455, 'C', 38933}, 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 117;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getDynamicHeight.onWarmupCompleted, getBgColor.IAuthTabCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[1] = getBgColor.IAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final InterpreterConfig.ModelConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        boolean zOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            int iOnTransact2 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int i4 = 0;
            while (z) {
                int i5 = IAuthTabCallbackDefault + 107;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i4 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = asInterface + 119;
                    IAuthTabCallbackDefault = i6 % 128;
                    zOnExtraCallbackWithResult2 = i6 % 2 != 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i4 |= 2;
                }
            }
            iOnTransact = iOnTransact2;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new InterpreterConfig.ModelConfig(i, iOnTransact, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m315deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        InterpreterConfig.ModelConfig modelConfigDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return modelConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull InterpreterConfig.ModelConfig modelConfig) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(modelConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        InterpreterConfig.ModelConfig.onExtraCallbackWithResult(modelConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (InterpreterConfig.ModelConfig) obj);
        int i4 = IAuthTabCallbackDefault + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
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
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 5;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, scrollBarFadeDuration, fadingEdgeLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.normalizeMetaState(0) + 10, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $11 + 19;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16014), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 20472;
        onNavigationEvent = (char) 64160;
        onExtraCallbackWithResult = (char) 11232;
        onWarmupCompleted = 'b';
    }
}
