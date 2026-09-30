package o;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.AlertDialogKtExternalSyntheticLambda3;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda1;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionManager_androidKtExternalSyntheticLambda0 {
    private IOException IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> IAuthTabCallbackStubProxy;
    private final SelectionManagerExternalSyntheticLambda12 IAuthTabCallback_Parcel;
    private final AlertDialogKtExternalSyntheticLambda2 ICustomTabsCallback;
    private Uri access000;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4[] access100;
    private Uri asInterface;
    private final HlsPlaylistTracker extraCallbackWithResult;
    private final TextFieldSelectionStateExternalSyntheticLambda0 getInterfaceDescriptor;
    private ColorsKtExternalSyntheticLambda0 onActivityResized;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda0 onNavigationEvent;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onPostMessage;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda11 onWarmupCompleted;
    private final long readTypedObject;
    private final Uri[] writeTypedObject;
    private long IAuthTabCallbackDefault = -9223372036854775807L;
    private final TextFieldSelectionManagerKtExternalSyntheticLambda6 onTransact = new TextFieldSelectionManagerKtExternalSyntheticLambda6(4);
    private byte[] extraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
    private long asBinder = -9223372036854775807L;

    public static final class onExtraCallback {
        public boolean onExtraCallback;
        public Uri onExtraCallbackWithResult;
        public BottomSheetScaffoldKtExternalSyntheticLambda8 onNavigationEvent;

        public onExtraCallback() {
            onExtraCallback();
        }

        public void onExtraCallback() {
            this.onNavigationEvent = null;
            this.onExtraCallback = false;
            this.onExtraCallbackWithResult = null;
        }
    }

    public TextFieldSelectionManager_androidKtExternalSyntheticLambda0(TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4, @Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7, AlertDialogKtExternalSyntheticLambda2 alertDialogKtExternalSyntheticLambda2, long j, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0) {
        this.onWarmupCompleted = textFieldSelectionManager_androidKtExternalSyntheticLambda11;
        this.extraCallbackWithResult = hlsPlaylistTracker;
        this.writeTypedObject = uriArr;
        this.access100 = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr;
        this.ICustomTabsCallback = alertDialogKtExternalSyntheticLambda2;
        this.readTypedObject = j;
        this.IAuthTabCallbackStubProxy = list;
        this.IAuthTabCallback_Parcel = selectionManagerExternalSyntheticLambda12;
        this.onNavigationEvent = composableSingletonsScaffoldKtExternalSyntheticLambda0;
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0IAuthTabCallback = textFieldSelectionManagerKtExternalSyntheticLambda4.IAuthTabCallback(1);
        this.getInterfaceDescriptor = textFieldSelectionStateExternalSyntheticLambda0IAuthTabCallback;
        if (textFieldSelectionStateExternalSyntheticLambda7 != null) {
            textFieldSelectionStateExternalSyntheticLambda0IAuthTabCallback.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
        }
        this.onExtraCallback = textFieldSelectionManagerKtExternalSyntheticLambda4.IAuthTabCallback(3);
        this.onPostMessage = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i2].mayLaunchUrl & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        this.onActivityResized = new onExtraCallbackWithResult(this.onPostMessage, Ints.toArray(arrayList));
    }

    public void onNavigationEvent() throws IOException {
        IOException iOException = this.IAuthTabCallback;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.asInterface;
        if (uri == null || !uri.equals(this.access000)) {
            return;
        }
        this.extraCallbackWithResult.onNavigationEvent(this.asInterface);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onWarmupCompleted() {
        return this.onPostMessage;
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public void onNavigationEvent(ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0) {
        onTransact();
        this.onActivityResized = colorsKtExternalSyntheticLambda0;
    }

    public ColorsKtExternalSyntheticLambda0 onExtraCallback() {
        return this.onActivityResized;
    }

    public void onExtraCallbackWithResult() {
        onTransact();
        this.IAuthTabCallback = null;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.IAuthTabCallbackStub = z;
    }

    public long onExtraCallbackWithResult(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        int iOnWarmupCompleted = this.onActivityResized.onWarmupCompleted();
        Uri[] uriArr = this.writeTypedObject;
        AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3OnExtraCallback = (iOnWarmupCompleted >= uriArr.length || iOnWarmupCompleted == -1) ? null : this.extraCallbackWithResult.onExtraCallback(uriArr[this.onActivityResized.asBinder()], true);
        if (alertDialogKtExternalSyntheticLambda3OnExtraCallback == null || alertDialogKtExternalSyntheticLambda3OnExtraCallback.getInterfaceDescriptor.isEmpty()) {
            return j;
        }
        long jOnNavigationEvent = alertDialogKtExternalSyntheticLambda3OnExtraCallback.writeTypedObject - this.extraCallbackWithResult.onNavigationEvent();
        long j2 = j - jOnNavigationEvent;
        int iOnExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3OnExtraCallback.getInterfaceDescriptor, Long.valueOf(j2), true, true);
        long j3 = alertDialogKtExternalSyntheticLambda3OnExtraCallback.getInterfaceDescriptor.get(iOnExtraCallbackWithResult).getInterfaceDescriptor;
        return selectionContainerKtExternalSyntheticLambda2.onExtraCallbackWithResult(j2, j3, (!alertDialogKtExternalSyntheticLambda3OnExtraCallback.onActivityLayout || iOnExtraCallbackWithResult == alertDialogKtExternalSyntheticLambda3OnExtraCallback.getInterfaceDescriptor.size() - 1) ? j3 : alertDialogKtExternalSyntheticLambda3OnExtraCallback.getInterfaceDescriptor.get(iOnExtraCallbackWithResult + 1).getInterfaceDescriptor) + jOnNavigationEvent;
    }

    public int IAuthTabCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list;
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent == -1) {
            return 1;
        }
        AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3 = (AlertDialogKtExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult.onExtraCallback(this.writeTypedObject[this.onPostMessage.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100)], false));
        int i2 = (int) (textFieldSelectionManager_androidKtExternalSyntheticLambda3.access000 - alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) {
            list = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(i2).onExtraCallbackWithResult;
        } else {
            list = alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult;
        }
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent >= list.size()) {
            return 2;
        }
        AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback = list.get(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent);
        if (iAuthTabCallback.IAuthTabCallback) {
            return 0;
        }
        return Objects.equals(Uri.parse(TextFieldDecoratorModifierNodeExternalSyntheticLambda8.onWarmupCompleted(alertDialogKtExternalSyntheticLambda3.onPostMessage, iAuthTabCallback.IAuthTabCallbackStubProxy)), textFieldSelectionManager_androidKtExternalSyntheticLambda3.asBinder.asInterface) ? 1 : 2;
    }

    public long onExtraCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent != -1);
        AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3 = (AlertDialogKtExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult.onExtraCallback(this.writeTypedObject[this.onPostMessage.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100)], false));
        int i2 = (int) (textFieldSelectionManager_androidKtExternalSyntheticLambda3.access000 - alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub);
        if (i2 < 0) {
            return 0L;
        }
        if (i2 < alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) {
            list = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(i2).onExtraCallbackWithResult;
        } else {
            list = alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult;
        }
        return list.get(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent).onTransact;
    }

    public void onExtraCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1, long j, long j2, List<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> list, boolean z, onExtraCallback onextracallback) {
        int i2;
        boolean z2;
        AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3;
        long j3;
        Uri uri;
        int i3;
        onExtraCallback onextracallback2;
        IAuthTabCallback iAuthTabCallback;
        long j4;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = list.isEmpty() ? null : (TextFieldSelectionManager_androidKtExternalSyntheticLambda3) Iterables.getLast(list);
        int iOnExtraCallbackWithResult = textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null ? -1 : this.onPostMessage.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100);
        long j5 = platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted;
        long jMax = j - j5;
        long jIAuthTabCallback = IAuthTabCallback(j5);
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null && !this.onExtraCallbackWithResult) {
            long jAsBinder = textFieldSelectionManager_androidKtExternalSyntheticLambda3.asBinder();
            jMax = Math.max(0L, jMax - jAsBinder);
            if (jIAuthTabCallback != -9223372036854775807L) {
                jIAuthTabCallback = Math.max(0L, jIAuthTabCallback - jAsBinder);
            }
        }
        long j6 = jIAuthTabCallback;
        long j7 = jMax;
        this.onActivityResized.onNavigationEvent(j5, j7, j6, list, onNavigationEvent(textFieldSelectionManager_androidKtExternalSyntheticLambda3, j));
        int iAsBinder = this.onActivityResized.asBinder();
        boolean z3 = iOnExtraCallbackWithResult != iAsBinder;
        Uri uri2 = this.writeTypedObject[iAsBinder];
        if (!this.extraCallbackWithResult.onExtraCallbackWithResult(uri2)) {
            onextracallback.onExtraCallbackWithResult = uri2;
            this.access000 = uri2;
            return;
        }
        AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3OnExtraCallback = this.extraCallbackWithResult.onExtraCallback(uri2, true);
        this.onExtraCallbackWithResult = alertDialogKtExternalSyntheticLambda3OnExtraCallback.onActivityLayout;
        onNavigationEvent(alertDialogKtExternalSyntheticLambda3OnExtraCallback);
        long jOnNavigationEvent = alertDialogKtExternalSyntheticLambda3OnExtraCallback.writeTypedObject - this.extraCallbackWithResult.onNavigationEvent();
        int i4 = iOnExtraCallbackWithResult;
        Pair<Long, Integer> pairOnExtraCallback = onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3, z3, alertDialogKtExternalSyntheticLambda3OnExtraCallback, jOnNavigationEvent, j);
        long jLongValue = ((Long) pairOnExtraCallback.first).longValue();
        int iIntValue = ((Integer) pairOnExtraCallback.second).intValue();
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda32 = textFieldSelectionManager_androidKtExternalSyntheticLambda3;
        if (IAuthTabCallback(z3, alertDialogKtExternalSyntheticLambda3OnExtraCallback, jLongValue, iIntValue, textFieldSelectionManager_androidKtExternalSyntheticLambda32, jOnNavigationEvent, j2)) {
            Uri uri3 = this.writeTypedObject[i4];
            AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3OnExtraCallback2 = this.extraCallbackWithResult.onExtraCallback(uri3, true);
            long jOnNavigationEvent2 = alertDialogKtExternalSyntheticLambda3OnExtraCallback2.writeTypedObject - this.extraCallbackWithResult.onNavigationEvent();
            i2 = -1;
            z2 = true;
            Pair<Long, Integer> pairOnExtraCallback2 = onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda32, false, alertDialogKtExternalSyntheticLambda3OnExtraCallback2, jOnNavigationEvent2, j);
            jLongValue = ((Long) pairOnExtraCallback2.first).longValue();
            iIntValue = ((Integer) pairOnExtraCallback2.second).intValue();
            uri = uri3;
            alertDialogKtExternalSyntheticLambda3 = alertDialogKtExternalSyntheticLambda3OnExtraCallback2;
            j3 = jOnNavigationEvent2;
            i3 = i4;
        } else {
            i2 = -1;
            z2 = true;
            alertDialogKtExternalSyntheticLambda3 = alertDialogKtExternalSyntheticLambda3OnExtraCallback;
            j3 = jOnNavigationEvent;
            uri = uri2;
            i3 = iAsBinder;
        }
        if (i3 != i4 && i4 != i2) {
            this.extraCallbackWithResult.onWarmupCompleted(this.writeTypedObject[i4]);
        }
        if (jLongValue < alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub) {
            this.IAuthTabCallback = new BehindLiveWindowException();
            return;
        }
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(alertDialogKtExternalSyntheticLambda3, jLongValue, iIntValue);
        if (iAuthTabCallbackOnNavigationEvent != null) {
            onextracallback2 = onextracallback;
            iAuthTabCallback = iAuthTabCallbackOnNavigationEvent;
        } else if (!alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult) {
            onextracallback.onExtraCallbackWithResult = uri;
            this.access000 = uri;
            return;
        } else if (z || alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.isEmpty()) {
            onextracallback.onExtraCallback = z2;
            return;
        } else {
            onextracallback2 = onextracallback;
            iAuthTabCallback = new IAuthTabCallback((AlertDialogKtExternalSyntheticLambda3.onTransact) Iterables.getLast(alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor), (alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub + alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) - 1, i2);
        }
        ComposableSingletonsScaffoldKtExternalSyntheticLambda1.IAuthTabCallback IAuthTabCallback2 = null;
        this.access000 = null;
        if (this.onNavigationEvent != null) {
            IAuthTabCallback2 = new ComposableSingletonsScaffoldKtExternalSyntheticLambda1.IAuthTabCallback(this.onNavigationEvent, "h").IAuthTabCallback(this.onActivityResized).onWarmupCompleted(Math.max(0L, j7)).onWarmupCompleted(platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onNavigationEvent).onExtraCallback(!alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult).onNavigationEvent(platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackDefault)).onWarmupCompleted(list.isEmpty()).IAuthTabCallback(iAuthTabCallback.IAuthTabCallback.onTransact);
            int i5 = iAuthTabCallback.onExtraCallback;
            if (i5 == i2) {
                j4 = iAuthTabCallback.onExtraCallbackWithResult + 1;
            } else {
                j4 = iAuthTabCallback.onExtraCallbackWithResult;
            }
            if (i5 != i2) {
                i2 = i5 + 1;
            }
            IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = onNavigationEvent(alertDialogKtExternalSyntheticLambda3, j4, i2);
            if (iAuthTabCallbackOnNavigationEvent2 != null) {
                IAuthTabCallback2.IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda8.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda8.IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.onPostMessage, iAuthTabCallback.IAuthTabCallback.IAuthTabCallbackStubProxy), TextFieldDecoratorModifierNodeExternalSyntheticLambda8.IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.onPostMessage, iAuthTabCallbackOnNavigationEvent2.IAuthTabCallback.IAuthTabCallbackStubProxy)));
                String string = iAuthTabCallbackOnNavigationEvent2.IAuthTabCallback.onNavigationEvent + "-";
                if (iAuthTabCallbackOnNavigationEvent2.IAuthTabCallback.onWarmupCompleted != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    AlertDialogKtExternalSyntheticLambda3.onTransact ontransact = iAuthTabCallbackOnNavigationEvent2.IAuthTabCallback;
                    sb.append(ontransact.onNavigationEvent + ontransact.onWarmupCompleted);
                    string = sb.toString();
                }
                IAuthTabCallback2.onExtraCallbackWithResult(string);
            }
        }
        ComposableSingletonsScaffoldKtExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback2;
        this.IAuthTabCallbackDefault = SystemClock.elapsedRealtime();
        Uri uriOnNavigationEvent = onNavigationEvent(alertDialogKtExternalSyntheticLambda3, iAuthTabCallback.IAuthTabCallback.access000);
        BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback = IAuthTabCallback(uriOnNavigationEvent, i3, true, iAuthTabCallback2);
        onextracallback2.onNavigationEvent = bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback;
        if (bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback != null) {
            return;
        }
        Uri uriOnNavigationEvent2 = onNavigationEvent(alertDialogKtExternalSyntheticLambda3, iAuthTabCallback.IAuthTabCallback);
        BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback2 = IAuthTabCallback(uriOnNavigationEvent2, i3, false, iAuthTabCallback2);
        onextracallback2.onNavigationEvent = bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback2;
        if (bottomSheetScaffoldKtExternalSyntheticLambda8IAuthTabCallback2 == null) {
            boolean zOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, alertDialogKtExternalSyntheticLambda3);
            Uri uri4 = uri;
            boolean zOnExtraCallbackWithResult = TextFieldSelectionManager_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda32, j, uri, zOnWarmupCompleted, iAuthTabCallback, j3);
            if (zOnExtraCallbackWithResult && iAuthTabCallback.onWarmupCompleted) {
                return;
            }
            onextracallback2.onNavigationEvent = TextFieldSelectionManager_androidKtExternalSyntheticLambda3.onWarmupCompleted(this.onWarmupCompleted, this.getInterfaceDescriptor, this.access100[i3], j3, alertDialogKtExternalSyntheticLambda3, iAuthTabCallback, uri4, this.IAuthTabCallbackStubProxy, this.onActivityResized.onExtraCallbackWithResult(), this.onActivityResized.onNavigationEvent(), this.IAuthTabCallbackStub, this.ICustomTabsCallback, this.readTypedObject, textFieldSelectionManager_androidKtExternalSyntheticLambda32, this.onTransact.onWarmupCompleted(uriOnNavigationEvent2), this.onTransact.onWarmupCompleted(uriOnNavigationEvent), zOnExtraCallbackWithResult, zOnWarmupCompleted, this.IAuthTabCallback_Parcel, iAuthTabCallback2);
        }
    }

    private static boolean onWarmupCompleted(IAuthTabCallback iAuthTabCallback, AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        AlertDialogKtExternalSyntheticLambda3.onTransact ontransact = iAuthTabCallback.IAuthTabCallback;
        if (ontransact instanceof AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback) {
            if (((AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback) ontransact).onExtraCallbackWithResult) {
                return true;
            }
            return iAuthTabCallback.onExtraCallback == 0 && alertDialogKtExternalSyntheticLambda3.onActivityLayout;
        }
        return alertDialogKtExternalSyntheticLambda3.onActivityLayout;
    }

    private static IAuthTabCallback onNavigationEvent(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, int i2) {
        int i3 = (int) (j - alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub);
        if (i3 == alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) {
            if (i2 == -1) {
                i2 = 0;
            }
            if (i2 < alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.size()) {
                return new IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.get(i2), j, i2);
            }
            return null;
        }
        AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(i3);
        if (i2 == -1) {
            return new IAuthTabCallback(onextracallbackwithresult, j, -1);
        }
        if (i2 < onextracallbackwithresult.onExtraCallbackWithResult.size()) {
            return new IAuthTabCallback(onextracallbackwithresult.onExtraCallbackWithResult.get(i2), j, i2);
        }
        int i4 = i3 + 1;
        if (i4 < alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) {
            return new IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(i4), j + 1, -1);
        }
        if (alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.isEmpty()) {
            return null;
        }
        return new IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.get(0), j + 1, 0);
    }

    public void onWarmupCompleted(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8) {
        if (bottomSheetScaffoldKtExternalSyntheticLambda8 instanceof onWarmupCompleted) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) bottomSheetScaffoldKtExternalSyntheticLambda8;
            this.extraCallback = onwarmupcompleted.onExtraCallbackWithResult();
            this.onTransact.onWarmupCompleted(onwarmupcompleted.asBinder.asInterface, (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onwarmupcompleted.onExtraCallback()));
        }
    }

    public boolean onExtraCallbackWithResult(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, long j) {
        ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = this.onActivityResized;
        return colorsKtExternalSyntheticLambda0.onExtraCallback(colorsKtExternalSyntheticLambda0.onExtraCallbackWithResult(this.onPostMessage.onExtraCallbackWithResult(bottomSheetScaffoldKtExternalSyntheticLambda8.access100)), j);
    }

    public boolean IAuthTabCallback(Uri uri, long j) {
        int iOnExtraCallbackWithResult;
        int i2 = 0;
        while (true) {
            Uri[] uriArr = this.writeTypedObject;
            if (i2 >= uriArr.length) {
                i2 = -1;
                break;
            }
            if (uriArr[i2].equals(uri)) {
                break;
            }
            i2++;
        }
        if (i2 == -1 || (iOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult(i2)) == -1) {
            return true;
        }
        this.asInterface = uri;
        return j != -9223372036854775807L && this.onActivityResized.onExtraCallback(iOnExtraCallbackWithResult, j) && this.extraCallbackWithResult.onNavigationEvent(uri, j);
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda6[] onNavigationEvent(@Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3, long j) {
        int i2;
        int iOnExtraCallbackWithResult = textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null ? -1 : this.onPostMessage.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100);
        int iAccess100 = this.onActivityResized.access100();
        BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr = new BottomSheetScaffoldKtExternalSyntheticLambda6[iAccess100];
        boolean z = false;
        int i3 = 0;
        while (i3 < iAccess100) {
            int iOnWarmupCompleted = this.onActivityResized.onWarmupCompleted(i3);
            Uri uri = this.writeTypedObject[iOnWarmupCompleted];
            if (!this.extraCallbackWithResult.onExtraCallbackWithResult(uri)) {
                bottomSheetScaffoldKtExternalSyntheticLambda6Arr[i3] = BottomSheetScaffoldKtExternalSyntheticLambda6.onNavigationEvent;
                i2 = i3;
            } else {
                AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3OnExtraCallback = this.extraCallbackWithResult.onExtraCallback(uri, z);
                long jOnNavigationEvent = alertDialogKtExternalSyntheticLambda3OnExtraCallback.writeTypedObject - this.extraCallbackWithResult.onNavigationEvent();
                i2 = i3;
                Pair<Long, Integer> pairOnExtraCallback = onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3, iOnWarmupCompleted != iOnExtraCallbackWithResult ? true : z, alertDialogKtExternalSyntheticLambda3OnExtraCallback, jOnNavigationEvent, j);
                bottomSheetScaffoldKtExternalSyntheticLambda6Arr[i2] = new onNavigationEvent(alertDialogKtExternalSyntheticLambda3OnExtraCallback.onPostMessage, jOnNavigationEvent, IAuthTabCallback(alertDialogKtExternalSyntheticLambda3OnExtraCallback, ((Long) pairOnExtraCallback.first).longValue(), ((Integer) pairOnExtraCallback.second).intValue()));
            }
            i3 = i2 + 1;
            z = false;
        }
        return bottomSheetScaffoldKtExternalSyntheticLambda6Arr;
    }

    public int onWarmupCompleted(long j, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        if (this.IAuthTabCallback != null || this.onActivityResized.access100() < 2) {
            return list.size();
        }
        return this.onActivityResized.onExtraCallbackWithResult(j, list);
    }

    public boolean onNavigationEvent(long j, BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        if (this.IAuthTabCallback != null) {
            return false;
        }
        return this.onActivityResized.IAuthTabCallback(j, bottomSheetScaffoldKtExternalSyntheticLambda8, list);
    }

    static List<AlertDialogKtExternalSyntheticLambda3.onTransact> IAuthTabCallback(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, int i2) {
        int i3 = (int) (j - alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub);
        if (i3 < 0 || alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size() < i3) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i3 < alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()) {
            if (i2 != -1) {
                AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(i3);
                if (i2 == 0) {
                    arrayList.add(onextracallbackwithresult);
                } else if (i2 < onextracallbackwithresult.onExtraCallbackWithResult.size()) {
                    List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list = onextracallbackwithresult.onExtraCallbackWithResult;
                    arrayList.addAll(list.subList(i2, list.size()));
                }
                i3++;
            }
            List<AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult> list2 = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor;
            arrayList.addAll(list2.subList(i3, list2.size()));
            i2 = 0;
        }
        if (alertDialogKtExternalSyntheticLambda3.asBinder != -9223372036854775807L) {
            int i4 = i2 != -1 ? i2 : 0;
            if (i4 < alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.size()) {
                List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list3 = alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult;
                arrayList.addAll(list3.subList(i4, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean onExtraCallbackWithResult(Uri uri) {
        Object[] objArr = {this.writeTypedObject, uri};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1347411989, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 1347412007)).booleanValue();
    }

    private Pair<Long, Integer> onExtraCallback(@Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3, boolean z, AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, long j2) {
        List<AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback> list;
        long jAccess000;
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null || z) {
            long j3 = alertDialogKtExternalSyntheticLambda3.IAuthTabCallback;
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null && !this.onExtraCallbackWithResult) {
                j2 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallbackStub;
            }
            if (!alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult && j2 >= j3 + j) {
                return new Pair<>(Long.valueOf(alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub + alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size()), -1);
            }
            long j4 = j2 - j;
            int i2 = 0;
            int iOnExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor, Long.valueOf(j4), true, !this.extraCallbackWithResult.onExtraCallback() || textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null);
            long j5 = iOnExtraCallbackWithResult + alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub;
            if (iOnExtraCallbackWithResult >= 0) {
                AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.get(iOnExtraCallbackWithResult);
                if (j4 < onextracallbackwithresult.getInterfaceDescriptor + onextracallbackwithresult.onTransact) {
                    list = onextracallbackwithresult.onExtraCallbackWithResult;
                } else {
                    list = alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback = list.get(i2);
                    if (j4 >= iAuthTabCallback.getInterfaceDescriptor + iAuthTabCallback.onTransact) {
                        i2++;
                    } else if (iAuthTabCallback.onExtraCallbackWithResult) {
                        j5 += list == alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult ? 1L : 0L;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j5), Integer.valueOf(i));
        }
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onWarmupCompleted()) {
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent == -1) {
                jAccess000 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.access000();
            } else {
                jAccess000 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.access000;
            }
            int i3 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent;
            return new Pair<>(Long.valueOf(jAccess000), Integer.valueOf(i3 != -1 ? i3 + 1 : -1));
        }
        return new Pair<>(Long.valueOf(textFieldSelectionManager_androidKtExternalSyntheticLambda3.access000), Integer.valueOf(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent));
    }

    private static boolean IAuthTabCallback(boolean z, AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, long j, int i2, @Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3, long j2, long j3) {
        if (!z || textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null) {
            return false;
        }
        if (j < alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub) {
            return true;
        }
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(alertDialogKtExternalSyntheticLambda3, j, i2);
        return iAuthTabCallbackOnNavigationEvent != null && j2 + iAuthTabCallbackOnNavigationEvent.IAuthTabCallback.getInterfaceDescriptor < j3;
    }

    private long IAuthTabCallback(long j) {
        long j2 = this.asBinder;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    private void onNavigationEvent(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        this.asBinder = alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult ? -9223372036854775807L : alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult() - this.extraCallbackWithResult.onNavigationEvent();
    }

    private BottomSheetScaffoldKtExternalSyntheticLambda8 IAuthTabCallback(@Nullable Uri uri, int i2, boolean z, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback) {
        if (uri == null) {
            return null;
        }
        byte[] bArrOnNavigationEvent = this.onTransact.onNavigationEvent(uri);
        if (bArrOnNavigationEvent != null) {
            this.onTransact.onWarmupCompleted(uri, bArrOnNavigationEvent);
            return null;
        }
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().IAuthTabCallback(uri).onExtraCallbackWithResult(1).onExtraCallbackWithResult();
        if (iAuthTabCallback != null) {
            if (z) {
                iAuthTabCallback.onExtraCallback("i");
            }
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = iAuthTabCallback.onWarmupCompleted().IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult);
        }
        return new onWarmupCompleted(this.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult, this.access100[i2], this.onActivityResized.onExtraCallbackWithResult(), this.onActivityResized.onNavigationEvent(), this.extraCallback);
    }

    private static Uri onNavigationEvent(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, @Nullable AlertDialogKtExternalSyntheticLambda3.onTransact ontransact) {
        String str;
        if (ontransact == null || (str = ontransact.IAuthTabCallbackDefault) == null) {
            return null;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda8.IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.onPostMessage, str);
    }

    private void onTransact() {
        this.extraCallbackWithResult.onWarmupCompleted(this.writeTypedObject[this.onActivityResized.asBinder()]);
    }

    static final class IAuthTabCallback {
        public final AlertDialogKtExternalSyntheticLambda3.onTransact IAuthTabCallback;
        public final int onExtraCallback;
        public final long onExtraCallbackWithResult;
        public final boolean onWarmupCompleted;

        public IAuthTabCallback(AlertDialogKtExternalSyntheticLambda3.onTransact ontransact, long j, int i2) {
            this.IAuthTabCallback = ontransact;
            this.onExtraCallbackWithResult = j;
            this.onExtraCallback = i2;
            this.onWarmupCompleted = (ontransact instanceof AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback) && ((AlertDialogKtExternalSyntheticLambda3.IAuthTabCallback) ontransact).IAuthTabCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ChipKtExternalSyntheticLambda3 {
        private int onNavigationEvent;

        @Override // o.ColorsKtExternalSyntheticLambda0
        public int onExtraCallbackWithResult() {
            return 0;
        }

        @Override // o.ColorsKtExternalSyntheticLambda0
        public Object onNavigationEvent() {
            return null;
        }

        public onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr) {
            super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iArr);
            this.onNavigationEvent = onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(iArr[0]));
        }

        @Override // o.ColorsKtExternalSyntheticLambda0
        public void onNavigationEvent(long j, long j2, long j3, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list, BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (onWarmupCompleted(this.onNavigationEvent, jElapsedRealtime)) {
                for (int i2 = this.onExtraCallback - 1; i2 >= 0; i2--) {
                    if (!onWarmupCompleted(i2, jElapsedRealtime)) {
                        this.onNavigationEvent = i2;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // o.ColorsKtExternalSyntheticLambda0
        public int onWarmupCompleted() {
            return this.onNavigationEvent;
        }
    }

    static final class onWarmupCompleted extends BottomSheetScaffoldKtExternalSyntheticLambda4 {
        private byte[] IAuthTabCallback;

        public onWarmupCompleted(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, @Nullable Object obj, byte[] bArr) {
            super(textFieldSelectionStateExternalSyntheticLambda0, textFieldSelectionStateExternalSyntheticLambda12, 3, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2, obj, bArr);
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda4
        public void onExtraCallbackWithResult(byte[] bArr, int i2) {
            this.IAuthTabCallback = Arrays.copyOf(bArr, i2);
        }

        public byte[] onExtraCallback() {
            return this.IAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends BottomSheetScaffoldKtExternalSyntheticLambda5 {
        private final String IAuthTabCallback;
        private final long onExtraCallbackWithResult;
        private final List<AlertDialogKtExternalSyntheticLambda3.onTransact> onWarmupCompleted;

        public onNavigationEvent(String str, long j, List<AlertDialogKtExternalSyntheticLambda3.onTransact> list) {
            super(0L, list.size() - 1);
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = list;
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
        public long onExtraCallback() {
            onNavigationEvent();
            return this.onExtraCallbackWithResult + this.onWarmupCompleted.get((int) onWarmupCompleted()).getInterfaceDescriptor;
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
        public long onExtraCallbackWithResult() {
            onNavigationEvent();
            AlertDialogKtExternalSyntheticLambda3.onTransact ontransact = this.onWarmupCompleted.get((int) onWarmupCompleted());
            return this.onExtraCallbackWithResult + ontransact.getInterfaceDescriptor + ontransact.onTransact;
        }
    }
}
