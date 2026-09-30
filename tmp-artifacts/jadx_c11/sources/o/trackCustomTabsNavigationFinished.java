package o;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.isExceptionHandlerEnabled;
import o.trackCustomTabsNavigationFinished;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsNavigationFinished implements isExceptionHandlerEnabled {
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private final zzad IAuthTabCallback;
    private final AppSetIdAndScope1 onExtraCallback;
    private final findSnapView<isExceptionHandlerEnabled.onExtraCallbackWithResult, isExceptionHandlerEnabled.IAuthTabCallback, Object> onNavigationEvent;
    private final access27100<isExceptionHandlerEnabled.onExtraCallbackWithResult> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallbackwithresult);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i5));
        int i10 = ~(i2 | i5);
        int i11 = ~i5;
        int i12 = (~(i6 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i2 + i5 + i3 + ((-1570926368) * i4) + ((-1409401439) * i);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i2) - 657981440) + (821186744 * i5) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i3) + (1124073472 * i4) + ((-332922880) * i) + ((-1182662656) * i15);
        int i17 = (i2 * 1410161459) + 847508490 + (i5 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i3 * 1410159841) + (i4 * 1126552800) + (i * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished = (trackCustomTabsNavigationFinished) objArr[0];
        isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback = (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) objArr[1];
        isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback2 = (isExceptionHandlerEnabled.IAuthTabCallback) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(trackcustomtabsnavigationfinished, iAuthTabCallback, iAuthTabCallback2);
        int i4 = onExtraCallbackWithResult + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(trackcustomtabsnavigationfinished, onextracallback);
        int i4 = asInterface + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onextracallback, iAuthTabCallback, onextracallback2);
        }
        IAuthTabCallback(onextracallback, iAuthTabCallback, onextracallback2);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback2, isExceptionHandlerEnabled.IAuthTabCallback.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, onextracallback2, onnavigationevent);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return onnavigationeventOnExtraCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback2, isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(onextracallback, onextracallback2, onwarmupcompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, onextracallback2, onwarmupcompleted);
        int i3 = onExtraCallbackWithResult + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished = (trackCustomTabsNavigationFinished) objArr[0];
        isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback = (isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback) objArr[1];
        isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback = (isExceptionHandlerEnabled.IAuthTabCallback) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallback, iAuthTabCallback);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallback, iAuthTabCallback);
        int i3 = asInterface + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackcustomtabsnavigationfinished, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = asInterface + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallback);
        int i4 = asInterface + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallbackwithresult);
        }
        onWarmupCompleted(trackcustomtabsnavigationfinished, onextracallbackwithresult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), -440177305, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult3, 440177305, iOnExtraCallbackWithResult);
            return;
        }
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
        onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), -440177305, iOnExtraCallbackWithResult5, new Object[]{function1, obj}, iOnExtraCallbackWithResult6, 440177305, iOnExtraCallbackWithResult4);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 569472438, iOnExtraCallbackWithResult5, new Object[]{onextracallback, iAuthTabCallback, onextracallbackwithresult}, iOnExtraCallbackWithResult6, -569472435, iOnExtraCallbackWithResult4);
        int i3 = asInterface + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return onnavigationevent;
    }

    @Inject
    public trackCustomTabsNavigationFinished(@NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.IAuthTabCallback = zzadVar;
        this.onExtraCallback = ea10.onExtraCallbackWithResult(trackCustomTabsNavigationFinished.class.getSimpleName());
        this.onNavigationEvent = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = trackCustomTabsNavigationFinished.IAuthTabCallback(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                int i4 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        access27100<isExceptionHandlerEnabled.onExtraCallbackWithResult> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onWarmupCompleted = access27100VarIAuthTabCallback;
        if (zzadVar.onActivityLayout()) {
            JsonReaderUnknownNumberParsing<isExceptionHandlerEnabled.onExtraCallbackWithResult> jsonReaderUnknownNumberParsingOnExtraCallback = onExtraCallback(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 17;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnNavigationEvent = trackCustomTabsNavigationFinished.onNavigationEvent(this.f$0, (isExceptionHandlerEnabled.onExtraCallbackWithResult) obj);
                    int i4 = onNavigationEvent + 65;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            jsonReaderUnknownNumberParsingOnExtraCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        trackCustomTabsNavigationFinished.onNavigationEvent(function1, obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    trackCustomTabsNavigationFinished.onNavigationEvent(function1, obj);
                    int i3 = onNavigationEvent + 15;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 57 / 0;
                    }
                }
            });
            int i = asInterface + 57;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = onExtraCallbackWithResult + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback2, isExceptionHandlerEnabled.IAuthTabCallback.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult, (Object) null, 5, (Object) null);
        }
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback2, isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
    }

    private static final Unit onWarmupCompleted(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            trackcustomtabsnavigationfinished.onWarmupCompleted.onWarmupCompleted(onextracallback);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        trackcustomtabsnavigationfinished.onWarmupCompleted.onWarmupCompleted(onextracallback);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(final trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback3 = (isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, onextracallback3, (isExceptionHandlerEnabled.IAuthTabCallback.onNavigationEvent) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, onextracallback3, (isExceptionHandlerEnabled.IAuthTabCallback.onNavigationEvent) obj2);
                int i5 = 95 / 0;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.IAuthTabCallback.onNavigationEvent.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback3 = (isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, onextracallback3, (isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, onextracallback3, (isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted) obj2);
                int i5 = 85 / 0;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 13;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished2 = this.f$0;
                isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback2 = (isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 != 0) {
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                    return (Unit) trackCustomTabsNavigationFinished.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 682230324, iOnExtraCallbackWithResult2, new Object[]{trackcustomtabsnavigationfinished2, onextracallback2, (isExceptionHandlerEnabled.IAuthTabCallback) obj2}, iOnExtraCallbackWithResult3, -682230322, iOnExtraCallbackWithResult);
                }
                int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
                Unit unit = (Unit) trackCustomTabsNavigationFinished.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 682230324, iOnExtraCallbackWithResult5, new Object[]{trackcustomtabsnavigationfinished2, onextracallback2, (isExceptionHandlerEnabled.IAuthTabCallback) obj2}, iOnExtraCallbackWithResult6, -682230322, iOnExtraCallbackWithResult4);
                int i5 = 0 / 0;
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback.onExtraCallback, (Object) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback.onExtraCallback, (Object) null, 2, (Object) null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback = (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) objArr[1];
        isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback.onExtraCallback, (Object) null, 2, (Object) null);
        int i4 = asInterface + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            trackcustomtabsnavigationfinished.onWarmupCompleted.onWarmupCompleted(iAuthTabCallback);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        trackcustomtabsnavigationfinished.onWarmupCompleted.onWarmupCompleted(iAuthTabCallback);
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback = (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) obj;
                isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallback onextracallback3 = (isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallback) obj2;
                if (i4 == 0) {
                    return trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, iAuthTabCallback, onextracallback3);
                }
                trackCustomTabsNavigationFinished.onExtraCallbackWithResult(onextracallback2, iAuthTabCallback, onextracallback3);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallback.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackCustomTabsNavigationFinished.onWarmupCompleted(onextracallback, (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) obj, (isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult) obj2);
                int i5 = IAuthTabCallback + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 121;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {this.f$0, (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) obj, (isExceptionHandlerEnabled.IAuthTabCallback) obj2};
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {this.f$0, (isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback) obj, (isExceptionHandlerEnabled.IAuthTabCallback) obj2};
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                Unit unit = (Unit) trackCustomTabsNavigationFinished.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 166288725, JsParamKeys.onExtraCallbackWithResult(), objArr2, JsParamKeys.onExtraCallbackWithResult(), -166288724, iOnExtraCallbackWithResult2);
                int i4 = onExtraCallback + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!(iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback)) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationfinished.onExtraCallback;
            Objects.toString(iAuthTabCallback);
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = trackcustomtabsnavigationfinished.onExtraCallback;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(final trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished2 = this.f$0;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 == 0) {
                    return trackCustomTabsNavigationFinished.onNavigationEvent(trackcustomtabsnavigationfinished2, onextracallback);
                }
                trackCustomTabsNavigationFinished.onNavigationEvent(trackcustomtabsnavigationfinished2, onextracallback);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 91;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackCustomTabsNavigationFinished.onExtraCallbackWithResult(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onExtraCallback + 33;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.PaySessionStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = trackCustomTabsNavigationFinished.onNavigationEvent(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = IAuthTabCallback + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isExceptionHandlerEnabled
    public isExceptionHandlerEnabled.onExtraCallbackWithResult onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isExceptionHandlerEnabled.onExtraCallbackWithResult onextracallbackwithresult = (isExceptionHandlerEnabled.onExtraCallbackWithResult) this.onNavigationEvent.onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    @Override // o.isExceptionHandlerEnabled
    public findSnapView.IAuthTabCallback<isExceptionHandlerEnabled.onExtraCallbackWithResult, isExceptionHandlerEnabled.IAuthTabCallback, Object> onWarmupCompleted(@NotNull isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onNavigationEvent.onExtraCallback(iAuthTabCallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        findSnapView.IAuthTabCallback<isExceptionHandlerEnabled.onExtraCallbackWithResult, isExceptionHandlerEnabled.IAuthTabCallback, Object> iAuthTabCallbackOnExtraCallback = this.onNavigationEvent.onExtraCallback(iAuthTabCallback);
        int i3 = asInterface + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iAuthTabCallbackOnExtraCallback;
    }

    public JsonReaderUnknownNumberParsing<isExceptionHandlerEnabled.onExtraCallbackWithResult> onExtraCallback(boolean z) {
        long j;
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onWarmupCompleted.IAuthTabCallbackDefault().access000();
        if (z) {
            j = 0;
        } else {
            int i2 = onExtraCallbackWithResult + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            j = 1;
        }
        JsonReaderUnknownNumberParsing<isExceptionHandlerEnabled.onExtraCallbackWithResult> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        int i4 = onExtraCallbackWithResult + 87;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderUnknownNumberParsingOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationfinished.onExtraCallback;
        Objects.toString(onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback2) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 166288725, iOnExtraCallbackWithResult2, new Object[]{trackcustomtabsnavigationfinished, iAuthTabCallback, iAuthTabCallback2}, iOnExtraCallbackWithResult3, -166288724, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(trackCustomTabsNavigationFinished trackcustomtabsnavigationfinished, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 682230324, iOnExtraCallbackWithResult2, new Object[]{trackcustomtabsnavigationfinished, onextracallback, iAuthTabCallback}, iOnExtraCallbackWithResult3, -682230322, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), -440177305, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult3, 440177305, iOnExtraCallbackWithResult);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback, isExceptionHandlerEnabled.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), 569472438, iOnExtraCallbackWithResult2, new Object[]{onextracallback, iAuthTabCallback, onextracallbackwithresult}, iOnExtraCallbackWithResult3, -569472435, iOnExtraCallbackWithResult);
    }
}
