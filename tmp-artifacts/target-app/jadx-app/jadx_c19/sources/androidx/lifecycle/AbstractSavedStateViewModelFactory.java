package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.NavigationBarKtExternalSyntheticLambda8;
import o.NavigationBarKtExternalSyntheticLambda9;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldKeyInputKtExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TextLinkScopeExternalSyntheticLambda8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.onWarmupCompleted {
    private Bundle IAuthTabCallback;
    private TextFieldKeyInputExternalSyntheticLambda9 onExtraCallbackWithResult;
    private NavigationBarKtExternalSyntheticLambda9 onWarmupCompleted;

    protected abstract <T extends ViewModel> T create(@NotNull String str, @NotNull Class<T> cls, @NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7);

    public AbstractSavedStateViewModelFactory() {
    }

    public AbstractSavedStateViewModelFactory(@NotNull NavigationBarKtExternalSyntheticLambda8 navigationBarKtExternalSyntheticLambda8, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(navigationBarKtExternalSyntheticLambda8, "");
        this.onWarmupCompleted = navigationBarKtExternalSyntheticLambda8.getSavedStateRegistry();
        this.onExtraCallbackWithResult = navigationBarKtExternalSyntheticLambda8.getLifecycle();
        this.IAuthTabCallback = bundle;
    }

    public <T extends ViewModel> T create(@NotNull Class<T> cls, @NotNull AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2, "");
        String str = (String) androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onWarmupCompleted(ViewModelProvider.onNavigationEvent.onNavigationEvent);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (this.onWarmupCompleted != null) {
            return (T) create(str, cls);
        }
        return (T) create(str, cls, TextLinkScopeExternalSyntheticLambda8.IAuthTabCallback(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2));
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        NavigationBarKtExternalSyntheticLambda9 navigationBarKtExternalSyntheticLambda9 = this.onWarmupCompleted;
        Intrinsics.checkNotNull(navigationBarKtExternalSyntheticLambda9);
        TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(textFieldKeyInputExternalSyntheticLambda9);
        SavedStateHandleController savedStateHandleControllerOnExtraCallbackWithResult = TextFieldKeyInputKtExternalSyntheticLambda0.onExtraCallbackWithResult(navigationBarKtExternalSyntheticLambda9, textFieldKeyInputExternalSyntheticLambda9, str, this.IAuthTabCallback);
        T t = (T) create(str, cls, savedStateHandleControllerOnExtraCallbackWithResult.onExtraCallback());
        t.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerOnExtraCallbackWithResult);
        return t;
    }

    public <T extends ViewModel> T create(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.onExtraCallbackWithResult == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return (T) create(canonicalName, cls);
    }

    public void onRequery(@NotNull ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "");
        NavigationBarKtExternalSyntheticLambda9 navigationBarKtExternalSyntheticLambda9 = this.onWarmupCompleted;
        if (navigationBarKtExternalSyntheticLambda9 != null) {
            Intrinsics.checkNotNull(navigationBarKtExternalSyntheticLambda9);
            TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(textFieldKeyInputExternalSyntheticLambda9);
            TextFieldKeyInputKtExternalSyntheticLambda0.onNavigationEvent(viewModel, navigationBarKtExternalSyntheticLambda9, textFieldKeyInputExternalSyntheticLambda9);
        }
    }
}
