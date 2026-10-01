package o;

import android.os.SystemClock;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.common.collect.Synchronized;
import com.tmoney.LiveCheckConstants;
import im.toss.compose.animation.RallyTickerState;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.AppLovinSdkSettings;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LiveDataObservableResult;
import o.MaxInterstitialAd;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.flipHorizontally;
import o.getAsyncUpdates;
import o.getBacktraceNote;
import o.getClipTextToBoundingBox;
import o.getClipToCompositionBounds;
import o.getStreamSharingChildren;
import o.getSwitchMinWidth;
import o.isExtraPreviewRequired;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getClipToCompositionBounds {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static final getAsyncUpdates onExtraCallback;
    private static final getAsyncUpdates onExtraCallbackWithResult;
    private static int onTransact = 1;
    private static final getAsyncUpdates onWarmupCompleted;
    private static final getBacktraceNote<MaxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult, Integer, Rally> onNavigationEvent = new getBacktraceNote() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda18
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Rally rallyOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                rallyOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 64 / 0;
            } else {
                rallyOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return rallyOnNavigationEvent;
        }
    };
    private static final getBacktraceNote<MaxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult, Integer, Rally> IAuthTabCallback = new getBacktraceNote() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda19
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Rally rallyOnExtraCallback = getClipToCompositionBounds.onExtraCallback((MaxInterstitialAd) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return rallyOnExtraCallback;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    };

    public static final /* synthetic */ class IAuthTabCallbackStub {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[getClipTextToBoundingBox.values().length];
            try {
                iArr[getClipTextToBoundingBox.In.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getClipTextToBoundingBox.Out.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 31;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getClipTextToBoundingBox.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.values().length];
            try {
                iArr2[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            onWarmupCompleted = iArr2;
            int[] iArr3 = new int[TdsAnimateTickerV1Layout.onWarmupCompleted.values().length];
            try {
                iArr3[TdsAnimateTickerV1Layout.onWarmupCompleted.TOP.ordinal()] = 1;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            IAuthTabCallback = iArr3;
            int i7 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = IAuthTabCallbackStub + 19;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 37;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            asInterface(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onTransact + 121;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(rally);
        }
        onWarmupCompleted(rally);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallback(Function1 function1, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 99;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(function1, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        updateFocusedState updatefocusedstateOnNavigationEvent = onNavigationEvent(function1, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return updatefocusedstateOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent((getSupportedHighSpeedResolutionsFor<RallyTickerState>) getsupportedhighspeedresolutionsfor);
        }
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<RallyTickerState>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 123;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[5];
        TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[6];
        List list = (List) objArr[7];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[8];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[9];
        float fFloatValue = ((Number) objArr[10]).floatValue();
        int iIntValue2 = ((Number) objArr[11]).intValue();
        Long l = (Long) objArr[12];
        Function1 function1 = (Function1) objArr[13];
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int iIntValue4 = ((Number) objArr[15]).intValue();
        int iIntValue5 = ((Number) objArr[16]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue6 = ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(quirksExternalSyntheticBackport0, zBooleanValue, jLongValue, jLongValue2, iIntValue, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, fFloatValue, iIntValue2, l, function1, iIntValue3, iIntValue4, iIntValue5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue6);
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackStub + 77;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallbackStub + 51;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        List list = (List) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[4];
        TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[5];
        Long l = (Long) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int iIntValue3 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(list, quirksExternalSyntheticBackport0, iIntValue, jLongValue, onextracallbackwithresult, onwarmupcompleted, l, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackStub + 5;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        } else {
            onExtraCallback(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 113;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), function1, onextracallbackwithresult, onwarmupcompleted, l, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        onNavigationEvent(-1358789098, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1358789104, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 55;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Rally onExtraCallback(MaxInterstitialAd maxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Rally rallyOnExtraCallbackWithResult = onExtraCallbackWithResult(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return rallyOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        Unit unitAsInterface;
        int i7 = 2 % 2;
        int i8 = onTransact + 119;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            unitAsInterface = asInterface(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
            int i9 = 38 / 0;
        } else {
            unitAsInterface = asInterface(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        }
        int i10 = IAuthTabCallbackStub + 101;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 77;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackStub + 7;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 53 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ updateFocusedState onExtraCallback(Function1 function1, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(function1, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(function1, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onWarmupCompleted(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(str, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(str, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, LiveDataObservableResult liveDataObservableResult, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, int i, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {list, liveDataObservableResult, onextracallbackwithresult, Integer.valueOf(i), onwarmupcompleted, Integer.valueOf(i2), onextracallbackwithresult2};
        Unit unit = (Unit) onNavigationEvent(-519615482, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 519615486, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i6 = onTransact + 5;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxInterstitialAd maxInterstitialAd, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(maxInterstitialAd, f);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = onTransact + 15;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return onTransact(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        }
        onTransact(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 19;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), function1, onextracallbackwithresult, onwarmupcompleted, l, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        onNavigationEvent(-1358789098, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1358789104, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 97;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onTransact + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onNavigationEvent(MaxInterstitialAd maxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Rally rallyIAuthTabCallback = IAuthTabCallback(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = IAuthTabCallbackStub + 93;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return rallyIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i2 | i | i4);
        int i13 = i11 | i12;
        int i14 = i10 | i;
        int i15 = i + i4 + i6 + (112060874 * i3) + ((-1891258303) * i5);
        int i16 = i15 * i15;
        int i17 = ((i * (-1669307009)) - 1771304782) + (i4 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + ((-1669306445) * i6) + ((-1582645698) * i3) + ((-198941581) * i5) + (i16 * (-203030528));
        switch ((i * 1286644997) + 1783103488 + (1286644997 * i4) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i6) + ((-1427111936) * i3) + (1712848896 * i5) + (159514624 * i16) + (i17 * i17 * (-2008154112))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                long jLongValue = ((Number) objArr[2]).longValue();
                long jLongValue2 = ((Number) objArr[3]).longValue();
                int iIntValue = ((Number) objArr[4]).intValue();
                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[5];
                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[6];
                List list = (List) objArr[7];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[8];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[9];
                float fFloatValue = ((Number) objArr[10]).floatValue();
                int iIntValue2 = ((Number) objArr[11]).intValue();
                Long l = (Long) objArr[12];
                Function1 function1 = (Function1) objArr[13];
                int iIntValue3 = ((Number) objArr[14]).intValue();
                int iIntValue4 = ((Number) objArr[15]).intValue();
                int iIntValue5 = ((Number) objArr[16]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
                int iIntValue6 = ((Number) objArr[18]).intValue();
                int i18 = 2 % 2;
                int i19 = onTransact + 67;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, zBooleanValue, jLongValue, jLongValue2, iIntValue, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, fFloatValue, iIntValue2, l, function1, iIntValue3, iIntValue4, iIntValue5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue6);
                int i21 = IAuthTabCallbackStub + 37;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                return unitOnNavigationEvent;
            case 11:
                return access000(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access100(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LiveDataObservableResult liveDataObservableResult = (LiveDataObservableResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Function1 function1 = (Function1) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(liveDataObservableResult, iIntValue, function1, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(liveDataObservableResult, iIntValue, function1, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = onTransact + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted();
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, long j, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 25;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return (Unit) onNavigationEvent(1624001164, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1624001153, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{list, quirksExternalSyntheticBackport0, Integer.valueOf(i), Long.valueOf(j), onextracallbackwithresult, onwarmupcompleted, l, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        }
        int i7 = 42 / 0;
        return (Unit) onNavigationEvent(1624001164, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1624001153, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{list, quirksExternalSyntheticBackport0, Integer.valueOf(i), Long.valueOf(j), onextracallbackwithresult, onwarmupcompleted, l, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackStub + 97;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallbackStub + 117;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Unit unitOnWarmupCompleted;
        int i5 = 2 % 2;
        int i6 = onTransact + 11;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            int i7 = 0 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        int i8 = IAuthTabCallbackStub + 57;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(rally);
        int i4 = IAuthTabCallbackStub + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getAsyncUpdates onNavigationEvent(getClipTextToBoundingBox getcliptexttoboundingbox) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getAsyncUpdates getasyncupdatesOnExtraCallback = onExtraCallback(getcliptexttoboundingbox);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        int i5 = onTransact + 65;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return getasyncupdatesOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)};
        Unit unit = (Unit) onNavigationEvent(-1524209826, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1524209838, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i4 = IAuthTabCallbackStub + 75;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = onTransact + 35;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = onTransact + 47;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 75;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, fliphorizontally);
        int i4 = onTransact + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List list, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 97;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, z, j, j2, i, function1, onextracallbackwithresult, onwarmupcompleted, l, list, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackStub + 41;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static final /* synthetic */ Function1 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1OnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return function1OnExtraCallbackWithResult;
    }

    public static /* synthetic */ component8 onWarmupCompleted(List list, LiveDataObservableResult liveDataObservableResult, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {list, liveDataObservableResult, function1, onextracallbackwithresult, onwarmupcompleted, isextrapreviewrequired, virtualCameraCaptureResult};
        component8 component8Var = (component8) onNavigationEvent(4493562, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -4493554, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return component8Var;
    }

    public static /* synthetic */ getAsyncUpdates onWarmupCompleted(getClipTextToBoundingBox getcliptexttoboundingbox) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {getcliptexttoboundingbox};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        getAsyncUpdates getasyncupdates = (getAsyncUpdates) onNavigationEvent(-23102286, iOnNavigationEvent, iOnNavigationEvent3, 23102287, iOnNavigationEvent4, objArr, iOnNavigationEvent2);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return getasyncupdates;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<Float> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback;

        public IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            this.IAuthTabCallback = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return fOnExtraCallbackWithResult;
        }

        public final Float onExtraCallbackWithResult() {
            float fFloatValue;
            float f;
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                fFloatValue = ((Number) this.IAuthTabCallback.onExtraCallbackWithResult()).floatValue();
                f = 2.0f;
            } else {
                fFloatValue = ((Number) this.IAuthTabCallback.onExtraCallbackWithResult()).floatValue();
                f = 1.0f;
            }
            Float fValueOf = Float.valueOf(RangesKt.coerceIn(fFloatValue, 0.0f, f));
            int i3 = onExtraCallback + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return fValueOf;
            }
            throw null;
        }
    }

    public static final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-565949970);
        if (i != 0) {
            int i3 = onTransact + 45;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-565949970, i, -1, "im.toss.compose.animation.AnimateTickerInitialDelayPreview (AnimateTicker.kt:60)");
            }
            List listListOf = CollectionsKt.listOf(new String[]{"123", "456", "789"});
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Long.valueOf(SystemClock.elapsedRealtime());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            long jLongValue = ((Number) objOnMinimized).longValue();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            List list = listListOf;
            List listTake = CollectionsKt.take(list, 1);
            TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT;
            TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = TdsAnimateTickerV1Layout.onWarmupCompleted.TOP;
            onNavigationEvent(listTake, null, 0, 0L, onextracallbackwithresult2, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797120, 6);
            List listTake2 = CollectionsKt.take(list, 2);
            TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2 = TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER;
            onNavigationEvent(listTake2, null, 0, 50L, onextracallbackwithresult2, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797120, 6);
            TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted3 = TdsAnimateTickerV1Layout.onWarmupCompleted.BOTTOM;
            onNavigationEvent(listListOf, null, 0, 100L, onextracallbackwithresult2, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult3 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.CENTER;
            onNavigationEvent(listListOf, null, 0, 150L, onextracallbackwithresult3, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            onNavigationEvent(listListOf, null, 0, 200L, onextracallbackwithresult3, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            onNavigationEvent(listListOf, null, 0, 250L, onextracallbackwithresult3, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult4 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.RIGHT;
            onNavigationEvent(listListOf, null, 0, 300L, onextracallbackwithresult4, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            onNavigationEvent(listListOf, null, 0, 350L, onextracallbackwithresult4, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            onNavigationEvent(listListOf, null, 0, 400L, onextracallbackwithresult4, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1797126, 6);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 35;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda26
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 103;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Integer.valueOf(i10), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) getClipToCompositionBounds.onNavigationEvent(-1298780032, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1298780034, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    int i11 = onExtraCallback + 41;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            });
            int i7 = IAuthTabCallbackStub + 61;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(800809348);
        if (i != 0) {
            int i5 = onTransact + 67;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = onTransact + 87;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i9 = onTransact + 89;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 18 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(800809348, i, -1, "im.toss.compose.animation.AnimateTickerBadgePreview (AnimateTicker.kt:136)");
                }
                onNavigationEvent(CollectionsKt.listOf("test"), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null), Integer.MAX_VALUE, 0L, TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT, TdsAnimateTickerV1Layout.onWarmupCompleted.TOP, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 224694, 64);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                onNavigationEvent(CollectionsKt.listOf("test"), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null), Integer.MAX_VALUE, 0L, TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT, TdsAnimateTickerV1Layout.onWarmupCompleted.TOP, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 224694, 64);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 115;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Integer.valueOf(i14), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) getClipToCompositionBounds.onNavigationEvent(-962936993, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 962937000, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    int i15 = onNavigationEvent + 57;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    public static final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1982351539);
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i4 = onTransact + 47;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1982351539, i, -1, "im.toss.compose.animation.AnimateTickerPreview (AnimateTicker.kt:152)");
                }
                List listListOf = CollectionsKt.listOf(new String[]{"123", "456", "789"});
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    int i6 = IAuthTabCallbackStub + 97;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    objOnMinimized = Long.valueOf(SystemClock.elapsedRealtime());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                long jLongValue = ((Number) objOnMinimized).longValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f));
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT;
                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = TdsAnimateTickerV1Layout.onWarmupCompleted.TOP;
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult2, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2 = TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER;
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult2, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted3 = TdsAnimateTickerV1Layout.onWarmupCompleted.BOTTOM;
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult2, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult3 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.CENTER;
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult3, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult3, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult3, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult4 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.RIGHT;
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult4, onwarmupcompleted, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult4, onwarmupcompleted2, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                onNavigationEvent(listListOf, null, 0, 0L, onextracallbackwithresult4, onwarmupcompleted3, Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794054, 14);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda20
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 57;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = i;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr = {Integer.valueOf(i11), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        if (i10 != 0) {
                            return (Unit) getClipToCompositionBounds.onNavigationEvent(-1691903681, iOnNavigationEvent, iOnNavigationEvent3, 1691903684, iOnNavigationEvent4, objArr, iOnNavigationEvent2);
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1982351539);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackStub + 47;
            onTransact = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = IAuthTabCallbackStub + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 103;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1473784846, i, -1, "im.toss.compose.animation.SampleAnimateTicker.<anonymous>.<anonymous> (AnimateTicker.kt:237)");
                    int i7 = 38 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1473784846, i, -1, "im.toss.compose.animation.SampleAnimateTicker.<anonymous>.<anonymous> (AnimateTicker.kt:237)");
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda13
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 79;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent();
                        if (i10 == 0) {
                            int i11 = 30 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i8 = onTransact + 107;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, measureChildConstrained.onExtraCallback(onextracallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) objOnMinimized, 15, (Object) null), null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131068}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final List<String> list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, long j, final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        Long l2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Long l3;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1022031735);
        int i9 = (i2 & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i2 : i2;
        int i10 = i3 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 == 0) {
                int i11 = onTransact + 113;
                IAuthTabCallbackStub = i11 % 128;
                i9 = i11 % 2 != 0 ? i9 | 12941 : i9 | 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 = i;
                    i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i5) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        j2 = j;
                        i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) == 0) {
                        i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal()) ^ true ? 8192 : 16384;
                    }
                    if ((196608 & i2) == 0) {
                        i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 != 0) {
                        if ((1572864 & i2) == 0) {
                            l2 = l;
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l2) ? 1048576 : 524288;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 599187) != 599186, i9 & 1)) {
                            if (i10 != 0) {
                                int i12 = onTransact + 19;
                                IAuthTabCallbackStub = i12 % 128;
                                int i13 = i12 % 2;
                                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if (i4 != 0) {
                                i5 = -1;
                            }
                            long j4 = i6 != 0 ? 9000L : j2;
                            if (i7 != 0) {
                                int i14 = IAuthTabCallbackStub + 41;
                                onTransact = i14 % 128;
                                l3 = null;
                                if (i14 % 2 == 0) {
                                    l3.hashCode();
                                    throw null;
                                }
                            } else {
                                l3 = l2;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1022031735, i9, -1, "im.toss.compose.animation.SampleAnimateTicker (AnimateTicker.kt:226)");
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1374992292);
                            List<String> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            for (final String str : list2) {
                                arrayList.add(ForwardingCameraControl.onExtraCallback(1473784846, true, new getBacktraceNote() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda11
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i15 = 2 % 2;
                                        int i16 = onWarmupCompleted + 39;
                                        onNavigationEvent = i16 % 128;
                                        int i17 = i16 % 2;
                                        String str2 = str;
                                        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) obj;
                                        if (i17 == 0) {
                                            return getClipToCompositionBounds.onExtraCallbackWithResult(str2, getswitchminwidth, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        Unit unitOnExtraCallbackWithResult = getClipToCompositionBounds.onExtraCallbackWithResult(str2, getswitchminwidth, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i18 = 11 / 0;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54));
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            int i15 = i9 >> 3;
                            int i16 = i9 << 6;
                            IAuthTabCallback(quirksExternalSyntheticBackport02, false, j4, 0L, i5, null, onextracallbackwithresult, onwarmupcompleted, l3, arrayList, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i15 & 14) | 48 | (i15 & 896) | (57344 & i16) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), 40);
                            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            l2 = l3;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            j3 = j4;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            j3 = j2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final int i17 = i5;
                            final Long l4 = l2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda12
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i18 = 2 % 2;
                                    int i19 = onExtraCallback + 15;
                                    onExtraCallbackWithResult = i19 % 128;
                                    int i20 = i19 % 2;
                                    Unit unitOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent(list, quirksExternalSyntheticBackport03, i17, j3, onextracallbackwithresult, onwarmupcompleted, l4, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i21 = onExtraCallbackWithResult + 105;
                                    onExtraCallback = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        int i22 = 23 / 0;
                                    }
                                    return unitOnNavigationEvent;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 |= 1572864;
                    l2 = l;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 599187) != 599186, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                j2 = j;
                if ((i2 & 24576) == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                }
                l2 = l;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 599187) != 599186, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i5 = i;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            j2 = j;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            l2 = l;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 599187) != 599186, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i18 = IAuthTabCallbackStub + 13;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        j2 = j;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        l2 = l;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 599187) != 599186, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        getClipTextToBoundingBox getcliptexttoboundingbox = (getClipTextToBoundingBox) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getcliptexttoboundingbox, "");
        int i2 = IAuthTabCallbackStub.onExtraCallback[getcliptexttoboundingbox.ordinal()];
        if (i2 == 1) {
            getAsyncUpdates getasyncupdates = onExtraCallbackWithResult;
            int i3 = onTransact + 3;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return getasyncupdates;
        }
        int i5 = onTransact + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == 2) {
            return onExtraCallback;
        }
        if (i2 == 3) {
            return onWarmupCompleted;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, @Nullable Function1<? super getClipTextToBoundingBox, getAsyncUpdates> function1, @Nullable TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, @Nullable TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, @Nullable final Long l, @NotNull final List<? extends getBacktraceNote<? super getSwitchMinWidth<getClipTextToBoundingBox>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final boolean z2;
        final long j4;
        final int i14;
        final Function1<? super getClipTextToBoundingBox, getAsyncUpdates> function12;
        final long j5;
        final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2;
        final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i15;
        Function1<? super getClipTextToBoundingBox, getAsyncUpdates> function13;
        int i16;
        int i17;
        int i18 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1284280186);
        if ((i2 & 6) == 0) {
            int i19 = IAuthTabCallbackStub + 99;
            onTransact = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 63 / 0;
                i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
            }
            i4 = i17 | i2;
        } else {
            i4 = i2;
        }
        int i21 = i3 & 2;
        if (i21 != 0) {
            int i22 = IAuthTabCallbackStub + 47;
            onTransact = i22 % 128;
            int i23 = i22 % 2;
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                    int i24 = IAuthTabCallbackStub + 35;
                    onTransact = i24 % 128;
                    i5 = i24 % 2 == 0 ? 59 : 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        int i25 = onTransact + 93;
                        IAuthTabCallbackStub = i25 % 128;
                        int i26 = i25 % 2;
                        j3 = j2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        int i27 = IAuthTabCallbackStub + 103;
                        onTransact = i27 % 128;
                        int i28 = i27 % 2;
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                                int i29 = IAuthTabCallbackStub + 109;
                                onTransact = i29 % 128;
                                int i30 = i29 % 2;
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i10 = i9 | i4;
                        }
                        i11 = i3 & 32;
                        if (i11 == 0) {
                            if ((196608 & i2) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
                            }
                            i12 = i3 & 64;
                            if (i12 == 0) {
                                i10 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 1048576 : 524288;
                            }
                            i13 = i3 & 128;
                            if (i13 == 0) {
                                i10 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 8388608 : 4194304;
                            }
                            if ((100663296 & i2) != 0) {
                                int i31 = onTransact + 23;
                                IAuthTabCallbackStub = i31 % 128;
                                int i32 = i31 % 2;
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l) ? 67108864 : 33554432;
                            }
                            if ((805306368 & i2) == 0) {
                                int i33 = IAuthTabCallbackStub + 25;
                                onTransact = i33 % 128;
                                if (i33 % 2 == 0) {
                                    int i34 = 54 / 0;
                                    i16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 536870912 : 268435456;
                                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                                }
                                i10 |= i16;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                z2 = z;
                                j4 = j;
                                i14 = i;
                                function12 = function1;
                                j5 = j3;
                                onextracallbackwithresult2 = onextracallbackwithresult;
                                onwarmupcompleted2 = onwarmupcompleted;
                            } else {
                                boolean z3 = i21 == 0 ? z : true;
                                long j6 = i6 != 0 ? 0L : j;
                                long j7 = i7 != 0 ? 1000L : j3;
                                if (i8 != 0) {
                                    int i35 = onTransact + 115;
                                    IAuthTabCallbackStub = i35 % 128;
                                    if (i35 % 2 != 0) {
                                        throw null;
                                    }
                                    i15 = -1;
                                } else {
                                    i15 = i;
                                }
                                if (i11 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda14
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallback;

                                            public final Object invoke(Object obj) {
                                                int i36 = 2 % 2;
                                                int i37 = onExtraCallback + 85;
                                                IAuthTabCallback = i37 % 128;
                                                getClipTextToBoundingBox getcliptexttoboundingbox = (getClipTextToBoundingBox) obj;
                                                if (i37 % 2 == 0) {
                                                    getClipToCompositionBounds.onWarmupCompleted(getcliptexttoboundingbox);
                                                    Object obj2 = null;
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                getAsyncUpdates getasyncupdatesOnWarmupCompleted = getClipToCompositionBounds.onWarmupCompleted(getcliptexttoboundingbox);
                                                int i38 = onExtraCallback + 61;
                                                IAuthTabCallback = i38 % 128;
                                                if (i38 % 2 == 0) {
                                                    int i39 = 5 / 0;
                                                }
                                                return getasyncupdatesOnWarmupCompleted;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    function13 = (Function1) objOnMinimized;
                                } else {
                                    function13 = function1;
                                }
                                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult3 = i12 != 0 ? TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT : onextracallbackwithresult;
                                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted3 = i13 != 0 ? TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER : onwarmupcompleted;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1284280186, i10, -1, "im.toss.compose.animation.AnimateTicker (AnimateTicker.kt:265)");
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                onNavigationEvent(-1358789098, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1358789104, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, Boolean.valueOf(z3), Long.valueOf(j6), Long.valueOf(j7), Integer.valueOf(i15), function13, onextracallbackwithresult3, onwarmupcompleted3, l, list, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i10 & 2147483646), 0}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i36 = IAuthTabCallbackStub + 17;
                                    onTransact = i36 % 128;
                                    int i37 = i36 % 2;
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                i14 = i15;
                                onextracallbackwithresult2 = onextracallbackwithresult3;
                                z2 = z3;
                                j4 = j6;
                                j5 = j7;
                                function12 = function13;
                                onwarmupcompleted2 = onwarmupcompleted3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda15
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i38 = 2 % 2;
                                        int i39 = onWarmupCompleted + 73;
                                        onNavigationEvent = i39 % 128;
                                        int i40 = i39 % 2;
                                        Unit unitOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent(quirksExternalSyntheticBackport0, z2, j4, j5, i14, function12, onextracallbackwithresult2, onwarmupcompleted2, l, list, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i41 = onNavigationEvent + 109;
                                        onWarmupCompleted = i41 % 128;
                                        int i42 = i41 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 |= 196608;
                        i12 = i3 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i3 & 128;
                        if (i13 == 0) {
                        }
                        if ((100663296 & i2) != 0) {
                        }
                        if ((805306368 & i2) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i10 = i4;
                    i11 = i3 & 32;
                    if (i11 == 0) {
                    }
                    i12 = i3 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i3 & 128;
                    if (i13 == 0) {
                    }
                    if ((100663296 & i2) != 0) {
                    }
                    if ((805306368 & i2) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                j3 = j2;
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                i10 = i4;
                i11 = i3 & 32;
                if (i11 == 0) {
                }
                i12 = i3 & 64;
                if (i12 == 0) {
                }
                i13 = i3 & 128;
                if (i13 == 0) {
                }
                if ((100663296 & i2) != 0) {
                }
                if ((805306368 & i2) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            j3 = j2;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            i10 = i4;
            i11 = i3 & 32;
            if (i11 == 0) {
            }
            i12 = i3 & 64;
            if (i12 == 0) {
            }
            i13 = i3 & 128;
            if (i13 == 0) {
            }
            if ((100663296 & i2) != 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        j3 = j2;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        i10 = i4;
        i11 = i3 & 32;
        if (i11 == 0) {
        }
        i12 = i3 & 64;
        if (i12 == 0) {
        }
        i13 = i3 & 128;
        if (i13 == 0) {
        }
        if ((100663296 & i2) != 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i10) == 306783378, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final getAsyncUpdates onExtraCallback(getClipTextToBoundingBox getcliptexttoboundingbox) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getcliptexttoboundingbox, "");
        int i2 = IAuthTabCallbackStub.onExtraCallback[getcliptexttoboundingbox.ordinal()];
        if (i2 == 1) {
            return onExtraCallbackWithResult;
        }
        int i3 = onTransact + 125;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if (i2 == 2) {
            return onExtraCallback;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i4 + 27;
        int i7 = i6 % 128;
        onTransact = i7;
        int i8 = i6 % 2;
        getAsyncUpdates getasyncupdates = onWarmupCompleted;
        int i9 = i7 + 41;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            return getasyncupdates;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ findResAndMsg $coroutineScope;
        final /* synthetic */ long $delay;
        final /* synthetic */ long $interval;
        final /* synthetic */ int $playCount;
        final /* synthetic */ List<getBacktraceNote<getSwitchMinWidth<getClipTextToBoundingBox>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> $slotList;
        final /* synthetic */ Long $startTimeMillisIncluding;
        final /* synthetic */ LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> $transitionMap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(findResAndMsg findresandmsg, long j, List<? extends getBacktraceNote<? super getSwitchMinWidth<getClipTextToBoundingBox>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, int i, LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> liveDataObservableResult, Long l, long j2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$coroutineScope = findresandmsg;
            this.$delay = j;
            this.$slotList = list;
            this.$playCount = i;
            this.$transitionMap = liveDataObservableResult;
            this.$startTimeMillisIncluding = l;
            this.$interval = j2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$coroutineScope, this.$delay, this.$slotList, this.$playCount, this.$transitionMap, this.$startTimeMillisIncluding, this.$interval, access13800Var);
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(this.$coroutineScope, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new AnonymousClass5(this.$delay, new Ref.IntRef(), this.$slotList, this.$playCount, this.$transitionMap, this.$startTimeMillisIncluding, this.$interval, null), 2, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 53;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* renamed from: o.getClipToCompositionBounds$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Ref.IntRef $cumulativePlayCount;
            final /* synthetic */ long $delay;
            final /* synthetic */ long $interval;
            final /* synthetic */ int $playCount;
            final /* synthetic */ List<getBacktraceNote<getSwitchMinWidth<getClipTextToBoundingBox>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> $slotList;
            final /* synthetic */ Long $startTimeMillisIncluding;
            final /* synthetic */ LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> $transitionMap;
            int I$0;
            int I$1;
            long J$0;
            long J$1;
            long J$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(long j, Ref.IntRef intRef, List<? extends getBacktraceNote<? super getSwitchMinWidth<getClipTextToBoundingBox>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, int i, LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> liveDataObservableResult, Long l, long j2, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$delay = j;
                this.$cumulativePlayCount = intRef;
                this.$slotList = list;
                this.$playCount = i;
                this.$transitionMap = liveDataObservableResult;
                this.$startTimeMillisIncluding = l;
                this.$interval = j2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$delay, this.$cumulativePlayCount, this.$slotList, this.$playCount, this.$transitionMap, this.$startTimeMillisIncluding, this.$interval, access13800Var);
                int i2 = onNavigationEvent + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 74 / 0;
                }
                int i5 = onNavigationEvent + 49;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnNavigationEvent;
                }
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return anonymousClass5Create.invokeSuspend(unit);
                }
                anonymousClass5Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
            
                if (o.formatMsgs.onWarmupCompleted(r10, r13) == r1) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
            
                if (o.b10.IAuthTabCallback(r13) == r1) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01b0, code lost:
            
                if (o.formatMsgs.onWarmupCompleted(r6, r13) == r1) goto L94;
             */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01b3 -> B:23:0x004f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                getClipTextToBoundingBox getcliptexttoboundingbox;
                makeLayout makelayout;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    long j = this.$delay;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                int i3 = onNavigationEvent + 75;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 == 0 ? i2 == 1 : i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                } else {
                    if (i2 != 2 && i2 != 3) {
                        int i5 = i4 + 71;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0 ? i2 != 4 : i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ResultKt.onNavigationEvent(obj);
                    this.$cumulativePlayCount.element++;
                }
                int size = this.$cumulativePlayCount.element / this.$slotList.size();
                int i6 = this.$playCount;
                if (size < i6 && i6 != -1) {
                    return Unit.INSTANCE;
                }
                int size2 = this.$cumulativePlayCount.element % this.$slotList.size();
                int lastIndex = size2 - 1;
                if (lastIndex < 0) {
                    lastIndex = CollectionsKt.getLastIndex(this.$slotList);
                }
                List<getBacktraceNote<getSwitchMinWidth<getClipTextToBoundingBox>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> list = this.$slotList;
                LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> liveDataObservableResult = this.$transitionMap;
                int i7 = 0;
                for (Object obj2 : list) {
                    if (i7 < 0) {
                        int i8 = onNavigationEvent + 97;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            CollectionsKt.throwIndexOverflow();
                            int i9 = 4 / 0;
                        } else {
                            CollectionsKt.throwIndexOverflow();
                        }
                    }
                    if (i7 != size2 && i7 != lastIndex && (makelayout = (makeLayout) liveDataObservableResult.get(access14000.onNavigationEvent(i7))) != null) {
                        makelayout.onExtraCallback(getClipTextToBoundingBox.None);
                    }
                    i7++;
                }
                Object obj3 = null;
                if (lastIndex != size2) {
                    makeLayout makelayout2 = (makeLayout) this.$transitionMap.get(access14000.onNavigationEvent(lastIndex));
                    if (makelayout2 != null) {
                        int i10 = onExtraCallback + 103;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            getcliptexttoboundingbox = (getClipTextToBoundingBox) makelayout2.onWarmupCompleted();
                            int i11 = 32 / 0;
                        } else {
                            getcliptexttoboundingbox = (getClipTextToBoundingBox) makelayout2.onWarmupCompleted();
                        }
                    } else {
                        getcliptexttoboundingbox = null;
                    }
                    if (getcliptexttoboundingbox != getClipTextToBoundingBox.None) {
                        int i12 = onExtraCallback + 49;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        makeLayout makelayout3 = (makeLayout) this.$transitionMap.get(access14000.onNavigationEvent(lastIndex));
                        if (makelayout3 != null) {
                            int i14 = onExtraCallback + 109;
                            onNavigationEvent = i14 % 128;
                            if (i14 % 2 == 0) {
                                makelayout3.onExtraCallback(getClipTextToBoundingBox.Out);
                                obj3.hashCode();
                                throw null;
                            }
                            makelayout3.onExtraCallback(getClipTextToBoundingBox.Out);
                        }
                    }
                }
                makeLayout makelayout4 = (makeLayout) this.$transitionMap.get(access14000.onNavigationEvent(size2));
                getClipTextToBoundingBox getcliptexttoboundingbox2 = makelayout4 == null ? (getClipTextToBoundingBox) makelayout4.onWarmupCompleted() : null;
                getClipTextToBoundingBox getcliptexttoboundingbox3 = getClipTextToBoundingBox.In;
                if (getcliptexttoboundingbox2 != getcliptexttoboundingbox3) {
                    LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> liveDataObservableResult2 = this.$transitionMap;
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(size2);
                    makeLayout makelayout5 = new makeLayout(getClipTextToBoundingBox.None);
                    makelayout5.onExtraCallback(getcliptexttoboundingbox3);
                    liveDataObservableResult2.put(numOnNavigationEvent, makelayout5);
                }
                if (size2 == lastIndex) {
                    Long l = this.$startTimeMillisIncluding;
                    if (l != null) {
                        int i15 = onExtraCallback + 43;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % 2;
                        long jLongValue = l.longValue() + (this.$cumulativePlayCount.element * this.$interval);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j2 = jLongValue - jElapsedRealtime;
                        this.I$0 = size2;
                        this.I$1 = lastIndex;
                        this.J$0 = jLongValue;
                        this.J$1 = jElapsedRealtime;
                        this.J$2 = j2;
                        if (j2 > 0) {
                            this.label = 2;
                        } else {
                            this.label = 3;
                        }
                    } else {
                        long j3 = this.$interval;
                        this.I$0 = size2;
                        this.I$1 = lastIndex;
                        this.label = 4;
                    }
                    int size3 = this.$cumulativePlayCount.element / this.$slotList.size();
                    int i62 = this.$playCount;
                    if (size3 < i62) {
                    }
                    int size22 = this.$cumulativePlayCount.element % this.$slotList.size();
                    int lastIndex2 = size22 - 1;
                    if (lastIndex2 < 0) {
                    }
                    List<getBacktraceNote<getSwitchMinWidth<getClipTextToBoundingBox>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> list2 = this.$slotList;
                    LiveDataObservableResult<Integer, makeLayout<getClipTextToBoundingBox>> liveDataObservableResult3 = this.$transitionMap;
                    int i72 = 0;
                    while (r6.hasNext()) {
                    }
                    Object obj32 = null;
                    if (lastIndex2 != size22) {
                    }
                    makeLayout makelayout42 = (makeLayout) this.$transitionMap.get(access14000.onNavigationEvent(size22));
                    if (makelayout42 == null) {
                    }
                    getClipTextToBoundingBox getcliptexttoboundingbox32 = getClipTextToBoundingBox.In;
                    if (getcliptexttoboundingbox2 != getcliptexttoboundingbox32) {
                    }
                    if (size22 == lastIndex2) {
                        int i17 = onNavigationEvent + 107;
                        onExtraCallback = i17 % 128;
                        if (i17 % 2 == 0) {
                            return Unit.INSTANCE;
                        }
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                }
            }
        }
    }

    private static final updateFocusedState onExtraCallbackWithResult(Function1 function1, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1089207920);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1089207920);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1089207920, i, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:358)");
        }
        updateFocusedState<VirtualCameraControlExternalSyntheticLambda1> updatefocusedstateOnWarmupCompleted = ((getAsyncUpdates) function1.invoke(onextracallback.onExtraCallback())).onExtraCallbackWithResult().onWarmupCompleted();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackStub + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onTransact + 37;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return updatefocusedstateOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final updateFocusedState onNavigationEvent(Function1 function1, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1629947364);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 37;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1629947364, i, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:365)");
            if (i6 == 0) {
                int i7 = 89 / 0;
            }
        }
        updateFocusedState<Float> updatefocusedstateOnWarmupCompleted = ((getAsyncUpdates) function1.invoke(onextracallback.onExtraCallback())).onExtraCallback().onWarmupCompleted();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstateOnWarmupCompleted;
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue() == 1.0f) {
            int i4 = onTransact + 93;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return 1.0f;
        }
        int i6 = onTransact + 41;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return 0.0f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access000(fliphorizontally.onExtraCallback(((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback()));
        fliphorizontally.IAuthTabCallbackStub(((Number) cameraPresenceProviderExternalSyntheticLambda62.onExtraCallbackWithResult()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LiveDataObservableResult liveDataObservableResult, int i, final Function1 function1, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        Object objIAuthTabCallback;
        Object objIAuthTabCallback2;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        boolean zOnNavigationEvent3;
        Object objOnMinimized3;
        boolean zOnNavigationEvent4;
        boolean zOnNavigationEvent5;
        Object objOnMinimized4;
        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback;
        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback;
        Function1 function1IAuthTabCallbackStub;
        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = onTransact + 61;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1806204833, i2, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:354)");
            }
            makeLayout makelayout = (makeLayout) liveDataObservableResult.get(Integer.valueOf(i));
            if (makelayout == null) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i6 = onTransact + 85;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i7 = 93 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            }
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(makelayout, "AnimateTickerSlot" + i, cameraCaptureResultEmptyCameraCaptureResult, makeLayout.onNavigationEvent, 0);
            String str = "AnimateTickerSlot" + i;
            getBacktraceNote getbacktracenote2 = new getBacktraceNote() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 19;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    updateFocusedState updatefocusedstateOnExtraCallback = getClipToCompositionBounds.onExtraCallback(function1, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onWarmupCompleted + 41;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return updatefocusedstateOnExtraCallback;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
            Object obj = null;
            if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent6) {
                    int i8 = IAuthTabCallbackStub + 57;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    if (objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                        r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback3 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback3);
                            objIAuthTabCallback = objIAuthTabCallback3;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            getClipTextToBoundingBox getcliptexttoboundingbox = (getClipTextToBoundingBox) objIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(311609585);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(311609585, 0, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:360)");
            }
            float fIAuthTabCallback = ((getAsyncUpdates) function1.invoke(getcliptexttoboundingbox)).onExtraCallbackWithResult().onExtraCallback().IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackStub + 107;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent7 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            getClipTextToBoundingBox getcliptexttoboundingbox2 = (getClipTextToBoundingBox) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(311609585);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(311609585, 0, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:360)");
            }
            float fIAuthTabCallback2 = ((getAsyncUpdates) function1.invoke(getcliptexttoboundingbox2)).onExtraCallbackWithResult().onExtraCallback().IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent8) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onTransact(getswitchminwidthOnWarmupCompleted));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) getbacktracenote2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized6).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult, str, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String str2 = "AnimateTickerSlot" + i;
            getBacktraceNote getbacktracenote3 = new getBacktraceNote() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 123;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 == 0) {
                        getClipToCompositionBounds.IAuthTabCallback(function1, (getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                    updateFocusedState updatefocusedstateIAuthTabCallback = getClipToCompositionBounds.IAuthTabCallback(function1, (getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i14 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    return updatefocusedstateIAuthTabCallback;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
            } else {
                int i12 = IAuthTabCallbackStub + 9;
                onTransact = i12 % 128;
                if (i12 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent9) {
                    int i13 = IAuthTabCallbackStub + 53;
                    onTransact = i13 % 128;
                    if (i13 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null) {
                            int i14 = onTransact + 101;
                            IAuthTabCallbackStub = i14 % 128;
                            int i15 = i14 % 2;
                            function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                        } else {
                            function1IAuthTabCallbackStub = null;
                        }
                        r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback4 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback4);
                            objIAuthTabCallback2 = objIAuthTabCallback4;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            getClipTextToBoundingBox getcliptexttoboundingbox3 = (getClipTextToBoundingBox) objIAuthTabCallback2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(887247029);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(887247029, 0, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:367)");
            }
            float fFloatValue = ((getAsyncUpdates) function1.invoke(getcliptexttoboundingbox3)).onExtraCallback().onExtraCallback().floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent10) {
                int i16 = IAuthTabCallbackStub + 9;
                onTransact = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 72 / 0;
                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                    }
                    getClipTextToBoundingBox getcliptexttoboundingbox4 = (getClipTextToBoundingBox) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized7).onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(887247029);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = IAuthTabCallbackStub + 101;
                        onTransact = i18 % 128;
                        if (i18 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(887247029, 1, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:367)");
                        } else {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(887247029, 0, -1, "im.toss.compose.animation.AnimateTickerInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimateTicker.kt:367)");
                        }
                    }
                    float fFloatValue2 = ((getAsyncUpdates) function1.invoke(getcliptexttoboundingbox4)).onExtraCallback().onExtraCallback().floatValue();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), (updateFocusedState) getbacktracenote3.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback, str2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda3
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i19 = 2 % 2;
                                int i20 = onExtraCallbackWithResult + 115;
                                onWarmupCompleted = i20 % 128;
                                if (i20 % 2 == 0) {
                                    Float.valueOf(getClipToCompositionBounds.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6));
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                Float fValueOf = Float.valueOf(getClipToCompositionBounds.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6));
                                int i21 = onWarmupCompleted + 123;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                return fValueOf;
                            }
                        });
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, ((Number) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult()).floatValue());
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent4 | zOnNavigationEvent5) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda4
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                int i19 = 2 % 2;
                                int i20 = onExtraCallback + 15;
                                onWarmupCompleted = i20 % 128;
                                Object obj3 = null;
                                if (i20 % 2 != 0) {
                                    getClipToCompositionBounds.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj2);
                                    obj3.hashCode();
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = getClipToCompositionBounds.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj2);
                                int i21 = onWarmupCompleted + 7;
                                onExtraCallback = i21 % 128;
                                if (i21 % 2 != 0) {
                                    return unitOnWarmupCompleted;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized4);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    getbacktracenote.invoke(getswitchminwidthOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i19 = onTransact + 29;
                        IAuthTabCallbackStub = i19 % 128;
                        if (i19 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    getClipTextToBoundingBox getcliptexttoboundingbox42 = (getClipTextToBoundingBox) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized7).onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(887247029);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    float fFloatValue22 = ((getAsyncUpdates) function1.invoke(getcliptexttoboundingbox42)).onExtraCallback().onExtraCallback().floatValue();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue22), (updateFocusedState) getbacktracenote3.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback, str2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent2) {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback));
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                            cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnNavigationEvent3) {
                                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda3
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke() {
                                        int i192 = 2 % 2;
                                        int i20 = onExtraCallbackWithResult + 115;
                                        onWarmupCompleted = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            Float.valueOf(getClipToCompositionBounds.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6));
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        Float fValueOf = Float.valueOf(getClipToCompositionBounds.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6));
                                        int i21 = onWarmupCompleted + 123;
                                        onExtraCallbackWithResult = i21 % 128;
                                        int i22 = i21 % 2;
                                        return fValueOf;
                                    }
                                });
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = submit.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, ((Number) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult()).floatValue());
                                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                                zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnNavigationEvent4 | zOnNavigationEvent5)) {
                                    objOnMinimized4 = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda4
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj2) {
                                            int i192 = 2 % 2;
                                            int i20 = onExtraCallback + 15;
                                            onWarmupCompleted = i20 % 128;
                                            Object obj3 = null;
                                            if (i20 % 2 != 0) {
                                                getClipToCompositionBounds.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj2);
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            Unit unitOnWarmupCompleted = getClipToCompositionBounds.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj2);
                                            int i21 = onWarmupCompleted + 7;
                                            onExtraCallback = i21 % 128;
                                            if (i21 % 2 != 0) {
                                                return unitOnWarmupCompleted;
                                            }
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, (Function1) objOnMinimized4);
                                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
                                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                    getbacktracenote.invoke(getswitchminwidthOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Object obj;
        int iQ_;
        int i;
        int iIAuthTabCallbackStubProxy;
        int iIAuthTabCallbackStubProxy2;
        int i2 = 0;
        List list = (List) objArr[0];
        boolean z = true;
        final LiveDataObservableResult liveDataObservableResult = (LiveDataObservableResult) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[3];
        final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[4];
        isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[5];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[6];
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        List list2 = list;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        final int i4 = 0;
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    int i5 = onTransact + 107;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) obj;
                    int iQ_2 = getstreamsharingchildren != null ? getstreamsharingchildren.Q_() : 0;
                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex > 0) {
                        int i6 = onTransact + 11;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 1;
                        while (true) {
                            Object obj3 = arrayList.get(i8);
                            getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) obj3;
                            int iQ_3 = getstreamsharingchildren2 != null ? getstreamsharingchildren2.Q_() : 0;
                            if (iQ_2 < iQ_3) {
                                obj = obj3;
                                iQ_2 = iQ_3;
                            }
                            if (i8 == lastIndex) {
                                break;
                            }
                            int i9 = IAuthTabCallbackStub + 9;
                            onTransact = i9 % 128;
                            i8 = i9 % 2 == 0 ? i8 + 53 : i8 + 1;
                        }
                    }
                }
                getStreamSharingChildren getstreamsharingchildren3 = (getStreamSharingChildren) obj;
                if (getstreamsharingchildren3 != null) {
                    int i10 = IAuthTabCallbackStub + 91;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                    iQ_ = getstreamsharingchildren3.Q_();
                } else {
                    iQ_ = 0;
                }
                if (!arrayList.isEmpty()) {
                    obj2 = arrayList.get(0);
                    getStreamSharingChildren getstreamsharingchildren4 = (getStreamSharingChildren) obj2;
                    int iIAuthTabCallbackStubProxy3 = getstreamsharingchildren4 != null ? getstreamsharingchildren4.IAuthTabCallbackStubProxy() : 0;
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex2 > 0) {
                        int i12 = onTransact + 121;
                        IAuthTabCallbackStub = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = 1;
                        while (true) {
                            Object obj4 = arrayList.get(i14);
                            getStreamSharingChildren getstreamsharingchildren5 = (getStreamSharingChildren) obj4;
                            if (getstreamsharingchildren5 != null) {
                                iIAuthTabCallbackStubProxy2 = getstreamsharingchildren5.IAuthTabCallbackStubProxy();
                                int i15 = onTransact + 39;
                                IAuthTabCallbackStub = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i16 = 5 % 2;
                                }
                            } else {
                                iIAuthTabCallbackStubProxy2 = 0;
                            }
                            if (iIAuthTabCallbackStubProxy3 < iIAuthTabCallbackStubProxy2) {
                                obj2 = obj4;
                                iIAuthTabCallbackStubProxy3 = iIAuthTabCallbackStubProxy2;
                            }
                            if (i14 == lastIndex2) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
                getStreamSharingChildren getstreamsharingchildren6 = (getStreamSharingChildren) obj2;
                if (getstreamsharingchildren6 != null) {
                    int i17 = IAuthTabCallbackStub + 55;
                    onTransact = i17 % 128;
                    if (i17 % 2 == 0) {
                        iIAuthTabCallbackStubProxy = getstreamsharingchildren6.IAuthTabCallbackStubProxy();
                        int i18 = 56 / 0;
                    } else {
                        iIAuthTabCallbackStubProxy = getstreamsharingchildren6.IAuthTabCallbackStubProxy();
                    }
                    i = iIAuthTabCallbackStubProxy;
                } else {
                    i = 0;
                }
                final int i19 = iQ_;
                final int i20 = i;
                return component4.IAuthTabCallback(isextrapreviewrequired, iQ_, i, (Map) null, new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda17
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj5) {
                        int i21 = 2 % 2;
                        int i22 = onNavigationEvent + 29;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 == 0) {
                            return getClipToCompositionBounds.onExtraCallbackWithResult(arrayList, liveDataObservableResult, onextracallbackwithresult, i19, onwarmupcompleted, i20, (getStreamSharingChildren.onExtraCallbackWithResult) obj5);
                        }
                        getClipToCompositionBounds.onExtraCallbackWithResult(arrayList, liveDataObservableResult, onextracallbackwithresult, i19, onwarmupcompleted, i20, (getStreamSharingChildren.onExtraCallbackWithResult) obj5);
                        throw null;
                    }
                }, 4, (Object) null);
            }
            Object next = it.next();
            if (i4 < 0) {
                int i21 = IAuthTabCallbackStub + 95;
                onTransact = i21 % 128;
                if (i21 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            final getBacktraceNote getbacktracenote = (getBacktraceNote) next;
            List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback("AnimateTickerSlot" + i4, ForwardingCameraControl.onExtraCallbackWithResult(-1806204833, z, new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj5, Object obj6) {
                    int i22 = 2 % 2;
                    int i23 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    LiveDataObservableResult liveDataObservableResult2 = liveDataObservableResult;
                    int i25 = i4;
                    int iIntValue = ((Integer) obj6).intValue();
                    Object[] objArr2 = {liveDataObservableResult2, Integer.valueOf(i25), function1, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) getClipToCompositionBounds.onNavigationEvent(912331526, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -912331526, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    int i26 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i26 % 128;
                    int i27 = i26 % 2;
                    return unit;
                }
            }));
            ArrayList arrayList2 = new ArrayList(listIAuthTabCallback.size());
            int size = listIAuthTabCallback.size();
            int i22 = i2;
            while (i22 < size) {
                arrayList2.add(((component7) listIAuthTabCallback.get(i22)).onExtraCallback(virtualCameraCaptureResult.onExtraCallback()));
                i22++;
                it = it;
            }
            arrayList.add((getStreamSharingChildren) CollectionsKt.firstOrNull(arrayList2));
            i4++;
            i2 = 0;
            z = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[PHI: r10
      0x0063: PHI (r10v10 java.lang.Object) = (r10v9 java.lang.Object), (r10v20 java.lang.Object) binds: [B:11:0x0061, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object next;
        int iQ_;
        int iIAuthTabCallbackStubProxy;
        List list = (List) objArr[0];
        LiveDataObservableResult liveDataObservableResult = (LiveDataObservableResult) objArr[1];
        TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2 = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[6];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = IAuthTabCallbackStub + 1;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                int i6 = 8 / 0;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                if (i4 < 0) {
                }
            }
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) next;
            makeLayout makelayout = (makeLayout) liveDataObservableResult.get(Integer.valueOf(i4));
            if (getstreamsharingchildren != null && makelayout != null) {
                int i7 = IAuthTabCallbackStub.onWarmupCompleted[onextracallbackwithresult.ordinal()];
                if (i7 == 1) {
                    iQ_ = 0;
                } else if (i7 != 2) {
                    int i8 = IAuthTabCallbackStub + 117;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    iQ_ = iIntValue - getstreamsharingchildren.Q_();
                } else {
                    iQ_ = (iIntValue - getstreamsharingchildren.Q_()) / 2;
                }
                int i10 = IAuthTabCallbackStub.IAuthTabCallback[onwarmupcompleted.ordinal()];
                if (i10 == 1) {
                    iIAuthTabCallbackStubProxy = 0;
                } else if (i10 != 2) {
                    int i11 = IAuthTabCallbackStub + 19;
                    onTransact = i11 % 128;
                    iIAuthTabCallbackStubProxy = i11 % 2 == 0 ? iIntValue2 >>> getstreamsharingchildren.IAuthTabCallbackStubProxy() : iIntValue2 - getstreamsharingchildren.IAuthTabCallbackStubProxy();
                } else {
                    iIAuthTabCallbackStubProxy = (iIntValue2 - getstreamsharingchildren.IAuthTabCallbackStubProxy()) / 2;
                }
                if (makelayout.onWarmupCompleted() != getClipTextToBoundingBox.None) {
                    int i12 = IAuthTabCallbackStub + 65;
                    onTransact = i12 % 128;
                    int i13 = i12 % 2;
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult2, getstreamsharingchildren, iQ_, iIAuthTabCallbackStubProxy, 0.0f, 4, (Object) null);
                }
            }
            i4++;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f A[PHI: r6
      0x011f: PHI (r6v17 int) = (r6v4 int), (r6v7 int), (r6v8 int) binds: [B:56:0x011d, B:63:0x012d, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138 A[PHI: r8
      0x0138: PHI (r8v27 int) = (r8v0 int), (r8v5 int), (r8v6 int) binds: [B:65:0x0136, B:75:0x014e, B:74:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        List list;
        int i11;
        final List list2;
        Long l;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function1 function1;
        final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult;
        final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted;
        final long j;
        final long j2;
        final int i12;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        boolean z;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Function1 function12 = (Function1) objArr[5];
        TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2 = (TdsAnimateTickerV1Layout.onExtraCallbackWithResult) objArr[6];
        TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2 = (TdsAnimateTickerV1Layout.onWarmupCompleted) objArr[7];
        final Long l2 = (Long) objArr[8];
        List list3 = (List) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        final int iIntValue2 = ((Number) objArr[11]).intValue();
        final int iIntValue3 = ((Number) objArr[12]).intValue();
        int i13 = 2 % 2;
        int i14 = onTransact + 17;
        IAuthTabCallbackStub = i14 % 128;
        int i15 = i14 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-616604521);
        if ((iIntValue2 & 6) == 0) {
            int i16 = IAuthTabCallbackStub + 23;
            onTransact = i16 % 128;
            int i17 = i16 % 2;
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        int i18 = iIntValue3 & 2;
        if (i18 == 0) {
            if ((iIntValue2 & 48) == 0) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                int i19 = onTransact + 119;
                i2 = i18;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ^ true ? 16 : 32;
            }
            i3 = iIntValue3 & 4;
            if (i3 == 0) {
                i |= 384;
            } else if ((iIntValue2 & 384) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 256 : 128;
            }
            i4 = iIntValue3 & 8;
            boolean z3 = zBooleanValue;
            if (i4 == 0) {
                i |= 3072;
            } else if ((iIntValue2 & 3072) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2) ? 2048 : 1024;
            }
            i5 = iIntValue3 & 16;
            long j3 = jLongValue;
            if (i5 == 0) {
                i |= 24576;
            } else if ((iIntValue2 & 24576) == 0) {
                int i21 = onTransact + 89;
                IAuthTabCallbackStub = i21 % 128;
                if (i21 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue);
                    throw null;
                }
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 16384 : 8192;
            }
            i6 = iIntValue3 & 32;
            int i22 = 196608;
            if (i6 != 0) {
                i |= i22;
            } else if ((196608 & iIntValue2) == 0) {
                i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
                i |= i22;
            }
            i7 = iIntValue3 & 64;
            int i23 = 1572864;
            if (i7 != 0) {
                i |= i23;
            } else if ((1572864 & iIntValue2) == 0) {
                i23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult2 == null ? -1 : onextracallbackwithresult2.ordinal()) ? 1048576 : 524288;
                i |= i23;
            }
            i8 = iIntValue3 & 128;
            if (i8 != 0) {
                i9 = iIntValue;
                if ((12582912 & iIntValue2) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted2 == null ? -1 : onwarmupcompleted2.ordinal())) {
                        int i24 = onTransact + 113;
                        IAuthTabCallbackStub = i24 % 128;
                        int i25 = i24 % 2;
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                }
                if ((100663296 & iIntValue2) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l2) ? 67108864 : 33554432;
                }
                if ((805306368 & iIntValue2) == 0) {
                    list = list3;
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 536870912 : 268435456;
                } else {
                    list = list3;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i & 306783379) == 306783378), i & 1)) {
                    boolean z4 = i2 != 0 ? true : z3;
                    if (i3 != 0) {
                        j3 = 0;
                    }
                    final long j4 = j3;
                    long j5 = i4 != 0 ? 1000L : jLongValue2;
                    i12 = i5 != 0 ? -1 : i9;
                    if (i6 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda7
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                                    int i26 = 2 % 2;
                                    int i27 = onWarmupCompleted + 27;
                                    IAuthTabCallback = i27 % 128;
                                    getClipTextToBoundingBox getcliptexttoboundingbox = (getClipTextToBoundingBox) obj;
                                    if (i27 % 2 == 0) {
                                        getClipToCompositionBounds.onNavigationEvent(getcliptexttoboundingbox);
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    getAsyncUpdates getasyncupdatesOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent(getcliptexttoboundingbox);
                                    int i28 = onWarmupCompleted + 29;
                                    IAuthTabCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    return getasyncupdatesOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function12 = (Function1) objOnMinimized;
                    }
                    if (i7 != 0) {
                        int i26 = IAuthTabCallbackStub + 105;
                        onTransact = i26 % 128;
                        if (i26 % 2 == 0) {
                            TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult3 = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT;
                            throw null;
                        }
                        onextracallbackwithresult = TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT;
                    } else {
                        onextracallbackwithresult = onextracallbackwithresult2;
                    }
                    if (i8 != 0) {
                        onwarmupcompleted2 = TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-616604521, i, -1, "im.toss.compose.animation.AnimateTickerInternal (AnimateTicker.kt:297)");
                    }
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                        objOnMinimized2 = l2 == null ? null : Long.valueOf(j4 + l2.longValue());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    Long l3 = (Long) objOnMinimized2;
                    if (list.isEmpty()) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                            final boolean z5 = z4;
                            final List list4 = list;
                            final long j6 = j5;
                            final Function1 function13 = function12;
                            final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
                            function2 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda8
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i27 = 2 % 2;
                                    int i28 = IAuthTabCallback + 35;
                                    onExtraCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    Unit unitOnExtraCallback = getClipToCompositionBounds.onExtraCallback(quirksExternalSyntheticBackport04, z5, j4, j6, i12, function13, onextracallbackwithresult, onwarmupcompleted4, l2, list4, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i30 = IAuthTabCallback + 93;
                                    onExtraCallback = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return unitOnExtraCallback;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        }
                        return null;
                    }
                    list2 = list;
                    int i27 = 1879048192 & i;
                    if (i27 == 536870912) {
                        z = true;
                    } else {
                        int i28 = onTransact + 63;
                        IAuthTabCallbackStub = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i29 = 4 / 5;
                        }
                        z = false;
                    }
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z) {
                        Object obj = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted3.onExtraCallback()) {
                            LiveDataObservableResult liveDataObservableResult = new LiveDataObservableResult();
                            int i30 = 0;
                            for (Object obj2 : list2) {
                                if (i30 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                liveDataObservableResult.put(Integer.valueOf(i30), new makeLayout((z4 && i30 == 0) ? getClipTextToBoundingBox.In : getClipTextToBoundingBox.None));
                                i30++;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(liveDataObservableResult);
                            obj = liveDataObservableResult;
                        }
                        final LiveDataObservableResult liveDataObservableResult2 = (LiveDataObservableResult) obj;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized4 == onwarmupcompleted5.onExtraCallback()) {
                            objOnMinimized4 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized4;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                        if ((i & 896) == 256) {
                            int i31 = onTransact + 1;
                            IAuthTabCallbackStub = i31 % 128;
                            int i32 = i31 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z6 = i27 == 536870912;
                        boolean z7 = z4;
                        i11 = iIntValue2;
                        boolean z8 = (i & 57344) == 16384;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(liveDataObservableResult2);
                        l = l2;
                        final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted6 = onwarmupcompleted2;
                        boolean z9 = (i & 7168) == 2048;
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z8 | zOnExtraCallback | z2 | z6 | zOnNavigationEvent | z9) || objOnMinimized5 == onwarmupcompleted5.onExtraCallback()) {
                            objOnMinimized5 = new onWarmupCompleted(findresandmsg, j4, list2, i12, liveDataObservableResult2, l3, j5, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(liveDataObservableResult2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean z10 = i27 == 536870912;
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(liveDataObservableResult2);
                        boolean z11 = (458752 & i) == 131072;
                        boolean z12 = (3670016 & i) == 1048576;
                        if ((29360128 & i) == 8388608) {
                            int i33 = IAuthTabCallbackStub + 65;
                            onTransact = i33 % 128;
                            boolean z13 = i33 % 2 != 0;
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z10 | zOnNavigationEvent2 | z11 | z12 | z13) || objOnMinimized6 == onwarmupcompleted5.onExtraCallback()) {
                                final Function1 function14 = function12;
                                final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult;
                                objOnMinimized6 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda9
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallback = 1;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        component8 component8VarOnWarmupCompleted;
                                        int i34 = 2 % 2;
                                        int i35 = IAuthTabCallback + 67;
                                        onExtraCallback = i35 % 128;
                                        if (i35 % 2 == 0) {
                                            component8VarOnWarmupCompleted = getClipToCompositionBounds.onWarmupCompleted(list2, liveDataObservableResult2, function14, onextracallbackwithresult4, onwarmupcompleted6, (isExtraPreviewRequired) obj3, (VirtualCameraCaptureResult) obj4);
                                            int i36 = 52 / 0;
                                        } else {
                                            component8VarOnWarmupCompleted = getClipToCompositionBounds.onWarmupCompleted(list2, liveDataObservableResult2, function14, onextracallbackwithresult4, onwarmupcompleted6, (isExtraPreviewRequired) obj3, (VirtualCameraCaptureResult) obj4);
                                        }
                                        int i37 = IAuthTabCallback + 111;
                                        onExtraCallback = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            int i38 = 61 / 0;
                                        }
                                        return component8VarOnWarmupCompleted;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport02, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i & 14, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            z3 = z7;
                            function1 = function12;
                            onwarmupcompleted = onwarmupcompleted6;
                            j = j4;
                            j2 = j5;
                        }
                    }
                    return null;
                }
                i11 = iIntValue2;
                list2 = list;
                l = l2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                function1 = function12;
                onextracallbackwithresult = onextracallbackwithresult2;
                onwarmupcompleted = onwarmupcompleted2;
                j = j3;
                j2 = jLongValue2;
                i12 = i9;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                    final boolean z14 = z3;
                    final Long l4 = l;
                    final List list5 = list2;
                    final int i34 = i11;
                    function2 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda10
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i35 = 2 % 2;
                            int i36 = onExtraCallback + 33;
                            onWarmupCompleted = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitIAuthTabCallback = getClipToCompositionBounds.IAuthTabCallback(quirksExternalSyntheticBackport05, z14, j, j2, i12, function1, onextracallbackwithresult, onwarmupcompleted, l4, list5, i34, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i38 = onWarmupCompleted + 31;
                            onExtraCallback = i38 % 128;
                            int i39 = i38 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return null;
            }
            int i35 = IAuthTabCallbackStub + 45;
            i9 = iIntValue;
            onTransact = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
            i10 = 12582912;
            i |= i10;
            if ((100663296 & iIntValue2) == 0) {
            }
            if ((805306368 & iIntValue2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i & 306783379) == 306783378), i & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        i |= 48;
        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
        i2 = i18;
        i3 = iIntValue3 & 4;
        if (i3 == 0) {
        }
        i4 = iIntValue3 & 8;
        boolean z32 = zBooleanValue;
        if (i4 == 0) {
        }
        i5 = iIntValue3 & 16;
        long j32 = jLongValue;
        if (i5 == 0) {
        }
        i6 = iIntValue3 & 32;
        int i222 = 196608;
        if (i6 != 0) {
        }
        i7 = iIntValue3 & 64;
        int i232 = 1572864;
        if (i7 != 0) {
        }
        i8 = iIntValue3 & 128;
        if (i8 != 0) {
        }
        i |= i10;
        if ((100663296 & iIntValue2) == 0) {
        }
        if ((805306368 & iIntValue2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i & 306783379) == 306783378), i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f A[PHI: r1
      0x010f: PHI (r1v39 int) = (r1v9 int), (r1v14 int), (r1v15 int) binds: [B:76:0x010d, B:90:0x0136, B:89:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, @Nullable TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, @Nullable TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, @NotNull final List<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, @Nullable getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote, @Nullable getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote2, float f, int i2, @Nullable Long l, @Nullable Function1<? super Integer, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iOrdinal;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function1<? super Integer, Unit> function12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z2;
        final long j3;
        final long j4;
        final int i22;
        final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2;
        final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2;
        final getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote3;
        final getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote4;
        final float f2;
        final Long l2;
        final Function1<? super Integer, Unit> function13;
        final int i23;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i24;
        int i25 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1773398068);
        int i26 = i5 & 1;
        if (i26 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i27 = onTransact + 13;
                IAuthTabCallbackStub = i27 % 128;
                int i28 = i27 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i3;
        } else {
            i6 = i3;
        }
        int i29 = i5 & 2;
        if (i29 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
            }
            i8 = i5 & 4;
            int i30 = 256;
            if (i8 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 256 : 128;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                int i31 = onTransact + 57;
                IAuthTabCallbackStub = i31 % 128;
                i6 = i31 % 2 != 0 ? i6 | 12719 : i6 | 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    int i32 = IAuthTabCallbackStub + 25;
                    onTransact = i32 % 128;
                    int i33 = i32 % 2;
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
                }
                i10 = i5 & 16;
                if (i10 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 16384 : 8192;
                    }
                    i11 = i5 & 32;
                    if (i11 == 0) {
                        i6 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal())) {
                            int i34 = IAuthTabCallbackStub + 99;
                            onTransact = i34 % 128;
                            if (i34 % 2 == 0) {
                                int i35 = 39 / 0;
                            }
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                    i13 = i5 & 64;
                    int i36 = 1572864;
                    Function1<? super Integer, Unit> function14 = null;
                    if (i13 != 0) {
                        i6 |= i36;
                    } else if ((1572864 & i3) == 0) {
                        if (onwarmupcompleted == null) {
                            int i37 = IAuthTabCallbackStub + 121;
                            onTransact = i37 % 128;
                            if (i37 % 2 == 0) {
                                function14.hashCode();
                                throw null;
                            }
                            iOrdinal = -1;
                        } else {
                            iOrdinal = onwarmupcompleted.ordinal();
                        }
                        i36 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 1048576 : 524288;
                        i6 |= i36;
                    }
                    if ((12582912 & i3) == 0) {
                        int i38 = onTransact + 43;
                        IAuthTabCallbackStub = i38 % 128;
                        if (i38 % 2 != 0) {
                            int i39 = 32 / 0;
                            i24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 8388608 : 4194304;
                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                        }
                        i6 |= i24;
                    }
                    i14 = i5 & 256;
                    if (i14 == 0) {
                        int i40 = onTransact + 113;
                        IAuthTabCallbackStub = i40 % 128;
                        if (i40 % 2 != 0) {
                            function14.hashCode();
                            throw null;
                        }
                        i6 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i6 |= 805306368;
                        } else {
                            if ((i3 & 805306368) == 0) {
                                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 536870912 : 268435456;
                            }
                            i16 = i5 & 1024;
                            if (i16 == 0) {
                                i17 = i4 | 6;
                            } else if ((i4 & 6) == 0) {
                                i17 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 4 : 2);
                            } else {
                                i17 = i4;
                            }
                            i18 = i5 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else if ((i4 & 48) == 0) {
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 32 : 16;
                            }
                            i19 = i17;
                            i20 = i5 & 4096;
                            if (i20 == 0) {
                                i19 |= 384;
                            } else if ((i4 & 384) == 0) {
                                int i41 = IAuthTabCallbackStub + 5;
                                onTransact = i41 % 128;
                                int i42 = i41 % 2;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l)) {
                                    int i43 = IAuthTabCallbackStub + 65;
                                    onTransact = i43 % 128;
                                    if (i43 % 2 == 0) {
                                        i30 = 12897;
                                    }
                                } else {
                                    i30 = 128;
                                }
                                i19 |= i30;
                            }
                            i21 = i5 & 8192;
                            if (i21 != 0) {
                                if ((i4 & 3072) == 0) {
                                    function12 = function1;
                                    i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i26 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    boolean z3 = i29 != 0 ? true : z;
                                    long j5 = i8 != 0 ? 0L : j;
                                    long j6 = i9 != 0 ? 1000L : j2;
                                    int i44 = i10 == 0 ? i : -1;
                                    TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult3 = i11 != 0 ? TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT : onextracallbackwithresult;
                                    TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted3 = i13 != 0 ? TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER : onwarmupcompleted;
                                    getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote5 = i14 != 0 ? onNavigationEvent : getbacktracenote;
                                    getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote6 = i15 != 0 ? IAuthTabCallback : getbacktracenote2;
                                    float f3 = i16 != 0 ? 1.0f : f;
                                    int i45 = i18 == 0 ? i2 : 0;
                                    Long l3 = i20 != 0 ? null : l;
                                    if (i21 != 0) {
                                        int i46 = onTransact + 7;
                                        IAuthTabCallbackStub = i46 % 128;
                                        int i47 = i46 % 2;
                                    } else {
                                        function14 = function12;
                                    }
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1773398068, i6, i19, "im.toss.compose.animation.AnimateTickerV1 (AnimateTicker.kt:433)");
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    onNavigationEvent(quirksExternalSyntheticBackport03, z3, j5, j6, i44, onextracallbackwithresult3, onwarmupcompleted3, list, getbacktracenote5, getbacktracenote6, f3, i45, l3, function14, cameraCaptureResultEmptyCameraCaptureResult2, i6 & 2147483646, i19 & 8190, 0);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    z2 = z3;
                                    onextracallbackwithresult2 = onextracallbackwithresult3;
                                    onwarmupcompleted2 = onwarmupcompleted3;
                                    function13 = function14;
                                    getbacktracenote3 = getbacktracenote5;
                                    i22 = i44;
                                    i23 = i45;
                                    j3 = j5;
                                    j4 = j6;
                                    getbacktracenote4 = getbacktracenote6;
                                    f2 = f3;
                                    l2 = l3;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                    z2 = z;
                                    j3 = j;
                                    j4 = j2;
                                    i22 = i;
                                    onextracallbackwithresult2 = onextracallbackwithresult;
                                    onwarmupcompleted2 = onwarmupcompleted;
                                    getbacktracenote3 = getbacktracenote;
                                    getbacktracenote4 = getbacktracenote2;
                                    f2 = f;
                                    l2 = l;
                                    function13 = function12;
                                    i23 = i2;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda5
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i48 = 2 % 2;
                                            int i49 = onExtraCallbackWithResult + 113;
                                            IAuthTabCallback = i49 % 128;
                                            int i50 = i49 % 2;
                                            Unit unitOnExtraCallback = getClipToCompositionBounds.onExtraCallback(quirksExternalSyntheticBackport02, z2, j3, j4, i22, onextracallbackwithresult2, onwarmupcompleted2, list, getbacktracenote3, getbacktracenote4, f2, i23, l2, function13, i3, i4, i5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i51 = onExtraCallbackWithResult + 7;
                                            IAuthTabCallback = i51 % 128;
                                            if (i51 % 2 == 0) {
                                                return unitOnExtraCallback;
                                            }
                                            throw null;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i19 |= 3072;
                            function12 = function1;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i16 = i5 & 1024;
                        if (i16 == 0) {
                        }
                        i18 = i5 & 2048;
                        if (i18 == 0) {
                        }
                        i19 = i17;
                        i20 = i5 & 4096;
                        if (i20 == 0) {
                        }
                        i21 = i5 & 8192;
                        if (i21 != 0) {
                        }
                        function12 = function1;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                    }
                    i18 = i5 & 2048;
                    if (i18 == 0) {
                    }
                    i19 = i17;
                    i20 = i5 & 4096;
                    if (i20 == 0) {
                    }
                    i21 = i5 & 8192;
                    if (i21 != 0) {
                    }
                    function12 = function1;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i11 = i5 & 32;
                if (i11 == 0) {
                }
                i13 = i5 & 64;
                int i362 = 1572864;
                Function1<? super Integer, Unit> function142 = null;
                if (i13 != 0) {
                }
                if ((12582912 & i3) == 0) {
                }
                i14 = i5 & 256;
                if (i14 == 0) {
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                i18 = i5 & 2048;
                if (i18 == 0) {
                }
                i19 = i17;
                i20 = i5 & 4096;
                if (i20 == 0) {
                }
                i21 = i5 & 8192;
                if (i21 != 0) {
                }
                function12 = function1;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i10 = i5 & 16;
            if (i10 != 0) {
            }
            i11 = i5 & 32;
            if (i11 == 0) {
            }
            i13 = i5 & 64;
            int i3622 = 1572864;
            Function1<? super Integer, Unit> function1422 = null;
            if (i13 != 0) {
            }
            if ((12582912 & i3) == 0) {
            }
            i14 = i5 & 256;
            if (i14 == 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            i18 = i5 & 2048;
            if (i18 == 0) {
            }
            i19 = i17;
            i20 = i5 & 4096;
            if (i20 == 0) {
            }
            i21 = i5 & 8192;
            if (i21 != 0) {
            }
            function12 = function1;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i8 = i5 & 4;
        int i302 = 256;
        if (i8 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 != 0) {
        }
        i11 = i5 & 32;
        if (i11 == 0) {
        }
        i13 = i5 & 64;
        int i36222 = 1572864;
        Function1<? super Integer, Unit> function14222 = null;
        if (i13 != 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        i18 = i5 & 2048;
        if (i18 == 0) {
        }
        i19 = i17;
        i20 = i5 & 4096;
        if (i20 == 0) {
        }
        i21 = i5 & 8192;
        if (i21 != 0) {
        }
        function12 = function1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i6 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ long $baseStartMillis;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Function1<Integer, Unit>> $currentIndexChanged$delegate;
        final /* synthetic */ long $effectiveDelay;
        final /* synthetic */ boolean $effectiveSkipIntro;
        final /* synthetic */ int $initialIndex;
        final /* synthetic */ long $interval;
        final /* synthetic */ boolean $isAbsolute;
        final /* synthetic */ int $playCount;
        final /* synthetic */ List<Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> $slotList;
        final /* synthetic */ List<getSupportedHighSpeedResolutionsFor<RallyTickerState>> $tickerStateList;
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(List<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, boolean z, boolean z2, long j, long j2, List<? extends getSupportedHighSpeedResolutionsFor<RallyTickerState>> list2, int i, int i2, long j3, CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$slotList = list;
            this.$effectiveSkipIntro = z;
            this.$isAbsolute = z2;
            this.$baseStartMillis = j;
            this.$effectiveDelay = j2;
            this.$tickerStateList = list2;
            this.$initialIndex = i;
            this.$playCount = i2;
            this.$interval = j3;
            this.$currentIndexChanged$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$slotList, this.$effectiveSkipIntro, this.$isAbsolute, this.$baseStartMillis, this.$effectiveDelay, this.$tickerStateList, this.$initialIndex, this.$playCount, this.$interval, this.$currentIndexChanged$delegate, access13800Var);
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Path cross not found for [B:103:0x01be, B:95:0x01a5], limit reached: 130 */
        /* JADX WARN: Path cross not found for [B:95:0x01a5, B:103:0x01be], limit reached: 130 */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0184 -> B:93:0x0199). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0194 -> B:93:0x0199). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0197 -> B:93:0x0199). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 578
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getClipToCompositionBounds.asBinder.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final Unit onExtraCallback(MaxInterstitialAd maxInterstitialAd, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            MaxInterstitialAd.onWarmupCompleted(-1040614246, 1040614246, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{maxInterstitialAd, Float.valueOf(RangesKt.coerceAtLeast(f, 1.0f))}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        } else {
            MaxInterstitialAd.onWarmupCompleted(-1040614246, 1040614246, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{maxInterstitialAd, Float.valueOf(RangesKt.coerceAtLeast(f, 1.0f))}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<RallyTickerState> $currentSlotState$delegate;
        final /* synthetic */ Rally $inRallyInstance;
        final /* synthetic */ Rally $outRallyInstance;
        final /* synthetic */ MaxInterstitialAd $rallyTarget;
        int label;

        public static final /* synthetic */ class onNavigationEvent {
            private static int onExtraCallback = 1;
            public static final /* synthetic */ int[] onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[RallyTickerState.values().length];
                try {
                    iArr[RallyTickerState.In.ordinal()] = 1;
                    int i = onWarmupCompleted + 121;
                    onExtraCallback = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RallyTickerState.Out.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RallyTickerState.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RallyTickerState.Shown.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                onNavigationEvent = iArr;
                int i4 = onExtraCallback + 83;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Rally rally, Rally rally2, MaxInterstitialAd maxInterstitialAd, getSupportedHighSpeedResolutionsFor<RallyTickerState> getsupportedhighspeedresolutionsfor, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$outRallyInstance = rally;
            this.$inRallyInstance = rally2;
            this.$rallyTarget = maxInterstitialAd;
            this.$currentSlotState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$outRallyInstance, this.$inRallyInstance, this.$rallyTarget, this.$currentSlotState$delegate, access13800Var);
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 90 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {this.$currentSlotState$delegate};
            int i3 = onNavigationEvent.onNavigationEvent[((RallyTickerState) getClipToCompositionBounds.onNavigationEvent(-650285456, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 650285461, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent())).ordinal()];
            if (i3 == 1) {
                this.$outRallyInstance.ICustomTabsServiceStub();
                this.$inRallyInstance.ICustomTabsServiceStub();
                isFireOS.onExtraCallbackWithResult(this.$inRallyInstance, false, 1, (Object) null);
                int i4 = onExtraCallbackWithResult + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else if (i3 != 2) {
                int i6 = onExtraCallback;
                int i7 = i6 + 89;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0 ? i3 == 3 : i3 == 2) {
                    this.$inRallyInstance.ICustomTabsServiceStub();
                    this.$outRallyInstance.ICustomTabsServiceStub();
                    this.$rallyTarget.onExtraCallback(access14000.onExtraCallbackWithResult(0.0f));
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i8 = i6 + 9;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    this.$inRallyInstance.ICustomTabsServiceStub();
                    this.$outRallyInstance.ICustomTabsServiceStub();
                    this.$rallyTarget.onExtraCallback(access14000.onExtraCallbackWithResult(1.0f));
                }
            } else {
                this.$inRallyInstance.ICustomTabsServiceStub();
                this.$outRallyInstance.ICustomTabsServiceStub();
                isFireOS.onExtraCallbackWithResult(this.$outRallyInstance, false, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackDefault implements component5 {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TdsAnimateTickerV1Layout.onExtraCallbackWithResult IAuthTabCallback;
        final /* synthetic */ List<getSupportedHighSpeedResolutionsFor<RallyTickerState>> onNavigationEvent;
        final /* synthetic */ TdsAnimateTickerV1Layout.onWarmupCompleted onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.values().length];
                try {
                    iArr[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.LEFT.ordinal()] = 1;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.CENTER.ordinal()] = 2;
                    int i2 = IAuthTabCallback + 115;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TdsAnimateTickerV1Layout.onExtraCallbackWithResult.RIGHT.ordinal()] = 3;
                    int i5 = onExtraCallback + 55;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                onNavigationEvent = iArr;
                int[] iArr2 = new int[TdsAnimateTickerV1Layout.onWarmupCompleted.values().length];
                try {
                    iArr2[TdsAnimateTickerV1Layout.onWarmupCompleted.TOP.ordinal()] = 1;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[TdsAnimateTickerV1Layout.onWarmupCompleted.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[TdsAnimateTickerV1Layout.onWarmupCompleted.BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                onExtraCallbackWithResult = iArr2;
            }
        }

        IAuthTabCallbackDefault(List<? extends getSupportedHighSpeedResolutionsFor<RallyTickerState>> list, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted) {
            this.onNavigationEvent = list;
            this.IAuthTabCallback = onextracallbackwithresult;
            this.onWarmupCompleted = onwarmupcompleted;
        }

        public static /* synthetic */ Unit onWarmupCompleted(List list, List list2, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, int i, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) throws NoWhenBranchMatchedException {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, list2, onextracallbackwithresult, i, onwarmupcompleted, i2, onextracallbackwithresult2);
            int i6 = onExtraCallbackWithResult + 77;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            }
            super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            int i5 = onExtraCallbackWithResult + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int onNavigationEvent(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = super.onNavigationEvent(futuresExternalSyntheticLambda3, list, i);
            int i5 = onExtraCallbackWithResult + 101;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iOnNavigationEvent;
            }
            throw null;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            int i5 = onExtraCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return iOnWarmupCompleted;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            Object obj;
            int iT_;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(list.get(i2).onExtraCallback(j));
            }
            Object obj2 = null;
            int i3 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int interfaceDescriptor = ((getStreamSharingChildren) obj).getInterfaceDescriptor();
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                if (lastIndex > 0) {
                    int i4 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i4);
                        int interfaceDescriptor2 = ((getStreamSharingChildren) obj3).getInterfaceDescriptor();
                        if (interfaceDescriptor < interfaceDescriptor2) {
                            obj = obj3;
                            interfaceDescriptor = interfaceDescriptor2;
                        }
                        if (i4 == lastIndex) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) obj;
            final int iCoerceAtLeast = RangesKt.coerceAtLeast(getstreamsharingchildren != null ? getstreamsharingchildren.getInterfaceDescriptor() : 0, 0);
            if (arrayList.isEmpty()) {
                int i5 = onExtraCallbackWithResult;
                int i6 = i5 + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 21;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                obj2 = arrayList.get(0);
                int iT_2 = ((getStreamSharingChildren) obj2).T_();
                int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                if (lastIndex2 > 0) {
                    int i10 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        int iT_3 = ((getStreamSharingChildren) obj4).T_();
                        if (iT_2 < iT_3) {
                            int i12 = onExtraCallbackWithResult + 15;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 39 / 0;
                            }
                            obj2 = obj4;
                            iT_2 = iT_3;
                        }
                        if (i3 == lastIndex2) {
                            break;
                        }
                        int i14 = onExtraCallbackWithResult + 33;
                        onExtraCallback = i14 % 128;
                        i3 = i14 % 2 == 0 ? i3 + 19 : i3 + 1;
                    }
                }
            }
            getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) obj2;
            if (getstreamsharingchildren2 != null) {
                int i15 = onExtraCallbackWithResult + 103;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                iT_ = getstreamsharingchildren2.T_();
            } else {
                int i17 = onExtraCallback + 57;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                iT_ = 0;
            }
            final int iCoerceAtLeast2 = RangesKt.coerceAtLeast(iT_, 0);
            final List<getSupportedHighSpeedResolutionsFor<RallyTickerState>> list2 = this.onNavigationEvent;
            final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
            final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
            return component4.IAuthTabCallback(component4Var, iCoerceAtLeast, iCoerceAtLeast2, (Map) null, new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$AnimateTickerInternalRally$4$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj5) throws NoWhenBranchMatchedException {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i20 % 128;
                    if (i20 % 2 == 0) {
                        getClipToCompositionBounds.IAuthTabCallbackDefault.onWarmupCompleted(arrayList, list2, onextracallbackwithresult, iCoerceAtLeast, onwarmupcompleted, iCoerceAtLeast2, (getStreamSharingChildren.onExtraCallbackWithResult) obj5);
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = getClipToCompositionBounds.IAuthTabCallbackDefault.onWarmupCompleted(arrayList, list2, onextracallbackwithresult, iCoerceAtLeast, onwarmupcompleted, iCoerceAtLeast2, (getStreamSharingChildren.onExtraCallbackWithResult) obj5);
                    int i21 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 34 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, 4, (Object) null);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private static final Unit onExtraCallbackWithResult(List list, List list2, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, int i, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) throws NoWhenBranchMatchedException {
            int i3;
            int i4;
            int iT_;
            int interfaceDescriptor;
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) list.get(i6);
                if (((RallyTickerState) ((getSupportedHighSpeedResolutionsFor) list2.get(i6)).onExtraCallbackWithResult()) != RallyTickerState.None) {
                    int i7 = onExtraCallback.onNavigationEvent[onextracallbackwithresult.ordinal()];
                    if (i7 != 1) {
                        int i8 = onExtraCallbackWithResult + 71;
                        int i9 = i8 % 128;
                        onExtraCallback = i9;
                        if (i8 % 2 != 0 ? i7 == 2 : i7 == 4) {
                            interfaceDescriptor = (i - getstreamsharingchildren.getInterfaceDescriptor()) / 2;
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i10 = i9 + 123;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            interfaceDescriptor = i - getstreamsharingchildren.getInterfaceDescriptor();
                        }
                        i3 = interfaceDescriptor;
                    } else {
                        int i12 = onExtraCallbackWithResult + 43;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        i3 = 0;
                    }
                    int i14 = onExtraCallback.onExtraCallbackWithResult[onwarmupcompleted.ordinal()];
                    if (i14 != 1) {
                        if (i14 != 2) {
                            int i15 = onExtraCallbackWithResult + 29;
                            onExtraCallback = i15 % 128;
                            int i16 = i15 % 2;
                            if (i14 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iT_ = i2 - getstreamsharingchildren.T_();
                        } else {
                            iT_ = (i2 - getstreamsharingchildren.T_()) / 2;
                        }
                        i4 = iT_;
                    } else {
                        i4 = 0;
                    }
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult2, getstreamsharingchildren, i3, i4, 0.0f, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, final long j, final long j2, final int i, final TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, final TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, final List<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, final getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote, final getBacktraceNote<? super MaxInterstitialAd, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Rally> getbacktracenote2, final float f, final int i2, final Long l, Function1<? super Integer, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Function1<? super Integer, Unit> function12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        char c;
        final Function1<? super Integer, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18;
        Function2 function2;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        long j3;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        Function1<? super Integer, Unit> function14;
        Function1<? super Integer, Unit> function15;
        List list2;
        int i10;
        Object[] objArr;
        final float f2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2;
        int i11;
        int i12 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(487863908);
        if ((i3 & 6) == 0) {
            i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            int i13 = IAuthTabCallbackStub + 51;
            onTransact = i13 % 128;
            if (i13 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                throw null;
            }
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i6 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ^ true) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            int i14 = IAuthTabCallbackStub + 105;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 536870912 : 268435456;
        }
        int i16 = i6;
        if ((i4 & 6) == 0) {
            int i17 = onTransact + 103;
            IAuthTabCallbackStub = i17 % 128;
            if (i17 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i18 = onTransact + 41;
                IAuthTabCallbackStub = i18 % 128;
                int i19 = i18 % 2;
                i11 = 4;
            } else {
                i11 = 2;
            }
            i7 = i11 | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l) ? 256 : 128;
        }
        int i20 = i5 & 8192;
        if (i20 == 0) {
            if ((i4 & 3072) == 0) {
                function12 = function1;
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i16 & 306783379) == 306783378 || (i7 & 1171) != 1170, i16 & 1)) {
                if (i20 != 0) {
                    function12 = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i21 = onTransact + 23;
                    IAuthTabCallbackStub = i21 % 128;
                    int i22 = i21 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(487863908, i16, i7, "im.toss.compose.animation.AnimateTickerInternalRally (AnimateTicker.kt:476)");
                }
                if (list.isEmpty()) {
                    int i23 = onTransact + 39;
                    IAuthTabCallbackStub = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = 3 / 0;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
                            return;
                        }
                        final Function1<? super Integer, Unit> function16 = function12;
                        clearallcamerastateobserverslambda19lambda18 = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2;
                        function2 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda21
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i25 = 2 % 2;
                                int i26 = onNavigationEvent + 113;
                                onExtraCallback = i26 % 128;
                                int i27 = i26 % 2;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                boolean z4 = z;
                                long j4 = j;
                                long j5 = j2;
                                int i28 = i;
                                TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                                TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
                                List list3 = list;
                                getBacktraceNote getbacktracenote3 = getbacktracenote;
                                getBacktraceNote getbacktracenote4 = getbacktracenote2;
                                float f3 = f;
                                int i29 = i2;
                                Long l2 = l;
                                Function1 function17 = function16;
                                int i30 = i3;
                                int i31 = i4;
                                int i32 = i5;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr2 = {quirksExternalSyntheticBackport02, Boolean.valueOf(z4), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i28), onextracallbackwithresult2, onwarmupcompleted2, list3, getbacktracenote3, getbacktracenote4, Float.valueOf(f3), Integer.valueOf(i29), l2, function17, Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                Unit unit = (Unit) getClipToCompositionBounds.onNavigationEvent(-1751986470, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1751986480, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                                int i33 = onExtraCallback + 107;
                                onNavigationEvent = i33 % 128;
                                int i34 = i33 % 2;
                                return unit;
                            }
                        };
                    } else {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
                        }
                    }
                } else {
                    final Function1<? super Integer, Unit> function17 = function12;
                    if (list.size() >= 2) {
                        i8 = i2;
                        z2 = true;
                    } else if (i != 1) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3 == null) {
                            return;
                        }
                        clearallcamerastateobserverslambda19lambda18 = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3;
                        function2 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda22
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i25 = 2 % 2;
                                int i26 = onExtraCallback + 1;
                                IAuthTabCallback = i26 % 128;
                                int i27 = i26 % 2;
                                Unit unitOnExtraCallbackWithResult = getClipToCompositionBounds.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, z, j, j2, i, onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, f, i2, l, function17, i3, i4, i5, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i28 = IAuthTabCallback + 19;
                                onExtraCallback = i28 % 128;
                                int i29 = i28 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        };
                    } else {
                        z2 = true;
                        i8 = i2;
                    }
                    Function1<? super Integer, Unit> function18 = function17;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function18, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 >> 9) & 14);
                    boolean z4 = l != null ? z2 : false;
                    if ((i7 & 896) == 256) {
                        z3 = z2;
                        i9 = 2;
                    } else {
                        int i25 = onTransact + 17;
                        IAuthTabCallbackStub = i25 % 128;
                        i9 = 2;
                        int i26 = i25 % 2;
                        z3 = false;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z3 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = Long.valueOf(l != null ? l.longValue() : SystemClock.elapsedRealtime());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    long jLongValue = ((Number) objOnMinimized).longValue();
                    if (i8 != 0) {
                        int i27 = IAuthTabCallbackStub + 83;
                        onTransact = i27 % 128;
                        int i28 = i27 % i9;
                        j3 = 0;
                    } else {
                        j3 = j;
                    }
                    if (!z) {
                        int i29 = IAuthTabCallbackStub + 111;
                        onTransact = i29 % 128;
                        if (i29 % i9 == 0) {
                            throw null;
                        }
                        boolean z5 = i8 == 0 ? false : z2;
                        int iCoerceIn = RangesKt.coerceIn(i8, 0, CollectionsKt.getLastIndex(list));
                        int i30 = i16 & 29360128;
                        boolean z6 = i30 == 8388608 ? z2 : false;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iCoerceIn);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (((z6 | zOnExtraCallback) || zOnExtraCallback2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            int size = list.size();
                            ArrayList arrayList = new ArrayList(size);
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                            int i31 = 0;
                            while (i31 < size) {
                                arrayList.add(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((z5 && i31 == iCoerceIn) ? RallyTickerState.Shown : RallyTickerState.None, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null));
                                i31++;
                                function18 = function18;
                                size = size;
                            }
                            function14 = function18;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList);
                            objOnMinimized2 = arrayList;
                        } else {
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                            function14 = function18;
                        }
                        List list3 = (List) objOnMinimized2;
                        int i32 = i7;
                        boolean z7 = z5;
                        boolean z8 = z4;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                        Object[] objArr2 = {list, Boolean.valueOf(z5), Long.valueOf(j3), Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(jLongValue), Integer.valueOf(iCoerceIn), Boolean.valueOf(z4)};
                        boolean z9 = i30 == 8388608 ? z2 : false;
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z7);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z8);
                        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jLongValue);
                        long j4 = j3;
                        boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j4);
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(list3);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(iCoerceIn);
                        boolean z10 = (i16 & 57344) == 16384 ? z2 : false;
                        boolean z11 = (i16 & 7168) == 2048 ? z2 : false;
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (((z9 | zOnExtraCallback3 | zOnExtraCallback4 | zOnWarmupCompleted | zOnWarmupCompleted2 | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback5 | z10) || z11) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            function15 = function14;
                            list2 = list3;
                            i10 = i16;
                            objArr = objArr2;
                            asBinder asbinder = new asBinder(list, z7, z8, jLongValue, j4, list3, iCoerceIn, i, j2, cameraPresenceProviderExternalSyntheticLambda62, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(asbinder);
                            objOnMinimized3 = asbinder;
                        } else {
                            list2 = list3;
                            function15 = function14;
                            objArr = objArr2;
                            i10 = i16;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        List list4 = list2;
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(list4);
                        boolean z12 = (i10 & 458752) == 131072 ? z2 : false;
                        boolean z13 = (i10 & 3670016) == 1048576 ? z2 : false;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((zOnNavigationEvent3 | z12 | z13) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized4 = new IAuthTabCallbackDefault(list4, onextracallbackwithresult, onwarmupcompleted);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                        }
                        component5 component5Var = (component5) objOnMinimized4;
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(809014127);
                        int size2 = list.size();
                        int i33 = 0;
                        while (i33 < size2) {
                            Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22 = list.get(i33);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized5 = new MaxInterstitialAd();
                                f2 = f;
                                MaxInterstitialAd.onWarmupCompleted(-1040614246, 1040614246, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{objOnMinimized5, Float.valueOf(RangesKt.coerceAtLeast(f2, 1.0f))}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                            } else {
                                f2 = f;
                            }
                            final MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objOnMinimized5;
                            boolean z14 = (i32 & 14) == 4 ? z2 : false;
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (z14 || objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized6 = new Function0() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda23
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke() {
                                        int i34 = 2 % 2;
                                        int i35 = onExtraCallbackWithResult + 39;
                                        onExtraCallback = i35 % 128;
                                        int i36 = i35 % 2;
                                        MaxInterstitialAd maxInterstitialAd2 = maxInterstitialAd;
                                        if (i36 != 0) {
                                            return getClipToCompositionBounds.onExtraCallbackWithResult(maxInterstitialAd2, f2);
                                        }
                                        getClipToCompositionBounds.onExtraCallbackWithResult(maxInterstitialAd2, f2);
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            Rally rally = (Rally) getbacktracenote.invoke(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i10 >> 21) & 112) | 6));
                            Rally rally2 = (Rally) getbacktracenote2.invoke(maxInterstitialAd, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i10 >> 24) & 112) | 6));
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) list4.get(i33);
                            List list5 = list4;
                            int i34 = size2;
                            if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<RallyTickerState>) getsupportedhighspeedresolutionsfor) == RallyTickerState.None) {
                                maxInterstitialAd.onExtraCallback(Float.valueOf(0.0f));
                            } else if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<RallyTickerState>) getsupportedhighspeedresolutionsfor) == RallyTickerState.Shown) {
                                maxInterstitialAd.onExtraCallback(Float.valueOf(1.0f));
                            }
                            RallyTickerState rallyTickerStateOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<RallyTickerState>) getsupportedhighspeedresolutionsfor);
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rally2);
                            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rally);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if ((zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized7 = new asInterface(rally2, rally, maxInterstitialAd, getsupportedhighspeedresolutionsfor, null);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(rallyTickerStateOnNavigationEvent, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = RallyModifierKt.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, maxInterstitialAd, (Function1) null, 2, (Object) null);
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            function22.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            i33++;
                            list4 = list5;
                            size2 = i34;
                        }
                        c = 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        function13 = function15;
                    }
                }
                clearallcamerastateobserverslambda19lambda18.onExtraCallback(function2);
                int i35 = IAuthTabCallbackStub + 1;
                onTransact = i35 % 128;
                int i36 = i35 % 2;
                return;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            c = 2;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            function13 = function12;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18 = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
                function2 = new Function2() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda24
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i37 = 2 % 2;
                        int i38 = onWarmupCompleted + 111;
                        onNavigationEvent = i38 % 128;
                        int i39 = i38 % 2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        boolean z15 = z;
                        long j5 = j;
                        long j6 = j2;
                        int i40 = i;
                        TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult;
                        TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
                        List list6 = list;
                        getBacktraceNote getbacktracenote3 = getbacktracenote;
                        getBacktraceNote getbacktracenote4 = getbacktracenote2;
                        float f3 = f;
                        int i41 = i2;
                        Long l2 = l;
                        Function1 function19 = function13;
                        int i42 = i3;
                        int i43 = i4;
                        int i44 = i5;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr3 = {quirksExternalSyntheticBackport02, Boolean.valueOf(z15), Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i40), onextracallbackwithresult4, onwarmupcompleted3, list6, getbacktracenote3, getbacktracenote4, Float.valueOf(f3), Integer.valueOf(i41), l2, function19, Integer.valueOf(i42), Integer.valueOf(i43), Integer.valueOf(i44), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        Unit unit = (Unit) getClipToCompositionBounds.onNavigationEvent(163248645, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -163248636, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr3, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                        int i45 = onNavigationEvent + 97;
                        onWarmupCompleted = i45 % 128;
                        int i46 = i45 % 2;
                        return unit;
                    }
                };
                clearallcamerastateobserverslambda19lambda18.onExtraCallback(function2);
                int i352 = IAuthTabCallbackStub + 1;
                onTransact = i352 % 128;
                int i362 = i352 % 2;
                return;
            }
            return;
        }
        i7 |= 3072;
        function12 = function1;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i16 & 306783379) == 306783378 || (i7 & 1171) != 1170, i16 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static {
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
        onExtraCallbackWithResult = new getAsyncUpdates(new enableMergePathsForKitKatAndAbove(virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, onQueryRefine.onExtraCallback(800, 100, getcalltoactionbutton.onExtraCallback())), new enableMergePathsForKitKatAndAbove(Float.valueOf(1.0f), onQueryRefine.onExtraCallback(800, 100, getcalltoactionbutton.onExtraCallback())));
        enableMergePathsForKitKatAndAbove enablemergepathsforkitkatandabove = new enableMergePathsForKitKatAndAbove(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f))), onQueryRefine.onExtraCallback(800, 100, getcalltoactionbutton.onExtraCallback()));
        Float fValueOf = Float.valueOf(0.0f);
        onExtraCallback = new getAsyncUpdates(enablemergepathsforkitkatandabove, new enableMergePathsForKitKatAndAbove(fValueOf, onQueryRefine.onExtraCallback(800, 100, getcalltoactionbutton.onExtraCallback())));
        onWarmupCompleted = new getAsyncUpdates(new enableMergePathsForKitKatAndAbove(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), onQueryRefine.onExtraCallbackWithResult(1, 0, (setOnQueryTextListener) null, 4, (Object) null)), new enableMergePathsForKitKatAndAbove(fValueOf, onQueryRefine.onExtraCallbackWithResult(1, 0, (setOnQueryTextListener) null, 4, (Object) null)));
        int i = asInterface + 21;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final AppLovinSdkSettings onExtraCallbackWithResult(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    private static final Rally IAuthTabCallback(MaxInterstitialAd maxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(961134530);
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(961134530);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(961134530, i, -1, "im.toss.compose.animation.DefaultInRally.<anonymous> (AnimateTicker.kt:634)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 67;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = getClipToCompositionBounds.onNavigationEvent((Rally) obj2);
                    int i7 = onNavigationEvent + 17;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 40 / 0;
                    }
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 200, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, maxInterstitialAd, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 196608, ((i << 9) & 7168) | 24576, 8159);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onTransact + 91;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = IAuthTabCallbackStub + 27;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return rallyOnExtraCallback;
    }

    private static final AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallback;
    }

    private static final Rally onExtraCallbackWithResult(MaxInterstitialAd maxInterstitialAd, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(135742777);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(135742777);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(135742777, i, -1, "im.toss.compose.animation.DefaultOutRally.<anonymous> (AnimateTicker.kt:647)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.compose.animation.AnimateTickerKt$$ExternalSyntheticLambda25
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 113;
                    onExtraCallbackWithResult = i5 % 128;
                    Rally rally = (Rally) obj;
                    if (i5 % 2 == 0) {
                        return getClipToCompositionBounds.IAuthTabCallback(rally);
                    }
                    getClipToCompositionBounds.IAuthTabCallback(rally);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 200, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, maxInterstitialAd, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 196608, ((i << 9) & 7168) | 24576, 8159);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onTransact + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 != 0) {
                int i6 = 87 / 0;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i7 = IAuthTabCallbackStub + 75;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return rallyOnExtraCallback;
    }

    private static final RallyTickerState onNavigationEvent(getSupportedHighSpeedResolutionsFor<RallyTickerState> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RallyTickerState rallyTickerState = (RallyTickerState) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return rallyTickerState;
    }

    private static final Function1<Integer, Unit> onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1 = (Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return function1;
    }

    public static final class onExtraCallbackWithResult implements Function0<getClipTextToBoundingBox> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.getClipTextToBoundingBox] */
        public final getClipTextToBoundingBox invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onNavigationEvent.access000();
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return Access000;
        }
    }

    public static final class onNavigationEvent implements Function0<getClipTextToBoundingBox> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.getClipTextToBoundingBox] */
        public final getClipTextToBoundingBox invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onExtraCallback.access000();
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return Access000;
        }
    }

    public static final class onExtraCallback implements Function0<getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox>> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onExtraCallback2 = onExtraCallback();
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
            return onExtraCallback2;
        }

        public final getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = onNavigationEvent + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function0<getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox>> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onTransact(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i3 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackOnWarmupCompleted;
            }
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<getClipTextToBoundingBox> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(-962936993, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 962937000, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(-1691903681, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1691903684, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LiveDataObservableResult liveDataObservableResult, int i, Function1 function1, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {liveDataObservableResult, Integer.valueOf(i), function1, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(912331526, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -912331526, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, Float.valueOf(f), Integer.valueOf(i2), l, function1, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i6)};
        return (Unit) onNavigationEvent(-1751986470, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1751986480, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(-1298780032, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1298780034, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, List list, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, float f, int i2, Long l, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), onextracallbackwithresult, onwarmupcompleted, list, getbacktracenote, getbacktracenote2, Float.valueOf(f), Integer.valueOf(i2), l, function1, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i6)};
        return (Unit) onNavigationEvent(163248645, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -163248636, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final getAsyncUpdates onExtraCallbackWithResult(getClipTextToBoundingBox getcliptexttoboundingbox) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (getAsyncUpdates) onNavigationEvent(-23102286, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 23102287, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getcliptexttoboundingbox}, iOnNavigationEvent2);
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(-1524209826, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1524209838, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, long j2, int i, Function1<? super getClipTextToBoundingBox, getAsyncUpdates> function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, List<? extends getBacktraceNote<? super getSwitchMinWidth<getClipTextToBoundingBox>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), function1, onextracallbackwithresult, onwarmupcompleted, l, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        onNavigationEvent(-1358789098, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1358789104, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final component8 IAuthTabCallback(List list, LiveDataObservableResult liveDataObservableResult, Function1 function1, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        Object[] objArr = {list, liveDataObservableResult, function1, onextracallbackwithresult, onwarmupcompleted, isextrapreviewrequired, virtualCameraCaptureResult};
        return (component8) onNavigationEvent(4493562, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -4493554, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(List list, LiveDataObservableResult liveDataObservableResult, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, int i, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) {
        Object[] objArr = {list, liveDataObservableResult, onextracallbackwithresult, Integer.valueOf(i), onwarmupcompleted, Integer.valueOf(i2), onextracallbackwithresult2};
        return (Unit) onNavigationEvent(-519615482, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 519615486, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, long j, TdsAnimateTickerV1Layout.onExtraCallbackWithResult onextracallbackwithresult, TdsAnimateTickerV1Layout.onWarmupCompleted onwarmupcompleted, Long l, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {list, quirksExternalSyntheticBackport0, Integer.valueOf(i), Long.valueOf(j), onextracallbackwithresult, onwarmupcompleted, l, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onNavigationEvent(1624001164, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1624001153, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static final /* synthetic */ RallyTickerState IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (RallyTickerState) onNavigationEvent(-650285456, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 650285461, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnNavigationEvent2);
    }
}
