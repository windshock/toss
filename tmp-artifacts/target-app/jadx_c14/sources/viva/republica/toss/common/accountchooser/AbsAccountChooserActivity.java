package viva.republica.toss.common.accountchooser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DERConstructedSet;
import o.IPostMessageServiceStubProxy;
import o.KeyBoardVisiblePoint;
import o.ReactQueueConfigurationImplCompanion;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access15400;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getPadBits;
import o.getPathLenConstraint;
import o.getTimestampBytes;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.accountchooser.AbsAccountChooserActivity$onActivityResult$1$;
import viva.republica.toss.send.v3.TransferRegisterAccountActivity;
import viva.republica.toss.signup.SelectBankActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class AbsAccountChooserActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static final AtomicInteger IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static deserializeUriNullableCollection access000 = null;
    private static final getTimestampBytes<KeyBoardVisiblePoint> asInterface;
    private static int onActivityLayout = 0;
    private static int onMessageChannelReady = 1;
    private static long onMinimized;
    public static final int onTransact;
    public RecyclerView IAuthTabCallbackDefault;
    public getPathLenConstraint asBinder;
    private ViewGroup extraCallbackWithResult;
    private final onExtraCallback getInterfaceDescriptor;
    private boolean onActivityResized;
    private boolean readTypedObject;
    private String extraCallback = "";
    private String IAuthTabCallbackStubProxy = "";
    private String writeTypedObject = "";
    private ArrayList<KeyBoardVisiblePoint> access100 = new ArrayList<>();
    private String onPostMessage = "";
    private String ICustomTabsCallback = "";

    public interface onExtraCallback {
        void IAuthTabCallback();

        void onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint);
    }

    public static final class onNavigationEvent {
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 65;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = onMessageChannelReady + 45;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AbsAccountChooserActivity absAccountChooserActivity, Function1 function1, List list) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            return (Unit) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 45082028, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -45082027, new Object[]{absAccountChooserActivity, function1, list}, iOnNavigationEvent);
        }
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 45082028, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent4, -45082027, new Object[]{absAccountChooserActivity, function1, list}, iOnNavigationEvent3);
        int i3 = 72 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = onActivityLayout + 9;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i6)) | i8;
        int i10 = ~i2;
        int i11 = ~i6;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i6 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i2 + i4 + ((-327997910) * i) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i2) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i4) + (36700160 * i) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i2 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i4 * (-238134313)) + (i * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        return i21 != 1 ? i21 != 2 ? i21 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onActivityLayout + 9;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public abstract void IAuthTabCallback(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint);

    public void IAuthTabCallback(@NotNull getPathLenConstraint getpathlenconstraint) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 43;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getpathlenconstraint, "");
        int i4 = onMessageChannelReady + 9;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public void onExtraCallbackWithResult(@NotNull List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    public List<Object> onWarmupCompleted(@NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (i3 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract getByteBuffer<List<KeyBoardVisiblePoint>> onWarmupCompleted(boolean z);

    public static final /* synthetic */ deserializeUriNullableCollection ICustomTabsServiceStub() {
        deserializeUriNullableCollection deserializeurinullablecollection;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 115;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 != 0) {
            deserializeurinullablecollection = access000;
            int i4 = 43 / 0;
        } else {
            deserializeurinullablecollection = access000;
        }
        int i5 = i3 + 119;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return deserializeurinullablecollection;
    }

    public static final /* synthetic */ void onExtraCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 23;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        access000 = deserializeurinullablecollection;
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = i3 + 27;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel = iIntValue;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 39;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i2 + 39;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    public static final /* synthetic */ getTimestampBytes updateVisuals() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AtomicInteger validateRelationship() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 107;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        AtomicInteger atomicInteger = IAuthTabCallbackStub;
        int i5 = i3 + 33;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return atomicInteger;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AbsAccountChooserActivity absAccountChooserActivity = (AbsAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        String str = absAccountChooserActivity.writeTypedObject;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ArrayList<KeyBoardVisiblePoint> writeTypedList() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 41;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<KeyBoardVisiblePoint> arrayList = this.access100;
        int i5 = i2 + 97;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return arrayList;
    }

    protected onExtraCallback IAuthTabCallback() {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 67;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            onextracallback = this.getInterfaceDescriptor;
            int i4 = 2 / 0;
        } else {
            onextracallback = this.getInterfaceDescriptor;
        }
        int i5 = i2 + 11;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public final RecyclerView IEngagementSignalsCallback() {
        int i = 2 % 2;
        RecyclerView recyclerView = this.IAuthTabCallbackDefault;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onMessageChannelReady + 75;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return recyclerView;
    }

    public final void onNavigationEvent(@NotNull RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            this.IAuthTabCallbackDefault = recyclerView;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.IAuthTabCallbackDefault = recyclerView;
        int i3 = onActivityLayout + 23;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
    }

    public final getPathLenConstraint ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        getPathLenConstraint getpathlenconstraint = this.asBinder;
        if (getpathlenconstraint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = onMessageChannelReady + 49;
            onActivityLayout = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i3 = onActivityLayout;
        int i4 = i3 + 9;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        onMessageChannelReady = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return getpathlenconstraint;
    }

    public final void onNavigationEvent(@NotNull getPathLenConstraint getpathlenconstraint) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 77;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getpathlenconstraint, "");
        this.asBinder = getpathlenconstraint;
        int i4 = onActivityLayout + 63;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onNavigationEvent = 5334104478071624566L;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Context context, Class cls, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, deserializeFloat deserializefloat, String str6, String str7, String str8, String str9, int i, Object obj) {
            String str10;
            String str11;
            String str12;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 99;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            String str13 = (i & 4) != 0 ? "" : str;
            String str14 = (i & 8) != 0 ? "" : str2;
            if ((i & 16) != 0) {
                int i6 = i4 + 69;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i4 + 33;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                str10 = "";
            } else {
                str10 = str3;
            }
            if ((i & 32) != 0) {
                int i10 = i4 + 5;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                str11 = "";
            } else {
                str11 = str4;
            }
            if ((i & 64) != 0) {
                int i12 = IAuthTabCallback + 17;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 / 3;
                }
                str12 = "";
            } else {
                str12 = str5;
            }
            return iAuthTabCallback.onExtraCallbackWithResult(context, cls, str13, str14, str10, str11, str12, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, deserializefloat, str6, (i & 2048) != 0 ? "계좌 연결하기" : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x024e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 599
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.accountchooser.AbsAccountChooserActivity.IAuthTabCallback.a(char[], int, java.lang.Object[]):void");
        }

        public final <T> Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull Class<T> cls, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @Nullable deserializeFloat<KeyBoardVisiblePoint> deserializefloat, @NotNull String str6, @NotNull String str7, @Nullable String str8, @Nullable String str9) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str10 = "";
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            onWarmupCompleted(this, 0, 1, null);
            if (deserializefloat != null) {
                AbsAccountChooserActivity.onExtraCallback(AbsAccountChooserActivity.updateVisuals().IAuthTabCallback(deserializefloat));
                Object[] objArr = {Integer.valueOf(AbsAccountChooserActivity.validateRelationship().getAndIncrement())};
                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                AbsAccountChooserActivity.onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -326121746, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 326121748, objArr, iOnNavigationEvent);
            }
            Intent intent = new Intent(context, (Class<?>) cls);
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            intent.putExtra("id", ((Integer) AbsAccountChooserActivity.onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 761419767, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, -761419764, new Object[0], iOnNavigationEvent2)).intValue());
            Object[] objArr2 = new Object[1];
            a(new char[]{5685, 20933, 39407, 49642, 2448}, TextUtils.getOffsetAfter("", 0) + 18413, objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), str);
            Object[] objArr3 = new Object[1];
            a(new char[]{5682, 54131, 40109, 23008, 820, 52310, 35207, 29397}, 50504 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            intent.putExtra(((String) objArr3[0]).intern(), str2);
            Object[] objArr4 = new Object[1];
            a(new char[]{5669, 58117, 64624, 51521, 49847, 57229, 43255, 42450, 48928, 34823, 34149}, 62753 - (Process.myPid() >> 22), objArr4);
            intent.putExtra(((String) objArr4[0]).intern(), str3);
            intent.putExtra("screenName", str4);
            intent.putExtra("serviceId", str5);
            intent.putExtra("supportAccountAdd", z);
            intent.putExtra("freepass", z2);
            intent.putExtra("requestTag", str6);
            intent.putExtra("cta", str7);
            if (str8 != null) {
                int i4 = onWarmupCompleted + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                str10 = str8;
            }
            Object[] objArr5 = new Object[1];
            a(new char[]{5683, 20137, 42813, 8067, 29703, 44274, 1386, 32232}, 22669 - Color.red(0), objArr5);
            intent.putExtra(((String) objArr5[0]).intern(), str10);
            intent.putExtra("serviceReferrer", str9);
            return intent;
        }

        public static /* synthetic */ void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 11;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i5 + 55;
                int i8 = i7 % 128;
                onWarmupCompleted = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 49;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i = -1;
            }
            iAuthTabCallback.IAuthTabCallback(i);
        }

        public final void IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (i != -1) {
                int i6 = i3 + 25;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    int i7 = 24 / 0;
                    if (i != ((Integer) AbsAccountChooserActivity.onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 761419767, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -761419764, new Object[0], iOnNavigationEvent)).intValue()) {
                        return;
                    }
                } else {
                    int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    if (i != ((Integer) AbsAccountChooserActivity.onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 761419767, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -761419764, new Object[0], iOnNavigationEvent2)).intValue()) {
                        return;
                    }
                }
            }
            deserializeUriNullableCollection deserializeurinullablecollectionICustomTabsServiceStub = AbsAccountChooserActivity.ICustomTabsServiceStub();
            if (deserializeurinullablecollectionICustomTabsServiceStub != null) {
                deserializeurinullablecollectionICustomTabsServiceStub.dispose();
            }
            int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            AbsAccountChooserActivity.onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -326121746, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 326121748, new Object[]{-1}, iOnNavigationEvent3);
            int i8 = IAuthTabCallback + 97;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onMinimized ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 41;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onMinimized)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 84 - View.MeasureSpec.getSize(0), Color.blue(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14184), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 29;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        onVerticalScrollEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        onTransact = 8;
        IAuthTabCallbackStub = new AtomicInteger();
        getTimestampBytes<KeyBoardVisiblePoint> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        asInterface = gettimestampbytesIAuthTabCallback;
        IAuthTabCallback_Parcel = -1;
        int i = ICustomTabsCallbackDefault + 79;
        ICustomTabsCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements onExtraCallback {
        IAuthTabCallbackDefault() {
        }

        @Override // viva.republica.toss.common.accountchooser.AbsAccountChooserActivity.onExtraCallback
        public void onExtraCallbackWithResult(KeyBoardVisiblePoint keyBoardVisiblePoint) {
            Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
            onExtraCallback onextracallbackIAuthTabCallback = AbsAccountChooserActivity.this.IAuthTabCallback();
            if (onextracallbackIAuthTabCallback != null) {
                onextracallbackIAuthTabCallback.onExtraCallbackWithResult(keyBoardVisiblePoint);
            }
            AbsAccountChooserActivity.this.IAuthTabCallback(keyBoardVisiblePoint);
            AbsAccountChooserActivity.updateVisuals().onExtraCallback(keyBoardVisiblePoint);
        }

        @Override // viva.republica.toss.common.accountchooser.AbsAccountChooserActivity.onExtraCallback
        public void IAuthTabCallback() {
            onExtraCallback onextracallbackIAuthTabCallback = AbsAccountChooserActivity.this.IAuthTabCallback();
            if (onextracallbackIAuthTabCallback != null) {
                onextracallbackIAuthTabCallback.IAuthTabCallback();
            }
            AbsAccountChooserActivity.this.setEngagementSignalsCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String stringExtra;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 91;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_account_chooser);
        Intent intent = getIntent();
        Object obj = null;
        Object[] objArr = new Object[1];
        c(new char[]{36506, 36590, 18027, 39818, 44435, 60582, 8379, 19676, 11897}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 18, objArr);
        String stringExtra2 = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        asInterface(stringExtra2);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        String stringExtra3 = getIntent().getStringExtra("screenName");
        if (stringExtra3 == null) {
            int i4 = onActivityLayout + 33;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            stringExtra3 = "";
        }
        this.extraCallback = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("serviceId");
        if (stringExtra4 == null) {
            int i6 = onActivityLayout + 89;
            int i7 = i6 % 128;
            onMessageChannelReady = i7;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = i7 + 37;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            stringExtra4 = "";
        }
        this.onPostMessage = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("requestTag");
        if (stringExtra5 == null) {
            int i10 = onActivityLayout + 109;
            onMessageChannelReady = i10 % 128;
            int i11 = i10 % 2;
            stringExtra5 = "";
        }
        this.ICustomTabsCallback = stringExtra5;
        this.readTypedObject = getIntent().getBooleanExtra("freepass", false);
        this.onActivityResized = getIntent().getBooleanExtra("supportAccountAdd", true);
        String stringExtra6 = getIntent().getStringExtra("cta");
        if (stringExtra6 == null) {
            int i12 = onActivityLayout + 27;
            onMessageChannelReady = i12 % 128;
            int i13 = i12 % 2;
            stringExtra6 = getString(R.string.app_common_accountchooser___4cccebbde4);
            Intrinsics.checkNotNullExpressionValue(stringExtra6, "");
        }
        this.IAuthTabCallbackStubProxy = stringExtra6;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i14 = onActivityLayout + 41;
            onMessageChannelReady = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr2 = new Object[1];
            c(new char[]{15797, 15815, 40478, 48671, 30186, 46907, 37763, 26971, 30189, 60493, 60504, 1384}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 18, objArr2);
            stringExtra = intent2.getStringExtra(((String) objArr2[0]).intern());
            if (stringExtra == null) {
                int i16 = onActivityLayout + 83;
                onMessageChannelReady = i16 % 128;
                int i17 = i16 % 2;
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        this.writeTypedObject = stringExtra;
        RecyclerView recyclerViewFindViewById = findViewById(R.id.recyclerView);
        Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
        onNavigationEvent(recyclerViewFindViewById);
        View viewFindViewById = findViewById(R.id.loading_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.extraCallbackWithResult = (ViewGroup) viewFindViewById;
        IEngagementSignalsCallback().setLayoutManager(new LinearLayoutManager(this));
        onNavigationEvent(new getPathLenConstraint(IEngagementSignalsCallbackStub(), this.IAuthTabCallbackStubProxy, new IAuthTabCallbackDefault()));
        IAuthTabCallback(ICustomTabsServiceStubProxy());
        IEngagementSignalsCallback().setAdapter(ICustomTabsServiceStubProxy());
        IAuthTabCallback(true);
    }

    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(this, z, null, 2, null);
        int i4 = onMessageChannelReady + 95;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        Object L$0;
        int label;
        final /* synthetic */ AbsAccountChooserActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(int i, int i2, Intent intent, AbsAccountChooserActivity absAccountChooserActivity, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$requestCode = i;
            this.$resultCode = i2;
            this.$data = intent;
            this.this$0 = absAccountChooserActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$requestCode, this.$resultCode, this.$data, this.this$0, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList parcelableArrayListExtra;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$requestCode == 30001 && this.$resultCode == -1) {
                    Intent intent = this.$data;
                    TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_KEY_REGISTERED_BANK_ACCOUNTS")) == null) ? null : (TabBarInfoQueryPointOnTabBarInfoQueryListener) CollectionsKt.firstOrNull(parcelableArrayListExtra);
                    if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
                        disableOldAndroidAttachmentMetricsWorkarounds disableoldandroidattachmentmetricsworkarounds = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback;
                        this.L$0 = access15400.onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                        this.label = 1;
                        if (disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallbackWithResult(disableoldandroidattachmentmetricsworkarounds, tabBarInfoQueryPointOnTabBarInfoQueryListener, true, false, this, 4, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ((Result) obj).onNavigationEvent();
            AbsAccountChooserActivity absAccountChooserActivity = this.this$0;
            absAccountChooserActivity.IAuthTabCallback(false, new AbsAccountChooserActivity$onActivityResult$1$.ExternalSyntheticLambda0(absAccountChooserActivity));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(AbsAccountChooserActivity absAccountChooserActivity, List list) {
            List listFilterIsInstance = CollectionsKt.filterIsInstance(list, KeyBoardVisiblePoint.class);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listFilterIsInstance) {
                if (!absAccountChooserActivity.writeTypedList().contains((KeyBoardVisiblePoint) obj)) {
                    arrayList.add(obj);
                }
            }
            absAccountChooserActivity.onExtraCallbackWithResult(arrayList);
            return Unit.INSTANCE;
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(i, i2, intent, this, null), 3, (Object) null);
        int i4 = onMessageChannelReady + 75;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(AbsAccountChooserActivity absAccountChooserActivity, boolean z, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshChooserAccountList");
        }
        int i3 = onMessageChannelReady + 89;
        int i4 = i3 % 128;
        onActivityLayout = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 27;
            onMessageChannelReady = i6 % 128;
            function1 = null;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
        absAccountChooserActivity.IAuthTabCallback(z, function1);
        int i7 = onActivityLayout + 113;
        onMessageChannelReady = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 47;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onActivityLayout + 9;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void IAuthTabCallback(boolean z, @Nullable final Function1<? super List<Object>, Unit> function1) {
        int i = 2 % 2;
        getByteBuffer getbytebufferOnExtraCallback = onWarmupCompleted(z).onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.common.accountchooser.AbsAccountChooserActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return AbsAccountChooserActivity.onExtraCallback(this.f$0, function1, (List) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.common.accountchooser.AbsAccountChooserActivity$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                AbsAccountChooserActivity.IAuthTabCallbackDefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.common.accountchooser.AbsAccountChooserActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return AbsAccountChooserActivity.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        getbytebufferOnExtraCallback.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.common.accountchooser.AbsAccountChooserActivity$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                AbsAccountChooserActivity.onWarmupCompleted(function13, obj);
            }
        });
        int i2 = onActivityLayout + 83;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 53;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityLayout + 81;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, viva.republica.toss.common.accountchooser.AbsAccountChooserActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        boolean z;
        boolean z2 = false;
        ?? r1 = (AbsAccountChooserActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        List list = (List) objArr[2];
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Intent intent = r1.getIntent();
        String str = "";
        Object[] objArr2 = new Object[1];
        c(new char[]{25084, 24975, 57021, 51425, 13657, 10617, 53201, 8097, 60350, 44280, 39595, 39724}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intent intent2 = r1.getIntent();
        Object[] objArr3 = new Object[1];
        c(new char[]{41932, 41896, 51807, 18374, 8619, 27620, 3578, 37015, 43316, 47127, 5505, 55735, 65325, 27101, 41811}, TextUtils.getCapsMode("", 0, 0) + 1, objArr3);
        String stringExtra2 = intent2.getStringExtra(((String) objArr3[0]).intern());
        Object obj = null;
        if (stringExtra2 != null) {
            int i2 = onActivityLayout + 51;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = stringExtra2;
        }
        if (stringExtra.length() > 0) {
            int i3 = onMessageChannelReady + 53;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onActivityLayout + 119;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (str.length() > 0) {
            int i7 = onActivityLayout + 125;
            onMessageChannelReady = i7 % 128;
            if (i7 % 2 != 0) {
                z2 = true;
            }
        }
        if (z2 | z) {
            arrayList.add(new onExtraCallbackWithResult(stringExtra, str));
        }
        Intrinsics.checkNotNull(list);
        arrayList.addAll(list);
        if (((AbsAccountChooserActivity) r1).onActivityResized) {
            arrayList.add(new onNavigationEvent());
        }
        r1.ICustomTabsServiceStubProxy().onExtraCallbackWithResult(r1.onWarmupCompleted(arrayList), true);
        if (function1 != null) {
            int i8 = onMessageChannelReady + 67;
            onActivityLayout = i8 % 128;
            if (i8 % 2 != 0) {
                function1.invoke(arrayList);
                throw null;
            }
            function1.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 101;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        String str = this.extraCallback;
        int i5 = i2 + 5;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super/*im.toss.uikit.base.UIKitBaseActivity*/.getScreenParams();
        if (screenParams == null) {
            screenParams = new LinkedHashMap<>();
        }
        Object[] objArr = new Object[1];
        c(new char[]{15797, 15815, 40478, 48671, 30186, 46907, 37763, 26971, 30189, 60493, 60504, 1384}, 1 - (Process.myTid() >> 22), objArr);
        screenParams.put(((String) objArr[0]).intern(), this.writeTypedObject);
        int i4 = onMessageChannelReady + 87;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        ArrayList<KeyBoardVisiblePoint> arrayList = this.access100;
        arrayList.clear();
        arrayList.addAll(CollectionsKt.filterIsInstance(ICustomTabsServiceStubProxy().onExtraCallbackWithResult(), KeyBoardVisiblePoint.class));
        if (this.readTypedObject) {
            int i2 = onMessageChannelReady + 55;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                startActivityForResult(TransferRegisterAccountActivity.onWarmupCompleted.onNavigationEvent(TransferRegisterAccountActivity.Companion, this, this.extraCallback, getString(R.string.app_common_accountchooser___fdfc4beca1), (String) null, (String) null, (String) null, (UTF8Decoder) null, (TransferRegisterAccountActivity.onExtraCallbackWithResult) null, true, false, true, (String) null, (String) null, (String) null, 9911, (Object) null), 26022);
                return;
            } else {
                startActivityForResult(TransferRegisterAccountActivity.onWarmupCompleted.onNavigationEvent(TransferRegisterAccountActivity.Companion, this, this.extraCallback, getString(R.string.app_common_accountchooser___fdfc4beca1), (String) null, (String) null, (String) null, (UTF8Decoder) null, (TransferRegisterAccountActivity.onExtraCallbackWithResult) null, false, false, false, (String) null, (String) null, (String) null, 16376, (Object) null), 30001);
                return;
            }
        }
        if (!Intrinsics.areEqual(this.onPostMessage, "115")) {
            DERConstructedSet.onExtraCallbackWithResult(DERConstructedSet.onNavigationEvent, this, null, null, "TRANSFER", 6, null);
            return;
        }
        int i3 = onActivityLayout + 17;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            startActivityForResult(SelectBankActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(SelectBankActivity.Companion, this, ReactQueueConfigurationImplCompanion.AVAILABLE_INQUIRY, "SAVING_BOX", (String) null, (String) null, (String) null, (Integer[]) null, (String) null, (getPadBits) null, (String) null, (String) null, (String) null, true, 16127, (Object) null), 24378);
        } else {
            startActivityForResult(SelectBankActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(SelectBankActivity.Companion, this, ReactQueueConfigurationImplCompanion.AVAILABLE_INQUIRY, "SAVING_BOX", (String) null, (String) null, (String) null, (Integer[]) null, (String) null, (getPadBits) null, (String) null, (String) null, (String) null, false, 8184, (Object) null), 30001);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Companion.IAuthTabCallback(getIntent().getIntExtra("id", -1));
        int i4 = onActivityLayout + 83;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallback;
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }
    }

    public static final /* synthetic */ int access200() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return ((Integer) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 761419767, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -761419764, new Object[0], iOnNavigationEvent)).intValue();
    }

    public static final /* synthetic */ void IAuthTabCallback(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -326121746, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 326121748, objArr, iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(AbsAccountChooserActivity absAccountChooserActivity, Function1 function1, List list) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 45082028, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -45082027, new Object[]{absAccountChooserActivity, function1, list}, iOnNavigationEvent);
    }

    public final String ICustomTabsService_Parcel() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (String) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1241880509, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -1241880509, new Object[]{this}, iOnNavigationEvent);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 39;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onMessageChannelReady + 21;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onMessageChannelReady + 123;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 3;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onActivityLayout + 23;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 59;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
    }

    static void onVerticalScrollEvent() {
        onMinimized = 4139019679867900061L;
    }
}
