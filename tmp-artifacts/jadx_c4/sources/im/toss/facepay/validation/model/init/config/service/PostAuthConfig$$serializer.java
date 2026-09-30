package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class PostAuthConfig$$serializer implements aeu2<PostAuthConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final PostAuthConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private PostAuthConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        PostAuthConfig$$serializer postAuthConfig$$serializer = new PostAuthConfig$$serializer();
        INSTANCE = postAuthConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{18, 22, 22, '\f', 20, 2, 30, 20, 24, '\t', '\"', 30, 18, 7, 23, 19, 0, '\n', '#', 29, 30, '\f', 17, 22, 15, 2, 19, 22, '\f', 26, 5, '#', 19, 18, 5, 21, '\f', 22, ' ', 15, '\t', '!', 20, 29, 20, 30, '!', 11, 5, 22, '\"', 30, 22, 6, 20, 2, 17, '\n', '\"', '\f', 3, 2, 15, 2, 29, 21, 13894}, (byte) (Color.green(0) + 73), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 68, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), postAuthConfig$$serializer, 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{20, '#', 0, 4, '\n', 24, '#', 5, 13942}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + UCPApiConstants.ARAM_TIME_OUT), 9 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{30, '\n', 22, 17, 16, 15, '\n', 11, '\n', 18, 23, '!', 4, 15, 29, 19, 23, '!', '\f', ' ', '\f', 4, 13820}, (byte) (19 - (Process.myTid() >> 22)), 23 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 16 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        if (i2 % 2 == 0) {
            kSerializerArr[1] = getBgColor.IAuthTabCallback;
            kSerializerArr[1] = oty1.onExtraCallback;
        } else {
            kSerializerArr[0] = getBgColor.IAuthTabCallback;
            kSerializerArr[1] = oty1.onExtraCallback;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PostAuthConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        long jIAuthTabCallbackDefault;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = 0;
            boolean z = true;
            i = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int i5 = IAuthTabCallbackDefault + 95;
                onNavigationEvent = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 83;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            i = 3;
        }
        int i7 = i;
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PostAuthConfig(i7, z2, jIAuthTabCallbackDefault, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m333deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PostAuthConfig postAuthConfigDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return postAuthConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PostAuthConfig postAuthConfig) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(postAuthConfig, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PostAuthConfig.onNavigationEvent(postAuthConfig, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(postAuthConfig, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            PostAuthConfig.onNavigationEvent(postAuthConfig, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PostAuthConfig) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallback;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 26, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 23139 - (ViewConfiguration.getTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 10;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 99;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i9 = $11 + 29;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 / 4;
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24824), 'z' - AndroidCharacter.getMirror('0'), 8088 - View.resolveSize(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), KeyEvent.getDeadChar(0, 0) + 30, 19487 - ExpandableListView.getPackedPositionChild(0L), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i16 = $10 + 77;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{65022, 65008, 64987, 64989, 64965, 65014, 64978, 65015, 65012, 64961, 64995, 65010, 64968, 64971, 64988, 65013, 64967, 65009, 64925, 64963, 65011, 64990, 64970, 64986, 64983, 64999, 64980, 64981, 64977, 64991, 64966, 64969, 64960, 64976, 64964, 64982};
        IAuthTabCallback = (char) 51247;
    }
}
