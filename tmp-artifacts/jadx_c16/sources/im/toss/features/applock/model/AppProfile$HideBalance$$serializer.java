package im.toss.features.applock.model;

import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import im.toss.features.applock.model.AppProfile;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppProfile$HideBalance$$serializer implements aeu2<AppProfile.HideBalance> {
    private static int IAuthTabCallback = 0;
    public static final AppProfile$HideBalance$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AppProfile$HideBalance$$serializer appProfile$HideBalance$$serializer = new AppProfile$HideBalance$$serializer();
        INSTANCE = appProfile$HideBalance$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.applock.model.AppProfile.HideBalance", appProfile$HideBalance$$serializer, 11);
        setanimationsloop.onWarmupCompleted(BizSceneNavigateManager.KEY_ALL, true);
        setanimationsloop.onWarmupCompleted("investing", true);
        setanimationsloop.onWarmupCompleted("saving", true);
        setanimationsloop.onWarmupCompleted("loan", true);
        setanimationsloop.onWarmupCompleted("point", true);
        setanimationsloop.onWarmupCompleted("pension", true);
        setanimationsloop.onWarmupCompleted("etc", true);
        setanimationsloop.onWarmupCompleted("consumption", true);
        setanimationsloop.onWarmupCompleted("investmentPortfolio", true);
        setanimationsloop.onWarmupCompleted("groupSaving", true);
        setanimationsloop.onWarmupCompleted("store", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 115;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AppProfile$HideBalance$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getbgcolor)};
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppProfile.HideBalance deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        int i;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            Boolean bool12 = null;
            int i6 = 0;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            while (z) {
                int i7 = onExtraCallbackWithResult + 105;
                onExtraCallback = i7 % 128;
                if (i7 % i2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 10;
                        i5 = 9;
                    case 0:
                        i6 |= 1;
                        z = z;
                        i4 = 10;
                        i5 = 9;
                        bool22 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, bool22);
                        i2 = 2;
                    case 1:
                        i6 |= 2;
                        bool20 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool20);
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                    case 2:
                        bool19 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getBgColor.IAuthTabCallback, bool19);
                        i6 |= 4;
                        int i8 = onExtraCallbackWithResult + 61;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % i2;
                        bool21 = bool21;
                        i4 = 10;
                    case 3:
                        bool12 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, bool12);
                        i6 |= 8;
                        i4 = 10;
                    case 4:
                        bool16 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getBgColor.IAuthTabCallback, bool16);
                        i6 |= 16;
                        i4 = 10;
                    case 5:
                        i6 |= 32;
                        bool21 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getBgColor.IAuthTabCallback, bool21);
                        i4 = 10;
                    case 6:
                        bool17 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, bool17);
                        i6 |= 64;
                        int i10 = onExtraCallbackWithResult + 113;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % i2;
                    case 7:
                        bool13 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getBgColor.IAuthTabCallback, bool13);
                        i6 |= 128;
                    case 8:
                        bool15 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getBgColor.IAuthTabCallback, bool15);
                        i6 |= 256;
                    case 9:
                        bool14 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getBgColor.IAuthTabCallback, bool14);
                        i6 |= 512;
                    case 10:
                        bool18 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getBgColor.IAuthTabCallback, bool18);
                        i6 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            bool3 = bool12;
            bool11 = bool22;
            bool = bool20;
            bool2 = bool19;
            i = i6;
            bool5 = bool13;
            bool6 = bool14;
            bool4 = bool21;
            bool7 = bool15;
            bool8 = bool16;
            bool9 = bool17;
            bool10 = bool18;
        } else {
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            Boolean bool23 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getbgcolor, (Object) null);
            Boolean bool24 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getbgcolor, (Object) null);
            Boolean bool25 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getbgcolor, (Object) null);
            Boolean bool26 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getbgcolor, (Object) null);
            Boolean bool27 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getbgcolor, (Object) null);
            Boolean bool28 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getbgcolor, (Object) null);
            Boolean bool29 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getbgcolor, (Object) null);
            Boolean bool30 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getbgcolor, (Object) null);
            Boolean bool31 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getbgcolor, (Object) null);
            bool = bool24;
            bool2 = bool25;
            bool3 = bool26;
            bool4 = bool28;
            i = 2047;
            bool5 = bool30;
            bool6 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getbgcolor, (Object) null);
            bool7 = bool31;
            bool8 = bool27;
            bool9 = bool29;
            bool10 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getbgcolor, (Object) null);
            bool11 = bool23;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppProfile.HideBalance(i, bool11, bool, bool2, bool3, bool8, bool4, bool9, bool5, bool7, bool6, bool10, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m75deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppProfile.HideBalance hideBalanceDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return hideBalanceDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppProfile.HideBalance hideBalance) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(hideBalance, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppProfile.HideBalance.IAuthTabCallback(hideBalance, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppProfile.HideBalance) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
