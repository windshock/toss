package im.toss.features.cardrecommend.home.model.feed.rank;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.cardrecommend.home.model.data.rank.Rank;
import im.toss.features.cardrecommend.home.model.data.rank.Rank$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NeoRankFeedResp$$serializer implements aeu2<NeoRankFeedResp> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final NeoRankFeedResp$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 91;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        NeoRankFeedResp$$serializer neoRankFeedResp$$serializer = new NeoRankFeedResp$$serializer();
        INSTANCE = neoRankFeedResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.cardrecommend.home.model.feed.rank.NeoRankFeedResp", neoRankFeedResp$$serializer, 3);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-122, -127, -122, -123}, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("stateType", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 69;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    private NeoRankFeedResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, Rank$.serializer.INSTANCE, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = Rank$.serializer.INSTANCE;
        kSerializerArr[2] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NeoRankFeedResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        Rank rank;
        String strAsInterface2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            i = 0;
            rank = null;
            strAsInterface = null;
            strAsInterface2 = null;
            while (z) {
                int i3 = asInterface + 119;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = asInterface + 37;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = asInterface + 53;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i |= 4;
                } else {
                    rank = (Rank) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, Rank$.serializer.INSTANCE, rank);
                    i |= 2;
                }
            }
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            rank = (Rank) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, Rank$.serializer.INSTANCE, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            i = 7;
        }
        String str = strAsInterface;
        int i8 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NeoRankFeedResp(i8, str, rank, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m110deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        NeoRankFeedResp neoRankFeedRespDeserialize = deserialize(decoder);
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return neoRankFeedRespDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NeoRankFeedResp neoRankFeedResp) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(neoRankFeedResp, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NeoRankFeedResp.onExtraCallback(neoRankFeedResp, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(neoRankFeedResp, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NeoRankFeedResp.onExtraCallback(neoRankFeedResp, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NeoRankFeedResp) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 77 - Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 75 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16037 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            long j = 0;
            if (!(!onExtraCallback)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - Color.argb(0, 0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i5 = $11 + 71;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 3 / 2;
                        }
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 79;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] >> iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 63 - Gravity.getAbsoluteGravity(0, 0), 12214 - ExpandableListView.getPackedPositionGroup(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{32397, 32384, 32393, 32412, 32413, 32408};
        onWarmupCompleted = -1184334023;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }
}
