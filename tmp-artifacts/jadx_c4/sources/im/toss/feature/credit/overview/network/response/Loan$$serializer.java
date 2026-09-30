package im.toss.feature.credit.overview.network.response;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
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
public final /* synthetic */ class Loan$$serializer implements aeu2<Loan> {
    public static final Loan$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 109;
        int i4 = s + 4;
        int i5 = b * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            int i9 = 0;
            int i10 = i4 + i7;
            i2 = i9;
            int i11 = i8;
            i3 = i10;
            i4 = i11;
            int i12 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i3;
            i8 = i12;
            i4 = bArr[i12];
            i9 = i2 + 1;
            i7 = i13;
            int i102 = i4 + i7;
            i2 = i9;
            int i112 = i8;
            i3 = i102;
            i4 = i112;
            int i122 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        IAuthTabCallback();
        Loan$$serializer loan$$serializer = new Loan$$serializer();
        INSTANCE = loan$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.Loan", loan$$serializer, 13);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("shortenedOrganizationName", true);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("fillIconUri", true);
        setanimationsloop.onWarmupCompleted("openDate", true);
        setanimationsloop.onWarmupCompleted("dueDate", true);
        setanimationsloop.onWarmupCompleted("contractAmount", true);
        setanimationsloop.onWarmupCompleted("remainAmount", true);
        setanimationsloop.onWarmupCompleted("bankType", true);
        Object[] objArr = new Object[1];
        a((char) (54707 - View.resolveSizeAndState(0, 0, 0)), ViewConfiguration.getTouchSlop() >> 8, new char[]{63803, 29449, 29088, 9512}, new char[]{0, 0, 0, 0}, new char[]{54482, 60006, 46077, 2261}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("tips", true);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 13;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private Loan$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = Loan.onNavigationEvent();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[11].getValue()), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Loan deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        List list;
        Long l;
        String str3;
        String str4;
        Long l2;
        Long l3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Lazy[] lazyArr;
        String str10;
        char c;
        String str11;
        Lazy[] lazyArr2;
        String str12;
        String str13;
        Lazy[] lazyArr3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = Loan.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1Var, (Object) null);
            Long l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1Var, (Object) null);
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, (jp) lazyArrOnNavigationEvent[11].getValue(), (Object) null);
            i = 8191;
            str8 = str20;
            str5 = str16;
            l = l6;
            l2 = l4;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            str4 = str15;
            str7 = str18;
            str = str14;
            str6 = str21;
            str9 = str19;
            l3 = l5;
            str3 = str17;
        } else {
            String str22 = null;
            int i5 = 12;
            int i6 = 0;
            boolean z = true;
            String str23 = null;
            String str24 = null;
            Long l7 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            List list2 = null;
            String str28 = null;
            Long l8 = null;
            String str29 = null;
            String str30 = null;
            Long l9 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        lazyArr = lazyArrOnNavigationEvent;
                        str10 = str29;
                        c = 2;
                        str11 = str24;
                        z = false;
                        str24 = str11;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 12;
                        str29 = str10;
                    case 0:
                        lazyArr = lazyArrOnNavigationEvent;
                        String str31 = str29;
                        String str32 = str30;
                        Long l10 = l9;
                        str11 = str24;
                        str10 = str31;
                        l8 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l8);
                        i6 |= 1;
                        int i7 = IAuthTabCallbackStub + 33;
                        IAuthTabCallbackDefault = i7 % 128;
                        c = 2;
                        if (i7 % 2 != 0) {
                            int i8 = 5 / 5;
                        }
                        l9 = l10;
                        str30 = str32;
                        str24 = str11;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 12;
                        str29 = str10;
                    case 1:
                        lazyArr2 = lazyArrOnNavigationEvent;
                        str12 = str29;
                        str13 = str24;
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str22);
                        i6 |= 2;
                        l9 = l9;
                        str30 = str30;
                        str24 = str13;
                        i5 = 12;
                        str29 = str12;
                        lazyArrOnNavigationEvent = lazyArr2;
                    case 2:
                        lazyArr2 = lazyArrOnNavigationEvent;
                        str12 = str29;
                        str13 = str24;
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str23);
                        i6 |= 4;
                        str24 = str13;
                        i5 = 12;
                        str29 = str12;
                        lazyArrOnNavigationEvent = lazyArr2;
                    case 3:
                        lazyArr2 = lazyArrOnNavigationEvent;
                        str12 = str29;
                        str13 = str24;
                        str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str28);
                        i6 |= 8;
                        str24 = str13;
                        i5 = 12;
                        str29 = str12;
                        lazyArrOnNavigationEvent = lazyArr2;
                    case 4:
                        i6 |= 16;
                        str24 = str24;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        i5 = 12;
                        str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str29);
                    case 5:
                        lazyArr3 = lazyArrOnNavigationEvent;
                        str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str27);
                        i6 |= 32;
                        lazyArrOnNavigationEvent = lazyArr3;
                        i5 = 12;
                    case 6:
                        lazyArr3 = lazyArrOnNavigationEvent;
                        str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str30);
                        i6 |= 64;
                        lazyArrOnNavigationEvent = lazyArr3;
                        i5 = 12;
                    case 7:
                        i6 |= 128;
                        l9 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, l9);
                        i5 = 12;
                    case 8:
                        l7 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, l7);
                        i6 |= 256;
                        i5 = 12;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str26);
                        i6 |= 512;
                        int i9 = IAuthTabCallbackDefault + 23;
                        IAuthTabCallbackStub = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 5 / 3;
                        }
                        i5 = 12;
                    case 10:
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str25);
                        i6 |= 1024;
                        i5 = 12;
                    case 11:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, (jp) lazyArrOnNavigationEvent[11].getValue(), list2);
                        i6 |= 2048;
                        i5 = 12;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str24);
                        i6 |= 4096;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i6;
            str = str22;
            str2 = str24;
            list = list2;
            l = l7;
            str3 = str29;
            str4 = str23;
            l2 = l8;
            String str33 = str27;
            l3 = l9;
            str5 = str28;
            str6 = str25;
            str7 = str33;
            str8 = str26;
            str9 = str30;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Loan(i, l2, str, str4, str5, str3, str7, str9, l3, l, str8, str6, list, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m346deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Loan loanDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return loanDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Loan loan) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loan, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Loan.onExtraCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{loan, vylVarOnExtraCallback, serialDescriptor}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 687668095, -687668093, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loan, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Loan.onExtraCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{loan, vylVarOnExtraCallback2, serialDescriptor2}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 687668095, -687668093, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Loan) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 42 - ((byte) KeyEvent.getModifierMetaStateMask()), (-16775765) - Color.rgb(0, 0, 0), 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ExpandableListView.getPackedPositionType(0L)), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getTrimmedLength("") + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Process.getGidForName("") + 51, 22939 - (ViewConfiguration.getLongPressTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45848), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 55;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i2 = 2;
                    int i7 = 2 / 5;
                } else {
                    i2 = 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 37;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 7798559133331975163L;
        onExtraCallbackWithResult = 858827018;
        onWarmupCompleted = (char) 27643;
    }
}
