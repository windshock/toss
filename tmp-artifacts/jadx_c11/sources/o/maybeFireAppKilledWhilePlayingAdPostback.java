package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.getMediationProvider;
import o.maybeFireAppKilledWhilePlayingAdPostback;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeFireAppKilledWhilePlayingAdPostback implements getMediationProvider {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final AppSetIdAndScope1 IAuthTabCallback;
    private final zzad onExtraCallback;
    private final access27100<getMediationProvider.IAuthTabCallback> onExtraCallbackWithResult;
    private final SessionState onNavigationEvent;
    private final findSnapView<getMediationProvider.IAuthTabCallback, getMediationProvider.onNavigationEvent, Object> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(maybefireappkilledwhileplayingadpostback, onextracallback);
        }
        onWarmupCompleted(maybefireappkilledwhileplayingadpostback, onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(onextracallback, onnavigationevent, onextracallback2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, onnavigationevent, onextracallback2);
        int i3 = asBinder + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return onNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(maybefireappkilledwhileplayingadpostback, onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(maybefireappkilledwhileplayingadpostback, onextracallback);
        int i3 = IAuthTabCallbackStub + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.onExtraCallback onextracallback, getMediationProvider.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(maybefireappkilledwhileplayingadpostback, onextracallback, onnavigationevent);
        int i4 = IAuthTabCallbackStub + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(-2028255740, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 2028255742, iIAuthTabCallback, new Object[]{maybefireappkilledwhileplayingadpostback, onnavigationevent, onnavigationevent2}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i3) | i));
        int i11 = (~(i4 | i3)) | (~(i7 | i4)) | (~i8);
        int i12 = i + i3 + i5 + ((-953487067) * i2) + ((-1992133889) * i6);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i5) + ((-1703411712) * i2) + (1961361408 * i6) + (907935744 * i13);
        int i15 = ((i * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i5 * 272662391) + (i2 * 2077717299) + (i6 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i17 = 2 % 2;
        int i18 = asBinder + 29;
        IAuthTabCallbackStub = i18 % 128;
        int i19 = i18 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i20 = IAuthTabCallbackStub + 59;
        asBinder = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback = (maybeFireAppKilledWhilePlayingAdPostback) objArr[0];
        getMediationProvider.IAuthTabCallback iAuthTabCallback = (getMediationProvider.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(-910443474, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 910443478, iIAuthTabCallback, new Object[]{maybefireappkilledwhileplayingadpostback, iAuthTabCallback}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = IAuthTabCallbackStub + 33;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(maybefireappkilledwhileplayingadpostback, onextracallback);
        int i4 = IAuthTabCallbackStub + 99;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(maybefireappkilledwhileplayingadpostback, onextracallbackwithresult);
        }
        onNavigationEvent(maybefireappkilledwhileplayingadpostback, onextracallbackwithresult);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(onextracallback, onnavigationevent, iAuthTabCallback);
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback c0017IAuthTabCallback, getMediationProvider.onNavigationEvent.C0018onNavigationEvent c0018onNavigationEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(maybefireappkilledwhileplayingadpostback, onextracallback, c0017IAuthTabCallback, c0018onNavigationEvent);
        int i4 = asBinder + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback c0017IAuthTabCallback, getMediationProvider.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(maybefireappkilledwhileplayingadpostback, c0017IAuthTabCallback, onnavigationevent);
        int i4 = IAuthTabCallbackStub + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(maybefireappkilledwhileplayingadpostback, iAuthTabCallback);
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onExtraCallback onextracallback2, getMediationProvider.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {onextracallback, onextracallback2, onextracallbackwithresult};
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(-315950006, iIAuthTabCallback3, 315950007, iIAuthTabCallback, objArr, iIAuthTabCallback2, iIAuthTabCallback4);
        int i4 = IAuthTabCallbackStub + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    @Inject
    public maybeFireAppKilledWhilePlayingAdPostback(@NotNull SessionState sessionState, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onNavigationEvent = sessionState;
        this.onExtraCallback = zzadVar;
        this.IAuthTabCallback = ea10.onExtraCallbackWithResult(maybeFireAppKilledWhilePlayingAdPostback.class.getSimpleName());
        this.onWarmupCompleted = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback = this.f$0;
                findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) obj;
                if (i3 != 0) {
                    return maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(maybefireappkilledwhileplayingadpostback, onextracallbackwithresult);
                }
                maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(maybefireappkilledwhileplayingadpostback, onextracallbackwithresult);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        access27100<getMediationProvider.IAuthTabCallback> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onWarmupCompleted());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onExtraCallbackWithResult = access27100VarIAuthTabCallback;
        if (zzadVar.onActivityLayout()) {
            JsonReaderUnknownNumberParsing<getMediationProvider.IAuthTabCallback> jsonReaderUnknownNumberParsingOnWarmupCompleted = onWarmupCompleted(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda12
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object[] objArr = {this.f$0, (getMediationProvider.IAuthTabCallback) obj};
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {this.f$0, (getMediationProvider.IAuthTabCallback) obj};
                    Unit unit = (Unit) maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(1732305099, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1732305099, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                    int i3 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 74 / 0;
                    }
                    return unit;
                }
            };
            jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = {function1, obj};
                    if (i3 != 0) {
                        maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(-2002859125, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 2002859128, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                    } else {
                        maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(-2002859125, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 2002859128, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            });
            int i = asBinder + 107;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = asBinder + 3;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback c0017IAuthTabCallback, getMediationProvider.onNavigationEvent.C0018onNavigationEvent c0018onNavigationEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c0017IAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(c0018onNavigationEvent, "");
        if (maybefireappkilledwhileplayingadpostback.onNavigationEvent.onTransact()) {
            int i2 = asBinder + 37;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0017IAuthTabCallback, getMediationProvider.IAuthTabCallback.onNavigationEvent.IAuthTabCallback, (Object) null, 2, (Object) null);
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0017IAuthTabCallback, getMediationProvider.IAuthTabCallback.onExtraCallback.IAuthTabCallback, (Object) null, 2, (Object) null);
        int i4 = asBinder + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback c0017IAuthTabCallback, getMediationProvider.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0017IAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        maybefireappkilledwhileplayingadpostback.onExtraCallbackWithResult.onWarmupCompleted(c0017IAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 91;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(final maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getMediationProvider.onNavigationEvent.C0018onNavigationEvent.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 65;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(this.f$0, onextracallback, (getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback) obj, (getMediationProvider.onNavigationEvent.C0018onNavigationEvent) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(this.f$0, onextracallback, (getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback) obj, (getMediationProvider.onNavigationEvent.C0018onNavigationEvent) obj2);
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 75;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = maybeFireAppKilledWhilePlayingAdPostback.onNavigationEvent(this.f$0, (getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback) obj, (getMediationProvider.onNavigationEvent) obj2);
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 98 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent;
        Object obj;
        int i;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getMediationProvider.IAuthTabCallback.onExtraCallback onextracallback2 = (getMediationProvider.IAuthTabCallback.onExtraCallback) objArr[1];
        getMediationProvider.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (getMediationProvider.onNavigationEvent.onExtraCallbackWithResult) objArr[2];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onnavigationevent = getMediationProvider.IAuthTabCallback.onNavigationEvent.IAuthTabCallback;
            obj = null;
            i = 5;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onnavigationevent = getMediationProvider.IAuthTabCallback.onNavigationEvent.IAuthTabCallback;
            obj = null;
            i = 2;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, onnavigationevent, obj, i, (Object) null);
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.onExtraCallback onextracallback, getMediationProvider.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        maybefireappkilledwhileplayingadpostback.onExtraCallbackWithResult.onWarmupCompleted(onextracallback);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(final maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getMediationProvider.onNavigationEvent.onExtraCallbackWithResult.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = maybeFireAppKilledWhilePlayingAdPostback.onWarmupCompleted(onextracallback, (getMediationProvider.IAuthTabCallback.onExtraCallback) obj, (getMediationProvider.onNavigationEvent.onExtraCallbackWithResult) obj2);
                int i5 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 27;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallback(this.f$0, (getMediationProvider.IAuthTabCallback.onExtraCallback) obj, (getMediationProvider.onNavigationEvent) obj2);
                int i5 = onExtraCallback + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getMediationProvider.IAuthTabCallback.onExtraCallback.IAuthTabCallback, (Object) null, 2, (Object) null);
        int i4 = asBinder + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback.onExtraCallback, (Object) null, 2, (Object) null);
        int i4 = asBinder + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback = (maybeFireAppKilledWhilePlayingAdPostback) objArr[0];
        getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent = (getMediationProvider.IAuthTabCallback.onNavigationEvent) objArr[1];
        getMediationProvider.onNavigationEvent onnavigationevent2 = (getMediationProvider.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(onnavigationevent2, "");
            maybefireappkilledwhileplayingadpostback.onExtraCallbackWithResult.onWarmupCompleted(onnavigationevent);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(onnavigationevent2, "");
        maybefireappkilledwhileplayingadpostback.onExtraCallbackWithResult.onWarmupCompleted(onnavigationevent);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 45;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(final maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 75;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent = (getMediationProvider.IAuthTabCallback.onNavigationEvent) obj;
                if (i4 == 0) {
                    return maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(onextracallback2, onnavigationevent, (getMediationProvider.onNavigationEvent.IAuthTabCallback) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(onextracallback2, onnavigationevent, (getMediationProvider.onNavigationEvent.IAuthTabCallback) obj2);
                int i5 = 11 / 0;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getMediationProvider.onNavigationEvent.IAuthTabCallback.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getMediationProvider.onNavigationEvent.onExtraCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = maybeFireAppKilledWhilePlayingAdPostback.IAuthTabCallback(onextracallback, (getMediationProvider.IAuthTabCallback.onNavigationEvent) obj, (getMediationProvider.onNavigationEvent.onExtraCallback) obj2);
                int i5 = onExtraCallback + 105;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    maybeFireAppKilledWhilePlayingAdPostback.onExtraCallback(this.f$0, (getMediationProvider.IAuthTabCallback.onNavigationEvent) obj, (getMediationProvider.onNavigationEvent) obj2);
                    throw null;
                }
                Unit unitOnExtraCallback = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallback(this.f$0, (getMediationProvider.IAuthTabCallback.onNavigationEvent) obj, (getMediationProvider.onNavigationEvent) obj2);
                int i4 = onNavigationEvent + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!(iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback)) {
            AppSetIdAndScope1 appSetIdAndScope1 = maybefireappkilledwhileplayingadpostback.IAuthTabCallback;
            Objects.toString(iAuthTabCallback);
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = maybefireappkilledwhileplayingadpostback.IAuthTabCallback;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1374191703);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, TextUtils.getOffsetBefore("", 0) + 24779, 1621655239, false, "onExtraCallback", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1885931576);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 14 - TextUtils.getTrimmedLength(""), 24779 - TextUtils.getTrimmedLength(""), -1093269160, false, "onWarmupCompleted", new Class[0]);
                }
                int i3 = 1 / 0;
                if (((Boolean) ((Method) objOnExtraCallback2).invoke(obj2, null)).booleanValue()) {
                    int i4 = asBinder + 113;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    obj = getMediationProvider.IAuthTabCallback.onExtraCallback.IAuthTabCallback;
                    int i6 = IAuthTabCallbackStub + 111;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    obj = getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback.onExtraCallback;
                }
            } else {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1374191703);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24779 - Color.alpha(0), 1621655239, false, "onExtraCallback", (Class[]) null);
                }
                Object obj3 = ((Field) objOnExtraCallback3).get(null);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1885931576);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 14 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + 24779, -1093269160, false, "onWarmupCompleted", new Class[0]);
                }
                if (((Boolean) ((Method) objOnExtraCallback4).invoke(obj3, null)).booleanValue()) {
                }
            }
            onextracallbackwithresult.onNavigationEvent(obj);
            Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda7
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 75;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallbackWithResult = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallbackWithResult(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj4);
                    int i11 = onWarmupCompleted + 83;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
            onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getMediationProvider.IAuthTabCallback.C0017IAuthTabCallback.class), function1);
            onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getMediationProvider.IAuthTabCallback.onExtraCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 43;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback2 = this.f$0;
                    findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj4;
                    if (i10 == 0) {
                        return maybeFireAppKilledWhilePlayingAdPostback.IAuthTabCallback(maybefireappkilledwhileplayingadpostback2, onextracallback);
                    }
                    Unit unitIAuthTabCallback = maybeFireAppKilledWhilePlayingAdPostback.IAuthTabCallback(maybefireappkilledwhileplayingadpostback2, onextracallback);
                    int i11 = 15 / 0;
                    return unitIAuthTabCallback;
                }
            });
            onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getMediationProvider.IAuthTabCallback.onNavigationEvent.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 123;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallback = maybeFireAppKilledWhilePlayingAdPostback.onExtraCallback(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj4);
                    int i11 = onExtraCallback + 113;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallback;
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.AppLockStateImpl$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback2 = this.f$0;
                    findSnapView.IAuthTabCallback iAuthTabCallback = (findSnapView.IAuthTabCallback) obj4;
                    if (i10 != 0) {
                        return maybeFireAppKilledWhilePlayingAdPostback.onWarmupCompleted(maybefireappkilledwhileplayingadpostback2, iAuthTabCallback);
                    }
                    maybeFireAppKilledWhilePlayingAdPostback.onWarmupCompleted(maybefireappkilledwhileplayingadpostback2, iAuthTabCallback);
                    throw null;
                }
            });
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.getMediationProvider
    public getMediationProvider.IAuthTabCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getMediationProvider.IAuthTabCallback iAuthTabCallback = (getMediationProvider.IAuthTabCallback) this.onWarmupCompleted.onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallback;
    }

    @Override // o.getMediationProvider
    public findSnapView.IAuthTabCallback<getMediationProvider.IAuthTabCallback, getMediationProvider.onNavigationEvent, Object> onExtraCallback(@NotNull getMediationProvider.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        findSnapView.IAuthTabCallback<getMediationProvider.IAuthTabCallback, getMediationProvider.onNavigationEvent, Object> iAuthTabCallbackOnExtraCallback = this.onWarmupCompleted.onExtraCallback(onnavigationevent);
        int i4 = IAuthTabCallbackStub + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackOnExtraCallback;
    }

    @Override // o.getMediationProvider
    public JsonReaderUnknownNumberParsing<getMediationProvider.IAuthTabCallback> onWarmupCompleted(boolean z) {
        long j;
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onExtraCallbackWithResult.IAuthTabCallbackDefault().access000();
        if (z) {
            int i2 = IAuthTabCallbackStub + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        } else {
            j = 1;
        }
        JsonReaderUnknownNumberParsing<getMediationProvider.IAuthTabCallback> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        int i4 = asBinder + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderUnknownNumberParsingOnNavigationEvent;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 29;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback = (maybeFireAppKilledWhilePlayingAdPostback) objArr[0];
        getMediationProvider.IAuthTabCallback iAuthTabCallback = (getMediationProvider.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = maybefireappkilledwhileplayingadpostback.IAuthTabCallback;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallbackWithResult(-2002859125, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 2002859128, iIAuthTabCallback, new Object[]{function1, obj}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(1732305099, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1732305099, iIAuthTabCallback, new Object[]{maybefireappkilledwhileplayingadpostback, iAuthTabCallback}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(-910443474, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 910443478, iIAuthTabCallback, new Object[]{maybefireappkilledwhileplayingadpostback, iAuthTabCallback}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getMediationProvider.IAuthTabCallback.onExtraCallback onextracallback2, getMediationProvider.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(-315950006, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 315950007, iIAuthTabCallback, new Object[]{onextracallback, onextracallback2, onextracallbackwithresult}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(maybeFireAppKilledWhilePlayingAdPostback maybefireappkilledwhileplayingadpostback, getMediationProvider.IAuthTabCallback.onNavigationEvent onnavigationevent, getMediationProvider.onNavigationEvent onnavigationevent2) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(-2028255740, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 2028255742, iIAuthTabCallback, new Object[]{maybefireappkilledwhileplayingadpostback, onnavigationevent, onnavigationevent2}, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }
}
