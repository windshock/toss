package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
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
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class FailureImageConfig$$serializer implements aeu2<FailureImageConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final FailureImageConfig$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    private FailureImageConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        FailureImageConfig$$serializer failureImageConfig$$serializer = new FailureImageConfig$$serializer();
        INSTANCE = failureImageConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{59486, 15300, 13885, 34498, 2022, 53973, 64029, 54216, 24451, 32376, 35848, 13161, 47570, 33896, 2718, 9976, 36362, 402, 6174, 14311, 15297, 2836, 18271, 30695, 3604, 11384, 4514, 26727, 50953, 8777, 19601, 15261, 50945, 5470, 25874, 62575, 41435, 21264, 61828, 41395, 27577, 61742, 9316, 53347, 63121, 17852, 59014, 2225, 5662, 47585, 35848, 13161, 41747, 41595, 58021, 43597, 60814, 25773, 25305, 21649, 24156, 60415, 37047, 57755, 39901, 27305, 3604, 11384, 18869, 8130, 22048, 30543}, 71 - Gravity.getAbsoluteGravity(0, 0), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), failureImageConfig$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(new char[]{53738, 8071, 17186, 49800, 49815, 7118, 46704, 30568, 22993, 36250}, 9 - TextUtils.getOffsetBefore("", 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{25305, 21649, 61349, 45415, 29740, 56655, 54662, 3902, 18271, 30695, 47676, 22387}, 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(new char[]{61828, 41395, 7286, 58674, 25305, 21649, 49920, 61713, 29429, 62530, 63363, 20691, 5390, 16683, 29429, 62530}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(new char[]{38855, 54896, 22447, 35872, 25584, 4760, 8347, 2260}, 7 - TextUtils.lastIndexOf("", '0', 0), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 119;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, setVideoListener.onWarmupCompleted, getdynamicheight, getdynamicheight};
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FailureImageConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        boolean z;
        int iOnTransact2;
        double d;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            z = zOnExtraCallbackWithResult;
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
            d = dIAuthTabCallback;
            i = 15;
        } else {
            boolean z2 = true;
            int iOnTransact3 = 0;
            int i5 = 0;
            double dIAuthTabCallback2 = 0.0d;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact4 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i6 = IAuthTabCallbackDefault;
                    int i7 = i6 + 111;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i6 + 67;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                    i5 |= 8;
                } else {
                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                    i5 |= 4;
                }
            }
            iOnTransact = iOnTransact3;
            z = zOnExtraCallbackWithResult2;
            iOnTransact2 = iOnTransact4;
            d = dIAuthTabCallback2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FailureImageConfig(i, z, d, iOnTransact, iOnTransact2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m331deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        FailureImageConfig failureImageConfigDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return failureImageConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FailureImageConfig failureImageConfig) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(failureImageConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        FailureImageConfig.onNavigationEvent(failureImageConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FailureImageConfig) obj);
        int i4 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (true) {
            Object obj = null;
            if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                break;
            }
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i7 = i4;
            while (i7 < 16) {
                int i8 = $11 + 31;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, maximumDrawingCacheSize, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i2 = 2;
                    i4 = 0;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16014), 14 - Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') + 19853, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $11 + 83;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i15 = $11 + 7;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = (char) 3719;
        onExtraCallback = (char) 19346;
        IAuthTabCallback = (char) 11008;
        onExtraCallbackWithResult = (char) 246;
    }
}
