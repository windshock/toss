package im.toss.features.credit.data.response;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.credit.data.response.Avatar$;
import im.toss.features.credit.data.response.QuizCta$;
import im.toss.features.credit.data.response.QuizStats$;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyQuizDetailsResponse$$serializer implements aeu2<MyQuizDetailsResponse> {
    private static int IAuthTabCallback = 1;
    public static final MyQuizDetailsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        MyQuizDetailsResponse$$serializer myQuizDetailsResponse$$serializer = new MyQuizDetailsResponse$$serializer();
        INSTANCE = myQuizDetailsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.MyQuizDetailsResponse", myQuizDetailsResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("rewardPoint", true);
        setanimationsloop.onWarmupCompleted("availableDate", true);
        setanimationsloop.onWarmupCompleted("disclaimers", true);
        setanimationsloop.onWarmupCompleted("avatar", true);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("quizzes", true);
        setanimationsloop.onWarmupCompleted("histories", true);
        setanimationsloop.onWarmupCompleted("cta", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private MyQuizDetailsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = MyQuizDetailsResponse.onExtraCallback();
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, getWriggleLayout.onNavigationEvent, lazyArrOnExtraCallback[2].getValue(), sp.IAuthTabCallback(Avatar$.serializer.INSTANCE), sp.IAuthTabCallback(QuizStats$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[5].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[6].getValue()), sp.IAuthTabCallback(QuizCta$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MyQuizDetailsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Avatar avatar;
        QuizCta quizCta;
        List list;
        List list2;
        QuizStats quizStats;
        List list3;
        String str;
        long j;
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = MyQuizDetailsResponse.onExtraCallback();
        int i4 = 7;
        QuizCta quizCta2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            Avatar avatar2 = (Avatar) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, Avatar$.serializer.INSTANCE, (Object) null);
            QuizStats quizStats2 = (QuizStats) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, QuizStats$.serializer.INSTANCE, (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            list3 = list4;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnExtraCallback[6].getValue(), (Object) null);
            str = strAsInterface;
            quizCta = (QuizCta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, QuizCta$.serializer.INSTANCE, (Object) null);
            avatar = avatar2;
            quizStats = quizStats2;
            i = 255;
            list2 = list5;
            j = jIAuthTabCallbackDefault;
        } else {
            int i7 = 0;
            boolean z2 = true;
            Avatar avatar3 = null;
            QuizStats quizStats3 = null;
            List list6 = null;
            String strAsInterface2 = null;
            long jIAuthTabCallbackDefault2 = 0;
            List list7 = null;
            List list8 = null;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                    case 0:
                        z = true;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                        list6 = list6;
                        i2 = 2;
                        i4 = 7;
                    case 1:
                        z = true;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i4 = 7;
                    case 2:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, (jp) lazyArrOnExtraCallback[i2].getValue(), list6);
                        i7 |= 4;
                        i4 = 7;
                    case 3:
                        avatar3 = (Avatar) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, Avatar$.serializer.INSTANCE, avatar3);
                        i7 |= 8;
                        i4 = 7;
                    case 4:
                        quizStats3 = (QuizStats) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, QuizStats$.serializer.INSTANCE, quizStats3);
                        i7 |= 16;
                        i4 = 7;
                    case 5:
                        list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), list8);
                        i7 |= 32;
                        int i8 = IAuthTabCallback + 103;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % i2;
                        i4 = 7;
                    case 6:
                        list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnExtraCallback[6].getValue(), list7);
                        i7 |= 64;
                    case 7:
                        quizCta2 = (QuizCta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, QuizCta$.serializer.INSTANCE, quizCta2);
                        i7 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            avatar = avatar3;
            quizCta = quizCta2;
            list = list7;
            list2 = list8;
            quizStats = quizStats3;
            list3 = list6;
            str = strAsInterface2;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MyQuizDetailsResponse(i, j, str, list3, avatar, quizStats, list2, list, quizCta, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m180deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return myQuizDetailsResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MyQuizDetailsResponse myQuizDetailsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(myQuizDetailsResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        MyQuizDetailsResponse.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1324185015, new Object[]{myQuizDetailsResponse, vylVarOnExtraCallback, serialDescriptor}, 1324185015, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MyQuizDetailsResponse) obj);
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
