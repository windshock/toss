package im.toss.feature.credit.overview.network.response;

import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class CreditTip$$serializer implements aeu2<CreditTip> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    public static final CreditTip$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        CreditTip$$serializer creditTip$$serializer = new CreditTip$$serializer();
        INSTANCE = creditTip$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.CreditTip", creditTip$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new char[]{25110, 55179, 44965, 45957, 5780, 26109}, TextUtils.lastIndexOf("", '0') + 6, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{42445, 22290, 1022, 59673, 26374, 11174, 54062, 21872, 58900, 41000, 40558, 4090}, 11 - TextUtils.indexOf("", "", 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{24771, 7986, 19418, 11635}, TextUtils.lastIndexOf("", '0', 0) + 5, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("assessmentType", true);
        setanimationsloop.onWarmupCompleted("link", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 119;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private CreditTip$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(Link$$serializer.INSTANCE)};
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditTip deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        Link link;
        String str2;
        String str3;
        String str4;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 0;
        String str5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            Link link2 = (Link) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, Link$$serializer.INSTANCE, (Object) null);
            int i4 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i = 31;
            str = str9;
            link = link2;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        } else {
            int i6 = 0;
            int i7 = 1;
            Link link3 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (i7 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallbackDefault + 67;
                    int i9 = i8 % 128;
                    IAuthTabCallbackStub = i9;
                    if (i8 % 2 != 0) {
                        int i10 = 46 / i3;
                        if (iOnNavigationEvent != 0) {
                            int i11 = i9 + 29;
                            int i12 = i11 % 128;
                            IAuthTabCallbackDefault = i12;
                            int i13 = i11 % 2;
                            if (iOnNavigationEvent == 1) {
                                int i14 = i12 + 115;
                                IAuthTabCallbackStub = i14 % 128;
                                int i15 = i14 % 2;
                                if (iOnNavigationEvent != 2) {
                                    int i16 = i12 + 87;
                                    int i17 = i16 % 128;
                                    IAuthTabCallbackStub = i17;
                                    int i18 = i16 % 2;
                                    c = 4;
                                    if (iOnNavigationEvent == 3) {
                                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                                        i6 |= 8;
                                        int i19 = IAuthTabCallbackStub + 47;
                                        IAuthTabCallbackDefault = i19 % 128;
                                        int i20 = i19 % 2;
                                    } else {
                                        if (iOnNavigationEvent != 4) {
                                            throw new UnknownFieldException(iOnNavigationEvent);
                                        }
                                        int i21 = i17 + 35;
                                        IAuthTabCallbackDefault = i21 % 128;
                                        int i22 = i21 % 2;
                                        link3 = (Link) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, Link$$serializer.INSTANCE, link3);
                                        i6 |= 16;
                                    }
                                } else {
                                    c = 4;
                                    str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str12);
                                    i6 |= 4;
                                }
                            } else {
                                c = 4;
                                str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str11);
                                i6 |= 2;
                            }
                            i3 = 0;
                        } else {
                            str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str10);
                            i6 |= 1;
                            i3 = 0;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        int i112 = i9 + 29;
                        int i122 = i112 % 128;
                        IAuthTabCallbackDefault = i122;
                        int i132 = i112 % 2;
                        if (iOnNavigationEvent == 1) {
                        }
                        i3 = 0;
                    } else {
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str10);
                        i6 |= 1;
                        i3 = 0;
                    }
                } else {
                    i7 = i3;
                }
            }
            i = i6;
            str = str5;
            link = link3;
            str2 = str10;
            str3 = str11;
            str4 = str12;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditTip(i, str2, str3, str4, str, link, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m341deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CreditTip creditTipDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return creditTipDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditTip creditTip) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditTip, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditTip.onExtraCallbackWithResult(creditTip, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditTip, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditTip.onExtraCallbackWithResult(creditTip, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditTip) obj);
        int i4 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 10;
                        int packedPositionChild = 12433 - ExpandableListView.getPackedPositionChild(0L);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, iResolveSizeAndState, packedPositionChild, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), 12434 - KeyEvent.normalizeMetaState(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $11 + 19;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 15966), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, Drawable.resolveOpacity(0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 119;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = (char) 61520;
        onExtraCallbackWithResult = (char) 38069;
        onExtraCallback = (char) 51271;
        onNavigationEvent = (char) 23410;
    }
}
