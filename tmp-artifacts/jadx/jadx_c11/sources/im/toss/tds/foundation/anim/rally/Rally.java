package im.toss.tds.foundation.anim.rally;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.Address;
import o.AppLovinSdkSettings;
import o.AppLovinSdkUtilsSize;
import o.attachAppLovinSdk;
import o.getEventService;
import o.isCreativeDebuggerEnabled;
import o.isFireOS;
import o.isVerboseLoggingEnabled;
import o.pxToDp;
import o.reinitialize;
import o.setCreativeDebuggerEnabled;
import o.setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class Rally extends isFireOS<AppLovinSdkSettings> {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private final List<AppLovinSdkSettings> IAuthTabCallback;
    private Function1<? super Integer, Unit> onExtraCallbackWithResult;
    private Function1<? super Float, Unit> onNavigationEvent;
    private final setCreativeDebuggerEnabled<?> onWarmupCompleted;

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[isVerboseLoggingEnabled.values().length];
            try {
                iArr[isVerboseLoggingEnabled.SERIAL.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isVerboseLoggingEnabled.PARALLEL.ordinal()] = 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[isCreativeDebuggerEnabled.onExtraCallback.values().length];
            try {
                iArr2[isCreativeDebuggerEnabled.onExtraCallback.Plus.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[isCreativeDebuggerEnabled.onExtraCallback.Minus.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[isCreativeDebuggerEnabled.onExtraCallback.Multiply.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[isCreativeDebuggerEnabled.onExtraCallback.Divide.ordinal()] = 4;
                int i4 = onNavigationEvent + 13;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 3;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    static {
        int i = asBinder + 71;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void onExtraCallback(Rally rally, Ref.IntRef intRef, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -135586041, iOnExtraCallback, new Object[]{rally, intRef, valueAnimator}, 135586041);
            int i3 = 18 / 0;
        } else {
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -135586041, iOnExtraCallback3, new Object[]{rally, intRef, valueAnimator}, 135586041);
        }
        int i4 = asInterface + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~((~i5) | i7 | i6)) | (~(i8 | i4));
        int i12 = i4 + i6 + i2 + (531708263 * i) + ((-608630064) * i3);
        int i13 = i12 * i12;
        int i14 = (i4 * (-228234701)) + 730857472 + ((-228234701) * i6) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i2) + ((-45088768) * i) + ((-419430400) * i3) + ((-1471938560) * i13);
        int i15 = ((i4 * (-1679524527)) - 150938974) + (i6 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i2 * (-1679524245)) + (i * (-166744051)) + (i3 * 2062148848) + (i13 * (-865337344));
        int i16 = i14 + (i15 * i15 * (-1617166336));
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        Rally rally = (Rally) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i17 = 2 % 2;
        if (objArr[4] != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnEnd");
        }
        int i18 = asInterface + 47;
        onExtraCallback = i18 % 128;
        if (i18 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            obj = null;
        }
        Rally rallyOnNavigationEvent = rally.onNavigationEvent(obj, function0);
        int i19 = onExtraCallback + 103;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        return rallyOnNavigationEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rally(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled) {
        super(null);
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        this.onWarmupCompleted = setcreativedebuggerenabled;
        this.IAuthTabCallback = new ArrayList();
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = asInterface + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return rallyICustomTabsServiceStub;
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS access100() {
        Rally rallyUpdateVisuals;
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            rallyUpdateVisuals = updateVisuals();
            int i3 = 42 / 0;
        } else {
            rallyUpdateVisuals = updateVisuals();
        }
        int i4 = asInterface + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return rallyUpdateVisuals;
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(z);
            throw null;
        }
        Rally rallyOnWarmupCompleted = onWarmupCompleted(z);
        int i3 = onExtraCallback + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return rallyOnWarmupCompleted;
    }

    @Override // o.isFireOS
    public /* synthetic */ void onWarmupCompleted(getEventService geteventservice, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((AppLovinSdkSettings) geteventservice, f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyWriteTypedList = writeTypedList();
        int i4 = onExtraCallback + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return rallyWriteTypedList;
    }

    public final setCreativeDebuggerEnabled<?> validateRelationship() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setCreativeDebuggerEnabled<?> setcreativedebuggerenabled = this.onWarmupCompleted;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return setcreativedebuggerenabled;
    }

    public final void onExtraCallbackWithResult(@Nullable Function1<? super Float, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = function1;
        int i5 = i2 + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public final List<AppLovinSdkSettings> ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int i5 = i2 + 7;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isFireOS
    public pxToDp ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
            throw null;
        }
        pxToDp.onWarmupCompleted onwarmupcompleted2 = pxToDp.onWarmupCompleted.IAuthTabCallback;
        int i3 = onExtraCallback + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompleted2;
    }

    public final void onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            appLovinSdkSettings.extraCallbackWithResult();
            this.IAuthTabCallback.add(appLovinSdkSettings);
        } else {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            appLovinSdkSettings.extraCallbackWithResult();
            this.IAuthTabCallback.add(appLovinSdkSettings);
            int i3 = 2 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull List<AppLovinSdkSettings> list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        int i4 = asInterface + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < size) {
            onWarmupCompleted(list.get(i6));
            i6++;
            int i7 = asInterface + 117;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void warmup() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.clear();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onTransact(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        int i4 = i3 % 128;
        asInterface = i4;
        Object obj3 = null;
        if (i3 % 2 == 0) {
            obj3.hashCode();
            throw null;
        }
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnStart");
        }
        if ((i & 1) != 0) {
            int i5 = i4 + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Rally rally2 = (Rally) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1962620484, iOnExtraCallback, new Object[]{rally, obj, function0}, 1962620486);
        int i7 = asInterface + 49;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 3 / 0;
        }
        return rally2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            rally.isEngagementSignalsApiAvailable().put(obj, function0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        rally.isEngagementSignalsApiAvailable().put(obj, function0);
        int i3 = asInterface + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return rally;
    }

    public static /* synthetic */ Rally IAuthTabCallback(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnDelayedStart");
        }
        int i6 = i4 + 79;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        if (i6 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i8 = i7 + 49;
            asInterface = i8 % 128;
            obj = null;
            if (i8 % 2 == 0) {
                throw null;
            }
        }
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Rally) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -156972433, iOnExtraCallback, new Object[]{rally, obj, function0}, 156972436);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        rally.ICustomTabsCallbackDefault().put(obj, function0);
        int i4 = onExtraCallback + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    public static /* synthetic */ Rally onWarmupCompleted(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnRepeat");
        }
        Object obj3 = null;
        if ((i & 1) != 0) {
            int i6 = i3 + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            obj = null;
        }
        Rally rallyIAuthTabCallback = rally.IAuthTabCallback(obj, (Function0<Unit>) function0);
        int i8 = asInterface + 7;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return rallyIAuthTabCallback;
        }
        obj3.hashCode();
        throw null;
    }

    public final Rally IAuthTabCallback(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            ICustomTabsCallbackStub().put(obj, function0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        ICustomTabsCallbackStub().put(obj, function0);
        int i3 = asInterface + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public static /* synthetic */ Rally onNavigationEvent(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnDelayedRepeat");
        }
        if ((i & 1) != 0) {
            int i3 = asInterface + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            obj = null;
        }
        Rally rallyOnExtraCallbackWithResult = rally.onExtraCallbackWithResult(obj, (Function0<Unit>) function0);
        int i5 = onExtraCallback + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return rallyOnExtraCallbackWithResult;
    }

    public final Rally onExtraCallbackWithResult(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        onUnminimized().put(obj, function0);
        int i4 = onExtraCallback + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final Rally onNavigationEvent(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            onRelationshipValidationResult().put(obj, function0);
            return this;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        onRelationshipValidationResult().put(obj, function0);
        throw null;
    }

    public static /* synthetic */ Rally onExtraCallbackWithResult(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnCancel");
        }
        if ((i & 1) != 0) {
            int i6 = i4 + 55;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 49 / 0;
            }
            obj = null;
        }
        return rally.onExtraCallback(obj, function0);
    }

    public final Rally onExtraCallback(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            ICustomTabsCallbackStubProxy().put(obj, function0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        ICustomTabsCallbackStubProxy().put(obj, function0);
        int i3 = onExtraCallback + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    @Override // o.isFireOS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void extraCommand() {
        List<AppLovinSdkSettings> list;
        int i;
        int i2;
        int iIntValue;
        int iIntValue2;
        float interpolation;
        Integer numValueOf;
        Integer num;
        Integer numValueOf2;
        int i3 = 2 % 2;
        onExtraCallbackWithResult((Integer) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AppLovinSdkSettings> list2 = this.IAuthTabCallback;
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            AppLovinSdkSettings appLovinSdkSettings = list2.get(i4);
            Interpolator interpolatorOnMinimized = onMinimized();
            if (interpolatorOnMinimized == null) {
                interpolatorOnMinimized = IAuthTabCallbackDefault();
            }
            Integer numExtraCallbackWithResult = extraCallbackWithResult();
            if (numExtraCallbackWithResult == null) {
                numExtraCallbackWithResult = onTransact();
            }
            Boolean boolWriteTypedObject = writeTypedObject();
            if (boolWriteTypedObject == null) {
                boolWriteTypedObject = asInterface();
            }
            appLovinSdkSettings.onWarmupCompleted(this, interpolatorOnMinimized, numExtraCallbackWithResult, boolWriteTypedObject);
            appLovinSdkSettings.onNavigationEvent();
            List<attachAppLovinSdk> listOnNavigationEvent = appLovinSdkSettings.IAuthTabCallbackStubProxy().onNavigationEvent();
            int size2 = listOnNavigationEvent.size();
            int i5 = 0;
            while (i5 < size2) {
                int i6 = onExtraCallback + 125;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    attachAppLovinSdk attachapplovinsdk = listOnNavigationEvent.get(i5);
                    setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabledIAuthTabCallback = attachapplovinsdk.asBinder().IAuthTabCallback();
                    attachapplovinsdk.asBinder();
                    throw null;
                }
                attachAppLovinSdk attachapplovinsdk2 = listOnNavigationEvent.get(i5);
                setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabledIAuthTabCallback2 = attachapplovinsdk2.asBinder().IAuthTabCallback();
                isCreativeDebuggerEnabled iscreativedebuggerenabledAsBinder = attachapplovinsdk2.asBinder();
                attachAppLovinSdk attachapplovinsdk3 = (attachAppLovinSdk) linkedHashMap.get(setshouldfailaddisplayifdontkeepactivitiesisenabledIAuthTabCallback2);
                if (attachapplovinsdk3 == null) {
                    int i7 = asInterface + 5;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.onWarmupCompleted.onWarmupCompleted(iscreativedebuggerenabledAsBinder);
                        boolean z = iscreativedebuggerenabledAsBinder instanceof reinitialize;
                        throw null;
                    }
                    Float fOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(iscreativedebuggerenabledAsBinder);
                    if (iscreativedebuggerenabledAsBinder instanceof reinitialize) {
                        reinitialize reinitializeVar = (reinitialize) iscreativedebuggerenabledAsBinder;
                        if (reinitializeVar.onExtraCallbackWithResult() == null) {
                            if (fOnWarmupCompleted != null) {
                                int i8 = asInterface + 27;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    numValueOf2 = Integer.valueOf((int) fOnWarmupCompleted.floatValue());
                                    int i9 = 58 / 0;
                                } else {
                                    numValueOf2 = Integer.valueOf((int) fOnWarmupCompleted.floatValue());
                                }
                            } else {
                                numValueOf2 = null;
                            }
                            reinitializeVar.onExtraCallbackWithResult(numValueOf2);
                        } else if (reinitializeVar.onExtraCallback() == null) {
                            if (fOnWarmupCompleted != null) {
                                Integer numValueOf3 = Integer.valueOf((int) fOnWarmupCompleted.floatValue());
                                int i10 = onExtraCallback + 21;
                                asInterface = i10 % 128;
                                int i11 = i10 % 2;
                                num = numValueOf3;
                            } else {
                                num = null;
                            }
                            reinitializeVar.onWarmupCompleted(num);
                        }
                    } else if (iscreativedebuggerenabledAsBinder instanceof AppLovinSdkUtilsSize) {
                        AppLovinSdkUtilsSize appLovinSdkUtilsSize = (AppLovinSdkUtilsSize) iscreativedebuggerenabledAsBinder;
                        if (appLovinSdkUtilsSize.onExtraCallback() == null) {
                            appLovinSdkUtilsSize.onWarmupCompleted(fOnWarmupCompleted != null ? Integer.valueOf((int) fOnWarmupCompleted.floatValue()) : null);
                        } else if (appLovinSdkUtilsSize.onExtraCallbackWithResult() == null) {
                            int i12 = onExtraCallback + 73;
                            asInterface = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 75 / 0;
                                numValueOf = fOnWarmupCompleted != null ? Integer.valueOf((int) fOnWarmupCompleted.floatValue()) : null;
                            } else if (fOnWarmupCompleted != null) {
                            }
                            appLovinSdkUtilsSize.onNavigationEvent(numValueOf);
                        }
                    }
                    onNavigationEvent(iscreativedebuggerenabledAsBinder, fOnWarmupCompleted);
                    list = list2;
                    i2 = size;
                } else {
                    isCreativeDebuggerEnabled iscreativedebuggerenabledAsBinder2 = attachapplovinsdk3.asBinder();
                    if (iscreativedebuggerenabledAsBinder instanceof reinitialize) {
                        reinitialize reinitializeVar2 = (reinitialize) iscreativedebuggerenabledAsBinder;
                        if (reinitializeVar2.onExtraCallbackWithResult() == null) {
                            Intrinsics.checkNotNull(iscreativedebuggerenabledAsBinder2, "");
                            reinitializeVar2.onExtraCallbackWithResult(((reinitialize) iscreativedebuggerenabledAsBinder2).onExtraCallback());
                        } else {
                            if (iscreativedebuggerenabledAsBinder instanceof AppLovinSdkUtilsSize) {
                                int i14 = asInterface + 59;
                                list = list2;
                                onExtraCallback = i14 % 128;
                                if (i14 % 2 != 0) {
                                    ((AppLovinSdkUtilsSize) iscreativedebuggerenabledAsBinder).onExtraCallback();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                AppLovinSdkUtilsSize appLovinSdkUtilsSize2 = (AppLovinSdkUtilsSize) iscreativedebuggerenabledAsBinder;
                                if (appLovinSdkUtilsSize2.onExtraCallback() == null) {
                                    Intrinsics.checkNotNull(iscreativedebuggerenabledAsBinder2, "");
                                    appLovinSdkUtilsSize2.onWarmupCompleted(((AppLovinSdkUtilsSize) iscreativedebuggerenabledAsBinder2).onExtraCallbackWithResult());
                                }
                            }
                            i = WhenMappings.onExtraCallback[attachapplovinsdk2.onWarmupCompleted().ordinal()];
                            if (i != 1) {
                                if (attachapplovinsdk2.asBinder().onNavigationEvent()) {
                                    int iOnTransact = attachapplovinsdk3.onTransact();
                                    Integer numOnExtraCallback = attachapplovinsdk3.onExtraCallback();
                                    if (numOnExtraCallback != null) {
                                        int i15 = asInterface + 83;
                                        i2 = size;
                                        onExtraCallback = i15 % 128;
                                        int i16 = i15 % 2;
                                        iIntValue = numOnExtraCallback.intValue();
                                    } else {
                                        i2 = size;
                                        iIntValue = 0;
                                    }
                                    float fMax = Math.max(iOnTransact - iIntValue, 0) / (attachapplovinsdk3.IAuthTabCallback() != null ? r6.intValue() : 0);
                                    attachapplovinsdk3.onWarmupCompleted(attachapplovinsdk3.onTransact());
                                    isCreativeDebuggerEnabled iscreativedebuggerenabledAsBinder3 = attachapplovinsdk3.asBinder();
                                    Interpolator interpolatorOnNavigationEvent = attachapplovinsdk3.onNavigationEvent();
                                    if (interpolatorOnNavigationEvent != null) {
                                        fMax = interpolatorOnNavigationEvent.getInterpolation(fMax);
                                    }
                                    Float fOnExtraCallbackWithResult = isCreativeDebuggerEnabled.onExtraCallbackWithResult(iscreativedebuggerenabledAsBinder3, fMax, null, false, 4, null);
                                    if (fOnExtraCallbackWithResult != null) {
                                        attachapplovinsdk2.IAuthTabCallback(fOnExtraCallbackWithResult.floatValue());
                                    }
                                }
                                onNavigationEvent(iscreativedebuggerenabledAsBinder, iscreativedebuggerenabledAsBinder2.IAuthTabCallbackStubProxy());
                            } else if (i == 2) {
                                Integer numOnExtraCallback2 = attachapplovinsdk2.onExtraCallback();
                                if (numOnExtraCallback2 != null) {
                                    int i17 = asInterface + 113;
                                    onExtraCallback = i17 % 128;
                                    int i18 = i17 % 2;
                                    iIntValue2 = numOnExtraCallback2.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue2 < attachapplovinsdk3.onTransact() && attachapplovinsdk2.asBinder().onNavigationEvent()) {
                                    Integer numOnExtraCallback3 = attachapplovinsdk2.onExtraCallback();
                                    int iIntValue3 = numOnExtraCallback3 != null ? numOnExtraCallback3.intValue() : 0;
                                    Integer numOnExtraCallback4 = attachapplovinsdk3.onExtraCallback();
                                    float fMax2 = Math.max(iIntValue3 - (numOnExtraCallback4 != null ? numOnExtraCallback4.intValue() : 0), 0) / (attachapplovinsdk3.IAuthTabCallback() != null ? r8.intValue() : 0);
                                    attachapplovinsdk3.onWarmupCompleted(iIntValue3);
                                    isCreativeDebuggerEnabled iscreativedebuggerenabledAsBinder4 = attachapplovinsdk3.asBinder();
                                    Interpolator interpolatorOnNavigationEvent2 = attachapplovinsdk3.onNavigationEvent();
                                    if (interpolatorOnNavigationEvent2 != null) {
                                        int i19 = asInterface + 13;
                                        onExtraCallback = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            interpolation = interpolatorOnNavigationEvent2.getInterpolation(fMax2);
                                            int i20 = 57 / 0;
                                        } else {
                                            interpolation = interpolatorOnNavigationEvent2.getInterpolation(fMax2);
                                        }
                                        fMax2 = interpolation;
                                    }
                                    Float fOnExtraCallbackWithResult2 = isCreativeDebuggerEnabled.onExtraCallbackWithResult(iscreativedebuggerenabledAsBinder4, fMax2, null, false, 4, null);
                                    if (fOnExtraCallbackWithResult2 != null) {
                                        int i21 = onExtraCallback + 107;
                                        asInterface = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            attachapplovinsdk2.IAuthTabCallback(fOnExtraCallbackWithResult2.floatValue());
                                            throw null;
                                        }
                                        attachapplovinsdk2.IAuthTabCallback(fOnExtraCallbackWithResult2.floatValue());
                                    }
                                }
                            }
                            i2 = size;
                            onNavigationEvent(iscreativedebuggerenabledAsBinder, iscreativedebuggerenabledAsBinder2.IAuthTabCallbackStubProxy());
                        }
                        list = list2;
                        i = WhenMappings.onExtraCallback[attachapplovinsdk2.onWarmupCompleted().ordinal()];
                        if (i != 1) {
                        }
                        i2 = size;
                        onNavigationEvent(iscreativedebuggerenabledAsBinder, iscreativedebuggerenabledAsBinder2.IAuthTabCallbackStubProxy());
                    }
                }
                linkedHashMap.put(setshouldfailaddisplayifdontkeepactivitiesisenabledIAuthTabCallback2, attachapplovinsdk2);
                i5++;
                list2 = list;
                size = i2;
            }
            i4++;
            size = size;
        }
        onExtraCallback(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(isCreativeDebuggerEnabled iscreativedebuggerenabled, Float f) {
        Float fValueOf;
        Float fIAuthTabCallbackDefault;
        float fFloatValue;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = -1;
        if (iscreativedebuggerenabled.asBinder() == null) {
            int i6 = onExtraCallback + 125;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 83 / 0;
                if (iscreativedebuggerenabled.IAuthTabCallbackDefault() != null) {
                    if (iscreativedebuggerenabled.IAuthTabCallback_Parcel()) {
                        Float fIAuthTabCallbackDefault2 = iscreativedebuggerenabled.IAuthTabCallbackDefault();
                        float fFloatValue2 = fIAuthTabCallbackDefault2 != null ? fIAuthTabCallbackDefault2.floatValue() : 0.0f;
                        if (f != null) {
                            int i8 = onExtraCallback + 109;
                            asInterface = i8 % 128;
                            int i9 = i8 % 2;
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        isCreativeDebuggerEnabled.onExtraCallback onextracallbackOnTransact = iscreativedebuggerenabled.onTransact();
                        if (onextracallbackOnTransact == null) {
                            int i10 = onExtraCallback + 31;
                            asInterface = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 2 % 5;
                            }
                            i = -1;
                        } else {
                            i = WhenMappings.onExtraCallbackWithResult[onextracallbackOnTransact.ordinal()];
                        }
                        if (i != 1) {
                            int i12 = onExtraCallback + 97;
                            asInterface = i12 % 128;
                            if (i12 % 2 != 0 ? i == 2 : i == 2) {
                                fIAuthTabCallbackDefault = Float.valueOf(fFloatValue - fFloatValue2);
                            } else if (i == 3) {
                                fIAuthTabCallbackDefault = Float.valueOf(fFloatValue * fFloatValue2);
                            } else if (i != 4) {
                                fIAuthTabCallbackDefault = f;
                            } else {
                                if (fFloatValue2 != 0.0f) {
                                    fFloatValue /= fFloatValue2;
                                }
                                fIAuthTabCallbackDefault = Float.valueOf(fFloatValue);
                            }
                        } else {
                            fIAuthTabCallbackDefault = Float.valueOf(fFloatValue + fFloatValue2);
                        }
                    } else {
                        fIAuthTabCallbackDefault = iscreativedebuggerenabled.IAuthTabCallbackDefault();
                    }
                    iscreativedebuggerenabled.onExtraCallbackWithResult(fIAuthTabCallbackDefault);
                }
            } else if (iscreativedebuggerenabled.IAuthTabCallbackDefault() != null) {
            }
        }
        if (iscreativedebuggerenabled.IAuthTabCallbackStubProxy() == null) {
            if (iscreativedebuggerenabled.asInterface() != null) {
                int i13 = onExtraCallback + 77;
                asInterface = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 73 / 0;
                    if (iscreativedebuggerenabled.IAuthTabCallback_Parcel()) {
                        int i15 = asInterface + 17;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        Float fAsInterface = iscreativedebuggerenabled.asInterface();
                        float fFloatValue3 = fAsInterface != null ? fAsInterface.floatValue() : 0.0f;
                        float fFloatValue4 = f != null ? f.floatValue() : 0.0f;
                        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                        isCreativeDebuggerEnabled.onExtraCallback onextracallback = (isCreativeDebuggerEnabled.onExtraCallback) isCreativeDebuggerEnabled.onWarmupCompleted(1838065040, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1838065039, new Object[]{iscreativedebuggerenabled}, iOnWarmupCompleted);
                        if (onextracallback == null) {
                            int i17 = asInterface + 117;
                            onExtraCallback = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            i5 = WhenMappings.onExtraCallbackWithResult[onextracallback.ordinal()];
                        }
                        if (i5 == 1) {
                            fValueOf = Float.valueOf(fFloatValue4 + fFloatValue3);
                        } else if (i5 == 2) {
                            fValueOf = Float.valueOf(fFloatValue4 - fFloatValue3);
                        } else if (i5 == 3) {
                            fValueOf = Float.valueOf(fFloatValue4 * fFloatValue3);
                        } else if (i5 == 4) {
                            if (fFloatValue3 != 0.0f) {
                                int i19 = asInterface + 71;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                fFloatValue4 /= fFloatValue3;
                            }
                            fValueOf = Float.valueOf(fFloatValue4);
                        } else {
                            fValueOf = f;
                        }
                    } else {
                        fValueOf = iscreativedebuggerenabled.asInterface();
                    }
                } else if (iscreativedebuggerenabled.IAuthTabCallback_Parcel()) {
                }
            }
            iscreativedebuggerenabled.onExtraCallback(fValueOf);
        }
    }

    @Override // o.isFireOS
    public void IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!getInterfaceDescriptor()) {
            extraCommand();
        }
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int size = list.size();
        int i5 = 0;
        int iIAuthTabCallbackStub = 0;
        while (i5 < size) {
            iIAuthTabCallbackStub += list.get(i5).IAuthTabCallbackStub();
            i5++;
            int i6 = asInterface + 11;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 5;
            }
        }
        Function1<? super Integer, Unit> function1 = this.onExtraCallbackWithResult;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(onNavigationEvent(i, iIAuthTabCallbackStub)));
        }
        Collection<Function0<Unit>> collectionIAuthTabCallback = IAuthTabCallback(ICustomTabsService(), i);
        onTransact(i);
        Iterator<T> it = collectionIAuthTabCallback.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
            int i8 = onExtraCallback + 3;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public void onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            appLovinSdkSettings.onExtraCallbackWithResult(this.onWarmupCompleted, f);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            appLovinSdkSettings.onExtraCallbackWithResult(this.onWarmupCompleted, f);
        }
        int i4 = asInterface + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public Rally onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(IAuthTabCallback_Parcel());
        if (z) {
            int i4 = asInterface + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            asInterface(1.0f);
            return this;
        }
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            int i6 = asInterface + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            typedObject.start();
            if (i7 != 0) {
                int i8 = 34 / 0;
            }
            int i9 = asInterface + 25;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return this;
    }

    public Rally writeTypedList() {
        int i = 2 % 2;
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            int i2 = asInterface + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            typedObject.pause();
            int i4 = onExtraCallback + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return this;
    }

    public Rally ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.cancel();
        } else if (getInterfaceDescriptor()) {
            int i3 = asInterface + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Iterator<T> it = ICustomTabsCallbackStubProxy().values().iterator();
            int i5 = asInterface + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
            while (!(!it.hasNext())) {
                ((Function0) it.next()).invoke();
            }
        }
        onExtraCallback(false);
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            list.get(i7).extraCallbackWithResult();
        }
        return this;
    }

    public Rally updateVisuals() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject();
            throw null;
        }
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.end();
        }
        int i3 = 0;
        onExtraCallback(false);
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int size = list.size();
        while (i3 < size) {
            list.get(i3).extraCallbackWithResult();
            i3++;
            int i4 = onExtraCallback + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return this;
    }

    @Override // o.isFireOS
    public List<AppLovinSdkSettings> extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int i5 = i2 + 83;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return list;
    }

    @Override // o.getEventService
    public int onWarmupCompleted() {
        int i = 2 % 2;
        if (!(!newSessionWithExtras())) {
            return Integer.MAX_VALUE;
        }
        List<AppLovinSdkSettings> list = this.IAuthTabCallback;
        int size = list.size();
        int i2 = 0;
        int iIAuthTabCallbackStub = 0;
        while (i2 < size) {
            int i3 = asInterface + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                iIAuthTabCallbackStub /= list.get(i2).IAuthTabCallbackStub();
                i2 += 91;
            } else {
                iIAuthTabCallbackStub += list.get(i2).IAuthTabCallbackStub();
                i2++;
            }
            int i4 = onExtraCallback + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return onMessageChannelReady() + (iIAuthTabCallbackStub * mayLaunchUrl()) + (onActivityResized() * (mayLaunchUrl() - 1));
    }

    @Override // o.isFireOS
    public ValueAnimator IAuthTabCallback_Parcel() {
        float f;
        long j;
        int i = 2 % 2;
        boolean interfaceDescriptor = getInterfaceDescriptor();
        if (!interfaceDescriptor) {
            extraCommand();
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        intRef.element = iIAuthTabCallbackStub;
        if (iIAuthTabCallbackStub < 0) {
            int i2 = onExtraCallback + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            intRef.element = iIAuthTabCallbackStub - onMessageChannelReady();
            int i4 = onExtraCallback + 87;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!interfaceDescriptor) {
            int i6 = onExtraCallback + 41;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                postMessage();
                throw null;
            }
            if (!postMessage() && !newSession()) {
                int i7 = onExtraCallback + 93;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    newAuthTabSession();
                    throw null;
                }
                IAuthTabCallbackStub(newAuthTabSession() ? intRef.element : 0);
            }
        }
        float fICustomTabsService = intRef.element > 0 ? ICustomTabsService() / intRef.element : newAuthTabSession() ? 0.0f : 1.0f;
        float f2 = newAuthTabSession() ? 0.0f : 1.0f;
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fICustomTabsService, f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.tds.foundation.anim.rally.Rally$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 55;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    Rally.onExtraCallback(this.f$0, intRef, valueAnimator);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Rally.onExtraCallback(this.f$0, intRef, valueAnimator);
                int i10 = IAuthTabCallback + 75;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 14 / 0;
                }
            }
        });
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        if (newAuthTabSession()) {
            int i8 = asInterface + 91;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            f = intRef.element * fICustomTabsService;
        } else {
            float f3 = intRef.element;
            f = f3 - (fICustomTabsService * f3);
        }
        if (f < 0.0f) {
            j = Long.MAX_VALUE;
        } else {
            int i10 = onExtraCallback + 101;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            j = (long) f;
        }
        valueAnimatorOfFloat.setDuration(j);
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: im.toss.tds.foundation.anim.rally.Rally$createAnimator$lambda$0$$inlined$doOnCancel$1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i12 = 2 % 2;
                int i13 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                int i12 = 2 % 2;
                int i13 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 84 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                int i12 = 2 % 2;
                int i13 = onExtraCallbackWithResult + 51;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                int i12 = 2 % 2;
                int i13 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr = {this.onNavigationEvent};
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                Iterator it = ((Map) isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2140325197, iOnExtraCallbackWithResult, -2140325197)).values().iterator();
                int i15 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                while (it.hasNext()) {
                    int i17 = onWarmupCompleted + 71;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        ((Function0) it.next()).invoke();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ((Function0) it.next()).invoke();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        Ref.IntRef intRef = (Ref.IntRef) objArr[1];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        Float f = (Float) animatedValue;
        rally.IAuthTabCallbackDefault((int) (f.floatValue() * intRef.element));
        Function1<? super Float, Unit> function1 = rally.onNavigationEvent;
        if (function1 == null) {
            return null;
        }
        int i4 = asInterface + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        function1.invoke(f);
        if (i5 == 0) {
            return null;
        }
        int i6 = 85 / 0;
        return null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Rally onExtraCallback(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
            Rally rally = new Rally(setcreativedebuggerenabled);
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return rally;
        }
    }

    private static final void IAuthTabCallback(Rally rally, Ref.IntRef intRef, ValueAnimator valueAnimator) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -135586041, iOnExtraCallback, new Object[]{rally, intRef, valueAnimator}, 135586041);
    }

    public static /* synthetic */ Rally onExtraCallback(Rally rally, Object obj, Function0 function0, int i, Object obj2) {
        Object[] objArr = {rally, obj, function0, Integer.valueOf(i), obj2};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Rally) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226);
    }

    public final Rally onWarmupCompleted(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Rally) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -156972433, iOnExtraCallback, new Object[]{this, obj, function0}, 156972436);
    }

    public final Rally IAuthTabCallbackDefault(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Rally) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1962620484, iOnExtraCallback, new Object[]{this, obj, function0}, 1962620486);
    }
}
