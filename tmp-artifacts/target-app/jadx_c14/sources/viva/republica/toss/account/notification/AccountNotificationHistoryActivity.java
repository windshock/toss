package viva.republica.toss.account.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ASN1ObjectParser;
import o.AdComponentViewParentApi;
import o.AppLovinAdImpl;
import o.AppMsgReceiver2;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_UTIL_RemoveFile;
import o.access13800;
import o.access14300;
import o.access502;
import o.access8100;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.exitAllPages;
import o.findResAndMsg;
import o.getAdComponentViewApi;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDummyAd;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.onJsBridgeReady;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.readIntokhttp;
import o.setRandomHost;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity;
import viva.republica.toss.account.notification.AccountNotificationHistoryActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationHistoryActivity extends Hilt_AccountNotificationHistoryActivity {
    public static final onExtraCallback Companion;
    public static final int asInterface;
    private static int extraCallback;
    private static int extraCallbackWithResult;
    private Integer IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private String IAuthTabCallback_Parcel;
    private ArrayList<AdComponentViewParentApi> getInterfaceDescriptor;

    @Inject
    public getDummyAd termsIntent;
    private static final byte[] $$a = {48, -42, 66, -37};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 0;
    private static int ICustomTabsCallback = 1;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(this));
    private boolean access100 = true;
    private int IAuthTabCallbackDefault = -1;
    private final SessionTrackera access000 = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda20
        public final Object invoke(Object obj) {
            return AccountNotificationHistoryActivity.IAuthTabCallback(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });
    private final asInterface asBinder = new asInterface(this);

    public static final /* synthetic */ class IAuthTabCallbackDefault {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[AdComponentViewParentApi.onExtraCallback.values().length];
            try {
                iArr[AdComponentViewParentApi.onExtraCallback.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdComponentViewParentApi.onExtraCallback.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = viva.republica.toss.account.notification.AccountNotificationHistoryActivity.$$a
            int r8 = r8 * 4
            int r8 = r8 + 105
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationHistoryActivity.$$c(int, int, byte):java.lang.String");
    }

    static {
        extraCallback = 1;
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        asInterface = 8;
        int i = readTypedObject + 7;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(accountNotificationHistoryActivity, view);
        int i4 = ICustomTabsCallback + 89;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationHistoryActivity, bool);
        int i4 = ICustomTabsCallback + 103;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(accountNotificationHistoryActivity, th);
        }
        onNavigationEvent(accountNotificationHistoryActivity, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationHistoryActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = writeTypedObject + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-1349439163, 1349439165, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
            int i3 = 97 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-1349439163, 1349439165, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{function1, obj});
        }
        int i4 = writeTypedObject + 27;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(accountNotificationHistoryActivity);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = writeTypedObject + 105;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(AdComponentViewParentApi adComponentViewParentApi, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(adComponentViewParentApi, setDetectableSize);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = writeTypedObject + 11;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(accountNotificationHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = writeTypedObject + 63;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i14 = i2 + i + i5 + (669352129 * i3) + (266941808 * i4);
        int i15 = i14 * i14;
        int i16 = (720661947 * i2) + 1572077568 + ((-1243901369) * i) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i5) + ((-1100480512) * i3) + ((-1249902592) * i4) + ((-491520000) * i15);
        int i17 = (i2 * 1617402437) + 56426783 + (i * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i5 * 1617401855) + (i3 * 1244927807) + (i4 * (-404665712)) + (i15 * (-45350912));
        switch (i16 + (i17 * i17 * 1565261824)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback + 81;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
                function1.invoke(obj);
                int i21 = writeTypedObject + 41;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 3:
                Function1 function12 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i23 = 2 % 2;
                int i24 = writeTypedObject + 99;
                ICustomTabsCallback = i24 % 128;
                int i25 = i24 % 2;
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                onExtraCallbackWithResult(45880277, -45880270, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function12, obj2});
                int i26 = writeTypedObject + 75;
                ICustomTabsCallback = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 4:
                AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
                int i28 = 2 % 2;
                int i29 = writeTypedObject + 91;
                ICustomTabsCallback = i29 % 128;
                int i30 = i29 % 2;
                accountNotificationHistoryActivity.updateVisuals().setRefreshing(true);
                Unit unit = Unit.INSTANCE;
                int i31 = ICustomTabsCallback + 83;
                writeTypedObject = i31 % 128;
                int i32 = i31 % 2;
                return unit;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return IAuthTabCallback(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                Function1 function13 = (Function1) objArr[0];
                Object obj3 = objArr[1];
                int i33 = 2 % 2;
                int i34 = ICustomTabsCallback + 77;
                writeTypedObject = i34 % 128;
                int i35 = i34 % 2;
                function13.invoke(obj3);
                int i36 = ICustomTabsCallback + 27;
                writeTypedObject = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 11:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(accountNotificationHistoryActivity, th);
        }
        onExtraCallbackWithResult(accountNotificationHistoryActivity, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AdComponentViewParentApi adComponentViewParentApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(adComponentViewParentApi, setDetectableSize);
        }
        IAuthTabCallback(adComponentViewParentApi, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(-1983629621, 1983629625, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, deserializeurinullablecollection});
        int i4 = ICustomTabsCallback + 103;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(accountNotificationHistoryActivity);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 113;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(accountNotificationHistoryActivity, deserializeurinullablecollection);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(accountNotificationHistoryActivity, deserializeurinullablecollection);
        int i3 = ICustomTabsCallback + 85;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1261915766, -1261915756, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
        int i4 = writeTypedObject + 29;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = ICustomTabsCallback + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationHistoryActivity accountNotificationHistoryActivity, List list, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(accountNotificationHistoryActivity, list, view);
        int i4 = writeTypedObject + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationHistoryActivity accountNotificationHistoryActivity, getAdComponentViewApi getadcomponentviewapi) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(-169537072, 169537080, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, getadcomponentviewapi});
        int i4 = ICustomTabsCallback + 57;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(AccountNotificationHistoryActivity accountNotificationHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(accountNotificationHistoryActivity);
        int i4 = writeTypedObject + 51;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 69;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 1007947L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface extends exitAllPages<Object> {

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] onExtraCallback;

            static {
                int[] iArr = new int[AdComponentViewParentApi.onExtraCallback.values().length];
                try {
                    iArr[AdComponentViewParentApi.onExtraCallback.SUBSCRIBE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdComponentViewParentApi.onExtraCallback.UNSUBSCRIBE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdComponentViewParentApi.onExtraCallback.PREPARING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdComponentViewParentApi.onExtraCallback.NOT_SUPPORT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AdComponentViewParentApi.onExtraCallback.BREAK_TIME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                onExtraCallback = iArr;
            }
        }

        public static final class IAuthTabCallbackStubProxy implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public IAuthTabCallbackStubProxy(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public IAuthTabCallback(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallbackDefault implements getAdService {
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public IAuthTabCallbackDefault(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallbackStub implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public IAuthTabCallbackStub(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class access000 implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public access000(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class asBinder implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public asBinder(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        /* renamed from: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$asInterface$asInterface, reason: collision with other inner class name */
        public static final class C0018asInterface implements getAdService {
            final /* synthetic */ Configuration IAuthTabCallback;

            public C0018asInterface(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onNavigationEvent implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public onNavigationEvent(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onTransact implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public onTransact(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onWarmupCompleted implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public onWarmupCompleted(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallback_Parcel implements Function1<Object, Boolean> {
            public static final IAuthTabCallback_Parcel IAuthTabCallback = new IAuthTabCallback_Parcel();

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof IAuthTabCallback);
            }
        }

        public static final class ICustomTabsCallback implements Function1<Object, Boolean> {
            public static final ICustomTabsCallback onExtraCallback = new ICustomTabsCallback();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onWarmupCompleted);
            }
        }

        public static final class access100 implements Function1<Object, Boolean> {
            public static final access100 onNavigationEvent = new access100();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
            }
        }

        public static final class getInterfaceDescriptor implements Function1<Object, Boolean> {
            public static final getInterfaceDescriptor onWarmupCompleted = new getInterfaceDescriptor();

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof AdComponentViewParentApi);
            }
        }

        public static final class writeTypedObject implements Function1<Object, Boolean> {
            public static final writeTypedObject onExtraCallback = new writeTypedObject();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onNavigationEvent);
            }
        }

        asInterface(final AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_header_v2);
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$adapter$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationHistoryActivity.asInterface.onExtraCallback((AppMsgReceiver2) obj, (AccountNotificationHistoryActivity.onExtraCallbackWithResult) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(access100.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            int i = R.layout.item_space;
            onextracallbackwithresult2.onWarmupCompleted(i);
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$adapter$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationHistoryActivity.asInterface.onExtraCallbackWithResult(accountNotificationHistoryActivity, (AppMsgReceiver2) obj, (AccountNotificationHistoryActivity.IAuthTabCallback) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(IAuthTabCallback_Parcel.IAuthTabCallback);
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult3.onWarmupCompleted(R.layout.item_tds_list_row_v1);
            onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$adapter$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationHistoryActivity.asInterface.onWarmupCompleted(accountNotificationHistoryActivity, this, (AppMsgReceiver2) obj, (AdComponentViewParentApi) obj2);
                }
            });
            if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
                onextracallbackwithresult3.onExtraCallback(getInterfaceDescriptor.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult4.onWarmupCompleted(i);
            onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$adapter$1$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationHistoryActivity.asInterface.onNavigationEvent((AppMsgReceiver2) obj, (AccountNotificationHistoryActivity.onWarmupCompleted) obj2);
                }
            });
            if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
                onextracallbackwithresult4.onExtraCallback(ICustomTabsCallback.onExtraCallback);
            }
            onExtraCallbackWithResult(onextracallbackwithresult4.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult5 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult5.onWarmupCompleted(R.layout.item_tds_top_v1_03);
            onextracallbackwithresult5.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$adapter$1$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationHistoryActivity.asInterface.onExtraCallbackWithResult((AppMsgReceiver2) obj, (AccountNotificationHistoryActivity.onNavigationEvent) obj2);
                }
            });
            if (onextracallbackwithresult5.onWarmupCompleted() == null && onextracallbackwithresult5.onNavigationEvent() == null) {
                onextracallbackwithresult5.onExtraCallback(writeTypedObject.onExtraCallback);
            }
            onExtraCallbackWithResult(onextracallbackwithresult5.onExtraCallbackWithResult());
        }

        private final boolean onNavigationEvent() {
            Object obj = ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof AdComponentViewParentApi) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((AdComponentViewParentApi) it.next()).access100() == AdComponentViewParentApi.onExtraCallback.UNSUBSCRIBE && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }

        public static Unit onExtraCallback(AppMsgReceiver2 appMsgReceiver2, onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TdsListHeaderV2View tdsListHeaderV2View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            TdsListHeaderV2View tdsListHeaderV2View2 = tdsListHeaderV2View instanceof TdsListHeaderV2View ? tdsListHeaderV2View : null;
            if (tdsListHeaderV2View2 != null) {
                tdsListHeaderV2View2.setHeaderType(TdsListHeaderV2View.onExtraCallback.ROW1B);
                Context context = tdsListHeaderV2View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListHeaderV2View2.setTitleColor(new getUrlokhttp(new onNavigationEvent(configuration)).onPostMessage());
                tdsListHeaderV2View2.setTitle(onextracallbackwithresult.IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, AppMsgReceiver2 appMsgReceiver2, IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float fOnExtraCallback = iAuthTabCallback.onExtraCallback();
            DisplayMetrics displayMetrics = accountNotificationHistoryActivity.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            layoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(fOnExtraCallback), displayMetrics);
            view.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.Unit onWarmupCompleted(final viva.republica.toss.account.notification.AccountNotificationHistoryActivity r23, viva.republica.toss.account.notification.AccountNotificationHistoryActivity.asInterface r24, o.AppMsgReceiver2 r25, final o.AdComponentViewParentApi r26) {
            /*
                Method dump skipped, instructions count: 855
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationHistoryActivity.asInterface.onWarmupCompleted(viva.republica.toss.account.notification.AccountNotificationHistoryActivity, viva.republica.toss.account.notification.AccountNotificationHistoryActivity$asInterface, o.AppMsgReceiver2, o.AdComponentViewParentApi):kotlin.Unit");
        }

        public static void IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, AdComponentViewParentApi adComponentViewParentApi, View view) {
            AccountNotificationHistoryActivity.onExtraCallbackWithResult(accountNotificationHistoryActivity, adComponentViewParentApi);
        }

        public static void onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, AdComponentViewParentApi adComponentViewParentApi, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            if (z) {
                AccountNotificationHistoryActivity.onExtraCallbackWithResult(accountNotificationHistoryActivity, adComponentViewParentApi);
                compoundButton.setChecked(false);
            }
        }

        public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(view);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackStubProxy(configuration)).onExtraCallbackWithResult());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float fOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            layoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(fOnNavigationEvent), displayMetrics);
            view.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            TdsTopV1T03View tdsTopV1T03View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            TdsTopV1T03View tdsTopV1T03View2 = tdsTopV1T03View instanceof TdsTopV1T03View ? tdsTopV1T03View : null;
            if (tdsTopV1T03View2 != null) {
                tdsTopV1T03View2.setText(onnavigationevent.IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onTransact implements Function0<UST_UTIL_RemoveFile> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onTransact(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final UST_UTIL_RemoveFile invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return UST_UTIL_RemoveFile.onNavigationEvent(layoutInflater);
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, AdComponentViewParentApi adComponentViewParentApi) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-697774827, 697774838, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, adComponentViewParentApi});
        int i4 = writeTypedObject + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = accountNotificationHistoryActivity.onNavigationEvent(str);
        int i4 = writeTypedObject + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static final /* synthetic */ boolean onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        boolean z = accountNotificationHistoryActivity.IAuthTabCallbackStubProxy;
        int i5 = i3 + 115;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 45;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = accountNotificationHistoryActivity.access000;
        int i5 = i2 + 99;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 37;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return getdummyad;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        String str = this.IAuthTabCallback_Parcel;
        if (str == null) {
            int i2 = ICustomTabsCallback + 41;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        Object[] objArr = new Object[1];
        a(8 - TextUtils.getOffsetAfter("", 0), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, ((Process.getThreadPriority(0) + 20) >> 6) + 199, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)});
        int i4 = writeTypedObject + 5;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final UST_UTIL_RemoveFile setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.onTransact.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (UST_UTIL_RemoveFile) value;
        }
        Object value2 = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsRecyclerView ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(setEngagementSignalsCallback().onExtraCallbackWithResult, "");
            throw null;
        }
        TdsRecyclerView tdsRecyclerView = setEngagementSignalsCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsRecyclerView, "");
        return tdsRecyclerView;
    }

    private final Toolbar writeTypedList() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Toolbar toolbar = setEngagementSignalsCallback().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            return toolbar;
        }
        Toolbar toolbar2 = setEngagementSignalsCallback().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(toolbar2, "");
        int i3 = 54 / 0;
        return toolbar2;
    }

    private final TdsBottomCtaV1View ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TdsBottomCtaV1View tdsBottomCtaV1View = setEngagementSignalsCallback().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            return tdsBottomCtaV1View;
        }
        Intrinsics.checkNotNullExpressionValue(setEngagementSignalsCallback().onNavigationEvent, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final SwipeRefreshLayout updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        SwipeRefreshLayout swipeRefreshLayout = setEngagementSignalsCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "");
        int i4 = ICustomTabsCallback + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return swipeRefreshLayout;
    }

    private final ConstraintLayout validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = setEngagementSignalsCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i4 = ICustomTabsCallback + 35;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationHistoryActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback().getRoot());
        ConstraintLayout root = setEngagementSignalsCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, setEngagementSignalsCallback().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        onNavigationEvent(getIntent());
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-150529738, 150529743, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this});
        int i4 = ICustomTabsCallback + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            onNavigationEvent(intent);
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-150529738, 150529743, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this});
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onNavigationEvent(intent);
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-150529738, 150529743, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{this});
        throw null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            int i4 = ICustomTabsCallback + 47;
            int i5 = i4 % 128;
            writeTypedObject = i5;
            if (i4 % 2 != 0) {
                if (i != 69) {
                    return;
                }
            } else if (i != 110) {
                return;
            }
            int i6 = i5 + 119;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            ICustomTabsServiceStubProxy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0b1f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(android.content.Intent r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationHistoryActivity.onNavigationEvent(android.content.Intent):void");
    }

    private static final void IAuthTabCallbackDefault(AccountNotificationHistoryActivity accountNotificationHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationHistoryActivity.ICustomTabsServiceStubProxy();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        final AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationHistoryActivity.setSupportActionBar(accountNotificationHistoryActivity.writeTypedList());
        IPostMessageServiceStubProxy supportActionBar = accountNotificationHistoryActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            int i4 = writeTypedObject + 105;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        accountNotificationHistoryActivity.updateVisuals().setOnRefreshListener(new SwipeRefreshLayout.IAuthTabCallback() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda11
            public final void onRefresh() throws Throwable {
                AccountNotificationHistoryActivity.onWarmupCompleted(this.f$0);
            }
        });
        TdsRecyclerView tdsRecyclerViewICustomTabsServiceStub = accountNotificationHistoryActivity.ICustomTabsServiceStub();
        tdsRecyclerViewICustomTabsServiceStub.setAdapter(accountNotificationHistoryActivity.asBinder);
        tdsRecyclerViewICustomTabsServiceStub.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = tdsRecyclerViewICustomTabsServiceStub.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        tdsRecyclerViewICustomTabsServiceStub.setFadingEdgeLength(varyMatches.onNavigationEvent(Float.valueOf(34.0f), displayMetrics));
        tdsRecyclerViewICustomTabsServiceStub.setFadingEdgeType(2);
        ArrayList<AdComponentViewParentApi> arrayList = accountNotificationHistoryActivity.getInterfaceDescriptor;
        if (arrayList != null) {
            int i6 = ICustomTabsCallback + 57;
            writeTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                arrayList.isEmpty();
                throw null;
            }
            if (!arrayList.isEmpty()) {
                accountNotificationHistoryActivity.onNavigationEvent(accountNotificationHistoryActivity.getInterfaceDescriptor);
                int i7 = writeTypedObject + 51;
                ICustomTabsCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return null;
                }
                throw null;
            }
        }
        accountNotificationHistoryActivity.ICustomTabsServiceStubProxy();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationHistoryActivity.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static final Unit onWarmupCompleted(AccountNotificationHistoryActivity accountNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationHistoryActivity.updateVisuals().setRefreshing(true);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 111;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallbackStub(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationHistoryActivity.updateVisuals().setRefreshing(false);
        int i4 = ICustomTabsCallback + 49;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        writeRaw<getAdComponentViewApi> writerawOnExtraCallbackWithResult = ASN1ObjectParser.IAuthTabCallback.onExtraCallbackWithResult();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return AccountNotificationHistoryActivity.onNavigationEvent(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnExtraCallbackWithResult.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                AccountNotificationHistoryActivity.IAuthTabCallbackDefault(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda2
            public final void run() {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                AccountNotificationHistoryActivity.onExtraCallbackWithResult(212324575, -212324574, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return AccountNotificationHistoryActivity.onWarmupCompleted(this.f$0, (getAdComponentViewApi) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                AccountNotificationHistoryActivity.asBinder(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return AccountNotificationHistoryActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                AccountNotificationHistoryActivity.onTransact(function13, obj);
            }
        });
        int i2 = ICustomTabsCallback + 89;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AccountNotificationHistoryActivity accountNotificationHistoryActivity = (AccountNotificationHistoryActivity) objArr[0];
        getAdComponentViewApi getadcomponentviewapi = (getAdComponentViewApi) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            accountNotificationHistoryActivity.IAuthTabCallbackStubProxy = getadcomponentviewapi.onExtraCallback();
            accountNotificationHistoryActivity.onNavigationEvent(getadcomponentviewapi.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        accountNotificationHistoryActivity.IAuthTabCallbackStubProxy = getadcomponentviewapi.onExtraCallback();
        accountNotificationHistoryActivity.onNavigationEvent(getadcomponentviewapi.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity, Throwable th) {
        boolean z;
        initMiniApp initminiapp;
        Function0 function0;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 31;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationHistoryActivity::loadData", th);
            Intrinsics.checkNotNull(th);
            z = true;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i = 62;
        } else {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationHistoryActivity::loadData", th);
            Intrinsics.checkNotNull(th);
            z = false;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i = 30;
        }
        getParamImp.onWarmupCompleted(th, accountNotificationHistoryActivity, z, initminiapp, function0, function1, i, (Object) null);
        return Unit.INSTANCE;
    }

    private static final List<AdComponentViewParentApi> onNavigationEvent(List<? extends AdComponentViewParentApi> list, AdComponentViewParentApi.onExtraCallback... onextracallbackArr) {
        Object next;
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i4 = writeTypedObject + 87;
        while (true) {
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = ICustomTabsCallback + 103;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                next = it.next();
                if (ArraysKt.contains(onextracallbackArr, ((AdComponentViewParentApi) next).access100())) {
                    break;
                }
            }
            return arrayList;
            arrayList.add(next);
            i4 = writeTypedObject + 107;
        }
    }

    private static final Unit onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity, List list, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Object[] objArr = {accountNotificationHistoryActivity, (AdComponentViewParentApi) CollectionsKt.first(list)};
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-697774827, 697774838, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
            unit = Unit.INSTANCE;
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Object[] objArr2 = {accountNotificationHistoryActivity, (AdComponentViewParentApi) CollectionsKt.first(list)};
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-697774827, 697774838, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2);
            unit = Unit.INSTANCE;
        }
        int i4 = writeTypedObject + 1;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AccountNotificationHistoryActivity accountNotificationHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1009413L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        accountNotificationHistoryActivity.access200();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 101;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(java.util.List<? extends o.AdComponentViewParentApi> r26) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationHistoryActivity.onNavigationEvent(java.util.List):void");
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asBinder(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationHistoryActivity.updateVisuals().setRefreshing(false);
        int i4 = ICustomTabsCallback + 81;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 83;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(accountNotificationHistoryActivity.getString(R.string.app_account_notification___a8cf47d78d));
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 39 / 0;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(final AccountNotificationHistoryActivity accountNotificationHistoryActivity, Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(bool);
        accountNotificationHistoryActivity.IAuthTabCallbackStubProxy = bool.booleanValue();
        if (bool.booleanValue()) {
            TdsBottomCtaV1View.onExtraCallback(accountNotificationHistoryActivity.ICustomTabsServiceDefault(), true, (Function0) null, 2, (Object) null);
            accountNotificationHistoryActivity.ICustomTabsServiceStub().setVerticalFadingEdgeEnabled(false);
            ConstraintLayout constraintLayoutValidateRelationship = accountNotificationHistoryActivity.validateRelationship();
            String string = accountNotificationHistoryActivity.getString(R.string.app_account_notification___c842a878b5);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(constraintLayoutValidateRelationship, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
            int i2 = writeTypedObject + 91;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(accountNotificationHistoryActivity, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda19
                public final Object invoke(Object obj) {
                    return AccountNotificationHistoryActivity.onExtraCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        }
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 67;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, Throwable th) {
        boolean z;
        initMiniApp initminiapp;
        Function0 function0;
        Function1 function1;
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 71;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationHistoryActivity::reserve", th);
            Intrinsics.checkNotNull(th);
            z = false;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i = 87;
            obj = null;
        } else {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationHistoryActivity::reserve", th);
            Intrinsics.checkNotNull(th);
            z = false;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i = 30;
            obj = null;
        }
        getParamImp.onWarmupCompleted(th, accountNotificationHistoryActivity, z, initminiapp, function0, function1, i, obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access200() throws Throwable {
        int i = 2 % 2;
        List listOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnExtraCallbackWithResult) {
            int i2 = ICustomTabsCallback + 125;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (obj instanceof AdComponentViewParentApi) {
                int i4 = writeTypedObject + 59;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(!CollectionsKt.contains(CollectionsKt.listOf(new AdComponentViewParentApi.onExtraCallback[]{AdComponentViewParentApi.onExtraCallback.PREPARING, AdComponentViewParentApi.onExtraCallback.NOT_SUPPORT}), ((AdComponentViewParentApi) obj2).access100()))) {
                int i6 = writeTypedObject + 85;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((AdComponentViewParentApi) it.next()).onExtraCallbackWithResult()));
        }
        if (arrayList3.isEmpty()) {
            int i8 = ICustomTabsCallback + 57;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_account_notification___d66e4ac1db), 0, 2, (Object) null);
            return;
        }
        writeRaw<Boolean> writerawOnExtraCallback = ASN1ObjectParser.IAuthTabCallback.onExtraCallback(arrayList3);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda12
            public final Object invoke(Object obj3) {
                return AccountNotificationHistoryActivity.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj3);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnExtraCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda13
            public final void accept(Object obj3) {
                Object[] objArr = {function1, obj3};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                AccountNotificationHistoryActivity.onExtraCallbackWithResult(-261575821, 261575827, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda14
            public final void run() {
                AccountNotificationHistoryActivity.onExtraCallbackWithResult(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda15
            public final Object invoke(Object obj3) {
                return AccountNotificationHistoryActivity.IAuthTabCallback(this.f$0, (Boolean) obj3);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda16
            public final void accept(Object obj3) {
                AccountNotificationHistoryActivity.IAuthTabCallbackStub(function12, obj3);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda17
            public final Object invoke(Object obj3) {
                Object[] objArr = {this.f$0, (Throwable) obj3};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                return (Unit) AccountNotificationHistoryActivity.onExtraCallbackWithResult(-454049371, 454049371, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda18
            public final void accept(Object obj3) {
                Object[] objArr = {function13, obj3};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                AccountNotificationHistoryActivity.onExtraCallbackWithResult(126382130, -126382127, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(AdComponentViewParentApi adComponentViewParentApi, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("account_vendor", adComponentViewParentApi.IAuthTabCallbackDefault());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_vendor", adComponentViewParentApi.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i;
        ComponentActivity componentActivity = (AccountNotificationHistoryActivity) objArr[0];
        final AdComponentViewParentApi adComponentViewParentApi = (AdComponentViewParentApi) objArr[1];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 67;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        ((AccountNotificationHistoryActivity) componentActivity).IAuthTabCallbackDefault = adComponentViewParentApi.onExtraCallbackWithResult();
        AdComponentViewParentApi.onExtraCallback onextracallbackAccess100 = adComponentViewParentApi.access100();
        Object obj = null;
        if (onextracallbackAccess100 == null) {
            int i5 = writeTypedObject + 29;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            i = -1;
        } else {
            i = IAuthTabCallbackDefault.onWarmupCompleted[onextracallbackAccess100.ordinal()];
            int i6 = writeTypedObject + 69;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (i == 1) {
            ConvertByteArrayToFloatArray.onExtraCallback(1007949L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda7
                public final Object invoke(Object obj2) {
                    return AccountNotificationHistoryActivity.onExtraCallback(adComponentViewParentApi, (SetDetectableSize) obj2);
                }
            }, 14, (Object) null);
            componentActivity.startActivityForResult(AccountNotificationBankAccountsActivity.onExtraCallback.onExtraCallbackWithResult(AccountNotificationBankAccountsActivity.Companion, componentActivity, adComponentViewParentApi.onExtraCallbackWithResult(), null, 4, null), 110);
            int i8 = writeTypedObject + 83;
            ICustomTabsCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i == 2) {
            if (!((Boolean) AdComponentViewParentApi.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{adComponentViewParentApi})).booleanValue()) {
                ConvertByteArrayToFloatArray.onExtraCallback(1007951L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationHistoryActivity$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj2) {
                        return AccountNotificationHistoryActivity.onExtraCallbackWithResult(adComponentViewParentApi, (SetDetectableSize) obj2);
                    }
                }, 14, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(componentActivity), (CoroutineContext) null, (setRandomHost) null, new asBinder(adComponentViewParentApi, null), 3, (Object) null);
            }
        }
        return null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ AdComponentViewParentApi $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(AdComponentViewParentApi adComponentViewParentApi, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$item = adComponentViewParentApi;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AccountNotificationHistoryActivity.this.new asBinder(this.$item, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [android.content.Context, viva.republica.toss.account.notification.AccountNotificationHistoryActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
                ?? r13 = AccountNotificationHistoryActivity.this;
                getDummyAd getdummyadOnNavigationEvent = r13.onNavigationEvent();
                Object[] objArr = {AccountNotificationHistoryActivity.this};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                SessionTrackera sessionTrackera = (SessionTrackera) AccountNotificationHistoryActivity.onExtraCallbackWithResult(-55352491, 55352500, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr);
                int iOnExtraCallbackWithResult2 = this.$item.onExtraCallbackWithResult();
                this.label = 1;
                if (aSN1ObjectParser.onWarmupCompleted(r13, getdummyadOnNavigationEvent, sessionTrackera, iOnExtraCallbackWithResult2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(AdComponentViewParentApi adComponentViewParentApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_vendor", adComponentViewParentApi.IAuthTabCallbackDefault());
        Object[] objArr = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777222, 2 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{'\n', 65529, 65527, 4, 5, 65535}, true, (-16777018) - Color.rgb(0, 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "account_notice_apply");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 93;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AccountNotificationHistoryActivity accountNotificationHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i2 = ICustomTabsCallback + 93;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
            int i4 = accountNotificationHistoryActivity.IAuthTabCallbackDefault;
            Object[] objArr = new Object[1];
            a(31 - TextUtils.indexOf((CharSequence) "", '0'), 9 - KeyEvent.getDeadChar(0, 0), new char[]{14, 14, '\n', 15, '\r', 0, 11, 16, 14, '\t', '\n', 4, 15, 65532, 65534, 4, 1, 4, 15, '\n', '\t', 65482, 15, '\t', 16, '\n', 65534, 65534, 65532, 65482, 65482, 65493}, true, 193 - TextUtils.getTrimmedLength(""), objArr);
            aSN1ObjectParser.onNavigationEvent(accountNotificationHistoryActivity, i4, (4 & 4) != 0 ? null : null, (4 & 8) != 0 ? null : ((String) objArr[0]).intern(), (4 & 16) != 0 ? null : null);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = writeTypedObject + 33;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final String onNavigationEvent(String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 123;
        int i4 = i3 % 128;
        writeTypedObject = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (str == null) {
            int i5 = i2 + 83;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i4 + 123;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >>> 75) * 22, 91 % TextUtils.lastIndexOf("", 'P'), new char[]{65521, 65481, '\r', '\r', 65494, 65526, 65526, 65494, '\"', '\"', '\"', '\"', 28, 28, 65507, 22, 22, 65507, 65521}, true, 7763 % Color.green(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - TextUtils.lastIndexOf("", '0'), new char[]{65521, 65481, '\r', '\r', 65494, 65526, 65526, 65494, '\"', '\"', '\"', '\"', 28, 28, 65507, 22, 22, 65507, 65521}, true, 179 - Color.green(0), objArr2);
            obj = objArr2[0];
        }
        return mergeParams.onExtraCallback(str, "HH:mm", ((String) obj).intern());
    }

    public final class onNavigationEvent {
        final /* synthetic */ AccountNotificationHistoryActivity onExtraCallback;
        private final String onExtraCallbackWithResult;

        public onNavigationEvent(@NotNull AccountNotificationHistoryActivity accountNotificationHistoryActivity, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = accountNotificationHistoryActivity;
            this.onExtraCallbackWithResult = str;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    public final class onExtraCallbackWithResult {
        private final String onNavigationEvent;
        final /* synthetic */ AccountNotificationHistoryActivity onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull AccountNotificationHistoryActivity accountNotificationHistoryActivity, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = accountNotificationHistoryActivity;
            this.onNavigationEvent = str;
        }

        public final String IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }

    public final class IAuthTabCallback {
        private final float onExtraCallback;

        public IAuthTabCallback(float f) {
            this.onExtraCallback = f;
        }

        public final float onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    public final class onWarmupCompleted {
        private final float onExtraCallbackWithResult;

        public onWarmupCompleted(float f) {
            this.onExtraCallbackWithResult = f;
        }

        public final float onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-261575821, 261575827, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, Throwable th) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-454049371, 454049371, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, th});
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(126382130, -126382127, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
    }

    public static /* synthetic */ void IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(212324575, -212324574, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity});
    }

    public static final /* synthetic */ SessionTrackera onExtraCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (SessionTrackera) onExtraCallbackWithResult(-55352491, 55352500, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity});
    }

    private final void ICustomTabsService_Parcel() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-150529738, 150529743, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this});
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-1349439163, 1349439165, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
    }

    private static final Unit onNavigationEvent(AccountNotificationHistoryActivity accountNotificationHistoryActivity, getAdComponentViewApi getadcomponentviewapi) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-169537072, 169537080, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, getadcomponentviewapi});
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1261915766, -1261915756, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
    }

    private final void onExtraCallbackWithResult(AdComponentViewParentApi adComponentViewParentApi) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-697774827, 697774838, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, adComponentViewParentApi});
    }

    private static final Unit IAuthTabCallback(AccountNotificationHistoryActivity accountNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1983629621, 1983629625, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountNotificationHistoryActivity, deserializeurinullablecollection});
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(45880277, -45880270, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj});
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationHistoryActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 73;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationHistoryActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = writeTypedObject + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationHistoryActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallback + 65;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationHistoryActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 49;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        extraCallbackWithResult = 478308981;
    }
}
