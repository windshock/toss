package o;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import im.toss.components.tuba.variable.TubaVarV1SyncState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.findSnapView;
import o.trackCustomTabsTabHidden;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsTabHidden implements TubaVarV1SyncState {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private final findSnapView<TubaVarV1SyncState.State, TubaVarV1SyncState.onWarmupCompleted, Object> onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final access27100<TubaVarV1SyncState.State> onNavigationEvent;
    private final isJacksonCreator onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{function1, obj}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 191474611, -191474609, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        trackCustomTabsTabHidden trackcustomtabstabhidden = (trackCustomTabsTabHidden) objArr[0];
        TubaVarV1SyncState.State state = (TubaVarV1SyncState.State) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(trackcustomtabstabhidden, state);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(trackcustomtabstabhidden, state);
        int i3 = IAuthTabCallbackStub + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(trackCustomTabsTabHidden trackcustomtabstabhidden, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(trackcustomtabstabhidden, onextracallbackwithresult);
        int i4 = IAuthTabCallback + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Empty empty, TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(new Object[]{onextracallback, empty, onnavigationevent}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -2017962416, 2017962416, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
        int i3 = IAuthTabCallbackStub + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationevent2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onextracallback);
        }
        IAuthTabCallback(onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(trackCustomTabsTabHidden trackcustomtabstabhidden, findSnapView.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(trackcustomtabstabhidden, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = IAuthTabCallbackStub + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        TubaVarV1SyncState.State.Evaluated evaluated;
        Object obj;
        int i7;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = i10 | (~(i9 | i11));
        int i13 = ~(i3 | i4 | i5);
        int i14 = i12 | i13;
        int i15 = i11 | i4;
        int i16 = i4 + i5 + i + (112060874 * i6) + ((-1891258303) * i2);
        int i17 = i16 * i16;
        int i18 = (i4 * 1286644997) + 1783103488 + (1286644997 * i5) + (i14 * (-1821943044)) + ((-651081208) * i13) + ((-1821943044) * i15) + ((-535298048) * i) + ((-1427111936) * i6) + (1712848896 * i2) + (159514624 * i17);
        int i19 = ((i4 * (-1669307009)) - 1771304782) + (i5 * (-1669307009)) + (i14 * 564) + (i13 * (-1128)) + (i15 * 564) + (i * (-1669306445)) + (i6 * (-1582645698)) + (i2 * (-198941581)) + (i17 * (-203030528));
        int i20 = i18 + (i19 * i19 * (-2008154112));
        if (i20 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i20 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i20 == 3) {
            return onExtraCallback(objArr);
        }
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        TubaVarV1SyncState.State.Empty empty = (TubaVarV1SyncState.State.Empty) objArr[1];
        TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent = (TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent) objArr[2];
        int i21 = 2 % 2;
        int i22 = IAuthTabCallbackStub + 41;
        IAuthTabCallback = i22 % 128;
        if (i22 % 2 != 0) {
            Intrinsics.checkNotNullParameter(empty, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            evaluated = TubaVarV1SyncState.State.Evaluated.INSTANCE;
            obj = null;
            i7 = 5;
        } else {
            Intrinsics.checkNotNullParameter(empty, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            evaluated = TubaVarV1SyncState.State.Evaluated.INSTANCE;
            obj = null;
            i7 = 2;
        }
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, empty, evaluated, obj, i7, (Object) null);
    }

    public static /* synthetic */ Unit onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback);
        int i4 = IAuthTabCallback + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Evaluated evaluated, TubaVarV1SyncState.onWarmupCompleted.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(onextracallback, evaluated, onextracallback2);
        int i4 = IAuthTabCallbackStub + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Evaluated evaluated, TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(onextracallback, evaluated, onnavigationevent);
        }
        onExtraCallback(onextracallback, evaluated, onnavigationevent);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Throwable th, String str, JsonObject jsonObject, JsonObject jsonObject2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(th, str, jsonObject, jsonObject2);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public trackCustomTabsTabHidden(@NotNull isJacksonCreator isjacksoncreator) {
        Intrinsics.checkNotNullParameter(isjacksoncreator, "");
        this.onWarmupCompleted = isjacksoncreator;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(trackCustomTabsTabHidden.class.getSimpleName());
        this.onExtraCallback = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = trackCustomTabsTabHidden.onExtraCallback(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                int i4 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        access27100<TubaVarV1SyncState.State> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onExtraCallbackWithResult());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onNavigationEvent = access27100VarIAuthTabCallback;
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            JsonReaderUnknownNumberParsing<TubaVarV1SyncState.State> jsonReaderUnknownNumberParsingIAuthTabCallback = IAuthTabCallback(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = {this.f$0, (TubaVarV1SyncState.State) obj};
                    int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
                    Unit unit = (Unit) trackCustomTabsTabHidden.onNavigationEvent(objArr, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -488214553, 488214556, MaxNativeAdListener.onExtraCallbackWithResult());
                    int i4 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 34 / 0;
                    }
                    return unit;
                }
            };
            jsonReaderUnknownNumberParsingIAuthTabCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 105;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Function1 function12 = function1;
                    if (i3 == 0) {
                        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
                        trackCustomTabsTabHidden.onNavigationEvent(new Object[]{function12, obj}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1806099786, -1806099785, MaxNativeAdListener.onExtraCallbackWithResult());
                        return;
                    }
                    int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
                    trackCustomTabsTabHidden.onNavigationEvent(new Object[]{function12, obj}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1806099786, -1806099785, MaxNativeAdListener.onExtraCallbackWithResult());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            int i = IAuthTabCallback + 39;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = IAuthTabCallback + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(th);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(jsonObject);
        int i4 = IAuthTabCallbackStub + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull TubaVarV1SyncState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(onextracallback);
        int i4 = IAuthTabCallback + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackCustomTabsTabHidden.onExtraCallback(onextracallback, (TubaVarV1SyncState.State.Empty) obj, (TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent) obj2);
                int i5 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Evaluated evaluated, TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(evaluated, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, evaluated, TubaVarV1SyncState.State.Evaluated.INSTANCE, (Object) null, 4, (Object) null);
        }
        Intrinsics.checkNotNullParameter(evaluated, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, evaluated, TubaVarV1SyncState.State.Evaluated.INSTANCE, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Evaluated evaluated, TubaVarV1SyncState.onWarmupCompleted.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(evaluated, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, evaluated, TubaVarV1SyncState.State.Empty.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = IAuthTabCallback + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                TubaVarV1SyncState.State.Evaluated evaluated = (TubaVarV1SyncState.State.Evaluated) obj;
                TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent = (TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent) obj2;
                if (i4 != 0) {
                    return trackCustomTabsTabHidden.onNavigationEvent(onextracallback2, evaluated, onnavigationevent);
                }
                trackCustomTabsTabHidden.onNavigationEvent(onextracallback2, evaluated, onnavigationevent);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(TubaVarV1SyncState.onWarmupCompleted.onExtraCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 73;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    trackCustomTabsTabHidden.onNavigationEvent(onextracallback, (TubaVarV1SyncState.State.Evaluated) obj, (TubaVarV1SyncState.onWarmupCompleted.onExtraCallback) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = trackCustomTabsTabHidden.onNavigationEvent(onextracallback, (TubaVarV1SyncState.State.Evaluated) obj, (TubaVarV1SyncState.onWarmupCompleted.onExtraCallback) obj2);
                int i4 = onWarmupCompleted + 95;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onNavigationEvent(trackCustomTabsTabHidden trackcustomtabstabhidden, findSnapView.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!(iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback)) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabstabhidden.onExtraCallbackWithResult;
            Objects.toString(iAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            int i2 = IAuthTabCallbackStub + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = trackcustomtabstabhidden.onExtraCallbackWithResult;
        Objects.toString(iAuthTabCallback);
        findSnapView.IAuthTabCallback.onExtraCallback onextracallback = (findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback;
        if (Intrinsics.areEqual((TubaVarV1SyncState.State) onextracallback.IAuthTabCallback(), TubaVarV1SyncState.State.Evaluated.INSTANCE)) {
            TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallbackOnExtraCallback = ((TubaVarV1SyncState.onWarmupCompleted) onextracallback.onExtraCallbackWithResult()).onExtraCallback();
            AppSetIdAndScope1 appSetIdAndScope13 = trackcustomtabstabhidden.onExtraCallbackWithResult;
            Objects.toString(iAuthTabCallbackOnExtraCallback);
            if (iAuthTabCallbackOnExtraCallback instanceof TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) {
                JsonObject jsonObjectOnExtraCallback = iAuthTabCallbackOnExtraCallback.onExtraCallback();
                onResponse.onWarmupCompleted.onWarmupCompleted(jsonObjectOnExtraCallback);
                onWarmupCompleted(trackcustomtabstabhidden, jsonObjectOnExtraCallback, null, null, null, 14, null);
            } else if (iAuthTabCallbackOnExtraCallback instanceof TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) {
                TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted = (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) iAuthTabCallbackOnExtraCallback;
                onResponse.onWarmupCompleted.onExtraCallback(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.onExtraCallbackWithResult());
                onWarmupCompleted(trackcustomtabstabhidden, onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.IAuthTabCallback(), null, 8, null);
                int i4 = IAuthTabCallback + 53;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else if (iAuthTabCallbackOnExtraCallback instanceof TubaVarV1SyncState.onExtraCallback.onExtraCallback) {
                onWarmupCompleted(trackcustomtabstabhidden, null, null, null, ((TubaVarV1SyncState.onExtraCallback.onExtraCallback) iAuthTabCallbackOnExtraCallback).onWarmupCompleted(), 7, null);
            } else {
                if (iAuthTabCallbackOnExtraCallback != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = IAuthTabCallbackStub + 41;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    Unit unit2 = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unit3 = Unit.INSTANCE;
            }
            ConvertByteArrayToFloatArray.onWarmupCompleted("app_open_trigger_sync", false, (String) null, (List) null, (Map) null, (Function1) null, 62, (Object) null);
            trackcustomtabstabhidden.onWarmupCompleted.IAuthTabCallback();
        }
        trackcustomtabstabhidden.onNavigationEvent.onWarmupCompleted(onextracallback.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final trackCustomTabsTabHidden trackcustomtabstabhidden, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(TubaVarV1SyncState.State.Empty.INSTANCE);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 == 0) {
                    return trackCustomTabsTabHidden.onExtraCallbackWithResult(onextracallback);
                }
                trackCustomTabsTabHidden.onExtraCallbackWithResult(onextracallback);
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(TubaVarV1SyncState.State.Empty.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(TubaVarV1SyncState.State.Evaluated.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = trackCustomTabsTabHidden.onNavigationEvent((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = IAuthTabCallback + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackCustomTabsTabHidden.onExtraCallbackWithResult(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = onExtraCallback + 81;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static /* synthetic */ deserializeUriNullableCollection onWarmupCompleted(trackCustomTabsTabHidden trackcustomtabstabhidden, JsonObject jsonObject, JsonObject jsonObject2, String str, Throwable th, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 85;
        IAuthTabCallbackStub = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            jsonObject = null;
        }
        if ((i & 2) != 0) {
            jsonObject2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 65;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i & 8) != 0) {
            int i6 = i3 + 119;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            th = null;
        }
        return trackcustomtabstabhidden.onExtraCallback(jsonObject, jsonObject2, str, th);
    }

    private final deserializeUriNullableCollection onExtraCallback(final JsonObject jsonObject, final JsonObject jsonObject2, final String str, final Throwable th) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.splittarget.impl.fsm.TubaVarV1SyncStateImpl$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                trackCustomTabsTabHidden.onWarmupCompleted(th, str, jsonObject2, jsonObject);
                int i5 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 63 / 0;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
        int i2 = IAuthTabCallback + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return deserializeurinullablecollectionOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(Throwable th, String str, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonElement jsonElementValueOf;
        boolean z;
        int i = 2 % 2;
        if (th != null) {
            int i2 = IAuthTabCallbackStub + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TubaVarsSyncState", "vars failed", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("error", th.toString())));
            return;
        }
        List listListOf = CollectionsKt.listOf(new String[]{"securities.openTab", "securities.searchTabScheme", "benefit.showTab"});
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        Iterator it = listListOf.iterator();
        while (true) {
            jsonElementValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = (String) next;
            if (jsonObject2 != null) {
                jsonElementValueOf = (JsonElement) jsonObject2.get(str2);
                int i4 = IAuthTabCallback + 11;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            linkedHashMap.put(next, jsonElementValueOf);
        }
        if (str == null || jsonObject != null) {
            z = false;
        } else {
            int i6 = IAuthTabCallbackStub + 115;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("cdnCacheHit", Boolean.valueOf(z));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("vars_size", jsonObject2 != null ? Integer.valueOf(jsonObject2.size()) : null);
        if (jsonObject != null) {
            int i7 = IAuthTabCallback + 43;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                Integer.valueOf(jsonObject.size());
                throw null;
            }
            jsonElementValueOf = Integer.valueOf(jsonObject.size());
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TubaVarsSyncState", "vars applied", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("cdnvars_size", jsonElementValueOf), getWrite.IAuthTabCallback("cdn_etag", str), getWrite.IAuthTabCallback("evaluated", Boolean.TRUE), getWrite.IAuthTabCallback("tracking_vars", linkedHashMap.toString())}), (String) null, false, (String) null, 56, (Object) null);
    }

    public TubaVarV1SyncState.State onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.State state = (TubaVarV1SyncState.State) this.onExtraCallback.onWarmupCompleted();
        int i4 = IAuthTabCallback + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return state;
    }

    public findSnapView.IAuthTabCallback<TubaVarV1SyncState.State, TubaVarV1SyncState.onWarmupCompleted, Object> onWarmupCompleted(@NotNull TubaVarV1SyncState.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onExtraCallback.onExtraCallback(onwarmupcompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        findSnapView.IAuthTabCallback<TubaVarV1SyncState.State, TubaVarV1SyncState.onWarmupCompleted, Object> iAuthTabCallbackOnExtraCallback = this.onExtraCallback.onExtraCallback(onwarmupcompleted);
        int i3 = IAuthTabCallbackStub + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return iAuthTabCallbackOnExtraCallback;
    }

    public JsonReaderUnknownNumberParsing<TubaVarV1SyncState.State> IAuthTabCallback(boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onNavigationEvent.IAuthTabCallbackDefault().access000();
            if (!z) {
                int i3 = IAuthTabCallback + 123;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                j = 1;
            } else {
                j = 0;
            }
            JsonReaderUnknownNumberParsing<TubaVarV1SyncState.State> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
            return jsonReaderUnknownNumberParsingOnNavigationEvent;
        }
        this.onNavigationEvent.IAuthTabCallbackDefault().access000();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallbackStub + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return null;
    }

    private static final Unit onExtraCallback(trackCustomTabsTabHidden trackcustomtabstabhidden, TubaVarV1SyncState.State state) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabstabhidden.onExtraCallbackWithResult;
        Objects.toString(state);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{function1, obj}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1806099786, -1806099785, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackCustomTabsTabHidden trackcustomtabstabhidden, TubaVarV1SyncState.State state) {
        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{trackcustomtabstabhidden, state}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -488214553, 488214556, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{function1, obj}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 191474611, -191474609, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, TubaVarV1SyncState.State.Empty empty, TubaVarV1SyncState.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(new Object[]{onextracallback, empty, onnavigationevent}, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2017962416, 2017962416, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult());
    }
}
