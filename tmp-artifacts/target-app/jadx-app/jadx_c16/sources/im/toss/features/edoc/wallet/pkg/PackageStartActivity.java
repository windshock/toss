package im.toss.features.edoc.wallet.pkg;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.features.edoc.R;
import im.toss.features.edoc.wallet.DocumentWalletBaseActivity;
import im.toss.features.edoc.wallet.pkg.PackageIssueActivity;
import im.toss.features.edoc.wallet.pkg.PackageResultActivity;
import im.toss.features.edoc.wallet.pkg.PackageStartActivity$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;
import o.onFastRefresh;
import o.onPageExit;
import o.setProxySelectorokhttp;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PackageStartActivity extends DocumentWalletBaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 0;
    private static char onMessageChannelReady = 0;
    private static char onMinimized = 0;
    private static char onPostMessage = 0;
    private static int onRelationshipValidationResult = 0;
    public static final int onTransact;
    private static int onUnminimized = 1;
    private TdsBottomCtaV1View asBinder;
    private boolean writeTypedObject;
    private final String IAuthTabCallbackStubProxy = "package";
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda4(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda5(this));
    private final Lazy readTypedObject = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda6(this));
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda7(this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda8(this));
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda9(this));
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new PackageStartActivity$.ExternalSyntheticLambda10(this));
    private final IEngagementSignalsCallback_Parcel<Intent> access100 = onPageExit.onNavigationEvent(this, new PackageStartActivity$.ExternalSyntheticLambda11(this));
    private final Function0<Unit> access000 = new PackageStartActivity$.ExternalSyntheticLambda12(this);
    private final onNavigationEvent IAuthTabCallbackDefault = new onNavigationEvent(this);

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        onTransact = 8;
        int i = onUnminimized + 103;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String IAuthTabCallback(PackageStartActivity packageStartActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String interfaceDescriptor = getInterfaceDescriptor(packageStartActivity);
        int i4 = onActivityLayout + 45;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageStartActivity packageStartActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onActivityResized + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2095135269, iOnNavigationEvent2, new Object[]{packageStartActivity, commonModule_setLeftEdgeTouchEnabled}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2095135278, iOnNavigationEvent);
        int i4 = onActivityLayout + 5;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, str2, str3, setDetectableSize);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = onActivityResized + 91;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 41;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {packageStartActivity, view};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            onWarmupCompleted(iOnNavigationEvent3, 1006376741, iOnNavigationEvent2, objArr2, iOnNavigationEvent4, -1006376738, iOnNavigationEvent);
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted(iOnNavigationEvent3, 1006376741, iOnNavigationEvent2, objArr2, iOnNavigationEvent4, -1006376738, iOnNavigationEvent);
        int i4 = onActivityLayout + 39;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 75;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(packageStartActivity);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = onActivityLayout + 73;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return zAccess000;
    }

    public static /* synthetic */ Long asInterface(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Long lIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(packageStartActivity);
        int i4 = onActivityResized + 35;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return lIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return access100(packageStartActivity);
        }
        access100(packageStartActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageStartActivity packageStartActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityResized + 59;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1970270579, iOnNavigationEvent2, new Object[]{packageStartActivity, dialogInterface}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1970270584, iOnNavigationEvent);
        }
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PackageStartActivity packageStartActivity, String str, String str2, String str3, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(packageStartActivity, str, str2, str3, dialogInterface);
        }
        onExtraCallbackWithResult(packageStartActivity, str, str2, str3, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, str2, str3, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, setDetectableSize);
        int i3 = onActivityLayout + 33;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DocumentWalletConfigTitle onExtraCallbackWithResult(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy(packageStartActivity);
        }
        IAuthTabCallbackStubProxy(packageStartActivity);
        throw null;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(DocumentWalletConfigDoc documentWalletConfigDoc) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(documentWalletConfigDoc);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = onActivityLayout + 79;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return charSequenceIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(packageStartActivity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(packageStartActivity, iEngagementSignalsCallbackDefault);
        int i3 = onActivityResized + 89;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ List onNavigationEvent(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        List listIAuthTabCallbackDefault = IAuthTabCallbackDefault(packageStartActivity);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = onActivityLayout + 37;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return listIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PackageStartActivity packageStartActivity, String str, String str2, String str3, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(packageStartActivity, str, str2, str3, dialogInterface);
        int i4 = onActivityLayout + 1;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback(packageStartActivity);
        }
        ICustomTabsCallback(packageStartActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onTransact(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(packageStartActivity);
        int i4 = onActivityLayout + 5;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return strAsBinder;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(DocumentWalletConfigDoc documentWalletConfigDoc) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {documentWalletConfigDoc};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        CharSequence charSequence = (CharSequence) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1481941094, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1481941095, iOnNavigationEvent);
        int i4 = onActivityLayout + 57;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequence;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i2 | i5 | i6));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i6 | i5)) | (~(i13 | i8)) | (~(i2 | i6));
        int i16 = i2 + i5 + i3 + ((-298151579) * i) + ((-427515960) * i4);
        int i17 = i16 * i16;
        int i18 = (i2 * (-431502880)) + 875560960 + ((-431502880) * i5) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i3) + ((-16252928) * i) + (423624704 * i4) + (1109590016 * i17);
        int i19 = ((i2 * (-2003555040)) - 1632655964) + (i5 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i3 * (-2003554617)) + (i * 1812671363) + (i4 * (-1519508360)) + (i17 * (-1288372224));
        switch (i18 + (i19 * i19 * (-1796407296))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i20 = 2 % 2;
                int i21 = onActivityLayout + 57;
                onActivityResized = i21 % 128;
                int i22 = i21 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(packageStartActivity, setDetectableSize);
                int i23 = onActivityResized + 51;
                onActivityLayout = i23 % 128;
                int i24 = i23 % 2;
                return unitIAuthTabCallback;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, PackageStartActivity packageStartActivity, String str2, String str3, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onActivityResized + 47;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(str, packageStartActivity, str2, str3, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, packageStartActivity, str2, str3, commonModule_setLeftEdgeTouchEnabled);
        int i3 = onActivityLayout + 61;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, str3, setDetectableSize);
        int i4 = onActivityLayout + 87;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 3;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = i2 + 51;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return 1221397L;
    }

    public void onExtraCallback(long j, @NotNull onFastRefresh onfastrefresh) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onfastrefresh, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = onActivityLayout + 1;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 73;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.writeTypedObject) {
            int i4 = i2 + 15;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
            str = "y";
        } else {
            str = "n";
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("wallet_exist_yn", str);
        List<DocumentWalletConfigDoc> listWriteTypedList = writeTypedList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listWriteTypedList, 10));
        Iterator<T> it = listWriteTypedList.iterator();
        while (it.hasNext()) {
            int i6 = onActivityLayout + 103;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                arrayList.add(Long.valueOf(((DocumentWalletConfigDoc) it.next()).onNavigationEvent()));
                int i7 = 30 / 0;
            } else {
                arrayList.add(Long.valueOf(((DocumentWalletConfigDoc) it.next()).onNavigationEvent()));
            }
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("doc_code_list", CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("trx_id", onVerticalScrollEvent());
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("from", ICustomTabsService_Parcel());
        Object[] objArr = new Object[1];
        a(new char[]{1979, 43962, 33157, 55325, 22882, 41057, 42300, 50905}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr);
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onNavigationEvent())});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String ICustomTabsCallback(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = packageStartActivity.getIntent().getStringExtra("trxId");
        int i4 = onActivityLayout + 115;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    private final String onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.extraCallback.getValue();
        int i4 = onActivityResized + 111;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return str;
    }

    private final List<DocumentWalletConfigDoc> writeTypedList() {
        List<DocumentWalletConfigDoc> list;
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            list = (List) this.IAuthTabCallbackStub.getValue();
            int i3 = 92 / 0;
        } else {
            list = (List) this.IAuthTabCallbackStub.getValue();
        }
        int i4 = onActivityLayout + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List IAuthTabCallbackDefault(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        ArrayList parcelableArrayListExtra = packageStartActivity.getIntent().getParcelableArrayListExtra("docsInfo");
        if (parcelableArrayListExtra != null) {
            int i2 = onActivityResized + 11;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                return parcelableArrayListExtra;
            }
            throw null;
        }
        List listEmptyList = CollectionsKt.emptyList();
        int i3 = onActivityResized + 117;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return listEmptyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final DocumentWalletConfigTitle IAuthTabCallbackStubProxy(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletConfigTitle parcelableExtra = packageStartActivity.getIntent().getParcelableExtra("titleInfo");
        if (i3 != 0) {
            return parcelableExtra;
        }
        throw null;
    }

    private final DocumentWalletConfigTitle IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletConfigTitle documentWalletConfigTitle = (DocumentWalletConfigTitle) this.readTypedObject.getValue();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return documentWalletConfigTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean access000(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = packageStartActivity.getIntent().getBooleanExtra("submit", false);
        int i4 = onActivityResized + 109;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return booleanExtra;
    }

    private final boolean access200() {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.ICustomTabsCallback.getValue()).booleanValue();
        int i4 = onActivityResized + 119;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private final String ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asInterface.getValue();
        int i4 = onActivityLayout + 123;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asBinder(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = packageStartActivity.getIntent();
        if (i3 == 0) {
            intent.getStringExtra("from");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra("from");
        int i4 = onActivityResized + 69;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String getInterfaceDescriptor(PackageStartActivity packageStartActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = packageStartActivity.getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{1979, 43962, 33157, 55325, 22882, 41057, 42300, 50905}, Color.rgb(0, 0, 0) + 16777224, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = onActivityLayout + 111;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallback_Parcel.getValue();
        int i4 = onActivityLayout + 47;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final Long IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Long l = (Long) this.getInterfaceDescriptor.getValue();
        if (i3 == 0) {
            return l;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PackageStartActivity packageStartActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        packageStartActivity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        packageStartActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 55;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(PackageStartActivity packageStartActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(packageStartActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 25;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access100(PackageStartActivity packageStartActivity) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1221401L, false, (String) null, (Map) null, new PackageStartActivity$.ExternalSyntheticLambda18(packageStartActivity), 14, (Object) null);
        String strOnVerticalScrollEvent = packageStartActivity.onVerticalScrollEvent();
        if (strOnVerticalScrollEvent == null) {
            int i2 = onActivityLayout + 57;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            strOnVerticalScrollEvent = "";
        }
        String str = strOnVerticalScrollEvent;
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = EDocIssuableCandidate.onNavigationEvent.NATIVE;
        List<DocumentWalletConfigDoc> listWriteTypedList = packageStartActivity.writeTypedList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listWriteTypedList, 10));
        Iterator<T> it = listWriteTypedList.iterator();
        int i4 = onActivityLayout + 1;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((DocumentWalletConfigDoc) it.next()).onNavigationEvent()));
        }
        DocumentWalletBaseActivity.onExtraCallback(packageStartActivity, str, onnavigationevent, arrayList, false, 8, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        IEngagementSignalsCallbackStub();
        r4 = im.toss.features.edoc.wallet.pkg.PackageStartActivity.onActivityResized + 31;
        im.toss.features.edoc.wallet.pkg.PackageStartActivity.onActivityLayout = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r4 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        setContentView(ICustomTabsServiceStubProxy());
        String strOnVerticalScrollEvent = onVerticalScrollEvent();
        if (strOnVerticalScrollEvent != null) {
            int i2 = onActivityResized + 15;
            onActivityLayout = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new PackageStartActivity$.ExternalSyntheticLambda0(this));
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        packageStartActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 15;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.features.edoc.wallet.pkg.PackageStartActivity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ?? r0 = (PackageStartActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(r0.getString(R.string.bad_request_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new PackageStartActivity$.ExternalSyntheticLambda3((PackageStartActivity) r0));
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityLayout + 21;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (onMessageChannelReady ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onPostMessage);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                        int iGreen = 12434 - Color.green(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, keyRepeatTimeout, iGreen, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onMinimized)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.keyCodeFromString("") + 10, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 16014), Process.getGidForName("") + 15, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $10 + 109;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1 r2
      0x0027: PHI (r1v5 java.util.List) = (r1v4 java.util.List), (r1v8 java.util.List) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r2v2 viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle) = 
      (r2v1 viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle)
      (r2v9 viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IEngagementSignalsCallbackStub() {
        List listCreateListBuilder;
        DocumentWalletConfigTitle documentWalletConfigTitleIEngagementSignalsCallbackDefault;
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            listCreateListBuilder = CollectionsKt.createListBuilder();
            documentWalletConfigTitleIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault();
            int i3 = 87 / 0;
            if (documentWalletConfigTitleIEngagementSignalsCallbackDefault != null) {
                listCreateListBuilder.add(documentWalletConfigTitleIEngagementSignalsCallbackDefault);
            }
        } else {
            listCreateListBuilder = CollectionsKt.createListBuilder();
            documentWalletConfigTitleIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault();
            if (documentWalletConfigTitleIEngagementSignalsCallbackDefault != null) {
            }
        }
        listCreateListBuilder.add(20);
        List<DocumentWalletConfigDoc> listWriteTypedList = writeTypedList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listWriteTypedList) {
            if (!((DocumentWalletConfigDoc) obj).onTransact()) {
                int i4 = onActivityResized + 29;
                onActivityLayout = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            int i6 = onActivityResized + 113;
            onActivityLayout = i6 % 128;
            if (i6 % 2 == 0) {
                DocumentWalletConfigDoc documentWalletConfigDoc = (DocumentWalletConfigDoc) it.next();
                documentWalletConfigDoc.onExtraCallbackWithResult(i5);
                arrayList2.add(documentWalletConfigDoc);
                i5 += 68;
            } else {
                DocumentWalletConfigDoc documentWalletConfigDoc2 = (DocumentWalletConfigDoc) it.next();
                documentWalletConfigDoc2.onExtraCallbackWithResult(i5);
                arrayList2.add(documentWalletConfigDoc2);
                i5++;
            }
        }
        listCreateListBuilder.addAll(arrayList2);
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult(CollectionsKt.build(listCreateListBuilder), true);
    }

    public void updateVisuals() {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 733236701, iOnNavigationEvent2, new Object[]{this}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -733236697, iOnNavigationEvent);
        int i4 = onActivityLayout + 33;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {86, 117, -27, 75};
        private static final int $$b = 225;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 478308898;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, byte b) {
            int i2;
            int i3;
            int i4 = 4 - (b * 2);
            byte[] bArr = $$a;
            int i5 = 105 - (i * 4);
            int i6 = s * 3;
            byte[] bArr2 = new byte[i6 + 1];
            if (bArr == null) {
                int i7 = i4;
                int i8 = 0;
                i4 += i5;
                i3 = i7 + 1;
                i2 = i8;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i2 + 1;
                i7 = i3;
                i5 = bArr[i3];
                i8 = i9;
                i4 += i5;
                i3 = i7 + 1;
                i2 = i8;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                i4 = i5;
                i3 = i4;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                j = 0;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 115;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 35125), 22 - Process.getGidForName(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                int i9 = $10 + 113;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z) {
                int i11 = $10 + 85;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ExpandableListView.getPackedPositionChild(j)), 55 - View.MeasureSpec.getMode(0), KeyEvent.getDeadChar(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    j = 0;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @Nullable DocumentWalletConfigTitle documentWalletConfigTitle, @Nullable List<DocumentWalletConfigDoc> list, boolean z, @Nullable String str2, @Nullable String str3, @Nullable Long l) throws Throwable {
            List<DocumentWalletConfigDoc> listEmptyList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PackageStartActivity.class);
            intent.putExtra("trxId", str);
            intent.putExtra("titleInfo", (Parcelable) documentWalletConfigTitle);
            if (list != null) {
                int i2 = onExtraCallbackWithResult + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                listEmptyList = list;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            intent.putExtra("docsInfo", new ArrayList(listEmptyList));
            intent.putExtra("submit", z);
            intent.putExtra("from", str2);
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{7, 65530, 7, 7, 65530, 65531, 65530, 7}, true, 118 - KeyEvent.keyCodeFromString(""), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str3);
            intent.putExtra("placeId", l);
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return intent;
        }
    }

    private static final CharSequence IAuthTabCallback(DocumentWalletConfigDoc documentWalletConfigDoc) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        String strValueOf = String.valueOf((Long) DocumentWalletConfigDoc.onExtraCallbackWithResult(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1522766293, new Object[]{documentWalletConfigDoc}, iOnExtraCallback2, -1522766293, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()));
        int i4 = onActivityLayout + 125;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return strValueOf;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DocumentWalletConfigDoc documentWalletConfigDoc = (DocumentWalletConfigDoc) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(documentWalletConfigDoc.onExtraCallback());
        int i4 = onActivityLayout + 7;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return strValueOf;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 31;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_no", str);
        setDetectableSize.onExtraCallback("doc_name", str2);
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        Object[] objArr = new Object[1];
        a(new char[]{43680, 38161, 27845, 58516, 23013, 41861}, 5 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str3);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 65;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r2
      0x0035: PHI (r2v10 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>) = 
      (r2v5 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>)
      (r2v6 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>)
      (r2v15 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>)
     binds: [B:8:0x002a, B:10:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r2
      0x002c: PHI (r2v6 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>) = 
      (r2v5 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>)
      (r2v15 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc>)
     binds: [B:8:0x002a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.content.Context, im.toss.features.edoc.wallet.pkg.PackageStartActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        List<DocumentWalletConfigDoc> listWriteTypedList;
        ?? r15 = (PackageStartActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 31;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            listWriteTypedList = r15.writeTypedList();
            int i3 = 65 / 0;
            if (listWriteTypedList instanceof Collection) {
                if (!listWriteTypedList.isEmpty()) {
                    Iterator it = listWriteTypedList.iterator();
                    while (it.hasNext()) {
                        int i4 = onActivityResized + 77;
                        onActivityLayout = i4 % 128;
                        if (i4 % 2 == 0) {
                            Object[] objArr2 = {(DocumentWalletConfigDoc) it.next()};
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr3 = {(DocumentWalletConfigDoc) it.next()};
                        if (((Long) DocumentWalletConfigDoc.onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1522766293, objArr3, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1522766293, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())) == null) {
                            List<DocumentWalletConfigDoc> listWriteTypedList2 = r15.writeTypedList();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(listWriteTypedList2, 10)), 16));
                            for (DocumentWalletConfigDoc documentWalletConfigDoc : listWriteTypedList2) {
                                Long lValueOf = Long.valueOf(documentWalletConfigDoc.onNavigationEvent());
                                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                                int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(lValueOf, (Long) DocumentWalletConfigDoc.onExtraCallbackWithResult(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1522766293, new Object[]{documentWalletConfigDoc}, iOnExtraCallback2, -1522766293, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()));
                                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
                            }
                            r15.onNavigationEvent(linkedHashMap);
                            return null;
                        }
                    }
                }
            }
        } else {
            listWriteTypedList = r15.writeTypedList();
            if (listWriteTypedList instanceof Collection) {
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(r15.writeTypedList(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new PackageStartActivity$.ExternalSyntheticLambda14(), 30, (Object) null);
        String strJoinToString$default2 = CollectionsKt.joinToString$default(r15.writeTypedList(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new PackageStartActivity$.ExternalSyntheticLambda15(), 30, (Object) null);
        String string = r15.getString(R.string.edoc_wallet_pkg___cb200180f8);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1232623L, false, (String) null, (Map) null, new PackageStartActivity$.ExternalSyntheticLambda16(strJoinToString$default, strJoinToString$default2, string), 14, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r15, new PackageStartActivity$.ExternalSyntheticLambda17(string, (PackageStartActivity) r15, strJoinToString$default, strJoinToString$default2));
        int i5 = onActivityLayout + 7;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallback(String str, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_no", str);
        setDetectableSize.onExtraCallback("doc_name", str2);
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        setDetectableSize.onExtraCallback("button_type", "new");
        Object[] objArr = new Object[1];
        a(new char[]{43680, 38161, 27845, 58516, 23013, 41861}, (KeyEvent.getMaxKeyCode() >> 16) + 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str3);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 41;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(PackageStartActivity packageStartActivity, String str, String str2, String str3, DialogInterface dialogInterface) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1232625L, false, (String) null, (Map) null, new PackageStartActivity$.ExternalSyntheticLambda1(str, str2, str3), 14, (Object) null);
        List<DocumentWalletConfigDoc> listWriteTypedList = packageStartActivity.writeTypedList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(listWriteTypedList, 10)), 16));
        Iterator<T> it = listWriteTypedList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            int i2 = onActivityResized + 75;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Long.valueOf(((DocumentWalletConfigDoc) it.next()).onNavigationEvent()), (Object) null);
            linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
        }
        packageStartActivity.onNavigationEvent(linkedHashMap);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 91;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(String str, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_no", str);
        setDetectableSize.onExtraCallback("doc_name", str2);
        setDetectableSize.onExtraCallback("from_pkg", "Y");
        setDetectableSize.onExtraCallback("button_type", "skip");
        Object[] objArr = new Object[1];
        a(new char[]{43680, 38161, 27845, 58516, 23013, 41861}, Gravity.getAbsoluteGravity(0, 0) + 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str3);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 53;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(PackageStartActivity packageStartActivity, String str, String str2, String str3, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1232625L, false, (String) null, (Map) null, new PackageStartActivity$.ExternalSyntheticLambda2(str, str2, str3), 14, (Object) null);
        packageStartActivity.onSessionEnded();
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityLayout + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(String str, PackageStartActivity packageStartActivity, String str2, String str3, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        String string = packageStartActivity.getString(R.string.edoc_wallet_pkg___65e3bb24ab);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.INLINE;
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, new PackageStartActivity$.ExternalSyntheticLambda19(packageStartActivity, str2, str3, str), 4, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = packageStartActivity.getString(viva.republica.toss.R.string.skip);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, new PackageStartActivity$.ExternalSyntheticLambda20(packageStartActivity, str2, str3, str), 4, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityResized + 35;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(Map<Long, Long> map) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        this.access100.onNavigationEvent(PackageIssueActivity.onWarmupCompleted.IAuthTabCallback(PackageIssueActivity.Companion, this, onVerticalScrollEvent(), access200(), (List) null, map, ICustomTabsService_Parcel(), onNavigationEvent(), IEngagementSignalsCallback(), 8, (Object) null));
        int i4 = onActivityResized + 49;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() {
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.access100;
        PackageResultActivity.onExtraCallback onextracallback = PackageResultActivity.Companion;
        String strOnVerticalScrollEvent = onVerticalScrollEvent();
        boolean zAccess200 = access200();
        List<DocumentWalletConfigDoc> listWriteTypedList = writeTypedList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listWriteTypedList.iterator();
        int i2 = onActivityLayout + 29;
        while (true) {
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                Object[] objArr = {(DocumentWalletConfigDoc) it.next()};
                Long l = (Long) DocumentWalletConfigDoc.onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1522766293, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1522766293, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
                if (l != null) {
                    int i4 = onActivityResized + 33;
                    onActivityLayout = i4 % 128;
                    if (i4 % 2 == 0) {
                        arrayList.add(l);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(l);
                    i2 = onActivityLayout + 5;
                }
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(PackageResultActivity.onExtraCallback.onExtraCallbackWithResult(onextracallback, this, strOnVerticalScrollEvent, null, zAccess200, false, null, null, arrayList, ICustomTabsService_Parcel(), onNavigationEvent(), IEngagementSignalsCallback(), false, 2164, null));
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LinearLayout ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = onActivityLayout + 83;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRecyclerView.setLayoutManager(new LinearLayoutManager(tdsRecyclerView.getContext(), 1, false));
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsRecyclerView.setLayoutParams(layoutParams);
        tdsRecyclerView.setClipToPadding(false);
        tdsRecyclerView.setAdapter(this.IAuthTabCallbackDefault);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, viva.republica.toss.R.string.next, new PackageStartActivity$.ExternalSyntheticLambda13(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, tdsRecyclerView, false, 0, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        this.asBinder = tdsBottomCtaV1View;
        int i4 = onActivityLayout + 5;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PackageStartActivity packageStartActivity = (PackageStartActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        packageStartActivity.access000.invoke();
        int i4 = onActivityLayout + 47;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, im.toss.features.edoc.wallet.pkg.PackageStartActivity] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object[]] */
    private static final Long IAuthTabCallback_Parcel(PackageStartActivity packageStartActivity) {
        Bundle extras;
        Object next;
        int i = 2 % 2;
        Intent intent = packageStartActivity.getIntent();
        if (intent == null) {
            return null;
        }
        int i2 = onActivityResized + 33;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            extras = intent.getExtras();
            int i3 = 41 / 0;
            if (extras == null) {
                return null;
            }
        } else {
            extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
        }
        if (!extras.containsKey("placeId")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("placeId") : null;
            return (Long) (obj instanceof Long ? obj : null);
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null) {
            return null;
        }
        int i4 = onActivityLayout + 99;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        ?? string = extras3.getString("placeId");
        if (string == 0) {
            return null;
        }
        if (Intrinsics.areEqual(Long.class, Integer.class)) {
            string = StringsKt.toIntOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Float.class)) {
            string = StringsKt.toFloatOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Double.class)) {
            string = StringsKt.toDoubleOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
            string = StringsKt.toByteOrNull((String) string);
        } else if (!(!Intrinsics.areEqual(Long.class, Boolean.class))) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else if (Intrinsics.areEqual(Long.class, Character.class)) {
            string = Character.valueOf(string.charAt(0));
        } else if (!Intrinsics.areEqual(Long.class, String.class)) {
            if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSplit$default) {
                    if (((String) obj2).length() > 0) {
                        int i6 = onActivityLayout + 95;
                        onActivityResized = i6 % 128;
                        int i7 = i6 % 2;
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i8 = onActivityLayout + 109;
                    onActivityResized = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                        int i9 = 10 / 0;
                    } else {
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                    }
                }
                string = arrayList2.toArray(new Integer[0]);
            } else if (Intrinsics.areEqual(Long.class, Long[].class)) {
                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listSplit$default2) {
                    if (((String) obj3).length() > 0) {
                        int i10 = onActivityResized + 27;
                        onActivityLayout = i10 % 128;
                        if (i10 % 2 == 0) {
                            arrayList3.add(obj3);
                            throw null;
                        }
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (!(!it2.hasNext())) {
                    int i11 = onActivityLayout + 5;
                    onActivityResized = i11 % 128;
                    int i12 = i11 % 2;
                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                }
                string = arrayList4.toArray(new Long[0]);
            } else if (Intrinsics.areEqual(Long.class, Float[].class)) {
                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : listSplit$default3) {
                    if (((String) obj4).length() > 0) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    int i13 = onActivityResized + 89;
                    onActivityLayout = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                        int i14 = 88 / 0;
                    } else {
                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                    }
                }
                string = arrayList6.toArray(new Float[0]);
            } else if (Intrinsics.areEqual(Long.class, Double[].class)) {
                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : listSplit$default4) {
                    if (((String) obj5).length() > 0) {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                }
                string = arrayList8.toArray(new Double[0]);
            } else if (Intrinsics.areEqual(Long.class, Short[].class)) {
                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj6 : listSplit$default5) {
                    if (((String) obj6).length() > 0) {
                        arrayList9.add(obj6);
                    }
                }
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                }
                string = arrayList10.toArray(new Short[0]);
            } else if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : listSplit$default6) {
                    if (((String) obj7).length() > 0) {
                        arrayList11.add(obj7);
                    }
                }
                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                }
                string = arrayList12.toArray(new Byte[0]);
            } else if (Intrinsics.areEqual(Long.class, Boolean[].class)) {
                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList13 = new ArrayList();
                for (Object obj8 : listSplit$default7) {
                    if (((String) obj8).length() > 0) {
                        arrayList13.add(obj8);
                    }
                }
                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                Iterator it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    int i15 = onActivityResized + 67;
                    onActivityLayout = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                }
                string = arrayList14.toArray(new Boolean[0]);
            } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : listSplit$default8) {
                    if (((String) obj9).length() > 0) {
                        arrayList15.add(obj9);
                    }
                }
                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                Iterator it8 = arrayList15.iterator();
                while (it8.hasNext()) {
                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                }
                string = arrayList16.toArray(new Character[0]);
            } else if (Intrinsics.areEqual(Long.class, String[].class)) {
                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList17 = new ArrayList();
                for (Object obj10 : listSplit$default9) {
                    if (((String) obj10).length() > 0) {
                        arrayList17.add(obj10);
                    }
                }
                string = arrayList17.toArray(new String[0]);
            } else {
                Object[] enumConstants = Long.class.getEnumConstants();
                if (enumConstants != null) {
                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                    for (Object obj11 : enumConstants) {
                        Intrinsics.checkNotNull(obj11, "");
                        arrayList18.add((Enum) obj11);
                    }
                    Iterator it9 = arrayList18.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                            break;
                        }
                    }
                    string = (Enum) next;
                } else {
                    string = 0;
                }
                if (string == 0) {
                    int i17 = onActivityLayout + 91;
                    onActivityResized = i17 % 128;
                    int i18 = i17 % 2;
                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                        throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                    }
                    int i19 = onActivityResized + 65;
                    onActivityLayout = i19 % 128;
                    int i20 = i19 % 2;
                    string = 0;
                }
            }
        }
        return (Long) (string instanceof Long ? string : null);
    }

    public static /* synthetic */ void onWarmupCompleted(PackageStartActivity packageStartActivity, View view) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1701904763, iOnNavigationEvent2, new Object[]{packageStartActivity, view}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1701904756, iOnNavigationEvent);
    }

    public static /* synthetic */ String onWarmupCompleted(PackageStartActivity packageStartActivity) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -605089202, iOnNavigationEvent2, new Object[]{packageStartActivity}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 605089210, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PackageStartActivity packageStartActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2009925962, iOnNavigationEvent2, new Object[]{packageStartActivity, iEngagementSignalsCallbackDefault}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2009925962, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(PackageStartActivity packageStartActivity, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1287033057, iOnNavigationEvent2, new Object[]{packageStartActivity, setDetectableSize}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287033059, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, String str3, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2083493135, iOnNavigationEvent2, new Object[]{str, str2, str3, setDetectableSize}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2083493129, iOnNavigationEvent);
    }

    private final void validateRelationship() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 733236701, iOnNavigationEvent2, new Object[]{this}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -733236697, iOnNavigationEvent);
    }

    private static final CharSequence onExtraCallbackWithResult(DocumentWalletConfigDoc documentWalletConfigDoc) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (CharSequence) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1481941094, iOnNavigationEvent2, new Object[]{documentWalletConfigDoc}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1481941095, iOnNavigationEvent);
    }

    private static final void IAuthTabCallback(PackageStartActivity packageStartActivity, View view) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1006376741, iOnNavigationEvent2, new Object[]{packageStartActivity, view}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1006376738, iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(PackageStartActivity packageStartActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2095135269, iOnNavigationEvent2, new Object[]{packageStartActivity, commonModule_setLeftEdgeTouchEnabled}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2095135278, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(PackageStartActivity packageStartActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1970270579, iOnNavigationEvent2, new Object[]{packageStartActivity, dialogInterface}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1970270584, iOnNavigationEvent);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onActivityResized + 79;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityResized + 39;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onActivityLayout + 117;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onActivityResized + 29;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        extraCallbackWithResult = (char) 26674;
        onMinimized = (char) 37015;
        onMessageChannelReady = (char) 33525;
        onPostMessage = (char) 24036;
    }
}
