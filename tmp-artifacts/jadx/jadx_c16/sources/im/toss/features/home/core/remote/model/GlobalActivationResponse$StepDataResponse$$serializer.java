package im.toss.features.home.core.remote.model;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.GlobalActivationResponse;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$ActivationGradientButtonResponse$;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$ActivationResourceResponse$;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$ActivationSpendingResponse$;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$ContentButtonResponse$;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$MydataTrialResponse$;
import im.toss.features.home.core.remote.model.GlobalActivationResponse$TrialTooltipResponse$;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GlobalActivationResponse$StepDataResponse$$serializer implements aeu2<GlobalActivationResponse.StepDataResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final GlobalActivationResponse$StepDataResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        GlobalActivationResponse$StepDataResponse$$serializer globalActivationResponse$StepDataResponse$$serializer = new GlobalActivationResponse$StepDataResponse$$serializer();
        INSTANCE = globalActivationResponse$StepDataResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.GlobalActivationResponse.StepDataResponse", globalActivationResponse$StepDataResponse$$serializer, 22);
        Object[] objArr = new Object[1];
        a(new int[]{-764013906, -1624458223, -362060869, 943224537}, AndroidCharacter.getMirror('0') - '+', objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{1167529814, 174657680, -719868667, -724826009}, ((byte) KeyEvent.getModifierMetaStateMask()) + 9, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("content", true);
        setanimationsloop.onWarmupCompleted("contentImageUrl", true);
        setanimationsloop.onWarmupCompleted("contentButton", true);
        setanimationsloop.onWarmupCompleted("landingScheme", true);
        Object[] objArr3 = new Object[1];
        a(new int[]{125730355, 479351717, 1940718001, 1866597657}, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("logServiceType", true);
        setanimationsloop.onWarmupCompleted("banks", true);
        setanimationsloop.onWarmupCompleted("suffixText", true);
        setanimationsloop.onWarmupCompleted("ctaText", true);
        setanimationsloop.onWarmupCompleted("landingPageUrl", true);
        setanimationsloop.onWarmupCompleted("topText", true);
        Object[] objArr4 = new Object[1];
        a(new int[]{-2006903418, 143198974, 1064429415, 536757260, 232461897, 43043694}, ImageFormat.getBitsPerPixel(0) + 11, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("selectedResource", true);
        setanimationsloop.onWarmupCompleted("progressResource", true);
        setanimationsloop.onWarmupCompleted("days", true);
        setanimationsloop.onWarmupCompleted("positiveButton", true);
        setanimationsloop.onWarmupCompleted("cards", true);
        setanimationsloop.onWarmupCompleted("mydata", true);
        setanimationsloop.onWarmupCompleted("spending", true);
        setanimationsloop.onWarmupCompleted("tooltip", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 121;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private GlobalActivationResponse$StepDataResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = GlobalActivationResponse.StepDataResponse.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(GlobalActivationResponse$ContentButtonResponse$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback9 = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[8].getValue());
        KSerializer<?> kSerializerIAuthTabCallback10 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback11 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback12 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback13 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback14 = sp.IAuthTabCallback(getwrigglelayout);
        GlobalActivationResponse$ActivationResourceResponse$.serializer serializerVar = GlobalActivationResponse$ActivationResourceResponse$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8, kSerializerIAuthTabCallback9, kSerializerIAuthTabCallback10, kSerializerIAuthTabCallback11, kSerializerIAuthTabCallback12, kSerializerIAuthTabCallback13, kSerializerIAuthTabCallback14, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[16].getValue()), sp.IAuthTabCallback(GlobalActivationResponse$ActivationGradientButtonResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[18].getValue()), sp.IAuthTabCallback(GlobalActivationResponse$MydataTrialResponse$.serializer.INSTANCE), sp.IAuthTabCallback(GlobalActivationResponse$ActivationSpendingResponse$.serializer.INSTANCE), sp.IAuthTabCallback(GlobalActivationResponse$TrialTooltipResponse$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GlobalActivationResponse.StepDataResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        String str2;
        GlobalActivationResponse.ActivationSpendingResponse activationSpendingResponse;
        GlobalActivationResponse.MydataTrialResponse mydataTrialResponse;
        List list;
        GlobalActivationResponse.ActivationResourceResponse activationResourceResponse;
        List list2;
        GlobalActivationResponse.ActivationGradientButtonResponse activationGradientButtonResponse;
        GlobalActivationResponse.ActivationResourceResponse activationResourceResponse2;
        GlobalActivationResponse.TrialTooltipResponse trialTooltipResponse;
        String str3;
        String str4;
        GlobalActivationResponse.ContentButtonResponse contentButtonResponse;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list3;
        String str10;
        String str11;
        String str12;
        String str13;
        Lazy[] lazyArr;
        String str14;
        String str15;
        GlobalActivationResponse.ActivationSpendingResponse activationSpendingResponse2;
        String str16;
        GlobalActivationResponse.ActivationSpendingResponse activationSpendingResponse3;
        int i2;
        List list4;
        int i3;
        int i4;
        int i5;
        String str17;
        Lazy[] lazyArr2;
        String str18;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = GlobalActivationResponse.StepDataResponse.onNavigationEvent();
        List list5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = IAuthTabCallback + 73;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            GlobalActivationResponse.ContentButtonResponse contentButtonResponse2 = (GlobalActivationResponse.ContentButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, GlobalActivationResponse$ContentButtonResponse$.serializer.INSTANCE, (Object) null);
            String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnNavigationEvent[8].getValue(), (Object) null);
            String str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            String str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            String str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            String str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            String str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, (Object) null);
            GlobalActivationResponse$ActivationResourceResponse$.serializer serializerVar = GlobalActivationResponse$ActivationResourceResponse$.serializer.INSTANCE;
            GlobalActivationResponse.ActivationResourceResponse activationResourceResponse3 = (GlobalActivationResponse.ActivationResourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, serializerVar, (Object) null);
            GlobalActivationResponse.ActivationResourceResponse activationResourceResponse4 = (GlobalActivationResponse.ActivationResourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, serializerVar, (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, (jp) lazyArrOnNavigationEvent[16].getValue(), (Object) null);
            GlobalActivationResponse.ActivationGradientButtonResponse activationGradientButtonResponse2 = (GlobalActivationResponse.ActivationGradientButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, GlobalActivationResponse$ActivationGradientButtonResponse$.serializer.INSTANCE, (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, (jp) lazyArrOnNavigationEvent[18].getValue(), (Object) null);
            GlobalActivationResponse.MydataTrialResponse mydataTrialResponse2 = (GlobalActivationResponse.MydataTrialResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, GlobalActivationResponse$MydataTrialResponse$.serializer.INSTANCE, (Object) null);
            GlobalActivationResponse.ActivationSpendingResponse activationSpendingResponse4 = (GlobalActivationResponse.ActivationSpendingResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, GlobalActivationResponse$ActivationSpendingResponse$.serializer.INSTANCE, (Object) null);
            mydataTrialResponse = mydataTrialResponse2;
            trialTooltipResponse = (GlobalActivationResponse.TrialTooltipResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, GlobalActivationResponse$TrialTooltipResponse$.serializer.INSTANCE, (Object) null);
            list = list8;
            i = 4194303;
            str8 = str23;
            str7 = str22;
            contentButtonResponse = contentButtonResponse2;
            str4 = str19;
            list3 = list6;
            str5 = str20;
            str11 = str24;
            str10 = str26;
            str9 = str25;
            str12 = str27;
            activationGradientButtonResponse = activationGradientButtonResponse2;
            list2 = list7;
            activationResourceResponse = activationResourceResponse3;
            activationSpendingResponse = activationSpendingResponse4;
            str3 = str30;
            activationResourceResponse2 = activationResourceResponse4;
            str2 = str29;
            str = str28;
            str6 = str21;
        } else {
            int i9 = 0;
            boolean z = true;
            String str31 = null;
            String str32 = null;
            GlobalActivationResponse.ActivationSpendingResponse activationSpendingResponse5 = null;
            GlobalActivationResponse.MydataTrialResponse mydataTrialResponse3 = null;
            List list9 = null;
            GlobalActivationResponse.ActivationResourceResponse activationResourceResponse5 = null;
            GlobalActivationResponse.ActivationGradientButtonResponse activationGradientButtonResponse3 = null;
            GlobalActivationResponse.ActivationResourceResponse activationResourceResponse6 = null;
            GlobalActivationResponse.TrialTooltipResponse trialTooltipResponse2 = null;
            String str33 = null;
            String str34 = null;
            GlobalActivationResponse.ContentButtonResponse contentButtonResponse3 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            List list10 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        str17 = str31;
                        lazyArr2 = lazyArrOnNavigationEvent;
                        str18 = str35;
                        z = false;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str31 = str17;
                        lazyArrOnNavigationEvent = lazyArr2;
                        str35 = str18;
                    case 0:
                        str17 = str31;
                        lazyArr2 = lazyArrOnNavigationEvent;
                        str18 = str35;
                        str34 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str34);
                        i9 |= 1;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str17;
                        lazyArrOnNavigationEvent = lazyArr2;
                        str35 = str18;
                    case 1:
                        i9 |= 2;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str36 = str36;
                        str35 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str35);
                        str31 = str31;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                    case 2:
                        str13 = str42;
                        str36 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str36);
                        i9 |= 4;
                        str40 = str40;
                        list10 = list10;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        contentButtonResponse3 = contentButtonResponse3;
                        str38 = str38;
                        str41 = str41;
                        str39 = str39;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        str37 = str37;
                        str42 = str13;
                    case 3:
                        lazyArr = lazyArrOnNavigationEvent;
                        str37 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str37);
                        i9 |= 8;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        contentButtonResponse3 = contentButtonResponse3;
                        lazyArrOnNavigationEvent = lazyArr;
                    case 4:
                        str13 = str42;
                        contentButtonResponse3 = (GlobalActivationResponse.ContentButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, GlobalActivationResponse$ContentButtonResponse$.serializer.INSTANCE, contentButtonResponse3);
                        i9 |= 16;
                        str40 = str40;
                        list10 = list10;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        str38 = str38;
                        str41 = str41;
                        str39 = str39;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        str42 = str13;
                    case 5:
                        lazyArr = lazyArrOnNavigationEvent;
                        str38 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str38);
                        i9 |= 32;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        str41 = str41;
                        lazyArrOnNavigationEvent = lazyArr;
                    case 6:
                        lazyArr = lazyArrOnNavigationEvent;
                        str41 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str41);
                        i9 |= 64;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        str39 = str39;
                        lazyArrOnNavigationEvent = lazyArr;
                    case 7:
                        lazyArr = lazyArrOnNavigationEvent;
                        str39 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str39);
                        i9 |= 128;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str31;
                        lazyArrOnNavigationEvent = lazyArr;
                    case 8:
                        str14 = str31;
                        str15 = str32;
                        activationSpendingResponse2 = activationSpendingResponse5;
                        list10 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnNavigationEvent[8].getValue(), list10);
                        i9 |= 256;
                        activationSpendingResponse5 = activationSpendingResponse2;
                        str32 = str15;
                        str31 = str14;
                    case 9:
                        String str43 = str31;
                        str13 = str42;
                        str40 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str40);
                        i9 |= 512;
                        int i10 = onNavigationEvent + 61;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                        str31 = str43;
                        str42 = str13;
                    case 10:
                        str15 = str32;
                        activationSpendingResponse2 = activationSpendingResponse5;
                        str14 = str31;
                        str42 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str42);
                        i9 |= 1024;
                        activationSpendingResponse5 = activationSpendingResponse2;
                        str32 = str15;
                        str31 = str14;
                    case 11:
                        str31 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, str31);
                        i9 |= 2048;
                        activationSpendingResponse5 = activationSpendingResponse5;
                        str32 = str32;
                    case 12:
                        str16 = str31;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        str32 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str32);
                        i9 |= 4096;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 13:
                        str16 = str31;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        str33 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str33);
                        i9 |= 8192;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 14:
                        str16 = str31;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        activationResourceResponse5 = (GlobalActivationResponse.ActivationResourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, GlobalActivationResponse$ActivationResourceResponse$.serializer.INSTANCE, activationResourceResponse5);
                        i9 |= 16384;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 15:
                        str16 = str31;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        i2 = 32768;
                        activationResourceResponse6 = (GlobalActivationResponse.ActivationResourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, GlobalActivationResponse$ActivationResourceResponse$.serializer.INSTANCE, activationResourceResponse6);
                        list4 = list5;
                        i3 = i2;
                        i9 |= i3;
                        list5 = list4;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 16:
                        str16 = str31;
                        list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, (jp) lazyArrOnNavigationEvent[16].getValue(), list5);
                        i3 = 65536;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        i9 |= i3;
                        list5 = list4;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 17:
                        str16 = str31;
                        activationGradientButtonResponse3 = (GlobalActivationResponse.ActivationGradientButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, GlobalActivationResponse$ActivationGradientButtonResponse$.serializer.INSTANCE, activationGradientButtonResponse3);
                        i4 = 131072;
                        i9 |= i4;
                        str31 = str16;
                    case 18:
                        str16 = str31;
                        list9 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, (jp) lazyArrOnNavigationEvent[18].getValue(), list9);
                        i4 = 262144;
                        i9 |= i4;
                        str31 = str16;
                    case 19:
                        str16 = str31;
                        activationSpendingResponse3 = activationSpendingResponse5;
                        i2 = 524288;
                        mydataTrialResponse3 = (GlobalActivationResponse.MydataTrialResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, GlobalActivationResponse$MydataTrialResponse$.serializer.INSTANCE, mydataTrialResponse3);
                        list4 = list5;
                        i3 = i2;
                        i9 |= i3;
                        list5 = list4;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 20:
                        str16 = str31;
                        i5 = 1048576;
                        activationSpendingResponse3 = (GlobalActivationResponse.ActivationSpendingResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, GlobalActivationResponse$ActivationSpendingResponse$.serializer.INSTANCE, activationSpendingResponse5);
                        list4 = list5;
                        i3 = i5;
                        i9 |= i3;
                        list5 = list4;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    case 21:
                        str16 = str31;
                        i5 = 2097152;
                        trialTooltipResponse2 = (GlobalActivationResponse.TrialTooltipResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, GlobalActivationResponse$TrialTooltipResponse$.serializer.INSTANCE, trialTooltipResponse2);
                        activationSpendingResponse3 = activationSpendingResponse5;
                        list4 = list5;
                        i3 = i5;
                        i9 |= i3;
                        list5 = list4;
                        activationSpendingResponse5 = activationSpendingResponse3;
                        str31 = str16;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str31;
            i = i9;
            str2 = str32;
            activationSpendingResponse = activationSpendingResponse5;
            mydataTrialResponse = mydataTrialResponse3;
            list = list9;
            activationResourceResponse = activationResourceResponse5;
            list2 = list5;
            activationGradientButtonResponse = activationGradientButtonResponse3;
            activationResourceResponse2 = activationResourceResponse6;
            trialTooltipResponse = trialTooltipResponse2;
            str3 = str33;
            str4 = str34;
            contentButtonResponse = contentButtonResponse3;
            str5 = str35;
            str6 = str36;
            str7 = str37;
            str8 = str38;
            str9 = str39;
            list3 = list10;
            str10 = str40;
            str11 = str41;
            str12 = str42;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GlobalActivationResponse.StepDataResponse(i, str4, str5, str6, str7, contentButtonResponse, str8, str11, str9, list3, str10, str12, str, str2, str3, activationResourceResponse, activationResourceResponse2, list2, activationGradientButtonResponse, list, mydataTrialResponse, activationSpendingResponse, trialTooltipResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m541deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        GlobalActivationResponse.StepDataResponse stepDataResponseDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return stepDataResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GlobalActivationResponse.StepDataResponse stepDataResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(stepDataResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            GlobalActivationResponse.StepDataResponse.onNavigationEvent(iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, 2031129757, -2031129757, iOnExtraCallback3, new Object[]{stepDataResponse, vylVarOnExtraCallback, serialDescriptor});
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stepDataResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback5 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback6 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        GlobalActivationResponse.StepDataResponse.onNavigationEvent(iOnExtraCallback5, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback4, 2031129757, -2031129757, iOnExtraCallback6, new Object[]{stepDataResponse, vylVarOnExtraCallback2, serialDescriptor2});
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GlobalActivationResponse.StepDataResponse) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        float f = 0.0f;
        long j = 0;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $11 + 81;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 1), View.resolveSizeAndState(0, 0, 0) + 72, 8848 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    f = 0.0f;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 72, 8848 - TextUtils.indexOf("", "", i4, i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i8 = i4;
        System.arraycopy(iArr5, i8, iArr4, i8, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i8;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $10 + 69;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 22252), View.getDefaultSize(0, 0) + 39, 10302 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 78, 7398 - (ViewConfiguration.getTouchSlop() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new int[]{1979980339, -275947045, 959352819, -1570518716, 691256576, 1856635511, -1621343438, -1305632469, 196358713, 302904030, 1297227587, 903871873, -1942799160, -2082946915, 265482505, 117124994, -587620269, 33451024};
    }
}
