package im.toss.feature.credit.overview.network.response;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Card$$serializer implements aeu2<Card> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final Card$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        Card$$serializer card$$serializer = new Card$$serializer();
        INSTANCE = card$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.Card", card$$serializer, 17);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(new char[]{13417, 13341, 57889, 9858, 37430, 44505, 47600, 31952}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("shortenedOrganizationName", true);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("openDate", true);
        setanimationsloop.onWarmupCompleted("referenceDate", true);
        setanimationsloop.onWarmupCompleted("limit", true);
        setanimationsloop.onWarmupCompleted("cashLimit", true);
        setanimationsloop.onWarmupCompleted("lumpSumAmount", true);
        setanimationsloop.onWarmupCompleted("installmentAmount", true);
        setanimationsloop.onWarmupCompleted("cashAdvanceAmount", true);
        setanimationsloop.onWarmupCompleted("overdueAmount", true);
        setanimationsloop.onWarmupCompleted("usedAmount", true);
        setanimationsloop.onWarmupCompleted("creditUsedAmount", true);
        setanimationsloop.onWarmupCompleted("tips", true);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 43;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private Card$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = Card.IAuthTabCallback();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[15].getValue()), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Card deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Long l2;
        Long l3;
        int i;
        String str;
        Long l4;
        String str2;
        Long l5;
        Long l6;
        Long l7;
        String str3;
        String str4;
        List list;
        Long l8;
        String str5;
        String str6;
        Long l9;
        String str7;
        String str8;
        String str9;
        String str10;
        Long l10;
        List list2;
        String str11;
        Long l11;
        String str12;
        Long l12;
        Lazy[] lazyArr;
        String str13;
        String str14;
        String str15;
        Long l13;
        Lazy[] lazyArr2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = Card.IAuthTabCallback();
        String str16 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            Long l14 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            Long l15 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1Var, (Object) null);
            l7 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1Var, (Object) null);
            Long l16 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, oty1Var, (Object) null);
            Long l17 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, oty1Var, (Object) null);
            Long l18 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, oty1Var, (Object) null);
            l8 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, oty1Var, (Object) null);
            Long l19 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, oty1Var, (Object) null);
            Long l20 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, oty1Var, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, (jp) lazyArrIAuthTabCallback[15].getValue(), (Object) null);
            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, (Object) null);
            l4 = l16;
            str2 = str19;
            l9 = l18;
            str4 = str18;
            list = list3;
            l5 = l15;
            l2 = l19;
            l3 = l17;
            l = l20;
            str3 = str20;
            l6 = l14;
            i = 131071;
            str5 = str17;
            str7 = str22;
            str = str21;
        } else {
            int i3 = 0;
            boolean z = true;
            String str23 = null;
            String str24 = null;
            Long l21 = null;
            Long l22 = null;
            String str25 = null;
            Long l23 = null;
            Long l24 = null;
            Long l25 = null;
            String str26 = null;
            Long l26 = null;
            Long l27 = null;
            String str27 = null;
            String str28 = null;
            Long l28 = null;
            Long l29 = null;
            List list4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        str11 = str23;
                        l11 = l27;
                        str12 = str28;
                        l12 = l28;
                        lazyArr = lazyArrIAuthTabCallback;
                        str13 = str16;
                        z = false;
                        str16 = str13;
                        lazyArrIAuthTabCallback = lazyArr;
                        l27 = l11;
                        str23 = str11;
                        str28 = str12;
                        l28 = l12;
                    case 0:
                        str11 = str23;
                        str12 = str28;
                        l12 = l28;
                        lazyArr = lazyArrIAuthTabCallback;
                        str13 = str16;
                        l11 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l27);
                        i3 |= 1;
                        str27 = str27;
                        str16 = str13;
                        lazyArrIAuthTabCallback = lazyArr;
                        l27 = l11;
                        str23 = str11;
                        str28 = str12;
                        l28 = l12;
                    case 1:
                        l12 = l28;
                        str12 = str28;
                        str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str27);
                        i3 |= 2;
                        str23 = str23;
                        str16 = str16;
                        lazyArrIAuthTabCallback = lazyArrIAuthTabCallback;
                        str28 = str12;
                        l28 = l12;
                    case 2:
                        l12 = l28;
                        i3 |= 4;
                        str16 = str16;
                        lazyArrIAuthTabCallback = lazyArrIAuthTabCallback;
                        str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str28);
                        str23 = str23;
                        l28 = l12;
                    case 3:
                        String str29 = str23;
                        l12 = l28;
                        i3 |= 8;
                        str23 = str29;
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str16);
                        lazyArrIAuthTabCallback = lazyArrIAuthTabCallback;
                        l28 = l12;
                    case 4:
                        str14 = str23;
                        str15 = str16;
                        l13 = l28;
                        lazyArr2 = lazyArrIAuthTabCallback;
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str25);
                        i3 |= 16;
                        int i4 = onWarmupCompleted + 91;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        l29 = l29;
                        list4 = list4;
                        lazyArrIAuthTabCallback = lazyArr2;
                        str16 = str15;
                        l28 = l13;
                        str23 = str14;
                    case 5:
                        str14 = str23;
                        str15 = str16;
                        l13 = l28;
                        lazyArr2 = lazyArrIAuthTabCallback;
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str26);
                        i3 |= 32;
                        lazyArrIAuthTabCallback = lazyArr2;
                        str16 = str15;
                        l28 = l13;
                        str23 = str14;
                    case 6:
                        str14 = str23;
                        str15 = str16;
                        l13 = l28;
                        lazyArr2 = lazyArrIAuthTabCallback;
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str24);
                        i3 |= 64;
                        lazyArrIAuthTabCallback = lazyArr2;
                        str16 = str15;
                        l28 = l13;
                        str23 = str14;
                    case 7:
                        str14 = str23;
                        str15 = str16;
                        Long l30 = l28;
                        lazyArr2 = lazyArrIAuthTabCallback;
                        l13 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, l30);
                        i3 |= 128;
                        lazyArrIAuthTabCallback = lazyArr2;
                        str16 = str15;
                        l28 = l13;
                        str23 = str14;
                    case 8:
                        str8 = str23;
                        str9 = str16;
                        l24 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, l24);
                        i3 |= 256;
                        str23 = str8;
                        str16 = str9;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str8 = str23;
                        str9 = str16;
                        l26 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, oty1.onExtraCallback, l26);
                        i3 |= 512;
                        str23 = str8;
                        str16 = str9;
                    case 10:
                        str10 = str23;
                        str9 = str16;
                        l10 = l29;
                        list2 = list4;
                        l23 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, oty1.onExtraCallback, l23);
                        i3 |= 1024;
                        l29 = l10;
                        str23 = str10;
                        list4 = list2;
                        str16 = str9;
                    case 11:
                        str10 = str23;
                        str9 = str16;
                        l10 = l29;
                        list2 = list4;
                        l25 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, oty1.onExtraCallback, l25);
                        i3 |= 2048;
                        l29 = l10;
                        str23 = str10;
                        list4 = list2;
                        str16 = str9;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        str10 = str23;
                        str9 = str16;
                        list2 = list4;
                        l29 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, oty1.onExtraCallback, l29);
                        i3 |= 4096;
                        str23 = str10;
                        list4 = list2;
                        str16 = str9;
                    case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                        str8 = str23;
                        str9 = str16;
                        l22 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, oty1.onExtraCallback, l22);
                        i3 |= 8192;
                        str23 = str8;
                        str16 = str9;
                    case 14:
                        str8 = str23;
                        str9 = str16;
                        l21 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, oty1.onExtraCallback, l21);
                        i3 |= 16384;
                        str23 = str8;
                        str16 = str9;
                    case 15:
                        str9 = str16;
                        str8 = str23;
                        list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, (jp) lazyArrIAuthTabCallback[15].getValue(), list4);
                        i3 |= 32768;
                        str23 = str8;
                        str16 = str9;
                    case 16:
                        str9 = str16;
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, str23);
                        i3 |= 65536;
                        int i6 = onNavigationEvent + 55;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        str16 = str9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            l = l21;
            l2 = l22;
            l3 = l23;
            i = i3;
            str = str26;
            l4 = l26;
            str2 = str16;
            l5 = l28;
            l6 = l27;
            l7 = l24;
            str3 = str25;
            str4 = str28;
            list = list4;
            l8 = l29;
            str5 = str27;
            str6 = str23;
            l9 = l25;
            str7 = str24;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Card(i, l6, str5, str4, str2, str3, str, str7, l5, l7, l4, l3, l9, l8, l2, l, list, str6, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m339deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Card cardDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cardDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Card card) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(card, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Card.onWarmupCompleted(card, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(card, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Card.onWarmupCompleted(card, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (Card) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 5;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            int i5 = $10 + 113;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.red(0)), 84 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), ExpandableListView.getPackedPositionGroup(0L) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 103;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = 3483428586792039565L;
    }
}
