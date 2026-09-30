package im.toss.features.home.core.remote.model.expense.method;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
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
public final /* synthetic */ class ExpenseMethodEditOverviewResponse$$serializer implements aeu2<ExpenseMethodEditOverviewResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final ExpenseMethodEditOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char onNavigationEvent;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 101;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        ExpenseMethodEditOverviewResponse$$serializer expenseMethodEditOverviewResponse$$serializer = new ExpenseMethodEditOverviewResponse$$serializer();
        INSTANCE = expenseMethodEditOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.expense.method.ExpenseMethodEditOverviewResponse", expenseMethodEditOverviewResponse$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new char[]{1, 0, 2, 0, 13831}, (byte) (8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCta", true);
        setanimationsloop.onWarmupCompleted("preventAlert", true);
        setanimationsloop.onWarmupCompleted("pinHeaderTitle", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ExpenseMethodEditOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = ExpenseMethodEditOverviewResponse.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback(ExpenseMethodEditBottomCtaResponse$$serializer.INSTANCE), sp.IAuthTabCallback(ExpenseMethodEditPreventAlertResponse$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExpenseMethodEditOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ExpenseMethodEditBottomCtaResponse expenseMethodEditBottomCtaResponse;
        ExpenseMethodEditPreventAlertResponse expenseMethodEditPreventAlertResponse;
        List list;
        String str;
        String str2;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ExpenseMethodEditOverviewResponse.onWarmupCompleted();
        ExpenseMethodEditBottomCtaResponse expenseMethodEditBottomCtaResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            ExpenseMethodEditBottomCtaResponse expenseMethodEditBottomCtaResponse3 = (ExpenseMethodEditBottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExpenseMethodEditBottomCtaResponse$$serializer.INSTANCE, (Object) null);
            ExpenseMethodEditPreventAlertResponse expenseMethodEditPreventAlertResponse2 = (ExpenseMethodEditPreventAlertResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ExpenseMethodEditPreventAlertResponse$$serializer.INSTANCE, (Object) null);
            expenseMethodEditBottomCtaResponse = expenseMethodEditBottomCtaResponse3;
            list = list2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            i = 31;
            expenseMethodEditPreventAlertResponse = expenseMethodEditPreventAlertResponse2;
            str2 = str3;
        } else {
            int i5 = 0;
            boolean z = true;
            ExpenseMethodEditPreventAlertResponse expenseMethodEditPreventAlertResponse3 = null;
            List list3 = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallbackStub;
                    int i7 = i6 + 61;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 0) {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                        i5 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i9 = i6 + 109;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 3) {
                            c = 3;
                            expenseMethodEditBottomCtaResponse2 = (ExpenseMethodEditBottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExpenseMethodEditBottomCtaResponse$$serializer.INSTANCE, expenseMethodEditBottomCtaResponse2);
                            i5 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                            c = 3;
                            expenseMethodEditPreventAlertResponse3 = (ExpenseMethodEditPreventAlertResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ExpenseMethodEditPreventAlertResponse$$serializer.INSTANCE, expenseMethodEditPreventAlertResponse3);
                            i5 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str4);
                            i5 |= 16;
                            int i10 = IAuthTabCallbackStub + 35;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    } else {
                        c = 3;
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list3);
                        i5 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            i = i5;
            expenseMethodEditBottomCtaResponse = expenseMethodEditBottomCtaResponse2;
            expenseMethodEditPreventAlertResponse = expenseMethodEditPreventAlertResponse3;
            list = list3;
            str = str4;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExpenseMethodEditOverviewResponse(i, str2, list, expenseMethodEditBottomCtaResponse, expenseMethodEditPreventAlertResponse, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m601deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExpenseMethodEditOverviewResponse expenseMethodEditOverviewResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 67;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return expenseMethodEditOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExpenseMethodEditOverviewResponse expenseMethodEditOverviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(expenseMethodEditOverviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExpenseMethodEditOverviewResponse.onExtraCallback(expenseMethodEditOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExpenseMethodEditOverviewResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        float f;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 23;
            int i5 = i4 % 128;
            $10 = i5;
            int i6 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i5 + 89;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 26, 23138 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        float f2 = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    f = f2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1))), (Process.myPid() >> 22) + 74, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            f = 0.0f;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 31 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            f = 0.0f;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        f = 0.0f;
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            int i13 = $11 + 7;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 2 / 3;
                            }
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                f2 = f;
                obj2 = obj;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 93;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 28002);
                i17 += 116;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{64967, 64986, 64991, 64982};
        onNavigationEvent = (char) 51243;
    }
}
