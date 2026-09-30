package im.toss.rn.toss.core.remoteprocess;

import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.bundle.TossReactBundleMeta$;
import im.toss.tds.view.R;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class PreparedRnBundleSnapshot$$serializer implements aeu2<PreparedRnBundleSnapshot> {
    private static int IAuthTabCallback = 0;
    public static final PreparedRnBundleSnapshot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        PreparedRnBundleSnapshot$$serializer preparedRnBundleSnapshot$$serializer = new PreparedRnBundleSnapshot$$serializer();
        INSTANCE = preparedRnBundleSnapshot$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.rn.toss.core.remoteprocess.PreparedRnBundleSnapshot", preparedRnBundleSnapshot$$serializer, 21);
        setanimationsloop.onWarmupCompleted("schemaVersion", true);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("createdAtMillis", false);
        setanimationsloop.onWarmupCompleted("region", false);
        setanimationsloop.onWarmupCompleted("company", false);
        setanimationsloop.onWarmupCompleted("bundleBaseUrl", false);
        setanimationsloop.onWarmupCompleted("distributionGroup", false);
        setanimationsloop.onWarmupCompleted("serviceBundleName", false);
        setanimationsloop.onWarmupCompleted("sharedBundleName", false);
        setanimationsloop.onWarmupCompleted("serviceBundlePath", false);
        setanimationsloop.onWarmupCompleted("sharedBundlePath", false);
        setanimationsloop.onWarmupCompleted("serviceBundleSize", false);
        setanimationsloop.onWarmupCompleted("sharedBundleSize", false);
        setanimationsloop.onWarmupCompleted("serviceBundleSha256", false);
        setanimationsloop.onWarmupCompleted("sharedBundleSha256", false);
        setanimationsloop.onWarmupCompleted("serviceBundleUrl", false);
        setanimationsloop.onWarmupCompleted("sharedBundleUrl", false);
        setanimationsloop.onWarmupCompleted("serviceMeta", false);
        setanimationsloop.onWarmupCompleted("sharedMeta", false);
        setanimationsloop.onWarmupCompleted("serviceIsFromCache", false);
        setanimationsloop.onWarmupCompleted("sharedIsFromCache", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 117;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
    }

    private PreparedRnBundleSnapshot$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        oty1 oty1Var = oty1.onExtraCallback;
        TossReactBundleMeta$.serializer serializerVar = TossReactBundleMeta$.serializer.INSTANCE;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, kSerializer, oty1Var, kSerializer, kSerializer, kSerializer, kSerializerIAuthTabCallback, kSerializer, kSerializer, kSerializer, kSerializer, oty1Var, oty1Var, kSerializer, kSerializer, kSerializer, kSerializer, serializerVar, serializerVar, getbgcolor, getbgcolor};
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PreparedRnBundleSnapshot deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        long j2;
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        String str8;
        String str9;
        String str10;
        String str11;
        long j3;
        TossReactBundleMeta tossReactBundleMeta;
        TossReactBundleMeta tossReactBundleMeta2;
        String str12;
        String str13;
        char c;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i8 = 10;
        char c2 = 6;
        int i9 = 8;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i10 = onWarmupCompleted + 77;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 11);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 12);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
            String strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
            TossReactBundleMeta$.serializer serializerVar = TossReactBundleMeta$.serializer.INSTANCE;
            TossReactBundleMeta tossReactBundleMeta3 = (TossReactBundleMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 17, serializerVar, (Object) null);
            tossReactBundleMeta2 = (TossReactBundleMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 18, serializerVar, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19);
            str = strAsInterface6;
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20);
            str9 = strAsInterface10;
            str12 = strAsInterface8;
            str11 = strAsInterface7;
            j3 = jIAuthTabCallbackDefault2;
            str10 = strAsInterface9;
            str2 = strAsInterface12;
            str8 = strAsInterface11;
            i2 = iOnTransact;
            j = jIAuthTabCallbackDefault3;
            j2 = jIAuthTabCallbackDefault;
            tossReactBundleMeta = tossReactBundleMeta3;
            i = 2097151;
            str4 = strAsInterface3;
            str3 = strAsInterface4;
            str5 = strAsInterface5;
            str13 = str14;
            str6 = strAsInterface2;
            str7 = strAsInterface;
        } else {
            int i12 = 0;
            boolean z = true;
            String str15 = null;
            TossReactBundleMeta tossReactBundleMeta4 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String str16 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            String strAsInterface18 = null;
            String strAsInterface19 = null;
            String strAsInterface20 = null;
            String strAsInterface21 = null;
            String strAsInterface22 = null;
            String strAsInterface23 = null;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            int iOnTransact2 = 0;
            boolean zOnExtraCallbackWithResult3 = false;
            TossReactBundleMeta tossReactBundleMeta5 = null;
            boolean zOnExtraCallbackWithResult4 = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i8 = 10;
                    case 0:
                        i12 |= 1;
                        c2 = c2;
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i6 = 2;
                        i9 = 8;
                        i8 = 10;
                    case 1:
                        strAsInterface23 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i12 |= 2;
                        c2 = c2;
                        i6 = 2;
                        i9 = 8;
                        i8 = 10;
                    case 2:
                        c = c2;
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i6);
                        i12 |= 4;
                        c2 = c;
                        i9 = 8;
                        i8 = 10;
                    case 3:
                        c = c2;
                        strAsInterface22 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i12 |= 8;
                        c2 = c;
                        i9 = 8;
                        i8 = 10;
                    case 4:
                        c = c2;
                        strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i12 |= 16;
                        c2 = c;
                        i9 = 8;
                        i8 = 10;
                    case 5:
                        strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i12 |= 32;
                        c2 = c2;
                        i9 = 8;
                        i8 = 10;
                    case 6:
                        c = 6;
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str15);
                        i12 |= 64;
                        c2 = c;
                        i9 = 8;
                        i8 = 10;
                    case 7:
                        strAsInterface21 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i12 |= 128;
                        c2 = 6;
                    case 8:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i9);
                        i12 |= 256;
                        c2 = 6;
                    case 9:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i12 |= 512;
                        c2 = 6;
                    case 10:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i8);
                        i12 |= 1024;
                        c2 = 6;
                    case 11:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 11);
                        i12 |= 2048;
                        c2 = 6;
                    case 12:
                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 12);
                        i12 |= 4096;
                        c2 = 6;
                    case 13:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        i12 |= 8192;
                        c2 = 6;
                    case 14:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
                        i12 |= 16384;
                        int i13 = onExtraCallback + 37;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % i6;
                        c2 = 6;
                    case 15:
                        String strAsInterface24 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
                        int i15 = onWarmupCompleted + 59;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % i6;
                        i3 = 32768;
                        str16 = strAsInterface24;
                        i12 |= i3;
                        int i17 = onWarmupCompleted + 61;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % i6;
                        c2 = 6;
                    case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
                        i3 = 65536;
                        i12 |= i3;
                        int i172 = onWarmupCompleted + 61;
                        onExtraCallback = i172 % 128;
                        int i182 = i172 % i6;
                        c2 = 6;
                    case R.styleable.TdsListRowV1View_centerType /* 17 */:
                        tossReactBundleMeta5 = (TossReactBundleMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 17, TossReactBundleMeta$.serializer.INSTANCE, tossReactBundleMeta5);
                        i4 = 131072;
                        i12 |= i4;
                        c2 = 6;
                    case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                        tossReactBundleMeta4 = (TossReactBundleMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 18, TossReactBundleMeta$.serializer.INSTANCE, tossReactBundleMeta4);
                        i4 = 262144;
                        i12 |= i4;
                        c2 = 6;
                    case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19);
                        i5 = 524288;
                        i12 |= i5;
                    case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20);
                        i5 = 1048576;
                        i12 |= i5;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i12;
            i2 = iOnTransact2;
            str = strAsInterface13;
            str2 = strAsInterface15;
            str3 = strAsInterface19;
            str4 = strAsInterface20;
            str5 = strAsInterface21;
            str6 = strAsInterface22;
            str7 = strAsInterface23;
            j = jIAuthTabCallbackDefault5;
            j2 = jIAuthTabCallbackDefault6;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult4;
            zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult3;
            str8 = str16;
            str9 = strAsInterface16;
            str10 = strAsInterface17;
            str11 = strAsInterface18;
            j3 = jIAuthTabCallbackDefault4;
            tossReactBundleMeta = tossReactBundleMeta5;
            tossReactBundleMeta2 = tossReactBundleMeta4;
            str12 = strAsInterface14;
            str13 = str15;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PreparedRnBundleSnapshot(i, i2, str7, j2, str6, str4, str3, str13, str5, str, str11, str12, j3, j, str10, str9, str8, str2, tossReactBundleMeta, tossReactBundleMeta2, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m13deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PreparedRnBundleSnapshot preparedRnBundleSnapshotDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = onWarmupCompleted + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return preparedRnBundleSnapshotDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PreparedRnBundleSnapshot preparedRnBundleSnapshot) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(preparedRnBundleSnapshot, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PreparedRnBundleSnapshot.onExtraCallbackWithResult(preparedRnBundleSnapshot, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PreparedRnBundleSnapshot) obj);
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
