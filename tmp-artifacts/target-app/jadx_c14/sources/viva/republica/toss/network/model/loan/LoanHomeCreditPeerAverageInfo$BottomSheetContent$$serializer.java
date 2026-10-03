package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer implements aeu2<LoanHomeCreditPeerAverageInfo.BottomSheetContent> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 9;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
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
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRed = (char) Color.red(i3);
                        int iIndexOf = TextUtils.indexOf("", "", i3) + 10;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, iIndexOf, packedPositionType, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 12434 - (KeyEvent.getMaxKeyCode() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16013), TextUtils.lastIndexOf("", '0', 0) + 15, (Process.myTid() >> 22) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $10 + 99;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onExtraCallbackWithResult();
        LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer loanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer = new LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer();
        INSTANCE = loanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent", loanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new char[]{24717, 16332, 27335, 5260, 17748, 50218}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{30423, 60657, 47408, 42991, '\n', 31885, 15168, 1762}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("upperText", true);
        setanimationsloop.onWarmupCompleted("lowerText", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 7;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m41deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        LoanHomeCreditPeerAverageInfo.BottomSheetContent bottomSheetContentM41deserialize = m41deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return bottomSheetContentM41deserialize;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeCreditPeerAverageInfo.BottomSheetContent m41deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        String str2;
        String str3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            i = 31;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str = strAsInterface4;
            str2 = strAsInterface5;
            str3 = strAsInterface3;
        } else {
            int i6 = 0;
            int i7 = 1;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            strAsInterface = null;
            String strAsInterface9 = null;
            while (i7 != 0) {
                int i8 = IAuthTabCallbackStub + 109;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i9 = i3;
                    int i10 = IAuthTabCallbackDefault + 109;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = i9;
                    i7 = i3;
                } else if (iOnNavigationEvent != 0) {
                    int i12 = IAuthTabCallbackDefault + 93;
                    int i13 = i12 % 128;
                    IAuthTabCallbackStub = i13;
                    int i14 = i12 % 2;
                    if (iOnNavigationEvent == 1) {
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i15 = i13 + 101;
                        IAuthTabCallbackDefault = i15 % 128;
                        int i16 = i15 % 2;
                        if (iOnNavigationEvent == 3) {
                            strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                        }
                    } else {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                    }
                    i3 = 0;
                } else {
                    strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                    i6 |= 1;
                }
            }
            str = strAsInterface6;
            strAsInterface2 = strAsInterface7;
            str2 = strAsInterface8;
            str3 = strAsInterface9;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanHomeCreditPeerAverageInfo.BottomSheetContent(i, strAsInterface2, str3, str, str2, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeCreditPeerAverageInfo.BottomSheetContent) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeCreditPeerAverageInfo.BottomSheetContent bottomSheetContent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomSheetContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanHomeCreditPeerAverageInfo.BottomSheetContent.onNavigationEvent(bottomSheetContent, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 55112;
        onWarmupCompleted = (char) 53125;
        onExtraCallback = (char) 25833;
        IAuthTabCallback = (char) 51067;
    }
}
