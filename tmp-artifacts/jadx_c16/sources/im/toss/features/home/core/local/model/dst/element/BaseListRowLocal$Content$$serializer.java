package im.toss.features.home.core.local.model.dst.element;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
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
public final /* synthetic */ class BaseListRowLocal$Content$$serializer implements aeu2<BaseListRowLocal.Content> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final BaseListRowLocal$Content$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 37;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        BaseListRowLocal$Content$$serializer baseListRowLocal$Content$$serializer = new BaseListRowLocal$Content$$serializer();
        INSTANCE = baseListRowLocal$Content$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Content", baseListRowLocal$Content$$serializer, 11);
        Object[] objArr = new Object[1];
        a(new char[]{15308, 4704, 12329, 31264}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("centerText1", false);
        setanimationsloop.onWarmupCompleted("centerText1Alt", false);
        setanimationsloop.onWarmupCompleted("logCenterText1Alt", false);
        setanimationsloop.onWarmupCompleted("centerText2", false);
        setanimationsloop.onWarmupCompleted("centerText2Alt", false);
        setanimationsloop.onWarmupCompleted("logCenterText2Alt", false);
        setanimationsloop.onWarmupCompleted("centerText3", false);
        setanimationsloop.onWarmupCompleted("centerText3Alt", false);
        setanimationsloop.onWarmupCompleted("logCenterText3Alt", false);
        setanimationsloop.onWarmupCompleted("bottomImage", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 101;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    private BaseListRowLocal$Content$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal.Content.onExtraCallbackWithResult()[0].getValue(), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(BaseListRowLocal$Content$Image$$serializer.INSTANCE)};
        int i4 = asInterface + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Content deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        BaseListRowLocal.Content.Image image;
        int i;
        BaseListRowLocal.onExtraCallbackWithResult onextracallbackwithresult;
        String str6;
        String str7;
        String str8;
        String str9;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = BaseListRowLocal.Content.onExtraCallbackWithResult();
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 8;
        BaseListRowLocal.Content.Image image2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            BaseListRowLocal.onExtraCallbackWithResult onextracallbackwithresult2 = (BaseListRowLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            str9 = str10;
            image = (BaseListRowLocal.Content.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, BaseListRowLocal$Content$Image$$serializer.INSTANCE, (Object) null);
            str5 = str17;
            str4 = str15;
            str8 = str14;
            str2 = str13;
            str = str16;
            str3 = str12;
            str6 = str11;
            i = 2047;
            onextracallbackwithresult = onextracallbackwithresult2;
            str7 = strAsInterface;
        } else {
            boolean z = true;
            int i8 = 0;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String strAsInterface2 = null;
            String str24 = null;
            String str25 = null;
            BaseListRowLocal.onExtraCallbackWithResult onextracallbackwithresult3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 0:
                        onextracallbackwithresult3 = (BaseListRowLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), onextracallbackwithresult3);
                        i8 |= 1;
                        str23 = str23;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 1:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 2:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str23);
                        i8 |= 4;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        String str26 = str24;
                        String str27 = str25;
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str21);
                        i8 |= 8;
                        int i9 = onTransact + 21;
                        asInterface = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 3 / 3;
                        }
                        str24 = str26;
                        str25 = str27;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 4:
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str25);
                        i8 |= 16;
                        int i11 = asInterface + 59;
                        onTransact = i11 % 128;
                        int i12 = i11 % 2;
                        str24 = str24;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 5:
                        i8 |= 32;
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str24);
                        i3 = 10;
                        i4 = 9;
                    case 6:
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str22);
                        i8 |= 64;
                    case 7:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str19);
                        i8 |= 128;
                    case 8:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, getWriggleLayout.onNavigationEvent, str18);
                        i8 |= 256;
                    case 9:
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str20);
                        i8 |= 512;
                    case 10:
                        image2 = (BaseListRowLocal.Content.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, BaseListRowLocal$Content$Image$$serializer.INSTANCE, image2);
                        i8 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str28 = str23;
            str = str18;
            str2 = str24;
            str3 = str25;
            str4 = str19;
            str5 = str20;
            image = image2;
            i = i8;
            onextracallbackwithresult = onextracallbackwithresult3;
            str6 = str21;
            str7 = strAsInterface2;
            str8 = str22;
            str9 = str28;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Content(i, onextracallbackwithresult, str7, str9, str6, str3, str2, str8, str4, str, str5, image, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m288deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Content content) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(content, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Content.onWarmupCompleted(content, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(content, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Content.onWarmupCompleted(content, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asInterface + 41;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Content) obj);
        int i4 = onTransact + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 107;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int deadChar = 10 - KeyEvent.getDeadChar(i3, i3);
                        int iIndexOf = 12434 - TextUtils.indexOf("", "", i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, deadChar, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 10 - TextUtils.indexOf("", "", 0, 0), 12434 - (ViewConfiguration.getWindowTouchSlop() >> 8), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    int i13 = $11 + 71;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 16014), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19901 - View.getDefaultSize(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = (char) 23865;
        IAuthTabCallback = (char) 26007;
        onExtraCallback = (char) 57665;
        onWarmupCompleted = (char) 23948;
    }
}
