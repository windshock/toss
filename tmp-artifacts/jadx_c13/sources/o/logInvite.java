package o;

import android.content.res.Resources;
import android.view.View;
import com.jakewharton.rxbinding3.view.RxView;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.logInvite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logInvite {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(view);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, view);
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i3 | i2);
        int i8 = i5 | i7;
        int i9 = (~(i2 | (~i5))) | i3;
        int i10 = i3 + i5 + i4 + ((-1932811043) * i6) + (1521317780 * i);
        int i11 = i10 * i10;
        int i12 = ((i3 * (-919556932)) - 154402816) + ((-919556932) * i5) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i4) + ((-2098724864) * i6) + ((-1398800384) * i) + ((-1444151296) * i11);
        int i13 = (i3 * 1794637580) + 2133191799 + (i5 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i4 * 1794637741) + (i6 * (-1844343719)) + (i * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(view);
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -843403054, iOnWarmupCompleted2, 843403056, new Object[]{view}, iOnWarmupCompleted3);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1618183803, iOnWarmupCompleted2, -1618183800, new Object[]{function1, view}, iOnWarmupCompleted3);
            int i3 = 90 / 0;
        } else {
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted5 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted6 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted4, 1618183803, iOnWarmupCompleted5, -1618183800, new Object[]{function1, view}, iOnWarmupCompleted6);
        }
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1252695825, iOnWarmupCompleted2, -1252695825, new Object[]{function1, view}, iOnWarmupCompleted3);
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(View.OnClickListener onClickListener, View view, Unit unit) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(onClickListener, view, unit);
        }
        onExtraCallbackWithResult(onClickListener, view, unit);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(final View view, long j, final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        getByteBuffer getbytebufferOnTransact = RxView.onNavigationEvent(view).onTransact(j, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 81;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = logInvite.onWarmupCompleted(onClickListener, view, (Unit) obj);
                int i5 = IAuthTabCallback + 13;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        };
        getbytebufferOnTransact.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 81;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    logInvite.onNavigationEvent(function1, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                logInvite.onNavigationEvent(function1, obj);
                int i4 = onNavigationEvent + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
            }
        });
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(View.OnClickListener onClickListener, View view, Unit unit) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onClickListener.onClick(view);
        Unit unit2 = Unit.INSTANCE;
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, int i, long j, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i2, Object obj) {
        long j2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 7;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 59;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            if (i7 % 2 == 0) {
                int i9 = 73 / 0;
            }
            int i10 = i8 + 79;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            j2 = 1500;
        } else {
            j2 = j;
        }
        TdsButtonV1View.asInterface asinterface2 = (i2 & 4) != 0 ? null : asinterface;
        if ((i2 & 8) != 0) {
            int i12 = onExtraCallback + 107;
            onWarmupCompleted = i12 % 128;
            z2 = i12 % 2 != 0;
        } else {
            z2 = z;
        }
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1134278201, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1134278205, new Object[]{tdsBottomCtaV1View, Integer.valueOf(i), Long.valueOf(j2), asinterface2, Boolean.valueOf(z2), function1}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Resources.NotFoundException {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        TdsButtonV1View.asInterface asinterface = (TdsButtonV1View.asInterface) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Function1 function1 = (Function1) objArr[5];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
            Intrinsics.checkNotNullParameter(function1, "");
            String string = tdsBottomCtaV1View.getResources().getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            onWarmupCompleted(tdsBottomCtaV1View, string, jLongValue, asinterface, zBooleanValue, (Function1<? super View, Unit>) function1);
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
            Intrinsics.checkNotNullParameter(function1, "");
            String string2 = tdsBottomCtaV1View.getResources().getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            onWarmupCompleted(tdsBottomCtaV1View, string2, jLongValue, asinterface, zBooleanValue, (Function1<? super View, Unit>) function1);
        }
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, long j, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i, Object obj) {
        TdsButtonV1View.asInterface asinterface2;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i4 % 128;
        long j2 = (i4 % 2 != 0 ? (i & 2) == 0 : (i & 3) == 0) ? j : 1500L;
        if ((i & 4) != 0) {
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            asinterface2 = null;
        } else {
            asinterface2 = asinterface;
        }
        if ((i & 8) != 0) {
            int i7 = i3 + 9;
            onExtraCallback = i7 % 128;
            z2 = i7 % 2 == 0;
        } else {
            z2 = z;
        }
        onWarmupCompleted(tdsBottomCtaV1View, charSequence, j2, asinterface2, z2, (Function1<? super View, Unit>) function1);
    }

    private static final Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final void onWarmupCompleted(@NotNull TdsBottomCtaV1View tdsBottomCtaV1View, @NotNull CharSequence charSequence, long j, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        tdsBottomCtaV1View.setCta(charSequence, new Function1() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = logInvite.IAuthTabCallback((View) obj);
                int i5 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 45 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, asinterface, z);
        onExtraCallbackWithResult((View) tdsBottomCtaV1View.asInterface(), j, new View.OnClickListener() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                logInvite.onNavigationEvent(function1, view);
                int i5 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, int i, long j, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i2, Object obj) throws Resources.NotFoundException {
        boolean z2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 77;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        long j2 = (i4 % 2 == 0 ? (i2 & 2) == 0 : (i2 & 5) == 0) ? j : 1500L;
        TdsButtonV1View.asInterface asinterface2 = (i2 & 4) != 0 ? null : asinterface;
        if ((i2 & 8) != 0) {
            int i6 = i5 + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        onExtraCallbackWithResult(tdsBottomCtaV1View, i, j2, asinterface2, z2, function1);
    }

    public static final void onExtraCallbackWithResult(@NotNull TdsBottomCtaV1View tdsBottomCtaV1View, int i, long j, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @NotNull Function1<? super View, Unit> function1) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
            Intrinsics.checkNotNullParameter(function1, "");
            String string = tdsBottomCtaV1View.getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            IAuthTabCallback(tdsBottomCtaV1View, string, j, asinterface, z, function1);
            int i4 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
            Intrinsics.checkNotNullParameter(function1, "");
            String string2 = tdsBottomCtaV1View.getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            IAuthTabCallback(tdsBottomCtaV1View, string2, j, asinterface, z, function1);
        }
        int i5 = onExtraCallback + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, long j, TdsButtonV1View.asInterface asinterface, boolean z, Function1 function1, int i, Object obj) {
        long j2;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) == 0 : (i & 4) == 0) {
            j2 = j;
        } else {
            int i5 = i3 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            j2 = 1500;
        }
        TdsButtonV1View.asInterface asinterface2 = (i & 4) != 0 ? null : asinterface;
        if ((i & 8) != 0) {
            int i6 = onExtraCallback + 93;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        IAuthTabCallback(tdsBottomCtaV1View, charSequence, j2, asinterface2, z2, function1);
    }

    public static final void IAuthTabCallback(@NotNull TdsBottomCtaV1View tdsBottomCtaV1View, @NotNull CharSequence charSequence, long j, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        tdsBottomCtaV1View.setSecondary(charSequence, new View.OnClickListener() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }, asinterface, z);
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult((View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), j, new View.OnClickListener() { // from class: im.toss.uikit.extensions.TdsBottomCtaV1ViewsKt$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, view};
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                if (i4 != 0) {
                    logInvite.onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1451185944, iOnWarmupCompleted2, 1451185945, objArr, iOnWarmupCompleted3);
                } else {
                    logInvite.onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1451185944, iOnWarmupCompleted2, 1451185945, objArr, iOnWarmupCompleted3);
                    int i5 = 21 / 0;
                }
            }
        });
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = onExtraCallback + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return unit2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, View view) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1451185944, iOnWarmupCompleted2, 1451185945, new Object[]{function1, view}, iOnWarmupCompleted3);
    }

    public static final void onWarmupCompleted(@NotNull TdsBottomCtaV1View tdsBottomCtaV1View, int i, long j, @Nullable TdsButtonV1View.asInterface asinterface, boolean z, @NotNull Function1<? super View, Unit> function1) {
        Object[] objArr = {tdsBottomCtaV1View, Integer.valueOf(i), Long.valueOf(j), asinterface, Boolean.valueOf(z), function1};
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1134278201, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1134278205, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, View view) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1252695825, iOnWarmupCompleted2, -1252695825, new Object[]{function1, view}, iOnWarmupCompleted3);
    }

    private static final void asInterface(Function1 function1, View view) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1618183803, iOnWarmupCompleted2, -1618183800, new Object[]{function1, view}, iOnWarmupCompleted3);
    }

    private static final Unit onTransact(View view) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onExtraCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -843403054, iOnWarmupCompleted2, 843403056, new Object[]{view}, iOnWarmupCompleted3);
    }
}
