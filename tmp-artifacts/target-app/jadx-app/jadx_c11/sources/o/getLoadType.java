package o;

import android.view.animation.Interpolator;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tds.compose.foundation.anim.rally.RallyData;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getLoadType;
import o.isCreativeDebuggerEnabled;
import o.setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getLoadType {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.values().length];
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslateX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslateY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslatePercentX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslatePercentY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Scale.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.ScaleX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.ScaleY.ordinal()] = 7;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Opacity.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.BackgroundColor.ordinal()] = 9;
                int i2 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateX.ordinal()] = 10;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateY.ordinal()] = 11;
                int i6 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateZ.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TransformOriginX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TransformOriginY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Width.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Height.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TextSize.ordinal()] = 17;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TextColor.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Value.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Perspective.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Blur.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.BlurEffect.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.GlBlur.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            onExtraCallback = iArr;
        }
    }

    public static /* synthetic */ Float IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17, isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, iscreativedebuggerenabled);
            obj.hashCode();
            throw null;
        }
        Float fOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, iscreativedebuggerenabled);
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14, float f, float f2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor18, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor19, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor20, setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled, float f3) throws NoWhenBranchMatchedException {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, f, f2, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor20, setshouldfailaddisplayifdontkeepactivitiesisenabled, f3);
            int i3 = 7 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, f, f2, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor20, setshouldfailaddisplayifdontkeepactivitiesisenabled, f3);
        }
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14, float f, float f2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor18, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor19, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor20, setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled, float f3) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setshouldfailaddisplayifdontkeepactivitiesisenabled, "");
        switch (onExtraCallback.onExtraCallback[setshouldfailaddisplayifdontkeepactivitiesisenabled.ordinal()]) {
            case 1:
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 2:
                getsupportedhighspeedresolutionsfor2.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 3:
                getsupportedhighspeedresolutionsfor3.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 4:
                getsupportedhighspeedresolutionsfor4.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 5:
                getsupportedhighspeedresolutionsfor5.IAuthTabCallback(Float.valueOf(f3));
                getsupportedhighspeedresolutionsfor6.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 6:
                getsupportedhighspeedresolutionsfor5.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 7:
                getsupportedhighspeedresolutionsfor6.IAuthTabCallback(Float.valueOf(f3));
                i = onExtraCallback + 9;
                onNavigationEvent = i % 128;
                int i3 = i % 2;
                return Unit.INSTANCE;
            case 8:
                getsupportedhighspeedresolutionsfor7.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 9:
                getsupportedhighspeedresolutionsfor8.IAuthTabCallback(setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback((int) f3)));
                return Unit.INSTANCE;
            case 10:
                getsupportedhighspeedresolutionsfor9.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 11:
                getsupportedhighspeedresolutionsfor10.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 12:
                getsupportedhighspeedresolutionsfor11.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case 13:
                getsupportedhighspeedresolutionsfor12.IAuthTabCallback(createUShort.IAuthTabCallback(getDoubleValue.IAuthTabCallback(f3, createUShort.onExtraCallbackWithResult(((createUShort) getsupportedhighspeedresolutionsfor12.onExtraCallbackWithResult()).onNavigationEvent()))));
                return Unit.INSTANCE;
            case 14:
                getsupportedhighspeedresolutionsfor12.IAuthTabCallback(createUShort.IAuthTabCallback(getDoubleValue.IAuthTabCallback(createUShort.onNavigationEvent(((createUShort) getsupportedhighspeedresolutionsfor12.onExtraCallbackWithResult()).onNavigationEvent()), f3)));
                return Unit.INSTANCE;
            case 15:
                float fIntBitsToFloat = Float.intBitsToFloat((int) ((setUseCaseDetached) getsupportedhighspeedresolutionsfor13.onExtraCallbackWithResult()).onNavigationEvent());
                getsupportedhighspeedresolutionsfor13.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L))));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                getsupportedhighspeedresolutionsfor13.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (((setUseCaseDetached) getsupportedhighspeedresolutionsfor13.onExtraCallbackWithResult()).onNavigationEvent() >> 32))) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L))));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                getsupportedhighspeedresolutionsfor14.IAuthTabCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(f3 / (f * f2))));
                i = onNavigationEvent + 111;
                onExtraCallback = i % 128;
                int i32 = i % 2;
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                getsupportedhighspeedresolutionsfor15.IAuthTabCallback(setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback((int) f3)));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                getsupportedhighspeedresolutionsfor16.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                getsupportedhighspeedresolutionsfor17.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                getsupportedhighspeedresolutionsfor18.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                getsupportedhighspeedresolutionsfor19.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                getsupportedhighspeedresolutionsfor20.IAuthTabCallback(Float.valueOf(f3));
                return Unit.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Float onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17, isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        switch (onExtraCallback.onExtraCallback[iscreativedebuggerenabled.IAuthTabCallback().ordinal()]) {
            case 1:
                Float f = (Float) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
                int i2 = onNavigationEvent + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return f;
            case 2:
                return (Float) getsupportedhighspeedresolutionsfor2.onExtraCallbackWithResult();
            case 3:
                return (Float) getsupportedhighspeedresolutionsfor3.onExtraCallbackWithResult();
            case 4:
                return (Float) getsupportedhighspeedresolutionsfor4.onExtraCallbackWithResult();
            case 5:
                return (Float) getsupportedhighspeedresolutionsfor5.onExtraCallbackWithResult();
            case 6:
                return (Float) getsupportedhighspeedresolutionsfor5.onExtraCallbackWithResult();
            case 7:
                return (Float) getsupportedhighspeedresolutionsfor6.onExtraCallbackWithResult();
            case 8:
                return (Float) getsupportedhighspeedresolutionsfor7.onExtraCallbackWithResult();
            case 9:
            case 13:
            case 14:
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
            default:
                return null;
            case 10:
                return (Float) getsupportedhighspeedresolutionsfor8.onExtraCallbackWithResult();
            case 11:
                return (Float) getsupportedhighspeedresolutionsfor9.onExtraCallbackWithResult();
            case 12:
                return (Float) getsupportedhighspeedresolutionsfor10.onExtraCallbackWithResult();
            case 15:
                return Float.valueOf(Float.intBitsToFloat((int) (((setUseCaseDetached) getsupportedhighspeedresolutionsfor11.onExtraCallbackWithResult()).onNavigationEvent() >> 32)));
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return Float.valueOf(Float.intBitsToFloat((int) ((setUseCaseDetached) getsupportedhighspeedresolutionsfor11.onExtraCallbackWithResult()).onNavigationEvent()));
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                Float fValueOf = Float.valueOf(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getsupportedhighspeedresolutionsfor12.onExtraCallbackWithResult()).IAuthTabCallback()));
                int i4 = onNavigationEvent + 5;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 87 / 0;
                }
                return fValueOf;
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return (Float) getsupportedhighspeedresolutionsfor13.onExtraCallbackWithResult();
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return (Float) getsupportedhighspeedresolutionsfor14.onExtraCallbackWithResult();
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return (Float) getsupportedhighspeedresolutionsfor15.onExtraCallbackWithResult();
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return (Float) getsupportedhighspeedresolutionsfor16.onExtraCallbackWithResult();
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return (Float) getsupportedhighspeedresolutionsfor17.onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RallyData onNavigationEvent(@NotNull List<AppLovinSdkSettings> list, @Nullable Object obj, int i, @Nullable getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, int i3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5) throws Throwable {
        int i6;
        int i7;
        int i8;
        int i9;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        int i10;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda02;
        int i11;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda03;
        int i12;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda04;
        int i13;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda05;
        Throwable th;
        int i14;
        Throwable th2;
        int i15 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(list, "");
        Object obj2 = (i5 & 2) != 0 ? null : obj;
        int i16 = (i5 & 4) != 0 ? 1 : i;
        getExtraParameters getextraparameters2 = (i5 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i17 = (i5 & 16) != 0 ? 0 : i2;
        Interpolator interpolator2 = (i5 & 32) != 0 ? null : interpolator;
        Integer num2 = (i5 & 64) != 0 ? null : num;
        if ((i5 & 128) != 0) {
            int i18 = onExtraCallback + 97;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
            i6 = 0;
        } else {
            i6 = i3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1824745628, i4, -1, "im.toss.tds.compose.foundation.anim.rally.animateRally (AnimateRally.kt:34)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            i7 = 2;
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        } else {
            i7 = 2;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, i7, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            int i20 = onNavigationEvent + 95;
            onExtraCallback = i20 % 128;
            i8 = 2;
            int i21 = i20 % 2;
            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        } else {
            i8 = 2;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, i8, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, i8, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
            int i22 = onNavigationEvent + 79;
            onExtraCallback = i22 % 128;
            i9 = 2;
            int i23 = i22 % 2;
            objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
        } else {
            i9 = 2;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, i9, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()), (CameraPresenceProviderExternalSyntheticLambda0) null, i9, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
            int i24 = onNavigationEvent + 65;
            onExtraCallback = i24 % 128;
            int i25 = i24 % i9;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized8;
        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
            cameraPresenceProviderExternalSyntheticLambda0 = null;
            objOnMinimized9 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, i9, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
        } else {
            cameraPresenceProviderExternalSyntheticLambda0 = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized9;
        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized10 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, cameraPresenceProviderExternalSyntheticLambda0, i9, cameraPresenceProviderExternalSyntheticLambda0);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized10;
        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized11 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, cameraPresenceProviderExternalSyntheticLambda0, i9, cameraPresenceProviderExternalSyntheticLambda0);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) objOnMinimized11;
        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
            int i26 = onExtraCallback + 105;
            onNavigationEvent = i26 % 128;
            i10 = 2;
            int i27 = i26 % 2;
            cameraPresenceProviderExternalSyntheticLambda02 = null;
            objOnMinimized12 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(createUShort.IAuthTabCallback(createUShort.Companion.onExtraCallbackWithResult()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
        } else {
            i10 = 2;
            cameraPresenceProviderExternalSyntheticLambda02 = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = (getSupportedHighSpeedResolutionsFor) objOnMinimized12;
        Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized13 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.Companion.IAuthTabCallback()), cameraPresenceProviderExternalSyntheticLambda02, i10, cameraPresenceProviderExternalSyntheticLambda02);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = (getSupportedHighSpeedResolutionsFor) objOnMinimized13;
        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
            int i28 = onExtraCallback + 1;
            onNavigationEvent = i28 % 128;
            i11 = 2;
            int i29 = i28 % 2;
            cameraPresenceProviderExternalSyntheticLambda03 = null;
            objOnMinimized14 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
        } else {
            i11 = 2;
            cameraPresenceProviderExternalSyntheticLambda03 = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14 = (getSupportedHighSpeedResolutionsFor) objOnMinimized14;
        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized15 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()), cameraPresenceProviderExternalSyntheticLambda03, i11, cameraPresenceProviderExternalSyntheticLambda03);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized15);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15 = (getSupportedHighSpeedResolutionsFor) objOnMinimized15;
        Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
            int i30 = onNavigationEvent + 29;
            onExtraCallback = i30 % 128;
            i12 = 2;
            if (i30 % 2 != 0) {
                cameraPresenceProviderExternalSyntheticLambda04 = null;
                objOnMinimized16 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null);
            } else {
                cameraPresenceProviderExternalSyntheticLambda04 = null;
                objOnMinimized16 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            }
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized16);
        } else {
            i12 = 2;
            cameraPresenceProviderExternalSyntheticLambda04 = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16 = (getSupportedHighSpeedResolutionsFor) objOnMinimized16;
        Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized17 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Float.valueOf(getVersionCode.MEDIUM.getValue()), cameraPresenceProviderExternalSyntheticLambda04, i12, cameraPresenceProviderExternalSyntheticLambda04);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized17);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17 = (getSupportedHighSpeedResolutionsFor) objOnMinimized17;
        Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
            int i31 = onNavigationEvent + 77;
            onExtraCallback = i31 % 128;
            i13 = 2;
            if (i31 % 2 != 0) {
                cameraPresenceProviderExternalSyntheticLambda05 = null;
                objOnMinimized18 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 4, (Object) null);
            } else {
                cameraPresenceProviderExternalSyntheticLambda05 = null;
                objOnMinimized18 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            }
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized18);
        } else {
            i13 = 2;
            cameraPresenceProviderExternalSyntheticLambda05 = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor18 = (getSupportedHighSpeedResolutionsFor) objOnMinimized18;
        Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized19 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, cameraPresenceProviderExternalSyntheticLambda05, i13, cameraPresenceProviderExternalSyntheticLambda05);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized19);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor19 = (getSupportedHighSpeedResolutionsFor) objOnMinimized19;
        Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
            int i32 = onNavigationEvent + 17;
            onExtraCallback = i32 % 128;
            int i33 = i32 % 2;
            th = null;
            objOnMinimized20 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized20);
        } else {
            th = null;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor20 = (getSupportedHighSpeedResolutionsFor) objOnMinimized20;
        final float fIAuthTabCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback();
        final float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
            i14 = 0;
            int i34 = i6;
            th2 = th;
            objOnMinimized21 = RallysKt.onNavigationEvent(new Function2() { // from class: im.toss.tds.compose.foundation.anim.rally.AnimateRallyKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i35 = 2 % 2;
                    int i36 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i36 % 128;
                    int i37 = i36 % 2;
                    Unit unitOnExtraCallback = getLoadType.onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, fOnNavigationEvent, fIAuthTabCallback, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor20, (setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled) obj3, ((Float) obj4).floatValue());
                    int i38 = onExtraCallbackWithResult + 69;
                    onNavigationEvent = i38 % 128;
                    int i39 = i38 % 2;
                    return unitOnExtraCallback;
                }
            }, list, i16, getextraparameters2, i17, interpolator2, num2, null, i34, new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.AnimateRallyKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3) {
                    int i35 = 2 % 2;
                    int i36 = onWarmupCompleted + 123;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    Float fIAuthTabCallback2 = getLoadType.IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor20, (isCreativeDebuggerEnabled) obj3);
                    int i38 = onExtraCallback + 123;
                    onWarmupCompleted = i38 % 128;
                    int i39 = i38 % 2;
                    return fIAuthTabCallback2;
                }
            }, 128, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized21);
        } else {
            th2 = th;
            i14 = 0;
        }
        Rally rally = (Rally) objOnMinimized21;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally);
        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent2 || objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized22 = new RallyData(rally, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized22);
        }
        RallyData rallyData = (RallyData) objOnMinimized22;
        RallyData.AnimateState animateStateOnExtraCallbackWithResult = rallyData.onExtraCallbackWithResult();
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyData);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally);
        Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
            int i35 = onNavigationEvent + 75;
            onExtraCallback = i35 % 128;
            if (i35 % 2 != 0) {
                onwarmupcompleted.onExtraCallback();
                th2.hashCode();
                throw th2;
            }
            if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized23 = new onNavigationEvent(rallyData, rally, th2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized23);
            }
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(rally, animateStateOnExtraCallbackWithResult, (Function2) objOnMinimized23, cameraCaptureResultEmptyCameraCaptureResult, i14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return rallyData;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Rally $rally;
        final /* synthetic */ RallyData $rallyData;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        int label;

        public static final /* synthetic */ class onExtraCallback {
            private static int onExtraCallback = 1;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onNavigationEvent;

            static {
                int[] iArr = new int[RallyData.AnimateState.values().length];
                try {
                    iArr[RallyData.AnimateState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RallyData.AnimateState.PAUSED.ordinal()] = 2;
                    int i = onNavigationEvent + 31;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RallyData.AnimateState.CANCELED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallbackWithResult = iArr;
                int i3 = onNavigationEvent + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(RallyData rallyData, Rally rally, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$rallyData = rallyData;
            this.$rally = rally;
        }

        private static final long IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public static /* synthetic */ long onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            long jIAuthTabCallback = IAuthTabCallback(j);
            int i4 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return jIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ long onExtraCallbackWithResult(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jOnNavigationEvent = onNavigationEvent(j);
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return jOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final long onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$rallyData, this.$rally, access13800Var);
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        
            if (r14 != r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0119 -> B:25:0x009d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            RallyData rallyData;
            long j;
            int iIntValue;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iIntValue = this.I$1;
                    int i4 = this.I$0;
                    j = this.J$0;
                    rallyData = (RallyData) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    rallyData.onNavigationEvent(iIntValue + ((int) ((((Number) obj).longValue() - j) / 1000000)));
                    Object[] objArr = {this.$rallyData};
                    int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    if (((Integer) RallyData.onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, objArr, 1381178092, -1381178090, iOnNavigationEvent2)).intValue() < this.$rally.IAuthTabCallbackStub()) {
                        Object[] objArr2 = {this.$rallyData};
                        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                        return Unit.INSTANCE;
                    }
                    iIntValue = i4;
                    rallyData = this.$rallyData;
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.AnimateRallyKt$animateRally$1$1$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 29;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            Long lValueOf = Long.valueOf(getLoadType.onNavigationEvent.onExtraCallbackWithResult(((Long) obj2).longValue()));
                            int i8 = onWarmupCompleted + 75;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            return lValueOf;
                        }
                    };
                    this.L$0 = rallyData;
                    this.J$0 = j;
                    this.I$0 = iIntValue;
                    this.I$1 = iIntValue;
                    this.label = 2;
                    obj = addSessionCaptureCallback.IAuthTabCallback(function1, this);
                    if (obj != objOnWarmupCompleted) {
                        i4 = iIntValue;
                        rallyData.onNavigationEvent(iIntValue + ((int) ((((Number) obj).longValue() - j) / 1000000)));
                        Object[] objArr3 = {this.$rallyData};
                        int iOnNavigationEvent5 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                        int iOnNavigationEvent22 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                        if (((Integer) RallyData.onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent5, objArr3, 1381178092, -1381178090, iOnNavigationEvent22)).intValue() < this.$rally.IAuthTabCallbackStub()) {
                        }
                    }
                    return objOnWarmupCompleted;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback.onExtraCallbackWithResult[this.$rallyData.onExtraCallbackWithResult().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        int i6 = onExtraCallbackWithResult + 121;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.INSTANCE;
                }
                Function1 function12 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.AnimateRallyKt$animateRally$1$1$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 89;
                        onExtraCallback = i9 % 128;
                        Long l = (Long) obj2;
                        if (i9 % 2 != 0) {
                            return Long.valueOf(getLoadType.onNavigationEvent.onExtraCallback(l.longValue()));
                        }
                        int i10 = 45 / 0;
                        return Long.valueOf(getLoadType.onNavigationEvent.onExtraCallback(l.longValue()));
                    }
                };
                this.label = 1;
                obj = addSessionCaptureCallback.IAuthTabCallback(function12, this);
            }
            long jLongValue = ((Number) obj).longValue();
            Object[] objArr4 = {this.$rallyData};
            int iOnNavigationEvent6 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent7 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            j = jLongValue;
            iIntValue = ((Integer) RallyData.onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent6, objArr4, 1381178092, -1381178090, iOnNavigationEvent7)).intValue();
            rallyData = this.$rallyData;
            Function1 function13 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.AnimateRallyKt$animateRally$1$1$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i52 = 2 % 2;
                    int i62 = IAuthTabCallback + 29;
                    onWarmupCompleted = i62 % 128;
                    int i72 = i62 % 2;
                    Long lValueOf = Long.valueOf(getLoadType.onNavigationEvent.onExtraCallbackWithResult(((Long) obj2).longValue()));
                    int i8 = onWarmupCompleted + 75;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return lValueOf;
                }
            };
            this.L$0 = rallyData;
            this.J$0 = j;
            this.I$0 = iIntValue;
            this.I$1 = iIntValue;
            this.label = 2;
            obj = addSessionCaptureCallback.IAuthTabCallback(function13, this);
            if (obj != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
    }
}
