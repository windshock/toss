package im.toss.activitydelegate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import im.toss.activitydelegate.DelegateActivity;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.uikit.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.getVisibilityChangeInfo;
import o.onSessionEnded;
import o.setTaggedAddrCtrl;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DelegateActivity extends Hilt_DelegateActivity {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 1;
    private static int access100;
    private static int asBinder;
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.activitydelegate.DelegateActivity$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DelegateActivity delegateActivity = this.f$0;
            if (i3 == 0) {
                return DelegateActivity.onNavigationEvent(delegateActivity);
            }
            DelegateActivity.onNavigationEvent(delegateActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: im.toss.activitydelegate.DelegateActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                DelegateActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
                int i3 = 9 / 0;
            } else {
                DelegateActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    });
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int asInterface = 8;
    private static final Map<String, getVisibilityChangeInfo> IAuthTabCallbackDefault = new LinkedHashMap();

    public static /* synthetic */ String onNavigationEvent(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(delegateActivity);
        int i4 = asBinder + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(delegateActivity, iEngagementSignalsCallbackDefault);
        int i4 = asBinder + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public static final /* synthetic */ Map onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, getVisibilityChangeInfo> map = IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return map;
    }

    private final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i3 = asBinder + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static final void onExtraCallback(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Function2<DelegateActivity, IEngagementSignalsCallbackDefault, Unit> function2IAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            IAuthTabCallbackDefault.get(delegateActivity.IAuthTabCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(delegateActivity.IAuthTabCallback());
        if (getvisibilitychangeinfo == null || (function2IAuthTabCallback = getvisibilitychangeinfo.IAuthTabCallback()) == null) {
            return;
        }
        int i3 = asBinder + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        function2IAuthTabCallback.invoke(delegateActivity, iEngagementSignalsCallbackDefault);
        if (i4 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) {
        getVisibilityChangeInfo getvisibilitychangeinfo;
        int i = 2 % 2;
        super.onCreate(bundle);
        String strIAuthTabCallback = IAuthTabCallback();
        if (strIAuthTabCallback == null || strIAuthTabCallback.length() == 0) {
            finish();
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            setTheme(R.style.WhiteTheme_Transparent);
            getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
            int i3 = 38 / 0;
            if (getvisibilitychangeinfo == null) {
                return;
            }
        } else {
            setTheme(R.style.WhiteTheme_Transparent);
            getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
            if (getvisibilitychangeinfo == null) {
                return;
            }
        }
        Function2<DelegateActivity, Bundle, Unit> function2OnExtraCallbackWithResult = getvisibilitychangeinfo.onExtraCallbackWithResult();
        if (function2OnExtraCallbackWithResult != null) {
            int i4 = asBinder + 7;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                function2OnExtraCallbackWithResult.invoke(this, bundle);
            } else {
                function2OnExtraCallbackWithResult.invoke(this, bundle);
                throw null;
            }
        }
    }

    @Override // im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        Function1<DelegateActivity, Unit> function1AsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo == null || (function1AsInterface = getvisibilitychangeinfo.asInterface()) == null) {
            return;
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        function1AsInterface.invoke(this);
        int i6 = IAuthTabCallbackStubProxy + 121;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        Function1<DelegateActivity, Unit> function1IAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo == null || (function1IAuthTabCallbackStub = getvisibilitychangeinfo.IAuthTabCallbackStub()) == null) {
            return;
        }
        function1IAuthTabCallbackStub.invoke(this);
        int i4 = IAuthTabCallbackStubProxy + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        super.onPause();
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo != null) {
            int i2 = IAuthTabCallbackStubProxy + 115;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Function1<DelegateActivity, Unit> function1OnNavigationEvent = getvisibilitychangeinfo.onNavigationEvent();
            if (function1OnNavigationEvent != null) {
                int i4 = asBinder + 63;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                function1OnNavigationEvent.invoke(this);
                if (i5 == 0) {
                    throw null;
                }
            }
        }
    }

    @Override // im.toss.base.BaseActivity
    public void onStop() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo != null) {
            int i4 = asBinder + 37;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                getvisibilitychangeinfo.IAuthTabCallbackDefault();
                throw null;
            }
            Function1<DelegateActivity, Unit> function1IAuthTabCallbackDefault = getvisibilitychangeinfo.IAuthTabCallbackDefault();
            if (function1IAuthTabCallbackDefault != null) {
                int i5 = asBinder + 81;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                function1IAuthTabCallbackDefault.invoke(this);
                if (i6 == 0) {
                    throw null;
                }
            }
        }
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Map<String, getVisibilityChangeInfo> map = IAuthTabCallbackDefault;
        getVisibilityChangeInfo getvisibilitychangeinfo = map.get(IAuthTabCallback());
        if (getvisibilitychangeinfo != null) {
            int i4 = asBinder + 97;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Function1<DelegateActivity, Unit> function1OnWarmupCompleted = getvisibilitychangeinfo.onWarmupCompleted();
            if (function1OnWarmupCompleted != null) {
                function1OnWarmupCompleted.invoke(this);
            }
        }
        TypeIntrinsics.asMutableMap(map).remove(IAuthTabCallback());
    }

    @Override // im.toss.base.BaseActivity
    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        setTaggedAddrCtrl<DelegateActivity, Integer, String[], int[], Unit> settaggedaddrctrlAsBinder;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo == null || (settaggedaddrctrlAsBinder = getvisibilitychangeinfo.asBinder()) == null) {
            return;
        }
        int i3 = IAuthTabCallbackStubProxy + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        settaggedaddrctrlAsBinder.invoke(this, Integer.valueOf(i), strArr, iArr);
        int i5 = asBinder + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r1 = ((java.lang.Boolean) r1.invoke(r5)).booleanValue();
        r2 = im.toss.activitydelegate.DelegateActivity.asBinder + 85;
        im.toss.activitydelegate.DelegateActivity.IAuthTabCallbackStubProxy = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r1 != null) goto L10;
     */
    @Override // im.toss.base.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean bg_() {
        int i = 2 % 2;
        getVisibilityChangeInfo getvisibilitychangeinfo = IAuthTabCallbackDefault.get(IAuthTabCallback());
        if (getvisibilitychangeinfo != null) {
            int i2 = IAuthTabCallbackStubProxy + 65;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Function1<DelegateActivity, Boolean> function1OnExtraCallback = getvisibilitychangeinfo.onExtraCallback();
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
        }
        return false;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            Unit unit = (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, new Object[]{delegateActivity}, iOnNavigationEvent2, iOnNavigationEvent, 405653792, -405653790);
            int i4 = IAuthTabCallback + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return unit;
        }

        public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(delegateActivity, bundle);
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(delegateActivity, bundle);
            int i3 = onExtraCallback + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        private static final boolean IAuthTabCallbackStubProxy(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            int i4 = onExtraCallback + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = (~((~i4) | i6)) | i5;
            int i8 = ~i5;
            int i9 = (~(i8 | i6)) | (~(i8 | i4)) | (~(i6 | i4));
            int i10 = (~(i4 | (~i6))) | i8;
            int i11 = i5 + i6 + i3 + ((-2137991558) * i2) + (111092868 * i);
            int i12 = i11 * i11;
            int i13 = (((-431794203) * i5) - 566755328) + (427185167 * i6) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i3) + ((-1247805440) * i2) + ((-1807745024) * i) + ((-591921152) * i12);
            int i14 = (i5 * (-1469267343)) + 1003592187 + (i6 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i3 * (-1469268067)) + (i2 * 1951436498) + (i * (-746069772)) + (i12 * (-1529348096));
            int i15 = i13 + (i14 * i14 * 1762131968);
            return i15 != 1 ? i15 != 2 ? i15 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
        }

        public static /* synthetic */ Unit onExtraCallback(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asInterface(delegateActivity);
            }
            asInterface(delegateActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(delegateActivity);
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallbackDefault;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onNavigationEvent(delegateActivity, iEngagementSignalsCallbackDefault);
                obj.hashCode();
                throw null;
            }
            Unit unitOnNavigationEvent = onNavigationEvent(delegateActivity, iEngagementSignalsCallbackDefault);
            int i3 = IAuthTabCallback + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {delegateActivity, Integer.valueOf(i), strArr, iArr};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            Unit unit = (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1178140508, -1178140508);
            int i5 = IAuthTabCallback + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public static /* synthetic */ boolean onNavigationEvent(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(delegateActivity);
            int i4 = IAuthTabCallback + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallbackStubProxy;
        }

        public static /* synthetic */ Unit onTransact(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            Unit unit = (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, new Object[]{delegateActivity}, iOnNavigationEvent2, iOnNavigationEvent, 1729239540, -1729239537);
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onWarmupCompleted(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = asBinder(delegateActivity);
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitAsBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ void IAuthTabCallback(onNavigationEvent onnavigationevent, Context context, Integer num, boolean z, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function1 function16, int i, Object obj) {
            boolean z2;
            Function2 function23;
            Function1 function17;
            Function2 function24;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 83;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            Integer num2 = (i3 % 2 != 0 ? (i & 2) == 0 : (i & 4) == 0) ? num : null;
            if ((i & 4) != 0) {
                int i5 = i4 + 73;
                onExtraCallback = i5 % 128;
                z2 = i5 % 2 != 0;
            } else {
                z2 = z;
            }
            if ((i & 8) != 0) {
                function23 = new Function2() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 25;
                        IAuthTabCallback = i7 % 128;
                        DelegateActivity delegateActivity = (DelegateActivity) obj2;
                        Bundle bundle = (Bundle) obj3;
                        if (i7 % 2 == 0) {
                            return DelegateActivity.onNavigationEvent.IAuthTabCallback(delegateActivity, bundle);
                        }
                        DelegateActivity.onNavigationEvent.IAuthTabCallback(delegateActivity, bundle);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                int i6 = onExtraCallback + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                function23 = function2;
            }
            if ((i & 16) != 0) {
                function17 = new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 19;
                        onExtraCallbackWithResult = i9 % 128;
                        DelegateActivity delegateActivity = (DelegateActivity) obj2;
                        if (i9 % 2 != 0) {
                            return DelegateActivity.onNavigationEvent.onExtraCallbackWithResult(delegateActivity);
                        }
                        DelegateActivity.onNavigationEvent.onExtraCallbackWithResult(delegateActivity);
                        throw null;
                    }
                };
                int i8 = IAuthTabCallback + 65;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                function17 = function1;
            }
            Function1 function18 = (i & 32) != 0 ? new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 33;
                    IAuthTabCallback = i11 % 128;
                    Object obj3 = null;
                    DelegateActivity delegateActivity = (DelegateActivity) obj2;
                    if (i11 % 2 != 0) {
                        DelegateActivity.onNavigationEvent.IAuthTabCallback(delegateActivity);
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = DelegateActivity.onNavigationEvent.IAuthTabCallback(delegateActivity);
                    int i12 = IAuthTabCallback + 81;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            } : function12;
            Function1 function19 = (i & 64) != 0 ? new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnWarmupCompleted = DelegateActivity.onNavigationEvent.onWarmupCompleted((DelegateActivity) obj2);
                    int i13 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnWarmupCompleted;
                }
            } : function13;
            Function1 function110 = (i & 128) != 0 ? new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallback = DelegateActivity.onNavigationEvent.onExtraCallback((DelegateActivity) obj2);
                    int i13 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnExtraCallback;
                }
            } : function14;
            Function1 function111 = (i & 256) != 0 ? new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 67;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnTransact = DelegateActivity.onNavigationEvent.onTransact((DelegateActivity) obj2);
                    if (i12 == 0) {
                        int i13 = 99 / 0;
                    }
                    int i14 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 18 / 0;
                    }
                    return unitOnTransact;
                }
            } : function15;
            if ((i & 512) != 0) {
                function24 = new Function2() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 95;
                        IAuthTabCallback = i11 % 128;
                        DelegateActivity delegateActivity = (DelegateActivity) obj2;
                        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) obj3;
                        if (i11 % 2 != 0) {
                            return DelegateActivity.onNavigationEvent.onExtraCallbackWithResult(delegateActivity, iEngagementSignalsCallbackDefault);
                        }
                        DelegateActivity.onNavigationEvent.onExtraCallbackWithResult(delegateActivity, iEngagementSignalsCallbackDefault);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                int i10 = onExtraCallback + 113;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                function24 = function22;
            }
            Object[] objArr = {onnavigationevent, context, num2, Boolean.valueOf(z2), function23, function17, function18, function19, function110, function111, function24, (i & 1024) != 0 ? new setTaggedAddrCtrl() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda7
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 29;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    DelegateActivity delegateActivity = (DelegateActivity) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    String[] strArr = (String[]) obj4;
                    int[] iArr = (int[]) obj5;
                    if (i14 == 0) {
                        return DelegateActivity.onNavigationEvent.onNavigationEvent(delegateActivity, iIntValue, strArr, iArr);
                    }
                    DelegateActivity.onNavigationEvent.onNavigationEvent(delegateActivity, iIntValue, strArr, iArr);
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            } : settaggedaddrctrl, (i & 2048) != 0 ? new Function1() { // from class: im.toss.activitydelegate.DelegateActivity$Companion$$ExternalSyntheticLambda8
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 17;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    boolean zOnNavigationEvent = DelegateActivity.onNavigationEvent.onNavigationEvent((DelegateActivity) obj2);
                    if (i14 != 0) {
                        Boolean.valueOf(zOnNavigationEvent);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(zOnNavigationEvent);
                    int i15 = onNavigationEvent + 73;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return boolValueOf;
                }
            } : function16};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1317693793, -1317693792);
        }

        private static final Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit IAuthTabCallbackDefault(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return unit;
        }

        private static final Unit asBinder(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit asInterface(DelegateActivity delegateActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(delegateActivity, "");
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit2 = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
            return unit2;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(delegateActivity, "");
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit2 = Unit.INSTANCE;
            int i3 = onExtraCallback + 89;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            throw null;
        }

        private static final Unit onNavigationEvent(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(delegateActivity, "");
                Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            int i3 = 56 / 0;
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
            ((Number) objArr[1]).intValue();
            String[] strArr = (String[]) objArr[2];
            int[] iArr = (int[]) objArr[3];
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            Context context = (Context) objArr[1];
            Integer num = (Integer) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            Function2 function2 = (Function2) objArr[4];
            Function1 function1 = (Function1) objArr[5];
            Function1 function12 = (Function1) objArr[6];
            Function1 function13 = (Function1) objArr[7];
            Function1 function14 = (Function1) objArr[8];
            Function1 function15 = (Function1) objArr[9];
            Function2 function22 = (Function2) objArr[10];
            setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[11];
            Function1 function16 = (Function1) objArr[12];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            Intrinsics.checkNotNullParameter(function15, "");
            Intrinsics.checkNotNullParameter(function22, "");
            Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
            Intrinsics.checkNotNullParameter(function16, "");
            onnavigationevent.onExtraCallback(context, num, zBooleanValue, new getVisibilityChangeInfo(function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16));
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return null;
        }

        public final void onExtraCallback(@NotNull Context context, @Nullable Integer num, boolean z, @NotNull getVisibilityChangeInfo getvisibilitychangeinfo) {
            Class cls;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getvisibilitychangeinfo, "");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            DelegateActivity.onExtraCallback().put(string, getvisibilitychangeinfo);
            if (z) {
                int i4 = IAuthTabCallback + 9;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cls = TransparentDelegateActivity.class;
            } else {
                cls = DelegateActivity.class;
            }
            Intent intent = new Intent(context, (Class<?>) cls);
            if (!(context instanceof Activity)) {
                int i5 = onExtraCallback + 101;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    intent.addFlags(268435456);
                    int i6 = 72 / 0;
                } else {
                    intent.addFlags(268435456);
                }
            }
            if (num != null) {
                intent.addFlags(num.intValue());
            }
            context.startActivity(intent.putExtra("request_id", string));
        }

        private static final Unit IAuthTabCallbackStub(DelegateActivity delegateActivity) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, new Object[]{delegateActivity}, iOnNavigationEvent2, iOnNavigationEvent, 405653792, -405653790);
        }

        private static final Unit IAuthTabCallback_Parcel(DelegateActivity delegateActivity) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, new Object[]{delegateActivity}, iOnNavigationEvent2, iOnNavigationEvent, 1729239540, -1729239537);
        }

        private static final Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
            Object[] objArr = {delegateActivity, Integer.valueOf(i), strArr, iArr};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, iOnNavigationEvent2, iOnNavigationEvent, 1178140508, -1178140508);
        }

        public final void onWarmupCompleted(@NotNull Context context, @Nullable Integer num, boolean z, @NotNull Function2<? super DelegateActivity, ? super Bundle, Unit> function2, @NotNull Function1<? super DelegateActivity, Unit> function1, @NotNull Function1<? super DelegateActivity, Unit> function12, @NotNull Function1<? super DelegateActivity, Unit> function13, @NotNull Function1<? super DelegateActivity, Unit> function14, @NotNull Function1<? super DelegateActivity, Unit> function15, @NotNull Function2<? super DelegateActivity, ? super IEngagementSignalsCallbackDefault, Unit> function22, @NotNull setTaggedAddrCtrl<? super DelegateActivity, ? super Integer, ? super String[], ? super int[], Unit> settaggedaddrctrl, @NotNull Function1<? super DelegateActivity, Boolean> function16) {
            Object[] objArr = {this, context, num, Boolean.valueOf(z), function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, iOnNavigationEvent2, iOnNavigationEvent, 1317693793, -1317693792);
        }
    }

    static {
        int i = access100 + 51;
        access000 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, im.toss.activitydelegate.DelegateActivity] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    private static final String onExtraCallbackWithResult(DelegateActivity delegateActivity) {
        Bundle extras;
        Object next;
        int i = 2 % 2;
        Intent intent = delegateActivity.getIntent();
        if (intent == null) {
            return null;
        }
        int i2 = IAuthTabCallbackStubProxy + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Bundle extras2 = intent.getExtras();
        if (extras2 == null || !extras2.containsKey("request_id")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras3 = intent.getExtras();
            Object obj = extras3 != null ? extras3.get("request_id") : null;
            return (String) (obj instanceof String ? obj : null);
        }
        int i4 = asBinder + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            extras = intent.getExtras();
            int i5 = 69 / 0;
            if (extras == null) {
                return null;
            }
        } else {
            extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
        }
        ?? string = extras.getString("request_id");
        if (string == 0) {
            return null;
        }
        if (!(!Intrinsics.areEqual(String.class, Integer.class))) {
            string = StringsKt.toIntOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Float.class)) {
            string = StringsKt.toFloatOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Double.class)) {
            int i6 = asBinder + 115;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                StringsKt.toDoubleOrNull((String) string);
                obj.hashCode();
                throw null;
            }
            string = StringsKt.toDoubleOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Byte.class)) {
            string = StringsKt.toByteOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else if (Intrinsics.areEqual(String.class, Character.class)) {
            string = Character.valueOf(string.charAt(0));
        } else if (!Intrinsics.areEqual(String.class, String.class)) {
            int i7 = IAuthTabCallbackStubProxy + 17;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSplit$default) {
                    if (((String) obj2).length() > 0) {
                        int i9 = IAuthTabCallbackStubProxy + 51;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i11 = IAuthTabCallbackStubProxy + 99;
                    asBinder = i11 % 128;
                    if (i11 % 2 != 0) {
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                        throw null;
                    }
                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                }
                string = arrayList2.toArray(new Integer[0]);
            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listSplit$default2) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                }
                string = arrayList4.toArray(new Long[0]);
            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
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
                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                }
                string = arrayList6.toArray(new Float[0]);
            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
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
            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
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
            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
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
            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
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
                    int i12 = asBinder + 33;
                    IAuthTabCallbackStubProxy = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                        int i13 = 74 / 0;
                    } else {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                    }
                }
                string = arrayList14.toArray(new Boolean[0]);
            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : listSplit$default8) {
                    if (((String) obj9).length() > 0) {
                        arrayList15.add(obj9);
                    }
                }
                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                Iterator it8 = arrayList15.iterator();
                while (!(!it8.hasNext())) {
                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                }
                string = arrayList16.toArray(new Character[0]);
            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList17 = new ArrayList();
                for (Object obj10 : listSplit$default9) {
                    if (((String) obj10).length() > 0) {
                        arrayList17.add(obj10);
                    }
                }
                string = arrayList17.toArray(new String[0]);
            } else {
                Object[] enumConstants = String.class.getEnumConstants();
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
                        int i14 = IAuthTabCallbackStubProxy + 83;
                        asBinder = i14 % 128;
                        int i15 = i14 % 2;
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
                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                    }
                    int i16 = asBinder + 31;
                    IAuthTabCallbackStubProxy = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    string = 0;
                }
            }
        }
        if (string instanceof String) {
            obj = string;
        } else {
            int i17 = asBinder + 37;
            IAuthTabCallbackStubProxy = i17 % 128;
            int i18 = i17 % 2;
        }
        return (String) obj;
    }

    @Override // im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
