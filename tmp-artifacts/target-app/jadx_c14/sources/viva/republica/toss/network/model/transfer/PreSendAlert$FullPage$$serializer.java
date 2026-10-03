package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.PreSendAlert;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PreSendAlert$FullPage$$serializer implements aeu2<PreSendAlert.FullPage> {
    public static final PreSendAlert$FullPage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$serializer.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$serializer.$$c(byte, int, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 1;
        IAuthTabCallback();
        PreSendAlert$FullPage$$serializer preSendAlert$FullPage$$serializer = new PreSendAlert$FullPage$$serializer();
        INSTANCE = preSendAlert$FullPage$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.PreSendAlert.FullPage", preSendAlert$FullPage$$serializer, 7);
        Object[] objArr = new Object[1];
        a(4 - (ViewConfiguration.getWindowTouchSlop() >> 8), 3 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{'\t', 4, 65525, 0}, true, (ViewConfiguration.getTouchSlop() >> 8) + 271, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(5 - ((Process.getThreadPriority(0) + 20) >> 6), 1 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{65532, 7, 65528, 65535, 7}, true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 268, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(7 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 6, new char[]{65528, '\n', '\n', 65532, 4, 65532, 65534}, true, View.resolveSize(0, 0) + 264, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("buttonInfo", true);
        setanimationsloop.onWarmupCompleted("logParams", true);
        setanimationsloop.onWarmupCompleted("iconInfo", true);
        Object[] objArr4 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, 6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{17, 65516, 17, '\b', 65533, 65534, 65532, 11, 65500, 1, 11, '\b', 4, 65529}, false, 263 - View.MeasureSpec.getMode(0), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PreSendAlert$FullPage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        Lazy[] lazyArr = (Lazy[]) PreSendAlert.FullPage.onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -1322463959, 1322463959);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(PreSendAlert$ButtonInfo$$serializer.INSTANCE), lazyArr[4].getValue(), sp.IAuthTabCallback((KSerializer) lazyArr[5].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[6].getValue())};
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        PreSendAlert.FullPage fullPageM92deserialize = m92deserialize(decoder);
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fullPageM92deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PreSendAlert.FullPage m92deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        Map map;
        PreSendAlert.IconInfo iconInfo;
        PreSendAlert.FdsDisplayType fdsDisplayType;
        int i;
        String str;
        PreSendAlert.ButtonInfo buttonInfo;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        Lazy[] lazyArr = (Lazy[]) PreSendAlert.FullPage.onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -1322463959, 1322463959);
        String str2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            boolean z = true;
            PreSendAlert.ButtonInfo buttonInfo2 = null;
            fdsDisplayType = null;
            iconInfo = null;
            map = null;
            strAsInterface2 = null;
            strAsInterface = null;
            while (z) {
                int i3 = IAuthTabCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i |= 4;
                        break;
                    case 3:
                        buttonInfo2 = (PreSendAlert.ButtonInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PreSendAlert$ButtonInfo$$serializer.INSTANCE, buttonInfo2);
                        i |= 8;
                        break;
                    case 4:
                        map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), map);
                        i |= 16;
                        break;
                    case 5:
                        iconInfo = (PreSendAlert.IconInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArr[5].getValue(), iconInfo);
                        i |= 32;
                        int i5 = IAuthTabCallback + 95;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        break;
                    case 6:
                        fdsDisplayType = (PreSendAlert.FdsDisplayType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), fdsDisplayType);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i7 = onNavigationEvent + 67;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            buttonInfo = buttonInfo2;
            str = str2;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            PreSendAlert.ButtonInfo buttonInfo3 = (PreSendAlert.ButtonInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PreSendAlert$ButtonInfo$$serializer.INSTANCE, (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), (Object) null);
            iconInfo = (PreSendAlert.IconInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArr[5].getValue(), (Object) null);
            fdsDisplayType = (PreSendAlert.FdsDisplayType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            i = 127;
            str = str3;
            buttonInfo = buttonInfo3;
        }
        PreSendAlert.IconInfo iconInfo2 = iconInfo;
        Map map2 = map;
        String str4 = strAsInterface2;
        String str5 = strAsInterface;
        int i9 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PreSendAlert.FullPage(i9, str5, str4, str, buttonInfo, map2, iconInfo2, fdsDisplayType, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PreSendAlert.FullPage) obj);
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PreSendAlert.FullPage fullPage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fullPage, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PreSendAlert.FullPage.onNavigationEvent(fullPage, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fullPage, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PreSendAlert.FullPage.onNavigationEvent(fullPage, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 0 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$serializer.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onExtraCallback = 478309046;
    }
}
