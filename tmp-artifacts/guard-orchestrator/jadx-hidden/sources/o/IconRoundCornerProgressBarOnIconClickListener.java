package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface IconRoundCornerProgressBarOnIconClickListener {
    public static final onExtraCallback Companion = onExtraCallback.onExtraCallback;

    int onExtraCallback();

    IconRoundCornerProgressBarSavedState1 onExtraCallbackWithResult();

    boolean onNavigationEvent();

    public static final class onExtraCallback {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        static final /* synthetic */ onExtraCallback onExtraCallback = new onExtraCallback();

        static {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        }

        public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~(i7 | i4);
            int i9 = ~i4;
            int i10 = ~(i9 | i6);
            int i11 = ~((~i) | i4);
            int i12 = i10 | i11;
            int i13 = i11 | (~(i7 | i9));
            int i14 = i4 + i6 + i3 + ((-1232316077) * i2) + ((-263306238) * i5);
            int i15 = i14 * i14;
            int i16 = (((-69115011) * i4) - 1785593856) + (933837065 * i6) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i3) + (1319895040 * i2) + (1514668032 * i5) + (1334968320 * i15);
            int i17 = ((i4 * (-2046307327)) - 1888090795) + (i6 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i3 * (-2046307883)) + (i2 * 1526207759) + (i5 * (-1095616598)) + (i15 * 1719271424);
            return i16 + ((i17 * i17) * 2111700992) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x014b A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r9) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IconRoundCornerProgressBarOnIconClickListener.onExtraCallback.onNavigationEvent(java.lang.Object[]):java.lang.Object");
        }

        public static final class onNavigationEvent implements IconRoundCornerProgressBarOnIconClickListener {
            static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
            private final IconRoundCornerProgressBarSavedState1 IAuthTabCallback;
            private final int onNavigationEvent;
            private final boolean onWarmupCompleted;

            onNavigationEvent(int i, boolean z, IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1) {
                this.onNavigationEvent = i;
                this.onWarmupCompleted = z;
                this.IAuthTabCallback = iconRoundCornerProgressBarSavedState1;
            }

            @Override // o.IconRoundCornerProgressBarOnIconClickListener
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
                if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 6) & 1) == 0) {
                    throw null;
                }
                int i3 = this.onNavigationEvent;
                int i4 = onExtraCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
                int i5 = i4 & iOnWarmupCompleted2;
                if ((((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 8) & 1) != 0) {
                    int i6 = 49 / 0;
                }
                return i3;
            }

            @Override // o.IconRoundCornerProgressBarOnIconClickListener
            public boolean onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
                if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 9) & 1) != 0) {
                    boolean z = this.onWarmupCompleted;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
                    return z;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.IconRoundCornerProgressBarOnIconClickListener
            public IconRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
                int i = 2 % 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3276);
                IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = this.IAuthTabCallback;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
                return iconRoundCornerProgressBarSavedState1;
            }
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int iIntValue = ((Number) objArr[1]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = (IconRoundCornerProgressBarSavedState1) objArr[3];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(iconRoundCornerProgressBarSavedState1, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(iIntValue, zBooleanValue, iconRoundCornerProgressBarSavedState1);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
            return onnavigationevent;
        }

        public final IconRoundCornerProgressBarOnIconClickListener onWarmupCompleted(int i, boolean z, @NotNull IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1) {
            Object[] objArr = {this, Integer.valueOf(i), Boolean.valueOf(z), iconRoundCornerProgressBarSavedState1};
            return (IconRoundCornerProgressBarOnIconClickListener) onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -308607901, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 308607902);
        }

        public final int onExtraCallback(@NotNull Set<? extends IconRoundCornerProgressBarOnIconClickListener> set) {
            return ((Integer) onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this, set}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -656844699, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 656844699)).intValue();
        }
    }
}
