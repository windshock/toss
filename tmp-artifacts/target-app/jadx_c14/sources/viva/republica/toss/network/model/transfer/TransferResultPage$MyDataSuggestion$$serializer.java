package viva.republica.toss.network.model.transfer;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.setMediationService;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.BridgeModel;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$MyDataSuggestion$$serializer implements aeu2<TransferResultPage.MyDataSuggestion> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final TransferResultPage$MyDataSuggestion$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 49;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $10 + 73;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                        int threadPriority2 = 10 - ((Process.getThreadPriority(i3) + 20) >> 6);
                        int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, threadPriority2, i13, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 10, 12434 - KeyEvent.keyCodeFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 16014), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, (ViewConfiguration.getLongPressTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onExtraCallback();
        TransferResultPage$MyDataSuggestion$$serializer transferResultPage$MyDataSuggestion$$serializer = new TransferResultPage$MyDataSuggestion$$serializer();
        INSTANCE = transferResultPage$MyDataSuggestion$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("MY_DATA_SUGGESTION_PAGE", transferResultPage$MyDataSuggestion$$serializer, 18);
        Object[] objArr = new Object[1];
        a(new char[]{40225, 53247, 18251, 31985, 64157, 16727}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{17184, 63914, 21769, 19861, 27408, 57361, 13681, 23315, 7661, 26785, 61621, 17506}, (ViewConfiguration.getTouchSlop() >> 8) + 11, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("lottie", false);
        setanimationsloop.onWarmupCompleted("webP", true);
        setanimationsloop.onWarmupCompleted("memoLayout", true);
        setanimationsloop.onWarmupCompleted("pointToast", true);
        setanimationsloop.onWarmupCompleted("bottomCTALayout", false);
        setanimationsloop.onWarmupCompleted("navigationTitle", true);
        setanimationsloop.onWarmupCompleted("navBarButton", true);
        setanimationsloop.onWarmupCompleted("hapticType", true);
        setanimationsloop.onWarmupCompleted(setMediationService.onNavigationEvent, true);
        setanimationsloop.onWarmupCompleted("suggestion", true);
        Object[] objArr3 = new Object[1];
        a(new char[]{19733, 22747, 63313, 28867, 804, 29887, 55453, 42725}, View.getDefaultSize(0, 0) + 7, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("listRowBannerLayout", true);
        setanimationsloop.onWarmupCompleted("bridgePageInfo", true);
        setanimationsloop.onWarmupCompleted("messageCard", false);
        setanimationsloop.onWarmupCompleted("clearStack", true);
        setanimationsloop.onWarmupCompleted("logStatus", true);
        setanimationsloop.onWarmupCompleted(new TransferResultPage$Redirect$$serializer.onNavigationEvent("behavior"));
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 39;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private TransferResultPage$MyDataSuggestion$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = TransferResultPage.MyDataSuggestion.onNavigationEvent();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializer2 = TransferResultPage$ImageResource$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer2, sp.IAuthTabCallback(kSerializer2), sp.IAuthTabCallback(TransferResultPage$MemoLayout$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$PointToast$$serializer.INSTANCE), TransferResultPage$BottomCTALayout$$serializer.INSTANCE, kSerializer, sp.IAuthTabCallback(TransferResultPage$ButtonLayout$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[9].getValue()), sp.IAuthTabCallback(TransferResultPage$TitleInfo$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$Suggestion$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$LogInfo$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE), sp.IAuthTabCallback(BridgeModel$Page$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$MessageCardInfo$$serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(kSerializer)};
        int i4 = asBinder + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.MyDataSuggestion myDataSuggestionM118deserialize = m118deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return myDataSuggestionM118deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.MyDataSuggestion m118deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferResultPage.MessageCardInfo messageCardInfo;
        TransferResultPage.LogInfo logInfo;
        int i;
        TransferResultPage.ListRowBannerLayout listRowBannerLayout;
        BridgeModel.Page page;
        String str;
        TransferResultPage.ImageResource imageResource;
        String str2;
        boolean z;
        TransferResultPage.ImageResource imageResource2;
        TransferResultPage.BottomCTALayout bottomCTALayout;
        TransferResultPage.MemoLayout memoLayout;
        TransferResultPage.TitleInfo titleInfo;
        TransferResultPage.Suggestion suggestion;
        TransferResultPage.ButtonLayout buttonLayout;
        String strAsInterface;
        TransferResultPage.PointToast pointToast;
        TransferResultPage.HapticType hapticType;
        String str3;
        TransferResultPage.ImageResource imageResource3;
        TransferResultPage.ButtonLayout buttonLayout2;
        TransferResultPage.ImageResource imageResource4;
        Lazy[] lazyArr;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TransferResultPage.MyDataSuggestion.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallbackDefault + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            TransferResultPage$ImageResource$$serializer transferResultPage$ImageResource$$serializer = TransferResultPage$ImageResource$$serializer.INSTANCE;
            TransferResultPage.ImageResource imageResource5 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, transferResultPage$ImageResource$$serializer, (Object) null);
            TransferResultPage.ImageResource imageResource6 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, transferResultPage$ImageResource$$serializer, (Object) null);
            TransferResultPage.MemoLayout memoLayout2 = (TransferResultPage.MemoLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TransferResultPage$MemoLayout$$serializer.INSTANCE, (Object) null);
            TransferResultPage.PointToast pointToast2 = (TransferResultPage.PointToast) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$PointToast$$serializer.INSTANCE, (Object) null);
            TransferResultPage.BottomCTALayout bottomCTALayout2 = (TransferResultPage.BottomCTALayout) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, TransferResultPage$BottomCTALayout$$serializer.INSTANCE, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            TransferResultPage.ButtonLayout buttonLayout3 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$ButtonLayout$$serializer.INSTANCE, (Object) null);
            TransferResultPage.HapticType hapticType2 = (TransferResultPage.HapticType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnNavigationEvent[9].getValue(), (Object) null);
            TransferResultPage.TitleInfo titleInfo2 = (TransferResultPage.TitleInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, TransferResultPage$TitleInfo$$serializer.INSTANCE, (Object) null);
            TransferResultPage.Suggestion suggestion2 = (TransferResultPage.Suggestion) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, TransferResultPage$Suggestion$$serializer.INSTANCE, (Object) null);
            TransferResultPage.LogInfo logInfo2 = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, TransferResultPage$LogInfo$$serializer.INSTANCE, (Object) null);
            TransferResultPage.ListRowBannerLayout listRowBannerLayout2 = (TransferResultPage.ListRowBannerLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE, (Object) null);
            page = (BridgeModel.Page) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BridgeModel$Page$$serializer.INSTANCE, (Object) null);
            TransferResultPage.MessageCardInfo messageCardInfo2 = (TransferResultPage.MessageCardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, TransferResultPage$MessageCardInfo$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
            bottomCTALayout = bottomCTALayout2;
            hapticType = hapticType2;
            i = 262143;
            pointToast = pointToast2;
            str2 = strAsInterface3;
            buttonLayout = buttonLayout3;
            str3 = strAsInterface2;
            memoLayout = memoLayout2;
            imageResource2 = imageResource5;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, (Object) null);
            titleInfo = titleInfo2;
            imageResource = imageResource6;
            listRowBannerLayout = listRowBannerLayout2;
            messageCardInfo = messageCardInfo2;
            logInfo = logInfo2;
            z = zOnExtraCallbackWithResult;
            suggestion = suggestion2;
        } else {
            int i5 = 17;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            TransferResultPage.HapticType hapticType3 = null;
            TransferResultPage.MessageCardInfo messageCardInfo3 = null;
            TransferResultPage.LogInfo logInfo3 = null;
            TransferResultPage.BottomCTALayout bottomCTALayout3 = null;
            TransferResultPage.ListRowBannerLayout listRowBannerLayout3 = null;
            TransferResultPage.TitleInfo titleInfo3 = null;
            TransferResultPage.Suggestion suggestion3 = null;
            BridgeModel.Page page2 = null;
            String str4 = null;
            TransferResultPage.ImageResource imageResource7 = null;
            String strAsInterface4 = null;
            TransferResultPage.PointToast pointToast3 = null;
            TransferResultPage.MemoLayout memoLayout3 = null;
            String strAsInterface5 = null;
            TransferResultPage.ImageResource imageResource8 = null;
            String strAsInterface6 = null;
            TransferResultPage.ButtonLayout buttonLayout4 = null;
            int i6 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        imageResource3 = imageResource7;
                        buttonLayout2 = buttonLayout4;
                        imageResource4 = imageResource8;
                        i5 = 17;
                        z2 = false;
                        imageResource8 = imageResource4;
                        buttonLayout4 = buttonLayout2;
                        imageResource7 = imageResource3;
                    case 0:
                        TransferResultPage.ImageResource imageResource9 = imageResource7;
                        buttonLayout2 = buttonLayout4;
                        imageResource4 = imageResource8;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        int i7 = asBinder + 69;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        memoLayout3 = memoLayout3;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        pointToast3 = pointToast3;
                        i5 = 17;
                        imageResource3 = imageResource9;
                        imageResource8 = imageResource4;
                        buttonLayout4 = buttonLayout2;
                        imageResource7 = imageResource3;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        imageResource3 = imageResource7;
                        buttonLayout2 = buttonLayout4;
                        imageResource4 = imageResource8;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        i5 = 17;
                        imageResource8 = imageResource4;
                        buttonLayout4 = buttonLayout2;
                        imageResource7 = imageResource3;
                    case 2:
                        Lazy[] lazyArr2 = lazyArrOnNavigationEvent;
                        i6 |= 4;
                        lazyArrOnNavigationEvent = lazyArr2;
                        buttonLayout4 = buttonLayout4;
                        imageResource7 = imageResource7;
                        i5 = 17;
                        imageResource8 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TransferResultPage$ImageResource$$serializer.INSTANCE, imageResource8);
                    case 3:
                        i6 |= 8;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        buttonLayout4 = buttonLayout4;
                        i5 = 17;
                        imageResource7 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TransferResultPage$ImageResource$$serializer.INSTANCE, imageResource7);
                    case 4:
                        memoLayout3 = (TransferResultPage.MemoLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TransferResultPage$MemoLayout$$serializer.INSTANCE, memoLayout3);
                        i6 |= 16;
                        lazyArrOnNavigationEvent = lazyArrOnNavigationEvent;
                        pointToast3 = pointToast3;
                        i5 = 17;
                    case 5:
                        lazyArr = lazyArrOnNavigationEvent;
                        pointToast3 = (TransferResultPage.PointToast) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$PointToast$$serializer.INSTANCE, pointToast3);
                        i6 |= 32;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 17;
                    case 6:
                        lazyArr = lazyArrOnNavigationEvent;
                        bottomCTALayout3 = (TransferResultPage.BottomCTALayout) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, TransferResultPage$BottomCTALayout$$serializer.INSTANCE, bottomCTALayout3);
                        i6 |= 64;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 17;
                    case 7:
                        lazyArr = lazyArrOnNavigationEvent;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i6 |= 128;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 17;
                    case 8:
                        lazyArr = lazyArrOnNavigationEvent;
                        buttonLayout4 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$ButtonLayout$$serializer.INSTANCE, buttonLayout4);
                        i6 |= 256;
                        lazyArrOnNavigationEvent = lazyArr;
                        i5 = 17;
                    case 9:
                        hapticType3 = (TransferResultPage.HapticType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnNavigationEvent[9].getValue(), hapticType3);
                        i6 |= 512;
                        i5 = 17;
                    case 10:
                        titleInfo3 = (TransferResultPage.TitleInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, TransferResultPage$TitleInfo$$serializer.INSTANCE, titleInfo3);
                        i6 |= 1024;
                        i5 = 17;
                    case 11:
                        suggestion3 = (TransferResultPage.Suggestion) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, TransferResultPage$Suggestion$$serializer.INSTANCE, suggestion3);
                        i6 |= 2048;
                        i5 = 17;
                    case 12:
                        logInfo3 = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, TransferResultPage$LogInfo$$serializer.INSTANCE, logInfo3);
                        i6 |= 4096;
                        i5 = 17;
                    case 13:
                        listRowBannerLayout3 = (TransferResultPage.ListRowBannerLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE, listRowBannerLayout3);
                        i6 |= 8192;
                        i5 = 17;
                    case 14:
                        page2 = (BridgeModel.Page) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BridgeModel$Page$$serializer.INSTANCE, page2);
                        i6 |= 16384;
                        i5 = 17;
                    case 15:
                        messageCardInfo3 = (TransferResultPage.MessageCardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, TransferResultPage$MessageCardInfo$$serializer.INSTANCE, messageCardInfo3);
                        i6 |= 32768;
                        int i9 = IAuthTabCallbackDefault + 117;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 17;
                    case 16:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
                        i6 |= 65536;
                    case 17:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str4);
                        i6 |= 131072;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            messageCardInfo = messageCardInfo3;
            logInfo = logInfo3;
            i = i6;
            listRowBannerLayout = listRowBannerLayout3;
            page = page2;
            str = str4;
            imageResource = imageResource7;
            str2 = strAsInterface6;
            z = zOnExtraCallbackWithResult2;
            imageResource2 = imageResource8;
            bottomCTALayout = bottomCTALayout3;
            memoLayout = memoLayout3;
            titleInfo = titleInfo3;
            suggestion = suggestion3;
            buttonLayout = buttonLayout4;
            strAsInterface = strAsInterface4;
            pointToast = pointToast3;
            hapticType = hapticType3;
            str3 = strAsInterface5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.MyDataSuggestion(i, strAsInterface, str3, imageResource2, imageResource, memoLayout, pointToast, bottomCTALayout, str2, buttonLayout, hapticType, titleInfo, suggestion, logInfo, listRowBannerLayout, page, messageCardInfo, z, str, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.MyDataSuggestion) obj);
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.MyDataSuggestion myDataSuggestion) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(myDataSuggestion, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.MyDataSuggestion.onExtraCallbackWithResult(myDataSuggestion, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackDefault + 23;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 10386;
        IAuthTabCallback = (char) 32910;
        onExtraCallback = (char) 55337;
        onWarmupCompleted = (char) 51475;
    }
}
