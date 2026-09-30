package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FontFamilyResolverImplExternalSyntheticLambda0 extends getTargetWidget<SaversKtExternalSyntheticLambda26, Resource<?>> implements FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 {
    private FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult onWarmupCompleted;

    @Override // o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0
    public /* synthetic */ Resource IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        return (Resource) super.onNavigationEvent((FontFamilyResolverImplExternalSyntheticLambda0) saversKtExternalSyntheticLambda26);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0
    public /* synthetic */ Resource IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @Nullable Resource resource) {
        return (Resource) super.onNavigationEvent(saversKtExternalSyntheticLambda26, resource);
    }

    public FontFamilyResolverImplExternalSyntheticLambda0(long j) {
        super(j);
    }

    @Override // o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0
    public void onNavigationEvent(@NonNull FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted = onextracallbackwithresult;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTargetWidget
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @Nullable Resource<?> resource) {
        FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        if (onextracallbackwithresult == null || resource == null) {
            return;
        }
        onextracallbackwithresult.onNavigationEvent(resource);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTargetWidget
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int onWarmupCompleted(@Nullable Resource<?> resource) {
        if (resource == null) {
            return super.onWarmupCompleted(null);
        }
        return resource.onExtraCallback();
    }

    @Override // o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0
    public void onExtraCallback(int i2) {
        if (i2 >= 40) {
            onWarmupCompleted();
        } else if (i2 >= 20 || i2 == 15) {
            onNavigationEvent(onNavigationEvent() / 2);
        }
    }
}
