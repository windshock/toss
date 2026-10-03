package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.ReviewContents;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class ReviewContents$EvaluationContent$Item$$serializer implements aeu2<ReviewContents.EvaluationContent.Item> {
    public static final ReviewContents$EvaluationContent$Item$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ReviewContents$EvaluationContent$Item$$serializer reviewContents$EvaluationContent$Item$$serializer = new ReviewContents$EvaluationContent$Item$$serializer();
        INSTANCE = reviewContents$EvaluationContent$Item$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item", reviewContents$EvaluationContent$Item$$serializer, 4);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        setanimationsloop.onWarmupCompleted("mainText", true);
        setanimationsloop.onWarmupCompleted("badge", true);
        setanimationsloop.onWarmupCompleted("rate", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 39;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ReviewContents$EvaluationContent$Item$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(LoanProductBadge$$serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(dj3.onWarmupCompleted);
            kSerializerArr = new KSerializer[3];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[5] = kSerializerIAuthTabCallback;
            kSerializerArr[3] = kSerializerIAuthTabCallback2;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(LoanProductBadge$$serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(dj3.onWarmupCompleted);
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4};
        }
        int i3 = onWarmupCompleted + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReviewContents.EvaluationContent.Item itemM59deserialize = m59deserialize(decoder);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return itemM59deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final ReviewContents.EvaluationContent.Item m59deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        LoanProductBadge loanProductBadge;
        String str;
        Float f;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            loanProductBadge = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, LoanProductBadge$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            f = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, (Object) null);
            str2 = strAsInterface2;
            i = 15;
        } else {
            int i3 = 0;
            boolean z = true;
            LoanProductBadge loanProductBadge2 = null;
            String strAsInterface3 = null;
            Float f2 = null;
            String strAsInterface4 = null;
            while (z) {
                int i4 = onExtraCallback + 121;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 23;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        loanProductBadge2 = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, LoanProductBadge$$serializer.INSTANCE, loanProductBadge2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, f2);
                        i3 |= 8;
                    }
                } else {
                    int i7 = onWarmupCompleted + 99;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                }
            }
            loanProductBadge = loanProductBadge2;
            str = strAsInterface3;
            f = f2;
            str2 = strAsInterface4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ReviewContents.EvaluationContent.Item(i, str, str2, loanProductBadge, f, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ReviewContents.EvaluationContent.Item) obj);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ReviewContents.EvaluationContent.Item item) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(item, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ReviewContents.EvaluationContent.Item.IAuthTabCallback(item, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
