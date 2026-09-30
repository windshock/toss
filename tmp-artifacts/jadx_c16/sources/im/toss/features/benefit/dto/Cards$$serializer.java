package im.toss.features.benefit.dto;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.benefit.dto.Cards;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
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
import o.getPreRenderJob;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class Cards$$serializer implements aeu2<Cards> {
    public static final int $stable;
    private static char IAuthTabCallback;
    public static final Cards$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = b + 109;
        int i4 = i + 4;
        int i5 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = i7;
            i3 = i4 + i6;
            i4 = i8;
            int i9 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i9];
            int i10 = i3;
            i7 = i9;
            i4 = i10;
            int i82 = i7;
            i3 = i4 + i6;
            i4 = i82;
            int i92 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onWarmupCompleted();
        Cards$$serializer cards$$serializer = new Cards$$serializer();
        INSTANCE = cards$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.Cards", cards$$serializer, 10);
        setanimationsloop.onWarmupCompleted("cards", true);
        setanimationsloop.onWarmupCompleted("topCards", true);
        setanimationsloop.onWarmupCompleted("bottomCards", true);
        setanimationsloop.onWarmupCompleted("pointBalance", true);
        setanimationsloop.onWarmupCompleted("amountMicros", true);
        Object[] objArr = new Object[1];
        a((char) (Process.myPid() >> 22), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{286, 33673, 18219, 22287, 13296, 20704, 45912, 19992}, new char[]{0, 0, 0, 0}, new char[]{14372, 13503, 36704, 45876}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("tubaV2Variables", true);
        setanimationsloop.onWarmupCompleted("benefitMissionCards", true);
        setanimationsloop.onWarmupCompleted("personalization", true);
        setanimationsloop.onWarmupCompleted("pointAmountLogValue", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 3;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 88 / 0;
        }
    }

    private Cards$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) Cards.onExtraCallbackWithResult(new Object[0], getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 943723969, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -943723967);
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), oty1Var, oty1Var, getwrigglelayout, lazyArr[6].getValue(), sp.IAuthTabCallback((KSerializer) lazyArr[7].getValue()), sp.IAuthTabCallback(Cards$Personalization$$serializer.INSTANCE), getwrigglelayout};
        int i4 = asBinder + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Cards deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        Map map;
        Cards.Personalization personalization;
        List list3;
        List list4;
        String strAsInterface;
        String str;
        long j;
        long jIAuthTabCallbackDefault;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) Cards.onExtraCallbackWithResult(new Object[0], getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 943723969, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -943723967);
        int i6 = 9;
        boolean z = true;
        List list5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), (Object) null);
            Cards.Personalization personalization2 = (Cards.Personalization) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, Cards$Personalization$$serializer.INSTANCE, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            map = map2;
            list = list7;
            list3 = list8;
            list2 = list6;
            personalization = personalization2;
            j = jIAuthTabCallbackDefault2;
            str = strAsInterface2;
            i = 1023;
        } else {
            int i7 = onTransact + 93;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
            i = 0;
            boolean z2 = true;
            List list9 = null;
            list = null;
            Map map3 = null;
            Cards.Personalization personalization3 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            long jIAuthTabCallbackDefault3 = 0;
            long jIAuthTabCallbackDefault4 = 0;
            List list10 = null;
            while ((!z2) != z) {
                int i9 = onTransact + 113;
                asBinder = i9 % 128;
                if (i9 % i2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        z = true;
                    case 0:
                        list10 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), list10);
                        i |= 1;
                        i2 = 2;
                        i6 = 9;
                        z = true;
                    case 1:
                        list9 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list9);
                        i |= 2;
                        z = true;
                        i2 = 2;
                        i6 = 9;
                    case 2:
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, (jp) lazyArr[i2].getValue(), list);
                        i |= 4;
                        i6 = 9;
                        z = true;
                    case 3:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i |= 8;
                        i6 = 9;
                        z = true;
                    case 4:
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                        i |= 16;
                        i6 = 9;
                        z = true;
                    case 5:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        z = true;
                    case 6:
                        map3 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArr[6].getValue(), map3);
                        i |= 64;
                        z = true;
                    case 7:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), list5);
                        i |= 128;
                        z = true;
                    case 8:
                        personalization3 = (Cards.Personalization) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, Cards$Personalization$$serializer.INSTANCE, personalization3);
                        i |= 256;
                        z = true;
                    case 9:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        i |= 512;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list2 = list9;
            map = map3;
            personalization = personalization3;
            list3 = list5;
            list4 = list10;
            strAsInterface = strAsInterface3;
            str = strAsInterface4;
            j = jIAuthTabCallbackDefault3;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Cards(i, list4, list2, list, jIAuthTabCallbackDefault, j, str, map, list3, personalization, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m92deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Cards cardsDeserialize = deserialize(decoder);
        int i4 = asBinder + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cardsDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Cards cards) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cards, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Cards.onWarmupCompleted(cards, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Cards) obj);
        int i4 = onTransact + 17;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
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
        int i3 = $11 + 57;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult >= length3) {
                break;
            }
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), 44 - ((Process.getThreadPriority(0) + 20) >> 6), 1494 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.MeasureSpec.getMode(0)), 50 - View.MeasureSpec.makeMeasureSpec(0, 0), 22939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45848), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 119;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 20089;
    }
}
