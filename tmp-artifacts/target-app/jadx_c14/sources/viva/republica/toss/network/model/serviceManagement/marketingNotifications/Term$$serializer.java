package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import android.graphics.Color;
import android.os.SystemClock;
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
import o.EncryptedContentInfoParser;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class Term$$serializer implements aeu2<Term> {
    private static int IAuthTabCallback;
    public static final Term$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            byte[] r0 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term$$serializer.$$a
            int r6 = 110 - r6
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term$$serializer.$$c(int, int, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 123;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        Term$$serializer term$$serializer = new Term$$serializer();
        INSTANCE = term$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term", term$$serializer, 8);
        setanimationsloop.onWarmupCompleted("contentsType", false);
        setanimationsloop.onWarmupCompleted("contentsUrl", false);
        setanimationsloop.onWarmupCompleted("isSigned", false);
        setanimationsloop.onWarmupCompleted("termsId", false);
        Object[] objArr = new Object[1];
        a((char) (40035 - Color.alpha(0)), 1244802500 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{18733, 12509, 59211, 12833, 43373}, new char[]{0, 0, 0, 0}, new char[]{50634, 12845, 25418, 50332}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("updatedAt", true);
        Object[] objArr2 = new Object[1];
        a((char) (36538 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.getCapsMode("", 0, 0) - 1259111947, new char[]{49067, 50994, 15622}, new char[]{0, 0, 0, 0}, new char[]{62958, 62329, 47796, 56206}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("stdConsentModuleCodes", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private Term$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, getBgColor.IAuthTabCallback, oty1.onExtraCallback, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(StdConsentModuleCodes$$serializer.INSTANCE)};
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Term termM72deserialize = m72deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return termM72deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final Term m72deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        StdConsentModuleCodes stdConsentModuleCodes;
        String str2;
        String str3;
        String str4;
        long j;
        boolean z;
        String str5;
        int i;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        IAuthTabCallbackDefault = i3 % 128;
        String strAsInterface = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 7;
        int i5 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            z = zOnExtraCallbackWithResult;
            str4 = strAsInterface2;
            stdConsentModuleCodes = (StdConsentModuleCodes) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, StdConsentModuleCodes$$serializer.INSTANCE, (Object) null);
            str2 = str7;
            str = str6;
            str5 = strAsInterface4;
            str3 = strAsInterface3;
            j = jIAuthTabCallbackDefault;
            i = 255;
        } else {
            String str8 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            long jIAuthTabCallbackDefault2 = 0;
            String str9 = null;
            StdConsentModuleCodes stdConsentModuleCodes2 = null;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z3 = false;
                    case 0:
                        z2 = true;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 7;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        z2 = true;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 7;
                    case 2:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i5 |= 4;
                        int i6 = asBinder + 63;
                        IAuthTabCallbackDefault = i6 % 128;
                        int i7 = i6 % 2;
                        i4 = 7;
                    case 3:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i5 |= 8;
                    case 4:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i5 |= 16;
                    case 5:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str9);
                        i5 |= 32;
                    case 6:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str8);
                        i5 |= 64;
                    case 7:
                        stdConsentModuleCodes2 = (StdConsentModuleCodes) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, StdConsentModuleCodes$$serializer.INSTANCE, stdConsentModuleCodes2);
                        i5 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str9;
            stdConsentModuleCodes = stdConsentModuleCodes2;
            str2 = str8;
            str3 = strAsInterface5;
            str4 = strAsInterface6;
            j = jIAuthTabCallbackDefault2;
            z = zOnExtraCallbackWithResult2;
            str5 = strAsInterface;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Term(i, str4, str3, z, j, str5, str, str2, stdConsentModuleCodes, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Term) obj);
        int i4 = IAuthTabCallbackDefault + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Term term) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(term, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Term.onWarmupCompleted(term, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(term, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Term.onWarmupCompleted(term, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 125;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
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
        while (true) {
            obj = null;
            if (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult >= length3) {
                break;
            }
            int i3 = $11 + 31;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 43, (ViewConfiguration.getEdgeSlop() >> 16) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, 1494 - (ViewConfiguration.getTouchSlop() >> 8), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23972), TextUtils.lastIndexOf("", '0', 0, 0) + 51, 22939 - (ViewConfiguration.getPressedStateDuration() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - KeyEvent.normalizeMetaState(0)), View.combineMeasuredStates(0, 0) + 29, 12577 - KeyEvent.keyCodeFromString(""), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
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
        int i5 = $11 + 5;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        onExtraCallbackWithResult = (char) 29988;
    }
}
