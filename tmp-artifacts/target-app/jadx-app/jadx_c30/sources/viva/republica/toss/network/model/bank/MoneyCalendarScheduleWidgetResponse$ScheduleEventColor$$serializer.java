package viva.republica.toss.network.model.bank;

import android.util.TypedValue;
import android.view.Gravity;
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
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer implements aeu2<MoneyCalendarScheduleWidgetResponse.ScheduleEventColor> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer = new MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer();
        INSTANCE = moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse.ScheduleEventColor", moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer, 3);
        setanimationsloop.onWarmupCompleted("background", true);
        setanimationsloop.onWarmupCompleted("line", false);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + CertificateBody.profileType, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 29;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer};
        int i4 = onTransact + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MoneyCalendarScheduleWidgetResponse.ScheduleEventColor scheduleEventColorM29deserialize = m29deserialize(decoder);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return scheduleEventColorM29deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MoneyCalendarScheduleWidgetResponse.ScheduleEventColor m29deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant;
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant2;
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE;
            MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant5 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, (Object) null);
            MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant6 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, (Object) null);
            scheduleColorVariant2 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, (Object) null);
            i = 7;
            scheduleColorVariant3 = scheduleColorVariant5;
            scheduleColorVariant = scheduleColorVariant6;
        } else {
            int i5 = 0;
            boolean z = true;
            MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant7 = null;
            MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant8 = null;
            while (z) {
                int i6 = IAuthTabCallbackDefault + 71;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onTransact + 71;
                    int i9 = i8 % 128;
                    IAuthTabCallbackDefault = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i11 = i9 + 3;
                        onTransact = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            scheduleColorVariant7 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE, scheduleColorVariant7);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            scheduleColorVariant7 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE, scheduleColorVariant7);
                            i5 |= 4;
                        }
                    } else {
                        scheduleColorVariant4 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE, scheduleColorVariant4);
                        i5 |= 2;
                    }
                } else {
                    scheduleColorVariant8 = (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE, scheduleColorVariant8);
                    i5 |= 1;
                }
            }
            i = i5;
            scheduleColorVariant = scheduleColorVariant4;
            scheduleColorVariant2 = scheduleColorVariant7;
            scheduleColorVariant3 = scheduleColorVariant8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoneyCalendarScheduleWidgetResponse.ScheduleEventColor(i, scheduleColorVariant3, scheduleColorVariant, scheduleColorVariant2, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoneyCalendarScheduleWidgetResponse.ScheduleEventColor) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoneyCalendarScheduleWidgetResponse.ScheduleEventColor scheduleEventColor) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(scheduleEventColor, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MoneyCalendarScheduleWidgetResponse.ScheduleEventColor.onWarmupCompleted(scheduleEventColor, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(scheduleEventColor, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MoneyCalendarScheduleWidgetResponse.ScheduleEventColor.onWarmupCompleted(scheduleEventColor, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
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
                int i4 = $11 + 19;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 78 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionChild(0L) + 76, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            try {
                if (IAuthTabCallback) {
                    int i8 = $11 + 17;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i10 = $11 + 77;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onNavigationEvent) {
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
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 63, 12214 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
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
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{32387, 32402, 32391};
        onWarmupCompleted = -1184334017;
        onNavigationEvent = true;
        IAuthTabCallback = true;
    }
}
