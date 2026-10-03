package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
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
public final /* synthetic */ class TransferResultPage$Display$$serializer implements aeu2<TransferResultPage.Display> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final TransferResultPage$Display$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, byte r7) {
        /*
            byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage$Display$$serializer.$$a
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 + 109
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$Display$$serializer.$$c(int, int, byte):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 59;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback = 1;
        onExtraCallbackWithResult();
        TransferResultPage$Display$$serializer transferResultPage$Display$$serializer = new TransferResultPage$Display$$serializer();
        INSTANCE = transferResultPage$Display$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("DISPLAY_RESULT_PAGE", transferResultPage$Display$$serializer, 20);
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getTouchSlop() >> 8) + 9267), (-69071575) - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{20052, 63679, 35560, 10987, 8472}, new char[]{62236, 2499, 48102, 3530}, new char[]{10520, 57869, 13307, 33572}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((char) TextUtils.getOffsetAfter("", 0), (-522503318) - (ViewConfiguration.getTouchSlop() >> 8), new char[]{4541, 34386, 23745, 59215, 50442, 35717, 41055, 8252, 21729, 30665, 44043}, new char[]{62236, 2499, 48102, 3530}, new char[]{27247, 56123, 48352, 45761}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("lottie", false);
        setanimationsloop.onWarmupCompleted("webP", true);
        setanimationsloop.onWarmupCompleted("memoLayout", true);
        setanimationsloop.onWarmupCompleted("pointToast", true);
        setanimationsloop.onWarmupCompleted("bottomCTALayout", true);
        setanimationsloop.onWarmupCompleted("navigationTitle", true);
        setanimationsloop.onWarmupCompleted("navBarButton", true);
        setanimationsloop.onWarmupCompleted("hapticType", true);
        setanimationsloop.onWarmupCompleted(setMediationService.onNavigationEvent, true);
        setanimationsloop.onWarmupCompleted("suggestion", true);
        Object[] objArr3 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 84832381 - Color.argb(0, 0, 0, 0), new char[]{62232, 34934, 49553, 'M', 15000, 54416, 53092}, new char[]{62236, 2499, 48102, 3530}, new char[]{32002, 3696, 9989, 35734}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("listRowBannerLayout", true);
        setanimationsloop.onWarmupCompleted("bridgePageInfo", true);
        setanimationsloop.onWarmupCompleted("messageCard", true);
        setanimationsloop.onWarmupCompleted("backAction", true);
        setanimationsloop.onWarmupCompleted("impressionAction", true);
        setanimationsloop.onWarmupCompleted("clearStack", true);
        setanimationsloop.onWarmupCompleted("logStatus", true);
        setanimationsloop.onWarmupCompleted(new TransferResultPage$Redirect$$serializer.onNavigationEvent("behavior"));
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferResultPage$Display$$serializer() {
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 121;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int packedPositionType = 43 - ExpandableListView.getPackedPositionType(0L);
                    int mirror = AndroidCharacter.getMirror('0') + 1403;
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, packedPositionType, mirror, 228868077, false, $$c(b2, b2, b), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cRed = (char) (49123 - Color.red(0));
                        int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i6 = 1494 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b3 = (byte) ($$a[0] - 1);
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, windowTouchSlop, i6, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 23972), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), 12577 - (ViewConfiguration.getPressedStateDuration() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $10 + 65;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) TransferResultPage.Display.onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 351088307, -351088306, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[0]);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializer2 = TransferResultPage$ImageResource$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(TransferResultPage$MemoLayout$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(TransferResultPage$PointToast$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(TransferResultPage$BottomCTALayout$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(TransferResultPage$ButtonLayout$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback((KSerializer) lazyArr[9].getValue());
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback(TransferResultPage$TitleInfo$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback(TransferResultPage$Suggestion$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback9 = sp.IAuthTabCallback(TransferResultPage$LogInfo$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback10 = sp.IAuthTabCallback(TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback11 = sp.IAuthTabCallback(BridgeModel$Page$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback12 = sp.IAuthTabCallback(TransferResultPage$MessageCardInfo$$serializer.INSTANCE);
        TransferResultPage$SchemeActionInfo$$serializer transferResultPage$SchemeActionInfo$$serializer = TransferResultPage$SchemeActionInfo$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer2, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializer, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8, kSerializerIAuthTabCallback9, kSerializerIAuthTabCallback10, kSerializerIAuthTabCallback11, kSerializerIAuthTabCallback12, sp.IAuthTabCallback(transferResultPage$SchemeActionInfo$$serializer), sp.IAuthTabCallback(transferResultPage$SchemeActionInfo$$serializer), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallbackDefault + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.Display displayM106deserialize = m106deserialize(decoder);
        int i4 = onTransact + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return displayM106deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.Display m106deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TransferResultPage.TitleInfo titleInfo;
        TransferResultPage.BottomCTALayout bottomCTALayout;
        TransferResultPage.ImageResource imageResource;
        String str;
        TransferResultPage.LogInfo logInfo;
        BridgeModel.Page page;
        TransferResultPage.SchemeActionInfo schemeActionInfo;
        TransferResultPage.SchemeActionInfo schemeActionInfo2;
        TransferResultPage.ImageResource imageResource2;
        TransferResultPage.PointToast pointToast;
        TransferResultPage.MessageCardInfo messageCardInfo;
        TransferResultPage.ListRowBannerLayout listRowBannerLayout;
        String str2;
        String str3;
        TransferResultPage.MemoLayout memoLayout;
        boolean z;
        TransferResultPage.ButtonLayout buttonLayout;
        TransferResultPage.Suggestion suggestion;
        TransferResultPage.HapticType hapticType;
        String str4;
        TransferResultPage.ListRowBannerLayout listRowBannerLayout2;
        TransferResultPage.MessageCardInfo messageCardInfo2;
        TransferResultPage.HapticType hapticType2;
        int i2;
        TransferResultPage.ListRowBannerLayout listRowBannerLayout3;
        TransferResultPage.MessageCardInfo messageCardInfo3;
        TransferResultPage.ImageResource imageResource3;
        TransferResultPage.HapticType hapticType3;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = onTransact + 5;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) TransferResultPage.Display.onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 351088307, -351088306, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[0]);
        TransferResultPage.SchemeActionInfo schemeActionInfo3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = onTransact + 11;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            TransferResultPage$ImageResource$$serializer transferResultPage$ImageResource$$serializer = TransferResultPage$ImageResource$$serializer.INSTANCE;
            TransferResultPage.ImageResource imageResource4 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, transferResultPage$ImageResource$$serializer, (Object) null);
            TransferResultPage.ImageResource imageResource5 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, transferResultPage$ImageResource$$serializer, (Object) null);
            TransferResultPage.MemoLayout memoLayout2 = (TransferResultPage.MemoLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TransferResultPage$MemoLayout$$serializer.INSTANCE, (Object) null);
            TransferResultPage.PointToast pointToast2 = (TransferResultPage.PointToast) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$PointToast$$serializer.INSTANCE, (Object) null);
            TransferResultPage.BottomCTALayout bottomCTALayout2 = (TransferResultPage.BottomCTALayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TransferResultPage$BottomCTALayout$$serializer.INSTANCE, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            TransferResultPage.ButtonLayout buttonLayout2 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$ButtonLayout$$serializer.INSTANCE, (Object) null);
            TransferResultPage.HapticType hapticType4 = (TransferResultPage.HapticType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArr[9].getValue(), (Object) null);
            TransferResultPage.TitleInfo titleInfo2 = (TransferResultPage.TitleInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, TransferResultPage$TitleInfo$$serializer.INSTANCE, (Object) null);
            TransferResultPage.Suggestion suggestion2 = (TransferResultPage.Suggestion) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, TransferResultPage$Suggestion$$serializer.INSTANCE, (Object) null);
            logInfo = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, TransferResultPage$LogInfo$$serializer.INSTANCE, (Object) null);
            TransferResultPage.ListRowBannerLayout listRowBannerLayout4 = (TransferResultPage.ListRowBannerLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE, (Object) null);
            BridgeModel.Page page2 = (BridgeModel.Page) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BridgeModel$Page$$serializer.INSTANCE, (Object) null);
            TransferResultPage.MessageCardInfo messageCardInfo4 = (TransferResultPage.MessageCardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, TransferResultPage$MessageCardInfo$$serializer.INSTANCE, (Object) null);
            TransferResultPage$SchemeActionInfo$$serializer transferResultPage$SchemeActionInfo$$serializer = TransferResultPage$SchemeActionInfo$$serializer.INSTANCE;
            TransferResultPage.SchemeActionInfo schemeActionInfo4 = (TransferResultPage.SchemeActionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, transferResultPage$SchemeActionInfo$$serializer, (Object) null);
            TransferResultPage.SchemeActionInfo schemeActionInfo5 = (TransferResultPage.SchemeActionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, transferResultPage$SchemeActionInfo$$serializer, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, (Object) null);
            suggestion = suggestion2;
            titleInfo = titleInfo2;
            hapticType = hapticType4;
            imageResource = imageResource4;
            i = 1048575;
            str2 = strAsInterface;
            str3 = strAsInterface2;
            imageResource2 = imageResource5;
            str4 = strAsInterface3;
            buttonLayout = buttonLayout2;
            bottomCTALayout = bottomCTALayout2;
            memoLayout = memoLayout2;
            pointToast = pointToast2;
            page = page2;
            schemeActionInfo = schemeActionInfo5;
            listRowBannerLayout = listRowBannerLayout4;
            z = zOnExtraCallbackWithResult;
            schemeActionInfo2 = schemeActionInfo4;
            messageCardInfo = messageCardInfo4;
        } else {
            i = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            TransferResultPage.ListRowBannerLayout listRowBannerLayout5 = null;
            TransferResultPage.MessageCardInfo messageCardInfo5 = null;
            String str5 = null;
            TransferResultPage.LogInfo logInfo2 = null;
            BridgeModel.Page page3 = null;
            TransferResultPage.HapticType hapticType5 = null;
            TransferResultPage.SchemeActionInfo schemeActionInfo6 = null;
            TransferResultPage.Suggestion suggestion3 = null;
            titleInfo = null;
            TransferResultPage.ImageResource imageResource6 = null;
            TransferResultPage.PointToast pointToast3 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            TransferResultPage.BottomCTALayout bottomCTALayout3 = null;
            TransferResultPage.MemoLayout memoLayout3 = null;
            TransferResultPage.ButtonLayout buttonLayout3 = null;
            TransferResultPage.ImageResource imageResource7 = null;
            String strAsInterface6 = null;
            while (z2) {
                int i10 = onTransact + 121;
                TransferResultPage.HapticType hapticType6 = hapticType5;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % i4 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        listRowBannerLayout3 = listRowBannerLayout5;
                        messageCardInfo3 = messageCardInfo5;
                        imageResource3 = imageResource7;
                        hapticType3 = hapticType6;
                        i3 = i4;
                        z2 = false;
                        i4 = i3;
                        messageCardInfo5 = messageCardInfo3;
                        listRowBannerLayout5 = listRowBannerLayout3;
                        hapticType5 = hapticType3;
                        imageResource7 = imageResource3;
                    case 0:
                        listRowBannerLayout3 = listRowBannerLayout5;
                        messageCardInfo3 = messageCardInfo5;
                        imageResource3 = imageResource7;
                        hapticType3 = hapticType6;
                        i3 = i4;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        i4 = i3;
                        messageCardInfo5 = messageCardInfo3;
                        listRowBannerLayout5 = listRowBannerLayout3;
                        hapticType5 = hapticType3;
                        imageResource7 = imageResource3;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        listRowBannerLayout3 = listRowBannerLayout5;
                        messageCardInfo3 = messageCardInfo5;
                        imageResource3 = imageResource7;
                        hapticType3 = hapticType6;
                        i3 = i4;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        i4 = i3;
                        messageCardInfo5 = messageCardInfo3;
                        listRowBannerLayout5 = listRowBannerLayout3;
                        hapticType5 = hapticType3;
                        imageResource7 = imageResource3;
                    case 2:
                        imageResource3 = imageResource7;
                        imageResource6 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TransferResultPage$ImageResource$$serializer.INSTANCE, imageResource6);
                        i |= 4;
                        i4 = 2;
                        bottomCTALayout3 = bottomCTALayout3;
                        buttonLayout3 = buttonLayout3;
                        pointToast3 = pointToast3;
                        messageCardInfo5 = messageCardInfo5;
                        listRowBannerLayout5 = listRowBannerLayout5;
                        hapticType5 = hapticType6;
                        memoLayout3 = memoLayout3;
                        imageResource7 = imageResource3;
                    case 3:
                        i |= 8;
                        listRowBannerLayout5 = listRowBannerLayout5;
                        hapticType5 = hapticType6;
                        memoLayout3 = memoLayout3;
                        imageResource7 = (TransferResultPage.ImageResource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TransferResultPage$ImageResource$$serializer.INSTANCE, imageResource7);
                        messageCardInfo5 = messageCardInfo5;
                        i4 = 2;
                    case 4:
                        listRowBannerLayout2 = listRowBannerLayout5;
                        messageCardInfo2 = messageCardInfo5;
                        hapticType2 = hapticType6;
                        memoLayout3 = (TransferResultPage.MemoLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TransferResultPage$MemoLayout$$serializer.INSTANCE, memoLayout3);
                        i |= 16;
                        pointToast3 = pointToast3;
                        messageCardInfo5 = messageCardInfo2;
                        listRowBannerLayout5 = listRowBannerLayout2;
                        hapticType5 = hapticType2;
                        i4 = 2;
                    case 5:
                        listRowBannerLayout2 = listRowBannerLayout5;
                        hapticType2 = hapticType6;
                        messageCardInfo2 = messageCardInfo5;
                        pointToast3 = (TransferResultPage.PointToast) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$PointToast$$serializer.INSTANCE, pointToast3);
                        i |= 32;
                        messageCardInfo5 = messageCardInfo2;
                        listRowBannerLayout5 = listRowBannerLayout2;
                        hapticType5 = hapticType2;
                        i4 = 2;
                    case 6:
                        hapticType2 = hapticType6;
                        listRowBannerLayout2 = listRowBannerLayout5;
                        bottomCTALayout3 = (TransferResultPage.BottomCTALayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TransferResultPage$BottomCTALayout$$serializer.INSTANCE, bottomCTALayout3);
                        i |= 64;
                        buttonLayout3 = buttonLayout3;
                        listRowBannerLayout5 = listRowBannerLayout2;
                        hapticType5 = hapticType2;
                        i4 = 2;
                    case 7:
                        hapticType2 = hapticType6;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i |= 128;
                        hapticType5 = hapticType2;
                        i4 = 2;
                    case 8:
                        hapticType2 = hapticType6;
                        buttonLayout3 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$ButtonLayout$$serializer.INSTANCE, buttonLayout3);
                        i |= 256;
                        hapticType5 = hapticType2;
                        i4 = 2;
                    case 9:
                        TransferResultPage.HapticType hapticType7 = (TransferResultPage.HapticType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArr[9].getValue(), hapticType6);
                        i |= 512;
                        int i11 = onTransact + 1;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        hapticType5 = hapticType7;
                        i4 = 2;
                    case 10:
                        titleInfo = (TransferResultPage.TitleInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, TransferResultPage$TitleInfo$$serializer.INSTANCE, titleInfo);
                        i |= 1024;
                        hapticType5 = hapticType6;
                    case 11:
                        suggestion3 = (TransferResultPage.Suggestion) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, TransferResultPage$Suggestion$$serializer.INSTANCE, suggestion3);
                        i |= 2048;
                        hapticType5 = hapticType6;
                    case 12:
                        logInfo2 = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, TransferResultPage$LogInfo$$serializer.INSTANCE, logInfo2);
                        i |= 4096;
                        hapticType5 = hapticType6;
                    case 13:
                        listRowBannerLayout5 = (TransferResultPage.ListRowBannerLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE, listRowBannerLayout5);
                        i |= 8192;
                        hapticType5 = hapticType6;
                    case 14:
                        page3 = (BridgeModel.Page) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BridgeModel$Page$$serializer.INSTANCE, page3);
                        i |= 16384;
                        hapticType5 = hapticType6;
                    case 15:
                        messageCardInfo5 = (TransferResultPage.MessageCardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, TransferResultPage$MessageCardInfo$$serializer.INSTANCE, messageCardInfo5);
                        i2 = 32768;
                        i |= i2;
                        hapticType5 = hapticType6;
                    case 16:
                        schemeActionInfo3 = (TransferResultPage.SchemeActionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, TransferResultPage$SchemeActionInfo$$serializer.INSTANCE, schemeActionInfo3);
                        int i13 = onTransact + 69;
                        IAuthTabCallbackDefault = i13 % 128;
                        if (i13 % i4 != 0) {
                            int i14 = 5 % 3;
                        }
                        i2 = 65536;
                        i |= i2;
                        hapticType5 = hapticType6;
                    case 17:
                        schemeActionInfo6 = (TransferResultPage.SchemeActionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, TransferResultPage$SchemeActionInfo$$serializer.INSTANCE, schemeActionInfo6);
                        i2 = 131072;
                        i |= i2;
                        hapticType5 = hapticType6;
                    case 18:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18);
                        i |= 262144;
                        hapticType5 = hapticType6;
                    case 19:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, str5);
                        i2 = 524288;
                        i |= i2;
                        hapticType5 = hapticType6;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            TransferResultPage.HapticType hapticType8 = hapticType5;
            bottomCTALayout = bottomCTALayout3;
            imageResource = imageResource6;
            str = str5;
            logInfo = logInfo2;
            page = page3;
            schemeActionInfo = schemeActionInfo6;
            schemeActionInfo2 = schemeActionInfo3;
            imageResource2 = imageResource7;
            pointToast = pointToast3;
            messageCardInfo = messageCardInfo5;
            listRowBannerLayout = listRowBannerLayout5;
            str2 = strAsInterface4;
            str3 = strAsInterface5;
            memoLayout = memoLayout3;
            z = zOnExtraCallbackWithResult2;
            buttonLayout = buttonLayout3;
            suggestion = suggestion3;
            hapticType = hapticType8;
            str4 = strAsInterface6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.Display(i, str2, str3, imageResource, imageResource2, memoLayout, pointToast, bottomCTALayout, str4, buttonLayout, hapticType, titleInfo, suggestion, logInfo, listRowBannerLayout, page, messageCardInfo, schemeActionInfo2, schemeActionInfo, z, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.Display) obj);
        int i4 = onTransact + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.Display display) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(display, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.Display.onNavigationEvent(display, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(display, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferResultPage.Display.onNavigationEvent(display, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 49;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 7057342722753075431L;
        onExtraCallback = -1776194565;
        onExtraCallbackWithResult = (char) 27643;
    }
}
