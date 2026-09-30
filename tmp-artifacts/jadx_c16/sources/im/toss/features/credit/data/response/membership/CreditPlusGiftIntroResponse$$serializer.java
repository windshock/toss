package im.toss.features.credit.data.response.membership;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2$$serializer;
import im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroResponse$$serializer implements aeu2<CreditPlusGiftIntroResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final CreditPlusGiftIntroResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        CreditPlusGiftIntroResponse$$serializer creditPlusGiftIntroResponse$$serializer = new CreditPlusGiftIntroResponse$$serializer();
        INSTANCE = creditPlusGiftIntroResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse", creditPlusGiftIntroResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("headerSection", false);
        setanimationsloop.onWarmupCompleted("bodySection", false);
        Object[] objArr = new Object[1];
        a(new char[]{59907, 14607, 49963, 62293, 55219, 59891, 32864, 3434}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("disclaimer", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 89;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftIntroResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(CreditPlusGiftIntroResponse$HeaderSection$$serializer.INSTANCE), sp.IAuthTabCallback(CreditPlusGiftIntroResponse$BodySection$$serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(DisclaimerV2$$serializer.INSTANCE)};
        int i4 = asBinder + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditPlusGiftIntroResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CreditPlusGiftIntroResponse.BodySection bodySection;
        String str;
        CreditPlusGiftIntroResponse.HeaderSection headerSection;
        DisclaimerV2 disclaimerV2;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        asBinder = i3 % 128;
        String str2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CreditPlusGiftIntroResponse.HeaderSection headerSection2 = (CreditPlusGiftIntroResponse.HeaderSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditPlusGiftIntroResponse$HeaderSection$$serializer.INSTANCE, (Object) null);
            CreditPlusGiftIntroResponse.BodySection bodySection2 = (CreditPlusGiftIntroResponse.BodySection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusGiftIntroResponse$BodySection$$serializer.INSTANCE, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            headerSection = headerSection2;
            disclaimerV2 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DisclaimerV2$$serializer.INSTANCE, (Object) null);
            i = 15;
            bodySection = bodySection2;
        } else {
            CreditPlusGiftIntroResponse.BodySection bodySection3 = null;
            CreditPlusGiftIntroResponse.HeaderSection headerSection3 = null;
            DisclaimerV2 disclaimerV22 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = asInterface + 7;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i6 = 55 / 0;
                    if (iOnNavigationEvent == -1) {
                        int i7 = asInterface + 61;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        headerSection3 = (CreditPlusGiftIntroResponse.HeaderSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditPlusGiftIntroResponse$HeaderSection$$serializer.INSTANCE, headerSection3);
                        i4 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        bodySection3 = (CreditPlusGiftIntroResponse.BodySection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusGiftIntroResponse$BodySection$$serializer.INSTANCE, bodySection3);
                        i4 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i9 = asInterface + 21;
                        asBinder = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            disclaimerV22 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DisclaimerV2$$serializer.INSTANCE, disclaimerV22);
                            i4 |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            disclaimerV22 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DisclaimerV2$$serializer.INSTANCE, disclaimerV22);
                            i4 |= 8;
                        }
                    } else {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 4;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i72 = asInterface + 61;
                        asBinder = i72 % 128;
                        int i82 = i72 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            bodySection = bodySection3;
            str = str2;
            headerSection = headerSection3;
            disclaimerV2 = disclaimerV22;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftIntroResponse(i, headerSection, bodySection, str, disclaimerV2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m208deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftIntroResponse creditPlusGiftIntroResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = asInterface + 123;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return creditPlusGiftIntroResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftIntroResponse creditPlusGiftIntroResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusGiftIntroResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusGiftIntroResponse.IAuthTabCallback(creditPlusGiftIntroResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftIntroResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditPlusGiftIntroResponse.IAuthTabCallback(creditPlusGiftIntroResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftIntroResponse) obj);
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >>> 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 69;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf = 12433 - TextUtils.indexOf((CharSequence) "", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, maximumFlingVelocity, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, 12433 - ExpandableListView.getPackedPositionChild(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 16014), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 19901 - TextUtils.getOffsetBefore("", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 12073;
        onNavigationEvent = (char) 23585;
        onWarmupCompleted = (char) 24177;
        onExtraCallback = (char) 35222;
    }
}
