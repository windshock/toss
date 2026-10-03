package viva.republica.toss.common.securekey;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.ConvertFloatArrayToByteArray;
import o.DigestInfo;
import o.getAdService;
import o.getConsentFlowUserGeography;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.importAppCert;
import o.isOneShot;
import o.noStore;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SecureKeyboardView extends FlexboxLayout {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallback = 8;
    private IAuthTabCallback onExtraCallback;
    private onNavigationEvent onExtraCallbackWithResult;
    private List<? extends DigestInfo> onNavigationEvent;
    private importAppCert onWarmupCompleted;

    public interface IAuthTabCallback {
        void onNavigationEvent(@NotNull DigestInfo digestInfo);
    }

    public interface onNavigationEvent {
        void IAuthTabCallback(int i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureKeyboardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureKeyboardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SecureKeyboardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(R.layout.view_secure_keyboard, (ViewGroup) this, true);
        setAlignContent(5);
        setAlignItems(4);
        setFlexWrap(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SecureKeyboardView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SecureKeyboardView_darkMode, false);
        typedArrayObtainStyledAttributes.recycle();
        setDarkMode(z);
    }

    public /* synthetic */ SecureKeyboardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setDarkMode(boolean z) {
        int iIntValue;
        Integer numValueOf;
        int color = ContextCompat.getColor(getContext(), z ? im.toss.tds.R.color.dark_theme_background_default : im.toss.tds.R.color.static_white);
        int color2 = ContextCompat.getColor(getContext(), z ? im.toss.tds.R.color.light_theme_grey_100 : im.toss.tds.R.color.light_theme_grey_700);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (z) {
            iIntValue = Color.parseColor("#40000000");
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        if (z) {
            numValueOf = null;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            numValueOf = Integer.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration2)).onUnminimized());
        }
        this.onWarmupCompleted = new importAppCert(context, true, iIntValue, numValueOf);
        setBackgroundColor(color);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(color2);
            } else if (childAt instanceof ImageView) {
                ((ImageView) childAt).setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
        }
        onExtraCallbackWithResult();
    }

    public final void setOnSecureKeyListener(@Nullable IAuthTabCallback iAuthTabCallback) {
        this.onExtraCallback = iAuthTabCallback;
    }

    public static final class onTransact implements IAuthTabCallback {
        final /* synthetic */ Function1<DigestInfo, Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        onTransact(Function1<? super DigestInfo, Unit> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        @Override // viva.republica.toss.common.securekey.SecureKeyboardView.IAuthTabCallback
        public void onNavigationEvent(DigestInfo digestInfo) {
            Intrinsics.checkNotNullParameter(digestInfo, "");
            this.onExtraCallbackWithResult.invoke(digestInfo);
        }
    }

    public final void setOnSecureKeyListener(@NotNull Function1<? super DigestInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = new onTransact(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted() {
        if (getHeight() <= 0) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SecureKeyboardView", "Register Requested before UI Attach", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            post(new Runnable() { // from class: viva.republica.toss.common.securekey.SecureKeyboardView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SecureKeyboardView.onExtraCallback(this.f$0);
                }
            });
            return;
        }
        IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(SecureKeyboardView secureKeyboardView) {
        secureKeyboardView.IAuthTabCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        if (getHeight() > 0) {
            int i = 0;
            IntRange intRangeUntil = RangesKt.until(0, getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            IntIterator it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(getChildAt(it.nextInt()));
            }
            List listFilterIsInstance = CollectionsKt.filterIsInstance(arrayList, TextView.class);
            final List<? extends DigestInfo> list = this.onNavigationEvent;
            if (list != null) {
                List<? extends DigestInfo> list2 = list;
                for (Object obj : list2) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TextView textView = (TextView) listFilterIsInstance.get(i);
                    textView.setText(((DigestInfo) obj).getTitle());
                    getConsentFlowUserGeography.onExtraCallbackWithResult(textView);
                    setProtocolsokhttp.onExtraCallback(textView);
                    i++;
                }
                importAppCert importappcert = this.onWarmupCompleted;
                importAppCert importappcert2 = null;
                if (importappcert == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    importappcert = null;
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((DigestInfo) it2.next()).getTitle());
                }
                importappcert.onNavigationEvent(arrayList2);
                importAppCert importappcert3 = this.onWarmupCompleted;
                if (importappcert3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    importappcert3 = null;
                }
                importappcert3.onExtraCallback(listFilterIsInstance, new Function2() { // from class: viva.republica.toss.common.securekey.SecureKeyboardView$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2, Object obj3) {
                        return SecureKeyboardView.onExtraCallbackWithResult(this.f$0, list, ((Integer) obj2).intValue(), (View) obj3);
                    }
                });
                View viewFindViewById = findViewById(R.id.deleteKey);
                importAppCert importappcert4 = this.onWarmupCompleted;
                if (importappcert4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    importappcert2 = importappcert4;
                }
                Intrinsics.checkNotNull(viewFindViewById);
                importappcert2.IAuthTabCallback(viewFindViewById, new Function1() { // from class: viva.republica.toss.common.securekey.SecureKeyboardView$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj2) {
                        return SecureKeyboardView.IAuthTabCallback(this.f$0, (View) obj2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(SecureKeyboardView secureKeyboardView, List list, int i, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback iAuthTabCallback = secureKeyboardView.onExtraCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent((DigestInfo) list.get(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(SecureKeyboardView secureKeyboardView, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(secureKeyboardView, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        IAuthTabCallback iAuthTabCallback = secureKeyboardView.onExtraCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent(DigestInfo.KEY_DELETE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 0;
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        IntIterator it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(it.nextInt()));
        }
        List listFilterIsInstance = CollectionsKt.filterIsInstance(arrayList, TextView.class);
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent(DigestInfo.KEY_RESET);
        }
        List mutableList = ArraysKt.toMutableList(DigestInfo.values());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mutableList) {
            DigestInfo digestInfo = (DigestInfo) obj;
            if (digestInfo != DigestInfo.KEY_DELETE && digestInfo != DigestInfo.KEY_RESET) {
                arrayList2.add(obj);
            }
        }
        final List<? extends DigestInfo> listShuffled = CollectionsKt.shuffled(arrayList2);
        List<? extends DigestInfo> list = listShuffled;
        for (Object obj2 : list) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) listFilterIsInstance.get(i);
            textView.setText(((DigestInfo) obj2).getTitle());
            getConsentFlowUserGeography.onExtraCallbackWithResult(textView);
            setProtocolsokhttp.onExtraCallback(textView);
            i++;
        }
        importAppCert importappcert = this.onWarmupCompleted;
        importAppCert importappcert2 = null;
        if (importappcert == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            importappcert = null;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((DigestInfo) it2.next()).getTitle());
        }
        importappcert.onNavigationEvent(arrayList3);
        importAppCert importappcert3 = this.onWarmupCompleted;
        if (importappcert3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            importappcert3 = null;
        }
        importappcert3.onExtraCallback(listFilterIsInstance, new Function2() { // from class: viva.republica.toss.common.securekey.SecureKeyboardView$$ExternalSyntheticLambda2
            public final Object invoke(Object obj3, Object obj4) {
                return SecureKeyboardView.onExtraCallback(this.f$0, listShuffled, ((Integer) obj3).intValue(), (View) obj4);
            }
        });
        View viewFindViewById = findViewById(R.id.deleteKey);
        importAppCert importappcert4 = this.onWarmupCompleted;
        if (importappcert4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            importappcert2 = importappcert4;
        }
        Intrinsics.checkNotNull(viewFindViewById);
        importappcert2.IAuthTabCallback(viewFindViewById, new Function1() { // from class: viva.republica.toss.common.securekey.SecureKeyboardView$$ExternalSyntheticLambda3
            public final Object invoke(Object obj3) {
                return SecureKeyboardView.onExtraCallbackWithResult(this.f$0, (View) obj3);
            }
        });
        this.onNavigationEvent = listShuffled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(SecureKeyboardView secureKeyboardView, List list, int i, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback iAuthTabCallback = secureKeyboardView.onExtraCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent((DigestInfo) list.get(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(SecureKeyboardView secureKeyboardView, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(secureKeyboardView, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        IAuthTabCallback iAuthTabCallback = secureKeyboardView.onExtraCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent(DigestInfo.KEY_DELETE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent() {
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        IntIterator it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(it.nextInt()));
        }
        for (TextView textView : CollectionsKt.filterIsInstance(arrayList, TextView.class)) {
            textView.setText("");
            textView.setOnClickListener(null);
        }
        findViewById(R.id.deleteKey).setOnClickListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
        if (onnavigationevent != null) {
            onnavigationevent.IAuthTabCallback(i);
        }
    }

    public final void setOnVisibilityChangedListener(@NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onExtraCallbackWithResult = onnavigationevent;
    }

    public static final class IAuthTabCallbackStub implements onNavigationEvent {
        final /* synthetic */ Function1<Integer, Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(Function1<? super Integer, Unit> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        @Override // viva.republica.toss.common.securekey.SecureKeyboardView.onNavigationEvent
        public void IAuthTabCallback(int i) {
            this.onExtraCallbackWithResult.invoke(Integer.valueOf(i));
        }
    }

    public final void setOnVisibilityChangedListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        setOnVisibilityChangedListener(new IAuthTabCallbackStub(function1));
    }
}
