package im.toss.features.loan.refinancing.funnel.account;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.loan.refinancing.data.RefinancingAccountState;
import im.toss.features.loan.refinancing.funnel.account.LoanRefinancingKcbAccountFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.PageContext;
import o.PlayerErrorCode;
import o.RippleNode;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.clearWrite;
import o.extractDeviceStatFileForCpuLine;
import o.getDevNetworkType;
import o.preFillDefault;
import o.response;
import o.setBaseTime;
import o.startNativePerfMonitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanProductBadge;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingKcbAccountFragment extends Hilt_LoanRefinancingKcbAccountFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallbackDefault = null;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static boolean IAuthTabCallback_Parcel = false;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int extraCallbackWithResult = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private static int writeTypedObject = 1;
    private final extractDeviceStatFileForCpuLine IAuthTabCallback;
    private final Lazy asBinder;
    private int onExtraCallback = R.layout.activity_loan_recycler_cta;
    private final PageContext onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);
    private Set<String> onTransact;

    static final /* synthetic */ class onNavigationEvent implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        onNavigationEvent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    if (obj instanceof FunctionAdapter) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            int i5 = i2 + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingKcbAccountFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0)};
        onExtraCallbackWithResult = 8;
        int i = writeTypedObject + 59;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment = (LoanRefinancingKcbAccountFragment) objArr[0];
        RefinancingAccountState refinancingAccountState = (RefinancingAccountState) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingKcbAccountFragment, refinancingAccountState);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = access100 + 65;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1027875932, new Object[]{loanRefinancingKcbAccountFragment}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1027875932, iIAuthTabCallback);
        }
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingKcbAccountFragment, view);
        int i4 = getInterfaceDescriptor + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i2 | i6));
        int i11 = ~(i7 | i9);
        int i12 = (~i6) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i2);
        int i15 = i2 + i5 + i4 + ((-1261570137) * i) + (2040842291 * i3);
        int i16 = i15 * i15;
        int i17 = ((i2 * (-750812765)) - 1471086592) + ((-750812765) * i5) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i4) + ((-1928462336) * i) + (1629880320 * i3) + (2096168960 * i16);
        int i18 = ((i2 * 1408203179) - 1033136887) + (i5 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i4 * 1408202841) + (i * (-1046847217)) + (i3 * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 == 2) {
            return IAuthTabCallback(objArr);
        }
        LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment = (LoanRefinancingKcbAccountFragment) objArr[0];
        int i20 = 2 % 2;
        int i21 = access100 + 95;
        getInterfaceDescriptor = i21 % 128;
        int i22 = i21 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1254555L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        loanRefinancingKcbAccountFragment.onExtraCallback(CollectionsKt.joinToString$default(loanRefinancingKcbAccountFragment.onTransact, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "refinancing_loan__connect_loan", false);
        Unit unit = Unit.INSTANCE;
        int i23 = access100 + 23;
        getInterfaceDescriptor = i23 % 128;
        int i24 = i23 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, Map.Entry entry, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingKcbAccountFragment, entry, z);
        int i4 = getInterfaceDescriptor + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {setDetectableSize};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iIAuthTabCallback3, -1359774863, objArr, iIAuthTabCallback4, iIAuthTabCallback2, 1359774864, iIAuthTabCallback);
        int i4 = getInterfaceDescriptor + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 61;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return 1251647L;
        }
        throw null;
    }

    public LoanRefinancingKcbAccountFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallbackWithResult(this)));
        this.asBinder = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingAccountViewModel.class), new IAuthTabCallback(lazyOnNavigationEvent), new IAuthTabCallbackDefault(null, lazyOnNavigationEvent), new onTransact(this, lazyOnNavigationEvent));
        this.IAuthTabCallback = new extractDeviceStatFileForCpuLine();
        this.onTransact = new LinkedHashSet();
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 41;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, startNativePerfMonitor> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 5;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, startNativePerfMonitor.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0);
        }

        public final startNativePerfMonitor IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                startNativePerfMonitor.onExtraCallback(view);
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            startNativePerfMonitor startnativeperfmonitorOnExtraCallback = startNativePerfMonitor.onExtraCallback(view);
            int i3 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return startnativeperfmonitorOnExtraCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            startNativePerfMonitor startnativeperfmonitorIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return startnativeperfmonitorIAuthTabCallback;
        }
    }

    private final startNativePerfMonitor asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        startNativePerfMonitor startnativeperfmonitorOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(startnativeperfmonitorOnExtraCallbackWithResult, "");
        startNativePerfMonitor startnativeperfmonitor = startnativeperfmonitorOnExtraCallbackWithResult;
        int i4 = access100 + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return startnativeperfmonitor;
        }
        throw null;
    }

    private final LoanRefinancingAccountViewModel onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingAccountViewModel loanRefinancingAccountViewModel = (LoanRefinancingAccountViewModel) this.asBinder.getValue();
        int i4 = getInterfaceDescriptor + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return loanRefinancingAccountViewModel;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            onTransact().onExtraCallback(access100());
            asInterface();
            IAuthTabCallbackStub();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onTransact().onExtraCallback(access100());
        asInterface();
        IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        onTransact().onExtraCallback().observe(getViewLifecycleOwner(), new onNavigationEvent(new LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda4(this)));
        int i2 = getInterfaceDescriptor + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
            if (refinancingAccountState.onExtraCallbackWithResult().isEmpty()) {
                RippleNode.onNavigationEvent(loanRefinancingKcbAccountFragment).onNavigationEvent(R.id.loanRefinancingNoAccountFragment);
            } else {
                int i4 = getInterfaceDescriptor + 89;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                RippleNode.onNavigationEvent(loanRefinancingKcbAccountFragment).onNavigationEvent(R.id.loanRefinancingInfraCheckFragment);
            }
        } else if (!refinancingAccountState.onExtraCallbackWithResult().isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List onNavigationEvent(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 27;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            RefinancingAccountState refinancingAccountStateWriteTypedObject = loanRefinancingKcbAccountFragment.access100().writeTypedObject();
            if (refinancingAccountStateWriteTypedObject != null) {
                list = refinancingAccountStateWriteTypedObject.onNavigationEvent();
            } else {
                int i5 = access100 + 115;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                list = null;
            }
        }
        return loanRefinancingKcbAccountFragment.onWarmupCompleted((List<getDevNetworkType>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, Map.Entry entry, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
            if (z) {
                loanRefinancingKcbAccountFragment.onTransact.add(entry.getKey());
            } else {
                loanRefinancingKcbAccountFragment.onTransact.remove(entry.getKey());
            }
        } else if (z) {
        }
        loanRefinancingKcbAccountFragment.isEngagementSignalsApiAvailable();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final List<Object> onWarmupCompleted(List<getDevNetworkType> list) throws Throwable {
        LinkedHashMap linkedHashMap;
        Set setKeySet;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String string = getString(R.string.loan_refinancing_check_user_loan, new Object[]{PlayerErrorCode.onPostMessage()});
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new setBaseTime.extraCommand(string, (String) null, (TdsTopV1View.onExtraCallbackWithResult) null, (response) null, (response) null, (TdsTopV1View.onNavigationEvent) null, 0.0f, 126, (DefaultConstructorMarker) null));
        arrayList.add(new setBaseTime.newSessionWithExtras(14.0f));
        Object obj = null;
        if (list != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i2 = getInterfaceDescriptor + 77;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    linkedHashMap.get(((getDevNetworkType) it.next()).IAuthTabCallback_Parcel());
                    obj.hashCode();
                    throw null;
                }
                Object next = it.next();
                String strIAuthTabCallback_Parcel = ((getDevNetworkType) next).IAuthTabCallback_Parcel();
                Object arrayList2 = linkedHashMap.get(strIAuthTabCallback_Parcel);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strIAuthTabCallback_Parcel, arrayList2);
                }
                ((List) arrayList2).add(next);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null) {
            int i3 = getInterfaceDescriptor + 123;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                this.onTransact.addAll(setKeySet);
                obj.hashCode();
                throw null;
            }
            this.onTransact.addAll(setKeySet);
        }
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                getDevNetworkType getdevnetworktype = (getDevNetworkType) CollectionsKt.first((List) entry.getValue());
                String strOnTransact = getdevnetworktype.onTransact();
                String strAsBinder = getdevnetworktype.asBinder();
                String string2 = getString(R.string.loan_refinancing_account_count, new Object[]{Integer.valueOf(((List) entry.getValue()).size())});
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(new setBaseTime.readTypedObject(strOnTransact, strAsBinder, string2, true, new LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda2(this, entry)));
                arrayList.add(new setBaseTime.newSessionWithExtras(7.0f));
            }
        }
        arrayList.add(new setBaseTime.newSessionWithExtras(8.0f));
        arrayList.add(new setBaseTime.onWarmupCompleted(1.0f));
        String string3 = getString(R.string.loan_question_has_other_loan);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.loan_refinancing_connect_other_loans);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda3(this);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -115, -125, -118, -124, -109, -110, -125, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        arrayList.add(new setBaseTime.onMinimized(((String) objArr[0]).intern(), string3, string4, 0, 0, false, (LoanProductBadge) null, 8.0f, (String) null, (TdsListRowV1View.asBinder) null, 0, (Function0) null, externalSyntheticLambda3, 3960, (DefaultConstructorMarker) null));
        arrayList.add(new setBaseTime.newSessionWithExtras(40.0f));
        return arrayList;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            Fragment fragmentOnNavigationEvent = onNavigationEvent();
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return fragmentOnNavigationEvent;
            }
            throw null;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Fragment fragment = this.$this_viewModels;
            int i4 = i3 + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return fragment;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvoke = this.$ownerProducer.invoke();
            if (i3 == 0) {
                return (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) objInvoke;
            }
            int i4 = 44 / 0;
            return (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) objInvoke;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                int i3 = 63 / 0;
            } else {
                viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            }
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i2 = onWarmupCompleted + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback onextracallback = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedOnExtraCallback;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                boolean z = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate) instanceof TextFieldKeyInputExternalSyntheticLambda6;
                obj.hashCode();
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i3 = onNavigationEvent + 63;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    int i5 = onExtraCallback + 5;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return defaultViewModelProviderFactory;
                    }
                    throw null;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            int i6 = onNavigationEvent + 7;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return defaultViewModelProviderFactory2;
        }
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (this.onTransact.size() <= 0) {
            int i4 = getInterfaceDescriptor + 109;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            asBinder().onExtraCallback.setEnabledCta(false);
            TdsBottomCtaV1View tdsBottomCtaV1View = asBinder().onExtraCallback;
            String string = getString(R.string.loan_refinancing_funnel_account___870286fd7f);
            Intrinsics.checkNotNullExpressionValue(string, "");
            tdsBottomCtaV1View.setTopDescription(string);
        } else {
            asBinder().onExtraCallback.setEnabledCta(true);
            BaseTextView baseTextViewExtraCallbackWithResult = asBinder().onExtraCallback.extraCallbackWithResult();
            if (baseTextViewExtraCallbackWithResult != null) {
                baseTextViewExtraCallbackWithResult.setVisibility(8);
            }
        }
        String str = getString(R.string.loan_count, new Object[]{Integer.valueOf(this.onTransact.size())}) + " " + getString(R.string.loan_cta_connect);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = asBinder().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, str, new LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda1(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("kcb_yn", "Y");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 83;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1251649L, false, (String) null, (Map) null, new LoanRefinancingKcbAccountFragment$.ExternalSyntheticLambda0(), 14, (Object) null);
        loanRefinancingKcbAccountFragment.onExtraCallback(CollectionsKt.joinToString$default(loanRefinancingKcbAccountFragment.onTransact, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "refinancing_loan__connect_loan", true);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void aZ_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact().IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onTransact().IAuthTabCallback();
        int i3 = getInterfaceDescriptor + 101;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Map<String, Object> screenParams = super.getScreenParams();
            screenParams.put("kcb_yn", "Y");
            int i3 = getInterfaceDescriptor + 117;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return screenParams;
        }
        super.getScreenParams().put("kcb_yn", "Y");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asInterface() {
        int i = 2 % 2;
        startNativePerfMonitor startnativeperfmonitorAsBinder = asBinder();
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        RecyclerView recyclerView = startnativeperfmonitorAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, recyclerView, false, 0, 6, (Object) null);
        RecyclerView recyclerView2 = startnativeperfmonitorAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), 0);
        startnativeperfmonitorAsBinder.onNavigationEvent.setLayoutManager(new LinearLayoutManager(requireContext()));
        startnativeperfmonitorAsBinder.onNavigationEvent.setAdapter(this.IAuthTabCallback);
        this.IAuthTabCallback.onExtraCallbackWithResult(onNavigationEvent(this, null, 1, null));
        this.IAuthTabCallback.notifyDataSetChanged();
        isEngagementSignalsApiAvailable();
        startnativeperfmonitorAsBinder.onExtraCallbackWithResult.setBackgroundColor(accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted());
        FrameLayout frameLayout = startnativeperfmonitorAsBinder.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        int i2 = access100 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallbackDefault;
        if (cArr3 != null) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 77, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20952 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(access000)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 75 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (IAuthTabCallback_Parcel) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - Color.argb(0, 0, 0, 0), 12213 - Process.getGidForName(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallbackStubProxy) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $11 + 7;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 113;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] * iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 64 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 63, 12214 - Gravity.getAbsoluteGravity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
                j = 0;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment, RefinancingAccountState refinancingAccountState) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1590140333, new Object[]{loanRefinancingKcbAccountFragment, refinancingAccountState}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1590140335, iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingKcbAccountFragment loanRefinancingKcbAccountFragment) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1027875932, new Object[]{loanRefinancingKcbAccountFragment}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1027875932, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1359774863, new Object[]{setDetectableSize}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1359774864, iIAuthTabCallback);
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = new char[]{32392, 32388, 32384, 32389, 32638, 32577, 32407, 32399, 32405, 32578, 32385, 32387, 32386, 32393, 32580, 32440, 32579, 32396, 32443};
        access000 = -1184334032;
        IAuthTabCallbackStubProxy = true;
        IAuthTabCallback_Parcel = true;
    }
}
