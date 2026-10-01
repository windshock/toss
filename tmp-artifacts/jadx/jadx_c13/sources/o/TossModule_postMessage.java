package o;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.Toolbar;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import im.toss.uikit.widget.actionbar.TdsActionBarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IPostMessageServiceStubProxy;
import o.TossModule_postMessage;
import o.initSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossModule_postMessage {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private final List<initSDK> IAuthTabCallback;
    private final BaseTextView IAuthTabCallbackStub;
    private final initMiniApp asBinder;
    private final IPostMessageServiceStubProxy onExtraCallback;
    private final AppCompatActivity onExtraCallbackWithResult;
    private final LinearLayout onNavigationEvent;
    private Function0<Unit> onWarmupCompleted;

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1345119384, -1345119383, iOnExtraCallbackWithResult3, new Object[]{function0, view}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            return;
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1345119384, -1345119383, iOnExtraCallbackWithResult6, new Object[]{function0, view}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5);
        int i3 = 9 / 0;
    }

    public static /* synthetic */ void onExtraCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0, view);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 33;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = ~i3;
        int i10 = ~(i7 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i5 | i9)) | (~(i7 | i11));
        int i14 = i2 + i3 + i6 + (417615942 * i4) + (566850886 * i);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i2) + 147849216 + ((-2147356519) * i3) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i4) + ((-85983232) * i) + ((-608960512) * i15);
        int i17 = (i2 * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i6 * (-1357469401)) + (i4 * 1137340586) + (i * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return unitOnNavigationEvent;
    }

    public TossModule_postMessage(@NotNull AppCompatActivity appCompatActivity, @Nullable initMiniApp initminiapp, @NotNull IPostMessageServiceStubProxy iPostMessageServiceStubProxy) {
        Toolbar toolbar;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(iPostMessageServiceStubProxy, "");
        this.onExtraCallbackWithResult = appCompatActivity;
        this.asBinder = initminiapp;
        this.onExtraCallback = iPostMessageServiceStubProxy;
        this.IAuthTabCallback = new ArrayList();
        iPostMessageServiceStubProxy.onExtraCallback(16);
        iPostMessageServiceStubProxy.onWarmupCompleted(true);
        iPostMessageServiceStubProxy.IAuthTabCallback(R.layout.tds_action_bar);
        Toolbar parent = iPostMessageServiceStubProxy.onNavigationEvent().getParent();
        ActionBarContainer actionBarContainer = null;
        if (parent instanceof Toolbar) {
            toolbar = parent;
            int i = onTransact + 39;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            toolbar = null;
        }
        if (toolbar != null) {
            Resources resources = appCompatActivity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            toolbar.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onWarmupCompleted());
            toolbar.setContentInsetsAbsolute(0, 0);
            ViewParent parent2 = toolbar.getParent();
            if (parent2 instanceof ActionBarContainer) {
                int i4 = onTransact + 109;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    actionBarContainer.hashCode();
                    throw null;
                }
                actionBarContainer = (ActionBarContainer) parent2;
            }
            if (actionBarContainer != null) {
                int i5 = onTransact + 49;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                actionBarContainer.setElevation(0.0f);
                int i7 = IAuthTabCallbackDefault + 59;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
        }
        iPostMessageServiceStubProxy.IAuthTabCallback(iPostMessageServiceStubProxy.onNavigationEvent(), new IPostMessageServiceStubProxy.onExtraCallbackWithResult(-1, -1));
        View viewFindViewById = iPostMessageServiceStubProxy.onNavigationEvent().findViewById(R.id.right_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.onNavigationEvent = (LinearLayout) viewFindViewById;
        BaseTextView baseTextViewFindViewById = iPostMessageServiceStubProxy.onNavigationEvent().findViewById(R.id.title);
        BaseTextView baseTextView = baseTextViewFindViewById;
        Intrinsics.checkNotNullExpressionValue(baseTextView.getResources().getDisplayMetrics(), "");
        baseTextView.onWarmupCompleted(varyMatches.onNavigationEvent(20, r2));
        Intrinsics.checkNotNullExpressionValue(baseTextViewFindViewById, "");
        this.IAuthTabCallbackStub = baseTextView;
        TdsImageView tdsImageViewFindViewById = iPostMessageServiceStubProxy.onNavigationEvent().findViewById(R.id.home_button);
        tdsImageViewFindViewById.setContentDescription(appCompatActivity.getString(R.string.navigation_up_button_description));
        tdsImageViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.actionbar.TdsActionBar$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = 2 % 2;
                int i11 = IAuthTabCallback + 113;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                TossModule_postMessage.onNavigationEvent(this.f$0, view);
                int i13 = IAuthTabCallback + 35;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
            }
        });
    }

    public static void onNavigationEvent(TossModule_postMessage tossModule_postMessage, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = tossModule_postMessage.onWarmupCompleted;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        int i5 = i3 + 47;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        tossModule_postMessage.onExtraCallbackWithResult.onBackPressed();
        int i7 = onTransact + 5;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        BaseTextView baseTextView = this.IAuthTabCallbackStub;
        baseTextView.setText(charSequence);
        generateInviteUrl.onNavigationEvent((View) baseTextView, charSequence);
        int i4 = onTransact + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ViewParent parent;
        Toolbar toolbar;
        TossModule_postMessage tossModule_postMessage = (TossModule_postMessage) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        View viewOnNavigationEvent = tossModule_postMessage.onExtraCallback.onNavigationEvent();
        if (viewOnNavigationEvent != null) {
            int i2 = IAuthTabCallbackDefault + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            parent = viewOnNavigationEvent.getParent();
            int i4 = onTransact + 55;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = onTransact + 67;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            parent = null;
        }
        if (parent instanceof Toolbar) {
            int i8 = onTransact + 35;
            IAuthTabCallbackDefault = i8 % 128;
            toolbar = (Toolbar) parent;
            if (i8 % 2 != 0) {
                throw null;
            }
        } else {
            toolbar = null;
        }
        if (toolbar != null) {
            toolbar.setBackgroundColor(iIntValue);
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = function0;
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = onTransact + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onWarmupCompleted(@NotNull CharSequence charSequence, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function0, "");
        initSDK tdsActionBarText = new TdsActionBarText(this.onExtraCallbackWithResult);
        setProtocolsokhttp.onExtraCallback(tdsActionBarText);
        generateInviteUrl.onNavigationEvent((View) tdsActionBarText, charSequence);
        tdsActionBarText.setText(charSequence);
        onNavigationEvent(tdsActionBarText);
        tdsActionBarText.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.actionbar.TdsActionBar$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                TossModule_postMessage.IAuthTabCallback(function0, view);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        LinearLayout linearLayout = this.onNavigationEvent;
        linearLayout.setVisibility(0);
        linearLayout.addView(tdsActionBarText);
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        LinearLayout linearLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            linearLayout = this.onNavigationEvent;
            linearLayout.removeAllViews();
            this.IAuthTabCallback.clear();
            i = 22;
        } else {
            linearLayout = this.onNavigationEvent;
            linearLayout.removeAllViews();
            this.IAuthTabCallback.clear();
            i = 8;
        }
        linearLayout.setVisibility(i);
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void onExtraCallbackWithResult(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        Iterator it;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            it = this.IAuthTabCallback.iterator();
            int i3 = 48 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            it = this.IAuthTabCallback.iterator();
        }
        while (it.hasNext()) {
            int i4 = onTransact + 107;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                ((initSDK) it.next()).setCustomParams(function1);
                int i5 = 5 / 0;
            } else {
                ((initSDK) it.next()).setCustomParams(function1);
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossModule_postMessage tossModule_postMessage = (TossModule_postMessage) objArr[0];
        initMiniApp initminiapp = (initMiniApp) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(initminiapp, "");
            tossModule_postMessage.IAuthTabCallback.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(initminiapp, "");
        Iterator<T> it = tossModule_postMessage.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            int i3 = IAuthTabCallbackDefault + 65;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            onInstallReferrerSetupFinished.onWarmupCompleted.onExtraCallback((initSDK) it.next(), initminiapp);
        }
        return null;
    }

    private final void onNavigationEvent(initSDK initsdk) {
        int i = 2 % 2;
        if (initsdk instanceof View) {
            int i2 = onTransact + 73;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            initMiniApp initminiapp = this.asBinder;
            if (initminiapp != null) {
                ((View) initsdk).setTag(im.toss.logging.automation.R.id.auto_log_screen_view_tag, initminiapp);
                int i4 = IAuthTabCallbackDefault + 81;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        this.IAuthTabCallback.add(initsdk);
    }

    private static final void onWarmupCompleted(Function0 function0, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1345119384, -1345119383, iOnExtraCallbackWithResult3, new Object[]{function0, view}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final void onNavigationEvent(@NotNull initMiniApp initminiapp) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -275632479, 275632479, iOnExtraCallbackWithResult3, new Object[]{this, initminiapp}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1527268357, -1527268355, nSetPosition.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallback + 55;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = onNavigationEvent + 79;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }
}
