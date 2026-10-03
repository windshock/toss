package viva.republica.toss.main.more.haptic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import im.toss.base.BaseActivity;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CERT_GetSignatureAlgorithm;
import o.DERTaggedObject;
import o.IPostMessageServiceStubProxy;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableImageViewPreallocationAndroid;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.haptic.HapticShowcaseActivity$;

@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HapticShowcaseActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallbackStub = 8;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.main.more.haptic.HapticShowcaseActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return HapticShowcaseActivity.onWarmupCompleted(this.f$0);
        }
    });

    public long getScreenId() {
        return -1L;
    }

    public static final class onExtraCallback implements Function0<CERT_GetSignatureAlgorithm> {
        final /* synthetic */ Activity onExtraCallback;

        public onExtraCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetSignatureAlgorithm invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetSignatureAlgorithm.onExtraCallbackWithResult(layoutInflater);
        }
    }

    private final CERT_GetSignatureAlgorithm IAuthTabCallback() {
        return (CERT_GetSignatureAlgorithm) this.asBinder.getValue();
    }

    private final List<String> ICustomTabsServiceStub() {
        return (List) this.onTransact.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List onWarmupCompleted(HapticShowcaseActivity hapticShowcaseActivity) {
        return CollectionsKt.listOf(new String[]{hapticShowcaseActivity.getString(R.string.app_main_more_haptic___03c102d3b1), hapticShowcaseActivity.getString(R.string.app_main_more_haptic___7f1d8c413d)});
    }

    private final HapticPresetFragment setEngagementSignalsCallback() {
        try {
            HapticPresetFragment hapticPresetFragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_PRESET");
            HapticPresetFragment hapticPresetFragment = hapticPresetFragmentFindFragmentByTag instanceof HapticPresetFragment ? hapticPresetFragmentFindFragmentByTag : null;
            return hapticPresetFragment == null ? new HapticPresetFragment() : hapticPresetFragment;
        } catch (Exception unused) {
            return new HapticPresetFragment();
        }
    }

    private final HapticBasicFragment onNavigationEvent() {
        try {
            HapticBasicFragment hapticBasicFragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_BASIC");
            HapticBasicFragment hapticBasicFragment = hapticBasicFragmentFindFragmentByTag instanceof HapticBasicFragment ? hapticBasicFragmentFindFragmentByTag : null;
            return hapticBasicFragment == null ? new HapticBasicFragment() : hapticBasicFragment;
        } catch (Exception unused) {
            return new HapticBasicFragment();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        setSupportActionBar(IAuthTabCallback().onWarmupCompleted);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onExtraCallbackWithResult("Haptic");
            supportActionBar.onNavigationEvent(true);
        }
        ConstraintLayout root = IAuthTabCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, IAuthTabCallback().onExtraCallbackWithResult, (View) null, (View) null, false, 14, (Object) null);
        validateRelationship();
    }

    private final void validateRelationship() {
        CERT_GetSignatureAlgorithm cERT_GetSignatureAlgorithmIAuthTabCallback = IAuthTabCallback();
        TdsTabV1View tdsTabV1View = cERT_GetSignatureAlgorithmIAuthTabCallback.onExtraCallback;
        Iterator<T> it = ICustomTabsServiceStub().iterator();
        while (it.hasNext()) {
            tdsTabV1View.onWarmupCompleted(tdsTabV1View.onNavigationEvent((String) it.next()));
        }
        List<String> listICustomTabsServiceStub = ICustomTabsServiceStub();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listICustomTabsServiceStub, 10));
        int i = 0;
        for (Object obj : listICustomTabsServiceStub) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new IAuthTabCallback((String) obj, new HapticShowcaseActivity$.ExternalSyntheticLambda1(i, this)));
            i++;
        }
        ViewPager2 viewPager2 = cERT_GetSignatureAlgorithmIAuthTabCallback.IAuthTabCallback;
        viewPager2.setAdapter(new onNavigationEvent(this, arrayList));
        viewPager2.setUserInputEnabled(true);
        viewPager2.setCurrentItem(0, false);
        TdsTabV1View tdsTabV1View2 = cERT_GetSignatureAlgorithmIAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTabV1View2, "");
        ViewPager2 viewPager22 = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(viewPager22, "");
        TdsTabV1View.setupWithViewPager2$default(tdsTabV1View2, viewPager22, false, false, new HapticShowcaseActivity$.ExternalSyntheticLambda2(arrayList), 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment IAuthTabCallback(int i, HapticShowcaseActivity hapticShowcaseActivity) {
        if (i == 0) {
            return hapticShowcaseActivity.setEngagementSignalsCallback();
        }
        return hapticShowcaseActivity.onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(((IAuthTabCallback) list.get(i)).onExtraCallback());
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
