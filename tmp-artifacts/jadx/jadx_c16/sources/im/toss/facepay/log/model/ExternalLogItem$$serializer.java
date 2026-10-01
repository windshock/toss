package im.toss.facepay.log.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import gatewayprotocol.v1.AdResponseKtKt;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.encryptType4;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExternalLogItem$$serializer implements aeu2<ExternalLogItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final ExternalLogItem$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    private ExternalLogItem$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 9;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        ExternalLogItem$$serializer externalLogItem$$serializer = new ExternalLogItem$$serializer();
        INSTANCE = externalLogItem$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{0, 41, 127, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), externalLogItem$$serializer, 26);
        Object[] objArr2 = new Object[1];
        b(new char[]{22065, 25039, 23020, 5712, 42452, 58613, 5344, 49566, 35086, 41699}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        b(new char[]{1274, 23754, 51925, 1652, 9590, 59524, 41869, 62643, 23123, 24857, 36137, 35501}, 11 - Color.green(0), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new int[]{41, 4, 41, 2}, false, new byte[]{0, 0, 1, 1}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a(new int[]{45, 8, 154, 0}, false, new byte[]{1, 0, 0, 0, 0, 1, 1, 0}, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), false);
        Object[] objArr6 = new Object[1];
        b(new char[]{40168, 38662, 6927, 3210, 4500, 42661, 21064, 47971, 22503, 35837, 61433, 8650, 35086, 41699}, 14 - Color.blue(0), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), false);
        Object[] objArr7 = new Object[1];
        b(new char[]{60261, 2726, 11490, 1299, 40168, 38662, 6927, 3210, 4500, 42661, 21064, 47971, 22503, 35837, 61433, 8650, 35086, 41699}, TextUtils.getCapsMode("", 0, 0) + 18, objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), false);
        Object[] objArr8 = new Object[1];
        b(new char[]{22742, 25047, 35558, 45994, 28901, 25896, 16032, 62363}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), false);
        Object[] objArr9 = new Object[1];
        a(new int[]{53, 20, 0, 0}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}, objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), false);
        Object[] objArr10 = new Object[1];
        b(new char[]{876, 20287, 34893, 41245, 26397, 46569, 16032, 62363}, 6 - TextUtils.lastIndexOf("", '0', 0), objArr10);
        setanimationsloop.onWarmupCompleted(((String) objArr10[0]).intern(), false);
        Object[] objArr11 = new Object[1];
        a(new int[]{73, 6, 0, 4}, false, new byte[]{0, 1, 0, 1, 1, 0}, objArr11);
        setanimationsloop.onWarmupCompleted(((String) objArr11[0]).intern(), false);
        Object[] objArr12 = new Object[1];
        a(new int[]{79, 4, 0, 4}, true, new byte[]{0, 1, 1, 1}, objArr12);
        setanimationsloop.onWarmupCompleted(((String) objArr12[0]).intern(), false);
        Object[] objArr13 = new Object[1];
        b(new char[]{60010, 5058, 34893, 41245, 35364, 21676}, TextUtils.indexOf((CharSequence) "", '0') + 7, objArr13);
        setanimationsloop.onWarmupCompleted(((String) objArr13[0]).intern(), false);
        Object[] objArr14 = new Object[1];
        b(new char[]{60261, 2726, 43261, 56984, 25354, 27075, 48046, 33346, 9298, 7770}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr14);
        setanimationsloop.onWarmupCompleted(((String) objArr14[0]).intern(), false);
        Object[] objArr15 = new Object[1];
        a(new int[]{83, 11, 80, 6}, true, null, objArr15);
        setanimationsloop.onWarmupCompleted(((String) objArr15[0]).intern(), false);
        Object[] objArr16 = new Object[1];
        b(new char[]{59259, 24791, 60261, 2726, 10622, 59203, 14690, 19496, 57568, 36396}, TextUtils.getTrimmedLength("") + 10, objArr16);
        setanimationsloop.onWarmupCompleted(((String) objArr16[0]).intern(), false);
        Object[] objArr17 = new Object[1];
        a(new int[]{94, 11, 11, 0}, true, new byte[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1}, objArr17);
        setanimationsloop.onWarmupCompleted(((String) objArr17[0]).intern(), false);
        Object[] objArr18 = new Object[1];
        a(new int[]{105, 11, 0, 6}, false, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1}, objArr18);
        setanimationsloop.onWarmupCompleted(((String) objArr18[0]).intern(), false);
        Object[] objArr19 = new Object[1];
        a(new int[]{116, 11, 30, 0}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0}, objArr19);
        setanimationsloop.onWarmupCompleted(((String) objArr19[0]).intern(), false);
        Object[] objArr20 = new Object[1];
        b(new char[]{17264, 14042, 20760, 4101, 15197, 23442, 14690, 19496, 12480, 53999, 61370, 3962}, Color.blue(0) + 12, objArr20);
        setanimationsloop.onWarmupCompleted(((String) objArr20[0]).intern(), false);
        Object[] objArr21 = new Object[1];
        b(new char[]{47502, 42782, 26397, 46569, 15197, 23442}, 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr21);
        setanimationsloop.onWarmupCompleted(((String) objArr21[0]).intern(), false);
        Object[] objArr22 = new Object[1];
        a(new int[]{127, 2, 137, 0}, true, new byte[]{0, 0}, objArr22);
        setanimationsloop.onWarmupCompleted(((String) objArr22[0]).intern(), false);
        Object[] objArr23 = new Object[1];
        b(new char[]{32044, 4414, 60858, 60028, 5589, 998, 23563, 53778, 7723, 3876}, 9 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr23);
        setanimationsloop.onWarmupCompleted(((String) objArr23[0]).intern(), false);
        Object[] objArr24 = new Object[1];
        b(new char[]{63442, 54557, 56917, 10330, 35086, 41699}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, objArr24);
        setanimationsloop.onWarmupCompleted(((String) objArr24[0]).intern(), false);
        Object[] objArr25 = new Object[1];
        b(new char[]{63442, 54557, 56917, 10330, 28462, 52666, 58443, 16145, 22503, 35837, 40860, 14874}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr25);
        setanimationsloop.onWarmupCompleted(((String) objArr25[0]).intern(), false);
        Object[] objArr26 = new Object[1];
        b(new char[]{57464, 34979, 55863, 47086, 41869, 62643, 14690, 19496, 49978, 1748, 15029, 35151, 34893, 41245, 19661, 26373}, 14 - ImageFormat.getBitsPerPixel(0), objArr26);
        setanimationsloop.onWarmupCompleted(((String) objArr26[0]).intern(), false);
        Object[] objArr27 = new Object[1];
        b(new char[]{53961, 44691, 57090, 42248, 28462, 52666, 58443, 16145, 22503, 35837, 40860, 14874}, Gravity.getAbsoluteGravity(0, 0) + 11, objArr27);
        setanimationsloop.onWarmupCompleted(((String) objArr27[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = asInterface + 7;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializer2 = encryptType4.IAuthTabCallback;
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(kSerializer2);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, oty1Var, oty1Var, oty1Var, kSerializer, kSerializerIAuthTabCallback, kSerializer, kSerializerIAuthTabCallback2, kSerializer, kSerializer, kSerializer, kSerializer, kSerializerIAuthTabCallback3, kSerializer, kSerializer, kSerializer2, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer2, kSerializer};
        int i4 = IAuthTabCallbackDefault + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExternalLogItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        JsonObject jsonObject;
        String str2;
        String strAsInterface;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        long j;
        long j2;
        String str11;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        int i;
        String str12;
        JsonObject jsonObject4;
        String str13;
        long j3;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 11;
        int i6 = 9;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
            encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
            JsonObject jsonObject5 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 15, encrypttype4, (Object) null);
            JsonObject jsonObject6 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, encrypttype4, (Object) null);
            JsonObject jsonObject7 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, encrypttype4, (Object) null);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 18);
            String strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 19);
            String strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
            String strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 21);
            String strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 22);
            String strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 23);
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 24, encrypttype4, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 25);
            str4 = strAsInterface10;
            str8 = strAsInterface5;
            str17 = strAsInterface3;
            str7 = strAsInterface8;
            str16 = strAsInterface7;
            str9 = strAsInterface6;
            str12 = str21;
            str18 = strAsInterface4;
            str15 = strAsInterface9;
            jsonObject4 = jsonObject6;
            str14 = str22;
            str11 = str20;
            jsonObject2 = jsonObject5;
            jsonObject3 = jsonObject7;
            str6 = strAsInterface12;
            str5 = strAsInterface13;
            str3 = strAsInterface14;
            str = strAsInterface15;
            str2 = strAsInterface16;
            str13 = strAsInterface11;
            str10 = strAsInterface2;
            j3 = jIAuthTabCallbackDefault;
            i = 67108863;
            j = jIAuthTabCallbackDefault2;
            j2 = jIAuthTabCallbackDefault3;
        } else {
            int i7 = 25;
            int i8 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            String strAsInterface17 = null;
            String str23 = null;
            String strAsInterface18 = null;
            JsonObject jsonObject8 = null;
            JsonObject jsonObject9 = null;
            JsonObject jsonObject10 = null;
            String str24 = null;
            JsonObject jsonObject11 = null;
            String strAsInterface19 = null;
            String strAsInterface20 = null;
            String strAsInterface21 = null;
            String strAsInterface22 = null;
            String strAsInterface23 = null;
            String strAsInterface24 = null;
            String strAsInterface25 = null;
            String strAsInterface26 = null;
            String strAsInterface27 = null;
            String strAsInterface28 = null;
            String strAsInterface29 = null;
            String strAsInterface30 = null;
            String strAsInterface31 = null;
            String str25 = null;
            String strAsInterface32 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        str19 = str25;
                        z = false;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 0:
                        str19 = str25;
                        i8 |= 1;
                        strAsInterface31 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 1:
                        str19 = str25;
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i8 |= 2;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 2:
                        str19 = str25;
                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                        i8 |= 4;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 3:
                        str19 = str25;
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i8 |= 8;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 4:
                        str19 = str25;
                        i8 |= 16;
                        strAsInterface30 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 5:
                        i8 |= 32;
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str25);
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 6:
                        strAsInterface32 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i8 |= 64;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 7:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str24);
                        i8 |= 128;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 8:
                        i8 |= 256;
                        strAsInterface27 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 9:
                        i8 |= 512;
                        strAsInterface29 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 10:
                        i8 |= 1024;
                        strAsInterface28 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 11:
                        i8 |= 2048;
                        strAsInterface26 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 12:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str23);
                        i8 |= 4096;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 13:
                        i8 |= 8192;
                        str19 = str25;
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 14:
                        i8 |= 16384;
                        strAsInterface22 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 15:
                        jsonObject8 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 15, encryptType4.IAuthTabCallback, jsonObject8);
                        i2 = 32768;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 16:
                        jsonObject11 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, encryptType4.IAuthTabCallback, jsonObject11);
                        i2 = 65536;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 17:
                        jsonObject10 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, encryptType4.IAuthTabCallback, jsonObject10);
                        i2 = 131072;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 18:
                        i8 |= 262144;
                        strAsInterface25 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 18);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 19:
                        i8 |= 524288;
                        strAsInterface24 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 19);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 20:
                        strAsInterface23 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
                        i2 = 1048576;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 21:
                        strAsInterface21 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 21);
                        i2 = 2097152;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 22:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 22);
                        i2 = 4194304;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 23:
                        strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 23);
                        i2 = 8388608;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 24:
                        jsonObject9 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 24, encryptType4.IAuthTabCallback, jsonObject9);
                        i2 = 16777216;
                        i8 |= i2;
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    case 25:
                        i8 |= 33554432;
                        strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                        str19 = str25;
                        str25 = str19;
                        i7 = 25;
                        i5 = 11;
                        i6 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str26 = str25;
            str = strAsInterface17;
            jsonObject = jsonObject9;
            str2 = strAsInterface19;
            strAsInterface = strAsInterface20;
            str3 = strAsInterface21;
            str4 = strAsInterface22;
            str5 = strAsInterface23;
            str6 = strAsInterface24;
            str7 = strAsInterface26;
            str8 = strAsInterface27;
            str9 = strAsInterface29;
            str10 = strAsInterface31;
            j = jIAuthTabCallbackDefault5;
            j2 = jIAuthTabCallbackDefault6;
            str11 = str26;
            jsonObject2 = jsonObject8;
            jsonObject3 = jsonObject10;
            i = i8;
            str12 = str24;
            jsonObject4 = jsonObject11;
            str13 = strAsInterface25;
            j3 = jIAuthTabCallbackDefault4;
            str14 = str23;
            str15 = strAsInterface18;
            String str27 = strAsInterface32;
            str16 = strAsInterface28;
            str17 = strAsInterface30;
            str18 = str27;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ExternalLogItem externalLogItem = new ExternalLogItem(i, str10, j3, j, j2, str17, str11, str18, str12, str8, str9, str16, str7, str14, str15, str4, jsonObject2, jsonObject4, jsonObject3, str13, str6, str5, str3, str, str2, jsonObject, strAsInterface, (okycx) null);
        int i9 = onTransact + 25;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        return externalLogItem;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m62deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ExternalLogItem externalLogItemDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = onTransact + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return externalLogItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExternalLogItem externalLogItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(externalLogItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        ExternalLogItem.onWarmupCompleted(new Object[]{externalLogItem, vylVarOnExtraCallback, serialDescriptor}, -1508440798, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 1508440802, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExternalLogItem) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 19;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, scrollBarSize, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, (ViewConfiguration.getEdgeSlop() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $11 + 39;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16014), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (ViewConfiguration.getTapTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 15;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 125;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.resolveSize(0, 0) + 35, 14239 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 35283), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 77;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 29 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 10936), (ViewConfiguration.getJumpTapTimeout() >> 16) + 65, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 70, Color.green(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i12, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 19;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $11 + 1;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i17 = $11 + 19;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{27192, 27302, 27301, 27283, 27289, 27300, 27282, 27285, 27307, 27304, 27297, 27300, 27301, 27323, 27283, 27382, 27266, 27305, 27309, 27302, 27299, 27266, 27271, 27300, 27298, 27266, 27292, 27298, 27305, 27303, 27309, 27311, 27308, 27271, 27265, 27324, 27326, 27326, 27294, 27266, 27300, 27141, 27356, 27355, 27353, 27336, 27464, 27467, 27459, 27465, 27469, 27468, 27312, 27260, 27178, 27175, 27175, 27183, 27174, 27173, 27175, 27199, 27197, 27175, 27174, 27177, 27170, 27171, 27174, 27177, 27180, 27176, 27172, 27252, 27168, 27170, 27168, 27177, 27180, 27254, 27172, 27170, 27197, 27274, 27378, 27275, 27277, 27387, 27276, 27387, 27386, 27377, 27389, 27361, 27216, 27165, 27199, 27196, 27194, 27194, 27197, 27196, 27194, 27343, 27191, 27262, 27175, 27175, 27177, 27176, 27142, 27141, 27168, 27192, 27175, 27177, 27151, 27330, 27354, 27337, 27339, 27336, 27337, 27337, 27339, 27338, 27177, 27184, 27316};
        IAuthTabCallback = (char) 8196;
        onNavigationEvent = (char) 666;
        onExtraCallbackWithResult = (char) 19314;
        onWarmupCompleted = (char) 38289;
    }
}
