package viva.republica.toss.network.model.transfer.periodic;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.fromArray;
import o.fromBundle;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferModel$$serializer implements aeu2<PeriodicTransferModel> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final PeriodicTransferModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        PeriodicTransferModel$$serializer periodicTransferModel$$serializer = new PeriodicTransferModel$$serializer();
        INSTANCE = periodicTransferModel$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel", periodicTransferModel$$serializer, 28);
        setanimationsloop.onWarmupCompleted("uniqueId", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 33, 0}, true, new byte[]{0, 1, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{9, 11, 0, 0}, false, new byte[]{0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("descriptionTdsColor", true);
        setanimationsloop.onWarmupCompleted("withdrawBankCode", true);
        setanimationsloop.onWarmupCompleted("withdrawAccountNo", true);
        setanimationsloop.onWarmupCompleted("depositType", true);
        setanimationsloop.onWarmupCompleted("depositBankCode", true);
        setanimationsloop.onWarmupCompleted("depositAccountNo", true);
        setanimationsloop.onWarmupCompleted("depositAccountHolderName", true);
        setanimationsloop.onWarmupCompleted("depositName", true);
        setanimationsloop.onWarmupCompleted("depositDisplayName", true);
        setanimationsloop.onWarmupCompleted("depositPhone", true);
        setanimationsloop.onWarmupCompleted("depositDisplayPhone", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("dueDateType", true);
        setanimationsloop.onWarmupCompleted("userMemo", true);
        setanimationsloop.onWarmupCompleted("transferDueDate", true);
        setanimationsloop.onWarmupCompleted("lastTransferDueDate", true);
        setanimationsloop.onWarmupCompleted("transferEndDueDate", true);
        setanimationsloop.onWarmupCompleted("alarmDays", true);
        setanimationsloop.onWarmupCompleted("repeatDueDate", true);
        setanimationsloop.onWarmupCompleted("enableAlarm", true);
        setanimationsloop.onWarmupCompleted("status", true);
        Object[] objArr4 = new Object[1];
        a(new int[]{20, 7, 0, 7}, false, new byte[]{1, 1, 0, 1, 1, 1, 1}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("transferDueDay", true);
        setanimationsloop.onWarmupCompleted("invalidFields", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 63;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PeriodicTransferModel$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = PeriodicTransferModel.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[7].getValue());
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[16].getValue());
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(PeriodicTransferModel$InvalidFields$$serializer.INSTANCE);
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, kSerializer, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, getdynamicheight, kSerializer, kSerializerIAuthTabCallback4, getdynamicheight, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, oty1.onExtraCallback, kSerializerIAuthTabCallback5, kSerializer, kSerializer, getbgcolor, kSerializer, getdynamicheight, getbgcolor, getbgcolor, kSerializer, getbgcolor, kSerializer, kSerializerIAuthTabCallback6};
        int i4 = IAuthTabCallback + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferModel periodicTransferModelM135deserialize = m135deserialize(decoder);
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return periodicTransferModelM135deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PeriodicTransferModel m135deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        String strAsInterface;
        int iOnTransact2;
        long jIAuthTabCallbackDefault;
        boolean zOnExtraCallbackWithResult;
        int iOnTransact3;
        boolean zOnExtraCallbackWithResult2;
        boolean zOnExtraCallbackWithResult3;
        boolean zOnExtraCallbackWithResult4;
        String strAsInterface2;
        String str;
        String str2;
        fromBundle frombundle;
        PeriodicTransferModel.InvalidFields invalidFields;
        int i;
        fromArray fromarray;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        fromBundle frombundle2;
        String str16;
        String str17;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = PeriodicTransferModel.onExtraCallbackWithResult();
        int i6 = 19;
        int i7 = 18;
        int i8 = 17;
        int i9 = 16;
        String strAsInterface3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            PeriodicTransferModel.InvalidFields invalidFields2 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            fromBundle frombundle3 = null;
            String str18 = null;
            String str19 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String str20 = null;
            strAsInterface = null;
            boolean z = true;
            jIAuthTabCallbackDefault = 0;
            int i10 = 0;
            iOnTransact = 0;
            iOnTransact2 = 0;
            zOnExtraCallbackWithResult4 = false;
            zOnExtraCallbackWithResult3 = false;
            iOnTransact3 = 0;
            zOnExtraCallbackWithResult = false;
            zOnExtraCallbackWithResult2 = false;
            fromArray fromarray2 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        z = false;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 0:
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        i10 |= 1;
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        i10 |= 2;
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str20);
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 2:
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        i10 |= 4;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 3:
                        frombundle2 = frombundle3;
                        str16 = str18;
                        i10 |= 8;
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str19);
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 4:
                        frombundle2 = frombundle3;
                        i10 |= 16;
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str18);
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 5:
                        frombundle2 = frombundle3;
                        i10 |= 32;
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 6:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i10 |= 64;
                        i6 = 19;
                    case 7:
                        frombundle2 = (fromBundle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallbackWithResult[7].getValue(), frombundle3);
                        i10 |= 128;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 8:
                        i10 |= 256;
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 9:
                        i10 |= 512;
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 10:
                        i10 |= 1024;
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 11:
                        i10 |= 2048;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 12:
                        i10 |= 4096;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 13:
                        i10 |= 8192;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 14:
                        i10 |= 16384;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 15:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 15);
                        int i11 = IAuthTabCallback + 91;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        i2 = 32768;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 16:
                        fromarray2 = (fromArray) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i9, (jp) lazyArrOnExtraCallbackWithResult[i9].getValue(), fromarray2);
                        i2 = 65536;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 17:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i8);
                        i2 = 131072;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 18:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                        i2 = 262144;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 19:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6);
                        i2 = 524288;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 20:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
                        i2 = 1048576;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 21:
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 21);
                        i2 = 2097152;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 22:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22);
                        i2 = 4194304;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 23:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 23);
                        i2 = 8388608;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 24:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 24);
                        i2 = 16777216;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 25:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 25);
                        i2 = 33554432;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 26:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 26);
                        i2 = 67108864;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    case 27:
                        invalidFields2 = (PeriodicTransferModel.InvalidFields) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 27, PeriodicTransferModel$InvalidFields$$serializer.INSTANCE, invalidFields2);
                        i2 = 134217728;
                        i10 |= i2;
                        frombundle2 = frombundle3;
                        str16 = str18;
                        str17 = str19;
                        frombundle3 = frombundle2;
                        str19 = str17;
                        str18 = str16;
                        i6 = 19;
                        i7 = 18;
                        i8 = 17;
                        i9 = 16;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            invalidFields = invalidFields2;
            frombundle = frombundle3;
            str15 = str20;
            str2 = str19;
            str = str18;
            i = i10;
            strAsInterface2 = strAsInterface3;
            fromarray = fromarray2;
            str3 = strAsInterface14;
            str4 = strAsInterface15;
            str5 = strAsInterface4;
            str6 = strAsInterface5;
            str7 = strAsInterface6;
            str8 = strAsInterface7;
            str9 = strAsInterface8;
            str10 = strAsInterface9;
            str11 = strAsInterface10;
            str12 = strAsInterface11;
            str13 = strAsInterface12;
            str14 = strAsInterface13;
        } else {
            String strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            fromBundle frombundle4 = (fromBundle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallbackWithResult[7].getValue(), (Object) null);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
            String strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            String strAsInterface21 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            String strAsInterface22 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            String strAsInterface23 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 15);
            fromArray fromarray3 = (fromArray) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, (jp) lazyArrOnExtraCallbackWithResult[16].getValue(), (Object) null);
            String strAsInterface24 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 17);
            String strAsInterface25 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 18);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19);
            String strAsInterface26 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
            iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 21);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22);
            zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 23);
            String strAsInterface27 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 24);
            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 25);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 26);
            str = str23;
            str2 = str22;
            frombundle = frombundle4;
            invalidFields = (PeriodicTransferModel.InvalidFields) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 27, PeriodicTransferModel$InvalidFields$$serializer.INSTANCE, (Object) null);
            i = 268435455;
            fromarray = fromarray3;
            str3 = strAsInterface27;
            str4 = strAsInterface26;
            str5 = strAsInterface25;
            str6 = strAsInterface24;
            str7 = strAsInterface23;
            str8 = strAsInterface22;
            str9 = strAsInterface21;
            str10 = strAsInterface20;
            str11 = strAsInterface19;
            str12 = strAsInterface18;
            str13 = strAsInterface17;
            str14 = strAsInterface16;
            str15 = str21;
        }
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        PeriodicTransferModel periodicTransferModel = new PeriodicTransferModel(i, str14, str15, str13, str2, str, iOnTransact, strAsInterface, frombundle, iOnTransact2, str12, str11, str10, str9, str8, str7, jIAuthTabCallbackDefault, fromarray, str6, str5, z2, str4, iOnTransact3, zOnExtraCallbackWithResult2, zOnExtraCallbackWithResult3, str3, zOnExtraCallbackWithResult4, strAsInterface2, invalidFields, (okycx) null);
        int i13 = IAuthTabCallback + 97;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        return periodicTransferModel;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferModel) obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferModel periodicTransferModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(periodicTransferModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PeriodicTransferModel.onWarmupCompleted(periodicTransferModel, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 69 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 35284), 35 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getMode(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "", 0)), 65 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 29 - TextUtils.getTrimmedLength(""), (Process.myTid() >> 22) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 49467), 70 - TextUtils.getCapsMode("", 0, 0), 12486 - View.combineMeasuredStates(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i9 = $10 + 95;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 << i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 + i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i10, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i10);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i11 = $11 + 91;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{27149, 27333, 27355, 27353, 27260, 27174, 27198, 27168, 27168, 27260, 27178, 27170, 27173, 27172, 27171, 27170, 27196, 27168, 27170, 27168, 27260, 27168, 27194, 27170, 27171, 27173, 27178};
    }
}
