package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanHomeExtensive;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeExtensive$MenuSection$$serializer implements aeu2<LoanHomeExtensive.MenuSection> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final LoanHomeExtensive$MenuSection$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback = false;
    private static char[] onExtraCallbackWithResult = null;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 93;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), TextUtils.indexOf("", "") + 77, (ViewConfiguration.getPressedStateDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $11 + 93;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 75 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 16037 - View.MeasureSpec.getMode(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 63 - TextUtils.indexOf("", "", 0), 12214 - Color.red(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 63 - View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 9;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static {
        onExtraCallback();
        LoanHomeExtensive$MenuSection$$serializer loanHomeExtensive$MenuSection$$serializer = new LoanHomeExtensive$MenuSection$$serializer();
        INSTANCE = loanHomeExtensive$MenuSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection", loanHomeExtensive$MenuSection$$serializer, 5);
        setanimationsloop.onWarmupCompleted("sectionTitle", true);
        setanimationsloop.onWarmupCompleted("sectionIcon", true);
        setanimationsloop.onWarmupCompleted("sectionItems", false);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("isExpanded", true);
        descriptor = setanimationsloop;
        int i = asBinder + 53;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanHomeExtensive$MenuSection$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE), LoanHomeExtensive.MenuSection.onWarmupCompleted()[2].getValue(), sp.IAuthTabCallback(LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE), getBgColor.IAuthTabCallback};
        int i4 = asInterface + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            m42deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanHomeExtensive.MenuSection menuSectionM42deserialize = m42deserialize(decoder);
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return menuSectionM42deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeExtensive.MenuSection m42deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i;
        List list;
        LoanHomeExtensive.MenuSection.LogInfo logInfo;
        LoanHomeExtensive.MenuSection.Icon icon;
        String str;
        int i2 = 2 % 2;
        int i3 = asInterface + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = LoanHomeExtensive.MenuSection.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            LoanHomeExtensive.MenuSection.Icon icon2 = (LoanHomeExtensive.MenuSection.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            logInfo = (LoanHomeExtensive.MenuSection.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 31;
            icon = icon2;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z = true;
            List list2 = null;
            LoanHomeExtensive.MenuSection.LogInfo logInfo2 = null;
            LoanHomeExtensive.MenuSection.Icon icon3 = null;
            String strAsInterface2 = null;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onTransact + 7;
                    int i7 = i6 % 128;
                    asInterface = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        icon3 = (LoanHomeExtensive.MenuSection.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE, icon3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i9 = i7 + 37;
                        onTransact = i9 % 128;
                        if (i9 % 2 != 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 5) {
                            logInfo2 = (LoanHomeExtensive.MenuSection.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE, logInfo2);
                            i5 |= 8;
                            int i10 = onTransact + 85;
                            asInterface = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                            i5 |= 16;
                        }
                    } else {
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list2);
                        i5 |= 4;
                    }
                } else {
                    int i12 = asInterface + 43;
                    onTransact = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
            }
            int i14 = asInterface + 79;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i5;
            list = list2;
            logInfo = logInfo2;
            icon = icon3;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanHomeExtensive.MenuSection(i, str, icon, list, logInfo, zOnExtraCallbackWithResult, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeExtensive.MenuSection) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeExtensive.MenuSection menuSection) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(menuSection, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanHomeExtensive.MenuSection.IAuthTabCallback(menuSection, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(menuSection, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanHomeExtensive.MenuSection.IAuthTabCallback(menuSection, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 27 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onTransact + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{32618, 32623, 32631, 32597, 32616, 32624};
        IAuthTabCallback = -1184334050;
        onExtraCallback = true;
        onNavigationEvent = true;
    }
}
