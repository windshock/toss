package o;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.ui.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.AppBarKtExternalSyntheticLambda26;
import o.TextFieldKtExternalSyntheticLambda5;
import o.setPositionProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda31 {
    public static final AppBarKtExternalSyntheticLambda31 onNavigationEvent = new AppBarKtExternalSyntheticLambda31();

    private AppBarKtExternalSyntheticLambda31() {
    }

    @JvmStatic
    public static final boolean onWarmupCompleted(@NotNull MenuItem menuItem, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        setPositionProvider.IAuthTabCallback iAuthTabCallbackOnExtraCallback = new setPositionProvider.IAuthTabCallback().onWarmupCompleted(true).onExtraCallback(true);
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = typographyKtExternalSyntheticLambda0.asInterface();
        Intrinsics.checkNotNull(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface);
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault = exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface.IAuthTabCallbackDefault();
        Intrinsics.checkNotNull(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault);
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault.onExtraCallbackWithResult(menuItem.getItemId()) instanceof TextFieldKtExternalSyntheticLambda5.onNavigationEvent) {
            iAuthTabCallbackOnExtraCallback.IAuthTabCallback(R.anim.nav_default_enter_anim).onExtraCallbackWithResult(R.anim.nav_default_exit_anim).onWarmupCompleted(R.anim.nav_default_pop_enter_anim).onNavigationEvent(R.anim.nav_default_pop_exit_anim);
        } else {
            iAuthTabCallbackOnExtraCallback.IAuthTabCallback(R.animator.nav_default_enter_anim).onExtraCallbackWithResult(R.animator.nav_default_exit_anim).onWarmupCompleted(R.animator.nav_default_pop_enter_anim).onNavigationEvent(R.animator.nav_default_pop_exit_anim);
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7.Companion.onNavigationEvent(typographyKtExternalSyntheticLambda0.asBinder()).asInterface(), false, true);
        }
        try {
            typographyKtExternalSyntheticLambda0.onWarmupCompleted(menuItem.getItemId(), (Bundle) null, iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult());
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 = typographyKtExternalSyntheticLambda0.asInterface();
            if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 != null) {
                if (onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2, menuItem.getItemId())) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onExtraCallback(new AppBarColumnKtExternalSyntheticLambda1(typographyKtExternalSyntheticLambda0.onNavigationEvent()), menuItem.getItemId());
            Objects.toString(typographyKtExternalSyntheticLambda0.asInterface());
            return false;
        }
    }

    @JvmStatic
    public static final boolean onNavigationEvent(@NotNull MenuItem menuItem, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        if (z) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        setPositionProvider.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = new setPositionProvider.IAuthTabCallback().onWarmupCompleted(true);
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = typographyKtExternalSyntheticLambda0.asInterface();
        Intrinsics.checkNotNull(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface);
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault = exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface.IAuthTabCallbackDefault();
        Intrinsics.checkNotNull(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault);
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7IAuthTabCallbackDefault.onExtraCallbackWithResult(menuItem.getItemId()) instanceof TextFieldKtExternalSyntheticLambda5.onNavigationEvent) {
            iAuthTabCallbackOnWarmupCompleted.IAuthTabCallback(R.anim.nav_default_enter_anim).onExtraCallbackWithResult(R.anim.nav_default_exit_anim).onWarmupCompleted(R.anim.nav_default_pop_enter_anim).onNavigationEvent(R.anim.nav_default_pop_exit_anim);
        } else {
            iAuthTabCallbackOnWarmupCompleted.IAuthTabCallback(R.animator.nav_default_enter_anim).onExtraCallbackWithResult(R.animator.nav_default_exit_anim).onWarmupCompleted(R.animator.nav_default_pop_enter_anim).onNavigationEvent(R.animator.nav_default_pop_exit_anim);
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            setPositionProvider.IAuthTabCallback.onNavigationEvent(iAuthTabCallbackOnWarmupCompleted, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7.Companion.onNavigationEvent(typographyKtExternalSyntheticLambda0.asBinder()).asInterface(), false, false, 4, (Object) null);
        }
        try {
            typographyKtExternalSyntheticLambda0.onWarmupCompleted(menuItem.getItemId(), (Bundle) null, iAuthTabCallbackOnWarmupCompleted.onExtraCallbackWithResult());
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 = typographyKtExternalSyntheticLambda0.asInterface();
            if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 != null) {
                if (onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2, menuItem.getItemId())) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onExtraCallback(new AppBarColumnKtExternalSyntheticLambda1(typographyKtExternalSyntheticLambda0.onNavigationEvent()), menuItem.getItemId());
            Objects.toString(typographyKtExternalSyntheticLambda0.asInterface());
            return false;
        }
    }

    @JvmStatic
    public static final boolean onWarmupCompleted(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(appBarKtExternalSyntheticLambda26, "");
        ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback = appBarKtExternalSyntheticLambda26.onExtraCallback();
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = typographyKtExternalSyntheticLambda0.asInterface();
        if (receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback != null && exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface != null && appBarKtExternalSyntheticLambda26.IAuthTabCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface)) {
            receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback.onExtraCallback();
            return true;
        }
        if (typographyKtExternalSyntheticLambda0.access100()) {
            return true;
        }
        AppBarKtExternalSyntheticLambda26.onExtraCallbackWithResult onExtraCallbackWithResult = appBarKtExternalSyntheticLambda26.onExtraCallbackWithResult();
        if (onExtraCallbackWithResult != null) {
            return onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return false;
    }

    @JvmStatic
    public static final void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(appBarKtExternalSyntheticLambda26, "");
        typographyKtExternalSyntheticLambda0.onExtraCallback(new AppBarKtExternalSyntheticLambda23(appCompatActivity, appBarKtExternalSyntheticLambda26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26, View view) {
        onWarmupCompleted(typographyKtExternalSyntheticLambda0, appBarKtExternalSyntheticLambda26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26, View view) {
        onWarmupCompleted(typographyKtExternalSyntheticLambda0, appBarKtExternalSyntheticLambda26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, NavigationView navigationView, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        boolean zOnWarmupCompleted = onWarmupCompleted(menuItem, typographyKtExternalSyntheticLambda0);
        if (zOnWarmupCompleted) {
            ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 parent = navigationView.getParent();
            if (parent instanceof ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2) {
                parent.onWarmupCompleted();
                return zOnWarmupCompleted;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorOnWarmupCompleted = onWarmupCompleted(navigationView);
            if (bottomSheetBehaviorOnWarmupCompleted != null) {
                bottomSheetBehaviorOnWarmupCompleted.setState(5);
            }
        }
        return zOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, boolean z, NavigationView navigationView, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        boolean zOnNavigationEvent = onNavigationEvent(menuItem, typographyKtExternalSyntheticLambda0, z);
        if (zOnNavigationEvent) {
            ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 parent = navigationView.getParent();
            if (parent instanceof ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2) {
                parent.onWarmupCompleted();
                return zOnNavigationEvent;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorOnWarmupCompleted = onWarmupCompleted(navigationView);
            if (bottomSheetBehaviorOnWarmupCompleted != null) {
                bottomSheetBehaviorOnWarmupCompleted.setState(5);
            }
        }
        return zOnNavigationEvent;
    }

    @JvmStatic
    public static final BottomSheetBehavior<?> onWarmupCompleted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        CoordinatorLayout.onExtraCallbackWithResult layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.onExtraCallbackWithResult)) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                return onWarmupCompleted((View) parent);
            }
            return null;
        }
        BottomSheetBehavior<?> bottomSheetBehaviorOnWarmupCompleted = layoutParams.onWarmupCompleted();
        if (bottomSheetBehaviorOnWarmupCompleted instanceof BottomSheetBehavior) {
            return bottomSheetBehaviorOnWarmupCompleted;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return onWarmupCompleted(menuItem, typographyKtExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, boolean z, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return onNavigationEvent(menuItem, typographyKtExternalSyntheticLambda0, z);
    }

    @JvmStatic
    public static final boolean onExtraCallback(@NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, int i2) {
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        Iterator itIAuthTabCallback = ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.IAuthTabCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            if (((ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) itIAuthTabCallback.next()).asInterface() == i2) {
                return true;
            }
        }
        return false;
    }
}
