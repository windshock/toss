package viva.republica.toss.network.model.loan;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanHomeExtensive;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeExtensive$MenuSection$MenuItem$$serializer implements aeu2<LoanHomeExtensive.MenuSection.MenuItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final LoanHomeExtensive$MenuSection$MenuItem$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 91;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 103;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 93;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(i3);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, minimumFlingVelocity, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 10 - View.getDefaultSize(0, 0), ImageFormat.getBitsPerPixel(0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 16014), 13 - TextUtils.lastIndexOf("", '0'), 19901 - TextUtils.indexOf("", "", 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onWarmupCompleted();
        LoanHomeExtensive$MenuSection$MenuItem$$serializer loanHomeExtensive$MenuSection$MenuItem$$serializer = new LoanHomeExtensive$MenuSection$MenuItem$$serializer();
        INSTANCE = loanHomeExtensive$MenuSection$MenuItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem", loanHomeExtensive$MenuSection$MenuItem$$serializer, 5);
        setanimationsloop.onWarmupCompleted("icon", true);
        Object[] objArr = new Object[1];
        a(new char[]{50031, 50918, 56640, 36361, 27331, 60843}, ImageFormat.getBitsPerPixel(0) + 6, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("rightText", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{27533, 50357, 53192, 13151, 12751, 19435}, View.MeasureSpec.getSize(0) + 6, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{64874, 29410, 37415, 59146, 44433, 34422, 46040, 21217}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 113;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanHomeExtensive$MenuSection$MenuItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE)};
        int i4 = IAuthTabCallbackDefault + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            m45deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanHomeExtensive.MenuSection.MenuItem menuItemM45deserialize = m45deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return menuItemM45deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeExtensive.MenuSection.MenuItem m45deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        LoanHomeExtensive.MenuSection.Icon icon;
        LoanHomeExtensive.MenuSection.LogInfo logInfo;
        String str;
        String str2;
        String str3;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        char c2 = 4;
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            LoanHomeExtensive.MenuSection.Icon icon2 = (LoanHomeExtensive.MenuSection.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            LoanHomeExtensive.MenuSection.LogInfo logInfo2 = (LoanHomeExtensive.MenuSection.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE, (Object) null);
            int i3 = IAuthTabCallbackDefault + 97;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            logInfo = logInfo2;
            str2 = strAsInterface;
            str = str5;
            str3 = str4;
            icon = icon2;
            i = 31;
        } else {
            i = 0;
            boolean z2 = true;
            icon = null;
            LoanHomeExtensive.MenuSection.LogInfo logInfo3 = null;
            String str6 = null;
            String strAsInterface2 = null;
            String str7 = null;
            while (z2) {
                int i5 = asInterface + 9;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = asInterface;
                    int i7 = i6 + 81;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 1) {
                        c = 4;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        c = 4;
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                        i |= 4;
                    } else if (iOnNavigationEvent != 3) {
                        int i9 = i6 + 71;
                        IAuthTabCallbackDefault = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i6 + 9;
                            IAuthTabCallbackDefault = i10 % 128;
                            int i11 = i10 % 2;
                            c = 4;
                            logInfo3 = (LoanHomeExtensive.MenuSection.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE, logInfo3);
                            i |= 16;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i102 = i6 + 9;
                            IAuthTabCallbackDefault = i102 % 128;
                            int i112 = i102 % 2;
                            c = 4;
                            logInfo3 = (LoanHomeExtensive.MenuSection.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE, logInfo3);
                            i |= 16;
                        }
                    } else {
                        c = 4;
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str6);
                        i |= 8;
                    }
                    c2 = c;
                    z = false;
                } else {
                    icon = (LoanHomeExtensive.MenuSection.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE, icon);
                    i |= 1;
                    c2 = c2;
                    z = false;
                }
            }
            logInfo = logInfo3;
            str = str6;
            str2 = strAsInterface2;
            str3 = str7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanHomeExtensive.MenuSection.MenuItem(i, icon, str2, str3, str, logInfo, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeExtensive.MenuSection.MenuItem) obj);
        int i4 = IAuthTabCallbackDefault + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeExtensive.MenuSection.MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanHomeExtensive.MenuSection.MenuItem.onNavigationEvent(menuItem, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanHomeExtensive.MenuSection.MenuItem.onNavigationEvent(menuItem, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 121;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = (char) 51407;
        IAuthTabCallback = (char) 28776;
        onNavigationEvent = (char) 23447;
        onExtraCallback = (char) 10765;
    }
}
