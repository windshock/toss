package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NiceSohoBanner$$serializer implements aeu2<NiceSohoBanner> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final NiceSohoBanner$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        NiceSohoBanner$$serializer niceSohoBanner$$serializer = new NiceSohoBanner$$serializer();
        INSTANCE = niceSohoBanner$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.NiceSohoBanner", niceSohoBanner$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new char[]{19488, 63203, 61812, 49846, 60166, 31469}, 5 - TextUtils.getTrimmedLength(""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("linkUrl", false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        setanimationsloop.onWarmupCompleted("logType", false);
        setanimationsloop.onWarmupCompleted("isUpperPosition", true);
        descriptor = setanimationsloop;
        int i = asBinder + 83;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private NiceSohoBanner$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getBgColor.IAuthTabCallback};
        int i4 = onTransact + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NiceSohoBanner deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        String strAsInterface2;
        boolean zOnExtraCallbackWithResult;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 0;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = IAuthTabCallbackStub + 89;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface3;
            str2 = strAsInterface4;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 31;
        } else {
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i7 = 1;
            boolean zOnExtraCallbackWithResult2 = false;
            int i8 = 0;
            while (i7 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i7 = i4;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onTransact;
                    int i10 = i9 + 27;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i12 = i9 + 95;
                        IAuthTabCallbackStub = i12 % 128;
                        if (i12 % 2 != 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 5) {
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i8 |= 4;
                        } else if (iOnNavigationEvent != 3) {
                            int i13 = i9 + 15;
                            IAuthTabCallbackStub = i13 % 128;
                            if (i13 % 2 != 0) {
                                i2 = 4;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2);
                                i8 |= 16;
                                int i14 = onTransact + 79;
                                IAuthTabCallbackStub = i14 % 128;
                                int i15 = i14 % 2;
                            } else {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                i2 = 4;
                                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2);
                                i8 |= 16;
                                int i142 = onTransact + 79;
                                IAuthTabCallbackStub = i142 % 128;
                                int i152 = i142 % 2;
                            }
                        } else {
                            strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i8 |= 8;
                        }
                    } else {
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                    }
                    i4 = 0;
                } else {
                    strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                    i8 |= 1;
                }
            }
            strAsInterface = strAsInterface5;
            str = strAsInterface6;
            str2 = strAsInterface7;
            strAsInterface2 = strAsInterface8;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NiceSohoBanner(i, str, str2, strAsInterface, strAsInterface2, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m181deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        NiceSohoBanner niceSohoBannerDeserialize = deserialize(decoder);
        int i3 = onTransact + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return niceSohoBannerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NiceSohoBanner niceSohoBanner) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(niceSohoBanner, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NiceSohoBanner.onNavigationEvent(niceSohoBanner, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NiceSohoBanner) obj);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onTransact + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onTransact + 57;
        IAuthTabCallbackStub = i3 % 128;
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
            int i4 = $10 + 113;
            $11 = i4 % 128;
            char c = 1;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                int i5 = defaultGainProviderExternalSyntheticLambda1.onNavigationEvent;
                cArr3[i3] = cArr[i3];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 105;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                        int iBlue = Color.blue(0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, packedPositionGroup, iBlue, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 11, 12434 - View.resolveSizeAndState(0, 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16013), 13 - TextUtils.lastIndexOf("", '0'), 19901 - ((Process.getThreadPriority(0) + 20) >> 6), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 36036;
        onNavigationEvent = (char) 44119;
        onExtraCallback = (char) 56233;
        onExtraCallbackWithResult = (char) 45417;
    }
}
