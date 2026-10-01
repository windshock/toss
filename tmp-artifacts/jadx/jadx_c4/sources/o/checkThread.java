package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.AutoLogConstraintLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkThread implements SearchBarKtExternalSyntheticLambda5 {
    private static int ICustomTabsCallback = 0;
    private static int readTypedObject = 1;
    public final ComposeView IAuthTabCallback;
    public final Typography5 IAuthTabCallbackDefault;
    public final FrameLayout IAuthTabCallbackStub;
    public final Typography5 IAuthTabCallbackStubProxy;
    private final ConstraintLayout IAuthTabCallback_Parcel;
    public final Toolbar access000;
    public final TdsListHeaderV3View access100;
    public final Typography5 asBinder;
    public final Typography5 asInterface;
    public final TdsTopV2View getInterfaceDescriptor;
    public final AppBarLayout onExtraCallback;
    public final FrameLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final AutoLogConstraintLayout onTransact;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = ICustomTabsCallback + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return constraintLayoutOnExtraCallbackWithResult;
    }

    private checkThread(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ComposeView composeView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AutoLogConstraintLayout autoLogConstraintLayout, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography5 typography53, @NonNull Typography5 typography54, @NonNull TdsListHeaderV3View tdsListHeaderV3View, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallback_Parcel = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onWarmupCompleted = tdsImageView;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.IAuthTabCallback = composeView;
        this.onExtraCallbackWithResult = frameLayout;
        this.IAuthTabCallbackStub = frameLayout2;
        this.onTransact = autoLogConstraintLayout;
        this.asBinder = typography5;
        this.asInterface = typography52;
        this.IAuthTabCallbackDefault = typography53;
        this.IAuthTabCallbackStubProxy = typography54;
        this.access100 = tdsListHeaderV3View;
        this.access000 = toolbar;
        this.getInterfaceDescriptor = tdsTopV2View;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static checkThread IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        readTypedObject = i2 % 128;
        Object obj = null;
        checkThread checkthreadOnNavigationEvent = onNavigationEvent(layoutInflater, null, i2 % 2 == 0);
        int i3 = ICustomTabsCallback + 43;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return checkthreadOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static checkThread onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_high_interest_comparision, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = ICustomTabsCallback + 15;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        checkThread checkthreadOnNavigationEvent = onNavigationEvent(viewInflate);
        int i4 = ICustomTabsCallback + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return checkthreadOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[PHI: r4
      0x00a1: PHI (r4v14 im.toss.tds.view.component.atom.text.Typography5) = (r4v13 im.toss.tds.view.component.atom.text.Typography5), (r4v19 im.toss.tds.view.component.atom.text.Typography5) binds: [B:30:0x00ac, B:27:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static checkThread onNavigationEvent(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        ComposeView composeViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent3;
        Typography5 typography5OnNavigationEvent4;
        Toolbar toolbarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.appBarLayout;
            AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (appBarLayoutOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.arrow_image))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.bottomCta))) != null && (composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.bottomInfo))) != null) {
                i3 = R.id.gradient_graph1;
                FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (frameLayout != null) {
                    i3 = R.id.gradient_graph2;
                    FrameLayout frameLayout2 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (frameLayout2 != null) {
                        int i4 = ICustomTabsCallback + 79;
                        readTypedObject = i4 % 128;
                        int i5 = i4 % 2;
                        i3 = R.id.gradientGraphContainer;
                        AutoLogConstraintLayout autoLogConstraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                        if (autoLogConstraintLayoutOnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.graph1_bottom_label))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.graph1_top_label))) != null && (typography5OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.graph2_bottom_label))) != null) {
                            int i6 = readTypedObject + 45;
                            ICustomTabsCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                i3 = R.id.graph2_top_label;
                                typography5OnNavigationEvent4 = (Typography5) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                                int i7 = 7 / 0;
                                if (typography5OnNavigationEvent4 != null) {
                                    Typography5 typography5 = typography5OnNavigationEvent4;
                                    i3 = R.id.list_header;
                                    TdsListHeaderV3View tdsListHeaderV3ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                                    if (tdsListHeaderV3ViewOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.toolbar))) != null) {
                                        int i8 = ICustomTabsCallback + 31;
                                        readTypedObject = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            i3 = R.id.top;
                                            TdsTopV2View tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                                            if (tdsTopV2ViewOnNavigationEvent != null) {
                                                return new checkThread((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, composeViewOnNavigationEvent, frameLayout, frameLayout2, autoLogConstraintLayoutOnNavigationEvent, typography5OnNavigationEvent, typography5OnNavigationEvent2, typography5OnNavigationEvent3, typography5, tdsListHeaderV3ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
                                            }
                                        } else {
                                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.top);
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                i3 = R.id.graph2_top_label;
                                typography5OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                                if (typography5OnNavigationEvent4 != null) {
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.appBarLayout);
        obj.hashCode();
        throw null;
    }
}
