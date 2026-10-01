package im.toss.features.credit.data.remote.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.remote.model.DetailsButton$;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
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
public final /* synthetic */ class CardUsageReportResponse$$serializer implements aeu2<CardUsageReportResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final CardUsageReportResponse$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        CardUsageReportResponse$$serializer cardUsageReportResponse$$serializer = new CardUsageReportResponse$$serializer();
        INSTANCE = cardUsageReportResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.remote.model.CardUsageReportResponse", cardUsageReportResponse$$serializer, 8);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 127 - KeyEvent.normalizeMetaState(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("helpInfo", true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("currentUsageInfo", true);
        setanimationsloop.onWarmupCompleted("tipText", true);
        setanimationsloop.onWarmupCompleted("previousUsages", true);
        setanimationsloop.onWarmupCompleted("detailsButton", true);
        setanimationsloop.onWarmupCompleted("mydataLinkInfo", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 3;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CardUsageReportResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = CardUsageReportResponse.onNavigationEvent();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(HelpInfo$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(SubTitle$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(CurrentUsageInfo$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[5].getValue());
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(DetailsButton$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(MyDataLinkInfo$$serializer.INSTANCE);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, getwrigglelayout, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6};
        int i4 = IAuthTabCallbackDefault + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardUsageReportResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        SubTitle subTitle;
        CurrentUsageInfo currentUsageInfo;
        String strAsInterface2;
        List list;
        DetailsButton detailsButton;
        MyDataLinkInfo myDataLinkInfo;
        int i;
        HelpInfo helpInfo;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CardUsageReportResponse.onNavigationEvent();
        int i3 = 7;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            int i4 = 0;
            currentUsageInfo = null;
            list = null;
            subTitle = null;
            myDataLinkInfo = null;
            detailsButton = null;
            strAsInterface2 = null;
            HelpInfo helpInfo2 = null;
            strAsInterface = null;
            while (z) {
                int i5 = IAuthTabCallbackDefault + 7;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                        int i6 = IAuthTabCallbackDefault + 27;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        helpInfo2 = helpInfo2;
                        break;
                    case 1:
                        i4 |= 2;
                        helpInfo2 = (HelpInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, HelpInfo$$serializer.INSTANCE, helpInfo2);
                        break;
                    case 2:
                        subTitle = (SubTitle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SubTitle$$serializer.INSTANCE, subTitle);
                        i4 |= 4;
                        continue;
                    case 3:
                        currentUsageInfo = (CurrentUsageInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CurrentUsageInfo$$serializer.INSTANCE, currentUsageInfo);
                        i4 |= 8;
                        continue;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 |= 16;
                        continue;
                    case 5:
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), list);
                        i4 |= 32;
                        continue;
                    case 6:
                        detailsButton = (DetailsButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, DetailsButton$.serializer.INSTANCE, detailsButton);
                        i4 |= 64;
                        continue;
                    case 7:
                        myDataLinkInfo = (MyDataLinkInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, MyDataLinkInfo$$serializer.INSTANCE, myDataLinkInfo);
                        i4 |= 128;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 7;
            }
            i = i4;
            helpInfo = helpInfo2;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HelpInfo helpInfo3 = (HelpInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, HelpInfo$$serializer.INSTANCE, (Object) null);
            subTitle = (SubTitle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SubTitle$$serializer.INSTANCE, (Object) null);
            currentUsageInfo = (CurrentUsageInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CurrentUsageInfo$$serializer.INSTANCE, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            detailsButton = (DetailsButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, DetailsButton$.serializer.INSTANCE, (Object) null);
            myDataLinkInfo = (MyDataLinkInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, MyDataLinkInfo$$serializer.INSTANCE, (Object) null);
            i = 255;
            helpInfo = helpInfo3;
        }
        SubTitle subTitle2 = subTitle;
        DetailsButton detailsButton2 = detailsButton;
        String str = strAsInterface2;
        String str2 = strAsInterface;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardUsageReportResponse(i, str2, helpInfo, subTitle2, currentUsageInfo, str, list, detailsButton2, myDataLinkInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m116deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardUsageReportResponse cardUsageReportResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardUsageReportResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardUsageReportResponse.onWarmupCompleted(cardUsageReportResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardUsageReportResponse) obj);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 77 - ExpandableListView.getPackedPositionType(j), (-16756264) - Color.rgb(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 75 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!IAuthTabCallback) {
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i6 = $10 + 35;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i7 = $10 + 65;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $11 + 87;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] >> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), 12213 - ExpandableListView.getPackedPositionChild(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                try {
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 63 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf("", "") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{32565, 32568, 32573, 32516};
        onNavigationEvent = -1184333919;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
