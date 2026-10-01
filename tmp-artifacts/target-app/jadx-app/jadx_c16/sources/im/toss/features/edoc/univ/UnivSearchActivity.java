package im.toss.features.edoc.univ;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.horcrux.svg.SvgPackage;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.base.BaseActivity;
import im.toss.features.edoc.R;
import im.toss.features.edoc.univ.UnivSearchActivity$;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TdsSearchFieldV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSignForPKCS7V3NoContents;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.varyMatches;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.univ.Univ;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class UnivSearchActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion;
    private static long extraCallbackWithResult;
    private static int onActivityLayout;
    public static final int onTransact;
    private static char readTypedObject;
    private static int writeTypedObject;
    private TdsSearchFieldV1View IAuthTabCallbackStubProxy;
    private List<Univ> ICustomTabsCallback;
    private TdsResultV0View asInterface;
    private RecyclerView getInterfaceDescriptor;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityResized = 0;
    private static int extraCallback = 0;
    private static int onMinimized = 1;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new UnivSearchActivity$.ExternalSyntheticLambda8(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new UnivSearchActivity$.ExternalSyntheticLambda9(this));
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new UnivSearchActivity$.ExternalSyntheticLambda10(this));
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new UnivSearchActivity$.ExternalSyntheticLambda11(this));
    private final IEngagementSignalsCallback_Parcel<Intent> access000 = onPageExit.onNavigationEvent(this, new UnivSearchActivity$.ExternalSyntheticLambda12(this));
    private final onNavigationEvent IAuthTabCallbackStub = new onNavigationEvent(this);

    private static String $$c(short s, int i, byte b) {
        int i2 = s * 4;
        int i3 = (i * 4) + 4;
        int i4 = 110 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
            i3++;
            i6 = i7;
        }
    }

    static {
        onActivityLayout = 1;
        IAuthTabCallback();
        Companion = new onExtraCallbackWithResult(null);
        onTransact = 8;
        int i = onActivityResized + 37;
        onActivityLayout = i % 128;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }

    public static /* synthetic */ Long IAuthTabCallback(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Long interfaceDescriptor = getInterfaceDescriptor(univSearchActivity);
        int i4 = extraCallback + 63;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        UnivSearchActivity univSearchActivity = (UnivSearchActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access100(univSearchActivity);
            throw null;
        }
        String strAccess100 = access100(univSearchActivity);
        int i3 = extraCallback + 119;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return strAccess100;
        }
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = onMinimized + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i2;
        int i10 = ~(i9 | i5);
        int i11 = i8 | i10;
        int i12 = ~i5;
        int i13 = ~(i12 | i3);
        int i14 = (~(i2 | i7)) | i13 | i10;
        int i15 = (~(i9 | i3)) | (~(i12 | i9)) | i13;
        int i16 = i5 + i3 + i6 + ((-954185507) * i) + (2055044340 * i4);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i5) - 760807424) + ((-878567756) * i3) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i6) + (1313472512 * i) + (606601216 * i4) + ((-1232666624) * i17);
        int i19 = (i5 * 1290134917) + 267690129 + (i3 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i6 * 1290136159) + (i * 826674179) + (i4 * 1594648204) + (i17 * 572063744);
        switch (i18 + (i19 * i19 * 607715328)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UnivSearchActivity univSearchActivity = (UnivSearchActivity) objArr[0];
        TextView textView = (TextView) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        KeyEvent keyEvent = (KeyEvent) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(univSearchActivity, textView, iIntValue, keyEvent);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = extraCallback + 113;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UnivSearchActivity univSearchActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(univSearchActivity, dialogInterface);
        int i4 = extraCallback + 45;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UnivSearchActivity univSearchActivity, List list) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(univSearchActivity, list);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = onMinimized + 81;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(th);
        int i4 = onMinimized + 81;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(univSearchActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onNavigationEvent(Regex regex, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = onExtraCallback(regex, charSequence);
        int i4 = extraCallback + 1;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(UnivSearchActivity univSearchActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 273201223, SvgPackage.21.onExtraCallbackWithResult(), -273201218, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity, iEngagementSignalsCallbackDefault});
        }
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        UnivSearchActivity univSearchActivity = (UnivSearchActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(IAuthTabCallbackStubProxy(univSearchActivity));
        }
        IAuthTabCallbackStubProxy(univSearchActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        asBinder(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallback + 15;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(univSearchActivity);
        int i4 = onMinimized + 7;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ List onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {function1, obj};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        List list = (List) onExtraCallbackWithResult(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -2085280809, iOnExtraCallbackWithResult4, 2085280811, iOnExtraCallbackWithResult2, objArr);
        int i4 = onMinimized + 25;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UnivSearchActivity univSearchActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -376679959, SvgPackage.21.onExtraCallbackWithResult(), 376679959, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity, commonModule_setLeftEdgeTouchEnabled});
            int i3 = 83 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -376679959, SvgPackage.21.onExtraCallbackWithResult(), 376679959, iOnExtraCallbackWithResult4, new Object[]{univSearchActivity, commonModule_setLeftEdgeTouchEnabled});
        }
        int i4 = extraCallback + 53;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 93;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return 1224871L;
    }

    public static final /* synthetic */ long IAuthTabCallbackDefault(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        long jLongValue = ((Long) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -761749382, SvgPackage.21.onExtraCallbackWithResult(), 761749385, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity})).longValue();
        int i4 = extraCallback + 19;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return jLongValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String strUpdateVisuals = univSearchActivity.updateVisuals();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = extraCallback + 7;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return strUpdateVisuals;
    }

    public static final /* synthetic */ String access000(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceDefault = univSearchActivity.ICustomTabsServiceDefault();
        int i4 = onMinimized + 13;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ onNavigationEvent asBinder(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        Object obj = null;
        onNavigationEvent onnavigationevent = univSearchActivity.IAuthTabCallbackStub;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 49;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel asInterface(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 101;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = univSearchActivity.access000;
        int i5 = i2 + 103;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ void onExtraCallback(UnivSearchActivity univSearchActivity, List list) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 33;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        univSearchActivity.ICustomTabsCallback = list;
        int i5 = i2 + 89;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Long onTransact(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Long lValidateRelationship = univSearchActivity.validateRelationship();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = extraCallback + 75;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return lValidateRelationship;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 25;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", updateVisuals());
        Object[] objArr = new Object[1];
        a((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", ""), new char[]{45446, 62543, 48530, 29333, 22698, 31504, 51297, 62822}, new char[]{2779, 23452, 32850, 29206}, new char[]{34118, 21484, 15284, 29301}, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ICustomTabsServiceDefault())});
        int i4 = onMinimized + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return mapIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UnivSearchActivity univSearchActivity = (UnivSearchActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) univSearchActivity.asBinder.getValue();
        if (i3 == 0) {
            return Long.valueOf(number.longValue());
        }
        number.longValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long IAuthTabCallbackStubProxy(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        extraCallback = i2 % 128;
        long longExtra = univSearchActivity.getIntent().getLongExtra("docCode", i2 % 2 != 0 ? 1L : 0L);
        int i3 = onMinimized + 63;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return longExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback_Parcel(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = univSearchActivity.getIntent();
        if (i3 == 0) {
            intent.getStringExtra("from");
            throw null;
        }
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = extraCallback + 83;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final String updateVisuals() {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        int i4 = extraCallback + 17;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access100.getValue();
        int i4 = onMinimized + 79;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String access100(UnivSearchActivity univSearchActivity) throws Throwable {
        int i = 2 % 2;
        Intent intent = univSearchActivity.getIntent();
        Object[] objArr = new Object[1];
        a((char) ((Process.getThreadPriority(0) + 20) >> 6), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{45446, 62543, 48530, 29333, 22698, 31504, 51297, 62822}, new char[]{2779, 23452, 32850, 29206}, new char[]{34118, 21484, 15284, 29301}, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i2 = onMinimized + 67;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        int i4 = extraCallback + 19;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return stringExtra;
    }

    private final Long validateRelationship() {
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Long l = (Long) this.IAuthTabCallback_Parcel.getValue();
        int i4 = extraCallback + 27;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        BaseActivity baseActivity = (UnivSearchActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            baseActivity.setResult(-1);
            baseActivity.finish();
            int i3 = onMinimized + 39;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        if (((Long) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -761749382, SvgPackage.21.onExtraCallbackWithResult(), 761749385, iOnExtraCallbackWithResult2, new Object[]{this})).longValue() > 0) {
            int i2 = extraCallback + 35;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
                setContentView((LinearLayout) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1331953204, SvgPackage.21.onExtraCallbackWithResult(), 1331953205, iOnExtraCallbackWithResult4, new Object[]{this}));
                ICustomTabsServiceStub();
                return;
            }
            int iOnExtraCallbackWithResult5 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = SvgPackage.21.onExtraCallbackWithResult();
            setContentView((LinearLayout) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, -1331953204, SvgPackage.21.onExtraCallbackWithResult(), 1331953205, iOnExtraCallbackWithResult6, new Object[]{this}));
            ICustomTabsServiceStub();
            throw null;
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new UnivSearchActivity$.ExternalSyntheticLambda13(this));
        int i3 = extraCallback + 37;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onExtraCallback(UnivSearchActivity univSearchActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        univSearchActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onMinimized + 63;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.features.edoc.univ.UnivSearchActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r0 = (UnivSearchActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(r0.getString(R.string.edoc_univ___33cae9b6ec));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new UnivSearchActivity$.ExternalSyntheticLambda14((UnivSearchActivity) r0));
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 61;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        int i2 = onMinimized + 81;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
    }

    private final void onWarmupCompleted(List<String> list) {
        int i = 2 % 2;
        List<Univ> list2 = this.ICustomTabsCallback;
        View view = null;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = extraCallback + 65;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = list instanceof Collection;
                throw null;
            }
            Object next = it.next();
            Univ univ = (Univ) next;
            List<String> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (String str : list3) {
                    int i3 = onMinimized + 121;
                    extraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    getSignForPKCS7V3NoContents getsignforpkcs7v3nocontents = getSignForPKCS7V3NoContents.IAuthTabCallback;
                    String strOnExtraCallback = univ.onExtraCallback();
                    if (strOnExtraCallback == null) {
                        int i5 = extraCallback + 13;
                        onMinimized = i5 % 128;
                        int i6 = i5 % 2;
                        strOnExtraCallback = "";
                    }
                    if (!getsignforpkcs7v3nocontents.onNavigationEvent(strOnExtraCallback, str)) {
                        break;
                    }
                }
            }
            arrayList.add(next);
        }
        if (!(!arrayList.isEmpty())) {
            View view2 = this.getInterfaceDescriptor;
            if (view2 == null) {
                int i7 = extraCallback + 49;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            view2.setVisibility(8);
            View view3 = this.asInterface;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view3;
            }
            view.setVisibility(0);
            return;
        }
        View view4 = this.getInterfaceDescriptor;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        view4.setVisibility(0);
        View view5 = this.asInterface;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view5 = null;
        }
        view5.setVisibility(8);
        this.IAuthTabCallbackStub.IAuthTabCallback(arrayList);
        View view6 = this.getInterfaceDescriptor;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view6;
        }
        view.post(new UnivSearchActivity$.ExternalSyntheticLambda7(this));
    }

    private static final void writeTypedObject(UnivSearchActivity univSearchActivity) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 111;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        RecyclerView recyclerView = univSearchActivity.getInterfaceDescriptor;
        if (recyclerView == null) {
            int i5 = i2 + 23;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = onMinimized + 97;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            recyclerView = null;
        }
        recyclerView.scrollToPosition(0);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 101;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - ImageFormat.getBitsPerPixel(0), 1451 - KeyEvent.keyCodeFromString(""), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49123), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1494 - (ViewConfiguration.getPressedStateDuration() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 23972), 50 - (Process.myTid() >> 22), View.getDefaultSize(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.alpha(0)), TextUtils.lastIndexOf("", '0') + 30, 12577 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (extraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (writeTypedObject ^ 7798559133331975163L))) ^ ((char) (readTypedObject ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = extraCallback + 11;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallback + 67;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 21;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallback + 49;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(UnivSearchActivity univSearchActivity, List list) {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(list);
        univSearchActivity.onWarmupCompleted((List<String>) list);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 105;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    private static final boolean onExtraCallbackWithResult(UnivSearchActivity univSearchActivity, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        if (i != 3) {
            int i3 = onMinimized + 43;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onMinimized + 113;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        univSearchActivity.onActivityLayout();
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        AppCompatActivity appCompatActivity = (UnivSearchActivity) objArr[0];
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(appCompatActivity);
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
        appCompatActivity.setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = extraCallback + 79;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
            int i4 = onMinimized + 117;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(appCompatActivity.getString(R.string.edoc_univ___47a02fbb7a));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsSearchFieldV1View tdsSearchFieldV1View = new TdsSearchFieldV1View(context4);
        tdsSearchFieldV1View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        DisplayMetrics displayMetrics = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics2);
        DisplayMetrics displayMetrics3 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(20, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsSearchFieldV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsSearchFieldV1View.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(20, displayMetrics4));
        tdsSearchFieldV1View.setHint(appCompatActivity.getString(R.string.edoc_univ___fed8831015));
        tdsSearchFieldV1View.setClearable(true);
        tdsSearchFieldV1View.IAuthTabCallback().setSingleLine();
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = RxTextView.IAuthTabCallback(tdsSearchFieldV1View.IAuthTabCallback()).onExtraCallbackWithResult().asInterface(new UnivSearchActivity$.ExternalSyntheticLambda1(new UnivSearchActivity$.ExternalSyntheticLambda0(new Regex("[ㅏ-ㅣ]")))).asBinder().onExtraCallbackWithResult(new UnivSearchActivity$.ExternalSyntheticLambda3(new UnivSearchActivity$.ExternalSyntheticLambda2(appCompatActivity)), new UnivSearchActivity$.ExternalSyntheticLambda5(new UnivSearchActivity$.ExternalSyntheticLambda4()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        appCompatActivity.onNavigationEvent(deserializeurinullablecollectionOnExtraCallbackWithResult);
        tdsSearchFieldV1View.IAuthTabCallback().setOnEditorActionListener(new UnivSearchActivity$.ExternalSyntheticLambda6(appCompatActivity));
        ((UnivSearchActivity) appCompatActivity).IAuthTabCallbackStubProxy = tdsSearchFieldV1View;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsSearchFieldV1View);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
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
        tdsRecyclerView.setAdapter(((UnivSearchActivity) appCompatActivity).IAuthTabCallbackStub);
        TdsSearchFieldV1View tdsSearchFieldV1View2 = ((UnivSearchActivity) appCompatActivity).IAuthTabCallbackStubProxy;
        if (tdsSearchFieldV1View2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsSearchFieldV1View2 = null;
        }
        tdsSearchFieldV1View2.onWarmupCompleted(tdsRecyclerView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        ((UnivSearchActivity) appCompatActivity).getInterfaceDescriptor = tdsRecyclerView;
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsResultV0View tdsResultV0View = new TdsResultV0View(context6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = -1;
        layoutParams4.height = 0;
        layoutParams4.weight = 1.0f;
        tdsResultV0View.setLayoutParams(layoutParams3);
        Context context7 = tdsResultV0View.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Resources resources = context7.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsResultV0View.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a((char) (53888 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1425632989) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{16894, 17399, 7476, 63871, 6914, 8186, 62491, 43922, 61013, 14277, 57226, 45697, 31291, 13273, 35669, 11636, 51474, 11534, 60780, 24845, 25591, 39852, 14774, 37502, 11760, 16878, 14297, 35675, 13721, 15253, 35871, 25136, 12589, 33352, 54707, 51730, 48587, 62218, 64880, 29492, 37258, 30790, 29606, 25009, 2819, 61010, 35132, 58135, 64084, 36739, 51679, 9993, 48677, 45514, 25066}, new char[]{2779, 23452, 32850, 29206}, new char[]{9062, 1681, 32939, 7378}, objArr2);
        tdsResultV0View.setLottieImageFromUrl(((String) objArr2[0]).intern());
        tdsResultV0View.setTitle(appCompatActivity.getString(R.string.edoc_univ___8b0b7219c5));
        tdsResultV0View.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsResultV0View);
        ((UnivSearchActivity) appCompatActivity).asInterface = tdsResultV0View;
        int i6 = extraCallback + 87;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onWarmupCompleted + 13;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        return getspecialfeatureoptinstatus;
                    }
                    throw null;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return getspecialfeatureoptinstatus2;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static char[] onExtraCallbackWithResult = {64982, 64961, 64981, 65065};
        private static char onWarmupCompleted = 51243;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, long j, @Nullable String str, @Nullable String str2, @Nullable Long l) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) UnivSearchActivity.class);
            intent.putExtra("docCode", j);
            intent.putExtra("from", str);
            Object[] objArr = new Object[1];
            a(new char[]{0, 1, 0, 2, 13877, 13877, 1, 0}, (byte) (77 - Color.red(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            intent.putExtra("placeId", l);
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onExtraCallbackWithResult;
            Object obj2 = null;
            if (cArr3 != null) {
                int i5 = $10 + 119;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i6 = $10 + 79;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') - 22, (Process.myPid() >> 22) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23138 - TextUtils.indexOf((CharSequence) "", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $11 + 83;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 24824), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 73, (ViewConfiguration.getWindowTouchSlop() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 30, (Process.myTid() >> 22) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i10 = $10 + 117;
                                    $11 = i10 % 128;
                                    int i11 = i10 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i16 = $11 + 99;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, im.toss.features.edoc.univ.UnivSearchActivity] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    private static final Long getInterfaceDescriptor(UnivSearchActivity univSearchActivity) {
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        Intent intent = univSearchActivity.getIntent();
        Object obj = null;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("placeId")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            Object obj2 = extras2 != null ? extras2.get("placeId") : null;
            if (obj2 instanceof Long) {
                obj = obj2;
            } else {
                int i2 = extraCallback + 123;
                onMinimized = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
            return (Long) obj;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string = extras3.getString("placeId")) == 0) {
            return null;
        }
        if (Intrinsics.areEqual(Long.class, Integer.class)) {
            int i3 = extraCallback + 87;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                StringsKt.toIntOrNull((String) string);
                obj.hashCode();
                throw null;
            }
            string = StringsKt.toIntOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Float.class)) {
            int i4 = extraCallback + 67;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            string = StringsKt.toFloatOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Double.class)) {
            string = StringsKt.toDoubleOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
            string = StringsKt.toByteOrNull((String) string);
        } else if (Intrinsics.areEqual(Long.class, Boolean.class)) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else if (Intrinsics.areEqual(Long.class, Character.class)) {
            string = Character.valueOf(string.charAt(0));
        } else if (!Intrinsics.areEqual(Long.class, String.class)) {
            if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listSplit$default) {
                    if (((String) obj3).length() > 0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                }
                string = arrayList2.toArray(new Integer[0]);
            } else if (Intrinsics.areEqual(Long.class, Long[].class)) {
                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : listSplit$default2) {
                    if (((String) obj4).length() > 0) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                }
                string = arrayList4.toArray(new Long[0]);
            } else if (Intrinsics.areEqual(Long.class, Float[].class)) {
                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : listSplit$default3) {
                    if (((String) obj5).length() > 0) {
                        int i6 = onMinimized + 119;
                        extraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            arrayList5.add(obj5);
                            obj.hashCode();
                            throw null;
                        }
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                }
                string = arrayList6.toArray(new Float[0]);
            } else if (Intrinsics.areEqual(Long.class, Double[].class)) {
                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : listSplit$default4) {
                    if (((String) obj6).length() > 0) {
                        arrayList7.add(obj6);
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
                for (Object obj7 : listSplit$default5) {
                    if (((String) obj7).length() > 0) {
                        arrayList9.add(obj7);
                    }
                }
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    int i7 = onMinimized + 93;
                    extraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                }
                string = arrayList10.toArray(new Short[0]);
            } else if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList11 = new ArrayList();
                for (Object obj8 : listSplit$default6) {
                    if (((String) obj8).length() > 0) {
                        int i9 = onMinimized + 37;
                        extraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        arrayList11.add(obj8);
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
                for (Object obj9 : listSplit$default7) {
                    if (((String) obj9).length() > 0) {
                        arrayList13.add(obj9);
                    }
                }
                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                Iterator it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    int i11 = extraCallback + 53;
                    onMinimized = i11 % 128;
                    if (i11 % 2 == 0) {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                        int i12 = 28 / 0;
                    } else {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                    }
                }
                string = arrayList14.toArray(new Boolean[0]);
            } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList15 = new ArrayList();
                for (Object obj10 : listSplit$default8) {
                    if (((String) obj10).length() > 0) {
                        arrayList15.add(obj10);
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
                for (Object obj11 : listSplit$default9) {
                    if (((String) obj11).length() > 0) {
                        arrayList17.add(obj11);
                    }
                }
                string = arrayList17.toArray(new String[0]);
            } else {
                Object[] enumConstants = Long.class.getEnumConstants();
                if (enumConstants != null) {
                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                    for (Object obj12 : enumConstants) {
                        Intrinsics.checkNotNull(obj12, "");
                        arrayList18.add((Enum) obj12);
                    }
                    Iterator it9 = arrayList18.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            int i13 = onMinimized + 27;
                            extraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            next = null;
                            break;
                        }
                        int i15 = onMinimized + 57;
                        extraCallback = i15 % 128;
                        int i16 = i15 % 2;
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
                        throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                    }
                    string = 0;
                }
            }
        }
        if (string instanceof Long) {
            obj = string;
        } else {
            int i17 = extraCallback + 13;
            onMinimized = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 38 / 0;
            }
        }
        return (Long) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List onExtraCallback(Regex regex, CharSequence charSequence) {
        String strReplace;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        List listSplit$default = StringsKt.split$default(charSequence.toString(), new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            int i2 = extraCallback + 113;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                strReplace = regex.replace(StringsKt.trim((String) it.next()).toString(), "");
                int i3 = 60 / 0;
                if (strReplace.length() <= 0) {
                    strReplace = null;
                }
            } else {
                strReplace = regex.replace(StringsKt.trim((String) it.next()).toString(), "");
                if (strReplace.length() <= 0) {
                }
            }
            if (strReplace != null) {
                int i4 = onMinimized + 69;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(strReplace);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String onNavigationEvent(UnivSearchActivity univSearchActivity) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -179109147, SvgPackage.21.onExtraCallbackWithResult(), 179109153, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity});
    }

    public static /* synthetic */ long onExtraCallback(UnivSearchActivity univSearchActivity) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return ((Long) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1142186456, SvgPackage.21.onExtraCallbackWithResult(), -1142186449, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity})).longValue();
    }

    public static /* synthetic */ boolean onWarmupCompleted(UnivSearchActivity univSearchActivity, TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {univSearchActivity, textView, Integer.valueOf(i), keyEvent};
        return ((Boolean) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1255119234, SvgPackage.21.onExtraCallbackWithResult(), 1255119238, SvgPackage.21.onExtraCallbackWithResult(), objArr)).booleanValue();
    }

    private final LinearLayout onNavigationEvent() {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (LinearLayout) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1331953204, SvgPackage.21.onExtraCallbackWithResult(), 1331953205, iOnExtraCallbackWithResult2, new Object[]{this});
    }

    private static final List IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (List) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2085280809, SvgPackage.21.onExtraCallbackWithResult(), 2085280811, iOnExtraCallbackWithResult2, new Object[]{function1, obj});
    }

    private final long setEngagementSignalsCallback() {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return ((Long) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -761749382, SvgPackage.21.onExtraCallbackWithResult(), 761749385, iOnExtraCallbackWithResult2, new Object[]{this})).longValue();
    }

    private static final Unit IAuthTabCallback(UnivSearchActivity univSearchActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 273201223, SvgPackage.21.onExtraCallbackWithResult(), -273201218, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity, iEngagementSignalsCallbackDefault});
    }

    private static final Unit IAuthTabCallback(UnivSearchActivity univSearchActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -376679959, SvgPackage.21.onExtraCallbackWithResult(), 376679959, iOnExtraCallbackWithResult2, new Object[]{univSearchActivity, commonModule_setLeftEdgeTouchEnabled});
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        int i5 = extraCallback + 13;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onMinimized + 81;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onMinimized + 81;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallback + 117;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        extraCallbackWithResult = 2174267084689465632L;
        writeTypedObject = -1776194565;
        readTypedObject = (char) 27643;
    }
}
