package im.toss.core.widget.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import im.toss.core.R;
import im.toss.core.widget.keyboard.SecureQwertyKeyboard$;
import im.toss.tds.view.component.atom.text.Typography4;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.AppManagerImpl1;
import o.AppManagerImpl2;
import o.addAllCommandLine;
import o.fillPrepareEventData;
import o.getMemoryDumpCount;
import o.getPreRenderJob;
import o.getWrite;
import o.isOneShot;
import o.noStore;
import o.preCreateApp;
import o.setIconPaddingRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SecureQwertyKeyboard extends LinearLayout {
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new MutablePropertyReference1Impl<>(SecureQwertyKeyboard.class, "shiftKeyState", "getShiftKeyState()Lim/toss/core/widget/keyboard/ShiftKey;", 0), new MutablePropertyReference1Impl<>(SecureQwertyKeyboard.class, "changeKeyState", "getChangeKeyState()Lim/toss/core/widget/keyboard/ChangeKey;", 0)};
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private final Lazy IAuthTabCallbackDefault;
    private Function1<? super Integer, Unit> IAuthTabCallbackStub;
    private final ReadWriteProperty IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private final int access000;
    private final int access100;
    private final int asBinder;
    private Function1<? super AppManagerImpl2, Unit> asInterface;
    private final Lazy getInterfaceDescriptor;
    private final int onExtraCallback;
    private final ReadWriteProperty onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final List<AppManagerImpl2.onExtraCallbackWithResult> onTransact;
    private final setIconPaddingRight onWarmupCompleted;

    static {
        int i = readTypedObject + 113;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureQwertyKeyboard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureQwertyKeyboard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppManagerImpl2 appManagerImpl2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(appManagerImpl2);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallback(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(secureQwertyKeyboard, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(SecureQwertyKeyboard secureQwertyKeyboard, int i, View view) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 59;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(secureQwertyKeyboard, i, view);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(secureQwertyKeyboard, view);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = ICustomTabsCallback + 33;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 31;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i);
        int i5 = ICustomTabsCallback + 61;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(new Object[]{secureQwertyKeyboard, view}, 2905711, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -2905704, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = ICustomTabsCallback + 111;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List listIAuthTabCallbackDefault = IAuthTabCallbackDefault(secureQwertyKeyboard);
        int i4 = extraCallback + 111;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return listIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i);
        int i8 = ~(i | i3);
        int i9 = i7 | i8;
        int i10 = ~i5;
        int i11 = ~i;
        int i12 = (~(i10 | i3)) | (~(i10 | i11)) | (~(i11 | i3));
        int i13 = ~i3;
        int i14 = i12 | (~(i13 | i5 | i));
        int i15 = (~(i13 | i11)) | i5 | i8;
        int i16 = i5 + i + i4 + (1962400304 * i2) + (1167700406 * i6);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1629562239)) - 1134582380) + (i * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + ((-1629561329) * i4) + ((-1621399344) * i2) + ((-873382486) * i6) + (i17 * 1407582208);
        switch (((i5 * (-1019457937)) - 559939584) + ((-1019457937) * i) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i4) + ((-1660944384) * i2) + ((-325058560) * i6) + (867827712 * i17) + (i18 * i18 * (-1895432192))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            default:
                SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
                int i19 = 2 % 2;
                int i20 = extraCallback + 39;
                ICustomTabsCallback = i20 % 128;
                int i21 = i20 % 2;
                setIconPaddingRight seticonpaddingright = secureQwertyKeyboard.onWarmupCompleted;
                List listPlus = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(new LinearLayout[]{seticonpaddingright.ICustomTabsServiceStub, seticonpaddingright.warmup, seticonpaddingright.validateRelationship, seticonpaddingright.updateVisuals, seticonpaddingright.ICustomTabsServiceDefault, seticonpaddingright.ICustomTabsServiceStubProxy, seticonpaddingright.writeTypedList, seticonpaddingright.ICustomTabsService_Parcel, seticonpaddingright.access200, seticonpaddingright.IEngagementSignalsCallback, seticonpaddingright.onGreatestScrollPercentageIncreased}), CollectionsKt.listOf(new LinearLayout[]{seticonpaddingright.onSessionEnded, seticonpaddingright.onVerticalScrollEvent, seticonpaddingright.IEngagementSignalsCallbackDefault, seticonpaddingright.IEngagementSignalsCallbackStub, seticonpaddingright.IPostMessageServiceStub, seticonpaddingright.IEngagementSignalsCallback_Parcel, seticonpaddingright.IPostMessageService, seticonpaddingright.IPostMessageServiceDefault, seticonpaddingright.IEngagementSignalsCallbackStubProxy, seticonpaddingright.IPostMessageServiceStubProxy})), CollectionsKt.listOf(new LinearLayout[]{seticonpaddingright.ITrustedWebActivityCallbackDefault, seticonpaddingright.ITrustedWebActivityCallback, seticonpaddingright.ITrustedWebActivityCallbackStub, seticonpaddingright.IPostMessageService_Parcel, seticonpaddingright.areNotificationsEnabled, seticonpaddingright.ITrustedWebActivityCallback_Parcel, seticonpaddingright.ITrustedWebActivityService, seticonpaddingright.ITrustedWebActivityCallbackStubProxy}));
                int i22 = extraCallback + 51;
                ICustomTabsCallback = i22 % 128;
                int i23 = i22 % 2;
                return listPlus;
        }
    }

    public static /* synthetic */ List onNavigationEvent(SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(secureQwertyKeyboard);
        }
        asInterface(secureQwertyKeyboard);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(secureQwertyKeyboard, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(SecureQwertyKeyboard secureQwertyKeyboard, TextView textView, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(secureQwertyKeyboard, textView, view);
        int i4 = ICustomTabsCallback + 107;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        fillPrepareEventData fillprepareeventdataIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = ICustomTabsCallback + 123;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fillprepareeventdataIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (List) onNavigationEvent(new Object[]{secureQwertyKeyboard}, -761712313, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 761712313, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(secureQwertyKeyboard, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 31;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureQwertyKeyboard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setIconPaddingRight seticonpaddingrightOnExtraCallbackWithResult = setIconPaddingRight.onExtraCallbackWithResult(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(seticonpaddingrightOnExtraCallbackWithResult, "");
        this.onWarmupCompleted = seticonpaddingrightOnExtraCallbackWithResult;
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new SecureQwertyKeyboard$.ExternalSyntheticLambda7());
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new SecureQwertyKeyboard$.ExternalSyntheticLambda8(this));
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new SecureQwertyKeyboard$.ExternalSyntheticLambda9(this));
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new SecureQwertyKeyboard$.ExternalSyntheticLambda10(this));
        IntRange intRange = new IntRange(0, 9);
        Random.Default r1 = Random.onNavigationEvent;
        this.access100 = RangesKt.random(intRange, r1);
        this.asBinder = RangesKt.random(new IntRange(0, 9), r1);
        this.onExtraCallback = RangesKt.random(new IntRange(0, 8), r1);
        this.access000 = RangesKt.random(new IntRange(0, 7), r1);
        List listOnWarmupCompleted = asBinder().onWarmupCompleted();
        this.onTransact = CollectionsKt.plus(CollectionsKt.listOf(CollectionsKt.first(listOnWarmupCompleted)), CollectionsKt.shuffled(CollectionsKt.drop(listOnWarmupCompleted, 1)));
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        AppManagerImpl1.IAuthTabCallback iAuthTabCallback = AppManagerImpl1.IAuthTabCallback.onExtraCallback;
        this.IAuthTabCallbackStubProxy = new IAuthTabCallback(iAuthTabCallback, this);
        preCreateApp.onExtraCallbackWithResult onextracallbackwithresult = preCreateApp.onExtraCallbackWithResult.onWarmupCompleted;
        this.onExtraCallbackWithResult = new onExtraCallback(onextracallbackwithresult, this);
        this.asInterface = new SecureQwertyKeyboard$.ExternalSyntheticLambda11();
        this.IAuthTabCallbackStub = new SecureQwertyKeyboard$.ExternalSyntheticLambda12();
        onNavigationEvent(new Object[]{this, iAuthTabCallback}, -2062752513, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2062752519, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        IAuthTabCallback((preCreateApp) onextracallbackwithresult);
        onTransact();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecureQwertyKeyboard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallback + 3;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallback + 21;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        preCreateApp precreateapp = (preCreateApp) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        secureQwertyKeyboard.onExtraCallbackWithResult(precreateapp);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        AppManagerImpl1 appManagerImpl1 = (AppManagerImpl1) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        secureQwertyKeyboard.IAuthTabCallback(appManagerImpl1);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 37;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ preCreateApp onExtraCallbackWithResult(SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        preCreateApp precreateappOnExtraCallbackWithResult = secureQwertyKeyboard.onExtraCallbackWithResult();
        int i4 = ICustomTabsCallback + 67;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return precreateappOnExtraCallbackWithResult;
    }

    private static final fillPrepareEventData IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        fillPrepareEventData fillprepareeventdata = fillPrepareEventData.onNavigationEvent;
        int i4 = extraCallback + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return fillprepareeventdata;
        }
        throw null;
    }

    private final fillPrepareEventData asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        fillPrepareEventData fillprepareeventdata = (fillPrepareEventData) this.getInterfaceDescriptor.getValue();
        int i4 = ICustomTabsCallback + 109;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fillprepareeventdata;
        }
        throw null;
    }

    private final List<TextView> IAuthTabCallbackStub() {
        List<TextView> list;
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            list = (List) this.IAuthTabCallback_Parcel.getValue();
            int i3 = 49 / 0;
        } else {
            list = (List) this.IAuthTabCallback_Parcel.getValue();
        }
        int i4 = ICustomTabsCallback + 43;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    private static final List IAuthTabCallbackDefault(SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        setIconPaddingRight seticonpaddingright = secureQwertyKeyboard.onWarmupCompleted;
        List listListOf = CollectionsKt.listOf(new Typography4[]{seticonpaddingright.IAuthTabCallbackStub, seticonpaddingright.writeTypedObject, seticonpaddingright.ICustomTabsCallbackDefault, seticonpaddingright.postMessage, seticonpaddingright.prefetchWithMultipleUrls, seticonpaddingright.requestPostMessageChannelWithExtras, seticonpaddingright.requestPostMessageChannel, seticonpaddingright.setEngagementSignalsCallback, seticonpaddingright.receiveFile, seticonpaddingright.asBinder, seticonpaddingright.IAuthTabCallbackDefault});
        int i4 = ICustomTabsCallback + 79;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }

    private final List<Pair<TextView, TextView>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List<Pair<TextView, TextView>> list = (List) this.IAuthTabCallbackDefault.getValue();
        int i4 = ICustomTabsCallback + 1;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback extends ObservableProperty<AppManagerImpl1> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ SecureQwertyKeyboard IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Object obj, SecureQwertyKeyboard secureQwertyKeyboard) {
            super(obj);
            this.IAuthTabCallback = secureQwertyKeyboard;
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, AppManagerImpl1 appManagerImpl1, AppManagerImpl1 appManagerImpl12) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                Intrinsics.areEqual(SecureQwertyKeyboard.onExtraCallbackWithResult(this.IAuthTabCallback), preCreateApp.onExtraCallbackWithResult.onWarmupCompleted);
                throw null;
            }
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            AppManagerImpl1 appManagerImpl13 = appManagerImpl12;
            if (Intrinsics.areEqual(SecureQwertyKeyboard.onExtraCallbackWithResult(this.IAuthTabCallback), preCreateApp.onExtraCallbackWithResult.onWarmupCompleted)) {
                SecureQwertyKeyboard.onNavigationEvent(new Object[]{this.IAuthTabCallback, appManagerImpl13}, -2141308310, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2141308314, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            }
            int i3 = onExtraCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onExtraCallback extends ObservableProperty<preCreateApp> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ SecureQwertyKeyboard onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Object obj, SecureQwertyKeyboard secureQwertyKeyboard) {
            super(obj);
            this.onNavigationEvent = secureQwertyKeyboard;
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, preCreateApp precreateapp, preCreateApp precreateapp2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                SecureQwertyKeyboard secureQwertyKeyboard = this.onNavigationEvent;
                SecureQwertyKeyboard.onNavigationEvent(new Object[]{secureQwertyKeyboard, precreateapp2}, -1606159970, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1606159971, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                int i3 = 81 / 0;
            } else {
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                SecureQwertyKeyboard secureQwertyKeyboard2 = this.onNavigationEvent;
                SecureQwertyKeyboard.onNavigationEvent(new Object[]{secureQwertyKeyboard2, precreateapp2}, -1606159970, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1606159971, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            }
            int i4 = onExtraCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final List asInterface(SecureQwertyKeyboard secureQwertyKeyboard) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        setIconPaddingRight seticonpaddingright = secureQwertyKeyboard.onWarmupCompleted;
        List listPlus = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(seticonpaddingright.onTransact, seticonpaddingright.cancelNotification), getWrite.IAuthTabCallback(seticonpaddingright.asInterface, seticonpaddingright.getActiveNotifications), getWrite.IAuthTabCallback(seticonpaddingright.access000, seticonpaddingright.getSmallIconBitmap), getWrite.IAuthTabCallback(seticonpaddingright.IAuthTabCallbackStubProxy, seticonpaddingright.getSmallIconId), getWrite.IAuthTabCallback(seticonpaddingright.access100, seticonpaddingright.ITrustedWebActivityServiceDefault), getWrite.IAuthTabCallback(seticonpaddingright.getInterfaceDescriptor, seticonpaddingright.notifyNotificationWithChannel), getWrite.IAuthTabCallback(seticonpaddingright.IAuthTabCallback_Parcel, seticonpaddingright.ITrustedWebActivityService_Parcel), getWrite.IAuthTabCallback(seticonpaddingright.ICustomTabsCallback, seticonpaddingright.read), getWrite.IAuthTabCallback(seticonpaddingright.readTypedObject, seticonpaddingright.RemoteActionCompatParcelizer), getWrite.IAuthTabCallback(seticonpaddingright.extraCallback, seticonpaddingright.ITrustedWebActivityServiceStub), getWrite.IAuthTabCallback(seticonpaddingright.extraCallbackWithResult, seticonpaddingright.ITrustedWebActivityServiceStubProxy)}), CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(seticonpaddingright.onMessageChannelReady, seticonpaddingright.AudioAttributesImplApi21Parcelizer), getWrite.IAuthTabCallback(seticonpaddingright.onActivityLayout, seticonpaddingright.AudioAttributesImplApi26Parcelizer), getWrite.IAuthTabCallback(seticonpaddingright.onActivityResized, seticonpaddingright.IconCompatParcelizer), getWrite.IAuthTabCallback(seticonpaddingright.onPostMessage, seticonpaddingright.AudioAttributesCompatParcelizer), getWrite.IAuthTabCallback(seticonpaddingright.onMinimized, seticonpaddingright.write), getWrite.IAuthTabCallback(seticonpaddingright.ICustomTabsCallbackStubProxy, seticonpaddingright.MediaBrowserCompatMediaItem), getWrite.IAuthTabCallback(seticonpaddingright.onRelationshipValidationResult, seticonpaddingright.RatingCompat), getWrite.IAuthTabCallback(seticonpaddingright.onUnminimized, seticonpaddingright.AudioAttributesImplBaseParcelizer), getWrite.IAuthTabCallback(seticonpaddingright.ICustomTabsCallbackStub, seticonpaddingright.MediaDescriptionCompat), getWrite.IAuthTabCallback(seticonpaddingright.extraCommand, seticonpaddingright.MediaMetadataCompat)})), CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(seticonpaddingright.isEngagementSignalsApiAvailable, seticonpaddingright.RatingCompatStyle), getWrite.IAuthTabCallback(seticonpaddingright.ICustomTabsService, seticonpaddingright.RatingCompat1), getWrite.IAuthTabCallback(seticonpaddingright.ICustomTabsCallback_Parcel, seticonpaddingright.RatingCompatApi19Impl), getWrite.IAuthTabCallback(seticonpaddingright.mayLaunchUrl, seticonpaddingright.RatingCompatStarStyle), getWrite.IAuthTabCallback(seticonpaddingright.newSessionWithExtras, seticonpaddingright.MediaSessionCompatQueueItem), getWrite.IAuthTabCallback(seticonpaddingright.newSession, seticonpaddingright.ParcelableVolumeInfo), getWrite.IAuthTabCallback(seticonpaddingright.newAuthTabSession, seticonpaddingright.MediaSessionCompatToken), getWrite.IAuthTabCallback(seticonpaddingright.prefetch, seticonpaddingright.MediaSessionCompatResultReceiverWrapper)}));
        int i4 = ICustomTabsCallback + 7;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return listPlus;
    }

    private final List<LinearLayout> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List<LinearLayout> list = (List) this.onNavigationEvent.getValue();
        int i4 = ICustomTabsCallback + 97;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        AppManagerImpl1 appManagerImpl1 = (AppManagerImpl1) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        secureQwertyKeyboard.IAuthTabCallbackStubProxy.setValue(secureQwertyKeyboard, IAuthTabCallback[0], appManagerImpl1);
        int i4 = ICustomTabsCallback + 25;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final AppManagerImpl1 asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        extraCallback = i2 % 128;
        return (AppManagerImpl1) this.IAuthTabCallbackStubProxy.getValue(this, i2 % 2 != 0 ? IAuthTabCallback[1] : IAuthTabCallback[0]);
    }

    private final void IAuthTabCallback(preCreateApp precreateapp) {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            readWriteProperty = this.onExtraCallbackWithResult;
            addallcommandline = IAuthTabCallback[1];
        } else {
            readWriteProperty = this.onExtraCallbackWithResult;
            addallcommandline = IAuthTabCallback[1];
        }
        readWriteProperty.setValue(this, addallcommandline, precreateapp);
        int i3 = ICustomTabsCallback + 9;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final preCreateApp onExtraCallbackWithResult() {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            readWriteProperty = this.onExtraCallbackWithResult;
            addallcommandline = IAuthTabCallback[0];
        } else {
            readWriteProperty = this.onExtraCallbackWithResult;
            addallcommandline = IAuthTabCallback[1];
        }
        preCreateApp precreateapp = (preCreateApp) readWriteProperty.getValue(this, addallcommandline);
        int i3 = extraCallback + 49;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return precreateapp;
    }

    private static final Unit onExtraCallback(AppManagerImpl2 appManagerImpl2) {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appManagerImpl2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void setOnSecureQwertyKeyListener(@NotNull Function1<? super AppManagerImpl2, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.asInterface = function1;
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        this.asInterface = function1;
        int i3 = ICustomTabsCallback + 87;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 35;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = extraCallback + 9;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnVisibilityChangedListener(@NotNull Function1<? super Integer, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallbackStub = function1;
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
            secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallback.onExtraCallbackWithResult);
            int i3 = extraCallback + 77;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
        secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallback.onExtraCallbackWithResult);
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
        secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onNavigationEvent.onNavigationEvent);
        int i4 = ICustomTabsCallback + 31;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AppManagerImpl1.IAuthTabCallback iAuthTabCallback;
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
            AppManagerImpl1 appManagerImpl1AsInterface = secureQwertyKeyboard.asInterface();
            iAuthTabCallback = AppManagerImpl1.IAuthTabCallback.onExtraCallback;
            int i3 = 21 / 0;
            if (Intrinsics.areEqual(appManagerImpl1AsInterface, iAuthTabCallback)) {
                int i4 = extraCallback + 123;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallback = AppManagerImpl1.onNavigationEvent.onExtraCallback;
            }
        } else {
            isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
            AppManagerImpl1 appManagerImpl1AsInterface2 = secureQwertyKeyboard.asInterface();
            iAuthTabCallback = AppManagerImpl1.IAuthTabCallback.onExtraCallback;
            if (Intrinsics.areEqual(appManagerImpl1AsInterface2, iAuthTabCallback)) {
            }
        }
        onNavigationEvent(new Object[]{secureQwertyKeyboard, iAuthTabCallback}, -2062752513, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2062752519, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        return null;
    }

    private static final void asBinder(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
        preCreateApp precreateappOnExtraCallbackWithResult = secureQwertyKeyboard.onExtraCallbackWithResult();
        preCreateApp.onWarmupCompleted onwarmupcompleted = preCreateApp.onExtraCallbackWithResult.onWarmupCompleted;
        if (!(!Intrinsics.areEqual(precreateappOnExtraCallbackWithResult, onwarmupcompleted))) {
            onwarmupcompleted = preCreateApp.onWarmupCompleted.IAuthTabCallback;
            int i2 = ICustomTabsCallback + 45;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            }
        }
        secureQwertyKeyboard.IAuthTabCallback((preCreateApp) onwarmupcompleted);
        int i4 = extraCallback + 91;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onTransact(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
        secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult);
        int i4 = ICustomTabsCallback + 49;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(SecureQwertyKeyboard secureQwertyKeyboard, int i, View view) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 31;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
        secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallbackWithResult.Companion.onExtraCallback(((TextView) secureQwertyKeyboard.onExtraCallback().get(i).getFirst()).getText().toString()));
        int i5 = ICustomTabsCallback + 91;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onTransact() {
        int i = 2 % 2;
        setIconPaddingRight seticonpaddingright = this.onWarmupCompleted;
        seticonpaddingright.onWarmupCompleted.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda0(this));
        seticonpaddingright.onExtraCallback.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda1(this));
        seticonpaddingright.onNavigationEvent.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda2(this));
        seticonpaddingright.IAuthTabCallback.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda3(this));
        seticonpaddingright.onExtraCallbackWithResult.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda4(this));
        int i2 = 0;
        for (Object obj : onNavigationEvent()) {
            int i3 = extraCallback + 71;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                int i5 = extraCallback + 95;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i6 = 30 / 0;
                } else {
                    CollectionsKt.throwIndexOverflow();
                }
            }
            ((LinearLayout) obj).setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda5(this, i2));
            i2++;
            int i7 = ICustomTabsCallback + 67;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        for (TextView textView : IAuthTabCallbackStub()) {
            textView.setOnClickListener(new SecureQwertyKeyboard$.ExternalSyntheticLambda6(this, textView));
            int i9 = extraCallback + 33;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private static final void onExtraCallbackWithResult(SecureQwertyKeyboard secureQwertyKeyboard, TextView textView, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
            secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallbackWithResult.Companion.onExtraCallback(textView.getText().toString()));
        } else {
            isOneShot.onExtraCallbackWithResult(secureQwertyKeyboard, noStore.Companion.asBinder());
            secureQwertyKeyboard.asInterface.invoke(AppManagerImpl2.onExtraCallbackWithResult.Companion.onExtraCallback(textView.getText().toString()));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void IAuthTabCallback(AppManagerImpl1 appManagerImpl1) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 39;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.onNavigationEvent.onExtraCallback)) {
            int i5 = extraCallback + 67;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            i = R.drawable.icon_shift_selected;
        } else {
            if (!Intrinsics.areEqual(appManagerImpl1, AppManagerImpl1.IAuthTabCallback.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.icon_shift;
        }
        this.onWarmupCompleted.onNavigationEvent.setImageResource(i);
        onNavigationEvent(new Object[]{this, appManagerImpl1, Integer.valueOf(this.asBinder), Integer.valueOf(this.onExtraCallback), Integer.valueOf(this.access000)}, 1241631411, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1241631409, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i7 = extraCallback + 13;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(preCreateApp precreateapp) throws NoWhenBranchMatchedException {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(precreateapp, preCreateApp.onExtraCallbackWithResult.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(precreateapp, preCreateApp.onExtraCallbackWithResult.onWarmupCompleted)) {
            str = "영문자";
        } else {
            if (!Intrinsics.areEqual(precreateapp, preCreateApp.onWarmupCompleted.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = ICustomTabsCallback + 65;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            str = "특수";
        }
        this.onWarmupCompleted.IAuthTabCallback.setText(str);
        onNavigationEvent(precreateapp);
        if (Intrinsics.areEqual(precreateapp, preCreateApp.onWarmupCompleted.IAuthTabCallback)) {
            int i5 = ICustomTabsCallback + 101;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            IAuthTabCallback();
            int i7 = extraCallback + 7;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (!Intrinsics.areEqual(precreateapp, r1)) {
            throw new NoWhenBranchMatchedException();
        }
        onNavigationEvent(new Object[]{this, asInterface(), Integer.valueOf(this.asBinder), Integer.valueOf(this.onExtraCallback), Integer.valueOf(this.access000)}, 1241631411, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1241631409, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i9 = ICustomTabsCallback + 67;
        extraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 95 / 0;
        }
    }

    private final void onNavigationEvent(preCreateApp precreateapp) {
        int i = 2 % 2;
        List listOnExtraCallbackWithResult = asBinder().onExtraCallbackWithResult(precreateapp, this.access100);
        int i2 = 0;
        for (Object obj : IAuthTabCallbackStub()) {
            int i3 = ICustomTabsCallback + 55;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                int i5 = ICustomTabsCallback + 105;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            ((TextView) obj).setText(((AppManagerImpl2.onExtraCallbackWithResult) listOnExtraCallbackWithResult.get(i2)).onWarmupCompleted());
            i2++;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 7;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            super.setVisibility(i);
            this.IAuthTabCallbackStub.invoke(Integer.valueOf(i));
            int i4 = ICustomTabsCallback + 91;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.setVisibility(i);
        this.IAuthTabCallbackStub.invoke(Integer.valueOf(i));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[PHI: r4
      0x0083: PHI (r4v14 java.lang.Object) = (r4v9 java.lang.Object), (r4v15 java.lang.Object) binds: [B:11:0x0081, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object next;
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) objArr[0];
        AppManagerImpl1 appManagerImpl1 = (AppManagerImpl1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List listPlus = CollectionsKt.plus(CollectionsKt.plus(secureQwertyKeyboard.asBinder().IAuthTabCallback(appManagerImpl1, iIntValue), secureQwertyKeyboard.asBinder().onWarmupCompleted(appManagerImpl1, iIntValue2)), secureQwertyKeyboard.asBinder().onNavigationEvent(appManagerImpl1, iIntValue3));
        Iterator<T> it = secureQwertyKeyboard.onExtraCallback().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = extraCallback + 55;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                int i6 = 89 / 0;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                if (i4 < 0) {
                }
            }
            Pair pair = (Pair) next;
            TextView textView = (TextView) pair.onExtraCallbackWithResult();
            TextView textView2 = (TextView) pair.IAuthTabCallback();
            Pair pair2 = (Pair) listPlus.get(i4);
            AppManagerImpl2.onExtraCallbackWithResult onextracallbackwithresult = (AppManagerImpl2.onExtraCallbackWithResult) pair2.onExtraCallbackWithResult();
            AppManagerImpl2.onExtraCallbackWithResult onextracallbackwithresult2 = (AppManagerImpl2.onExtraCallbackWithResult) pair2.IAuthTabCallback();
            textView.setText(onextracallbackwithresult.onWarmupCompleted());
            textView2.setText(onextracallbackwithresult2.onWarmupCompleted());
            textView2.setVisibility(0);
            i4++;
        }
        return null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        for (Object obj : onExtraCallback()) {
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
                int i5 = extraCallback + 79;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            Pair pair = (Pair) obj;
            TextView textView = (TextView) pair.onExtraCallbackWithResult();
            TextView textView2 = (TextView) pair.IAuthTabCallback();
            textView.setText(this.onTransact.get(i4).onWarmupCompleted());
            textView2.setVisibility(8);
            i4++;
        }
    }

    public static /* synthetic */ List onExtraCallback(SecureQwertyKeyboard secureQwertyKeyboard) {
        return (List) onNavigationEvent(new Object[]{secureQwertyKeyboard}, 255088648, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -255088643, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ fillPrepareEventData onWarmupCompleted() {
        return (fillPrepareEventData) onNavigationEvent(new Object[0], -1966984091, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1966984094, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private final void onExtraCallback(AppManagerImpl1 appManagerImpl1, int i, int i2, int i3) {
        onNavigationEvent(new Object[]{this, appManagerImpl1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 1241631411, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1241631409, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final List IAuthTabCallback(SecureQwertyKeyboard secureQwertyKeyboard) {
        return (List) onNavigationEvent(new Object[]{secureQwertyKeyboard}, -761712313, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 761712313, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final void IAuthTabCallbackDefault(SecureQwertyKeyboard secureQwertyKeyboard, View view) {
        onNavigationEvent(new Object[]{secureQwertyKeyboard, view}, 2905711, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -2905704, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private final void onWarmupCompleted(AppManagerImpl1 appManagerImpl1) {
        onNavigationEvent(new Object[]{this, appManagerImpl1}, -2062752513, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2062752519, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }
}
