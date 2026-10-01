package im.toss.uikit.widget.tab;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.uikit.R;
import im.toss.uikit.widget.tab.TdsTabV1TabLayoutView;
import im.toss.uikit.widget.tab.TdsTabV1View$;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFk1tSDK;
import o.ConnectionPool;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.setTagsokhttp;
import o.toStream;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda18;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TdsTabV1View extends FrameLayout {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AFk1tSDK IAuthTabCallback;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.SMALL.ordinal()] = 1;
                int i = onWarmupCompleted + 21;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.LARGE.ordinal()] = 2;
                int i3 = onWarmupCompleted + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i6 = onWarmupCompleted + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTabV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTabV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) objArr[1];
        TabLayout.Tab tab = (TabLayout.Tab) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(booleanRef, booleanRef2, tab);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Function1 function1, TabLayout.Tab tab) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(booleanRef, booleanRef2, function1, tab);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i4)) | i8 | (~(i6 | i4));
        int i10 = (~((~i6) | i2)) | (~(i2 | i4));
        int i11 = (~((~i4) | i7)) | i8;
        int i12 = i2 + i6 + i + (1821889583 * i3) + ((-349070011) * i5);
        int i13 = i12 * i12;
        int i14 = (575745661 * i2) + 325058560 + (1920428227 * i6) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i) + (473956352 * i3) + (1723858944 * i5) + ((-1436549120) * i13);
        int i15 = (i2 * 921699331) + 387174459 + (i6 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i * 921699455) + (i3 * 347275089) + (i5 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 4) {
            return onWarmupCompleted(objArr);
        }
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        int i17 = 2 % 2;
        int i18 = onNavigationEvent + 11;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.BooleanRef booleanRef) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 716310944, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{booleanRef}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -716310940);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[PHI: r7
      0x005b: PHI (r7v4 int) = (r7v3 int), (r7v9 int) binds: [B:12:0x0059, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[PHI: r7
      0x006b: PHI (r7v8 int) = (r7v3 int), (r7v9 int) binds: [B:12:0x0059, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, im.toss.uikit.widget.tab.TdsTabV1View$onExtraCallback] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsTabV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        boolean z;
        int index;
        onExtraCallback next;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1tSDK aFk1tSDKOnNavigationEvent = AFk1tSDK.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1tSDKOnNavigationEvent, "");
        this.IAuthTabCallback = aFk1tSDKOnNavigationEvent;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = onExtraCallback.LARGE;
        int i2 = 0;
        boolean z2 = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsTabV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i3 = 2 % 2;
            int i4 = 0;
            z = true;
            boolean z3 = true;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int i6 = onNavigationEvent + 49;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i5);
                    int i7 = 25 / 0;
                    if (index == R.styleable.TdsTabV1_tabLayoutMode) {
                        i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        int i8 = onNavigationEvent + 13;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    } else if (index == R.styleable.TdsTabV1_tabHasBorder) {
                        int i10 = onNavigationEvent + 83;
                        onWarmupCompleted = i10 % 128;
                        z = i10 % 2 == 0 ? typedArrayObtainStyledAttributes.getBoolean(index, true) : typedArrayObtainStyledAttributes.getBoolean(index, true);
                    } else if (index == R.styleable.TdsTabV1_tabShowIndicator) {
                        z3 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                    } else if (index == R.styleable.TdsTabV1_tabSize) {
                        Iterator<onExtraCallback> it = onExtraCallback.getEntries().iterator();
                        do {
                            next = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            int i11 = onNavigationEvent + 53;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                it.next().getValue();
                                typedArrayObtainStyledAttributes.getInt(index, onExtraCallback.LARGE.getValue());
                                next.hashCode();
                                throw null;
                            }
                            next = it.next();
                        } while (next.getValue() != typedArrayObtainStyledAttributes.getInt(index, onExtraCallback.LARGE.getValue()));
                        onExtraCallback onextracallback = next;
                        objectRef.element = onextracallback == null ? onExtraCallback.LARGE : onextracallback;
                    } else {
                        continue;
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i5);
                    if (index == R.styleable.TdsTabV1_tabLayoutMode) {
                    }
                }
            }
            i2 = i4;
            z2 = z3;
        } else {
            z = true;
        }
        setTabLayout(i2, (onExtraCallback) objectRef.element, z2);
        setBorder(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTabV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2 == 0 ? 1 : 0;
            int i6 = i3 + 93;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            } else {
                int i8 = 2 % 2;
            }
            i = i5;
        }
        this(context, attributeSet, i);
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallback(this.IAuthTabCallback.onWarmupCompleted.getTabAt(i));
            throw null;
        }
        IAuthTabCallback(this.IAuthTabCallback.onWarmupCompleted.getTabAt(i));
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable TabLayout.Tab tab) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted.selectTab(tab);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TabLayout.Tab onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TabLayout.Tab tabIAuthTabCallbackStub = IAuthTabCallbackStub();
        tabIAuthTabCallbackStub.setText(str);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tabIAuthTabCallbackStub;
    }

    public final TabLayout.Tab IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TabLayout.Tab tabNewTab = this.IAuthTabCallback.onWarmupCompleted.newTab();
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tabNewTab;
    }

    public final void onWarmupCompleted(@NotNull TabLayout.Tab tab) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tab, "");
        this.IAuthTabCallback.onWarmupCompleted.addTab(tab);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tab, "");
            this.IAuthTabCallback.onWarmupCompleted.addTab(tab, z);
        } else {
            Intrinsics.checkNotNullParameter(tab, "");
            this.IAuthTabCallback.onWarmupCompleted.addTab(tab, z);
            int i3 = 77 / 0;
        }
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted.removeAllTabs();
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    public final TabLayout.Tab onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IAuthTabCallback.onWarmupCompleted.getTabAt(i);
        }
        this.IAuthTabCallback.onWarmupCompleted.getTabAt(i);
        throw null;
    }

    public void setupWithViewPager(@NotNull ViewPager viewPager) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewPager, "");
        this.IAuthTabCallback.onWarmupCompleted.setupWithViewPager(viewPager);
        toStream.Companion.onWarmupCompleted(viewPager);
        int i4 = onNavigationEvent + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setupWithViewPager2$default(TdsTabV1View tdsTabV1View, ViewPager2 viewPager2, boolean z, boolean z2, TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupWithViewPager2");
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 47;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        tdsTabV1View.setupWithViewPager2(viewPager2, z, z2, tabConfigurationStrategy);
    }

    public final void setupWithViewPager2(@NotNull ViewPager2 viewPager2, boolean z, boolean z2, @NotNull TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(tabConfigurationStrategy, "");
        new TabLayoutMediator(this.IAuthTabCallback.onWarmupCompleted, viewPager2, z, z2, tabConfigurationStrategy).attach();
        toStream.Companion.onExtraCallback(viewPager2);
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setBorder(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View view = this.IAuthTabCallback.onNavigationEvent;
        if (z) {
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int i6 = onWarmupCompleted + 53;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void setBorderColor(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallback.onNavigationEvent.setBackgroundColor(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.IAuthTabCallback.onNavigationEvent.setBackgroundColor(i);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (!z) {
            this.IAuthTabCallback.onWarmupCompleted.setSelectedTabIndicator(new ColorDrawable(0));
            int i5 = onWarmupCompleted + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = i3 + 109;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            this.IAuthTabCallback.onWarmupCompleted.getTabMode();
            throw null;
        }
        this.IAuthTabCallback.onWarmupCompleted.setSelectedTabIndicator(ResourcesCompat.onExtraCallback(getResources(), this.IAuthTabCallback.onWarmupCompleted.getTabMode() == 0 ? R.drawable.tab_indicator_fluid : R.drawable.tab_indicator_fixed, getContext().getTheme()));
        int i8 = onNavigationEvent + 113;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int selectedTabPosition;
        TdsTabV1View tdsTabV1View = (TdsTabV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            selectedTabPosition = tdsTabV1View.IAuthTabCallback.onWarmupCompleted.getSelectedTabPosition();
            int i3 = 71 / 0;
        } else {
            selectedTabPosition = tdsTabV1View.IAuthTabCallback.onWarmupCompleted.getSelectedTabPosition();
        }
        return Integer.valueOf(selectedTabPosition);
    }

    public final int onWarmupCompleted() {
        int tabCount;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            tabCount = this.IAuthTabCallback.onWarmupCompleted.getTabCount();
            int i3 = 82 / 0;
        } else {
            tabCount = this.IAuthTabCallback.onWarmupCompleted.getTabCount();
        }
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return tabCount;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull TabLayout.OnTabSelectedListener onTabSelectedListener) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        this.IAuthTabCallback.onWarmupCompleted.addOnTabSelectedListener(onTabSelectedListener);
        int i4 = onNavigationEvent + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsTabV1View tdsTabV1View = (TdsTabV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tdsTabV1View.IAuthTabCallback.onWarmupCompleted.clearOnTabSelectedListeners();
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.IAuthTabCallback.onWarmupCompleted, Integer.valueOf(i)};
        int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        TdsTabV1TabLayoutView.onExtraCallbackWithResult(-205201931, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), 205201932, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), objArr, iOnNavigationEvent);
        int i5 = onWarmupCompleted + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallback.onWarmupCompleted.onWarmupCompleted(i);
        } else {
            this.IAuthTabCallback.onWarmupCompleted.onWarmupCompleted(i);
            throw null;
        }
    }

    public final TdsTabV1TabLayoutView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            TdsTabV1TabLayoutView tdsTabV1TabLayoutView = this.IAuthTabCallback.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsTabV1TabLayoutView, "");
            return tdsTabV1TabLayoutView;
        }
        Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.onWarmupCompleted, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setTabLayout$default(TdsTabV1View tdsTabV1View, int i, onExtraCallback onextracallback, boolean z, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 5;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTabLayout");
        }
        if ((i2 & 1) != 0) {
            int i7 = i5 + 89;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i = 1;
        }
        if ((i2 & 2) != 0) {
            onextracallback = onExtraCallback.LARGE;
        }
        if ((i2 & 4) != 0) {
            int i9 = onNavigationEvent + 17;
            onWarmupCompleted = i9 % 128;
            z = i9 % 2 != 0;
        }
        tdsTabV1View.setTabLayout(i, onextracallback, z);
        int i10 = onWarmupCompleted + 13;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r5
      0x002c: PHI (r5v3 int) = (r5v2 int), (r5v8 int) binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTabLayout(int i, @NotNull onExtraCallback onextracallback, boolean z) throws Resources.NotFoundException {
        int i2;
        TdsTabV1TabLayoutView.onExtraCallbackWithResult onextracallbackwithresult;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            i2 = onExtraCallbackWithResult.onExtraCallback[onextracallback.ordinal()];
            if (i2 != 0) {
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0 ? i2 != 2 : i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                onextracallbackwithresult = TdsTabV1TabLayoutView.onExtraCallbackWithResult.LARGE;
            } else {
                onextracallbackwithresult = TdsTabV1TabLayoutView.onExtraCallbackWithResult.SMALL;
                int i6 = onNavigationEvent + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            i2 = onExtraCallbackWithResult.onExtraCallback[onextracallback.ordinal()];
            if (i2 != 1) {
            }
        }
        setTabLayout(i, onextracallbackwithresult, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r7 & 4) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r6 = r2 + 79;
        im.toss.uikit.widget.tab.TdsTabV1View.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
        r2 = r2 + 51;
        im.toss.uikit.widget.tab.TdsTabV1View.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r0 = 2 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r3.setTabLayout(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTabLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if ((r7 & 1) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void setTabLayout$default(TdsTabV1View tdsTabV1View, int i, TdsTabV1TabLayoutView.onExtraCallbackWithResult onextracallbackwithresult, boolean z, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 89;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        if (i4 % 2 == 0) {
            int i6 = 53 / 0;
        }
    }

    public static final class IAuthTabCallbackStub implements onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<TabLayout.Tab, Unit> IAuthTabCallback;

        IAuthTabCallbackStub(Function1<? super TabLayout.Tab, Unit> function1) {
            this.IAuthTabCallback = function1;
        }

        public /* bridge */ void onTabReselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onTabReselected(tab);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onTabUnselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onTabUnselected(tab);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onTabSelected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                super.onTabSelected(tab);
                this.IAuthTabCallback.invoke(tab);
                int i3 = 67 / 0;
            } else {
                super.onTabSelected(tab);
                this.IAuthTabCallback.invoke(tab);
            }
        }
    }

    public final void onExtraCallback(@NotNull Function1<? super TabLayout.Tab, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        onNavigationEvent((TabLayout.OnTabSelectedListener) new IAuthTabCallbackStub(function1));
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallbackDefault implements onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<TabLayout.Tab, Unit> onExtraCallbackWithResult;

        IAuthTabCallbackDefault(Function1<? super TabLayout.Tab, Unit> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        public /* bridge */ void onTabSelected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onTabSelected(tab);
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
        }

        public /* bridge */ void onTabUnselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onTabUnselected(tab);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
            }
        }

        public void onTabReselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                super.onTabReselected(tab);
                this.onExtraCallbackWithResult.invoke(tab);
                int i3 = 38 / 0;
            } else {
                super.onTabReselected(tab);
                this.onExtraCallbackWithResult.invoke(tab);
            }
        }
    }

    public final void onNavigationEvent(@NotNull Function1<? super TabLayout.Tab, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        onNavigationEvent((TabLayout.OnTabSelectedListener) new IAuthTabCallbackDefault(function1));
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Function0 IAuthTabCallback(TdsTabV1View tdsTabV1View, ViewPager viewPager, Function2 function2, Function1 function1, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnSwipeOrTabClickListener");
        }
        int i3 = onNavigationEvent + 31;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 8) != 0) {
            int i6 = i4 + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        return tdsTabV1View.onExtraCallback(viewPager, (Function2<? super Integer, ? super Integer, Unit>) function2, (Function1<? super Integer, Unit>) function1, z);
    }

    private static final Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Function1 function1, TabLayout.Tab tab) {
        int position;
        int i = 2 % 2;
        if (!booleanRef.element && (!booleanRef2.element)) {
            if (tab != null) {
                position = tab.getPosition();
                int i2 = onWarmupCompleted + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onNavigationEvent + 1;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                position = -1;
            }
            function1.invoke(Integer.valueOf(position));
        }
        booleanRef.element = false;
        booleanRef2.element = false;
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback extends ViewPager.IAuthTabCallbackDefault {
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ViewPager IAuthTabCallback;
        final /* synthetic */ Ref.IntRef onExtraCallback;
        final /* synthetic */ Function2<Integer, Integer, Unit> onNavigationEvent;
        final /* synthetic */ Ref.BooleanRef onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Ref.BooleanRef booleanRef, Ref.IntRef intRef, ViewPager viewPager, Function2<? super Integer, ? super Integer, Unit> function2) {
            this.onWarmupCompleted = booleanRef;
            this.onExtraCallback = intRef;
            this.IAuthTabCallback = viewPager;
            this.onNavigationEvent = function2;
        }

        public void onPageScrollStateChanged(int i) {
            int i2 = 2 % 2;
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                this.onWarmupCompleted.element = true;
                this.onExtraCallback.element = this.IAuthTabCallback.getCurrentItem();
                int i3 = onExtraCallbackWithResult + 35;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 9 / 0;
                    return;
                }
                return;
            }
            int i5 = onExtraCallbackWithResult + 11;
            asBinder = i5 % 128;
            if (i5 % 2 != 0 ? i == 2 : i == 5) {
                if (this.onWarmupCompleted.element) {
                    int currentItem = this.IAuthTabCallback.getCurrentItem();
                    int i6 = this.onExtraCallback.element;
                    if (currentItem != i6) {
                        int i7 = asBinder + 65;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        this.onNavigationEvent.invoke(Integer.valueOf(i6), Integer.valueOf(this.IAuthTabCallback.getCurrentItem()));
                    }
                }
            }
            int i9 = onExtraCallbackWithResult + 69;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Function0<Unit> onExtraCallback(@NotNull ViewPager viewPager, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function1<? super Integer, Unit> function1, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewPager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = z;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        onExtraCallback((Function1<? super TabLayout.Tab, Unit>) new TdsTabV1View$.ExternalSyntheticLambda1(booleanRef, booleanRef2, function1));
        viewPager.addOnPageChangeListener(new IAuthTabCallback(booleanRef, intRef, viewPager, function2));
        TdsTabV1View$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new TdsTabV1View$.ExternalSyntheticLambda2(booleanRef2);
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return externalSyntheticLambda2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, TabLayout.Tab tab) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
            if (!booleanRef.element) {
                booleanRef2.element = true;
                int i4 = onNavigationEvent + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!booleanRef.element) {
        }
        return Unit.INSTANCE;
    }

    public static final class asBinder extends ViewPager2.OnPageChangeCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        final /* synthetic */ Ref.BooleanRef IAuthTabCallback;
        final /* synthetic */ Function2<Integer, Integer, Unit> onExtraCallback;
        final /* synthetic */ Ref.BooleanRef onExtraCallbackWithResult;
        final /* synthetic */ Ref.IntRef onNavigationEvent;
        final /* synthetic */ ViewPager2 onTransact;
        final /* synthetic */ Function2<Integer, Integer, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        asBinder(Ref.BooleanRef booleanRef, Function2<? super Integer, ? super Integer, Unit> function2, Ref.IntRef intRef, ViewPager2 viewPager2, Function2<? super Integer, ? super Integer, Unit> function22, Ref.BooleanRef booleanRef2) {
            this.onExtraCallbackWithResult = booleanRef;
            this.onExtraCallback = function2;
            this.onNavigationEvent = intRef;
            this.onTransact = viewPager2;
            this.onWarmupCompleted = function22;
            this.IAuthTabCallback = booleanRef2;
        }

        public void onPageSelected(int i) {
            int i2 = 2 % 2;
            int i3 = asBinder + 85;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            super.onPageSelected(i);
            if (!this.onExtraCallbackWithResult.element) {
                this.onExtraCallback.invoke(Integer.valueOf(this.onNavigationEvent.element), Integer.valueOf(this.onTransact.onNavigationEvent()));
            } else {
                this.onWarmupCompleted.invoke(Integer.valueOf(this.onNavigationEvent.element), Integer.valueOf(this.onTransact.onNavigationEvent()));
            }
            this.onNavigationEvent.element = this.onTransact.onNavigationEvent();
            int i5 = IAuthTabCallbackStub + 125;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r1
          0x0023: PHI (r1v8 kotlin.jvm.internal.Ref$BooleanRef) = (r1v4 kotlin.jvm.internal.Ref$BooleanRef), (r1v9 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
          0x0021: PHI (r1v5 kotlin.jvm.internal.Ref$BooleanRef) = (r1v4 kotlin.jvm.internal.Ref$BooleanRef), (r1v9 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageScrollStateChanged(int i) {
            Ref.BooleanRef booleanRef;
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 65;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                super.onPageScrollStateChanged(i);
                booleanRef = this.IAuthTabCallback;
                int i4 = 33 / 0;
                z = i != 0;
            } else {
                super.onPageScrollStateChanged(i);
                booleanRef = this.IAuthTabCallback;
                if (i != 0) {
                }
            }
            booleanRef.element = z;
            if (i == 0) {
                int i5 = asBinder + 91;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                this.onExtraCallbackWithResult.element = false;
            }
        }
    }

    public final void onExtraCallback(@NotNull ViewPager2 viewPager2, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function2<? super Integer, ? super Integer, Unit> function22) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        Ref.IntRef intRef = new Ref.IntRef();
        onExtraCallback((Function1<? super TabLayout.Tab, Unit>) new TdsTabV1View$.ExternalSyntheticLambda0(booleanRef, booleanRef2));
        viewPager2.onExtraCallbackWithResult(new asBinder(booleanRef2, function2, intRef, viewPager2, function22, booleanRef));
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final int value;
        public static final onExtraCallback SMALL = new onExtraCallback("SMALL", 0, 0);
        public static final onExtraCallback LARGE = new onExtraCallback("LARGE", 1, 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback onextracallback = SMALL;
                onExtraCallback onextracallback2 = LARGE;
                onextracallbackArr = new onExtraCallback[4];
                onextracallbackArr[1] = onextracallback;
                onextracallbackArr[0] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{SMALL, LARGE};
            }
            int i4 = i2 + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 83;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 42 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private onExtraCallback(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.value;
            int i6 = i3 + 99;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsTabV1View tdsTabV1View = (TdsTabV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        TabLayout tabLayout = tdsTabV1View.IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "");
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics = tdsTabV1View.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.leftMargin = varyMatches.onNavigationEvent(Float.valueOf(fFloatValue), displayMetrics);
        DisplayMetrics displayMetrics2 = tdsTabV1View.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        layoutParams2.rightMargin = varyMatches.onNavigationEvent(Float.valueOf(fFloatValue), displayMetrics2);
        tabLayout.setLayoutParams(layoutParams2);
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View, com.google.android.material.tabs.TabLayout, im.toss.uikit.widget.tab.TdsTabV1TabLayoutView, java.lang.Object] */
    public final void setTabLayout(int i, @NotNull TdsTabV1TabLayoutView.onExtraCallbackWithResult onextracallbackwithresult, boolean z) throws Resources.NotFoundException {
        boolean z2;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i5 = 0;
        if (onextracallbackwithresult == TdsTabV1TabLayoutView.onExtraCallbackWithResult.SMALL) {
            z2 = true;
        } else {
            int i6 = onNavigationEvent + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        if (i == 0) {
            int i8 = onWarmupCompleted + 21;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z3 = false;
        } else {
            z3 = true;
        }
        int iOnExtraCallbackWithResult = z3 ? setTagsokhttp.onExtraCallbackWithResult(this, 8) : setTagsokhttp.onExtraCallbackWithResult(this, 12);
        int iOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        int iOnExtraCallbackWithResult3 = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        if (true ^ z3) {
            onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1551945480, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this, Float.valueOf(0.0f)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1551945480);
            i5 = 2;
        } else {
            int i10 = onNavigationEvent + 33;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1551945480, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this, Float.valueOf(20.0f)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1551945480);
        }
        connectionCount connectioncount = new connectionCount(accessgetTlsVersionsAsStringp.Typography5.getSize(), 0.0f, 2, (DefaultConstructorMarker) null);
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(this, Float.valueOf(deprecated_cacheResponse.onExtraCallback(this, connectioncount, connectionCount.onExtraCallback(connectioncount, 1.6f, 0.0f, 2, (Object) null), ConnectionPool.onWarmupCompleted.onWarmupCompleted())));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.tab_indicator_height);
        ?? r11 = this.IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNull(r11);
        ViewGroup.LayoutParams layoutParams = r11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iOnExtraCallbackWithResult4 = setTagsokhttp.onExtraCallbackWithResult((View) r11, Integer.valueOf(z2 ? 38 : 51));
        int i12 = onWarmupCompleted + 5;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 2 / 5;
        }
        layoutParams.height = RangesKt___RangesKt.coerceAtLeast(iIAuthTabCallback + iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult3 + dimensionPixelSize, iOnExtraCallbackWithResult4);
        r11.setLayoutParams(layoutParams);
        r11.setTabMode(i);
        r11.setTabGravity(i5);
        r11.setTabSize$uikit_release(onextracallbackwithresult);
        r11.setTabHorizontalPadding$uikit_release(iOnExtraCallbackWithResult);
        onExtraCallbackWithResult(z);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, TabLayout.Tab tab) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1117224450, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{booleanRef, booleanRef2, tab}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1117224449);
    }

    private static final Unit onNavigationEvent(Ref.BooleanRef booleanRef) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 716310944, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{booleanRef}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -716310940);
    }

    private final void onExtraCallbackWithResult(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1551945480, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1551945480);
    }

    public final void onNavigationEvent() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
    }

    public final int onExtraCallbackWithResult() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Integer) onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue();
    }
}
