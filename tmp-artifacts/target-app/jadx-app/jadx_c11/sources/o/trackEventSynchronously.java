package o;

import android.app.PendingIntent;
import android.content.Intent;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackEventSynchronously {
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private Intent IAuthTabCallback;
    private long[] IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private String asBinder;
    private PendingIntent asInterface;
    private CharSequence onExtraCallback;
    private String onNavigationEvent;
    private CharSequence onTransact;
    private EventServiceImplExternalSyntheticLambda0 onWarmupCompleted = EventServiceImplExternalSyntheticLambda0.GENERAL;
    private int onExtraCallbackWithResult = 3;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i2 | i4 | i3);
        int i8 = ~i4;
        int i9 = (~(i8 | i3)) | (~((~i3) | i2));
        int i10 = (~(i3 | (~i2))) | i8;
        int i11 = i2 + i4 + i + ((-2044576983) * i5) + (1743660113 * i6);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i2) - 713031680) + (164951516 * i4) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i) + (689963008 * i5) + ((-299892736) * i6) + ((-1081737216) * i12);
        int i14 = ((i2 * 2048727874) - 782056376) + (i4 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i * 2048728315) + (i5 * 2142076211) + (i6 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        if (i15 != 1) {
            return i15 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[0];
        Intent intent = (Intent) objArr[1];
        int i16 = 2 % 2;
        int i17 = access100;
        int i18 = i17 + 111;
        getInterfaceDescriptor = i18 % 128;
        int i19 = i18 % 2;
        trackeventsynchronously.IAuthTabCallback = intent;
        int i20 = i17 + 49;
        getInterfaceDescriptor = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public final CharSequence asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onTransact = charSequence;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 33;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        trackeventsynchronously.onExtraCallback = charSequence;
        if (i3 != 0) {
            return null;
        }
        int i4 = 47 / 0;
        return null;
    }

    public final CharSequence onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 95;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequence = this.onExtraCallback;
        int i4 = i2 + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return charSequence;
    }

    public final Intent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intent intent = this.IAuthTabCallback;
        int i5 = i2 + 111;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return intent;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 99;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = str;
        int i5 = i2 + 117;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public final PendingIntent onTransact() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 101;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        PendingIntent pendingIntent = this.asInterface;
        int i4 = i2 + 81;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return pendingIntent;
    }

    public final void onExtraCallbackWithResult(@NotNull EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eventServiceImplExternalSyntheticLambda0, "");
            this.onWarmupCompleted = eventServiceImplExternalSyntheticLambda0;
        } else {
            Intrinsics.checkNotNullParameter(eventServiceImplExternalSyntheticLambda0, "");
            this.onWarmupCompleted = eventServiceImplExternalSyntheticLambda0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final EventServiceImplExternalSyntheticLambda0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = this.onWarmupCompleted;
        int i4 = i3 + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return eventServiceImplExternalSyntheticLambda0;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 85;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 41;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long[] asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 85;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long[] jArr = this.IAuthTabCallbackDefault;
        int i5 = i3 + 111;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return jArr;
    }

    public final void onWarmupCompleted(@Nullable long[] jArr) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 119;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = jArr;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 1;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 17;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = str;
        int i5 = i2 + 47;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        boolean z = trackeventsynchronously.IAuthTabCallbackStub;
        int i5 = i3 + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(z);
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 119;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 49;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }

    public final boolean IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 824163785, iOnExtraCallbackWithResult, -824163785, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult())).booleanValue();
    }

    public final void onNavigationEvent(@Nullable Intent intent) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1927846129, iOnExtraCallbackWithResult, -1927846128, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, intent}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public final void onNavigationEvent(@Nullable CharSequence charSequence) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, iOnExtraCallbackWithResult, 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, charSequence}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }
}
